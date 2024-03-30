package X;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.9pc  reason: invalid class name and case insensitive filesystem */
public class C204199pc implements Camera.OnZoomChangeListener {
    public int A00;
    public int A01;
    public int A02;
    public Camera A03;
    public final Handler A04 = new Handler(Looper.getMainLooper(), new C23167B8b(this, 0));
    public final AnonymousClass9WX A05;
    public final AnonymousClass9VB A06 = new AnonymousClass9VB();
    public final C200199gr A07;
    public final Callable A08 = new B8U((Object) this, 5);
    public volatile int A09;
    public volatile List A0A;
    public volatile boolean A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public void A00(int r5) {
        /*
            r4 = this;
            r3 = r4
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x0077
            int r0 = r4.A09
            if (r5 == r0) goto L_0x0077
            int r0 = r4.A01
            if (r5 > r0) goto L_0x0077
            if (r5 < 0) goto L_0x0077
            boolean r0 = X.C202399lk.A02()
            if (r0 != 0) goto L_0x0070
            boolean r0 = r4.A0E
            if (r0 == 0) goto L_0x003b
            monitor-enter(r3)
            r4.A02 = r5     // Catch:{ all -> 0x006d }
            boolean r0 = r4.A0C     // Catch:{ all -> 0x006d }
            r1 = 1
            if (r0 == 0) goto L_0x0030
            boolean r0 = r4.A0D     // Catch:{ all -> 0x006d }
            if (r0 != 0) goto L_0x006b
            r4.A0D = r1     // Catch:{ all -> 0x006d }
            android.hardware.Camera r0 = r4.A03     // Catch:{ all -> 0x006d }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x006d }
            r0.stopSmoothZoom()     // Catch:{ all -> 0x006d }
            goto L_0x006b
        L_0x0030:
            r4.A0C = r1     // Catch:{ all -> 0x006d }
            android.hardware.Camera r0 = r4.A03     // Catch:{ all -> 0x006d }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x006d }
            r0.startSmoothZoom(r5)     // Catch:{ all -> 0x006d }
            goto L_0x006b
        L_0x003b:
            X.9WX r1 = r4.A05     // Catch:{ Exception -> 0x0055 }
            int r0 = r4.A00     // Catch:{ Exception -> 0x0055 }
            X.88o r1 = r1.A00(r0)     // Catch:{ Exception -> 0x0055 }
            X.9Cj r0 = X.C201049ih.A0z     // Catch:{ Exception -> 0x0055 }
            X.C191299Ck.A02(r0, r1, r5)     // Catch:{ Exception -> 0x0055 }
            r1.A02()     // Catch:{ Exception -> 0x0055 }
            r1 = 1
            android.hardware.Camera r0 = r4.A03     // Catch:{ Exception -> 0x0055 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ Exception -> 0x0055 }
            r4.onZoomChange(r5, r1, r0)     // Catch:{ Exception -> 0x0055 }
            return
        L_0x0055:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Failed to set zoom level to: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r5)
            java.lang.RuntimeException r2 = X.C90524aI.A0e(r0, r2)
            monitor-enter(r3)
            android.os.Handler r1 = r4.A04     // Catch:{ all -> 0x006d }
            r0 = 2
            X.AnonymousClass000.A14(r1, r2, r0)     // Catch:{ all -> 0x006d }
        L_0x006b:
            monitor-exit(r3)
            return
        L_0x006d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0070:
            java.lang.String r0 = "Attempting to zoom on the UI thread!"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204199pc.A00(int):void");
    }

    public synchronized void onZoomChange(int i, boolean z, Camera camera) {
        this.A09 = i;
        int i2 = 0;
        if (this.A0E) {
            this.A0C = AnonymousClass000.A1Q(z ? 1 : 0);
            if (z) {
                this.A0D = false;
                if (this.A0B && this.A02 != i) {
                    this.A07.A07("update_zoom_level", this.A08);
                }
            }
        }
        Handler handler = this.A04;
        if (z) {
            i2 = 1;
        }
        handler.sendMessage(handler.obtainMessage(1, i, i2));
    }

    public C204199pc(AnonymousClass9WX r4, C200199gr r5) {
        this.A05 = r4;
        this.A07 = r5;
    }
}
