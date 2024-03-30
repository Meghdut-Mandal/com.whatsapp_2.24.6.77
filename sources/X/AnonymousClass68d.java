package X;

import java.util.List;

/* renamed from: X.68d  reason: invalid class name */
public final class AnonymousClass68d {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass68d) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass68d) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass68d(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GetPromotionsResult(promotions=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
