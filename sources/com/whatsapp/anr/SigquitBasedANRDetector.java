package com.whatsapp.anr;

import X.AnonymousClass11c;
import X.AnonymousClass11d;
import X.C21060yb;
import X.C21380z9;
import X.C21870zw;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.regex.Pattern;

public class SigquitBasedANRDetector {
    public HandlerThread A00;
    public Pattern A01;
    public Pattern A02;
    public String A03;
    public final AnonymousClass11c A04;
    public final AnonymousClass11d A05;
    public final C21380z9 A06;
    public final Object A07 = new Object();
    public final Object A08 = new Object();
    public volatile Handler A09;
    public volatile boolean A0A;
    public volatile boolean A0B;

    public static native void init(SigquitBasedANRDetector sigquitBasedANRDetector, int i);

    public static native boolean startDetector();

    public SigquitBasedANRDetector(AnonymousClass11c r4, C21060yb r5, C21380z9 r6) {
        int i = Build.VERSION.SDK_INT;
        AnonymousClass11d r1 = new AnonymousClass11d(r5);
        this.A04 = r4;
        this.A06 = r6;
        this.A05 = r1;
        init(this, i);
    }

    public static void A00(SigquitBasedANRDetector sigquitBasedANRDetector, String str) {
        if (Build.VERSION.SDK_INT < 33) {
            try {
                AnonymousClass11c r2 = sigquitBasedANRDetector.A04;
                StringBuilder sb = new StringBuilder();
                sb.append("sigquit_exitinfo_");
                sb.append(C21870zw.A00);
                r2.A02(str, sb.toString());
            } catch (IOException e) {
                Log.e("SigquitBasedANRDetector/failed-to-save-sigquit", e);
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
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
    public void anrDetected(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = android.os.Debug.isDebuggerConnected()
            if (r0 != 0) goto L_0x009e
            java.lang.String r4 = "SigquitBasedANRDetector"
            java.lang.String r0 = "On anrDetected call"
            android.util.Log.i(r4, r0)
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x009e
            java.util.regex.Pattern r0 = r5.A01
            if (r0 != 0) goto L_0x001f
            r1 = 8
            java.lang.String r0 = "^$^\\s*(\"main\".*?$\\s*\\|\\s+group=\"main\"(?s).*?$^\\s*$)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            r5.A01 = r0
        L_0x001f:
            java.util.regex.Matcher r1 = r0.matcher(r6)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x0064
            r0 = 1
            java.lang.String r2 = r1.group(r0)
            if (r2 == 0) goto L_0x0064
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ANR detected. Main thread: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r4, r0)
            java.util.regex.Pattern r0 = r5.A02
            if (r0 != 0) goto L_0x0052
            r1 = 8
            java.lang.String r0 = "^\\s*[ank#](?s).*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            r5.A02 = r0
        L_0x0052:
            java.util.regex.Matcher r1 = r0.matcher(r2)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x0064
            java.lang.String r3 = r1.group()
        L_0x0060:
            java.lang.Object r2 = r5.A07
            monitor-enter(r2)
            goto L_0x0066
        L_0x0064:
            r3 = 0
            goto L_0x0060
        L_0x0066:
            boolean r0 = r5.A0A     // Catch:{ all -> 0x009b }
            r1 = 1
            if (r0 == 0) goto L_0x007d
            if (r3 == 0) goto L_0x007b
            java.lang.String r0 = r5.A03     // Catch:{ all -> 0x009b }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x009b }
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = "Detected a new ANR before the end of the previous one"
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x009b }
            goto L_0x007f
        L_0x007b:
            r1 = 0
            goto L_0x007f
        L_0x007d:
            r5.A0A = r1     // Catch:{ all -> 0x009b }
        L_0x007f:
            r5.A03 = r3     // Catch:{ all -> 0x009b }
            monitor-exit(r2)     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x009e
            X.0z9 r1 = r5.A06
            java.util.HashSet r0 = r1.A00
            java.lang.String r2 = X.C21380z9.A00(r1, r0)
            android.os.Handler r0 = r5.A09
            if (r0 == 0) goto L_0x009e
            android.os.Handler r1 = r5.A09
            X.739 r0 = new X.739
            r0.<init>(r5, r6, r3, r2)
            r1.post(r0)
            return
        L_0x009b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x009b }
            throw r0
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.anr.SigquitBasedANRDetector.anrDetected(java.lang.String):void");
    }
}
