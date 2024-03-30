package X;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: X.150  reason: invalid class name */
public class AnonymousClass150 extends C225614x {
    public int index = 0;
    public final /* synthetic */ Iterator[] val$elements;

    public AnonymousClass150(Iterator[] itArr) {
        this.val$elements = itArr;
    }

    public boolean hasNext() {
        if (this.index < this.val$elements.length) {
            return true;
        }
        return false;
    }

    public Iterator next() {
        if (hasNext()) {
            Iterator it = this.val$elements[this.index];
            Objects.requireNonNull(it);
            Iterator[] itArr = this.val$elements;
            int i = this.index;
            itArr[i] = null;
            this.index = i + 1;
            return it;
        }
        throw new NoSuchElementException();
    }
}
