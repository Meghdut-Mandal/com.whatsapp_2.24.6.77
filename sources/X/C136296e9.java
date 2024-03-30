package X;

/* renamed from: X.6e9  reason: invalid class name and case insensitive filesystem */
public final class C136296e9 implements AnonymousClass7dW {
    public final long A00;
    public final C161407mr A01;
    public final Integer A02;

    public C160547lB BxH(C156857b4 r5) {
        return new C136406eL(this.A01.BxI(r5), this.A00);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C136296e9)) {
            return false;
        }
        C136296e9 r7 = (C136296e9) obj;
        if (!AnonymousClass00C.A0J(r7.A01, this.A01) || r7.A00 != this.A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, (C36391kE.A0A(this.A01) - 1532807697) * 31);
    }

    public C136296e9(C161407mr r1, Integer num, long j) {
        this.A01 = r1;
        this.A02 = num;
        this.A00 = j;
    }
}
