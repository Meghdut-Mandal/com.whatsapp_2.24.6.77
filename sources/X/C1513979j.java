package X;

import java.util.Iterator;

/* renamed from: X.79j  reason: invalid class name and case insensitive filesystem */
public final class C1513979j<E> extends C13450jt<E> implements C162207oD<E> {
    public static final C1513979j A03;
    public final C1513279c A00;
    public final Object A01;
    public final Object A02;

    static {
        C129536Hj r2 = C129536Hj.A00;
        C1513279c r1 = C1513279c.A02;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        A03 = new C1513979j(r1, r2, r2);
    }

    public int A08() {
        return this.A00.size();
    }

    public boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public Iterator iterator() {
        return new AnonymousClass76T(this.A01, this.A00);
    }

    public C1513979j(C1513279c r1, Object obj, Object obj2) {
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = r1;
    }
}
