package wbs.threads;

public class OnePermitSemaphore {
	private boolean isFree = true;

	public void acquire() throws InterruptedException {
		synchronized (this) {
			while (!this.isFree) {
				this.wait();
			}
			this.isFree = false;
		}
	}

	public void release() throws InterruptedException {
		synchronized (this) {
			this.isFree = true;
			this.notifyAll();
		}
	}
}