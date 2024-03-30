package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0jk  reason: invalid class name and case insensitive filesystem */
public final class C13360jk extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ AnonymousClass008 A00;

    public C13360jk(AnonymousClass008 r1) {
        this.A00 = r1;
    }

    public Iterator iterator() {
        return new C12240hj(this.A00);
    }

    public int size() {
        return this.A00.size();
    }
}
