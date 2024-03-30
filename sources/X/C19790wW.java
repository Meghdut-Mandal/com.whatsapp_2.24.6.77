package X;

import java.util.concurrent.LinkedTransferQueue;

/* renamed from: X.0wW  reason: invalid class name and case insensitive filesystem */
public class C19790wW extends LinkedTransferQueue<Runnable> {
    public /* bridge */ /* synthetic */ boolean offer(Object obj) {
        return tryTransfer(obj);
    }
}
