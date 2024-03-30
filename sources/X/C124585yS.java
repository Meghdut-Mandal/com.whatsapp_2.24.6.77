package X;

import android.opengl.GLES20;
import android.util.Log;

/* renamed from: X.5yS  reason: invalid class name and case insensitive filesystem */
public class C124585yS {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public float[] A08 = new float[9];
    public float[] A09;

    public C124585yS() {
        int A002;
        int A003 = C132866Vo.A00(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n");
        int i = 0;
        if (!(A003 == 0 || (A002 = C132866Vo.A00(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n")) == 0)) {
            int glCreateProgram = GLES20.glCreateProgram();
            C132866Vo.A02("glCreateProgram");
            if (glCreateProgram == 0) {
                Log.e("Grafika", "Could not create program");
            }
            GLES20.glAttachShader(glCreateProgram, A003);
            C132866Vo.A02("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, A002);
            C132866Vo.A02("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                Log.e("Grafika", "Could not link program: ");
                Log.e("Grafika", GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
            } else {
                i = glCreateProgram;
            }
        }
        this.A00 = i;
        if (i != 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Created program ");
            A0u.append(i);
            A0u.append(" (");
            A0u.append("TEXTURE_EXT");
            Log.d("Grafika", C90474aD.A0f(A0u));
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.A00, "aPosition");
            this.A01 = glGetAttribLocation;
            C132866Vo.A01(glGetAttribLocation, "aPosition");
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.A00, "aTextureCoord");
            this.A02 = glGetAttribLocation2;
            C132866Vo.A01(glGetAttribLocation2, "aTextureCoord");
            int glGetUniformLocation = GLES20.glGetUniformLocation(this.A00, "uMVPMatrix");
            this.A05 = glGetUniformLocation;
            C132866Vo.A01(glGetUniformLocation, "uMVPMatrix");
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.A00, "uTexMatrix");
            this.A06 = glGetUniformLocation2;
            C132866Vo.A01(glGetUniformLocation2, "uTexMatrix");
            int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.A00, "uKernel");
            this.A04 = glGetUniformLocation3;
            if (glGetUniformLocation3 < 0) {
                this.A04 = -1;
                this.A07 = -1;
                this.A03 = -1;
                return;
            }
            int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.A00, "uTexOffset");
            this.A07 = glGetUniformLocation4;
            C132866Vo.A01(glGetUniformLocation4, "uTexOffset");
            int glGetUniformLocation5 = GLES20.glGetUniformLocation(this.A00, "uColorAdjust");
            this.A03 = glGetUniformLocation5;
            C132866Vo.A01(glGetUniformLocation5, "uColorAdjust");
            System.arraycopy(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f}, 0, this.A08, 0, 9);
            float f = 1.0f / ((float) 256);
            float[] fArr = new float[18];
            float f2 = -f;
            fArr[0] = f2;
            fArr[1] = f2;
            fArr[2] = 0.0f;
            fArr[3] = f2;
            fArr[4] = f;
            fArr[5] = f2;
            C90494aF.A1P(fArr, f2, 0.0f);
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f;
            fArr[11] = 0.0f;
            fArr[12] = f2;
            fArr[13] = f;
            fArr[14] = 0.0f;
            fArr[15] = f;
            fArr[16] = f;
            fArr[17] = f;
            this.A09 = fArr;
            return;
        }
        throw C90514aH.A0s("Unable to create program");
    }
}
