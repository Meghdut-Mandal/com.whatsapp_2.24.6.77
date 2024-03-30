package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.6OZ  reason: invalid class name */
public final class AnonymousClass6OZ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final C20070wy A04;
    public final AnonymousClass6EE A05;
    public final AnonymousClass147 A06;
    public final UserJid A07;
    public final UserJid A08;
    public final CallState A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass6OZ r7 = (AnonymousClass6OZ) obj;
            if (!(this.A0G == r7.A0G && this.A0J == r7.A0J && this.A0N == r7.A0N && this.A0K == r7.A0K && this.A0M == r7.A0M && this.A0I == r7.A0I && this.A04.equals(r7.A04) && this.A09 == r7.A09 && C1901797e.A00(this.A05, r7.A05) && C1901797e.A00(this.A06, r7.A06) && C1901797e.A00(this.A08, r7.A08) && C1901797e.A00(this.A07, r7.A07) && this.A0A.equals(r7.A0A) && this.A00 == r7.A00 && this.A0F == r7.A0F && C1901797e.A00(this.A0B, r7.A0B) && C1901797e.A00(this.A0C, r7.A0C) && this.A0E == r7.A0E && this.A0D == r7.A0D && this.A0L == r7.A0L && this.A02 == r7.A02 && this.A0H == r7.A0H && this.A03 == r7.A03 && this.A01 == r7.A01)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6OZ(com.whatsapp.voipcalling.CallInfo r42) {
        /*
            r41 = this;
            r2 = r42
            java.util.Map r0 = r2.participants
            X.0wy r16 = X.C20070wy.copyOf((java.util.Map) r0)
            boolean r30 = r2.isCallFull()
            boolean r14 = r2.isGroupCall
            com.whatsapp.voipcalling.CallState r13 = r2.callState
            boolean r12 = r2.videoEnabled
            boolean r33 = r2.isInLonelyState()
            X.6EE r11 = r2.self
            com.whatsapp.jid.GroupJid r1 = r2.groupJid
            X.3Sl r0 = X.AnonymousClass147.A01
            X.147 r18 = X.C65533Sl.A03(r1)
            com.whatsapp.jid.UserJid r19 = r2.getPeerJid()
            java.lang.String r10 = r2.callId
            boolean r34 = r2.isSelfRequestingUpgrade()
            boolean r35 = r2.isEitherSideRequestingUpgrade()
            com.whatsapp.jid.UserJid r9 = r2.callLinkCreatorJid
            int r8 = r2.callLinkState
            boolean r7 = r2.callEnding
            java.lang.String r6 = r2.callLinkToken
            java.lang.String r5 = r2.scheduledId
            boolean r37 = r2.isAudioChat()
            boolean r4 = r2.canRingAll
            boolean r39 = r2.isPhashBasedCall()
            int r3 = r2.connectedLimit
            boolean r40 = r2.isCallOnHold()
            long r0 = r2.callDuration
            int r2 = r2.callResult
            r15 = r41
            r31 = r14
            r32 = r12
            r36 = r7
            r38 = r4
            r26 = r3
            r27 = r2
            r28 = r0
            r23 = r6
            r24 = r5
            r25 = r8
            r20 = r9
            r21 = r13
            r22 = r10
            r17 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OZ.<init>(com.whatsapp.voipcalling.CallInfo):void");
    }

    public int hashCode() {
        Object[] objArr = new Object[24];
        objArr[0] = this.A04;
        C36421kH.A1R(objArr, this.A0G);
        objArr[2] = Boolean.valueOf(this.A0J);
        objArr[3] = this.A09;
        objArr[4] = Boolean.valueOf(this.A0N);
        objArr[5] = Boolean.valueOf(this.A0K);
        objArr[6] = this.A05;
        objArr[7] = this.A06;
        objArr[8] = this.A08;
        objArr[9] = this.A0A;
        objArr[10] = Boolean.valueOf(this.A0M);
        objArr[11] = Boolean.valueOf(this.A0I);
        objArr[12] = this.A07;
        objArr[13] = Integer.valueOf(this.A00);
        objArr[14] = Boolean.valueOf(this.A0F);
        objArr[15] = this.A0B;
        objArr[16] = this.A0C;
        objArr[17] = Boolean.valueOf(this.A0E);
        objArr[18] = Boolean.valueOf(this.A0D);
        objArr[19] = Boolean.valueOf(this.A0L);
        objArr[20] = Integer.valueOf(this.A02);
        objArr[21] = Boolean.valueOf(this.A0H);
        objArr[22] = Long.valueOf(this.A03);
        return AnonymousClass000.A0M(Integer.valueOf(this.A01), objArr, 23);
    }

    public AnonymousClass6OZ(C20070wy r2, AnonymousClass6EE r3, AnonymousClass147 r4, UserJid userJid, UserJid userJid2, CallState callState, String str, String str2, String str3, int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.A04 = r2;
        this.A0G = z;
        this.A0J = z2;
        this.A09 = callState;
        this.A0N = z3;
        this.A0K = z4;
        this.A05 = r3;
        this.A06 = r4;
        this.A08 = userJid;
        this.A0A = str;
        this.A0M = z5;
        this.A0I = z6;
        this.A07 = userJid2;
        this.A00 = i;
        this.A0F = z7;
        this.A0B = str2;
        this.A0C = str3;
        this.A0E = z8;
        this.A0D = z9;
        this.A0L = z10;
        this.A02 = i2;
        this.A0H = z11;
        this.A03 = j;
        this.A01 = i3;
    }
}
