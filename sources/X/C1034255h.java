package X;

/* renamed from: X.55h  reason: invalid class name and case insensitive filesystem */
public final class C1034255h extends C1256760v {
    public final int A00;
    public final AnonymousClass6CK A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1034255h(AnonymousClass6CK r2, String str, int i) {
        super(r2);
        AnonymousClass00C.A0D(str, 1);
        this.A02 = str;
        this.A00 = i;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1034255h) {
                C1034255h r5 = (C1034255h) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, (C36421kH.A04(this.A02) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Section(id=");
        A0u.append(this.A02);
        A0u.append(", title=");
        A0u.append(this.A00);
        A0u.append(", section=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
