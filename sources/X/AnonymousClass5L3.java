package X;

import java.util.List;

/* renamed from: X.5L3  reason: invalid class name */
public final class AnonymousClass5L3 extends C111655cd {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5L3) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5L3) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass5L3(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StarredStickerAdded(newStarredStickers=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
