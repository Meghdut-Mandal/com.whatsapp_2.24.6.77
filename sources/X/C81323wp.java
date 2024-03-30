package X;

import com.whatsapp.chatinfo.ContactInfoActivity;

/* renamed from: X.3wp  reason: invalid class name and case insensitive filesystem */
public class C81323wp implements Runnable {
    public Object A00;
    public final int A01;

    public C81323wp(AnonymousClass2E6 r1, int i) {
        this.A01 = i;
        if (17 - i != 0) {
            this.A00 = r1;
        } else {
            this.A00 = r1;
        }
    }

    public static void A00(C19930wk r1, Object obj, int i) {
        r1.execute(new C81323wp(obj, i));
    }

    public static void A01(C19770wU r1, Object obj, int i) {
        r1.Boy(new C81323wp(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: com.whatsapp.community.CommunityNUXActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: com.whatsapp.chatlock.ChatLockPrivacySettingsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v70, resolved type: com.whatsapp.community.CommunityNUXActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v71, resolved type: com.whatsapp.community.CommunityNUXActivity} */
    /* JADX WARNING: type inference failed for: r13v6, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x038f, code lost:
        r0.setVisibility(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0392, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04e4, code lost:
        r1.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04e7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0504, code lost:
        r2.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0507, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0549, code lost:
        X.C40051uf.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x054c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0592, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:?, code lost:
        X.C05600Qi.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x064b, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:?, code lost:
        X.C05600Qi.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x064f, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x065a, code lost:
        X.C40051uf.A01(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x065d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0660, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0661, code lost:
        X.C05600Qi.A00(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0664, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0686, code lost:
        A00(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0689, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011e, code lost:
        r2.A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0121, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:206:0x0582=Splitter:B:206:0x0582, B:232:0x0645=Splitter:B:232:0x0645} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r4 = r16
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x028f;
                case 1: goto L_0x0297;
                case 2: goto L_0x02b2;
                case 3: goto L_0x02be;
                case 4: goto L_0x0354;
                case 5: goto L_0x035c;
                case 6: goto L_0x036e;
                case 7: goto L_0x0376;
                case 8: goto L_0x002d;
                case 9: goto L_0x037e;
                case 10: goto L_0x0389;
                case 11: goto L_0x0393;
                case 12: goto L_0x039b;
                case 13: goto L_0x03ba;
                case 14: goto L_0x0455;
                case 15: goto L_0x045d;
                case 16: goto L_0x046e;
                case 17: goto L_0x047f;
                case 18: goto L_0x004d;
                case 19: goto L_0x0077;
                case 20: goto L_0x009f;
                case 21: goto L_0x048a;
                case 22: goto L_0x00b5;
                case 23: goto L_0x0495;
                case 24: goto L_0x04a9;
                case 25: goto L_0x00c7;
                case 26: goto L_0x001b;
                case 27: goto L_0x0007;
                case 28: goto L_0x0007;
                case 29: goto L_0x04b1;
                case 30: goto L_0x04cf;
                case 31: goto L_0x04dc;
                case 32: goto L_0x04e8;
                case 33: goto L_0x04f8;
                case 34: goto L_0x00ec;
                case 35: goto L_0x0508;
                case 36: goto L_0x0122;
                case 37: goto L_0x0141;
                case 38: goto L_0x0167;
                case 39: goto L_0x050d;
                case 40: goto L_0x0517;
                case 41: goto L_0x0542;
                case 42: goto L_0x0181;
                case 43: goto L_0x054d;
                case 44: goto L_0x01a3;
                case 45: goto L_0x0598;
                case 46: goto L_0x0665;
                case 47: goto L_0x0672;
                case 48: goto L_0x067c;
                case 49: goto L_0x068a;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r4.A00
            com.whatsapp.community.CommunityHomeActivity r0 = (com.whatsapp.community.CommunityHomeActivity) r0
            X.1uf r3 = r0.A0S
            X.141 r2 = r0.A0b
            X.1hi r0 = r3.A0q
            X.C36331k8.A13(r0)
            X.0wU r1 = r3.A0y
            r0 = 6
            X.C80263v7.A00(r1, r3, r2, r0)
        L_0x001a:
            return
        L_0x001b:
            java.lang.Object r2 = r4.A00
            X.1uO r2 = (X.C39971uO) r2
            X.1Rs r1 = r2.A03
            r0 = 0
            X.C36341k9.A19(r1, r0)
            X.1Rs r2 = r2.A02
            java.lang.Boolean r0 = X.C36371kC.A0m()
            goto L_0x011e
        L_0x002d:
            java.lang.Object r3 = r4.A00
            com.whatsapp.camera.overlays.AutofocusOverlay r3 = (com.whatsapp.camera.overlays.AutofocusOverlay) r3
            int r1 = r3.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x001a
            r3.setVisibility(r0)
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x001a
            android.view.animation.AlphaAnimation r2 = X.C36371kC.A0L()
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            r3.startAnimation(r2)
            return
        L_0x004d:
            java.lang.Object r3 = r4.A00
            X.2E6 r3 = (X.AnonymousClass2E6) r3
            android.widget.ListView r0 = r3.A0I
            r2 = 0
            android.view.View r1 = r0.getChildAt(r2)
            if (r1 == 0) goto L_0x001a
            android.widget.ListView r0 = r3.A0I
            int r0 = r0.getFirstVisiblePosition()
            if (r0 != 0) goto L_0x001a
            int r0 = r1.getTop()
            int r1 = r3.A09
            if (r0 == r1) goto L_0x069e
            java.lang.Boolean r0 = X.C18750th.A03
            android.widget.ListView r0 = r3.A0I
            r0.setSelectionFromTop(r2, r1)
            android.widget.ListView r0 = r3.A0I
            r0.post(r4)
            return
        L_0x0077:
            java.lang.Object r5 = r4.A00
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r5 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r5
            X.141 r2 = r5.A0O
            if (r2 == 0) goto L_0x001a
            X.1FR r1 = r5.A0V
            X.171 r0 = r1.A02
            java.lang.String r4 = r0.A0M(r2)
            X.0wG r0 = r1.A04
            android.content.Context r3 = r0.A00
            r2 = 2131892197(0x7f1217e5, float:1.9419135E38)
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            r1 = 0
            java.lang.String r0 = X.C36391kE.A0v(r3, r4, r0, r1, r2)
            X.4t3 r0 = X.C99304t3.A01(r5, r0, r1)
            r0.A0P()
            return
        L_0x009f:
            java.lang.Object r3 = r4.A00
            X.2EI r3 = (X.AnonymousClass2EI) r3
            r2 = 0
            X.0yC r1 = r3.A0N
            r0 = 1071(0x42f, float:1.501E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x001a
            X.1eC r1 = r3.A0S
            r0 = 3
            r1.A00(r0, r2)
            return
        L_0x00b5:
            java.lang.Object r2 = r4.A00
            X.2EI r2 = (X.AnonymousClass2EI) r2
            X.141 r0 = r2.A02
            com.whatsapp.jid.UserJid r1 = X.C36351kA.A0l(r0)
            if (r1 == 0) goto L_0x001a
            X.3GL r0 = r2.A0M
            r0.A01(r1)
            return
        L_0x00c7:
            java.lang.Object r5 = r4.A00
            com.whatsapp.community.CommunityExitDialogFragment r5 = (com.whatsapp.community.CommunityExitDialogFragment) r5
            android.content.Context r4 = r5.A1D()
            if (r4 == 0) goto L_0x001a
            X.0xT r1 = r5.A06
            java.lang.String r0 = "3114626665494175"
            android.net.Uri r3 = r1.A02(r0)
            android.content.Intent r2 = X.C36391kE.A0G(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CommunityExitDialogFragment intent: "
            X.C36321k7.A1K(r3, r0, r1)
            X.1Dv r0 = r5.A00
            r0.A06(r4, r2)
            return
        L_0x00ec:
            java.lang.Object r4 = r4.A00
            X.1uf r4 = (X.C40051uf) r4
            X.16D r1 = r4.A0S
            X.147 r0 = r4.A0h
            X.141 r3 = r1.A08(r0)
            r4.A04 = r3
            if (r3 == 0) goto L_0x010b
            X.11F r0 = r3.A0H
            boolean r0 = r0 instanceof X.AnonymousClass147
            if (r0 == 0) goto L_0x010b
            r2 = 1
            r1 = 0
            X.35K r0 = new X.35K
            r0.<init>(r1, r2)
            r3.A0J = r0
        L_0x010b:
            X.00s r1 = r4.A0G
            X.141 r0 = r4.A04
            r1.A0C(r0)
            X.141 r1 = r4.A04
            if (r1 == 0) goto L_0x001a
            X.00s r2 = r4.A0E
            X.171 r0 = r4.A0T
            java.lang.String r0 = r0.A0H(r1)
        L_0x011e:
            r2.A0C(r0)
            return
        L_0x0122:
            java.lang.Object r3 = r4.A00
            X.1uf r3 = (X.C40051uf) r3
            X.1LV r2 = r3.A0M
            X.147 r1 = r3.A0h
            boolean r0 = r2.A0I(r1)
            if (r0 == 0) goto L_0x0135
            X.1Rs r0 = r3.A0x
            r0.A0C(r1)
        L_0x0135:
            boolean r0 = r2.A0F(r1)
            if (r0 == 0) goto L_0x001a
            X.1Rs r0 = r3.A0w
            r0.A0C(r1)
            return
        L_0x0141:
            java.lang.Object r4 = r4.A00
            X.1uf r4 = (X.C40051uf) r4
            X.0yC r1 = r4.A0a
            r0 = 6601(0x19c9, float:9.25E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x001a
            X.1LV r0 = r4.A0M
            X.147 r3 = r4.A0h
            com.whatsapp.jid.GroupJid r2 = r0.A01(r3)
            X.147 r2 = (X.AnonymousClass147) r2
            if (r2 == 0) goto L_0x06b3
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r1 = r4.A0Q
            X.1cD r0 = r4.A0f
            boolean r0 = r0.A00()
            r1.A05(r3, r2, r0)
            return
        L_0x0167:
            java.lang.Object r3 = r4.A00
            X.1uf r3 = (X.C40051uf) r3
            X.3Qp r0 = r3.A03
            if (r0 == 0) goto L_0x001a
            long r0 = r3.A01
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            X.0xM r5 = r3.A0W
            X.147 r6 = r3.A0h
            long r7 = r5.A0L(r6, r0)
            X.3Qp r4 = r3.A03
            monitor-enter(r4)
            goto L_0x06b9
        L_0x0181:
            java.lang.Object r2 = r4.A00
            X.1uf r2 = (X.C40051uf) r2
            X.1Cv r0 = r2.A0Y
            X.147 r1 = r2.A0h
            X.3T1 r0 = r0.A04(r1)
            if (r0 == 0) goto L_0x0196
            boolean r0 = X.C66013Ui.A0o(r0)
            if (r0 == 0) goto L_0x0196
            return
        L_0x0196:
            X.12q r0 = r2.A0U
            X.3Qp r4 = X.C36371kC.A0W(r0, r1)
            r2.A03 = r4
            if (r4 == 0) goto L_0x001a
            monitor-enter(r4)
            goto L_0x06ee
        L_0x01a3:
            java.lang.Object r5 = r4.A00
            X.1uf r5 = (X.C40051uf) r5
            java.util.List r4 = r5.A10
            r4.clear()
            java.util.List r6 = r5.A0z
            r6.clear()
            X.1EL r1 = r5.A0g
            X.141 r0 = r5.A04
            boolean r0 = r1.A00(r0)
            X.1LV r2 = r5.A0M
            X.147 r12 = r5.A0h
            if (r0 == 0) goto L_0x022f
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            X.17d r0 = r2.A08
            java.util.HashSet r0 = r0.A02(r12)
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.util.Iterator r11 = r0.iterator()
        L_0x01d5:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0208
            java.lang.Object r8 = r11.next()
            r10 = r8
            X.3QK r10 = (X.AnonymousClass3QK) r10
            X.1EL r3 = r2.A0A
            if (r10 == 0) goto L_0x0204
            int r1 = r10.A00
            java.util.Set r0 = X.C56602wa.A00
            boolean r0 = X.AnonymousClass000.A1Z(r0, r1)
            if (r0 == 0) goto L_0x0204
            X.16D r1 = r3.A00
            com.whatsapp.jid.GroupJid r0 = r10.A02
            X.141 r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0204
            boolean r0 = r3.A00(r0)
            if (r0 == 0) goto L_0x0204
            r7.add(r8)
            goto L_0x01d5
        L_0x0204:
            r9.add(r8)
            goto L_0x01d5
        L_0x0208:
            java.util.Iterator r3 = r9.iterator()
        L_0x020c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0227
            java.lang.Object r2 = r3.next()
            X.3QK r2 = (X.AnonymousClass3QK) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CommunityChatManager/getTerminatedLinkedSubgroups - unexpected subgroup: "
            r1.append(r0)
            com.whatsapp.jid.GroupJid r0 = r2.A02
            X.C36351kA.A1L(r0, r1)
            goto L_0x020c
        L_0x0227:
            java.util.List r0 = X.C007103b.A0V(r7)
            r4.addAll(r0)
            goto L_0x0253
        L_0x022f:
            java.util.HashSet r0 = r2.A04(r12)
            java.util.List r0 = X.C007103b.A0V(r0)
            r4.addAll(r0)
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            X.1Lr r3 = r2.A09
            X.17d r2 = r3.A01
            r1 = 5
            X.3Tw r0 = new X.3Tw
            r0.<init>(r3, r1)
            java.util.HashSet r0 = r2.A01(r0, r12)
            java.util.List r0 = X.C007103b.A0V(r0)
            r6.addAll(r0)
        L_0x0253:
            X.C40051uf.A02(r5)
            X.C40051uf.A01(r5)
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x001a
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x001a
            r3 = 0
            r5.A0B = r3
            java.util.HashMap r14 = X.AnonymousClass001.A0J()
            java.util.Iterator r2 = r6.iterator()
        L_0x026e:
            boolean r0 = r2.hasNext()
            r13 = 0
            if (r0 == 0) goto L_0x06fe
            java.lang.Object r1 = r2.next()
            X.3QK r1 = (X.AnonymousClass3QK) r1
            X.16D r0 = r5.A0S
            com.whatsapp.jid.GroupJid r1 = r1.A02
            X.141 r0 = r0.A0D(r1)
            int r0 = r0.A06
            if (r0 <= 0) goto L_0x028b
            java.lang.String r13 = java.lang.Integer.toString(r0)
        L_0x028b:
            r14.put(r1, r13)
            goto L_0x026e
        L_0x028f:
            java.lang.Object r0 = r4.A00
            X.6YT r0 = (X.AnonymousClass6YT) r0
            X.AnonymousClass6YT.A0B(r0)
            return
        L_0x0297:
            java.lang.Object r2 = r4.A00
            X.6YT r2 = (X.AnonymousClass6YT) r2
            android.view.View r0 = r2.A08
            r1 = 4
            r0.setVisibility(r1)
            android.view.View r0 = r2.A06
            r0.setVisibility(r1)
            X.60p r0 = r2.A0G
            com.whatsapp.camera.mode.CameraModeTabLayout r0 = r0.A00
            r0.setVisibility(r1)
            android.view.View r0 = r2.A07
            r1 = 0
            goto L_0x038f
        L_0x02b2:
            java.lang.Object r0 = r4.A00
            X.65s r0 = (X.C1268165s) r0
            X.6YT r0 = r0.A00
            X.0yb r0 = r0.A0l
            X.AnonymousClass3T3.A03(r0)
            return
        L_0x02be:
            java.lang.Object r0 = r4.A00
            X.6rs r0 = (X.C144246rs) r0
            X.6YT r3 = r0.A00
            boolean r0 = r3.A0S()
            if (r0 != 0) goto L_0x0330
            X.6WU r7 = r3.A0E
            boolean r6 = r3.A0O
            X.AnonymousClass6YT.A0M(r3)
            r5 = 1
            com.whatsapp.WaImageView r4 = r7.A0H
            r1 = 0
            r2 = 0
            r4.setVisibility(r1)
            com.whatsapp.CircularProgressBar r0 = r7.A04
            if (r0 == 0) goto L_0x02e0
            r0.setVisibility(r1)
        L_0x02e0:
            r4.setEnabled(r5)
            if (r6 == 0) goto L_0x02ea
            r0 = 8
            r4.sendAccessibilityEvent(r0)
        L_0x02ea:
            com.whatsapp.WaImageView r1 = r7.A0I
            r1.setEnabled(r5)
            boolean r0 = r7.A0K
            int r0 = X.C36351kA.A00(r0)
            r1.setVisibility(r0)
            com.whatsapp.WaImageView r0 = r7.A0F
            r0.setEnabled(r5)
            X.AnonymousClass6WU.A00(r7)
            com.whatsapp.WaImageView r1 = r7.A0G
            X.5tE r0 = r7.A05
            int r0 = r0.A00
            r1.setVisibility(r0)
            com.whatsapp.WaImageView r0 = r7.A0E
            r0.setVisibility(r2)
            X.6F9 r0 = r3.A0F
            if (r0 == 0) goto L_0x0320
            com.whatsapp.camera.CameraBottomSheetBehavior r0 = r0.A0B
            int r1 = r0.A0J
            r0 = 3
            if (r1 == r0) goto L_0x0320
            X.60p r0 = r3.A0G
            com.whatsapp.camera.mode.CameraModeTabLayout r0 = r0.A00
            r0.setVisibility(r2)
        L_0x0320:
            X.6WU r0 = r3.A0E
            r0.A02()
            X.6OO r1 = r3.A0I
            X.6Dz r0 = r3.A0g
            boolean r0 = r0.A01()
            r1.A01(r0, r2, r2)
        L_0x0330:
            android.view.View r0 = r3.A07
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x034d
            android.view.View r1 = r3.A07
            r0 = 8
            r1.setVisibility(r0)
            android.view.animation.AlphaAnimation r2 = X.C36371kC.A0L()
            r0 = 400(0x190, double:1.976E-321)
            r2.setDuration(r0)
            android.view.View r0 = r3.A07
            r0.startAnimation(r2)
        L_0x034d:
            X.6cV r1 = r3.A0B
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A00 = r0
            return
        L_0x0354:
            java.lang.Object r0 = r4.A00
            X.53k r0 = (X.C1030553k) r0
            X.C1030553k.A05(r0)
            return
        L_0x035c:
            java.lang.Object r0 = r4.A00
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            r0.forceLayout()
            android.view.View r0 = r0.getRootView()
            r0.requestLayout()
            return
        L_0x036e:
            java.lang.Object r0 = r4.A00
            X.53k r0 = (X.C1030553k) r0
            X.C1030553k.A07(r0)
            return
        L_0x0376:
            java.lang.Object r0 = r4.A00
            X.0CZ r0 = (X.AnonymousClass0CZ) r0
            r0.A06()
            return
        L_0x037e:
            java.lang.Object r1 = r4.A00
            com.whatsapp.camera.overlays.ShutterOverlay r1 = (com.whatsapp.camera.overlays.ShutterOverlay) r1
            r0 = 0
            r1.A01 = r0
            r1.invalidate()
            return
        L_0x0389:
            java.lang.Object r0 = r4.A00
            android.view.View r0 = (android.view.View) r0
            r1 = 8
        L_0x038f:
            r0.setVisibility(r1)
            return
        L_0x0393:
            java.lang.Object r0 = r4.A00
            com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment r0 = (com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment) r0
            r0.A1b()
            return
        L_0x039b:
            java.lang.Object r4 = r4.A00
            com.whatsapp.chatinfo.ContactInfoActivity r4 = (com.whatsapp.chatinfo.ContactInfoActivity) r4
            X.12O r1 = r4.A10
            X.141 r0 = r4.A0z
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0k(r0)
            X.13w r0 = (X.C223313w) r0
            com.whatsapp.jid.PhoneUserJid r3 = r1.A0A(r0)
            X.17Y r2 = r4.A05
            r1 = 33
            X.74i r0 = new X.74i
            r0.<init>(r4, r3, r1)
            r2.A0H(r0)
            return
        L_0x03ba:
            java.lang.Object r5 = r4.A00
            com.whatsapp.chatinfo.ContactInfoActivity r5 = (com.whatsapp.chatinfo.ContactInfoActivity) r5
            X.16D r4 = r5.A0G
            X.141 r0 = r5.A0z
            com.whatsapp.jid.UserJid r3 = X.C36351kA.A0k(r0)
            X.16p r7 = r4.A05
            X.141 r6 = r7.A0O(r3)
            if (r6 == 0) goto L_0x044f
            java.lang.String r0 = r6.A0J()
            r6.A0a = r0
            r0 = 0
            r6.A0P = r0
            X.14g r12 = X.C36361kB.A0g()
            X.16r r0 = r7.A00     // Catch:{ IllegalArgumentException -> 0x041e }
            X.1M0 r10 = r0.A04()     // Catch:{ IllegalArgumentException -> 0x041e }
            r0 = 3
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x0414 }
            r11.<init>(r0)     // Catch:{ all -> 0x0414 }
            java.lang.String r0 = "raw_contact_id"
            r11.putNull(r0)     // Catch:{ all -> 0x0414 }
            java.lang.String r1 = "display_name"
            java.lang.String r0 = r6.A0J()     // Catch:{ all -> 0x0414 }
            r11.put(r1, r0)     // Catch:{ all -> 0x0414 }
            java.lang.String r1 = "wa_name"
            java.lang.String r0 = r6.A0a     // Catch:{ all -> 0x0414 }
            r11.put(r1, r0)     // Catch:{ all -> 0x0414 }
            java.lang.String r9 = "wa_contacts"
            java.lang.String r8 = "jid = ?"
            java.lang.String[] r2 = X.C36441kJ.A1R()     // Catch:{ all -> 0x0414 }
            r1 = 0
            X.11F r0 = r6.A0H     // Catch:{ all -> 0x0414 }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x0414 }
            r2[r1] = r0     // Catch:{ all -> 0x0414 }
            X.C229416o.A01(r11, r10, r9, r8, r2)     // Catch:{ all -> 0x0414 }
            r10.close()     // Catch:{ IllegalArgumentException -> 0x041e }
            goto L_0x0431
        L_0x0414:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0419 }
            goto L_0x041d
        L_0x0419:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalArgumentException -> 0x041e }
        L_0x041d:
            throw r1     // Catch:{ IllegalArgumentException -> 0x041e }
        L_0x041e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "contact-mgr-db/unable to update contact "
            r1.append(r0)
            X.11F r0 = r6.A0H
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)
            X.C18740tg.A08(r0, r2)
        L_0x0431:
            X.005 r0 = r7.A08
            java.lang.Object r1 = r0.get()
            X.2ZF r1 = (X.AnonymousClass2ZF) r1
            java.util.List r0 = java.util.Collections.singletonList(r6)
            r1.A00(r0)
            r12.A00()
            android.os.Handler r2 = r4.A01
            r1 = 40
            X.1j2 r0 = new X.1j2
            r0.<init>(r4, r3, r1)
            r2.post(r0)
        L_0x044f:
            X.0xY r0 = r5.A0p
            r0.A08()
            return
        L_0x0455:
            java.lang.Object r0 = r4.A00
            com.whatsapp.chatinfo.ContactInfoActivity r0 = (com.whatsapp.chatinfo.ContactInfoActivity) r0
            com.whatsapp.chatinfo.ContactInfoActivity.A12(r0)
            return
        L_0x045d:
            java.lang.Object r0 = r4.A00
            com.whatsapp.chatinfo.ContactInfoActivity r0 = (com.whatsapp.chatinfo.ContactInfoActivity) r0
            com.whatsapp.chatinfo.ContactInfoActivity.A14(r0)
            android.os.Handler r2 = r0.A1y
            long r0 = com.whatsapp.chatinfo.ContactInfoActivity.A0u(r0)
            r2.postDelayed(r4, r0)
            return
        L_0x046e:
            java.lang.Object r0 = r4.A00
            X.4YE r0 = (X.AnonymousClass4YE) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.chatinfo.ContactInfoActivity r0 = (com.whatsapp.chatinfo.ContactInfoActivity) r0
            com.whatsapp.chatinfo.ContactInfoActivity.A10(r0)
            X.3PA r0 = r0.A0c
            r0.A01()
            return
        L_0x047f:
            java.lang.Object r0 = r4.A00
            X.2E6 r0 = (X.AnonymousClass2E6) r0
            android.widget.ListView r1 = r0.A0I
            r0 = 0
            r1.setSelectionFromTop(r0, r0)
            return
        L_0x048a:
            java.lang.Object r0 = r4.A00
            X.2EI r0 = (X.AnonymousClass2EI) r0
            X.1dx r2 = r0.A0R
            X.11F r1 = r0.A0F
            X.2oi r0 = X.C51992oi.CONTACT_INFO
            goto L_0x0504
        L_0x0495:
            java.lang.Object r2 = r4.A00
            com.whatsapp.chatlock.ChatLockPrivacySettingsActivity r2 = (com.whatsapp.chatlock.ChatLockPrivacySettingsActivity) r2
            X.3AR r0 = r2.A00
            if (r0 == 0) goto L_0x04a2
            X.1fs r1 = r0.A02
            java.lang.String r0 = "chat-lock"
            goto L_0x04e4
        L_0x04a2:
            java.lang.String r0 = "chatLockLinkUtil"
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r0)
            throw r1
        L_0x04a9:
            java.lang.Object r0 = r4.A00
            X.24b r0 = (X.AnonymousClass24b) r0
            r0.A3m()
            return
        L_0x04b1:
            java.lang.Object r0 = r4.A00
            com.whatsapp.community.CommunityHomeActivity r0 = (com.whatsapp.community.CommunityHomeActivity) r0
            X.1uf r2 = r0.A0S
            X.147 r5 = r0.A0l
            X.1hi r0 = r2.A0r
            X.C36331k8.A13(r0)
            X.0xg r0 = r2.A0d
            X.0xQ r4 = r2.A0c
            X.1Cf r3 = r2.A0V
            java.lang.String r6 = r2.A08
            X.2VT r1 = new X.2VT
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A0B(r1)
            return
        L_0x04cf:
            java.lang.Object r0 = r4.A00
            com.whatsapp.community.CommunityHomeActivity r0 = (com.whatsapp.community.CommunityHomeActivity) r0
            X.1LV r2 = r0.A0O
            X.147 r1 = r0.A0l
            r0 = 0
            r2.A0A(r1, r0)
            return
        L_0x04dc:
            java.lang.Object r2 = r4.A00
            com.whatsapp.community.CommunityNUXActivity r2 = (com.whatsapp.community.CommunityNUXActivity) r2
            X.1fs r1 = r2.A03
            java.lang.String r0 = "community-examples-article"
        L_0x04e4:
            r1.A01(r2, r0)
            return
        L_0x04e8:
            java.lang.Object r2 = r4.A00
            com.whatsapp.community.CommunityNUXActivity r2 = (com.whatsapp.community.CommunityNUXActivity) r2
            X.0xT r1 = r2.A06
            java.lang.String r0 = "625069579217642"
            android.net.Uri r0 = r1.A02(r0)
            X.C36371kC.A1A(r0, r2)
            return
        L_0x04f8:
            java.lang.Object r0 = r4.A00
            X.2Eh r0 = (X.C43132Eh) r0
            com.whatsapp.community.CommunityNavigationActivity r0 = r0.A00
            X.1dx r2 = r0.A0d
            X.11F r1 = r0.A0b
            X.2oi r0 = X.C51992oi.COMMUNITY_NAVIGATION
        L_0x0504:
            r2.A01(r1, r0)
            return
        L_0x0508:
            java.lang.Object r0 = r4.A00
            X.1uf r0 = (X.C40051uf) r0
            goto L_0x0549
        L_0x050d:
            java.lang.Object r2 = r4.A00
            X.1uf r2 = (X.C40051uf) r2
            X.0wk r1 = r2.A0t
            r0 = 35
            goto L_0x0686
        L_0x0517:
            java.lang.Object r2 = r4.A00
            X.1uf r2 = (X.C40051uf) r2
            X.C40051uf.A03(r2)
            X.1LY r1 = r2.A0j
            java.lang.String r0 = "community_events"
            r6 = 0
            boolean r0 = r1.A01(r6, r0)
            r2.A0A = r0
            com.whatsapp.group.iq.GetGroupInfoProtocolHelper r3 = r2.A0e
            X.147 r5 = r2.A0h
            X.3mo r4 = new X.3mo
            r4.<init>(r2)
            r8 = 0
            X.AnonymousClass00C.A0D(r5, r8)
            X.040 r0 = r3.A07
            com.whatsapp.group.iq.GetGroupInfoProtocolHelper$sendGetGroupInfoRequestAsync$1 r2 = new com.whatsapp.group.iq.GetGroupInfoProtocolHelper$sendGetGroupInfoRequestAsync$1
            r7 = r6
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.C36331k8.A1T(r2, r0)
            return
        L_0x0542:
            java.lang.Object r0 = r4.A00
            X.1uf r0 = (X.C40051uf) r0
            X.C40051uf.A02(r0)
        L_0x0549:
            X.C40051uf.A01(r0)
            return
        L_0x054d:
            java.lang.Object r8 = r4.A00
            X.1uf r8 = (X.C40051uf) r8
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r0 = r8.A0Q
            X.147 r1 = r8.A0h
            r5 = 0
            X.AnonymousClass00C.A0D(r1, r5)
            X.1PL r0 = r0.A05
            X.16r r0 = r0.A00
            X.1M0 r7 = r0.get()
            X.14e r4 = r7.A02     // Catch:{ all -> 0x065e }
            java.lang.String r3 = "SELECT COUNT(DISTINCT group_jid)  as count FROM member_suggested_groups_v2 WHERE parent_group_jid = ?"
            java.lang.String[] r2 = X.C36441kJ.A1R()     // Catch:{ all -> 0x065e }
            java.lang.String r0 = r1.getRawString()     // Catch:{ all -> 0x065e }
            r1 = 0
            r2[r5] = r0     // Catch:{ all -> 0x065e }
            java.lang.String r0 = "GET_DISTINCT_GROUP_SUGGESTIONS_BY_PARENT_GROUP_JID"
            android.database.Cursor r2 = r4.A09(r3, r0, r2)     // Catch:{ all -> 0x065e }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x0582
            java.lang.String r0 = "count"
            int r1 = X.C36351kA.A03(r2, r0)     // Catch:{ all -> 0x0590 }
        L_0x0582:
            r2.close()     // Catch:{ all -> 0x065e }
            r7.close()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r8.A05 = r0
            goto L_0x065a
        L_0x0590:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0592 }
        L_0x0592:
            r1 = move-exception
            X.C05600Qi.A00(r2, r0)     // Catch:{ all -> 0x065e }
            goto L_0x064f
        L_0x0598:
            java.lang.Object r8 = r4.A00
            X.1uf r8 = (X.C40051uf) r8
            X.1LV r1 = r8.A0M
            X.147 r0 = r8.A0h
            java.util.HashSet r0 = r1.A04(r0)
            X.1Xa r2 = r8.A0Z
            java.util.ArrayList r10 = X.C36321k7.A0J(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x05ae:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05b8
            X.AnonymousClass3QK.A00(r10, r1)
            goto L_0x05ae
        L_0x05b8:
            X.1Ei r7 = r2.A02
            X.0wo r0 = r2.A00
            long r4 = X.C19970wo.A00(r0)
            r9 = 0
            int r6 = r10.size()
            java.lang.String[] r3 = new java.lang.String[r6]
            r2 = 0
        L_0x05c8:
            if (r2 >= r6) goto L_0x05d8
            X.163 r1 = r7.A00
            java.lang.Object r0 = r10.get(r2)
            X.11F r0 = (X.AnonymousClass11F) r0
            X.C36331k8.A19(r1, r0, r3, r2)
            int r2 = r2 + 1
            goto L_0x05c8
        L_0x05d8:
            r0 = 974(0x3ce, float:1.365E-42)
            X.72Z r1 = new X.72Z
            r1.<init>(r3, r0)
            X.12P r0 = r7.A02
            X.1M0 r7 = r0.get()
            r2 = 0
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x065e }
        L_0x05eb:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x065e }
            if (r0 == 0) goto L_0x0650
            java.lang.Object r1 = r13.next()     // Catch:{ all -> 0x065e }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x065e }
            X.AnonymousClass00C.A0B(r1)     // Catch:{ all -> 0x065e }
            java.lang.String[] r0 = X.C36441kJ.A1R()     // Catch:{ all -> 0x065e }
            X.C36351kA.A1V(r0, r9, r4)     // Catch:{ all -> 0x065e }
            java.lang.Object[] r11 = X.AnonymousClass02Q.A06(r1, r0)     // Catch:{ all -> 0x065e }
            java.lang.String[] r11 = (java.lang.String[]) r11     // Catch:{ all -> 0x065e }
            X.14e r6 = r7.A02     // Catch:{ all -> 0x065e }
            int r1 = r10.size()     // Catch:{ all -> 0x065e }
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x065e }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x065e }
            java.lang.String r0 = ","
            java.lang.String r12 = X.C36381kD.A0x(r0, r1)     // Catch:{ all -> 0x065e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x065e }
            java.lang.String r0 = "\n        SELECT COUNT(DISTINCT message_row_id) as count\n        FROM message_event\n        WHERE\n            chat_row_id IN ("
            r1.append(r0)     // Catch:{ all -> 0x065e }
            r1.append(r12)     // Catch:{ all -> 0x065e }
            java.lang.String r0 = ")\n            AND\n            start_time > ?\n            AND\n            is_canceled = 0\n        "
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x065e }
            java.lang.String r1 = X.AnonymousClass091.A01(r0)     // Catch:{ all -> 0x065e }
            java.lang.String r0 = "GET_COUNT_OF_UPCOMING_EVENTS_IN_CHATS_QUERY_ID"
            android.database.Cursor r6 = r6.A09(r1, r0, r11)     // Catch:{ all -> 0x065e }
            boolean r0 = r6.moveToFirst()     // Catch:{ all -> 0x0649 }
            if (r0 == 0) goto L_0x0645
            java.lang.String r0 = "count"
            long r0 = X.C36351kA.A07(r6, r0)     // Catch:{ all -> 0x0649 }
            long r2 = r2 + r0
        L_0x0645:
            r6.close()     // Catch:{ all -> 0x065e }
            goto L_0x05eb
        L_0x0649:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x064b }
        L_0x064b:
            r1 = move-exception
            X.C05600Qi.A00(r6, r0)     // Catch:{ all -> 0x065e }
        L_0x064f:
            throw r1     // Catch:{ all -> 0x065e }
        L_0x0650:
            r7.close()
            int r0 = (int) r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A06 = r0
        L_0x065a:
            X.C40051uf.A01(r8)
            return
        L_0x065e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0660 }
        L_0x0660:
            r1 = move-exception
            X.C05600Qi.A00(r7, r0)
            throw r1
        L_0x0665:
            java.lang.Object r0 = r4.A00
            X.30n r0 = (X.C586530n) r0
            X.1uf r1 = r0.A00
            r0 = 1
            r1.A0A = r0
            X.C40051uf.A01(r1)
            return
        L_0x0672:
            java.lang.Object r0 = r4.A00
            X.30n r0 = (X.C586530n) r0
            X.1uf r0 = r0.A00
            X.C40051uf.A04(r0)
            return
        L_0x067c:
            java.lang.Object r0 = r4.A00
            X.30n r0 = (X.C586530n) r0
            X.1uf r2 = r0.A00
            X.0wk r1 = r2.A0t
            r0 = 34
        L_0x0686:
            A00(r1, r2, r0)
            return
        L_0x068a:
            java.lang.Object r0 = r4.A00
            X.30n r0 = (X.C586530n) r0
            X.1uf r2 = r0.A00
            X.0wk r1 = r2.A0t
            r0 = 34
            A00(r1, r2, r0)
            X.C40051uf.A01(r2)
            X.C40051uf.A03(r2)
            return
        L_0x069e:
            android.app.Activity r0 = X.C36361kB.A06(r3)
            X.01I r0 = (X.AnonymousClass01I) r0
            r0.A1q()
            android.widget.ListView r2 = r3.A0I
            r1 = 4
            X.2vQ r0 = new X.2vQ
            r0.<init>(r4, r1)
            r2.setOnScrollListener(r0)
            return
        L_0x06b3:
            java.lang.String r0 = "CommunitySubgroupsViewModel/fetchSubgroupSuggestions/failed to find hint group"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x06b9:
            long r9 = r4.A0N     // Catch:{ all -> 0x06fb }
            monitor-exit(r4)
            long r11 = java.lang.System.currentTimeMillis()
            android.database.Cursor r4 = r5.A0O(r6, r7, r9, r11)
            if (r4 != 0) goto L_0x06c7
            return
        L_0x06c7:
            boolean r2 = r4.moveToNext()     // Catch:{ all -> 0x06e4 }
            if (r2 == 0) goto L_0x06d7
            X.1A1 r2 = r3.A0m     // Catch:{ all -> 0x06e4 }
            X.3T1 r2 = r2.A01(r4, r6)     // Catch:{ all -> 0x06e4 }
            X.C40051uf.A05(r3, r2, r0)     // Catch:{ all -> 0x06e4 }
            goto L_0x06c7
        L_0x06d7:
            r4.close()
            X.1A1 r2 = r3.A0m
            X.3T1 r2 = X.C36421kH.A0R(r2, r9)
            X.C40051uf.A05(r3, r2, r0)
            return
        L_0x06e4:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x06e9 }
            throw r1
        L_0x06e9:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x06ee:
            long r0 = r4.A0J     // Catch:{ all -> 0x06fb }
            monitor-exit(r4)
            r2.A01 = r0
            X.1LV r1 = r2.A0M
            X.3Qp r0 = r2.A03
            r1.A09(r0)
            return
        L_0x06fb:
            r1 = move-exception
            monitor-exit(r4)
            throw r1
        L_0x06fe:
            com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper r10 = r5.A0P
            X.3eU r11 = new X.3eU
            r11.<init>(r5)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0715
            java.lang.Object r0 = r4.get(r3)
            X.3QK r0 = (X.AnonymousClass3QK) r0
            com.whatsapp.jid.GroupJid r13 = r0.A02
            X.147 r13 = (X.AnonymousClass147) r13
        L_0x0715:
            X.040 r0 = r10.A02
            r15 = 0
            com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequestAsync$1 r9 = new com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequestAsync$1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            X.C36331k8.A1T(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81323wp.run():void");
    }

    public C81323wp(ContactInfoActivity contactInfoActivity, int i) {
        this.A01 = i;
        switch (i) {
            case 12:
            case 13:
            case 14:
                this.A00 = contactInfoActivity;
                return;
            default:
                this.A00 = contactInfoActivity;
                return;
        }
    }

    public C81323wp(AnonymousClass6YT r1, int i) {
        this.A01 = i;
        if (i != 0) {
            this.A00 = r1;
        } else {
            this.A00 = r1;
        }
    }

    public C81323wp(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
