package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;

/* renamed from: X.6Vo  reason: invalid class name and case insensitive filesystem */
public abstract class C132866Vo {
    public static final float[] A00;

    static {
        float[] fArr = new float[16];
        A00 = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public static void A01(int i, String str) {
        if (i < 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Unable to locate '");
            A0u.append(str);
            throw C90464aC.A0U("' in program", A0u);
        }
    }

    public static int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        A02(AnonymousClass000.A0r("glCreateShader type=", AnonymousClass000.A0u(), i));
        if (C90504aG.A09(glCreateShader, str) != 0) {
            return glCreateShader;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Could not compile shader ");
        A0u.append(i);
        Log.e("Grafika", AnonymousClass000.A0q(":", A0u));
        StringBuilder A0u2 = AnonymousClass000.A0u();
        C36421kH.A1N(A0u2);
        Log.e("Grafika", AnonymousClass000.A0q(GLES20.glGetShaderInfoLog(glCreateShader), A0u2));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static void A02(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder A0v = AnonymousClass000.A0v(str);
            A0v.append(": glError 0x");
            String A0q = AnonymousClass000.A0q(Integer.toHexString(glGetError), A0v);
            Log.e("Grafika", A0q);
            throw C90514aH.A0s(A0q);
        }
    }
}
