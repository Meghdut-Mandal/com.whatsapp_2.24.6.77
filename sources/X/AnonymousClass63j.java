package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.63j  reason: invalid class name */
public final class AnonymousClass63j {
    public final /* synthetic */ C160237kg A00;
    public final /* synthetic */ C1266264t A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public AnonymousClass63j(C160237kg r1, C1266264t r2, String str, List list) {
        this.A01 = r2;
        this.A03 = list;
        this.A00 = r1;
        this.A02 = str;
    }

    public void A00(int i, Integer num) {
        AnonymousClass1UT.A01(AnonymousClass000.A0r("XFamilyCrosspostEligibilityManager/generateEligibilityGraphqlCallback unknown error with code: ", AnonymousClass000.A0u(), i), (Throwable) null);
        List list = this.A03;
        ArrayList A0J = C36321k7.A0J(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C90464aC.A1T(A0J, it);
        }
        C1266264t r0 = this.A01;
        AnonymousClass6Y4.A06(r0.A01, r0.A02, r0.A05, A0J, 4);
        this.A00.BWZ(i, num);
    }
}
