package X;

import java.util.Collection;

/* renamed from: X.2EL  reason: invalid class name */
public final class AnonymousClass2EL extends C53502rQ {
    public final Collection A00;

    public AnonymousClass2EL(Collection collection) {
        AnonymousClass00C.A0D(collection, 1);
        this.A00 = collection;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2EL) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2EL) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DisableMultipleChatLock(chatJids=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
