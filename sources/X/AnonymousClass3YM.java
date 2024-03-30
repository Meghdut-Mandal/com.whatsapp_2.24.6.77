package X;

import android.view.View;

/* renamed from: X.3YM  reason: invalid class name */
public class AnonymousClass3YM implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass3YM(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public static void A00(View view, Object obj, Object obj2, Object obj3, int i) {
        view.setOnClickListener(new AnonymousClass3YM(obj, obj2, obj3, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0400, code lost:
        r4.A1m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0403, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x05f1, code lost:
        r0.A0D(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x05f4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r34) {
        /*
            r33 = this;
            r5 = r33
            int r0 = r5.A03
            r9 = r34
            switch(r0) {
                case 0: goto L_0x016d;
                case 1: goto L_0x05b1;
                case 2: goto L_0x0560;
                case 3: goto L_0x0541;
                case 4: goto L_0x0140;
                case 5: goto L_0x051d;
                case 6: goto L_0x0501;
                case 7: goto L_0x001c;
                case 8: goto L_0x0404;
                case 9: goto L_0x03e9;
                case 10: goto L_0x03a5;
                case 11: goto L_0x0371;
                case 12: goto L_0x035b;
                case 13: goto L_0x0344;
                case 14: goto L_0x032d;
                case 15: goto L_0x0309;
                case 16: goto L_0x02f3;
                case 17: goto L_0x00fb;
                case 18: goto L_0x05c5;
                case 19: goto L_0x00c5;
                case 20: goto L_0x02db;
                case 21: goto L_0x02ac;
                case 22: goto L_0x0296;
                case 23: goto L_0x0285;
                case 24: goto L_0x026e;
                case 25: goto L_0x025a;
                case 26: goto L_0x0238;
                case 27: goto L_0x0225;
                case 28: goto L_0x0212;
                case 29: goto L_0x0009;
                case 30: goto L_0x0009;
                case 31: goto L_0x001d;
                case 32: goto L_0x01fd;
                case 33: goto L_0x01e5;
                case 34: goto L_0x01ca;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r3 = r5.A00
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r3 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r3
            java.lang.Object r2 = r5.A01
            X.3BI r2 = (X.AnonymousClass3BI) r2
            java.lang.Object r1 = r5.A02
            X.141 r1 = (X.AnonymousClass141) r1
            r0 = 2
            X.AnonymousClass00C.A0D(r1, r0)
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A08(r1, r2, r3)
        L_0x001c:
            return
        L_0x001d:
            java.lang.Object r3 = r5.A02
            com.whatsapp.thunderstorm.ThunderstormContactListItemElements r3 = (com.whatsapp.thunderstorm.ThunderstormContactListItemElements) r3
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r0 = 2131434701(0x7f0b1ccd, float:1.8491223E38)
            android.view.ViewStub r1 = X.C36431kI.A0M(r3, r0)
            r4 = 8
            if (r1 == 0) goto L_0x006c
            r0 = 2131434702(0x7f0b1cce, float:1.8491225E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 != 0) goto L_0x006c
            android.view.View r0 = r1.inflate()
            X.AnonymousClass00C.A08(r0)
            com.airbnb.lottie.LottieAnimationView r0 = (com.airbnb.lottie.LottieAnimationView) r0
            r3.A03 = r0
            java.lang.String r1 = "transferWaitingAnimation"
            if (r0 != 0) goto L_0x004b
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x004b:
            r0.setVisibility(r4)
            com.airbnb.lottie.LottieAnimationView r0 = r3.A03
            if (r0 != 0) goto L_0x0057
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x0057:
            r0.A02()
            com.airbnb.lottie.LottieAnimationView r2 = r3.A03
            if (r2 != 0) goto L_0x0063
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x0063:
            r1 = 7
            X.4Wj r0 = new X.4Wj
            r0.<init>(r3, r1)
            r2.A05(r0)
        L_0x006c:
            r0 = 2131434696(0x7f0b1cc8, float:1.8491213E38)
            android.view.ViewStub r1 = X.C36431kI.A0M(r3, r0)
            if (r1 == 0) goto L_0x00b2
            r0 = 2131434697(0x7f0b1cc9, float:1.8491215E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 != 0) goto L_0x00b2
            android.view.View r0 = r1.inflate()
            X.AnonymousClass00C.A08(r0)
            com.airbnb.lottie.LottieAnimationView r0 = (com.airbnb.lottie.LottieAnimationView) r0
            r3.A01 = r0
            java.lang.String r2 = "transferSendingProgressBarAnimation"
            if (r0 != 0) goto L_0x0092
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0092:
            r0.setVisibility(r4)
            com.airbnb.lottie.LottieAnimationView r0 = r3.A01
            if (r0 != 0) goto L_0x009e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x009e:
            r0.A02()
            com.airbnb.lottie.LottieAnimationView r1 = r3.A01
            if (r1 != 0) goto L_0x00aa
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x00aa:
            X.4Wj r0 = new X.4Wj
            r0.<init>(r3, r4)
            r1.A05(r0)
        L_0x00b2:
            com.airbnb.lottie.LottieAnimationView r2 = r3.A03
            if (r2 == 0) goto L_0x001c
            java.lang.String r1 = "transferWaitingAnimation"
            r0 = 0
            r2.setVisibility(r0)
            com.airbnb.lottie.LottieAnimationView r0 = r3.A03
            if (r0 != 0) goto L_0x05c1
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x00c5:
            java.lang.Object r8 = r5.A00
            X.7yq r8 = (X.C167797yq) r8
            java.lang.Object r7 = r5.A01
            X.9lY r7 = (X.C202319lY) r7
            java.lang.Object r6 = r5.A02
            X.B3q r6 = (X.C23083B3q) r6
            X.39O r5 = r8.A0e
            X.9uZ r4 = r8.A02
            if (r6 == 0) goto L_0x001c
            java.lang.String r0 = r7.A0J
            if (r0 == 0) goto L_0x001c
            r3 = -1
            int r2 = X.AnonymousClass6R8.A00(r0, r3)
            int r1 = r7.A02
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L_0x00ea
            r0 = 108(0x6c, float:1.51E-43)
            if (r1 != r0) goto L_0x001c
        L_0x00ea:
            int r0 = r6.BAM(r4, r5, r2)
            if (r0 == r3) goto L_0x001c
            X.9Og r4 = new X.9Og
            r4.<init>(r0)
            r4.A05 = r7
            X.1Rs r0 = r8.A08
            goto L_0x05f1
        L_0x00fb:
            java.lang.Object r6 = r5.A00
            X.7yq r6 = (X.C167797yq) r6
            java.lang.Object r3 = r5.A01
            X.9lY r3 = (X.C202319lY) r3
            java.lang.Object r2 = r5.A02
            X.8bI r2 = (X.C175928bI) r2
            X.1EU r1 = r6.A0Y
            java.lang.String r0 = r3.A0G
            X.9e3 r1 = r1.A03(r0)
            if (r1 == 0) goto L_0x013e
            java.lang.String r0 = r3.A0I
            X.B66 r0 = r1.A01(r0)
        L_0x0117:
            android.content.Context r5 = r9.getContext()
            java.lang.String r4 = r2.A0L
            int r3 = r6.A00
            java.lang.String r2 = "payment_transaction_details"
            if (r0 == 0) goto L_0x001c
            java.lang.Class r0 = r0.BFn()
            android.content.Intent r1 = X.C36441kJ.A0H(r5, r0)
            java.lang.String r0 = "extra_transaction_id"
            r1.putExtra(r0, r4)
            java.lang.String r0 = "referral_screen"
            r1.putExtra(r0, r2)
            java.lang.String r0 = "extra_payment_flow_entry_point"
            r1.putExtra(r0, r3)
            r5.startActivity(r1)
            return
        L_0x013e:
            r0 = 0
            goto L_0x0117
        L_0x0140:
            java.lang.Object r4 = r5.A00
            X.2Yr r4 = (X.C46592Yr) r4
            java.lang.Object r3 = r5.A01
            com.whatsapp.WaButtonWithLoader r3 = (com.whatsapp.WaButtonWithLoader) r3
            java.lang.Object r2 = r5.A02
            X.1wX r2 = (X.C41051wX) r2
            X.C36341k9.A1D(r4)
            int r1 = r4.A04()
            r0 = -1
            if (r1 == r0) goto L_0x001c
            r3.A02()
            int r1 = r4.A04()
            X.1RJ r0 = r4.A07
            android.view.View r0 = r0.A01()
            boolean r0 = r0.isSelected()
            r0 = r0 ^ 1
            r2.A0M(r1, r0)
            return
        L_0x016d:
            java.lang.Object r7 = r5.A00
            X.1vq r7 = (X.C40621vq) r7
            java.lang.Object r6 = r5.A01
            android.view.View r6 = (android.view.View) r6
            java.lang.Object r8 = r5.A02
            X.0D3 r8 = (X.AnonymousClass0D3) r8
            r5 = 1
            X.3nZ r9 = r7.A01
            java.lang.Object r1 = r6.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.AnonymousClass00C.A0E(r1, r0)
            int r4 = X.AnonymousClass000.A0I(r1)
            X.3A1 r1 = r9.A03
            int r0 = r1.A01
            if (r0 == r4) goto L_0x01b5
            r1.A01 = r4
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r3 = r9.A01
            X.3PW r0 = r1.A05
            int r2 = r0.A03
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r3.A03
            java.lang.String r1 = "doodleEditText"
            if (r0 != 0) goto L_0x01a2
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x01a2:
            r0.setFontStyle(r4)
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r3.A03
            if (r0 != 0) goto L_0x01ae
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x01ae:
            r0.A0F(r2)
            X.6wC r0 = r9.A02
            r0.A02 = r4
        L_0x01b5:
            int r1 = r7.A00
            int r0 = r8.A04()
            if (r1 == r0) goto L_0x001c
            r7.A07(r1)
            int r0 = r8.A04()
            r7.A00 = r0
            r6.setSelected(r5)
            return
        L_0x01ca:
            java.lang.Object r2 = r5.A00
            X.1w6 r2 = (X.C40781w6) r2
            java.lang.Object r1 = r5.A01
            X.35z r1 = (X.C599735z) r1
            java.lang.Object r0 = r5.A02
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r3 = r2.A01
            X.3QX r2 = r3.A04
            X.13w r4 = r1.A00
            X.38s r0 = (X.AnonymousClass38s) r0
            java.lang.String r5 = r0.A03
            java.lang.String r6 = r1.A01
            r7 = 0
            r2.A01(r3, r4, r5, r6, r7)
            return
        L_0x01e5:
            java.lang.Object r1 = r5.A00
            X.1w6 r1 = (X.C40781w6) r1
            java.lang.Object r3 = r5.A01
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            java.lang.Object r0 = r5.A02
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r2 = r1.A01
            X.3QX r1 = r2.A04
            X.38s r0 = (X.AnonymousClass38s) r0
            java.lang.String r4 = r0.A03
            r5 = 0
            r6 = r5
            r1.A01(r2, r3, r4, r5, r6)
            return
        L_0x01fd:
            java.lang.Object r0 = r5.A00
            X.1w6 r0 = (X.C40781w6) r0
            java.lang.Object r4 = r5.A02
            X.141 r4 = (X.AnonymousClass141) r4
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r3 = r0.A01
            X.1ND r2 = r3.A02
            r1 = 15
            X.1NE r2 = (X.AnonymousClass1NE) r2
            r0 = 0
            r2.Bua(r3, r4, r1, r0)
            return
        L_0x0212:
            java.lang.Object r2 = r5.A00
            X.2eu r2 = (X.C47522eu) r2
            java.lang.Object r1 = r5.A01
            com.whatsapp.InteractiveAnnotation r1 = (com.whatsapp.InteractiveAnnotation) r1
            java.lang.Object r0 = r5.A02
            android.content.Context r0 = (android.content.Context) r0
            X.AnonymousClass00C.A0B(r0)
            X.C47522eu.A01(r0, r1, r2)
            return
        L_0x0225:
            java.lang.Object r2 = r5.A00
            X.2et r2 = (X.C47512et) r2
            java.lang.Object r1 = r5.A01
            com.whatsapp.InteractiveAnnotation r1 = (com.whatsapp.InteractiveAnnotation) r1
            java.lang.Object r0 = r5.A02
            android.content.Context r0 = (android.content.Context) r0
            X.AnonymousClass00C.A0B(r0)
            X.C47512et.A00(r0, r1, r2)
            return
        L_0x0238:
            java.lang.Object r6 = r5.A00
            com.whatsapp.status.playback.MessageReplyActivity r6 = (com.whatsapp.status.playback.MessageReplyActivity) r6
            java.lang.Object r4 = r5.A01
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r3 = r5.A02
            android.widget.GridLayout r1 = r6.A05
            r2 = 1
            r0 = 2
            r4.performHapticFeedback(r2, r0)
            r0 = 0
            android.animation.AnimatorSet r1 = com.whatsapp.status.playback.MessageReplyActivity.A0J(r4, r0, r1)
            X.4Wk r0 = new X.4Wk
            r0.<init>(r1, r6, r3, r2)
            r1.addListener(r0)
            r1.start()
            return
        L_0x025a:
            java.lang.Object r2 = r5.A01
            X.6bf r2 = (X.C134826bf) r2
            java.lang.Object r1 = r5.A02
            X.02t r1 = (X.C006302t) r1
            X.C36321k7.A0x(r2, r1)
            X.6bB r0 = r2.A05
            r0.A00()
            r1.invoke(r2)
            return
        L_0x026e:
            java.lang.Object r3 = r5.A00
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            java.lang.Object r2 = r5.A01
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r5.A02
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 0
            r2.setEnabled(r0)
            r1.run()
            r3.A1b()
            return
        L_0x0285:
            java.lang.Object r2 = r5.A00
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r1 = r5.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 130(0x82, float:1.82E-43)
            X.AnonymousClass3SJ.A00(r2, r0)
            r1.run()
            return
        L_0x0296:
            java.lang.Object r2 = r5.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r5.A01
            X.2JI r0 = (X.AnonymousClass2JI) r0
            java.lang.Object r1 = r5.A02
            X.3X9 r1 = (X.AnonymousClass3X9) r1
            X.1Uw r0 = r0.A02
            android.content.Intent r0 = X.AnonymousClass190.A0l(r2, r0, r1)
            r2.startActivity(r0)
            return
        L_0x02ac:
            java.lang.Object r1 = r5.A00
            X.1wD r1 = (X.C40851wD) r1
            java.lang.Object r6 = r5.A01
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r0 = r5.A02
            X.2u2 r0 = (X.C55082u2) r0
            X.1Dv r5 = r1.A01
            X.1Uw r4 = r1.A03
            X.2ah r0 = (X.AnonymousClass2ah) r0
            java.lang.String r3 = r0.A00
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoActivity"
            X.C36331k8.A0v(r2, r4, r1, r0)
            java.lang.String r0 = "country_code"
            r2.putExtra(r0, r3)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            r2.setFlags(r0)
            r5.A06(r6, r2)
            return
        L_0x02db:
            java.lang.Object r0 = r5.A00
            X.1wD r0 = (X.C40851wD) r0
            java.lang.Object r3 = r5.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r5.A02
            X.3X9 r2 = (X.AnonymousClass3X9) r2
            X.1Dv r1 = r0.A01
            X.1Uw r0 = r0.A03
            android.content.Intent r0 = X.AnonymousClass190.A0l(r3, r0, r2)
            r1.A06(r3, r0)
            return
        L_0x02f3:
            java.lang.Object r4 = r5.A00
            com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2 r4 = (com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2) r4
            java.lang.Object r3 = r5.A01
            X.9SC r3 = (X.AnonymousClass9SC) r3
            java.lang.Object r2 = r5.A02
            X.9Oo r2 = (X.C194219Oo) r2
            android.content.Context r1 = r9.getContext()
            java.lang.String r0 = "order_details"
            r4.A01(r1, r3, r2, r0)
            return
        L_0x0309:
            java.lang.Object r4 = r5.A00
            X.7vX r4 = (X.C166317vX) r4
            java.lang.Object r0 = r5.A01
            X.141 r0 = (X.AnonymousClass141) r0
            java.lang.Object r3 = r5.A02
            X.9Mi r3 = (X.C193659Mi) r3
            r2 = 0
            X.11F r0 = X.C36351kA.A0j(r0)
            X.3Pd r1 = new X.3Pd
            r1.<init>((android.view.View) r9, (X.AnonymousClass11F) r0, (java.lang.Integer) r2)
            android.widget.ImageView r0 = r3.A01
            java.lang.String r0 = X.C011004s.A03(r0)
            r1.A04 = r0
            com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity r0 = r4.A02
            r1.A02(r0)
            return
        L_0x032d:
            java.lang.Object r3 = r5.A00
            com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity r3 = (com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity) r3
            java.lang.Object r2 = r5.A01
            com.whatsapp.payments.ui.widget.PaymentMethodRow r2 = (com.whatsapp.payments.ui.widget.PaymentMethodRow) r2
            java.lang.Object r1 = r5.A02
            com.whatsapp.payments.ui.widget.PaymentMethodRow r1 = (com.whatsapp.payments.ui.widget.PaymentMethodRow) r1
            r0 = 0
            r2.setRadioButtonChecked(r0)
            r0 = 1
            r1.setRadioButtonChecked(r0)
            r3.A00 = r0
            return
        L_0x0344:
            java.lang.Object r3 = r5.A00
            com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity r3 = (com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity) r3
            java.lang.Object r0 = r5.A01
            com.whatsapp.payments.ui.widget.PaymentMethodRow r0 = (com.whatsapp.payments.ui.widget.PaymentMethodRow) r0
            java.lang.Object r2 = r5.A02
            com.whatsapp.payments.ui.widget.PaymentMethodRow r2 = (com.whatsapp.payments.ui.widget.PaymentMethodRow) r2
            r1 = 0
            r0.setRadioButtonChecked(r1)
            r0 = 1
            r2.setRadioButtonChecked(r0)
            r3.A00 = r1
            return
        L_0x035b:
            java.lang.Object r0 = r5.A00
            X.AGR r0 = (X.AGR) r0
            java.lang.Object r3 = r5.A01
            X.6Ps r3 = (X.C131606Ps) r3
            java.lang.Object r4 = r5.A02
            com.whatsapp.payments.ui.PaymentBottomSheet r4 = (com.whatsapp.payments.ui.PaymentBottomSheet) r4
            X.8hw r2 = r0.A06
            r1 = 1
            java.lang.String r0 = "payment_confirm_prompt"
            r2.A4a(r3, r0, r1)
            goto L_0x0400
        L_0x0371:
            java.lang.Object r1 = r5.A00
            com.whatsapp.payments.ui.IndiaUpiAccountTypeSelectionFragment r1 = (com.whatsapp.payments.ui.IndiaUpiAccountTypeSelectionFragment) r1
            java.lang.Object r8 = r5.A01
            android.widget.CompoundButton r8 = (android.widget.CompoundButton) r8
            java.lang.Object r7 = r5.A02
            android.widget.CompoundButton r7 = (android.widget.CompoundButton) r7
            r6 = 0
            r0 = 0
            r1.A01 = r0
            X.AF7 r5 = r1.A00
            if (r5 == 0) goto L_0x039e
            r4 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0 = 169(0xa9, float:2.37E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r1.A02
            java.lang.String r0 = "available_payment_methods_prompt"
            r5.BOm(r3, r2, r0, r1)
            r8.setChecked(r4)
            r7.setChecked(r6)
            return
        L_0x039e:
            java.lang.String r0 = "indiaUpiFieldStatsLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03a5:
            java.lang.Object r6 = r5.A00
            com.whatsapp.payments.ui.IndiaUpiAccountTypeSelectionFragment r6 = (com.whatsapp.payments.ui.IndiaUpiAccountTypeSelectionFragment) r6
            java.lang.Object r3 = r5.A01
            android.widget.CompoundButton r3 = (android.widget.CompoundButton) r3
            java.lang.Object r4 = r5.A02
            android.widget.CompoundButton r4 = (android.widget.CompoundButton) r4
            r2 = 0
            java.lang.String r0 = "CREDIT"
            r6.A01 = r0
            X.6Ps[] r0 = new X.C131606Ps[r2]
            X.6Ps r8 = new X.6Ps
            r8.<init>(r0)
            java.lang.String r1 = "chosen_method"
            java.lang.String r0 = "credit_card"
            r8.A03(r1, r0)
            X.AF7 r7 = r6.A00
            if (r7 == 0) goto L_0x03e2
            r1 = 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            r0 = 169(0xa9, float:2.37E-43)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.String r13 = r6.A02
            r11 = 0
            java.lang.String r12 = "available_payment_methods_prompt"
            r7.A08(r8, r9, r10, r11, r12, r13)
            r3.setChecked(r2)
            r4.setChecked(r1)
            return
        L_0x03e2:
            java.lang.String r0 = "indiaUpiFieldStatsLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03e9:
            java.lang.Object r0 = r5.A00
            X.AGS r0 = (X.AGS) r0
            java.lang.Object r3 = r5.A01
            X.6Ps r3 = (X.C131606Ps) r3
            java.lang.Object r4 = r5.A02
            com.whatsapp.payments.ui.PaymentBottomSheet r4 = (com.whatsapp.payments.ui.PaymentBottomSheet) r4
            X.4RN r2 = r0.A00
            java.lang.Integer r1 = X.C36361kB.A0i()
            java.lang.String r0 = "payment_confirm_prompt"
            r2.BOo(r3, r1, r1, r0)
        L_0x0400:
            r4.A1m()
            return
        L_0x0404:
            java.lang.Object r7 = r5.A00
            com.whatsapp.WaButtonWithLoader r7 = (com.whatsapp.WaButtonWithLoader) r7
            java.lang.Object r6 = r5.A01
            com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet r6 = (com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet) r6
            java.lang.Object r8 = r5.A02
            android.widget.RadioGroup r8 = (android.widget.RadioGroup) r8
            java.util.ArrayList r0 = com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet.A05
            r5 = 1
            r7.A02()
            java.lang.Integer r4 = X.C36371kC.A0p()
            java.lang.String r3 = r6.A04
            X.B3f r2 = r6.A00
            if (r2 != 0) goto L_0x0427
            java.lang.String r0 = "paymentFieldStatsLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0427:
            java.lang.String r1 = "income_collection_prompt"
            X.C18740tg.A06(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.BOm(r0, r4, r1, r3)
            com.whatsapp.payments.ui.viewmodel.BrazilIncomeCollectionViewModel r13 = r6.A02
            if (r13 != 0) goto L_0x043e
            java.lang.String r0 = "brazilIncomeCollectionViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x043e:
            android.content.Context r9 = X.C36371kC.A0B(r9)
            java.util.ArrayList r1 = com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet.A05
            int r0 = r8.getCheckedRadioButtonId()
            java.lang.Object r1 = r1.get(r0)
            X.AnonymousClass00C.A08(r1)
            X.35D r1 = (X.AnonymousClass35D) r1
            r0 = 0
            X.4X3 r12 = new X.4X3
            r12.<init>(r7, r6, r0)
            r32 = 1
            X.AnonymousClass00C.A0D(r1, r5)
            long r5 = r1.A01
            long r0 = r1.A00
            X.19A r14 = r13.A02
            java.lang.String r7 = r14.A09()
            java.lang.Long r18 = java.lang.Long.valueOf(r5)
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x04fd
            java.lang.Long r27 = java.lang.Long.valueOf(r0)
        L_0x0477:
            X.6QB r4 = X.C36421kH.A0T()
            X.C36341k9.A1C(r4)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:pay"
            X.C36331k8.A1D(r4, r1, r0)
            java.lang.String r1 = "type"
            java.lang.String r0 = "set"
            X.C36331k8.A1D(r4, r1, r0)
            r19 = 0
            r24 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            r22 = 0
            r26 = 0
            r21 = r7
            boolean r0 = X.C203539oF.A0P(r21, r22, r24, r26)
            if (r0 == 0) goto L_0x04a4
            java.lang.String r0 = "id"
            X.C36331k8.A1D(r4, r0, r7)
        L_0x04a4:
            java.lang.String r0 = "account"
            X.6QB r3 = X.C36441kJ.A0q(r0)
            java.lang.String r1 = "action"
            java.lang.String r0 = "br-save-income-information"
            X.C36331k8.A1D(r3, r1, r0)
            java.lang.String r0 = "self_reported_income_range"
            X.6QB r2 = X.C36441kJ.A0q(r0)
            r21 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            r23 = 0
            boolean r0 = X.C203539oF.A0L(r18, r19, r21, r23)
            if (r0 == 0) goto L_0x04c9
            java.lang.String r0 = "min"
            X.C36411kG.A1K(r2, r0, r5)
        L_0x04c9:
            if (r27 == 0) goto L_0x04e1
            r28 = 0
            r30 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            boolean r0 = X.C203539oF.A0L(r27, r28, r30, r32)
            if (r0 == 0) goto L_0x04e1
            long r0 = r27.longValue()
            java.lang.String r5 = "max"
            X.C36411kG.A1K(r2, r5, r0)
        L_0x04e1:
            X.C36361kB.A1H(r2, r3)
            X.C36361kB.A1H(r3, r4)
            X.9nx r16 = r4.A03()
            X.17Y r10 = r13.A00
            X.1Vu r11 = r13.A03
            X.2ZS r8 = new X.2ZS
            r8.<init>(r9, r10, r11, r12, r13)
            r18 = 204(0xcc, float:2.86E-43)
            r15 = r8
            r17 = r7
            r14.A0E(r15, r16, r17, r18, r19)
            return
        L_0x04fd:
            r27 = 0
            goto L_0x0477
        L_0x0501:
            java.lang.Object r0 = r5.A00
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r3 = r5.A01
            X.B66 r3 = (X.B66) r3
            java.lang.Object r2 = r5.A02
            X.9lY r2 = (X.C202319lY) r2
            android.content.Context r1 = r0.getContext()
            java.lang.Class<X.14u> r0 = X.C225314u.class
            android.app.Activity r0 = X.C24801Dv.A01(r1, r0)
            X.14r r0 = (X.C225014r) r0
            r3.BQa(r1, r0, r2)
            return
        L_0x051d:
            java.lang.Object r2 = r5.A00
            X.8fj r2 = (X.C178308fj) r2
            java.lang.Object r1 = r5.A01
            X.0D3 r1 = (X.AnonymousClass0D3) r1
            java.lang.Object r5 = r5.A02
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r4 = 1
            X.1Dv r3 = r2.A01
            android.view.View r0 = r1.A0H
            android.content.Context r2 = r0.getContext()
            r1 = 0
            android.content.Context r0 = r0.getContext()
            android.content.Intent r0 = X.AnonymousClass190.A0w(r0, r5, r1, r4, r4)
            r3.A06(r2, r0)
            return
        L_0x0541:
            java.lang.Object r2 = r5.A00
            X.1wO r2 = (X.C40961wO) r2
            java.lang.Object r1 = r5.A01
            X.141 r1 = (X.AnonymousClass141) r1
            java.lang.Object r3 = r5.A02
            X.34G r3 = (X.AnonymousClass34G) r3
            java.util.List r0 = X.AnonymousClass0D3.A0I
            com.whatsapp.newsletter.NewsletterInfoActivity r2 = r2.A07
            X.11F r1 = r1.A0H
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.AnonymousClass00C.A0E(r1, r0)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.String r0 = r3.A01
            r2.A3z(r1, r0)
            return
        L_0x0560:
            java.lang.Object r3 = r5.A00
            com.whatsapp.mediaview.MediaViewFragment r3 = (com.whatsapp.mediaview.MediaViewFragment) r3
            java.lang.Object r9 = r5.A01
            X.3T1 r9 = (X.AnonymousClass3T1) r9
            java.lang.Object r5 = r5.A02
            android.view.View r5 = (android.view.View) r5
            com.whatsapp.reactions.ReactionsTrayViewModel r0 = r3.A1Y
            if (r0 != 0) goto L_0x0594
            X.04H r1 = X.C36441kJ.A0b(r3)
            java.lang.Class<com.whatsapp.reactions.ReactionsTrayViewModel> r0 = com.whatsapp.reactions.ReactionsTrayViewModel.class
            X.04R r4 = r1.A00(r0)
            com.whatsapp.reactions.ReactionsTrayViewModel r4 = (com.whatsapp.reactions.ReactionsTrayViewModel) r4
            r3.A1Y = r4
            X.1hi r2 = r4.A0D
            X.01I r1 = r3.A0h()
            r0 = 25
            X.AnonymousClass3UW.A00(r1, r2, r4, r3, r0)
            X.1hi r2 = r4.A0B
            X.01I r1 = r3.A0h()
            r0 = 39
            X.C66023Uj.A01(r1, r2, r3, r0)
        L_0x0594:
            com.whatsapp.reactions.ReactionsTrayViewModel r0 = r3.A1Y
            r0.A0U(r9)
            X.0ts r8 = r3.A0j
            X.0yb r7 = r3.A0d
            X.14u r6 = X.C36431kI.A0U(r3)
            r11 = 0
            com.whatsapp.reactions.ReactionsTrayViewModel r10 = r3.A1Y
            X.1qL r4 = new X.1qL
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r3.A0a = r4
            com.whatsapp.reactions.ReactionsTrayViewModel r0 = r3.A1Y
            r0.A0T(r11)
            return
        L_0x05b1:
            java.lang.Object r2 = r5.A00
            com.whatsapp.mediaview.MediaViewFragment r2 = (com.whatsapp.mediaview.MediaViewFragment) r2
            java.lang.Object r1 = r5.A01
            com.whatsapp.InteractiveAnnotation r1 = (com.whatsapp.InteractiveAnnotation) r1
            java.lang.Object r0 = r5.A02
            android.content.Context r0 = (android.content.Context) r0
            com.whatsapp.mediaview.MediaViewFragment.A09(r0, r1, r2)
            return
        L_0x05c1:
            r0.A04()
            return
        L_0x05c5:
            java.lang.Object r3 = r5.A00
            X.7yq r3 = (X.C167797yq) r3
            java.lang.Object r2 = r5.A01
            X.8av r2 = (X.C175708av) r2
            java.lang.Object r1 = r5.A02
            X.9lY r1 = (X.C202319lY) r1
            r0 = 21
            X.9Og r4 = new X.9Og
            r4.<init>(r0)
            X.9uo r0 = r2.A02
            X.C18740tg.A06(r0)
            java.lang.String r0 = r0.A01
            r4.A0D = r0
            r4.A05 = r1
            X.9Ml r0 = r3.A06
            X.2bZ r0 = r0.A03
            if (r0 == 0) goto L_0x05eb
            r4.A08 = r0
        L_0x05eb:
            int r0 = r3.A00
            r4.A01 = r0
            X.1Rs r0 = r3.A08
        L_0x05f1:
            r0.A0D(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YM.onClick(android.view.View):void");
    }
}
