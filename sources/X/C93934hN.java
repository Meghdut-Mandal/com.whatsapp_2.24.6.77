package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4hN  reason: invalid class name and case insensitive filesystem */
public final class C93934hN<K, V> extends C1506976g<K, V, Map.Entry<K, V>> {
    public boolean containsAll(Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        if ((obj instanceof AnonymousClass00W) && !(obj instanceof C17920sI)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AnonymousClass00C.A0J(this.A00.get(entry.getKey()), entry.getValue());
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.7oG, java.util.Map] */
    public Iterator iterator() {
        C1506676d r2 = this.A00;
        return new C93964hQ(r2, AnonymousClass000.A0y(r2.A00().A01));
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry) || (((obj instanceof AnonymousClass00W) && !(obj instanceof C17920sI)) || this.A00.remove(((Map.Entry) obj).getKey()) == null)) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C129546Hk.A00();
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        throw C129546Hk.A00();
    }

    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (this.A00.remove(AnonymousClass000.A11(it).getKey()) != null || z) {
                    z = true;
                }
            }
        }
    }

    public boolean retainAll(Collection collection) {
        C162237oG r8;
        int i;
        boolean z;
        Snapshot A00;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C36331k8.A01(collection));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C36411kG.A1T(linkedHashMap, AnonymousClass000.A11(it));
        }
        C1506676d r5 = this.A00;
        boolean z2 = false;
        do {
            Object obj = C129546Hk.A00;
            synchronized (obj) {
                C94064ha A0H = C90494aF.A0H(r5.A00);
                r8 = A0H.A01;
                i = A0H.A00;
            }
            AnonymousClass00C.A0B(r8);
            C162247oH B26 = r8.B26();
            Iterator it2 = r5.entrySet().iterator();
            z = true;
            while (it2.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(it2);
                if (!linkedHashMap.containsKey(A11.getKey()) || !AnonymousClass00C.A0J(linkedHashMap.get(A11.getKey()), A11.getValue())) {
                    B26.remove(A11.getKey());
                    z2 = true;
                }
            }
            C162237oG B1z = B26.B1z();
            if (AnonymousClass00C.A0J(B1z, r8)) {
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

    public C93934hN(C1506676d r1) {
        super(r1);
    }
}
