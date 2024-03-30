package X;

/* renamed from: X.68R  reason: invalid class name */
public final class AnonymousClass68R {
    public final int A00;

    public int hashCode() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof AnonymousClass68R) || i != ((AnonymousClass68R) obj).A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        int i = this.A00;
        if (i == 0) {
            return "Normal";
        }
        if (i == 1) {
            return "Italic";
        }
        return "Invalid";
    }

    public /* synthetic */ AnonymousClass68R(int i) {
        this.A00 = i;
    }
}
