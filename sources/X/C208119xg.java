package X;

import android.app.Activity;
import java.util.Iterator;

/* renamed from: X.9xg  reason: invalid class name and case insensitive filesystem */
public final class C208119xg implements C22851Ax0 {
    public final /* synthetic */ C208169xl A00;

    public void Bkk(Activity activity, AnonymousClass9V8 r7) {
        AnonymousClass00C.A0D(activity, 0);
        Iterator it = this.A00.A01.iterator();
        while (it.hasNext()) {
            C193319Kz r3 = (C193319Kz) it.next();
            if (AnonymousClass00C.A0J(r3.A01, activity)) {
                r3.A00 = r7;
                r3.A03.execute(new AnonymousClass75C((Object) r3, (Object) r7, 9));
            }
        }
    }

    public C208119xg(C208169xl r1) {
        this.A00 = r1;
    }
}
