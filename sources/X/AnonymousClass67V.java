package X;

import java.util.Map;

/* renamed from: X.67V  reason: invalid class name */
public class AnonymousClass67V {
    public final int A00;
    public final int A01;
    public final C120875sE A02;
    public final Map A03;
    public volatile boolean A04 = false;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        r2 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r2 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2.A01.remove(r4.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r2 = X.C130126Jv.A02.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2.A01.remove(r4.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
        android.opengl.GLES20.glDeleteTextures(1, new int[]{r4.A00}, 0);
        r0 = X.AnonymousClass6UN.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.A04     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x0039 }
            return
        L_0x0007:
            r3 = 1
            r4.A04 = r3     // Catch:{ all -> 0x0039 }
            monitor-exit(r4)     // Catch:{ all -> 0x0039 }
            int[] r2 = new int[r3]
            int r1 = r4.A00
            r0 = 0
            r2[r0] = r1
            android.opengl.GLES20.glDeleteTextures(r3, r2, r0)
            X.6Xg r0 = X.AnonymousClass6UN.A00()
            if (r0 == 0) goto L_0x0028
            X.5oL r2 = r0.A05
            if (r2 == 0) goto L_0x0028
            monitor-enter(r2)
            java.util.Map r1 = r2.A01     // Catch:{ all -> 0x0036 }
            X.5sE r0 = r4.A02     // Catch:{ all -> 0x0036 }
            r1.remove(r0)     // Catch:{ all -> 0x0036 }
            monitor-exit(r2)
        L_0x0028:
            X.6Jv r0 = X.C130126Jv.A02
            X.5oL r2 = r0.A00
            monitor-enter(r2)
            java.util.Map r1 = r2.A01     // Catch:{ all -> 0x0036 }
            X.5sE r0 = r4.A02     // Catch:{ all -> 0x0036 }
            r1.remove(r0)     // Catch:{ all -> 0x0036 }
            monitor-exit(r2)
            return
        L_0x0036:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0039:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0039 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass67V.A00():void");
    }

    public void A01(int i, int i2) {
        C120875sE r0 = this.A02;
        r0.A01 = i;
        r0.A00 = i2;
    }

    /* JADX INFO: finally extract failed */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public AnonymousClass67V(X.C124085xZ r8) {
        /*
            r7 = this;
            r7.<init>()
            r4 = 0
            r7.A04 = r4
            java.util.HashMap r5 = X.AnonymousClass001.A0J()
            r3 = 0
        L_0x000b:
            android.util.SparseIntArray r2 = r8.A06
            int r0 = r2.size()
            if (r3 >= r0) goto L_0x0025
            int r0 = r2.keyAt(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r2.valueAt(r3)
            X.C36341k9.A1K(r1, r5, r0)
            int r3 = r3 + 1
            goto L_0x000b
        L_0x0025:
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r5)
            r7.A03 = r3
            int r2 = r8.A01
            r7.A01 = r2
            android.graphics.Bitmap r6 = r8.A03
            r1 = 1
            int[] r0 = new int[r1]
            android.opengl.GLES20.glGenTextures(r1, r0, r4)
            r0 = r0[r4]
            r7.A00 = r0
            android.opengl.GLES20.glBindTexture(r2, r0)     // Catch:{ all -> 0x00bb }
            java.util.Iterator r5 = X.AnonymousClass000.A0y(r3)     // Catch:{ all -> 0x00bb }
        L_0x0042:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x0062
            java.util.Map$Entry r3 = X.AnonymousClass000.A11(r5)     // Catch:{ all -> 0x00bb }
            int r2 = r7.A01     // Catch:{ all -> 0x00bb }
            java.lang.Object r0 = r3.getKey()     // Catch:{ all -> 0x00bb }
            int r1 = X.C90514aH.A0H(r0)     // Catch:{ all -> 0x00bb }
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x00bb }
            int r0 = X.C90514aH.A0H(r0)     // Catch:{ all -> 0x00bb }
            android.opengl.GLES20.glTexParameteri(r2, r1, r0)     // Catch:{ all -> 0x00bb }
            goto L_0x0042
        L_0x0062:
            if (r6 == 0) goto L_0x0072
            int r0 = r7.A01     // Catch:{ all -> 0x00bb }
            android.opengl.GLUtils.texImage2D(r0, r4, r6, r4)     // Catch:{ all -> 0x00bb }
            int r3 = r6.getWidth()     // Catch:{ all -> 0x00bb }
            int r2 = r6.getHeight()     // Catch:{ all -> 0x00bb }
            goto L_0x0076
        L_0x0072:
            int r3 = r8.A02     // Catch:{ all -> 0x00bb }
            int r2 = r8.A00     // Catch:{ all -> 0x00bb }
        L_0x0076:
            int r0 = r7.A01
            android.opengl.GLES20.glBindTexture(r0, r4)
            boolean r1 = r8.A05
            X.5sE r0 = new X.5sE
            r0.<init>(r3, r2, r1)
            r7.A02 = r0
            X.6Xg r3 = X.AnonymousClass6UN.A00()
            if (r3 == 0) goto L_0x009b
            X.5oL r2 = r3.A05
            if (r2 == 0) goto L_0x009b
            X.6Jv r1 = X.C130126Jv.A02
            monitor-enter(r1)
            java.util.Set r0 = r1.A01     // Catch:{ all -> 0x0098 }
            boolean r0 = r0.contains(r2)     // Catch:{ all -> 0x0098 }
            goto L_0x00a0
        L_0x0098:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x009b:
            X.6Jv r0 = X.C130126Jv.A02
            X.5oL r3 = r0.A00
            goto L_0x00a5
        L_0x00a0:
            monitor-exit(r1)
            if (r0 == 0) goto L_0x009b
            X.5oL r3 = r3.A05
        L_0x00a5:
            monitor-enter(r3)
            java.lang.ref.WeakReference r2 = X.AnonymousClass001.A0F(r7)     // Catch:{ all -> 0x00b8 }
            monitor-enter(r3)     // Catch:{ all -> 0x00b8 }
            java.util.Map r1 = r3.A01     // Catch:{ all -> 0x00b5 }
            X.5sE r0 = r7.A02     // Catch:{ all -> 0x00b5 }
            r1.put(r0, r2)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r3)     // Catch:{ all -> 0x00b8 }
            monitor-exit(r3)
            return
        L_0x00b5:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00b8 }
            throw r0     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00bb:
            r1 = move-exception
            int r0 = r7.A01
            android.opengl.GLES20.glBindTexture(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass67V.<init>(X.5xZ):void");
    }
}
