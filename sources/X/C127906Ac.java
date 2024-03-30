package X;

import java.util.List;

/* renamed from: X.6Ac  reason: invalid class name and case insensitive filesystem */
public final class C127906Ac {
    public AnonymousClass68B A00;
    public List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C127906Ac) {
                C127906Ac r5 = (C127906Ac) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + AnonymousClass000.A0H(this.A01);
    }

    public C127906Ac(AnonymousClass68B r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StickerPreviewState(stickerPack=");
        A0u.append(this.A00);
        A0u.append(", stickerPreviewItems=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
