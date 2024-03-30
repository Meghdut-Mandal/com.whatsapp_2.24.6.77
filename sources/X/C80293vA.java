package X;

/* renamed from: X.3vA  reason: invalid class name and case insensitive filesystem */
public class C80293vA implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C80293vA(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(C19770wU r1, Object obj, Object obj2, int i) {
        r1.Boy(new C80293vA(obj, obj2, i));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x05ac  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x066d  */
    /* JADX WARNING: Removed duplicated region for block: B:548:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02af  */
    public final void run() {
        /*
            r107 = this;
            r4 = r107
            int r0 = r4.A02
            switch(r0) {
                case 0: goto L_0x002e;
                case 1: goto L_0x006e;
                case 2: goto L_0x0840;
                case 3: goto L_0x085a;
                case 4: goto L_0x0867;
                case 5: goto L_0x0879;
                case 6: goto L_0x0098;
                case 7: goto L_0x00d6;
                case 8: goto L_0x00f8;
                case 9: goto L_0x088c;
                case 10: goto L_0x0122;
                case 11: goto L_0x08a2;
                case 12: goto L_0x08bb;
                case 13: goto L_0x0142;
                case 14: goto L_0x0179;
                case 15: goto L_0x08cd;
                case 16: goto L_0x0a33;
                case 17: goto L_0x0a8f;
                case 18: goto L_0x0aee;
                case 19: goto L_0x02f3;
                case 20: goto L_0x0afc;
                case 21: goto L_0x030e;
                case 22: goto L_0x0b08;
                case 23: goto L_0x0007;
                case 24: goto L_0x0007;
                case 25: goto L_0x0389;
                case 26: goto L_0x03ab;
                case 27: goto L_0x03dc;
                case 28: goto L_0x0bcf;
                case 29: goto L_0x0bdb;
                case 30: goto L_0x0bf5;
                case 31: goto L_0x0c03;
                case 32: goto L_0x0c12;
                case 33: goto L_0x0c1e;
                case 34: goto L_0x0c2a;
                case 35: goto L_0x0c35;
                case 36: goto L_0x0c40;
                case 37: goto L_0x0c4f;
                case 38: goto L_0x0c62;
                case 39: goto L_0x0410;
                case 40: goto L_0x0c75;
                case 41: goto L_0x0c89;
                case 42: goto L_0x0c95;
                case 43: goto L_0x0786;
                case 44: goto L_0x07a8;
                case 45: goto L_0x0ca6;
                case 46: goto L_0x0ccb;
                case 47: goto L_0x0ce4;
                case 48: goto L_0x0cf0;
                case 49: goto L_0x0812;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r4.A00
            com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment r3 = (com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment) r3
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r3.A0i
            if (r0 != 0) goto L_0x002d
            boolean r0 = r3.A0a
            if (r0 != 0) goto L_0x002d
            r0 = 1
            r1.setEnabled(r0)
            r0 = 2131894457(0x7f1220b9, float:1.942372E38)
            java.lang.String r2 = X.C36421kH.A0a(r3, r0)
            X.17Y r1 = r3.A00
            if (r1 == 0) goto L_0x083b
            r0 = 0
            r1.A0F(r2, r0)
            r3.A1c()
        L_0x002d:
            return
        L_0x002e:
            java.lang.Object r3 = r4.A00
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            java.lang.Object r4 = r4.A01
            X.1LV r1 = r3.A0c
            X.147 r0 = r3.A1Y
            X.147 r0 = r1.A02(r0)
            r3.A1Z = r0
            if (r0 == 0) goto L_0x002d
            X.141 r5 = X.AnonymousClass22g.A07(r3, r0)
            X.1LV r2 = r3.A0c
            X.147 r1 = r3.A1Z
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.17d r0 = r2.A08
            java.util.HashSet r0 = r0.A02(r1)
            int r6 = r0.size()
            X.4Pa r2 = r3.A0a
            X.147 r1 = r3.A1Z
            r0 = 2
            X.3Eh r0 = r2.B3v(r3, r1, r0)
            r3.A0b = r0
            X.17Y r0 = r3.A05
            r7 = 12
            X.3vW r2 = new X.3vW
            r2.<init>(r3, r4, r5, r6, r7)
            r0.A0H(r2)
            return
        L_0x006e:
            java.lang.Object r3 = r4.A00
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            java.lang.Object r2 = r4.A01
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            X.0yC r1 = r3.A0D
            r0 = 1071(0x42f, float:1.501E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x002d
            if (r2 == 0) goto L_0x002d
            boolean r0 = r2 instanceof X.AnonymousClass144
            if (r0 == 0) goto L_0x002d
            X.17X r0 = r3.A0M
            X.144 r2 = (X.AnonymousClass144) r2
            boolean r0 = r0.A0F(r2)
            if (r0 != 0) goto L_0x002d
            X.1eC r2 = r3.A1j
            r1 = 4
            r0 = 0
            r2.A00(r1, r0)
            return
        L_0x0098:
            java.lang.Object r5 = r4.A00
            X.9j8 r5 = (X.C201239j8) r5
            java.lang.Object r1 = r4.A01
            java.util.Set r1 = (java.util.Set) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            X.14u r0 = r5.A00
            if (r0 == 0) goto L_0x00ab
            r0.Bnv()
        L_0x00ab:
            java.util.Iterator r3 = r1.iterator()
        L_0x00af:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r3.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r2 = r0.second
            java.lang.Number r2 = (java.lang.Number) r2
            r1 = -1
            if (r2 == 0) goto L_0x00ce
            int r0 = r2.intValue()
            if (r0 != r1) goto L_0x00ce
            java.lang.Runnable r0 = r5.A03
            r0.run()
            goto L_0x00af
        L_0x00ce:
            int r0 = X.C36411kG.A07(r2)
            X.C201239j8.A00(r5, r0)
            goto L_0x00af
        L_0x00d6:
            java.lang.Object r3 = r4.A00
            com.whatsapp.group.newgroup.NewGroup r3 = (com.whatsapp.group.newgroup.NewGroup) r3
            java.lang.Object r1 = r4.A01
            X.147 r1 = (X.AnonymousClass147) r1
            X.12q r0 = r3.A0I
            boolean r0 = r0.A0M(r1)
            if (r0 == 0) goto L_0x002d
            r3.Bnv()
            boolean r0 = r3.BLh()
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "checkIfJidCreatedAndFinishIfNecessary/finishing"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.group.newgroup.NewGroup.A0J(r3, r1)
            goto L_0x011e
        L_0x00f8:
            java.lang.Object r0 = r4.A00
            X.4YE r0 = (X.AnonymousClass4YE) r0
            java.lang.Object r2 = r4.A01
            X.147 r2 = (X.AnonymousClass147) r2
            java.lang.Object r3 = r0.A00
            com.whatsapp.group.newgroup.NewGroup r3 = (com.whatsapp.group.newgroup.NewGroup) r3
            r3.Bnv()
            boolean r0 = r3.BLh()
            if (r0 != 0) goto L_0x002d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "newgroup/onConversationChanged/ok/"
            r1.append(r0)
            java.util.concurrent.atomic.AtomicReference r0 = r3.A0t
            X.C36321k7.A1N(r0, r1)
            com.whatsapp.group.newgroup.NewGroup.A0J(r3, r2)
        L_0x011e:
            r3.finish()
            return
        L_0x0122:
            java.lang.Object r3 = r4.A00
            X.2Dz r3 = (X.AnonymousClass2Dz) r3
            java.lang.Object r2 = r4.A01
            java.lang.ref.WeakReference r0 = r3.A05
            java.lang.Object r1 = r0.get()
            X.2EH r1 = (X.AnonymousClass2EH) r1
            if (r1 == 0) goto L_0x002d
            boolean r0 = X.C36431kI.A1Y(r3)
            if (r0 != 0) goto L_0x002d
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            X.00s r0 = r1.A03
            r0.A0C(r2)
            return
        L_0x0142:
            java.lang.Object r2 = r4.A00
            com.whatsapp.identity.IdentityVerificationActivity r2 = (com.whatsapp.identity.IdentityVerificationActivity) r2
            java.lang.Object r0 = r4.A01
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            com.whatsapp.jid.UserJid r1 = r0.userJid
            X.141 r0 = r2.A0F
            com.whatsapp.jid.Jid r0 = X.C36431kI.A0h(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002d
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x002d
            boolean r0 = X.C36411kG.A1X(r2)
            if (r0 != 0) goto L_0x016b
            android.widget.ProgressBar r1 = r2.A03
            r0 = 8
            r1.setVisibility(r0)
        L_0x016b:
            r1 = 0
            r2.A0D = r1
            X.3Kc r0 = r2.A0K
            r0.A0A = r1
            r0 = 0
            r2.A00 = r0
            com.whatsapp.identity.IdentityVerificationActivity.A0I(r2)
            return
        L_0x0179:
            java.lang.Object r2 = r4.A00
            com.whatsapp.identity.IdentityVerificationActivity r2 = (com.whatsapp.identity.IdentityVerificationActivity) r2
            java.lang.Object r4 = r4.A01
            java.lang.Number r4 = (java.lang.Number) r4
            boolean r0 = X.C36411kG.A1X(r2)
            if (r0 == 0) goto L_0x0247
            int r6 = r4.intValue()
            java.lang.String r7 = ""
            r5 = 1
            if (r6 == r5) goto L_0x021c
            r0 = 0
            if (r6 == r0) goto L_0x0202
            r0 = 2
            if (r6 == r0) goto L_0x01f7
            r8 = r7
        L_0x0197:
            java.lang.Integer r0 = X.C023109s.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x01f3
            X.3AX r0 = r2.A0J
            com.airbnb.lottie.LottieAnimationView r3 = r0.A01
            r1 = 0
            X.4VH r0 = new X.4VH
            r0.<init>(r2, r7, r8, r1)
            r3.A05(r0)
        L_0x01ac:
            r3 = 0
            r1 = 8
            if (r6 == r5) goto L_0x01d6
            if (r6 == r3) goto L_0x0cfe
            r0 = 2
            if (r6 != r0) goto L_0x002d
            X.3AX r0 = r2.A0J
            com.airbnb.lottie.LottieAnimationView r0 = r0.A00
            r0.setVisibility(r1)
            X.3AX r0 = r2.A0J
            com.airbnb.lottie.LottieAnimationView r0 = r0.A01
            r0.setVisibility(r1)
            X.3AX r0 = r2.A0J
            com.whatsapp.WaImageView r0 = r0.A05
            r0.setVisibility(r3)
            X.3AX r0 = r2.A0J
            com.whatsapp.WaImageView r1 = r0.A05
            r0 = 2131234338(0x7f080e22, float:1.8084839E38)
        L_0x01d2:
            r1.setImageResource(r0)
            return
        L_0x01d6:
            X.3AX r0 = r2.A0J
            com.airbnb.lottie.LottieAnimationView r0 = r0.A00
            r0.setVisibility(r1)
            X.3AX r0 = r2.A0J
            com.airbnb.lottie.LottieAnimationView r0 = r0.A01
            r0.setVisibility(r1)
            X.3AX r0 = r2.A0J
            com.whatsapp.WaImageView r0 = r0.A05
            r0.setVisibility(r3)
            X.3AX r0 = r2.A0J
            com.whatsapp.WaImageView r1 = r0.A05
            r0 = 2131234215(0x7f080da7, float:1.808459E38)
            goto L_0x01d2
        L_0x01f3:
            com.whatsapp.identity.IdentityVerificationActivity.A0K(r2, r7, r8)
            goto L_0x01ac
        L_0x01f7:
            r0 = 2131895584(0x7f122520, float:1.9426005E38)
            java.lang.String r7 = r2.getString(r0)
            r0 = 2131895583(0x7f12251f, float:1.9426003E38)
            goto L_0x0226
        L_0x0202:
            r0 = 2131895589(0x7f122525, float:1.9426015E38)
            java.lang.String r7 = r2.getString(r0)
            X.0ts r3 = r2.A00
            long r0 = X.C36431kI.A08(r2)
            java.lang.String r1 = X.AnonymousClass3UM.A00(r3, r0)
            r0 = 2131895588(0x7f122524, float:1.9426013E38)
            java.lang.String r8 = X.C36351kA.A0w(r2, r1, r5, r0)
            goto L_0x0197
        L_0x021c:
            r0 = 2131895587(0x7f122523, float:1.9426011E38)
            java.lang.String r7 = r2.getString(r0)
            r0 = 2131895586(0x7f122522, float:1.942601E38)
        L_0x0226:
            java.lang.String r8 = r2.getString(r0)
            X.3AX r0 = r2.A0J
            com.whatsapp.TextEmojiLabel r3 = r0.A04
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            r0 = -2
            r1.height = r0
            r3.setLayoutParams(r1)
            r0 = 0
            r3.setMinHeight(r0)
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0X(r2)
            int r0 = r0.heightPixels
            r3.setMaxHeight(r0)
            goto L_0x0197
        L_0x0247:
            int r5 = r2.A00
            r0 = 2131435099(0x7f0b1e5b, float:1.849203E38)
            com.whatsapp.TextEmojiLabel r3 = X.C36421kH.A0I(r2, r0)
            r6 = 0
            r3.setFocusable(r6)
            X.171 r1 = r2.A09
            X.141 r0 = r2.A0F
            java.lang.String r0 = X.C36381kD.A0v(r1, r0)
            java.lang.String r9 = android.text.Html.escapeHtml(r0)
            X.19l r0 = r2.A0N
            X.0v0 r0 = r0.A01
            boolean r0 = r0.A2H()
            if (r0 != 0) goto L_0x02ed
            if (r5 > 0) goto L_0x02ed
            X.0xT r1 = r2.A0Q
            java.lang.String r0 = "28030015"
        L_0x0270:
            java.lang.String r8 = r1.A05(r0)
            X.36a r0 = r2.A0D
            X.3Fv r0 = r0.A01
            r5 = 1
            boolean r7 = X.AnonymousClass000.A1V(r0)
            X.0wQ r1 = r2.A02
            X.141 r0 = r2.A0F
            X.11F r0 = r0.A0H
            r1.A0M(r0)
            X.18y r1 = r2.A0A
            X.141 r0 = r2.A0F
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0l(r0)
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x02c8
            r1 = 2131895590(0x7f122526, float:1.9426017E38)
        L_0x0297:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r6] = r8
        L_0x029b:
            java.lang.String r0 = r2.getString(r1, r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            com.whatsapp.identity.IdentityVerificationActivity.A0F(r0, r3, r2)
            r0 = 2131435100(0x7f0b1e5c, float:1.8492033E38)
            android.widget.ImageView r3 = X.C36411kG.A0Q(r2, r0)
            if (r3 == 0) goto L_0x002d
            r2 = 0
            r1 = 2131233892(0x7f080c64, float:1.8083934E38)
            java.lang.Integer r0 = X.C023109s.A01
            if (r4 != r0) goto L_0x02c0
            r2 = 8
        L_0x02b9:
            r3.setImageResource(r1)
            r3.setVisibility(r2)
            return
        L_0x02c0:
            java.lang.Integer r0 = X.C023109s.A0C
            if (r4 != r0) goto L_0x02b9
            r1 = 2131233894(0x7f080c66, float:1.8083938E38)
            goto L_0x02b9
        L_0x02c8:
            X.0wQ r1 = r2.A02
            X.141 r0 = r2.A0F
            boolean r0 = X.C36361kB.A1X(r1, r0)
            if (r0 == 0) goto L_0x02de
            X.0yC r0 = r2.A0D
            boolean r0 = X.C36391kE.A1X(r0)
            if (r0 == 0) goto L_0x02de
            r1 = 2131891083(0x7f12138b, float:1.9416876E38)
            goto L_0x0297
        L_0x02de:
            r1 = 2131895593(0x7f122529, float:1.9426023E38)
            if (r7 == 0) goto L_0x02e6
            r1 = 2131895592(0x7f122528, float:1.9426021E38)
        L_0x02e6:
            java.lang.Object[] r0 = X.C36411kG.A1b(r9)
            r0[r5] = r8
            goto L_0x029b
        L_0x02ed:
            X.0xT r1 = r2.A0Q
            java.lang.String r0 = "26000361"
            goto L_0x0270
        L_0x02f3:
            java.lang.Object r3 = r4.A00
            com.whatsapp.inappsupport.ui.SupportAiViewModel r3 = (com.whatsapp.inappsupport.ui.SupportAiViewModel) r3
            java.lang.Object r2 = r4.A01
            r1 = 0
            X.AnonymousClass00C.A0D(r3, r1)
            X.1Cf r0 = r3.A07
            r0.unregisterObserver(r2)
            boolean r0 = com.whatsapp.inappsupport.ui.SupportAiViewModel.A01(r3, r1)
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "SupportAiViewModel/conversationObserver, unexpectedly did not redirect"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x030e:
            java.lang.Object r6 = r4.A00
            X.3n7 r6 = (X.C75373n7) r6
            java.lang.Object r4 = r4.A01
            X.1RT r4 = (X.AnonymousClass1RT) r4
            r0 = 1
            X.AnonymousClass00C.A0D(r4, r0)
            java.lang.String r5 = "null cannot be cast to non-null type com.whatsapp.inflater.WaAsyncLayoutInflaterImpl"
            r3 = 0
            X.C18740tg.A00()
            java.lang.String r0 = r4.A05
            r6.A00 = r0
            X.1RO r0 = r4.A04
            java.lang.ref.WeakReference r7 = X.AnonymousClass001.A0F(r0)
            java.lang.Object r0 = r7.get()     // Catch:{ RuntimeException -> 0x035b }
            boolean r0 = r0 instanceof X.AnonymousClass1RO     // Catch:{ RuntimeException -> 0x035b }
            if (r0 == 0) goto L_0x0361
            java.lang.Object r0 = r7.get()     // Catch:{ RuntimeException -> 0x035b }
            X.AnonymousClass00C.A0E(r0, r5)     // Catch:{ RuntimeException -> 0x035b }
            X.1RO r0 = (X.AnonymousClass1RO) r0     // Catch:{ RuntimeException -> 0x035b }
            X.00T r0 = r0.A01     // Catch:{ RuntimeException -> 0x035b }
            java.lang.Object r2 = X.C36381kD.A0p(r0)     // Catch:{ RuntimeException -> 0x035b }
            android.view.LayoutInflater r2 = (android.view.LayoutInflater) r2     // Catch:{ RuntimeException -> 0x035b }
            int r1 = r4.A00     // Catch:{ RuntimeException -> 0x035b }
            android.view.ViewGroup r0 = r4.A02     // Catch:{ RuntimeException -> 0x035b }
            android.view.View r2 = r2.inflate(r1, r0, r3)     // Catch:{ RuntimeException -> 0x035b }
            r4.A01 = r2     // Catch:{ RuntimeException -> 0x035b }
            boolean r0 = r4.A06     // Catch:{ RuntimeException -> 0x035b }
            if (r0 == 0) goto L_0x0361
            if (r2 == 0) goto L_0x0361
            java.util.HashMap r1 = r6.A01     // Catch:{ RuntimeException -> 0x035b }
            int r0 = r4.A00     // Catch:{ RuntimeException -> 0x035b }
            X.C36331k8.A1Q(r2, r1, r0)     // Catch:{ RuntimeException -> 0x035b }
            goto L_0x0361
        L_0x035b:
            r1 = move-exception
            java.lang.String r0 = "Failed to inflate resource in the background! Retrying on the UI thread"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0361:
            r0 = 0
            r6.A00 = r0
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x002d
            java.lang.Object r0 = r7.get()
            boolean r0 = r0 instanceof X.AnonymousClass1RO
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r7.get()
            X.AnonymousClass00C.A0E(r0, r5)
            X.1RO r0 = (X.AnonymousClass1RO) r0
            X.00T r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            android.os.Handler r0 = (android.os.Handler) r0
            android.os.Message r0 = android.os.Message.obtain(r0, r3, r4)
            r0.sendToTarget()
            return
        L_0x0389:
            java.lang.Object r0 = r4.A00
            X.4YE r0 = (X.AnonymousClass4YE) r0
            java.lang.Object r2 = r4.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            java.lang.Object r3 = r0.A00
            X.14u r3 = (X.C225314u) r3
            boolean r0 = r3.BLh()
            if (r0 != 0) goto L_0x002d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ViewGroupInviteActivity/onConversationChanged/ok/"
            X.C36321k7.A1K(r2, r0, r1)
            android.content.Intent r1 = X.C36371kC.A0D(r3, r2)
            java.lang.String r0 = "ViewGroupInviteActivity:onConversationChanged"
            goto L_0x03d4
        L_0x03ab:
            java.lang.Object r0 = r4.A00
            X.4YE r0 = (X.AnonymousClass4YE) r0
            java.lang.Object r2 = r4.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            java.lang.Object r3 = r0.A00
            com.whatsapp.invites.ViewGroupInviteActivity r3 = (com.whatsapp.invites.ViewGroupInviteActivity) r3
            X.12q r0 = r3.A0B
            boolean r0 = r0.A0M(r2)
            if (r0 == 0) goto L_0x002d
            boolean r0 = r3.BLh()
            if (r0 != 0) goto L_0x002d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ViewGroupInviteActivity/onConversationsListChanged/ok/"
            X.C36321k7.A1K(r2, r0, r1)
            android.content.Intent r1 = X.C36371kC.A0D(r3, r2)
            java.lang.String r0 = "ViewGroupInviteActivity:onConversationsListChanged"
        L_0x03d4:
            X.AnonymousClass3M9.A01(r1, r0)
            r0 = 1
            r3.A33(r1, r0)
            return
        L_0x03dc:
            java.lang.Object r0 = r4.A00
            X.3mq r0 = (X.C75203mq) r0
            java.lang.Object r3 = r4.A01
            byte[] r3 = (byte[]) r3
            com.whatsapp.invites.ViewGroupInviteActivity r2 = r0.A00
            boolean r0 = r2.BLh()
            if (r0 != 0) goto L_0x002d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ViewGroupInviteActivity/fetchGroupProfilePicture: "
            r1.append(r0)
            if (r3 != 0) goto L_0x040a
            java.lang.String r0 = "null"
        L_0x03f9:
            X.C36321k7.A1N(r0, r1)
            if (r3 == 0) goto L_0x002d
            r1 = 0
            int r0 = r3.length
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r3, r1, r0)
            X.3HI r0 = r2.A0F
            r0.A00(r1)
            return
        L_0x040a:
            int r0 = r3.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x03f9
        L_0x0410:
            java.lang.Object r0 = r4.A00
            r17 = r0
            r0 = r17
            X.4xN r0 = (X.C101334xN) r0
            r17 = r0
            java.lang.Object r3 = r4.A01
            X.6Wx r3 = (X.C133136Wx) r3
            X.1E3 r4 = r0.A0S
            X.68C r0 = r0.A0f
            r106 = r0
            r0 = r17
            X.6Fp r0 = r0.A0e
            r16 = r0
            monitor-enter(r16)
            boolean r2 = r0.A0G     // Catch:{ all -> 0x0d90 }
            monitor-exit(r16)
            r1 = 0
            r0 = r106
            X.AnonymousClass00C.A0D(r0, r1)
            int r1 = r3.A01
            boolean r12 = r3.A03()
            r0 = 23
            if (r12 != 0) goto L_0x048b
            if (r1 == r0) goto L_0x0491
            r6 = 0
        L_0x0441:
            r0 = r17
            X.1Dw r0 = r0.A0a
            r18 = r0
            r0 = r17
            X.6Fk r0 = r0.A0j
            r105 = r0
            long r2 = r105.A05()
            double r4 = (double) r2
            r0 = r106
            int r0 = r0.A05
            r104 = r0
            r0 = r17
            int r3 = r0.A07
            r0 = 11
            if (r3 == r0) goto L_0x0470
            r0 = 13
            if (r3 == r0) goto L_0x0489
            switch(r3) {
                case 1: goto L_0x0481;
                case 2: goto L_0x0483;
                case 3: goto L_0x0485;
                case 4: goto L_0x0487;
                case 5: goto L_0x0470;
                case 6: goto L_0x0470;
                case 7: goto L_0x0470;
                default: goto L_0x0467;
            }
        L_0x0467:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaDownload/downloadOriginTypeToMediaOriginType/invalid downloadOriginType = "
            X.C36321k7.A1S(r0, r2, r3)
        L_0x0470:
            r8 = 0
        L_0x0471:
            r0 = r17
            int r0 = r0.A14
            boolean r26 = X.AnonymousClass000.A1P(r0)
            r0 = 14
            boolean r11 = X.AnonymousClass000.A1S(r1, r0)
            monitor-enter(r18)
            goto L_0x04d5
        L_0x0481:
            r8 = 1
            goto L_0x0471
        L_0x0483:
            r8 = 2
            goto L_0x0471
        L_0x0485:
            r8 = 3
            goto L_0x0471
        L_0x0487:
            r8 = 4
            goto L_0x0471
        L_0x0489:
            r8 = 7
            goto L_0x0471
        L_0x048b:
            if (r1 == r0) goto L_0x0491
            r20 = 0
            if (r2 == 0) goto L_0x0493
        L_0x0491:
            r20 = 1
        L_0x0493:
            r0 = r106
            boolean r2 = r0.A0b
            int r3 = r0.A05
            r0 = 2
            if (r3 != r0) goto L_0x04a0
            r21 = 1
            if (r20 == 0) goto L_0x04a2
        L_0x04a0:
            r21 = 0
        L_0x04a2:
            X.12q r4 = r4.A00
            r0 = r106
            X.11F r0 = r0.A08
            boolean r24 = r4.A0O(r0)
            r0 = r106
            boolean r4 = r0.A0a
            java.lang.String r5 = r0.A0J
            X.1Gl r0 = r0.A0A
            boolean r0 = X.AnonymousClass1Ax.A04(r0)
            if (r0 == 0) goto L_0x04c4
            if (r5 == 0) goto L_0x04c4
            boolean r0 = X.AnonymousClass1GX.A0b(r5)
            r23 = 1
            if (r0 != 0) goto L_0x04c6
        L_0x04c4:
            r23 = 0
        L_0x04c6:
            X.3KH r6 = new X.3KH
            r18 = r6
            r19 = r3
            r22 = r2
            r25 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0441
        L_0x04d5:
            long r24 = X.C24811Dw.A01(r18)     // Catch:{ all -> 0x0d8d }
            int r10 = X.C24811Dw.A00(r18)     // Catch:{ all -> 0x0d8d }
            r0 = r18
            X.1E0 r9 = r0.A01     // Catch:{ all -> 0x0d8d }
            r20 = r9
            r21 = r104
            r22 = r10
            r23 = r8
            X.9iZ r7 = r20.A01(r21, r22, r23, r24, r26)     // Catch:{ all -> 0x0d8d }
            long r0 = r7.A00     // Catch:{ all -> 0x0d8d }
            double r2 = (double) r0     // Catch:{ all -> 0x0d8d }
            double r2 = r2 + r4
            long r0 = (long) r2     // Catch:{ all -> 0x0d8d }
            r7.A00 = r0     // Catch:{ all -> 0x0d8d }
            if (r12 == 0) goto L_0x04fd
            long r0 = r7.A02     // Catch:{ all -> 0x0d8d }
            r2 = 1
            long r0 = r0 + r2
            r7.A02 = r0     // Catch:{ all -> 0x0d8d }
        L_0x04fd:
            r19 = r9
            r20 = r7
            r19.A02(r20, r21, r22, r23, r24, r26)     // Catch:{ all -> 0x0d8d }
            if (r6 == 0) goto L_0x06fe
            r0 = r18
            X.1Dz r0 = r0.A02     // Catch:{ all -> 0x0d8d }
            X.1Dx r0 = r0.A01     // Catch:{ all -> 0x0d8d }
            r103 = r0
            X.3S8 r37 = r103.A01()     // Catch:{ all -> 0x0d8d }
            r0 = 1
            r21 = 1
            if (r8 == r0) goto L_0x0542
            r0 = 2
            if (r8 == r0) goto L_0x0522
            r0 = 3
            if (r8 == r0) goto L_0x0554
            r0 = 4
            if (r8 == r0) goto L_0x0554
            goto L_0x05a7
        L_0x0522:
            boolean r0 = r6.A01     // Catch:{ all -> 0x0d8d }
            r39 = 0
            if (r0 == 0) goto L_0x0534
            r0 = r37
            long r2 = r0.A0C     // Catch:{ all -> 0x0d8d }
            long r2 = r2 + r21
            r38 = -33554433(0xfffffffffdffffff, float:-4.2535293E37)
            r0 = 0
            goto L_0x054f
        L_0x0534:
            r0 = r37
            long r4 = r0.A0F     // Catch:{ all -> 0x0d8d }
            long r4 = r4 + r21
            r38 = -134217729(0xfffffffff7ffffff, float:-1.0384593E34)
            r0 = 0
            r2 = 0
            goto L_0x0551
        L_0x0542:
            r39 = 0
            r0 = r37
            long r0 = r0.A0A     // Catch:{ all -> 0x0d8d }
            long r0 = r0 + r21
            r38 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2 = 0
        L_0x054f:
            r4 = 0
        L_0x0551:
            r7 = 0
            goto L_0x0565
        L_0x0554:
            r39 = 0
            r0 = r37
            long r7 = r0.A0H     // Catch:{ all -> 0x0d8d }
            long r7 = r7 + r21
            r38 = -536870913(0xffffffffdfffffff, float:-3.6893486E19)
            r0 = 0
            r2 = 0
            r4 = 0
        L_0x0565:
            r41 = 0
            r43 = 0
            r45 = 0
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r57 = 0
            r59 = 0
            r61 = 0
            r63 = 0
            r65 = 0
            r67 = 0
            r69 = 0
            r71 = 0
            r73 = 0
            r75 = 0
            r77 = 0
            r79 = 0
            r81 = 0
            r83 = 0
            r87 = 0
            r91 = 0
            r95 = 0
            r99 = 0
            r101 = 0
            r85 = r0
            r89 = r2
            r93 = r4
            r97 = r7
            X.3S8 r37 = X.AnonymousClass3S8.A00(r37, r38, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79, r81, r83, r85, r87, r89, r91, r93, r95, r97, r99, r101)     // Catch:{ all -> 0x0d8d }
        L_0x05a7:
            int r1 = r6.A00     // Catch:{ all -> 0x0d8d }
            r0 = 2
            if (r1 == r0) goto L_0x066d
            r0 = 3
            if (r1 == r0) goto L_0x0639
            r0 = 4
            if (r1 == r0) goto L_0x060f
            r0 = 5
            if (r1 == r0) goto L_0x060f
            r0 = 8
            if (r1 == r0) goto L_0x05cb
            r0 = 11
            if (r1 != r0) goto L_0x06f6
            r39 = 0
            r0 = r37
            long r0 = r0.A06     // Catch:{ all -> 0x0d8d }
            long r35 = r0 + r21
            r38 = -1048577(0xffffffffffefffff, float:NaN)
            r19 = 0
            goto L_0x061c
        L_0x05cb:
            boolean r2 = r6.A03     // Catch:{ all -> 0x0d8d }
            r0 = r37
            long r0 = r0.A09     // Catch:{ all -> 0x0d8d }
            r33 = r0
            if (r2 == 0) goto L_0x05d7
            long r33 = r0 + r21
        L_0x05d7:
            r2 = 111(0x6f, float:1.56E-43)
            r0 = r37
            long r0 = r0.A03     // Catch:{ all -> 0x0d8d }
            r31 = r0
            if (r10 != r2) goto L_0x05e3
            long r31 = r0 + r21
        L_0x05e3:
            r2 = 1
            r0 = r37
            long r0 = r0.A04     // Catch:{ all -> 0x0d8d }
            r29 = r0
            if (r10 != r2) goto L_0x05ee
            long r29 = r0 + r21
        L_0x05ee:
            r0 = r37
            long r0 = r0.A02     // Catch:{ all -> 0x0d8d }
            long r27 = r0 + r21
            r39 = 0
            r38 = -237569(0xfffffffffffc5fff, float:NaN)
            r0 = 0
            r25 = 0
            r2 = 0
            r23 = 0
            r4 = 0
            r6 = 0
            r14 = 0
            r12 = 0
            r10 = 0
            r8 = 0
            goto L_0x06b0
        L_0x060f:
            r39 = 0
            r0 = r37
            long r0 = r0.A00     // Catch:{ all -> 0x0d8d }
            long r19 = r0 + r21
            r38 = -524289(0xfffffffffff7ffff, float:NaN)
            r35 = 0
        L_0x061c:
            r0 = 0
            r25 = 0
            r2 = 0
            r23 = 0
            r4 = 0
            r6 = 0
            r14 = 0
            r12 = 0
            r10 = 0
            r8 = 0
            r27 = 0
            r31 = 0
            r29 = 0
            r33 = 0
            goto L_0x06b4
        L_0x0639:
            boolean r1 = r6.A06     // Catch:{ all -> 0x0d8d }
            r0 = r37
            long r8 = r0.A0V     // Catch:{ all -> 0x0d8d }
            if (r1 == 0) goto L_0x0643
            long r8 = r8 + r21
        L_0x0643:
            r1 = 111(0x6f, float:1.56E-43)
            long r14 = r0.A0R     // Catch:{ all -> 0x0d8d }
            if (r10 != r1) goto L_0x064b
            long r14 = r14 + r21
        L_0x064b:
            r1 = 1
            long r12 = r0.A0S     // Catch:{ all -> 0x0d8d }
            if (r10 != r1) goto L_0x0652
            long r12 = r12 + r21
        L_0x0652:
            boolean r1 = r6.A05     // Catch:{ all -> 0x0d8d }
            long r10 = r0.A0T     // Catch:{ all -> 0x0d8d }
            if (r1 == 0) goto L_0x065a
            long r10 = r10 + r21
        L_0x065a:
            long r6 = r0.A0Q     // Catch:{ all -> 0x0d8d }
            long r6 = r6 + r21
            r39 = 0
            r38 = -3969(0xfffffffffffff07f, float:NaN)
            r0 = 0
            r25 = 0
            r2 = 0
            r23 = 0
            r4 = 0
            goto L_0x06a8
        L_0x066d:
            boolean r1 = r6.A06     // Catch:{ all -> 0x0d8d }
            r0 = r37
            long r4 = r0.A0N     // Catch:{ all -> 0x0d8d }
            if (r1 == 0) goto L_0x0677
            long r4 = r4 + r21
        L_0x0677:
            boolean r2 = r6.A04     // Catch:{ all -> 0x0d8d }
            long r0 = r0.A0L     // Catch:{ all -> 0x0d8d }
            r25 = r0
            if (r2 == 0) goto L_0x0681
            long r25 = r0 + r21
        L_0x0681:
            boolean r1 = r6.A02     // Catch:{ all -> 0x0d8d }
            r0 = r37
            long r2 = r0.A0K     // Catch:{ all -> 0x0d8d }
            if (r1 == 0) goto L_0x068b
            long r2 = r2 + r21
        L_0x068b:
            r6 = 1
            long r0 = r0.A0O     // Catch:{ all -> 0x0d8d }
            r23 = r0
            if (r10 != r6) goto L_0x0694
            long r23 = r0 + r21
        L_0x0694:
            r0 = r37
            long r0 = r0.A0J     // Catch:{ all -> 0x0d8d }
            long r0 = r0 + r21
            r39 = 0
            r38 = -63
            r6 = 0
            r14 = 0
            r12 = 0
            r10 = 0
            r8 = 0
        L_0x06a8:
            r27 = 0
            r31 = 0
            r29 = 0
            r33 = 0
        L_0x06b0:
            r19 = 0
            r35 = 0
        L_0x06b4:
            r51 = 0
            r63 = 0
            r67 = 0
            r75 = 0
            r81 = 0
            r83 = 0
            r85 = 0
            r87 = 0
            r89 = 0
            r91 = 0
            r93 = 0
            r95 = 0
            r97 = 0
            r99 = 0
            r101 = 0
            r43 = r25
            r45 = r2
            r47 = r23
            r49 = r4
            r53 = r6
            r55 = r14
            r57 = r12
            r59 = r10
            r61 = r8
            r65 = r27
            r69 = r31
            r71 = r29
            r73 = r33
            r77 = r19
            r79 = r35
            r41 = r0
            X.3S8 r37 = X.AnonymousClass3S8.A00(r37, r38, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79, r81, r83, r85, r87, r89, r91, r93, r95, r97, r99, r101)     // Catch:{ all -> 0x0d8d }
        L_0x06f6:
            r1 = r103
            r0 = r37
            r1.A03(r0)     // Catch:{ all -> 0x0d8d }
            goto L_0x075d
        L_0x06fe:
            if (r12 != 0) goto L_0x075d
            if (r11 != 0) goto L_0x075d
            r0 = r18
            X.1Dz r0 = r0.A02     // Catch:{ all -> 0x0d8d }
            X.1Dx r3 = r0.A01     // Catch:{ all -> 0x0d8d }
            X.3S8 r2 = r3.A01()     // Catch:{ all -> 0x0d8d }
            long r0 = r2.A0E     // Catch:{ all -> 0x0d8d }
            r4 = 1
            long r0 = r0 + r4
            r21 = 0
            r20 = 2147483647(0x7fffffff, float:NaN)
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r43 = 0
            r45 = 0
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r57 = 0
            r59 = 0
            r61 = 0
            r63 = 0
            r65 = 0
            r67 = 0
            r69 = 0
            r71 = 0
            r73 = 0
            r75 = 0
            r77 = 0
            r79 = 0
            r81 = 0
            r83 = r0
            r19 = r2
            X.3S8 r0 = X.AnonymousClass3S8.A00(r19, r20, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79, r81, r83)     // Catch:{ all -> 0x0d8d }
            r3.A03(r0)     // Catch:{ all -> 0x0d8d }
        L_0x075d:
            monitor-exit(r18)
            r0 = r17
            X.1DT r2 = r0.A0D
            java.io.File r4 = r16.A03()
            r0 = r105
            X.6Wx r0 = r0.A0G
            if (r0 != 0) goto L_0x0783
            r0 = -1
        L_0x076d:
            int r1 = X.AnonymousClass6UH.A00(r0)
            r0 = r106
            X.1Gl r7 = r0.A0A
            boolean r0 = X.AnonymousClass6Y1.A07(r7)
            if (r0 == 0) goto L_0x002d
            r0 = 1
            if (r1 == r0) goto L_0x0d2b
            r0 = 15
            if (r1 == r0) goto L_0x0d2b
            return
        L_0x0783:
            int r0 = r0.A01
            goto L_0x076d
        L_0x0786:
            java.lang.Object r2 = r4.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r2 = (com.whatsapp.mediacomposer.MediaComposerActivity) r2
            java.lang.Object r1 = r4.A01
            android.view.Window r1 = (android.view.Window) r1
            X.00r r0 = r2.A07
            java.lang.Object r0 = r0.A04()
            if (r0 != 0) goto L_0x002d
            r0 = 1
            r2.A1W = r0
            r0 = 0
            r1.setSharedElementEnterTransition(r0)
            android.view.View r1 = r2.A03
            r0 = 8
            r1.setVisibility(r0)
            r2.A1q()
            return
        L_0x07a8:
            java.lang.Object r6 = r4.A00
            com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment r6 = (com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment) r6
            java.lang.Object r5 = r4.A01
            java.util.Map r5 = (java.util.Map) r5
            r0 = 1
            X.AnonymousClass00C.A0D(r5, r0)
            java.util.SortedMap r0 = r6.A03
            java.util.Iterator r7 = X.AnonymousClass000.A0y(r0)
        L_0x07ba:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x002d
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r7)
            java.lang.Object r4 = r0.getKey()
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.Object r0 = r0.getValue()
            X.6AO r0 = (X.AnonymousClass6AO) r0
            int r0 = r0.A00
            java.lang.Object r0 = X.C36371kC.A0r(r5, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x07ba
            long r1 = r0.longValue()
            android.view.View r3 = r6.A0F
            if (r3 == 0) goto L_0x07ba
            int r0 = X.C36411kG.A07(r4)
            android.view.View r4 = r3.findViewById(r0)
            com.whatsapp.radio.RadioButtonWithSubtitle r4 = (com.whatsapp.radio.RadioButtonWithSubtitle) r4
            if (r4 == 0) goto L_0x07ba
            java.lang.CharSequence r3 = r4.A00
            X.0ts r0 = r6.A03
            if (r0 == 0) goto L_0x0d93
            java.lang.String r2 = X.AnonymousClass3TF.A02(r0, r1)
            if (r3 == 0) goto L_0x080e
            if (r2 == 0) goto L_0x080d
            r1 = 2131890935(0x7f1212f7, float:1.9416576E38)
            java.lang.Object[] r0 = X.AnonymousClass001.A0M()
            X.C36331k8.A1N(r3, r2, r0)
            java.lang.String r0 = r6.A0o(r1, r0)
            if (r0 == 0) goto L_0x080d
            r3 = r0
        L_0x080d:
            r2 = r3
        L_0x080e:
            r4.setSubTitle(r2)
            goto L_0x07ba
        L_0x0812:
            java.lang.Object r2 = r4.A00
            X.2g5 r2 = (X.AnonymousClass2g5) r2
            java.lang.Object r1 = r4.A01
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0 = 0
            r2.A00 = r0
            android.view.View r0 = r2.A01
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x002d
            X.4l7 r0 = r2.A02
            java.lang.String r2 = r1.toString()
            X.1hi r1 = r0.A02
            java.lang.Object r0 = r1.A04()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x002d
            r1.A0D(r2)
            return
        L_0x083b:
            java.lang.RuntimeException r0 = X.C36321k7.A06()
            throw r0
        L_0x0840:
            java.lang.Object r0 = r4.A00
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            java.lang.Object r1 = r4.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1Hx r0 = r0.A0r
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "group_participant_list"
            java.lang.String r3 = "whatsapp"
            r0.A02(r1, r2, r3, r4, r6)
            return
        L_0x085a:
            java.lang.Object r0 = r4.A00
            X.1tr r0 = (X.C39811tr) r0
            java.lang.Object r2 = r4.A01
            X.01I r2 = (X.AnonymousClass01I) r2
            X.1fs r1 = r0.A05
            java.lang.String r0 = "how-to-exit-and-delete-groups"
            goto L_0x08c9
        L_0x0867:
            java.lang.Object r1 = r4.A00
            X.7yh r1 = (X.C167727yh) r1
            java.lang.Object r0 = r4.A01
            X.3K1 r0 = (X.AnonymousClass3K1) r0
            X.1PF r2 = r1.A0A
            X.147 r1 = r0.A01
            com.whatsapp.jid.UserJid r0 = r0.A04
            r2.A02(r1, r0)
            return
        L_0x0879:
            java.lang.Object r0 = r4.A00
            X.31s r0 = (X.C589631s) r0
            java.lang.Object r1 = r4.A01
            X.2k3 r0 = r0.A00
            X.17Y r2 = r0.A00
            java.lang.String r1 = r1.toString()
            r0 = 0
            r2.A0K(r1, r0)
            return
        L_0x088c:
            java.lang.Object r0 = r4.A00
            X.2Vk r0 = (X.C46192Vk) r0
            java.lang.Object r2 = r4.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            com.whatsapp.group.newgroup.NewGroup r0 = r0.A00
            X.1P3 r1 = r0.A0a
            X.16D r0 = r0.A0B
            X.141 r0 = r0.A0D(r2)
            r1.A0F(r0)
            return
        L_0x08a2:
            java.lang.Object r3 = r4.A00
            com.whatsapp.groupenforcements.ui.CreateGroupSuspendDialog r3 = (com.whatsapp.groupenforcements.ui.CreateGroupSuspendDialog) r3
            java.lang.Object r2 = r4.A01
            X.01I r2 = (X.AnonymousClass01I) r2
            X.3Dl r0 = r3.A00
            X.1fs r1 = r0.A00
            java.lang.String r0 = "group-no-longer-available"
            r1.A01(r2, r0)
            android.app.Dialog r0 = r3.A1Z()
            r0.dismiss()
            return
        L_0x08bb:
            java.lang.Object r0 = r4.A00
            com.whatsapp.groupenforcements.ui.GroupSuspendBottomSheet r0 = (com.whatsapp.groupenforcements.ui.GroupSuspendBottomSheet) r0
            java.lang.Object r2 = r4.A01
            X.01I r2 = (X.AnonymousClass01I) r2
            X.3Dl r0 = r0.A03
            X.1fs r1 = r0.A00
            java.lang.String r0 = "group-no-longer-available"
        L_0x08c9:
            r1.A01(r2, r0)
            return
        L_0x08cd:
            java.lang.Object r3 = r4.A00
            X.3Au r3 = (X.C61163Au) r3
            java.lang.Object r15 = r4.A01
            r32 = 0
            r12 = 1
            X.AnonymousClass00C.A0D(r15, r12)
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            X.AnonymousClass00C.A08(r0)
            r3.A01 = r0
            X.1Cb r1 = r3.A05
            X.15g r0 = r3.A04
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x08f4
            X.0wx r0 = r3.A06
            long r0 = r0.A01()
            r3.A00 = r0
        L_0x08f4:
            X.3A0 r11 = r3.A07
            X.6by r0 = r11.A01
            com.whatsapp.voipcalling.CallInfo r4 = r11.A00
            if (r0 != 0) goto L_0x093b
            if (r4 != 0) goto L_0x093b
            r2 = 0
        L_0x08ff:
            X.0wx r0 = r3.A06
            long r29 = r0.A02()
            X.1bS r6 = r3.A08
            android.content.Context r5 = r3.A02
            r18 = 0
            long r0 = r3.A00
            java.lang.String r4 = r3.A01
            java.lang.String r20 = "InAppBugReporting"
            r31 = 1
            r21 = r18
            r22 = r18
            r24 = r18
            r25 = r18
            r33 = 0
            r17 = r5
            r19 = r18
            r23 = r4
            r26 = r2
            r27 = r0
            r16 = r6
            java.lang.String r1 = r16.A05(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r32, r33)
            X.AnonymousClass00C.A08(r1)
            X.17Y r4 = r3.A03
            r0 = 49
            X.751 r3 = new X.751
            r3.<init>(r0, r1, r15)
            goto L_0x0c5e
        L_0x093b:
            org.json.JSONObject r2 = X.C36441kJ.A1B()
            java.lang.String r17 = "Call Relay UUID"
            java.lang.String r8 = "Video"
            java.lang.String r16 = "Voice"
            java.lang.String r7 = "Media type"
            java.lang.String r10 = "Call start time"
            java.lang.String r5 = "Call not started"
            java.lang.String r13 = "callID"
            if (r0 == 0) goto L_0x09fb
            X.1HJ r14 = r11.A04
            com.whatsapp.jid.UserJid r6 = r0.A01
            boolean r4 = r0.A03
            java.lang.String r9 = r0.A02
            int r1 = r0.A00
            X.6by r0 = new X.6by
            r0.<init>(r1, r6, r9, r4)
            X.5Nh r6 = X.AnonymousClass1HJ.A00(r14, r0)
            if (r6 == 0) goto L_0x08ff
            X.6by r0 = r6.A04
            java.lang.String r0 = r0.A02
            r2.put(r13, r0)
            int r0 = r6.A07
            switch(r0) {
                case 0: goto L_0x09e4;
                case 1: goto L_0x09e7;
                case 2: goto L_0x09ea;
                case 3: goto L_0x09ed;
                case 4: goto L_0x09f0;
                case 5: goto L_0x09f3;
                case 6: goto L_0x09f7;
                default: goto L_0x0970;
            }
        L_0x0970:
            java.lang.String r1 = ""
        L_0x0972:
            java.lang.String r0 = "Call result"
            r2.put(r0, r1)
            int r0 = r6.A09
            if (r0 == 0) goto L_0x098c
            long r4 = r6.A01
            int r0 = r6.A09
            long r0 = (long) r0
            long r4 = r4 - r0
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = "MMM-dd-yyyy HH:mm:ss z"
            java.lang.String r5 = X.C36361kB.A0o(r0, r1, r4)
            X.AnonymousClass00C.A08(r5)
        L_0x098c:
            r2.put(r10, r5)
            long r0 = r6.A01
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r4 = "MMM-dd-yyyy HH:mm:ss z"
            java.lang.String r1 = X.C36361kB.A0o(r4, r5, r0)
            X.AnonymousClass00C.A08(r1)
            java.lang.String r0 = "Call end time"
            r2.put(r0, r1)
            boolean r0 = r6.A0K
            if (r0 != 0) goto L_0x09a7
            r8 = r16
        L_0x09a7:
            r2.put(r7, r8)
            X.1Pa r0 = r11.A03
            java.lang.String r7 = X.C34681hT.A08(r9)
            android.content.SharedPreferences r1 = X.C27631Pa.A00(r0)
            java.lang.String r0 = "call_relay_uuid"
            java.lang.String r1 = X.C36371kC.A0t(r1, r0)
            if (r1 == 0) goto L_0x08ff
            java.lang.String r0 = ";"
            java.lang.String[] r6 = r1.split(r0)
            int r5 = r6.length
            r4 = 0
        L_0x09c4:
            if (r4 >= r5) goto L_0x08ff
            r1 = r6[r4]
            java.lang.String r0 = "#"
            java.lang.String[] r1 = r1.split(r0)
            r0 = r1[r32]
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x09e1
            r1 = r1[r12]
        L_0x09d8:
            if (r1 == 0) goto L_0x08ff
            r0 = r17
            r2.put(r0, r1)
            goto L_0x08ff
        L_0x09e1:
            int r4 = r4 + 1
            goto L_0x09c4
        L_0x09e4:
            java.lang.String r1 = "Invalid"
            goto L_0x0972
        L_0x09e7:
            java.lang.String r1 = "Canceled"
            goto L_0x0972
        L_0x09ea:
            java.lang.String r1 = "Missed"
            goto L_0x0972
        L_0x09ed:
            java.lang.String r1 = "Unavailable"
            goto L_0x0972
        L_0x09f0:
            java.lang.String r1 = "Rejected"
            goto L_0x0972
        L_0x09f3:
            java.lang.String r1 = "Connected"
            goto L_0x0972
        L_0x09f7:
            java.lang.String r1 = "Accepted elsewhere"
            goto L_0x0972
        L_0x09fb:
            if (r4 == 0) goto L_0x08ff
            java.lang.String r0 = r4.callId
            r2.put(r13, r0)
            com.whatsapp.voipcalling.CallState r0 = r4.callState
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "Call state"
            r2.put(r0, r1)
            long r0 = r4.callDuration
            r11 = 0
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x0a24
            long r0 = X.C36441kJ.A0A(r0)
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r5 = "MMM-dd-yyyy HH:mm:ss z"
            java.lang.String r5 = X.C36361kB.A0o(r5, r6, r0)
            X.AnonymousClass00C.A08(r5)
        L_0x0a24:
            r2.put(r10, r5)
            boolean r0 = r4.videoEnabled
            if (r0 != 0) goto L_0x0a2d
            r8 = r16
        L_0x0a2d:
            r2.put(r7, r8)
            java.lang.String r1 = r4.relayCallUuid
            goto L_0x09d8
        L_0x0a33:
            java.lang.Object r9 = r4.A00
            X.38O r9 = (X.AnonymousClass38O) r9
            java.lang.Object r10 = r4.A01
            r11 = 1
            X.AnonymousClass00C.A0D(r10, r11)
            X.3PY r8 = r9.A02
            monitor-enter(r8)
            X.1bS r7 = r8.A01     // Catch:{ all -> 0x0a8c }
            r7.A07()     // Catch:{ all -> 0x0a8c }
            r0 = 3
            r6 = 0
            java.io.File r5 = X.AnonymousClass3PY.A00(r8, r6, r0)     // Catch:{ all -> 0x0a8c }
            if (r5 == 0) goto L_0x0a5d
            long r3 = r5.length()     // Catch:{ all -> 0x0a8c }
            r1 = 5242880(0x500000, double:2.590327E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0a5d
            java.lang.String r4 = X.C31211bS.A01(r7, r5, r6, r11)     // Catch:{ all -> 0x0a8c }
            goto L_0x0a61
        L_0x0a5d:
            java.lang.String r4 = r7.A06(r6)     // Catch:{ all -> 0x0a8c }
        L_0x0a61:
            monitor-exit(r8)
            X.17Y r2 = r9.A00
            r1 = 0
            X.74v r0 = new X.74v
            r0.<init>(r1, r4, r10)
            r2.A0H(r0)
            X.3Cf r3 = r9.A01
            X.2Qi r2 = new X.2Qi
            r2.<init>()
            if (r4 == 0) goto L_0x0a7e
            int r1 = r4.length()
            r0 = 12
            if (r1 != 0) goto L_0x0a80
        L_0x0a7e:
            r0 = 11
        L_0x0a80:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01 = r0
            X.0yW r0 = r3.A00
            r0.Blv(r2)
            return
        L_0x0a8c:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0a8f:
            java.lang.Object r0 = r4.A00
            com.whatsapp.inappsupport.ui.SupportAiViewModel r0 = (com.whatsapp.inappsupport.ui.SupportAiViewModel) r0
            java.lang.Object r2 = r4.A01
            X.3XH r2 = (X.AnonymousClass3XH) r2
            r22 = 0
            X.3AY r3 = r0.A09
            java.lang.String r8 = "SupportAi"
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            X.AnonymousClass00C.A08(r1)
            r3.A01 = r1
            X.1Cb r4 = r3.A04
            X.15g r1 = r3.A03
            boolean r1 = r4.A03(r1)
            if (r1 == 0) goto L_0x0ab8
            X.0wx r1 = r3.A05
            long r4 = r1.A01()
            r3.A00 = r4
        L_0x0ab8:
            X.0wx r1 = r3.A05
            long r17 = r1.A02()
            X.1bS r4 = r3.A07
            android.content.Context r5 = r3.A02
            r7 = 0
            r19 = 1
            long r15 = r3.A00
            java.lang.String r11 = r3.A01
            X.1ft r1 = r3.A06
            android.util.Pair r6 = r1.A00()
            java.util.ArrayList r13 = X.C54612tE.A00(r2)
            r10 = r7
            r12 = r7
            r14 = r7
            r20 = 1
            r21 = 1
            r9 = r7
            java.lang.String r20 = r4.A05(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19, r20, r21)
            X.AnonymousClass00C.A08(r20)
            X.3E6 r1 = r0.A0A
            java.lang.String r19 = "#chatbot"
            r17 = r1
            r18 = r0
            r17.A00(r18, r19, r20, r21, r22)
            return
        L_0x0aee:
            java.lang.Object r0 = r4.A00
            com.whatsapp.inappsupport.ui.SupportAiViewModel r0 = (com.whatsapp.inappsupport.ui.SupportAiViewModel) r0
            java.lang.Object r1 = r4.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            X.0xM r0 = r0.A08
            r0.A0y(r1)
            return
        L_0x0afc:
            java.lang.Object r1 = r4.A00
            com.whatsapp.inappsupportbloks.components.BloksSupportVideoView r1 = (com.whatsapp.inappsupportbloks.components.BloksSupportVideoView) r1
            java.lang.Object r0 = r4.A01
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            com.whatsapp.inappsupportbloks.components.BloksSupportVideoView.setVideoThumbnail$lambda$4$lambda$3(r1, r0)
            return
        L_0x0b08:
            java.lang.Object r3 = r4.A00
            X.3WH r3 = (X.AnonymousClass3WH) r3
            java.lang.Object r2 = r4.A01
            android.os.IBinder r2 = (android.os.IBinder) r2
            if (r2 == 0) goto L_0x0b8c
            java.lang.String r7 = "com.whatsapp.instrumentation.CallbackInterface"
            android.os.IInterface r6 = r2.queryLocalInterface(r7)     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            if (r6 == 0) goto L_0x0b2f
            boolean r0 = r6 instanceof X.AnonymousClass3WY     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            if (r0 == 0) goto L_0x0b2f
            X.3WY r6 = (X.AnonymousClass3WY) r6     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            if (r6 == 0) goto L_0x0b8c
        L_0x0b22:
            boolean r0 = r3.A02     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            if (r0 == 0) goto L_0x0b63
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            goto L_0x0b35
        L_0x0b2f:
            X.3WY r6 = new X.3WY     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            r6.<init>(r2)     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            goto L_0x0b22
        L_0x0b35:
            r5.writeInterfaceToken(r7)     // Catch:{ all -> 0x0b84 }
            android.os.IBinder r2 = r6.A00     // Catch:{ all -> 0x0b84 }
            r1 = 1
            r0 = 0
            r2.transact(r1, r5, r4, r0)     // Catch:{ all -> 0x0b84 }
            r4.readException()     // Catch:{ all -> 0x0b84 }
            java.lang.String r2 = r4.readString()     // Catch:{ all -> 0x0b84 }
            r4.recycle()     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            r5.recycle()     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            X.3Nx r0 = r3.A03     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            X.3Fg r1 = r0.A03     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            java.lang.String r0 = "com.facebook.stella"
            boolean r0 = r1.A00(r0, r2)     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            if (r0 != 0) goto L_0x0b63
            java.lang.String r0 = "CallbackServiceProxy/request invalid authorization token"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            X.2qF r0 = new X.2qF     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            r0.<init>()     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            goto L_0x0b9a
        L_0x0b63:
            java.lang.String r0 = r3.A00     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            r5.writeInterfaceToken(r7)     // Catch:{ all -> 0x0b84 }
            r5.writeString(r0)     // Catch:{ all -> 0x0b84 }
            android.os.IBinder r2 = r6.A00     // Catch:{ all -> 0x0b84 }
            r1 = 2
            r0 = 0
            r2.transact(r1, r5, r4, r0)     // Catch:{ all -> 0x0b84 }
            r4.readException()     // Catch:{ all -> 0x0b84 }
            r4.recycle()     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            r5.recycle()     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            goto L_0x0bba
        L_0x0b84:
            r0 = move-exception
            r4.recycle()     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            r5.recycle()     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            goto L_0x0b9a
        L_0x0b8c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            java.lang.String r0 = "Cannot convert binder to interface: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0, r1)     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
        L_0x0b9a:
            throw r0     // Catch:{ 2qF -> 0x0ba2, all -> 0x0b9b }
        L_0x0b9b:
            r1 = move-exception
            java.lang.String r0 = "CallbackServiceProxy/failed to send request:"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0bc4 }
            goto L_0x0bba
        L_0x0ba2:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0bc4 }
            java.lang.String r0 = "CallbackServiceProxy/failed to send request: "
            r1.append(r0)     // Catch:{ all -> 0x0bc4 }
            java.lang.String r0 = r2.message     // Catch:{ all -> 0x0bc4 }
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x0bc4 }
            X.3Nx r0 = r3.A03     // Catch:{ all -> 0x0bc4 }
            X.1ex r1 = r0.A01     // Catch:{ all -> 0x0bc4 }
            java.lang.String r0 = "com.facebook.stella"
            r1.A00(r0)     // Catch:{ all -> 0x0bc4 }
        L_0x0bba:
            X.3Nx r0 = r3.A03
            X.0wG r0 = r0.A00
            android.content.Context r0 = r0.A00
            r0.unbindService(r3)
            return
        L_0x0bc4:
            r1 = move-exception
            X.3Nx r0 = r3.A03
            X.0wG r0 = r0.A00
            android.content.Context r0 = r0.A00
            r0.unbindService(r3)
            throw r1
        L_0x0bcf:
            java.lang.Object r1 = r4.A00
            com.whatsapp.jobqueue.job.RotateSignedPreKeyJob r1 = (com.whatsapp.jobqueue.job.RotateSignedPreKeyJob) r1
            java.lang.Object r0 = r4.A01
            byte[] r0 = (byte[]) r0
            com.whatsapp.jobqueue.job.RotateSignedPreKeyJob.A00(r1, r0)
            return
        L_0x0bdb:
            java.lang.Object r0 = r4.A00
            com.whatsapp.jobqueue.job.SendE2EMessageJob r0 = (com.whatsapp.jobqueue.job.SendE2EMessageJob) r0
            java.lang.Object r1 = r4.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            X.3T1 r2 = r0.A0O
            if (r2 == 0) goto L_0x0bef
            X.16J r1 = r0.A0A
            r0 = 30
            r1.A05(r2, r0)
            return
        L_0x0bef:
            X.16J r0 = r0.A0A
            r0.A00(r1)
            return
        L_0x0bf5:
            java.lang.Object r2 = r4.A00
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            java.lang.Object r1 = r4.A01
            android.telephony.PhoneStateListener r1 = (android.telephony.PhoneStateListener) r1
            r0 = 32
            r2.listen(r1, r0)
            return
        L_0x0c03:
            java.lang.Object r1 = r4.A00
            X.5B8 r1 = (X.AnonymousClass5B8) r1
            java.lang.Object r0 = r4.A01
            X.6jV r0 = (X.C139266jV) r0
            r0.A06()
            r0 = 0
            r1.A02 = r0
            return
        L_0x0c12:
            java.lang.Object r1 = r4.A00
            X.6Zc r1 = (X.C133586Zc) r1
            java.lang.Object r0 = r4.A01
            com.whatsapp.location.PlaceInfo r0 = (com.whatsapp.location.PlaceInfo) r0
            X.C133586Zc.A0E(r1, r0)
            return
        L_0x0c1e:
            java.lang.Object r1 = r4.A00
            X.4xN r1 = (X.C101334xN) r1
            java.lang.Object r0 = r4.A01
            X.6Wx r0 = (X.C133136Wx) r0
            r1.A0J(r0)
            return
        L_0x0c2a:
            java.lang.Object r2 = r4.A00
            X.4xN r2 = (X.C101334xN) r2
            java.lang.Object r1 = r4.A01
            X.17Y r4 = r2.A0C
            r0 = 33
            goto L_0x0c59
        L_0x0c35:
            java.lang.Object r3 = r4.A00
            X.4xN r3 = (X.C101334xN) r3
            java.lang.Object r2 = r4.A01
            X.6Wx r2 = (X.C133136Wx) r2
            r1 = 34
            goto L_0x0c6c
        L_0x0c40:
            java.lang.Object r1 = r4.A00
            X.4xN r1 = (X.C101334xN) r1
            java.lang.Object r0 = r4.A01
            X.6Wx r0 = (X.C133136Wx) r0
            r1.A0J(r0)
            X.C101334xN.A04(r0, r1)
            return
        L_0x0c4f:
            java.lang.Object r2 = r4.A00
            X.4xN r2 = (X.C101334xN) r2
            java.lang.Object r1 = r4.A01
            X.17Y r4 = r2.A0C
            r0 = 36
        L_0x0c59:
            X.3vA r3 = new X.3vA
            r3.<init>(r2, r1, r0)
        L_0x0c5e:
            r4.A0H(r3)
            return
        L_0x0c62:
            java.lang.Object r3 = r4.A00
            X.4xN r3 = (X.C101334xN) r3
            java.lang.Object r2 = r4.A01
            X.6Wx r2 = (X.C133136Wx) r2
            r1 = 37
        L_0x0c6c:
            X.3vA r0 = new X.3vA
            r0.<init>(r3, r2, r1)
            X.C101334xN.A05(r2, r3, r0)
            return
        L_0x0c75:
            java.lang.Object r0 = r4.A00
            X.4xN r0 = (X.C101334xN) r0
            java.lang.Object r3 = r4.A01
            X.64p r3 = (X.C1265864p) r3
            X.6Fk r2 = r0.A0j
            X.1BV r1 = r0.A0W
            r0 = 1
            int r0 = r1.A01(r3, r0)
            r2.A02 = r0
            return
        L_0x0c89:
            java.lang.Object r1 = r4.A00
            android.app.job.JobParameters r1 = (android.app.job.JobParameters) r1
            java.lang.Object r0 = r4.A01
            com.whatsapp.media.download.service.MediaDownloadJobService r0 = (com.whatsapp.media.download.service.MediaDownloadJobService) r0
            com.whatsapp.media.download.service.MediaDownloadJobService.A00(r1, r0)
            return
        L_0x0c95:
            java.lang.Object r2 = r4.A00
            X.3P3 r2 = (X.AnonymousClass3P3) r2
            java.lang.Object r1 = r4.A01
            X.2bU r1 = (X.AnonymousClass2bU) r1
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            X.AnonymousClass3P3.A00(r2, r1, r0)
            return
        L_0x0ca6:
            java.lang.Object r1 = r4.A00
            X.5Aq r1 = (X.C104655Aq) r1
            java.lang.Object r0 = r4.A01
            X.7mX r0 = (X.C161307mX) r0
            X.6wB r0 = (X.C146796wB) r0
            X.6c4 r3 = r0.A00
            java.lang.String r2 = r3.A0E
            X.C18740tg.A06(r2)
            boolean r0 = r3.A03()
            if (r0 == 0) goto L_0x0cc3
            X.1AP r0 = r1.A01
            r0.A05(r3)
            return
        L_0x0cc3:
            X.1Av r1 = r1.A00
            java.lang.String r0 = r3.A0D
            r1.A03(r2, r0)
            return
        L_0x0ccb:
            java.lang.Object r1 = r4.A00
            X.5Aq r1 = (X.C104655Aq) r1
            java.lang.Object r0 = r4.A01
            X.7mX r0 = (X.C161307mX) r0
            X.6wB r0 = (X.C146796wB) r0
            X.6c4 r0 = r0.A00
            X.1Av r2 = r1.A00
            java.lang.String r1 = r0.A0E
            X.C18740tg.A06(r1)
            java.lang.String r0 = r0.A0D
            r2.A07(r1, r0)
            return
        L_0x0ce4:
            java.lang.Object r1 = r4.A00
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r4.A01
            android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
            r1.setLayoutParams(r0)
            return
        L_0x0cf0:
            java.lang.Object r0 = r4.A00
            X.6SU r0 = (X.AnonymousClass6SU) r0
            java.lang.Object r1 = r4.A01
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            android.view.View r0 = r0.A03
            r0.setLayoutParams(r1)
            return
        L_0x0cfe:
            X.3AX r0 = r2.A0J
            com.whatsapp.WaImageView r0 = r0.A05
            r0.setVisibility(r1)
            X.3AX r0 = r2.A0J
            com.airbnb.lottie.LottieAnimationView r0 = r0.A00
            int r1 = r0.getVisibility()
            X.3AX r0 = r2.A0J
            if (r1 != 0) goto L_0x0d1e
            com.airbnb.lottie.LottieAnimationView r3 = r0.A00
            r1 = 14
            X.4VL r0 = new X.4VL
            r0.<init>(r2, r1)
            r3.A05(r0)
            return
        L_0x0d1e:
            com.airbnb.lottie.LottieAnimationView r0 = r0.A01
            r0.setVisibility(r3)
            X.3AX r0 = r2.A0J
            com.airbnb.lottie.LottieAnimationView r0 = r0.A01
            r0.A04()
            return
        L_0x0d2b:
            X.2RP r3 = new X.2RP
            r3.<init>()
            r0 = r106
            long r5 = r0.A07
            double r0 = (double) r5
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.A04 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r104)
            r3.A05 = r0
            boolean r0 = X.AnonymousClass6Y1.A07(r7)
            if (r0 == 0) goto L_0x0d87
            if (r4 == 0) goto L_0x0d87
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x0d87
            X.1Ap r1 = r2.A0T
            r0 = r106
            java.lang.String r0 = r0.A0J
            X.3S2 r1 = r1.A02(r4, r0)
            if (r1 == 0) goto L_0x0d73
            boolean r0 = r1.A0B
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A02 = r0
            boolean r0 = r1.A0A
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A01 = r0
            boolean r0 = r1.A07
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A00 = r0
        L_0x0d73:
            X.0yC r1 = r2.A0D
            r0 = 6787(0x1a83, float:9.51E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0d87
            r0 = r106
            boolean r0 = r0.A0S
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A03 = r0
        L_0x0d87:
            X.0yW r0 = r2.A0E
            r0.Bly(r3)
            return
        L_0x0d8d:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        L_0x0d90:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        L_0x0d93:
            java.lang.RuntimeException r0 = X.C36321k7.A09()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80293vA.run():void");
    }
}
