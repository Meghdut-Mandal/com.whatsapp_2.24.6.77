package X;

import android.os.Handler;

/* renamed from: X.3wW  reason: invalid class name and case insensitive filesystem */
public class C81133wW implements Runnable {
    public Object A00;
    public final int A01;

    public C81133wW(AnonymousClass6QH r1, int i) {
        this.A01 = i;
        switch (i) {
            case 24:
            case 25:
            case 26:
                this.A00 = r1;
                return;
            default:
                this.A00 = r1;
                return;
        }
    }

    public static void A00(Handler handler, Object obj, int i) {
        handler.post(new C81133wW(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r5.A03 != null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03b0, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03b5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0476, code lost:
        r2.A06(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0479, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x04c4, code lost:
        if (r9 == 2) goto L_0x04c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0589, code lost:
        if (r9 != 3) goto L_0x058b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0607, code lost:
        if (r2.contains(r1) != false) goto L_0x0609;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0690, code lost:
        r0.BdY();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0693, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0085, code lost:
        r1.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0592  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0612  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x062f  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x0646  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0649  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x067b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r4 = r19
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x022c;
                case 1: goto L_0x023a;
                case 2: goto L_0x0246;
                case 3: goto L_0x024c;
                case 4: goto L_0x0257;
                case 5: goto L_0x025f;
                case 6: goto L_0x000f;
                case 7: goto L_0x0020;
                case 8: goto L_0x0267;
                case 9: goto L_0x0289;
                case 10: goto L_0x0062;
                case 11: goto L_0x0075;
                case 12: goto L_0x028f;
                case 13: goto L_0x029d;
                case 14: goto L_0x02a5;
                case 15: goto L_0x02b2;
                case 16: goto L_0x02ba;
                case 17: goto L_0x008a;
                case 18: goto L_0x02c2;
                case 19: goto L_0x009d;
                case 20: goto L_0x02cd;
                case 21: goto L_0x02d7;
                case 22: goto L_0x02df;
                case 23: goto L_0x033a;
                case 24: goto L_0x0341;
                case 25: goto L_0x0120;
                case 26: goto L_0x03aa;
                case 27: goto L_0x012c;
                case 28: goto L_0x0152;
                case 29: goto L_0x03b6;
                case 30: goto L_0x03be;
                case 31: goto L_0x017b;
                case 32: goto L_0x03ca;
                case 33: goto L_0x046c;
                case 34: goto L_0x047a;
                case 35: goto L_0x0482;
                case 36: goto L_0x01b5;
                case 37: goto L_0x048a;
                case 38: goto L_0x01bf;
                case 39: goto L_0x01cd;
                case 40: goto L_0x0492;
                case 41: goto L_0x0207;
                case 42: goto L_0x0219;
                case 43: goto L_0x0686;
                case 44: goto L_0x0694;
                case 45: goto L_0x06b1;
                case 46: goto L_0x06bc;
                case 47: goto L_0x06d1;
                case 48: goto L_0x06d8;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r4.A00
            com.whatsapp.quickcontact.QuickContactActivity r1 = (com.whatsapp.quickcontact.QuickContactActivity) r1
            r0 = 0
            r1.A0y = r0
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r2 = r4.A00
            com.whatsapp.profile.ProfileInfoActivity r2 = (com.whatsapp.profile.ProfileInfoActivity) r2
            X.141 r1 = r2.A0G
            int r0 = r1.A06
            if (r0 != 0) goto L_0x000e
            int r0 = r1.A05
            if (r0 != 0) goto L_0x000e
            android.view.View r1 = r2.A02
            goto L_0x0085
        L_0x0020:
            java.lang.Object r5 = r4.A00
            X.9mr r5 = (X.C202899mr) r5
            X.11F r4 = r5.A0D
            X.C202899mr.A00(r4, r5)
            byte[] r0 = r5.A02
            r3 = 0
            if (r0 != 0) goto L_0x0033
            byte[] r0 = r5.A03
            r2 = 1
            if (r0 == 0) goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            boolean r0 = X.AnonymousClass143.A0G(r4)
            if (r0 == 0) goto L_0x0048
            X.17Y r1 = r5.A04
            r0 = 2131890171(0x7f120ffb, float:1.9415026E38)
            if (r2 == 0) goto L_0x0044
            r0 = 2131890170(0x7f120ffa, float:1.9415024E38)
        L_0x0044:
            r1.A06(r0, r3)
            return
        L_0x0048:
            X.0wQ r1 = r5.A05
            r1.A0G()
            X.142 r0 = r1.A0E
            if (r0 == 0) goto L_0x000e
            boolean r0 = r1.A0M(r4)
            if (r0 == 0) goto L_0x000e
            X.17Y r1 = r5.A04
            r0 = 2131893257(0x7f121c09, float:1.9421285E38)
            if (r2 == 0) goto L_0x0044
            r0 = 2131893256(0x7f121c08, float:1.9421283E38)
            goto L_0x0044
        L_0x0062:
            java.lang.Object r1 = r4.A00
            com.whatsapp.profile.ProfilePhotoReminder r1 = (com.whatsapp.profile.ProfilePhotoReminder) r1
            X.3J6 r0 = r1.A0B
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x000e
            X.3J6 r1 = r1.A0B
            r0 = 1
            r1.A01(r0)
            return
        L_0x0075:
            java.lang.Object r2 = r4.A00
            com.whatsapp.profile.ProfilePhotoReminder r2 = (com.whatsapp.profile.ProfilePhotoReminder) r2
            X.141 r1 = r2.A07
            int r0 = r1.A06
            if (r0 != 0) goto L_0x000e
            int r0 = r1.A05
            if (r0 != 0) goto L_0x000e
            android.view.View r1 = r2.A00
        L_0x0085:
            r0 = 4
            r1.setVisibility(r0)
            return
        L_0x008a:
            java.lang.Object r1 = r4.A00
            X.3UB r1 = (X.AnonymousClass3UB) r1
            X.0yb r0 = r1.A0c
            X.C55922vP.A00(r0)
            X.3Av r0 = r1.A09
            X.3Qq r0 = r0.A00
            if (r0 == 0) goto L_0x000e
            r0.A0D()
            return
        L_0x009d:
            java.lang.Object r2 = r4.A00
            X.3UB r2 = (X.AnonymousClass3UB) r2
            java.io.File r8 = r2.A0A
            android.net.Uri r3 = android.net.Uri.fromFile(r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ptvcameraui/showpreview "
            X.C36321k7.A1K(r3, r0, r1)
            X.67y r1 = new X.67y     // Catch:{ 1GL -> 0x00b6 }
            r1.<init>(r8)     // Catch:{ 1GL -> 0x00b6 }
            goto L_0x00bc
        L_0x00b6:
            java.lang.String r0 = "PtvCameraUI/error extracting video meta"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00e6
        L_0x00bc:
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x011a
            int r0 = r1.A00
            float r13 = (float) r0
            int r0 = r1.A02
        L_0x00c7:
            float r14 = (float) r0
            r11 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0117
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0117
            long r0 = r1.A03
            r4 = 1000(0x3e8, double:4.94E-321)
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x00ea
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "PtvCameraUI/video duration is smaller than minimum duration duration="
            java.lang.String r0 = X.C36381kD.A0z(r2, r3, r0)
        L_0x00e3:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00e6:
            X.AnonymousClass6YY.A0P(r8)
            return
        L_0x00ea:
            android.graphics.RectF r10 = new android.graphics.RectF
            r10.<init>(r11, r11, r13, r14)
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            X.5Cc r9 = new X.5Cc
            r9.<init>()
            r12 = 0
            r9.A0J(r10, r11, r12, r13, r14)
            r0.add(r9)
            r13 = 0
            X.6VQ r6 = new X.6VQ
            r6.<init>(r10, r10, r0, r13)
            X.1XY r3 = r2.A0T     // Catch:{ IOException -> 0x00e6 }
            java.util.List r10 = r2.A0r     // Catch:{ IOException -> 0x00e6 }
            r11 = 1
            r4 = 0
            X.3T1 r7 = r2.A06     // Catch:{ IOException -> 0x00e6 }
            r9 = r4
            r12 = 1
            r5 = r4
            boolean r0 = r3.A08(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x00e6 }
            if (r0 != 0) goto L_0x000e
            goto L_0x00e6
        L_0x0117:
            java.lang.String r0 = "PtvCameraUI/invalid dimensions"
            goto L_0x00e3
        L_0x011a:
            int r0 = r1.A02
            float r13 = (float) r0
            int r0 = r1.A00
            goto L_0x00c7
        L_0x0120:
            java.lang.Object r0 = r4.A00
            X.6QH r0 = (X.AnonymousClass6QH) r0
            android.animation.AnimatorSet r0 = r0.A03
            if (r0 == 0) goto L_0x000e
            r0.end()
            return
        L_0x012c:
            java.lang.Object r0 = r4.A00
            X.3wW r0 = (X.C81133wW) r0
            java.lang.Object r4 = r0.A00
            X.6QH r4 = (X.AnonymousClass6QH) r4
            X.0v0 r3 = r4.A0Q
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r3)
            java.lang.String r2 = "voice_note_lock_tip_show_count"
            int r1 = X.C36371kC.A01(r0, r2)
            r0 = 4
            if (r1 >= r0) goto L_0x000e
            X.7lk r0 = r4.A04
            if (r0 == 0) goto L_0x014a
            r0.Bgi()
        L_0x014a:
            int r0 = r1 + 1
            if (r0 < 0) goto L_0x06e9
            X.C36321k7.A0q(r3, r2, r0)
            return
        L_0x0152:
            java.lang.Object r1 = r4.A00
            X.6QH r1 = (X.AnonymousClass6QH) r1
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x0162
            android.os.Handler r2 = r1.A0G
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.postDelayed(r4, r0)
            return
        L_0x0162:
            X.7hS r0 = r1.A0S
            boolean r0 = r0.BK7()
            if (r0 == 0) goto L_0x000e
            X.4df r3 = r1.A05
            if (r3 == 0) goto L_0x000e
            r0 = 27
            X.3wW r2 = new X.3wW
            r2.<init>((java.lang.Object) r4, (int) r0)
            r0 = 300(0x12c, double:1.48E-321)
            X.C92354df.A02(r3, r2, r0)
            return
        L_0x017b:
            java.lang.Object r5 = r4.A00
            com.whatsapp.qrcode.DevicePairQrScannerActivity r5 = (com.whatsapp.qrcode.DevicePairQrScannerActivity) r5
            java.lang.String r0 = "QrScannerActivity/registration timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4Tr r4 = r5.A09
            r3 = 0
            r2 = 2
            r0 = -3
            r4.BOi(r2, r0, r3)
            X.3Ne r0 = r5.A0E
            X.3Sv r0 = X.C64233Ne.A00(r0)
            r0.A03()
            X.0wU r2 = r5.A04
            r1 = 30
            X.3wW r0 = new X.3wW
            r0.<init>((java.lang.Object) r5, (int) r1)
            r2.Boy(r0)
            boolean r0 = r5.BLh()
            if (r0 != 0) goto L_0x000e
            r0 = 2131889300(0x7f120c94, float:1.941326E38)
            r5.BO5(r0)
            com.whatsapp.qrcode.DevicePairQrScannerActivity.A01(r5)
            r0 = 0
            r5.A06 = r0
            return
        L_0x01b5:
            java.lang.Object r0 = r4.A00
            X.1mP r0 = (X.C37461mP) r0
            android.hardware.Camera r1 = r0.A03
            if (r1 == 0) goto L_0x000e
            goto L_0x06f0
        L_0x01bf:
            java.lang.Object r0 = r4.A00
            X.1mP r0 = (X.C37461mP) r0
            android.hardware.Camera r1 = r0.A03
            if (r1 == 0) goto L_0x000e
            android.hardware.Camera$PreviewCallback r0 = r0.A0I
            r1.setOneShotPreviewCallback(r0)
            return
        L_0x01cd:
            java.lang.Object r2 = r4.A00
            X.1mP r2 = (X.C37461mP) r2
            android.hardware.Camera r0 = r2.A03
            if (r0 != 0) goto L_0x071e
            r3 = 0
            android.hardware.Camera r1 = android.hardware.Camera.open()     // Catch:{ Exception -> 0x01ee }
            r2.A03 = r1     // Catch:{ Exception -> 0x01ee }
            if (r1 != 0) goto L_0x01e5
            r0 = 0
            android.hardware.Camera r1 = android.hardware.Camera.open(r0)     // Catch:{ Exception -> 0x01ee }
            r2.A03 = r1     // Catch:{ Exception -> 0x01ee }
        L_0x01e5:
            X.3WK r0 = new X.3WK     // Catch:{ Exception -> 0x01ee }
            r0.<init>(r2)     // Catch:{ Exception -> 0x01ee }
            r1.setErrorCallback(r0)     // Catch:{ Exception -> 0x01ee }
            goto L_0x0201
        L_0x01ee:
            r1 = move-exception
            android.hardware.Camera r0 = r2.A03
            if (r0 == 0) goto L_0x01f6
            r0.release()
        L_0x01f6:
            r2.A03 = r3
            java.lang.String r0 = "qrview/startcamera error opening camera"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 1
            X.C37461mP.A00(r2, r0)
        L_0x0201:
            android.hardware.Camera r1 = r2.A03
            if (r1 == 0) goto L_0x000e
            goto L_0x06fd
        L_0x0207:
            java.lang.Object r2 = r4.A00
            X.1mP r2 = (X.C37461mP) r2
            java.lang.String r0 = "qrview/stopcamera"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.Bv5()
            android.hardware.Camera r0 = r2.A03
            if (r0 == 0) goto L_0x000e
            goto L_0x0736
        L_0x0219:
            java.lang.Object r2 = r4.A00
            X.1mP r2 = (X.C37461mP) r2
            android.hardware.Camera r0 = r2.A03
            if (r0 == 0) goto L_0x000e
            android.os.Handler r1 = r2.A04
            java.lang.Runnable r0 = r2.A0N
            if (r1 == 0) goto L_0x0744
            r1.removeCallbacks(r0)
            goto L_0x0747
        L_0x022c:
            java.lang.Object r1 = r4.A00
            X.02t r1 = (X.C006302t) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.5Hs r0 = X.C105935Hs.A00
            r1.invoke(r0)
            return
        L_0x023a:
            java.lang.Object r1 = r4.A00
            X.4TU r1 = (X.AnonymousClass4TU) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.onSuccess()
            return
        L_0x0246:
            java.lang.Object r0 = r4.A00
            X.C36411kG.A1O(r0)
            return
        L_0x024c:
            java.lang.Object r0 = r4.A00
            X.1XW r0 = (X.AnonymousClass1XW) r0
            X.1Bs r1 = r0.A01
            r0 = 0
            r1.A02(r0, r0)
            return
        L_0x0257:
            java.lang.Object r0 = r4.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finishAfterTransition()
            return
        L_0x025f:
            java.lang.Object r0 = r4.A00
            com.whatsapp.profile.ProfileInfoActivity r0 = (com.whatsapp.profile.ProfileInfoActivity) r0
            r0.A3i()
            return
        L_0x0267:
            java.lang.Object r0 = r4.A00
            X.Aca r0 = (X.C21904Aca) r0
            X.9mr r2 = r0.A00
            X.11F r3 = r2.A0D
            r1 = 0
            X.C202899mr.A00(r3, r2)
            X.1O8 r0 = r2.A0F
            r0.A00(r3, r1)
            X.17Y r2 = r2.A04
            boolean r0 = X.AnonymousClass143.A0G(r3)
            r1 = 2131889568(0x7f120da0, float:1.9413803E38)
            if (r0 == 0) goto L_0x0286
            r1 = 2131889565(0x7f120d9d, float:1.9413797E38)
        L_0x0286:
            r0 = 0
            goto L_0x0476
        L_0x0289:
            java.lang.Object r0 = r4.A00
            X.C36411kG.A1N(r0)
            return
        L_0x028f:
            java.lang.Object r0 = r4.A00
            X.0x1 r0 = (X.C20100x1) r0
            r2 = 0
            X.17Y r1 = r0.A01
            r0 = 2131896666(0x7f12295a, float:1.94282E38)
            r1.A06(r0, r2)
            return
        L_0x029d:
            java.lang.Object r0 = r4.A00
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            return
        L_0x02a5:
            java.lang.Object r1 = r4.A00
            X.3UB r1 = (X.AnonymousClass3UB) r1
            X.0yb r0 = r1.A0c
            X.C55922vP.A00(r0)
            X.AnonymousClass3UB.A03(r1)
            return
        L_0x02b2:
            java.lang.Object r0 = r4.A00
            X.3UB r0 = (X.AnonymousClass3UB) r0
            X.AnonymousClass3UB.A04(r0)
            return
        L_0x02ba:
            java.lang.Object r0 = r4.A00
            X.3UB r0 = (X.AnonymousClass3UB) r0
            X.AnonymousClass3UB.A02(r0)
            return
        L_0x02c2:
            java.lang.Object r0 = r4.A00
            X.3UB r0 = (X.AnonymousClass3UB) r0
            android.view.View r1 = r0.A0N
            r0 = 0
            r1.setAlpha(r0)
            return
        L_0x02cd:
            java.lang.Object r0 = r4.A00
            X.3UB r0 = (X.AnonymousClass3UB) r0
            java.io.File r0 = r0.A0A
            X.AnonymousClass6YY.A0P(r0)
            return
        L_0x02d7:
            java.lang.Object r0 = r4.A00
            X.3UB r0 = (X.AnonymousClass3UB) r0
            android.view.View r1 = r0.A0N
            goto L_0x03b0
        L_0x02df:
            java.lang.Object r0 = r4.A00
            X.4X4 r0 = (X.AnonymousClass4X4) r0
            java.lang.Object r3 = r0.A00
            X.3UB r3 = (X.AnonymousClass3UB) r3
            com.whatsapp.camera.litecamera.LiteCameraView r0 = r3.A04
            if (r0 == 0) goto L_0x02f1
            boolean r0 = r0.BMx()
            if (r0 != 0) goto L_0x0306
        L_0x02f1:
            X.1hi r0 = r3.A0l
            boolean r0 = X.C36351kA.A1W(r0)
            if (r0 != 0) goto L_0x0306
            X.3B7 r0 = r3.A07
            com.whatsapp.WaImageView r1 = r0.A07
            boolean r0 = r0.A0A
            int r0 = X.C36351kA.A00(r0)
            r1.setVisibility(r0)
        L_0x0306:
            X.35N r4 = r3.A08
            android.view.View r1 = r4.A00
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x032d
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            r0 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r0)
            r1 = 23
            X.3wW r0 = new X.3wW
            r0.<init>((java.lang.Object) r4, (int) r1)
            android.view.ViewPropertyAnimator r0 = r2.withEndAction(r0)
            r0.start()
        L_0x032d:
            X.6cV r1 = r3.A03
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A00 = r0
            r0 = 1
            r3.A0C = r0
            X.AnonymousClass3UB.A01(r3)
            return
        L_0x033a:
            java.lang.Object r0 = r4.A00
            X.35N r0 = (X.AnonymousClass35N) r0
            android.view.View r1 = r0.A00
            goto L_0x03b0
        L_0x0341:
            java.lang.Object r7 = r4.A00
            X.6QH r7 = (X.AnonymousClass6QH) r7
            android.animation.AnimatorSet r0 = r7.A03
            if (r0 != 0) goto L_0x03a4
            android.view.View r9 = r7.A0M
            r8 = 2
            float[] r4 = new float[r8]
            int r3 = r9.getWidth()
            X.0ts r2 = r7.A0R
            boolean r1 = X.C36351kA.A1Y(r2)
            r0 = -2
            if (r1 == 0) goto L_0x035c
            r0 = 2
        L_0x035c:
            int r3 = r3 * r0
            float r1 = (float) r3
            r0 = 0
            r4[r0] = r1
            int r3 = r9.getWidth()
            boolean r2 = X.C36351kA.A1Y(r2)
            r6 = -1
            r1 = 1
            r0 = 1
            if (r2 == 0) goto L_0x036f
            r0 = -1
        L_0x036f:
            int r3 = r3 * r0
            float r0 = (float) r3
            r4[r1] = r0
            java.lang.String r0 = "translationX"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r9, r0, r4)
            r3 = 1600(0x640, double:7.905E-321)
            r5.setDuration(r3)
            r5.setRepeatCount(r6)
            float[] r1 = new float[r8]
            r1 = {1065353216, 0} // fill-array
            java.lang.String r0 = "alpha"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r9, r0, r1)
            r2.setDuration(r3)
            r2.setRepeatCount(r6)
            android.animation.AnimatorSet r0 = X.C36441kJ.A0C()
            r7.A03 = r0
            X.C36391kE.A13(r0)
            android.animation.AnimatorSet r1 = r7.A03
            android.animation.Animator[] r0 = X.C36441kJ.A1P(r5, r2, r8)
            r1.playTogether(r0)
        L_0x03a4:
            android.animation.AnimatorSet r0 = r7.A03
            r0.start()
            return
        L_0x03aa:
            java.lang.Object r0 = r4.A00
            X.6QH r0 = (X.AnonymousClass6QH) r0
            android.view.ViewGroup r1 = r0.A0N
        L_0x03b0:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x03b6:
            java.lang.Object r0 = r4.A00
            com.whatsapp.qrcode.AuthenticationActivity r0 = (com.whatsapp.qrcode.AuthenticationActivity) r0
            r0.A01()
            return
        L_0x03be:
            java.lang.Object r0 = r4.A00
            com.whatsapp.qrcode.DevicePairQrScannerActivity r0 = (com.whatsapp.qrcode.DevicePairQrScannerActivity) r0
            X.19g r1 = r0.A0B
            java.lang.String r0 = "account_sync_timeout"
            X.C236419g.A06(r1, r0)
            return
        L_0x03ca:
            java.lang.Object r4 = r4.A00
            com.whatsapp.qrcode.DevicePairQrScannerActivity r4 = (com.whatsapp.qrcode.DevicePairQrScannerActivity) r4
            boolean r1 = r4.A3I()
            r0 = 0
            if (r1 == 0) goto L_0x03d8
            r4.A06 = r0
            return
        L_0x03d8:
            java.lang.String r1 = r4.A06
            if (r1 == 0) goto L_0x0466
            X.3OO r0 = X.AnonymousClass3O3.A07
            X.3O3 r2 = r0.A01(r1)
            if (r2 == 0) goto L_0x0466
            java.lang.String r9 = r2.A04
            r15 = 0
            byte[] r10 = r2.A05
            X.3FZ r6 = r2.A00
            byte[] r11 = r2.A06
            java.lang.Integer r8 = r2.A02
            X.2q9 r7 = r2.A01
            X.39o r5 = new X.39o
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.4Tr r3 = r4.A09
            r1 = 1
            r0 = 0
            r3.BeQ(r5, r1, r0)
            X.3Ne r0 = r4.A0E
            X.3Sv r12 = X.C64233Ne.A00(r0)
            X.3pW r0 = r12.A01
            if (r0 == 0) goto L_0x0418
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0418
        L_0x040b:
            java.lang.String r0 = "CompanionDeviceQrHandler/handleQrCode/request already in progress"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0wN r3 = r12.A02
            X.19g r0 = r12.A0C
            java.lang.Object r1 = r0.A0N
            monitor-enter(r1)
            goto L_0x043f
        L_0x0418:
            X.19g r0 = r12.A0C
            java.lang.Object r1 = r0.A0N
            monitor-enter(r1)
            X.3Iw r0 = r0.A00     // Catch:{ all -> 0x0463 }
            boolean r0 = X.AnonymousClass000.A1V(r0)
            monitor-exit(r1)     // Catch:{ all -> 0x0463 }
            if (r0 != 0) goto L_0x040b
            X.39o r5 = new X.39o
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.String r0 = r2.A03
            if (r0 == 0) goto L_0x0454
            r12.A04()
            X.2q9 r14 = X.C52772q9.E2EE
            r18 = 0
            r17 = r15
            r13 = r5
            r16 = r15
            X.C65623Sv.A02(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x043f:
            X.3Iw r0 = r0.A00     // Catch:{ all -> 0x0451 }
            boolean r0 = X.AnonymousClass000.A1V(r0)
            monitor-exit(r1)     // Catch:{ all -> 0x0451 }
            java.lang.String r2 = java.lang.String.valueOf(r0)
            r1 = 0
            java.lang.String r0 = "CompanionDeviceQrHandler/request already in progress"
            r3.A0E(r0, r2, r1)
            return
        L_0x0451:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0451 }
            throw r0
        L_0x0454:
            X.3FZ r0 = r5.A00
            if (r0 == 0) goto L_0x0460
            byte[] r0 = r5.A04
            if (r0 == 0) goto L_0x0460
            r12.A05(r5)
            return
        L_0x0460:
            X.4Uk r0 = r12.A0D
            goto L_0x0468
        L_0x0463:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0463 }
            throw r0
        L_0x0466:
            X.4Uk r0 = r4.A0J
        L_0x0468:
            r0.BZI()
            return
        L_0x046c:
            java.lang.Object r0 = r4.A00
            X.14u r0 = (X.C225314u) r0
            X.17Y r2 = r0.A05
            r1 = 2131893779(0x7f121e13, float:1.9422344E38)
            r0 = 1
        L_0x0476:
            r2.A06(r1, r0)
            return
        L_0x047a:
            java.lang.Object r0 = r4.A00
            X.2ch r0 = (X.C47042ch) r0
            r0.A3i()
            return
        L_0x0482:
            java.lang.Object r0 = r4.A00
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            return
        L_0x048a:
            java.lang.Object r0 = r4.A00
            X.1mP r0 = (X.C37461mP) r0
            X.4UB r0 = r0.A07
            goto L_0x0690
        L_0x0492:
            java.lang.Object r11 = r4.A00
            X.1mP r11 = (X.C37461mP) r11
            int r13 = r11.getWidth()
            int r12 = r11.getHeight()
            java.lang.String r18 = "qrview/startpreview "
            java.lang.String r10 = "x"
            android.hardware.Camera r0 = r11.A03
            if (r0 != 0) goto L_0x04b0
            java.lang.String r0 = "qrview/startpreview camera is null"
        L_0x04a8:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x04ab:
            r0 = 1
            X.C37461mP.A00(r11, r0)
            return
        L_0x04b0:
            android.content.Context r0 = r11.getContext()
            android.view.WindowManager r0 = X.C21060yb.A01(r0)
            android.view.Display r0 = r0.getDefaultDisplay()
            int r9 = r0.getRotation()
            r0 = 2
            if (r9 == 0) goto L_0x04c6
            r5 = 0
            if (r9 != r0) goto L_0x04c7
        L_0x04c6:
            r5 = 1
        L_0x04c7:
            android.hardware.Camera r0 = r11.A03     // Catch:{ RuntimeException -> 0x0661 }
            android.hardware.Camera$Parameters r8 = r0.getParameters()     // Catch:{ RuntimeException -> 0x0661 }
            java.util.List r0 = r8.getSupportedPreviewSizes()
            r11.A09 = r0
            if (r0 != 0) goto L_0x04f1
            java.lang.String r0 = "qrview/fallbacksupportedpreviewsizes"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            r11.A09 = r4
            android.hardware.Camera r3 = r11.A03
            java.util.Objects.requireNonNull(r3)
            r2 = 640(0x280, float:8.97E-43)
            r1 = 480(0x1e0, float:6.73E-43)
            android.hardware.Camera$Size r0 = new android.hardware.Camera$Size
            r0.<init>(r3, r2, r1)
            r4.add(r0)
        L_0x04f1:
            java.util.List r2 = r11.A09
            r1 = r13
            r0 = r12
            if (r5 == 0) goto L_0x04f9
            r1 = r12
            r0 = r13
        L_0x04f9:
            android.hardware.Camera$Size r2 = X.C1030553k.A01(r2, r1, r0)
            r11.A02 = r2
            if (r2 != 0) goto L_0x0504
            java.lang.String r0 = "qrview/startpreview preview size is null"
            goto L_0x04a8
        L_0x0504:
            double r6 = (double) r13
            double r4 = (double) r12
            double r16 = r6 / r4
            int r3 = r2.width
            double r0 = (double) r3
            int r2 = r2.height
            double r14 = (double) r2
            double r0 = r0 / r14
            double r16 = r16 - r0
            double r14 = java.lang.Math.abs(r16)
            double r4 = r4 / r6
            double r4 = r4 - r0
            double r0 = java.lang.Math.abs(r4)
            double r0 = java.lang.Math.min(r14, r0)
            r5 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0557
            int r4 = r11.A01
            if (r13 != r4) goto L_0x0530
            int r4 = r11.A00
            if (r12 == r4) goto L_0x0557
        L_0x0530:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "qrview/startpreview request layout to match preview size:"
            X.C36351kA.A1M(r4, r10, r5, r3)
            r5.append(r2)
            java.lang.String r2 = " (view is "
            X.C36351kA.A1M(r2, r10, r5, r13)
            r5.append(r12)
            java.lang.String r2 = ") aspect diff is "
            r5.append(r2)
            r5.append(r0)
            X.C36411kG.A1P(r5)
            android.os.Handler r1 = r11.A0J
            r0 = 35
            A00(r1, r11, r0)
            return
        L_0x0557:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "qrview/startpreview optimal preview size:"
            r1.append(r0)
            r1.append(r3)
            X.C36321k7.A1T(r10, r1, r2)
            android.hardware.Camera$CameraInfo r2 = new android.hardware.Camera$CameraInfo
            r2.<init>()
            r0 = 0
            android.hardware.Camera.getCameraInfo(r0, r2)     // Catch:{ RuntimeException -> 0x0570 }
            goto L_0x0576
        L_0x0570:
            r1 = move-exception
            java.lang.String r0 = "qrview/startpreview/getCameraInfo "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0576:
            int r1 = r2.facing
            r0 = 1
            boolean r4 = X.AnonymousClass000.A1S(r1, r0)
            int r5 = r2.orientation
            if (r9 == 0) goto L_0x058b
            if (r9 == r0) goto L_0x05bf
            r0 = 2
            if (r9 == r0) goto L_0x05bc
            r0 = 3
            r3 = 270(0x10e, float:3.78E-43)
            if (r9 == r0) goto L_0x058c
        L_0x058b:
            r3 = 0
        L_0x058c:
            int r0 = r5 - r3
            int r0 = r0 + 360
            if (r4 == 0) goto L_0x0598
            int r0 = r5 + r3
            int r0 = r0 % 360
            int r0 = 360 - r0
        L_0x0598:
            int r2 = r0 % 360
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "qrview/startpreview display:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " camera:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " preview:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " front:"
            X.C36321k7.A1X(r0, r1, r4)
            goto L_0x05c2
        L_0x05bc:
            r3 = 180(0xb4, float:2.52E-43)
            goto L_0x058c
        L_0x05bf:
            r3 = 90
            goto L_0x058c
        L_0x05c2:
            android.hardware.Camera r0 = r11.A03     // Catch:{ RuntimeException -> 0x05c8 }
            r0.setDisplayOrientation(r2)     // Catch:{ RuntimeException -> 0x05c8 }
            goto L_0x05ce
        L_0x05c8:
            r1 = move-exception
            java.lang.String r0 = "qrview/startpreview/setdisplayorientation "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x05ce:
            android.hardware.Camera$Size r0 = r11.A02
            int r1 = r0.width
            int r0 = r0.height
            r8.setPreviewSize(r1, r0)
            java.util.List r2 = r8.getSupportedFocusModes()
            if (r2 == 0) goto L_0x0649
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "qrview/startpreview supported focus:"
            r1.append(r0)
            java.lang.Object[] r0 = r2.toArray()
            java.lang.String r0 = java.util.Arrays.deepToString(r0)
            X.C36321k7.A1a(r1, r0)
            java.lang.String r1 = "auto"
            boolean r0 = r2.contains(r1)
            if (r0 != 0) goto L_0x0609
            java.lang.String r1 = "macro"
            boolean r0 = r2.contains(r1)
            if (r0 != 0) goto L_0x0609
            java.lang.String r1 = "edof"
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x060c
        L_0x0609:
            r8.setFocusMode(r1)
        L_0x060c:
            java.util.List r2 = r8.getSupportedFlashModes()
            if (r2 == 0) goto L_0x0646
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "qrview/startpreview supported flash:"
            r1.append(r0)
            java.lang.Object[] r0 = r2.toArray()
            java.lang.String r0 = java.util.Arrays.deepToString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
        L_0x0627:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r11.A0D = r0
            if (r2 == 0) goto L_0x064f
            java.lang.String r1 = "off"
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x063a
            r8.setFlashMode(r1)
        L_0x063a:
            java.lang.String r0 = "torch"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x064f
            r0 = 1
            r11.A0D = r0
            goto L_0x064f
        L_0x0646:
            java.lang.String r0 = "qrview/startpreview supported flash:null"
            goto L_0x0627
        L_0x0649:
            java.lang.String r0 = "qrview/startpreview supported focus:null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x060c
        L_0x064f:
            android.hardware.Camera r0 = r11.A03     // Catch:{ RuntimeException -> 0x0665 }
            r0.setParameters(r8)     // Catch:{ RuntimeException -> 0x0665 }
            android.hardware.Camera r0 = r11.A03     // Catch:{ RuntimeException -> 0x0665 }
            r0.startPreview()     // Catch:{ RuntimeException -> 0x0665 }
            android.hardware.Camera r1 = r11.A03     // Catch:{ RuntimeException -> 0x0665 }
            android.hardware.Camera$AutoFocusCallback r0 = r11.A0H     // Catch:{ RuntimeException -> 0x0665 }
            r1.autoFocus(r0)     // Catch:{ RuntimeException -> 0x0665 }
            goto L_0x0677
        L_0x0661:
            r1 = move-exception
            java.lang.String r18 = "qrview/startpreview/getParameters "
            goto L_0x0666
        L_0x0665:
            r1 = move-exception
        L_0x0666:
            r0 = r18
            com.whatsapp.util.Log.e(r0, r1)
            android.hardware.Camera r0 = r11.A03
            if (r0 == 0) goto L_0x0672
            r0.release()
        L_0x0672:
            r0 = 0
            r11.A03 = r0
            goto L_0x04ab
        L_0x0677:
            X.4UB r0 = r11.A07
            if (r0 == 0) goto L_0x0682
            android.os.Handler r1 = r11.A0J
            r0 = 37
            A00(r1, r11, r0)
        L_0x0682:
            r11.BoN()
            return
        L_0x0686:
            java.lang.Object r0 = r4.A00
            X.4X4 r0 = (X.AnonymousClass4X4) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.qrcode.QrScannerViewV2 r0 = (com.whatsapp.qrcode.QrScannerViewV2) r0
            X.4UB r0 = r0.A04
        L_0x0690:
            r0.BdY()
            return
        L_0x0694:
            java.lang.Object r2 = r4.A00
            com.whatsapp.qrcode.contactqr.QrScanCodeFragment r2 = (com.whatsapp.qrcode.contactqr.QrScanCodeFragment) r2
            boolean r0 = r2.A15()
            if (r0 == 0) goto L_0x06ad
            X.01z r1 = r2.A0k()
            com.whatsapp.qrcode.QrEducationDialogFragment r0 = new com.whatsapp.qrcode.QrEducationDialogFragment
            r0.<init>()
            X.C65443Sb.A02(r0, r1)
            r0 = 1
            r2.A05 = r0
        L_0x06ad:
            r0 = 1
            r2.A07 = r0
            return
        L_0x06b1:
            java.lang.Object r1 = r4.A00
            com.whatsapp.qrcode.contactqr.QrScanCodeFragment r1 = (com.whatsapp.qrcode.contactqr.QrScanCodeFragment) r1
            r0 = 0
            r1.A08 = r0
            com.whatsapp.qrcode.contactqr.QrScanCodeFragment.A03(r1)
            return
        L_0x06bc:
            java.lang.Object r0 = r4.A00
            com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment r0 = (com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment) r0
            X.1Nn r4 = r0.A06
            com.whatsapp.jid.UserJid r3 = r0.A0G
            java.lang.String r2 = r0.A0L
            java.lang.String r1 = r0.A0N
            X.3Nj r0 = new X.3Nj
            r0.<init>(r3, r2, r1)
            r4.A01(r0)
            return
        L_0x06d1:
            java.lang.Object r1 = r4.A00
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            return
        L_0x06d8:
            java.lang.Object r1 = r4.A00
            android.os.Handler r3 = X.C36341k9.A0H()
            r0 = 3
            X.3wX r2 = X.C81143wX.A00(r1, r0)
            r0 = 60
            r3.postDelayed(r2, r0)
            return
        L_0x06e9:
            java.lang.String r0 = "Show count must be greater than or equal to 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x06f0:
            android.hardware.Camera$AutoFocusCallback r0 = r0.A0H     // Catch:{ RuntimeException -> 0x06f6 }
            r1.autoFocus(r0)     // Catch:{ RuntimeException -> 0x06f6 }
            return
        L_0x06f6:
            r1 = move-exception
            java.lang.String r0 = "qrview/onAutoFocus error:"
            com.whatsapp.util.Log.w(r0, r1)
            return
        L_0x06fd:
            android.view.SurfaceHolder r0 = r2.A0L     // Catch:{ RuntimeException -> 0x070a, IOException -> 0x070c }
            r1.setPreviewDisplay(r0)     // Catch:{ RuntimeException -> 0x070a, IOException -> 0x070c }
            android.os.Handler r1 = r2.A04     // Catch:{ RuntimeException -> 0x070a, IOException -> 0x070c }
            r0 = 40
            A00(r1, r2, r0)     // Catch:{ RuntimeException -> 0x070a, IOException -> 0x070c }
            return
        L_0x070a:
            r1 = move-exception
            goto L_0x070d
        L_0x070c:
            r1 = move-exception
        L_0x070d:
            android.hardware.Camera r0 = r2.A03
            r0.release()
            r2.A03 = r3
            java.lang.String r0 = "qrview/startcamera "
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 1
            X.C37461mP.A00(r2, r0)
            return
        L_0x071e:
            r0.reconnect()     // Catch:{ IOException -> 0x0722 }
            goto L_0x0735
        L_0x0722:
            r1 = move-exception
            android.hardware.Camera r0 = r2.A03
            r0.release()
            r0 = 0
            r2.A03 = r0
            java.lang.String r0 = "qrview/startcamera error reconnecting camera"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 1
            X.C37461mP.A00(r2, r0)
            return
        L_0x0735:
            return
        L_0x0736:
            r0.release()     // Catch:{ Exception -> 0x073a }
            goto L_0x0740
        L_0x073a:
            r1 = move-exception
            java.lang.String r0 = "qrview/stopcamera error releaseing camera"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0740:
            r0 = 0
            r2.A03 = r0
            return
        L_0x0744:
            r2.removeCallbacks(r0)
        L_0x0747:
            android.hardware.Camera r0 = r2.A03     // Catch:{ RuntimeException -> 0x0754 }
            r0.cancelAutoFocus()     // Catch:{ RuntimeException -> 0x0754 }
            android.hardware.Camera r1 = r2.A03     // Catch:{ RuntimeException -> 0x0754 }
            android.hardware.Camera$AutoFocusCallback r0 = r2.A0H     // Catch:{ RuntimeException -> 0x0754 }
            r1.autoFocus(r0)     // Catch:{ RuntimeException -> 0x0754 }
            return
        L_0x0754:
            r1 = move-exception
            java.lang.String r0 = "qrview/autofocus failed"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81133wW.run():void");
    }

    public C81133wW(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
