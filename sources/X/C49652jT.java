package X;

import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: X.2jT  reason: invalid class name and case insensitive filesystem */
public final class C49652jT extends C132446Tt {
    public final C34621hN A00;
    public final C585830g A01;
    public final AnonymousClass1HJ A02;
    public final ArrayList A03;
    public final LinkedHashMap A04;
    public final Set A05;
    public final Lock A06;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null) {
            C585830g r0 = this.A01;
            Object obj2 = pair.first;
            AnonymousClass00C.A07(obj2);
            Object obj3 = pair.second;
            AnonymousClass00C.A07(obj3);
            CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r0.A00;
            callsHistoryFragmentV2ViewModel.A0Z((ArrayList) obj3, (LinkedHashMap) obj2);
        }
    }

    public C49652jT(C34621hN r1, C585830g r2, AnonymousClass1HJ r3, ArrayList arrayList, LinkedHashMap linkedHashMap, Set set, Lock lock) {
        C36321k7.A19(lock, set, r3, r1);
        C36321k7.A10(linkedHashMap, arrayList);
        this.A01 = r2;
        this.A06 = lock;
        this.A05 = set;
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = linkedHashMap;
        this.A03 = arrayList;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Pair pair;
        AnonymousClass72P B9E;
        ArrayList A0I = AnonymousClass001.A0I();
        Lock lock = this.A06;
        lock.lock();
        try {
            Set set = this.A05;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String A0C = AnonymousClass001.A0C(it);
                LinkedHashMap linkedHashMap = this.A04;
                if (linkedHashMap.containsKey(A0C)) {
                    C34841hj r1 = (C34841hj) linkedHashMap.get(A0C);
                    if (((r1 instanceof C143946rN) || (r1 instanceof C143936rM)) && (B9E = r1.B9E()) != null) {
                        A0I.addAll(Collections.unmodifiableList(B9E.A03));
                        linkedHashMap.remove(A0C);
                        it.remove();
                    }
                }
            }
            if (!A0I.isEmpty()) {
                this.A02.A0B(A0I);
                pair = C36441kJ.A0Q(new LinkedHashMap(this.A04), C36441kJ.A15(this.A03));
            } else {
                if (!set.isEmpty()) {
                    Log.w("CallsHistoryFragmentV2ViewModel/deleteHistoricalCallItems failed to match group IDs");
                    this.A00.A01();
                }
                pair = null;
            }
            return pair;
        } finally {
            lock.unlock();
        }
    }
}
