package X;

import java.util.Collection;

/* renamed from: X.2EN  reason: invalid class name */
public final class AnonymousClass2EN extends C53502rQ {
    public final Collection A00;

    public AnonymousClass2EN(Collection collection) {
        AnonymousClass00C.A0D(collection, 1);
        this.A00 = collection;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2EN) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2EN) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LockMultipleChats(chatJids=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
