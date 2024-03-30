package X;

import android.app.Activity;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.3Rj  reason: invalid class name and case insensitive filesystem */
public final class C65263Rj {
    public final C19600wD A00;
    public final C20810yC A01;
    public final C33761ft A02;
    public final C602136x A03;
    public final C005502l A04;
    public final AnonymousClass040 A05;
    public final C21060yb A06;

    public C65263Rj(C19600wD r2, C21060yb r3, C20810yC r4, C33761ft r5, C602136x r6, C005502l r7, AnonymousClass040 r8) {
        AnonymousClass00C.A0D(r4, 1);
        C36321k7.A1A(r8, r7, r3, r5, 3);
        AnonymousClass00C.A0D(r2, 7);
        this.A01 = r4;
        this.A03 = r6;
        this.A05 = r8;
        this.A04 = r7;
        this.A06 = r3;
        this.A02 = r5;
        this.A00 = r2;
    }

    public static final void A00(Activity activity) {
        AnonymousClass3P9 A002 = AnonymousClass3P9.A00(C36341k9.A0e(activity, AnonymousClass001.A0L(), R.string.f12nameremoved, 0, R.string.f12nameremoved));
        C66323Vn r1 = C66323Vn.A00;
        A002.A03 = R.string.f12nameremoved;
        A002.A06 = r1;
        C36331k8.A12(A002.A02(), (AnonymousClass01I) activity);
    }

    public static final void A01(C225314u r6, C65263Rj r7) {
        C225314u r2 = r6;
        if (r6 != null && !r6.isDestroyed() && !r6.isFinishing()) {
            View findViewById = r6.findViewById(16908298);
            AnonymousClass00C.A0B(findViewById);
            new AnonymousClass3ZU(findViewById, (AnonymousClass012) r2, r7.A06, (List) AnonymousClass001.A0I(), (int) R.string.f12nameremoved, 2000, false).A02();
        }
    }
}
