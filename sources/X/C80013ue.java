package X;

import com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel;

/* renamed from: X.3ue  reason: invalid class name and case insensitive filesystem */
public final class C80013ue implements C88664To {
    public final /* synthetic */ CrossPostingUpdatesViewModel A00;

    public C80013ue(CrossPostingUpdatesViewModel crossPostingUpdatesViewModel) {
        this.A00 = crossPostingUpdatesViewModel;
    }

    public void BgY(C63023Il r4) {
        CrossPostingUpdatesViewModel.A01(this.A00, r4.A00, r4.A01);
    }

    public void Bjz(C63023Il r6) {
        CrossPostingUpdatesViewModel crossPostingUpdatesViewModel = this.A00;
        boolean z = r6.A00;
        boolean z2 = r6.A01;
        AnonymousClass3KF r1 = crossPostingUpdatesViewModel.A00;
        if (r1 == null) {
            throw C36331k8.A0d("crossPostingViewModelState");
        } else if (r1.A05 != z || r1.A04 != z2) {
            r1.A05 = z;
            r1.A04 = z2;
            C61653Cx r0 = crossPostingUpdatesViewModel.A01;
            if (r0 != null) {
                r0.A00();
            }
        }
    }
}
