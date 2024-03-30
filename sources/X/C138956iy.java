package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.6iy  reason: invalid class name and case insensitive filesystem */
public class C138956iy implements AnonymousClass7eB {
    public final Handler A00 = C36341k9.A0H();
    public final AnonymousClass772 A01;
    public final Executor A02 = new C164217rS(this, 1);

    public /* synthetic */ void B74(Runnable runnable) {
        this.A01.execute(runnable);
    }

    public C138956iy(Executor executor) {
        this.A01 = new AnonymousClass772(executor);
    }
}
