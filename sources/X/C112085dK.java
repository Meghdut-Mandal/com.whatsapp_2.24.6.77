package X;

import android.opengl.GLES20;

/* renamed from: X.5dK  reason: invalid class name and case insensitive filesystem */
public abstract class C112085dK {
    public static void A00(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            throw C90514aH.A0s(AnonymousClass000.A0r(": GLES20 error: ", AnonymousClass000.A0v(str), glGetError));
        }
    }
}
