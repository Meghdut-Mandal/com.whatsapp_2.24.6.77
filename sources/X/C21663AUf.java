package X;

/* renamed from: X.AUf  reason: case insensitive filesystem */
public class C21663AUf implements Comparable {
    public int A00;
    public long A01;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C21663AUf aUf = (C21663AUf) obj;
        if (aUf == this) {
            return 0;
        }
        long j = (long) (this.A00 - aUf.A00);
        if (j == 0) {
            j = this.A01 - aUf.A01;
        }
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    public C21663AUf(long j) {
        this.A01 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A00);
        C36421kH.A1N(A0u);
        return C36411kG.A11(A0u, this.A01);
    }
}
