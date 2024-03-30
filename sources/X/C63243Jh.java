package X;

/* renamed from: X.3Jh  reason: invalid class name and case insensitive filesystem */
public final class C63243Jh {
    public final int A00;
    public final long A01;
    public final C52312pE A02;
    public final AnonymousClass11F A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63243Jh) {
                C63243Jh r8 = (C63243Jh) obj;
                if (!(this.A01 == r8.A01 && AnonymousClass00C.A0J(this.A03, r8.A03) && this.A02 == r8.A02 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A02, C36351kA.A05(this.A03, AnonymousClass000.A08(this.A01) * 31)) + this.A00;
    }

    public C63243Jh(C52312pE r1, AnonymousClass11F r2, int i, long j) {
        this.A01 = j;
        this.A03 = r2;
        this.A02 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Favorite(id=");
        A0u.append(this.A01);
        A0u.append(", chatJid=");
        A0u.append(this.A03);
        A0u.append(", type=");
        A0u.append(this.A02);
        A0u.append(", order=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
