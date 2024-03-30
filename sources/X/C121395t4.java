package X;

import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5t4  reason: invalid class name and case insensitive filesystem */
public final class C121395t4 {
    public final C145896uh A00;
    public final List A01;
    public final AnonymousClass1QW A02;

    public C121395t4(C145896uh r8, C19630wG r9, AnonymousClass1QW r10) {
        int A04 = C36361kB.A04(r9, r10, 1);
        this.A02 = r10;
        this.A00 = r8;
        int dimensionPixelSize = C36421kH.A0B(r9).getDimensionPixelSize(R.dimen.f7nameremoved);
        C125335zk[] r2 = new C125335zk[4];
        r2[0] = new C1026250x(dimensionPixelSize, dimensionPixelSize);
        r2[1] = new C1026450z("description");
        r2[A04] = new C1026150w(dimensionPixelSize, dimensionPixelSize);
        r2[3] = new C1026350y("full_details");
        this.A01 = AnonymousClass03T.A03(r2);
    }
}
