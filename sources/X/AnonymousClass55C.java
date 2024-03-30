package X;

/* renamed from: X.55C  reason: invalid class name */
public final class AnonymousClass55C extends C110605aw {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass55C) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass55C) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass55C(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("OpenAvatarEditor(origin=");
        return C36321k7.A0E(this.A00, A0u);
    }

    public AnonymousClass55C() {
        this("expressions_sheet");
    }
}
