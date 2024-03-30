package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class AYG<T> implements C159857k2, List<T>, RandomAccess, C004902e {
    public AnonymousClass666 A00 = new C166677wd(C166547wQ.A01);

    public Object[] toArray() {
        return C07390Xl.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        return C07390Xl.A01(this, objArr);
    }

    public static void A00(B6U b6u, C166677wd r1, int i) {
        r1.A02 = b6u;
        r1.A01++;
        r1.A00 = i + 1;
    }

    private final boolean A01(C006302t r10) {
        int i;
        B6U b6u;
        Object invoke;
        Snapshot A002;
        boolean z;
        do {
            Object obj = C196369Zj.A00;
            synchronized (obj) {
                C166677wd A0L = C165577te.A0L(this.A00);
                i = A0L.A00;
                b6u = A0L.A02;
            }
            AnonymousClass00C.A0B(b6u);
            C21921Acr B27 = b6u.B27();
            invoke = r10.invoke(B27);
            B6U A0N = B27.A0N();
            if (AnonymousClass00C.A0J(A0N, b6u)) {
                break;
            }
            AnonymousClass666 r0 = this.A00;
            AnonymousClass00C.A0E(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AnonymousClass6YQ.A07) {
                A002 = AnonymousClass6YQ.A00();
                C166677wd r2 = (C166677wd) AnonymousClass6YQ.A02(A002, this, r0);
                synchronized (obj) {
                    int i2 = r2.A00;
                    z = true;
                    if (i2 == i) {
                        r2.A02 = A0N;
                        r2.A00 = i2 + 1;
                        r2.A01++;
                    } else {
                        z = false;
                    }
                }
            }
            AnonymousClass6YQ.A0F(A002, this);
        } while (!z);
        return AnonymousClass000.A1X(invoke);
    }

    public final int A02() {
        AnonymousClass666 r1 = this.A00;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((C166677wd) AnonymousClass6YQ.A07(r1)).A01;
    }

    public final C166677wd A03() {
        AnonymousClass666 r1 = this.A00;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (C166677wd) AnonymousClass6YQ.A06(this, r1);
    }

    public void BmD(AnonymousClass666 r2) {
        r2.A01 = this.A00;
        this.A00 = r2;
    }

    public void add(int i, Object obj) {
        int i2;
        B6U b6u;
        Snapshot A002;
        boolean z;
        do {
            Object obj2 = C196369Zj.A00;
            synchronized (obj2) {
                C166677wd A0L = C165577te.A0L(this.A00);
                i2 = A0L.A00;
                b6u = A0L.A02;
            }
            AnonymousClass00C.A0B(b6u);
            B6U B0E = b6u.B0E(obj, i);
            if (!AnonymousClass00C.A0J(B0E, b6u)) {
                AnonymousClass666 r0 = this.A00;
                AnonymousClass00C.A0E(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (AnonymousClass6YQ.A07) {
                    A002 = AnonymousClass6YQ.A00();
                    C166677wd r2 = (C166677wd) AnonymousClass6YQ.A02(A002, this, r0);
                    synchronized (obj2) {
                        int i3 = r2.A00;
                        z = true;
                        if (i3 == i2) {
                            A00(B0E, r2, i3);
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

    public boolean addAll(int i, Collection collection) {
        return A01(new C22455Amu(collection, i));
    }

    public void clear() {
        Snapshot A002;
        AnonymousClass666 r1 = this.A00;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (AnonymousClass6YQ.A07) {
            A002 = AnonymousClass6YQ.A00();
            C166677wd r2 = (C166677wd) AnonymousClass6YQ.A02(A002, this, r1);
            synchronized (C196369Zj.A00) {
                r2.A02 = C166547wQ.A01;
                r2.A00++;
                r2.A01++;
            }
        }
        AnonymousClass6YQ.A0F(A002, this);
    }

    public ListIterator listIterator(int i) {
        return new AYO(this, i);
    }

    public boolean remove(Object obj) {
        int i;
        B6U b6u;
        boolean z;
        Snapshot A002;
        do {
            Object obj2 = C196369Zj.A00;
            synchronized (obj2) {
                C166677wd A0L = C165577te.A0L(this.A00);
                i = A0L.A00;
                b6u = A0L.A02;
            }
            AnonymousClass00C.A0B(b6u);
            C21920Acq acq = (C21920Acq) b6u;
            int indexOf = acq.indexOf(obj);
            B6U b6u2 = acq;
            if (indexOf != -1) {
                b6u2 = acq.Bni(indexOf);
            }
            z = false;
            if (AnonymousClass00C.A0J(b6u2, b6u)) {
                return false;
            }
            AnonymousClass666 r0 = this.A00;
            AnonymousClass00C.A0E(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AnonymousClass6YQ.A07) {
                A002 = AnonymousClass6YQ.A00();
                C166677wd r1 = (C166677wd) AnonymousClass6YQ.A02(A002, this, r0);
                synchronized (obj2) {
                    int i2 = r1.A00;
                    if (i2 == i) {
                        A00(b6u2, r1, i2);
                        z = true;
                    }
                }
            }
            AnonymousClass6YQ.A0F(A002, this);
        } while (!z);
        return true;
    }

    public boolean removeAll(Collection collection) {
        int i;
        B6U b6u;
        boolean z;
        Snapshot A002;
        do {
            Object obj = C196369Zj.A00;
            synchronized (obj) {
                C166677wd A0L = C165577te.A0L(this.A00);
                i = A0L.A00;
                b6u = A0L.A02;
            }
            AnonymousClass00C.A0B(b6u);
            B6U Bnf = b6u.Bnf(new C22297AkL(collection));
            z = false;
            if (AnonymousClass00C.A0J(Bnf, b6u)) {
                return false;
            }
            AnonymousClass666 r0 = this.A00;
            AnonymousClass00C.A0E(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AnonymousClass6YQ.A07) {
                A002 = AnonymousClass6YQ.A00();
                C166677wd r1 = (C166677wd) AnonymousClass6YQ.A02(A002, this, r0);
                synchronized (obj) {
                    int i2 = r1.A00;
                    if (i2 == i) {
                        A00(Bnf, r1, i2);
                        z = true;
                    }
                }
            }
            AnonymousClass6YQ.A0F(A002, this);
        } while (!z);
        return true;
    }

    public boolean retainAll(Collection collection) {
        return A01(new C22299AkN(collection));
    }

    public List subList(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= size()) {
            return new AYH(this, i, i2);
        }
        throw AnonymousClass001.A08("fromIndex or toIndex are out of bounds");
    }

    public AnonymousClass666 BBv() {
        return this.A00;
    }

    public boolean contains(Object obj) {
        return A03().A02.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return A03().A02.containsAll(collection);
    }

    public Object get(int i) {
        return A03().A02.get(i);
    }

    public int indexOf(Object obj) {
        return A03().A02.indexOf(obj);
    }

    public boolean isEmpty() {
        return A03().A02.isEmpty();
    }

    public Iterator iterator() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        return A03().A02.lastIndexOf(obj);
    }

    public Object set(int i, Object obj) {
        int i2;
        B6U b6u;
        Snapshot A002;
        boolean z;
        Object obj2 = get(i);
        do {
            Object obj3 = C196369Zj.A00;
            synchronized (obj3) {
                C166677wd A0L = C165577te.A0L(this.A00);
                i2 = A0L.A00;
                b6u = A0L.A02;
            }
            AnonymousClass00C.A0B(b6u);
            B6U Bq2 = b6u.Bq2(obj, i);
            if (AnonymousClass00C.A0J(Bq2, b6u)) {
                return obj2;
            }
            AnonymousClass666 r0 = this.A00;
            AnonymousClass00C.A0E(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AnonymousClass6YQ.A07) {
                A002 = AnonymousClass6YQ.A00();
                C166677wd r2 = (C166677wd) AnonymousClass6YQ.A02(A002, this, r0);
                synchronized (obj3) {
                    int i3 = r2.A00;
                    z = true;
                    if (i3 == i2) {
                        r2.A02 = Bq2;
                        r2.A00 = i3 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            AnonymousClass6YQ.A0F(A002, this);
        } while (!z);
        return obj2;
    }

    public final /* bridge */ int size() {
        return A03().A02.size();
    }

    public /* synthetic */ AnonymousClass666 BPp(AnonymousClass666 r2, AnonymousClass666 r3, AnonymousClass666 r4) {
        return null;
    }

    public boolean add(Object obj) {
        int i;
        B6U b6u;
        boolean z;
        Snapshot A002;
        do {
            Object obj2 = C196369Zj.A00;
            synchronized (obj2) {
                C166677wd A0L = C165577te.A0L(this.A00);
                i = A0L.A00;
                b6u = A0L.A02;
            }
            AnonymousClass00C.A0B(b6u);
            B6U B0B = b6u.B0B(obj);
            z = false;
            if (AnonymousClass00C.A0J(B0B, b6u)) {
                return false;
            }
            AnonymousClass666 r0 = this.A00;
            AnonymousClass00C.A0E(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AnonymousClass6YQ.A07) {
                A002 = AnonymousClass6YQ.A00();
                C166677wd r1 = (C166677wd) AnonymousClass6YQ.A02(A002, this, r0);
                synchronized (obj2) {
                    int i2 = r1.A00;
                    if (i2 == i) {
                        A00(B0B, r1, i2);
                        z = true;
                    }
                }
            }
            AnonymousClass6YQ.A0F(A002, this);
        } while (!z);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0095 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean addAll(java.util.Collection r11) {
        /*
            r10 = this;
        L_0x0000:
            java.lang.Object r9 = X.C196369Zj.A00
            monitor-enter(r9)
            X.666 r0 = r10.A00     // Catch:{ all -> 0x0096 }
            java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            X.7wd r0 = X.C165577te.A0L(r0)     // Catch:{ all -> 0x0096 }
            int r6 = r0.A00     // Catch:{ all -> 0x0096 }
            X.B6U r8 = r0.A02     // Catch:{ all -> 0x0096 }
            monitor-exit(r9)
            X.AnonymousClass00C.A0B(r8)
            boolean r0 = r8 instanceof X.C166547wQ
            if (r0 == 0) goto L_0x004e
            r3 = r8
            X.7wQ r3 = (X.C166547wQ) r3
            int r1 = r3.size()
            int r0 = r11.size()
            int r1 = r1 + r0
            r0 = 32
            if (r1 > r0) goto L_0x0053
            java.lang.Object[] r2 = r3.A00
            int r1 = r3.size()
            int r0 = r11.size()
            int r1 = r1 + r0
            java.lang.Object[] r4 = X.AnonymousClass00C.A0K(r2, r1)
            int r3 = r3.size()
            java.util.Iterator r2 = r11.iterator()
        L_0x003e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005f
            java.lang.Object r1 = r2.next()
            int r0 = r3 + 1
            r4[r3] = r1
            r3 = r0
            goto L_0x003e
        L_0x004e:
            X.Acr r0 = r8.B27()
            goto L_0x0057
        L_0x0053:
            X.Acr r0 = r3.B27()
        L_0x0057:
            r0.addAll(r11)
            X.B6U r5 = r0.A0N()
            goto L_0x0064
        L_0x005f:
            X.7wQ r5 = new X.7wQ
            r5.<init>(r4)
        L_0x0064:
            boolean r0 = X.AnonymousClass00C.A0J(r5, r8)
            r4 = 0
            if (r0 != 0) goto L_0x0095
            X.666 r0 = r10.A00
            X.AnonymousClass00C.A0E(r0, r7)
            java.lang.Object r3 = X.AnonymousClass6YQ.A07
            monitor-enter(r3)
            androidx.compose.runtime.snapshots.Snapshot r2 = X.AnonymousClass6YQ.A00()     // Catch:{ all -> 0x0092 }
            X.666 r1 = X.AnonymousClass6YQ.A02(r2, r10, r0)     // Catch:{ all -> 0x0092 }
            X.7wd r1 = (X.C166677wd) r1     // Catch:{ all -> 0x0092 }
            monitor-enter(r9)     // Catch:{ all -> 0x0092 }
            int r0 = r1.A00     // Catch:{ all -> 0x008f }
            if (r0 != r6) goto L_0x0086
            A00(r5, r1, r0)     // Catch:{ all -> 0x008f }
            r4 = 1
        L_0x0086:
            monitor-exit(r9)     // Catch:{ all -> 0x0092 }
            monitor-exit(r3)
            X.AnonymousClass6YQ.A0F(r2, r10)
            if (r4 == 0) goto L_0x0000
            r4 = 1
            return r4
        L_0x008f:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0092 }
            throw r0     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0095:
            return r4
        L_0x0096:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AYG.addAll(java.util.Collection):boolean");
    }

    public ListIterator listIterator() {
        return new AYO(this, 0);
    }

    public final /* bridge */ Object remove(int i) {
        int i2;
        B6U b6u;
        Snapshot A002;
        boolean z;
        Object obj = get(i);
        do {
            Object obj2 = C196369Zj.A00;
            synchronized (obj2) {
                C166677wd A0L = C165577te.A0L(this.A00);
                i2 = A0L.A00;
                b6u = A0L.A02;
            }
            AnonymousClass00C.A0B(b6u);
            B6U Bni = b6u.Bni(i);
            if (AnonymousClass00C.A0J(Bni, b6u)) {
                return obj;
            }
            AnonymousClass666 r0 = this.A00;
            AnonymousClass00C.A0E(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AnonymousClass6YQ.A07) {
                A002 = AnonymousClass6YQ.A00();
                C166677wd r2 = (C166677wd) AnonymousClass6YQ.A02(A002, this, r0);
                synchronized (obj2) {
                    int i3 = r2.A00;
                    z = true;
                    if (i3 == i2) {
                        A00(Bni, r2, i3);
                    } else {
                        z = false;
                    }
                }
            }
            AnonymousClass6YQ.A0F(A002, this);
        } while (!z);
        return obj;
    }
}
