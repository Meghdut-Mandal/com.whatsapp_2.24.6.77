package X;

/* renamed from: X.2fQ  reason: invalid class name and case insensitive filesystem */
public final class C47662fQ extends C55542un {
    public final int A00;
    public final AnonymousClass3XM A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47662fQ) {
                C47662fQ r5 = (C47662fQ) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A01) + this.A00;
    }

    public C47662fQ(AnonymousClass3XM r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CreateYourOwn(funStickerData=");
        A0u.append(this.A01);
        A0u.append(", origin=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
