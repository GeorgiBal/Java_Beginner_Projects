class My_Queue{
    private static int front, rear, capacity;
    private static int queue[];

    My_Queue(int size) {
        front = rear = 0;
        capacity = size;
        queue = new int[capacity];
    }

    public void qAdd(int item) {
        if (capacity == rear) {
            System.out.print("Queue is full\n");
        } else {
            queue[rear] = item;
            rear++;
        }
    }

    public int qPeek() {
        return queue[front];
    }

    public int qPool()  {
        int x = queue[front];
        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }
        if (rear < capacity)
            queue[rear] = 0;
        rear--;
        return x;
    }

    public int qSize(){
        return rear;
    }

    public boolean qIsEmpty(){
        return front == rear;
    }

    public void qPrint() {
        int i;
        for (i = front; i < rear; i++) {
            System.out.printf("%d ", queue[i]);
        }
        System.out.println();
    }
}
