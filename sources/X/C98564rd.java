package X;

import android.opengl.Matrix;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4rd  reason: invalid class name and case insensitive filesystem */
public class C98564rd extends C141096mf implements C17570rd {
    public C131296Om A00;
    public C120865sD A01;
    public final AnonymousClass72N A02;
    public final Map A03;
    public final C118575oM A04;
    public final boolean A05;
    public final float[] A06;

    public void Bij(int i, int i2) {
    }

    public void Bil() {
        this.A00 = null;
        Map map = this.A03;
        Iterator A0z = AnonymousClass000.A0z(map);
        while (A0z.hasNext()) {
            ((AnonymousClass6TK) A0z.next()).A03();
        }
        map.clear();
    }

    public void BqB(AnonymousClass60K r1) {
    }

    public boolean isEnabled() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r2 != 36197) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r2 != 36197) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BWE(X.AnonymousClass6NG r7, long r8) {
        /*
            r6 = this;
            X.72N r5 = r6.A02
            boolean r3 = r5.A00
            X.67V r0 = r7.A01
            if (r0 == 0) goto L_0x0010
            int r2 = r0.A01
            r1 = 36197(0x8d65, float:5.0723E-41)
            r0 = 1
            if (r2 == r1) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r3 == r0) goto L_0x003f
            boolean r0 = r6.A05
            if (r0 != 0) goto L_0x0030
            java.util.Map r2 = r6.A03
            java.util.Iterator r1 = X.AnonymousClass000.A0z(r2)
        L_0x001d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r1.next()
            X.6TK r0 = (X.AnonymousClass6TK) r0
            r0.A03()
            goto L_0x001d
        L_0x002d:
            r2.clear()
        L_0x0030:
            X.67V r0 = r7.A01
            if (r0 == 0) goto L_0x003c
            int r2 = r0.A01
            r1 = 36197(0x8d65, float:5.0723E-41)
            r0 = 1
            if (r2 == r1) goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            r5.A00 = r0
        L_0x003f:
            r0 = 3042(0xbe2, float:4.263E-42)
            android.opengl.GLES20.glDisable(r0)
            r0 = 2929(0xb71, float:4.104E-42)
            android.opengl.GLES20.glDisable(r0)
            r0 = 2884(0xb44, float:4.041E-42)
            android.opengl.GLES20.glDisable(r0)
            X.6Om r1 = r6.A00
            java.lang.String r0 = "Called without a program factory"
            java.util.Objects.requireNonNull(r1, r0)
            java.util.Map r4 = r6.A03
            java.lang.Object r1 = r4.get(r5)
            X.6TK r1 = (X.AnonymousClass6TK) r1
            if (r1 != 0) goto L_0x0072
            int r3 = X.AnonymousClass5VZ.copy_vs
            int r2 = X.AnonymousClass5VZ.copy_fs
            X.6Om r1 = r6.A00
            boolean r0 = r5.A00
            X.6TK r1 = r1.A02(r3, r2, r0)
            X.72N r0 = r5.A00()
            r4.put(r0, r1)
        L_0x0072:
            X.6Ng r2 = r1.A02()
            float[] r1 = r7.A04
            java.lang.String r0 = "uSurfaceTransformMatrix"
            r2.A02(r0, r1)
            float[] r1 = r7.A05
            java.lang.String r0 = "uVideoTransformMatrix"
            r2.A02(r0, r1)
            float[] r1 = r7.A03
            java.lang.String r0 = "uSceneTransformMatrix"
            r2.A02(r0, r1)
            X.67V r1 = r7.A01
            if (r1 == 0) goto L_0x00a6
            java.lang.String r0 = "sTexture"
            r2.A01(r1, r0)
            X.5sD r1 = r6.A01
            X.6TK r0 = r2.A00
            X.AnonymousClass6TK.A01(r1, r0)
            java.lang.Object[] r1 = X.C90524aI.A0w()
            java.lang.String r0 = "copyRenderer::onDrawFrame"
            X.C200339hB.A02(r0, r1)
            r0 = 1
            return r0
        L_0x00a6:
            java.lang.String r0 = "MutableVideoFrame not initialized, missing rgbTexture"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98564rd.BWE(X.6NG, long):boolean");
    }

    public C98564rd(boolean z) {
        C118575oM r2 = new C118575oM(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.A04 = r2;
        this.A05 = z;
        this.A03 = AnonymousClass001.A0J();
        this.A02 = new AnonymousClass72N();
        float[] fArr = new float[16];
        this.A06 = fArr;
        Matrix.setIdentityM(fArr, 0);
        AnonymousClass62W r1 = new AnonymousClass62W();
        r1.A00 = 5;
        r1.A00(r2, "aPosition");
        this.A01 = C118575oM.A00(r1, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    }

    public void Bik(C131296Om r1) {
        this.A00 = r1;
    }

    public C98564rd() {
        this(false);
    }
}
