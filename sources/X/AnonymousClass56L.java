package X;

import java.util.List;

/* renamed from: X.56L  reason: invalid class name */
public final class AnonymousClass56L extends C110695b5 {
    public final C110765bC A00;
    public final C110775bD A01;
    public final List A02;
    public final List A03;
    public final List A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass56L) {
                AnonymousClass56L r5 = (AnonymousClass56L) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A00, C36351kA.A05(this.A04, ((AnonymousClass000.A0H(this.A02) * 31) + C36411kG.A09(this.A03)) * 31)));
    }

    public AnonymousClass56L(C110765bC r1, C110775bD r2, List list, List list2, List list3) {
        C36331k8.A1H(r1, r2);
        this.A02 = list;
        this.A03 = list2;
        this.A04 = list3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Data(recentStickers=");
        A0u.append(this.A02);
        A0u.append(", starredStickers=");
        A0u.append(this.A03);
        A0u.append(", stickerPacks=");
        A0u.append(this.A04);
        A0u.append(", contentStickers=");
        A0u.append(this.A00);
        A0u.append(", shapeStickers=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
