package lec32;

import lec31.queue;

public class dynamicqueue extends queue{
    public void Enqueue(int item)
    {
        if (isfull() == true) {
			int[] arr = new int[2 * data.length];
			for (int i = 0; i < data.length; i++) {
				int idx = (front + i) % data.length;
				arr[i] = data[idx];
			}
			this.front = 0;
			data = arr;

		}
		super.Enqueue(item);
    }
}
