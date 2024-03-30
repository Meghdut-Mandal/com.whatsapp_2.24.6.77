package X;

import java.util.List;

/* renamed from: X.5Kw  reason: invalid class name */
public final class AnonymousClass5Kw extends C111635cb {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5Kw) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5Kw) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass5Kw(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StickerList(stickers=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
