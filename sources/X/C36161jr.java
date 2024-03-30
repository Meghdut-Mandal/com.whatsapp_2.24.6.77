package X;

import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1jr  reason: invalid class name and case insensitive filesystem */
public class C36161jr implements C32011co {
    public Object A00;
    public final int A01;

    public C36161jr(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00(C107265Nh r5) {
        AnonymousClass11F r0;
        if (r5 != null) {
            ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
            if (C34681hT.A0K(conversationsFragment.A21)) {
                if (r5.A0D != null) {
                    r0 = r5.A0D;
                } else if (r5.A0M()) {
                    Iterator it = r5.A0D().iterator();
                    while (it.hasNext()) {
                        AnonymousClass11F r1 = (AnonymousClass11F) it.next();
                        if (!conversationsFragment.A0f.A0M(r1)) {
                            ConversationsFragment.A0M(conversationsFragment, r1);
                        }
                    }
                    return;
                } else {
                    r0 = r5.A04.A01;
                }
                ConversationsFragment.A0M(conversationsFragment, r0);
            }
        }
    }

    public void BSd() {
        if (this.A01 != 0) {
            ((ConversationsFragment) this.A00).A1f();
            return;
        }
        Log.i("CallsHistoryDataSource/onCallLogDeleted");
        C34751ha r2 = ((C34621hN) this.A00).A07;
        if (r2 != null) {
            Log.i("CallsHistoryViewModel/onCallLogCleared");
            C18670tX.A00(r2.A00, new AnonymousClass4WO(r2, 2));
        }
    }

    public void BSf() {
        if (this.A01 == 0) {
            Log.i("CallsHistoryDataSource/onCallLogHistoryApplied");
            ((C34621hN) this.A00).A01();
        }
    }

    public void BSg(C107265Nh r16) {
        C107265Nh r10 = r16;
        if (this.A01 != 0) {
            A00(r10);
            return;
        }
        Log.i("CallsHistoryDataSource/onCallLogUpdated");
        if (r10.A0F != null) {
            C34621hN r3 = (C34621hN) this.A00;
            if (C20800yB.A01(C21000yV.A02, r3.A0L, 6522)) {
                C34751ha r1 = r3.A07;
                if (r1 != null) {
                    Log.i("CallsHistoryViewModel/onOngoingCallLogUpdated");
                    CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r1.A00;
                    C107165Mu r2 = callsHistoryFragmentV2ViewModel.A08;
                    if (r2 != null) {
                        r2.A0D(true);
                    }
                    C34811hg r22 = callsHistoryFragmentV2ViewModel.A0P;
                    Lock lock = callsHistoryFragmentV2ViewModel.A0n;
                    LinkedHashMap linkedHashMap = callsHistoryFragmentV2ViewModel.A0m;
                    ArrayList arrayList = callsHistoryFragmentV2ViewModel.A0k;
                    C19970wo r5 = callsHistoryFragmentV2ViewModel.A0Z;
                    C20810yC r7 = callsHistoryFragmentV2ViewModel.A0f;
                    AnonymousClass1C6 r9 = callsHistoryFragmentV2ViewModel.A0h;
                    C107165Mu r12 = new C107165Mu(r22, callsHistoryFragmentV2ViewModel.A0X, callsHistoryFragmentV2ViewModel.A0Y, r5, callsHistoryFragmentV2ViewModel.A0e, r7, callsHistoryFragmentV2ViewModel.A0g, r9, r10, new WeakReference(callsHistoryFragmentV2ViewModel), arrayList, linkedHashMap, lock);
                    callsHistoryFragmentV2ViewModel.A08 = r12;
                    C18670tX.A00(callsHistoryFragmentV2ViewModel, r12);
                    return;
                }
                return;
            }
        }
        ((C34621hN) this.A00).A01();
    }

    public void BSh(Collection collection) {
        if (this.A01 != 0) {
            collection.size();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                A00((C107265Nh) it.next());
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CallsHistoryDataSource/onCallLogsDeleted: size:");
        sb.append(collection.size());
        Log.i(sb.toString());
        C34751ha r2 = ((C34621hN) this.A00).A07;
        if (r2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CallsHistoryViewModel/onCallLogsDeleted(");
            sb2.append(collection.size());
            sb2.append(")");
            Log.i(sb2.toString());
            CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r2.A00;
            if (!callsHistoryFragmentV2ViewModel.A0H) {
                Log.i("CallsHistoryViewModel/onCallLogsDeleted skip due to no active observer");
            } else {
                callsHistoryFragmentV2ViewModel.A0M.A01();
            }
        }
    }
}
