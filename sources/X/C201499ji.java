package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9ji  reason: invalid class name and case insensitive filesystem */
public final class C201499ji {
    public static final Map A0E = AnonymousClass001.A0J();
    public ServiceConnection A00;
    public IInterface A01;
    public boolean A02;
    public final Context A03;
    public final Intent A04;
    public final IBinder.DeathRecipient A05 = new C204389pv(this);
    public final C199269f2 A06;
    public final C22896Ay0 A07;
    public final Object A08 = C36441kJ.A11();
    public final String A09;
    public final WeakReference A0A;
    public final List A0B = AnonymousClass001.A0I();
    public final Set A0C = C36441kJ.A16();
    public final AtomicInteger A0D = C90484aE.A0v();

    public static final void A00(C201499ji r5) {
        Set<TaskCompletionSource> set = r5.A0C;
        for (TaskCompletionSource trySetException : set) {
            trySetException.trySetException(new RemoteException(String.valueOf(r5.A09).concat(" : Binder has died.")));
        }
        set.clear();
    }

    public final Handler A01() {
        Handler handler;
        Map map = A0E;
        synchronized (map) {
            String str = this.A09;
            if (!map.containsKey(str)) {
                HandlerThread handlerThread = new HandlerThread(str, 10);
                handlerThread.start();
                map.put(str, C90514aH.A0M(handlerThread));
            }
            handler = (Handler) map.get(str);
        }
        return handler;
    }

    public final void A02(TaskCompletionSource taskCompletionSource) {
        synchronized (this.A08) {
            this.A0C.remove(taskCompletionSource);
        }
        A01().post(new AnonymousClass8FN(this, 1));
    }

    public final void A03(TaskCompletionSource taskCompletionSource, AX1 ax1) {
        A01().post(new AnonymousClass8FP(ax1.a, taskCompletionSource, this, ax1));
    }

    public C201499ji(Context context, Intent intent, C199269f2 r4, C22896Ay0 ay0, String str) {
        this.A03 = context;
        this.A06 = r4;
        this.A09 = str;
        this.A04 = intent;
        this.A07 = ay0;
        this.A0A = AnonymousClass001.A0F((Object) null);
    }
}
