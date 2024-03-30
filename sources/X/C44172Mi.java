package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.2Mi  reason: invalid class name and case insensitive filesystem */
public final class C44172Mi extends AnonymousClass1DJ {
    public final AnonymousClass6TO A00;
    public final C593433o A01;
    public final C19630wG A02;
    public final AnonymousClass1RU A03;
    public final C19420v0 A04;

    public void A01() {
        C19420v0 r2 = this.A04;
        if (C36371kC.A1U(C36341k9.A0E(r2), "notify_account_switching_available") && this.A03.A0B()) {
            C36331k8.A18(r2, "notify_account_switching_available", false);
            Log.i("AccountSwitchingAbPropObserver/showAccountSwitchingAvailableNotification");
            C593433o r9 = this.A01;
            C19630wG r1 = this.A02;
            Context context = r1.A00;
            String A0m = C36361kB.A0m(context, R.string.f12nameremoved);
            String A0v = C36371kC.A0v(r1, R.string.f12nameremoved);
            Intent A0L = AnonymousClass190.A0L(context, 17, false);
            Context context2 = r9.A00.A00;
            C07700Yy r3 = new C07700Yy(context2, "other_notifications@1");
            r3.A06 = AnonymousClass00F.A00(context2, R.color.f6nameremoved);
            r3.A06(3);
            C36361kB.A1B(r3, A0m, A0v, true);
            C36361kB.A1A(r3);
            C36341k9.A14(r3, A0v);
            r3.A0D = C65743Th.A03(context2, A0L, 0);
            r3.A0G(A0v);
            r3.A09 = 0;
            r9.A01.A07("account_switching_available", 64, r3.A05());
            this.A00.A02((Boolean) null, 17, 15);
        }
    }

    public C44172Mi(AnonymousClass1RU r1, AnonymousClass6TO r2, C593433o r3, C19630wG r4, C19420v0 r5) {
        C36321k7.A18(r4, r1, r5, r2);
        this.A02 = r4;
        this.A03 = r1;
        this.A04 = r5;
        this.A00 = r2;
        this.A01 = r3;
    }
}
