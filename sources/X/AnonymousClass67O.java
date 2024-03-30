package X;

import android.content.SharedPreferences;
import java.util.Date;

/* renamed from: X.67O  reason: invalid class name */
public final class AnonymousClass67O {
    public final int A00;
    public final C19970wo A01;
    public final AnonymousClass1KW A02;
    public final C87764Qb A03;

    public AnonymousClass67O(C19970wo r2, AnonymousClass1KW r3, C87764Qb r4, int i) {
        AnonymousClass00C.A0D(r4, 3);
        this.A02 = r3;
        this.A00 = i;
        this.A03 = r4;
        this.A01 = r2;
    }

    public final AnonymousClass6AD A00() {
        C18910u1 r3 = this.A02.A00;
        return new AnonymousClass6AD(new Date(C36341k9.A0B((SharedPreferences) r3.get(), "flows_target_cleanup_date")), C36371kC.A01((SharedPreferences) r3.get(), "flows_need_cleanup_after_target_date"));
    }

    public final void A01(AnonymousClass6AD r6) {
        AnonymousClass1KW r0 = this.A02;
        int i = r6.A00;
        C18910u1 r4 = r0.A00;
        C36341k9.A0v(C90504aG.A0H(r4), "flows_need_cleanup_after_target_date", i);
        C36341k9.A0w(C90504aG.A0H(r4), "flows_target_cleanup_date", r6.A01.getTime());
    }
}
