package X;

/* renamed from: X.AUb  reason: case insensitive filesystem */
public class C21659AUb implements Comparable {
    public final long A00;
    public final AnonymousClass6TI A01;

    public int compareTo(Object obj) {
        C21659AUb aUb = (C21659AUb) obj;
        int i = ((this.A00 - aUb.A00) > 0 ? 1 : ((this.A00 - aUb.A00) == 0 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i <= 0) {
            if (this.A01 == null) {
                return -1;
            }
            if (aUb.A01 == null) {
                return 1;
            }
            return 0;
        }
        return 1;
    }

    public C21659AUb(AnonymousClass6TI r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }
}
