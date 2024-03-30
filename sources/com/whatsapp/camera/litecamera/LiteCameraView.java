package com.whatsapp.camera.litecamera;

import X.AnonymousClass000;
import X.AnonymousClass1JD;
import X.AnonymousClass1QZ;
import X.AnonymousClass5RY;
import X.AnonymousClass5YG;
import X.AnonymousClass94V;
import X.AnonymousClass9EN;
import X.AnonymousClass9EO;
import X.AnonymousClass9GN;
import X.AnonymousClass9HW;
import X.AnonymousClass9W3;
import X.C112785eS;
import X.C1268165s;
import X.C140236lG;
import X.C157737eb;
import X.C157747ec;
import X.C160747lW;
import X.C161087m8;
import X.C18700tb;
import X.C195309Ts;
import X.C195409Ue;
import X.C19770wU;
import X.C198989eW;
import X.C203089nH;
import X.C204339pq;
import X.C20952A0j;
import X.C23063B2m;
import X.C23114B5t;
import X.C36341k9;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36441kJ;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.TextureView;
import android.widget.FrameLayout;
import java.io.File;
import java.util.List;
import java.util.Map;

public class LiteCameraView extends FrameLayout implements C161087m8, C18700tb {
    public C160747lW A00;
    public AnonymousClass1JD A01;
    public C19770wU A02;
    public AnonymousClass1QZ A03;
    public Runnable A04;
    public String A05;
    public List A06;
    public List A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final SharedPreferences A0C;
    public final C23114B5t A0D;
    public final C198989eW A0E;
    public final C23063B2m A0F;
    public final C157747ec A0G;
    public final C203089nH A0H;
    public final AnonymousClass9EN A0I;
    public final C195309Ts A0J;
    public volatile boolean A0K;

    public int getCameraType() {
        return 1;
    }

    public static LiteCameraView createCenterCropView(Context context, int i) {
        AnonymousClass5RY r0;
        TextureView textureView = new TextureView(context);
        C140236lG r7 = new C140236lG(true);
        boolean A002 = C112785eS.A00(context);
        Context applicationContext = context.getApplicationContext();
        if (A002) {
            r0 = AnonymousClass5RY.CAMERA2;
        } else {
            r0 = AnonymousClass5RY.CAMERA1;
        }
        C20952A0j a0j = new C20952A0j(applicationContext, textureView, new C204339pq(), AnonymousClass94V.A00(context, r0), r7, A002);
        a0j.A0F = true;
        return new LiteCameraView(context, i, a0j);
    }

    public static LiteCameraView createSimpleView(Context context, int i) {
        return new LiteCameraView(context, i, AnonymousClass5YG.A00(context, new TextureView(context)));
    }

    public void B2r() {
        C195409Ue r1 = this.A0E.A03;
        synchronized (r1) {
            r1.A00 = null;
        }
    }

    public void B7U(float f, float f2) {
        C23114B5t b5t = this.A0D;
        b5t.Bqx(new AnonymousClass9EO(this));
        b5t.B7T((int) f, (int) f2);
    }

    public boolean BLt() {
        return AnonymousClass000.A1O(this.A0D.B9I());
    }

    public boolean BMx() {
        return this.A0D.BMy();
    }

    public boolean BNS() {
        return "torch".equals(this.A05);
    }

    public void BQC() {
        C23114B5t b5t = this.A0D;
        if (b5t.BNQ()) {
            this.A0E.A00();
            b5t.BvR();
        }
    }

    public void Boh() {
        if (this.A0K) {
            C160747lW r0 = this.A00;
            if (r0 != null) {
                r0.BdY();
                return;
            }
            return;
        }
        Bok();
    }

    public void Bok() {
        C23114B5t b5t = this.A0D;
        b5t.Bq7(this.A0A);
        b5t.B0K(this.A0F);
        b5t.Brk(this.A0G);
        b5t.Bok();
        this.A0J.A01(10000);
    }

    public int Bso(int i) {
        C23114B5t b5t = this.A0D;
        b5t.Bsp(i);
        return b5t.BJN();
    }

    public void Buy(File file, int i) {
        this.A0D.Buz(this.A0I, file);
    }

    public void Bv8() {
        this.A0D.BvB(false);
    }

    public void BvW(C1268165s r4, boolean z) {
        AnonymousClass9GN r2 = new AnonymousClass9GN();
        r2.A01 = false;
        r2.A00 = false;
        r2.A01 = z;
        r2.A00 = true;
        this.A0D.BvU(r2, new AnonymousClass9HW(r4, this));
    }

    public void Bvw() {
        String str;
        if (this.A0B) {
            boolean BNS = BNS();
            C23114B5t b5t = this.A0D;
            if (BNS) {
                b5t.Bqt(0);
                str = "off";
            } else {
                b5t.Bqt(3);
                str = "torch";
            }
            this.A05 = str;
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A03;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public int getCameraApi() {
        return this.A0D.BNa() ? 1 : 0;
    }

    public int getMaxZoom() {
        return this.A0D.BDw();
    }

    public int getNumberOfCameras() {
        return C36371kC.A00(this.A0D.BNQ() ? 1 : 0);
    }

    public long getPictureResolution() {
        AnonymousClass9W3 r0 = this.A0H.A00;
        if (r0 != null) {
            return (long) (r0.A02 * r0.A01);
        }
        return 0;
    }

    public int getStoredFlashModeCount() {
        return C36371kC.A01(this.A0C, getFlashModesCountPrefKey());
    }

    public long getVideoResolution() {
        AnonymousClass9W3 r0 = this.A0H.A02;
        if (r0 != null) {
            return (long) (r0.A02 * r0.A01);
        }
        return 0;
    }

    public int getZoomLevel() {
        return this.A0D.BJN();
    }

    public void pause() {
        C23114B5t b5t = this.A0D;
        b5t.pause();
        b5t.Bnk(this.A0F);
        b5t.Brk((C157747ec) null);
        b5t.Bri((C157737eb) null);
        this.A0E.A00();
        this.A0K = false;
        this.A0J.A00();
    }

    public void setQrDecodeHints(Map map) {
        this.A0E.A03.A01 = map;
    }

    public void setQrScanningEnabled(boolean z) {
        if (z != this.A0A) {
            this.A0A = z;
            if (z) {
                C23114B5t b5t = this.A0D;
                C198989eW r1 = this.A0E;
                b5t.Bri(r1.A01);
                if (!r1.A08) {
                    r1.A03.A01();
                    r1.A08 = true;
                    return;
                }
                return;
            }
            this.A0E.A00();
            this.A0D.Bri((C157737eb) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ca, code lost:
        if (java.lang.Math.abs(1.0d - r1) <= 0.30000001192092896d) goto L_0x00cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LiteCameraView(android.content.Context r9, int r10, X.C23114B5t r11) {
        /*
            r8 = this;
            r8.<init>(r9)
            boolean r0 = r8.A09
            if (r0 != 0) goto L_0x0028
            r0 = 1
            r8.A09 = r0
            java.lang.Object r0 = r8.generatedComponent()
            X.1Qb r0 = (X.C27851Qb) r0
            X.1Qc r0 = (X.C27861Qc) r0
            X.0tq r1 = r0.A0M
            X.0tt r0 = r1.A00
            X.004 r0 = r0.A5x
            java.lang.Object r0 = r0.get()
            X.1JD r0 = (X.AnonymousClass1JD) r0
            r8.A01 = r0
            X.0wU r0 = X.C36341k9.A0Z(r1)
            r8.A02 = r0
        L_0x0028:
            java.lang.String r0 = "off"
            r8.A05 = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r8.A06 = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r8.A07 = r0
            X.A0h r0 = new X.A0h
            r0.<init>(r8)
            r8.A0F = r0
            r2 = 0
            X.9p2 r0 = new X.9p2
            r0.<init>(r8, r2)
            r8.A0G = r0
            X.9EN r0 = new X.9EN
            r0.<init>(r8)
            r8.A0I = r0
            X.0wU r1 = r8.A02
            X.9Ts r0 = new X.9Ts
            r0.<init>(r1)
            r8.A0J = r0
            java.lang.String r0 = X.C19430v1.A0A
            android.content.SharedPreferences r1 = r9.getSharedPreferences(r0, r2)
            r8.A0C = r1
            java.lang.String r0 = "camera_facing"
            int r0 = r1.getInt(r0, r2)
            r8.A0D = r11
            r11.Br3(r0)
            r0 = 2015(0x7df, float:2.824E-42)
            if (r10 < r0) goto L_0x0100
            r6 = 8388608(0x800000, float:1.17549435E-38)
            r5 = 2073600(0x1fa400, float:2.905732E-39)
        L_0x0073:
            java.lang.String r0 = "window"
            java.lang.Object r3 = r9.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r2 = r3.getDefaultDisplay()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x00f3
            android.view.WindowMetrics r0 = r3.getCurrentWindowMetrics()
            android.graphics.Rect r0 = r0.getBounds()
            int r1 = r0.width()
            int r0 = r0.height()
        L_0x0095:
            int r1 = r1 * r0
            float r7 = (float) r1
            r0 = 1241325568(0x49fd2000, float:2073600.0)
            float r1 = r7 / r0
            r0 = 1231093760(0x49610000, float:921600.0)
            float r7 = r7 / r0
            double r0 = (double) r1
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ef
            double r3 = r3 - r0
            double r3 = java.lang.Math.abs(r3)
            r1 = 4599075939685498880(0x3fd3333340000000, double:0.30000001192092896)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ef
            double r1 = (double) r7
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00cc
            double r3 = r3 - r1
            double r3 = java.lang.Math.abs(r3)
            r1 = 4599075939685498880(0x3fd3333340000000, double:0.30000001192092896)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 307200(0x4b000, float:4.30479E-40)
            if (r0 > 0) goto L_0x00cf
        L_0x00cc:
            r2 = 921600(0xe1000, float:1.291437E-39)
        L_0x00cf:
            r1 = 1
            X.9nH r0 = new X.9nH
            r0.<init>(r2, r6, r5, r1)
            r8.A0H = r0
            r11.BsG(r0)
            android.view.View r1 = r11.B9J(r9)
            r0 = -2
            r8.addView(r1, r0)
            X.9EM r1 = new X.9EM
            r1.<init>(r8)
            X.9eW r0 = new X.9eW
            r0.<init>(r1)
            r8.A0E = r0
            return
        L_0x00ef:
            r2 = 2073600(0x1fa400, float:2.905732E-39)
            goto L_0x00cf
        L_0x00f3:
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            r2.getRealMetrics(r0)
            int r1 = r0.widthPixels
            int r0 = r0.heightPixels
            goto L_0x0095
        L_0x0100:
            r0 = 2013(0x7dd, float:2.821E-42)
            r6 = 2097152(0x200000, float:2.938736E-39)
            r5 = 307200(0x4b000, float:4.30479E-40)
            if (r10 < r0) goto L_0x0073
            r6 = 5242880(0x500000, float:7.34684E-39)
            r5 = 921600(0xe1000, float:1.291437E-39)
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.litecamera.LiteCameraView.<init>(android.content.Context, int, X.B5t):void");
    }

    public static int A00(String str) {
        switch (str.hashCode()) {
            case 3551:
                if (str.equals("on")) {
                    return 1;
                }
                break;
            case 109935:
                if (str.equals("off")) {
                    return 0;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    return 2;
                }
                break;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Not able to map app flash mode: ");
        throw AnonymousClass000.A0c(str, A0u);
    }

    public static void A01(LiteCameraView liteCameraView) {
        List flashModes = liteCameraView.getFlashModes();
        SharedPreferences sharedPreferences = liteCameraView.A0C;
        if (C36371kC.A01(sharedPreferences, liteCameraView.getFlashModesCountPrefKey()) != flashModes.size()) {
            C36341k9.A0v(sharedPreferences.edit(), liteCameraView.getFlashModesCountPrefKey(), flashModes.size());
        }
    }

    private String getFlashModesCountPrefKey() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("flash_modes_count");
        return C36381kD.A10(A0u, this.A0D.B9I());
    }

    public boolean BLy() {
        return this.A0K;
    }

    public boolean BQ2() {
        if (!BLt() || this.A05.equals("off")) {
            return false;
        }
        return true;
    }

    public String BQD() {
        List flashModes = getFlashModes();
        if (flashModes.isEmpty()) {
            return "off";
        }
        int indexOf = flashModes.indexOf(this.A05);
        if (indexOf < 0) {
            indexOf = flashModes.indexOf("off");
        }
        String A0s = C36401kF.A0s(flashModes, (indexOf + 1) % flashModes.size());
        this.A05 = A0s;
        this.A0D.Bqt(A00(A0s));
        return this.A05;
    }

    public boolean BvN() {
        return this.A0B;
    }

    public String getFlashMode() {
        return this.A05;
    }

    public List getFlashModes() {
        if (BLt()) {
            return this.A07;
        }
        return this.A06;
    }

    public void setCameraCallback(C160747lW r1) {
        this.A00 = r1;
    }
}
