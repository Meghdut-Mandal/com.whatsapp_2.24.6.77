package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.6ZJ  reason: invalid class name */
public final class AnonymousClass6ZJ implements ServiceConnection {
    public boolean A00 = false;
    public C91504c7 A01;
    public final Context A02;
    public final Intent A03;
    public final Queue A04 = new ArrayDeque();
    public final ScheduledExecutorService A05;

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
        if (android.util.Log.isLoggable("FirebaseInstanceId", 3) == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        android.util.Log.d("FirebaseInstanceId", X.C36371kC.A0z("binder is dead. start connection? ", X.C90524aI.A0h(39), X.AnonymousClass000.A1Q(r8.A00 ? 1 : 0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a6, code lost:
        if (r8.A00 != false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
        r8.A00 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b8, code lost:
        if (X.C07510Ya.A00().A03(r8.A02, r8.A03, r8, 65) != false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ba, code lost:
        android.util.Log.e("FirebaseInstanceId", "binding to the service failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        android.util.Log.e("FirebaseInstanceId", "Exception while binding the service", r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void A00(X.AnonymousClass6ZJ r8) {
        /*
            monitor-enter(r8)
            java.lang.String r6 = "FirebaseInstanceId"
            r5 = 3
            boolean r0 = android.util.Log.isLoggable(r6, r5)     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = "flush queue called"
            android.util.Log.d(r6, r0)     // Catch:{ all -> 0x00da }
        L_0x000f:
            java.util.Queue r4 = r8.A04     // Catch:{ all -> 0x00da }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00d8
            boolean r0 = android.util.Log.isLoggable(r6, r5)     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = "found intent to be delivered"
            android.util.Log.d(r6, r0)     // Catch:{ all -> 0x00da }
        L_0x0022:
            X.4c7 r0 = r8.A01     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0087
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0087
            boolean r0 = android.util.Log.isLoggable(r6, r5)     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "binder is alive, sending the intent."
            android.util.Log.d(r6, r0)     // Catch:{ all -> 0x00da }
        L_0x0037:
            java.lang.Object r7 = r4.poll()     // Catch:{ all -> 0x00da }
            X.63K r7 = (X.AnonymousClass63K) r7     // Catch:{ all -> 0x00da }
            X.4c7 r2 = r8.A01     // Catch:{ all -> 0x00da }
            int r1 = android.os.Binder.getCallingUid()     // Catch:{ all -> 0x00da }
            int r0 = android.os.Process.myUid()     // Catch:{ all -> 0x00da }
            if (r1 != r0) goto L_0x007f
            boolean r0 = android.util.Log.isLoggable(r6, r5)     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = "service received new intent via bind strategy"
            android.util.Log.d(r6, r0)     // Catch:{ all -> 0x00da }
        L_0x0054:
            X.5iL r0 = r2.A00     // Catch:{ all -> 0x00da }
            android.content.Intent r4 = r7.A01     // Catch:{ all -> 0x00da }
            X.4ag r3 = r0.A00     // Catch:{ all -> 0x00da }
            boolean r0 = r3.A03(r4)     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0070
            r0 = 0
            com.google.android.gms.tasks.Task r2 = com.google.android.gms.tasks.Tasks.forResult(r0)     // Catch:{ all -> 0x00da }
        L_0x0065:
            java.util.concurrent.Executor r1 = X.C112985eo.A00     // Catch:{ all -> 0x00da }
            X.6nP r0 = new X.6nP     // Catch:{ all -> 0x00da }
            r0.<init>(r7)     // Catch:{ all -> 0x00da }
            r2.addOnCompleteListener((java.util.concurrent.Executor) r1, (com.google.android.gms.tasks.OnCompleteListener) r0)     // Catch:{ all -> 0x00da }
            goto L_0x000f
        L_0x0070:
            com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource     // Catch:{ all -> 0x00da }
            r2.<init>()     // Catch:{ all -> 0x00da }
            java.util.concurrent.ExecutorService r1 = r3.A03     // Catch:{ all -> 0x00da }
            r0 = 25
            X.C1503374w.A01(r3, r4, r2, r1, r0)     // Catch:{ all -> 0x00da }
            com.google.android.gms.tasks.zzw r2 = r2.zza     // Catch:{ all -> 0x00da }
            goto L_0x0065
        L_0x007f:
            java.lang.String r1 = "Binding only allowed within app"
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ all -> 0x00da }
            r0.<init>(r1)     // Catch:{ all -> 0x00da }
            throw r0     // Catch:{ all -> 0x00da }
        L_0x0087:
            boolean r0 = android.util.Log.isLoggable(r6, r5)     // Catch:{ all -> 0x00da }
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00a4
            boolean r0 = r8.A00     // Catch:{ all -> 0x00da }
            boolean r2 = X.AnonymousClass000.A1Q(r0)
            r0 = 39
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r0)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "binder is dead. start connection? "
            java.lang.String r0 = X.C36371kC.A0z(r0, r1, r2)     // Catch:{ all -> 0x00da }
            android.util.Log.d(r6, r0)     // Catch:{ all -> 0x00da }
        L_0x00a4:
            boolean r0 = r8.A00     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00d8
            r8.A00 = r3     // Catch:{ all -> 0x00da }
            X.0Ya r3 = X.C07510Ya.A00()     // Catch:{ SecurityException -> 0x00c0 }
            android.content.Context r2 = r8.A02     // Catch:{ SecurityException -> 0x00c0 }
            android.content.Intent r1 = r8.A03     // Catch:{ SecurityException -> 0x00c0 }
            r0 = 65
            boolean r0 = r3.A03(r2, r1, r8, r0)     // Catch:{ SecurityException -> 0x00c0 }
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = "binding to the service failed"
            android.util.Log.e(r6, r0)     // Catch:{ SecurityException -> 0x00c0 }
            goto L_0x00c6
        L_0x00c0:
            r1 = move-exception
            java.lang.String r0 = "Exception while binding the service"
            android.util.Log.e(r6, r0, r1)     // Catch:{ all -> 0x00da }
        L_0x00c6:
            r8.A00 = r5     // Catch:{ all -> 0x00da }
        L_0x00c8:
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00d8
            java.lang.Object r0 = r4.poll()     // Catch:{ all -> 0x00da }
            X.63K r0 = (X.AnonymousClass63K) r0     // Catch:{ all -> 0x00da }
            r0.A00()     // Catch:{ all -> 0x00da }
            goto L_0x00c8
        L_0x00d8:
            monitor-exit(r8)
            return
        L_0x00da:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6ZJ.A00(X.6ZJ):void");
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (C90494aF.A1a("FirebaseInstanceId")) {
            String valueOf = String.valueOf(componentName);
            C90464aC.A1G("onServiceConnected: ", valueOf, "FirebaseInstanceId", C90524aI.A0h(C90474aD.A05(valueOf) + 20));
        }
        this.A00 = false;
        if (!(iBinder instanceof C91504c7)) {
            String valueOf2 = String.valueOf(iBinder);
            Log.e("FirebaseInstanceId", AnonymousClass000.A0p("Invalid service connection: ", valueOf2, C90524aI.A0h(C90474aD.A05(valueOf2) + 28)));
            while (true) {
                Queue queue = this.A04;
                if (queue.isEmpty()) {
                    break;
                }
                ((AnonymousClass63K) queue.poll()).A00();
            }
        } else {
            this.A01 = (C91504c7) iBinder;
            A00(this);
        }
    }

    public AnonymousClass6ZJ(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new AnonymousClass00J("Firebase-FirebaseInstanceIdServiceConnection"));
        Context applicationContext = context.getApplicationContext();
        this.A02 = applicationContext;
        this.A03 = C36441kJ.A0I("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.A05 = scheduledThreadPoolExecutor;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (C90494aF.A1a("FirebaseInstanceId")) {
            String valueOf = String.valueOf(componentName);
            C90464aC.A1G("onServiceDisconnected: ", valueOf, "FirebaseInstanceId", C90524aI.A0h(C90474aD.A05(valueOf) + 23));
        }
        A00(this);
    }
}
