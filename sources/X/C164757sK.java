package X;

import android.view.ViewTreeObserver;

/* renamed from: X.7sK  reason: invalid class name and case insensitive filesystem */
public class C164757sK implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public final int A01;

    public C164757sK(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(ViewTreeObserver viewTreeObserver, Object obj, int i) {
        viewTreeObserver.addOnGlobalLayoutListener(new C164757sK(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:234:0x05a3, code lost:
        r0.removeOnGlobalLayoutListener(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x05a6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e4, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e6, code lost:
        r0.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e9, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0522  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0527  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGlobalLayout() {
        /*
            r14 = this;
            int r0 = r14.A01
            switch(r0) {
                case 0: goto L_0x0467;
                case 1: goto L_0x0569;
                case 2: goto L_0x03ee;
                case 3: goto L_0x0339;
                case 4: goto L_0x030a;
                case 5: goto L_0x03df;
                case 6: goto L_0x03d2;
                case 7: goto L_0x02ad;
                case 8: goto L_0x0283;
                case 9: goto L_0x0265;
                case 10: goto L_0x0247;
                case 11: goto L_0x01ea;
                case 12: goto L_0x03ab;
                case 13: goto L_0x02e4;
                case 14: goto L_0x039e;
                case 15: goto L_0x01d6;
                case 16: goto L_0x01a7;
                case 17: goto L_0x017c;
                case 18: goto L_0x038e;
                case 19: goto L_0x0362;
                case 20: goto L_0x0355;
                case 21: goto L_0x010d;
                case 22: goto L_0x00ca;
                case 23: goto L_0x0088;
                case 24: goto L_0x0061;
                case 25: goto L_0x002e;
                case 26: goto L_0x034d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r14.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r2
            X.6X3 r0 = r2.A0L
            if (r0 == 0) goto L_0x002d
            r0.A05()
            X.61I r0 = r2.A0d
            if (r0 == 0) goto L_0x002d
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r2.A0N
            if (r0 == 0) goto L_0x002d
            X.1hi r0 = r0.A0A
            boolean r0 = X.C36351kA.A1W(r0)
            if (r0 == 0) goto L_0x002d
            X.61I r1 = r2.A0d
            X.6X3 r0 = r2.A0L
            boolean r0 = r0.A08()
            r0 = r0 ^ 1
            r1.A00(r0)
        L_0x002d:
            return
        L_0x002e:
            java.lang.Object r2 = r14.A00
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r2 = (com.whatsapp.textstatuscomposer.voice.VoiceRecordingView) r2
            X.7d7 r1 = r2.A09
            if (r1 == 0) goto L_0x003e
            int r0 = r2.getPreviewSegmentsCount()
            X.6zV r1 = (X.C148836zV) r1
            r1.A00 = r0
        L_0x003e:
            com.whatsapp.conversation.waveforms.VoiceVisualizer r1 = r2.A07
            if (r1 != 0) goto L_0x0049
            java.lang.String r0 = "previewVoiceVisualizer"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0049:
            int r0 = r1.getWidth()
            if (r0 <= 0) goto L_0x002d
            android.view.ViewTreeObserver r0 = r1.getViewTreeObserver()
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L_0x002d
            android.view.ViewTreeObserver r0 = r1.getViewTreeObserver()
            if (r0 == 0) goto L_0x002d
            goto L_0x05a3
        L_0x0061:
            java.lang.Object r3 = r14.A00
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r3 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r3
            androidx.recyclerview.widget.RecyclerView r0 = r3.A04
            int r2 = r0.getWidth()
            androidx.recyclerview.widget.RecyclerView r0 = r3.A04
            android.content.res.Resources r1 = X.C36341k9.A0F(r0)
            r0 = 2131168506(0x7f070cfa, float:1.7951316E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r2 = r2 / r0
            int r0 = r3.A00
            if (r0 == r2) goto L_0x002d
            androidx.recyclerview.widget.GridLayoutManager r0 = r3.A03
            r0.A1o(r2)
            r3.A00 = r2
            X.4mr r0 = r3.A0L
            goto L_0x01e4
        L_0x0088:
            java.lang.Object r4 = r14.A00
            com.whatsapp.stickers.store.StickerStoreTabFragment r4 = (com.whatsapp.stickers.store.StickerStoreTabFragment) r4
            androidx.recyclerview.widget.LinearLayoutManager r0 = r4.A02
            int r1 = r0.A1T()
            androidx.recyclerview.widget.RecyclerView r0 = r4.A03
            X.0D3 r1 = r0.A0Q(r1)
            boolean r0 = r1 instanceof X.C96934o8
            if (r0 == 0) goto L_0x002d
            X.4o8 r1 = (X.C96934o8) r1
            androidx.recyclerview.widget.RecyclerView r0 = r1.A0H
            int r3 = r0.getWidth()
            android.content.res.Resources r1 = X.C36341k9.A0F(r0)
            r0 = 2131168508(0x7f070cfc, float:1.795132E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = X.C36341k9.A0G(r4)
            r0 = 2131168509(0x7f070cfd, float:1.7951322E38)
            int r0 = X.C36441kJ.A06(r1, r0, r2)
            int r3 = r3 / r0
            r0 = 5
            int r1 = java.lang.Math.min(r3, r0)
            int r0 = r4.A00
            if (r0 == r1) goto L_0x002d
            r4.A00 = r1
            X.4mp r0 = r4.A0G
            goto L_0x01e6
        L_0x00ca:
            java.lang.Object r4 = r14.A00
            X.5HA r4 = (X.AnonymousClass5HA) r4
            androidx.viewpager.widget.ViewPager r0 = r4.A07
            int r2 = r0.getHeight()
            int r1 = r0.getWidth()
            if (r2 == 0) goto L_0x002d
            if (r1 == 0) goto L_0x002d
            int r0 = r4.A01
            if (r0 != r1) goto L_0x00e4
            int r0 = r4.A00
            if (r0 == r2) goto L_0x002d
        L_0x00e4:
            r4.A01 = r1
            r4.A00 = r2
            X.5Kv r0 = r4.A0L
            r0.A02(r1, r2)
            X.5Kt r2 = r4.A0M
            int r1 = r4.A01
            int r0 = r4.A00
            r2.A02(r1, r0)
            r3 = 2
        L_0x00f7:
            int r0 = r4.A08
            if (r3 >= r0) goto L_0x002d
            java.util.List r0 = r4.A05
            java.lang.Object r2 = r0.get(r3)
            X.6x9 r2 = (X.C147396x9) r2
            int r1 = r4.A01
            int r0 = r4.A00
            r2.A02(r1, r0)
            int r3 = r3 + 1
            goto L_0x00f7
        L_0x010d:
            java.lang.Object r5 = r14.A00
            X.5H9 r5 = (X.AnonymousClass5H9) r5
            androidx.viewpager.widget.ViewPager r4 = r5.A07
            int r2 = r4.getHeight()
            int r1 = r4.getWidth()
            if (r2 == 0) goto L_0x0147
            if (r1 == 0) goto L_0x0147
            int r0 = r5.A01
            if (r0 != r1) goto L_0x0127
            int r0 = r5.A00
            if (r0 == r2) goto L_0x0147
        L_0x0127:
            r5.A01 = r1
            r5.A00 = r2
            java.util.List r0 = r5.A0D
            java.util.Iterator r3 = r0.iterator()
        L_0x0131:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0147
            java.lang.Object r2 = r3.next()
            X.6x9 r2 = (X.C147396x9) r2
            if (r2 == 0) goto L_0x0131
            int r1 = r5.A01
            int r0 = r5.A00
            r2.A02(r1, r0)
            goto L_0x0131
        L_0x0147:
            android.view.ViewParent r0 = r4.getParent()
            android.view.View r0 = (android.view.View) r0
            int r2 = r0.getWidth()
            int r0 = r5.A02
            if (r2 == r0) goto L_0x002d
            r5.A02 = r2
            X.6xB r6 = r5.A0b
            if (r6 == 0) goto L_0x002d
            android.view.View r0 = r6.A08
            android.content.res.Resources r1 = X.C36341k9.A0F(r0)
            r0 = 2131168499(0x7f070cf3, float:1.7951302E38)
            int r5 = r1.getDimensionPixelSize(r0)
            int r4 = r2 / 9
            X.0ts r0 = r6.A0B
            boolean r3 = X.C36351kA.A1Y(r0)
            r2 = 0
            androidx.recyclerview.widget.RecyclerView r1 = r6.A0A
            int r4 = r4 - r5
            int r0 = r4 / 2
            if (r3 == 0) goto L_0x046f
            r1.setPadding(r0, r2, r2, r2)
            return
        L_0x017c:
            java.lang.Object r4 = r14.A00
            X.4vw r4 = (X.C100844vw) r4
            X.4Oz r3 = r4.A04
            android.view.View r3 = (android.view.View) r3
            X.C36351kA.A1C(r3, r14)
            boolean r0 = r4.isShowing()
            if (r0 != 0) goto L_0x002d
            r2 = 48
            r1 = 1000000(0xf4240, float:1.401298E-39)
            r0 = 0
            r4.showAtLocation(r3, r2, r0, r1)
            X.6s0 r2 = r4.A0H
            android.view.View r0 = r2.A03
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r2.A02
            if (r0 == 0) goto L_0x002d
            r0.setVisibility(r1)
            return
        L_0x01a7:
            java.lang.Object r3 = r14.A00
            com.whatsapp.migration.android.view.GoogleMigrateImporterActivity r3 = (com.whatsapp.migration.android.view.GoogleMigrateImporterActivity) r3
            com.whatsapp.WaImageView r1 = r3.A01
            if (r1 == 0) goto L_0x002d
            com.whatsapp.WaTextView r0 = r3.A02
            if (r0 == 0) goto L_0x002d
            X.C36351kA.A1C(r1, r14)
            com.whatsapp.WaTextView r0 = r3.A03
            X.C36351kA.A1C(r0, r14)
            com.whatsapp.WaImageView r0 = r3.A01
            int r2 = r0.getHeight()
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131169086(0x7f070f3e, float:1.7952492E38)
            int r0 = r1.getDimensionPixelSize(r0)
            if (r2 >= r0) goto L_0x002d
            com.whatsapp.WaImageView r1 = r3.A01
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x01d6:
            java.lang.Object r1 = r14.A00
            X.6WR r1 = (X.AnonymousClass6WR) r1
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r1.A0N
            X.C36351kA.A1C(r0, r14)
            X.AnonymousClass6WR.A02(r1)
            X.4me r0 = r1.A08
        L_0x01e4:
            if (r0 == 0) goto L_0x002d
        L_0x01e6:
            r0.A06()
            return
        L_0x01ea:
            java.lang.Object r2 = r14.A00
            X.5yO r2 = (X.C124555yO) r2
            android.view.View r0 = r2.A01
            boolean r1 = X.AnonymousClass1N2.A00(r0)
            r4 = 0
            r3 = 8
            X.22t r0 = r2.A05
            boolean r0 = r0.isShowing()
            if (r1 == 0) goto L_0x0223
            if (r0 != 0) goto L_0x002d
            android.view.View r2 = r2.A00
            int r0 = r2.getVisibility()
            if (r0 != r3) goto L_0x002d
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6 = 1
            r9 = 0
            android.view.animation.TranslateAnimation r5 = new android.view.animation.TranslateAnimation
            r8 = 1
            r10 = 1
            r11 = 0
            r12 = 1
            r13 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = 100
            r5.setDuration(r0)
            r2.startAnimation(r5)
            r2.setVisibility(r4)
            return
        L_0x0223:
            if (r0 != 0) goto L_0x002d
            android.view.View r2 = r2.A00
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L_0x002d
            r6 = 0
            r5 = 1
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.view.animation.TranslateAnimation r4 = new android.view.animation.TranslateAnimation
            r7 = 1
            r9 = 1
            r10 = 0
            r11 = 1
            r12 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = 100
            r4.setDuration(r0)
            r2.startAnimation(r4)
            r2.setVisibility(r3)
            return
        L_0x0247:
            java.lang.Object r1 = r14.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r1 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r1
            X.5B9 r0 = r1.A0N
            X.C36361kB.A16(r0, r14)
            X.5B9 r0 = r1.A0N
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L_0x002d
            X.5B9 r0 = r1.A0N
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x002d
            r0 = 0
            com.whatsapp.location.GroupChatLiveLocationsActivity2.A0I(r1, r0)
            return
        L_0x0265:
            java.lang.Object r1 = r14.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity r1 = (com.whatsapp.location.GroupChatLiveLocationsActivity) r1
            X.5B8 r0 = r1.A0M
            X.C36361kB.A16(r0, r14)
            X.5B8 r0 = r1.A0M
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L_0x002d
            X.5B8 r0 = r1.A0M
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x002d
            r0 = 0
            com.whatsapp.location.GroupChatLiveLocationsActivity.A0I(r1, r0)
            return
        L_0x0283:
            java.lang.Object r2 = r14.A00
            com.whatsapp.home.ui.StarredMessagesPlaceholderActivity r2 = (com.whatsapp.home.ui.StarredMessagesPlaceholderActivity) r2
            android.graphics.Rect r1 = X.AnonymousClass001.A06()
            android.view.ViewGroup r0 = r2.A04
            if (r0 == 0) goto L_0x0292
            r0.getWindowVisibleDisplayFrame(r1)
        L_0x0292:
            int r1 = r1.height()
            int r0 = r2.A01
            int r1 = r1 + r0
            int r0 = r2.A00
            if (r1 == r0) goto L_0x002d
            android.view.ViewGroup$LayoutParams r0 = r2.A03
            if (r0 == 0) goto L_0x02a3
            r0.height = r1
        L_0x02a3:
            android.view.View r0 = r2.A02
            if (r0 == 0) goto L_0x02aa
            r0.requestLayout()
        L_0x02aa:
            r2.A00 = r1
            return
        L_0x02ad:
            java.lang.Object r0 = r14.A00
            com.whatsapp.extensions.webview.view.FlowsWebViewFragment r0 = (com.whatsapp.extensions.webview.view.FlowsWebViewFragment) r0
            X.4eH r4 = r0.A00
            if (r4 == 0) goto L_0x002d
            X.1N2 r0 = r0.A0B
            if (r0 == 0) goto L_0x0473
            boolean r0 = X.AnonymousClass1N2.A00(r4)
            r3 = 0
            if (r0 == 0) goto L_0x02e1
            java.lang.String r2 = "didShow"
        L_0x02c2:
            org.json.JSONObject r1 = X.C36441kJ.A1B()
            java.lang.String r0 = "change"
            org.json.JSONObject r0 = r1.put(r0, r2)
            java.lang.String r2 = X.C36381kD.A0y(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "window.onkeyboardStateChange("
            r1.append(r0)
            java.lang.String r0 = X.C36321k7.A0E(r2, r1)
            r4.evaluateJavascript(r0, r3)
            return
        L_0x02e1:
            java.lang.String r2 = "hidden"
            goto L_0x02c2
        L_0x02e4:
            int[] r1 = X.C36441kJ.A1O()
            java.lang.Object r4 = r14.A00
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r4 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r4
            android.view.View r0 = r4.A02
            if (r0 != 0) goto L_0x02f7
            java.lang.String r0 = "titleBar"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02f7:
            r0.getLocationOnScreen(r1)
            r0 = 0
            r0 = r1[r0]
            if (r0 == 0) goto L_0x002d
            com.whatsapp.WaTextView r0 = r4.A0C
            if (r0 != 0) goto L_0x047a
            java.lang.String r0 = "mediaQualityToolTip"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x030a:
            java.lang.Object r3 = r14.A00
            X.52X r3 = (X.AnonymousClass52X) r3
            android.view.View r2 = r3.A0H
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L_0x0321
            android.view.ViewParent r1 = r2.getParent()
            android.view.View r1 = (android.view.View) r1
            android.graphics.Rect r0 = r3.A0B
            r1.getHitRect(r0)
        L_0x0321:
            android.graphics.Rect r0 = r3.A0B
            boolean r0 = r2.getLocalVisibleRect(r0)
            if (r0 == 0) goto L_0x002d
            android.view.View r1 = r3.A0E
            r0 = 0
            r1.setVisibility(r0)
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r3.A0G
            r1.removeOnGlobalLayoutListener(r0)
            return
        L_0x0339:
            java.lang.Object r0 = r14.A00
            X.5FP r0 = (X.AnonymousClass5FP) r0
            X.0CP r2 = r0.A00
            androidx.recyclerview.widget.GridLayoutManager r2 = (androidx.recyclerview.widget.GridLayoutManager) r2
            int r1 = X.AnonymousClass5FP.A00(r0)
            int r0 = r2.A01
            if (r1 == r0) goto L_0x002d
            r2.A1o(r1)
            return
        L_0x034d:
            java.lang.Object r0 = r14.A00
            X.7lo r0 = (X.C160927lo) r0
            r0.onGlobalLayout()
            return
        L_0x0355:
            java.lang.Object r1 = r14.A00
            X.6QH r1 = (X.AnonymousClass6QH) r1
            android.widget.ImageView r0 = r1.A0O
            X.C36351kA.A1C(r0, r14)
            X.AnonymousClass6QH.A00(r1)
            return
        L_0x0362:
            java.lang.Object r2 = r14.A00
            com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment r2 = (com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment) r2
            androidx.core.widget.NestedScrollView r0 = r2.A04
            X.C36351kA.A1C(r0, r14)
            android.view.View r0 = r2.A00
            float r1 = r0.getY()
            androidx.core.widget.NestedScrollView r0 = r2.A04
            float r0 = X.C36441kJ.A02(r0)
            float r1 = r1 - r0
            androidx.core.widget.NestedScrollView r0 = r2.A04
            int r0 = r0.getScrollY()
            float r0 = (float) r0
            float r1 = r1 - r0
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)
            r1 = r0 ^ 1
            r0 = 0
            com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment.A06(r2, r1, r0)
            return
        L_0x038e:
            java.lang.Object r1 = r14.A00
            com.whatsapp.payments.ui.widget.PaymentView r1 = (com.whatsapp.payments.ui.widget.PaymentView) r1
            com.whatsapp.payments.ui.widget.PaymentAmountInputField r0 = r1.A0r
            X.C36361kB.A16(r0, r14)
            X.687 r1 = r1.A0x
            r0 = 1
            r1.A01(r0)
            return
        L_0x039e:
            java.lang.Object r1 = r14.A00
            X.6WR r1 = (X.AnonymousClass6WR) r1
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r1.A0N
            X.C36351kA.A1C(r0, r14)
            X.AnonymousClass6WR.A02(r1)
            return
        L_0x03ab:
            java.lang.Object r4 = r14.A00
            X.6Zc r4 = (X.C133586Zc) r4
            android.view.View r0 = r4.A0F
            X.C36351kA.A1C(r0, r14)
            android.view.View r0 = r4.A0F
            int r0 = r0.getMeasuredHeight()
            r4.A03 = r0
            android.view.View r0 = r4.A0F
            int r0 = r0.getMeasuredHeight()
            double r2 = (double) r0
            r0 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r2 = r2 * r0
            int r0 = (int) r2
            r4.A04 = r0
            r1 = 0
            r0 = 0
            r4.A0V(r0, r1)
            return
        L_0x03d2:
            java.lang.Object r1 = r14.A00
            X.6YT r1 = (X.AnonymousClass6YT) r1
            android.view.View r0 = r1.A08
            X.C36351kA.A1C(r0, r14)
            X.AnonymousClass6YT.A09(r1)
            return
        L_0x03df:
            java.lang.Object r1 = r14.A00
            X.6YT r1 = (X.AnonymousClass6YT) r1
            android.view.View r0 = r1.A08
            X.C36361kB.A16(r0, r14)
            X.7m8 r0 = r1.A0C
            r0.Boh()
            return
        L_0x03ee:
            java.lang.Object r6 = r14.A00
            com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity r6 = (com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity) r6
            r0 = 2131433571(0x7f0b1863, float:1.8488931E38)
            android.view.View r0 = r6.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5 = 0
            android.view.View r0 = r0.getChildAt(r5)
            int r1 = r0.getMeasuredHeight()
            androidx.appcompat.widget.AppCompatSpinner r0 = r6.A02
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0465
            androidx.appcompat.widget.AppCompatSpinner r0 = r6.A02
            int r0 = r0.getMeasuredHeight()
        L_0x0412:
            int r1 = r1 - r0
            android.widget.RadioGroup r0 = r6.A01
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x045e
            r0 = 0
        L_0x041c:
            int r1 = r1 + r0
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            X.C36321k7.A0K(r6, r0)
            int r0 = r0.y
            float r0 = (float) r0
            double r3 = (double) r0
            r7 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            float r0 = (float) r1
            double r1 = (double) r0
            double r1 = r1 * r7
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r2 = X.C36431kI.A1P(r0)
            androidx.appcompat.widget.AppCompatSpinner r1 = r6.A02
            int r0 = X.C36381kD.A09(r2)
            r1.setVisibility(r0)
            android.widget.RadioGroup r1 = r6.A01
            r0 = 0
            if (r2 == 0) goto L_0x0447
            r0 = 8
        L_0x0447:
            r1.setVisibility(r0)
            r0 = 2131430489(0x7f0b0c59, float:1.848268E38)
            android.view.View r0 = r6.findViewById(r0)
            if (r2 == 0) goto L_0x0455
            r5 = 8
        L_0x0455:
            r0.setVisibility(r5)
            android.widget.RadioGroup r0 = r6.A01
            X.C36361kB.A16(r0, r14)
            return
        L_0x045e:
            android.widget.RadioGroup r0 = r6.A01
            int r0 = r0.getMeasuredHeight()
            goto L_0x041c
        L_0x0465:
            r0 = 0
            goto L_0x0412
        L_0x0467:
            java.lang.Object r0 = r14.A00
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            androidx.compose.ui.platform.AndroidComposeView.A0B(r0)
            return
        L_0x046f:
            r1.setPadding(r2, r2, r0, r2)
            return
        L_0x0473:
            java.lang.String r0 = "imeUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x047a:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x0483
            r0.removeOnGlobalLayoutListener(r14)
        L_0x0483:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131166381(0x7f0704ad, float:1.7947006E38)
            int r11 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168630(0x7f070d76, float:1.7951567E38)
            int r10 = r1.getDimensionPixelSize(r0)
            r9 = 2
            int[] r7 = new int[r9]
            android.widget.ImageView r0 = r4.A06
            if (r0 == 0) goto L_0x04a3
            r0.getLocationOnScreen(r7)
        L_0x04a3:
            android.widget.ImageView r0 = r4.A06
            r3 = 0
            if (r0 == 0) goto L_0x04b7
            int r8 = r0.getMeasuredWidth()
        L_0x04ac:
            com.whatsapp.WaTextView r0 = r4.A0C
            java.lang.String r6 = "mediaQualityToolTip"
            if (r0 != 0) goto L_0x04b9
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x04b7:
            r8 = 0
            goto L_0x04ac
        L_0x04b9:
            int r5 = r0.getMeasuredWidth()
            android.util.DisplayMetrics r0 = X.C36361kB.A0B(r4)
            int r2 = r0.widthPixels
            int r0 = r11 * 2
            int r2 = r2 - r0
            int r0 = r10 * 2
            int r2 = r2 - r0
            r1 = r7[r3]
            int r8 = r8 / r9
            int r1 = r1 + r8
            int r0 = r5 / 2
            int r1 = r1 - r0
            int r1 = r1 - r11
            int r1 = r1 - r10
            if (r1 >= 0) goto L_0x04f3
            com.whatsapp.WaTextView r0 = r4.A0C
            if (r0 != 0) goto L_0x04dd
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x04dd:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = r7[r3]
            int r0 = r0 + r8
            int r0 = r0 - r11
            int r0 = r0 - r10
            int r0 = r0 * 2
            r1.width = r0
            com.whatsapp.WaTextView r0 = r4.A0C
            if (r0 != 0) goto L_0x051b
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x04f3:
            int r5 = r5 + r1
            if (r5 <= r2) goto L_0x0519
            com.whatsapp.WaTextView r0 = r4.A0C
            if (r0 != 0) goto L_0x04ff
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x04ff:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = r7[r3]
            int r0 = r0 - r11
            int r0 = r0 - r10
            int r0 = r2 - r0
            int r0 = r0 - r8
            int r0 = r0 * 2
            r1.width = r0
            int r3 = r2 - r0
            com.whatsapp.WaTextView r0 = r4.A0C
            if (r0 != 0) goto L_0x051b
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x0519:
            r3 = r1
            goto L_0x051e
        L_0x051b:
            r0.setLayoutParams(r1)
        L_0x051e:
            com.whatsapp.WaTextView r1 = r4.A0C
            if (r1 != 0) goto L_0x0527
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x0527:
            float r0 = (float) r3
            r1.setTranslationX(r0)
            r1.requestLayout()
            r0 = 38
            X.C135466ck.A00(r1, r4, r0)
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            r0 = 44
            X.74t r2 = new X.74t
            r2.<init>((java.lang.Object) r4, (int) r0)
            r0 = 100
            r3.postDelayed(r2, r0)
            X.0v0 r0 = r4.getWaSharedPreferences()
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r0)
            java.lang.String r1 = "media_quality_tooltip_shown"
            r0 = 1
            X.C36331k8.A0w(r2, r1, r0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131890346(0x7f1210aa, float:1.9415381E38)
            java.lang.String r2 = X.C36361kB.A0m(r1, r0)
            android.content.Context r1 = r4.getContext()
            X.0yb r0 = r4.getSystemServices()
            X.C33521fV.A00(r1, r0, r2)
            return
        L_0x0569:
            java.lang.Object r2 = r14.A00
            X.4ea r2 = (X.C92764ea) r2
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x05a7
            int r1 = r2.A02
            android.animation.Animator$AnimatorListener r4 = r2.A0E
            r2.clearAnimation()
            r0 = 1069547520(0x3fc00000, float:1.5)
            r2.setScaleX(r0)
            r2.setScaleY(r0)
            android.view.ViewPropertyAnimator r3 = r2.animate()
            long r0 = (long) r1
            android.view.ViewPropertyAnimator r1 = r3.setDuration(r0)
            android.view.animation.Interpolator r0 = r2.A04
            android.view.ViewPropertyAnimator r0 = r1.setInterpolator(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            android.view.ViewPropertyAnimator r0 = X.C90514aH.A0R(r0, r1)
            r0.setListener(r4)
        L_0x059c:
            X.C92764ea.A00(r2)
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
        L_0x05a3:
            r0.removeOnGlobalLayoutListener(r14)
            return
        L_0x05a7:
            java.lang.Integer r1 = r2.A07
            java.lang.Integer r0 = X.C023109s.A00
            boolean r1 = r1.equals(r0)
            int r0 = r2.getHeight()
            if (r1 == 0) goto L_0x05b6
            int r0 = -r0
        L_0x05b6:
            float r0 = (float) r0
            r2.setTranslationY(r0)
            int r1 = r2.A02
            android.animation.Animator$AnimatorListener r0 = r2.A0E
            r2.A03(r0, r1)
            goto L_0x059c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C164757sK.onGlobalLayout():void");
    }
}
