package X;

import android.os.Handler;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Kv  reason: invalid class name and case insensitive filesystem */
public class C130376Kv {
    public final AnonymousClass60H A00;
    public final List A01 = Collections.synchronizedList(C90524aI.A0l());
    public final int A02;
    public final Handler A03;
    public final Runnable A04 = new C1497572q(this, 15);

    public static void A00(C130376Kv r5) {
        r5.A03.postDelayed(r5.A04, TimeUnit.SECONDS.toMillis((long) r5.A02));
    }

    public C130376Kv(Handler handler, AnonymousClass60H r4, int i) {
        this.A00 = r4;
        this.A03 = handler;
        this.A02 = i;
        A00(this);
    }
}
