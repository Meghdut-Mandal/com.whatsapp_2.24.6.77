package X;

import java.nio.FloatBuffer;

/* renamed from: X.6Mj  reason: invalid class name and case insensitive filesystem */
public class C130776Mj {
    public static final FloatBuffer A02;
    public static final FloatBuffer A03;
    public static final FloatBuffer A04;
    public static final FloatBuffer A05;
    public static final FloatBuffer A06;
    public static final FloatBuffer A07;
    public static final float[] A08;
    public static final float[] A09;
    public static final float[] A0A;
    public static final float[] A0B;
    public static final float[] A0C;
    public static final float[] A0D;
    public FloatBuffer A00 = A03;
    public FloatBuffer A01 = A02;

    static {
        float[] fArr = {0.0f, 0.57735026f, -0.5f, -0.28867513f, 0.5f, -0.28867513f};
        A0C = fArr;
        float[] fArr2 = {0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        A0D = fArr2;
        float[] fArr3 = C132866Vo.A00;
        FloatBuffer A0m = C90474aD.A0m(fArr, 24);
        A0m.position(0);
        A06 = A0m;
        FloatBuffer A0m2 = C90474aD.A0m(fArr2, 24);
        A0m2.position(0);
        A07 = A0m2;
        float[] fArr4 = {-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f};
        A0A = fArr4;
        float[] fArr5 = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        A0B = fArr5;
        FloatBuffer A0m3 = C90474aD.A0m(fArr4, 32);
        A0m3.position(0);
        A04 = A0m3;
        FloatBuffer A0m4 = C90474aD.A0m(fArr5, 32);
        A0m4.position(0);
        A05 = A0m4;
        float[] fArr6 = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        A08 = fArr6;
        float[] fArr7 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        A09 = fArr7;
        FloatBuffer A0m5 = C90474aD.A0m(fArr6, 32);
        A0m5.position(0);
        A02 = A0m5;
        FloatBuffer A0m6 = C90474aD.A0m(fArr7, 32);
        A0m6.position(0);
        A03 = A0m6;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[Drawable2d: ");
        A0u.append("FULL_RECTANGLE");
        return C90474aD.A0g(A0u);
    }
}
