package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.79e  reason: invalid class name and case insensitive filesystem */
public class C1513479e<K, V> extends C13350jj<K, V> implements C162247oH<K, V> {
    public int A00;
    public AnonymousClass6YE A01;
    public AnonymousClass5WG A02 = new AnonymousClass5WG();
    public Object A03;
    public int A04;
    public C1513279c A05;

    public Object put(Object obj, Object obj2) {
        this.A03 = null;
        this.A01 = this.A01.A0J(this, obj, obj2, AnonymousClass000.A0J(obj), 0);
        return this.A03;
    }

    public Object remove(Object obj) {
        this.A03 = null;
        AnonymousClass6YE A0I = this.A01.A0I(this, obj, AnonymousClass000.A0J(obj), 0);
        if (A0I == null) {
            A0I = AnonymousClass6YE.A04;
            AnonymousClass00C.A0E(A0I, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.A01 = A0I;
        return this.A03;
    }

    public Collection A01() {
        return new C1513379d(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.79f, java.util.Set] */
    public Set A02() {
        return new C1513579f(this);
    }

    public Set A03() {
        return new C1513679g(this);
    }

    public C1513279c A04() {
        if (this instanceof C93834hD) {
            return ((C93834hD) this).A06();
        }
        AnonymousClass6YE r2 = this.A01;
        C1513279c r1 = this.A05;
        if (r2 != r1.A00) {
            this.A02 = new AnonymousClass5WG();
            r1 = new C1513279c(r2, size());
        }
        this.A05 = r1;
        return r1;
    }

    public void A05(int i) {
        this.A04 = i;
        this.A00++;
    }

    public /* bridge */ /* synthetic */ C162237oG B1z() {
        if (this instanceof C93834hD) {
            return ((C93834hD) this).A06();
        }
        return A04();
    }

    public void clear() {
        AnonymousClass6YE r1 = AnonymousClass6YE.A04;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.A01 = r1;
        A05(0);
    }

    public boolean containsKey(Object obj) {
        return this.A01.A0N(obj, AnonymousClass000.A0J(obj), 0);
    }

    public Object get(Object obj) {
        return this.A01.A0M(obj, AnonymousClass000.A0J(obj), 0);
    }

    public void putAll(Map map) {
        C1513279c r6;
        C1513479e r0;
        if (!(map instanceof C1513279c) || (r6 = (C1513279c) map) == null) {
            if (!(map instanceof C1513479e) || (r0 = (C1513479e) map) == null) {
                super.putAll(map);
                return;
            }
            r6 = r0.A04();
        }
        C131216Oe r4 = new C131216Oe(0);
        int size = size();
        AnonymousClass6YE r2 = this.A01;
        AnonymousClass6YE r1 = r6.A00;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.A01 = r2.A0H(this, r1, r4, 0);
        int size2 = (r6.size() + size) - r4.A00;
        if (size != size2) {
            A05(size2);
        }
    }

    public C1513479e(C1513279c r2) {
        this.A05 = r2;
        this.A01 = r2.A00;
        this.A04 = r2.size();
    }

    public int A00() {
        return this.A04;
    }

    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        AnonymousClass6YE A0K = this.A01.A0K(this, obj, obj2, AnonymousClass000.A0J(obj), 0);
        if (A0K == null) {
            A0K = AnonymousClass6YE.A04;
            AnonymousClass00C.A0E(A0K, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.A01 = A0K;
        if (size != size()) {
            return true;
        }
        return false;
    }
}
