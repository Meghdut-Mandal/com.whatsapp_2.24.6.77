package X;

/* renamed from: X.6P4  reason: invalid class name */
public final class AnonymousClass6P4 {
    public static final AnonymousClass7bL A02 = new C137206fl(AnonymousClass7XJ.A00, C156467a1.A00);
    public final long A00;
    public final AnonymousClass72L A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass6P4)) {
            return false;
        }
        AnonymousClass6P4 r7 = (AnonymousClass6P4) obj;
        return this.A00 == r7.A00 && AnonymousClass00C.A0J(this.A01, r7.A01);
    }

    public int hashCode() {
        return C36321k7.A00(this.A00, C36391kE.A0A(this.A01));
    }

    public AnonymousClass6P4(AnonymousClass72L r6, long j) {
        this.A01 = r6;
        int length = r6.A00.length();
        int A08 = C90494aF.A08(j);
        int A022 = C15040mb.A02(A08, 0, length);
        int A03 = C90474aD.A03(j);
        int A023 = C15040mb.A02(A03, 0, length);
        this.A00 = (A022 == A08 && A023 == A03) ? j : AnonymousClass5XQ.A00(A022, A023);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TextFieldValue(text='");
        A0u.append(this.A01);
        A0u.append("', selection=");
        long j = this.A00;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("TextRange(");
        A0u2.append(C90494aF.A08(j));
        C90504aG.A1M(A0u2);
        A0u.append(C36321k7.A0G(A0u2, C90474aD.A03(j)));
        A0u.append(", composition=");
        return AnonymousClass000.A0m((Object) null, A0u);
    }
}
