package X;

/* renamed from: X.68S  reason: invalid class name */
public final class AnonymousClass68S {
    public final int A00;

    public int hashCode() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof AnonymousClass68S) || i != ((AnonymousClass68S) obj).A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        int i = this.A00;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "All";
        }
        if (i == 2) {
            return "Weight";
        }
        if (i == 3) {
            return "Style";
        }
        return "Invalid";
    }

    public /* synthetic */ AnonymousClass68S(int i) {
        this.A00 = i;
    }
}
