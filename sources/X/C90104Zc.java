package X;

import android.view.ViewTreeObserver;

/* renamed from: X.4Zc  reason: invalid class name and case insensitive filesystem */
public class C90104Zc implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public final int A01;

    public C90104Zc(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(ViewTreeObserver viewTreeObserver, Object obj, int i) {
        viewTreeObserver.addOnGlobalLayoutListener(new C90104Zc(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0360, code lost:
        if (r5.A3l() == false) goto L_0x0362;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0389, code lost:
        r0 = r0.getViewTreeObserver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03d4, code lost:
        if (r4.A0f.isShowing() != false) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03d6, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03d8, code lost:
        r2.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03db, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0593, code lost:
        if ((!X.C36421kH.A1U(r3.A02)) != false) goto L_0x0595;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x066c, code lost:
        if (r1.A03.isShowing() != false) goto L_0x066e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0205, code lost:
        r4.post(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0208, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0043, code lost:
        r0.removeOnGlobalLayoutListener(r15);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
            r15 = this;
            int r0 = r15.A01
            switch(r0) {
                case 0: goto L_0x009f;
                case 1: goto L_0x0484;
                case 2: goto L_0x00cd;
                case 3: goto L_0x0498;
                case 4: goto L_0x04a0;
                case 5: goto L_0x04b7;
                case 6: goto L_0x0047;
                case 7: goto L_0x0160;
                case 8: goto L_0x04bf;
                case 9: goto L_0x0504;
                case 10: goto L_0x053f;
                case 11: goto L_0x057d;
                case 12: goto L_0x059f;
                case 13: goto L_0x0188;
                case 14: goto L_0x05a7;
                case 15: goto L_0x01b0;
                case 16: goto L_0x05dc;
                case 17: goto L_0x05f2;
                case 18: goto L_0x01bc;
                case 19: goto L_0x01d1;
                case 20: goto L_0x01ea;
                case 21: goto L_0x0209;
                case 22: goto L_0x060f;
                case 23: goto L_0x061f;
                case 24: goto L_0x022b;
                case 25: goto L_0x025e;
                case 26: goto L_0x0633;
                case 27: goto L_0x0279;
                case 28: goto L_0x029b;
                case 29: goto L_0x030a;
                case 30: goto L_0x034a;
                case 31: goto L_0x038f;
                case 32: goto L_0x03dc;
                case 33: goto L_0x042b;
                case 34: goto L_0x063e;
                case 35: goto L_0x0658;
                default: goto L_0x0005;
            }
        L_0x0005:
            int[] r2 = X.C36441kJ.A1O()
            java.lang.Object r1 = r15.A00
            X.2hS r1 = (X.C48522hS) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            android.view.View r4 = r1.A02
            r4.getLocationOnScreen(r2)
            X.1d0 r3 = r1.A08
            com.whatsapp.updates.ui.UpdatesFragment r3 = (com.whatsapp.updates.ui.UpdatesFragment) r3
            X.1Sf r0 = r3.A1c()
            X.0yC r1 = r0.A00
            r0 = 6796(0x1a8c, float:9.523E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 1
            r2 = r2[r0]
            android.content.res.Resources r1 = X.C36341k9.A0G(r3)
            r0 = 2131168377(0x7f070c79, float:1.7951054E38)
            int r0 = X.C36441kJ.A06(r1, r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0x = r0
            com.whatsapp.updates.ui.UpdatesFragment.A06(r3)
        L_0x003d:
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            if (r0 == 0) goto L_0x0046
        L_0x0043:
            r0.removeOnGlobalLayoutListener(r15)
        L_0x0046:
            return
        L_0x0047:
            java.lang.Object r3 = r15.A00
            X.2E6 r3 = (X.AnonymousClass2E6) r3
            r3.A0B()
            android.widget.ListView r0 = r3.A0I
            X.C36361kB.A16(r0, r15)
            int r1 = r3.getWidth()
            int r0 = r3.getHeight()
            if (r1 <= r0) goto L_0x0076
            boolean r0 = r3.A0T
            if (r0 != 0) goto L_0x0076
            android.app.Activity r0 = X.C36361kB.A06(r3)
            X.01I r0 = (X.AnonymousClass01I) r0
            r0.A1q()
            android.widget.ListView r2 = r3.A0I
            r1 = 3
            X.2vQ r0 = new X.2vQ
            r0.<init>(r3, r1)
            r2.setOnScrollListener(r0)
            return
        L_0x0076:
            int r0 = r3.getMeasuredWidth()
            int r2 = r3.A08(r0)
            int r0 = r3.getMeasuredWidth()
            int r0 = r3.A07(r0)
            int r2 = r2 - r0
            r3.A09 = r2
            android.widget.ListView r1 = r3.A0I
            r0 = 0
            r1.setSelectionFromTop(r0, r2)
            int r0 = r3.A09
            r3.setScrollPos(r0)
            android.widget.ListView r4 = r3.A0I
            r0 = 18
            X.3wp r1 = new X.3wp
            r1.<init>((X.AnonymousClass2E6) r3, (int) r0)
            goto L_0x0205
        L_0x009f:
            java.lang.Object r3 = r15.A00
            X.3Tz r3 = (X.C65923Tz) r3
            int r0 = X.C65923Tz.A0Z
            androidx.viewpager.widget.ViewPager r0 = r3.A0K
            int r2 = r0.getWidth()
            android.content.res.Resources r1 = X.C36341k9.A0F(r0)
            r0 = 2131166430(0x7f0704de, float:1.7947105E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r2 = r2 / r0
            int r0 = r3.A01
            if (r0 == r2) goto L_0x0046
            r3.A01 = r2
            X.1nQ[] r3 = r3.A0P
            int r2 = r3.length
            r1 = 0
        L_0x00c1:
            if (r1 >= r2) goto L_0x0046
            r0 = r3[r1]
            if (r0 == 0) goto L_0x00ca
            r0.notifyDataSetChanged()
        L_0x00ca:
            int r1 = r1 + 1
            goto L_0x00c1
        L_0x00cd:
            java.lang.Object r6 = r15.A00
            X.3dG r6 = (X.C69273dG) r6
            X.2E6 r3 = r6.A0l
            X.C36361kB.A16(r3, r15)
            X.9uZ r0 = r6.A0I
            int r5 = r3.getMeasuredWidth()
            if (r0 == 0) goto L_0x0143
            X.3XP r4 = r0.A04
            if (r4 == 0) goto L_0x0143
            X.3dA r0 = r6.A0L
            if (r0 == 0) goto L_0x00fd
            X.3XP r0 = r0.A01
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r4.A00
            boolean r0 = X.C1901797e.A00(r1, r0)
            if (r0 != 0) goto L_0x0046
            X.3Am r0 = r6.A16
            X.3dA r1 = r6.A0L
            X.4zP r0 = r0.A00
            if (r0 == 0) goto L_0x00fd
            r0.A00(r1)
        L_0x00fd:
            X.30U r2 = new X.30U
            r2.<init>(r6)
            int r0 = r3.A08(r5)
            X.3dA r1 = new X.3dA
            r1.<init>(r2, r4, r5, r0)
            r6.A0L = r1
            X.3Am r2 = r6.A16
            X.4zP r3 = r2.A00
            if (r3 != 0) goto L_0x013e
            X.0wG r0 = r2.A04
            android.content.Context r0 = r0.A00
            java.io.File r3 = r0.getCacheDir()
            java.lang.String r0 = "cover_photos"
            java.io.File r12 = X.C36441kJ.A0w(r3, r0)
            X.3d9 r6 = new X.3d9
            r6.<init>()
            X.0wo r7 = r2.A03
            X.0yC r8 = r2.A05
            X.17Y r4 = r2.A01
            X.0ww r5 = r2.A02
            X.0yW r9 = r2.A06
            X.1BS r11 = r2.A08
            X.1BV r10 = r2.A07
            r14 = 1
            java.lang.String r13 = "cover-photo-loader"
            X.4zP r3 = new X.4zP
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2.A00 = r3
        L_0x013e:
            r0 = 1
            r3.A01(r1, r0)
            return
        L_0x0143:
            r1 = 0
            boolean r0 = r3 instanceof com.whatsapp.chatinfo.view.custom.BusinessChatInfoLayout
            if (r0 == 0) goto L_0x0046
            r0 = 2131432708(0x7f0b1504, float:1.8487181E38)
            android.widget.ImageView r0 = X.C36401kF.A0G(r3, r0)
            r0.setImageDrawable(r1)
            r3.A0D()
            android.widget.ListView r0 = r3.A0I
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 6
            A00(r1, r3, r0)
            return
        L_0x0160:
            java.lang.Object r3 = r15.A00
            X.2E6 r3 = (X.AnonymousClass2E6) r3
            android.widget.ListView r0 = r3.A0I
            X.C36361kB.A16(r0, r15)
            boolean r0 = r3.A0U
            if (r0 != 0) goto L_0x0046
            int r0 = r3.getMeasuredWidth()
            int r2 = r3.A08(r0)
            int r0 = r3.getMeasuredWidth()
            int r0 = r3.A07(r0)
            int r2 = r2 - r0
            android.widget.ListView r1 = r3.A0I
            r0 = 0
            r1.setSelectionFromTop(r0, r2)
            r3.setScrollPos(r2)
            return
        L_0x0188:
            int[] r3 = X.C36441kJ.A1O()
            java.lang.Object r2 = r15.A00
            X.1qO r2 = (X.C38891qO) r2
            android.view.View r4 = r2.A04
            r4.getLocationOnScreen(r3)
            boolean r0 = r2.isShowing()
            if (r0 != 0) goto L_0x019f
            X.C38891qO.A03(r2)
            return
        L_0x019f:
            int r1 = r2.A01
            r0 = 0
            r0 = r3[r0]
            if (r1 == r0) goto L_0x0046
            X.C38891qO.A03(r2)
            r0 = 12
            X.3v3 r1 = X.C80223v3.A00(r15, r0)
            goto L_0x0205
        L_0x01b0:
            java.lang.Object r0 = r15.A00
            X.2HA r0 = (X.AnonymousClass2HA) r0
            X.AnonymousClass2HA.A02(r0)
            r0.A04()
            goto L_0x0389
        L_0x01bc:
            java.lang.Object r1 = r15.A00
            X.3fk r1 = (X.C70803fk) r1
            android.view.View r0 = r1.A0D
            X.C36351kA.A1C(r0, r15)
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r4 = r1.A3l
            if (r4 == 0) goto L_0x0046
            r0 = 40
            X.3wT r1 = new X.3wT
            r1.<init>((java.lang.Object) r15, (int) r0)
            goto L_0x0205
        L_0x01d1:
            java.lang.Object r3 = r15.A00
            X.3HK r3 = (X.AnonymousClass3HK) r3
            X.3IH r2 = r3.A0R
            if (r2 == 0) goto L_0x0046
            X.80Q r0 = r3.A09
            if (r0 == 0) goto L_0x0046
            java.lang.String r1 = "ice_breaker_recycler_view_render_complete"
            r2.A00(r1)
            r0 = 2
            r2.A02(r1, r0)
            X.80Q r0 = r3.A09
            goto L_0x0389
        L_0x01ea:
            java.lang.Object r1 = r15.A00
            X.3UT r1 = (X.AnonymousClass3UT) r1
            android.view.View r0 = r1.A02
            if (r0 == 0) goto L_0x01fb
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x01fb
            r0.removeOnGlobalLayoutListener(r15)
        L_0x01fb:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r4 = r1.A0E
            if (r4 == 0) goto L_0x0046
            r0 = 8
            X.3v5 r1 = X.C80243v5.A00(r1, r0)
        L_0x0205:
            r4.post(r1)
            return
        L_0x0209:
            java.lang.Object r3 = r15.A00
            com.whatsapp.greenalert.GreenAlertActivity r3 = (com.whatsapp.greenalert.GreenAlertActivity) r3
            com.whatsapp.WaViewPager r0 = r3.A02
            X.C36351kA.A1C(r0, r15)
            com.whatsapp.WaViewPager r1 = r3.A02
            int r0 = r1.getCurrentLogicalItem()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.view.View r2 = r1.findViewWithTag(r0)
            if (r2 == 0) goto L_0x0046
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            r0 = 3
            X.C90204Zm.A00(r1, r3, r2, r0)
            return
        L_0x022b:
            java.lang.Object r5 = r15.A00
            X.1kU r5 = (X.C36551kU) r5
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r0 = r5.A02
            X.C36361kB.A16(r0, r15)
            int[] r4 = X.C36441kJ.A1O()
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r0 = r5.A02
            r0.getLocationOnScreen(r4)
            int r1 = r5.A00
            if (r1 == 0) goto L_0x0046
            r3 = 1
            r0 = r4[r3]
            int r1 = r1 - r0
            if (r1 < 0) goto L_0x0046
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r0 = r5.A02
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            X.AnonymousClass00C.A0E(r2, r0)
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r1 = r5.A00
            r0 = r4[r3]
            int r1 = r1 - r0
            r0 = 0
            r2.setMargins(r0, r1, r0, r0)
            return
        L_0x025e:
            java.lang.Object r4 = r15.A00
            X.1qM r4 = (X.C38871qM) r4
            X.4Oz r3 = r4.A04
            android.view.View r3 = (android.view.View) r3
            X.C36361kB.A16(r3, r15)
            boolean r0 = r4.isShowing()
            if (r0 != 0) goto L_0x0046
            r2 = 48
            r1 = 0
            r0 = 1000000(0xf4240, float:1.401298E-39)
            r4.showAtLocation(r3, r2, r1, r0)
            return
        L_0x0279:
            java.lang.Object r3 = r15.A00
            com.whatsapp.registration.EULA r3 = (com.whatsapp.registration.EULA) r3
            android.view.View r0 = r3.A02
            if (r0 == 0) goto L_0x0046
            X.C36361kB.A16(r0, r15)
            android.view.View r0 = r3.A02
            int r2 = r0.getHeight()
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168095(0x7f070b5f, float:1.7950482E38)
            int r0 = r1.getDimensionPixelSize(r0)
            if (r2 >= r0) goto L_0x0046
            android.view.View r2 = r3.A02
            goto L_0x03d6
        L_0x029b:
            java.lang.Object r2 = r15.A00
            com.whatsapp.registration.EULA r2 = (com.whatsapp.registration.EULA) r2
            androidx.core.widget.NestedScrollView r0 = r2.A03
            X.C36351kA.A1C(r0, r15)
            androidx.core.widget.NestedScrollView r0 = r2.A03
            int r4 = r0.getMeasuredHeight()
            androidx.core.widget.NestedScrollView r0 = r2.A03
            r3 = 0
            android.view.View r0 = r0.getChildAt(r3)
            int r0 = r0.getHeight()
            int r4 = r4 - r0
            r1 = 1
            if (r4 >= 0) goto L_0x02ba
            r3 = 1
        L_0x02ba:
            int r0 = X.C36341k9.A04(r2)
            if (r0 != r1) goto L_0x02e2
            r0 = 2131430029(0x7f0b0a8d, float:1.8481747E38)
            android.view.View r1 = r2.findViewById(r0)
            androidx.cardview.widget.CardView r1 = (androidx.cardview.widget.CardView) r1
            if (r1 == 0) goto L_0x0046
            if (r3 == 0) goto L_0x02d9
            r0 = 1090519040(0x41000000, float:8.0)
            r1.setCardElevation(r0)
            r0 = 2131100309(0x7f060295, float:1.7812996E38)
        L_0x02d5:
            X.C36341k9.A0q(r2, r1, r0)
            return
        L_0x02d9:
            r0 = 0
            r1.setCardElevation(r0)
            int r0 = X.C36411kG.A01(r2)
            goto L_0x02d5
        L_0x02e2:
            int r1 = X.C36341k9.A04(r2)
            r0 = 2
            if (r1 != r0) goto L_0x0046
            r0 = 2131429145(0x7f0b0719, float:1.8479954E38)
            android.view.View r2 = r2.findViewById(r0)
            if (r2 == 0) goto L_0x0046
            if (r3 == 0) goto L_0x0046
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            boolean r0 = r0 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L_0x0046
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r0 = 48
            r1.gravity = r0
            r2.setLayoutParams(r1)
            return
        L_0x030a:
            java.lang.Object r4 = r15.A00
            com.whatsapp.registration.phonenumberentry.RegisterPhone r4 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r4
            android.widget.ScrollView r0 = r4.A09
            android.view.View r0 = r0.getRootView()
            int r3 = r0.getHeight()
            android.widget.ScrollView r0 = r4.A09
            int r0 = r0.getHeight()
            int r3 = r3 - r0
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168113(0x7f070b71, float:1.7950519E38)
            int r0 = r1.getDimensionPixelSize(r0)
            if (r3 <= r0) goto L_0x0046
            android.widget.ScrollView r2 = r4.A09
            r1 = 0
            android.widget.Button r0 = r4.A08
            int r0 = r0.getTop()
            r2.smoothScrollTo(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "RegisterPhone/layout heightDiff:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "scroll view"
            X.C36321k7.A1a(r1, r0)
            return
        L_0x034a:
            java.lang.Object r5 = r15.A00
            com.whatsapp.status.playback.MessageReplyActivity r5 = (com.whatsapp.status.playback.MessageReplyActivity) r5
            android.content.res.Configuration r4 = X.AnonymousClass000.A0U(r5)
            android.widget.FrameLayout r3 = r5.A04
            boolean r0 = com.whatsapp.status.playback.MessageReplyActivity.A0m(r4, r5)
            r2 = 0
            if (r0 != 0) goto L_0x0362
            boolean r1 = r5.A3l()
            r0 = 0
            if (r1 != 0) goto L_0x0364
        L_0x0362:
            r0 = 8
        L_0x0364:
            r3.setVisibility(r0)
            boolean r0 = com.whatsapp.status.playback.MessageReplyActivity.A0m(r4, r5)
            if (r0 != 0) goto L_0x0046
            int r1 = r4.orientation
            r0 = 2
            if (r1 != r0) goto L_0x0381
            boolean r0 = X.C36381kD.A1X(r5)
            if (r0 == 0) goto L_0x0381
            android.view.View r0 = r5.A01
            boolean r0 = X.AnonymousClass1N2.A00(r0)
            if (r0 != 0) goto L_0x0381
            r2 = 1
        L_0x0381:
            boolean r0 = com.whatsapp.status.playback.MessageReplyActivity.A0n(r5, r2)
            if (r0 == 0) goto L_0x0046
            android.view.ViewGroup r0 = r5.A03
        L_0x0389:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            goto L_0x0043
        L_0x038f:
            java.lang.Object r4 = r15.A00
            com.whatsapp.status.playback.StatusReplyActivity r4 = (com.whatsapp.status.playback.StatusReplyActivity) r4
            com.whatsapp.status.playback.StatusReplyActivity.A0I(r4)
            android.view.View r0 = r4.A01
            java.lang.Runnable r3 = r4.A04
            r0.removeCallbacks(r3)
            android.view.View r2 = r4.A01
            android.content.res.Resources r1 = r4.getResources()
            r0 = 17694722(0x10e0002, float:2.6081287E-38)
            int r0 = r1.getInteger(r0)
            long r0 = (long) r0
            r2.postDelayed(r3, r0)
            android.content.res.Configuration r1 = X.AnonymousClass000.A0U(r4)
            boolean r0 = X.C36381kD.A1X(r4)
            if (r0 == 0) goto L_0x0046
            int r1 = r1.orientation
            r0 = 2
            if (r1 != r0) goto L_0x0046
            android.widget.FrameLayout r2 = r4.A04
            android.view.View r0 = r4.A01
            boolean r0 = X.AnonymousClass1N2.A00(r0)
            if (r0 != 0) goto L_0x03d6
            boolean r0 = r4.A3l()
            if (r0 == 0) goto L_0x03d6
            X.2M8 r0 = r4.A0f
            boolean r1 = r0.isShowing()
            r0 = 0
            if (r1 == 0) goto L_0x03d8
        L_0x03d6:
            r0 = 8
        L_0x03d8:
            r2.setVisibility(r0)
            return
        L_0x03dc:
            java.lang.Object r8 = r15.A00
            X.3Yp r8 = (X.C67123Yp) r8
            java.lang.Object r7 = r8.A04
            android.view.View r7 = (android.view.View) r7
            java.lang.Object r6 = r8.A00
            int[] r6 = (int[]) r6
            r7.getLocationOnScreen(r6)
            java.lang.Object r5 = r8.A01
            int[] r5 = (int[]) r5
            r4 = 0
            r0 = r5[r4]
            r3 = r6[r4]
            r2 = 1
            if (r0 != r3) goto L_0x03fd
            r1 = r5[r2]
            r0 = r6[r2]
            if (r1 == r0) goto L_0x0046
        L_0x03fd:
            r5[r4] = r3
            r0 = r6[r2]
            r5[r2] = r0
            java.lang.Object r1 = r8.A05
            X.0Ws r1 = (X.C07200Ws) r1
            X.0Ut r0 = r1.A04
            r0.A01()
            r1.A00()
            java.lang.Object r0 = r8.A06
            if (r0 != 0) goto L_0x0421
            android.view.ViewTreeObserver r0 = r7.getViewTreeObserver()
            X.C18740tg.A06(r0)
            r8.A06 = r0
            if (r0 == 0) goto L_0x0421
            r0.addOnGlobalLayoutListener(r15)
        L_0x0421:
            java.lang.Object r0 = r8.A03
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r0 = (com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment) r0
            r0.A06 = r2
            r0.A1a()
            return
        L_0x042b:
            java.lang.Object r5 = r15.A00
            com.whatsapp.status.playback.widget.VoiceStatusContentView r5 = (com.whatsapp.status.playback.widget.VoiceStatusContentView) r5
            X.4Oh r4 = r5.A05
            if (r4 == 0) goto L_0x045c
            int r3 = r5.getPreviewWavesSegmentsCount()
            X.3rL r4 = (X.C77963rL) r4
            X.00s r0 = r4.A01
            X.C36341k9.A16(r0, r3)
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x045c
            java.util.ArrayList r2 = X.C36441kJ.A14(r3)
            r1 = 0
        L_0x0447:
            if (r1 >= r3) goto L_0x0454
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x0447
        L_0x0454:
            X.4Rr r0 = r4.A04
            r0.setVoiceVisualizerSegments(r2)
            r0 = 1
            r4.A00 = r0
        L_0x045c:
            com.whatsapp.conversation.waveforms.VoiceVisualizer r0 = r5.A01
            java.lang.String r2 = "voiceVisualizer"
            if (r0 != 0) goto L_0x0467
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0467:
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            com.whatsapp.conversation.waveforms.VoiceVisualizer r0 = r5.A01
            if (r0 != 0) goto L_0x0474
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0474:
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L_0x0046
            boolean r0 = r1.isAlive()
            if (r0 == 0) goto L_0x0046
            r1.removeOnGlobalLayoutListener(r15)
            return
        L_0x0484:
            java.lang.Object r2 = r15.A00
            com.whatsapp.PagerSlidingTabStrip r2 = (com.whatsapp.PagerSlidingTabStrip) r2
            X.C36351kA.A1C(r2, r15)
            androidx.viewpager.widget.ViewPager r0 = r2.A04
            int r1 = r0.getCurrentItem()
            r2.A01 = r1
            r0 = 0
            com.whatsapp.PagerSlidingTabStrip.A01(r2, r1, r0)
            return
        L_0x0498:
            java.lang.Object r0 = r15.A00
            com.whatsapp.calling.callhistory.CallLogActivity r0 = (com.whatsapp.calling.callhistory.CallLogActivity) r0
            com.whatsapp.calling.callhistory.CallLogActivity.A0F(r0)
            return
        L_0x04a0:
            java.lang.Object r2 = r15.A00
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet r2 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet) r2
            android.view.View r0 = r2.A03
            X.C36361kB.A16(r0, r15)
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x04b3
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r2.A05
            r0 = 4
            r1.A0W(r0)
        L_0x04b3:
            r0 = 0
            r2.A06 = r0
            return
        L_0x04b7:
            java.lang.Object r0 = r15.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r0 = (com.whatsapp.chatinfo.ListChatInfoActivity) r0
            com.whatsapp.chatinfo.ListChatInfoActivity.A0z(r0)
            return
        L_0x04bf:
            java.lang.Object r3 = r15.A00
            com.whatsapp.chatinfo.view.custom.CollapsingProfilePhotoView r3 = (com.whatsapp.chatinfo.view.custom.CollapsingProfilePhotoView) r3
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = r3.A09
            X.C36361kB.A16(r0, r15)
            r0 = 0
            r3.A0B = r0
            int r0 = r3.getWidth()
            r3.A02 = r0
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = r3.A09
            int r1 = r0.getLeft()
            r3.A05 = r1
            int r0 = r3.A0E
            int r1 = r1 - r0
            r3.A03 = r1
            int r1 = r3.A06
            int r0 = r3.A01
            r3.A02(r1, r0)
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = r3.A09
            int r2 = r0.getWidth()
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = r3.A09
            int r0 = r0.getHeight()
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r2, r0)
            r0 = 17
            r1.gravity = r0
            android.widget.ImageView r0 = r3.A07
            r0.setLayoutParams(r1)
            r0 = 0
            r3.setAnimationValue(r0)
            return
        L_0x0504:
            java.lang.Object r3 = r15.A00
            com.whatsapp.community.CommunityHomeActivity r3 = (com.whatsapp.community.CommunityHomeActivity) r3
            com.whatsapp.TextEmojiLabel r0 = r3.A0L
            X.C36351kA.A1C(r0, r15)
            X.07B r2 = r3.getSupportActionBar()
            com.google.android.material.appbar.AppBarLayout r1 = r3.A0F
            X.0ts r11 = r3.A00
            android.widget.ImageView r6 = r3.A08
            com.whatsapp.TextEmojiLabel r9 = r3.A0L
            com.whatsapp.TextEmojiLabel r10 = r3.A0K
            android.widget.TextView r7 = r3.A0B
            android.widget.TextView r8 = r3.A0A
            X.C36391kE.A19(r3, r2)
            r0 = 1
            r2.A0V(r0)
            android.view.View r5 = r2.A0B()
            X.C18740tg.A04(r5)
            X.8Xi r4 = new X.8Xi
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r1.A02(r4)
            r3.A0M = r4
            X.00s r1 = r4.A07
            r0 = 40
            X.C55422ub.A01(r3, r1, r0)
            return
        L_0x053f:
            java.lang.Object r4 = r15.A00
            X.2Es r4 = (X.AnonymousClass2Es) r4
            android.view.View r0 = r4.A02
            boolean r3 = X.AnonymousClass1N2.A00(r0)
            int r1 = X.C36341k9.A04(r4)
            r2 = 1
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            X.07B r1 = r4.getSupportActionBar()
            if (r3 == 0) goto L_0x0572
            if (r0 == 0) goto L_0x0572
            X.060 r0 = r4.A05
            r0.A04(r2)
            if (r1 == 0) goto L_0x0565
            r1.A0D()
        L_0x0565:
            int r0 = r4.A00
            if (r0 != 0) goto L_0x056f
            com.whatsapp.WaEditText r0 = r4.A07
        L_0x056b:
            r0.requestFocus()
            return
        L_0x056f:
            com.whatsapp.WaEditText r0 = r4.A08
            goto L_0x056b
        L_0x0572:
            X.060 r0 = r4.A05
            r0.A05(r2)
            if (r1 == 0) goto L_0x0565
            r1.A0E()
            goto L_0x0565
        L_0x057d:
            java.lang.Object r3 = r15.A00
            com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity r3 = (com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity) r3
            android.widget.ScrollView r0 = r3.A02
            boolean r0 = X.AnonymousClass3MY.A00(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0595
            android.widget.ScrollView r0 = r3.A02
            boolean r0 = X.C36421kH.A1U(r0)
            r0 = r0 ^ 1
            r1 = 1
            if (r0 == 0) goto L_0x0596
        L_0x0595:
            r1 = 0
        L_0x0596:
            android.view.View r0 = r3.A01
            if (r1 != 0) goto L_0x059b
            r2 = 4
        L_0x059b:
            r0.setVisibility(r2)
            return
        L_0x059f:
            java.lang.Object r0 = r15.A00
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r0 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r0
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment.A07(r0)
            return
        L_0x05a7:
            java.lang.Object r0 = r15.A00
            X.1qO r0 = (X.C38891qO) r0
            com.whatsapp.components.CircularRevealView r4 = r0.A07
            X.C36351kA.A1C(r4, r15)
            X.C38891qO.A04(r0)
            r0 = 0
            r4.setVisibility(r0)
            int r1 = r4.getWidth()
            int r0 = r4.getHeight()
            int r0 = java.lang.Math.max(r1, r0)
            int r3 = r4.A00
            int r2 = r4.A01
            float r1 = (float) r0
            r0 = 0
            android.animation.Animator r2 = android.view.ViewAnimationUtils.createCircularReveal(r4, r3, r2, r0, r1)
            int r0 = r4.A02
            long r0 = (long) r0
            r2.setDuration(r0)
            android.animation.Animator$AnimatorListener r0 = r4.A03
            r2.addListener(r0)
            r2.start()
            return
        L_0x05dc:
            java.lang.Object r1 = r15.A00
            X.4Vr r1 = (X.C89214Vr) r1
            java.lang.Object r0 = r1.A00
            android.view.View r0 = (android.view.View) r0
            X.C36361kB.A16(r0, r15)
            java.lang.Object r1 = r1.A01
            X.1la r1 = (X.C36961la) r1
            r0 = -1
            r1.A00 = r0
            r1.invalidateSelf()
            return
        L_0x05f2:
            java.lang.Object r1 = r15.A00
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r1 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity) r1
            android.widget.ListView r0 = r1.A02
            X.C36361kB.A16(r0, r15)
            android.widget.ListView r2 = r1.A02
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165186(0x7f070002, float:1.7944582E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r1 = r0 * 3
            r0 = 1
            r2.setSelectionFromTop(r0, r1)
            return
        L_0x060f:
            java.lang.Object r1 = r15.A00
            com.whatsapp.group.GroupAdminPickerActivity r1 = (com.whatsapp.group.GroupAdminPickerActivity) r1
            android.view.View r0 = r1.A01
            X.C36361kB.A16(r0, r15)
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r1.A03
            r0 = 3
            r1.A0W(r0)
            return
        L_0x061f:
            java.lang.Object r1 = r15.A00
            com.whatsapp.group.GroupProfileEmojiEditor r1 = (com.whatsapp.group.GroupProfileEmojiEditor) r1
            com.whatsapp.KeyboardPopupLayout r0 = r1.A06
            X.C36351kA.A1C(r0, r15)
            X.3lK r0 = r1.A0E
            X.2M8 r0 = r0.A05
            X.C18740tg.A06(r0)
            r0.A0E()
            return
        L_0x0633:
            java.lang.Object r0 = r15.A00
            android.view.View r0 = (android.view.View) r0
            X.C36351kA.A1C(r0, r15)
            r0.requestLayout()
            return
        L_0x063e:
            java.lang.Object r3 = r15.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r3 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r3
            android.view.ViewGroup r0 = r3.A06
            X.C36351kA.A1C(r0, r15)
            android.view.ViewGroup r1 = r3.A06
            float r0 = X.C36441kJ.A02(r1)
            r1.setTranslationY(r0)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            r0 = 0
            X.AnonymousClass4VI.A00(r3, r1, r2, r0)
            return
        L_0x0658:
            java.lang.Object r1 = r15.A00
            X.3Aa r1 = (X.C60963Aa) r1
            android.view.View r4 = r1.A00
            boolean r0 = X.AnonymousClass1N2.A00(r4)
            r3 = 0
            if (r0 != 0) goto L_0x066e
            X.22t r0 = r1.A03
            boolean r0 = r0.isShowing()
            r2 = 0
            if (r0 == 0) goto L_0x066f
        L_0x066e:
            r2 = 1
        L_0x066f:
            r0 = 2131431159(0x7f0b0ef7, float:1.848404E38)
            android.view.View r1 = r4.findViewById(r0)
            int r0 = X.C36381kD.A09(r2)
            r1.setVisibility(r0)
            r0 = 2131429843(0x7f0b09d3, float:1.848137E38)
            android.view.View r1 = r4.findViewById(r0)
            int r0 = X.C36381kD.A09(r2)
            r1.setVisibility(r0)
            r0 = 2131431160(0x7f0b0ef8, float:1.8484041E38)
            android.view.View r0 = r4.findViewById(r0)
            if (r2 == 0) goto L_0x0696
            r3 = 8
        L_0x0696:
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90104Zc.onGlobalLayout():void");
    }
}
