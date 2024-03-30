package X;

/* renamed from: X.3I7  reason: invalid class name */
public final class AnonymousClass3I7 {
    public C87374On A00;
    public final C63363Jt A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3I7) {
                AnonymousClass3I7 r5 = (AnonymousClass3I7) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A0H(this.A00) * 31) + C36411kG.A09(this.A01);
    }

    public AnonymousClass3I7(C63363Jt r1, C87374On r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("QuickPromotionInfo(qp=");
        A0u.append(this.A00);
        A0u.append(", surveyInfo=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
