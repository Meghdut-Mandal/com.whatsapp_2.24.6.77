package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* renamed from: X.9pg  reason: invalid class name and case insensitive filesystem */
public class C204239pg implements SensorEventListener {
    public final AnonymousClass9Rc A00;
    public final /* synthetic */ AnonymousClass1UY A01;

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C204239pg(AnonymousClass1UY r1) {
        this();
        this.A01 = r1;
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void onSensorChanged(android.hardware.SensorEvent r13) {
        /*
            r12 = this;
            X.9Rc r8 = r12.A00
            X.9Rz r4 = r8.A02
            monitor-enter(r4)
            int r6 = r4.A01     // Catch:{ all -> 0x00d5 }
            monitor-exit(r4)
            long r2 = r13.timestamp
            if (r6 != 0) goto L_0x0019
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r2 = r2 + r0
            r8.A00 = r2
        L_0x0012:
            X.9Fe r3 = new X.9Fe
            r3.<init>(r13)
        L_0x0017:
            monitor-enter(r4)
            goto L_0x0036
        L_0x0019:
            long r0 = r8.A00
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x0031
            r0 = 32
            if (r6 < r0) goto L_0x0012
        L_0x0023:
            java.lang.Object r3 = r4.A00()
            X.9Fe r3 = (X.C191969Fe) r3
            float[] r1 = r13.values
            r0 = 0
            r0 = r1[r0]
            r3.A00 = r0
            goto L_0x0017
        L_0x0031:
            r0 = 10
            if (r6 >= r0) goto L_0x0023
            goto L_0x0012
        L_0x0036:
            int r1 = r4.A01     // Catch:{ all -> 0x00cd }
            r0 = 32
            if (r1 != r0) goto L_0x003f
            r4.A00()     // Catch:{ all -> 0x00d5 }
        L_0x003f:
            int r2 = r4.A01     // Catch:{ all -> 0x00d5 }
            java.lang.Object[] r7 = r4.A03     // Catch:{ all -> 0x00d5 }
            r1 = 32
            r6 = 32
            boolean r0 = X.AnonymousClass000.A1T(r2, r0)
            X.C18740tg.A0C(r0)     // Catch:{ all -> 0x00d5 }
            int r0 = r4.A00     // Catch:{ all -> 0x00d5 }
            r7[r0] = r3     // Catch:{ all -> 0x00d5 }
            int r0 = r0 + 1
            int r0 = r0 % r1
            r4.A00 = r0     // Catch:{ all -> 0x00d5 }
            int r0 = r2 + 1
            r4.A01 = r0     // Catch:{ all -> 0x00d5 }
            monitor-exit(r4)
            r5 = 0
            r9 = 0
            r3 = 0
            r2 = 0
        L_0x0060:
            monitor-enter(r4)
            int r1 = r4.A01     // Catch:{ all -> 0x00d5 }
            monitor-exit(r4)
            r0 = 2
            r11 = 1
            if (r9 >= r1) goto L_0x00b6
            monitor-enter(r4)
            int r0 = r4.A01     // Catch:{ all -> 0x00d5 }
            if (r0 <= r9) goto L_0x00cf
            int r0 = r4.A02     // Catch:{ all -> 0x00d5 }
            int r0 = r0 + r9
            int r0 = r0 % r6
            r0 = r7[r0]     // Catch:{ all -> 0x00d5 }
            monitor-exit(r4)
            X.9Fe r0 = (X.C191969Fe) r0
            float r1 = r0.A00
            r0 = 1095806846(0x4150af7e, float:13.042845)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r10 = X.AnonymousClass000.A1R(r0)
            r0 = -1051676802(0xffffffffc150af7e, float:-13.042845)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r1 = X.C36431kI.A1P(r0)
            java.lang.Integer r0 = r8.A01
            int r0 = r0.intValue()
            if (r0 == r5) goto L_0x00a4
            if (r0 == r11) goto L_0x009f
            if (r10 != 0) goto L_0x00af
            if (r1 != 0) goto L_0x009c
        L_0x0098:
            java.lang.Integer r0 = X.C023109s.A00
            r8.A01 = r0
        L_0x009c:
            int r9 = r9 + 1
            goto L_0x0060
        L_0x009f:
            if (r1 != 0) goto L_0x00a8
            if (r10 != 0) goto L_0x009c
            goto L_0x0098
        L_0x00a4:
            if (r10 != 0) goto L_0x00af
            if (r1 == 0) goto L_0x009c
        L_0x00a8:
            java.lang.Integer r0 = X.C023109s.A0C
            r8.A01 = r0
            int r2 = r2 + 1
            goto L_0x009c
        L_0x00af:
            java.lang.Integer r0 = X.C023109s.A01
            r8.A01 = r0
            int r3 = r3 + 1
            goto L_0x009c
        L_0x00b6:
            if (r3 < r0) goto L_0x00c2
            if (r2 < r0) goto L_0x00c2
            monitor-enter(r4)
            r1 = 0
            goto L_0x00c3
        L_0x00bd:
            int r1 = r1 + 1
            if (r1 < r6) goto L_0x00c9
            monitor-exit(r4)
        L_0x00c2:
            return
        L_0x00c3:
            r4.A01 = r5     // Catch:{ all -> 0x00d5 }
            r4.A02 = r5     // Catch:{ all -> 0x00d5 }
            r4.A00 = r5     // Catch:{ all -> 0x00d5 }
        L_0x00c9:
            r0 = 0
            r7[r1] = r0     // Catch:{ all -> 0x00d5 }
            goto L_0x00bd
        L_0x00cd:
            r0 = move-exception
            goto L_0x00d4
        L_0x00cf:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x00d5 }
            r0.<init>()     // Catch:{ all -> 0x00d5 }
        L_0x00d4:
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204239pg.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public C204239pg() {
        this.A00 = new AnonymousClass9Rc();
    }
}
