package X;

/* renamed from: X.7t3  reason: invalid class name and case insensitive filesystem */
public class C165207t3 implements AnonymousClass04S {
    public Object A00;
    public final int A01;

    public C165207t3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass02E r2) {
        r2.A0b().getString("screen_name");
        r2.A0b().getString("screen_params");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x034c, code lost:
        if (r2 != 2) goto L_0x034e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:249:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0281  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BTH(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x0023;
                case 1: goto L_0x0087;
                case 2: goto L_0x0540;
                case 3: goto L_0x0559;
                case 4: goto L_0x00cd;
                case 5: goto L_0x0311;
                case 6: goto L_0x040e;
                case 7: goto L_0x057a;
                case 8: goto L_0x0471;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x052a;
                case 13: goto L_0x0533;
                case 14: goto L_0x0596;
                case 15: goto L_0x059c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r11.A00
            X.33w r2 = (X.C594233w) r2
            android.content.DialogInterface r12 = (android.content.DialogInterface) r12
            if (r2 == 0) goto L_0x001f
            X.4vP r0 = r2.A00
            X.67i r0 = r0.A00
            X.65A r1 = r0.A02
            java.util.Objects.requireNonNull(r2)
            r0 = 39
            X.7rQ r0 = X.C164197rQ.A00(r2, r0)
            X.C142326oh.A0B(r1, r0)
        L_0x001f:
            r12.dismiss()
        L_0x0022:
            return
        L_0x0023:
            java.lang.Object r5 = r11.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r5 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r5
            boolean r2 = X.AnonymousClass000.A1X(r12)
            android.view.View r0 = r5.A09
            if (r0 == 0) goto L_0x0022
            X.6X3 r0 = r5.A0L
            if (r0 == 0) goto L_0x0022
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r0 = r5.A0T
            if (r0 == 0) goto L_0x0022
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/VoipCallControlBottomSheetV2 updateUiForAVSwitch "
            X.C36321k7.A1X(r0, r1, r2)
            android.view.View r0 = r5.A09
            int r0 = r0.getVisibility()
            r4 = 1
            r1 = 0
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            if (r2 == r0) goto L_0x0022
            android.view.View r0 = r5.A09
            if (r2 != 0) goto L_0x0054
            r1 = 8
        L_0x0054:
            r0.setVisibility(r1)
            X.6X3 r0 = r5.A0L
            r0.A0B = r2
            r0.A04()
            r0.A05()
            X.0yb r0 = r5.A0W
            boolean r0 = X.C90504aG.A1V(r0)
            if (r0 == 0) goto L_0x007f
            if (r2 == 0) goto L_0x007f
            X.6X3 r1 = r5.A0L
            r0 = 4
            X.AnonymousClass6X3.A01(r1, r0)
            android.view.View r3 = r5.A09
            r0 = 49
            X.72p r2 = new X.72p
            r2.<init>(r5, r0)
            r0 = 750(0x2ee, double:3.705E-321)
            r3.postDelayed(r2, r0)
        L_0x007f:
            X.61I r0 = r5.A0d
            if (r0 == 0) goto L_0x0022
            r0.A00(r4)
            return
        L_0x0087:
            java.lang.Object r6 = r11.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r6 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r6
            boolean r5 = X.AnonymousClass000.A1X(r12)
            android.widget.Space r0 = r6.A0C
            r4 = 0
            if (r0 == 0) goto L_0x00ac
            if (r5 == 0) goto L_0x00cb
            android.content.res.Resources r1 = X.C36341k9.A0G(r6)
            r0 = 2131165535(0x7f07015f, float:1.794529E38)
            int r3 = r1.getDimensionPixelSize(r0)
        L_0x00a1:
            android.widget.Space r2 = r6.A0C
            r1 = -1
            X.0BJ r0 = new X.0BJ
            r0.<init>((int) r1, (int) r3)
            r2.setLayoutParams(r0)
        L_0x00ac:
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r1 = r6.A0T
            if (r1 == 0) goto L_0x00b7
            int r0 = X.C36351kA.A00(r5)
            r1.setVisibility(r0)
        L_0x00b7:
            X.6X3 r1 = r6.A0L
            if (r1 == 0) goto L_0x0022
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r0 = r6.A0T
            if (r0 == 0) goto L_0x00c2
            if (r5 == 0) goto L_0x00c2
            r4 = 1
        L_0x00c2:
            r1.A08 = r4
            r1.A04()
            r1.A05()
            return
        L_0x00cb:
            r3 = 0
            goto L_0x00a1
        L_0x00cd:
            java.lang.Object r2 = r11.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r2
            X.67K r12 = (X.AnonymousClass67K) r12
            X.01I r0 = r2.A0h()
            if (r0 == 0) goto L_0x00e0
            boolean r0 = X.AnonymousClass3SJ.A04(r0)
            if (r0 == 0) goto L_0x00e0
            return
        L_0x00e0:
            android.widget.FrameLayout r0 = r2.A0B
            if (r0 == 0) goto L_0x0022
            X.61I r0 = r2.A0d
            if (r0 == 0) goto L_0x0022
            android.view.View r0 = r2.A0A
            if (r0 == 0) goto L_0x0022
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/VoipCallControlBottomSheetV2 setCallControlButtons "
            r1.append(r0)
            int r10 = r12.A01
            X.C36321k7.A1Y(r1, r10)
            android.widget.FrameLayout r0 = r2.A0B
            r0.removeAllViews()
            android.widget.FrameLayout r0 = r2.A0B
            java.lang.Object r0 = r0.getTag()
            int r5 = r12.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            boolean r0 = X.C1901797e.A00(r0, r3)
            r4 = 0
            r9 = 1
            if (r0 != 0) goto L_0x017d
            android.widget.FrameLayout r0 = r2.A0B
            r0.setFocusable(r4)
            android.widget.FrameLayout r1 = r2.A0B
            r0 = 8
            r1.setVisibility(r0)
            android.widget.FrameLayout r0 = r2.A0B
            android.view.ViewParent r0 = r0.getParent()
            r0.requestLayout()
            boolean r6 = X.AnonymousClass000.A1S(r5, r9)
            android.view.View r1 = r2.A0A
            r0 = 2131428444(0x7f0b045c, float:1.8478533E38)
            if (r6 == 0) goto L_0x0136
            r0 = 2131428445(0x7f0b045d, float:1.8478535E38)
        L_0x0136:
            android.widget.FrameLayout r0 = X.C36441kJ.A0T(r1, r0)
            r2.A0B = r0
            android.view.View r1 = r2.A0A
            r0 = 2131429145(0x7f0b0719, float:1.8479954E38)
            android.view.View r5 = X.C012005e.A02(r1, r0)
            android.view.View r0 = r2.A08
            X.C18740tg.A04(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.0BJ r1 = (X.AnonymousClass0BJ) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L_0x0156
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x0156:
            r1.A03 = r0
            android.view.View r0 = r2.A08
            r0.setLayoutParams(r1)
            android.widget.FrameLayout r0 = r2.A0B
            r0.setTag(r3)
            android.widget.FrameLayout r0 = r2.A0B
            r0.setFocusable(r9)
            android.widget.FrameLayout r0 = r2.A0B
            r0.setVisibility(r4)
            X.C18740tg.A04(r5)
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            X.0BJ r3 = (X.AnonymousClass0BJ) r3
            if (r6 == 0) goto L_0x0189
            r0 = 0
        L_0x0178:
            r3.A0Z = r0
            r5.setLayoutParams(r3)
        L_0x017d:
            r7 = 4
            r6 = 3
            r8 = 2
            if (r10 == r9) goto L_0x019a
            if (r10 == r8) goto L_0x019e
            if (r10 == r6) goto L_0x0196
            if (r10 == r7) goto L_0x019a
            return
        L_0x0189:
            android.content.res.Resources r1 = X.C36341k9.A0G(r2)
            r0 = 2131168786(0x7f070e12, float:1.7951884E38)
            float r0 = r1.getDimension(r0)
            int r0 = (int) r0
            goto L_0x0178
        L_0x0196:
            r3 = 2131624314(0x7f0e017a, float:1.8875804E38)
            goto L_0x01a1
        L_0x019a:
            r3 = 2131626513(0x7f0e0a11, float:1.8880264E38)
            goto L_0x01a1
        L_0x019e:
            r3 = 2131626512(0x7f0e0a10, float:1.8880262E38)
        L_0x01a1:
            android.view.LayoutInflater r1 = r2.A0c()
            android.widget.FrameLayout r0 = r2.A0B
            android.view.View r1 = r1.inflate(r3, r0, r4)
            r1.setTag(r12)
            r5 = 17
            r0 = -1
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r0, r0, r5)
            android.widget.FrameLayout r0 = r2.A0B
            r0.addView(r1, r3)
            if (r10 == r9) goto L_0x024a
            if (r10 == r7) goto L_0x024a
            if (r10 == r6) goto L_0x024a
            r0 = 0
            r2.A0H = r0
            r2.A0G = r0
            X.66H r7 = r12.A02
            X.C18740tg.A06(r7)
            r0 = 2131430365(0x7f0b0bdd, float:1.8482429E38)
            android.view.View r5 = X.C012005e.A02(r1, r0)
            com.whatsapp.calling.views.VoipCallFooter r5 = (com.whatsapp.calling.views.VoipCallFooter) r5
            r2.A0U = r5
            X.01I r3 = r2.A0h()
            boolean r0 = r3 instanceof X.C162017nt
            if (r0 == 0) goto L_0x0241
            X.7nt r3 = (X.C162017nt) r3
            X.6cn r0 = new X.6cn
            r0.<init>(r3, r5, r4)
            r5.setMuteButtonClickListener(r0)
            r1 = 21
            X.6cl r0 = new X.6cl
            r0.<init>(r3, r1)
            r5.setToggleVideoButtonClickListener(r0)
            X.6cn r0 = new X.6cn
            r0.<init>(r3, r5, r9)
            r5.setSpeakerButtonClickListener(r0)
            X.6cn r0 = new X.6cn
            r0.<init>(r3, r5, r8)
            r5.setBluetoothButtonClickListener(r0)
            r1 = 22
            X.6cl r0 = new X.6cl
            r0.<init>(r3, r1)
            r5.setEndCallButtonClickListener(r0)
            r1 = 15
            X.6cl r0 = new X.6cl
            r0.<init>(r3, r1)
            r5.A01 = r0
            X.6cn r0 = new X.6cn
            r0.<init>(r3, r5, r6)
            r5.A00 = r0
            boolean r1 = r7.A01
            com.whatsapp.calling.views.VoipCallFooter r0 = r2.A0U
            if (r1 == 0) goto L_0x023d
            r0.A02()
        L_0x0225:
            com.whatsapp.calling.views.VoipCallFooter r0 = r2.A0U
            android.view.View r0 = r0.A0H
            r0.setVisibility(r4)
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A05(r2)
            if (r0 == 0) goto L_0x0235
            r3.Bwh(r0)
        L_0x0235:
            com.whatsapp.calling.views.VoipCallFooter r1 = r2.A0U
            int r0 = r2.A03
            r1.A03(r0)
            return
        L_0x023d:
            r0.A01()
            goto L_0x0225
        L_0x0241:
            java.lang.String r0 = "voip/VoipCallControlBottomSheetV2/failed to get voip activity"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r2.A1c()
            goto L_0x0235
        L_0x024a:
            r0 = 2131431897(0x7f0b11d9, float:1.8485536E38)
            android.view.View r0 = r1.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r2.A0G = r0
            r0 = 2131432856(0x7f0b1598, float:1.8487481E38)
            android.view.View r0 = r1.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r2.A0H = r0
            r3 = 13
            r1 = 16
            X.AnonymousClass088.A07(r0, r3, r1, r9, r8)
            com.google.android.material.button.MaterialButton r0 = r2.A0G
            X.AnonymousClass088.A07(r0, r3, r1, r9, r8)
            X.65r r0 = r12.A03
            X.C18740tg.A06(r0)
            boolean r3 = r0.A00
            X.61I r0 = r2.A0d
            java.lang.String r1 = X.C114145gi.A07
            com.whatsapp.voipcalling.VoipActivityV2 r0 = r0.A00
            boolean r5 = X.C90484aE.A1R(r0, r1)
            r0 = 3
            r6 = 1
            if (r10 == r0) goto L_0x0285
            r6 = 0
            if (r10 != r7) goto L_0x0285
            r4 = 1
        L_0x0285:
            com.google.android.material.button.MaterialButton r0 = r2.A0H
            if (r0 == 0) goto L_0x0022
            com.google.android.material.button.MaterialButton r1 = r2.A0G
            if (r1 == 0) goto L_0x0022
            r0 = 2131895959(0x7f122697, float:1.9426766E38)
            if (r6 == 0) goto L_0x0295
            r0 = 2131887336(0x7f1204e8, float:1.9409276E38)
        L_0x0295:
            r1.setText(r0)
            com.google.android.material.button.MaterialButton r1 = r2.A0G
            r0 = 23
            X.C36351kA.A1E(r1, r2, r0)
            com.google.android.material.button.MaterialButton r1 = r2.A0H
            r0 = 0
            r1.setIcon(r0)
            com.google.android.material.button.MaterialButton r0 = r2.A0H
            r0.setMaxLines(r8)
            com.google.android.material.button.MaterialButton r1 = r2.A0H
            if (r3 == 0) goto L_0x02bf
            r0 = 2131895938(0x7f122682, float:1.9426723E38)
        L_0x02b1:
            r1.setText(r0)
        L_0x02b4:
            com.google.android.material.button.MaterialButton r1 = r2.A0H
            X.6cp r0 = new X.6cp
            r0.<init>(r2, r9, r4, r6)
            r1.setOnClickListener(r0)
            return
        L_0x02bf:
            if (r5 == 0) goto L_0x02c5
            r0 = 2131895958(0x7f122696, float:1.9426764E38)
            goto L_0x02b1
        L_0x02c5:
            r1.setMaxLines(r9)
            com.google.android.material.button.MaterialButton r7 = r2.A0H
            r0 = 2131897132(0x7f122b2c, float:1.9429145E38)
            java.lang.String r5 = r2.A0n(r0)
            r1 = 2130971107(0x7f0409e3, float:1.7550943E38)
            android.app.Dialog r8 = r2.A02
            if (r8 == 0) goto L_0x02b4
            android.content.Context r0 = r8.getContext()
            if (r0 == 0) goto L_0x02b4
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            r0.resolveAttribute(r1, r3, r9)
            android.content.Context r1 = r8.getContext()
            int r0 = r3.resourceId
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00E.A00(r1, r0)
            android.graphics.drawable.Drawable r3 = X.AnonymousClass08I.A01(r0)
            android.content.Context r1 = r8.getContext()
            r0 = 2131103013(0x7f060d25, float:1.781848E38)
            int r0 = X.AnonymousClass00F.A00(r1, r0)
            X.AnonymousClass076.A06(r3, r0)
            r7.setText(r5)
            r7.setIcon(r3)
            goto L_0x02b4
        L_0x0311:
            java.lang.Object r4 = r11.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r4 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r4
            X.6PI r12 = (X.AnonymousClass6PI) r12
            X.6X3 r3 = r4.A0L
            if (r3 == 0) goto L_0x0329
            int r1 = r12.A00
            r5 = 1
            r0 = 2
            boolean r6 = X.AnonymousClass000.A1S(r1, r0)
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x035b
            if (r6 != 0) goto L_0x035b
        L_0x0329:
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r2 = r4.A0N
            r2.A00 = r12
            X.5Fb r0 = r2.A07
            X.6OZ r0 = r0.A05()
            boolean r1 = com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel.A06(r0, r2)
            X.00s r0 = r2.A03
            X.C90484aE.A1B(r0, r1)
            com.whatsapp.calling.controls.viewmodel.CallControlButtonsViewModel r3 = r4.A0O
            android.content.Context r0 = r4.A0a()
            int r2 = X.C36341k9.A04(r0)
            int r1 = r12.A00
            r0 = 2
            if (r1 != r0) goto L_0x034e
            r1 = 1
            if (r2 == r0) goto L_0x034f
        L_0x034e:
            r1 = 0
        L_0x034f:
            int r0 = r3.A00
            if (r0 == r1) goto L_0x0022
            r3.A00 = r1
            X.5Fb r0 = r3.A02
            X.C95504lc.A02(r0, r3)
            return
        L_0x035b:
            android.animation.ValueAnimator r0 = r3.A03
            r1 = 0
            if (r0 == 0) goto L_0x0365
            r0.cancel()
            r3.A03 = r1
        L_0x0365:
            android.animation.ValueAnimator r0 = r3.A02
            if (r0 == 0) goto L_0x036e
            r0.cancel()
            r3.A02 = r1
        L_0x036e:
            android.view.View r2 = r3.A0D
            r2.clearAnimation()
            boolean r0 = r3.A06
            if (r6 == 0) goto L_0x03cd
            if (r0 == 0) goto L_0x037c
            X.AnonymousClass6X3.A00(r1, r3)
        L_0x037c:
            android.graphics.Rect r0 = r12.A01
            X.C18740tg.A06(r0)
            int r6 = r0.bottom
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165538(0x7f070162, float:1.7945296E38)
            int r1 = X.C36441kJ.A06(r1, r0, r6)
            android.view.ViewParent r0 = r2.getParent()
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getHeight()
            int r0 = r0 - r1
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            X.0Ak r1 = (X.C02460Ak) r1
            r1.height = r0
            r0 = 80
            r1.A03 = r0
            r2.setLayoutParams(r1)
            r0 = 0
            r2.setTranslationY(r0)
            r2.requestLayout()
            X.AnonymousClass6X3.A03(r3, r5)
        L_0x03b2:
            android.view.View r5 = r3.A0E
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            boolean r1 = r3.A06
            r0 = -2
            if (r1 != 0) goto L_0x03be
            r0 = -1
        L_0x03be:
            r2.height = r0
            r5.setLayoutParams(r2)
            r5.requestLayout()
            r0 = 200(0xc8, double:9.9E-322)
            X.AnonymousClass6X3.A02(r3, r0)
            goto L_0x0329
        L_0x03cd:
            if (r0 != 0) goto L_0x03d4
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A0G
            X.AnonymousClass6X3.A00(r0, r3)
        L_0x03d4:
            r3.A04()
            r3.A05()
            r0 = 0
            r2.setVisibility(r0)
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r1 = r3.A0H
            X.61I r0 = r1.A0d
            if (r0 == 0) goto L_0x03e7
            r0.A00(r5)
        L_0x03e7:
            r0 = 1065353216(0x3f800000, float:1.0)
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A0A(r1, r0)
            r2.setAlpha(r0)
            int r2 = r3.A01
            if (r2 == 0) goto L_0x03b2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CallControlBottomSheetBehaviorController restorePendingState "
            X.C36321k7.A1T(r0, r1, r2)
            int r1 = r3.A01
            r0 = 5
            if (r1 != r0) goto L_0x0405
            r0 = 4
            r3.A01 = r0
            r1 = 4
        L_0x0405:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A0G
            r0.A0W(r1)
            r0 = 0
            r3.A01 = r0
            goto L_0x03b2
        L_0x040e:
            java.lang.Object r4 = r11.A00
            com.whatsapp.wabloks.base.BkFragment r4 = (com.whatsapp.wabloks.base.BkFragment) r4
            X.5vX r12 = (X.C122855vX) r12
            int r2 = r12.A00
            r0 = 5
            if (r2 != r0) goto L_0x05a9
            X.6XK r3 = r12.A01
            com.facebook.rendercore.RootHostView r1 = r4.A00
            r0 = 0
            r1.setVisibility(r0)
            X.6PY r0 = r4.A01
            if (r0 == 0) goto L_0x0428
            r0.A02()
        L_0x0428:
            X.65A r2 = r4.A03
            X.01I r1 = r4.A0i()
            X.64D r0 = new X.64D
            r0.<init>(r1, r3, r2)
            X.6PY r0 = r0.A00()
            r4.A01 = r0
            X.01I r1 = r4.A0h()
            X.01L r1 = (X.AnonymousClass01L) r1
            if (r1 == 0) goto L_0x0448
            android.content.res.Configuration r0 = X.AnonymousClass000.A0U(r1)
            r1.onConfigurationChanged(r0)
        L_0x0448:
            X.6PY r1 = r4.A01
            com.facebook.rendercore.RootHostView r0 = r4.A00
            r1.A03(r0)
            r4.A1a()
            java.lang.Integer r3 = com.whatsapp.wabloks.base.BkFragment.A08
            java.lang.String r2 = "END_RENDER_SUCCESS"
            boolean r0 = r4 instanceof com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens
            if (r0 == 0) goto L_0x0468
            com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens r4 = (com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens) r4
            X.66C r1 = r4.A03
        L_0x045e:
            if (r1 == 0) goto L_0x0022
            int r0 = r3.intValue()
            r1.A01(r2, r0)
            return
        L_0x0468:
            boolean r0 = r4 instanceof com.whatsapp.wabloks.base.BkScreenFragment
            if (r0 == 0) goto L_0x0022
            com.whatsapp.wabloks.base.BkScreenFragment r4 = (com.whatsapp.wabloks.base.BkScreenFragment) r4
            X.66C r1 = r4.A01
            goto L_0x045e
        L_0x0471:
            java.lang.Object r3 = r11.A00
            com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens r3 = (com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens) r3
            X.5cz r12 = (X.C111875cz) r12
            boolean r0 = r12 instanceof X.AnonymousClass5OA
            if (r0 == 0) goto L_0x04d8
            X.5OA r12 = (X.AnonymousClass5OA) r12
            int r4 = r12.A00
            android.view.View r0 = r3.A0F
            if (r0 == 0) goto L_0x04ce
            java.util.Map r2 = r3.A07
            android.os.Bundle r1 = r3.A0b()
            java.lang.String r0 = "screen_name"
            java.lang.String r0 = r1.getString(r0)
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L_0x04d2
            A00(r3)
            com.whatsapp.wabloks.base.DefaultBkPreloadFragment$BkCustomReloadFragment r0 = new com.whatsapp.wabloks.base.DefaultBkPreloadFragment$BkCustomReloadFragment
            r0.<init>()
            android.os.Bundle r1 = r0.A0A
            if (r1 == 0) goto L_0x04a6
            java.lang.String r0 = "layout_error_status"
            r1.putInt(r0, r4)
        L_0x04a6:
            A00(r3)
            com.whatsapp.wabloks.base.DefaultBkPreloadFragment$BkCustomReloadFragment r2 = new com.whatsapp.wabloks.base.DefaultBkPreloadFragment$BkCustomReloadFragment
            r2.<init>()
            android.os.Bundle r1 = r2.A0A
            if (r1 == 0) goto L_0x04b7
            java.lang.String r0 = "layout_error_status"
            r1.putInt(r0, r4)
        L_0x04b7:
            android.widget.FrameLayout r0 = r3.A00
            X.C36341k9.A0y(r0)
            android.widget.FrameLayout r0 = r3.A01
            if (r0 == 0) goto L_0x04ce
            X.09Y r1 = X.C36411kG.A0S(r3)
            r0 = 2131432870(0x7f0b15a6, float:1.848751E38)
            r1.A0B(r2, r0)
            r0 = 1
            r1.A00(r0)
        L_0x04ce:
            r3.A1Z()
            return
        L_0x04d2:
            X.005 r0 = r3.A08
            r0.get()
            goto L_0x04a6
        L_0x04d8:
            boolean r0 = r12 instanceof X.AnonymousClass5OB
            if (r0 == 0) goto L_0x05b4
            android.view.View r0 = r3.A0F
            if (r0 == 0) goto L_0x0022
            java.util.Map r2 = r3.A07
            android.os.Bundle r1 = r3.A0b()
            java.lang.String r0 = "screen_name"
            java.lang.String r0 = r1.getString(r0)
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L_0x0524
            A00(r3)
            r1 = 2131624186(0x7f0e00fa, float:1.8875545E38)
            X.02E r0 = new X.02E
            r0.<init>()
            r0.A06 = r1
        L_0x04ff:
            A00(r3)
            r0 = 2131624186(0x7f0e00fa, float:1.8875545E38)
            X.02E r2 = new X.02E
            r2.<init>()
            r2.A06 = r0
            android.widget.FrameLayout r0 = r3.A00
            X.C36341k9.A0y(r0)
            android.widget.FrameLayout r0 = r3.A01
            if (r0 == 0) goto L_0x0022
            X.09Y r1 = X.C36411kG.A0S(r3)
            r0 = 2131432870(0x7f0b15a6, float:1.848751E38)
            r1.A0B(r2, r0)
            r0 = 1
            r1.A00(r0)
            return
        L_0x0524:
            X.005 r0 = r3.A08
            r0.get()
            goto L_0x04ff
        L_0x052a:
            java.lang.Object r0 = r11.A00
            X.70B r0 = (X.AnonymousClass70B) r0
            android.content.DialogInterface r12 = (android.content.DialogInterface) r12
            X.00S r0 = r0.A04
            goto L_0x053b
        L_0x0533:
            java.lang.Object r0 = r11.A00
            X.70B r0 = (X.AnonymousClass70B) r0
            android.content.DialogInterface r12 = (android.content.DialogInterface) r12
            X.00S r0 = r0.A03
        L_0x053b:
            r0.invoke()
            goto L_0x001f
        L_0x0540:
            java.lang.Object r1 = r11.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r1 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r1
            java.util.List r12 = (java.util.List) r12
            X.01I r0 = r1.A0h()
            if (r0 == 0) goto L_0x0553
            boolean r0 = X.AnonymousClass3SJ.A04(r0)
            if (r0 == 0) goto L_0x0553
            return
        L_0x0553:
            X.4mS r0 = r1.A0M
            r0.A0M(r12)
            return
        L_0x0559:
            java.lang.Object r2 = r11.A00
            X.6X3 r2 = (X.AnonymousClass6X3) r2
            boolean r1 = X.AnonymousClass000.A1X(r12)
            r2.A09 = r1
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x0578
            if (r1 != 0) goto L_0x056d
            boolean r0 = r2.A0I
            if (r0 == 0) goto L_0x0578
        L_0x056d:
            r0 = 3
        L_0x056e:
            X.AnonymousClass6X3.A01(r2, r0)
            r2.A04()
            r2.A05()
            return
        L_0x0578:
            r0 = 4
            goto L_0x056e
        L_0x057a:
            java.lang.Object r3 = r11.A00
            com.whatsapp.wabloks.base.BkScreenFragment r3 = (com.whatsapp.wabloks.base.BkScreenFragment) r3
            int r0 = X.AnonymousClass000.A0I(r12)
            android.view.View r2 = r3.A0F
            if (r2 == 0) goto L_0x0592
            java.lang.String r1 = r3.A0n(r0)
            r0 = 0
            X.4t3 r0 = X.C99304t3.A02(r2, r1, r0)
            r0.A0P()
        L_0x0592:
            r3.A1e()
            return
        L_0x0596:
            java.lang.Object r0 = r11.A00
            X.C36331k8.A1J(r0, r12)
            return
        L_0x059c:
            java.lang.Object r2 = r11.A00
            com.whatsapp.webview.ui.WaInAppBrowsingActivity r2 = (com.whatsapp.webview.ui.WaInAppBrowsingActivity) r2
            android.content.Intent r1 = com.whatsapp.webview.ui.WaInAppBrowsingActivity.A07(r2)
            r0 = 0
            r2.A3j(r0, r1)
            return
        L_0x05a9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "received unsuccessful status: "
            java.lang.IllegalStateException r0 = X.C90464aC.A0R(r0, r1, r2)
            throw r0
        L_0x05b4:
            android.widget.FrameLayout r1 = r3.A00
            if (r1 == 0) goto L_0x05bc
            r0 = 0
            r1.setVisibility(r0)
        L_0x05bc:
            android.widget.FrameLayout r0 = r3.A01
            X.C36341k9.A0y(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C165207t3.BTH(java.lang.Object):void");
    }
}
