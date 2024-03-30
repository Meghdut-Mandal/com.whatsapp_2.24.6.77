package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

public final class zzr {
    public final Object zza = new Object();
    public Queue zzb;
    public boolean zzc;

    public final void zza(zzq zzq) {
        synchronized (this.zza) {
            Queue queue = this.zzb;
            if (queue == null) {
                queue = new ArrayDeque();
                this.zzb = queue;
            }
            queue.add(zzq);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = (com.google.android.gms.tasks.zzq) r2.zzb.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r0 != null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        r2.zzc = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        r0.zzd(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        r1 = r2.zza;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(com.google.android.gms.tasks.Task r3) {
        /*
            r2 = this;
            java.lang.Object r1 = r2.zza
            monitor-enter(r1)
            java.util.Queue r0 = r2.zzb     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x002a
            boolean r0 = r2.zzc     // Catch:{ all -> 0x002c }
            if (r0 != 0) goto L_0x002a
            r0 = 1
            r2.zzc = r0     // Catch:{ all -> 0x002c }
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
        L_0x000f:
            java.lang.Object r1 = r2.zza
            monitor-enter(r1)
            java.util.Queue r0 = r2.zzb     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            com.google.android.gms.tasks.zzq r0 = (com.google.android.gms.tasks.zzq) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0021
            r0 = 0
            r2.zzc = r0     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            goto L_0x0026
        L_0x0021:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.zzd(r3)
            goto L_0x000f
        L_0x0026:
            return
        L_0x0027:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r0
        L_0x002a:
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.zzr.zzb(com.google.android.gms.tasks.Task):void");
    }
}
