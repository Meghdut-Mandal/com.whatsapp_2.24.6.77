package X;

/* renamed from: X.9We  reason: invalid class name and case insensitive filesystem */
public final class C195829We {
    public final AnonymousClass9Vi A00;
    public final AnonymousClass3T1 A01;
    public final String A02;
    public final String A03;

    public C195829We(AnonymousClass9Vi r2, AnonymousClass3T1 r3, String str, String str2) {
        AnonymousClass00C.A0D(str, 1);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195829We) {
                C195829We r5 = (C195829We) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A01, C36381kD.A08(this.A03, C36421kH.A04(this.A02))) + AnonymousClass000.A0H(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ContactReactionItem(key=");
        A0u.append(this.A02);
        A0u.append(", reaction=");
        A0u.append(this.A03);
        A0u.append(", message=");
        A0u.append(this.A01);
        A0u.append(", reactionSender=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
