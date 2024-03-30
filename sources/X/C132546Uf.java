package X;

import com.whatsapp.R;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.6Uf  reason: invalid class name and case insensitive filesystem */
public final class C132546Uf {
    public int A00;
    public CallState A01 = CallState.NONE;
    public final AnonymousClass16D A02;
    public final AnonymousClass171 A03;
    public final C18820ts A04;
    public final C145156tR A05;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r10 != 0) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r10 == 2) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        r4 = java.lang.Integer.valueOf(com.whatsapp.R.drawable.ic_voip_e2ee_padlock_flat_wds);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        return new X.AnonymousClass6BI(r5, r4, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0069, code lost:
        if (r0 != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass6BI A02(X.AnonymousClass6OZ r8, X.C132546Uf r9, int r10, boolean r11, boolean r12) {
        /*
            r5 = 0
            r4 = 0
            if (r11 == 0) goto L_0x004a
            int r2 = r8.A01
            if (r12 != 0) goto L_0x012a
            r0 = 2
            r1 = 2131895893(0x7f122655, float:1.9426632E38)
            if (r2 == r0) goto L_0x0028
            r0 = 10
            r1 = 2131895881(0x7f122649, float:1.9426608E38)
            if (r2 == r0) goto L_0x0028
            r0 = 17
            r1 = 2131896050(0x7f1226f2, float:1.942695E38)
            if (r2 == r0) goto L_0x0028
            r0 = 4
            r1 = 2131895915(0x7f12266b, float:1.9426676E38)
            if (r2 == r0) goto L_0x0028
            r0 = 5
            if (r2 != r0) goto L_0x012a
            r1 = 2131887328(0x7f1204e0, float:1.940926E38)
        L_0x0028:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x012a
            int r1 = r0.intValue()
            java.lang.Object[] r0 = new java.lang.Object[r5]
            X.2ft r5 = X.C90524aI.A0O(r0, r1)
        L_0x0038:
            if (r10 == 0) goto L_0x003d
        L_0x003a:
            r0 = 2
            if (r10 != r0) goto L_0x0044
        L_0x003d:
            r0 = 2131232924(0x7f08089c, float:1.808197E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L_0x0044:
            X.6BI r0 = new X.6BI
            r0.<init>(r5, r4, r10)
            return r0
        L_0x004a:
            if (r10 == 0) goto L_0x011f
            r0 = 2
            if (r10 == r0) goto L_0x011f
            com.whatsapp.voipcalling.CallState r2 = r8.A09
            int r0 = r2.ordinal()
            r6 = 1
            switch(r0) {
                case 1: goto L_0x0064;
                case 2: goto L_0x009c;
                case 3: goto L_0x006f;
                case 4: goto L_0x00a0;
                case 5: goto L_0x00a0;
                case 6: goto L_0x00a4;
                case 7: goto L_0x0059;
                case 8: goto L_0x006f;
                case 9: goto L_0x0059;
                case 10: goto L_0x006b;
                default: goto L_0x0059;
            }
        L_0x0059:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CallScreenHeaderUseCase/setSubtitleText string not set for call state: "
            java.lang.IllegalArgumentException r0 = X.C90464aC.A0P(r2, r0, r1)
            throw r0
        L_0x0064:
            boolean r0 = r8.A0J
            r1 = 2131895885(0x7f12264d, float:1.9426616E38)
            if (r0 == 0) goto L_0x00d7
        L_0x006b:
            r1 = 2131895999(0x7f1226bf, float:1.9426847E38)
            goto L_0x00d7
        L_0x006f:
            X.147 r1 = r8.A06
            boolean r0 = r8.A0N
            if (r1 == 0) goto L_0x0093
            r7 = 2131889571(0x7f120da3, float:1.941381E38)
            if (r0 == 0) goto L_0x007d
            r7 = 2131889570(0x7f120da2, float:1.9413807E38)
        L_0x007d:
            java.lang.Object[] r3 = new java.lang.Object[r6]
            X.171 r2 = r9.A03
            X.16D r1 = r9.A02
            com.whatsapp.jid.UserJid r0 = r8.A08
            if (r0 == 0) goto L_0x012b
            X.141 r0 = r1.A0D(r0)
            X.C36371kC.A1K(r2, r0, r3, r5)
            X.2ft r5 = X.C90524aI.A0O(r3, r7)
            goto L_0x003a
        L_0x0093:
            r1 = 2131890337(0x7f1210a1, float:1.9415363E38)
            if (r0 == 0) goto L_0x00d7
            r1 = 2131890336(0x7f1210a0, float:1.941536E38)
            goto L_0x00d7
        L_0x009c:
            r1 = 2131895886(0x7f12264e, float:1.9426618E38)
            goto L_0x00d7
        L_0x00a0:
            r1 = 2131895891(0x7f122653, float:1.9426628E38)
            goto L_0x00d7
        L_0x00a4:
            boolean r0 = r8.A0J
            if (r0 != 0) goto L_0x00e1
            boolean r0 = r8.A0N
            if (r0 != 0) goto L_0x00e1
            X.0wy r0 = r8.A04
            java.util.Collection r0 = r0.values()
            X.AnonymousClass00C.A08(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x00b9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00df
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.6EE r0 = (X.AnonymousClass6EE) r0
            boolean r0 = r0.A0J
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00b9
        L_0x00cc:
            X.6EE r1 = (X.AnonymousClass6EE) r1
            if (r1 == 0) goto L_0x00e1
            boolean r0 = r1.A0F
            if (r0 != r6) goto L_0x00e1
            r1 = 2131896036(0x7f1226e4, float:1.9426922E38)
        L_0x00d7:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            X.2ft r5 = X.C90524aI.A0O(r0, r1)
            goto L_0x003a
        L_0x00df:
            r1 = 0
            goto L_0x00cc
        L_0x00e1:
            boolean r0 = r8.A0H
            if (r0 == 0) goto L_0x00e9
            r1 = 2131896026(0x7f1226da, float:1.9426902E38)
            goto L_0x00d7
        L_0x00e9:
            X.0wy r0 = r8.A04
            X.AnonymousClass00C.A07(r0)
            int r3 = X.C110325aU.A00(r0)
            X.0ts r2 = r9.A04
            long r0 = r8.A03
            long r0 = X.C36391kE.A0B(r0)
            java.lang.String r2 = X.AnonymousClass3UY.A07(r2, r0)
            X.AnonymousClass00C.A08(r2)
            r0 = 8
            if (r3 <= r0) goto L_0x0118
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()
            X.AnonymousClass000.A1L(r1, r3, r5)
            r1[r6] = r2
            r0 = 2131755029(0x7f100015, float:1.9140926E38)
            X.2fu r5 = new X.2fu
            r5.<init>(r1, r0, r3)
            goto L_0x003a
        L_0x0118:
            X.2fr r5 = new X.2fr
            r5.<init>(r2)
            goto L_0x003a
        L_0x011f:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 2131897130(0x7f122b2a, float:1.942914E38)
            X.2ft r5 = X.C90524aI.A0O(r1, r0)
            goto L_0x0038
        L_0x012a:
            return r4
        L_0x012b:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132546Uf.A02(X.6OZ, X.6Uf, int, boolean, boolean):X.6BI");
    }

    public static final AnonymousClass6BH A00(int i, boolean z) {
        if (i == 0) {
            return null;
        }
        if (i == 2) {
            return new AnonymousClass6BH(new C1278769z(C90524aI.A0O(new Object[0], R.string.f12nameremoved), C90524aI.A0O(new Object[0], R.string.f12nameremoved)), R.drawable.call_add_participant_flat_wds, !z);
        }
        if (i == 3) {
            return new AnonymousClass6BH(new C1278769z(C90524aI.A0O(new Object[0], R.string.f12nameremoved), C90524aI.A0O(new Object[0], R.string.f12nameremoved)), R.drawable.vec_ic_show_participants_wds, true);
        }
        throw AnonymousClass001.A08("CallScreenHeaderUseCase Invalid participant btn type");
    }

    public static final AnonymousClass6BH A01(AnonymousClass6OZ r3) {
        CallState callState = r3.A09;
        AnonymousClass00C.A07(callState);
        if (!(callState == CallState.ACTIVE || callState == CallState.CONNECTED_LONELY)) {
            if (r3.A0N) {
                return null;
            }
            if (!C131856Qx.A01(callState) && callState != CallState.RECEIVED_CALL) {
                return null;
            }
        }
        return new AnonymousClass6BH(new C1278769z(C90524aI.A0O(new Object[0], R.string.f12nameremoved), C90524aI.A0O(new Object[0], R.string.f12nameremoved)), R.drawable.vec_ic_calling_header_minimize, true);
    }

    public C132546Uf(C145156tR r2, AnonymousClass16D r3, AnonymousClass171 r4, C18820ts r5) {
        C36321k7.A18(r2, r3, r4, r5);
        this.A05 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }
}
