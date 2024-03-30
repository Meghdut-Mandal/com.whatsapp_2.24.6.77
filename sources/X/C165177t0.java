package X;

/* renamed from: X.7t0  reason: invalid class name and case insensitive filesystem */
public class C165177t0 implements AnonymousClass04S {
    public Object A00;
    public final int A01;

    public C165177t0(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass012 r1, C001600r r2, Object obj, int i) {
        r2.A08(r1, new C165177t0(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (X.C36351kA.A1W(r5.A0X) != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r4.A0A.hasFocus() == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BTH(java.lang.Object r25) {
        /*
            r24 = this;
            r2 = r25
            r1 = r24
            int r0 = r1.A01
            switch(r0) {
                case 2: goto L_0x059a;
                case 3: goto L_0x0592;
                case 4: goto L_0x058a;
                case 5: goto L_0x0009;
                case 6: goto L_0x0009;
                case 7: goto L_0x03c0;
                case 8: goto L_0x0389;
                case 9: goto L_0x0582;
                case 10: goto L_0x057a;
                case 11: goto L_0x0572;
                case 12: goto L_0x056a;
                case 13: goto L_0x0009;
                case 14: goto L_0x0009;
                case 15: goto L_0x0009;
                case 16: goto L_0x0009;
                case 17: goto L_0x0009;
                case 18: goto L_0x0009;
                case 19: goto L_0x0009;
                case 20: goto L_0x0009;
                case 21: goto L_0x0009;
                case 22: goto L_0x0009;
                case 23: goto L_0x0562;
                case 24: goto L_0x0009;
                case 25: goto L_0x0009;
                case 26: goto L_0x0009;
                case 27: goto L_0x0009;
                case 28: goto L_0x0009;
                case 29: goto L_0x0009;
                case 30: goto L_0x0009;
                case 31: goto L_0x0009;
                case 32: goto L_0x0009;
                case 33: goto L_0x0550;
                case 34: goto L_0x00fb;
                case 35: goto L_0x0548;
                case 36: goto L_0x00da;
                case 37: goto L_0x053a;
                case 38: goto L_0x0518;
                case 39: goto L_0x0009;
                case 40: goto L_0x0009;
                case 41: goto L_0x050e;
                case 42: goto L_0x0502;
                case 43: goto L_0x00c4;
                case 44: goto L_0x04aa;
                case 45: goto L_0x00a7;
                case 46: goto L_0x0076;
                case 47: goto L_0x000f;
                case 48: goto L_0x0496;
                case 49: goto L_0x0452;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A00
            X.C36331k8.A1J(r0, r2)
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r5 = r1.A00
            X.6XN r5 = (X.AnonymousClass6XN) r5
            boolean r1 = X.AnonymousClass000.A1X(r2)
            X.6SU r4 = r5.A0M
            if (r4 == 0) goto L_0x0024
            com.whatsapp.ClearableEditText r0 = r4.A0A
            boolean r0 = r0.hasFocus()
            r3 = 1
            if (r0 != 0) goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            if (r1 == 0) goto L_0x0059
            android.view.ViewGroup r2 = r5.A09
            r0 = 2131434025(0x7f0b1a29, float:1.8489852E38)
            android.view.View r0 = r2.findViewById(r0)
            if (r0 == 0) goto L_0x004c
            android.view.View r1 = r5.A07
            if (r0 == r1) goto L_0x004c
            r2.removeView(r0)
        L_0x0039:
            com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView r0 = r5.A0Q
            r0.removeView(r1)
            r2.addView(r1)
        L_0x0041:
            if (r3 == 0) goto L_0x000e
            X.C18740tg.A06(r4)
            com.whatsapp.ClearableEditText r0 = r4.A0A
            r0.requestFocus()
            return
        L_0x004c:
            android.view.View r1 = r5.A07
            if (r0 != r1) goto L_0x0039
            X.1hi r0 = r5.A0X
            boolean r0 = X.C36351kA.A1W(r0)
            if (r0 == 0) goto L_0x0039
            goto L_0x0041
        L_0x0059:
            android.view.ViewGroup r1 = r5.A09
            r0 = 2131434025(0x7f0b1a29, float:1.8489852E38)
            r2 = 2131434025(0x7f0b1a29, float:1.8489852E38)
            android.view.View r0 = r1.findViewById(r0)
            r1.removeView(r0)
            com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView r1 = r5.A0Q
            android.view.View r0 = r1.findViewById(r2)
            if (r0 != 0) goto L_0x0041
            android.view.View r0 = r5.A07
            r1.addView(r0)
            goto L_0x0041
        L_0x0076:
            java.lang.Object r4 = r1.A00
            X.6XN r4 = (X.AnonymousClass6XN) r4
            boolean r0 = X.AnonymousClass000.A1X(r2)
            if (r0 == 0) goto L_0x000e
            X.5Aq r1 = r4.A0F
            int r0 = r1.A02()
            java.util.ArrayList r0 = r1.A05(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x008e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r2 = r3.next()
            X.7mX r2 = (X.C161307mX) r2
            java.util.concurrent.ConcurrentHashMap r1 = r4.A0e
            java.lang.String r0 = r2.BIB()
            r1.put(r0, r2)
            goto L_0x008e
        L_0x00a4:
            X.4mv r0 = r4.A0I
            goto L_0x00d6
        L_0x00a7:
            java.lang.Object r3 = r1.A00
            X.6XN r3 = (X.AnonymousClass6XN) r3
            boolean r0 = X.AnonymousClass000.A1X(r2)
            r1 = 0
            if (r0 == 0) goto L_0x00ba
            com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView r0 = r3.A0Q
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x000e
        L_0x00ba:
            com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView r0 = r3.A0P
            r0.A0h(r1)
            X.4nK r0 = r3.A0L
            r0.A00 = r1
            return
        L_0x00c4:
            java.lang.Object r3 = r1.A00
            X.6XN r3 = (X.AnonymousClass6XN) r3
            X.5qW r2 = (X.C119825qW) r2
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x000e
            java.util.List r1 = r2.A00
            r0 = 0
            X.AnonymousClass6XN.A01(r3, r1, r0)
            X.4mv r0 = r3.A0I
        L_0x00d6:
            r0.A0L()
            return
        L_0x00da:
            java.lang.Object r0 = r1.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            int r1 = X.AnonymousClass000.A0I(r2)
            X.6Fh r3 = r0.A10
            r0 = 0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r4 = r3.A0I
            r4.setBackButtonDrawable(r0)
            if (r1 == 0) goto L_0x0602
            r0 = 2
            if (r1 == r0) goto L_0x05a7
            r0 = 5
            if (r1 == r0) goto L_0x05a2
            r0 = 6
            if (r1 != r0) goto L_0x000e
            int r0 = r3.A02
            r4.setMagicModBackgroundColor(r0)
            return
        L_0x00fb:
            java.lang.Object r0 = r1.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.5tc r2 = (X.C121725tc) r2
            X.1Go r9 = r0.A0o
            X.6Tg r6 = r0.A1r
            r1 = 0
            X.AnonymousClass00C.A0D(r6, r1)
            r8 = 1
            X.0yC r3 = r9.A00
            r1 = 5954(0x1742, float:8.343E-42)
            boolean r1 = r3.A0E(r1)
            if (r1 == 0) goto L_0x017e
            java.util.Map r1 = r6.A00
            java.util.ArrayList r1 = X.C90494aF.A0g(r1)
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.Iterator r5 = r1.iterator()
        L_0x0122:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x013b
            java.lang.Object r4 = r5.next()
            r3 = r4
            X.6QO r3 = (X.AnonymousClass6QO) r3
            X.1Gn r1 = r9.A01
            int r1 = r1.A01(r3)
            if (r1 != r8) goto L_0x0122
            r7.add(r4)
            goto L_0x0122
        L_0x013b:
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r4 = r7.iterator()
        L_0x0143:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x015a
            java.lang.Object r3 = r4.next()
            r1 = r3
            X.6QO r1 = (X.AnonymousClass6QO) r1
            java.io.File r1 = r1.A08()
            if (r1 == 0) goto L_0x0143
            r5.add(r3)
            goto L_0x0143
        L_0x015a:
            java.util.Iterator r8 = r5.iterator()
        L_0x015e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x017e
            java.lang.Object r7 = r8.next()
            X.6QO r7 = (X.AnonymousClass6QO) r7
            java.io.File r5 = r7.A08()
            if (r5 == 0) goto L_0x015e
            androidx.lifecycle.LifecycleCoroutineScopeImpl r4 = X.C33311f5.A00(r0)
            r3 = 0
            com.whatsapp.media.motionphotos.MotionPhotosController$getMotionPhotos$3$1$1 r1 = new com.whatsapp.media.motionphotos.MotionPhotosController$getMotionPhotos$3$1$1
            r1.<init>(r7, r9, r5, r3)
            X.C36331k8.A1T(r1, r4)
            goto L_0x015e
        L_0x017e:
            r1 = 2131433000(0x7f0b1628, float:1.8487773E38)
            X.C36331k8.A11(r0, r1)
            java.util.Collection r8 = r0.A1u
            java.util.Collection r1 = r2.A00
            r8.addAll(r1)
            X.6VT r3 = r0.A0s
            java.util.Set r2 = r2.A01
            java.util.List r1 = r3.A0E
            r1.removeAll(r2)
            X.AnonymousClass6VT.A04(r3)
            java.util.List r1 = X.AnonymousClass6VT.A03(r0)
            boolean r1 = r1.isEmpty()
            r4 = 0
            if (r1 == 0) goto L_0x01f7
            X.17Y r2 = r0.A05
            r1 = 2131894329(0x7f122039, float:1.942346E38)
            r2.A06(r1, r4)
            r0.finish()
        L_0x01ad:
            boolean r1 = r0.A1a
            if (r1 == 0) goto L_0x000e
            int r1 = r8.size()
            r5 = 1
            if (r1 != r5) goto L_0x000e
            X.0yf r1 = r0.A06
            X.0yi r4 = X.C21100yf.A0o
            boolean r1 = r1.A09(r4)
            if (r1 == 0) goto L_0x000e
            X.3FQ r3 = r0.A1E
            X.0yC r2 = r0.A0D
            r1 = 611(0x263, float:8.56E-43)
            boolean r2 = r2.A0E(r1)
            X.0yf r1 = r0.A06
            boolean r1 = r1.A09(r4)
            X.3Pk r1 = r3.A00(r0, r2, r1)
            r0.A1D = r1
            r1.A03 = r5
            X.1GX r4 = r0.A1N
            X.4RW r3 = r0.A1s
            java.util.Iterator r1 = r8.iterator()
            java.io.File r1 = X.C90504aG.A0a(r1)
            android.net.Uri r2 = android.net.Uri.fromFile(r1)
            X.2kQ r1 = new X.2kQ
            r1.<init>(r2, r3, r4)
            r0.A1C = r1
            X.0wU r0 = r0.A04
            X.C36331k8.A1F(r1, r0)
            return
        L_0x01f7:
            X.01z r1 = r0.getSupportFragmentManager()
            X.53t r2 = new X.53t
            r2.<init>(r1, r0)
            r0.A0t = r2
            com.whatsapp.gallerypicker.PhotoViewPager r1 = r0.A0i
            r1.setAdapter(r2)
            X.6VT r1 = r0.A0s
            X.00s r1 = r1.A03
            int r1 = X.C36341k9.A07(r1)
            if (r1 < 0) goto L_0x0363
            X.6VT r1 = r0.A0s
            X.00s r1 = r1.A03
            int r3 = X.C36341k9.A07(r1)
        L_0x0219:
            X.0ts r1 = r0.A0V
            boolean r1 = X.C36401kF.A1X(r1)
            com.whatsapp.gallerypicker.PhotoViewPager r2 = r0.A0i
            if (r1 == 0) goto L_0x035e
            X.53t r1 = r0.A0t
            int r1 = r1.A0H()
            int r1 = r1 + -1
            int r1 = r1 - r3
            r2.A0J(r1, r4)
        L_0x022f:
            X.6vv r3 = r0.A0u
            X.6VT r1 = r0.A0s
            boolean r9 = r1.A0C()
            android.content.SharedPreferences r2 = X.C36331k8.A06(r0)
            java.lang.String r1 = "filter_dismissal_amount"
            int r7 = r2.getInt(r1, r4)
            android.graphics.Bitmap r5 = r0.A01
            X.6VT r1 = r0.A0s
            boolean r1 = r1.A0C()
            r14 = 1
            if (r1 != 0) goto L_0x0255
            X.0wQ r1 = r0.A02
            boolean r1 = r1.A0L()
            if (r1 == 0) goto L_0x0255
            r4 = 1
        L_0x0255:
            r3.A06(r9)
            X.6vx r1 = r3.A07
            androidx.recyclerview.widget.RecyclerView r2 = r1.A05
            X.4mf r1 = r1.A09
            r2.setAdapter(r1)
            if (r5 != 0) goto L_0x02c8
            X.6BW r1 = r3.A06
            com.whatsapp.WaImageButton r5 = r1.A01
            r10 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            r15 = 1056964608(0x3f000000, float:0.5)
            r21 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r9 = new android.view.animation.ScaleAnimation
            r12 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r16 = 1
            r17 = 1056964608(0x3f000000, float:0.5)
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = 125(0x7d, double:6.2E-322)
            r9.setDuration(r1)
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r1.<init>()
            android.view.animation.Interpolator r1 = (android.view.animation.Interpolator) r1
            r9.setInterpolator(r1)
            r9.setFillBefore(r14)
            r1 = 100
            r9.setStartOffset(r1)
            r5.clearAnimation()
            r5.startAnimation(r9)
            com.whatsapp.mediacomposer.bottombar.BottomBarView r1 = r3.A02
            com.whatsapp.WaImageButton r1 = r1.A04
            r1.clearAnimation()
            android.view.animation.ScaleAnimation r15 = new android.view.animation.ScaleAnimation
            r16 = 0
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 1
            r22 = 1
            r23 = 1056964608(0x3f000000, float:0.5)
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = 125(0x7d, double:6.2E-322)
            r15.setDuration(r1)
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r1.<init>()
            android.view.animation.Interpolator r1 = (android.view.animation.Interpolator) r1
            r15.setInterpolator(r1)
            r15.setFillBefore(r14)
            r1 = 100
            r15.setStartOffset(r1)
        L_0x02c8:
            X.5qU r9 = r3.A04
            r1 = 5
            boolean r2 = X.C90474aD.A1T(r7, r1)
            com.whatsapp.mediacomposer.bottombar.filterswipe.FilterSwipeView r5 = r9.A01
            r1 = 2131889598(0x7f120dbe, float:1.9413864E38)
            if (r2 == 0) goto L_0x02d9
            r1 = 2131889599(0x7f120dbf, float:1.9413866E38)
        L_0x02d9:
            r5.setText(r1)
            android.widget.TextView r1 = r5.A00
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0319
            android.content.Context r1 = r9.A00
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131166591(0x7f07057f, float:1.7947432E38)
            float r19 = r2.getDimension(r1)
            r13 = 0
            r18 = 0
            android.view.animation.TranslateAnimation r11 = new android.view.animation.TranslateAnimation
            r12 = 1
            r15 = 0
            r16 = 1
            r17 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = 1000(0x3e8, double:4.94E-321)
            r11.setDuration(r1)
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r1.<init>()
            android.view.animation.Interpolator r1 = (android.view.animation.Interpolator) r1
            r11.setInterpolator(r1)
            r1 = 2
            r11.setRepeatMode(r1)
            r1 = 3
            r11.setRepeatCount(r1)
            r5.startAnimation(r11)
        L_0x0319:
            X.64H r1 = r3.A03
            com.whatsapp.mediacomposer.bottombar.caption.CaptionView r1 = r1.A03
            r1.A04 = r4
            X.6VT r1 = r0.A0s
            X.00s r1 = r1.A04
            int r1 = X.C36401kF.A00(r1)
            if (r1 != r14) goto L_0x035b
            r1 = 1000(0x3e8, double:4.94E-321)
        L_0x032b:
            X.653 r9 = r0.A12
            X.6VT r3 = r0.A0s
            X.00s r3 = r3.A04
            java.lang.Object r7 = r3.A04()
            X.6VT r5 = r0.A0s
            r3 = 0
            X.C36321k7.A0v(r7, r3, r5)
            boolean r3 = r9.A01
            if (r3 == 0) goto L_0x01ad
            boolean r3 = r9.A02
            if (r3 != 0) goto L_0x01ad
            boolean r3 = r9.A00
            if (r3 == 0) goto L_0x01ad
            r9.A02 = r14
            X.17Y r4 = r9.A03
            X.73N r3 = new X.73N
            r15 = 0
            r10 = r3
            r11 = r9
            r12 = r5
            r13 = r7
            r14 = r6
            r10.<init>(r11, r12, r13, r14, r15)
            r4.A0I(r3, r1)
            goto L_0x01ad
        L_0x035b:
            r1 = 3000(0xbb8, double:1.482E-320)
            goto L_0x032b
        L_0x035e:
            r2.A0J(r3, r4)
            goto L_0x022f
        L_0x0363:
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "preselected_image_uri"
            android.os.Parcelable r2 = r2.getParcelableExtra(r1)
            if (r2 == 0) goto L_0x0386
            X.6VT r1 = r0.A0s
            X.00s r1 = r1.A04
            java.lang.Object r1 = r1.A04()
            if (r1 == 0) goto L_0x0386
            java.util.List r1 = X.AnonymousClass6VT.A03(r0)
            int r3 = r1.indexOf(r2)
            r1 = -1
            if (r3 == r1) goto L_0x0386
            goto L_0x0219
        L_0x0386:
            r3 = 0
            goto L_0x0219
        L_0x0389:
            java.lang.Object r3 = r1.A00
            X.3fk r3 = (X.C70803fk) r3
            X.5q2 r2 = (X.AnonymousClass5q2) r2
            X.9un r1 = r2.A00
            if (r1 == 0) goto L_0x000e
            X.8b3 r1 = (X.C175788b3) r1
            java.lang.String r0 = r1.A00
            java.lang.String r2 = "pix_key"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x03af
            X.8bF r1 = r1.A08
            boolean r0 = r1 instanceof X.C175838b9
            if (r0 == 0) goto L_0x000e
            X.8b9 r1 = (X.C175838b9) r1
            java.util.HashMap r0 = r1.A03
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x000e
        L_0x03af:
            X.4V6 r0 = r3.A2l
            X.0wG r1 = r0.getWAContext()
            r0 = 2131893089(0x7f121b61, float:1.9420945E38)
            java.lang.String r0 = r1.A01(r0)
            r3.A2V(r0)
            return
        L_0x03c0:
            java.lang.Object r4 = r1.A00
            X.6T1 r4 = (X.AnonymousClass6T1) r4
            X.6PK r2 = (X.AnonymousClass6PK) r2
            java.util.List r0 = X.AnonymousClass6T1.A0F
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            X.00s r3 = r4.A04
            java.lang.Object r0 = r3.A04()
            X.6A2 r0 = (X.AnonymousClass6A2) r0
            if (r0 == 0) goto L_0x0417
            X.5Sc r1 = r0.A01
            X.5Sc r0 = X.C108085Sc.DISMISSED
            if (r1 == r0) goto L_0x0417
            X.5Sc r0 = X.C108085Sc.DID_NOT_SHOW
            if (r1 == r0) goto L_0x0417
            X.5Sc r0 = X.C108085Sc.SHOWING
            if (r1 != r0) goto L_0x000e
            X.AnonymousClass00C.A0B(r2)
            java.lang.Object r0 = r3.A04()
            X.6A2 r0 = (X.AnonymousClass6A2) r0
            if (r0 == 0) goto L_0x000e
            java.util.Map r1 = r4.A0A
            X.5Re r0 = r0.A00
            java.lang.Object r0 = r1.get(r0)
            X.00T r0 = (X.AnonymousClass00T) r0
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r0.getValue()
            X.65a r0 = (X.C1266765a) r0
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x000e
            X.5wD r0 = r4.A06
            android.widget.PopupWindow r1 = r0.A01
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L_0x000e
            r1.dismiss()
            return
        L_0x0417:
            X.AnonymousClass00C.A0B(r2)
            java.util.List r0 = X.AnonymousClass6T1.A0F
            java.util.Iterator r5 = r0.iterator()
        L_0x0420:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r1 = r5.next()
            java.util.Map r0 = r4.A0A
            java.lang.Object r0 = r0.get(r1)
            X.00T r0 = (X.AnonymousClass00T) r0
            if (r0 == 0) goto L_0x0420
            java.lang.Object r3 = r0.getValue()
            X.65a r3 = (X.C1266765a) r3
            r1 = 1
            if (r3 == 0) goto L_0x0420
            boolean r0 = r3.A01(r2)
            if (r0 != r1) goto L_0x0420
            X.040 r2 = r4.A0B
            r1 = 0
            com.whatsapp.calling.tooltip.CallTooltipManager$startShowTooltipJob$1 r0 = new com.whatsapp.calling.tooltip.CallTooltipManager$startShowTooltipJob$1
            r0.<init>(r4, r3, r1)
            X.0A6 r0 = X.C36391kE.A12(r0, r2)
            r4.A02 = r0
            return
        L_0x0452:
            java.lang.Object r4 = r1.A00
            X.6XN r4 = (X.AnonymousClass6XN) r4
            int r3 = X.AnonymousClass000.A0I(r2)
            X.4mv r1 = r4.A0I
            r0 = 0
            r1.A01 = r0
            r1.A0L()
            r1.A06()
            X.6Q0 r0 = r4.A03
            r2 = 0
            r0.A01 = r2
            X.AnonymousClass6Q0.A00(r0)
            if (r3 != 0) goto L_0x0493
            X.5Cv r1 = r4.A0T
        L_0x0471:
            r4.A03 = r1
            r0 = 1
            r1.A01 = r0
            X.AnonymousClass6Q0.A00(r1)
            X.6Q0 r0 = r4.A03
            androidx.recyclerview.widget.RecyclerView r0 = r0.A05
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x048d
            X.6Q0 r0 = r4.A03
            X.C18740tg.A06(r0)
            X.4mq r0 = r0.A07
            X.C96134mq.A02(r0, r2)
        L_0x048d:
            com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView r0 = r4.A0P
            r0.A0h(r2)
            return
        L_0x0493:
            X.5Cw r1 = r4.A0S
            goto L_0x0471
        L_0x0496:
            java.lang.Object r0 = r1.A00
            X.6XN r0 = (X.AnonymousClass6XN) r0
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            X.6Q0 r1 = r0.A03
            boolean r0 = r2.booleanValue()
            r0 = r0 ^ 1
            r1.A01 = r0
            X.AnonymousClass6Q0.A00(r1)
            return
        L_0x04aa:
            java.lang.Object r3 = r1.A00
            X.6XN r3 = (X.AnonymousClass6XN) r3
            X.5qX r2 = (X.C119835qX) r2
            X.68B r4 = r2.A00
            if (r4 != 0) goto L_0x04c9
            java.lang.String r1 = r2.A01
            X.C18740tg.A06(r1)
            java.util.Map r0 = r3.A0Z
            r0.remove(r1)
            java.util.Map r0 = r3.A0a
            r0.remove(r1)
            X.4mv r0 = r3.A0I
            r0.A0M(r1)
            return
        L_0x04c9:
            java.util.ArrayList r1 = X.AnonymousClass6XN.A00(r3, r4)
            X.AnonymousClass6XN.A02(r3, r1)
            java.util.Map r0 = r3.A0Z
            java.lang.String r2 = r4.A0F
            r0.put(r2, r4)
            java.util.Map r0 = r3.A0a
            r0.put(r2, r1)
            X.4mv r3 = r3.A0I
            java.util.LinkedHashMap r1 = r3.A02
            java.util.ArrayList r0 = X.C96184mv.A01(r3, r4)
            r1.put(r2, r0)
            X.C96184mv.A03(r3)
            java.util.List r0 = r3.A03
            int r2 = r0.size()
            int r1 = r3.A0J()
            java.util.List r0 = r3.A03
            int r0 = r0.size()
            int r1 = r1 - r0
            r3.A0A(r2, r1)
            X.C96184mv.A04(r3)
            return
        L_0x0502:
            java.lang.Object r1 = r1.A00
            X.00S r1 = (X.AnonymousClass00S) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.invoke()
            return
        L_0x050e:
            java.lang.Object r0 = r1.A00
            X.64H r0 = (X.AnonymousClass64H) r0
            java.lang.Integer r2 = (java.lang.Integer) r2
            r0.A00(r2)
            return
        L_0x0518:
            java.lang.Object r4 = r1.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r4 = (com.whatsapp.mediacomposer.MediaComposerActivity) r4
            X.011 r2 = (X.AnonymousClass011) r2
            java.lang.Object r3 = r2.first
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.Object r2 = r2.second
            java.io.File r2 = (java.io.File) r2
            X.6Tg r0 = r4.A1r
            X.6QO r1 = r0.A03(r3)
            monitor-enter(r1)
            r1.A09 = r2     // Catch:{ all -> 0x0537 }
            monitor-exit(r1)
            com.whatsapp.mediacomposer.MediaComposerActivity.A0M(r3, r4)
            X.C146636vv.A00(r4)
            return
        L_0x0537:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x053a:
            java.lang.Object r1 = r1.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r1 = (com.whatsapp.mediacomposer.MediaComposerActivity) r1
            java.util.List r2 = (java.util.List) r2
            X.3XT r0 = X.AnonymousClass6VT.A01(r1)
            com.whatsapp.mediacomposer.MediaComposerActivity.A0O(r0, r1, r2)
            return
        L_0x0548:
            java.lang.Object r0 = r1.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            com.whatsapp.mediacomposer.MediaComposerActivity.A0n(r0)
            return
        L_0x0550:
            java.lang.Object r1 = r1.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r1 = (com.whatsapp.mediacomposer.MediaComposerActivity) r1
            X.3XT r2 = (X.AnonymousClass3XT) r2
            X.6VT r0 = r1.A0s
            X.00s r0 = r0.A02
            java.util.List r0 = X.C36401kF.A0w(r0)
            com.whatsapp.mediacomposer.MediaComposerActivity.A0O(r2, r1, r0)
            return
        L_0x0562:
            java.lang.Object r0 = r1.A00
            X.02t r0 = (X.C006302t) r0
            X.C90484aE.A1L(r0, r2)
            return
        L_0x056a:
            java.lang.Object r0 = r1.A00
            X.02t r0 = (X.C006302t) r0
            X.C90484aE.A1L(r0, r2)
            return
        L_0x0572:
            java.lang.Object r0 = r1.A00
            X.02t r0 = (X.C006302t) r0
            X.C90484aE.A1L(r0, r2)
            return
        L_0x057a:
            java.lang.Object r0 = r1.A00
            X.02t r0 = (X.C006302t) r0
            X.C90484aE.A1L(r0, r2)
            return
        L_0x0582:
            java.lang.Object r0 = r1.A00
            X.02t r0 = (X.C006302t) r0
            X.C90484aE.A1L(r0, r2)
            return
        L_0x058a:
            java.lang.Object r0 = r1.A00
            X.02t r0 = (X.C006302t) r0
            X.C90484aE.A1L(r0, r2)
            return
        L_0x0592:
            java.lang.Object r0 = r1.A00
            X.02t r0 = (X.C006302t) r0
            X.C90484aE.A1L(r0, r2)
            return
        L_0x059a:
            java.lang.Object r0 = r1.A00
            X.02t r0 = (X.C006302t) r0
            X.C90484aE.A1L(r0, r2)
            return
        L_0x05a2:
            r0 = 1
            r4.setBackButtonDrawable(r0)
            goto L_0x05c9
        L_0x05a7:
            r0 = 1
            android.widget.ImageView r1 = r4.A03
            if (r1 != 0) goto L_0x05b3
            java.lang.String r0 = "backButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05b3:
            int r0 = X.C36381kD.A00(r0)
            r1.setVisibility(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r4.A0T
            if (r1 != 0) goto L_0x05c5
            java.lang.String r0 = "doneButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05c5:
            r0 = 0
            r1.setVisibility(r0)
        L_0x05c9:
            float r2 = r3.A01
            int r0 = r3.A02
            r3.A08(r0, r2)
            X.4bb r0 = r4.A0O
            if (r0 != 0) goto L_0x05db
            java.lang.String r0 = "textToolDrawable"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05db:
            r1 = 0
            r0.A01(r1, r2)
            X.4bb r0 = r4.A0M
            if (r0 != 0) goto L_0x05ea
            java.lang.String r0 = "penToolDrawable"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05ea:
            r0.A01(r1, r2)
            android.widget.ImageView r1 = r4.A08
            if (r1 != 0) goto L_0x05f8
            java.lang.String r0 = "shapeTool"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05f8:
            r0 = 1
            r1.setSelected(r0)
            r3.A09 = r0
            r0 = 0
            r3.A0A = r0
            return
        L_0x0602:
            float r0 = r3.A01
            r3.A05(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C165177t0.BTH(java.lang.Object):void");
    }
}
