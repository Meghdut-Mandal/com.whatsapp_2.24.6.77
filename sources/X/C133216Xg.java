package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLException;
import android.view.Surface;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.6Xg  reason: invalid class name and case insensitive filesystem */
public class C133216Xg {
    public int A00 = 0;
    public int A01;
    public EGLConfig A02;
    public EGLContext A03 = EGL14.EGL_NO_CONTEXT;
    public EGLDisplay A04 = EGL14.EGL_NO_DISPLAY;
    public C118565oL A05;
    public final int A06;
    public final Object A07;
    public final Map A08 = AnonymousClass001.A0J();

    public static EGLConfig A00(EGLDisplay eGLDisplay, int[] iArr, int i) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0) && (eGLConfig = eGLConfigArr[0]) != null) {
            return eGLConfig;
        }
        C200339hB.A01("eglChooseConfig");
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("unable to find EGL config with flags = ");
        A0u.append(i);
        throw new GLException(-1, AnonymousClass000.A0q(", no GL Errors", A0u));
    }

    public static EGLSurface A02(EGLConfig eGLConfig, Surface surface, C133216Xg r6) {
        int[] iArr = {12344};
        int i = r6.A00;
        if (!((i & 32) == 0 || (i & DefaultCrypto.BUFFER_SIZE) == 0 || EGL14.eglQueryString(r6.A04, 12373) == null || !EGL14.eglQueryString(r6.A04, 12373).contains("KHR_gl_colorspace") || EGL14.eglQueryString(r6.A04, 12373) == null || !EGL14.eglQueryString(r6.A04, 12373).contains("EXT_gl_colorspace_bt2020"))) {
            iArr = new int[]{12445, 13632, 12344};
        }
        if (surface.isValid()) {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(r6.A04, eGLConfig, surface, iArr, 0);
            C200339hB.A01("eglCreateWindowSurface");
            Objects.requireNonNull(eglCreateWindowSurface);
            return eglCreateWindowSurface;
        }
        throw new AnonymousClass78N(-1, "Surface is invalid while createWindowSurface");
    }

    public static EGLConfig A01(C133216Xg r20, int i) {
        int i2;
        C133216Xg r8 = r20;
        Map map = r8.A08;
        int i3 = i;
        Integer valueOf = Integer.valueOf(i3);
        if (map.containsKey(valueOf)) {
            return (EGLConfig) map.get(valueOf);
        }
        int i4 = 4;
        if ((i & 2) != 0) {
            i4 = 68;
        }
        int i5 = 0;
        if ((i3 & 4) != 0) {
            i5 = 16;
        }
        int i6 = i3 & 32;
        int i7 = 8;
        int i8 = 8;
        if (i6 != 0) {
            i7 = 2;
            i8 = 10;
        }
        if ((i3 & 8) != 0) {
            i7 = 0;
        }
        int[] iArr = new int[23];
        iArr[0] = 12324;
        iArr[1] = i8;
        iArr[2] = 12323;
        C90494aF.A1Q(iArr, i8);
        iArr[7] = i7;
        iArr[8] = 12325;
        iArr[9] = i5;
        iArr[10] = 12352;
        iArr[11] = i4;
        iArr[12] = 12344;
        iArr[13] = 0;
        iArr[14] = 12344;
        iArr[15] = 0;
        iArr[16] = 12344;
        iArr[17] = 0;
        iArr[18] = 12344;
        iArr[19] = 0;
        iArr[20] = 12344;
        iArr[21] = 0;
        iArr[22] = 12344;
        if ((i3 & 1) != 0) {
            iArr[20] = 12610;
            iArr[21] = 1;
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            iArr[16] = 12338;
            iArr[17] = 1;
            iArr[18] = 12337;
            iArr[19] = 4;
        }
        if ((i3 & 64) != 0) {
            iArr[14] = 12339;
            iArr[15] = 1;
        }
        if ((i3 & 128) != 0) {
            iArr[14] = 12339;
            iArr[15] = 4;
        }
        if (i6 == 0 || (i3 & ZipDecompressor.UNZIP_BUFFER_SIZE) == 0) {
            if ((i3 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
                iArr[12] = 12327;
                i2 = -1;
            } else if ((i3 & 512) != 0) {
                iArr[12] = 12327;
                i2 = 12368;
            } else if ((i3 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                iArr[12] = 12327;
                i2 = 12369;
            } else if ((i3 & 256) != 0) {
                iArr[12] = 12327;
                iArr[13] = 12344;
            }
            iArr[13] = i2;
        }
        try {
            EGLConfig A002 = A00(r8.A04, iArr, i3);
            if (!(i6 == 0 || (i3 & ZipDecompressor.UNZIP_BUFFER_SIZE) == 0)) {
                int[] iArr2 = new int[1];
                EGL14.eglGetConfigAttrib(r8.A04, A002, 12327, iArr2, 0);
                iArr[12] = 12327;
                iArr[13] = iArr2[0];
                A002 = A00(r8.A04, iArr, i3);
            }
            map.put(valueOf, A002);
            return A002;
        } catch (GLException e) {
            if (i9 != 0) {
                iArr[16] = 12344;
                iArr[17] = 0;
                iArr[18] = 12344;
                iArr[19] = 0;
                EGLConfig A003 = A00(r8.A04, iArr, i3);
                map.put(valueOf, A003);
                return A003;
            }
            throw e;
        }
    }

    private void A03(EGLContext eGLContext, int i) {
        String format;
        this.A00 = i;
        this.A04 = EGL14.eglGetDisplay(0);
        C200339hB.A01("eglGetDisplay");
        EGLDisplay eGLDisplay = this.A04;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eGLDisplay, iArr, 0, iArr, 1)) {
                EGLConfig A012 = A01(this, i);
                this.A02 = A012;
                int i2 = this.A06;
                EGLContext eglCreateContext = EGL14.eglCreateContext(this.A04, A012, eGLContext, new int[]{12440, i2, 12344}, 0);
                this.A03 = eglCreateContext;
                if (i2 == 3 && (eglCreateContext == null || eglCreateContext == EGL14.EGL_NO_CONTEXT || EGL14.eglGetError() != 12288)) {
                    this.A03 = EGL14.eglCreateContext(this.A04, this.A02, eGLContext, new int[]{12440, 2, 12344}, 0);
                    format = "eglCreateContext Version 2 fallback";
                } else {
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1L(objArr, i2, 0);
                    format = String.format((Locale) null, "eglCreateContext Version %d", objArr);
                }
                C200339hB.A01(format);
                Objects.requireNonNull(this.A03);
                C130126Jv r2 = C130126Jv.A02;
                C118565oL r1 = this.A05;
                synchronized (r2) {
                    if (r1 != null) {
                        r2.A01.add(r1);
                    }
                }
                int[] iArr2 = new int[1];
                EGL14.eglQueryContext(this.A04, this.A03, 12440, iArr2, 0);
                this.A01 = iArr2[0];
                return;
            }
            C200339hB.A01("eglInitialize");
            throw new GLException(-1, "unable to initialize EGL14, no GL Errors");
        }
        throw new IllegalStateException();
    }

    public static void A04(C133216Xg r2) {
        EGLDisplay eGLDisplay = r2.A04;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
    }

    public void A05() {
        synchronized (this.A07) {
            if (this.A04 != EGL14.EGL_NO_DISPLAY) {
                A04(this);
                EGL14.eglDestroyContext(this.A04, this.A03);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.A04);
            }
            this.A04 = EGL14.EGL_NO_DISPLAY;
            this.A03 = EGL14.EGL_NO_CONTEXT;
            this.A02 = null;
            this.A08.clear();
            this.A00 = 0;
            C118565oL r2 = this.A05;
            if (r2 != null) {
                C130126Jv r1 = C130126Jv.A02;
                synchronized (r1) {
                    r1.A01.remove(r2);
                }
                C118565oL r22 = this.A05;
                List list = r22.A00;
                list.remove(Integer.valueOf(hashCode()));
                if (list.isEmpty()) {
                    r22.A01.clear();
                }
                list.isEmpty();
            }
            this.A05 = null;
        }
    }

    public /* bridge */ /* synthetic */ void A06(int i) {
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        synchronized (this.A07) {
            A03(eGLContext, i);
        }
    }

    public /* bridge */ /* synthetic */ void A07(C133216Xg r3, int i) {
        this.A05 = r3.A05;
        EGLContext eGLContext = r3.A03;
        synchronized (this.A07) {
            A03(eGLContext, i);
        }
        C118565oL r0 = this.A05;
        if (r0 != null) {
            C90504aG.A10(hashCode(), r0.A00);
            return;
        }
        this.A05 = new C118565oL(this);
    }

    public C133216Xg(Object obj, int i) {
        this.A07 = obj;
        this.A05 = new C118565oL(this);
        this.A06 = i;
    }
}
