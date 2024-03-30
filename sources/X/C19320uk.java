package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.0uk  reason: invalid class name and case insensitive filesystem */
public final class C19320uk {
    public static int A06;
    public static PendingIntent A07;
    public Messenger A00;
    public C134506b9 A01;
    public Messenger A02;
    public final Context A03;
    public final AnonymousClass007 A04 = new AnonymousClass007(0);
    public final C19270uf A05;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static final android.os.Bundle A00(android.os.Bundle r11, X.C19320uk r12) {
        /*
            java.lang.Class<X.0uk> r6 = X.C19320uk.class
            monitor-enter(r6)
            int r1 = A06     // Catch:{ all -> 0x0129 }
            int r0 = r1 + 1
            A06 = r0     // Catch:{ all -> 0x0129 }
            java.lang.String r5 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0129 }
            monitor-exit(r6)
            com.google.android.gms.tasks.TaskCompletionSource r8 = new com.google.android.gms.tasks.TaskCompletionSource
            r8.<init>()
            X.007 r4 = r12.A04
            monitor-enter(r4)
            r4.put(r5, r8)     // Catch:{ all -> 0x0126 }
            monitor-exit(r4)     // Catch:{ all -> 0x0126 }
            X.0uf r9 = r12.A05
            int r0 = r9.A04()
            if (r0 == 0) goto L_0x011e
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r0 = "com.google.android.gms"
            r7.setPackage(r0)
            int r0 = r9.A04()
            r3 = 2
            if (r0 != r3) goto L_0x003f
            java.lang.String r0 = "com.google.iid.TOKEN_REQUEST"
        L_0x0035:
            r7.setAction(r0)
            r7.putExtras(r11)
            android.content.Context r2 = r12.A03
            monitor-enter(r6)
            goto L_0x0042
        L_0x003f:
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            goto L_0x0035
        L_0x0042:
            android.app.PendingIntent r1 = A07     // Catch:{ all -> 0x0129 }
            if (r1 != 0) goto L_0x0057
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0129 }
            r1.<init>()     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = "com.google.example.invalidpackage"
            r1.setPackage(r0)     // Catch:{ all -> 0x0129 }
            r0 = 0
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r2, r0, r1, r0)     // Catch:{ all -> 0x0129 }
            A07 = r1     // Catch:{ all -> 0x0129 }
        L_0x0057:
            java.lang.String r0 = "app"
            r7.putExtra(r0, r1)     // Catch:{ all -> 0x0129 }
            monitor-exit(r6)
            java.lang.String r6 = "kid"
            java.lang.String r0 = java.lang.String.valueOf(r5)
            int r0 = r0.length()
            int r0 = r0 + 5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "|ID|"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "|"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.putExtra(r6, r0)
            java.lang.String r6 = "FirebaseInstanceId"
            r10 = 3
            boolean r0 = android.util.Log.isLoggable(r6, r10)
            if (r0 == 0) goto L_0x00b1
            android.os.Bundle r0 = r7.getExtras()
            java.lang.String r11 = java.lang.String.valueOf(r0)
            java.lang.String r0 = java.lang.String.valueOf(r11)
            int r0 = r0.length()
            int r0 = r0 + 8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Sending "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r6, r0)
        L_0x00b1:
            java.lang.String r1 = "google.messenger"
            android.os.Messenger r0 = r12.A02
            r7.putExtra(r1, r0)
            android.os.Messenger r0 = r12.A00
            if (r0 != 0) goto L_0x00c0
            X.6b9 r0 = r12.A01
            if (r0 == 0) goto L_0x00dd
        L_0x00c0:
            android.os.Message r1 = android.os.Message.obtain()
            r1.obj = r7
            android.os.Messenger r0 = r12.A00     // Catch:{ RemoteException -> 0x00d2 }
            if (r0 != 0) goto L_0x00ce
            X.6b9 r0 = r12.A01     // Catch:{ RemoteException -> 0x00d2 }
            android.os.Messenger r0 = r0.A00     // Catch:{ RemoteException -> 0x00d2 }
        L_0x00ce:
            r0.send(r1)     // Catch:{ RemoteException -> 0x00d2 }
            goto L_0x00ea
        L_0x00d2:
            boolean r0 = android.util.Log.isLoggable(r6, r10)
            if (r0 == 0) goto L_0x00dd
            java.lang.String r0 = "Messenger failed, fallback to startService"
            android.util.Log.d(r6, r0)
        L_0x00dd:
            int r0 = r9.A04()
            if (r0 != r3) goto L_0x00e7
            r2.sendBroadcast(r7)
            goto L_0x00ea
        L_0x00e7:
            r2.startService(r7)
        L_0x00ea:
            com.google.android.gms.tasks.zzw r3 = r8.zza     // Catch:{ InterruptedException | TimeoutException -> 0x0101, ExecutionException -> 0x00ff }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x0101, ExecutionException -> 0x00ff }
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r3, r1, r0)     // Catch:{ InterruptedException | TimeoutException -> 0x0101, ExecutionException -> 0x00ff }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ InterruptedException | TimeoutException -> 0x0101, ExecutionException -> 0x00ff }
            monitor-enter(r4)
            r4.remove(r5)     // Catch:{ all -> 0x00fc }
            monitor-exit(r4)     // Catch:{ all -> 0x00fc }
            return r0
        L_0x00fc:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00fc }
            throw r1
        L_0x00ff:
            r1 = move-exception
            goto L_0x010e
        L_0x0101:
            java.lang.String r0 = "No response"
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x0114 }
            java.lang.String r1 = "TIMEOUT"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0114 }
            r0.<init>(r1)     // Catch:{ all -> 0x0114 }
            goto L_0x0113
        L_0x010e:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0114 }
            r0.<init>(r1)     // Catch:{ all -> 0x0114 }
        L_0x0113:
            throw r0     // Catch:{ all -> 0x0114 }
        L_0x0114:
            r1 = move-exception
            monitor-enter(r4)
            r4.remove(r5)     // Catch:{ all -> 0x011b }
        L_0x0119:
            monitor-exit(r4)     // Catch:{ all -> 0x011b }
            goto L_0x011d
        L_0x011b:
            r1 = move-exception
            goto L_0x0119
        L_0x011d:
            throw r1
        L_0x011e:
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L_0x0126:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0126 }
            throw r1
        L_0x0129:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19320uk.A00(android.os.Bundle, X.0uk):android.os.Bundle");
    }

    public static final void A01(Bundle bundle, C19320uk r4, String str) {
        String str2;
        AnonymousClass007 r42 = r4.A04;
        synchronized (r42) {
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) r42.remove(str);
            if (taskCompletionSource == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Missing callback for ".concat(valueOf);
                } else {
                    str2 = new String("Missing callback for ");
                }
                Log.w("FirebaseInstanceId", str2);
            } else {
                taskCompletionSource.setResult(bundle);
            }
        }
    }

    public C19320uk(Context context, C19270uf r4) {
        this.A03 = context;
        this.A05 = r4;
        this.A02 = new Messenger(new C19340um(Looper.getMainLooper(), this));
    }
}
