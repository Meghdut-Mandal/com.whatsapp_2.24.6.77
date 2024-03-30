package X;

import java.util.List;

/* renamed from: X.55m  reason: invalid class name and case insensitive filesystem */
public final class C1034555m extends C110685b4 {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1034555m) && AnonymousClass00C.A0J(this.A00, ((C1034555m) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C1034555m(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SocialStickers(stickers=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
