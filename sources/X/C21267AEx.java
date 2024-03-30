package X;

import com.whatsapp.R;

/* renamed from: X.AEx  reason: case insensitive filesystem */
public class C21267AEx implements B1T {
    public final /* synthetic */ C21307AGl A00;

    public C21267AEx(C21307AGl aGl) {
        this.A00 = aGl;
    }

    public void BWg(C202059ky r5) {
        C21307AGl aGl = this.A00;
        aGl.A02.A1b();
        if (r5 != null) {
            C179048iy r2 = aGl.A01;
            int i = r5.A00;
            if (i == 10752 || i == 10756 || i == 10755) {
                C179048iy.A12(r5, aGl.A00, r2, aGl.A03);
                return;
            }
        }
        aGl.A01.BO5(R.string.f12nameremoved);
    }

    public void BbK(boolean z) {
        C21307AGl aGl = this.A00;
        C22981AzX azX = aGl.A00;
        if (azX != null) {
            azX.BU9(aGl.A02);
        }
    }
}
