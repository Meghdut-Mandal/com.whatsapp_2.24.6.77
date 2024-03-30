package X;

/* renamed from: X.3Ox  reason: invalid class name and case insensitive filesystem */
public final class C64653Ox {
    public static final C64653Ox A05 = new C64653Ox(false, false, false, false, false);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C64653Ox(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A04 = z;
        this.A00 = z2;
        this.A01 = z3;
        this.A02 = z4;
        this.A03 = z5;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WriteResult{wasSuccess=");
        A0u.append(this.A04);
        A0u.append(", chatAdded=");
        A0u.append(this.A00);
        A0u.append(", chatUnarchived=");
        A0u.append(this.A01);
        A0u.append(", isDuplicate=");
        A0u.append(this.A02);
        A0u.append(", isExpired=");
        A0u.append(this.A03);
        return AnonymousClass000.A0s(A0u);
    }
}
