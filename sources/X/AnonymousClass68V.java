package X;

/* renamed from: X.68V  reason: invalid class name */
public final class AnonymousClass68V {
    public final long A00;

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass68V) || j != ((AnonymousClass68V) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A00);
    }

    public String toString() {
        long j = this.A00;
        if (j == 0) {
            return "Unspecified";
        }
        if (j == 4294967296L) {
            return "Sp";
        }
        if (j == 8589934592L) {
            return "Em";
        }
        return "Invalid";
    }

    public /* synthetic */ AnonymousClass68V(long j) {
        this.A00 = j;
    }
}
