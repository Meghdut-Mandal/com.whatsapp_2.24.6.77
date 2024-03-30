package X;

import java.util.List;

/* renamed from: X.3Pm  reason: invalid class name and case insensitive filesystem */
public final class C64803Pm {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C64803Pm) && AnonymousClass00C.A0J(this.A00, ((C64803Pm) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A0H(this.A00);
    }

    public C64803Pm(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UiState(listItems=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }

    public C64803Pm() {
        this((List) null);
    }
}
