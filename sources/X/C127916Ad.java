package X;

/* renamed from: X.6Ad  reason: invalid class name and case insensitive filesystem */
public final class C127916Ad {
    public final C127906Ac A00;
    public final AnonymousClass6CW A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C127916Ad) {
                C127916Ad r5 = (C127916Ad) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    public C127916Ad(C127906Ac r1, AnonymousClass6CW r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GetStickerPackPreviewResult(stickerPreviewState=");
        A0u.append(this.A00);
        A0u.append(", simpleThumbLoader=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
