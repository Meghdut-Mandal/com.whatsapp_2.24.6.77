package X;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import java.util.Iterator;

/* renamed from: X.79b  reason: invalid class name and case insensitive filesystem */
public final class C1513179b<K, V> extends C001000l<V> implements ImmutableCollection<V>, AnonymousClass00W {
    public final C1513279c A00;

    public int A08() {
        return this.A00.size();
    }

    public boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    public Iterator iterator() {
        return new C166597wV(this.A00.A00);
    }

    public C1513179b(C1513279c r1) {
        this.A00 = r1;
    }
}
