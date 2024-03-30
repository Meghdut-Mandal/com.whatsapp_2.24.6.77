package X;

import java.util.List;

/* renamed from: X.68o  reason: invalid class name and case insensitive filesystem */
public final class C1275068o {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1275068o) && AnonymousClass00C.A0J(this.A00, ((C1275068o) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C1275068o(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PersonalizedAvatarGetMetadataEntity(effectCategories=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
