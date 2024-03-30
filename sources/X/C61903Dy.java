package X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.3Dy  reason: invalid class name and case insensitive filesystem */
public final class C61903Dy {
    public List A00;
    public final AnonymousClass026 A01;
    public final Activity A02;
    public final Executor A03;

    public C61903Dy(Activity activity, AnonymousClass026 r2, Executor executor) {
        this.A02 = activity;
        this.A03 = executor;
        this.A01 = r2;
    }

    public final void A00(List list) {
        ArrayList A0I = AnonymousClass001.A0I();
        for (Object next : list) {
            C63033Im r2 = (C63033Im) next;
            Activity activity = this.A02;
            if (r2.A01.A00.contains(activity) || r2.A02.A00.contains(activity)) {
                A0I.add(next);
            }
        }
        if (!A0I.equals(this.A00)) {
            this.A00 = A0I;
            this.A03.execute(new AnonymousClass75C((Object) this, (Object) A0I, 8));
        }
    }
}
