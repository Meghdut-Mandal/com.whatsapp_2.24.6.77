package X;

import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5uf  reason: invalid class name and case insensitive filesystem */
public final class C122325uf {
    public final C145896uh A00;
    public final List A01;
    public final AtomicInteger A02 = new AtomicInteger(0);
    public final AnonymousClass1QW A03;

    public C122325uf(C145896uh r6, C19630wG r7, AnonymousClass1QW r8) {
        C36321k7.A0v(r7, 1, r8);
        this.A03 = r8;
        this.A00 = r6;
        int dimensionPixelSize = C36421kH.A0B(r7).getDimensionPixelSize(R.dimen.f7nameremoved);
        ArrayList A032 = AnonymousClass03T.A03(new C1026250x(dimensionPixelSize, dimensionPixelSize));
        this.A01 = A032;
        A032.add(new C1026450z("description"));
        A032.add(new C1026150w(dimensionPixelSize, dimensionPixelSize));
    }
}
