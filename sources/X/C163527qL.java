package X;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: X.7qL  reason: invalid class name and case insensitive filesystem */
public class C163527qL implements DialogInterface.OnClickListener {
    public int A00;
    public Object A01;
    public final int A02;

    public C163527qL(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A02) {
            case 0:
                AnonymousClass5JX r2 = (AnonymousClass5JX) this.A01;
                AnonymousClass3SJ.A00(r2.A01, this.A00);
                r2.A00 = true;
                r2.Bp4(true, false);
                return;
            case 1:
                int i2 = this.A00;
                Activity activity = ((AnonymousClass5JX) this.A01).A01;
                AnonymousClass3SJ.A00(activity, i2);
                AnonymousClass3SJ.A01(activity, 106);
                return;
            case 2:
                C133586Zc r22 = (C133586Zc) this.A01;
                AnonymousClass3SJ.A00(r22.A0P, this.A00);
                if (r22.A0R == C108135Sh.LIVE_LOCATION_MODE) {
                    C133586Zc.A08(r22);
                    return;
                }
                return;
            default:
                C133586Zc r4 = (C133586Zc) this.A01;
                int i3 = this.A00;
                AnonymousClass3SJ.A00(r4.A0P, i3);
                C19420v0 r0 = r4.A19;
                if (i3 == 3) {
                    r0.A1x(false);
                    C133586Zc.A0G(r4, true);
                    return;
                }
                C36331k8.A0w(C19420v0.A00(r0), "nearby_location_new_user", false);
                Runnable runnable = r4.A0Y;
                C18740tg.A06(runnable);
                runnable.run();
                return;
        }
    }
}
