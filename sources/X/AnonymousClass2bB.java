package X;

/* renamed from: X.2bB  reason: invalid class name */
public final class AnonymousClass2bB extends C63663Kx {
    public final long A00;
    public final C195759Vv A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2bB) {
                AnonymousClass2bB r8 = (AnonymousClass2bB) obj;
                if (!AnonymousClass00C.A0J(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, C36391kE.A0A(this.A01));
    }

    public AnonymousClass2bB(C195759Vv r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Comment(parentMessageKey=");
        A0u.append(this.A01);
        A0u.append(", parentMessageRowId=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
