package X;

import android.opengl.EGLConfig;
import android.view.Surface;

/* renamed from: X.4qX  reason: invalid class name and case insensitive filesystem */
public class C97924qX extends C1263663q {
    public C97924qX(Surface surface, C133216Xg r4) {
        super(r4);
        C133216Xg r1 = this.A01;
        this.A00 = C133216Xg.A02(r1.A02, surface, r1);
    }

    public C97924qX(Surface surface, C133216Xg r5, int i, int i2) {
        super(r5);
        C133216Xg r2 = this.A01;
        EGLConfig eGLConfig = r2.A02;
        try {
            eGLConfig = C133216Xg.A01(r2, 5);
        } catch (RuntimeException unused) {
        }
        this.A00 = C133216Xg.A02(eGLConfig, surface, r2);
    }
}
