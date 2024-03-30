package X;

/* renamed from: X.6Or  reason: invalid class name and case insensitive filesystem */
public final class C131346Or {
    public static final C131346Or A01 = new C131346Or(new C12710iX(0.0f, 0.0f));
    public final C17940sK A00;

    public C131346Or(C17940sK r2) {
        this.A00 = r2;
        if (!(!Float.isNaN(0.0f))) {
            throw AnonymousClass001.A08("current must not be NaN");
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C131346Or) && AnonymousClass00C.A0J(this.A00, ((C131346Or) obj).A00));
    }

    public int hashCode() {
        return C36351kA.A05(this.A00, C90514aH.A05(0.0f));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C90464aC.A1Q(A0u, "ProgressBarRangeInfo(current=");
        A0u.append(", range=");
        A0u.append(this.A00);
        A0u.append(", steps=");
        return C36321k7.A0G(A0u, 0);
    }
}
