package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9X8  reason: invalid class name */
public final class AnonymousClass9X8 {
    public final AnonymousClass11F A00;
    public final UserJid A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final long A05;

    public AnonymousClass9X8(AnonymousClass11F r2, UserJid userJid, String str, String str2, String str3, long j) {
        AnonymousClass00C.A0D(str, 1);
        this.A04 = str;
        this.A01 = userJid;
        this.A00 = r2;
        this.A03 = str2;
        this.A05 = j;
        this.A02 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9X8) {
                AnonymousClass9X8 r8 = (AnonymousClass9X8) obj;
                if (!AnonymousClass00C.A0J(this.A04, r8.A04) || !AnonymousClass00C.A0J(this.A01, r8.A01) || !AnonymousClass00C.A0J(this.A00, r8.A00) || !AnonymousClass00C.A0J(this.A03, r8.A03) || this.A05 != r8.A05 || !AnonymousClass00C.A0J(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36321k7.A00(this.A05, (((((C36421kH.A04(this.A04) + AnonymousClass000.A0H(this.A01)) * 31) + AnonymousClass000.A0H(this.A00)) * 31) + C36341k9.A09(this.A03)) * 31) + C36421kH.A05(this.A02);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BotMetadata(targetId=");
        A0u.append(this.A04);
        A0u.append(", targetSenderJid=");
        A0u.append(this.A01);
        A0u.append(", targetChatJid=");
        A0u.append(this.A00);
        A0u.append(", editTargetId=");
        A0u.append(this.A03);
        A0u.append(", senderTimestampMs=");
        A0u.append(this.A05);
        A0u.append(", edit=");
        return C36321k7.A0E(this.A02, A0u);
    }
}
