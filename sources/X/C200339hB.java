package X;

import android.opengl.EGL14;
import android.opengl.GLES20;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.util.Locale;

/* renamed from: X.9hB  reason: invalid class name and case insensitive filesystem */
public abstract class C200339hB {
    public static String A00(String str, String str2, int i) {
        Object[] A1Z = C36431kI.A1Z(str, 3);
        AnonymousClass000.A1K(A1Z, i);
        A1Z[2] = str2;
        return String.format((Locale) null, "%s: GL error 0x%04x %s occurred, see logcat output", A1Z);
    }

    public static void A02(String str, Object... objArr) {
        boolean z = false;
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            z = true;
            i = glGetError;
        }
        if (z) {
            String format = String.format(str, objArr);
            switch (i) {
                case VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH /*1280*/:
                    throw new AnonymousClass84a(A00(format, "GL_INVALID_ENUM", i));
                case 1281:
                    throw new AnonymousClass84d(A00(format, "GL_INVALID_VALUE", i));
                case 1282:
                    throw new C1691384c(A00(format, "GL_INVALID_OPERATION", i));
                case 1285:
                    throw new C1691484e(A00(format, "GL_OUT_OF_MEMORY", i));
                case 1286:
                    throw new C1691284b(A00(format, "GL_INVALID_FRAMEBUFFER_OPERATION", i));
                default:
                    throw new AnonymousClass78N(i, A00(format, "UNKNOWN", i));
            }
        }
    }

    public static void A01(String str) {
        boolean z = false;
        int i = 12288;
        while (true) {
            int eglGetError = EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            z = true;
            i = eglGetError;
        }
        if (z) {
            switch (i) {
                case 12289:
                    throw new AnonymousClass84Z(A00(str, "EGL_NOT_INITIALIZED", i));
                case 12290:
                    throw new AnonymousClass84M(A00(str, "EGL_BAD_ACCESS", i));
                case 12291:
                    throw new AnonymousClass84N(A00(str, "EGL_BAD_ALLOC", i));
                case 12292:
                    throw new AnonymousClass84O(A00(str, "EGL_BAD_ATTRIBUTE", i));
                case 12293:
                    throw new AnonymousClass84P(A00(str, "EGL_BAD_CONFIG", i));
                case 12294:
                    throw new AnonymousClass84Q(A00(str, "EGL_BAD_CONTEXT", i));
                case 12295:
                    throw new AnonymousClass84R(A00(str, "EGL_BAD_CURRENT_SURFACE", i));
                case 12296:
                    throw new AnonymousClass84S(A00(str, "EGL_BAD_DISPLAY", i));
                case 12297:
                    throw new AnonymousClass84T(A00(str, "EGL_BAD_MATCH", i));
                case 12298:
                    throw new AnonymousClass84U(A00(str, "EGL_BAD_NATIVE_PIXMAP", i));
                case 12299:
                    throw new AnonymousClass84V(A00(str, "EGL_BAD_NATIVE_WINDOW", i));
                case 12300:
                    throw new AnonymousClass84W(A00(str, "EGL_BAD_PARAMETER", i));
                case 12301:
                    throw new AnonymousClass84X(A00(str, "EGL_BAD_SURFACE", i));
                case 12302:
                    throw new AnonymousClass84Y(A00(str, "EGL_CONTEXT_LOST", i));
                default:
                    throw new AnonymousClass78N(i, A00(str, "UNKNOWN", i));
            }
        }
    }
}
