package X;

import android.content.Context;
import android.content.Intent;
import android.text.style.URLSpan;
import android.view.View;
import com.whatsapp.inappsupport.ui.ContactUsActivity;
import com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet;

/* renamed from: X.4Vv  reason: invalid class name and case insensitive filesystem */
public class C89254Vv extends C33991gH {
    public Object A00;
    public Object A01;
    public final int A02 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89254Vv(Context context, Context context2, ContactUsActivity contactUsActivity) {
        super(context);
        this.A00 = contactUsActivity;
        this.A01 = context2;
    }

    public void onClick(View view) {
        if (this.A02 != 0) {
            Intent A04 = C36331k8.A04(((URLSpan) this.A01).getURL());
            AnonymousClass02E r2 = (AnonymousClass02E) this.A00;
            AnonymousClass01I A0h = r2.A0h();
            if (A0h != null && A0h.getPackageManager().resolveActivity(A04, 0) != null) {
                r2.A0h().startActivity(A04);
                return;
            }
            return;
        }
        ContactUsActivity contactUsActivity = (ContactUsActivity) this.A00;
        Class BFl = contactUsActivity.A0L.A05().BFl();
        C36321k7.A1K(BFl, "PAY: ContactUsActivity starting settings ", AnonymousClass000.A0u());
        Context context = (Context) this.A01;
        context.startActivity(C36441kJ.A0H(context, BFl));
        C23075B3f BBn = contactUsActivity.A0L.A05().BBn();
        if (BBn != null) {
            C131606Ps r3 = new C131606Ps(new C131606Ps[0]);
            r3.A03("hc_entrypoint", "wa_settings_support");
            r3.A03("app_type", "consumer");
            BBn.BOp(r3, C36361kB.A0i(), 39, "settings_contact_us", (String) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89254Vv(Context context, URLSpan uRLSpan, PaymentCustomInstructionsBottomSheet paymentCustomInstructionsBottomSheet, int i) {
        super(context, i);
        this.A00 = paymentCustomInstructionsBottomSheet;
        this.A01 = uRLSpan;
    }
}
