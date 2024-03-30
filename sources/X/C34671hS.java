package X;

import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;

/* renamed from: X.1hS  reason: invalid class name and case insensitive filesystem */
public class C34671hS implements C34661hR {
    public final /* synthetic */ C34621hN A00;

    public void Azi(long j, int i) {
        C34621hN r1 = this.A00;
        if (r1.A07 != null) {
            r1.A0S.Boy(new C35211iK(this, i, 0, j));
        }
    }

    public void Azj(AnonymousClass11F r8, String str, int i) {
        C34621hN r1 = this.A00;
        if (r1.A07 != null) {
            r1.A0S.Boy(new C35511io(this, r8, str, 1, 0));
        }
    }

    public C34671hS(C34621hN r1) {
        this.A00 = r1;
    }

    public void Bfl(AnonymousClass3KV r7) {
        C34751ha r0 = this.A00.A07;
        if (r0 != null) {
            CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r0.A00;
            C143936rM r02 = callsHistoryFragmentV2ViewModel.A04;
            if (r02 == null) {
                CallsHistoryFragmentV2ViewModel.A06(callsHistoryFragmentV2ViewModel, r7);
                callsHistoryFragmentV2ViewModel.A00 = 1;
                CallsHistoryFragmentV2ViewModel.A05(callsHistoryFragmentV2ViewModel);
            } else if (r02.A00 > r7.A03) {
                callsHistoryFragmentV2ViewModel.A0M.A02();
            }
        }
    }
}
