package X;

import java.util.Iterator;
import java.util.Objects;

public final class AY3 implements Iterator {
    public boolean canRemove;
    public AnonymousClass9Y5 currentEntry;
    public final Iterator entryIterator;
    public int laterCount;
    public final B6T multiset;
    public int totalCount;

    public boolean hasNext() {
        if (this.laterCount > 0 || this.entryIterator.hasNext()) {
            return true;
        }
        return false;
    }

    public void remove() {
        C20080wz.checkRemove(this.canRemove);
        if (this.totalCount == 1) {
            this.entryIterator.remove();
        } else {
            B6T b6t = this.multiset;
            AnonymousClass9Y5 r0 = this.currentEntry;
            Objects.requireNonNull(r0);
            b6t.remove(r0.getElement());
        }
        this.totalCount--;
        this.canRemove = false;
    }

    public AY3(B6T b6t, Iterator it) {
        this.multiset = b6t;
        this.entryIterator = it;
    }

    public Object next() {
        if (hasNext()) {
            int i = this.laterCount;
            if (i == 0) {
                AnonymousClass9Y5 r0 = (AnonymousClass9Y5) this.entryIterator.next();
                this.currentEntry = r0;
                i = r0.getCount();
                this.laterCount = i;
                this.totalCount = i;
            }
            this.laterCount = i - 1;
            this.canRemove = true;
            AnonymousClass9Y5 r02 = this.currentEntry;
            Objects.requireNonNull(r02);
            return r02.getElement();
        }
        throw C165617ti.A0e();
    }
}
