package X;

/* renamed from: X.56T  reason: invalid class name */
public final class AnonymousClass56T extends C110725b8 {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass56T) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass56T) obj).A00));
    }

    public int hashCode() {
        return C36341k9.A09(this.A00);
    }

    public AnonymousClass56T(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Loading(moveToSelectedSectionId=");
        return C36321k7.A0E(this.A00, A0u);
    }

    public AnonymousClass56T() {
        this((String) null);
    }
}
