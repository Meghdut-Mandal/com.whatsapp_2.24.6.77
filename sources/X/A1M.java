package X;

import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

public final class A1M implements C159027if {
    public final /* synthetic */ A1K A00;
    public final /* synthetic */ C192209Gc A01;
    public final /* synthetic */ AnonymousClass00S A02;

    public A1M(A1K a1k, C192209Gc r2, AnonymousClass00S r3) {
        this.A00 = a1k;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void BXF() {
        A1K a1k = this.A00;
        a1k.A06.clear();
        a1k.A09.set(false);
    }

    public void BiH(Map map) {
        A1K a1k = this.A00;
        if (!a1k.A06.BR8(map)) {
            a1k.A00 = SystemClock.uptimeMillis() + ((long) 500);
        }
        ThreadPoolExecutor threadPoolExecutor = C113695fx.A00;
        C113695fx.A00.execute(A1K.A00(a1k, this.A01, this.A02));
    }
}
