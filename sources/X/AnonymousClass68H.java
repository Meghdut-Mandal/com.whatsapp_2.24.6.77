package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;

/* renamed from: X.68H  reason: invalid class name */
public abstract class AnonymousClass68H {
    public Bitmap A00() {
        if (this instanceof C106775Lh) {
            AnonymousClass3T1 r3 = ((C106775Lh) this).A01;
            return AnonymousClass1SV.A01(r3, AnonymousClass1SV.A07(r3), 100, false, false);
        }
        C106785Li r0 = (C106785Li) this;
        AnonymousClass3T1 r4 = r0.A02;
        boolean z = r0.A06;
        boolean z2 = r0.A08;
        return AnonymousClass1SV.A01(r4, AnonymousClass1SV.A07(r4), r0.A00, z, z2);
    }

    public void A01() {
        if (this instanceof C106785Li) {
            C106785Li r1 = (C106785Li) this;
            AnonymousClass1SV r12 = r1.A04;
            AnonymousClass3T1 r4 = r1.A02;
            View view = r1.A01;
            C160527l9 r6 = r1.A03;
            Object obj = r1.A05;
            BitmapFactory.Options options = AnonymousClass1SV.A08;
            r12.A03.A01(view, r4, new C123495wb(view, r4, r6, r12, obj), r6, obj, r1.A07);
        }
    }

    public void A02(Bitmap bitmap) {
        if (this instanceof C106785Li) {
            C106785Li r2 = (C106785Li) this;
            int BHb = (int) (((float) r2.A03.BHb()) / C36361kB.A0B(r2.A01).density);
            if (BHb > bitmap.getWidth() || BHb == 0) {
                r2.A01();
            }
        }
    }
}
