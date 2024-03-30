package X;

/* renamed from: X.3Jd  reason: invalid class name and case insensitive filesystem */
public final class C63203Jd {
    public final int A00;
    public final long A01;
    public final C51202nR A02;
    public final Integer A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63203Jd) {
                C63203Jd r8 = (C63203Jd) obj;
                if (!(this.A01 == r8.A01 && this.A02 == r8.A02 && this.A00 == r8.A00 && AnonymousClass00C.A0J(this.A03, r8.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36351kA.A05(this.A02, AnonymousClass000.A08(this.A01) * 31) + this.A00) * 31) + AnonymousClass000.A0H(this.A03);
    }

    public C63203Jd(C51202nR r1, Integer num, int i, long j) {
        this.A01 = j;
        this.A02 = r1;
        this.A00 = i;
        this.A03 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PopupMenuListItem(id=");
        A0u.append(this.A01);
        A0u.append(", type=");
        A0u.append(this.A02);
        A0u.append(", textId=");
        A0u.append(this.A00);
        A0u.append(", iconResourceId=");
        return AnonymousClass000.A0m(this.A03, A0u);
    }
}
