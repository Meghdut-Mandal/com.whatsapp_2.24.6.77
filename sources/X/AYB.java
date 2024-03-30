package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public abstract class AYB implements Iterator {
    public int currentIndex;
    public int expectedMetadata;
    public int indexToRemove;
    public final /* synthetic */ C21892AcL this$0;

    public abstract Object getOutput(int i);

    private void checkForConcurrentModification() {
        if (this.this$0.metadata != this.expectedMetadata) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        return C36401kF.A1U(this.currentIndex);
    }

    public void incrementExpectedModCount() {
        this.expectedMetadata += 32;
    }

    public Object next() {
        checkForConcurrentModification();
        if (hasNext()) {
            int i = this.currentIndex;
            this.indexToRemove = i;
            Object output = getOutput(i);
            this.currentIndex = this.this$0.getSuccessor(this.currentIndex);
            return output;
        }
        throw C165617ti.A0e();
    }

    public void remove() {
        checkForConcurrentModification();
        C20080wz.checkRemove(C36401kF.A1U(this.indexToRemove));
        incrementExpectedModCount();
        C21892AcL acL = this.this$0;
        acL.remove(acL.key(this.indexToRemove));
        this.currentIndex = this.this$0.adjustAfterRemove(this.currentIndex, this.indexToRemove);
        this.indexToRemove = -1;
    }

    public /* synthetic */ AYB(C21892AcL acL, B72 b72) {
        this(acL);
    }

    public AYB(C21892AcL acL) {
        this.this$0 = acL;
        this.expectedMetadata = acL.metadata;
        this.currentIndex = acL.firstEntryIndex();
        this.indexToRemove = -1;
    }
}
