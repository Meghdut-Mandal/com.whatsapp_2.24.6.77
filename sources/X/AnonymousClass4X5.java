package X;

import android.app.Activity;

/* renamed from: X.4X5  reason: invalid class name */
public class AnonymousClass4X5 implements AnonymousClass4PI {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass4X5(Object obj, int i, int i2, Object obj2) {
        this.A03 = i2;
        this.A01 = obj2;
        this.A02 = obj;
        this.A00 = i;
    }

    public final void BfK(boolean z) {
        switch (this.A03) {
            case 0:
            case 1:
                Activity activity = (Activity) this.A02;
                int i = this.A00;
                if (z) {
                    if (i == 2) {
                        C36381kD.A15(activity, AnonymousClass190.A03(activity));
                    } else if (i != 1) {
                        return;
                    }
                    activity.finish();
                    return;
                }
                return;
            case 2:
                if (z) {
                    C63583Kp r5 = (C63583Kp) this.A02;
                    r5.A01.runOnUiThread(new C81333wq(r5, this.A00, 30, this.A01));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
