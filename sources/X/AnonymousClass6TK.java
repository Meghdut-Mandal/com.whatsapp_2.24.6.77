package X;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.6TK  reason: invalid class name */
public class AnonymousClass6TK {
    public int A00 = GLES20.glCreateProgram();
    public String A01;
    public String A02;
    public final Map A03 = AnonymousClass001.A0J();
    public final Map A04 = AnonymousClass001.A0J();
    public final Map A05 = AnonymousClass001.A0J();
    public final C130986Ng A06;

    public static void A01(C120865sD r13, AnonymousClass6TK r14) {
        int glGetAttribLocation;
        Map map = r13.A02;
        List list = r13.A01;
        for (int i = 0; i < list.size(); i++) {
            String A0s = C36401kF.A0s(list, i);
            Map map2 = r14.A05;
            if (map2.containsKey(A0s)) {
                glGetAttribLocation = C90474aD.A06(A0s, map2);
            } else {
                glGetAttribLocation = GLES20.glGetAttribLocation(r14.A00, A0s);
                if (glGetAttribLocation != -1) {
                    C36421kH.A1M(A0s, map2, glGetAttribLocation);
                } else {
                    Object[] A0L = AnonymousClass001.A0L();
                    A0L[0] = A0s;
                    throw AnonymousClass001.A09(String.format((Locale) null, "Vertex attribute location not found: %s", A0L));
                }
            }
            if (glGetAttribLocation != -1) {
                C118575oM r6 = (C118575oM) map.get(A0s);
                FloatBuffer floatBuffer = r6.A01;
                int position = floatBuffer.position();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glVertexAttribPointer(glGetAttribLocation, r6.A00, 5126, false, 0, floatBuffer.position(position));
                GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                floatBuffer.position(position);
            }
        }
        GLES20.glDrawArrays(r13.A00, 0, 4);
    }

    public C130986Ng A02() {
        int i = this.A00;
        if (i != 0) {
            GLES20.glUseProgram(i);
            Object[] A1Q = C36441kJ.A1Q();
            AnonymousClass000.A1L(A1Q, this.A00, 0);
            A1Q[1] = this.A02;
            A1Q[2] = this.A01;
            C200339hB.A02("gl.Program::use, programHandle=%d, vertexShaderSource=%s , fragmentShaderSource=%s", A1Q);
            return this.A06;
        }
        throw AnonymousClass001.A09("Program not initialized");
    }

    public void A03() {
        if (this.A00 != 0) {
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(35725, iArr, 0);
            if (this.A00 == iArr[0]) {
                GLES20.glUseProgram(0);
            }
            GLES20.glDeleteProgram(this.A00);
            this.A00 = 0;
        }
    }

    public AnonymousClass6TK(String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
        int glCreateShader = GLES20.glCreateShader(35633);
        int glCreateShader2 = GLES20.glCreateShader(35632);
        GLES20.glAttachShader(this.A00, glCreateShader);
        GLES20.glAttachShader(this.A00, glCreateShader2);
        A00(glCreateShader, str);
        A00(glCreateShader2, str2);
        GLES20.glLinkProgram(this.A00);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.A00, 35714, iArr, 0);
        if (iArr[0] != 0) {
            if (glCreateShader != 0) {
                GLES20.glDetachShader(this.A00, glCreateShader);
                GLES20.glDeleteShader(glCreateShader);
            }
            if (glCreateShader2 != 0) {
                GLES20.glDetachShader(this.A00, glCreateShader2);
                GLES20.glDeleteShader(glCreateShader2);
            }
            this.A06 = new C130986Ng(this);
            return;
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(this.A00);
        A03();
        throw C90514aH.A0s(AnonymousClass000.A0p("Failed to link program: ", glGetProgramInfoLog, AnonymousClass000.A0u()));
    }

    public static void A00(int i, String str) {
        if (C90504aG.A09(i, str) == 0) {
            String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(i);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Failed to compile shader:\n");
            A0u.append(glGetShaderInfoLog);
            throw C90514aH.A0s(AnonymousClass000.A0p("\n\n", str, A0u));
        }
    }
}
