package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class AYA implements Iterator {
    public int currentIndex;
    public int expectedMetadata;
    public int indexToRemove = -1;
    public final /* synthetic */ C21898AcS this$0;

    public AYA(C21898AcS acS) {
        this.this$0 = acS;
        this.expectedMetadata = acS.metadata;
        this.currentIndex = acS.firstEntryIndex();
    }

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
            Object access$100 = this.this$0.element(i);
            this.currentIndex = this.this$0.getSuccessor(this.currentIndex);
            return access$100;
        }
        throw C165617ti.A0e();
    }

    public void remove() {
        checkForConcurrentModification();
        C20080wz.checkRemove(C36401kF.A1U(this.indexToRemove));
        incrementExpectedModCount();
        C21898AcS acS = this.this$0;
        acS.remove(acS.element(this.indexToRemove));
        this.currentIndex = this.this$0.adjustAfterRemove(this.currentIndex, this.indexToRemove);
        this.indexToRemove = -1;
    }
}
