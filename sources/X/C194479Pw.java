package X;

import java.util.HashMap;

/* renamed from: X.9Pw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C194479Pw {
    public final /* synthetic */ AnonymousClass6C8 A00;

    public /* synthetic */ C194479Pw(AnonymousClass6C8 r1) {
        this.A00 = r1;
    }

    public final void A00(C202059ky r4) {
        AnonymousClass6C8 r2 = this.A00;
        if (r4 == null) {
            r2.A00("on_success");
            return;
        }
        HashMap A0J = AnonymousClass001.A0J();
        C165597tg.A1M(A0J, r4.A00);
        r2.A01("on_failure", A0J);
    }
}
