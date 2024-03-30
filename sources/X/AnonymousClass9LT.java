package X;

import android.os.SystemClock;
import java.util.TimeZone;

/* renamed from: X.9LT  reason: invalid class name */
public class AnonymousClass9LT {
    public AnonymousClass90D A00;
    public boolean A01 = false;
    public final AnonymousClass8DQ A02;
    public final /* synthetic */ C130476Lf A03;

    public AnonymousClass9LT(C130476Lf r6, byte[] bArr) {
        this.A03 = r6;
        this.A00 = r6.A00;
        AnonymousClass8DQ r4 = new AnonymousClass8DQ();
        this.A02 = r4;
        r4.A06 = C201869ka.A00(r6.A02);
        long currentTimeMillis = System.currentTimeMillis();
        r4.A01 = currentTimeMillis;
        r4.A02 = SystemClock.elapsedRealtime();
        r4.A03 = (long) (TimeZone.getDefault().getOffset(currentTimeMillis) / 1000);
        r4.A08 = bArr;
    }
}
