package X;

import android.content.Context;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.4qK  reason: invalid class name and case insensitive filesystem */
public abstract class C97824qK extends C139316ja {
    public static Thread A02;
    public static final BlockingQueue A03 = new ArrayBlockingQueue(10);
    public static final AtomicBoolean A04 = new AtomicBoolean();
    public static volatile C1495971y A05;
    public final AtomicLong A00 = new AtomicLong(0);
    public final AtomicLong A01 = new AtomicLong(0);

    public C97824qK(Context context, int i) {
        super(i);
        if (C90504aG.A1Z(A04)) {
            C97774qF r1 = new C97774qF(context, this);
            C133046Wl.A01(r1);
            C118505oA.A00(r1, (String) null);
        }
    }
}
