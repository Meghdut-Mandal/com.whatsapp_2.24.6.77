package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9Rt  reason: invalid class name and case insensitive filesystem */
public class C194919Rt {
    public final B1I A00;
    public final AtomicBoolean A01 = C36431kI.A1H();
    public final AtomicInteger A02 = new AtomicInteger(2);
    public final String[] A03 = new String[2];

    public C194919Rt(B1I b1i) {
        this.A00 = b1i;
    }

    public void A00(int i, String str) {
        String[] strArr = this.A03;
        strArr[i] = str;
        if (this.A02.decrementAndGet() == 0 && C90504aG.A1Z(this.A01)) {
            this.A00.BiL(strArr);
        }
    }
}
