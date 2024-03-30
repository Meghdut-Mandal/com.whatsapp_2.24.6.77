package X;

import java.util.Comparator;
import java.util.Objects;

/* renamed from: X.8Hj  reason: invalid class name */
public final class AnonymousClass8Hj extends C227315o {
    public final Comparator comparator;

    public AnonymousClass8Hn build() {
        AnonymousClass8Hn construct = AnonymousClass8Hn.construct(this.comparator, this.size, this.contents);
        this.size = construct.size();
        this.forceCopy = true;
        return construct;
    }

    public AnonymousClass8Hj(Comparator comparator2) {
        Objects.requireNonNull(comparator2);
        this.comparator = comparator2;
    }

    public AnonymousClass8Hj add(Object obj) {
        super.add(obj);
        return this;
    }

    public AnonymousClass8Hj add(Object... objArr) {
        super.add(objArr);
        return this;
    }
}
