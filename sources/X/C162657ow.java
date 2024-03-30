package X;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.7ow  reason: invalid class name and case insensitive filesystem */
public class C162657ow extends C67243Zb {
    public Object A00;
    public final int A01;

    public C162657ow(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(Animation animation, Object obj, int i) {
        animation.setAnimationListener(new C162657ow(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0097, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010e, code lost:
        r1.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0111, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0041, code lost:
        r0.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.view.animation.Animation r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 1: goto L_0x0045;
                case 2: goto L_0x004c;
                case 3: goto L_0x005c;
                case 4: goto L_0x006c;
                case 5: goto L_0x007e;
                case 6: goto L_0x0091;
                case 7: goto L_0x009d;
                case 8: goto L_0x00ca;
                case 9: goto L_0x00d3;
                case 10: goto L_0x0009;
                case 11: goto L_0x0010;
                case 12: goto L_0x00ea;
                case 13: goto L_0x00f9;
                case 14: goto L_0x0104;
                case 15: goto L_0x0037;
                case 16: goto L_0x0017;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onAnimationEnd(r6)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r0 = r5.A00
            X.70k r0 = (X.C1492470k) r0
            android.widget.ImageButton r0 = r0.A0C
            goto L_0x0041
        L_0x0010:
            java.lang.Object r0 = r5.A00
            X.70k r0 = (X.C1492470k) r0
            android.widget.ImageButton r0 = r0.A0D
            goto L_0x0041
        L_0x0017:
            java.lang.Object r3 = r5.A00
            X.70k r3 = (X.C1492470k) r3
            r0 = 8
            X.1RJ r2 = r3.A0J
            r2.A03(r0)
            r1 = 0
            android.view.ViewGroup r0 = r3.A0A
            r0.setVisibility(r1)
            com.whatsapp.conversation.waveforms.VoiceVisualizer r0 = r3.A0G
            r0.setVisibility(r1)
            com.whatsapp.voicerecorder.VoiceNoteSeekBar r0 = r3.A04
            r0.setProgress(r1)
            android.view.View r0 = r2.A01()
            goto L_0x0041
        L_0x0037:
            java.lang.Object r0 = r5.A00
            X.70k r0 = (X.C1492470k) r0
            X.1RJ r0 = r0.A0J
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x0008
        L_0x0041:
            r0.clearAnimation()
            return
        L_0x0045:
            java.lang.Object r0 = r5.A00
            X.6ov r0 = (X.C142466ov) r0
            android.view.View r1 = r0.A0B
            goto L_0x0097
        L_0x004c:
            java.lang.Object r2 = r5.A00
            X.62y r2 = (X.C1262062y) r2
            android.view.View r1 = r2.A01
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r2.A00(r0)
            return
        L_0x005c:
            java.lang.Object r2 = r5.A00
            X.6Zc r2 = (X.C133586Zc) r2
            android.view.View r1 = r2.A0D
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            X.C133586Zc.A0D(r2, r0)
            return
        L_0x006c:
            java.lang.Object r4 = r5.A00
            X.6Zc r4 = (X.C133586Zc) r4
            android.location.Location r3 = r4.A0I()
            int r2 = r4.A0H()
            r1 = 0
            r0 = 0
            X.C133586Zc.A05(r3, r4, r1, r2, r0)
            return
        L_0x007e:
            java.lang.Object r2 = r5.A00
            X.6Zc r2 = (X.C133586Zc) r2
            android.view.View r0 = r2.A0D
            int r0 = r0.getHeight()
            X.C133586Zc.A0D(r2, r0)
            r1 = 1
            r0 = 0
            r2.A0U(r0, r1)
            return
        L_0x0091:
            java.lang.Object r0 = r5.A00
            com.whatsapp.payments.ui.widget.PaymentView r0 = (com.whatsapp.payments.ui.widget.PaymentView) r0
            android.widget.TextView r1 = r0.A0G
        L_0x0097:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x009d:
            java.lang.Object r2 = r5.A00
            X.5NK r2 = (X.AnonymousClass5NK) r2
            android.view.ViewGroup r0 = r2.A0Y
            r0.clearAnimation()
            super.onAnimationEnd(r6)
            java.lang.Runnable r0 = r2.A0t
            r2.removeCallbacks(r0)
            r0 = 0
            r2.A0L = r0
            boolean r0 = r2.A0M
            r1 = 8
            if (r0 == 0) goto L_0x00c7
            android.view.ViewGroup r0 = r2.A0a
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r2.A0k
            r0.setVisibility(r1)
            android.widget.ImageButton r0 = r2.A0i
        L_0x00c3:
            r0.setVisibility(r1)
            return
        L_0x00c7:
            android.widget.ProgressBar r0 = r2.A0l
            goto L_0x00c3
        L_0x00ca:
            java.lang.Object r1 = r5.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setAlpha(r0)
            return
        L_0x00d3:
            java.lang.Object r1 = r5.A00
            X.5NI r1 = (X.AnonymousClass5NI) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            java.lang.Runnable r0 = r1.A0G
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.A0F
            r1.removeCallbacks(r0)
            r0 = 0
            r1.A00 = r0
            return
        L_0x00ea:
            java.lang.Object r1 = r5.A00
            X.70k r1 = (X.C1492470k) r1
            android.view.ViewGroup r0 = r1.A08
            r0.clearAnimation()
            android.view.View r0 = r1.A07
            r0.requestFocus()
            return
        L_0x00f9:
            java.lang.Object r0 = r5.A00
            X.70k r0 = (X.C1492470k) r0
            android.widget.ImageButton r1 = r0.A0D
            r0 = 1
            r1.setClickable(r0)
            goto L_0x010e
        L_0x0104:
            java.lang.Object r0 = r5.A00
            X.70k r0 = (X.C1492470k) r0
            android.view.ViewGroup r1 = r0.A0A
            r0 = 4
            r1.setVisibility(r0)
        L_0x010e:
            r1.clearAnimation()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162657ow.onAnimationEnd(android.view.animation.Animation):void");
    }

    public void onAnimationRepeat(Animation animation) {
        if (this.A01 != 0) {
            super.onAnimationRepeat(animation);
        } else {
            onAnimationStart(animation);
        }
    }

    public void onAnimationStart(Animation animation) {
        View view;
        switch (this.A01) {
            case 0:
                C1029452q r3 = (C1029452q) this.A00;
                C1029452q.A00(r3.A01, 0.2f, 0.5f);
                C1029452q.A00(r3.A02, 0.25f, 0.75f);
                return;
            case 4:
                C133586Zc r4 = (C133586Zc) this.A00;
                r4.A0R(r4.A05, Float.valueOf(-0.5f), r4.A07.getHeight(), true);
                return;
            case 5:
                C133586Zc r1 = (C133586Zc) this.A00;
                r1.A0P(r1.A0D.getHeight());
                r1.A0Y(true);
                return;
            case 8:
                ((View) this.A00).setAlpha(1.0f);
                return;
            case 10:
                view = ((C1492470k) this.A00).A0C;
                break;
            case 11:
                view = ((C1492470k) this.A00).A0D;
                break;
            case 12:
                view = ((C1492470k) this.A00).A08;
                break;
            case 14:
                return;
            case 15:
                ((C1492470k) this.A00).A0J.A03(0);
                return;
            default:
                super.onAnimationStart(animation);
                return;
        }
        view.setVisibility(0);
    }
}
