package X;

import com.whatsapp.util.Log;

/* renamed from: X.4yC  reason: invalid class name and case insensitive filesystem */
public class C101734yC extends C33131el {
    public C33101ei A00;
    public AnonymousClass19A A01;
    public boolean A02 = true;
    public boolean A03 = true;
    public boolean A04 = true;
    public AnonymousClass19J A05;
    public final Object A06 = C36441kJ.A11();

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:56:0x0064=Splitter:B:56:0x0064, B:48:0x005a=Splitter:B:48:0x005a} */
    public synchronized boolean A00() {
        /*
            r6 = this;
            monitor-enter(r6)
            r1 = r6
            boolean r0 = r6 instanceof X.C101544xt     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0013
            X.4xt r1 = (X.C101544xt) r1     // Catch:{ all -> 0x0065 }
            com.whatsapp.backup.google.workers.GoogleEncryptedReUploadWorker r0 = r1.A00     // Catch:{ all -> 0x0065 }
            X.1ei r0 = r0.A08     // Catch:{ all -> 0x0065 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0R     // Catch:{ all -> 0x0065 }
        L_0x000e:
            boolean r0 = r0.get()     // Catch:{ all -> 0x0065 }
            goto L_0x0018
        L_0x0013:
            X.1ei r0 = r6.A00     // Catch:{ all -> 0x0065 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0Q     // Catch:{ all -> 0x0065 }
            goto L_0x000e
        L_0x0018:
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = "google-backup-worker-task-condition/block backup is not running"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0065 }
            goto L_0x005f
        L_0x0020:
            r6.A06()     // Catch:{ all -> 0x0065 }
            java.lang.Object r5 = r6.A06     // Catch:{ all -> 0x0065 }
            monitor-enter(r5)     // Catch:{ all -> 0x0065 }
            boolean r0 = r6.A04     // Catch:{ all -> 0x0062 }
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0035
            boolean r0 = r6.A02     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0035
            boolean r1 = r6.A03     // Catch:{ all -> 0x0062 }
            r0 = 1
            if (r1 != 0) goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            monitor-exit(r5)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = "google-backup-worker-task-condition/reconnectXmppIfNeeded xmpp is not connected, reconnecting"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0065 }
            X.19A r2 = r6.A01     // Catch:{ 1ej -> 0x004d }
            r0 = 32000(0x7d00, double:1.581E-319)
            r2.A0B(r0)     // Catch:{ 1ej -> 0x004d }
            monitor-enter(r5)     // Catch:{ 1ej -> 0x004d }
            r6.A04 = r4     // Catch:{ all -> 0x004a }
            monitor-exit(r5)     // Catch:{ all -> 0x004a }
            goto L_0x005a
        L_0x004a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ 1ej -> 0x004d }
        L_0x004d:
            java.lang.String r0 = "google-backup-worker-task-condition/reconnectXmppIfNeeded xmpp reconnect wasn't successful"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0065 }
            monitor-enter(r5)     // Catch:{ all -> 0x0065 }
            r6.A04 = r3     // Catch:{ all -> 0x0057 }
            monitor-exit(r5)     // Catch:{ all -> 0x0057 }
            goto L_0x005a
        L_0x0057:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0057 }
            goto L_0x0064
        L_0x005a:
            boolean r0 = r6.A05()     // Catch:{ all -> 0x0065 }
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            monitor-exit(r6)
            return r0
        L_0x0062:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0062 }
        L_0x0064:
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101734yC.A00():boolean");
    }

    public String toString() {
        return "backup-condition-for-backup-worker";
    }

    public boolean A02() {
        boolean z;
        synchronized (this.A06) {
            z = this.A02;
        }
        return z;
    }

    public boolean A03() {
        boolean z;
        synchronized (this.A06) {
            z = this.A03;
        }
        return z;
    }

    public boolean A04() {
        boolean z;
        synchronized (this.A06) {
            z = this.A04;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        if (r3.A04 == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A06
            monitor-enter(r2)
            boolean r0 = r3.A03     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0010
            boolean r0 = r3.A02     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0010
            boolean r1 = r3.A04     // Catch:{ all -> 0x0013 }
            r0 = 1
            if (r1 != 0) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101734yC.A05():boolean");
    }

    public void A06() {
        synchronized (this.A06) {
            this.A04 = true;
            this.A03 = true;
            this.A02 = true;
            C33101ei r1 = this.A00;
            if (!r1.A09) {
                Log.i("google-backup-worker-task-condition/refreshConditions sd card is not available");
                this.A03 = false;
            }
            if (!r1.A0U.get()) {
                Log.i("google-backup-worker-task-condition/refreshConditions network is not available for backup");
                this.A02 = false;
            }
            if (this.A05.A04 != 2) {
                Log.i("google-backup-worker-task-condition/refreshConditions xmpp is not connected");
                this.A04 = false;
            }
        }
    }

    public C101734yC(AnonymousClass19J r2, C33101ei r3, AnonymousClass19A r4) {
        this.A01 = r4;
        this.A05 = r2;
        this.A00 = r3;
    }
}
