package X;

/* renamed from: X.3UW  reason: invalid class name */
public class AnonymousClass3UW implements AnonymousClass04S {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass3UW(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass012 r1, C001600r r2, Object obj, Object obj2, int i) {
        r2.A08(r1, new AnonymousClass3UW(obj, obj2, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03af, code lost:
        if (r4.A04 == false) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x040d, code lost:
        if (r6.isEmpty() != false) goto L_0x040f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0546, code lost:
        if (X.AnonymousClass3T1.A05(r1, r0) < 2592000000L) goto L_0x0548;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x055f, code lost:
        X.AnonymousClass3SJ.A01(r1, 106);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0564, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x07aa, code lost:
        r13.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x07ad, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0831, code lost:
        if (r13.booleanValue() == false) goto L_0x0833;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x08ad, code lost:
        X.C36331k8.A13(r7.A0C);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x08b2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0124, code lost:
        if (X.AnonymousClass3T1.A05(r1, r0) < 2592000000L) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014d, code lost:
        if (r13.booleanValue() == false) goto L_0x014f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0327  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BTH(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.A02
            switch(r0) {
                case 0: goto L_0x081e;
                case 1: goto L_0x0812;
                case 2: goto L_0x0806;
                case 3: goto L_0x07fa;
                case 4: goto L_0x07ee;
                case 5: goto L_0x0599;
                case 6: goto L_0x07db;
                case 7: goto L_0x0565;
                case 8: goto L_0x07c8;
                case 9: goto L_0x07ba;
                case 10: goto L_0x078b;
                case 11: goto L_0x077d;
                case 12: goto L_0x051b;
                case 13: goto L_0x0396;
                case 14: goto L_0x024a;
                case 15: goto L_0x020c;
                case 16: goto L_0x01e2;
                case 17: goto L_0x075b;
                case 18: goto L_0x01b0;
                case 19: goto L_0x0198;
                case 20: goto L_0x0180;
                case 21: goto L_0x074b;
                case 22: goto L_0x072c;
                case 23: goto L_0x06fc;
                case 24: goto L_0x013c;
                case 25: goto L_0x00f9;
                case 26: goto L_0x00c4;
                case 27: goto L_0x06bd;
                case 28: goto L_0x06a6;
                case 29: goto L_0x0664;
                case 30: goto L_0x064e;
                case 31: goto L_0x05ef;
                case 32: goto L_0x00a2;
                case 33: goto L_0x0031;
                case 34: goto L_0x05e0;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r12.A00
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            java.lang.Object r0 = r12.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.voipcalling.VoipActivityV2"
            r2.setClassName(r1, r0)
            java.lang.String r0 = X.C114145gi.A02
            r2.setAction(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.setFlags(r0)
            r3.A1C(r2)
            boolean r0 = r3.A12()
            if (r0 == 0) goto L_0x0030
            r3.A1c()
        L_0x0030:
            return
        L_0x0031:
            java.lang.Object r4 = r12.A00
            com.whatsapp.status.StatusesFragment r4 = (com.whatsapp.status.StatusesFragment) r4
            java.lang.Object r3 = r12.A01
            android.widget.ListView r3 = (android.widget.ListView) r3
            boolean r0 = X.AnonymousClass000.A1X(r13)
            if (r0 != 0) goto L_0x0030
            android.view.View r0 = r4.A02
            r5 = 0
            if (r0 != 0) goto L_0x0099
            androidx.fragment.app.ListFragment.A00(r4)
            android.widget.ListView r6 = r4.A05
            android.view.LayoutInflater r1 = X.C36381kD.A0J(r4)
            r0 = 2131626250(0x7f0e090a, float:1.887973E38)
            android.view.View r1 = r1.inflate(r0, r6, r5)
            r4.A02 = r1
            r0 = 2131434592(0x7f0b1c60, float:1.8491002E38)
            android.widget.TextView r8 = X.C36391kE.A0P(r1, r0)
            r7 = 2131894513(0x7f1220f1, float:1.9423833E38)
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0 = 24
            X.AnonymousClass000.A1L(r1, r0, r5)
            X.C36381kD.A1E(r8, r4, r1, r7)
            android.view.View r1 = r4.A02
            r0 = 2131428555(0x7f0b04cb, float:1.8478758E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 48
            X.AnonymousClass3Y8.A00(r1, r4, r0)
            android.view.View r1 = r4.A02
            r0 = 2131432916(0x7f0b15d4, float:1.8487603E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 49
            X.AnonymousClass3Y8.A00(r1, r4, r0)
            android.content.Context r0 = r4.A0a()
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r0)
            android.view.View r0 = r4.A02
            r1.addView(r0)
            r0 = 0
            r6.addHeaderView(r1, r0, r2)
        L_0x0099:
            android.view.View r0 = r4.A02
            r0.setVisibility(r5)
            com.whatsapp.status.StatusesFragment.A08(r3, r4)
            return
        L_0x00a2:
            java.lang.Object r1 = r12.A00
            com.whatsapp.reactions.ReactionsBottomSheetDialogFragment r1 = (com.whatsapp.reactions.ReactionsBottomSheetDialogFragment) r1
            java.lang.Object r0 = r12.A01
            X.1u3 r0 = (X.C39871u3) r0
            int r2 = r0.A00
            com.whatsapp.WaTabLayout r1 = r1.A05
            java.util.ArrayList r0 = r1.A0h
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0030
            if (r2 < 0) goto L_0x0030
            java.util.ArrayList r0 = r1.A0h
            int r0 = r0.size()
            if (r2 >= r0) goto L_0x0030
            r1.A0N(r2)
            return
        L_0x00c4:
            java.lang.Object r0 = r12.A00
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r4 = r12.A01
            X.3IY r13 = (X.AnonymousClass3IY) r13
            java.lang.Object r3 = r0.get()
            X.2Ic r3 = (X.C43512Ic) r3
            if (r3 == 0) goto L_0x0030
            if (r13 != 0) goto L_0x00f6
            r2 = 0
        L_0x00d7:
            r0 = 1
            r1 = 0
            r3.A00(r2, r0, r1)
            if (r13 == 0) goto L_0x0853
            X.4Uq r0 = r13.A00
            if (r0 == 0) goto L_0x0853
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0853
            r3.setVisibility(r1)
            r1 = 42
            X.6ck r0 = new X.6ck
            r0.<init>(r4, r1)
            r3.setOnClickListener(r0)
            return
        L_0x00f6:
            X.4Uq r2 = r13.A00
            goto L_0x00d7
        L_0x00f9:
            java.lang.Object r5 = r12.A00
            com.whatsapp.mediaview.MediaViewFragment r5 = (com.whatsapp.mediaview.MediaViewFragment) r5
            java.lang.Object r7 = r12.A01
            com.whatsapp.reactions.ReactionsTrayViewModel r7 = (com.whatsapp.reactions.ReactionsTrayViewModel) r7
            X.3GR r13 = (X.AnonymousClass3GR) r13
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x0030
            X.3T1 r6 = r7.A0G
            X.C18740tg.A06(r6)
            boolean r0 = X.C64933Qa.A04(r6)
            if (r0 == 0) goto L_0x0126
            X.0wo r1 = r7.A05
            X.3T1 r0 = r7.A0G
            X.C36321k7.A0w(r1, r0)
            long r3 = X.AnonymousClass3T1.A05(r1, r0)
            r1 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x08ad
        L_0x0126:
            java.lang.String r0 = r13.A01
            boolean r2 = X.C36421kH.A1a(r0)
            X.1X4 r1 = r5.A0M
            java.lang.String r0 = r13.A00
            boolean r0 = r1.A0e(r6, r0, r2)
            if (r0 != 0) goto L_0x0030
            X.01I r1 = r5.A0h()
            goto L_0x055f
        L_0x013c:
            java.lang.Object r6 = r12.A00
            com.whatsapp.mediaview.MediaViewFragment r6 = (com.whatsapp.mediaview.MediaViewFragment) r6
            java.lang.Object r5 = r12.A01
            android.view.View r5 = (android.view.View) r5
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            if (r13 == 0) goto L_0x014f
            boolean r0 = r13.booleanValue()
            r4 = 1
            if (r0 != 0) goto L_0x0150
        L_0x014f:
            r4 = 0
        L_0x0150:
            r6.A1v = r4
            android.view.ViewGroup$MarginLayoutParams r3 = X.AnonymousClass000.A0a(r5)
            r2 = 0
            if (r4 == 0) goto L_0x017b
            android.content.res.Resources r1 = X.C36341k9.A0G(r6)
            r0 = 2131165289(0x7f070069, float:1.794479E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.topMargin = r0
        L_0x0166:
            r5.setLayoutParams(r3)
            X.3Qq r0 = r6.A1o
            if (r0 == 0) goto L_0x0030
            X.5NI r1 = r0.A09()
            if (r1 == 0) goto L_0x0030
            if (r4 == 0) goto L_0x0859
            r1.A08 = r2
            r1.A03()
            return
        L_0x017b:
            r3.topMargin = r2
            r3.bottomMargin = r2
            goto L_0x0166
        L_0x0180:
            java.lang.Object r0 = r12.A00
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            java.lang.Object r2 = r12.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.3Eh r0 = r0.A0b
            if (r0 == 0) goto L_0x0030
            X.C18740tg.A06(r2)
            r1 = 0
            X.3KY r0 = X.C61993Eh.A00(r0, r2)
            r0.A01(r2, r1)
            return
        L_0x0198:
            java.lang.Object r0 = r12.A00
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            java.lang.Object r2 = r12.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.3Eh r0 = r0.A0b
            if (r0 == 0) goto L_0x0030
            X.C18740tg.A06(r2)
            r1 = 0
            X.3KY r0 = X.C61993Eh.A00(r0, r2)
            r0.A00(r2, r1)
            return
        L_0x01b0:
            java.lang.Object r2 = r12.A00
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            java.lang.Object r1 = r12.A01
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0030
            X.17Y r0 = r2.A05
            r0.A02()
            X.171 r0 = r2.A0j
            java.lang.String r1 = r0.A0U(r1)
            if (r1 != 0) goto L_0x01da
            r0 = 2131889450(0x7f120d2a, float:1.9413564E38)
            java.lang.String r1 = r2.getString(r0)
        L_0x01d4:
            X.0xE r0 = r2.A0e
            r0.BNz(r2, r1)
            return
        L_0x01da:
            r0 = 2131889449(0x7f120d29, float:1.9413562E38)
            java.lang.String r1 = X.C36321k7.A0A(r2, r1, r0)
            goto L_0x01d4
        L_0x01e2:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            if (r13 == 0) goto L_0x0030
            boolean r0 = r13.booleanValue()
            if (r0 == 0) goto L_0x0204
            java.lang.Object r4 = r12.A00
            X.3fk r4 = (X.C70803fk) r4
            com.whatsapp.KeyboardPopupLayout r3 = r4.A1V
            r0 = 35
            X.3wT r2 = new X.3wT
            r2.<init>((java.lang.Object) r12, (int) r0)
            r1 = 1137180672(0x43c80000, float:400.0)
            float r0 = X.C70803fk.A00(r4)
            float r0 = r0 * r1
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
        L_0x0204:
            java.lang.Object r0 = r12.A01
            X.00r r0 = (X.C001600r) r0
            r0.A0B(r12)
            return
        L_0x020c:
            java.lang.Object r3 = r12.A00
            X.3fk r3 = (X.C70803fk) r3
            java.lang.Object r1 = r12.A01
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0030
            X.17Y r0 = r3.A1U
            r0.A02()
            X.4V6 r0 = r3.A2l
            X.171 r0 = r0.getWAContactNames()
            java.lang.String r2 = r0.A0U(r1)
            X.155 r1 = X.C70803fk.A0C(r3)
            if (r2 != 0) goto L_0x0242
            r0 = 2131889450(0x7f120d2a, float:1.9413564E38)
            java.lang.String r2 = r1.getString(r0)
        L_0x0238:
            X.0xE r1 = r3.A2E
            X.155 r0 = X.C70803fk.A0C(r3)
            r1.BNz(r0, r2)
            return
        L_0x0242:
            r0 = 2131889449(0x7f120d29, float:1.9413562E38)
            java.lang.String r2 = X.C36321k7.A0A(r1, r2, r0)
            goto L_0x0238
        L_0x024a:
            java.lang.Object r4 = r12.A00
            X.3fk r4 = (X.C70803fk) r4
            java.lang.Object r5 = r12.A01
            X.141 r5 = (X.AnonymousClass141) r5
            X.384 r13 = (X.AnonymousClass384) r13
            boolean r0 = r13.A03
            r3 = 1
            if (r0 == 0) goto L_0x02a8
            int r1 = r13.A00
            if (r1 == r3) goto L_0x0382
            r0 = 2
            if (r1 == r0) goto L_0x0382
            r0 = 5
            if (r1 == r0) goto L_0x0382
            r0 = 3
            if (r1 != r0) goto L_0x02d9
            X.3Sr r7 = r4.A2n
            X.2Ke r0 = r7.A04
            if (r0 != 0) goto L_0x027a
            X.01L r0 = r7.A0B
            X.2Ke r1 = new X.2Ke
            r1.<init>(r0)
            r7.A04 = r1
            android.widget.ListView r0 = r7.A0A
            r0.addFooterView(r1)
        L_0x027a:
            X.2Ke r6 = r7.A04
            X.11F r5 = r7.A0N
            X.31K r1 = r7.A0G
            java.util.Objects.requireNonNull(r1)
            r0 = 43
            X.3wT r2 = new X.3wT
            r2.<init>((java.lang.Object) r1, (int) r0)
            android.view.View r1 = r6.A00
            r0 = 24
            X.C48742hy.A01(r1, r6, r0)
            android.view.View r1 = r6.A01
            r0 = 17
            X.C48932iI.A00(r1, r5, r6, r2, r0)
            android.widget.TextView r1 = r6.A03
            r0 = 2131888327(0x7f1208c7, float:1.9411286E38)
            r1.setText(r0)
            X.2Ke r0 = r7.A04
            android.view.ViewGroup r1 = r0.A02
            r0 = 0
            r1.setVisibility(r0)
        L_0x02a8:
            X.3Sr r5 = r4.A2n
            boolean r0 = r13.A02
            r5.A08 = r0
            boolean r2 = r13.A01
            boolean r0 = r5.A07
            if (r2 == r0) goto L_0x02d7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "conversation/spam/"
            X.C36321k7.A1X(r0, r1, r2)
            r5.A07 = r2
            r0 = 1
        L_0x02c0:
            X.C70803fk.A0v(r4)
            if (r0 == 0) goto L_0x0030
            if (r2 != 0) goto L_0x0030
            X.1C6 r1 = r4.A54
            X.141 r0 = r4.A3Y
            X.11F r0 = r0.A0H
            X.C18740tg.A06(r0)
            r1.A08(r0, r3)
            X.C38051nd.A00(r4)
            return
        L_0x02d7:
            r0 = 0
            goto L_0x02c0
        L_0x02d9:
            r0 = 4
            if (r1 != r0) goto L_0x0303
            X.3Sr r6 = r4.A2n
            X.2Kd r0 = r6.A05
            if (r0 != 0) goto L_0x02f7
            X.01L r0 = r6.A0B
            X.2Kd r2 = new X.2Kd
            r2.<init>(r0)
            r6.A05 = r2
            X.1Ew r1 = r6.A0I
            X.3Gc r0 = r6.A0R
            r2.setup(r1, r0)
            android.widget.ListView r0 = r6.A0A
            r0.addFooterView(r2)
        L_0x02f7:
            X.2Kd r5 = r6.A05
            X.01L r2 = r6.A0B
            X.11F r1 = r6.A0N
            java.util.ArrayList r0 = r6.A06
            r5.A01(r2, r1, r0, r3)
            goto L_0x02a8
        L_0x0303:
            r0 = 6
            if (r1 != r0) goto L_0x0358
            X.3Sr r2 = r4.A2n
            java.lang.Boolean r1 = r4.A7a
            boolean r6 = r13.A01
            if (r6 == 0) goto L_0x033f
            boolean r0 = r13.A02
            X.C65593Sr.A03(r2, r5, r0)
        L_0x0313:
            r8 = 0
        L_0x0314:
            X.1o8 r7 = r2.A01
            if (r7 == 0) goto L_0x0323
            X.11F r1 = r2.A0N
            X.0wQ r0 = r2.A0D
            boolean r0 = r0.A0L()
            r7.A00(r1, r8, r0)
        L_0x0323:
            X.4UQ r0 = r2.A03
            if (r0 == 0) goto L_0x032e
            X.3BC r0 = X.C65593Sr.A00(r13, r2, r5)
            X.C65593Sr.A01(r0, r2)
        L_0x032e:
            if (r6 == 0) goto L_0x02a8
            boolean r0 = r2.A07
            if (r0 != 0) goto L_0x02a8
            X.1C6 r2 = r2.A0O
            X.11F r1 = r5.A0H
            boolean r0 = r13.A02
            r2.A03(r1, r0)
            goto L_0x02a8
        L_0x033f:
            boolean r0 = r5.A0N()
            if (r0 != 0) goto L_0x0313
            X.11F r0 = r5.A0H
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 != 0) goto L_0x0313
            if (r1 == 0) goto L_0x0353
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L_0x0313
        L_0x0353:
            r8 = 1
            X.C65593Sr.A02(r2, r5)
            goto L_0x0314
        L_0x0358:
            if (r1 != 0) goto L_0x02a8
            X.3Sr r2 = r4.A2n
            X.1o8 r0 = r2.A01
            r1 = 8
            if (r0 == 0) goto L_0x0367
            android.view.View r0 = r0.A00
            r0.setVisibility(r1)
        L_0x0367:
            X.4UQ r0 = r2.A03
            if (r0 == 0) goto L_0x036e
            r0.BKD()
        L_0x036e:
            X.2Kd r0 = r2.A05
            if (r0 == 0) goto L_0x0377
            android.view.ViewGroup r0 = r0.A02
            r0.setVisibility(r1)
        L_0x0377:
            X.2Ke r0 = r2.A04
            if (r0 == 0) goto L_0x02a8
            android.view.ViewGroup r0 = r0.A02
            r0.setVisibility(r1)
            goto L_0x02a8
        L_0x0382:
            X.3Sr r1 = r4.A2n
            boolean r0 = r13.A02
            X.C65593Sr.A03(r1, r5, r0)
            X.4UQ r0 = r1.A03
            if (r0 == 0) goto L_0x02a8
            X.3BC r0 = X.C65593Sr.A00(r13, r1, r5)
            X.C65593Sr.A01(r0, r1)
            goto L_0x02a8
        L_0x0396:
            java.lang.Object r3 = r12.A00
            X.3fk r3 = (X.C70803fk) r3
            java.lang.Object r4 = r12.A01
            X.398 r4 = (X.AnonymousClass398) r4
            X.36W r13 = (X.AnonymousClass36W) r13
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x0862
            X.36b r0 = r3.A3A
            X.3IH r6 = r0.A00
            boolean r1 = r4.A03
            if (r1 == 0) goto L_0x03b1
            boolean r2 = r4.A04
            r0 = 1
            if (r2 != 0) goto L_0x03b2
        L_0x03b1:
            r0 = 0
        L_0x03b2:
            java.lang.String r5 = "preview_load_success"
            if (r0 == 0) goto L_0x03c0
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "icebreaker_"
            java.lang.String r5 = X.AnonymousClass000.A0p(r0, r5, r2)
        L_0x03c0:
            r6.A00(r5)
            X.3Ah r8 = r13.A00
            X.C18740tg.A06(r8)
            X.36b r0 = r3.A3A
            X.1YG r7 = r0.A02
            X.11F r0 = r3.A45
            com.whatsapp.jid.UserJid r6 = X.C36401kF.A0b(r0)
            X.36c r0 = r8.A00
            java.lang.String r2 = r0.A00
            r5 = 1
            X.AnonymousClass00C.A0D(r2, r5)
            if (r6 == 0) goto L_0x03e2
            X.3QA r0 = X.AnonymousClass1YG.A00(r7, r6)
            r0.A00 = r2
        L_0x03e2:
            X.36b r0 = r3.A3A
            X.1YG r6 = r0.A02
            X.11F r0 = r3.A45
            com.whatsapp.jid.UserJid r0 = X.C222813r.A00(r0)
            r2 = 3
            X.AnonymousClass1YG.A01(r6, r0, r2)
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x0030
            java.lang.String r4 = r8.A07
            if (r4 == 0) goto L_0x04f7
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x04f7
            X.3HK r9 = r3.A3E
            boolean r0 = r9.A0E
            if (r0 == 0) goto L_0x0498
            java.util.List r6 = r8.A08
            if (r1 == 0) goto L_0x040f
            boolean r0 = r6.isEmpty()
            r2 = 1
            if (r0 == 0) goto L_0x0410
        L_0x040f:
            r2 = 0
        L_0x0410:
            int r1 = r9.A0H
            r0 = 2
            if (r1 != r0) goto L_0x04ac
            X.31Y r0 = r9.A0Q
            X.0yC r1 = r0.A00
            r0 = 2087(0x827, float:2.925E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x042e
            X.80Q r0 = r9.A09
            if (r0 == 0) goto L_0x042e
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 19
            X.C90104Zc.A00(r1, r9, r0)
        L_0x042e:
            X.80Q r1 = r9.A09
            X.C18740tg.A04(r1)
            X.3h0 r0 = new X.3h0
            r0.<init>(r9)
            r1.setData(r4, r6, r0)
            boolean r0 = r9.A0C
            if (r0 != 0) goto L_0x0479
            r9.A0C = r5
            r0 = 0
            r9.A0F = r0
            android.view.ViewGroup r0 = r9.A01
            int r1 = r0.getHeight()
            X.3AE r0 = r9.A06
            com.whatsapp.webpagepreview.WebPagePreviewView r7 = r0.A05
            X.80Q r10 = r9.A09
            X.C18740tg.A04(r10)
            android.view.View r8 = r9.A00
            X.C18740tg.A04(r8)
            X.4Yi r6 = new X.4Yi
            r6.<init>(r10, r1, r5, r9)
            r11 = 3
            X.4VG r5 = new X.4VG
            r5.<init>(r6, r7, r8, r9, r10, r11)
            android.view.ViewPropertyAnimator r1 = r8.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r4 = r1.alpha(r0)
            r0 = 100
            android.view.ViewPropertyAnimator r0 = r4.setDuration(r0)
            android.view.ViewPropertyAnimator r0 = r0.setListener(r5)
            r0.start()
        L_0x0479:
            X.3Ol r6 = r9.A0P
            X.11F r0 = r9.A0A
            java.lang.String r5 = r0.getRawString()
            java.util.Map r4 = r6.A01
            boolean r0 = r4.containsKey(r5)
            if (r0 != 0) goto L_0x0498
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.put(r5, r0)
            r0 = 0
            X.C64553Ol.A00(r6, r5, r0, r2)
        L_0x0498:
            X.36b r0 = r3.A3A
            X.1YG r2 = r0.A02
            X.11F r0 = r3.A45
            com.whatsapp.jid.UserJid r0 = X.C222813r.A00(r0)
            r1 = 1
            if (r0 == 0) goto L_0x0030
            X.3QA r0 = X.AnonymousClass1YG.A00(r2, r0)
            r0.A02 = r1
            return
        L_0x04ac:
            com.whatsapp.ctwa.icebreaker.ui.IcebreakerBubbleView r7 = r9.A08
            X.C18740tg.A04(r7)
            r0 = 10
            X.3YG r6 = new X.3YG
            r6.<init>(r9, r8, r0)
            r7.removeAllViews()
            android.view.LayoutInflater r1 = X.C36351kA.A0C(r7)
            r0 = 2131624539(0x7f0e025b, float:1.887626E38)
            android.view.View r8 = r1.inflate(r0, r7, r5)
            r0 = 2131431720(0x7f0b1128, float:1.8485177E38)
            android.widget.TextView r5 = X.C36391kE.A0O(r8, r0)
            r5.setText(r4)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131166772(0x7f070634, float:1.7947799E38)
            int r0 = X.C36441kJ.A05(r1, r0)
            r4 = 0
            if (r2 == 0) goto L_0x04df
            r0 = 0
        L_0x04df:
            r5.setPadding(r4, r4, r4, r0)
            r0 = 2131430831(0x7f0b0daf, float:1.8483374E38)
            android.view.View r1 = X.C012005e.A02(r8, r0)
            int r0 = X.C36381kD.A09(r2)
            r1.setVisibility(r0)
            r1.setOnClickListener(r6)
            r7.setVisibility(r4)
            goto L_0x0479
        L_0x04f7:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0030
            X.36b r0 = r3.A3A
            X.3IH r1 = r0.A00
            java.lang.String r0 = "no_welcome_message"
            r1.A02(r0, r2)
            X.3HK r0 = r3.A3E
            X.3Ol r2 = r0.A0P
            X.2Qr r1 = new X.2Qr
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.A03 = r0
            X.0yW r0 = r2.A00
            r0.Bly(r1)
            return
        L_0x051b:
            java.lang.Object r5 = r12.A00
            X.3fI r5 = (X.C70523fI) r5
            java.lang.Object r7 = r12.A01
            com.whatsapp.reactions.ReactionsTrayViewModel r7 = (com.whatsapp.reactions.ReactionsTrayViewModel) r7
            X.3GR r13 = (X.AnonymousClass3GR) r13
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x0030
            X.3T1 r6 = r7.A0G
            X.C18740tg.A06(r6)
            boolean r0 = X.C64933Qa.A04(r6)
            if (r0 == 0) goto L_0x0548
            X.0wo r1 = r7.A05
            X.3T1 r0 = r7.A0G
            X.C36321k7.A0w(r1, r0)
            long r3 = X.AnonymousClass3T1.A05(r1, r0)
            r1 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x08ad
        L_0x0548:
            r5.Bvv(r6)
            java.lang.String r0 = r13.A01
            boolean r2 = X.C36421kH.A1a(r0)
            X.1X4 r1 = r5.A07
            java.lang.String r0 = r13.A00
            boolean r0 = r1.A0e(r6, r0, r2)
            if (r0 != 0) goto L_0x0030
            X.155 r1 = X.C70523fI.A00(r5)
        L_0x055f:
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass3SJ.A01(r1, r0)
            return
        L_0x0565:
            java.lang.Object r3 = r12.A00
            X.1q4 r3 = (X.C38781q4) r3
            java.lang.Object r2 = r12.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0030
            X.17Y r0 = r3.A01
            r0.A02()
            X.171 r1 = r3.A06
            X.147 r0 = r3.A0A
            java.lang.String r1 = r1.A0U(r0)
            if (r1 != 0) goto L_0x0591
            r0 = 2131889450(0x7f120d2a, float:1.9413564E38)
            java.lang.String r1 = r2.getString(r0)
        L_0x058b:
            X.1Sq r0 = r3.A04
            r0.BNz(r2, r1)
            return
        L_0x0591:
            r0 = 2131889449(0x7f120d29, float:1.9413562E38)
            java.lang.String r1 = X.C36321k7.A0A(r2, r1, r0)
            goto L_0x058b
        L_0x0599:
            java.lang.Object r3 = r12.A00
            com.whatsapp.community.CommunityHomeActivity r3 = (com.whatsapp.community.CommunityHomeActivity) r3
            java.lang.Object r1 = r12.A01
            X.3H1 r1 = (X.AnonymousClass3H1) r1
            X.2rc r13 = (X.C53622rc) r13
            r3.Bnv()
            boolean r0 = r13 instanceof X.AnonymousClass2Ex
            if (r0 == 0) goto L_0x05b2
            X.2Ex r13 = (X.AnonymousClass2Ex) r13
            X.147 r0 = r3.A0l
            r1.A01(r13, r0)
            return
        L_0x05b2:
            boolean r0 = r13 instanceof X.AnonymousClass2Ez
            if (r0 == 0) goto L_0x05c0
            r1 = 2131892106(0x7f12178a, float:1.941895E38)
            r0 = 2131893491(0x7f121cf3, float:1.942176E38)
            r3.Bu2(r1, r0)
            return
        L_0x05c0:
            boolean r0 = r13 instanceof X.AnonymousClass2Ev
            if (r0 == 0) goto L_0x05d6
            X.2Ev r13 = (X.AnonymousClass2Ev) r13
            X.17Y r2 = r3.A05
            int r1 = X.C36421kH.A02(r3)
            r0 = 0
            r2.A06(r1, r0)
            X.00S r0 = r13.A00
            r0.invoke()
            return
        L_0x05d6:
            boolean r0 = r13 instanceof X.AnonymousClass2Ew
            if (r0 == 0) goto L_0x0030
            X.2Ew r13 = (X.AnonymousClass2Ew) r13
            r1.A00(r13)
            return
        L_0x05e0:
            java.lang.Object r0 = r12.A00
            X.61I r0 = (X.AnonymousClass61I) r0
            java.lang.Object r2 = r12.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            com.whatsapp.voipcalling.VoipActivityV2 r1 = r0.A00
            r0 = 1
            com.whatsapp.voipcalling.VoipActivityV2.A0o(r2, r1, r0)
            return
        L_0x05ef:
            java.lang.Object r7 = r12.A00
            com.whatsapp.reactions.ReactionsBottomSheetDialogFragment r7 = (com.whatsapp.reactions.ReactionsBottomSheetDialogFragment) r7
            java.lang.Object r1 = r12.A01
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            java.util.List r13 = (java.util.List) r13
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x0603
            r7.A1c()
            return
        L_0x0603:
            r6 = 0
            X.0ts r10 = r7.A0E
            int r8 = r13.size()
            java.lang.String[] r0 = X.C65753Ti.A03
            android.content.Context r9 = r1.getContext()
            r0 = 2131626002(0x7f0e0812, float:1.8879228E38)
            android.view.View r5 = X.C36381kD.A0K(r1, r0)
            r0 = 2131433144(0x7f0b16b8, float:1.8488065E38)
            android.widget.TextView r4 = X.C36391kE.A0O(r5, r0)
            android.content.res.Resources r3 = r9.getResources()
            r2 = 2131755298(0x7f100122, float:1.9141471E38)
            java.lang.Object[] r1 = X.AnonymousClass001.A0L()
            java.lang.String r0 = X.C65753Ti.A01(r9, r10, r8)
            r1[r6] = r0
            X.C36351kA.A16(r3, r4, r1, r2, r8)
            java.lang.String r3 = X.C65753Ti.A01(r9, r10, r8)
            android.content.res.Resources r2 = r9.getResources()
            r1 = 2131755296(0x7f100120, float:1.9141467E38)
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            r0[r6] = r3
            java.lang.String r0 = r2.getQuantityString(r1, r8, r0)
            r5.setContentDescription(r0)
            com.whatsapp.reactions.ReactionsBottomSheetDialogFragment.A03(r5, r7, r6)
            return
        L_0x064e:
            java.lang.Object r4 = r12.A00
            X.14p r4 = (X.C224914p) r4
            java.lang.Object r3 = r12.A01
            android.content.DialogInterface r13 = (android.content.DialogInterface) r13
            X.0wU r2 = r4.A04
            r1 = 40
            X.74j r0 = new X.74j
            r0.<init>(r4, r3, r1)
            r2.Bp1(r0)
            goto L_0x07aa
        L_0x0664:
            java.lang.Object r3 = r12.A00
            X.2Yd r3 = (X.C46512Yd) r3
            java.lang.Object r2 = r12.A01
            X.3KA r2 = (X.AnonymousClass3KA) r2
            android.content.DialogInterface r13 = (android.content.DialogInterface) r13
            X.2oe r0 = r2.A03
            int r1 = r0.ordinal()
            r0 = 3
            if (r1 == r0) goto L_0x069b
            r0 = 2
            if (r1 != r0) goto L_0x07aa
            com.whatsapp.newsletter.viewmodel.NewsletterListViewModel r0 = r3.A3l()
            X.3hE r0 = r0.A03
            X.00s r0 = r0.A00
            java.lang.Object r1 = r0.A04()
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x07aa
            X.1Uw r0 = r2.A02
            java.lang.Object r0 = r1.get(r0)
            X.3IZ r0 = (X.AnonymousClass3IZ) r0
            if (r0 == 0) goto L_0x07aa
            X.2La r0 = r0.A00
            X.AnonymousClass24P.A07(r0, r3)
            goto L_0x07aa
        L_0x069b:
            X.1Uw r1 = r2.A02
            com.whatsapp.newsletter.viewmodel.NewsletterListViewModel r0 = r3.A3l()
            r0.A0S(r1)
            goto L_0x07aa
        L_0x06a6:
            java.lang.Object r4 = r12.A00
            X.14p r4 = (X.C224914p) r4
            java.lang.Object r3 = r12.A01
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)
            X.0wU r2 = r4.A04
            r1 = 39
            X.74j r0 = new X.74j
            r0.<init>(r4, r3, r1)
            r2.Bp1(r0)
            return
        L_0x06bd:
            java.lang.Object r3 = r12.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r3 = (com.whatsapp.newsletter.NewsletterInfoActivity) r3
            java.lang.Object r0 = r12.A01
            X.3KA r0 = (X.AnonymousClass3KA) r0
            android.content.DialogInterface r13 = (android.content.DialogInterface) r13
            X.2oe r0 = r0.A03
            int r2 = r0.ordinal()
            r1 = 1
            r0 = 3
            if (r2 == r0) goto L_0x06f7
            r0 = 2
            if (r2 == r0) goto L_0x06f2
            if (r2 == r1) goto L_0x06e5
            r0 = 0
            if (r2 != r0) goto L_0x07aa
            androidx.appcompat.widget.SwitchCompat r0 = r3.A08
            if (r0 == 0) goto L_0x07aa
            r0.setSelected(r1)
            com.whatsapp.newsletter.NewsletterInfoActivity.A0y(r3)
            goto L_0x07aa
        L_0x06e5:
            r1 = 0
            androidx.appcompat.widget.SwitchCompat r0 = r3.A08
            if (r0 == 0) goto L_0x07aa
            r0.setSelected(r1)
            com.whatsapp.newsletter.NewsletterInfoActivity.A12(r3)
            goto L_0x07aa
        L_0x06f2:
            com.whatsapp.newsletter.NewsletterInfoActivity.A0x(r3)
            goto L_0x07aa
        L_0x06f7:
            com.whatsapp.newsletter.NewsletterInfoActivity.A11(r3)
            goto L_0x07aa
        L_0x06fc:
            java.lang.Object r0 = r12.A00
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r2 = r12.A01
            com.whatsapp.group.NonAdminGJRFragment r2 = (com.whatsapp.group.NonAdminGJRFragment) r2
            java.util.List r13 = (java.util.List) r13
            r1 = 0
            r0.setVisibility(r1)
            X.8dF r0 = r2.A01
            if (r0 == 0) goto L_0x0725
            X.AnonymousClass00C.A0B(r13)
            X.AnonymousClass00C.A0D(r13, r1)
            r0.A01 = r13
            X.8dF r0 = r2.A01
            if (r0 == 0) goto L_0x071e
            r0.A06()
            return
        L_0x071e:
            java.lang.String r0 = "nonAdminGJRAdapter"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0725:
            java.lang.String r0 = "nonAdminGJRAdapter"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x072c:
            java.lang.Object r4 = r12.A00
            com.whatsapp.group.GroupProfileEmojiEditor r4 = (com.whatsapp.group.GroupProfileEmojiEditor) r4
            java.lang.Object r3 = r12.A01
            X.7fA r3 = (X.AnonymousClass7fA) r3
            java.lang.Number r13 = (java.lang.Number) r13
            X.1Pr r2 = r4.A08
            int r1 = r13.intValue()
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            android.graphics.drawable.Drawable r1 = X.C36371kC.A0F(r0, r3, r2)
            android.widget.ImageView r0 = r4.A04
            r0.setBackground(r1)
            return
        L_0x074b:
            java.lang.Object r1 = r12.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r12.A01
            X.11F r0 = (X.AnonymousClass11F) r0
            android.content.Intent r0 = X.AnonymousClass190.A0W(r1, r0)
            r1.startActivity(r0)
            return
        L_0x075b:
            java.lang.Object r3 = r12.A00
            com.whatsapp.dialogs.DeleteOrArchiveChatDialog r3 = (com.whatsapp.dialogs.DeleteOrArchiveChatDialog) r3
            java.lang.Object r2 = r12.A01
            X.AnonymousClass00C.A0B(r2)
            r3.A1b()
            X.01I r0 = r3.A0i()
            r0.finish()
            X.0wU r1 = r3.A04
            if (r1 == 0) goto L_0x0778
            r0 = 30
            X.C81193wc.A01(r1, r2, r3, r0)
            return
        L_0x0778:
            java.lang.RuntimeException r0 = X.C36321k7.A08()
            throw r0
        L_0x077d:
            java.lang.Object r1 = r12.A00
            X.2I4 r1 = (X.AnonymousClass2I4) r1
            java.lang.Object r0 = r12.A01
            X.01L r0 = (X.AnonymousClass01L) r0
            X.2s9 r13 = (X.C53942s9) r13
            r1.A2D(r0, r13)
            return
        L_0x078b:
            java.lang.Object r3 = r12.A00
            X.2H2 r3 = (X.AnonymousClass2H2) r3
            java.lang.Object r0 = r12.A01
            X.3KA r0 = (X.AnonymousClass3KA) r0
            android.content.DialogInterface r13 = (android.content.DialogInterface) r13
            X.2oe r0 = r0.A03
            int r2 = r0.ordinal()
            r0 = 2
            if (r2 == r0) goto L_0x07b6
            r1 = 0
            if (r2 == r1) goto L_0x07b2
            r0 = 1
            if (r2 == r0) goto L_0x07ae
            r0 = 3
            if (r2 != r0) goto L_0x07aa
            X.AnonymousClass2H2.A07(r3)
        L_0x07aa:
            r13.dismiss()
            return
        L_0x07ae:
            X.AnonymousClass2H2.A09(r3, r1)
            goto L_0x07aa
        L_0x07b2:
            X.AnonymousClass2H2.A08(r3, r1)
            goto L_0x07aa
        L_0x07b6:
            X.AnonymousClass2H2.A06(r3)
            goto L_0x07aa
        L_0x07ba:
            java.lang.Object r1 = r12.A00
            com.whatsapp.conversation.ConversationEntryActionButton r1 = (com.whatsapp.conversation.ConversationEntryActionButton) r1
            java.lang.Object r0 = r12.A01
            X.3Qe[] r0 = (X.C64973Qe[]) r0
            X.3Qe r13 = (X.C64973Qe) r13
            r1.A03(r13, r0)
            return
        L_0x07c8:
            java.lang.Object r3 = r12.A00
            X.1RU r3 = (X.AnonymousClass1RU) r3
            java.lang.Object r2 = r12.A01
            android.app.Activity r2 = (android.app.Activity) r2
            r1 = 0
            java.lang.String r0 = "AccountSwitcher/abandonAddAccount"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r3.A06(r2, r0, r1)
            return
        L_0x07db:
            java.lang.Object r1 = r12.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r1 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r1
            java.lang.Object r0 = r12.A01
            X.2FE r0 = (X.AnonymousClass2FE) r0
            r2 = 1
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r1 = X.C36401kF.A0T(r1)
            X.2nq r0 = r0.A02
            r1.A0S(r0, r2)
            return
        L_0x07ee:
            java.lang.Object r1 = r12.A00
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r0 = r12.A01
            com.whatsapp.chatlock.dialogs.ClearLockedChatsDialogFragment r0 = (com.whatsapp.chatlock.dialogs.ClearLockedChatsDialogFragment) r0
            com.whatsapp.chatlock.dialogs.ClearLockedChatsDialogFragment.A03(r1, r0)
            return
        L_0x07fa:
            java.lang.Object r1 = r12.A00
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r0 = r12.A01
            com.whatsapp.chatlock.dialogs.ClearLockedChatsDialogFragment r0 = (com.whatsapp.chatlock.dialogs.ClearLockedChatsDialogFragment) r0
            com.whatsapp.chatlock.dialogs.ClearLockedChatsDialogFragment.A05(r1, r0)
            return
        L_0x0806:
            java.lang.Object r1 = r12.A00
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r0 = r12.A01
            com.whatsapp.chatlock.dialogs.ChatsAreLockedDialogFragment r0 = (com.whatsapp.chatlock.dialogs.ChatsAreLockedDialogFragment) r0
            com.whatsapp.chatlock.dialogs.ChatsAreLockedDialogFragment.A05(r1, r0)
            return
        L_0x0812:
            java.lang.Object r1 = r12.A00
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r0 = r12.A01
            com.whatsapp.chatlock.dialogs.ChatsAreLockedDialogFragment r0 = (com.whatsapp.chatlock.dialogs.ChatsAreLockedDialogFragment) r0
            com.whatsapp.chatlock.dialogs.ChatsAreLockedDialogFragment.A03(r1, r0)
            return
        L_0x081e:
            java.lang.Object r0 = r12.A00
            X.3nf r0 = (X.C75703nf) r0
            java.lang.Object r4 = r12.A01
            android.view.View r4 = (android.view.View) r4
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment r3 = r0.A00
            if (r13 == 0) goto L_0x0833
            boolean r1 = r13.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x0834
        L_0x0833:
            r0 = 0
        L_0x0834:
            r3.A0H = r0
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass000.A0a(r4)
            if (r0 == 0) goto L_0x084d
            android.content.res.Resources r1 = X.C36341k9.A0G(r3)
            r0 = 2131165289(0x7f070069, float:1.794479E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.topMargin = r0
        L_0x0849:
            r4.setLayoutParams(r2)
            return
        L_0x084d:
            r0 = 0
            r2.topMargin = r0
            r2.bottomMargin = r0
            goto L_0x0849
        L_0x0853:
            r0 = 8
            r3.setVisibility(r0)
            return
        L_0x0859:
            r0 = 1
            r1.A08 = r0
            r0 = 3000(0xbb8, float:4.204E-42)
            r1.A09(r0)
            return
        L_0x0862:
            X.C70803fk.A0k(r3)
            X.36b r0 = r3.A3A
            X.1YG r2 = r0.A02
            X.11F r0 = r3.A45
            com.whatsapp.jid.UserJid r1 = X.C36401kF.A0b(r0)
            r0 = 12
            X.AnonymousClass1YG.A01(r2, r1, r0)
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x088c
            X.3HK r0 = r3.A3E
            X.3Ol r2 = r0.A0P
            X.2Qr r1 = new X.2Qr
            r1.<init>()
            java.lang.Integer r0 = X.C36381kD.A0m()
            r1.A03 = r0
            X.0yW r0 = r2.A00
            r0.Bly(r1)
        L_0x088c:
            X.36b r0 = r3.A3A
            X.3IH r5 = r0.A00
            boolean r0 = r4.A03
            java.lang.String r4 = "preview_load_fail"
            r3 = 1029386189(0x3d5b2fcd, float:0.053512383)
            r2 = 3
            if (r0 == 0) goto L_0x08a4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "icebreaker_"
            java.lang.String r4 = X.AnonymousClass000.A0p(r0, r4, r1)
        L_0x08a4:
            r5.A02(r4, r2)
            X.0ze r0 = r5.A00
            r0.markerPoint(r3, r4)
            return
        L_0x08ad:
            X.1hi r0 = r7.A0C
            X.C36331k8.A13(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UW.BTH(java.lang.Object):void");
    }
}
