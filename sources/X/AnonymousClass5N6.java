package X;

/* renamed from: X.5N6  reason: invalid class name */
public class AnonymousClass5N6 extends C19950wm {
    public boolean A00;
    public boolean A01;
    public final long A02;
    public final C118965p1 A03;
    public final C21060yb A04;
    public final Object A05 = C36441kJ.A11();
    public final /* synthetic */ AnonymousClass11d A06;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:27|28|29|30|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0089 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r10 = this;
            r9 = 0
            r8 = 0
        L_0x0002:
            X.11d r4 = r10.A06     // Catch:{ RuntimeException -> 0x00bc }
            X.0yb r0 = r10.A04     // Catch:{ RuntimeException -> 0x00bc }
            android.app.ActivityManager r0 = r0.A04()     // Catch:{ RuntimeException -> 0x00bc }
            X.C18740tg.A06(r0)     // Catch:{ RuntimeException -> 0x00bc }
            java.util.List r0 = r0.getProcessesInErrorState()     // Catch:{ RuntimeException -> 0x00bc }
            r5 = 0
            if (r0 == 0) goto L_0x0047
            int r7 = android.os.Process.myUid()     // Catch:{ RuntimeException -> 0x00bc }
            int r6 = android.os.Process.myPid()     // Catch:{ RuntimeException -> 0x00bc }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ RuntimeException -> 0x00bc }
        L_0x0020:
            boolean r0 = r3.hasNext()     // Catch:{ RuntimeException -> 0x00bc }
            if (r0 == 0) goto L_0x0047
            java.lang.Object r2 = r3.next()     // Catch:{ RuntimeException -> 0x00bc }
            android.app.ActivityManager$ProcessErrorStateInfo r2 = (android.app.ActivityManager.ProcessErrorStateInfo) r2     // Catch:{ RuntimeException -> 0x00bc }
            int r1 = r2.condition     // Catch:{ RuntimeException -> 0x00bc }
            r0 = 2
            if (r1 != r0) goto L_0x0020
            int r0 = r2.uid     // Catch:{ RuntimeException -> 0x00bc }
            if (r0 != r7) goto L_0x0020
            int r0 = r2.pid     // Catch:{ RuntimeException -> 0x00bc }
            if (r0 != r6) goto L_0x0020
            X.5p0 r5 = new X.5p0     // Catch:{ RuntimeException -> 0x00bc }
            r5.<init>()     // Catch:{ RuntimeException -> 0x00bc }
            java.lang.String r0 = r2.shortMsg     // Catch:{ RuntimeException -> 0x00bc }
            r5.A00 = r0     // Catch:{ RuntimeException -> 0x00bc }
            java.lang.String r0 = r2.tag     // Catch:{ RuntimeException -> 0x00bc }
            r5.A01 = r0     // Catch:{ RuntimeException -> 0x00bc }
            goto L_0x0020
        L_0x0047:
            boolean r0 = r10.A00     // Catch:{ RuntimeException -> 0x00bc }
            if (r0 == 0) goto L_0x0067
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ RuntimeException -> 0x00bc }
            java.lang.String r0 = "ProcessANRErrorMonitor/Starting process monitor checks for process "
            r1.append(r0)     // Catch:{ RuntimeException -> 0x00bc }
            int r0 = android.os.Process.myPid()     // Catch:{ RuntimeException -> 0x00bc }
            java.lang.String r0 = X.C36381kD.A10(r1, r0)     // Catch:{ RuntimeException -> 0x00bc }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x00bc }
            r10.A00 = r8     // Catch:{ RuntimeException -> 0x00bc }
            X.5p1 r1 = r10.A03     // Catch:{ RuntimeException -> 0x00bc }
            r0 = 0
            X.AnonymousClass11d.A00(r4, r1, r0, r0, r8)     // Catch:{ RuntimeException -> 0x00bc }
        L_0x0067:
            if (r5 != 0) goto L_0x0099
            int r9 = r9 + 1
            r0 = 120(0x78, float:1.68E-43)
            if (r9 < r0) goto L_0x007c
            X.5p1 r2 = r10.A03
            r1 = 2
            r0 = 0
            X.AnonymousClass11d.A00(r4, r2, r0, r0, r1)
            java.lang.String r0 = "ProcessANRErrorMonitor/Stopping checks because of MAX_NUMBER_BEFORE_ERROR"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x007c:
            java.lang.Object r2 = r10.A05
            monitor-enter(r2)
            boolean r0 = r10.A01     // Catch:{ all -> 0x0096 }
            if (r0 != 0) goto L_0x008b
            r0 = 500(0x1f4, float:7.0E-43)
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0089 }
            r2.wait(r0)     // Catch:{ InterruptedException -> 0x0089 }
        L_0x0089:
            boolean r0 = r10.A01     // Catch:{ all -> 0x0096 }
        L_0x008b:
            monitor-exit(r2)     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0002
            X.5p1 r2 = r10.A03
            r1 = 3
            r0 = 0
            X.AnonymousClass11d.A00(r4, r2, r0, r0, r1)
            return
        L_0x0096:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0096 }
            throw r0
        L_0x0099:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ProcessANRErrorMonitor/ANR detected Short msg: "
            r1.append(r0)
            java.lang.String r0 = r5.A00
            r1.append(r0)
            java.lang.String r0 = " Tag: "
            r1.append(r0)
            java.lang.String r0 = r5.A01
            X.C36341k9.A1O(r1, r0)
            X.5p1 r3 = r10.A03
            java.lang.String r2 = r5.A00
            java.lang.String r1 = r5.A01
            r0 = 1
            X.AnonymousClass11d.A00(r4, r3, r2, r1, r0)
            return
        L_0x00bc:
            r1 = move-exception
            r1.printStackTrace()
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L_0x00d2
            X.11d r3 = r10.A06
            X.5p1 r2 = r10.A03
            r1 = 4
            r0 = 0
            X.AnonymousClass11d.A00(r3, r2, r0, r0, r1)
            return
        L_0x00d2:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5N6.run():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5N6(AnonymousClass11d r2, C118965p1 r3, C21060yb r4, long j) {
        super("ProcessAnrErrorMonitorThread");
        this.A06 = r2;
        this.A03 = r3;
        this.A02 = j;
        this.A00 = true;
        this.A04 = r4;
    }
}
