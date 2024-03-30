package X;

import android.text.TextUtils;
import android.widget.Filter;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1hh  reason: invalid class name and case insensitive filesystem */
public class C34821hh extends Filter {
    public int A00 = 0;
    public CharSequence A01 = "";
    public final /* synthetic */ CallsHistoryFragmentV2ViewModel A02;

    private void A03(ArrayList arrayList, ArrayList arrayList2, HashSet hashSet) {
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel;
        ArrayList arrayList3;
        UserJid userJid;
        A01(arrayList2, 2);
        synchronized (this) {
            callsHistoryFragmentV2ViewModel = this.A02;
            if (callsHistoryFragmentV2ViewModel.A0E == null) {
                ArrayList arrayList4 = new ArrayList();
                callsHistoryFragmentV2ViewModel.A0E = arrayList4;
                callsHistoryFragmentV2ViewModel.A0X.A0n(arrayList4);
                if (C20800yB.A01(C21000yV.A01, callsHistoryFragmentV2ViewModel.A0f, 3637)) {
                    Collections.sort(callsHistoryFragmentV2ViewModel.A0E, new C81563xD(callsHistoryFragmentV2ViewModel.A0Y, callsHistoryFragmentV2ViewModel.A0a));
                }
            }
            arrayList3 = callsHistoryFragmentV2ViewModel.A0E;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            AnonymousClass141 r2 = (AnonymousClass141) it.next();
            if (r2.A0F != null && (userJid = (UserJid) r2.A06(UserJid.class)) != null && !hashSet.contains(userJid) && callsHistoryFragmentV2ViewModel.A0Y.A0h(r2, arrayList, true)) {
                arrayList2.add(new C69693dw(userJid, arrayList2.size() - this.A00, arrayList));
                if (C20800yB.A01(C21000yV.A01, callsHistoryFragmentV2ViewModel.A0f, 3637)) {
                    hashSet.add(userJid);
                }
            }
        }
        A02(arrayList2, 2);
    }

    /* JADX INFO: finally extract failed */
    private void A04(ArrayList arrayList, ArrayList arrayList2, HashSet hashSet) {
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = this.A02;
        int i = 1;
        if (C20800yB.A01(C21000yV.A01, callsHistoryFragmentV2ViewModel.A0f, 3637)) {
            i = 4;
        }
        ArrayList arrayList3 = arrayList2;
        A01(arrayList2, i);
        Lock lock = callsHistoryFragmentV2ViewModel.A0n;
        lock.lock();
        try {
            for (C34841hj r8 : callsHistoryFragmentV2ViewModel.A0m.values()) {
                if (r8.BD8() == 2) {
                    C143946rN r82 = (C143946rN) r8;
                    A00(r82.A01, r82, arrayList, arrayList3, hashSet);
                }
            }
            lock.unlock();
            A02(arrayList2, i);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public C34821hh(CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel) {
        this.A02 = callsHistoryFragmentV2ViewModel;
    }

    private void A00(AnonymousClass72P r18, C34841hj r19, ArrayList arrayList, ArrayList arrayList2, HashSet hashSet) {
        AnonymousClass141 A022;
        C34841hj r10 = r19;
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = this.A02;
        AnonymousClass16D r9 = callsHistoryFragmentV2ViewModel.A0X;
        AnonymousClass1C6 r8 = callsHistoryFragmentV2ViewModel.A0h;
        C20350xQ r4 = callsHistoryFragmentV2ViewModel.A0g;
        AnonymousClass72P r3 = r18;
        ArrayList arrayList3 = arrayList;
        if (r3.A04()) {
            ArrayList arrayList4 = r3.A03;
            boolean z = false;
            if (((C107265Nh) arrayList4.get(0)).A08 == 2) {
                z = true;
            }
            A022 = AnonymousClass3UL.A01(r9, r4, ((C107265Nh) arrayList4.get(0)).A0D, r8, z);
            if (A022 == null || !r3.A01.A0h(A022, arrayList3, true)) {
                ArrayList arrayList5 = new ArrayList();
                if (!arrayList4.isEmpty()) {
                    Iterator it = ((C107265Nh) arrayList4.get(0)).A0C().iterator();
                    while (it.hasNext()) {
                        arrayList5.add(r3.A00.A0D(((C107255Nf) it.next()).A00));
                    }
                }
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    A022 = (AnonymousClass141) it2.next();
                    if (r3.A01.A0h(A022, arrayList3, true)) {
                        if (A022 == null) {
                            return;
                        }
                    }
                }
                return;
            }
        } else {
            A022 = r3.A02();
            if (A022 == null || !r3.A01.A0h(A022, arrayList3, true)) {
                return;
            }
        }
        ArrayList arrayList6 = arrayList2;
        int size = arrayList6.size() - this.A00;
        if (r10 instanceof C143946rN) {
            C143946rN r102 = (C143946rN) r10;
            r10 = new C143946rN(r102.A01, r102.A02, r102.A03, arrayList3, size);
        } else if (r10 instanceof C143956rO) {
            C143956rO r103 = (C143956rO) r10;
            r10 = new C143956rO(r103.A00, r103.A01, r103.A02, r103.A03, arrayList3, size);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("CallsHistoryFragmentV2ViewModel/getUpdatedCallItem callItem is of unknown type: ");
            sb.append(r10.BD8());
            C18740tg.A0D(false, sb.toString());
        }
        arrayList6.add(r10);
        ArrayList arrayList7 = r3.A03;
        if (arrayList7.isEmpty() || ((C107265Nh) arrayList7.get(0)).A0D == null) {
            Jid A06 = A022.A06(UserJid.class);
            if (A06 == null) {
                Log.w("CallsHistoryViewModel/performFiltering contact user jid is null");
            } else {
                hashSet.add(A06);
            }
        }
    }

    private void A01(ArrayList arrayList, int i) {
        arrayList.add(this.A02.A0l.get(Integer.valueOf(i)));
        this.A00++;
    }

    /* JADX INFO: finally extract failed */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        CharSequence charSequence2 = charSequence;
        this.A01 = charSequence2;
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = this.A02;
        C34691hU r4 = callsHistoryFragmentV2ViewModel.A0U;
        int length = charSequence2.length();
        if (r4.A00 != null && r4.A01 && length >= 1) {
            AnonymousClass2RE A002 = C34691hU.A00(r4);
            A002.A01 = 0;
            A002.A03 = 1;
            r4.A02.Bly(A002);
            r4.A01 = false;
        }
        if (TextUtils.isEmpty(charSequence2)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Filter.FilterResults filterResults = new Filter.FilterResults();
        ArrayList A03 = C202859mm.A03(callsHistoryFragmentV2ViewModel.A0a, charSequence2.toString());
        this.A00 = 0;
        if (C20800yB.A01(C21000yV.A01, callsHistoryFragmentV2ViewModel.A0f, 3637)) {
            A03(A03, arrayList2, hashSet);
            A01(arrayList2, 3);
            synchronized (this) {
                arrayList = callsHistoryFragmentV2ViewModel.A0D;
                if (arrayList == null) {
                    arrayList = callsHistoryFragmentV2ViewModel.A0X.A0I();
                    callsHistoryFragmentV2ViewModel.A0D = arrayList;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass141 r7 = (AnonymousClass141) it.next();
                GroupJid groupJid = (GroupJid) r7.A06(GroupJid.class);
                C220412q r6 = callsHistoryFragmentV2ViewModel.A0c;
                int A05 = r6.A05(groupJid);
                if (groupJid != null && callsHistoryFragmentV2ViewModel.A0Y.A0h(r7, A03, true)) {
                    if ((A05 == 0 || A05 == 2 || A05 == 6) && AnonymousClass3UL.A08(callsHistoryFragmentV2ViewModel.A0L, r6, callsHistoryFragmentV2ViewModel.A0d, r7, groupJid)) {
                        arrayList2.add(new C69703dx(groupJid, A03, arrayList2.size() - this.A00));
                    }
                }
            }
            A02(arrayList2, 3);
            A04(A03, arrayList2, hashSet);
        } else {
            A01(arrayList2, 0);
            Lock lock = callsHistoryFragmentV2ViewModel.A0n;
            lock.lock();
            try {
                Iterator it2 = callsHistoryFragmentV2ViewModel.A0k.iterator();
                while (it2.hasNext()) {
                    C143956rO r12 = (C143956rO) it2.next();
                    A00(r12.A00, r12, A03, arrayList2, hashSet);
                }
                lock.unlock();
                A02(arrayList2, 0);
                A04(A03, arrayList2, hashSet);
                A03(A03, arrayList2, hashSet);
            } catch (Throwable th) {
                lock.unlock();
                throw th;
            }
        }
        filterResults.values = new ArrayList(arrayList2);
        filterResults.count = arrayList2.size();
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Object obj;
        if (filterResults == null || (obj = filterResults.values) == null) {
            CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = this.A02;
            new AnonymousClass4WO(callsHistoryFragmentV2ViewModel, 4).A02.executeOnExecutor(callsHistoryFragmentV2ViewModel.A0B, new Void[0]);
            return;
        }
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel2 = this.A02;
        ArrayList arrayList = (ArrayList) obj;
        callsHistoryFragmentV2ViewModel2.A0C = arrayList;
        callsHistoryFragmentV2ViewModel2.A0i.A0D(arrayList);
        callsHistoryFragmentV2ViewModel2.A0W();
    }

    private void A02(ArrayList arrayList, int i) {
        int size = arrayList.size() - 1;
        if (C1901797e.A00(this.A02.A0l.get(Integer.valueOf(i)), arrayList.get(size))) {
            arrayList.remove(size);
            this.A00--;
        }
    }
}
