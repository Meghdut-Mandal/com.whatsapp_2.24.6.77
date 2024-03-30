package X;

import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;

/* renamed from: X.AmZ  reason: case insensitive filesystem */
public final class C22434AmZ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ IndiaUpiInternationalActivationActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22434AmZ(IndiaUpiInternationalActivationActivity indiaUpiInternationalActivationActivity) {
        super(1);
        this.this$0 = indiaUpiInternationalActivationActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass97H r7 = (AnonymousClass97H) obj;
        if (r7 instanceof C179258jm) {
            IndiaUpiInternationalActivationActivity indiaUpiInternationalActivationActivity = this.this$0;
            Intent putExtra = C36431kI.A0D().putExtra("INTERNATIONAL_ACTIVATION_RESPONSE", "INTERNATIONAL_ACTIVATION_SUCCESS");
            C207049uT r5 = ((C179258jm) r7).A00;
            indiaUpiInternationalActivationActivity.setResult(-1, putExtra.putExtra("INTERNATIONAL_ACTIVATION_RESULT_STATE", r5).putExtra("INTERNATIONAL_QR_SOURCE", this.this$0.getIntent().getStringExtra("INTERNATIONAL_QR_SOURCE")).putExtra("INTERNATIONAL_QR_PAYLOAD", this.this$0.getIntent().getParcelableExtra("INTERNATIONAL_QR_PAYLOAD")));
            String str = r5.A01;
            int length = str.length();
            IndiaUpiInternationalActivationActivity indiaUpiInternationalActivationActivity2 = this.this$0;
            if (length > 0) {
                C39001qm A00 = AnonymousClass3LW.A00(indiaUpiInternationalActivationActivity2);
                A00.A0r(false);
                A00.A0q(this.this$0.getString(R.string.f12nameremoved));
                A00.A0p(str);
                B84.A00(A00, this.this$0, 47, R.string.f12nameremoved);
                C36341k9.A11(A00);
            } else {
                indiaUpiInternationalActivationActivity2.finish();
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
