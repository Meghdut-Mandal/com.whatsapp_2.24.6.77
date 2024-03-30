package X;

import android.app.Activity;
import android.os.Looper;

/* renamed from: X.1JX  reason: invalid class name */
public class AnonymousClass1JX extends AnonymousClass18Q {
    public final AnonymousClass1JY A00;
    public final AnonymousClass005 A01;

    public AnonymousClass1JX(AnonymousClass005 r3, AnonymousClass005 r4) {
        this.A01 = r3;
        this.A00 = new AnonymousClass1JY(Looper.getMainLooper(), r3, r4);
    }

    public void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        AnonymousClass1JY r2 = this.A00;
        if (r2.hasMessages(0)) {
            r2.removeMessages(0);
        }
        ((AnonymousClass1YV) this.A01.get()).A04();
    }

    public void onActivityResumed(Activity activity) {
        boolean z;
        super.onActivityResumed(activity);
        if (activity instanceof AnonymousClass155) {
            z = ((AnonymousClass155) activity).A0E;
        } else {
            z = activity instanceof C100814vp;
        }
        if (z) {
            this.A00.sendEmptyMessageDelayed(0, 3000);
        }
    }
}
