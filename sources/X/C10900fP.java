package X;

/* renamed from: X.0fP  reason: invalid class name and case insensitive filesystem */
public final class C10900fP implements Comparable {
    public final int A00;

    public int hashCode() {
        return this.A00;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AnonymousClass00C.A00(this.A00 ^ Integer.MIN_VALUE, ((C10900fP) obj).A00 ^ Integer.MIN_VALUE);
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C10900fP) || i != ((C10900fP) obj).A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        return String.valueOf(((long) this.A00) & 4294967295L);
    }

    public /* synthetic */ C10900fP(int i) {
        this.A00 = i;
    }
}
