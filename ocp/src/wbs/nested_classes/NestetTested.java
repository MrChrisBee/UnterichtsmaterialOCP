package wbs.nested_classes;

public class NestetTested {
	static int nestetInt = 1;

	public class MemberClass {
		int memberInt = 2;

		void memberM() {
			System.out.println(nestetInt);
		}
	}

	public static void main(String[] args) {
		final int inMain = 3;
		class LocalClassInStatic {
			void localStaticM() {
				int normal = 4;
				System.out.println(nestetInt);
				System.out.println(inMain);
				System.out.println(normal);
			}
		}
	}
 
	public void murks() {
		class LocalClass {
			void localM() {
				System.out.println(nestetInt);
			}
		}
	}
}