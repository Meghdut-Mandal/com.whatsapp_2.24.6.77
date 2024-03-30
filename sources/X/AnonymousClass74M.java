package X;

import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallGroupInfo;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallParticipant;

/* renamed from: X.74M  reason: invalid class name */
public final /* synthetic */ class AnonymousClass74M implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ AnonymousClass6Ts A05;
    public final /* synthetic */ WamCall A06;
    public final /* synthetic */ GroupJid A07;
    public final /* synthetic */ UserJid A08;
    public final /* synthetic */ CallGroupInfo A09;
    public final /* synthetic */ CallInfo A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;
    public final /* synthetic */ boolean A0I;

    public /* synthetic */ AnonymousClass74M(AnonymousClass6Ts r3, WamCall wamCall, GroupJid groupJid, UserJid userJid, CallGroupInfo callGroupInfo, CallInfo callInfo, String str, String str2, String str3, int i, int i2, int i3, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A05 = r3;
        this.A08 = userJid;
        this.A0D = str;
        this.A00 = i;
        this.A0A = callInfo;
        this.A07 = groupJid;
        this.A01 = i2;
        this.A09 = callGroupInfo;
        this.A04 = j;
        this.A02 = i3;
        this.A0B = str2;
        this.A0C = str3;
        this.A0E = z;
        this.A0F = z2;
        this.A0G = z3;
        this.A0H = z4;
        this.A0I = z5;
        this.A06 = wamCall;
        this.A03 = j2;
    }

    public final void run() {
        boolean A1X;
        String str;
        AnonymousClass6Ts r12 = this.A05;
        UserJid userJid = this.A08;
        String str2 = this.A0D;
        int i = this.A00;
        CallInfo callInfo = this.A0A;
        GroupJid groupJid = this.A07;
        int i2 = this.A01;
        CallGroupInfo callGroupInfo = this.A09;
        long j = this.A04;
        int i3 = this.A02;
        String str3 = this.A0B;
        String str4 = this.A0C;
        boolean z = this.A0E;
        boolean z2 = this.A0F;
        boolean z3 = this.A0G;
        boolean z4 = this.A0H;
        boolean z5 = this.A0I;
        WamCall wamCall = this.A06;
        long j2 = this.A03;
        boolean z6 = false;
        C107265Nh A032 = r12.A03(userJid, str2, i, false);
        if (A032 != null) {
            if (callInfo == null) {
                A1X = false;
                str = null;
            } else {
                A1X = C90514aH.A1X(callInfo, str2);
                str = callInfo.scheduledId;
                if (callInfo.isAudioChat()) {
                    z6 = true;
                }
            }
            r12.A06(groupJid, A032, str, z6);
            int i4 = 26;
            if (i2 == 0) {
                i4 = 4;
            }
            A032.A0F(2);
            if (callGroupInfo != null) {
                for (CallParticipant callParticipant : callGroupInfo.participants) {
                    if ("connected".equals(callParticipant.state)) {
                        A032.A0K(callParticipant.jid, 5);
                    }
                }
            }
            boolean A022 = C224714l.A02();
            AnonymousClass1HJ r0 = r12.A06;
            if (A022) {
                r0.A09(A032);
            } else {
                r0.A0A(A032);
            }
            r12.A03.A0W(wamCall, callGroupInfo, A032, Integer.valueOf(i3), str2, str3, str4, i4, j, j2, z, A1X, z2, z3, z4, z5, true);
        }
    }
}
