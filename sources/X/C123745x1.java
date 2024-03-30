package X;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5x1  reason: invalid class name and case insensitive filesystem */
public abstract class C123745x1 {
    public int A00;
    public long A01;
    public long A02;
    public AnonymousClass5SB A03;
    public Collection A04;
    public List A05;

    public /* synthetic */ C123745x1(AnonymousClass5SB r4, List list, int i, long j, long j2) {
        C108295Sy[] r2 = new C108295Sy[2];
        r2[0] = C108295Sy.LGC_MEMBERS;
        List A0m = C36341k9.A0m(C108295Sy.GROUP_CHAT_MEMBERS, r2, 1);
        this.A03 = r4;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
        this.A05 = list;
        this.A04 = A0m;
    }

    public static long A00() {
        return System.currentTimeMillis() - TimeUnit.DAYS.toMillis(60);
    }
}
