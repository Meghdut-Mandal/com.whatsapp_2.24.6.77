package X;

import java.util.List;

/* renamed from: X.59G  reason: invalid class name */
public final class AnonymousClass59G extends C110895bP {
    public final List A00;

    public AnonymousClass59G(List list) {
        AnonymousClass00C.A0D(list, 1);
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass59G) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass59G) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PostBucketsResult(galleryFolders=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
