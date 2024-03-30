package X;

import java.util.List;

/* renamed from: X.5Kz  reason: invalid class name and case insensitive filesystem */
public final class C106715Kz extends C111645cc {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C106715Kz) && AnonymousClass00C.A0J(this.A00, ((C106715Kz) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C106715Kz(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StickerList(stickers=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
