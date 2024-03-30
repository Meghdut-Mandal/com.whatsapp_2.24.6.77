package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment;

/* renamed from: X.ADu  reason: case insensitive filesystem */
public final class C21238ADu implements AnonymousClass1XD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C188098z2 A01;
    public final /* synthetic */ HybridPaymentMethodPickerFragment A02;

    public C21238ADu(C188098z2 r1, HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment, int i) {
        this.A02 = hybridPaymentMethodPickerFragment;
        this.A01 = r1;
        this.A00 = i;
    }

    public void Bes(C202059ky r5) {
        HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment = this.A02;
        Context A1D = hybridPaymentMethodPickerFragment.A1D();
        if (A1D != null) {
            AnonymousClass1EU r0 = hybridPaymentMethodPickerFragment.A09;
            if (r0 != null) {
                AnonymousClass1FR.A0A(A1D, hybridPaymentMethodPickerFragment.A0n(R.string.f12nameremoved), r0.A05().BB6());
                return;
            }
            throw C36331k8.A0d("paymentsManager");
        }
    }

    public void Bf0(C202059ky r5) {
        HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment = this.A02;
        Context A1D = hybridPaymentMethodPickerFragment.A1D();
        if (A1D != null) {
            AnonymousClass1EU r0 = hybridPaymentMethodPickerFragment.A09;
            if (r0 != null) {
                AnonymousClass1FR.A0A(A1D, hybridPaymentMethodPickerFragment.A0n(R.string.f12nameremoved), r0.A05().BB6());
                return;
            }
            throw C36331k8.A0d("paymentsManager");
        }
    }

    public void Bf1(AnonymousClass9KX r6) {
        int ordinal = this.A01.ordinal();
        HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment = this.A02;
        C24601Db r0 = hybridPaymentMethodPickerFragment.A07;
        if (ordinal != 0) {
            if (r0 != null) {
                if (ordinal != 1) {
                    r0.A0A();
                    r0 = hybridPaymentMethodPickerFragment.A07;
                    if (r0 == null) {
                        throw C36331k8.A0d("paymentSharedPrefs");
                    }
                }
                C36331k8.A0w(C90494aF.A0E(r0), "pref_p2m_hybrid_v2_tos_accepted", true);
            } else {
                throw C36331k8.A0d("paymentSharedPrefs");
            }
        } else if (r0 != null) {
            r0.A0A();
        } else {
            throw C36331k8.A0d("paymentSharedPrefs");
        }
        HybridPaymentMethodPickerFragment.A03(hybridPaymentMethodPickerFragment, this.A00);
    }
}
