package X;

import android.text.TextUtils;
import com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel;

/* renamed from: X.6wk  reason: invalid class name and case insensitive filesystem */
public class C147146wk implements AnonymousClass1XD {
    public final /* synthetic */ IndiaPaymentSettingsViewModel A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ Integer A02;

    public C147146wk(IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel, Integer num, Integer num2) {
        this.A00 = indiaPaymentSettingsViewModel;
        this.A02 = num;
        this.A01 = num2;
    }

    public void Bes(C202059ky r5) {
        IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = this.A00;
        C24601Db r2 = indiaPaymentSettingsViewModel.A07;
        r2.A0G(C19970wo.A00(indiaPaymentSettingsViewModel.A05));
        r2.A0D(0);
        indiaPaymentSettingsViewModel.A0C.A05(AnonymousClass000.A0l(r5, "accountRecovery/getPaymentTransactions/onRequestError. paymentNetworkError: ", AnonymousClass000.A0u()));
    }

    public void Bf0(C202059ky r5) {
        IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = this.A00;
        C24601Db r2 = indiaPaymentSettingsViewModel.A07;
        r2.A0G(C19970wo.A00(indiaPaymentSettingsViewModel.A05));
        r2.A0D(0);
        indiaPaymentSettingsViewModel.A0C.A05(AnonymousClass000.A0l(r5, "accountRecovery/getPaymentTransactions/onResponseError. paymentNetworkError: ", AnonymousClass000.A0u()));
    }

    public void Bf1(AnonymousClass9KX r8) {
        C24601Db r2;
        int i;
        boolean z = r8 instanceof C178548gi;
        IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = this.A00;
        if (z) {
            indiaPaymentSettingsViewModel.A0C.A04("accountRecovery/getTransactions/onResponseSuccess");
            C178548gi r82 = (C178548gi) r8;
            C206879u9 r1 = r82.A00;
            if (r1 == null) {
                return;
            }
            if (r1.A01 || TextUtils.isEmpty(r1.A00)) {
                r2 = indiaPaymentSettingsViewModel.A07;
                r2.A0G(C19970wo.A00(indiaPaymentSettingsViewModel.A05));
                i = 2;
            } else {
                indiaPaymentSettingsViewModel.A06.A01(this, this.A02, this.A01, r82.A00.A00, (String) null);
                return;
            }
        } else {
            r2 = indiaPaymentSettingsViewModel.A07;
            r2.A0G(C19970wo.A00(indiaPaymentSettingsViewModel.A05));
            indiaPaymentSettingsViewModel.A0C.A04("unexpected payment transaction result type.");
            i = 0;
        }
        r2.A0D(i);
    }
}
