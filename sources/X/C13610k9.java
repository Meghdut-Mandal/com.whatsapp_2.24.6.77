package X;

import java.util.NoSuchElementException;

/* renamed from: X.0k9  reason: invalid class name and case insensitive filesystem */
public final class C13610k9 extends C12270hm {
    public long A00;
    public boolean A01;
    public final long A02;

    public long A00() {
        long j = this.A00;
        if (j != this.A02) {
            this.A00 = 1 + j;
            return j;
        } else if (this.A01) {
            this.A01 = false;
            return j;
        } else {
            throw new NoSuchElementException();
        }
    }

    public C13610k9(long j, long j2) {
        this.A02 = j2;
        boolean z = j > j2 ? false : true;
        this.A01 = z;
        this.A00 = !z ? j2 : j;
    }

    public boolean hasNext() {
        return this.A01;
    }
}
