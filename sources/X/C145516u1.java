package X;

import java.util.List;

/* renamed from: X.6u1  reason: invalid class name and case insensitive filesystem */
public final class C145516u1 implements C160057kO {
    public final /* synthetic */ C1272667p A00;
    public final /* synthetic */ C130276Kl A01;
    public final /* synthetic */ C1508977e A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;

    public C145516u1(C1272667p r1, C130276Kl r2, C1508977e r3, String str, List list, List list2) {
        this.A01 = r2;
        this.A05 = list;
        this.A03 = str;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = list2;
    }

    public void BVK() {
        AnonymousClass3TI.A00("WaffleEligibilityCheckHelper/makeEligibilityGraphqlCall/pingIfNeeded/onDeliveryFailure");
        this.A00.A00();
    }

    public void Bi5(AnonymousClass6OQ r8) {
        AnonymousClass3TI.A01("WaffleEligibilityCheckHelper/makeEligibilityGraphqlCall/pingIfNeeded/onSuccess");
        C130276Kl r2 = this.A01;
        List list = this.A05;
        String str = this.A03;
        C130276Kl.A00(C128936Ee.A00(), this.A00, r2, this.A02, str, list, this.A04);
    }

    public void BWk(Exception exc) {
        AnonymousClass3TI.A00(C36331k8.A0i("WaffleEligibilityCheckHelper/makeEligibilityGraphqlCall/pingIfNeeded/onError: ", C36341k9.A0i(exc), exc));
        this.A00.A01(AnonymousClass5P2.A00);
    }
}
