package X;

/* renamed from: X.0fQ  reason: invalid class name and case insensitive filesystem */
public final class C10910fQ implements Comparable {
    public final long A00;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = ((this.A00 ^ Long.MIN_VALUE) > (((C10910fQ) obj).A00 ^ Long.MIN_VALUE) ? 1 : ((this.A00 ^ Long.MIN_VALUE) == (((C10910fQ) obj).A00 ^ Long.MIN_VALUE) ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C10910fQ) || j != ((C10910fQ) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A00);
    }

    public String toString() {
        return AnonymousClass0VZ.A01(this.A00);
    }

    public /* synthetic */ C10910fQ(long j) {
        this.A00 = j;
    }
}
