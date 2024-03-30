package androidx.car.app;

import X.C90474aD;
import X.C90484aE;
import X.C90494aF;
import X.C90504aG;
import android.view.Surface;

public final class SurfaceContainer {
    public final int mDpi = 0;
    public final int mHeight = 0;
    public final Surface mSurface = null;
    public final int mWidth = 0;

    public String toString() {
        StringBuilder A0p = C90484aE.A0p();
        A0p.append(this.mSurface);
        C90504aG.A1M(A0p);
        C90494aF.A1L(A0p, this.mWidth);
        A0p.append(this.mHeight);
        A0p.append(", dpi: ");
        A0p.append(this.mDpi);
        return C90474aD.A0g(A0p);
    }
}
