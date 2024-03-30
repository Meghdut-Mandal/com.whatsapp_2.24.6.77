package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.9UH  reason: invalid class name */
public class AnonymousClass9UH {
    public final C24631De A00;
    public final AnonymousClass1EV A01;
    public final AnonymousClass1EU A02;

    public Intent A00(Context context, C207199ui r5, C64933Qa r6, String str, String str2, String str3) {
        B66 A05;
        AnonymousClass1EV r1 = this.A01;
        if (!r1.A02() || !r1.A0I(str)) {
            A05 = this.A02.A05();
        } else {
            A05 = this.A02.A04("P2M_LITE");
        }
        if (A05 != null) {
            Class BFn = A05.BFn();
            if (BFn == null) {
                Log.e("PAY: PaymentIntents/getTransactionDetailsIntent -> transactionDetailClass is null");
            } else {
                Intent A0H = C36441kJ.A0H(context, BFn);
                if (str2 != null) {
                    A0H.putExtra("extra_transaction_id", str2);
                }
                if (r6 != null) {
                    AnonymousClass3UJ.A00(A0H, r6);
                }
                if (r5 != null && !TextUtils.isEmpty(r5.A04)) {
                    A0H.putExtra("extra_payment_receipt_type", "non_native");
                }
                if (str3 != null) {
                    C165597tg.A0z(A0H, str3);
                }
                A0H.setFlags(603979776);
                return A0H;
            }
        }
        return null;
    }

    public void A01(Intent intent) {
        AnonymousClass16U A012 = this.A00.A01();
        if (A012 != null) {
            AnonymousClass16W r2 = (AnonymousClass16W) A012;
            intent.putExtra("extra_payment_preset_min_amount", r2.A01.A00.toString());
            intent.putExtra("extra_payment_preset_max_amount", r2.A00.A00.toString());
        }
    }

    public AnonymousClass9UH(C24631De r1, AnonymousClass1EV r2, AnonymousClass1EU r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
