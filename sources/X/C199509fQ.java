package X;

import com.whatsapp.R;

/* renamed from: X.9fQ  reason: invalid class name and case insensitive filesystem */
public final class C199509fQ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C199509fQ)) {
            return false;
        }
        C199509fQ r4 = (C199509fQ) obj;
        return this.A02 == r4.A02 && this.A01 == r4.A01;
    }

    public int hashCode() {
        return ((this.A02 + 31) * 31) + this.A01;
    }

    public C199509fQ(int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = i4;
    }

    public C199509fQ(int i) {
        this(-1, i, R.dimen.f7nameremoved, R.dimen.f7nameremoved);
    }
}
