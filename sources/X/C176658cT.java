package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8cT  reason: invalid class name and case insensitive filesystem */
public final class C176658cT extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;

    public C176658cT() {
        super(2162, C36431kI.A0q(), 0, -1);
    }

    public static C131606Ps A01(C176658cT r2, String str, Object[] objArr) {
        r2.A0a = String.format("%s.%s", objArr);
        C131606Ps r1 = new C131606Ps((String) null, new C131606Ps[0]);
        r1.A03("section", str);
        return r1;
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(4, this.A07);
        r3.Bpz(24, this.A0G);
        r3.Bpz(3, this.A08);
        r3.Bpz(23, this.A0H);
        r3.Bpz(32, this.A0I);
        r3.Bpz(34, this.A00);
        r3.Bpz(15, this.A0N);
        r3.Bpz(13, this.A01);
        r3.Bpz(11, this.A0O);
        r3.Bpz(22, this.A0J);
        r3.Bpz(21, this.A02);
        r3.Bpz(18, this.A03);
        r3.Bpz(20, this.A04);
        r3.Bpz(19, this.A0P);
        r3.Bpz(25, this.A0Q);
        r3.Bpz(31, this.A09);
        r3.Bpz(2, this.A0R);
        r3.Bpz(9, this.A0S);
        r3.Bpz(10, this.A0T);
        r3.Bpz(47, this.A0U);
        r3.Bpz(1, this.A0V);
        r3.Bpz(42, this.A0A);
        r3.Bpz(40, this.A05);
        r3.Bpz(36, this.A06);
        r3.Bpz(38, this.A0W);
        r3.Bpz(39, this.A0X);
        r3.Bpz(17, this.A0B);
        r3.Bpz(26, this.A0K);
        r3.Bpz(27, this.A0L);
        r3.Bpz(12, this.A0C);
        r3.Bpz(14, this.A0M);
        r3.Bpz(28, this.A0D);
        r3.Bpz(30, this.A0E);
        r3.Bpz(46, this.A0Y);
        r3.Bpz(35, this.A0Z);
        r3.Bpz(6, this.A0a);
        r3.Bpz(5, this.A0b);
        r3.Bpz(8, this.A0F);
    }

    public static void A04(C176658cT r1, Integer num, String str, int i) {
        r1.A0b = str;
        r1.A08 = Integer.valueOf(i);
        if (num != null) {
            r1.A07 = num;
        }
    }

    public static int A00(C176658cT r1, C202059ky r2, int i) {
        r1.A0B = Integer.valueOf(i);
        if (r2 == null) {
            return 1;
        }
        r1.A0S = String.valueOf(r2.A00);
        r1.A0T = r2.A07;
        return 2;
    }

    public static void A02(C176658cT r1, int i) {
        r1.A08 = Integer.valueOf(i);
    }

    public static void A03(C176658cT r1, C131606Ps r2, AF7 af7, boolean z) {
        r1.A05 = Boolean.valueOf(z);
        AF7.A01(r1, r2);
        af7.A02.Bly(r1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36371kC.A0o(), this.A07);
        A1G.put(43, (Object) null);
        C36331k8.A1Q((Object) null, A1G, 44);
        A1G.put(C36331k8.A0L(24, this.A0G, A1G), this.A08);
        C36321k7.A1b(A1G, 7);
        A1G.put(23, this.A0H);
        A1G.put(32, this.A0I);
        C36321k7.A1b(A1G, 33);
        A1G.put(C36341k9.A0b(34, this.A00, A1G), this.A0N);
        C36321k7.A1b(A1G, 45);
        A1G.put(C36381kD.A0o(C36401kF.A0l(C36371kC.A0q(C36411kG.A0s(C90474aD.A0X(C36331k8.A0T(13, this.A01, A1G), this.A0O, A1G), this.A0J, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A0P);
        A1G.put(25, this.A0Q);
        A1G.put(C36331k8.A0S(C36331k8.A0R(C36331k8.A0K(31, this.A09, A1G), this.A0R, A1G), this.A0S, A1G), this.A0T);
        A1G.put(C36331k8.A0J(47, this.A0U, A1G), this.A0V);
        C36321k7.A1b(A1G, 29);
        A1G.put(42, this.A0A);
        A1G.put(40, this.A05);
        A1G.put(36, this.A06);
        C36321k7.A1b(A1G, 41);
        A1G.put(38, this.A0W);
        A1G.put(C36351kA.A0t(39, this.A0X, A1G), this.A0B);
        A1G.put(C165597tg.A0d(), this.A0K);
        A1G.put(C36341k9.A0a(C36331k8.A0U(27, this.A0L, A1G), this.A0C, A1G), this.A0M);
        C36321k7.A1b(A1G, 16);
        A1G.put(28, this.A0D);
        A1G.put(30, this.A0E);
        A1G.put(46, this.A0Y);
        A1G.put(C36331k8.A0O(35, this.A0Z, A1G), this.A0a);
        C36321k7.A1b(A1G, 37);
        A1G.put(C36331k8.A0Q(C36371kC.A0p(), this.A0b, A1G), this.A0F);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamPaymentsUserAction {");
        C20910yM.A00(C36331k8.A0h(this.A07), "actionTarget", A0u);
        C20910yM.A00(this.A0G, "paymentAccountRowSelected", A0u);
        C20910yM.A00(C36331k8.A0h(this.A08), "paymentActionType", A0u);
        C20910yM.A00(this.A0H, "paymentNumberOfAccountsAvailable", A0u);
        C20910yM.A00(this.A0I, "paymentNumberOfPeopleInvited", A0u);
        C20910yM.A00(this.A00, "paymentSent", A0u);
        C20910yM.A00(this.A0N, "paymentSmsProviderNumber", A0u);
        C20910yM.A00(this.A01, "paymentsAccountsExist", A0u);
        C20910yM.A00(this.A0O, "paymentsBankId", A0u);
        C20910yM.A00(this.A0J, "paymentsBanksRowSelected", A0u);
        C20910yM.A00(this.A02, "paymentsBanksScrolled", A0u);
        C20910yM.A00(this.A03, "paymentsBanksSearchActivated", A0u);
        C20910yM.A00(this.A04, "paymentsBanksSearchSelected", A0u);
        C20910yM.A00(this.A0P, "paymentsBanksSearchString", A0u);
        C20910yM.A00(this.A0Q, "paymentsBanksSelectedName", A0u);
        C20910yM.A00(C36331k8.A0h(this.A09), "paymentsContactsBucket", A0u);
        C20910yM.A00(this.A0R, "paymentsCountryCode", A0u);
        C20910yM.A00(this.A0S, "paymentsErrorCode", A0u);
        C20910yM.A00(this.A0T, "paymentsErrorText", A0u);
        C20910yM.A00(this.A0U, "paymentsErrorTitle", A0u);
        C20910yM.A00(this.A0V, "paymentsEventId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0A), "paymentsIqCallStatus", A0u);
        C20910yM.A00(this.A05, "paymentsIsMandate", A0u);
        C20910yM.A00(this.A06, "paymentsIsOrder", A0u);
        C20910yM.A00(this.A0W, "paymentsOrderType", A0u);
        C20910yM.A00(this.A0X, "paymentsP2mPaymentConfigId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0B), "paymentsRequestName", A0u);
        C20910yM.A00(this.A0K, "paymentsRequestRetryCount", A0u);
        C20910yM.A00(this.A0L, "paymentsRequestRetryTimeDelaySeconds", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0C), "paymentsResponseResult", A0u);
        C20910yM.A00(this.A0M, "paymentsSmsProviderRetryCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0D), "paymentsUpiCheckPinErrorReason", A0u);
        C20910yM.A00(C36331k8.A0h(this.A0E), "paymentsVerifyCardResult", A0u);
        C20910yM.A00(this.A0Y, "previousScreenName", A0u);
        C20910yM.A00(this.A0Z, "queryParams", A0u);
        C20910yM.A00(this.A0a, "referral", A0u);
        C20910yM.A00(this.A0b, "screen", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A0F), "upiPaymentsPspId", A0u);
    }
}
