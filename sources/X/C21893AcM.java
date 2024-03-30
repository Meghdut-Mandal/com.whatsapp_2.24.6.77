package X;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.AcM  reason: case insensitive filesystem */
public abstract class C21893AcM<E> extends AbstractSet<E> {
    public boolean removeAll(Collection collection) {
        return AnonymousClass6X9.removeAllImpl((Set) this, collection);
    }

    public boolean retainAll(Collection collection) {
        Objects.requireNonNull(collection);
        return super.retainAll(collection);
    }
}
