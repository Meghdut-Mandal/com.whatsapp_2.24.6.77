package X;

import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6LZ  reason: invalid class name */
public class AnonymousClass6LZ {
    public C129196Ft A00;
    public RectF A01;
    public final C117445mH A02;
    public final AnonymousClass6OT A03;
    public final C1270166p A04;
    public final AnonymousClass6NQ A05;
    public final AnonymousClass6SM A06;

    public static void A00(AnonymousClass6LZ r9) {
        AnonymousClass6OT r2 = r9.A03;
        if (r2.A08 != null) {
            RectF A0N = C36441kJ.A0N();
            r2.A0A.mapRect(A0N, r2.A08);
            int i = r2.A04;
            int i2 = r2.A03;
            float width = A0N.width() / A0N.height();
            float f = (float) i;
            float f2 = (float) i2;
            if (width > f / f2) {
                f2 = f / width;
            } else {
                f = f2 * width;
            }
            float f3 = (float) (i / 2);
            float f4 = (float) (i2 / 2);
            float f5 = (float) 2;
            float f6 = f / f5;
            float f7 = f2 / f5;
            RectF rectF = new RectF(f3 - f6, f4 - f7, f3 + f6, f4 + f7);
            RectF rectF2 = r9.A01;
            if (rectF2 == null || !rectF2.equals(rectF)) {
                r9.A01 = rectF;
                AnonymousClass6NQ r4 = r9.A05;
                RectF rectF3 = r4.A02;
                rectF3.set(rectF);
                Map map = r4.A05;
                Iterator A0z = AnonymousClass000.A0z(map);
                while (A0z.hasNext()) {
                    AnonymousClass6F8 r0 = (AnonymousClass6F8) A0z.next();
                    View view = r0.A05;
                    if (view != null) {
                        r0.A06.removeView(view);
                    }
                }
                map.clear();
                Integer A0i = C36361kB.A0i();
                Handler handler = r4.A09;
                ViewGroup viewGroup = r4.A0A;
                Vibrator vibrator = r4.A03;
                map.put(A0i, new AnonymousClass5CT(rectF3, handler, vibrator, viewGroup, 1));
                map.put(C36361kB.A0j(), new AnonymousClass5CT(rectF3, handler, vibrator, viewGroup, 2));
                map.put(C36371kC.A0n(), new AnonymousClass5CU(rectF3, handler, vibrator, viewGroup));
            }
        }
    }

    public AnonymousClass6LZ(C117445mH r2, AnonymousClass6OT r3, AnonymousClass6NQ r4, AnonymousClass6SM r5) {
        this.A03 = r3;
        this.A04 = new C1270166p(r3);
        this.A06 = r5;
        this.A05 = r4;
        this.A02 = r2;
    }
}
