package X;

import android.os.Handler;

/* renamed from: X.6K8  reason: invalid class name */
public class AnonymousClass6K8 {
    public AnonymousClass752 A00;
    public final AnonymousClass01N A01;
    public final Handler A02 = new Handler();

    public static void A00(AnonymousClass05R r2, AnonymousClass6K8 r3) {
        AnonymousClass752 r0 = r3.A00;
        if (r0 != null) {
            r0.run();
        }
        AnonymousClass752 r1 = new AnonymousClass752(r2, r3.A01);
        r3.A00 = r1;
        r3.A02.postAtFrontOfQueue(r1);
    }

    public AnonymousClass6K8(AnonymousClass012 r2) {
        this.A01 = new AnonymousClass01N(r2);
    }
}
