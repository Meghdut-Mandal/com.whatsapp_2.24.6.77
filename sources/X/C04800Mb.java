package X;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: X.0Mb  reason: invalid class name and case insensitive filesystem */
public final class C04800Mb extends C12450i4 implements NavigableMap {
    public static final Comparator A03;
    public static final C04800Mb A04;
    public final transient AnonymousClass0MZ A00;
    public final transient C04810Mc A01;
    public final transient C04800Mb A02;

    public C04800Mb() {
    }

    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    public final Comparator comparator() {
        return this.A01.A02;
    }

    public final Map.Entry floorEntry(Object obj) {
        C04810Mc r0 = this.A01;
        Objects.requireNonNull(obj);
        return A00(0, r0.A0D(obj, true)).lastEntry();
    }

    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    public final /* synthetic */ Set keySet() {
        return this.A01;
    }

    public final Map.Entry lowerEntry(Object obj) {
        C04810Mc r0 = this.A01;
        Objects.requireNonNull(obj);
        return A00(0, r0.A0D(obj, false)).lastEntry();
    }

    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.A01;
    }

    public final /* synthetic */ Collection values() {
        return this.A00;
    }

    static {
        C04890Mk r0 = C04890Mk.A00;
        A03 = r0;
        C04810Mc A002 = C04810Mc.A00(r0);
        C04930Mo r02 = AnonymousClass0MZ.A00;
        A04 = new C04800Mb(AnonymousClass0MY.A02, (C04800Mb) null, A002);
    }

    private final C04800Mb A00(int i, int i2) {
        if (i == 0) {
            if (i2 == this.A00.size()) {
                return this;
            }
            i = 0;
        }
        C04810Mc r0 = this.A01;
        if (i == i2) {
            return A01(r0.A02);
        }
        return new C04800Mb(this.A00.subList(i, i2), (C04800Mb) null, r0.A0F(i, i2));
    }

    public static C04800Mb A01(Comparator comparator) {
        if (C04890Mk.A00.equals(comparator)) {
            return A04;
        }
        C04810Mc A002 = C04810Mc.A00(comparator);
        C04930Mo r0 = AnonymousClass0MZ.A00;
        return new C04800Mb(AnonymousClass0MY.A02, (C04800Mb) null, A002);
    }

    /* renamed from: A04 */
    public final C04800Mb tailMap(Object obj, boolean z) {
        C04810Mc r0 = this.A01;
        Objects.requireNonNull(obj);
        return A00(r0.A0C(obj, z), this.A00.size());
    }

    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.A01.descendingSet();
    }

    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        C12160hb r1;
        C04800Mb r2 = this.A02;
        if (r2 != null) {
            return r2;
        }
        boolean isEmpty = isEmpty();
        C04810Mc r0 = this.A01;
        if (isEmpty) {
            Comparator comparator = r0.A02;
            if (comparator instanceof C12160hb) {
                r1 = (C12160hb) comparator;
            } else {
                r1 = new C04870Mi(comparator);
            }
            return A01(r1.A00());
        }
        return new C04800Mb(this.A00.A09(), this, r0.descendingSet());
    }

    public final Object firstKey() {
        return this.A01.first();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r1 < 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            X.0Mc r0 = r3.A01
            r2 = -1
            if (r4 == 0) goto L_0x000f
            X.0MZ r1 = r0.A01     // Catch:{ ClassCastException -> 0x000f }
            java.util.Comparator r0 = r0.A02     // Catch:{ ClassCastException -> 0x000f }
            int r1 = java.util.Collections.binarySearch(r1, r4, r0)     // Catch:{ ClassCastException -> 0x000f }
            if (r1 >= 0) goto L_0x0010
        L_0x000f:
            r1 = -1
        L_0x0010:
            if (r1 != r2) goto L_0x0014
            r0 = 0
            return r0
        L_0x0014:
            X.0MZ r0 = r3.A00
            java.lang.Object r0 = r0.get(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04800Mb.get(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ NavigableMap headMap(Object obj, boolean z) {
        C04810Mc r0 = this.A01;
        Objects.requireNonNull(obj);
        return A00(0, r0.A0D(obj, z));
    }

    public final Object lastKey() {
        return this.A01.last();
    }

    public final int size() {
        return this.A00.size();
    }

    public C04800Mb(AnonymousClass0MZ r1, C04800Mb r2, C04810Mc r3) {
        this.A01 = r3;
        this.A00 = r1;
        this.A02 = r2;
    }

    /* renamed from: A03 */
    public final C04800Mb subMap(Object obj, Object obj2, boolean z, boolean z2) {
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj2);
        C04810Mc r2 = this.A01;
        if (r2.A02.compare(obj, obj2) <= 0) {
            Objects.requireNonNull(obj2);
            return A00(0, r2.A0D(obj2, z2)).tailMap(obj, z);
        }
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = obj;
        A0M[1] = obj2;
        throw AnonymousClass001.A08(AnonymousClass0QX.A00("expected fromKey <= toKey but %s > %s", A0M));
    }

    public final Object ceilingKey(Object obj) {
        Map.Entry ceilingEntry = ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return ceilingEntry.getKey();
    }

    public final /* bridge */ /* synthetic */ Set entrySet() {
        return A02();
    }

    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) A02().A0A().get(0);
    }

    public final Object floorKey(Object obj) {
        Map.Entry floorEntry = floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getKey();
    }

    public final Object higherKey(Object obj) {
        Map.Entry higherEntry = higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return higherEntry.getKey();
    }

    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) A02().A0A().get(this.A00.size() - 1);
    }

    public final Object lowerKey(Object obj) {
        Map.Entry lowerEntry = lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return lowerEntry.getKey();
    }

    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw AnonymousClass001.A0D();
    }

    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw AnonymousClass001.A0D();
    }

    public final /* synthetic */ SortedMap headMap(Object obj) {
        C04810Mc r0 = this.A01;
        Objects.requireNonNull(obj);
        return A00(0, r0.A0D(obj, false));
    }

    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, obj2, true, false);
    }

    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
