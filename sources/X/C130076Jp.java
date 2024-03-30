package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.6Jp  reason: invalid class name and case insensitive filesystem */
public final class C130076Jp {
    public C23012B0d A00;
    public final C006302t A01;

    public static final void A00(C130076Jp r4) {
        C140206lD r3 = new C140206lD();
        r4.A00 = new C20985A1z(r3, new AnonymousClass88T());
        C006302t r2 = r4.A01;
        SurfaceTexture surfaceTexture = r3.A03;
        if (surfaceTexture == null) {
            surfaceTexture = C140206lD.A00(r3);
        }
        r2.invoke(new Surface(surfaceTexture));
    }

    public C130076Jp(C006302t r1) {
        this.A01 = r1;
        A00(this);
    }
}
