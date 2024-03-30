package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0hy  reason: invalid class name and case insensitive filesystem */
public final class C12390hy implements Iterator, AnonymousClass00W {
    public int A00 = -1;
    public Object A01;
    public final Iterator A02;
    public final /* synthetic */ C12780ie A03;

    public C12390hy(C12780ie r2) {
        this.A03 = r2;
        this.A02 = r2.A01.iterator();
    }

    private final void A00() {
        Iterator it = this.A02;
        if (it.hasNext()) {
            Object next = it.next();
            if (AnonymousClass000.A1X(this.A03.A00.invoke(next))) {
                this.A00 = 1;
                this.A01 = next;
                return;
            }
        }
        this.A00 = 0;
    }

    public boolean hasNext() {
        if (this.A00 == -1) {
            A00();
        }
        return AnonymousClass000.A1O(this.A00);
    }

    public Object next() {
        if (this.A00 == -1) {
            A00();
        }
        if (this.A00 != 0) {
            Object obj = this.A01;
            this.A01 = null;
            this.A00 = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw AnonymousClass000.A0x();
    }
}
