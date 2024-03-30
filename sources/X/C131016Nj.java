package X;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

/* renamed from: X.6Nj  reason: invalid class name and case insensitive filesystem */
public class C131016Nj {
    public int A00;

    public void A02(String str, FloatBuffer floatBuffer) {
        int i = this.A00;
        if (i == -1) {
            throw C90514aH.A0s("The program has been released");
        } else if (i != -1) {
            int glGetAttribLocation = GLES20.glGetAttribLocation(i, str);
            if (glGetAttribLocation >= 0) {
                GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, floatBuffer);
                C112085dK.A00("setVertexAttribArray");
                return;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Could not locate '");
            A0u.append(str);
            throw C90464aC.A0U("' in program", A0u);
        } else {
            throw C90514aH.A0s("The program has been released");
        }
    }

    public C131016Nj() {
        int A002 = A00(35633, "varying vec2 interp_tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\n\nuniform mat4 texMatrix;\n\nvoid main() {\n    gl_Position = in_pos;\n    interp_tc = (texMatrix * in_tc).xy;\n}\n");
        int A003 = A00(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n");
        int glCreateProgram = GLES20.glCreateProgram();
        this.A00 = glCreateProgram;
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, A002);
            GLES20.glAttachShader(this.A00, A003);
            GLES20.glLinkProgram(this.A00);
            int[] iArr = {0};
            GLES20.glGetProgramiv(this.A00, 35714, iArr, 0);
            if (iArr[0] == 1) {
                GLES20.glDeleteShader(A002);
                GLES20.glDeleteShader(A003);
                C112085dK.A00("Creating GlShader");
                return;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("GlShader Could not link program: ");
            C36321k7.A1Z(A0u, GLES20.glGetProgramInfoLog(this.A00));
            throw C90514aH.A0s(GLES20.glGetProgramInfoLog(this.A00));
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("glCreateProgram() failed. GLES20 error: ");
        throw C90514aH.A0s(C36381kD.A10(A0u2, GLES20.glGetError()));
    }

    public int A01(String str) {
        int i = this.A00;
        if (i != -1) {
            int glGetUniformLocation = GLES20.glGetUniformLocation(i, str);
            if (glGetUniformLocation >= 0) {
                return glGetUniformLocation;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Could not locate uniform '");
            A0u.append(str);
            throw C90464aC.A0U("' in program", A0u);
        }
        throw C90514aH.A0s("The program has been released");
    }

    public static int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = {0};
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 1) {
                C112085dK.A00("compileShader");
                return glCreateShader;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("GlShader Could not compile shader ");
            A0u.append(i);
            A0u.append(":");
            C36321k7.A1Z(A0u, GLES20.glGetShaderInfoLog(glCreateShader));
            throw C90514aH.A0s(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("glCreateShader() failed. GLES20 error: ");
        throw C90514aH.A0s(C36381kD.A10(A0u2, GLES20.glGetError()));
    }
}
