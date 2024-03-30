package X;

import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public final class AI1 implements C236119d {
    public final /* synthetic */ AnonymousClass8g8 A00;
    public final /* synthetic */ AnonymousClass9FG A01;
    public final /* synthetic */ C186008vG A02;
    public final /* synthetic */ String A03;

    public void BWw(C203399nx r5, String str) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass9FG r3 = this.A01;
        new C186268vg(r5, this.A02, 13);
        IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = r3.A00;
        indiaUpiBankAccountDetailsActivity.A00.Bp3(new AVX(indiaUpiBankAccountDetailsActivity, 31));
    }

    public void BiM(C203399nx r25, String str) {
        IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity;
        AnonymousClass17Y r2;
        int i;
        C203399nx r13 = r25;
        AnonymousClass00C.A0D(r13, 1);
        C186008vG r22 = this.A02;
        ArrayList arrayList = C186078vN.A00;
        C203399nx A0e = C90514aH.A0e(r13, r22);
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        Class<String> cls2 = cls;
        Long l = A0P;
        Long l2 = A0Q;
        C203379ns.A03(r13, cls2, l, l2, C203379ns.A00.A0Z(A0e, cls, A0P, A0Q, (Object) null, new String[]{"account", "action"}, false), new String[]{"account", "action"}, true);
        C203379ns.A03(r13, Long.class, 1L, l2, (Object) null, new String[]{"account", "version"}, false);
        String A07 = C203379ns.A07(r13, "account", "international-payments-status", C186078vN.A00);
        C203539oF.A0B(r13, new C23214B9w(A0e, 8));
        C203399nx r17 = r13;
        C203539oF.A09(r17, AS0.A00, new String[]{"account"}, 1, 1).get(0);
        if (AnonymousClass00C.A0J(A07, "deactivated")) {
            C199799fz r4 = this.A00.A01;
            String str2 = this.A03;
            AnonymousClass00T r23 = r4.A01;
            C90514aH.A16(r23).remove(str2);
            C199799fz.A00(r4, C90514aH.A16(r23));
            indiaUpiBankAccountDetailsActivity = this.A01.A00;
            r2 = indiaUpiBankAccountDetailsActivity.A00;
            i = 30;
        } else {
            AnonymousClass9FG r3 = this.A01;
            new C186268vg(r13, r22, 13);
            indiaUpiBankAccountDetailsActivity = r3.A00;
            r2 = indiaUpiBankAccountDetailsActivity.A00;
            i = 31;
        }
        r2.Bp3(new AVX(indiaUpiBankAccountDetailsActivity, i));
    }

    public AI1(AnonymousClass8g8 r1, AnonymousClass9FG r2, C186008vG r3, String str) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = str;
        this.A01 = r2;
    }

    public void BVN(String str) {
        Log.e("deactivateInternationalPayments/onDeactivateInternational/onDeliveryFailure");
    }
}
