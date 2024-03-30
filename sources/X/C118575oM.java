package X;

import java.nio.FloatBuffer;

/* renamed from: X.5oM  reason: invalid class name and case insensitive filesystem */
public class C118575oM {
    public final int A00;
    public final FloatBuffer A01;

    public C118575oM(float[] fArr) {
        int length = fArr.length;
        if (length % 2 == 0) {
            FloatBuffer asFloatBuffer = C90474aD.A0l(length * 4).asFloatBuffer();
            asFloatBuffer.put(fArr);
            this.A01 = (FloatBuffer) asFloatBuffer.position(0);
            this.A00 = 2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static C120865sD A00(AnonymousClass62W r2, float[] fArr) {
        r2.A00(new C118575oM(fArr), "aTextureCoord");
        return new C120865sD(r2);
    }
}
