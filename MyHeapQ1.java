class MinHeap {
	int[] harr;
	int capacity;
	int heap_size;

	int parent(int i) { return (i - 1) / 2; }
	int left(int i) { return (2 * i + 1); }
	int right(int i) { return (2 * i + 2); }

	void printSmallerThan(int x, int pos)
	{
		if (pos >= heap_size)
			return;

		if (harr[pos] >= x) {
			return;
		}

		System.out.print(harr[pos] + " ");

		printSmallerThan(x, left(pos));
		printSmallerThan(x, right(pos));
	}

	public MinHeap(int cap)
	{
		heap_size = 0;
		capacity = cap;
		harr = new int[cap];
	}

	void insertKey(int k)
	{
		if (heap_size == capacity) {
			System.out.println("Overflow: Could not insertKey");
			return;
		}

		heap_size++;
		int i = heap_size - 1;
		harr[i] = k;

		while (i != 0 && harr[parent(i)] > harr[i]) {
			swap(i, parent(i));
			i = parent(i);
		}
	}

	void swap(int x, int y)
	{
		int temp = harr[x];
		harr[x] = harr[y];
		harr[y] = temp;
	}

	public static void main(String[] args)
	{
		MinHeap h = new MinHeap(15);
		h.insertKey(13);
		h.insertKey(2);
		h.insertKey(5);
		h.insertKey(50);
		h.insertKey(64);
		h.insertKey(35);
		h.insertKey(800);
		h.insertKey(6);
		h.insertKey(10);
		h.insertKey(75);
		h.insertKey(10);

		int x = 15;
		h.printSmallerThan(x, 0);
	}
};
