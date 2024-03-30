package X;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.qrcode.QrScannerOverlay;
import com.whatsapp.qrcode.WaQrScannerView;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: X.3Kc  reason: invalid class name and case insensitive filesystem */
public final class C63453Kc {
    public Resources A00;
    public View A01;
    public View A02;
    public Animation A03;
    public AnonymousClass17Y A04;
    public WaTextView A05;
    public WaTextView A06;
    public AnonymousClass1MK A07;
    public AnonymousClass16D A08;
    public AnonymousClass171 A09;
    public C599836a A0A;
    public AnonymousClass3FF A0B;
    public C87904Qp A0C;
    public UserJid A0D;
    public AnonymousClass3P5 A0E;
    public QrScannerOverlay A0F;
    public WaQrScannerView A0G;
    public final Charset A0H;
    public final Map A0I;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (r1 != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b2, code lost:
        if (X.C235218u.A02(r3, r4) == false) goto L_0x00b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0142 A[Catch:{ 186 -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b9 A[Catch:{ 186 -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c1 A[Catch:{ 186 -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00cb A[Catch:{ 186 -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f4 A[Catch:{ 186 -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00fc A[Catch:{ 186 -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0107 A[Catch:{ 186 -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0130 A[Catch:{ 186 -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0138 A[Catch:{ 186 -> 0x0176 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass34O A00(byte[] r8) {
        /*
            r7 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)
            X.36a r4 = r7.A0A
            r3 = 0
            if (r4 == 0) goto L_0x0049
            X.3FF r0 = r7.A0B
            if (r0 == 0) goto L_0x017e
            X.189 r0 = r0.A01
            com.facebook.simplejni.NativeHolder r2 = r4.A00
            if (r2 == 0) goto L_0x005f
            X.18v r1 = r0.A01
            java.lang.String r0 = "Native fingerprint is NULL"
            java.util.Objects.requireNonNull(r2, r0)
            X.0yC r1 = r1.A03
            r0 = 7469(0x1d2d, float:1.0466E-41)
            boolean r2 = r1.A0E(r0)
            r0 = 7587(0x1da3, float:1.0632E-41)
            boolean r1 = r1.A0E(r0)
            if (r2 != 0) goto L_0x0050
            if (r1 != 0) goto L_0x0053
            com.facebook.simplejni.NativeHolder r1 = r4.A00
            r0 = 3
            long r1 = com.whatsapp.wamsys.JniBridge.jvidispatchIOO(r0, r1, r8)
        L_0x0033:
            int r0 = (int) r1
            X.2LW r3 = new X.2LW
            r3.<init>(r0)
        L_0x0039:
            int r2 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = -4
            if (r1 == 0) goto L_0x0049
            if (r2 != r0) goto L_0x004a
            java.lang.String r0 = "idverification/invalidprotobuf"
        L_0x0046:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0049:
            return r3
        L_0x004a:
            r0 = -1
            if (r2 != r0) goto L_0x0049
            java.lang.String r0 = "idverification/versionmismatch"
            goto L_0x0046
        L_0x0050:
            r0 = r2
            if (r1 == 0) goto L_0x0054
        L_0x0053:
            r0 = 2
        L_0x0054:
            r2 = r2 | r0
            com.facebook.simplejni.NativeHolder r3 = r4.A00
            long r1 = (long) r2
            r0 = 19
            long r1 = com.whatsapp.wamsys.JniBridge.jvidispatchIIOO(r0, r1, r3, r8)
            goto L_0x0033
        L_0x005f:
            X.8QQ r3 = r4.A02     // Catch:{ 186 -> 0x0176 }
            X.8QQ r0 = X.AnonymousClass8QQ.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0176 }
            X.8Hz r4 = X.C170918Hz.A08(r0, r8)     // Catch:{ 186 -> 0x0176 }
            X.8QQ r4 = (X.AnonymousClass8QQ) r4     // Catch:{ 186 -> 0x0176 }
            int r1 = r4.bitField0_     // Catch:{ 186 -> 0x0176 }
            r0 = r1 & 4
            if (r0 == 0) goto L_0x016e
            r0 = r1 & 2
            if (r0 == 0) goto L_0x016e
            r0 = r1 & 1
            if (r0 == 0) goto L_0x016e
            int r1 = r4.version_     // Catch:{ 186 -> 0x0176 }
            int r0 = r3.version_     // Catch:{ 186 -> 0x0176 }
            if (r1 != r0) goto L_0x016e
            X.8PY r0 = r3.localFingerprint_     // Catch:{ 186 -> 0x0176 }
            if (r0 != 0) goto L_0x0083
            X.8PY r0 = X.AnonymousClass8PY.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0176 }
        L_0x0083:
            X.AUx r1 = r0.identifier_     // Catch:{ 186 -> 0x0176 }
            X.8PY r0 = r4.remoteFingerprint_     // Catch:{ 186 -> 0x0176 }
            if (r0 != 0) goto L_0x008b
            X.8PY r0 = X.AnonymousClass8PY.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0176 }
        L_0x008b:
            X.AUx r0 = r0.identifier_     // Catch:{ 186 -> 0x0176 }
            boolean r0 = r1.equals(r0)     // Catch:{ 186 -> 0x0176 }
            r2 = -2
            r6 = 1
            if (r0 == 0) goto L_0x00b4
            X.8PY r0 = r3.remoteFingerprint_     // Catch:{ 186 -> 0x0176 }
            if (r0 != 0) goto L_0x009b
            X.8PY r0 = X.AnonymousClass8PY.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0176 }
        L_0x009b:
            X.AUx r1 = r0.identifier_     // Catch:{ 186 -> 0x0176 }
            X.8PY r0 = r4.localFingerprint_     // Catch:{ 186 -> 0x0176 }
            if (r0 != 0) goto L_0x00a3
            X.8PY r0 = X.AnonymousClass8PY.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0176 }
        L_0x00a3:
            X.AUx r0 = r0.identifier_     // Catch:{ 186 -> 0x0176 }
            boolean r0 = r1.equals(r0)     // Catch:{ 186 -> 0x0176 }
            if (r0 != 0) goto L_0x00ad
            r5 = -2
            goto L_0x00b5
        L_0x00ad:
            boolean r0 = X.C235218u.A02(r3, r4)     // Catch:{ 186 -> 0x0176 }
            r5 = 1
            if (r0 != 0) goto L_0x00b5
        L_0x00b4:
            r5 = 2
        L_0x00b5:
            X.8PY r0 = r3.localFingerprint_     // Catch:{ 186 -> 0x0176 }
            if (r0 != 0) goto L_0x00bb
            X.8PY r0 = X.AnonymousClass8PY.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0176 }
        L_0x00bb:
            X.AUx r1 = r0.identifier_     // Catch:{ 186 -> 0x0176 }
            X.8PY r0 = r4.localFingerprint_     // Catch:{ 186 -> 0x0176 }
            if (r0 != 0) goto L_0x00c3
            X.8PY r0 = X.AnonymousClass8PY.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0176 }
        L_0x00c3:
            X.AUx r0 = r0.identifier_     // Catch:{ 186 -> 0x0176 }
            boolean r0 = r1.equals(r0)     // Catch:{ 186 -> 0x0176 }
            if (r0 == 0) goto L_0x00f0
            X.8PY r0 = r3.remoteFingerprint_     // Catch:{ 186 -> 0x0176 }
            if (r0 != 0) goto L_0x00d1
            X.8PY r0 = X.AnonymousClass8PY.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0176 }
        L_0x00d1:
            X.AUx r1 = r0.identifier_     // Catch:{ 186 -> 0x0176 }
            X.8PY r0 = r4.remoteFingerprint_     // Catch:{ 186 -> 0x0176 }
            if (r0 != 0) goto L_0x00d9
            X.8PY r0 = X.AnonymousClass8PY.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0176 }
        L_0x00d9:
            X.AUx r0 = r0.identifier_     // Catch:{ 186 -> 0x0176 }
            boolean r0 = r1.equals(r0)     // Catch:{ 186 -> 0x0176 }
            if (r0 != 0) goto L_0x00e8
            X.2LV r3 = new X.2LV     // Catch:{ 186 -> 0x0176 }
            r3.<init>(r2)     // Catch:{ 186 -> 0x0176 }
            goto L_0x0039
        L_0x00e8:
            boolean r0 = X.C235218u.A01(r3, r4)     // Catch:{ 186 -> 0x0176 }
            int r5 = X.C36391kE.A00(r0)
        L_0x00f0:
            X.8PY r0 = r3.remoteFingerprint_     // Catch:{ 186 -> 0x0176 }
            if (r0 != 0) goto L_0x00f6
            X.8PY r0 = X.AnonymousClass8PY.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0176 }
        L_0x00f6:
            X.AUx r1 = r0.identifier_     // Catch:{ 186 -> 0x0176 }
            X.8PY r0 = r4.localFingerprint_     // Catch:{ 186 -> 0x0176 }
            if (r0 != 0) goto L_0x00fe
            X.8PY r0 = X.AnonymousClass8PY.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0176 }
        L_0x00fe:
            X.AUx r0 = r0.identifier_     // Catch:{ 186 -> 0x0176 }
            boolean r0 = r1.equals(r0)     // Catch:{ 186 -> 0x0176 }
            r2 = -3
            if (r0 == 0) goto L_0x012c
            X.8PY r0 = r3.localFingerprint_     // Catch:{ 186 -> 0x0176 }
            if (r0 != 0) goto L_0x010d
            X.8PY r0 = X.AnonymousClass8PY.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0176 }
        L_0x010d:
            X.AUx r1 = r0.identifier_     // Catch:{ 186 -> 0x0176 }
            X.8PY r0 = r4.remoteFingerprint_     // Catch:{ 186 -> 0x0176 }
            if (r0 != 0) goto L_0x0115
            X.8PY r0 = X.AnonymousClass8PY.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0176 }
        L_0x0115:
            X.AUx r0 = r0.identifier_     // Catch:{ 186 -> 0x0176 }
            boolean r0 = r1.equals(r0)     // Catch:{ 186 -> 0x0176 }
            if (r0 != 0) goto L_0x0124
            X.2LV r3 = new X.2LV     // Catch:{ 186 -> 0x0176 }
            r3.<init>(r2)     // Catch:{ 186 -> 0x0176 }
            goto L_0x0039
        L_0x0124:
            boolean r0 = X.C235218u.A02(r3, r4)     // Catch:{ 186 -> 0x0176 }
            int r5 = X.C36391kE.A00(r0)
        L_0x012c:
            X.8PY r0 = r3.remoteFingerprint_     // Catch:{ 186 -> 0x0176 }
            if (r0 != 0) goto L_0x0132
            X.8PY r0 = X.AnonymousClass8PY.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0176 }
        L_0x0132:
            X.AUx r1 = r0.identifier_     // Catch:{ 186 -> 0x0176 }
            X.8PY r0 = r4.remoteFingerprint_     // Catch:{ 186 -> 0x0176 }
            if (r0 != 0) goto L_0x013a
            X.8PY r0 = X.AnonymousClass8PY.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0176 }
        L_0x013a:
            X.AUx r0 = r0.identifier_     // Catch:{ 186 -> 0x0176 }
            boolean r0 = r1.equals(r0)     // Catch:{ 186 -> 0x0176 }
            if (r0 == 0) goto L_0x0167
            X.8PY r0 = r3.localFingerprint_     // Catch:{ 186 -> 0x0176 }
            if (r0 != 0) goto L_0x0148
            X.8PY r0 = X.AnonymousClass8PY.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0176 }
        L_0x0148:
            X.AUx r1 = r0.identifier_     // Catch:{ 186 -> 0x0176 }
            X.8PY r0 = r4.localFingerprint_     // Catch:{ 186 -> 0x0176 }
            if (r0 != 0) goto L_0x0150
            X.8PY r0 = X.AnonymousClass8PY.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0176 }
        L_0x0150:
            X.AUx r0 = r0.identifier_     // Catch:{ 186 -> 0x0176 }
            boolean r0 = r1.equals(r0)     // Catch:{ 186 -> 0x0176 }
            if (r0 != 0) goto L_0x015f
            X.2LV r3 = new X.2LV     // Catch:{ 186 -> 0x0176 }
            r3.<init>(r2)     // Catch:{ 186 -> 0x0176 }
            goto L_0x0039
        L_0x015f:
            boolean r0 = X.C235218u.A01(r3, r4)     // Catch:{ 186 -> 0x0176 }
            if (r0 != 0) goto L_0x0166
            r6 = 2
        L_0x0166:
            r5 = r6
        L_0x0167:
            X.2LV r3 = new X.2LV     // Catch:{ 186 -> 0x0176 }
            r3.<init>(r5)     // Catch:{ 186 -> 0x0176 }
            goto L_0x0039
        L_0x016e:
            r0 = -1
            X.2LV r3 = new X.2LV     // Catch:{ 186 -> 0x0176 }
            r3.<init>(r0)     // Catch:{ 186 -> 0x0176 }
            goto L_0x0039
        L_0x0176:
            r0 = -4
            X.2LV r3 = new X.2LV
            r3.<init>(r0)
            goto L_0x0039
        L_0x017e:
            java.lang.String r0 = "fingerprintUtil"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63453Kc.A00(byte[]):X.34O");
    }

    public final void A02(Runnable runnable) {
        View view;
        WaQrScannerView waQrScannerView = this.A0G;
        if (waQrScannerView != null && waQrScannerView.getVisibility() == 0) {
            AnonymousClass3P5 r1 = this.A0E;
            if (r1 != null) {
                UserJid userJid = this.A0D;
                if (userJid == null) {
                    throw C36331k8.A0d("jid");
                }
                if (r1.A00(userJid)) {
                    view = this.A01;
                } else {
                    view = this.A06;
                }
                if (view != null) {
                    view.setVisibility(8);
                }
                C36361kB.A14(this.A02);
                QrScannerOverlay qrScannerOverlay = this.A0F;
                if (qrScannerOverlay != null) {
                    qrScannerOverlay.setVisibility(8);
                }
                WaTextView waTextView = this.A05;
                if (waTextView != null) {
                    waTextView.setVisibility(8);
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                translateAnimation.setInterpolator(new DecelerateInterpolator());
                Resources resources = this.A00;
                if (resources == null) {
                    throw C36331k8.A0d("resources");
                }
                C36421kH.A0p(resources, translateAnimation, 17694721);
                C89214Vr.A00(translateAnimation, runnable, this, 11);
                View view2 = this.A02;
                if (view2 != null) {
                    view2.startAnimation(translateAnimation);
                    return;
                }
                return;
            }
            throw C36331k8.A0d("keyTransparencyManager");
        }
    }

    public C63453Kc() {
        Charset charset = AnonymousClass0S4.A00;
        this.A0H = charset;
        this.A0I = C36391kE.A11(C188368zT.A01, charset);
    }

    public final void A01(View view, C87904Qp r3, UserJid userJid) {
        C36321k7.A0w(view, userJid);
        this.A0D = userJid;
        this.A0C = r3;
        this.A00 = C36441kJ.A0J(view);
        this.A02 = view.findViewById(R.id.main_layout);
        this.A0G = (WaQrScannerView) view.findViewById(R.id.qr_scanner_view);
        this.A0F = (QrScannerOverlay) view.findViewById(R.id.overlay);
        this.A01 = view.findViewById(R.id.footer);
        this.A06 = C36411kG.A0Z(view, R.id.verify_identity_qr_tip);
        this.A05 = C36411kG.A0Z(view, R.id.error_indicator);
    }
}
