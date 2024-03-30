package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4bB  reason: invalid class name and case insensitive filesystem */
public class C90934bB extends BroadcastReceiver {
    public static AtomicReference A01 = new AtomicReference();
    public final Context A00;

    public static /* synthetic */ void A00(Context context) {
        AtomicReference atomicReference = A01;
        if (atomicReference.get() == null) {
            C90934bB r2 = new C90934bB(context);
            if (atomicReference.compareAndSet((Object) null, r2)) {
                context.registerReceiver(r2, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        synchronized (C18960u7.A09) {
            Iterator A0z = AnonymousClass000.A0z(C18960u7.A0A);
            while (A0z.hasNext()) {
                C18960u7.A03((C18960u7) A0z.next());
            }
        }
        this.A00.unregisterReceiver(this);
    }

    public C90934bB(Context context) {
        this.A00 = context;
    }
}
