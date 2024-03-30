package X;

import java.util.List;

/* renamed from: X.2mw  reason: invalid class name and case insensitive filesystem */
public final class C50972mw extends AnonymousClass2vZ {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C50972mw) && AnonymousClass00C.A0J(this.A00, ((C50972mw) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C50972mw(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Bullets(bulletItems=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
