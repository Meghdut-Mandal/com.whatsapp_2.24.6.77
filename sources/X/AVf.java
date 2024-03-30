package X;

public class AVf implements Runnable {
    public long A00;
    public Object A01;
    public String A02;
    public final int A03;

    public AVf(Object obj, String str, int i, long j) {
        this.A03 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A00 = j;
    }

    public final void run() {
        String str;
        long j;
        C20992A2g a2g;
        boolean z;
        int i = this.A03;
        Object obj = this.A01;
        if (i != 0) {
            str = this.A02;
            j = this.A00;
            a2g = ((AnonymousClass5o9) obj).A01.A01.A0o;
            z = true;
        } else {
            str = this.A02;
            j = this.A00;
            a2g = ((AnonymousClass9QE) obj).A01.A01.A0o;
            z = false;
        }
        a2g.BVF(j, str, z);
    }
}
