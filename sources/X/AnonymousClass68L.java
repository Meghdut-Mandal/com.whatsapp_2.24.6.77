package X;

/* renamed from: X.68L  reason: invalid class name */
public final class AnonymousClass68L {
    public final int A00;

    public int hashCode() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof AnonymousClass68L) || i != ((AnonymousClass68L) obj).A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        if (this.A00 == 1) {
            return "Touch";
        }
        return "Keyboard";
    }

    public /* synthetic */ AnonymousClass68L(int i) {
        this.A00 = i;
    }
}
