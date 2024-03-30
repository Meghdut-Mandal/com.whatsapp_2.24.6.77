package X;

import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* renamed from: X.5Mb  reason: invalid class name and case insensitive filesystem */
public class C106975Mb extends C132446Tt {
    public final C34761hb A00;
    public final AnonymousClass16D A01;
    public final C26211Jh A02;
    public final C20350xQ A03;
    public final AnonymousClass1C6 A04;
    public final WeakReference A05;
    public final ArrayList A06;
    public final ArrayList A07;
    public final LinkedHashMap A08;
    public final Lock A09;
    public final C34631hO A0A;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        C34761hb r1 = this.A00;
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) pair.first);
        ArrayList A15 = C36441kJ.A15((Collection) pair.second);
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r1.A00;
        callsHistoryFragmentV2ViewModel.A09 = null;
        callsHistoryFragmentV2ViewModel.A0Z(A15, linkedHashMap);
    }

    public C106975Mb(C34761hb r2, CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel, C34631hO r4, AnonymousClass16D r5, C26211Jh r6, C20350xQ r7, AnonymousClass1C6 r8, ArrayList arrayList, ArrayList arrayList2, LinkedHashMap linkedHashMap, Lock lock) {
        this.A00 = r2;
        this.A09 = lock;
        this.A07 = C36441kJ.A15(arrayList);
        this.A08 = linkedHashMap;
        this.A06 = arrayList2;
        this.A04 = r8;
        this.A01 = r5;
        this.A03 = r7;
        this.A02 = r6;
        this.A0A = r4;
        this.A05 = AnonymousClass001.A0F(callsHistoryFragmentV2ViewModel);
    }
}
