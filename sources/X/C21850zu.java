package X;

/* renamed from: X.0zu  reason: invalid class name and case insensitive filesystem */
public class C21850zu implements Comparable {
    public final long A00;
    public final String A01;
    public final String A02;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C21850zu r6 = (C21850zu) obj;
        long j = this.A00;
        long j2 = r6.A00;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        return this.A02.compareTo(r6.A02);
    }

    public C21850zu(long j, String str, String str2) {
        this.A00 = j;
        this.A02 = str;
        this.A01 = str2;
    }
}
