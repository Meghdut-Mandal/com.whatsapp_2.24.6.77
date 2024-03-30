package X;

import android.text.TextUtils;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;

/* renamed from: X.1hX  reason: invalid class name and case insensitive filesystem */
public class C34721hX extends C34711hW {
    public final /* synthetic */ CallsHistoryFragmentV2ViewModel A00;

    public C34721hX(CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel) {
        this.A00 = callsHistoryFragmentV2ViewModel;
    }

    public void A00(AnonymousClass6X6 r3, AnonymousClass147 r4) {
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = this.A00;
        synchronized (callsHistoryFragmentV2ViewModel) {
            callsHistoryFragmentV2ViewModel.A0D = null;
        }
        C34821hh r1 = callsHistoryFragmentV2ViewModel.A0T;
        if (!TextUtils.isEmpty(r1.A01)) {
            r1.filter(r1.A01);
        }
    }
}
