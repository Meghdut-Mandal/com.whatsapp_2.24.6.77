package X;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES10;
import android.opengl.GLES20;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.5AN  reason: invalid class name */
public final class AnonymousClass5AN extends C146036uv {
    public final C119315pc A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5AN(X.C20050ww r13, X.C119315pc r14, X.C19420v0 r15, X.C20810yC r16, X.AnonymousClass005 r17, java.lang.String r18, X.AnonymousClass004 r19, X.AnonymousClass004 r20) {
        /*
            r12 = this;
            r1 = r13
            r2 = r15
            r3 = r16
            r5 = r17
            r9 = r19
            X.C36321k7.A1B(r3, r13, r15, r5, r9)
            r0 = 6
            r8 = r20
            X.AnonymousClass00C.A0D(r8, r0)
            r10 = 5799866010102237(0x149af28946e9dd, double:2.8655145460738555E-308)
            r4 = 0
            r0 = r12
            r6 = r18
            r7 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.A00 = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5AN.<init>(X.0ww, X.5pc, X.0v0, X.0yC, X.005, java.lang.String, X.004, X.004):void");
    }

    public static void A00(Object obj, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        jSONObject.put(str, obj);
        jSONObject2.put("variables", jSONObject);
    }

    public void A08(JSONObject jSONObject) {
        Map map;
        RuntimeException runtimeException;
        String str;
        JSONObject A0q = C90464aC.A0q(jSONObject);
        C119315pc r4 = this.A00;
        JSONObject A1B = C36441kJ.A1B();
        if (r4.A00 == null) {
            throw C36331k8.A0d("capabilityGetter");
        } else if (r4.A01 != null) {
            ArrayList A0I = AnonymousClass001.A0I();
            A0I.add("faceTracker");
            A0I.add("worldTracker");
            A0I.add("halfFloatRenderPass");
            A0I.add("depthShaderRead");
            A0I.add("multipleRenderTargets");
            A0I.add("vertexTextureFetch");
            A1B.put("manifest_capabilities", new JSONArray(A0I));
            if (C113935gN.A02.contains(Build.MODEL)) {
                map = AnonymousClass001.A0J();
            } else {
                if (C113935gN.A00 == null) {
                    C113935gN.A00 = AnonymousClass001.A0J();
                    try {
                        C120575rj r7 = null;
                        if (((EGL10) EGLContext.getEGL()).eglGetCurrentContext().equals(EGL10.EGL_NO_CONTEXT)) {
                            AnonymousClass6O5 r6 = new AnonymousClass6O5();
                            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(r6.A02, r6.A00, new int[]{12375, 1, 12374, 1, 12344}, 0);
                            int eglGetError = EGL14.eglGetError();
                            if (eglGetError != 12288) {
                                StringBuilder A0v = AnonymousClass000.A0v("eglCreatePbufferSurface");
                                A0v.append(": EGL error: 0x");
                                runtimeException = C90464aC.A0U(Integer.toHexString(eglGetError), A0v);
                            } else if (eglCreatePbufferSurface != null) {
                                if (r6.A02 == EGL14.EGL_NO_DISPLAY) {
                                    Log.i("MsqrdEglCore", "NOTE: makeCurrent w/o display");
                                }
                                if (EGL14.eglMakeCurrent(r6.A02, eglCreatePbufferSurface, eglCreatePbufferSurface, r6.A01)) {
                                    r7 = new C120575rj(eglCreatePbufferSurface, r6);
                                } else {
                                    runtimeException = C90514aH.A0s("eglMakeCurrent failed");
                                }
                            } else {
                                runtimeException = C90514aH.A0s("surface was null");
                            }
                            throw runtimeException;
                        }
                        int[] iArr = new int[1];
                        GLES20.glGetIntegerv(34466, iArr, 0);
                        int i = iArr[0];
                        int[] iArr2 = new int[i];
                        GLES20.glGetIntegerv(34467, iArr2, 0);
                        int i2 = 0;
                        while (true) {
                            if (i2 >= i) {
                                break;
                            } else if (iArr2[i2] == 37496) {
                                C113935gN.A00.put("etc2_compression", true);
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (GLES10.glGetString(7939).contains("GL_IMG_texture_compression_pvrtc")) {
                            C113935gN.A00.put("pvr_compression", true);
                        }
                        if (r7 != null) {
                            AnonymousClass6O5 r62 = r7.A01;
                            EGLDisplay eGLDisplay = r62.A02;
                            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                            if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                                EGL14.eglDestroySurface(r62.A02, r7.A00);
                                r62.A00();
                            } else {
                                runtimeException = C90514aH.A0s("eglMakeCurrent failed");
                                throw runtimeException;
                            }
                        }
                    } catch (Throwable th) {
                        Log.e("SDKInfo", "Error while checking for capabilities", th);
                    }
                }
                map = C113935gN.A00;
            }
            AnonymousClass00C.A08(map);
            Iterator A10 = AnonymousClass000.A10(map);
            while (true) {
                if (!A10.hasNext()) {
                    str = "UNCOMPRESSED";
                    break;
                }
                String A0C = AnonymousClass001.A0C(A10);
                if (AnonymousClass098.A07(A0C, "etc", false)) {
                    str = "ETC";
                } else if (AnonymousClass098.A07(A0C, "pvr", false)) {
                    str = "PVR";
                } else if (AnonymousClass098.A07(A0C, "astc", false)) {
                    str = "ASTC";
                } else {
                    str = "";
                }
                if (str.length() > 0) {
                    break;
                }
            }
            A1B.put("texture_compression", str);
            if (r4.A00 != null) {
                String[] strArr = C112765eQ.A00;
                Pair A0Q = C36441kJ.A0Q(Double.valueOf(Double.parseDouble(strArr[0])), Double.valueOf(Double.parseDouble(strArr[40])));
                JSONObject A1B2 = C36441kJ.A1B();
                Object obj = A0Q.first;
                AnonymousClass00C.A07(obj);
                A1B2.put("min_version", C90504aG.A01(obj));
                Object obj2 = A0Q.second;
                AnonymousClass00C.A07(obj2);
                A1B2.put("max_version", C90504aG.A01(obj2));
                A1B.put("supported_sdk_versions", A1B2);
                A0q.put("device_capabilities", A1B);
                A0q.put("product_surface", "VIDEO_CALLING");
                A0q.put("effect_categories", new JSONArray(C36371kC.A11("PERSONALIZED_AVATAR")));
                A0q.put("delivery_tier", this.A03.A09(3076));
                A0q.put("page_size", 1);
                A00(new JSONArray(C36381kD.A13("NONE", "ZIP")), "supported_compression_types", A0q, jSONObject);
                return;
            }
            throw C36331k8.A0d("capabilityGetter");
        } else {
            throw C36331k8.A0d("waContext");
        }
    }
}
