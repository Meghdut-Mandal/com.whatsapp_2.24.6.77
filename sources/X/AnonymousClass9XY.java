package X;

import android.app.Activity;

/* renamed from: X.9XY  reason: invalid class name */
public class AnonymousClass9XY {
    public boolean A00;
    public final Activity A01;
    public final C19700wN A02;
    public final AnonymousClass17Y A03;
    public final AnonymousClass4PI A04;
    public final AnonymousClass1NG A05;
    public final AnonymousClass3B0 A06;
    public final C64283Nj A07;
    public final AnonymousClass16I A08;
    public final C19420v0 A09;
    public final AnonymousClass12O A0A;
    public final C20500xf A0B;
    public final AnonymousClass19A A0C;
    public final Runnable A0D = new AVW(this, 33);
    public final Runnable A0E = new AVW(this, 34);
    public final boolean A0F;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A01(java.lang.String r8) {
        /*
            r7 = this;
            X.3B0 r3 = r7.A06
            com.whatsapp.jid.UserJid r6 = r3.A04
            boolean r5 = r3.A0A
            X.1NG r4 = r7.A05
            X.0wU r2 = r4.A0J
            r1 = 48
            X.1iz r0 = new X.1iz
            r0.<init>(r3, r4, r1)
            r2.Boy(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "blocklistresponsehandler/general_request_success jid="
            X.C36321k7.A1K(r6, r0, r1)
            r3 = 1
            r7.A00 = r3
            if (r5 == 0) goto L_0x0037
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass1NG.A01(r4, r6)
            monitor-enter(r4)
            java.util.Set r0 = r4.A0K     // Catch:{ all -> 0x005e }
            boolean r1 = r0.add(r6)     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x004b
            r0.add(r2)     // Catch:{ all -> 0x005e }
            goto L_0x004b
        L_0x0037:
            r3 = 0
            X.AnonymousClass00C.A0D(r6, r3)
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass1NG.A01(r4, r6)
            monitor-enter(r4)
            java.util.Set r0 = r4.A0K     // Catch:{ all -> 0x005e }
            boolean r1 = r0.remove(r6)     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x004b
            r0.remove(r2)     // Catch:{ all -> 0x005e }
        L_0x004b:
            monitor-exit(r4)
            if (r1 == 0) goto L_0x0056
            X.AnonymousClass1NG.A05(r4, r6, r8, r3)
            if (r2 == 0) goto L_0x0056
            X.AnonymousClass1NG.A05(r4, r2, r8, r3)
        L_0x0056:
            X.17Y r1 = r7.A03
            java.lang.Runnable r0 = r7.A0E
            r1.Bp3(r0)
            return
        L_0x005e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9XY.A01(java.lang.String):void");
    }

    public AnonymousClass9XY(Activity activity, C19700wN r4, AnonymousClass17Y r5, AnonymousClass4PI r6, AnonymousClass1NG r7, AnonymousClass3B0 r8, C64283Nj r9, AnonymousClass16I r10, C19420v0 r11, AnonymousClass12O r12, C20500xf r13, AnonymousClass19A r14, boolean z) {
        this.A01 = activity;
        this.A03 = r5;
        this.A02 = r4;
        this.A0B = r13;
        this.A0C = r14;
        this.A05 = r7;
        this.A08 = r10;
        this.A0A = r12;
        this.A09 = r11;
        this.A04 = r6;
        this.A0F = z;
        this.A06 = r8;
        this.A07 = r9;
    }

    public void A00(int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("blocklistresponsehandler/general_request_failed ");
        A0u.append(i);
        A0u.append(" | ");
        C36321k7.A1N(this.A06.A04, A0u);
        this.A03.Bp3(this.A0E);
    }
}
