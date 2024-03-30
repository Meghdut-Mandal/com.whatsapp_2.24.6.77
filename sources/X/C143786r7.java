package X;

/* renamed from: X.6r7  reason: invalid class name and case insensitive filesystem */
public final class C143786r7 implements C16220oo {
    public final float A00;
    public final C61243Bc A01;
    public final Integer A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C143786r7) {
                C143786r7 r5 = (C143786r7) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || Float.compare(this.A00, r5.A00) != 0 || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90474aD.A02(C36391kE.A0A(this.A01), this.A00) + AnonymousClass000.A0H(this.A02);
    }

    public C143786r7(C61243Bc r1, Integer num, float f) {
        this.A01 = r1;
        this.A00 = f;
        this.A02 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DominantSpeaker(name=");
        A0u.append(this.A01);
        A0u.append(", audioLevel=");
        A0u.append(this.A00);
        A0u.append(", colorIndex=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
