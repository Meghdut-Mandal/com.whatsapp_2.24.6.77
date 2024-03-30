package X;

/* renamed from: X.3Kh  reason: invalid class name and case insensitive filesystem */
public final class C63503Kh {
    public Object A00;
    public boolean A01;
    public final int A02;
    public final AnonymousClass3T1 A03;

    public final void A00() {
        synchronized (this) {
            this.A01 = true;
        }
    }

    public final void A01(Object obj) {
        synchronized (this) {
            this.A00 = obj;
            A00();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C63503Kh)) {
            return false;
        }
        C63503Kh r4 = (C63503Kh) obj;
        if (this.A02 != r4.A02 || !C1901797e.A00(this.A00, r4.A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A03) + this.A02) * 31) + AnonymousClass000.A0J(this.A00);
    }

    public C63503Kh(AnonymousClass3T1 r1, int i) {
        this.A03 = r1;
        this.A02 = i;
    }
}
