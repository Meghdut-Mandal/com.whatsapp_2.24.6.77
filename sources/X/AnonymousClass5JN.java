package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.5JN  reason: invalid class name */
public final class AnonymousClass5JN extends C1267065d {
    public final long A00;
    public final long A01;
    public final long A02;
    public final DeviceJid A03;
    public final DeviceJid A04;
    public final GroupJid A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public AnonymousClass5JN(DeviceJid deviceJid, DeviceJid deviceJid2, GroupJid groupJid, String str, String str2, String str3, long j, long j2, long j3, boolean z) {
        AnonymousClass00C.A0D(str3, 3);
        this.A07 = str;
        this.A08 = str2;
        this.A06 = str3;
        this.A03 = deviceJid;
        this.A04 = deviceJid2;
        this.A09 = z;
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A05 = groupJid;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5JN) {
                AnonymousClass5JN r8 = (AnonymousClass5JN) obj;
                if (!AnonymousClass00C.A0J(this.A07, r8.A07) || !AnonymousClass00C.A0J(this.A08, r8.A08) || !AnonymousClass00C.A0J(this.A06, r8.A06) || !AnonymousClass00C.A0J(this.A03, r8.A03) || !AnonymousClass00C.A0J(this.A04, r8.A04) || this.A09 != r8.A09 || this.A00 != r8.A00 || this.A01 != r8.A01 || this.A02 != r8.A02 || !AnonymousClass00C.A0J(this.A05, r8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.A06;
        return C36321k7.A00(this.A02, C36321k7.A00(this.A01, C36321k7.A00(this.A00, (((((C36381kD.A08(str, (C36421kH.A04(this.A07) + C36341k9.A09(this.A08)) * 31) + AnonymousClass000.A0H(this.A03)) * 31) + AnonymousClass000.A0H(this.A04)) * 31) + C36341k9.A01(this.A09 ? 1 : 0)) * 31))) + C36411kG.A09(this.A05);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CallPushPayload(dataNotificationType=");
        A0u.append(this.A07);
        A0u.append(", dataToLid=");
        A0u.append(this.A08);
        A0u.append(", callId=");
        A0u.append(this.A06);
        A0u.append(", fromDeviceJid=");
        A0u.append(this.A03);
        A0u.append(", fromPhoneDeviceJid=");
        A0u.append(this.A04);
        A0u.append(", videoCall=");
        A0u.append(this.A09);
        A0u.append(", offerTimeSec=");
        A0u.append(this.A00);
        A0u.append(", pushTimeoutSec=");
        A0u.append(this.A01);
        A0u.append(", secondaryOfferTimeoutSec=");
        A0u.append(this.A02);
        A0u.append(", groupJid=");
        return AnonymousClass000.A0m(this.A05, A0u);
    }
}
