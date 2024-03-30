package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.6Do  reason: invalid class name and case insensitive filesystem */
public final class C128776Do {
    public final long A00;
    public final long A01;
    public final long A02;
    public final DeviceJid A03;
    public final UserJid A04;
    public final AnonymousClass3T1 A05;
    public final Set A06;
    public final boolean A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128776Do) {
                C128776Do r8 = (C128776Do) obj;
                if (!(AnonymousClass00C.A0J(this.A05, r8.A05) && AnonymousClass00C.A0J(this.A03, r8.A03) && AnonymousClass00C.A0J(this.A04, r8.A04) && AnonymousClass00C.A0J(this.A06, r8.A06) && this.A08 == r8.A08 && this.A07 == r8.A07 && this.A01 == r8.A01 && this.A02 == r8.A02 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C128776Do(C124675yc r17) {
        C124675yc r13 = r17;
        AnonymousClass3T1 r12 = r13.A09;
        DeviceJid deviceJid = r13.A03;
        UserJid userJid = r13.A04;
        Set set = r13.A05;
        boolean z = r13.A07;
        boolean z2 = r13.A06;
        long j = r13.A01;
        long j2 = r13.A02;
        long j3 = r13.A00;
        if (j3 == 0) {
            if (r12 instanceof AnonymousClass2bO) {
                j3 = C19970wo.A00(r13.A08);
            } else {
                j3 = r12.A0I;
            }
        }
        this.A05 = r12;
        this.A03 = deviceJid;
        this.A04 = userJid;
        this.A06 = set;
        this.A08 = z;
        this.A07 = z2;
        this.A01 = j;
        this.A02 = j2;
        this.A00 = j3;
    }

    public int hashCode() {
        Set set = this.A06;
        return C36341k9.A02(this.A00, C36321k7.A00(this.A02, C36321k7.A00(this.A01, (((C36351kA.A05(set, (((C36391kE.A0A(this.A05) + AnonymousClass000.A0H(this.A03)) * 31) + C36411kG.A09(this.A04)) * 31) + C36341k9.A01(this.A08 ? 1 : 0)) * 31) + C36341k9.A01(this.A07 ? 1 : 0)) * 31)));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SendMessageParams(message=");
        A0u.append(this.A05);
        A0u.append(", remoteJidForRetry=");
        A0u.append(this.A03);
        A0u.append(", recipientJid=");
        A0u.append(this.A04);
        A0u.append(", targetDevices=");
        A0u.append(this.A06);
        A0u.append(", isResend=");
        A0u.append(this.A08);
        A0u.append(", isOffline=");
        A0u.append(this.A07);
        A0u.append(", originalTimestamp=");
        A0u.append(this.A01);
        A0u.append(", sendExpirationMs=");
        A0u.append(this.A02);
        A0u.append(", messageSendStartTime=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
