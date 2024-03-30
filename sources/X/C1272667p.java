package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.67p  reason: invalid class name and case insensitive filesystem */
public final class C1272667p {
    public final /* synthetic */ int A00 = 10;
    public final /* synthetic */ AnonymousClass6CZ A01;
    public final /* synthetic */ C1266164s A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;

    public C1272667p(AnonymousClass6CZ r2, C1266164s r3, String str, List list, List list2) {
        this.A02 = r3;
        this.A05 = list;
        this.A04 = list2;
        this.A01 = r2;
        this.A03 = str;
    }

    public void A00() {
        AnonymousClass3TI.A00("EligibilityManager/generateEligibilityGraphqlCallback delivery failure");
        AnonymousClass66M r4 = (AnonymousClass66M) this.A02.A06.get();
        String str = this.A03;
        List list = this.A05;
        ArrayList A0J = C36321k7.A0J(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C90464aC.A1T(A0J, it);
        }
        r4.A01(str, A0J, this.A04);
        AnonymousClass6CZ r2 = this.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CrosspostRequestSessionManager/eligibility retry delivery failure for session: ");
        String str2 = r2.A03;
        AnonymousClass00C.A0D(AnonymousClass000.A0p("CrosspostRequestSessionManager/[Retry]Delivery Failure encountered for session: ", str2, C36401kF.A0t(str2, C90464aC.A1Z(str2, A0u) ? 1 : 0)), 0);
    }

    public void A01(AnonymousClass5P5 r8) {
        AnonymousClass3TI.A00(AnonymousClass000.A0l(r8, "EligibilityManager/generateEligibilityGraphqlCallback unknown error with exception: ", AnonymousClass000.A0u()));
        List list = this.A05;
        ArrayList A0J = C36321k7.A0J(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C90464aC.A1T(A0J, it);
        }
        List list2 = this.A04;
        C1266164s r0 = this.A02;
        AnonymousClass6R9.A00(r0.A01, r0.A03, r0.A05, A0J, list2, 4);
        this.A01.A00(r8);
    }
}
