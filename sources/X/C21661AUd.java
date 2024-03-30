package X;

import java.lang.ref.WeakReference;

/* renamed from: X.AUd  reason: case insensitive filesystem */
public class C21661AUd implements Comparable {
    public final int A00;
    public final long A01;
    public final C199039eb A02;
    public final WeakReference A03;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C21661AUd aUd = (C21661AUd) obj;
        if (aUd == null) {
            return -1;
        }
        long j = this.A01;
        long j2 = aUd.A01;
        if (j >= j2) {
            return C90504aG.A1T((j > j2 ? 1 : (j == j2 ? 0 : -1))) ? 1 : 0;
        }
        return -1;
    }

    public C21661AUd(C199039eb r2, C195489Um r3, int i, long j) {
        this.A02 = r2;
        this.A01 = j;
        this.A00 = i;
        this.A03 = AnonymousClass001.A0F(r3);
    }
}
