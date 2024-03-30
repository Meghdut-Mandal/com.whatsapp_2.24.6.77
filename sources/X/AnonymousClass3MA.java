package X;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScanActivity;
import com.whatsapp.qrcode.WaQrScannerView;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;
import com.whatsapp.util.Log;

/* renamed from: X.3MA  reason: invalid class name */
public class AnonymousClass3MA implements AnonymousClass4UB {
    public Object A00;
    public final int A01;

    public AnonymousClass3MA(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BSs(int i) {
        AnonymousClass17Y r1;
        int i2;
        AnonymousClass17Y r12;
        int i3;
        switch (this.A01) {
            case 0:
                Log.e("idverification/cameraerror");
                C63453Kc r3 = (C63453Kc) this.A00;
                AnonymousClass1MK r0 = r3.A07;
                if (r0 != null) {
                    if (r0.A03()) {
                        r1 = r3.A04;
                        if (r1 != null) {
                            i2 = R.string.f12nameremoved;
                        } else {
                            throw C36321k7.A06();
                        }
                    } else {
                        if (i != 2) {
                            r1 = r3.A04;
                            if (r1 != null) {
                                i2 = R.string.f12nameremoved;
                            } else {
                                throw C36321k7.A06();
                            }
                        }
                        r3.A02((Runnable) null);
                        return;
                    }
                    r1.A06(i2, 1);
                    r3.A02((Runnable) null);
                    return;
                }
                throw C36331k8.A0d("voidCallState");
            case 3:
                QrScanCodeFragment qrScanCodeFragment = (QrScanCodeFragment) this.A00;
                if (qrScanCodeFragment.A01.A03()) {
                    qrScanCodeFragment.A00.A06(R.string.f12nameremoved, 1);
                }
                AnonymousClass01I A0h = qrScanCodeFragment.A0h();
                if (A0h instanceof C47072cl) {
                    C47072cl r13 = (C47072cl) A0h;
                    r13.A02.A0J(C36351kA.A1Y(r13.A0H) ^ true ? 1 : 0, true);
                    return;
                }
                return;
            default:
                C47042ch r32 = (C47042ch) this.A00;
                if (r32.A03.A03()) {
                    r12 = r32.A05;
                    i3 = R.string.f12nameremoved;
                } else {
                    if (i != 2) {
                        r12 = r32.A05;
                        i3 = R.string.f12nameremoved;
                    }
                    r32.finish();
                    return;
                }
                r12.A06(i3, 1);
                r32.finish();
                return;
        }
    }

    public void BdY() {
        View view;
        View view2;
        switch (this.A01) {
            case 0:
                C63453Kc r4 = (C63453Kc) this.A00;
                WaQrScannerView waQrScannerView = r4.A0G;
                boolean z = false;
                if (waQrScannerView != null && waQrScannerView.getVisibility() == 0) {
                    z = true;
                }
                if (z && ((view2 = r4.A02) == null || view2.getVisibility() != 8)) {
                    TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
                    r4.A03 = translateAnimation;
                    translateAnimation.setInterpolator(new AccelerateInterpolator());
                    Animation animation = r4.A03;
                    if (animation != null) {
                        Resources resources = r4.A00;
                        if (resources == null) {
                            throw C36331k8.A0d("resources");
                        }
                        C36421kH.A0p(resources, animation, 17694721);
                    }
                    View view3 = r4.A02;
                    if (view3 != null) {
                        view3.startAnimation(r4.A03);
                    }
                    Animation animation2 = r4.A03;
                    if (animation2 != null) {
                        C89234Vt.A00(animation2, r4, 14);
                    }
                    View view4 = r4.A02;
                    if (view4 != null) {
                        view4.setVisibility(8);
                    }
                }
                AnonymousClass3P5 r1 = r4.A0E;
                if (r1 != null) {
                    UserJid userJid = r4.A0D;
                    if (userJid == null) {
                        throw C36331k8.A0d("jid");
                    }
                    if (r1.A00(userJid)) {
                        view = r4.A01;
                    } else {
                        AlphaAnimation A0D = C36351kA.A0D();
                        Resources resources2 = r4.A00;
                        if (resources2 == null) {
                            throw C36331k8.A0d("resources");
                        }
                        C36421kH.A0p(resources2, A0D, 17694720);
                        WaTextView waTextView = r4.A06;
                        if (waTextView != null) {
                            waTextView.startAnimation(A0D);
                        }
                        view = r4.A06;
                    }
                    if (view != null) {
                        view.setVisibility(0);
                        return;
                    }
                    return;
                }
                throw C36331k8.A0d("keyTransparencyManager");
            case 1:
                IndiaUpiQrCodeScanActivity indiaUpiQrCodeScanActivity = (IndiaUpiQrCodeScanActivity) this.A00;
                indiaUpiQrCodeScanActivity.A02.A06("indiaupiqractivity/previewready");
                indiaUpiQrCodeScanActivity.A08 = true;
                indiaUpiQrCodeScanActivity.A00.A00("payments_camera");
                return;
            case 2:
                Log.i("qractivity/previewready");
                ((C47042ch) this.A00).A08 = true;
                return;
            default:
                QrScanCodeFragment.A00((QrScanCodeFragment) this.A00);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0151, code lost:
        r1 = r1.getString(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bdv(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0031;
                case 1: goto L_0x0186;
                case 2: goto L_0x0175;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r7.A00
            com.whatsapp.qrcode.contactqr.QrScanCodeFragment r3 = (com.whatsapp.qrcode.contactqr.QrScanCodeFragment) r3
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x0030
            if (r8 == 0) goto L_0x01b9
            java.lang.String r0 = r3.A04
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x01b9
            r3.A04 = r8
            X.01I r1 = r3.A0i()
            X.2cl r1 = (X.C47072cl) r1
            r0 = 2
            r2 = 1
            boolean r0 = r1.A3l(r8, r2, r0)
            if (r0 == 0) goto L_0x01b1
            r3.A07 = r2
            X.17Y r1 = r3.A00
            java.lang.Runnable r0 = r3.A0C
            r1.A0G(r0)
        L_0x0030:
            return
        L_0x0031:
            java.lang.Object r3 = r7.A00
            X.3Kc r3 = (X.C63453Kc) r3
            android.view.animation.Animation r0 = r3.A03
            r6 = 1
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0.hasEnded()
            if (r0 != r6) goto L_0x0030
            if (r8 == 0) goto L_0x0170
            java.nio.charset.Charset r0 = r3.A0H     // Catch:{ all -> 0x0049 }
            byte[] r1 = X.C36371kC.A1Z(r8, r0)     // Catch:{ all -> 0x0049 }
            goto L_0x004f
        L_0x0049:
            r0 = move-exception
            X.03N r1 = new X.03N
            r1.<init>(r0)
        L_0x004f:
            java.lang.Throwable r0 = X.AnonymousClass0AK.A00(r1)
            if (r0 != 0) goto L_0x0170
            byte[] r1 = (byte[]) r1
            X.34O r4 = r3.A00(r1)
            X.171 r2 = r3.A09
            if (r2 == 0) goto L_0x01ac
            X.16D r1 = r3.A08
            if (r1 == 0) goto L_0x01a7
            com.whatsapp.jid.UserJid r0 = r3.A0D
            if (r0 != 0) goto L_0x006e
            java.lang.String r0 = "jid"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x006e:
            X.141 r0 = r1.A0D(r0)
            java.lang.String r5 = X.C36381kD.A0v(r2, r0)
            if (r4 == 0) goto L_0x0030
            boolean r0 = r4.A01
            if (r0 != r6) goto L_0x0087
            X.4Qp r0 = r3.A0C
            if (r0 != 0) goto L_0x0194
            java.lang.String r0 = "listener"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0087:
            boolean r0 = r4 instanceof X.AnonymousClass2LV
            if (r0 != r6) goto L_0x00c7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "idverification/handleV1QrCodeError result = "
            X.C36321k7.A1L(r4, r0, r1)
            int r2 = r4.A00
            r0 = -4
            if (r2 == r0) goto L_0x0170
            r0 = -3
            java.lang.String r1 = "resources"
            r4 = 0
            if (r2 == r0) goto L_0x00b9
            r0 = -2
            if (r2 == r0) goto L_0x00b0
            r0 = 2
            if (r2 != r0) goto L_0x0030
            X.4Qp r0 = r3.A0C
            if (r0 != 0) goto L_0x01a3
            java.lang.String r0 = "listener"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00b0:
            android.content.res.Resources r2 = r3.A00
            if (r2 != 0) goto L_0x0156
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x00b9:
            android.content.res.Resources r2 = r3.A00
            if (r2 != 0) goto L_0x00c2
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x00c2:
            r1 = 2131895581(0x7f12251d, float:1.9426E38)
            goto L_0x0159
        L_0x00c7:
            boolean r0 = r4 instanceof X.AnonymousClass2LW
            if (r0 != r6) goto L_0x0030
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "idverification/handleV3QrCodeError result = "
            X.C36321k7.A1L(r4, r0, r1)
            int r1 = r4.A00
            r4 = 0
            java.lang.String r0 = "resources"
            switch(r1) {
                case -38: goto L_0x0198;
                case -37: goto L_0x0198;
                case -36: goto L_0x0198;
                case -35: goto L_0x0198;
                case -34: goto L_0x0198;
                case -33: goto L_0x00dd;
                case -32: goto L_0x00dc;
                case -31: goto L_0x00dd;
                case -30: goto L_0x00dd;
                case -29: goto L_0x00dd;
                case -28: goto L_0x00ea;
                case -27: goto L_0x00dc;
                case -26: goto L_0x00ea;
                case -25: goto L_0x0198;
                case -24: goto L_0x00ea;
                case -23: goto L_0x00dc;
                case -22: goto L_0x00f7;
                case -21: goto L_0x0104;
                case -20: goto L_0x0104;
                case -19: goto L_0x0104;
                case -18: goto L_0x0104;
                case -17: goto L_0x00f7;
                case -16: goto L_0x0198;
                case -15: goto L_0x0198;
                case -14: goto L_0x0198;
                case -13: goto L_0x0111;
                case -12: goto L_0x011e;
                case -11: goto L_0x012b;
                case -10: goto L_0x0138;
                case -9: goto L_0x0141;
                default: goto L_0x00dc;
            }
        L_0x00dc:
            return
        L_0x00dd:
            android.content.res.Resources r2 = r3.A00
            if (r2 != 0) goto L_0x00e6
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00e6:
            r1 = 2131889614(0x7f120dce, float:1.9413897E38)
            goto L_0x0159
        L_0x00ea:
            android.content.res.Resources r2 = r3.A00
            if (r2 != 0) goto L_0x00f3
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00f3:
            r1 = 2131889611(0x7f120dcb, float:1.941389E38)
            goto L_0x0159
        L_0x00f7:
            android.content.res.Resources r2 = r3.A00
            if (r2 != 0) goto L_0x0100
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0100:
            r1 = 2131889610(0x7f120dca, float:1.9413888E38)
            goto L_0x0159
        L_0x0104:
            android.content.res.Resources r2 = r3.A00
            if (r2 != 0) goto L_0x010d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x010d:
            r1 = 2131889613(0x7f120dcd, float:1.9413895E38)
            goto L_0x0159
        L_0x0111:
            android.content.res.Resources r2 = r3.A00
            if (r2 != 0) goto L_0x011a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x011a:
            r1 = 2131889612(0x7f120dcc, float:1.9413892E38)
            goto L_0x0159
        L_0x011e:
            android.content.res.Resources r2 = r3.A00
            if (r2 != 0) goto L_0x0127
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0127:
            r1 = 2131889615(0x7f120dcf, float:1.9413899E38)
            goto L_0x0159
        L_0x012b:
            android.content.res.Resources r2 = r3.A00
            if (r2 != 0) goto L_0x0134
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0134:
            r1 = 2131889616(0x7f120dd0, float:1.94139E38)
            goto L_0x0159
        L_0x0138:
            android.content.res.Resources r1 = r3.A00
            if (r1 != 0) goto L_0x014e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0141:
            android.content.res.Resources r1 = r3.A00
            if (r1 != 0) goto L_0x014a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x014a:
            r0 = 2131889618(0x7f120dd2, float:1.9413905E38)
            goto L_0x0151
        L_0x014e:
            r0 = 2131889617(0x7f120dd1, float:1.9413903E38)
        L_0x0151:
            java.lang.String r1 = r1.getString(r0)
            goto L_0x015f
        L_0x0156:
            r1 = 2131895580(0x7f12251c, float:1.9425997E38)
        L_0x0159:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r1 = X.C36411kG.A0w(r2, r5, r0, r4, r1)
        L_0x015f:
            X.AnonymousClass00C.A08(r1)
            com.whatsapp.WaTextView r0 = r3.A05
            if (r0 == 0) goto L_0x0169
            r0.setText(r1)
        L_0x0169:
            com.whatsapp.WaTextView r0 = r3.A05
            if (r0 == 0) goto L_0x0170
            r0.setVisibility(r4)
        L_0x0170:
            com.whatsapp.qrcode.WaQrScannerView r0 = r3.A0G
            if (r0 == 0) goto L_0x0030
            goto L_0x01bb
        L_0x0175:
            java.lang.String r0 = "QrScannerActivity/onQrCodeDetected"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r7.A00
            X.2ch r1 = (X.C47042ch) r1
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x0030
            r1.A3j(r8)
            return
        L_0x0186:
            java.lang.Object r2 = r7.A00
            com.whatsapp.payments.ui.IndiaUpiQrCodeScanActivity r2 = (com.whatsapp.payments.ui.IndiaUpiQrCodeScanActivity) r2
            X.3GQ r1 = r2.A00
            r0 = 2
            r1.A01(r0)
            r2.A3j(r8)
            return
        L_0x0194:
            r0.Bdx(r6)
            return
        L_0x0198:
            X.4Qp r0 = r3.A0C
            if (r0 != 0) goto L_0x01a3
            java.lang.String r0 = "listener"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01a3:
            r0.Bdx(r4)
            return
        L_0x01a7:
            java.lang.RuntimeException r0 = X.C36331k8.A0Z()
            throw r0
        L_0x01ac:
            java.lang.RuntimeException r0 = X.C36331k8.A0c()
            throw r0
        L_0x01b1:
            X.17Y r1 = r3.A00
            r0 = 2131888324(0x7f1208c4, float:1.941128E38)
            r1.A06(r0, r2)
        L_0x01b9:
            com.whatsapp.qrcode.WaQrScannerView r0 = r3.A03
        L_0x01bb:
            r0.BoN()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MA.Bdv(java.lang.String):void");
    }
}
