package X;

import com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel;

/* renamed from: X.6ws  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C147226ws implements C22963AzF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ IndiaUpiPauseMandateViewModel A02;

    public /* synthetic */ C147226ws(IndiaUpiPauseMandateViewModel indiaUpiPauseMandateViewModel, long j, long j2) {
        this.A02 = indiaUpiPauseMandateViewModel;
        this.A00 = j;
        this.A01 = j2;
    }

    public final void Bf8(C202059ky r9) {
        IndiaUpiPauseMandateViewModel indiaUpiPauseMandateViewModel = this.A02;
        long j = this.A00;
        long j2 = this.A01;
        if (r9 == null) {
            indiaUpiPauseMandateViewModel.A0A.Boy(new C80343vF(indiaUpiPauseMandateViewModel, 1, j, j2));
            return;
        }
        AnonymousClass9OA r1 = new AnonymousClass9OA(3);
        r1.A04 = r9;
        indiaUpiPauseMandateViewModel.A02.A0C(r1);
    }
}
