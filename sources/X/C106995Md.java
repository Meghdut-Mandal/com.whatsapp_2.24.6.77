package X;

import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.5Md  reason: invalid class name and case insensitive filesystem */
public class C106995Md extends C132446Tt {
    public final C34771hc A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass171 A02;
    public final C19970wo A03;
    public final C20810yC A04;
    public final C20350xQ A05;
    public final AnonymousClass1C6 A06;
    public final C107265Nh A07;
    public final WeakReference A08;
    public final ArrayList A09;
    public final LinkedHashMap A0A;
    public final Lock A0B;
    public final C34631hO A0C;
    public final C26211Jh A0D;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        C34771hc r0 = this.A00;
        ArrayList arrayList = (ArrayList) pair.second;
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r0.A00;
        callsHistoryFragmentV2ViewModel.A06 = null;
        callsHistoryFragmentV2ViewModel.A0Z(arrayList, (LinkedHashMap) pair.first);
    }

    public C106995Md(C34771hc r2, CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel, C34631hO r4, AnonymousClass16D r5, AnonymousClass171 r6, C19970wo r7, C26211Jh r8, C20810yC r9, C20350xQ r10, AnonymousClass1C6 r11, C107265Nh r12, ArrayList arrayList, LinkedHashMap linkedHashMap, Lock lock) {
        this.A00 = r2;
        this.A0B = lock;
        this.A07 = r12;
        this.A0A = linkedHashMap;
        this.A09 = arrayList;
        this.A03 = r7;
        this.A04 = r9;
        this.A06 = r11;
        this.A01 = r5;
        this.A02 = r6;
        this.A05 = r10;
        this.A0D = r8;
        this.A0C = r4;
        this.A08 = AnonymousClass001.A0F(callsHistoryFragmentV2ViewModel);
    }
}
