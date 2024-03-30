package X;

import android.opengl.Matrix;
import java.util.Map;

/* renamed from: X.6mh  reason: invalid class name and case insensitive filesystem */
public class C141116mh implements C160697lR {
    public int A00;
    public C131296Om A01;
    public boolean A02;
    public C120865sD A03;
    public final C118575oM A04;
    public final AnonymousClass72M A05;
    public final Map A06;
    public final float[] A07;

    public void Bij(int i, int i2) {
    }

    public void Bil() {
        this.A01 = null;
        this.A06.clear();
    }

    public void BqB(AnonymousClass60K r1) {
    }

    public boolean isEnabled() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r2 != 36197) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r2 != 36197) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BWE(X.AnonymousClass6NG r7, long r8) {
        /*
            r6 = this;
            r0 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r0)
            X.72M r5 = r6.A05
            boolean r3 = r5.A00
            X.67V r0 = r7.A01
            if (r0 == 0) goto L_0x0015
            int r2 = r0.A01
            r1 = 36197(0x8d65, float:5.0723E-41)
            r0 = 1
            if (r2 == r1) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r3 == r0) goto L_0x002c
            java.util.Map r0 = r6.A06
            r0.clear()
            X.67V r0 = r7.A01
            if (r0 == 0) goto L_0x0029
            int r2 = r0.A01
            r1 = 36197(0x8d65, float:5.0723E-41)
            r0 = 1
            if (r2 == r1) goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            r5.A00 = r0
        L_0x002c:
            r0 = 3042(0xbe2, float:4.263E-42)
            android.opengl.GLES20.glDisable(r0)
            r0 = 2929(0xb71, float:4.104E-42)
            android.opengl.GLES20.glDisable(r0)
            r0 = 2884(0xb44, float:4.041E-42)
            android.opengl.GLES20.glDisable(r0)
            X.6Om r0 = r6.A01
            if (r0 == 0) goto L_0x00d5
            java.util.Map r4 = r6.A06
            java.lang.Object r1 = r4.get(r5)
            X.6TK r1 = (X.AnonymousClass6TK) r1
            if (r1 != 0) goto L_0x0066
            int r1 = r6.A00
            r0 = 6
            if (r1 == r0) goto L_0x00b0
            r0 = 7
            if (r1 == r0) goto L_0x00a1
            X.6Om r3 = r6.A01
            r2 = 2132017179(0x7f14001b, float:1.967263E38)
            r1 = 2132017178(0x7f14001a, float:1.9672627E38)
            boolean r0 = r6.A02
            X.6TK r1 = r3.A02(r2, r1, r0)
        L_0x005f:
            X.72M r0 = r5.A00()
            r4.put(r0, r1)
        L_0x0066:
            X.6Ng r2 = r1.A02()
            float[] r1 = r7.A04
            java.lang.String r0 = "uSTMatrix"
            r2.A02(r0, r1)
            float[] r1 = r7.A05
            java.lang.String r0 = "uConstMatrix"
            r2.A02(r0, r1)
            float[] r1 = r7.A03
            java.lang.String r0 = "uSceneMatrix"
            r2.A02(r0, r1)
            float[] r1 = r7.A02
            java.lang.String r0 = "uContentTransform"
            r2.A02(r0, r1)
            X.67V r1 = r7.A01
            if (r1 == 0) goto L_0x00ce
            java.lang.String r0 = "sTexture"
            r2.A01(r1, r0)
            X.5sD r1 = r6.A03
            X.6TK r0 = r2.A00
            X.AnonymousClass6TK.A01(r1, r0)
            java.lang.Object[] r1 = X.C90524aI.A0w()
            java.lang.String r0 = "copyRenderer::onDrawFrame"
            X.C200339hB.A02(r0, r1)
            r0 = 1
            return r0
        L_0x00a1:
            X.6Om r3 = r6.A01     // Catch:{ Exception -> 0x00bf }
            r2 = 2132017210(0x7f14003a, float:1.9672692E38)
            r1 = 2132017205(0x7f140035, float:1.9672682E38)
            boolean r0 = r6.A02     // Catch:{ Exception -> 0x00bf }
            X.6TK r1 = r3.A02(r2, r1, r0)     // Catch:{ Exception -> 0x00bf }
            goto L_0x005f
        L_0x00b0:
            X.6Om r3 = r6.A01     // Catch:{ Exception -> 0x00bf }
            r2 = 2132017210(0x7f14003a, float:1.9672692E38)
            r1 = 2132017207(0x7f140037, float:1.9672686E38)
            boolean r0 = r6.A02     // Catch:{ Exception -> 0x00bf }
            X.6TK r1 = r3.A02(r2, r1, r0)     // Catch:{ Exception -> 0x00bf }
            goto L_0x005f
        L_0x00bf:
            X.6Om r3 = r6.A01
            r2 = 2132017179(0x7f14001b, float:1.967263E38)
            r1 = 2132017178(0x7f14001a, float:1.9672627E38)
            boolean r0 = r6.A02
            X.6TK r1 = r3.A02(r2, r1, r0)
            goto L_0x005f
        L_0x00ce:
            java.lang.String r0 = "MutableVideoFrame not initialized, missing rgbTexture"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x00d5:
            java.lang.String r0 = "cannot be null"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C141116mh.BWE(X.6NG, long):boolean");
    }

    public C141116mh(boolean z) {
        this.A02 = false;
        C118575oM r2 = new C118575oM(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.A04 = r2;
        this.A00 = 0;
        this.A06 = AnonymousClass001.A0J();
        this.A05 = new AnonymousClass72M();
        float[] fArr = new float[16];
        this.A07 = fArr;
        Matrix.setIdentityM(fArr, 0);
        AnonymousClass62W r1 = new AnonymousClass62W();
        r1.A00 = 5;
        r1.A00(r2, "aPosition");
        this.A03 = C118575oM.A00(r1, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        this.A02 = z;
    }

    public void Bik(C131296Om r1) {
        this.A01 = r1;
    }

    public C141116mh() {
        this(true);
    }
}
