package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0ZZ  reason: invalid class name */
public final class AnonymousClass0ZZ implements Handler.Callback {
    public boolean A00 = false;
    public final Handler A01;
    public final C16870qE A02;
    public final Object A03 = new Object();
    public final ArrayList A04 = AnonymousClass001.A0I();
    public final ArrayList A05 = AnonymousClass001.A0I();
    public final ArrayList A06 = AnonymousClass001.A0I();
    public final AtomicInteger A07 = new AtomicInteger(0);
    public volatile boolean A08 = false;

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C17080qg r2 = (C17080qg) message.obj;
            synchronized (this.A03) {
                if (this.A08 && this.A02.isConnected() && this.A05.contains(r2)) {
                    r2.onConnected((Bundle) null);
                }
            }
            return true;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Don't know how to handle message: ");
        A0u.append(i);
        Log.wtf("GmsClientEvents", A0u.toString(), new Exception());
        return false;
    }

    public AnonymousClass0ZZ(Looper looper, C16870qE r4) {
        this.A02 = r4;
        this.A01 = new AnonymousClass0E7(looper, this);
    }
}
