package X;

import android.content.Intent;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalValidateQrActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalValidateQrViewModel;
import java.math.BigDecimal;

/* renamed from: X.Amb  reason: case insensitive filesystem */
public final class C22436Amb extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ IndiaUpiInternationalValidateQrActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22436Amb(IndiaUpiInternationalValidateQrActivity indiaUpiInternationalValidateQrActivity) {
        super(1);
        this.this$0 = indiaUpiInternationalValidateQrActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass97I r15 = (AnonymousClass97I) obj;
        if (r15 instanceof C179268jn) {
            IndiaUpiInternationalValidateQrActivity indiaUpiInternationalValidateQrActivity = this.this$0;
            A8P a8p = indiaUpiInternationalValidateQrActivity.A00;
            if (a8p != null) {
                Intent A01 = a8p.A01(indiaUpiInternationalValidateQrActivity, true, false);
                IndiaUpiInternationalValidateQrViewModel indiaUpiInternationalValidateQrViewModel = (IndiaUpiInternationalValidateQrViewModel) this.this$0.A02.getValue();
                AnonymousClass00C.A0B(A01);
                C206799tz r9 = ((C179268jn) r15).A00;
                String str = this.this$0.A0e;
                AnonymousClass00C.A0D(r9, 1);
                Class<String> cls = String.class;
                A01.putExtra("extra_payment_handle", C165617ti.A0P(C146356vT.A00(), cls, r9.A09, "upiHandle"));
                A01.putExtra("extra_merchant_code", r9.A06);
                C146356vT A00 = C146356vT.A00();
                String str2 = r9.A07;
                A01.putExtra("extra_payee_name", C165617ti.A0P(A00, cls, str2, "accountHolderName"));
                A01.putExtra("extra_initiation_mode", r9.A04);
                A01.putExtra("extra_purpose_code", "11");
                A01.putExtra("extra_payment_preset_amount", r9.A08);
                A01.putExtra("extra_payment_preset_min_amount", (String) null);
                A01.putExtra("extra_skip_value_props_display", false);
                String str3 = r9.A02;
                int i = 9;
                if (!str3.equals("DEEP_LINK")) {
                    i = 8;
                }
                A01.putExtra("extra_payments_entry_type", i);
                C20810yC r1 = indiaUpiInternationalValidateQrViewModel.A01;
                BigDecimal bigDecimal = C202809mh.A00;
                A01.putExtra("extra_payment_preset_max_amount", C165607th.A07(r1));
                A01.putExtra("extra_payee_name", C165617ti.A0P(C146356vT.A00(), cls, str2, "accountHolderName"));
                A01.putExtra("extra_is_first_payment_method", true);
                A01.putExtra("extra_upi_global_meta_data", r9);
                C165597tg.A0z(A01, str);
                A01.putExtra("extra_is_pay_money_only", true);
                A01.putExtra("return-after-pay", "DEEP_LINK".equals(str3));
                A01.putExtra("verify-vpa-in-background", false);
                A01.addFlags(33554432);
                this.this$0.startActivity(A01);
                this.this$0.finish();
            } else {
                throw C36331k8.A0d("paymentActivityLauncher");
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
