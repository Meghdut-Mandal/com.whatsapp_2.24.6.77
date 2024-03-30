package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6DY  reason: invalid class name */
public final class AnonymousClass6DY {
    public final long A00;
    public final UserJid A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final String A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DY) {
                AnonymousClass6DY r8 = (AnonymousClass6DY) obj;
                if (!AnonymousClass00C.A0J(this.A01, r8.A01) || !AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A03, r8.A03) || this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A04, r8.A04) || !AnonymousClass00C.A0J(this.A06, r8.A06) || this.A05 != r8.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36381kD.A08(this.A06, C36381kD.A08(this.A04, C36321k7.A00(this.A00, C36381kD.A08(this.A03, C36381kD.A08(this.A02, C36391kE.A0A(this.A01)))))) + C36341k9.A01(this.A05 ? 1 : 0);
    }

    public AnonymousClass6DY(UserJid userJid, String str, String str2, String str3, String str4, long j, boolean z) {
        C36321k7.A11(userJid, str, str2);
        C36341k9.A1F(str3, str4);
        this.A01 = userJid;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = j;
        this.A04 = str3;
        this.A06 = str4;
        this.A05 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlowsContextParams(bizJid=");
        A0u.append(this.A01);
        A0u.append(", flowId=");
        A0u.append(this.A02);
        A0u.append(", messageId=");
        A0u.append(this.A03);
        A0u.append(", messageRowId=");
        A0u.append(this.A00);
        A0u.append(", sessionId=");
        A0u.append(this.A04);
        A0u.append(", flowMessageVersion=");
        A0u.append(this.A06);
        A0u.append(", dataChannelNavigation=");
        return C36321k7.A0H(A0u, this.A05);
    }
}
