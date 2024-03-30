package X;

import android.animation.Animator;

/* renamed from: X.4Wj  reason: invalid class name and case insensitive filesystem */
public class C89394Wj implements Animator.AnimatorListener {
    public Object A00;
    public final int A01;

    public C89394Wj(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        r1 = r2.getLayoutParams();
        r1.height = -2;
        r2.setLayoutParams(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c3, code lost:
        r0.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ca, code lost:
        if (r3.A02 != null) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cc, code lost:
        r1 = X.C36431kI.A0M(r3, com.whatsapp.R.id.thunderstorm_transfer_success_stub);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d3, code lost:
        if (r1 == null) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00dc, code lost:
        if (r1.findViewById(com.whatsapp.R.id.thunderstorm_transfer_success_view) != null) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00de, code lost:
        r0 = r1.inflate();
        X.AnonymousClass00C.A08(r0);
        r0 = (com.airbnb.lottie.LottieAnimationView) r0;
        r3.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00eb, code lost:
        if (r0 != null) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f1, code lost:
        throw X.C36331k8.A0d("transferSuccessAnimation");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f2, code lost:
        r0.setVisibility(8);
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f7, code lost:
        if (r0 != null) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        throw X.C36331k8.A0d("transferSuccessAnimation");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fe, code lost:
        r0.A02();
        r2 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0103, code lost:
        if (r2 != null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0109, code lost:
        throw X.C36331k8.A0d("transferSuccessAnimation");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010a, code lost:
        r2.A05(new X.C89394Wj(r3, 9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0114, code lost:
        r2 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0118, code lost:
        if (r2 != null) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011e, code lost:
        throw X.C36331k8.A0d("transferSuccessAnimation");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011f, code lost:
        r2.setVisibility(0);
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0125, code lost:
        if (r0 != null) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012b, code lost:
        throw X.C36331k8.A0d("transferSuccessAnimation");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012c, code lost:
        r0.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x012f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x001f;
                case 1: goto L_0x0046;
                case 2: goto L_0x00b3;
                case 3: goto L_0x0051;
                case 4: goto L_0x0058;
                case 5: goto L_0x0069;
                case 6: goto L_0x007a;
                case 7: goto L_0x0089;
                case 8: goto L_0x00b4;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r5.A00
            com.whatsapp.thunderstorm.ThunderstormContactListItemElements r3 = (com.whatsapp.thunderstorm.ThunderstormContactListItemElements) r3
            com.whatsapp.WaTextView r2 = r3.A04
            r0 = 0
            r2.setText(r0)
            r1 = 8
            r2.setVisibility(r1)
            com.airbnb.lottie.LottieAnimationView r0 = r3.A02
            if (r0 != 0) goto L_0x00b0
            java.lang.String r0 = "transferSuccessAnimation"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x001f:
            java.lang.Object r4 = r5.A00
            X.3AC r4 = (X.AnonymousClass3AC) r4
            android.view.View r3 = r4.A02
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            r1 = 0
            if (r0 == 0) goto L_0x0044
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r0 = X.AnonymousClass0YO.A01(r2)
        L_0x0034:
            X.AnonymousClass1JZ.A03(r3, r0, r1)
            android.animation.Animator r1 = r4.A01
            r4.A00 = r1
            r0 = 0
            r4.A01 = r0
            if (r1 == 0) goto L_0x00b3
            r1.start()
            return
        L_0x0044:
            r0 = 0
            goto L_0x0034
        L_0x0046:
            java.lang.Object r0 = r5.A00
            X.3AC r0 = (X.AnonymousClass3AC) r0
            android.widget.FrameLayout r1 = r0.A03
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x0051:
            java.lang.Object r0 = r5.A00
            X.37v r0 = (X.C604337v) r0
            X.2I0 r2 = r0.A01
            goto L_0x005e
        L_0x0058:
            java.lang.Object r0 = r5.A00
            X.37w r0 = (X.C604437w) r0
            X.2IN r2 = r0.A03
        L_0x005e:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r0 = -2
            r1.height = r0
            r2.setLayoutParams(r1)
            return
        L_0x0069:
            java.lang.Object r0 = r5.A00
            X.2M8 r0 = (X.AnonymousClass2M8) r0
            X.AnonymousClass2M8.A04(r0)
            android.widget.ImageButton r1 = r0.A0K
            if (r1 == 0) goto L_0x00b3
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            return
        L_0x007a:
            java.lang.Object r3 = r5.A00
            com.whatsapp.thunderstorm.ThunderstormContactListItemElements r3 = (com.whatsapp.thunderstorm.ThunderstormContactListItemElements) r3
            com.airbnb.lottie.LottieAnimationView r0 = r3.A00
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = "transferReceivingProgressBarAnimation"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0089:
            java.lang.Object r3 = r5.A00
            com.whatsapp.thunderstorm.ThunderstormContactListItemElements r3 = (com.whatsapp.thunderstorm.ThunderstormContactListItemElements) r3
            com.airbnb.lottie.LottieAnimationView r1 = r3.A03
            if (r1 != 0) goto L_0x0098
            java.lang.String r0 = "transferWaitingAnimation"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0098:
            r0 = 8
            r1.setVisibility(r0)
            com.airbnb.lottie.LottieAnimationView r2 = r3.A01
            if (r2 == 0) goto L_0x00b3
            java.lang.String r1 = "transferSendingProgressBarAnimation"
            r0 = 0
            r2.setVisibility(r0)
            com.airbnb.lottie.LottieAnimationView r0 = r3.A01
            if (r0 != 0) goto L_0x012c
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x00b0:
            r0.setVisibility(r1)
        L_0x00b3:
            return
        L_0x00b4:
            java.lang.Object r3 = r5.A00
            com.whatsapp.thunderstorm.ThunderstormContactListItemElements r3 = (com.whatsapp.thunderstorm.ThunderstormContactListItemElements) r3
            com.airbnb.lottie.LottieAnimationView r0 = r3.A01
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = "transferSendingProgressBarAnimation"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00c3:
            r2 = 8
            r0.setVisibility(r2)
            com.airbnb.lottie.LottieAnimationView r0 = r3.A02
            if (r0 != 0) goto L_0x0114
            r0 = 2131434698(0x7f0b1cca, float:1.8491217E38)
            android.view.ViewStub r1 = X.C36431kI.A0M(r3, r0)
            if (r1 == 0) goto L_0x0114
            r0 = 2131434699(0x7f0b1ccb, float:1.849122E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 != 0) goto L_0x0114
            android.view.View r0 = r1.inflate()
            X.AnonymousClass00C.A08(r0)
            com.airbnb.lottie.LottieAnimationView r0 = (com.airbnb.lottie.LottieAnimationView) r0
            r3.A02 = r0
            java.lang.String r1 = "transferSuccessAnimation"
            if (r0 != 0) goto L_0x00f2
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x00f2:
            r0.setVisibility(r2)
            com.airbnb.lottie.LottieAnimationView r0 = r3.A02
            if (r0 != 0) goto L_0x00fe
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x00fe:
            r0.A02()
            com.airbnb.lottie.LottieAnimationView r2 = r3.A02
            if (r2 != 0) goto L_0x010a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x010a:
            r1 = 9
            X.4Wj r0 = new X.4Wj
            r0.<init>(r3, r1)
            r2.A05(r0)
        L_0x0114:
            com.airbnb.lottie.LottieAnimationView r2 = r3.A02
            java.lang.String r1 = "transferSuccessAnimation"
            if (r2 != 0) goto L_0x011f
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x011f:
            r0 = 0
            r2.setVisibility(r0)
            com.airbnb.lottie.LottieAnimationView r0 = r3.A02
            if (r0 != 0) goto L_0x012c
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x012c:
            r0.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89394Wj.onAnimationEnd(android.animation.Animator):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r0.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        r5.setTransferSendingProgress(r5.getTransferSendingProgress() + 0.1d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationRepeat(android.animation.Animator r7) {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 6: goto L_0x0006;
                case 7: goto L_0x0005;
                case 8: goto L_0x001f;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r5 = r6.A00
            com.whatsapp.thunderstorm.ThunderstormContactListItemElements r5 = (com.whatsapp.thunderstorm.ThunderstormContactListItemElements) r5
            double r3 = r5.getTransferSendingProgress()
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x003c
            com.airbnb.lottie.LottieAnimationView r0 = r5.A00
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "transferReceivingProgressBarAnimation"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x001f:
            java.lang.Object r5 = r6.A00
            com.whatsapp.thunderstorm.ThunderstormContactListItemElements r5 = (com.whatsapp.thunderstorm.ThunderstormContactListItemElements) r5
            double r3 = r5.getTransferSendingProgress()
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x003c
            com.airbnb.lottie.LottieAnimationView r0 = r5.A01
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "transferSendingProgressBarAnimation"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0038:
            r0.clearAnimation()
            return
        L_0x003c:
            double r2 = r5.getTransferSendingProgress()
            r0 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            double r2 = r2 + r0
            r5.setTransferSendingProgress(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89394Wj.onAnimationRepeat(android.animation.Animator):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        r1.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0092, code lost:
        r0.setVisibility(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0095, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationStart(android.animation.Animator r5) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 1: goto L_0x0006;
                case 2: goto L_0x0006;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x000f;
                case 7: goto L_0x0032;
                case 8: goto L_0x004b;
                case 9: goto L_0x006f;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r0 = r4.A00
            X.3AC r0 = (X.AnonymousClass3AC) r0
            android.widget.FrameLayout r1 = r0.A03
            r0 = 8
            goto L_0x006b
        L_0x000f:
            java.lang.Object r3 = r4.A00
            com.whatsapp.thunderstorm.ThunderstormContactListItemElements r3 = (com.whatsapp.thunderstorm.ThunderstormContactListItemElements) r3
            com.whatsapp.WaTextView r2 = r3.A04
            android.content.Context r1 = r3.getContext()
            r0 = 2131897067(0x7f122aeb, float:1.9429013E38)
            java.lang.String r0 = X.AnonymousClass00F.A06(r1, r0)
            r2.setText(r0)
            r1 = 0
            r2.setVisibility(r1)
            com.airbnb.lottie.LottieAnimationView r0 = r3.A00
            if (r0 != 0) goto L_0x0092
            java.lang.String r0 = "transferReceivingProgressBarAnimation"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0032:
            java.lang.Object r0 = r4.A00
            com.whatsapp.thunderstorm.ThunderstormContactListItemElements r0 = (com.whatsapp.thunderstorm.ThunderstormContactListItemElements) r0
            com.whatsapp.WaTextView r2 = r0.A04
            android.content.Context r1 = r0.getContext()
            r0 = 2131897069(0x7f122aed, float:1.9429017E38)
            java.lang.String r0 = X.AnonymousClass00F.A06(r1, r0)
            r2.setText(r0)
            r0 = 0
            r2.setVisibility(r0)
            return
        L_0x004b:
            java.lang.Object r3 = r4.A00
            com.whatsapp.thunderstorm.ThunderstormContactListItemElements r3 = (com.whatsapp.thunderstorm.ThunderstormContactListItemElements) r3
            com.whatsapp.WaTextView r2 = r3.A04
            android.content.Context r1 = r3.getContext()
            r0 = 2131897068(0x7f122aec, float:1.9429015E38)
            java.lang.String r0 = X.AnonymousClass00F.A06(r1, r0)
            r2.setText(r0)
            com.airbnb.lottie.LottieAnimationView r1 = r3.A01
            if (r1 != 0) goto L_0x006a
            java.lang.String r0 = "transferSendingProgressBarAnimation"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x006a:
            r0 = 0
        L_0x006b:
            r1.setVisibility(r0)
            return
        L_0x006f:
            java.lang.Object r3 = r4.A00
            com.whatsapp.thunderstorm.ThunderstormContactListItemElements r3 = (com.whatsapp.thunderstorm.ThunderstormContactListItemElements) r3
            com.whatsapp.WaTextView r2 = r3.A04
            android.content.Context r1 = r3.getContext()
            r0 = 2131897064(0x7f122ae8, float:1.9429007E38)
            java.lang.String r0 = X.AnonymousClass00F.A06(r1, r0)
            r2.setText(r0)
            r1 = 0
            r2.setVisibility(r1)
            com.airbnb.lottie.LottieAnimationView r0 = r3.A02
            if (r0 != 0) goto L_0x0092
            java.lang.String r0 = "transferSuccessAnimation"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0092:
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89394Wj.onAnimationStart(android.animation.Animator):void");
    }

    public void onAnimationCancel(Animator animator) {
    }
}
