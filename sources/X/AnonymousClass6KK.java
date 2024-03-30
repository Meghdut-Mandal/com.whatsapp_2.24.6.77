package X;

import com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment;
import java.util.List;

/* renamed from: X.6KK  reason: invalid class name */
public final class AnonymousClass6KK {
    public final AnonymousClass61B A00;
    public final C1268565x A01;
    public final C131376Ou A02;

    public static final BkFcsPreloadingScreenFragment A00(AnonymousClass01z r1, AnonymousClass6KK r2) {
        List A04 = r1.A0T.A04();
        AnonymousClass00C.A08(A04);
        AnonymousClass02E r12 = (AnonymousClass02E) C007103b.A0O(A04);
        if (r12 instanceof BkFcsPreloadingScreenFragment) {
            return (BkFcsPreloadingScreenFragment) r12;
        }
        if (r12 == null) {
            return null;
        }
        AnonymousClass01z A0k = r12.A0k();
        AnonymousClass00C.A08(A0k);
        return A00(A0k, r2);
    }

    public AnonymousClass6KK(AnonymousClass61B r1, C1268565x r2, C131376Ou r3) {
        C36321k7.A11(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
