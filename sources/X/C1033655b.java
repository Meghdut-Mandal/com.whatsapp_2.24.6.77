package X;

import java.util.List;

/* renamed from: X.55b  reason: invalid class name and case insensitive filesystem */
public final class C1033655b extends C110675b3 {
    public final List A00;

    public C1033655b(List list) {
        AnonymousClass00C.A0D(list, 1);
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1033655b) && AnonymousClass00C.A0J(this.A00, ((C1033655b) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EmojiSearchData(items=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
