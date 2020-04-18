package lesson_17;

public class Main {

	public static void main(String[] args) {

		Number[] num = { 19, 24, 56, 34, 33, 58, 13, 91, 81, 61, 88, 54, 39, 90, 11 };

		Collection collection = new Collection(num);

		System.out.println("One");
		Iterator iterF = collection.createForward();
		while (iterF.hasNext()) {
			int next = (int) iterF.next();
			if (next % 2 == 0) {
				System.out.println(next);
			} else {
				System.out.println(0);
			}
		}

		System.out.println();
		System.out.println("Two");

		Iterator iterB = collection.createBackward();
		while (iterB.hasNext()) {
			System.out.println(iterB.next());
		}

		System.out.println();
		System.out.println("Three");

		Iterator anonymous = collection.createAnonymous();
		while (anonymous.hasNext()) {
			int next = (int) anonymous.next();
			if (next % 2 == 1) {
				System.out.println(next);
			}
		}

		System.out.println();
		System.out.println("Four");

		Iterator local = collection.createAnonymous();
		while (local.hasNext()) {
			int next = (int) local.next();
			if (next % 2 == 0) {
				System.out.println(next - 100);
			}
		}

		System.out.println();
		System.out.println("Five");

		Iterator stat = Collection.createSt();
		while (stat.hasNext()) {
			int next = (int) stat.next();
			if (next % 2 == 0) {
				System.out.println(next + 1);
			}
		}
	}
}
