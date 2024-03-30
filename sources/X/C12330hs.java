package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0hs  reason: invalid class name and case insensitive filesystem */
public final class C12330hs implements Iterator, AnonymousClass00W {
    public long A00;
    public boolean A01;
    public final long A02;

    public /* bridge */ /* synthetic */ Object next() {
        long j = this.A00;
        if (j != this.A02) {
            this.A00 = 1 + j;
        } else if (this.A01) {
            this.A01 = false;
        } else {
            throw new NoSuchElementException();
        }
        return new C10910fQ(j);
    }

    public C12330hs(long j, long j2) {
        this.A02 = j2;
        boolean z = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) > 0 ? false : true;
        this.A01 = z;
        this.A00 = !z ? j2 : j;
    }

    public void remove() {
        throw AnonymousClass000.A0x();
    }

    public boolean hasNext() {
        return this.A01;
    }
}
