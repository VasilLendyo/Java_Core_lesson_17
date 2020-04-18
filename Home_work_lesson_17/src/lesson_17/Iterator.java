package lesson_17;

public interface Iterator {

	boolean hasNext();

	Object next();
}

class Collection {

	private static Number[] arr;

	Collection(Number[] arr) {
		this.arr = arr;
	}

	public class Forward implements Iterator {

		private int count = 0;

		@Override
		public boolean hasNext() {
			return count < arr.length;
		}

		@Override
		public Object next() {
			return arr[count++];
		}

	}

	public Forward createForward() {
		return new Forward();
	}

	public class Backward implements Iterator {

		private int count = arr.length - 1;

		@Override
		public boolean hasNext() {
			return count >= 0;
		}

		@Override
		public Object next() {
			int temp = count;
			count -= 2;
			return arr[temp];
		}
	}

	public Backward createBackward() {
		return new Backward();
	}

	public Iterator createAnonymous() {
		return new Iterator() {

			private int count = arr.length - 1;

			@Override
			public boolean hasNext() {
				return count >= 0;
			}

			@Override
			public Object next() {
				int temp = count;
				count -= 3;
				return arr[temp];
			}
		};
	}

	public Iterator createLocal() {
		class Local implements Iterator {

			private int count = 0;

			@Override
			public boolean hasNext() {
				return count < arr.length;
			}

			@Override
			public Object next() {
				int temp = count;
				count += 5;
				return arr[temp];
			}

		}
		return new Local();
	}

	private static class St implements Iterator {

		private static int count = 0;

		@Override
		public boolean hasNext() {
			return count < arr.length;
		}

		@Override
		public Object next() {
			int temp = count;
			count += 2;
			return arr[count++];
		}

	}

	public static St createSt() {
		return new St();
	}
}
