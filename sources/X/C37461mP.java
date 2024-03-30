package X;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.1mP  reason: invalid class name and case insensitive filesystem */
public class C37461mP extends SurfaceView implements C88954Ur, C18700tb {
    public int A00;
    public int A01;
    public Camera.Size A02;
    public Camera A03;
    public Handler A04;
    public Handler A05;
    public C170688Ek A06;
    public AnonymousClass4UB A07;
    public AnonymousClass1QZ A08;
    public List A09;
    public Map A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public HandlerThread A0E;
    public HandlerThread A0F;
    public boolean A0G;
    public final Camera.AutoFocusCallback A0H;
    public final Camera.PreviewCallback A0I;
    public final Handler A0J;
    public final SurfaceHolder.Callback A0K;
    public final SurfaceHolder A0L;
    public final C198559dm A0M;
    public final Runnable A0N;

    public C37461mP(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A0B) {
            this.A0B = true;
            generatedComponent();
        }
        this.A0J = C36341k9.A0H();
        this.A0M = new C198559dm();
        this.A0C = false;
        C66903Xt r2 = new C66903Xt(this);
        this.A0K = r2;
        this.A0I = new AnonymousClass3WL(this);
        this.A0H = new AnonymousClass3WJ(this);
        this.A0N = new C81133wW((Object) this, 36);
        SurfaceHolder holder = getHolder();
        this.A0L = holder;
        holder.addCallback(r2);
    }

    public static void A00(C37461mP r3, int i) {
        if (r3.A07 != null) {
            r3.A0J.post(new C81293wm((Object) r3, i, 7));
        }
    }

    public boolean BNS() {
        Camera camera = this.A03;
        if (camera == null || !this.A0D) {
            return false;
        }
        boolean equals = "torch".equals(camera.getParameters().getFlashMode());
        this.A0G = equals;
        return equals;
    }

    public void BoN() {
        Handler handler = this.A04;
        if (handler != null) {
            C81133wW.A00(handler, this, 38);
        }
    }

    public void Bog() {
        Handler handler = this.A04;
        if (handler != null) {
            C81133wW.A00(handler, this, 42);
        }
    }

    public void BuR() {
        Log.i("qrview/startcameraPreview");
        Camera camera = this.A03;
        if (camera != null) {
            try {
                camera.startPreview();
            } catch (RuntimeException e) {
                Log.e("qrview/startCamerapreview ", e);
            }
        }
    }

    public void Bv5() {
        Log.i("qrview/stopcameraPreview");
        Camera camera = this.A03;
        if (camera != null) {
            try {
                camera.stopPreview();
            } catch (Exception e) {
                Log.w("qrview/stopcamera error stopping camera preview", e);
            }
        }
    }

    public void Bvw() {
        String str;
        Camera camera = this.A03;
        if (camera != null && this.A0D) {
            this.A0G = !this.A0G;
            Camera.Parameters parameters = camera.getParameters();
            if (this.A0G) {
                str = "torch";
            } else {
                str = "off";
            }
            parameters.setFlashMode(str);
            camera.setParameters(parameters);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A08;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public void onAttachedToWindow() {
        Log.i("qrview/onAttachedToWindow");
        super.onAttachedToWindow();
        HandlerThread handlerThread = new HandlerThread("QrScannerCamera");
        this.A0E = handlerThread;
        handlerThread.start();
        this.A04 = new Handler(this.A0E.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("QrScannerViewDecode");
        this.A0F = handlerThread2;
        handlerThread2.start();
        this.A05 = new Handler(this.A0F.getLooper());
        if (this.A0C) {
            C592833i r1 = new C592833i(getContext().getApplicationContext());
            AnonymousClass8CM r2 = r1.A01;
            r2.A00 = 256;
            this.A06 = new C170688Ek(new C170648Eg(r1.A00, r2));
        }
    }

    public void onDetachedFromWindow() {
        Log.i("qrview/onDetachedFromWindow");
        super.onDetachedFromWindow();
        HandlerThread handlerThread = this.A0E;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        HandlerThread handlerThread2 = this.A0F;
        if (handlerThread2 != null) {
            handlerThread2.quit();
        }
        C170688Ek r0 = this.A06;
        if (r0 != null) {
            r0.A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        if (r1 == 2) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r11 = r17
            r1 = r18
            r0 = r19
            super.onMeasure(r1, r0)
            r0 = 0
            r11.A01 = r0
            r11.A00 = r0
            int r14 = r11.getMeasuredWidth()
            int r13 = r11.getMeasuredHeight()
            android.hardware.Camera r0 = r11.A03
            java.lang.String r12 = "x"
            if (r0 == 0) goto L_0x00ce
            java.util.List r0 = r11.A09
            if (r0 == 0) goto L_0x00ce
            android.content.Context r0 = r11.getContext()
            android.view.WindowManager r0 = X.C21060yb.A01(r0)
            android.view.Display r0 = r0.getDefaultDisplay()
            int r1 = r0.getRotation()
            if (r1 == 0) goto L_0x0036
            r0 = 2
            r3 = 0
            if (r1 != r0) goto L_0x0037
        L_0x0036:
            r3 = 1
        L_0x0037:
            java.util.List r2 = r11.A09
            r1 = r14
            r0 = r13
            if (r3 == 0) goto L_0x003f
            r1 = r13
            r0 = r14
        L_0x003f:
            android.hardware.Camera$Size r10 = X.C1030553k.A01(r2, r1, r0)
            if (r10 == 0) goto L_0x00ce
            double r6 = (double) r14
            double r4 = (double) r13
            double r2 = r6 / r4
            int r0 = r10.width
            r16 = r0
            double r8 = (double) r0
            int r15 = r10.height
            double r0 = (double) r15
            double r8 = r8 / r0
            double r2 = r2 - r8
            double r2 = java.lang.Math.abs(r2)
            double r0 = r4 / r6
            double r0 = r0 - r8
            double r0 = java.lang.Math.abs(r0)
            double r0 = java.lang.Math.min(r2, r0)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r8 = "qrview/measure optimalpreviewsize:"
            r2 = r16
            X.C36351kA.A1M(r8, r12, r3, r2)
            r3.append(r15)
            java.lang.String r2 = " measured:"
            X.C36351kA.A1M(r2, r12, r3, r14)
            r3.append(r13)
            java.lang.String r2 = " aspect diff:"
            r3.append(r2)
            r3.append(r0)
            X.C36411kG.A1P(r3)
            r8 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x00ce
            r1 = 0
            if (r14 <= r13) goto L_0x0090
            r1 = 1
        L_0x0090:
            int r3 = r10.width
            int r2 = r10.height
            r0 = 0
            if (r3 <= r2) goto L_0x0098
            r0 = 1
        L_0x0098:
            java.lang.String r8 = "qrview/measure optimalpreviewsize scale:"
            if (r1 != r0) goto L_0x00cf
            double r0 = (double) r3
            double r6 = r6 / r0
            double r0 = (double) r2
            double r4 = r4 / r0
            double r2 = java.lang.Math.max(r6, r4)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0v(r8)
            r0.append(r2)
            X.C36411kG.A1P(r0)
            int r0 = r10.width
            double r0 = (double) r0
            double r0 = r0 * r2
            int r5 = (int) r0
            int r0 = r10.height
        L_0x00b5:
            double r0 = (double) r0
            double r2 = r2 * r0
            int r4 = (int) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "qrview/measure result:"
            r1.append(r0)
            r1.append(r5)
            X.C36321k7.A1T(r12, r1, r4)
            r11.A01 = r5
            r11.A00 = r4
            r11.setMeasuredDimension(r5, r4)
        L_0x00ce:
            return
        L_0x00cf:
            double r0 = (double) r2
            double r6 = r6 / r0
            double r0 = (double) r3
            double r4 = r4 / r0
            double r2 = java.lang.Math.max(r6, r4)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0v(r8)
            r0.append(r2)
            X.C36411kG.A1P(r0)
            int r0 = r10.height
            double r0 = (double) r0
            double r0 = r0 * r2
            int r5 = (int) r0
            int r0 = r10.width
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37461mP.onMeasure(int, int):void");
    }

    public boolean BvN() {
        return this.A0D;
    }

    public Camera.Size getPreviewSize() {
        return this.A02;
    }

    public void setQrDecodeHints(Map map) {
        this.A0A = map;
    }

    public void setQrScannerCallback(AnonymousClass4UB r1) {
        this.A07 = r1;
    }

    public void setShouldUseGoogleVisionScanner(boolean z) {
        this.A0C = z;
    }
}
