package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.5JM  reason: invalid class name */
public final class AnonymousClass5JM extends C1267065d {
    public final AnonymousClass11F A00;
    public final AnonymousClass11F A01;
    public final GroupJid A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5JM) {
                AnonymousClass5JM r5 = (AnonymousClass5JM) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C36351kA.A05(this.A00, (C36421kH.A04(this.A03) + C36341k9.A09(this.A04)) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + C36341k9.A09(this.A05)) * 31) + C36411kG.A09(this.A01);
    }

    public AnonymousClass5JM(AnonymousClass11F r1, AnonymousClass11F r2, GroupJid groupJid, String str, String str2, String str3) {
        this.A03 = str;
        this.A04 = str2;
        this.A00 = r1;
        this.A02 = groupJid;
        this.A05 = str3;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MessagePushPayload(dataNotificationType=");
        A0u.append(this.A03);
        A0u.append(", dataToLid=");
        A0u.append(this.A04);
        A0u.append(", senderJid=");
        A0u.append(this.A00);
        A0u.append(", groupJid=");
        A0u.append(this.A02);
        A0u.append(", displayName=");
        A0u.append(this.A05);
        A0u.append(", senderPnJid=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
