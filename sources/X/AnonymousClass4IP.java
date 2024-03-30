package X;

import com.whatsapp.avatar.home.AvatarHomeActivity;

/* renamed from: X.4IP  reason: invalid class name */
public final class AnonymousClass4IP extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AvatarHomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4IP(AvatarHomeActivity avatarHomeActivity) {
        super(1);
        this.this$0 = avatarHomeActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:150:0x0233  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            X.2r2 r10 = (X.C53262r2) r10
            r0 = 0
            X.AnonymousClass00C.A0D(r10, r0)
            boolean r0 = r10 instanceof X.AnonymousClass294
            if (r0 == 0) goto L_0x00a1
            com.whatsapp.avatar.home.AvatarHomeActivity r4 = r9.this$0
            X.294 r10 = (X.AnonymousClass294) r10
            com.whatsapp.avatar.home.AvatarHomeActivity.A01(r4)
            r4.Bnv()
            android.widget.LinearLayout r1 = r4.A06
            java.lang.String r0 = "containerNewUser"
            r5 = 0
            if (r1 != 0) goto L_0x0020
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0020:
            r3 = 0
            r1.setVisibility(r3)
            android.widget.LinearLayout r1 = r4.A06
            if (r1 != 0) goto L_0x002d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x002d:
            X.3ZB r0 = X.AnonymousClass3ZB.A00
            r1.setOnTouchListener(r0)
            android.widget.FrameLayout r0 = r4.A04
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "containerAvatarSet"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x003d:
            r1 = 8
            r0.setVisibility(r1)
            com.whatsapp.WaTextView r0 = r4.A0C
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = "browseStickersTextView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x004d:
            r0.setVisibility(r1)
            com.whatsapp.WaTextView r0 = r4.A0D
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = "createProfilePhotoTextView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x005b:
            r0.setVisibility(r1)
            android.view.View r0 = r4.A02
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "privacyDivider"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0069:
            r0.setVisibility(r1)
            com.whatsapp.WaTextView r0 = r4.A0E
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = "deleteAvatarTextView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0077:
            r0.setVisibility(r1)
            X.060 r0 = r4.A08
            if (r0 != 0) goto L_0x0085
            java.lang.String r0 = "editAvatarFab"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0085:
            r2 = 1
            r0.A04(r2)
            com.whatsapp.bottomsheet.LockableBottomSheetBehavior r1 = r4.A0F
            if (r1 == 0) goto L_0x0096
            r1.A00 = r3
            r0 = 4
            r1.A0W(r0)
            com.whatsapp.avatar.home.AvatarHomeActivity.A0F(r4, r2)
        L_0x0096:
            com.whatsapp.WaImageView r0 = r4.A0B
            if (r0 != 0) goto L_0x034f
            java.lang.String r0 = "avatarSetImageView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00a1:
            boolean r0 = r10 instanceof X.AnonymousClass295
            if (r0 == 0) goto L_0x0237
            com.whatsapp.avatar.home.AvatarHomeActivity r2 = r9.this$0
            X.295 r10 = (X.AnonymousClass295) r10
            com.whatsapp.avatar.home.AvatarHomeActivity.A01(r2)
            android.widget.LinearLayout r0 = r2.A06
            java.lang.String r3 = "containerNewUser"
            r5 = 0
            if (r0 != 0) goto L_0x00b8
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x00b8:
            r1 = 8
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r2.A06
            if (r0 != 0) goto L_0x00c6
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x00c6:
            r0.setOnTouchListener(r5)
            android.widget.FrameLayout r0 = r2.A04
            if (r0 != 0) goto L_0x00d4
            java.lang.String r0 = "containerAvatarSet"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00d4:
            r3 = 0
            r0.setVisibility(r3)
            com.whatsapp.CircularProgressBar r0 = r2.A09
            if (r0 != 0) goto L_0x00e3
            java.lang.String r0 = "avatarLoadingProgressBar"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00e3:
            r0.setVisibility(r1)
            com.whatsapp.WaImageView r0 = r2.A0B
            if (r0 != 0) goto L_0x00f1
            java.lang.String r0 = "avatarSetImageView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00f1:
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r0 = r2.A0C
            if (r0 != 0) goto L_0x00ff
            java.lang.String r0 = "browseStickersTextView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00ff:
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r0 = r2.A0D
            if (r0 != 0) goto L_0x010d
            java.lang.String r0 = "createProfilePhotoTextView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x010d:
            r0.setVisibility(r3)
            android.view.View r0 = r2.A02
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = "privacyDivider"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x011b:
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r0 = r2.A0E
            if (r0 != 0) goto L_0x0129
            java.lang.String r0 = "deleteAvatarTextView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0129:
            r0.setVisibility(r3)
            X.060 r1 = r2.A08
            if (r1 != 0) goto L_0x0137
            java.lang.String r0 = "editAvatarFab"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0137:
            r0 = 1
            r1.A05(r0)
            com.whatsapp.bottomsheet.LockableBottomSheetBehavior r1 = r2.A0F
            if (r1 == 0) goto L_0x014a
            boolean r0 = r10.A02
            r1.A00 = r0
            r0 = 4
            r1.A0W(r0)
            com.whatsapp.avatar.home.AvatarHomeActivity.A0F(r2, r3)
        L_0x014a:
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x016b
            r0 = 2131888702(0x7f120a3e, float:1.9412047E38)
            r2.Bu1(r0)
        L_0x0154:
            X.2r0 r1 = r10.A00
            boolean r0 = r1 instanceof X.C430828w
            if (r0 == 0) goto L_0x01aa
            X.28w r1 = (X.C430828w) r1
            android.graphics.Bitmap r5 = r1.A00
            boolean r4 = r10.A02
            com.whatsapp.CircularProgressBar r0 = r2.A09
            if (r0 != 0) goto L_0x017f
            java.lang.String r0 = "avatarLoadingProgressBar"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x016b:
            r2.Bnv()
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x0154
            android.view.View r1 = r2.A00
            r0 = 2131888701(0x7f120a3d, float:1.9412045E38)
            X.4t3 r0 = X.C99304t3.A00(r1, r0, r3)
            r0.A0P()
            goto L_0x0154
        L_0x017f:
            r3 = 8
            r0.setVisibility(r3)
            com.whatsapp.WaImageView r1 = r2.A0B
            java.lang.String r0 = "avatarSetImageView"
            if (r1 != 0) goto L_0x018f
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x018f:
            r1.setImageBitmap(r5)
            com.whatsapp.WaImageView r1 = r2.A0B
            if (r1 != 0) goto L_0x019b
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x019b:
            r0 = 1
            r1.setClickable(r0)
            android.view.View r0 = r2.A00
            if (r0 != 0) goto L_0x022c
            java.lang.String r0 = "avatarPreviewErrorView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01aa:
            X.28x r0 = X.C430928x.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x01e9
            boolean r4 = r10.A02
            com.whatsapp.CircularProgressBar r1 = r2.A09
            if (r1 != 0) goto L_0x01bf
            java.lang.String r0 = "avatarLoadingProgressBar"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01bf:
            r0 = 8
            r1.setVisibility(r0)
            com.whatsapp.WaImageView r0 = r2.A0B
            java.lang.String r1 = "avatarSetImageView"
            if (r0 != 0) goto L_0x01cf
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x01cf:
            r0.setImageBitmap(r5)
            com.whatsapp.WaImageView r0 = r2.A0B
            if (r0 != 0) goto L_0x01db
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x01db:
            r0.setClickable(r3)
            android.view.View r0 = r2.A00
            if (r0 != 0) goto L_0x022c
            java.lang.String r0 = "avatarPreviewErrorView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01e9:
            X.28y r0 = X.AnonymousClass28y.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0374
            boolean r4 = r10.A02
            com.whatsapp.CircularProgressBar r0 = r2.A09
            if (r0 != 0) goto L_0x01fe
            java.lang.String r0 = "avatarLoadingProgressBar"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01fe:
            r0.setVisibility(r3)
            com.whatsapp.WaImageView r0 = r2.A0B
            java.lang.String r1 = "avatarSetImageView"
            if (r0 != 0) goto L_0x020c
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x020c:
            r0.setImageBitmap(r5)
            com.whatsapp.WaImageView r0 = r2.A0B
            if (r0 != 0) goto L_0x0218
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x0218:
            r0.setClickable(r3)
            android.view.View r1 = r2.A00
            if (r1 != 0) goto L_0x0226
            java.lang.String r0 = "avatarPreviewErrorView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0226:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x022f
        L_0x022c:
            r0.setVisibility(r3)
        L_0x022f:
            com.whatsapp.bottomsheet.LockableBottomSheetBehavior r0 = r2.A0F
            if (r0 == 0) goto L_0x0374
            r0.A00 = r4
            goto L_0x0374
        L_0x0237:
            X.293 r0 = X.AnonymousClass293.A00
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0374
            com.whatsapp.avatar.home.AvatarHomeActivity r5 = r9.this$0
            com.whatsapp.WaTextView r0 = r5.A0C
            java.lang.String r8 = "browseStickersTextView"
            r4 = 0
            if (r0 != 0) goto L_0x024d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x024d:
            r0.setOnClickListener(r4)
            com.whatsapp.WaTextView r0 = r5.A0C
            if (r0 != 0) goto L_0x0259
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x0259:
            r3 = 0
            r0.setClickable(r3)
            com.whatsapp.WaTextView r0 = r5.A0D
            java.lang.String r7 = "createProfilePhotoTextView"
            if (r0 != 0) goto L_0x0268
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r7)
            throw r0
        L_0x0268:
            r0.setOnClickListener(r4)
            com.whatsapp.WaTextView r0 = r5.A0D
            if (r0 != 0) goto L_0x0274
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r7)
            throw r0
        L_0x0274:
            r0.setClickable(r3)
            com.whatsapp.WaTextView r0 = r5.A0E
            java.lang.String r6 = "deleteAvatarTextView"
            if (r0 != 0) goto L_0x0282
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x0282:
            r0.setOnClickListener(r4)
            com.whatsapp.WaTextView r0 = r5.A0E
            if (r0 != 0) goto L_0x028e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x028e:
            r0.setClickable(r3)
            android.widget.LinearLayout r0 = r5.A07
            java.lang.String r1 = "containerPrivacy"
            if (r0 != 0) goto L_0x029c
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x029c:
            r0.setOnClickListener(r4)
            android.widget.LinearLayout r0 = r5.A07
            if (r0 != 0) goto L_0x02a8
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x02a8:
            r0.setClickable(r3)
            r5.Bnv()
            android.widget.LinearLayout r0 = r5.A06
            java.lang.String r2 = "containerNewUser"
            if (r0 != 0) goto L_0x02b9
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x02b9:
            r1 = 8
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r5.A06
            if (r0 != 0) goto L_0x02c7
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x02c7:
            r0.setOnTouchListener(r4)
            android.widget.FrameLayout r0 = r5.A04
            if (r0 != 0) goto L_0x02d5
            java.lang.String r0 = "containerAvatarSet"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02d5:
            r0.setVisibility(r3)
            com.whatsapp.CircularProgressBar r0 = r5.A09
            if (r0 != 0) goto L_0x02e3
            java.lang.String r0 = "avatarLoadingProgressBar"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02e3:
            r0.setVisibility(r3)
            com.whatsapp.WaImageView r0 = r5.A0B
            java.lang.String r2 = "avatarSetImageView"
            if (r0 != 0) goto L_0x02f1
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x02f1:
            r0.setVisibility(r1)
            com.whatsapp.WaTextView r0 = r5.A0C
            if (r0 != 0) goto L_0x02fd
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x02fd:
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r0 = r5.A0D
            if (r0 != 0) goto L_0x0309
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r7)
            throw r0
        L_0x0309:
            r0.setVisibility(r3)
            android.view.View r0 = r5.A02
            if (r0 != 0) goto L_0x0317
            java.lang.String r0 = "privacyDivider"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0317:
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r0 = r5.A0E
            if (r0 != 0) goto L_0x0323
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x0323:
            r0.setVisibility(r1)
            X.060 r1 = r5.A08
            if (r1 != 0) goto L_0x0331
            java.lang.String r0 = "editAvatarFab"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0331:
            r0 = 1
            r1.A04(r0)
            com.whatsapp.bottomsheet.LockableBottomSheetBehavior r1 = r5.A0F
            if (r1 == 0) goto L_0x0342
            r1.A00 = r3
            r0 = 4
            r1.A0W(r0)
            com.whatsapp.avatar.home.AvatarHomeActivity.A0F(r5, r3)
        L_0x0342:
            com.whatsapp.WaImageView r0 = r5.A0B
            if (r0 != 0) goto L_0x034b
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x034b:
            r0.setImageBitmap(r4)
            goto L_0x0374
        L_0x034f:
            r0.setImageBitmap(r5)
            boolean r0 = r10.A00
            if (r0 == 0) goto L_0x0374
            android.view.View r1 = r4.A00
            r0 = 2131888703(0x7f120a3f, float:1.9412049E38)
            X.4t3 r0 = X.C99304t3.A00(r1, r0, r3)
            r0.A0P()
            X.00T r0 = r4.A0L
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.avatar.home.AvatarHomeViewModel r0 = (com.whatsapp.avatar.home.AvatarHomeViewModel) r0
            X.00s r1 = r0.A00
            X.294 r0 = new X.294
            r0.<init>(r3)
            r1.A0D(r0)
        L_0x0374:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4IP.invoke(java.lang.Object):java.lang.Object");
    }
}
