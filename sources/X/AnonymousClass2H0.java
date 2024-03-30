package X;

import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;

/* renamed from: X.2H0  reason: invalid class name */
public class AnonymousClass2H0 extends AnonymousClass28f {
    public C207109uZ A00;
    public final C24801Dv A01;
    public final C19730wQ A02;
    public final C63553Km A03;
    public final AnonymousClass1KK A04;
    public final AnonymousClass9Y1 A05;
    public final C199439fJ A06;
    public final AnonymousClass1NV A07;
    public final AnonymousClass16D A08;
    public final C229516p A09;
    public final AnonymousClass1LL A0A;
    public final AnonymousClass54F A0B;
    public final AnonymousClass1YG A0C;
    public final C20810yC A0D;
    public final C20500xf A0E;
    public final AnonymousClass1CF A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final C19460v5 A0I;
    public final C32691e2 A0J;
    public final AnonymousClass1NG A0K;
    public final C33201et A0L;
    public final AnonymousClass185 A0M;
    public final AnonymousClass171 A0N;
    public final C24541Cv A0O;
    public final AnonymousClass1LU A0P;
    public final C589031m A0Q;
    public final C21010yW A0R;
    public final C32901eN A0S;
    public final AnonymousClass1EV A0T;
    public final AnonymousClass39O A0U;
    public final C64263Nh A0V;
    public final C230116v A0W;
    public final AnonymousClass13J A0X;
    public final C19770wU A0Y;
    public final AnonymousClass62F A0Z;

    private boolean A04() {
        if (!this.A0B.BMz()) {
            AnonymousClass11F r2 = this.A0G;
            AnonymousClass1MK r0 = this.A0A;
            C19730wQ r1 = this.A02;
            if (r2 == null || r0.A00() || r1.A0M(r2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
        if (X.C36391kE.A1X(r8.A0D) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x023d, code lost:
        if (r8.A0A.A01(r7) != null) goto L_0x023f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BUv(android.view.Menu r20) {
        /*
            r19 = this;
            r10 = r20
            boolean r0 = r10 instanceof X.C016307a
            r9 = 1
            r8 = r19
            if (r0 == 0) goto L_0x0016
            X.0yC r0 = r8.A0D
            boolean r0 = X.C36361kB.A1Y(r0)
            if (r0 == 0) goto L_0x0016
            r0 = r10
            X.07a r0 = (X.C016307a) r0
            r0.A0C = r9
        L_0x0016:
            java.lang.String r0 = "contactconversationmenu/oncreateoptionsmenu"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wQ r1 = r8.A02
            X.11F r7 = r8.A0G
            r1.A0M(r7)
            X.0xf r0 = r8.A0E
            boolean r18 = X.AnonymousClass3M3.A01(r0, r7)
            X.1CF r0 = r8.A0F
            boolean r17 = r0.A02(r7)
            boolean r0 = r1.A0M(r7)
            r6 = 0
            if (r0 == 0) goto L_0x003f
            X.0yC r0 = r8.A0D
            boolean r0 = X.C36391kE.A1X(r0)
            r16 = 1
            if (r0 != 0) goto L_0x0041
        L_0x003f:
            r16 = 0
        L_0x0041:
            X.141 r0 = r8.A00
            boolean r3 = r0.A0E()
            X.1EV r1 = r8.A0T
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x0065
            int r0 = r1.A05(r7)
            if (r0 != r9) goto L_0x0065
            X.1KK r2 = r8.A04
            X.141 r0 = r8.A00
            com.whatsapp.jid.UserJid r1 = X.C36351kA.A0l(r0)
            X.3dB r0 = new X.3dB
            r0.<init>(r8)
            r2.A0C(r0, r1)
        L_0x0065:
            if (r18 != 0) goto L_0x00b0
            if (r16 != 0) goto L_0x00b0
            if (r17 != 0) goto L_0x00b0
            if (r3 != 0) goto L_0x00b0
            boolean r0 = r8.A0H
            if (r0 != 0) goto L_0x00b0
            X.141 r0 = r8.A00
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0262
            X.0yC r1 = r8.A0D
            r0 = 1464(0x5b8, float:2.052E-42)
            boolean r4 = r1.A0E(r0)
            r0 = 4067(0xfe3, float:5.699E-42)
            int r3 = r1.A07(r0)
            r2 = r7
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.1KK r1 = r8.A04
            X.3UI r0 = new X.3UI
            r0.<init>(r10, r8, r6)
            r1.A0C(r0, r2)
            X.185 r1 = r8.A0M
            X.141 r0 = r8.A00
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0l(r0)
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0230
            if (r3 < r9) goto L_0x00ab
            X.0wU r1 = r8.A0Y
            r0 = 29
            X.C80273v8.A00(r1, r8, r10, r0)
        L_0x00ab:
            if (r4 == 0) goto L_0x00b0
            A03(r10, r8)
        L_0x00b0:
            boolean r4 = r8.A0H
            if (r4 != 0) goto L_0x00bf
            r2 = 21
            r1 = 2131895674(0x7f12257a, float:1.9426188E38)
            r0 = 2131234276(0x7f080de4, float:1.8084713E38)
            r8.A0D(r10, r2, r1, r0)
        L_0x00bf:
            if (r16 == 0) goto L_0x00d5
            X.16p r1 = r8.A09
            X.141 r0 = r8.A00
            com.whatsapp.jid.Jid r0 = X.C36411kG.A0h(r0)
            X.141 r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r0.A0B()
            if (r0 != 0) goto L_0x00e2
        L_0x00d5:
            if (r4 != 0) goto L_0x00e2
            r2 = 22
            r1 = 2131886384(0x7f120130, float:1.9407345E38)
            r0 = 2131234276(0x7f080de4, float:1.8084713E38)
            r8.A0D(r10, r2, r1, r0)
        L_0x00e2:
            X.141 r0 = r8.A00
            boolean r0 = r0.A0C()
            r2 = 5
            r11 = 23
            r5 = 12
            r12 = 9
            r3 = 24
            r13 = 4
            r14 = 7
            r15 = 6
            if (r0 == 0) goto L_0x0196
            if (r18 != 0) goto L_0x0103
            if (r17 != 0) goto L_0x0103
            r1 = 2131893610(0x7f121d6a, float:1.9422001E38)
            r0 = 2131232812(0x7f08082c, float:1.8081744E38)
            r8.A0D(r10, r12, r1, r0)
        L_0x0103:
            if (r16 != 0) goto L_0x0110
            if (r17 != 0) goto L_0x0110
            r1 = 2131886885(0x7f120325, float:1.9408361E38)
            r0 = 2131234041(0x7f080cf9, float:1.8084237E38)
            r8.A0D(r10, r11, r1, r0)
        L_0x0110:
            r1 = 2131895166(0x7f12237e, float:1.9425157E38)
            r0 = 2131234041(0x7f080cf9, float:1.8084237E38)
            r8.A0D(r10, r3, r1, r0)
            r1 = 2131896951(0x7f122a77, float:1.9428778E38)
            r0 = 2131231838(0x7f08045e, float:1.8079768E38)
            r8.A0D(r10, r14, r1, r0)
            if (r16 != 0) goto L_0x012e
            int r1 = r8.A0C()
            r0 = 2131231814(0x7f080446, float:1.807972E38)
            r8.A0D(r10, r13, r1, r0)
        L_0x012e:
            X.141 r0 = r8.A00
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r0.A06(r3)
            if (r0 == 0) goto L_0x0153
            X.1Jx r1 = r8.A0I
            X.141 r0 = r8.A00
            com.whatsapp.jid.Jid r0 = X.C36381kD.A0e(r0, r3)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0153
            if (r4 != 0) goto L_0x0153
            r1 = 2131889232(0x7f120c50, float:1.9413122E38)
            r0 = 2131232346(0x7f08065a, float:1.8080799E38)
            r8.A0D(r10, r5, r1, r0)
        L_0x0153:
            r1 = 2131896107(0x7f12272b, float:1.9427066E38)
            r0 = 2131232779(0x7f08080b, float:1.8081677E38)
            r8.A0D(r10, r2, r1, r0)
            r0 = 2131896785(0x7f1229d1, float:1.9428441E38)
            android.view.SubMenu r2 = r10.addSubMenu(r6, r9, r6, r0)
            r2.clearHeader()
            r2.clearHeader()
            r1 = 2131895681(0x7f122581, float:1.9426202E38)
            r0 = 2131232734(0x7f0807de, float:1.8081586E38)
            r8.A0D(r2, r15, r1, r0)
            r8.A0G(r2)
            r8.A0E(r2)
            r8.A0F(r2)
        L_0x017b:
            X.16v r2 = r8.A0W
            X.AnonymousClass00C.A0D(r7, r6)
            boolean r0 = X.AnonymousClass143.A0I(r7)
            if (r0 == 0) goto L_0x0195
            X.0yC r1 = r2.A01
            r0 = 3519(0xdbf, float:4.931E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0195
            X.0wQ r0 = r2.A00
            r0.A0L()
        L_0x0195:
            return
        L_0x0196:
            r1 = 2131895681(0x7f122581, float:1.9426202E38)
            r0 = 2131232734(0x7f0807de, float:1.8081586E38)
            r8.A0D(r10, r15, r1, r0)
            if (r4 != 0) goto L_0x01aa
            r1 = 2131896951(0x7f122a77, float:1.9428778E38)
            r0 = 2131231838(0x7f08045e, float:1.8079768E38)
            r8.A0D(r10, r14, r1, r0)
        L_0x01aa:
            if (r16 != 0) goto L_0x01b6
            int r1 = r8.A0C()
            r0 = 2131231814(0x7f080446, float:1.807972E38)
            r8.A0D(r10, r13, r1, r0)
        L_0x01b6:
            X.141 r0 = r8.A00
            java.lang.Class<com.whatsapp.jid.UserJid> r13 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r0.A06(r13)
            if (r0 == 0) goto L_0x01db
            X.1Jx r1 = r8.A0I
            X.141 r0 = r8.A00
            com.whatsapp.jid.Jid r0 = X.C36381kD.A0e(r0, r13)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x01db
            if (r4 != 0) goto L_0x01db
            r1 = 2131889232(0x7f120c50, float:1.9413122E38)
            r0 = 2131232346(0x7f08065a, float:1.8080799E38)
            r8.A0D(r10, r5, r1, r0)
        L_0x01db:
            if (r4 != 0) goto L_0x022e
            r1 = 2131896107(0x7f12272b, float:1.9427066E38)
            r0 = 2131232779(0x7f08080b, float:1.8081677E38)
            r8.A0D(r10, r2, r1, r0)
            r0 = 2131896785(0x7f1229d1, float:1.9428441E38)
            android.view.SubMenu r5 = r10.addSubMenu(r6, r9, r6, r0)
            r5.clearHeader()
            r5.clearHeader()
        L_0x01f3:
            if (r16 != 0) goto L_0x0211
            if (r17 != 0) goto L_0x0211
            r2 = r5
            if (r4 == 0) goto L_0x01fb
            r2 = r10
        L_0x01fb:
            r1 = 2131893610(0x7f121d6a, float:1.9422001E38)
            r0 = 2131232812(0x7f08082c, float:1.8081744E38)
            r8.A0D(r2, r12, r1, r0)
            r2 = r5
            if (r4 == 0) goto L_0x0208
            r2 = r10
        L_0x0208:
            r1 = 2131886885(0x7f120325, float:1.9408361E38)
            r0 = 2131234041(0x7f080cf9, float:1.8084237E38)
            r8.A0D(r2, r11, r1, r0)
        L_0x0211:
            r2 = r5
            if (r4 == 0) goto L_0x0215
            r2 = r10
        L_0x0215:
            r1 = 2131895166(0x7f12237e, float:1.9425157E38)
            r0 = 2131234041(0x7f080cf9, float:1.8084237E38)
            r8.A0D(r2, r3, r1, r0)
            if (r4 != 0) goto L_0x0221
            r10 = r5
        L_0x0221:
            r8.A0G(r10)
            if (r4 != 0) goto L_0x017b
            r8.A0E(r5)
            r8.A0F(r5)
            goto L_0x017b
        L_0x022e:
            r5 = 0
            goto L_0x01f3
        L_0x0230:
            boolean r0 = r8.A04()
            if (r0 == 0) goto L_0x023f
            X.1LL r0 = r8.A0A
            com.whatsapp.jid.UserJid r0 = r0.A01(r7)
            r4 = 1
            if (r0 == 0) goto L_0x0240
        L_0x023f:
            r4 = 0
        L_0x0240:
            r3 = 2131896373(0x7f122835, float:1.9427605E38)
            r1 = 28
            r0 = 5
            android.view.MenuItem r1 = r10.add(r6, r1, r0, r3)
            r0 = 2131231818(0x7f08044a, float:1.8079728E38)
            android.view.MenuItem r2 = r1.setIcon(r0)
            r0 = 2131624153(0x7f0e00d9, float:1.8875478E38)
            android.view.View r1 = X.C36441kJ.A0R(r2, r0)
            X.01L r0 = r8.A05
            X.C36331k8.A0q(r0, r1, r3)
            X.AnonymousClass28f.A01(r2, r8, r3, r4)
            goto L_0x00b0
        L_0x0262:
            boolean r5 = r8.A04()
            r4 = 2131886548(0x7f1201d4, float:1.9407678E38)
            r3 = 2
            r11 = 26
            r1 = 2131895636(0x7f122554, float:1.942611E38)
            r2 = 2131895636(0x7f122554, float:1.942611E38)
            r0 = 2131233878(0x7f080c56, float:1.8083906E38)
            android.view.MenuItem r1 = r8.A0D(r10, r11, r1, r0)
            r0 = 2131626446(0x7f0e09ce, float:1.8880128E38)
            r1.setActionView(r0)
            r8.A0I(r1, r2, r5)
            r1.setShowAsAction(r3)
            r1 = 25
            r0 = 2131231779(0x7f080423, float:1.8079649E38)
            android.view.MenuItem r2 = r8.A0D(r10, r1, r4, r0)
            r0 = 2131624137(0x7f0e00c9, float:1.8875445E38)
            android.view.View r1 = X.C36441kJ.A0R(r2, r0)
            X.01L r0 = r8.A05
            X.C36331k8.A0q(r0, r1, r4)
            r8.A0I(r2, r4, r5)
            r2.setShowAsAction(r3)
            goto L_0x00b0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2H0.BUv(android.view.Menu):void");
    }

    public static void A03(Menu menu, AnonymousClass2H0 r6) {
        boolean A042 = r6.A04();
        MenuItem A0D2 = r6.A0D(menu, 25, R.string.f12nameremoved, R.drawable.ic_action_call);
        C36331k8.A0q(r6.A05, C36441kJ.A0R(A0D2, R.layout.f9nameremoved), R.string.f12nameremoved);
        AnonymousClass28f.A01(A0D2, r6, R.string.f12nameremoved, A042);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007b, code lost:
        r2.Btm(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0102, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bbx(android.view.MenuItem r13) {
        /*
            r12 = this;
            int r2 = r13.getItemId()
            r1 = 11
            r0 = 1
            if (r2 == r1) goto L_0x0216
            r1 = 15
            r4 = 2
            if (r2 == r1) goto L_0x01b8
            r1 = 34
            if (r2 == r1) goto L_0x01a2
            java.lang.String r5 = "overflow_menu_block"
            r8 = 0
            switch(r2) {
                case 21: goto L_0x0181;
                case 22: goto L_0x0164;
                case 23: goto L_0x0040;
                case 24: goto L_0x0139;
                case 25: goto L_0x011e;
                case 26: goto L_0x0103;
                case 27: goto L_0x00d2;
                case 28: goto L_0x001d;
                case 29: goto L_0x00e9;
                case 30: goto L_0x0099;
                case 31: goto L_0x0087;
                case 32: goto L_0x007f;
                default: goto L_0x0018;
            }
        L_0x0018:
            boolean r0 = super.Bbx(r13)
            return r0
        L_0x001d:
            X.1YG r3 = r12.A0C
            X.11F r1 = r12.A0G
            com.whatsapp.jid.UserJid r2 = X.C36401kF.A0b(r1)
            r1 = 8
            X.AnonymousClass1YG.A01(r3, r2, r1)
            X.3Nh r2 = r12.A0V
            r1 = 9
            X.C64263Nh.A00(r2, r1)
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment r1 = new com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment
            r1.<init>()
            r1.A17(r2)
            X.14r r2 = r12.A06
            goto L_0x007b
        L_0x0040:
            X.11F r1 = r12.A0G
            com.whatsapp.jid.UserJid r6 = X.C36401kF.A0b(r1)
            X.C18740tg.A06(r6)
            X.141 r1 = r12.A00
            boolean r1 = r1.A0C()
            if (r1 == 0) goto L_0x0068
            X.01L r5 = r12.A05
            X.0yC r2 = r12.A0D
            X.AnonymousClass00C.A0D(r2, r8)
            r1 = 6185(0x1829, float:8.667E-42)
            boolean r9 = r2.A0E(r1)
            java.lang.String r7 = "biz_overflow_menu_block"
            r10 = 0
            r11 = 0
            android.content.Intent r1 = X.AnonymousClass190.A0x(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0237
        L_0x0068:
            X.1et r1 = r12.A0L
            X.3F5 r1 = r1.B3t(r6, r5)
            r1.A04 = r0
            r1.A05 = r8
            r1.A01(r8, r0)
            X.14r r2 = r12.A06
            com.whatsapp.blockui.BlockConfirmationDialogFragment r1 = X.AnonymousClass3F5.A00(r1)
        L_0x007b:
            r2.Btm(r1)
            return r0
        L_0x007f:
            X.0wU r2 = r12.A0Y
            r1 = 17
            X.C80223v3.A02(r2, r12, r1)
            return r0
        L_0x0087:
            X.0v5 r2 = r12.A0I
            boolean r1 = r2.A05()
            if (r1 == 0) goto L_0x0102
            r2.A02()
            java.lang.String r0 = "showChatAssignmentPicker"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0099:
            android.view.View r2 = r13.getActionView()
            r1 = 2131434565(0x7f0b1c45, float:1.8490948E38)
            java.lang.Object r3 = r2.getTag(r1)
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x0102
            X.1e2 r2 = r12.A0J
            X.01L r1 = r12.A05
            X.C36331k8.A0t(r1, r2, r3)
            X.62F r1 = r12.A0Z
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x0102
            X.2Q2 r2 = new X.2Q2
            r2.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r2.A01 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2.A00 = r1
            X.0yW r1 = r12.A0R
            r1.Bly(r2)
            return r0
        L_0x00d2:
            X.0v5 r2 = r12.A01
            boolean r1 = r2.A05()
            if (r1 == 0) goto L_0x0102
            r2.A02()
            X.0v5 r0 = r12.A02
            r0.A02()
            java.lang.String r0 = "getLabelChatMenuItem"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x00e9:
            X.1YG r4 = r12.A0C
            X.11F r3 = r12.A0G
            com.whatsapp.jid.UserJid r2 = X.C36401kF.A0b(r3)
            r1 = 9
            X.AnonymousClass1YG.A01(r4, r2, r1)
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.1KK r2 = r12.A04
            X.3UI r1 = new X.3UI
            r1.<init>(r3, r12, r0)
            r2.A0C(r1, r3)
        L_0x0102:
            return r0
        L_0x0103:
            X.1YG r3 = r12.A0C
            X.11F r1 = r12.A0G
            com.whatsapp.jid.UserJid r2 = X.C36401kF.A0b(r1)
            r1 = 8
            X.AnonymousClass1YG.A01(r3, r2, r1)
            X.3Nh r2 = r12.A0V
            r1 = 7
            X.C64263Nh.A00(r2, r1)
            X.4V7 r2 = r12.A0B
            X.141 r1 = r12.A00
            r2.BmB(r1, r0, r8)
            return r0
        L_0x011e:
            X.1YG r3 = r12.A0C
            X.11F r1 = r12.A0G
            com.whatsapp.jid.UserJid r2 = X.C36401kF.A0b(r1)
            r1 = 8
            X.AnonymousClass1YG.A01(r3, r2, r1)
            X.3Nh r2 = r12.A0V
            r1 = 6
            X.C64263Nh.A00(r2, r1)
            X.4V7 r2 = r12.A0B
            X.141 r1 = r12.A00
            r2.BmB(r1, r8, r8)
            return r0
        L_0x0139:
            X.141 r1 = r12.A00
            boolean r1 = r1.A0C()
            if (r1 == 0) goto L_0x0143
            java.lang.String r5 = "biz_overflow_menu_block"
        L_0x0143:
            X.1NG r3 = r12.A0K
            X.01L r2 = r12.A05
            X.141 r1 = r12.A00
            r3.A0G(r2, r1, r5, r8)
            X.0xf r3 = r12.A0E
            X.0wU r6 = r12.A0Y
            X.0yW r4 = r12.A0R
            X.1Cv r2 = r12.A0O
            X.141 r1 = r12.A00
            X.11F r5 = X.C36351kA.A0j(r1)
            java.lang.Integer r7 = X.C36371kC.A0o()
            r9 = 2
            r8 = 0
            X.C65093Qs.A01(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0164:
            X.1YG r4 = r12.A0C
            X.11F r1 = r12.A0G
            com.whatsapp.jid.UserJid r3 = X.C36401kF.A0b(r1)
            X.0yC r2 = r4.A03
            r1 = 2805(0xaf5, float:3.93E-42)
            boolean r1 = r2.A0E(r1)
            if (r1 == 0) goto L_0x017b
            r1 = 20
            X.AnonymousClass1YG.A01(r4, r3, r1)
        L_0x017b:
            X.4V7 r1 = r12.A0B
            r1.B0m()
            return r0
        L_0x0181:
            X.01L r4 = r12.A05
            r1 = 2131434890(0x7f0b1d8a, float:1.8491607E38)
            android.view.View r2 = r4.findViewById(r1)
            X.3CG r1 = r12.A09
            android.os.Bundle r3 = X.AnonymousClass3CG.A00(r4, r2, r1)
            X.141 r1 = r12.A00
            com.whatsapp.jid.UserJid r2 = X.C36351kA.A0k(r1)
            java.lang.Integer r1 = X.C36371kC.A0n()
            android.content.Intent r1 = X.AnonymousClass190.A0w(r4, r2, r1, r0, r8)
            X.C05290Pd.A00(r4, r1, r3)
            return r0
        L_0x01a2:
            X.54F r1 = r12.A0B
            X.01L r2 = r12.A05
            java.lang.String r5 = ""
            r3 = 0
            X.9uL r4 = new X.9uL
            r4.<init>(r5, r3)
            java.lang.String r6 = X.C36361kB.A0l()
            r7 = -1
            r1.A0G(r2, r3, r4, r5, r6, r7)
            return r0
        L_0x01b8:
            X.1EV r1 = r12.A0T
            X.11F r2 = r12.A0G
            int r1 = r1.A05(r2)
            if (r1 != r4) goto L_0x01e4
            X.16D r1 = r12.A08
            X.141 r1 = r1.A0D(r2)
            java.lang.String r3 = r1.A0J()
            X.01L r4 = r12.A05
            r2 = 2131891928(0x7f1216d8, float:1.941859E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r3 = X.C36381kD.A0r(r4, r3, r1, r2)
            X.14r r2 = r12.A06
            r1 = 2131891929(0x7f1216d9, float:1.9418592E38)
            java.lang.String r1 = r4.getString(r1)
            r2.BO7(r1, r3)
            return r0
        L_0x01e4:
            X.39O r3 = r12.A0U
            X.0wQ r2 = r12.A02
            java.lang.String r4 = "merchant_initiated"
            com.whatsapp.jid.PhoneUserJid r1 = X.C36441kJ.A0n(r2)
            if (r1 != 0) goto L_0x0207
            X.0yW r3 = r12.A0R
            X.2Pf r2 = new X.2Pf
            r2.<init>()
            java.lang.Integer r1 = X.C36371kC.A0p()
            r2.A00 = r1
            java.lang.String r1 = "order_details_creation"
            r2.A01 = r1
            r2.A02 = r4
            r3.Bly(r2)
            return r0
        L_0x0207:
            X.0v5 r0 = r3.A00
            r0.A02()
            r2.A0G()
            java.lang.String r0 = "getCreateOrderActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0216:
            X.1eN r1 = r12.A0S
            r3 = 5
            r1.A00(r3)
            X.01L r5 = r12.A05
            android.content.Context r2 = r5.getApplicationContext()
            X.141 r1 = r12.A00
            com.whatsapp.jid.Jid r1 = X.C36431kI.A0h(r1)
            java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = r1.getRawString()
            java.util.List r1 = java.util.Collections.singletonList(r1)
            android.content.Intent r1 = X.AnonymousClass190.A1O(r2, r1, r3)
        L_0x0237:
            r5.startActivity(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2H0.Bbx(android.view.MenuItem):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        if (X.C36391kE.A1X(r7.A0D) == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BdM(android.view.Menu r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "contactconversationmenu/onprepareoptionsmenu "
            r1.append(r0)
            int r0 = r8.size()
            X.C36321k7.A1Y(r1, r0)
            int r0 = r8.size()
            r2 = 0
            if (r0 != 0) goto L_0x0018
            return r2
        L_0x0018:
            X.0wQ r5 = r7.A02
            X.11F r3 = r7.A0G
            boolean r0 = r5.A0M(r3)
            if (r0 == 0) goto L_0x002b
            X.0yC r0 = r7.A0D
            boolean r0 = X.C36391kE.A1X(r0)
            r6 = 1
            if (r0 != 0) goto L_0x0034
        L_0x002b:
            r6 = 0
            r0 = 4
            android.view.MenuItem r0 = r8.findItem(r0)
            r7.A0H(r0)
        L_0x0034:
            r1 = 21
            X.141 r0 = r7.A00
            X.3IL r0 = r0.A0F
            if (r0 == 0) goto L_0x003d
            r2 = 1
        L_0x003d:
            X.AnonymousClass28f.A00(r8, r1, r2)
            if (r6 == 0) goto L_0x0056
            X.16p r1 = r7.A09
            X.141 r0 = r7.A00
            com.whatsapp.jid.Jid r0 = X.C36411kG.A0h(r0)
            X.141 r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x0056
            boolean r0 = r0.A0B()
            if (r0 != 0) goto L_0x0096
        L_0x0056:
            r2 = 22
            X.141 r4 = r7.A00
            X.3IL r0 = r4.A0F
            if (r0 != 0) goto L_0x00b7
            boolean r0 = X.C36431kI.A1W(r4)
            if (r0 != 0) goto L_0x00b7
            boolean r0 = X.C36441kJ.A1J(r5)
            if (r0 == 0) goto L_0x00b7
            X.0xf r1 = r7.A0E
            X.11F r0 = r4.A0H
            boolean r0 = X.AnonymousClass3M3.A01(r1, r0)
            if (r0 != 0) goto L_0x00b7
            X.1CF r1 = r7.A0F
            X.11F r0 = r4.A0H
            boolean r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x00b7
            boolean r0 = r7.A0G
            if (r0 != 0) goto L_0x00b7
            X.1NV r1 = r7.A07
            boolean r0 = r4.A0E()
            if (r0 == 0) goto L_0x0092
            X.0yC r0 = r1.A01
            boolean r0 = X.C55942vR.A00(r0)
            if (r0 != 0) goto L_0x00b7
        L_0x0092:
            r0 = 1
        L_0x0093:
            X.AnonymousClass28f.A00(r8, r2, r0)
        L_0x0096:
            X.1NG r0 = r7.A0K
            boolean r2 = X.C36351kA.A1X(r0, r3)
            if (r6 != 0) goto L_0x00ad
            X.1CF r0 = r7.A0F
            boolean r0 = r0.A02(r3)
            if (r0 != 0) goto L_0x00ad
            r1 = 23
            r0 = r2 ^ 1
            X.AnonymousClass28f.A00(r8, r1, r0)
        L_0x00ad:
            r0 = 24
            X.AnonymousClass28f.A00(r8, r0, r2)
            boolean r0 = super.BdM(r8)
            return r0
        L_0x00b7:
            r0 = 0
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2H0.BdM(android.view.Menu):boolean");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2H0(X.AnonymousClass01L r39, X.C19460v5 r40, X.C19460v5 r41, X.C19460v5 r42, X.C19460v5 r43, X.C24801Dv r44, X.AnonymousClass3C4 r45, X.AnonymousClass3C5 r46, X.C58012zB r47, X.C225014r r48, X.AnonymousClass17Y r49, X.C32691e2 r50, X.C19730wQ r51, X.C21100yf r52, X.AnonymousClass1X4 r53, X.AnonymousClass3CG r54, X.C63553Km r55, X.AnonymousClass1KK r56, X.AnonymousClass9Y1 r57, X.C199439fJ r58, X.AnonymousClass1NG r59, X.C33201et r60, X.AnonymousClass1NV r61, X.AnonymousClass1MK r62, X.C24361Cd r63, X.AnonymousClass1AO r64, X.AnonymousClass16D r65, X.C229516p r66, X.AnonymousClass16I r67, X.AnonymousClass185 r68, X.AnonymousClass171 r69, X.AnonymousClass9RO r70, X.AnonymousClass4V7 r71, X.AnonymousClass1LL r72, X.AnonymousClass1NM r73, X.AnonymousClass54F r74, X.C19420v0 r75, X.C18820ts r76, X.AnonymousClass1YG r77, X.C220412q r78, X.AnonymousClass1A5 r79, X.C24541Cv r80, X.AnonymousClass141 r81, X.C236419g r82, X.AnonymousClass1LU r83, X.C589031m r84, X.C20810yC r85, X.C20500xf r86, X.C21010yW r87, X.C233117z r88, X.C32901eN r89, X.AnonymousClass1CF r90, X.AnonymousClass11F r91, X.C32641dx r92, X.AnonymousClass1EV r93, X.AnonymousClass39O r94, X.AnonymousClass1CR r95, X.C64263Nh r96, X.C26371Jx r97, X.C230116v r98, X.AnonymousClass13J r99, X.C19770wU r100, X.AnonymousClass62F r101) {
        /*
            r38 = this;
            r4 = r38
            r36 = r97
            r35 = r95
            r11 = r47
            r10 = r46
            r9 = r45
            r5 = r39
            r15 = r52
            r16 = r53
            r17 = r54
            r8 = r43
            r18 = r62
            r0 = r100
            r7 = r41
            r6 = r40
            r21 = r67
            r20 = r64
            r19 = r63
            r12 = r48
            r13 = r49
            r14 = r51
            r22 = r71
            r23 = r73
            r24 = r75
            r25 = r76
            r26 = r78
            r27 = r79
            r3 = r81
            r29 = r82
            r2 = r85
            r1 = r86
            r32 = r88
            r33 = r91
            r34 = r92
            r28 = r3
            r30 = r2
            r31 = r1
            r37 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r4.A0D = r2
            r4.A02 = r14
            r4.A0Y = r0
            r0 = r87
            r4.A0R = r0
            r4.A0E = r1
            r0 = r50
            r4.A0J = r0
            r0 = r44
            r4.A01 = r0
            r0 = r65
            r4.A08 = r0
            r0 = r99
            r4.A0X = r0
            r0 = r69
            r4.A0N = r0
            r0 = r101
            r4.A0Z = r0
            r0 = r59
            r4.A0K = r0
            r0 = r80
            r4.A0O = r0
            r0 = r94
            r4.A0U = r0
            r0 = r89
            r4.A0S = r0
            r0 = r68
            r4.A0M = r0
            r0 = r83
            r4.A0P = r0
            r0 = r55
            r4.A03 = r0
            r0 = r93
            r4.A0T = r0
            r0 = r56
            r4.A04 = r0
            r0 = r57
            r4.A05 = r0
            r0 = r66
            r4.A09 = r0
            r0 = r98
            r4.A0W = r0
            r0 = r61
            r4.A07 = r0
            r0 = r96
            r4.A0V = r0
            r0 = r72
            r4.A0A = r0
            r0 = r58
            r4.A06 = r0
            r0 = r77
            r4.A0C = r0
            r0 = r42
            r4.A0I = r0
            r0 = r90
            r4.A0F = r0
            r0 = r70
            boolean r0 = r0.A00(r3)
            r4.A0G = r0
            r0 = r84
            r4.A0Q = r0
            r0 = r74
            r4.A0B = r0
            r0 = r60
            r4.A0L = r0
            boolean r0 = X.AnonymousClass143.A0H(r33)
            r4.A0H = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2H0.<init>(X.01L, X.0v5, X.0v5, X.0v5, X.0v5, X.1Dv, X.3C4, X.3C5, X.2zB, X.14r, X.17Y, X.1e2, X.0wQ, X.0yf, X.1X4, X.3CG, X.3Km, X.1KK, X.9Y1, X.9fJ, X.1NG, X.1et, X.1NV, X.1MK, X.1Cd, X.1AO, X.16D, X.16p, X.16I, X.185, X.171, X.9RO, X.4V7, X.1LL, X.1NM, X.54F, X.0v0, X.0ts, X.1YG, X.12q, X.1A5, X.1Cv, X.141, X.19g, X.1LU, X.31m, X.0yC, X.0xf, X.0yW, X.17z, X.1eN, X.1CF, X.11F, X.1dx, X.1EV, X.39O, X.1CR, X.3Nh, X.1Jx, X.16v, X.13J, X.0wU, X.62F):void");
    }
}
