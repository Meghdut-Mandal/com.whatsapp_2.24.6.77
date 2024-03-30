package X;

import android.content.Intent;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.ConfirmReceivePaymentFragment;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: X.B9j  reason: case insensitive filesystem */
public class C23201B9j implements B1J {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C23201B9j(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = str;
    }

    public void BTB(C175798b4 r5) {
        AnonymousClass9YB A012;
        C22935Ayl r2;
        if (this.A03 != 0) {
            Log.i("PAY: BrazilPayBloksActivity BrazilGetVerificationMethods - onCardVerified");
            A012 = ((C179158jJ) this.A00).A0F.A01();
            r2 = new C203869p1(this.A01, this, 15);
        } else {
            Log.i("PAY: BrazilConfirmReceivePayment BrazilGetVerificationMethods - onCardVerified");
            A012 = ((ConfirmReceivePaymentFragment) this.A00).A03.A01();
            r2 = new C1898595w(r5, this, this.A01, 2);
        }
        A012.A04(r2, r5);
    }

    public void BfN(C202059ky r9, List list) {
        int i;
        if (this.A03 != 0) {
            if (r9 != null) {
                i = r9.A00;
            } else if (list != null && !list.isEmpty()) {
                BrazilPayBloksActivity brazilPayBloksActivity = (BrazilPayBloksActivity) this.A00;
                if (C201269jE.A01(list)) {
                    i = -233;
                } else {
                    int A04 = C165587tf.A04(brazilPayBloksActivity, list);
                    JSONArray A022 = brazilPayBloksActivity.A07.A02(list);
                    int A07 = BrazilPayBloksActivity.A07(list);
                    C21669AUm A0R = C165597tg.A0R(brazilPayBloksActivity.A0D, list, A04, A07);
                    C175798b4 r3 = (C175798b4) brazilPayBloksActivity.A05.A07(this.A02);
                    if (A022 != null) {
                        ((AnonymousClass6C8) this.A01).A01("on_success", brazilPayBloksActivity.A0L.A04(r3, A0R, A022.toString(), A07));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            C179158jJ.A0j((AnonymousClass6C8) this.A01, (Map) null, i);
            return;
        }
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) this.A00;
        brazilConfirmReceivePaymentFragment.A00.A02();
        if (r9 == null && list != null && !list.isEmpty()) {
            if (brazilConfirmReceivePaymentFragment.A05.A0E(2443)) {
                Collections.sort(list);
            }
            JSONArray A023 = brazilConfirmReceivePaymentFragment.A07.A02(list);
            int A072 = BrazilPayBloksActivity.A07(list);
            if (A023 != null && !C201269jE.A01(list)) {
                C21669AUm A0R2 = C165597tg.A0R(brazilConfirmReceivePaymentFragment.A05, list, 2443, A072);
                String str = this.A02;
                String obj = A023.toString();
                C175798b4 r4 = (C175798b4) C165617ti.A0O(brazilConfirmReceivePaymentFragment.A03).A07(str);
                if (r4 != null) {
                    Intent A032 = brazilConfirmReceivePaymentFragment.A0G.A03(brazilConfirmReceivePaymentFragment.A0h(), r4, A0R2, obj, A072);
                    C1025050g.A01(A032, "onboarding_context", "p2p_context");
                    brazilConfirmReceivePaymentFragment.A1C(A032);
                }
                DialogFragment dialogFragment = (DialogFragment) this.A01;
                if (dialogFragment != null) {
                    dialogFragment.A1b();
                    return;
                }
                return;
            }
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PAY: BrazilConfirmReceivePayment GetVerificationMethods Error: ");
        C36321k7.A1Y(A0u, 0);
        brazilConfirmReceivePaymentFragment.A08.A01(brazilConfirmReceivePaymentFragment.A1D(), brazilConfirmReceivePaymentFragment.A05, brazilConfirmReceivePaymentFragment.A0D, 0, R.string.f12nameremoved).show();
    }
}
