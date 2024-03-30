package X;

import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;

/* renamed from: X.8r1  reason: invalid class name and case insensitive filesystem */
public class C183578r1 extends C132446Tt {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IndiaUpiBankAccountDetailsActivity A01;
    public final /* synthetic */ Runnable A02;

    public C183578r1(IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity, Runnable runnable, int i) {
        this.A01 = indiaUpiBankAccountDetailsActivity;
        this.A00 = i;
        this.A02 = runnable;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = this.A01;
        AnonymousClass1EU r0 = indiaUpiBankAccountDetailsActivity.A09;
        AnonymousClass1EU.A00(r0);
        C24881Ed r5 = r0.A05;
        Integer[] numArr = new Integer[2];
        boolean A1b = C36361kB.A1b(numArr, 417);
        numArr[1] = 418;
        Integer[] numArr2 = new Integer[1];
        AnonymousClass000.A1L(numArr2, 40, A1b ? 1 : 0);
        if (r5.A0T(indiaUpiBankAccountDetailsActivity.A00.A0A, numArr, numArr2, 1).size() > 0) {
            A1b = true;
        }
        return Boolean.valueOf(A1b);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        if (AnonymousClass000.A1X(obj)) {
            AnonymousClass3SJ.A01(this.A01, this.A00);
        } else {
            this.A02.run();
        }
    }
}
