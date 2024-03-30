package com.google.firebase.iid;

import X.AnonymousClass63K;
import X.AnonymousClass6ZJ;
import X.C03090Dd;
import X.C90494aF;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;

public final class FirebaseInstanceIdReceiver extends C03090Dd {
    public static AnonymousClass6ZJ A00;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00da, code lost:
        if (r11.getApplicationInfo().targetSdkVersion < 26) goto L_0x00dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(android.content.Context r21, android.content.Intent r22) {
        /*
            r20 = this;
            r0 = 0
            r10 = r22
            r10.setComponent(r0)
            r11 = r21
            java.lang.String r0 = r11.getPackageName()
            r10.setPackage(r0)
            java.lang.String r0 = "from"
            java.lang.String r1 = r10.getStringExtra(r0)
            java.lang.String r0 = "google.com/iid"
            boolean r0 = r0.equals(r1)
            r13 = r20
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = "CMD"
            java.lang.String r3 = r10.getStringExtra(r0)
            if (r3 == 0) goto L_0x02a4
            r0 = 3
            java.lang.String r4 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r4, r0)
            if (r0 == 0) goto L_0x004f
            android.os.Bundle r0 = r10.getExtras()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = X.C90474aD.A05(r3)
            int r0 = r0 + 21
            java.lang.StringBuilder r1 = X.C90464aC.A0i(r2, r0)
            java.lang.String r0 = "Received command: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " - "
            X.C90464aC.A1G(r0, r2, r4, r1)
        L_0x004f:
            java.lang.String r0 = "RST"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "RST_FULL"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "SYNC"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x02a4
            X.0u7 r0 = X.C18960u7.A00()
            com.google.firebase.iid.FirebaseInstanceId r6 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r0)
            X.0uh r5 = com.google.firebase.iid.FirebaseInstanceId.A08
            java.lang.String r0 = ""
            monitor-enter(r5)
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = "|T|"
            java.lang.String r4 = r1.concat(r0)     // Catch:{ all -> 0x00a5 }
            android.content.SharedPreferences r0 = r5.A01     // Catch:{ all -> 0x00a5 }
            android.content.SharedPreferences$Editor r3 = r0.edit()     // Catch:{ all -> 0x00a5 }
            java.util.Map r0 = r0.getAll()     // Catch:{ all -> 0x00a5 }
            java.util.Iterator r2 = X.AnonymousClass000.A10(r0)     // Catch:{ all -> 0x00a5 }
        L_0x008c:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x00a0
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)     // Catch:{ all -> 0x00a5 }
            boolean r0 = r1.startsWith(r4)     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x008c
            r3.remove(r1)     // Catch:{ all -> 0x00a5 }
            goto L_0x008c
        L_0x00a0:
            r3.commit()     // Catch:{ all -> 0x00a5 }
            goto L_0x02a0
        L_0x00a5:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x00a8:
            X.0u7 r0 = X.C18960u7.A00()
            com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r0)
            r0.A07()
            goto L_0x02a4
        L_0x00b5:
            java.lang.String r2 = "gcm.rawData64"
            java.lang.String r1 = r10.getStringExtra(r2)
            if (r1 == 0) goto L_0x00ca
            r0 = 0
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r0 = "rawData"
            r10.putExtra(r0, r1)
            r10.removeExtra(r2)
        L_0x00ca:
            boolean r0 = X.AnonymousClass0VW.A00()
            r3 = 1
            if (r0 == 0) goto L_0x00dc
            android.content.pm.ApplicationInfo r0 = r11.getApplicationInfo()
            int r1 = r0.targetSdkVersion
            r0 = 26
            r2 = 1
            if (r1 >= r0) goto L_0x00dd
        L_0x00dc:
            r2 = 0
        L_0x00dd:
            int r1 = r10.getFlags()
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            if (r1 != 0) goto L_0x00e7
            r3 = 0
        L_0x00e7:
            if (r2 == 0) goto L_0x00f1
            if (r3 != 0) goto L_0x00f1
            int r1 = A00(r13, r11, r10)
            goto L_0x02a5
        L_0x00f1:
            X.0v3 r2 = X.C19440v3.A00()
            java.lang.String r9 = "FirebaseInstanceId"
            boolean r0 = X.C90494aF.A1a(r9)
            if (r0 == 0) goto L_0x0102
            java.lang.String r0 = "Starting service"
            android.util.Log.d(r9, r0)
        L_0x0102:
            java.util.Queue r0 = r2.A03
            r0.offer(r10)
            java.lang.String r0 = "com.google.firebase.MESSAGING_EVENT"
            android.content.Intent r3 = X.C36441kJ.A0I(r0)
            java.lang.String r0 = r11.getPackageName()
            r3.setPackage(r0)
            monitor-enter(r2)
            java.lang.String r4 = r2.A02     // Catch:{ all -> 0x02af }
            if (r4 != 0) goto L_0x0174
            android.content.pm.PackageManager r1 = r11.getPackageManager()     // Catch:{ all -> 0x02af }
            r0 = 0
            android.content.pm.ResolveInfo r0 = r1.resolveService(r3, r0)     // Catch:{ all -> 0x02af }
            r4 = 0
            if (r0 == 0) goto L_0x0154
            android.content.pm.ServiceInfo r5 = r0.serviceInfo     // Catch:{ all -> 0x02af }
            if (r5 == 0) goto L_0x0154
            java.lang.String r0 = r11.getPackageName()     // Catch:{ all -> 0x02af }
            java.lang.String r6 = r5.packageName     // Catch:{ all -> 0x02af }
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x02af }
            if (r0 == 0) goto L_0x0157
            java.lang.String r1 = r5.name     // Catch:{ all -> 0x02af }
            if (r1 == 0) goto L_0x0157
            java.lang.String r0 = "."
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x02af }
            if (r0 == 0) goto L_0x014f
            java.lang.String r0 = r11.getPackageName()     // Catch:{ all -> 0x02af }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02af }
            java.lang.String r0 = r5.name     // Catch:{ all -> 0x02af }
            java.lang.String r1 = X.C90464aC.A0c(r1, r0)     // Catch:{ all -> 0x02af }
        L_0x014f:
            r2.A02 = r1     // Catch:{ all -> 0x02af }
            monitor-exit(r2)
            r4 = r1
            goto L_0x0175
        L_0x0154:
            java.lang.String r0 = "Failed to resolve target intent service, skipping classname enforcement"
            goto L_0x0171
        L_0x0157:
            java.lang.String r5 = r5.name     // Catch:{ all -> 0x02af }
            int r0 = X.C90474aD.A05(r6)     // Catch:{ all -> 0x02af }
            int r0 = r0 + 94
            java.lang.StringBuilder r1 = X.C90464aC.A0i(r5, r0)     // Catch:{ all -> 0x02af }
            java.lang.String r0 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            r1.append(r0)     // Catch:{ all -> 0x02af }
            r1.append(r6)     // Catch:{ all -> 0x02af }
            java.lang.String r0 = "/"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r5, r1)     // Catch:{ all -> 0x02af }
        L_0x0171:
            android.util.Log.e(r9, r0)     // Catch:{ all -> 0x02af }
        L_0x0174:
            monitor-exit(r2)
        L_0x0175:
            if (r4 == 0) goto L_0x018d
            boolean r0 = X.C90494aF.A1a(r9)
            if (r0 == 0) goto L_0x0186
            java.lang.String r0 = "Restricting intent to a specific service: "
            java.lang.String r0 = X.C90464aC.A0c(r0, r4)
            android.util.Log.d(r9, r0)
        L_0x0186:
            java.lang.String r0 = r11.getPackageName()
            r3.setClassName(r0, r4)
        L_0x018d:
            boolean r0 = r2.A01(r11)     // Catch:{ SecurityException -> 0x0286, IllegalStateException -> 0x026b }
            if (r0 == 0) goto L_0x0258
            java.lang.Object r19 = X.C113915gL.A02     // Catch:{ SecurityException -> 0x0286, IllegalStateException -> 0x026b }
            monitor-enter(r19)     // Catch:{ SecurityException -> 0x0286, IllegalStateException -> 0x026b }
            X.6T2 r0 = X.C113915gL.A00     // Catch:{ all -> 0x0255 }
            r2 = 1
            if (r0 != 0) goto L_0x01ab
            X.6T2 r0 = new X.6T2     // Catch:{ all -> 0x0255 }
            r0.<init>(r11)     // Catch:{ all -> 0x0255 }
            X.C113915gL.A00 = r0     // Catch:{ all -> 0x0255 }
            java.lang.Object r1 = r0.A09     // Catch:{ all -> 0x0255 }
            monitor-enter(r1)     // Catch:{ all -> 0x0255 }
            monitor-exit(r1)     // Catch:{ all -> 0x01a7 }
            goto L_0x01ab
        L_0x01a7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01a7 }
            goto L_0x0252
        L_0x01ab:
            java.lang.String r1 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r12 = 0
            boolean r0 = r3.getBooleanExtra(r1, r12)     // Catch:{ all -> 0x0255 }
            r3.putExtra(r1, r2)     // Catch:{ all -> 0x0255 }
            android.content.ComponentName r18 = r11.startService(r3)     // Catch:{ all -> 0x0255 }
            if (r18 != 0) goto L_0x01bf
            r18 = 0
            goto L_0x0253
        L_0x01bf:
            if (r0 != 0) goto L_0x0253
            X.6T2 r8 = X.C113915gL.A00     // Catch:{ all -> 0x0255 }
            long r6 = X.C113915gL.A01     // Catch:{ all -> 0x0255 }
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A05     // Catch:{ all -> 0x0255 }
            r0.incrementAndGet()     // Catch:{ all -> 0x0255 }
            long r0 = X.AnonymousClass6T2.A0F     // Catch:{ all -> 0x0255 }
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = java.lang.Math.min(r4, r0)     // Catch:{ all -> 0x0255 }
            r0 = 1
            long r2 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x0255 }
            r14 = 0
            int r0 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e5
            long r2 = java.lang.Math.min(r6, r2)     // Catch:{ all -> 0x0255 }
        L_0x01e5:
            java.lang.Object r6 = r8.A09     // Catch:{ all -> 0x0255 }
            monitor-enter(r6)     // Catch:{ all -> 0x0255 }
            boolean r0 = r8.A01()     // Catch:{ all -> 0x0250 }
            r7 = 0
            if (r0 != 0) goto L_0x01fb
            X.71u r0 = X.C1495871u.A00     // Catch:{ all -> 0x0250 }
            r8.A03 = r0     // Catch:{ all -> 0x0250 }
            android.os.PowerManager$WakeLock r0 = r8.A08     // Catch:{ all -> 0x0250 }
            r0.acquire()     // Catch:{ all -> 0x0250 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0250 }
        L_0x01fb:
            int r0 = r8.A00     // Catch:{ all -> 0x0250 }
            int r0 = r0 + 1
            r8.A00 = r0     // Catch:{ all -> 0x0250 }
            int r0 = r8.A01     // Catch:{ all -> 0x0250 }
            int r0 = r0 + 1
            r8.A01 = r0     // Catch:{ all -> 0x0250 }
            android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0250 }
            java.util.Map r0 = r8.A0B     // Catch:{ all -> 0x0250 }
            java.lang.Object r1 = r0.get(r7)     // Catch:{ all -> 0x0250 }
            X.6JG r1 = (X.AnonymousClass6JG) r1     // Catch:{ all -> 0x0250 }
            if (r1 != 0) goto L_0x021c
            X.6JG r1 = new X.6JG     // Catch:{ all -> 0x0250 }
            r1.<init>(r7)     // Catch:{ all -> 0x0250 }
            r0.put(r7, r1)     // Catch:{ all -> 0x0250 }
        L_0x021c:
            int r0 = r1.A00     // Catch:{ all -> 0x0250 }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x0250 }
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0250 }
            long r14 = r4 - r16
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x022e
            long r4 = r16 + r2
        L_0x022e:
            long r0 = r8.A02     // Catch:{ all -> 0x0250 }
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x024e
            r8.A02 = r4     // Catch:{ all -> 0x0250 }
            java.util.concurrent.Future r0 = r8.A04     // Catch:{ all -> 0x0250 }
            if (r0 == 0) goto L_0x023d
            r0.cancel(r12)     // Catch:{ all -> 0x0250 }
        L_0x023d:
            java.util.concurrent.ScheduledExecutorService r4 = r8.A0D     // Catch:{ all -> 0x0250 }
            r0 = 31
            X.72q r1 = new X.72q     // Catch:{ all -> 0x0250 }
            r1.<init>(r8, r0)     // Catch:{ all -> 0x0250 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0250 }
            java.util.concurrent.ScheduledFuture r0 = r4.schedule(r1, r2, r0)     // Catch:{ all -> 0x0250 }
            r8.A04 = r0     // Catch:{ all -> 0x0250 }
        L_0x024e:
            monitor-exit(r6)     // Catch:{ all -> 0x0250 }
            goto L_0x0253
        L_0x0250:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0250 }
        L_0x0252:
            throw r0     // Catch:{ all -> 0x0255 }
        L_0x0253:
            monitor-exit(r19)     // Catch:{ all -> 0x0255 }
            goto L_0x0261
        L_0x0255:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x0255 }
            throw r0     // Catch:{ SecurityException -> 0x0286, IllegalStateException -> 0x026b }
        L_0x0258:
            android.content.ComponentName r18 = r11.startService(r3)     // Catch:{ SecurityException -> 0x0286, IllegalStateException -> 0x026b }
            java.lang.String r0 = "Missing wake lock permission, service start may be delayed"
            android.util.Log.d(r9, r0)     // Catch:{ SecurityException -> 0x0286, IllegalStateException -> 0x026b }
        L_0x0261:
            if (r18 != 0) goto L_0x028f
            java.lang.String r0 = "Error while delivering the message: ServiceIntent not found."
            android.util.Log.e(r9, r0)     // Catch:{ SecurityException -> 0x0286, IllegalStateException -> 0x026b }
            r1 = 404(0x194, float:5.66E-43)
            goto L_0x0290
        L_0x026b:
            r0 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = X.C90474aD.A05(r2)
            int r0 = r0 + 45
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r0)
            java.lang.String r0 = "Failed to start service while in background: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
            android.util.Log.e(r9, r0)
            r1 = 402(0x192, float:5.63E-43)
            goto L_0x0290
        L_0x0286:
            r1 = move-exception
            java.lang.String r0 = "Error while delivering the message to the serviceIntent"
            android.util.Log.e(r9, r0, r1)
            r1 = 401(0x191, float:5.62E-43)
            goto L_0x0290
        L_0x028f:
            r1 = -1
        L_0x0290:
            boolean r0 = X.AnonymousClass0VW.A00()
            if (r0 == 0) goto L_0x02a5
            r0 = 402(0x192, float:5.63E-43)
            if (r1 != r0) goto L_0x02a5
            A00(r13, r11, r10)
            r1 = 403(0x193, float:5.65E-43)
            goto L_0x02a5
        L_0x02a0:
            monitor-exit(r5)
            com.google.firebase.iid.FirebaseInstanceId.A03(r6)
        L_0x02a4:
            r1 = -1
        L_0x02a5:
            boolean r0 = r13.isOrderedBroadcast()
            if (r0 == 0) goto L_0x02ae
            r13.setResultCode(r1)
        L_0x02ae:
            return
        L_0x02af:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdReceiver.A01(android.content.Context, android.content.Intent):void");
    }

    public static int A00(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        AnonymousClass6ZJ r4;
        if (C90494aF.A1a("FirebaseInstanceId")) {
            Log.d("FirebaseInstanceId", "Binding to service");
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        synchronized (FirebaseInstanceIdReceiver.class) {
            r4 = A00;
            if (r4 == null) {
                r4 = new AnonymousClass6ZJ(context);
                A00 = r4;
            }
        }
        BroadcastReceiver.PendingResult goAsync = broadcastReceiver.goAsync();
        synchronized (r4) {
            if (C90494aF.A1a("FirebaseInstanceId")) {
                Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
            }
            r4.A04.add(new AnonymousClass63K(goAsync, intent, r4.A05));
            AnonymousClass6ZJ.A00(r4);
        }
        return -1;
    }

    public final void onReceive(Context context, Intent intent) {
        Intent intent2;
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (!(parcelableExtra instanceof Intent) || (intent2 = (Intent) parcelableExtra) == null) {
                A01(context, intent);
            } else {
                A01(context, intent2);
            }
        }
    }
}
