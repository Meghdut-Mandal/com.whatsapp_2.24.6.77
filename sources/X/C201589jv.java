package X;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.9jv  reason: invalid class name and case insensitive filesystem */
public class C201589jv {
    public static final Map A0G = C165607th.A12();
    public Handler A00;
    public final int A01;
    public final Context A02;
    public final C191169Bx A03;
    public final C133216Xg A04;
    public final C133216Xg A05;
    public final C197489bn A06;
    public final C204329pp A07;
    public final AnonymousClass9VB A08 = new AnonymousClass9VB();
    public final Object A09 = C36441kJ.A11();
    public final boolean A0A;
    public final boolean A0B;
    public final AnonymousClass94S A0C;
    public volatile Looper A0D;
    public volatile AnonymousClass9ST A0E;
    public volatile boolean A0F;

    public static void A00(C201589jv r8) {
        AnonymousClass9ST r6 = r8.A0E;
        if (r6 != null) {
            try {
                List list = r8.A08.A00;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((C23064B2n) list.get(i)).B5N();
                }
                if (!r6.A01) {
                    r6.A01 = true;
                    C195909Wt r7 = r6.A06;
                    AnonymousClass6OG r0 = r7.A02;
                    if (r0 != null) {
                        r0.A00();
                    }
                    HashMap hashMap = r7.A03;
                    Iterator A10 = C36371kC.A10(hashMap);
                    while (A10.hasNext()) {
                        Map.Entry A11 = AnonymousClass000.A11(A10);
                        ((C23064B2n) A11.getValue()).B5N();
                        ((C23064B2n) A11.getValue()).release();
                    }
                    hashMap.clear();
                    r7.A00 = null;
                    C133216Xg r3 = r6.A02;
                    synchronized (r3.A07) {
                        C133216Xg.A04(r3);
                    }
                    C1263663q r2 = r6.A03;
                    EGLSurface eGLSurface = r2.A00;
                    if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(r2.A01.A04, eGLSurface);
                    }
                    r2.A00 = EGL14.EGL_NO_SURFACE;
                    r3.A05();
                    C133216Xg r02 = r6.A00;
                    if (r02 != null) {
                        r02.A05();
                    }
                }
            } catch (Throwable th) {
                try {
                    A01(r8, "GlHostImpl.detachGlContext() failed.", th);
                } catch (Throwable th2) {
                    r8.A0E = null;
                    r8.A0F = false;
                    A0G.remove(r8.A00.getLooper());
                    throw th2;
                }
            }
            r8.A0E = null;
            r8.A0F = false;
            A0G.remove(r8.A00.getLooper());
        }
    }

    public static void A01(C201589jv r4, String str, Throwable th) {
        C21814Aaq aaq = new C21814Aaq(str, th);
        C1690483a r2 = r4.A03.A00;
        AnonymousClass88Q r1 = new AnonymousClass88Q(aaq);
        if (r2.A06 != null) {
            Log.e("CameraProcessor/mediaGraphErrorCallback");
        }
        C1690483a.A01(r2, r1);
    }

    public AnonymousClass9ST A02() {
        AnonymousClass9ST r2;
        synchronized (this.A09) {
            r2 = null;
            C201589jv r0 = (C201589jv) A0G.get(Looper.myLooper());
            if (r0 != null) {
                r2 = r0.A0E;
            }
            Objects.requireNonNull(r2);
        }
        return r2;
    }

    public void A03(C23064B2n b2n) {
        Object obj = this.A09;
        AnonymousClass9VB r2 = this.A08;
        if (b2n != null) {
            synchronized (obj) {
                try {
                    if (!r2.A00.contains(b2n)) {
                        b2n.BKM(this);
                        AnonymousClass9ST r1 = this.A0E;
                        if (r1 != null && A05()) {
                            b2n.B1T(r1);
                        }
                        r2.A01(b2n);
                    }
                } catch (Throwable th) {
                    A01(this, "GlHostImpl.attach() failed.", th);
                }
            }
        }
    }

    public void A04(C23064B2n b2n) {
        Object obj = this.A09;
        AnonymousClass9VB r0 = this.A08;
        if (b2n != null) {
            synchronized (obj) {
                try {
                    if (r0.A02(b2n) && this.A0E != null) {
                        b2n.B5N();
                    }
                } catch (Throwable th) {
                    A01(this, "GlHostImpl.detach() failed.", th);
                }
            }
        }
    }

    public boolean A05() {
        boolean z;
        synchronized (this.A09) {
            AnonymousClass9ST r0 = this.A0E;
            Looper looper = this.A0D;
            if (r0 == null || (this.A0F && looper != Looper.myLooper())) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public C201589jv(Context context, Looper looper, C191169Bx r7, C133216Xg r8, C197489bn r9, AnonymousClass94S r10) {
        this.A02 = context;
        this.A06 = r9;
        AnonymousClass94R r0 = C197489bn.A06;
        Object A0n = C36371kC.A0n();
        Map map = r9.A00;
        Object obj = map.get(r0);
        int A0I = AnonymousClass000.A0I(obj != null ? obj : A0n);
        this.A01 = A0I;
        AnonymousClass94R r02 = C197489bn.A02;
        Object obj2 = C198039cn.A05;
        Object obj3 = map.get(r02);
        this.A04 = AnonymousClass6UN.A01(obj3 != null ? obj3 : obj2, A0I);
        this.A05 = r8;
        this.A03 = r7;
        this.A00 = new Handler(looper);
        this.A0D = looper;
        AnonymousClass94R r03 = C197489bn.A01;
        Object A0j = C36381kD.A0j();
        Object obj4 = map.get(r03);
        this.A0A = AnonymousClass000.A1X(obj4 != null ? obj4 : A0j);
        AnonymousClass94R r04 = C197489bn.A08;
        Object A0m = C36371kC.A0m();
        Object obj5 = map.get(r04);
        this.A0B = AnonymousClass000.A1X(obj5 != null ? obj5 : A0m);
        this.A07 = new C204329pp((Looper) map.get(C197489bn.A09));
        this.A0C = r10;
    }
}
