package X;

/* renamed from: X.6Bs  reason: invalid class name and case insensitive filesystem */
public final class C128306Bs {
    public long A00;
    public C161047m3 A01;
    public C161937ni A02;
    public AnonymousClass5RW A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128306Bs) {
                C128306Bs r9 = (C128306Bs) obj;
                if (AnonymousClass00C.A0J(this.A02, r9.A02) && this.A03 == r9.A03 && AnonymousClass00C.A0J(this.A01, r9.A01)) {
                    long j = this.A00;
                    long j2 = r9.A00;
                    long j3 = AnonymousClass6X0.A02;
                    if (j == j2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C128306Bs() {
        C161937ni r4 = C112375dn.A00;
        AnonymousClass5RW r3 = AnonymousClass5RW.Ltr;
        C137376g2 r2 = new C137376g2();
        long j = AnonymousClass6X0.A02;
        this.A02 = r4;
        this.A03 = r3;
        this.A01 = r2;
        this.A00 = j;
    }

    public static C161047m3 A00(Object obj) {
        return ((C137486gD) obj).A01.A02.A01;
    }

    public int hashCode() {
        int A05 = C36351kA.A05(this.A01, C36351kA.A05(this.A03, C36391kE.A0A(this.A02)));
        long j = this.A00;
        long j2 = AnonymousClass6X0.A02;
        return C36341k9.A02(j, A05);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DrawParams(density=");
        A0u.append(this.A02);
        A0u.append(", layoutDirection=");
        A0u.append(this.A03);
        A0u.append(", canvas=");
        A0u.append(this.A01);
        A0u.append(", size=");
        return AnonymousClass000.A0m(AnonymousClass6X0.A02(this.A00), A0u);
    }
}
