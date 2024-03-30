package X;

import java.util.List;

/* renamed from: X.56Q  reason: invalid class name */
public final class AnonymousClass56Q extends C110725b8 {
    public final String A00;
    public final List A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass56Q) {
                AnonymousClass56Q r5 = (AnonymousClass56Q) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A01, C36391kE.A0A(this.A02)) + C36341k9.A09(this.A00);
    }

    public AnonymousClass56Q(String str, List list, List list2) {
        C36321k7.A0x(list, list2);
        this.A02 = list;
        this.A01 = list2;
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StickerPacks(stickerPacks=");
        A0u.append(this.A02);
        A0u.append(", stickerGridItems=");
        A0u.append(this.A01);
        A0u.append(", moveToSelectedSectionId=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
