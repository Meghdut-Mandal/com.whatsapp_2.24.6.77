package X;

/* renamed from: X.9Vs  reason: invalid class name and case insensitive filesystem */
public final class C195729Vs {
    public final AnonymousClass90R A00;
    public final C64933Qa A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195729Vs) {
                C195729Vs r5 = (C195729Vs) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C195729Vs(AnonymousClass90R r1, C64933Qa r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36351kA.A05(this.A01, 38347));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C90474aD.A1N(A0u, "MessageSecretParams(sendAsLidMessage=");
        A0u.append(", parentMessageKey=");
        A0u.append(this.A01);
        A0u.append(", messageSecretEncryptedType=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
