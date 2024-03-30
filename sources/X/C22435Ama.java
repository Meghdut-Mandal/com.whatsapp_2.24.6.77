package X;

import android.widget.ProgressBar;
import com.whatsapp.R;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.Ama  reason: case insensitive filesystem */
public final class C22435Ama extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ IndiaUpiInternationalActivationActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22435Ama(IndiaUpiInternationalActivationActivity indiaUpiInternationalActivationActivity) {
        super(1);
        this.this$0 = indiaUpiInternationalActivationActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C199809g0 r7 = (C199809g0) obj;
        boolean z = r7.A02;
        ProgressBar progressBar = this.this$0.A02;
        if (z) {
            if (progressBar == null) {
                throw C36331k8.A0d("buttonSpinnerView");
            }
            progressBar.setVisibility(0);
            WDSButton wDSButton = this.this$0.A09;
            if (wDSButton == null) {
                throw C36331k8.A0d("buttonView");
            }
            C36391kE.A1K(wDSButton);
        } else if (progressBar == null) {
            throw C36331k8.A0d("buttonSpinnerView");
        } else {
            progressBar.setVisibility(8);
            WDSButton wDSButton2 = this.this$0.A09;
            if (wDSButton2 == null) {
                throw C36331k8.A0d("buttonView");
            }
            wDSButton2.setText(R.string.f12nameremoved);
        }
        AnonymousClass9WH r1 = r7.A00;
        if (r1 != null) {
            C39001qm A00 = AnonymousClass3LW.A00(this.this$0);
            A00.A0r(false);
            A00.A0q(r1.A01);
            A00.A0p(r1.A00);
            B84.A01(A00, this.this$0, 48, R.string.f12nameremoved);
            C36341k9.A11(A00);
        }
        return AnonymousClass0AJ.A00;
    }
}
