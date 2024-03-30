package X;

import android.opengl.Matrix;

/* renamed from: X.6NG  reason: invalid class name */
public class AnonymousClass6NG {
    public static final float[] A06;
    public long A00;
    public AnonymousClass67V A01 = null;
    public float[] A02;
    public float[] A03;
    public float[] A04;
    public float[] A05;

    public AnonymousClass6NG() {
        float[] fArr = A06;
        this.A04 = fArr;
        this.A05 = fArr;
        this.A03 = fArr;
    }

    static {
        float[] fArr = new float[16];
        A06 = fArr;
        Matrix.setIdentityM(fArr, 0);
    }
}
