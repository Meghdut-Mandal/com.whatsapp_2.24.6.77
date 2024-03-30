package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9XK  reason: invalid class name */
public final class AnonymousClass9XK {
    public final C21674AUx A00;
    public final C21674AUx A01;
    public final AnonymousClass11F A02;
    public final UserJid A03;
    public final AnonymousClass8SW A04;
    public final C64933Qa A05;
    public final String A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9XK) {
                AnonymousClass9XK r5 = (AnonymousClass9XK) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A04, r5.A04) || this.A07 != r5.A07 || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C64933Qa r0 = this.A05;
        return C90504aG.A0B(this.A06, (((C53202qw.A00((C36351kA.A05(r0, ((AnonymousClass000.A0H(this.A00) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + AnonymousClass000.A0H(this.A04)) * 31, this.A07) + AnonymousClass000.A0H(this.A02)) * 31) + C36411kG.A09(this.A03)) * 31);
    }

    public AnonymousClass9XK(C21674AUx aUx, C21674AUx aUx2, AnonymousClass11F r3, UserJid userJid, AnonymousClass8SW r5, C64933Qa r6, String str, boolean z) {
        this.A00 = aUx;
        this.A01 = aUx2;
        this.A05 = r6;
        this.A04 = r5;
        this.A07 = z;
        this.A02 = r3;
        this.A03 = userJid;
        this.A06 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MessageSecretDecryptionParams(encIv=");
        A0u.append(this.A00);
        A0u.append(", encPayload=");
        A0u.append(this.A01);
        A0u.append(", messageKey=");
        A0u.append(this.A05);
        A0u.append(", targetMessageKey=");
        A0u.append(this.A04);
        A0u.append(", isTargetMessageLidBased=");
        A0u.append(this.A07);
        A0u.append(", remoteSenderJid=");
        A0u.append(this.A02);
        A0u.append(", senderUserJid=");
        A0u.append(this.A03);
        A0u.append(", messageSecretUseCase=");
        return C36321k7.A0E(this.A06, A0u);
    }
}
