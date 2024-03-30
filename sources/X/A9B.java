package X;

import android.graphics.Bitmap;

public final /* synthetic */ class A9B implements C22916AyS {
    public final /* synthetic */ C22916AyS A00;
    public final /* synthetic */ C196169Xz A01;

    public /* synthetic */ A9B(C22916AyS ayS, C196169Xz r2) {
        this.A01 = r2;
        this.A00 = ayS;
    }

    public final void Ba4(Bitmap bitmap, C21097A8i a8i, boolean z) {
        C196169Xz r0 = this.A01;
        C22916AyS ayS = this.A00;
        if (!z) {
            r0.A03.remove(a8i);
        }
        ayS.Ba4(bitmap, a8i, z);
    }
}
