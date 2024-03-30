package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4hP  reason: invalid class name and case insensitive filesystem */
public final class C93954hP<K, V> extends C1506976g<K, V, V> {
    public boolean containsAll(Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            for (Object containsValue : collection) {
                if (!this.A00.containsValue(containsValue)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.7oG, java.util.Map] */
    public /* bridge */ /* synthetic */ Iterator iterator() {
        C1506676d r2 = this.A00;
        return new C93984hS(r2, AnonymousClass000.A0y(r2.A00().A01));
    }

    public boolean remove(Object obj) {
        Object obj2;
        C1506676d r3 = this.A00;
        Iterator it = r3.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (AnonymousClass00C.A0J(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry == null) {
            return false;
        }
        r3.remove(entry.getKey());
        return true;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C129546Hk.A00();
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        throw C129546Hk.A00();
    }

    public boolean removeAll(Collection collection) {
        C162237oG r9;
        int i;
        boolean z;
        Snapshot A00;
        Set A0f = C007103b.A0f(collection);
        C1506676d r5 = this.A00;
        boolean z2 = false;
        do {
            Object obj = C129546Hk.A00;
            synchronized (obj) {
                C94064ha A0H = C90494aF.A0H(r5.A00);
                r9 = A0H.A01;
                i = A0H.A00;
            }
            AnonymousClass00C.A0B(r9);
            C162247oH B26 = r9.B26();
            Iterator it = r5.entrySet().iterator();
            z = true;
            while (it.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(it);
                if (A0f.contains(A11.getValue())) {
                    B26.remove(A11.getKey());
                    z2 = true;
                }
            }
            C162237oG B1z = B26.B1z();
            if (AnonymousClass00C.A0J(B1z, r9)) {
                break;
            }
            AnonymousClass666 r0 = r5.A00;
            AnonymousClass00C.A0E(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AnonymousClass6YQ.A07) {
                A00 = AnonymousClass6YQ.A00();
                C94064ha r1 = (C94064ha) AnonymousClass6YQ.A02(A00, r5, r0);
                synchronized (obj) {
                    int i2 = r1.A00;
                    if (i2 == i) {
                        r1.A01 = B1z;
                        r1.A00 = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            AnonymousClass6YQ.A0F(A00, r5);
        } while (!z);
        return z2;
    }

    public boolean retainAll(Collection collection) {
        C162237oG r9;
        int i;
        boolean z;
        Snapshot A00;
        Set A0f = C007103b.A0f(collection);
        C1506676d r5 = this.A00;
        boolean z2 = false;
        do {
            Object obj = C129546Hk.A00;
            synchronized (obj) {
                C94064ha A0H = C90494aF.A0H(r5.A00);
                r9 = A0H.A01;
                i = A0H.A00;
            }
            AnonymousClass00C.A0B(r9);
            C162247oH B26 = r9.B26();
            Iterator it = r5.entrySet().iterator();
            z = true;
            while (it.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(it);
                if (!A0f.contains(A11.getValue())) {
                    B26.remove(A11.getKey());
                    z2 = true;
                }
            }
            C162237oG B1z = B26.B1z();
            if (AnonymousClass00C.A0J(B1z, r9)) {
                break;
            }
            AnonymousClass666 r0 = r5.A00;
            AnonymousClass00C.A0E(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AnonymousClass6YQ.A07) {
                A00 = AnonymousClass6YQ.A00();
                C94064ha r1 = (C94064ha) AnonymousClass6YQ.A02(A00, r5, r0);
                synchronized (obj) {
                    int i2 = r1.A00;
                    if (i2 == i) {
                        r1.A01 = B1z;
                        r1.A00 = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            AnonymousClass6YQ.A0F(A00, r5);
        } while (!z);
        return z2;
    }

    public C93954hP(C1506676d r1) {
        super(r1);
    }
}
