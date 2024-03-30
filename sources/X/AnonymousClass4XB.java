package X;

/* renamed from: X.4XB  reason: invalid class name */
public class AnonymousClass4XB implements AnonymousClass4SO {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4XB(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r11 != 3) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bcs(boolean r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.A02
            switch(r0) {
                case 0: goto L_0x0053;
                case 1: goto L_0x008f;
                case 2: goto L_0x00c6;
                case 3: goto L_0x0149;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r9.A00
            X.3Av r5 = (X.C61173Av) r5
            java.lang.Object r4 = r9.A01
            X.3Qq r4 = (X.C65083Qq) r4
            X.1RJ r1 = r5.A08
            boolean r0 = r4.A0X()
            int r0 = X.C36381kD.A00(r0)
            r1.A03(r0)
            android.widget.FrameLayout r3 = r5.A01
            android.content.Context r2 = r3.getContext()
            boolean r1 = r4.A0X()
            r0 = 2131893093(0x7f121b65, float:1.9420953E38)
            if (r1 == 0) goto L_0x002c
            r0 = 2131892143(0x7f1217af, float:1.9419026E38)
        L_0x002c:
            X.C36331k8.A0q(r2, r3, r0)
            X.32h r0 = r5.A07
            boolean r3 = r4.A0X()
            X.3UB r2 = r0.A00
            X.1hi r0 = r2.A0n
            X.C36341k9.A18(r0, r3)
            X.1hi r1 = r2.A0m
            if (r3 != 0) goto L_0x004c
            X.3Av r0 = r2.A09
            X.3Qq r0 = r0.A00
            if (r0 == 0) goto L_0x0051
            int r0 = r0.A04()
            if (r0 == 0) goto L_0x0051
        L_0x004c:
            r0 = 0
        L_0x004d:
            X.C36341k9.A16(r1, r0)
        L_0x0050:
            return
        L_0x0051:
            r0 = 1
            goto L_0x004d
        L_0x0053:
            java.lang.Object r5 = r9.A00
            X.2I9 r5 = (X.AnonymousClass2I9) r5
            java.lang.Object r1 = r9.A01
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            r6 = 0
            if (r10 == 0) goto L_0x0062
            r0 = 3
            r4 = 1
            if (r11 == r0) goto L_0x0063
        L_0x0062:
            r4 = 0
        L_0x0063:
            boolean r3 = r1.get()
            r1.set(r4)
            r2 = 4
            if (r11 != r2) goto L_0x0078
            X.3T1 r0 = r5.A0K
            X.3Qa r1 = r0.A1J
            X.3Pr r0 = r5.A0C
            if (r0 == 0) goto L_0x0078
            r0.A03(r1)
        L_0x0078:
            if (r4 == r3) goto L_0x0050
            android.view.View r0 = r5.A04
            if (r4 == 0) goto L_0x01cc
            r0.setVisibility(r2)
            android.view.ViewGroup r1 = r5.A06
            r0 = 8
            r1.sendAccessibilityEvent(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r5.A03 = r0
            return
        L_0x008f:
            java.lang.Object r4 = r9.A00
            X.2ke r4 = (X.C50372ke) r4
            java.lang.Object r1 = r9.A01
            X.3Qd r0 = r4.A00
            X.38r r0 = r0.A05
            boolean r0 = X.AnonymousClass00C.A0J(r0, r1)
            if (r0 == 0) goto L_0x0050
            X.3Qd r2 = r4.A00
            X.3I8 r1 = r2.A03
            boolean r0 = r2.A07
            X.C50372ke.A01(r4, r1, r2, r11, r0)
            X.3Qd r2 = r4.A00
            X.2oT r1 = r2.A04
            X.2oT r0 = X.C51842oT.CREATING_PLAYER
            if (r1 != r0) goto L_0x0050
            r0 = 3
            if (r11 != r0) goto L_0x0050
            X.2oT r0 = X.C51842oT.AWAITING_COMPLETION
            X.3Qd r0 = X.C64963Qd.A00(r0, r2)
            X.C50372ke.A02(r4, r0)
            X.17Y r3 = r4.A03
            java.lang.Runnable r2 = r4.A05
            r0 = 150(0x96, double:7.4E-322)
            r3.A0I(r2, r0)
            return
        L_0x00c6:
            java.lang.Object r4 = r9.A00
            X.3Pi r4 = (X.C64763Pi) r4
            X.38r r0 = r4.A00
            if (r0 == 0) goto L_0x0050
            X.3Qq r0 = r0.A03
            r0.A06()
            X.38r r1 = r4.A00
            X.3Qq r0 = r1.A03
            r0.A0a()
            r1.hashCode()
            r0 = 3
            if (r11 != r0) goto L_0x012d
            if (r10 == 0) goto L_0x01d0
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0050
            X.38r r0 = r4.A00
            r0.hashCode()
            android.widget.FrameLayout r3 = r4.A06
            int r0 = r3.getVisibility()
            if (r0 == 0) goto L_0x0121
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r6 = r4.A0B
            r5 = 0
            r3.setAlpha(r5)
            r0 = 0
            r3.setVisibility(r0)
            android.view.ViewPropertyAnimator r1 = r3.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r1.alpha(r0)
            r1 = 150(0x96, double:7.4E-322)
            r0.setDuration(r1)
            android.view.ViewPropertyAnimator r0 = r6.animate()
            android.view.ViewPropertyAnimator r0 = r0.alpha(r5)
            android.view.ViewPropertyAnimator r2 = r0.setDuration(r1)
            r1 = 1
            X.4VE r0 = new X.4VE
            r0.<init>(r6, r4, r1)
            r2.setListener(r0)
        L_0x0121:
            android.view.View r1 = r4.A04
            r0 = 4
            X.C64763Pi.A00(r1, r4, r0)
            r0 = 8
            r3.sendAccessibilityEvent(r0)
            return
        L_0x012d:
            r0 = 4
            if (r11 != r0) goto L_0x013c
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r0 = r4.A0B
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r4.A04
            X.C64763Pi.A00(r0, r4, r1)
            return
        L_0x013c:
            r0 = 1
            if (r11 != r0) goto L_0x0050
            r4.A03 = r0
            X.38r r0 = r4.A00
            X.3Qq r0 = r0.A03
            r0.A0A()
            return
        L_0x0149:
            java.lang.Object r3 = r9.A00
            com.whatsapp.inappsupport.ui.SupportVideoActivity r3 = (com.whatsapp.inappsupport.ui.SupportVideoActivity) r3
            java.lang.Object r0 = r9.A01
            X.38P r0 = (X.AnonymousClass38P) r0
            r1 = 1
            X.AnonymousClass00C.A0D(r0, r1)
            r1 = 3
            r2 = 128(0x80, float:1.794E-43)
            if (r11 != r1) goto L_0x0193
            if (r10 == 0) goto L_0x0197
            android.view.Window r1 = r3.getWindow()
            r1.addFlags(r2)
            X.3Qq r1 = r3.A3i()
            r1.A04()
            boolean r1 = r0.A01
            if (r1 != 0) goto L_0x0050
            X.9SQ r3 = r0.A02
            r6 = 1
            X.3Qq r2 = r0.A03
            int r7 = r2.A04()
            int r8 = r2.A05()
            boolean r1 = r2.A0b()
            if (r1 == 0) goto L_0x0190
            java.lang.String r5 = "on"
        L_0x0183:
            r4 = 0
            r3.A00(r4, r5, r6, r7, r8)
            int r1 = r2.A04()
            r0.A00 = r1
            r0.A01 = r6
            return
        L_0x0190:
            java.lang.String r5 = "off"
            goto L_0x0183
        L_0x0193:
            if (r11 != r1) goto L_0x01e0
            if (r10 != 0) goto L_0x01e0
        L_0x0197:
            android.view.Window r1 = r3.getWindow()
            r1.clearFlags(r2)
            boolean r1 = r0.A01
            if (r1 == 0) goto L_0x0050
            X.9SQ r3 = r0.A02
            r6 = 2
            X.3Qq r2 = r0.A03
            int r7 = r2.A04()
            int r8 = r2.A05()
            boolean r1 = r2.A0b()
            if (r1 == 0) goto L_0x01c9
            java.lang.String r5 = "on"
        L_0x01b7:
            int r2 = r2.A04()
            int r1 = r0.A00
            int r2 = r2 - r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3.A00(r4, r5, r6, r7, r8)
            r1 = 0
            r0.A01 = r1
            return
        L_0x01c9:
            java.lang.String r5 = "off"
            goto L_0x01b7
        L_0x01cc:
            r0.setVisibility(r6)
            return
        L_0x01d0:
            r0 = 20
            X.3v4 r3 = X.C80233v4.A00(r4, r0)
            r4.A01 = r3
            X.17Y r2 = r4.A09
            r0 = 150(0x96, double:7.4E-322)
            r2.A0I(r3, r0)
            return
        L_0x01e0:
            android.view.Window r0 = r3.getWindow()
            r0.clearFlags(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XB.Bcs(boolean, int):void");
    }
}
