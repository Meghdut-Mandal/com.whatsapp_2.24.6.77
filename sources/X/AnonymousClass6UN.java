package X;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6UN  reason: invalid class name */
public class AnonymousClass6UN {
    public static final List A00 = AnonymousClass001.A0I();

    public static synchronized C133216Xg A00() {
        synchronized (AnonymousClass6UN.class) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                C133216Xg r2 = (C133216Xg) ((WeakReference) it.next()).get();
                if (r2 == null) {
                    it.remove();
                } else {
                    EGLContext eGLContext = r2.A03;
                    if (eGLContext != EGL14.EGL_NO_CONTEXT && eGLContext.equals(EGL14.eglGetCurrentContext())) {
                        return r2;
                    }
                }
            }
            return null;
        }
    }

    public static synchronized C133216Xg A01(Object obj, int i) {
        C133216Xg r2;
        synchronized (AnonymousClass6UN.class) {
            r2 = new C133216Xg(obj, i);
            A00.add(AnonymousClass001.A0F(r2));
        }
        return r2;
    }
}
