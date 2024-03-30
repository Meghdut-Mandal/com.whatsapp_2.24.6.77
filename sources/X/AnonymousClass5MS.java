package X;

import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.5MS  reason: invalid class name */
public class AnonymousClass5MS extends C132446Tt {
    public final C34781hd A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass11F A02;
    public final WeakReference A03;
    public final ArrayList A04;
    public final LinkedHashMap A05;
    public final Lock A06;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        boolean z;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        Pair pair = (Pair) obj;
        C34781hd r2 = this.A00;
        if (pair == null) {
            z = true;
            linkedHashMap = C36431kI.A1G();
            arrayList = AnonymousClass001.A0I();
        } else {
            z = false;
            linkedHashMap = (LinkedHashMap) pair.first;
            arrayList = (ArrayList) pair.second;
        }
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r2.A00;
        callsHistoryFragmentV2ViewModel.A07 = null;
        if (z) {
            Log.i("CallsHistoryFragmentV2ViewModel/ProcessOnProfilePhotoChangedTask refreshCalls");
            callsHistoryFragmentV2ViewModel.A0M.A01();
            return;
        }
        callsHistoryFragmentV2ViewModel.A0Z(arrayList, linkedHashMap);
    }

    public AnonymousClass5MS(C34781hd r2, CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel, AnonymousClass16D r4, AnonymousClass11F r5, ArrayList arrayList, LinkedHashMap linkedHashMap, Lock lock) {
        this.A02 = r5;
        this.A06 = lock;
        this.A00 = r2;
        this.A05 = linkedHashMap;
        this.A04 = arrayList;
        this.A01 = r4;
        this.A03 = AnonymousClass001.A0F(callsHistoryFragmentV2ViewModel);
    }
}
