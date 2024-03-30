package X;

import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import java.util.UUID;

/* renamed from: X.9jb  reason: invalid class name and case insensitive filesystem */
public class C201439jb {
    public C191159Bw A00;
    public String A01 = "";
    public final C200199gr A02;
    public volatile UUID A03;
    public volatile boolean A04;

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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private boolean A01() {
        /*
            r7 = this;
            r6 = 0
            java.util.UUID r0 = r7.A03
            if (r0 == 0) goto L_0x0042
            X.9gr r5 = r7.A02
            java.util.UUID r4 = r7.A03
            monitor-enter(r5)
            java.util.UUID r0 = r5.A01     // Catch:{ all -> 0x003e }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x0013
            goto L_0x0041
        L_0x0013:
            android.os.Handler r0 = r5.A03     // Catch:{ all -> 0x003e }
            boolean r3 = r0.hasMessages(r6, r4)     // Catch:{ all -> 0x003e }
            r0.removeCallbacksAndMessages(r4)     // Catch:{ all -> 0x003e }
            android.os.Handler r0 = r5.A00     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x002b
            boolean r0 = r0.hasMessages(r6, r4)     // Catch:{ all -> 0x003e }
            r3 = r3 | r0
            android.os.Handler r0 = r5.A00     // Catch:{ all -> 0x003e }
            r0.removeCallbacksAndMessages(r4)     // Catch:{ all -> 0x003e }
            goto L_0x0039
        L_0x002b:
            java.lang.Class<X.9lk> r2 = X.C202399lk.class
            monitor-enter(r2)     // Catch:{ all -> 0x003e }
            android.os.Handler r1 = X.C202399lk.A00     // Catch:{ all -> 0x003b }
            boolean r0 = r1.hasMessages(r6, r4)     // Catch:{ all -> 0x003b }
            r1.removeCallbacksAndMessages(r4)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003e }
            r3 = r3 | r0
        L_0x0039:
            monitor-exit(r5)
            goto L_0x0043
        L_0x003b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0041:
            monitor-exit(r5)
        L_0x0042:
            r3 = 0
        L_0x0043:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r7.A03 = r0
            X.9gr r1 = r7.A02
            java.util.UUID r0 = r7.A03
            monitor-enter(r1)
            r1.A01 = r0     // Catch:{ all -> 0x0052 }
            monitor-exit(r1)
            return r3
        L_0x0052:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201439jb.A01():boolean");
    }

    private void A00(String str, String str2) {
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append(" has been evicted. ");
        A0v.append(str2);
        Log.e("SessionManager", AnonymousClass000.A0q(" now owns the camera device", A0v));
        AnonymousClass9VB r0 = C202389lj.A00;
        new Pair(str, str2);
        C202389lj.A00();
        C191159Bw r02 = this.A00;
        if (r02 != null) {
            C200199gr r2 = this.A02;
            C80393vK r1 = new C80393vK(r02, str, str2, 0);
            synchronized (r2) {
                Handler handler = r2.A00;
                if (handler != null) {
                    handler.post(r1);
                } else {
                    C202399lk.A00(r1);
                }
            }
            this.A00 = null;
        }
    }

    public UUID A02(Handler handler, String str) {
        UUID uuid;
        C200199gr r1 = this.A02;
        synchronized (r1) {
            if (this.A04) {
                A00(this.A01, str);
            }
            if (A01()) {
                A00(this.A01, str);
            }
            r1.A00 = handler;
            this.A01 = str;
            this.A04 = true;
            uuid = this.A03;
        }
        return uuid;
    }

    public void A03(UUID uuid) {
        C200199gr r2 = this.A02;
        synchronized (r2) {
            if (uuid != null) {
                if (this.A03 != null && uuid.equals(this.A03)) {
                    A01();
                    r2.A00 = null;
                    this.A00 = null;
                    this.A04 = false;
                }
            }
        }
    }

    public C201439jb(C200199gr r2) {
        this.A02 = r2;
    }
}
