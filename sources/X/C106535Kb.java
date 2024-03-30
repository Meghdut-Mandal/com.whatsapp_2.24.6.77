package X;

import java.util.List;

/* renamed from: X.5Kb  reason: invalid class name and case insensitive filesystem */
public final class C106535Kb extends C111625ca {
    public final List A00;

    public C106535Kb(List list) {
        AnonymousClass00C.A0D(list, 1);
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C106535Kb) && AnonymousClass00C.A0J(this.A00, ((C106535Kb) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StickerPacks(packs=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
