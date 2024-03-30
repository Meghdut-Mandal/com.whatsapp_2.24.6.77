package X;

import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* renamed from: X.5Mu  reason: invalid class name and case insensitive filesystem */
public final class C107165Mu extends C132446Tt {
    public final C34811hg A00;
    public final C107265Nh A01;
    public final WeakReference A02;
    public final ArrayList A03;
    public final ArrayList A04 = AnonymousClass001.A0I();
    public final LinkedHashMap A05;
    public final Lock A06;
    public final AnonymousClass16D A07;
    public final AnonymousClass171 A08;
    public final C19970wo A09;
    public final C26211Jh A0A;
    public final C20810yC A0B;
    public final C20350xQ A0C;
    public final AnonymousClass1C6 A0D;

    public C107165Mu(C34811hg r2, AnonymousClass16D r3, AnonymousClass171 r4, C19970wo r5, C26211Jh r6, C20810yC r7, C20350xQ r8, AnonymousClass1C6 r9, C107265Nh r10, WeakReference weakReference, ArrayList arrayList, LinkedHashMap linkedHashMap, Lock lock) {
        AnonymousClass00C.A0D(r2, 1);
        C36321k7.A17(lock, linkedHashMap, arrayList, 2);
        C36321k7.A1C(r5, r7, r9, r3, r4);
        C36341k9.A1G(r8, r6);
        this.A00 = r2;
        this.A06 = lock;
        this.A01 = r10;
        this.A05 = linkedHashMap;
        this.A03 = arrayList;
        this.A09 = r5;
        this.A0B = r7;
        this.A0D = r9;
        this.A07 = r3;
        this.A08 = r4;
        this.A0C = r8;
        this.A0A = r6;
        this.A02 = weakReference;
    }

    public static final C143956rO A00(CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel, C107165Mu r10) {
        C19970wo r4 = r10.A09;
        C20810yC r1 = r10.A0B;
        AnonymousClass16D r3 = r10.A07;
        AnonymousClass171 r0 = r10.A08;
        C107265Nh r2 = r10.A01;
        AnonymousClass72P r5 = new AnonymousClass72P(r3, r0, r4, r1);
        r5.A03.add(r2);
        AnonymousClass141 A002 = C65473Sf.A00(r3, r10.A0C, r10.A0D, r2);
        String A032 = r10.A0A.A03(r2);
        return new C143956rO(r5, callsHistoryFragmentV2ViewModel.A0T(r5, A002, A032), A002, A032, (List) null, -1);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        AnonymousClass00C.A0D(pair, 0);
        C34811hg r0 = this.A00;
        Object obj2 = pair.first;
        AnonymousClass00C.A07(obj2);
        Object obj3 = pair.second;
        AnonymousClass00C.A07(obj3);
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r0.A00;
        callsHistoryFragmentV2ViewModel.A08 = null;
        callsHistoryFragmentV2ViewModel.A0Z((ArrayList) obj3, (LinkedHashMap) obj2);
    }
}
