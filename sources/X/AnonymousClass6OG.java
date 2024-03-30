package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6OG  reason: invalid class name */
public class AnonymousClass6OG {
    public static final float[] A05;
    public boolean A00;
    public boolean A01 = false;
    public C197489bn A02;
    public final C120865sD A03;
    public final Map A04 = AnonymousClass001.A0J();

    static {
        float[] fArr = new float[16];
        A05 = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public void A00() {
        Map map = this.A04;
        Iterator A0z = AnonymousClass000.A0z(map);
        while (A0z.hasNext()) {
            ((AnonymousClass6TK) A0z.next()).A03();
        }
        map.clear();
    }

    public void A01(AnonymousClass67V r21, C128806Dr r22, AnonymousClass9ST r23) {
        C131296Om r11 = r23.A04;
        C128806Dr r2 = r22;
        int i = r2.A00;
        int i2 = r2.A01;
        boolean z = r2.A05;
        int i3 = r2.A03;
        int i4 = r2.A02;
        float[] fArr = r2.A09;
        float[] fArr2 = r2.A07;
        float[] fArr3 = r2.A08;
        float[] fArr4 = r2.A06;
        C200339hB.A02("GlCoreCopyRenderer::renderFrame:err1 Already in error state entering renderAfterBind", new Object[0]);
        if (!z) {
            GLES20.glDisable(3042);
        } else {
            GLES20.glBlendFunc(1, 771);
            GLES20.glBlendEquation(32774);
            GLES20.glEnable(3042);
        }
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        C200339hB.A02("GlCoreCopyRenderer::renderFrame:err4", new Object[0]);
        GLES20.glViewport(0, 0, i3, i4);
        C200339hB.A02("GlCoreCopyRenderer::renderFrame:err4b glViewport", new Object[0]);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        C200339hB.A02("GlCoreCopyRenderer::renderFrame:err5a glClearColor", new Object[0]);
        GLES20.glClear(16640);
        C200339hB.A02("GlCoreCopyRenderer::renderFrame:err5b glClear", new Object[0]);
        AnonymousClass67V r5 = r21;
        boolean A1S = AnonymousClass000.A1S(r5.A01, 36197);
        int i5 = A1S ? 1 : 0;
        Map map = this.A04;
        Integer valueOf = Integer.valueOf(i5 + (i * 2) + (i2 * 100));
        AnonymousClass6TK r10 = (AnonymousClass6TK) map.get(valueOf);
        if (r10 == null) {
            if (i == -1) {
                r10 = r11.A03("#version 300 es\nprecision mediump float;\nuniform mat4 uTextureTransformMatrix;\nuniform mat4 uCropTransformMatrix;\nuniform mat4 uInContentTransformMatrix;\nuniform mat4 uContentTransformMatrix;\n\nin vec4 aPosition;\nin vec4 aTextureCoord;\n\nout vec2 vTextureCoord;\n\nvoid main() {\n  gl_Position = uContentTransformMatrix * uInContentTransformMatrix * aPosition;\n  vTextureCoord = (uTextureTransformMatrix * uCropTransformMatrix * aTextureCoord).xy;\n}", "#version 300 es\n\n#extension GL_OES_EGL_image_external : require\nprecision mediump float; // highp here doesn't seem to matter\n\nuniform samplerExternalOES sTexture;\n\nin vec2 vTextureCoord;\nout vec4 outColor;\n\n// Column-major matrix declarations; pre-multiply by input vectors\nconst mat3 P3_BT709 = mat3(1.22476, -0.0420633, -0.0196438, -0.224866, 1.04206, -0.00786447, 0, 0, 1.09854);\n\nhighp vec3 sRGB_EOTF_Inv(highp vec3 x) {\n    highp vec3 A = 12.92 * x;\n    highp vec3 B = 1.055 * pow(x, vec3(1.0 / 2.4)) - 0.055;\n    return mix(A, B, step(0.0031308, x));\n}\n\nhighp vec3 sRGB_EOTF(highp vec3 x) {\n    highp vec3 A = x / 12.92;\n    highp vec3 B = pow((x + 0.055) / 1.055, vec3(2.4));\n    return mix(A, B, step(0.04045, x));\n}\n\nvoid main() {\n  highp vec3 srcRGB = texture(sTexture, vTextureCoord).xyz;\n\n  // Display P3 RGB non-linear to Display P3 RGB display linear\n  highp vec3 rgb_P3_displayLinear = sRGB_EOTF(srcRGB);\n\n  // Display P3 RGB display linear -> BT.709 display linear\n  highp vec3 rgb_BT709_displayLinear = P3_BT709 * rgb_P3_displayLinear;\n\n  // Color gamut compression\n  rgb_BT709_displayLinear = clamp(rgb_BT709_displayLinear, 0., 1.);\n\n  // BT.709 display linear -> BT.709 non-linear\n  highp vec3 rgb_BT709_sRGB = sRGB_EOTF_Inv(rgb_BT709_displayLinear);\n\n  outColor = vec4(rgb_BT709_sRGB, 1.0);\n}\n", A1S);
            } else if (i != 6) {
                if (i != 7) {
                    if (A1S) {
                        try {
                            if (this.A01 || i2 == 9) {
                                r10 = r11.A02(R.raw.passthrough_300_vs, R.raw.bt709_yuv_to_rgb_sampler_fs, true);
                            }
                        } catch (Exception unused) {
                            r10 = r11.A02(R.raw.passthrough_vs, R.raw.passthrough_fs, A1S);
                        }
                    }
                    r10 = r11.A02(R.raw.passthrough_vs, R.raw.passthrough_fs, A1S);
                } else if (A1S) {
                    if (i2 == 3) {
                        r10 = r11.A02(R.raw.passthrough_300_vs, AnonymousClass5VZ.wrapping_tonemap_hlg_fs, true);
                        GLES20.glUniform1f(C130986Ng.A00(r10.A02(), "alpha"), 1.0f);
                    } else {
                        r10 = r11.A02(AnonymousClass5VZ.hdr_yuv_to_rgb_sampler_vs, AnonymousClass5VZ.hdr_yuv_to_rgb_sampler_fs, true);
                    }
                } else if (i2 == 3) {
                    r10 = r11.A02(R.raw.passthrough_300_vs, AnonymousClass5VZ.bt2020_rgb_to_bt709, false);
                    GLES20.glUniform1f(C130986Ng.A00(r10.A02(), "alpha"), 1.0f);
                } else {
                    r10 = r11.A02(R.raw.passthrough_vs, R.raw.passthrough_fs, false);
                }
            } else if (i2 == 3) {
                r10 = r11.A02(AnonymousClass5VZ.wrapping_tonemap_pq_vs, AnonymousClass5VZ.wrapping_tonemap_pq_fs, A1S);
            } else if (i2 == 7) {
                r10 = r11.A02(AnonymousClass5VZ.wrapping_tonemap_pq_vs, AnonymousClass5VZ.wrapping_tonemap_pq_to_hlg_fs, A1S);
            } else {
                r10 = r11.A02(AnonymousClass5VZ.hdr_yuv_to_rgb_sampler_vs, AnonymousClass5VZ.hdr_yuv_to_rgb_sampler_fs, A1S);
            }
            map.put(valueOf, r10);
        }
        C200339hB.A02("GlCoreCopyRenderer::renderFrame:err6", new Object[0]);
        try {
            C120875sE r0 = r5.A02;
            int i6 = r0.A01;
            int i7 = r0.A00;
            if (this.A00) {
                Object[] objArr = new Object[4];
                C36331k8.A1X(objArr, i6, 0, i7, 1);
                AnonymousClass000.A1L(objArr, i3, 2);
                AnonymousClass000.A1L(objArr, i4, 3);
                AnonymousClass6YR.A04("GlCoreCopyRenderer", String.format("input=%dx%d output=%dx%d", objArr));
            }
            C130986Ng A022 = r10.A02();
            A022.A02("uTextureTransformMatrix", fArr);
            A022.A02("uCropTransformMatrix", fArr2);
            A022.A02("uInContentTransformMatrix", fArr3);
            A022.A02("uContentTransformMatrix", fArr4);
            A022.A01(r5, "sTexture");
            AnonymousClass6TK r24 = A022.A00;
            if (GLES20.glGetUniformLocation(r24.A00, "uMaxContentLuminance") != -1) {
                GLES20.glUniform1f(C130986Ng.A00(A022, "uMaxContentLuminance"), 1000.0f);
            }
            AnonymousClass6TK.A01(this.A03, r24);
            Object[] A0M = AnonymousClass001.A0M();
            AnonymousClass000.A1L(A0M, r5.A01, 0);
            AnonymousClass000.A1L(A0M, r5.A00, 1);
            C200339hB.A02("GlCoreCopyRenderer::renderFrame: textureTarget: %s textureHandle: %s", A0M);
        } catch (AnonymousClass78N e) {
            AnonymousClass78N r02 = new AnonymousClass78N(e.mLastErrorCode, C36331k8.A0i("GlCoreCopyRenderer", AnonymousClass000.A0u(), e));
            r02.initCause(e);
            throw r02;
        }
    }

    public AnonymousClass6OG(C197489bn r6) {
        AnonymousClass62W r3 = new AnonymousClass62W();
        r3.A00 = 5;
        r3.A00(new C118575oM(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}), "aPosition");
        this.A03 = C118575oM.A00(r3, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        this.A02 = r6;
        boolean z = false;
        Object obj = r6.A00.get(C197489bn.A05);
        this.A00 = AnonymousClass000.A1X(obj != null ? obj : z);
    }
}
