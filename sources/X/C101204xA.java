package X;

import java.util.List;

/* renamed from: X.4xA  reason: invalid class name and case insensitive filesystem */
public final class C101204xA extends AnonymousClass5UQ {
    public final List errors;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C101204xA) && AnonymousClass00C.A0J(this.errors, ((C101204xA) obj).errors));
    }

    public int hashCode() {
        return this.errors.hashCode();
    }

    public C101204xA(List list) {
        this.errors = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MultipleErrors(errors=");
        return AnonymousClass000.A0m(this.errors, A0u);
    }
}
