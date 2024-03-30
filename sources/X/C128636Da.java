package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6Da  reason: invalid class name and case insensitive filesystem */
public final class C128636Da {
    public final int A00;
    public final int A01;
    public final int A02;
    public final UserJid A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128636Da) {
                C128636Da r5 = (C128636Da) obj;
                if (!(AnonymousClass00C.A0J(this.A03, r5.A03) && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A06 == r5.A06 && this.A05 == r5.A05 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((C36391kE.A0A(this.A03) + 12) * 31) + this.A01) * 31) + this.A02) * 31) + this.A00) * 31) + C36341k9.A01(this.A06 ? 1 : 0)) * 31) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + C36341k9.A01(this.A04 ? 1 : 0);
    }

    public C128636Da(UserJid userJid, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.A03 = userJid;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = z3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LinkedAccountMediaRequest(businessJid=");
        A0u.append(this.A03);
        A0u.append(", limit=");
        A0u.append(12);
        A0u.append(", imageHeight=");
        A0u.append(this.A01);
        A0u.append(", imageWidth=");
        A0u.append(this.A02);
        A0u.append(", accountType=");
        A0u.append(this.A00);
        A0u.append(", shouldFilterSensitiveContent=");
        A0u.append(this.A06);
        A0u.append(", shouldFilterIneligiblePosts=");
        A0u.append(this.A05);
        A0u.append(", isTrustCard=");
        return C36321k7.A0H(A0u, this.A04);
    }
}
