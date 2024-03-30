package X;

/* renamed from: X.6Ok  reason: invalid class name and case insensitive filesystem */
public final class C131276Ok {
    public final int A00;

    public static String A00(int i) {
        if (i == 1) {
            return "Ltr";
        }
        if (i == 2) {
            return "Rtl";
        }
        if (i == 3) {
            return "Content";
        }
        if (i == 4) {
            return "ContentOrLtr";
        }
        if (i == 5) {
            return "ContentOrRtl";
        }
        if (i == Integer.MIN_VALUE) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public int hashCode() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C131276Ok) || i != ((C131276Ok) obj).A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        return A00(this.A00);
    }

    public /* synthetic */ C131276Ok(int i) {
        this.A00 = i;
    }
}
