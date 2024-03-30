package X;

/* renamed from: X.1ML  reason: invalid class name */
public final class AnonymousClass1ML {
    public int A00 = 3;

    public String toString() {
        int i = this.A00;
        if (i == 1) {
            return "available";
        }
        if (i != 3) {
            return "available-waiting-timeout";
        }
        return "un-available";
    }
}
