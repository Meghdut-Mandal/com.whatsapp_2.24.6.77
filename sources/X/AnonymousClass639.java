package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.639  reason: invalid class name */
public final class AnonymousClass639 {
    public final /* synthetic */ AnonymousClass62K A00;
    public final /* synthetic */ C128256Bn A01;
    public final /* synthetic */ AnonymousClass6SO A02;

    public AnonymousClass639(AnonymousClass62K r1, C128256Bn r2, AnonymousClass6SO r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void A00(int i, Integer num) {
        AnonymousClass1UT.A01(AnonymousClass000.A0r("XFamilyCrosspostRequestManager/generateCrosspostGraphqlCallback unknown error with code: ", AnonymousClass000.A0u(), i), (Throwable) null);
        C23931Ak r0 = this.A01.A00;
        ArrayList A0J = C36321k7.A0J(r0);
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            C90464aC.A1T(A0J, it);
        }
        AnonymousClass6SO r02 = this.A02;
        AnonymousClass6Y4.A06(r02.A00, r02.A03, r02.A05, A0J, 4);
        this.A00.A00(i, num);
    }
}
