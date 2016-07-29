package wbs.nio.walkfiletree;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

/*
 * Wir ermitteln, wie viele Java-Source-Dateien sich in unserem Workspace befinden, 
 * und wie viel Speicherplatz sie belegen.
 */
public class WorkspaceStatistikDemo {

	public static void main(String[] args) {
		Path searchDir = Paths.get("C://Users//Master//git//UnterichtsmaterialOCP//ocp");
		String javaDateien = "glob:*.java";
		String ignoriereDies = "glob:bin"; // ist es irgenwie möglich .settings auszuschliessen?
		final PathMatcher matchFiles = FileSystems.getDefault().getPathMatcher(javaDateien);
		final PathMatcher matchDirs = FileSystems.getDefault().getPathMatcher(ignoriereDies);
		final AtomicInteger anzahlDerDateien = new AtomicInteger(0);
		final AtomicLong belegterSpeicher = new AtomicLong(0);
		try {
			Files.walkFileTree(searchDir, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
					if (matchDirs.matches(dir.getFileName())) {
						return FileVisitResult.SKIP_SUBTREE;
					}
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					if (matchFiles.matches(file.getFileName())) {
						anzahlDerDateien.addAndGet(1);
						belegterSpeicher.addAndGet(attrs.size());
					}
					return FileVisitResult.CONTINUE;
				}
			});
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		System.out.println("Es gibt " + anzahlDerDateien + " Dateien, die " + belegterSpeicher + " kb belegen!" );
	}

}
