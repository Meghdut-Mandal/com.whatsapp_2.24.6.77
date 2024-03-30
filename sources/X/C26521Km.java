package X;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: X.1Km  reason: invalid class name and case insensitive filesystem */
public final class C26521Km {
    public C1496071z A00;
    public final C19630wG A01;
    public final C19890wg A02;
    public final Set A03 = new HashSet();

    public C26521Km(C19630wG r2, C19890wg r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A01 = r2;
        this.A02 = r3;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void A01(java.lang.String r4, byte[] r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)     // Catch:{ all -> 0x0042 }
            r0 = 1
            X.AnonymousClass00C.A0D(r5, r0)     // Catch:{ all -> 0x0042 }
            X.71z r0 = r3.A00     // Catch:{ IOException -> 0x002b }
            if (r0 == 0) goto L_0x0040
            X.66k r1 = X.C1496071z.A00(r0, r4)     // Catch:{ IOException -> 0x002b }
            if (r1 == 0) goto L_0x0040
            X.5Qz r0 = r1.A00()     // Catch:{ IOException -> 0x002b }
            r0.write(r5)     // Catch:{ IOException -> 0x002b }
            r1.A01()     // Catch:{ IOException -> 0x002b }
            java.util.Set r1 = r3.A03     // Catch:{ IOException -> 0x002b }
            monitor-enter(r1)     // Catch:{ IOException -> 0x002b }
            r1.add(r4)     // Catch:{ all -> 0x0028 }
            A00(r3)     // Catch:{ all -> 0x0028 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x002b }
            goto L_0x0040
        L_0x0028:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x002b }
            throw r0     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0042 }
            r1.<init>()     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "FcsConfigDiskCache/writeToDisk: "
            r1.append(r0)     // Catch:{ all -> 0x0042 }
            r1.append(r2)     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0042 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r3)
            return
        L_0x0042:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26521Km.A01(java.lang.String, byte[]):void");
    }

    public static final void A00(C26521Km r3) {
        r3.A02.A00("phoenix").edit().putString("fcs_config_cache_key_set", new JSONArray(r3.A03).toString()).apply();
    }
}
