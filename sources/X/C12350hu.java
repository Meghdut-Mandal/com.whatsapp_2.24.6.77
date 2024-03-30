package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0hu  reason: invalid class name and case insensitive filesystem */
public final class C12350hu implements Iterator, AnonymousClass00W {
    public Iterator A00;
    public final Iterator A01;
    public final /* synthetic */ C12820ii A02;

    public C12350hu(C12820ii r2) {
        this.A02 = r2;
        this.A01 = r2.A02.iterator();
    }

    private final boolean A00() {
        Iterator it = this.A00;
        if (it != null && !it.hasNext()) {
            this.A00 = null;
        }
        while (true) {
            if (this.A00 != null) {
                break;
            }
            Iterator it2 = this.A01;
            if (it2.hasNext()) {
                Object next = it2.next();
                C12820ii r0 = this.A02;
                Iterator it3 = (Iterator) r0.A00.invoke(r0.A01.invoke(next));
                if (it3.hasNext()) {
                    this.A00 = it3;
                    break;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean hasNext() {
        return A00();
    }

    public Object next() {
        if (A00()) {
            Iterator it = this.A00;
            AnonymousClass00C.A0B(it);
            return it.next();
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw AnonymousClass000.A0x();
    }
}
