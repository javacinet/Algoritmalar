package net.javaci.list;

public abstract class AbstractQueueTest extends AbstractCollectionTest {

    protected MyQueue<Integer> queue;

    @Override
    public MyCollection getCollection() {
        return queue;
    }
}
