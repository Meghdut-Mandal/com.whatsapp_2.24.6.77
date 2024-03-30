package X;

import android.view.animation.Animation;

/* renamed from: X.4Vt  reason: invalid class name and case insensitive filesystem */
public class C89234Vt extends C67243Zb {
    public Object A00;
    public final int A01;

    public C89234Vt(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(Animation animation, Object obj, int i) {
        animation.setAnimationListener(new C89234Vt(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0119, code lost:
        r1.A0E = false;
        r1.setEnabled(true);
        X.C36321k7.A0N(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0123, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0141, code lost:
        r0.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0144, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.view.animation.Animation r8) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0009;
                case 1: goto L_0x000e;
                case 2: goto L_0x006a;
                case 3: goto L_0x00af;
                case 4: goto L_0x00d1;
                case 5: goto L_0x0009;
                case 6: goto L_0x0005;
                case 7: goto L_0x0005;
                case 8: goto L_0x001c;
                case 9: goto L_0x00ee;
                case 10: goto L_0x0101;
                case 11: goto L_0x010e;
                case 12: goto L_0x0124;
                case 13: goto L_0x0015;
                case 14: goto L_0x004e;
                case 15: goto L_0x0124;
                case 16: goto L_0x0130;
                case 17: goto L_0x005a;
                case 18: goto L_0x0138;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onAnimationEnd(r8)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r1 = r7.A00
            android.view.View r1 = (android.view.View) r1
            goto L_0x0064
        L_0x000e:
            java.lang.Object r0 = r7.A00
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            android.view.View r1 = r0.A09
            goto L_0x0064
        L_0x0015:
            java.lang.Object r0 = r7.A00
            com.whatsapp.identity.IdentityVerificationActivity r0 = (com.whatsapp.identity.IdentityVerificationActivity) r0
            android.view.View r1 = r0.A01
            goto L_0x0064
        L_0x001c:
            java.lang.String r0 = "conversation/showinputextension/end"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r3 = r7.A00
            X.3ZP r3 = (X.AnonymousClass3ZP) r3
            X.3fk r2 = r3.A04
            com.whatsapp.KeyboardPopupLayout r1 = r2.A1V
            r0 = 1
            r1.setClipChildren(r0)
            r0 = 0
            r2.A06 = r0
            com.whatsapp.conversation.ConversationListView r1 = r2.A2U
            int r0 = r3.A02
            r1.setTranscriptMode(r0)
            android.view.ViewGroup r1 = r3.A03
            android.view.ViewGroup r0 = r2.A0X
            if (r1 != r0) goto L_0x0008
            X.3AE r0 = r2.A2d
            if (r0 == 0) goto L_0x0008
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A05
            android.view.ViewGroup r1 = r0.A03
            android.animation.LayoutTransition r0 = new android.animation.LayoutTransition
            r0.<init>()
            r1.setLayoutTransition(r0)
            return
        L_0x004e:
            java.lang.Object r0 = r7.A00
            X.3Kc r0 = (X.C63453Kc) r0
            com.whatsapp.qrcode.WaQrScannerView r0 = r0.A0G
            if (r0 == 0) goto L_0x0008
            r0.BoN()
            return
        L_0x005a:
            java.lang.Object r1 = r7.A00
            com.whatsapp.registration.phonenumberentry.RegisterPhone r1 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r1
            boolean r0 = r1.A0e
            if (r0 != 0) goto L_0x0008
            android.widget.TextView r1 = r1.A0A
        L_0x0064:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x006a:
            java.lang.Object r6 = r7.A00
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r6 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r6
            r6.A1k()
            android.view.ViewGroup r0 = r6.A02
            float r1 = X.C36441kJ.A02(r0)
            r0 = 0
            android.view.animation.TranslateAnimation r5 = new android.view.animation.TranslateAnimation
            r5.<init>(r0, r0, r1, r0)
            r0 = 150(0x96, double:7.4E-322)
            r5.setDuration(r0)
            android.view.ViewGroup r0 = r6.A02
            r4 = 0
            r0.setVisibility(r4)
            android.view.View r0 = r6.A01
            r0.setVisibility(r4)
            com.whatsapp.mentions.MentionableEntry r0 = r6.A0G
            int r3 = r0.getSelectionStart()
            com.whatsapp.mentions.MentionableEntry r0 = r6.A0G
            int r2 = r0.getSelectionEnd()
            com.whatsapp.mentions.MentionableEntry r1 = r6.A0G
            java.lang.String r0 = r1.getStringText()
            r1.setText(r0)
            com.whatsapp.mentions.MentionableEntry r0 = r6.A0G
            r0.setSelection(r3, r2)
            r6.A0S = r4
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r6.A09
            r0.startAnimation(r5)
            return
        L_0x00af:
            java.lang.Object r2 = r7.A00
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r2 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r2
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r2.A09
            r1 = 8
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r2.A02
            r0.setVisibility(r1)
            android.view.View r0 = r2.A01
            r0.setVisibility(r1)
            r0 = 0
            r2.A09 = r0
            r2.A1k()
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment.A07(r2)
            r0 = 0
            r2.A0Q = r0
            return
        L_0x00d1:
            java.lang.Object r2 = r7.A00
            X.28d r2 = (X.AnonymousClass28d) r2
            com.whatsapp.TextEmojiLabel r0 = r2.A0A()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x00e2
            r0 = -2
            r1.width = r0
        L_0x00e2:
            com.whatsapp.TextEmojiLabel r0 = r2.A0A()
            r0.setLayoutParams(r1)
            com.whatsapp.TextEmojiLabel r0 = r2.A0A()
            goto L_0x0141
        L_0x00ee:
            java.lang.Object r0 = r7.A00
            X.4Ze r0 = (X.C90124Ze) r0
            java.lang.Object r2 = r0.A02
            android.view.View r2 = (android.view.View) r2
            r1 = 41
            X.3v9 r0 = new X.3v9
            r0.<init>(r7, r2, r1)
            r2.post(r0)
            return
        L_0x0101:
            java.lang.Object r1 = r7.A00
            X.80Q r1 = (X.AnonymousClass80Q) r1
            r1.clearAnimation()
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0119
        L_0x010e:
            java.lang.Object r0 = r7.A00
            X.4Yk r0 = (X.C89924Yk) r0
            java.lang.Object r1 = r0.A00
            X.80Q r1 = (X.AnonymousClass80Q) r1
            r1.clearAnimation()
        L_0x0119:
            r0 = 0
            r1.A0E = r0
            r0 = 1
            r1.setEnabled(r0)
            X.C36321k7.A0N(r1)
            return
        L_0x0124:
            java.lang.Object r0 = r7.A00
            X.02E r0 = (X.AnonymousClass02E) r0
            X.01z r0 = r0.A0l()
            r0.A0W()
            return
        L_0x0130:
            java.lang.Object r0 = r7.A00
            X.00S r0 = (X.AnonymousClass00S) r0
            r0.invoke()
            return
        L_0x0138:
            super.onAnimationEnd(r8)
            java.lang.Object r0 = r7.A00
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = (com.whatsapp.webpagepreview.WebPagePreviewView) r0
            android.widget.LinearLayout r0 = r0.A08
        L_0x0141:
            r0.clearAnimation()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89234Vt.onAnimationEnd(android.view.animation.Animation):void");
    }

    public void onAnimationRepeat(Animation animation) {
        if (7 - this.A01 != 0) {
            super.onAnimationRepeat(animation);
        } else {
            animation.setStartOffset(300);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        r1.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        ((android.view.View) r1).setEnabled(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationStart(android.view.animation.Animation r3) {
        /*
            r2 = this;
            int r0 = r2.A01
            switch(r0) {
                case 6: goto L_0x0009;
                case 10: goto L_0x0013;
                case 11: goto L_0x0016;
                case 18: goto L_0x0023;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onAnimationStart(r3)
            return
        L_0x0009:
            java.lang.Object r0 = r2.A00
            X.2HO r0 = (X.AnonymousClass2HO) r0
            android.view.View r1 = r0.A00
            X.C18740tg.A04(r1)
            goto L_0x002c
        L_0x0013:
            java.lang.Object r1 = r2.A00
            goto L_0x001c
        L_0x0016:
            java.lang.Object r0 = r2.A00
            X.4Yk r0 = (X.C89924Yk) r0
            java.lang.Object r1 = r0.A00
        L_0x001c:
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setEnabled(r0)
            return
        L_0x0023:
            super.onAnimationStart(r3)
            java.lang.Object r0 = r2.A00
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = (com.whatsapp.webpagepreview.WebPagePreviewView) r0
            android.widget.LinearLayout r1 = r0.A08
        L_0x002c:
            r0 = 0
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89234Vt.onAnimationStart(android.view.animation.Animation):void");
    }
}
