package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1VI  reason: invalid class name */
public abstract class AnonymousClass1VI {
    public final Set A00;
    public final Set A01;

    public AnonymousClass1VI(Set set, Set set2) {
        this.A00 = Collections.unmodifiableSet(new HashSet(set));
        this.A01 = Collections.unmodifiableSet(new HashSet(set2));
    }
}
