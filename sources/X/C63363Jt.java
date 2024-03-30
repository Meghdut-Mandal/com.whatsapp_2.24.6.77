package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Jt  reason: invalid class name and case insensitive filesystem */
public final class C63363Jt {
    public final long A00;
    public final C63493Kg A01;
    public final UserJid A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63363Jt) {
                C63363Jt r8 = (C63363Jt) obj;
                if (!AnonymousClass00C.A0J(this.A04, r8.A04) || !AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A03, r8.A03) || this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36321k7.A00(this.A00, C36381kD.A08(this.A03, C36351kA.A05(this.A02, C36421kH.A04(this.A04)))));
    }

    public C63363Jt(C63493Kg r1, UserJid userJid, String str, String str2, long j) {
        C36321k7.A0y(str, str2);
        this.A04 = str;
        this.A02 = userJid;
        this.A03 = str2;
        this.A00 = j;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SurveyInfo(sessionId=");
        A0u.append(this.A04);
        A0u.append(", businessJid=");
        A0u.append(this.A02);
        A0u.append(", businessSessionId=");
        A0u.append(this.A03);
        A0u.append(", surveyStartTimestamp=");
        A0u.append(this.A00);
        A0u.append(", conversionInfo=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
