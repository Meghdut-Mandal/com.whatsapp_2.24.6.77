package X;

import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.5MP  reason: invalid class name */
public class AnonymousClass5MP extends C132446Tt {
    public final C34791he A00;
    public final WeakReference A01;
    public final ArrayList A02;
    public final Collection A03;
    public final LinkedHashMap A04;
    public final Lock A05;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        C34791he r0 = this.A00;
        ArrayList arrayList = (ArrayList) pair.second;
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r0.A00;
        callsHistoryFragmentV2ViewModel.A0A = null;
        callsHistoryFragmentV2ViewModel.A0Z(arrayList, (LinkedHashMap) pair.first);
    }

    public AnonymousClass5MP(C34791he r2, CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel, ArrayList arrayList, Collection collection, LinkedHashMap linkedHashMap, Lock lock) {
        this.A00 = r2;
        this.A05 = lock;
        this.A03 = collection;
        this.A04 = linkedHashMap;
        this.A02 = arrayList;
        this.A01 = AnonymousClass001.A0F(callsHistoryFragmentV2ViewModel);
    }
}
