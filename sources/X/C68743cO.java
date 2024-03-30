package X;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.3cO  reason: invalid class name and case insensitive filesystem */
public class C68743cO implements C88314Sf {
    public final /* synthetic */ Resources A00;
    public final /* synthetic */ C74263lK A01;

    public void BRp() {
    }

    public C68743cO(Resources resources, C74263lK r2) {
        this.A01 = r2;
        this.A00 = resources;
    }

    public void BWN(int[] iArr) {
        AnonymousClass2M9 r4 = new AnonymousClass2M9(iArr);
        long A002 = C1898996a.A00(r4, false);
        C74263lK r0 = this.A01;
        AnonymousClass1H2 r1 = r0.A0C;
        Resources resources = this.A00;
        BitmapDrawable A04 = r1.A04(resources, new C74193lD(resources, r0, iArr), r4, A002);
        if (A04 != null) {
            C39691tK r12 = r0.A08;
            C18740tg.A06(r12);
            r12.A0S(A04, 0);
            return;
        }
        C39691tK r3 = r0.A08;
        C18740tg.A06(r3);
        int i = 2;
        if (!AnonymousClass000.A1P((A002 > -1 ? 1 : (A002 == -1 ? 0 : -1)))) {
            i = 1;
        }
        r3.A0S((Drawable) null, i);
    }
}
