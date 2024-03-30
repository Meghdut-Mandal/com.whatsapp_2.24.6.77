package X;

import java.util.Deque;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class A8N implements C22816AwR {
    public final Deque A00 = C90524aI.A0l();
    public final Map A01 = C90524aI.A0s();
    public final ReentrantLock A02 = new ReentrantLock();

    public static void A00(A8N a8n, String str) {
        ReentrantLock reentrantLock = a8n.A02;
        reentrantLock.lock();
        try {
            Deque deque = a8n.A00;
            deque.removeFirstOccurrence(str);
            deque.addFirst(str);
        } finally {
            reentrantLock.unlock();
        }
    }

    public String toString() {
        return this.A01.toString();
    }
}
