package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.76d  reason: invalid class name and case insensitive filesystem */
public final class C1506676d<K, V> implements C159857k2, Map<K, V>, C17930sJ {
    public AnonymousClass666 A00;
    public final Collection A01 = new C93954hP(this);
    public final Set A02 = new C93934hN(this);
    public final Set A03 = new C93944hO(this);

    public final C94064ha A00() {
        AnonymousClass666 r1 = this.A00;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (C94064ha) AnonymousClass6YQ.A06(this, r1);
    }

    public void BmD(AnonymousClass666 r2) {
        AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.A00 = r2;
    }

    public void clear() {
        Snapshot A002;
        AnonymousClass666 r0 = this.A00;
        AnonymousClass00C.A0E(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        C1513279c r5 = C1513279c.A02;
        AnonymousClass00C.A0E(r5, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        if (r5 != ((C94064ha) AnonymousClass6YQ.A07(r0)).A01) {
            AnonymousClass666 r02 = this.A00;
            AnonymousClass00C.A0E(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AnonymousClass6YQ.A07) {
                A002 = AnonymousClass6YQ.A00();
                C94064ha r2 = (C94064ha) AnonymousClass6YQ.A02(A002, this, r02);
                synchronized (C129546Hk.A00) {
                    r2.A01 = r5;
                    r2.A00++;
                }
            }
            AnonymousClass6YQ.A0F(A002, this);
        }
    }

    public Object put(Object obj, Object obj2) {
        C162237oG r1;
        int i;
        Object put;
        Snapshot A002;
        boolean z;
        do {
            Object obj3 = C129546Hk.A00;
            synchronized (obj3) {
                C94064ha A0H = C90494aF.A0H(this.A00);
                r1 = A0H.A01;
                i = A0H.A00;
            }
            AnonymousClass00C.A0B(r1);
            C162247oH B26 = r1.B26();
            put = B26.put(obj, obj2);
            C162237oG B1z = B26.B1z();
            if (AnonymousClass00C.A0J(B1z, r1)) {
                break;
            }
            AnonymousClass666 r0 = this.A00;
            AnonymousClass00C.A0E(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AnonymousClass6YQ.A07) {
                A002 = AnonymousClass6YQ.A00();
                C94064ha r2 = (C94064ha) AnonymousClass6YQ.A02(A002, this, r0);
                synchronized (obj3) {
                    int i2 = r2.A00;
                    z = true;
                    if (i2 == i) {
                        r2.A01 = B1z;
                        r2.A00 = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            AnonymousClass6YQ.A0F(A002, this);
        } while (!z);
        return put;
    }

    public void putAll(Map map) {
        C162237oG r1;
        int i;
        Snapshot A002;
        boolean z;
        do {
            Object obj = C129546Hk.A00;
            synchronized (obj) {
                C94064ha A0H = C90494aF.A0H(this.A00);
                r1 = A0H.A01;
                i = A0H.A00;
            }
            AnonymousClass00C.A0B(r1);
            C162247oH B26 = r1.B26();
            B26.putAll(map);
            C162237oG B1z = B26.B1z();
            if (!AnonymousClass00C.A0J(B1z, r1)) {
                AnonymousClass666 r0 = this.A00;
                AnonymousClass00C.A0E(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (AnonymousClass6YQ.A07) {
                    A002 = AnonymousClass6YQ.A00();
                    C94064ha r2 = (C94064ha) AnonymousClass6YQ.A02(A002, this, r0);
                    synchronized (obj) {
                        int i2 = r2.A00;
                        z = true;
                        if (i2 == i) {
                            r2.A01 = B1z;
                            r2.A00 = i2 + 1;
                        } else {
                            z = false;
                        }
                    }
                }
                AnonymousClass6YQ.A0F(A002, this);
            } else {
                return;
            }
        } while (!z);
    }

    public Object remove(Object obj) {
        C162237oG r1;
        int i;
        Object remove;
        Snapshot A002;
        boolean z;
        do {
            Object obj2 = C129546Hk.A00;
            synchronized (obj2) {
                C94064ha A0H = C90494aF.A0H(this.A00);
                r1 = A0H.A01;
                i = A0H.A00;
            }
            AnonymousClass00C.A0B(r1);
            C162247oH B26 = r1.B26();
            remove = B26.remove(obj);
            C162237oG B1z = B26.B1z();
            if (AnonymousClass00C.A0J(B1z, r1)) {
                break;
            }
            AnonymousClass666 r0 = this.A00;
            AnonymousClass00C.A0E(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AnonymousClass6YQ.A07) {
                A002 = AnonymousClass6YQ.A00();
                C94064ha r2 = (C94064ha) AnonymousClass6YQ.A02(A002, this, r0);
                synchronized (obj2) {
                    int i2 = r2.A00;
                    z = true;
                    if (i2 == i) {
                        r2.A01 = B1z;
                        r2.A00 = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            AnonymousClass6YQ.A0F(A002, this);
        } while (!z);
        return remove;
    }

    public C1506676d() {
        C1513279c r1 = C1513279c.A02;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        this.A00 = new C94064ha(r1);
    }

    public AnonymousClass666 BBv() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.7oG, java.util.Map] */
    public boolean containsKey(Object obj) {
        return A00().A01.containsKey(obj);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.7oG, java.util.Map] */
    public boolean containsValue(Object obj) {
        return A00().A01.containsValue(obj);
    }

    public final /* bridge */ Set entrySet() {
        return this.A02;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.7oG, java.util.Map] */
    public Object get(Object obj) {
        return A00().A01.get(obj);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.7oG, java.util.Map] */
    public boolean isEmpty() {
        return A00().A01.isEmpty();
    }

    public final /* bridge */ Set keySet() {
        return this.A03;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.7oG, java.util.Map] */
    public final /* bridge */ int size() {
        return A00().A01.size();
    }

    public final /* bridge */ Collection values() {
        return this.A01;
    }

    public /* synthetic */ AnonymousClass666 BPp(AnonymousClass666 r2, AnonymousClass666 r3, AnonymousClass666 r4) {
        return null;
    }
}
