package X;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6LE  reason: invalid class name */
public class AnonymousClass6LE {
    public int A00 = 0;
    public final C120975sO A01;
    public final Object A02 = C36441kJ.A11();
    public final HashSet A03 = C36441kJ.A16();
    public final LinkedList A04 = C90524aI.A0l();
    public final AtomicInteger A05 = new AtomicInteger(0);

    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a6, code lost:
        A01(r8);
        A01(r7);
        r3 = r12.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ae, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r8 = r12.A00;
        r7 = r2.prefetchTaskQueueWorkerNum;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b5, code lost:
        if (r2.useNetworkAwaretPrefetchTaskQueueWorkerNum == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b7, code lost:
        r1 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b9, code lost:
        if (r1 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bb, code lost:
        r7 = X.C202509m3.A00(r1, 17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c1, code lost:
        if (r8 >= r7) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c4, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r7 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cd, code lost:
        if (r7.hasNext() == false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cf, code lost:
        r0 = (X.AnonymousClass69O) r7.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d5, code lost:
        if (r0 == null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00dd, code lost:
        if (r0.A00.A00 != X.AnonymousClass5SY.URGENT) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00df, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e1, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e2, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e3, code lost:
        if (r0 == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r1 = r12.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e9, code lost:
        if (r1 >= r2.prefetchUrgentTaskQueueWorkerNum) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00eb, code lost:
        r0 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ee, code lost:
        r0 = r12.A00 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f2, code lost:
        r12.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f4, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f5, code lost:
        r1 = new X.AnonymousClass78d(new X.AnonymousClass759((java.lang.Object) r12, 47));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0103, code lost:
        if (r2.changeThreadPriorityForPrefetch == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0105, code lost:
        r1.setPriority(r2.prefetchThreadUpdatedPriority);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x010a, code lost:
        r1.start();
        r4 = "TaskQueueExecutor";
        r3 = "Create a new worker %d. Total worker number is %d.";
        r2 = X.AnonymousClass001.A0M();
        X.AnonymousClass000.A1M(r2, 0, r1.getId());
        X.AnonymousClass000.A1L(r2, r12.A00, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0122, code lost:
        A01(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0125, code lost:
        if (r7 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0127, code lost:
        r4 = "TaskQueueExecutor";
        r3 = "%s";
        r2 = new java.lang.Object[]{r7};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x012f, code lost:
        X.C131916Rh.A01(r4, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0134, code lost:
        r1 = new java.lang.Object[1];
        X.AnonymousClass000.A1L(r1, r4.size(), 0);
        X.C131916Rh.A01("TaskQueueExecutor", "All workers are busy. Tasks on pending %d.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0144, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass69O r11, X.AnonymousClass6LE r12, boolean r13) {
        /*
            r10 = 0
            r5 = 0
            r6 = 1
            java.util.LinkedList r4 = r12.A04     // Catch:{ all -> 0x015d }
            monitor-enter(r4)     // Catch:{ all -> 0x015d }
            java.util.HashSet r0 = r12.A03     // Catch:{ all -> 0x014e }
            boolean r0 = r0.contains(r11)     // Catch:{ all -> 0x014e }
            if (r0 == 0) goto L_0x0010
            monitor-exit(r4)     // Catch:{ all -> 0x014e }
            return
        L_0x0010:
            int r9 = r4.size()     // Catch:{ all -> 0x014e }
            X.5sO r1 = r12.A01     // Catch:{ all -> 0x014e }
            X.AUR r2 = r1.A02     // Catch:{ all -> 0x014e }
            int r7 = r2.prefetchTaskQueueSize     // Catch:{ all -> 0x014e }
            if (r13 == 0) goto L_0x0052
            boolean r0 = r4.contains(r11)     // Catch:{ all -> 0x014e }
            if (r0 == 0) goto L_0x0032
            r4.remove(r11)     // Catch:{ all -> 0x014e }
            int r9 = r9 + -1
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x014e }
            java.lang.String r0 = "Found duplicate task. The old task is removed "
            java.lang.String r8 = X.AnonymousClass000.A0l(r11, r0, r3)     // Catch:{ all -> 0x014e }
            goto L_0x0033
        L_0x0032:
            r8 = r10
        L_0x0033:
            int r7 = r7 - r6
            if (r7 >= r9) goto L_0x003f
            java.util.List r0 = r4.subList(r7, r9)     // Catch:{ all -> 0x0152 }
            r0.clear()     // Catch:{ all -> 0x0152 }
            java.lang.String r8 = "Task queue is over sized. Remove the old tasks"
        L_0x003f:
            r4.addFirst(r11)     // Catch:{ all -> 0x0152 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = "Add new task to the front of the queue. Total task number is "
            X.C36341k9.A1N(r0, r3, r4)     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = ", "
            java.lang.String r7 = X.AnonymousClass000.A0l(r11, r0, r3)     // Catch:{ all -> 0x0152 }
            goto L_0x0098
        L_0x0052:
            if (r7 > r9) goto L_0x0073
            if (r7 >= r9) goto L_0x0068
            java.util.List r0 = r4.subList(r7, r9)     // Catch:{ all -> 0x014e }
            r0.clear()     // Catch:{ all -> 0x014e }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x014e }
            java.lang.String r0 = "Task queue is over sized. Remove the old tasks. The new task is not added "
            java.lang.String r8 = X.AnonymousClass000.A0l(r11, r0, r3)     // Catch:{ all -> 0x014e }
            goto L_0x0083
        L_0x0068:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x014e }
            java.lang.String r0 = "Task queue is over sized. The new task is not added "
            java.lang.String r8 = X.AnonymousClass000.A0l(r11, r0, r3)     // Catch:{ all -> 0x014e }
            goto L_0x0083
        L_0x0073:
            boolean r0 = r4.contains(r11)     // Catch:{ all -> 0x014e }
            if (r0 == 0) goto L_0x0085
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x014e }
            java.lang.String r0 = "Found duplicate task. The new task is not added. "
            java.lang.String r8 = X.AnonymousClass000.A0l(r11, r0, r3)     // Catch:{ all -> 0x014e }
        L_0x0083:
            r7 = r10
            goto L_0x00a5
        L_0x0085:
            r4.addLast(r11)     // Catch:{ all -> 0x014e }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x014e }
            java.lang.String r0 = "Add new task to the end of queue. Total task number is "
            X.C36341k9.A1N(r0, r3, r4)     // Catch:{ all -> 0x014e }
            java.lang.String r0 = ", "
            java.lang.String r7 = X.AnonymousClass000.A0l(r11, r0, r3)     // Catch:{ all -> 0x014e }
            r8 = r10
        L_0x0098:
            java.util.concurrent.atomic.AtomicInteger r0 = r12.A05     // Catch:{ all -> 0x014b }
            int r0 = r0.get()     // Catch:{ all -> 0x014b }
            if (r0 <= 0) goto L_0x00a5
            r4.notify()     // Catch:{ all -> 0x014b }
            monitor-exit(r4)     // Catch:{ all -> 0x014b }
            goto L_0x0122
        L_0x00a5:
            monitor-exit(r4)     // Catch:{ all -> 0x014b }
            A01(r8)
            A01(r7)
            java.lang.Object r3 = r12.A02
            monitor-enter(r3)
            int r8 = r12.A00     // Catch:{ all -> 0x0148 }
            int r7 = r2.prefetchTaskQueueWorkerNum     // Catch:{ all -> 0x0148 }
            boolean r0 = r2.useNetworkAwaretPrefetchTaskQueueWorkerNum     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x00c1
            X.9m3 r1 = r1.A01     // Catch:{ all -> 0x0148 }
            if (r1 == 0) goto L_0x00c1
            r0 = 17
            int r7 = X.C202509m3.A00(r1, r0)     // Catch:{ all -> 0x0148 }
        L_0x00c1:
            if (r8 >= r7) goto L_0x00c4
            goto L_0x00ee
        L_0x00c4:
            monitor-enter(r4)     // Catch:{ all -> 0x0148 }
            java.util.Iterator r7 = r4.iterator()     // Catch:{ all -> 0x0145 }
        L_0x00c9:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0145 }
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x0145 }
            X.69O r0 = (X.AnonymousClass69O) r0     // Catch:{ all -> 0x0145 }
            if (r0 == 0) goto L_0x00c9
            X.9YW r0 = r0.A00     // Catch:{ all -> 0x0145 }
            X.5SY r1 = r0.A00     // Catch:{ all -> 0x0145 }
            X.5SY r0 = X.AnonymousClass5SY.URGENT     // Catch:{ all -> 0x0145 }
            if (r1 != r0) goto L_0x00c9
            r0 = 1
            goto L_0x00e2
        L_0x00e1:
            r0 = 0
        L_0x00e2:
            monitor-exit(r4)     // Catch:{ all -> 0x0145 }
            if (r0 == 0) goto L_0x0133
            int r1 = r12.A00     // Catch:{ all -> 0x0148 }
            int r0 = r2.prefetchUrgentTaskQueueWorkerNum     // Catch:{ all -> 0x0148 }
            if (r1 >= r0) goto L_0x0133
            int r0 = r1 + 1
            goto L_0x00f2
        L_0x00ee:
            int r0 = r12.A00     // Catch:{ all -> 0x0148 }
            int r0 = r0 + 1
        L_0x00f2:
            r12.A00 = r0     // Catch:{ all -> 0x0148 }
            monitor-exit(r3)     // Catch:{ all -> 0x0148 }
            r1 = 47
            X.759 r0 = new X.759
            r0.<init>((java.lang.Object) r12, (int) r1)
            X.78d r1 = new X.78d
            r1.<init>(r0)
            boolean r0 = r2.changeThreadPriorityForPrefetch
            if (r0 == 0) goto L_0x010a
            int r0 = r2.prefetchThreadUpdatedPriority
            r1.setPriority(r0)
        L_0x010a:
            r1.start()
            java.lang.String r4 = "TaskQueueExecutor"
            java.lang.String r3 = "Create a new worker %d. Total worker number is %d."
            java.lang.Object[] r2 = X.AnonymousClass001.A0M()
            long r0 = r1.getId()
            X.AnonymousClass000.A1M(r2, r5, r0)
            int r0 = r12.A00
            X.AnonymousClass000.A1L(r2, r0, r6)
            goto L_0x012f
        L_0x0122:
            A01(r8)
            if (r7 == 0) goto L_0x0132
            java.lang.String r4 = "TaskQueueExecutor"
            java.lang.String r3 = "%s"
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r5] = r7
        L_0x012f:
            X.C131916Rh.A01(r4, r3, r2)
        L_0x0132:
            return
        L_0x0133:
            monitor-exit(r3)     // Catch:{ all -> 0x0148 }
            java.lang.String r3 = "TaskQueueExecutor"
            java.lang.String r2 = "All workers are busy. Tasks on pending %d."
            java.lang.Object[] r1 = new java.lang.Object[r6]
            int r0 = r4.size()
            X.AnonymousClass000.A1L(r1, r0, r5)
            X.C131916Rh.A01(r3, r2, r1)
            return
        L_0x0145:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0145 }
            throw r0     // Catch:{ all -> 0x0148 }
        L_0x0148:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0148 }
            throw r0
        L_0x014b:
            r0 = move-exception
            r10 = r7
            goto L_0x0150
        L_0x014e:
            r0 = move-exception
            r8 = r10
        L_0x0150:
            monitor-exit(r4)     // Catch:{ all -> 0x0152 }
            goto L_0x0154
        L_0x0152:
            r0 = move-exception
            goto L_0x0150
        L_0x0154:
            throw r0     // Catch:{ all -> 0x0155 }
        L_0x0155:
            r0 = move-exception
            A01(r8)
            A01(r10)
            throw r0
        L_0x015d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6LE.A00(X.69O, X.6LE, boolean):void");
    }

    public static void A01(Object obj) {
        if (obj != null) {
            C131916Rh.A01("TaskQueueExecutor", "%s", obj);
        }
    }

    public AnonymousClass6LE(C120975sO r3) {
        this.A01 = r3;
    }
}
