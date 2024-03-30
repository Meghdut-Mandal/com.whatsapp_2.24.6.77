package X;

import java.util.List;

/* renamed from: X.2Ye  reason: invalid class name and case insensitive filesystem */
public final class C46522Ye extends C54872th {
    public final List A00;

    public C46522Ye(List list) {
        AnonymousClass00C.A0D(list, 1);
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C46522Ye) && AnonymousClass00C.A0J(this.A00, ((C46522Ye) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RecommendedNewsletterListDataItem(recommendedNewsletters=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
