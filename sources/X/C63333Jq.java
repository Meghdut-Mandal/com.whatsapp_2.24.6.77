package X;

/* renamed from: X.3Jq  reason: invalid class name and case insensitive filesystem */
public final class C63333Jq {
    public final AnonymousClass3U1 A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63333Jq) {
                C63333Jq r5 = (C63333Jq) obj;
                if (!(AnonymousClass00C.A0J(this.A00, r5.A00) && this.A02 == r5.A02 && this.A04 == r5.A04 && this.A01 == r5.A01 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((C36391kE.A0A(this.A00) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + C36341k9.A01(this.A04 ? 1 : 0)) * 31) + C36341k9.A01(this.A01 ? 1 : 0)) * 31) + C36341k9.A01(this.A03 ? 1 : 0);
    }

    public C63333Jq(AnonymousClass3U1 r1, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = r1;
        this.A02 = z;
        this.A04 = z2;
        this.A01 = z3;
        this.A03 = z4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EncryptionInfoViewState(businessState=");
        A0u.append(this.A00);
        A0u.append(", isInAppSupportChatOrInAppSurvey=");
        A0u.append(this.A02);
        A0u.append(", isChatPSAJid=");
        A0u.append(this.A04);
        A0u.append(", isBusinessE2EE=");
        A0u.append(this.A01);
        A0u.append(", isMe=");
        return C36321k7.A0H(A0u, this.A03);
    }
}
