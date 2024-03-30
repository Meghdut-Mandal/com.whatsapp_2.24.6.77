package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public abstract class AY9 implements Iterator {
    public int entryIndex;
    public int expectedModCount;
    public final /* synthetic */ AnonymousClass8HU this$0;
    public int toRemove = -1;

    public abstract Object result(int i);

    public AY9(AnonymousClass8HU r3) {
        this.this$0 = r3;
        C203649oT r1 = r3.backingMap;
        this.entryIndex = r1.firstIndex();
        this.expectedModCount = r1.modCount;
    }

    private void checkForConcurrentModification() {
        if (this.this$0.backingMap.modCount != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        checkForConcurrentModification();
        return C36401kF.A1U(this.entryIndex);
    }

    public Object next() {
        if (hasNext()) {
            Object result = result(this.entryIndex);
            int i = this.entryIndex;
            this.toRemove = i;
            this.entryIndex = this.this$0.backingMap.nextIndex(i);
            return result;
        }
        throw C165617ti.A0e();
    }

    public void remove() {
        checkForConcurrentModification();
        C20080wz.checkRemove(C36381kD.A1U(this.toRemove, -1));
        AnonymousClass8HU r4 = this.this$0;
        r4.size -= (long) r4.backingMap.removeEntry(this.toRemove);
        C203649oT r2 = this.this$0.backingMap;
        this.entryIndex = r2.nextIndexAfterRemove(this.entryIndex, this.toRemove);
        this.toRemove = -1;
        this.expectedModCount = r2.modCount;
    }
}
