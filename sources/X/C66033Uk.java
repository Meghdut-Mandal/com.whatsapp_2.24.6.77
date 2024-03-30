package X;

/* renamed from: X.3Uk  reason: invalid class name and case insensitive filesystem */
public class C66033Uk implements AnonymousClass04S {
    public Object A00;
    public final int A01;

    public C66033Uk(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass012 r1, C001600r r2, Object obj, int i) {
        r2.A08(r1, new C66033Uk(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x032c, code lost:
        if (r4.getLastVisiblePosition() >= (r4.getCount() - 2)) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x08a9, code lost:
        if (r4 != null) goto L_0x086f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c8, code lost:
        if (r0 == false) goto L_0x022a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BTH(java.lang.Object r28) {
        /*
            r27 = this;
            r3 = r28
            r1 = r27
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x06f1;
                case 1: goto L_0x000f;
                case 2: goto L_0x06ff;
                case 3: goto L_0x072d;
                case 4: goto L_0x0264;
                case 5: goto L_0x0273;
                case 6: goto L_0x0735;
                case 7: goto L_0x073f;
                case 8: goto L_0x0749;
                case 9: goto L_0x075d;
                case 10: goto L_0x0765;
                case 11: goto L_0x02ef;
                case 12: goto L_0x03d4;
                case 13: goto L_0x0523;
                case 14: goto L_0x053a;
                case 15: goto L_0x0779;
                case 16: goto L_0x0009;
                case 17: goto L_0x0009;
                case 18: goto L_0x0009;
                case 19: goto L_0x0009;
                case 20: goto L_0x0009;
                case 21: goto L_0x0009;
                case 22: goto L_0x0009;
                case 23: goto L_0x0009;
                case 24: goto L_0x0009;
                case 25: goto L_0x07b7;
                case 26: goto L_0x0009;
                case 27: goto L_0x0009;
                case 28: goto L_0x0576;
                case 29: goto L_0x07c1;
                case 30: goto L_0x05b8;
                case 31: goto L_0x07fb;
                case 32: goto L_0x07fb;
                case 33: goto L_0x07fb;
                case 34: goto L_0x07fb;
                case 35: goto L_0x0801;
                case 36: goto L_0x0801;
                case 37: goto L_0x0608;
                case 38: goto L_0x0622;
                case 39: goto L_0x0638;
                case 40: goto L_0x0807;
                case 41: goto L_0x0650;
                case 42: goto L_0x0823;
                case 43: goto L_0x0009;
                case 44: goto L_0x065e;
                case 45: goto L_0x0009;
                case 46: goto L_0x0009;
                case 47: goto L_0x08b7;
                case 48: goto L_0x0a25;
                case 49: goto L_0x06dd;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A00
            X.C36331k8.A1J(r0, r3)
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r9 = r1.A00
            X.3fk r9 = (X.C70803fk) r9
            int r4 = X.AnonymousClass000.A0I(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ConversationDelegate/onSelectionUiChanged selectionUi="
            X.C36321k7.A1T(r0, r1, r4)
            X.1K3 r1 = X.AnonymousClass3B6.A00(r9)
            X.11F r0 = r9.A45
            boolean r0 = r1.BLD(r0)
            r1 = 0
            if (r0 == 0) goto L_0x004f
            X.3B6 r0 = X.C70803fk.A0F(r9)
            X.005 r0 = r0.A09
            r0.get()
            boolean r3 = X.AnonymousClass000.A1P(r4)
            android.view.Window r2 = X.C70803fk.A05(r9)
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            android.view.View r0 = X.C36411kG.A0M(r2)
            X.5ND r0 = (X.AnonymousClass5ND) r0
            if (r0 == 0) goto L_0x004f
            r0.A0T = r3
            r0.A0E()
        L_0x004f:
            if (r4 != 0) goto L_0x007f
            com.whatsapp.conversation.ConversationListView r0 = r9.A2U
            if (r0 == 0) goto L_0x005f
            r0.A05()
            X.1nd r1 = X.C70803fk.A0D(r9)
            r0 = 0
            r1.A06 = r0
        L_0x005f:
            X.1uh r0 = r9.A2x
            if (r0 == 0) goto L_0x006a
            X.3T1 r0 = r0.A0F
            if (r0 != 0) goto L_0x006a
            r9.A21()
        L_0x006a:
            X.28d r1 = r9.A2P
            if (r1 == 0) goto L_0x000e
            boolean r0 = r1 instanceof X.C43312Gv
            if (r0 == 0) goto L_0x000e
            X.2Gv r1 = (X.C43312Gv) r1
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel r1 = X.AnonymousClass28d.A00(r1)
            r0 = 0
        L_0x0079:
            r1.A02 = r0
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel.A02(r1)
            return
        L_0x007f:
            X.0V9 r0 = r9.A0i
            if (r0 == 0) goto L_0x0086
            r0.A05()
        L_0x0086:
            com.whatsapp.conversation.ConversationListView r0 = r9.A2U
            r0.setTranscriptMode(r1)
            com.whatsapp.conversation.ConversationListView r0 = r9.A2U
            r0.A05()
            r2 = 2
            if (r4 != r2) goto L_0x0172
            com.whatsapp.conversation.conversationrow.MessageSelectionViewModel r0 = r9.A2e
            X.00s r0 = r0.A00
            java.lang.Object r0 = r0.A04()
            X.3Gh r0 = (X.C62473Gh) r0
            if (r0 == 0) goto L_0x0253
            java.util.Collection r0 = r0.A01()
            if (r0 == 0) goto L_0x0253
            X.3T1 r0 = X.C36421kH.A0S(r0)
            if (r0 == 0) goto L_0x0253
            X.3Qa r4 = r0.A1J
            com.whatsapp.conversation.ConversationListView r0 = r9.A2U
            X.2IR r5 = r0.A02(r4)
            if (r5 == 0) goto L_0x0253
            androidx.appcompat.widget.Toolbar r6 = r9.A0j
            if (r6 != 0) goto L_0x00bb
            com.whatsapp.KeyboardPopupLayout r6 = r9.A1V
        L_0x00bb:
            android.view.View r0 = r5.A0b
            if (r0 == 0) goto L_0x015b
            if (r6 == 0) goto L_0x015b
            int[] r3 = new int[r2]
            r0.getLocationInWindow(r3)
            int[] r2 = new int[r2]
            r6.getLocationInWindow(r2)
            r0 = 1
            r13 = r3[r0]
            r0 = r2[r0]
            int r13 = r13 - r0
        L_0x00d1:
            android.widget.LinearLayout r2 = r9.A0e
            X.0ts r0 = r9.A36
            int r3 = X.C34081gQ.A00(r2, r0)
            X.155 r0 = X.C70803fk.A0B(r9)
            android.content.res.Resources r2 = r0.getResources()
            r0 = 2131166187(0x7f0703eb, float:1.7946612E38)
            int r14 = X.C36441kJ.A06(r2, r0, r3)
            X.1uY r0 = r5.A18
            if (r0 == 0) goto L_0x0159
            X.08S r0 = r0.A02
            java.lang.Object r0 = r0.A04()
            X.39v r0 = (X.C609139v) r0
            if (r0 == 0) goto L_0x0159
            int r2 = r0.A01
            r0 = 8
            if (r2 == r0) goto L_0x0159
            int r15 = r5.getProfilePictureFullWidth()
        L_0x0100:
            int r2 = X.AnonymousClass04F.A03(r5)
            int r0 = X.AnonymousClass04F.A02(r5)
            android.os.Bundle r12 = X.AnonymousClass001.A07()
            r5.A1k(r12)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>(r2, r1, r0, r1)
            X.4V6 r0 = r9.A2l
            X.3HC r3 = r0.getConversationRowCustomizers()
            X.005 r0 = r9.A79
            java.lang.Object r2 = r0.get()
            X.AnonymousClass00C.A0D(r2, r1)
            java.util.Map r0 = r3.A0F
            java.lang.Object r0 = r0.get(r2)
            int r16 = X.C36381kD.A07(r0)
            boolean r2 = r5 instanceof X.AnonymousClass2IC
            X.155 r0 = X.C70803fk.A0C(r9)
            if (r2 == 0) goto L_0x0230
            X.2IC r5 = (X.AnonymousClass2IC) r5
            java.util.List r4 = r5.A08
            android.content.Intent r3 = X.C36431kI.A0D()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversation.selection.SelectedImageAndVideoAlbumActivity"
            android.content.Intent r10 = r3.setClassName(r2, r0)
            java.util.ArrayList r3 = X.C36361kB.A0r(r4)
            java.util.Iterator r2 = r4.iterator()
        L_0x014f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x015e
            X.AnonymousClass3T1.A0A(r3, r2)
            goto L_0x014f
        L_0x0159:
            r15 = 0
            goto L_0x0100
        L_0x015b:
            r13 = 0
            goto L_0x00d1
        L_0x015e:
            java.lang.String r2 = "fMessageKeyBundle"
            boolean r0 = r10.hasExtra(r2)
            if (r0 != 0) goto L_0x0a48
            android.os.Bundle r0 = X.AnonymousClass001.A07()
            X.AnonymousClass3UJ.A0A(r0, r3)
            r10.putExtra(r2, r0)
            goto L_0x0241
        L_0x0172:
            X.4V6 r2 = r9.A2l
            X.155 r5 = r2.getActivityNullable()
            X.4V6 r0 = r9.A2l
            X.16D r6 = r0.getContactManager()
            X.171 r7 = r0.getWAContactNames()
            X.0ts r13 = r9.A36
            X.3C1 r0 = r9.A1R
            X.2JR r10 = r0.A00(r9)
            boolean r0 = X.C70803fk.A1a(r9)
            if (r0 != 0) goto L_0x01ca
            X.4V6 r0 = r9.A2l
            X.3Gh r4 = r0.getSelectedMessages()
            if (r4 == 0) goto L_0x022a
            java.util.HashMap r0 = r4.A03
            int r3 = r0.size()
            r0 = 1
            if (r3 != r0) goto L_0x022a
            X.3B6 r0 = X.C70803fk.A0F(r9)
            X.005 r0 = r0.A0A
            r0.get()
            java.util.Collection r0 = r4.A01()
            java.util.Iterator r0 = r0.iterator()
            X.3T1 r0 = X.C36391kE.A0l(r0)
            X.AnonymousClass00C.A0D(r0, r1)
            boolean r3 = X.C63903Lw.A01(r0)
            r1 = 8388608(0x800000, float:1.17549435E-38)
            int r0 = r0.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r3 != 0) goto L_0x01ca
            if (r0 == 0) goto L_0x022a
        L_0x01ca:
            X.1K3 r0 = X.AnonymousClass3B6.A00(r9)
            X.1K4 r0 = (X.AnonymousClass1K4) r0
            X.00T r0 = r0.A09
            java.lang.Object r8 = r0.getValue()
            X.3PH r8 = (X.AnonymousClass3PH) r8
        L_0x01d8:
            X.2Jg r11 = r9.A2q
            X.1K3 r1 = X.AnonymousClass3B6.A00(r9)
            X.11F r0 = r9.A45
            boolean r0 = r1.BLD(r0)
            if (r0 == 0) goto L_0x0227
            X.155 r1 = X.C70803fk.A0C(r9)
            r0 = 2131099893(0x7f0600f5, float:1.7812152E38)
            int r0 = X.AnonymousClass00F.A00(r1, r0)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
        L_0x01f5:
            X.0yC r15 = r9.A3n
            X.1H2 r14 = r9.A3e
            X.4W7 r4 = new X.4W7
            r12 = r9
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.0V9 r0 = r2.But(r4)
            r2.setSelectionActionMode(r0)
            X.1nd r2 = X.C70803fk.A0D(r9)
            X.4V6 r1 = r9.A2l
            X.0V9 r0 = r1.getSelectionActionMode()
            r2.A06 = r0
            X.3Gh r3 = r1.getSelectedMessages()
            if (r3 == 0) goto L_0x0253
            X.3NY r0 = r9.A2V
            X.11F r2 = r9.A45
            X.0yW r1 = r0.A00
            r0 = 1
            X.2Qw r0 = X.AnonymousClass3NY.A00(r3, r2, r0)
            r1.Bly(r0)
            goto L_0x0253
        L_0x0227:
            r16 = 0
            goto L_0x01f5
        L_0x022a:
            X.3PH r8 = new X.3PH
            r8.<init>()
            goto L_0x01d8
        L_0x0230:
            android.content.Intent r3 = X.C36431kI.A0D()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversation.selection.SingleSelectedMessageActivity"
            android.content.Intent r10 = r3.setClassName(r2, r0)
            X.AnonymousClass3UJ.A00(r10, r4)
        L_0x0241:
            X.AnonymousClass190.A1U(r10, r11, r12, r13, r14, r15, r16)
            com.whatsapp.conversation.ConversationListView r0 = r9.A2U
            r0.A0O = r1
            X.1Dv r2 = r9.A0w
            X.155 r1 = X.C70803fk.A0C(r9)
            r0 = 906(0x38a, float:1.27E-42)
            r2.A09(r1, r10, r0)
        L_0x0253:
            X.28d r1 = r9.A2P
            if (r1 == 0) goto L_0x000e
            boolean r0 = r1 instanceof X.C43312Gv
            if (r0 == 0) goto L_0x000e
            X.2Gv r1 = (X.C43312Gv) r1
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel r1 = X.AnonymousClass28d.A00(r1)
            r0 = 1
            goto L_0x0079
        L_0x0264:
            java.lang.Object r2 = r1.A00
            X.3fk r2 = (X.C70803fk) r2
            int r1 = X.AnonymousClass000.A0I(r3)
            r0 = 1
            if (r1 != r0) goto L_0x000e
            X.C70803fk.A0i(r2)
            return
        L_0x0273:
            java.lang.Object r1 = r1.A00
            X.3fk r1 = (X.C70803fk) r1
            java.lang.Number r3 = (java.lang.Number) r3
            boolean r0 = X.C70803fk.A1a(r1)
            if (r0 == 0) goto L_0x000e
            int r3 = r3.intValue()
            X.3AC r4 = r1.A2R
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            android.widget.FrameLayout r0 = r4.A03
            r0.measure(r1, r1)
            int r2 = r0.getMeasuredWidth()
            r1 = 0
            int[] r0 = X.C36441kJ.A1O()
            if (r3 != 0) goto L_0x02d2
            r0[r1] = r1
            android.animation.ValueAnimator r3 = X.C36411kG.A0C(r0, r2)
            r0 = 2
            X.C53562rW.A00(r3, r4, r0)
            X.4Wj r0 = new X.4Wj
            r0.<init>(r4, r1)
            r3.addListener(r0)
            r0 = 200(0xc8, double:9.9E-322)
            r3.setDuration(r0)
            r1 = 1
            X.4Wj r0 = new X.4Wj
            r0.<init>(r4, r1)
        L_0x02b7:
            r3.addListener(r0)
            android.animation.Animator r0 = r4.A00
            if (r0 != 0) goto L_0x02cf
            r4.A00 = r3
            r0 = r3
        L_0x02c1:
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x000e
            android.animation.Animator r0 = r4.A00
            if (r0 == 0) goto L_0x000e
            r0.start()
            return
        L_0x02cf:
            r4.A01 = r3
            goto L_0x02c1
        L_0x02d2:
            r0[r1] = r2
            android.animation.ValueAnimator r3 = X.C36411kG.A0C(r0, r1)
            r2 = 2
            X.C53562rW.A00(r3, r4, r2)
            X.4Wj r0 = new X.4Wj
            r0.<init>(r4, r1)
            r3.addListener(r0)
            r0 = 200(0xc8, double:9.9E-322)
            r3.setDuration(r0)
            X.4Wj r0 = new X.4Wj
            r0.<init>(r4, r2)
            goto L_0x02b7
        L_0x02ef:
            java.lang.Object r1 = r1.A00
            X.3fk r1 = (X.C70803fk) r1
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x000e
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x000e
            com.whatsapp.conversation.ConversationListView r4 = r1.A2U
            java.util.Iterator r10 = r3.iterator()
            r5 = 0
            r9 = 0
            r8 = 0
        L_0x0306:
            r7 = 0
        L_0x0307:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x03a4
            java.lang.Object r3 = r10.next()
            X.3GI r3 = (X.AnonymousClass3GI) r3
            X.3T1 r1 = r3.A01
            int r2 = r3.A00
            r4.A09(r1, r2, r5)
            r0 = 3
            r6 = 1
            if (r2 != r0) goto L_0x0358
            int r0 = r1.A1I
            if (r0 != r6) goto L_0x032e
            int r2 = r4.getLastVisiblePosition()
            int r0 = r4.getCount()
            int r0 = r0 + -2
            if (r2 >= r0) goto L_0x0366
        L_0x032e:
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0307
            X.1G5 r0 = r4.A07
            X.1G6 r2 = r0.A00()
            X.3Qa r0 = r1.A1J
            X.11F r0 = r0.A00
            boolean r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x0306
            X.0v0 r0 = r4.A09
            boolean r0 = r0.A2A()
            if (r0 == 0) goto L_0x0306
            boolean r0 = X.C66013Ui.A0j(r1)
            if (r0 != 0) goto L_0x0306
            int r1 = r1.A1I
            r0 = 69
            r7 = 1
            if (r1 != r0) goto L_0x0307
            goto L_0x0306
        L_0x0358:
            r0 = 28
            if (r2 == r0) goto L_0x0366
            r0 = 27
            if (r2 == r0) goto L_0x0366
            r0 = 20
            if (r2 != r0) goto L_0x032e
            r8 = 1
            goto L_0x0307
        L_0x0366:
            if (r9 != 0) goto L_0x0307
            int r0 = r4.getChildCount()
            if (r0 <= 0) goto L_0x0307
            boolean r0 = r4.A0K
            if (r0 == 0) goto L_0x0307
            int r3 = r4.getChildCount()
            int r3 = r3 - r6
            android.view.View r2 = r4.getChildAt(r3)
            X.3Qa r1 = r1.A1J
            java.lang.Object r0 = r2.getTag()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x03a1
            boolean r0 = r2 instanceof X.AnonymousClass2I6
            if (r0 == 0) goto L_0x0307
        L_0x038b:
            boolean r0 = r2 instanceof X.AnonymousClass2I6
            if (r0 == 0) goto L_0x0307
            if (r3 <= 0) goto L_0x0307
            int r3 = r3 + -1
            android.view.View r2 = r4.getChildAt(r3)
            java.lang.Object r0 = r2.getTag()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x038b
        L_0x03a1:
            r9 = 1
            goto L_0x0307
        L_0x03a4:
            if (r9 == 0) goto L_0x03aa
            r0 = 1
            r4.A0A(r0)
        L_0x03aa:
            if (r8 == 0) goto L_0x03b8
            X.1nd r0 = r4.getConversationCursorAdapter()
            android.util.SparseArray r0 = r0.A0H
            r0.clear()
            r4.A05()
        L_0x03b8:
            if (r7 == 0) goto L_0x000e
            X.1Q0 r2 = r4.A0F
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = X.C19430v1.A04
            r1.append(r0)
            r0 = 2132017199(0x7f14002f, float:1.967267E38)
            java.lang.String r0 = X.C36381kD.A10(r1, r0)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.A02(r0)
            return
        L_0x03d4:
            java.lang.Object r0 = r1.A00
            X.3fk r0 = (X.C70803fk) r0
            java.util.List r3 = (java.util.List) r3
            r3.size()
            X.3Fr r0 = r0.A2Z
            java.lang.Class<X.2HF> r1 = X.AnonymousClass2HF.class
            X.3Ok r0 = r0.A00
            X.3uz r0 = r0.A00(r1)
            X.2HF r0 = (X.AnonymousClass2HF) r0
            if (r0 == 0) goto L_0x000e
            r3.size()
            com.whatsapp.pininchat.banner.PinInChatBannerViewModel r12 = r0.A03
            java.lang.Runnable r1 = r12.A00
            if (r1 == 0) goto L_0x03f9
            X.17Y r0 = r12.A02
            r0.A0G(r1)
        L_0x03f9:
            r11 = 0
            r12.A00 = r11
            java.util.Iterator r9 = r3.iterator()
            r13 = 0
            r3 = 1
            r5 = 4
            r8 = 0
        L_0x0404:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x04d6
            java.lang.Object r6 = r9.next()
            X.3JJ r6 = (X.AnonymousClass3JJ) r6
            X.2oX r7 = r6.A00
            int r1 = r7.ordinal()
            if (r1 == r5) goto L_0x0468
            r0 = 0
            if (r1 == r0) goto L_0x0468
            r0 = 3
            if (r1 == r0) goto L_0x0468
            r0 = 2
            if (r1 == r0) goto L_0x0435
            java.util.LinkedHashMap r2 = r12.A08
            X.3T1 r0 = r6.A01
            X.3Qa r1 = r0.A1J
            X.AnonymousClass00C.A07(r1)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0404
            r2.remove(r1)
        L_0x0433:
            r8 = 1
            goto L_0x0404
        L_0x0435:
            X.3Qa r4 = r6.A02
            java.util.LinkedHashMap r2 = r12.A08
            boolean r0 = r2.containsKey(r4)
            if (r0 == 0) goto L_0x0404
            java.util.Map r0 = X.C07710Yz.A02(r2)
            r0.remove(r4)
            X.3T1 r0 = r6.A01
            X.3Qa r1 = r0.A1J
            X.AnonymousClass00C.A07(r1)
            r2.put(r1, r0)
            if (r11 != 0) goto L_0x0433
            if (r4 == 0) goto L_0x0433
            X.00s r0 = r12.A01
            X.3T1 r0 = X.C36431kI.A0r(r0)
            if (r0 == 0) goto L_0x0466
            X.3Qa r0 = r0.A1J
        L_0x045e:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0433
            r11 = r1
            goto L_0x0433
        L_0x0466:
            r0 = r13
            goto L_0x045e
        L_0x0468:
            java.util.LinkedHashMap r4 = r12.A08
            X.3T1 r2 = r6.A01
            X.3Qa r1 = r2.A1J
            X.AnonymousClass00C.A07(r1)
            boolean r0 = r4.containsKey(r1)
            if (r0 != 0) goto L_0x048c
            r4.put(r1, r2)
            X.2oX r0 = X.C51882oX.ADDED
            if (r7 != r0) goto L_0x048b
            X.5J2 r0 = r2.A1V
            if (r0 == 0) goto L_0x048b
            X.3Qa r0 = r0.A1J
            if (r0 == 0) goto L_0x048b
            boolean r0 = r0.A02
            if (r0 != r3) goto L_0x048b
            r11 = r1
        L_0x048b:
            r8 = 1
        L_0x048c:
            int r1 = r4.size()
            X.1Ju r0 = r12.A05
            int r0 = r0.A00()
            if (r1 <= r0) goto L_0x0404
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.Iterator r6 = X.AnonymousClass000.A0y(r4)
        L_0x04a0:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x04c4
            java.util.Map$Entry r2 = X.AnonymousClass000.A11(r6)
            java.lang.Object r0 = r2.getValue()
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.5J2 r1 = r0.A1V
            if (r1 == 0) goto L_0x04bc
            X.0wo r0 = r12.A03
            boolean r0 = r1.A1f(r0)
            if (r0 == 0) goto L_0x04a0
        L_0x04bc:
            java.lang.Object r0 = r2.getKey()
            r7.add(r0)
            goto L_0x04a0
        L_0x04c4:
            java.util.Iterator r1 = r7.iterator()
        L_0x04c8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0404
            java.lang.Object r0 = r1.next()
            r4.remove(r0)
            goto L_0x04c8
        L_0x04d6:
            if (r8 == 0) goto L_0x000e
            java.util.LinkedHashMap r4 = r12.A08
            int r0 = r4.size()
            if (r0 <= r3) goto L_0x0a4f
            X.1Ju r0 = r12.A05
            int r0 = r0.A00()
            if (r0 <= r3) goto L_0x0520
            X.2nc r2 = X.C51312nc.OLDEST_PARENT_MESSAGE_FIRST
        L_0x04ea:
            java.util.Set r1 = r4.entrySet()
            X.AnonymousClass00C.A08(r1)
            X.3x5 r0 = new X.3x5
            r0.<init>(r2, r12)
            java.util.List r0 = X.C007103b.A0c(r1, r0)
            r4.clear()
            java.util.Iterator r2 = r0.iterator()
        L_0x0501:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0a4f
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r2)
            X.AnonymousClass00C.A0B(r0)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            X.AnonymousClass00C.A0B(r1)
            X.AnonymousClass00C.A0B(r0)
            r4.put(r1, r0)
            goto L_0x0501
        L_0x0520:
            X.2nc r2 = X.C51312nc.OLDEST_PIN_ACTION_FIRST
            goto L_0x04ea
        L_0x0523:
            java.lang.Object r4 = r1.A00
            X.3fk r4 = (X.C70803fk) r4
            java.util.List r3 = (java.util.List) r3
            X.1uG r2 = r4.A24
            if (r2 == 0) goto L_0x000e
            java.util.Objects.requireNonNull(r2)
            r1 = 1
            X.4Y8 r0 = new X.4Y8
            r0.<init>(r2, r1)
            X.C70803fk.A0a(r0, r4, r3)
            return
        L_0x053a:
            java.lang.Object r5 = r1.A00
            X.3fk r5 = (X.C70803fk) r5
            java.util.List r3 = (java.util.List) r3
            boolean r0 = r3.isEmpty()
            r6 = 0
            if (r0 == 0) goto L_0x0b34
            boolean r0 = r5.A6I
            if (r0 == 0) goto L_0x000e
            X.3P6 r2 = r5.A4u
            android.os.Handler r1 = r2.A07
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
            android.animation.AnimatorSet r0 = r2.A06
            r0.end()
            android.animation.AnimatorSet r0 = r2.A05
            r0.end()
            android.animation.AnimatorSet r0 = r2.A01
            if (r0 == 0) goto L_0x0564
            r0.end()
        L_0x0564:
            android.animation.AnimatorSet r0 = r2.A00
            if (r0 == 0) goto L_0x056b
            r0.end()
        L_0x056b:
            X.1RJ r1 = r2.A04
            if (r1 != 0) goto L_0x0af3
            java.lang.String r0 = "stickersHintView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0576:
            java.lang.Object r6 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r6 = (com.whatsapp.conversationslist.ConversationsFragment) r6
            java.util.Map r3 = (java.util.Map) r3
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = r6.A2i
            java.util.List r0 = r0.A0T()
            java.util.Iterator r5 = r0.iterator()
        L_0x0586:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x000e
            com.whatsapp.jid.UserJid r4 = X.C36441kJ.A0o(r5)
            X.1gf r0 = r6.A1Q
            if (r0 == 0) goto L_0x0586
            android.view.View r0 = com.whatsapp.conversationslist.ConversationsFragment.A05(r6, r4)
            if (r0 != 0) goto L_0x05b3
            r1 = 0
        L_0x059b:
            boolean r0 = r1 instanceof com.whatsapp.conversationslist.ViewHolder
            if (r0 == 0) goto L_0x0586
            com.whatsapp.conversationslist.ViewHolder r1 = (com.whatsapp.conversationslist.ViewHolder) r1
            java.lang.Object r2 = r3.get(r4)
            X.3Ed r2 = (X.C61953Ed) r2
            X.9k6 r1 = r1.A00
            boolean r0 = r1 instanceof X.AnonymousClass4Q8
            if (r0 == 0) goto L_0x0586
            X.4Q8 r1 = (X.AnonymousClass4Q8) r1
            r1.Bx0(r4, r2)
            goto L_0x0586
        L_0x05b3:
            java.lang.Object r1 = r0.getTag()
            goto L_0x059b
        L_0x05b8:
            java.lang.Object r4 = r1.A00
            X.3HE r4 = (X.AnonymousClass3HE) r4
            java.util.List r3 = (java.util.List) r3
            int r0 = r3.size()
            r2 = 0
            if (r0 <= 0) goto L_0x05d9
            X.4QD r0 = r4.A01
            if (r0 == 0) goto L_0x05f0
            android.widget.PopupWindow r0 = (android.widget.PopupWindow) r0
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x05f0
            X.4lK r0 = r4.A0F
            if (r0 == 0) goto L_0x05f0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x05f0
        L_0x05d9:
            X.4QD r0 = r4.A01
            if (r0 == 0) goto L_0x05e6
            android.widget.PopupWindow r0 = (android.widget.PopupWindow) r0
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x05e6
            r2 = 1
        L_0x05e6:
            X.4QD r0 = r4.A01
            if (r0 == 0) goto L_0x000e
            X.2M8 r0 = (X.AnonymousClass2M8) r0
            X.AnonymousClass2M8.A06(r0, r2)
            return
        L_0x05f0:
            X.3Ki r1 = r4.A0G
            X.C18740tg.A06(r1)
            int r0 = r3.size()
            r1.A02(r0)
            X.0yC r1 = r4.A07
            r0 = 3403(0xd4b, float:4.769E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x05e6
            r2 = 2
            goto L_0x05e6
        L_0x0608:
            java.lang.Object r4 = r1.A00
            X.21M r4 = (X.AnonymousClass21M) r4
            if (r28 == 0) goto L_0x000e
            X.3Ol r3 = r4.A06
            X.11F r0 = r4.A0A
            java.lang.String r2 = r0.getRawString()
            r1 = 4
            r0 = 1
            X.C64553Ol.A00(r3, r2, r1, r0)
            android.view.View r1 = r4.A00
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x0622:
            java.lang.Object r2 = r1.A00
            X.36n r2 = (X.C601136n) r2
            boolean r1 = X.C36361kB.A1a(r3, r2)
            boolean r0 = r2.A00
            if (r0 == r1) goto L_0x000e
            r2.A00 = r1
            if (r1 == 0) goto L_0x000e
            X.00s r0 = r2.A01
            r0.A0C(r2)
            return
        L_0x0638:
            java.lang.Object r3 = r1.A00
            X.1yM r3 = (X.C42151yM) r3
            X.36n r0 = r3.A00
            boolean r2 = r0.A00
            android.widget.RadioButton r1 = r3.A01
            boolean r0 = r1.isChecked()
            if (r2 == r0) goto L_0x000e
            X.36n r0 = r3.A00
            boolean r0 = r0.A00
            r1.setChecked(r0)
            return
        L_0x0650:
            java.lang.Object r1 = r1.A00
            com.whatsapp.documentpicker.DocumentPickerActivity r1 = (com.whatsapp.documentpicker.DocumentPickerActivity) r1
            boolean r0 = com.whatsapp.documentpicker.DocumentPickerActivity.A12(r1)
            if (r0 == 0) goto L_0x000e
            com.whatsapp.documentpicker.DocumentPickerActivity.A0y(r1)
            return
        L_0x065e:
            java.lang.Object r2 = r1.A00
            com.whatsapp.gallery.GalleryFragmentBase r2 = (com.whatsapp.gallery.GalleryFragmentBase) r2
            X.2sq r3 = (X.C54372sq) r3
            boolean r0 = r3 instanceof X.AnonymousClass2U8
            if (r0 == 0) goto L_0x0685
            X.2U8 r3 = (X.AnonymousClass2U8) r3
            int r0 = r3.A00
            if (r0 != 0) goto L_0x0678
            java.util.ArrayList r0 = r2.A0L
            r0.clear()
            X.1wQ r0 = r2.A0A
            r0.A06()
        L_0x0678:
            java.util.List r1 = r3.A01
            java.util.ArrayList r0 = r2.A0L
            r0.addAll(r1)
            X.1wQ r0 = r2.A0A
            r0.A06()
            return
        L_0x0685:
            boolean r0 = r3 instanceof X.AnonymousClass2U7
            if (r0 == 0) goto L_0x000e
            X.2U7 r3 = (X.AnonymousClass2U7) r3
            android.view.View r0 = r2.A01
            X.C36341k9.A0y(r0)
            int r0 = r3.A00
            r2.A00 = r0
            com.whatsapp.gallery.GalleryFragmentBase.A06(r2)
            X.1wQ r1 = r2.A0A
            android.database.Cursor r0 = r3.A01
            android.database.Cursor r0 = r1.A0L(r0)
            if (r0 == 0) goto L_0x06a4
            r0.close()
        L_0x06a4:
            com.whatsapp.gallery.viewmodel.GalleryViewModel r5 = r2.A0C
            java.lang.String r6 = r2.A0K
            android.content.Context r1 = r2.A0a()
            X.0ts r0 = r2.A05
            X.6uI r4 = new X.6uI
            r4.<init>(r1, r0)
            r0 = 0
            X.2Kz r8 = new X.2Kz
            r8.<init>(r3, r2, r0)
            X.AnonymousClass00C.A0D(r6, r0)
            X.0Bk r0 = r5.A00
            if (r0 == 0) goto L_0x06c3
            r0.A03()
        L_0x06c3:
            r7 = 0
            r5.A00 = r7
            X.03e r0 = r5.A02
            if (r0 == 0) goto L_0x06cd
            r0.B2S(r7)
        L_0x06cd:
            X.040 r0 = X.C109325Xd.A00(r5)
            com.whatsapp.gallery.viewmodel.GalleryViewModel$loadSections$1 r3 = new com.whatsapp.gallery.viewmodel.GalleryViewModel$loadSections$1
            r3.<init>(r4, r5, r6, r7, r8)
            X.0A6 r0 = X.C36391kE.A12(r3, r0)
            r5.A02 = r0
            return
        L_0x06dd:
            java.lang.Object r1 = r1.A00
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            boolean r0 = X.AnonymousClass000.A1X(r3)
            if (r0 == 0) goto L_0x000e
            X.0xE r0 = r1.A0e
            com.whatsapp.community.suspend.CommunitySuspendDialogFragment r0 = r0.B9v()
            r1.Btm(r0)
            return
        L_0x06f1:
            java.lang.Object r0 = r1.A00
            X.3fk r0 = (X.C70803fk) r0
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            X.155 r0 = X.C70803fk.A0C(r0)
            X.C36401kF.A10(r0, r3)
            return
        L_0x06ff:
            java.lang.Object r5 = r1.A00
            X.3fk r5 = (X.C70803fk) r5
            int r4 = X.AnonymousClass000.A0I(r3)
            java.lang.String r3 = "chat"
            com.whatsapp.payments.ui.PaymentMerchantUpsellEducationBottomSheet r2 = new com.whatsapp.payments.ui.PaymentMerchantUpsellEducationBottomSheet
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "payment_account_type"
            r1.putInt(r0, r4)
            java.lang.String r0 = "referral_screen"
            r1.putString(r0, r3)
            r2.A17(r1)
            r0 = 0
            r2.A1g(r0)
            X.01z r1 = X.C70803fk.A06(r5)
            java.lang.String r0 = "PaymentMerchantUpsellEducationBottomSheet"
            X.C36381kD.A1F(r2, r1, r0)
            return
        L_0x072d:
            java.lang.Object r0 = r1.A00
            X.3fk r0 = (X.C70803fk) r0
            X.C70803fk.A0j(r0)
            return
        L_0x0735:
            java.lang.Object r0 = r1.A00
            X.3fk r0 = (X.C70803fk) r0
            java.lang.String r3 = (java.lang.String) r3
            X.C70803fk.A1J(r0, r3)
            return
        L_0x073f:
            java.lang.Object r0 = r1.A00
            X.3fk r0 = (X.C70803fk) r0
            X.1uL r0 = r0.A2t
            r0.A0T()
            return
        L_0x0749:
            java.lang.Object r0 = r1.A00
            X.3fk r0 = (X.C70803fk) r0
            X.01z r1 = X.C70803fk.A06(r0)
            java.lang.String r0 = "search_fragment_conversation"
            X.02E r0 = r1.A0N(r0)
            com.whatsapp.conversation.ConversationSearchFragment r0 = (com.whatsapp.conversation.ConversationSearchFragment) r0
            r0.A1Z()
            return
        L_0x075d:
            java.lang.Object r0 = r1.A00
            X.3fk r0 = (X.C70803fk) r0
            X.C70803fk.A0m(r0)
            return
        L_0x0765:
            java.lang.Object r1 = r1.A00
            X.3fk r1 = (X.C70803fk) r1
            java.util.List r3 = (java.util.List) r3
            X.7y9 r0 = r1.A1r
            X.00s r0 = r0.A00
            java.lang.Object r0 = r0.A04()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            X.C70803fk.A1H(r1, r0, r3)
            return
        L_0x0779:
            java.lang.Object r5 = r1.A00
            X.3fk r5 = (X.C70803fk) r5
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x0786
            r0 = 0
            X.C70803fk.A0a(r0, r5, r0)
            return
        L_0x0786:
            java.util.ArrayList r4 = X.C36361kB.A0r(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x078e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x07a0
            java.lang.Object r0 = r1.next()
            X.69W r0 = (X.AnonymousClass69W) r0
            java.lang.String r0 = r0.A01
            r4.add(r0)
            goto L_0x078e
        L_0x07a0:
            X.3B6 r0 = X.C70803fk.A0F(r5)
            X.005 r0 = r0.A07
            java.lang.Object r2 = r0.get()
            java.util.Objects.requireNonNull(r2)
            r1 = 0
            X.4Y8 r0 = new X.4Y8
            r0.<init>(r2, r1)
            X.C70803fk.A0a(r0, r5, r4)
            return
        L_0x07b7:
            java.lang.Object r0 = r1.A00
            X.1uL r0 = (X.C39951uL) r0
            X.141 r3 = (X.AnonymousClass141) r3
            X.C39951uL.A01(r0, r3)
            return
        L_0x07c1:
            java.lang.Object r4 = r1.A00
            X.1I4 r4 = (X.AnonymousClass1I4) r4
            X.34Q r3 = (X.AnonymousClass34Q) r3
            r2 = 0
            r4.A00 = r2
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x07e2
            java.lang.Boolean r1 = r3.A00
            if (r1 == 0) goto L_0x07e2
            X.0v0 r0 = r4.A03
            boolean r2 = r1.booleanValue()
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "tos_2016_opt_out_state"
            X.C36331k8.A0w(r1, r0, r2)
            return
        L_0x07e2:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x07f7
            r4.A01 = r2
            X.17Y r3 = r4.A02
            r0 = 30
            X.1j6 r2 = new X.1j6
            r2.<init>(r4, r0)
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.A0I(r2, r0)
            return
        L_0x07f7:
            r0 = 1
            r4.A01 = r0
            return
        L_0x07fb:
            java.lang.Object r0 = r1.A00
            X.C36411kG.A1N(r0)
            return
        L_0x0801:
            java.lang.Object r0 = r1.A00
            X.C36431kI.A1N(r0)
            return
        L_0x0807:
            java.lang.Object r2 = r1.A00
            com.whatsapp.documentpicker.DocumentPickerActivity r2 = (com.whatsapp.documentpicker.DocumentPickerActivity) r2
            java.lang.String r3 = (java.lang.String) r3
            r2.A0N = r3
            X.0ts r0 = r2.A0E
            java.util.ArrayList r0 = X.C202859mm.A03(r0, r3)
            r2.A0O = r0
            java.lang.String r1 = r2.A0N
            X.1nY r0 = r2.A0F
            android.widget.Filter r0 = r0.getFilter()
            r0.filter(r1)
            return
        L_0x0823:
            java.lang.Object r0 = r1.A00
            com.whatsapp.events.EventCreateOrEditFragment r0 = (com.whatsapp.events.EventCreateOrEditFragment) r0
            android.content.DialogInterface r3 = (android.content.DialogInterface) r3
            X.1us r8 = r0.A0H
            if (r8 != 0) goto L_0x0834
            java.lang.String r0 = "eventCreateOrEditViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0834:
            X.2bT r7 = X.C40071us.A01(r8)
            if (r7 == 0) goto L_0x08a4
            boolean r0 = r7.A06
            if (r0 != 0) goto L_0x08b3
            X.05K r0 = r8.A0G
            java.lang.Object r0 = r0.getValue()
            X.3QB r0 = (X.AnonymousClass3QB) r0
            X.2nz r1 = r0.A02
            X.2nz r0 = X.C51542nz.DELETED
            if (r1 == r0) goto L_0x08b3
            X.1X4 r6 = r8.A01
            X.1Xa r13 = r8.A07
            X.11F r14 = r8.A09
            X.0wo r0 = r8.A03
            long r24 = X.C19970wo.A00(r0)
            java.lang.String r5 = r7.A05
            long r9 = r7.A00
            java.lang.String r12 = r7.A03
            java.lang.String r11 = r7.A04
            X.3J7 r4 = r7.A01
            r2 = 0
            if (r4 == 0) goto L_0x08a8
            X.3IM r0 = r4.A00
            if (r0 == 0) goto L_0x08a8
            double r0 = r0.A00
            java.lang.Double r15 = java.lang.Double.valueOf(r0)
        L_0x086f:
            X.3IM r0 = r4.A00
            if (r0 == 0) goto L_0x08ac
            double r0 = r0.A01
            java.lang.Double r16 = java.lang.Double.valueOf(r0)
        L_0x0879:
            java.lang.String r1 = r4.A02
            java.lang.String r4 = r4.A01
        L_0x087d:
            r0 = 4
            X.AnonymousClass00C.A0D(r5, r0)
            r26 = 1
            r21 = r5
            r22 = r9
            r18 = r11
            r19 = r4
            r20 = r1
            r17 = r12
            X.2bT r4 = X.C54222sb.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r26)
            X.0wU r1 = r6.A1J
            r0 = 8
            X.C36371kC.A1Q(r1, r6, r4, r7, r0)
            X.2nW r1 = X.C51252nW.SUCCESS
            X.3IN r0 = new X.3IN
            r0.<init>(r1, r2)
            X.C40071us.A03(r0, r8)
        L_0x08a4:
            r3.dismiss()
            return
        L_0x08a8:
            r15 = r2
            if (r4 == 0) goto L_0x08ac
            goto L_0x086f
        L_0x08ac:
            r16 = r2
            if (r4 != 0) goto L_0x0879
            r1 = r2
            r4 = r2
            goto L_0x087d
        L_0x08b3:
            X.C40071us.A02(r7, r8)
            goto L_0x08a4
        L_0x08b7:
            java.lang.Object r7 = r1.A00
            com.whatsapp.group.GroupChatInfoActivity r7 = (com.whatsapp.group.GroupChatInfoActivity) r7
            X.36u r3 = (X.C601836u) r3
            X.1sk r0 = r7.A1F
            r6 = 0
            r0.A00 = r6
            X.00s r2 = r0.A02
            boolean r1 = r0.A01
            r0 = 1
            if (r1 != 0) goto L_0x08ca
            r0 = 0
        L_0x08ca:
            X.C36341k9.A18(r2, r0)
            java.util.List r0 = r3.A01
            int r5 = r0.size()
            boolean r4 = r3.A02
            android.view.View r1 = r7.A00
            r0 = 2131429995(0x7f0b0a6b, float:1.8481678E38)
            android.view.View r3 = X.C012005e.A02(r1, r0)
            com.whatsapp.chatinfo.EphemeralMessagesInfoView r3 = (com.whatsapp.chatinfo.EphemeralMessagesInfoView) r3
            X.141 r2 = r7.A0y
            X.147 r1 = r7.A1Y
            X.2Sc r0 = r7.A1A
            r3.A08(r2, r0, r1, r4)
            r7.A3k()
            X.3PA r0 = r7.A0X
            r0.A01()
            android.view.View r1 = r7.A00
            r0 = 2131430186(0x7f0b0b2a, float:1.8482066E38)
            android.view.View r8 = X.C012005e.A02(r1, r0)
            X.22V r8 = (X.AnonymousClass22V) r8
            X.0yC r1 = r7.A0D
            r0 = 3181(0xc6d, float:4.458E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0a1e
            r0 = 2131232346(0x7f08065a, float:1.8080799E38)
            r8.setIcon((int) r0)
            r8.setVisibility(r6)
            X.0v0 r1 = r7.A09
            X.141 r0 = r7.A0y
            X.11F r0 = r0.A0H
            long r3 = r1.A0R(r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0a0f
            r1 = 1
            X.0ts r0 = r7.A0q
            java.util.Locale r0 = X.C36401kF.A0x(r0)
            java.text.DateFormat r2 = java.text.DateFormat.getDateInstance(r1, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
            java.util.Date r0 = new java.util.Date
            r0.<init>(r3)
            java.lang.String r0 = r2.format(r0)
        L_0x0936:
            r8.setDescription((java.lang.CharSequence) r0)
        L_0x0939:
            r0 = 28
            X.AnonymousClass3Y2.A00(r8, r7, r0)
            r7.A3k()
        L_0x0941:
            X.0xQ r2 = r7.A1J
            X.147 r1 = r7.A1Y
            X.16D r0 = r2.A0C
            X.141 r0 = r0.A0A(r1)
            if (r0 != 0) goto L_0x0a05
            r0 = 0
        L_0x094e:
            r4 = 1
            int r9 = r0 + 1
            int r0 = r9 * 9
            int r0 = r0 / 10
            r2 = 8
            if (r5 <= r0) goto L_0x09fe
            if (r5 > r9) goto L_0x09fe
            boolean r0 = X.AnonymousClass22g.A0p(r7)
            if (r0 == 0) goto L_0x09fe
            android.widget.TextView r0 = r7.A0E
            r0.setVisibility(r6)
            android.widget.TextView r8 = r7.A0E
            r3 = 2131892107(0x7f12178b, float:1.9418953E38)
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()
            int r0 = java.lang.Math.min(r5, r9)
            X.C36331k8.A1X(r1, r0, r6, r9, r4)
            X.C36341k9.A0s(r7, r8, r1, r3)
        L_0x0979:
            if (r5 == 0) goto L_0x09ed
            boolean r0 = X.AnonymousClass22g.A0r(r7)
            if (r0 != 0) goto L_0x09ed
            X.1EL r1 = r7.A0N
            X.141 r0 = r7.A0y
            boolean r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x09ed
            X.0xQ r1 = r7.A1J
            X.141 r0 = r7.A0y
            int r0 = r1.A0M(r0)
            if (r0 == r4) goto L_0x09ed
            android.view.View r0 = r7.A04
            r0.setVisibility(r6)
            X.12q r1 = r7.A0J
            X.147 r0 = r7.A1Y
            int r1 = r1.A06(r0)
            r0 = 3
            if (r1 != r0) goto L_0x09e7
            boolean r0 = X.AnonymousClass22g.A0p(r7)
            if (r0 != 0) goto L_0x09e7
            X.0xQ r0 = r7.A1J
            X.1EM r0 = r0.A11
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x09bd
            android.widget.TextView r1 = r7.A0B
            r0 = 2131886485(0x7f120195, float:1.940755E38)
            r1.setText(r0)
        L_0x09bd:
            android.widget.TextView r0 = r7.A0B
            r0.setVisibility(r6)
        L_0x09c2:
            r0 = 2131431235(0x7f0b0f43, float:1.8484193E38)
            X.C36341k9.A13(r7, r0, r6)
        L_0x09c8:
            X.0wU r1 = r7.A04
            r0 = 46
            X.C80243v5.A01(r1, r7, r0)
            X.2Sh r1 = r7.A2J()
            if (r1 == 0) goto L_0x09e1
            if (r5 <= 0) goto L_0x09e1
            int r0 = X.AnonymousClass3UK.A00(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
        L_0x09e1:
            java.lang.String r0 = "update_group_participants"
            r7.A2S(r0)
            return
        L_0x09e7:
            android.widget.TextView r0 = r7.A0B
            r0.setVisibility(r2)
            goto L_0x09c2
        L_0x09ed:
            android.view.View r0 = r7.A04
            r0.setVisibility(r2)
            android.widget.TextView r0 = r7.A0B
            r0.setVisibility(r2)
            r0 = 2131431235(0x7f0b0f43, float:1.8484193E38)
            X.C36341k9.A13(r7, r0, r2)
            goto L_0x09c8
        L_0x09fe:
            android.widget.TextView r0 = r7.A0E
            r0.setVisibility(r2)
            goto L_0x0979
        L_0x0a05:
            X.17X r0 = r2.A0U
            int r0 = r0.A01(r1)
            int r0 = r0 + -1
            goto L_0x094e
        L_0x0a0f:
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0939
            r0 = 2131890169(0x7f120ff9, float:1.9415022E38)
            java.lang.String r0 = r7.getString(r0)
            goto L_0x0936
        L_0x0a1e:
            r0 = 8
            r8.setVisibility(r0)
            goto L_0x0941
        L_0x0a25:
            java.lang.Object r5 = r1.A00
            X.155 r5 = (X.AnonymousClass155) r5
            X.0wn r3 = (X.C19960wn) r3
            X.1Dv r4 = r5.A01
            X.190 r2 = X.C36441kJ.A0j()
            r1 = 0
            java.lang.Object r0 = r3.A00
            if (r0 == 0) goto L_0x0a37
            r1 = r0
        L_0x0a37:
            X.11F r1 = (X.AnonymousClass11F) r1
            android.content.Intent r2 = X.C36391kE.A0F(r5, r2, r1)
            java.lang.String r1 = "args_conversation_screen_entry_point"
            r0 = 3
            android.content.Intent r0 = r2.putExtra(r1, r0)
            r4.A07(r5, r0)
            return
        L_0x0a48:
            java.lang.String r0 = "Intent already contains a bundle with fMessage keys"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0a4f:
            java.util.Collection r0 = r4.values()
            X.AnonymousClass00C.A08(r0)
            java.util.List r2 = X.C007103b.A0Y(r0)
            X.1Ju r1 = r12.A05
            int r0 = r1.A00()
            java.util.List r10 = X.C007103b.A0d(r2, r0)
            boolean r0 = r10.isEmpty()
            r9 = 0
            if (r0 == 0) goto L_0x0a7b
            X.00s r0 = r12.A01
            X.AnonymousClass3R7.A01(r0, r13)
            X.1hi r1 = r12.A06
            X.3Ib r0 = new X.3Ib
            r0.<init>(r9, r9)
        L_0x0a77:
            r1.A0E(r0)
            return
        L_0x0a7b:
            int r0 = r1.A00()
            if (r0 != r3) goto L_0x0a96
            X.00s r1 = r12.A01
            int r0 = X.C36421kH.A06(r10, r3)
            java.lang.Object r0 = r10.get(r0)
            X.AnonymousClass3R7.A01(r1, r0)
            X.1hi r1 = r12.A06
            X.3Ib r0 = new X.3Ib
            r0.<init>(r3, r9)
            goto L_0x0a77
        L_0x0a96:
            int r8 = X.C36421kH.A06(r10, r3)
            java.lang.Object r7 = r10.get(r8)
            X.AnonymousClass00C.A08(r7)
            X.00s r6 = r12.A01
            X.3T1 r5 = X.C36431kI.A0r(r6)
            int r4 = r10.size()
            r3 = -1
            r15 = r13
            r2 = -1
            r14 = -1
        L_0x0aaf:
            if (r9 >= r4) goto L_0x0ad6
            java.lang.Object r1 = r10.get(r9)
            X.AnonymousClass00C.A08(r1)
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            X.3Qa r0 = r1.A1J
            boolean r0 = X.AnonymousClass00C.A0J(r0, r11)
            if (r0 == 0) goto L_0x0ac4
            r14 = r9
            r15 = r1
        L_0x0ac4:
            X.3Qa r1 = r1.A1J
            if (r5 == 0) goto L_0x0ad4
            X.3Qa r0 = r5.A1J
        L_0x0aca:
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0ad1
            r2 = r9
        L_0x0ad1:
            int r9 = r9 + 1
            goto L_0x0aaf
        L_0x0ad4:
            r0 = r13
            goto L_0x0aca
        L_0x0ad6:
            if (r15 == 0) goto L_0x0aec
            r7 = r15
            r8 = r14
        L_0x0ada:
            X.AnonymousClass3R7.A01(r6, r7)
            X.1hi r2 = r12.A06
            int r1 = r10.size()
            X.3Ib r0 = new X.3Ib
            r0.<init>(r1, r8)
            r2.A0E(r0)
            return
        L_0x0aec:
            if (r2 == r3) goto L_0x0ada
            if (r5 == 0) goto L_0x0ada
            r7 = r5
            r8 = r2
            goto L_0x0ada
        L_0x0af3:
            r0 = 8
            r1.A03(r0)
            android.widget.ImageButton r0 = r2.A02
            if (r0 != 0) goto L_0x0b03
            java.lang.String r0 = "emojiButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0b03:
            r0.setVisibility(r6)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r5.A0n
            if (r0 == 0) goto L_0x0b2b
            int r1 = r0.A0J
            r0 = 5
            if (r1 == r0) goto L_0x0b2b
            r0 = 4
            if (r1 == r0) goto L_0x0b2b
            r2 = 2131231748(0x7f080404, float:1.8079586E38)
            X.4V6 r1 = r5.A2l
            r0 = 2131890648(0x7f1211d8, float:1.9415994E38)
        L_0x0b1a:
            java.lang.String r1 = r1.getString(r0)
            android.widget.ImageButton r0 = r5.A0b
            r0.setImageResource(r2)
            android.widget.ImageButton r0 = r5.A0b
            r0.setContentDescription(r1)
            r5.A6I = r6
            return
        L_0x0b2b:
            r2 = 2131231746(0x7f080402, float:1.8079582E38)
            X.4V6 r1 = r5.A2l
            r0 = 2131889081(0x7f120bb9, float:1.9412815E38)
            goto L_0x0b1a
        L_0x0b34:
            X.3Ki r1 = r5.A4x
            int r0 = r3.size()
            r1.A02(r0)
            r0 = 1
            r5.A6I = r0
            java.lang.Object r4 = r3.get(r6)
            X.1RJ r0 = r5.A5L
            if (r0 == 0) goto L_0x0b5c
            X.3P6 r1 = r5.A4u
            X.AnonymousClass00C.A0D(r4, r6)
            android.os.Handler r3 = r1.A07
            r0 = 20
            X.3wd r2 = new X.3wd
            r2.<init>(r1, r4, r0)
            r0 = 800(0x320, double:3.953E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x0b5c:
            X.4V6 r0 = r5.A2l
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131894543(0x7f12210f, float:1.9423894E38)
            java.lang.String r2 = r1.getString(r0)
            r1 = 2131233768(0x7f080be8, float:1.8083683E38)
            android.widget.ImageButton r0 = r5.A0b
            r0.setImageResource(r1)
            android.widget.ImageButton r0 = r5.A0b
            r0.setContentDescription(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66033Uk.BTH(java.lang.Object):void");
    }
}
