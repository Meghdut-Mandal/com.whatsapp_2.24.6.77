package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.6ZH  reason: invalid class name */
public final class AnonymousClass6ZH implements ServiceConnection {
    public int A00 = 0;
    public C118765oh A01;
    public final Messenger A02 = new Messenger(new C19330ul(Looper.getMainLooper(), new C133766Zx(this)));
    public final Queue A03 = new ArrayDeque();
    public final SparseArray A04 = new SparseArray();
    public final /* synthetic */ AnonymousClass6SA A05;

    public final synchronized void A00() {
        if (this.A00 == 2 && this.A03.isEmpty() && this.A04.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.A00 = 3;
            C07510Ya.A00().A02(this.A05.A02, this);
        }
    }

    public final synchronized void A01(int i, String str) {
        SparseArray sparseArray;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", C90464aC.A0c("Disconnected: ", str));
        }
        int i2 = this.A00;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.A00 = 4;
            C07510Ya.A00().A02(this.A05.A02, this);
            C108735Ur r3 = new C108735Ur(i, str);
            Queue<AnonymousClass6F5> queue = this.A03;
            for (AnonymousClass6F5 A012 : queue) {
                A012.A01(r3);
            }
            queue.clear();
            int i3 = 0;
            while (true) {
                sparseArray = this.A04;
                if (i3 >= sparseArray.size()) {
                    break;
                }
                ((AnonymousClass6F5) sparseArray.valueAt(i3)).A01(r3);
                i3++;
            }
            sparseArray.clear();
        } else if (i2 == 3) {
            this.A00 = 4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A03(X.AnonymousClass6F5 r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.A00     // Catch:{ all -> 0x0075 }
            r2 = 2
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 == r5) goto L_0x0020
            if (r0 == r2) goto L_0x000e
            monitor-exit(r6)
            return r4
        L_0x000e:
            java.util.Queue r0 = r6.A03     // Catch:{ all -> 0x0075 }
            r0.add(r7)     // Catch:{ all -> 0x0075 }
            X.6SA r0 = r6.A05     // Catch:{ all -> 0x0075 }
            java.util.concurrent.ScheduledExecutorService r1 = r0.A03     // Catch:{ all -> 0x0075 }
            X.72h r0 = new X.72h     // Catch:{ all -> 0x0075 }
            r0.<init>(r6)     // Catch:{ all -> 0x0075 }
            r1.execute(r0)     // Catch:{ all -> 0x0075 }
            goto L_0x006d
        L_0x0020:
            java.util.Queue r0 = r6.A03     // Catch:{ all -> 0x0075 }
            r0.add(r7)     // Catch:{ all -> 0x0075 }
            goto L_0x006d
        L_0x0026:
            java.util.Queue r0 = r6.A03     // Catch:{ all -> 0x0075 }
            r0.add(r7)     // Catch:{ all -> 0x0075 }
            int r0 = r6.A00     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x006f
            java.lang.String r1 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = "Starting bind to GmsCore"
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x0075 }
        L_0x003c:
            r6.A00 = r5     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            android.content.Intent r3 = X.C36441kJ.A0I(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "com.google.android.gms"
            r3.setPackage(r0)     // Catch:{ all -> 0x0075 }
            X.0Ya r2 = X.C07510Ya.A00()     // Catch:{ all -> 0x0075 }
            X.6SA r1 = r6.A05     // Catch:{ all -> 0x0075 }
            android.content.Context r0 = r1.A02     // Catch:{ all -> 0x0075 }
            boolean r0 = r2.A03(r0, r3, r6, r5)     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = "Unable to bind to service"
            r6.A01(r4, r0)     // Catch:{ all -> 0x0075 }
            goto L_0x006d
        L_0x005d:
            java.util.concurrent.ScheduledExecutorService r4 = r1.A03     // Catch:{ all -> 0x0075 }
            r0 = 38
            X.72q r3 = new X.72q     // Catch:{ all -> 0x0075 }
            r3.<init>(r6, r0)     // Catch:{ all -> 0x0075 }
            r1 = 30
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0075 }
            r4.schedule(r3, r1, r0)     // Catch:{ all -> 0x0075 }
        L_0x006d:
            monitor-exit(r6)
            return r5
        L_0x006f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0075 }
            r0.<init>()     // Catch:{ all -> 0x0075 }
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6ZH.A03(X.6F5):boolean");
    }

    public AnonymousClass6ZH(AnonymousClass6SA r4) {
        this.A05 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        r2 = r7.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (r2.getBoolean("unsupported", false) == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        r4.A01(new X.C108735Ur(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        r4.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(android.os.Message r7) {
        /*
            r6 = this;
            int r5 = r7.arg1
            java.lang.String r2 = "MessengerIpcClient"
            boolean r0 = X.C90494aF.A1a(r2)
            if (r0 == 0) goto L_0x0019
            r0 = 41
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r0)
            java.lang.String r0 = "Received response to request: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r5)
            android.util.Log.d(r2, r0)
        L_0x0019:
            monitor-enter(r6)
            android.util.SparseArray r0 = r6.A04     // Catch:{ all -> 0x005a }
            java.lang.Object r4 = r0.get(r5)     // Catch:{ all -> 0x005a }
            X.6F5 r4 = (X.AnonymousClass6F5) r4     // Catch:{ all -> 0x005a }
            r3 = 1
            if (r4 != 0) goto L_0x0036
            r0 = 50
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r0)     // Catch:{ all -> 0x005a }
            java.lang.String r0 = "Received response for unknown request: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r5)     // Catch:{ all -> 0x005a }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x005a }
            monitor-exit(r6)     // Catch:{ all -> 0x005a }
            return r3
        L_0x0036:
            r0.remove(r5)     // Catch:{ all -> 0x005a }
            r6.A00()     // Catch:{ all -> 0x005a }
            monitor-exit(r6)     // Catch:{ all -> 0x005a }
            android.os.Bundle r2 = r7.getData()
            java.lang.String r1 = "unsupported"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x0056
            r2 = 4
            java.lang.String r1 = "Not supported by GmsCore"
            X.5Ur r0 = new X.5Ur
            r0.<init>(r2, r1)
            r4.A01(r0)
            return r3
        L_0x0056:
            r4.A00(r2)
            return r3
        L_0x005a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x005a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6ZH.A02(android.os.Message):boolean");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.A05.A03.execute(AnonymousClass74N.A00(this, iBinder, 26));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.A05.A03.execute(new C1497572q(this, 37));
    }
}
