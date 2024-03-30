package X;

import com.whatsapp.jid.GroupJid;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.6NW  reason: invalid class name */
public class AnonymousClass6NW {
    public int A00;
    public long A01 = -1;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final GroupJid A07;
    public final C107265Nh A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;
    public final LinkedHashMap A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public AnonymousClass6NW(GroupJid groupJid, Integer num, String str, String str2, String str3, LinkedHashMap linkedHashMap, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A0A = str;
        this.A0C = linkedHashMap;
        this.A0E = z;
        this.A07 = groupJid;
        this.A06 = i;
        this.A0F = z2;
        this.A0B = str2;
        this.A0D = z3;
        this.A09 = num;
        this.A02 = str3;
        this.A03 = z4;
        this.A00 = i2;
        this.A08 = null;
        this.A04 = z5;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("callId=");
        A0u.append(this.A0A);
        A0u.append(" isVideoCall=");
        A0u.append(this.A0E);
        A0u.append(" groupJid=");
        A0u.append(this.A07);
        A0u.append(" jids=[ ");
        Iterator A0s = C90484aE.A0s(this.A0C);
        while (A0s.hasNext()) {
            A0u.append(A0s.next());
            C36421kH.A1N(A0u);
        }
        A0u.append("]");
        A0u.append(" callLog=");
        A0u.append(this.A08);
        A0u.append(" entryPoint=");
        A0u.append(this.A09);
        A0u.append(" groupPhash=");
        A0u.append(this.A02);
        A0u.append(" offerDelayMs=");
        A0u.append(this.A00);
        A0u.append(" shouldJoinAndAccept=");
        A0u.append(this.A05);
        A0u.append(" mute");
        return C36421kH.A0d(A0u, this.A04);
    }

    public AnonymousClass6NW(C107265Nh r3, int i, boolean z, boolean z2) {
        this.A0A = C34681hT.A08(r3.A04.A02);
        this.A0C = C36431kI.A1G();
        this.A0E = r3.A0K;
        this.A07 = r3.A0D;
        this.A06 = 0;
        this.A0F = false;
        this.A0B = null;
        this.A0D = z2;
        this.A08 = r3;
        this.A09 = Integer.valueOf(i);
        this.A02 = null;
        this.A05 = z;
    }
}
