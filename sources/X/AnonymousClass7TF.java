package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.BusinessHubActivity;
import com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel;

/* renamed from: X.7TF  reason: invalid class name */
public final class AnonymousClass7TF extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ BusinessHubActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TF(BusinessHubActivity businessHubActivity) {
        super(1);
        this.this$0 = businessHubActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        C121835tn r5 = (C121835tn) obj;
        int BB6 = ((PaymentMerchantAccountViewModel) this.this$0.A0E.getValue()).A01.A05().BB6();
        if (r5 != null) {
            int i = r5.A00;
            if (i == 0) {
                this.this$0.Bnv();
                this.this$0.finish();
            } else if (i != 1) {
                this.this$0.Bu1(R.string.f12nameremoved);
            } else {
                this.this$0.Bnv();
                BusinessHubActivity businessHubActivity = this.this$0;
                Throwable th = r5.A02;
                if (th == null || (str = th.getMessage()) == null) {
                    str = C36361kB.A0m(this.this$0, R.string.f12nameremoved);
                }
                AnonymousClass1FR.A0A(businessHubActivity, str, BB6);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
