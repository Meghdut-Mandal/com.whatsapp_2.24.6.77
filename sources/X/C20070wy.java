package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;

/* renamed from: X.0wy  reason: invalid class name and case insensitive filesystem */
public abstract class C20070wy<K, V> implements Map<K, V>, Serializable {
    public static final Map.Entry[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];
    public transient C20760y7 entrySet;
    public transient C20760y7 keySet;
    public transient C20750y6 values;

    public abstract C20760y7 createEntrySet();

    public abstract C20760y7 createKeySet();

    public abstract C20750y6 createValues();

    public abstract Object get(Object obj);

    public static C20090x0 builder() {
        return new C20090x0();
    }

    public static C20090x0 builderWithExpectedSize(int i) {
        C20080wz.checkNonnegative(i, "expectedSize");
        return new C20090x0(i);
    }

    public static C20070wy copyOf(Iterable iterable) {
        int i = 4;
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        C20090x0 r0 = new C20090x0(i);
        r0.putAll(iterable);
        return r0.build();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public C20760y7 entrySet() {
        C20760y7 r0 = this.entrySet;
        if (r0 != null) {
            return r0;
        }
        C20760y7 createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    public C20760y7 keySet() {
        C20760y7 r0 = this.keySet;
        if (r0 != null) {
            return r0;
        }
        C20760y7 createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C20750y6 values() {
        C20750y6 r0 = this.values;
        if (r0 != null) {
            return r0;
        }
        C20750y6 createValues = createValues();
        this.values = createValues;
        return createValues;
    }

    public Object writeReplace() {
        return new AUL(this);
    }

    public static C20070wy of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        C20080wz.checkEntryNotNull(obj, obj2);
        C20080wz.checkEntryNotNull(obj3, obj4);
        C20080wz.checkEntryNotNull(obj5, obj6);
        C20080wz.checkEntryNotNull(obj7, obj8);
        C20080wz.checkEntryNotNull(obj9, obj10);
        return C20730y4.create(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public boolean equals(Object obj) {
        return C131746Qj.equalsImpl(this, obj);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    public int hashCode() {
        return AnonymousClass6X9.hashCodeImpl(entrySet());
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return C131746Qj.toStringImpl(this);
    }

    public static C20070wy copyOf(Map map) {
        if (!(map instanceof C20070wy) || (map instanceof SortedMap)) {
            return copyOf((Iterable) map.entrySet());
        }
        return (C20070wy) map;
    }

    public static C20070wy of(Object obj, Object obj2) {
        C20080wz.checkEntryNotNull(obj, obj2);
        return C20730y4.create(1, new Object[]{obj, obj2});
    }

    public static C20070wy of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        C20080wz.checkEntryNotNull(obj, "9314a74762f36e6f5bf6cdef5054f1630cafbe42269c2ef6e987de45b836e3a9");
        C20080wz.checkEntryNotNull(obj3, "418ba26569faa19bb4349abe25cfcc95ff4c9d2381d7ee5d1316123d69197581");
        C20080wz.checkEntryNotNull(obj5, "6dacaf20921b2ce236ea3dc5605a044d391d85d43ea9ded96c750283e0f3a5d8");
        C20080wz.checkEntryNotNull(obj7, "5e393972fefea10ed23589622eecf0bc53b6e83d4376009791003b42978a246d");
        return C20730y4.create(4, new Object[]{obj, "9314a74762f36e6f5bf6cdef5054f1630cafbe42269c2ef6e987de45b836e3a9", obj3, "418ba26569faa19bb4349abe25cfcc95ff4c9d2381d7ee5d1316123d69197581", obj5, "6dacaf20921b2ce236ea3dc5605a044d391d85d43ea9ded96c750283e0f3a5d8", obj7, "5e393972fefea10ed23589622eecf0bc53b6e83d4376009791003b42978a246d"});
    }

    public static C20070wy of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        C20080wz.checkEntryNotNull(obj, obj2);
        C20080wz.checkEntryNotNull(obj3, obj4);
        C20080wz.checkEntryNotNull(obj5, obj6);
        return C20730y4.create(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6});
    }

    public static C20070wy of(Object obj, Object obj2, Object obj3, Object obj4) {
        C20080wz.checkEntryNotNull(obj, obj2);
        C20080wz.checkEntryNotNull(obj3, obj4);
        return C20730y4.create(2, new Object[]{obj, obj2, obj3, obj4});
    }

    public static C20070wy of() {
        return C20730y4.EMPTY;
    }
}
