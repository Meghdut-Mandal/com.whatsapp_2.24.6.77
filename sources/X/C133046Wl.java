package X;

import android.os.Handler;
import java.util.concurrent.BlockingQueue;

/* renamed from: X.6Wl  reason: invalid class name and case insensitive filesystem */
public class C133046Wl {
    public static int A00 = Integer.MAX_VALUE;
    public static final Handler A01 = C36341k9.A0H();
    public static final int A02 = Math.max((int) (((float) Runtime.getRuntime().availableProcessors()) * 1.5f), 3);
    public static volatile C118505oA A03;

    public static C118505oA A00() {
        if (A03 == null) {
            synchronized (C133046Wl.class) {
                if (A03 == null) {
                    A03 = new C118505oA(A02);
                }
            }
        }
        return A03;
    }

    public static void A01(AnonymousClass75L r3) {
        int i = A00;
        A00 = i - 1;
        r3.A00 = ((long) i) << 32;
    }

    public static void A02(String str) {
        BlockingQueue<AnonymousClass75L> blockingQueue = A00().A00;
        for (AnonymousClass75L r1 : blockingQueue) {
            if (str.equals(r1.A02)) {
                blockingQueue.remove(r1);
                if (r1 instanceof C97804qI) {
                    AnonymousClass6UZ.A09.release();
                } else if (r1 instanceof C97794qH) {
                    ((C97794qH) r1).A05.A04();
                }
            }
        }
    }
}
