package X;

import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.R;
import com.whatsapp.support.DescribeProblemActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3n6  reason: invalid class name and case insensitive filesystem */
public class C75363n6 implements AnonymousClass4U7 {
    public final /* synthetic */ C225314u A00;
    public final /* synthetic */ DescribeProblemActivity A01;

    public C75363n6(C225314u r1, DescribeProblemActivity describeProblemActivity) {
        this.A01 = describeProblemActivity;
        this.A00 = r1;
    }

    public void BTR() {
        Log.e("DescribeProblemActivity/contactSupport/onDeliveryFailure, falling back to email support.");
        this.A00.Bnv();
        DescribeProblemActivity.A0J(this.A01);
    }

    public void BTS(int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DescribeProblemActivity/contactSupport/onError/errorCode=");
        A0u.append(i);
        C36321k7.A1Z(A0u, " falling back to email support.");
        this.A00.Bnv();
        DescribeProblemActivity.A0J(this.A01);
    }

    public void BTT(AnonymousClass11F r5) {
        AnonymousClass3P9 A03 = LegacyMessageDialogFragment.A03(new Object[0], R.string.f12nameremoved);
        AnonymousClass3W7 r1 = AnonymousClass3W7.A00;
        A03.A03 = R.string.f12nameremoved;
        A03.A06 = r1;
        A03.A00 = 1;
        LegacyMessageDialogFragment A02 = A03.A02();
        DescribeProblemActivity describeProblemActivity = this.A01;
        C36331k8.A12(A02, describeProblemActivity);
        C225314u r0 = this.A00;
        r0.Bnv();
        describeProblemActivity.A33(C36371kC.A0D(r0, r5), true);
    }
}
