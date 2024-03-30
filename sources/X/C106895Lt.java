package X;

import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.5Lt  reason: invalid class name and case insensitive filesystem */
public class C106895Lt extends C132446Tt {
    public final /* synthetic */ C34621hN A00;

    public C106895Lt(C34621hN r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Collection collection = (Collection) obj;
        C34621hN r1 = this.A00;
        r1.A02 = null;
        if (collection == null) {
            Log.i("CallsHistoryDataSource/notifyAdditionalCallGroupsLoaded task result null");
            return;
        }
        C34751ha r12 = r1.A07;
        if (r12 != null) {
            ArrayList A15 = C36441kJ.A15(collection);
            Log.i("CallsHistoryViewModel/onAdditionalCallGroupsLoaded");
            CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r12.A00;
            C36331k8.A1E(callsHistoryFragmentV2ViewModel.A05);
            Lock lock = callsHistoryFragmentV2ViewModel.A0n;
            C34801hf r4 = callsHistoryFragmentV2ViewModel.A0N;
            LinkedHashMap linkedHashMap = callsHistoryFragmentV2ViewModel.A0m;
            ArrayList arrayList = callsHistoryFragmentV2ViewModel.A0k;
            AnonymousClass1C6 r10 = callsHistoryFragmentV2ViewModel.A0h;
            AnonymousClass16D r7 = callsHistoryFragmentV2ViewModel.A0X;
            C20350xQ r9 = callsHistoryFragmentV2ViewModel.A0g;
            C106965Ma r3 = new C106965Ma(r4, callsHistoryFragmentV2ViewModel, callsHistoryFragmentV2ViewModel.A0V, r7, callsHistoryFragmentV2ViewModel.A0e, r9, r10, A15, arrayList, linkedHashMap, lock);
            callsHistoryFragmentV2ViewModel.A05 = r3;
            r3.A02.executeOnExecutor(callsHistoryFragmentV2ViewModel.A0B, new Void[0]);
        }
    }
}
