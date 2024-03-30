package X;

import android.animation.ValueAnimator;

/* renamed from: X.2rW  reason: invalid class name and case insensitive filesystem */
public class C53562rW implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public final int A01;

    public C53562rW(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new C53562rW(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0094, code lost:
        r0 = r1.getLayoutParams();
        r0.height = r2;
        r1.setLayoutParams(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0144, code lost:
        r1.setTextColor(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0147, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0163, code lost:
        r2.setAlpha(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0166, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0171, code lost:
        r1.setBackgroundColor(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0174, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r11) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x002d;
                case 1: goto L_0x0039;
                case 2: goto L_0x0047;
                case 3: goto L_0x0065;
                case 4: goto L_0x0077;
                case 5: goto L_0x0086;
                case 6: goto L_0x009e;
                case 7: goto L_0x001b;
                case 8: goto L_0x00a9;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x00c7;
                case 12: goto L_0x00d3;
                case 13: goto L_0x0121;
                case 14: goto L_0x012c;
                case 15: goto L_0x013a;
                case 16: goto L_0x0148;
                case 17: goto L_0x0167;
                case 18: goto L_0x0167;
                case 19: goto L_0x0167;
                case 20: goto L_0x0175;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r10.A00
            android.view.View r2 = (android.view.View) r2
            r0 = 1
            X.AnonymousClass00C.A0D(r11, r0)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = X.C36341k9.A03(r11)
            r1.height = r0
            r2.requestLayout()
        L_0x001a:
            return
        L_0x001b:
            java.lang.Object r1 = r10.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 1
            float r0 = X.C36361kB.A00(r11, r0)
            if (r1 == 0) goto L_0x001a
            r1.setAlpha(r0)
            r1.requestLayout()
            return
        L_0x002d:
            java.lang.Object r1 = r10.A00
            android.view.View r1 = (android.view.View) r1
            float r0 = X.AnonymousClass000.A00(r11)
            r1.setX(r0)
            return
        L_0x0039:
            java.lang.Object r1 = r10.A00
            com.whatsapp.components.SegmentedProgressBar r1 = (com.whatsapp.components.SegmentedProgressBar) r1
            int r0 = X.C36361kB.A01(r11)
            r1.A02 = r0
            r1.postInvalidate()
            return
        L_0x0047:
            java.lang.Object r0 = r10.A00
            X.3AC r0 = (X.AnonymousClass3AC) r0
            android.view.View r2 = r0.A02
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0063
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r1 = X.AnonymousClass0YO.A01(r1)
        L_0x005b:
            int r0 = X.C36341k9.A03(r11)
            X.AnonymousClass1JZ.A03(r2, r1, r0)
            return
        L_0x0063:
            r1 = 0
            goto L_0x005b
        L_0x0065:
            java.lang.Object r2 = r10.A00
            android.view.View r2 = (android.view.View) r2
            int r1 = X.C36361kB.A01(r11)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r0.height = r1
            r2.setLayoutParams(r0)
            return
        L_0x0077:
            java.lang.Object r1 = r10.A00
            X.37v r1 = (X.C604337v) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r11, r0)
            int r2 = X.C36341k9.A03(r11)
            X.2I0 r1 = r1.A01
            goto L_0x0094
        L_0x0086:
            java.lang.Object r1 = r10.A00
            X.37w r1 = (X.C604437w) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r11, r0)
            int r2 = X.C36341k9.A03(r11)
            X.2IN r1 = r1.A03
        L_0x0094:
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r0.height = r2
            r1.setLayoutParams(r0)
            return
        L_0x009e:
            java.lang.Object r2 = r10.A00
            android.view.View r2 = (android.view.View) r2
            r0 = 1
            float r0 = X.C36361kB.A00(r11, r0)
            goto L_0x0163
        L_0x00a9:
            java.lang.Object r2 = r10.A00
            com.whatsapp.qrcode.QrEducationView r2 = (com.whatsapp.qrcode.QrEducationView) r2
            float r1 = X.AnonymousClass000.A00(r11)
            float r0 = r2.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ba
            r0 = 1
            r2.A0A = r0
        L_0x00ba:
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x00c1
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
        L_0x00c1:
            r2.A00 = r1
            r2.invalidate()
            return
        L_0x00c7:
            java.lang.Object r0 = r10.A00
            com.whatsapp.status.playback.MessageReplyActivity r0 = (com.whatsapp.status.playback.MessageReplyActivity) r0
            android.view.ViewGroup r1 = r0.A03
            int r0 = X.C36361kB.A01(r11)
            goto L_0x0171
        L_0x00d3:
            java.lang.Object r9 = r10.A00
            com.whatsapp.status.playback.widget.VoiceStatusContentView r9 = (com.whatsapp.status.playback.widget.VoiceStatusContentView) r9
            r0 = 1
            float r8 = X.C36361kB.A00(r11, r0)
            java.util.List r7 = r9.A0I
            java.util.List r6 = r9.A0G
            java.util.List r5 = r9.A0H
            r5.clear()
            int r4 = r6.size()
            r3 = 0
        L_0x00ea:
            if (r3 >= r4) goto L_0x0110
            java.lang.Object r0 = r6.get(r3)
            float r2 = X.C36441kJ.A03(r0)
            r1 = 0
            int r0 = r7.size()
            if (r3 >= r0) goto L_0x0103
            java.lang.Object r0 = r7.get(r3)
            float r1 = X.C36441kJ.A03(r0)
        L_0x0103:
            float r2 = r2 - r1
            float r2 = r2 * r8
            float r2 = r2 + r1
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r5.add(r0)
            int r3 = r3 + 1
            goto L_0x00ea
        L_0x0110:
            com.whatsapp.conversation.waveforms.VoiceVisualizer r1 = r9.A01
            if (r1 != 0) goto L_0x011b
            java.lang.String r0 = "voiceVisualizer"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x011b:
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A03(r5, r0)
            return
        L_0x0121:
            java.lang.Object r1 = r10.A00
            com.whatsapp.storage.SizeTickerView r1 = (com.whatsapp.storage.SizeTickerView) r1
            int r0 = X.C36361kB.A01(r11)
            r1.A02 = r0
            goto L_0x0144
        L_0x012c:
            java.lang.Object r0 = r10.A00
            X.1yt r0 = (X.C42481yt) r0
            com.whatsapp.WaImageView r1 = r0.A09
            float r0 = X.AnonymousClass000.A00(r11)
            r1.setAlpha(r0)
            return
        L_0x013a:
            java.lang.Object r0 = r10.A00
            X.1yt r0 = (X.C42481yt) r0
            com.whatsapp.WaTextView r1 = r0.A0A
            int r0 = X.C36361kB.A01(r11)
        L_0x0144:
            r1.setTextColor(r0)
            return
        L_0x0148:
            java.lang.Object r2 = r10.A00
            android.view.View r2 = (android.view.View) r2
            r0 = 2
            X.AnonymousClass00C.A0D(r11, r0)
            int r1 = X.C36341k9.A03(r11)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            if (r0 == 0) goto L_0x015f
            r0.height = r1
            r2.setLayoutParams(r0)
        L_0x015f:
            float r0 = r11.getAnimatedFraction()
        L_0x0163:
            r2.setAlpha(r0)
            return
        L_0x0167:
            java.lang.Object r1 = r10.A00
            android.view.View r1 = (android.view.View) r1
            int r0 = X.C36361kB.A01(r11)
            int r0 = r0 << 24
        L_0x0171:
            r1.setBackgroundColor(r0)
            return
        L_0x0175:
            java.lang.Object r0 = r10.A00
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = (com.whatsapp.webpagepreview.WebPagePreviewView) r0
            float r4 = X.AnonymousClass000.A00(r11)
            com.facebook.shimmer.ShimmerFrameLayout r3 = r0.A0B
            X.4rM r2 = new X.4rM
            r2.<init>()
            r1 = 0
            X.5zE r0 = r2.A00
            r0.A0G = r1
            r2.A02(r4)
            X.5zE r0 = r2.A01()
            r3.A05(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53562rW.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
