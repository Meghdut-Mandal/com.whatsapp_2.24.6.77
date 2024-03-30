package X;

import android.os.Handler;
import android.os.MessageQueue;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5yV  reason: invalid class name and case insensitive filesystem */
public class C124615yV {
    public MessageQueue.IdleHandler A00;
    public final Handler A01;
    public final Handler A02;
    public final AUR A03;
    public final Map A04 = Collections.synchronizedMap(AnonymousClass001.A0J());
    public final ConcurrentLinkedQueue A05 = new ConcurrentLinkedQueue();
    public final AtomicReference A06 = new AtomicReference();
    public final C198079cs A07;
    public volatile boolean A08 = false;
    public volatile boolean A09 = true;

    public C124615yV(Handler handler, Handler handler2, AUR aur, C198079cs r6) {
        this.A03 = aur;
        this.A07 = r6;
        this.A01 = handler;
        this.A02 = handler2;
        if (aur.enableStopWarmupSchedulerEmpty) {
            this.A00 = new C164657sA(this, 0);
        }
    }
}
