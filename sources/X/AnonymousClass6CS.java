package X;

/* renamed from: X.6CS  reason: invalid class name */
public final class AnonymousClass6CS {
    public final int A00;
    public final C131506Pi A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        int i;
        int i2;
        if (this != obj) {
            if (AnonymousClass00C.A0J(getClass(), C90474aD.A0W(obj))) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.privacy.usernotice.badge.UserNoticeBadged");
                AnonymousClass6CS r12 = (AnonymousClass6CS) obj;
                String str = this.A03;
                String str2 = r12.A03;
                if (AnonymousClass00C.A0J(str, str2)) {
                    String str3 = this.A02;
                    String str4 = r12.A02;
                    if (AnonymousClass00C.A0J(str3, str4) && (i = this.A00) == (i2 = r12.A00)) {
                        C131506Pi r2 = this.A01;
                        C131506Pi r1 = r12.A01;
                        if (!AnonymousClass00C.A0J(r2, r1) || !AnonymousClass00C.A0J(str, str2) || !AnonymousClass00C.A0J(str3, str4) || i != i2 || !r2.equals(r1)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36381kD.A08(this.A02, C36421kH.A04(this.A03)));
    }

    public AnonymousClass6CS(C131506Pi r1, String str, String str2, int i) {
        C36321k7.A0x(str, str2);
        this.A03 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UserNoticeBadge(text='");
        A0u.append(this.A03);
        A0u.append("', action='");
        A0u.append(this.A02);
        A0u.append("', badgeExpirationInHours=");
        A0u.append(this.A00);
        A0u.append(", timing=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
