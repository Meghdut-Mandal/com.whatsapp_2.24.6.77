package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class AY6 implements Iterator {
    public int expectedModCount;
    public int index;
    public int indexToRemove = -1;
    public int remaining;
    public final /* synthetic */ C21894AcN this$0;

    public AY6(C21894AcN acN) {
        this.this$0 = acN;
        C21891AcK acK = acN.biMap;
        this.index = acK.firstInInsertionOrder;
        this.expectedModCount = acK.modCount;
        this.remaining = acK.size;
    }

    private void checkForComodification() {
        if (this.this$0.biMap.modCount != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        checkForComodification();
        if (this.index == -2 || this.remaining <= 0) {
            return false;
        }
        return true;
    }

    public Object next() {
        if (hasNext()) {
            C21894AcN acN = this.this$0;
            int i = this.index;
            Object forEntry = acN.forEntry(i);
            this.indexToRemove = i;
            this.index = acN.biMap.nextInInsertionOrder[i];
            this.remaining--;
            return forEntry;
        }
        throw C165617ti.A0e();
    }

    public void remove() {
        checkForComodification();
        C20080wz.checkRemove(C36381kD.A1U(this.indexToRemove, -1));
        this.this$0.biMap.removeEntry(this.indexToRemove);
        int i = this.index;
        C21891AcK acK = this.this$0.biMap;
        if (i == acK.size) {
            this.index = this.indexToRemove;
        }
        this.indexToRemove = -1;
        this.expectedModCount = acK.modCount;
    }
}
