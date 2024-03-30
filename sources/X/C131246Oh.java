package X;

/* renamed from: X.6Oh  reason: invalid class name and case insensitive filesystem */
public final class C131246Oh {
    public final int A00;

    public int hashCode() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C131246Oh) || i != ((C131246Oh) obj).A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        int i = this.A00;
        if (i == 1) {
            return "Hyphens.None";
        }
        if (i == 2) {
            return "Hyphens.Auto";
        }
        if (i == Integer.MIN_VALUE) {
            return "Hyphens.Unspecified";
        }
        return "Invalid";
    }

    public /* synthetic */ C131246Oh(int i) {
        this.A00 = i;
    }
}
