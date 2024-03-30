package X;

import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3A7  reason: invalid class name */
public final class AnonymousClass3A7 {
    public long A00;
    public AnonymousClass00S A01 = AnonymousClass4IK.A00;
    public final long A02;
    public final Handler A03;
    public final Runnable A04;
    public final C19970wo A05;

    public AnonymousClass3A7(C19970wo r4, TimeUnit timeUnit) {
        AnonymousClass00C.A0D(r4, 1);
        this.A05 = r4;
        this.A02 = timeUnit.toMillis(500);
        this.A03 = C36341k9.A0H();
        this.A04 = C81183wb.A00(this, 47);
    }
}
