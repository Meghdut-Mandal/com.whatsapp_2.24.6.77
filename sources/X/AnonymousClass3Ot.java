package X;

/* renamed from: X.3Ot  reason: invalid class name */
public final class AnonymousClass3Ot {
    public final Integer A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public AnonymousClass3Ot(boolean z, boolean z2, boolean z3) {
        this((Integer) null, z, z2, z3);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[interactive=");
        A0u.append(this.A03);
        A0u.append(", has_status=");
        A0u.append(this.A02);
        A0u.append(", has_nonstatus=");
        A0u.append(this.A01);
        A0u.append(", media_quality=");
        A0u.append(this.A00);
        return AnonymousClass000.A0q("]", A0u);
    }

    public AnonymousClass3Ot(Integer num, boolean z, boolean z2, boolean z3) {
        this.A03 = z;
        this.A02 = z2;
        this.A01 = z3;
        this.A00 = num;
    }
}
