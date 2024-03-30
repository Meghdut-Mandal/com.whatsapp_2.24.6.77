package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.8gd  reason: invalid class name and case insensitive filesystem */
public abstract class C178498gd extends AIB {
    public int A00;
    public AF7 A01;
    public AnonymousClass5GM A02;
    public String A03;
    public final AnonymousClass9YX A04;
    public final String A05;

    public C178498gd(Context context, AnonymousClass17Y r2, C29221Vu r3, AnonymousClass9YX r4, AF7 af7, AnonymousClass5GM r6, String str, String str2, int i) {
        super(context, r3, r2);
        this.A05 = str;
        this.A04 = r4;
        this.A01 = af7;
        this.A00 = i;
        this.A03 = str2;
        this.A02 = r6;
    }

    public static String A01(String str, String str2, String str3, String str4, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(" seqNumPrefix: ");
        sb.append(str3);
        sb.append(" bindID: ");
        return C200449hQ.A01(str4);
    }

    public void A05(C202059ky r5) {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PAY: onRequestError action: ");
        String str2 = this.A05;
        A0u.append(str2);
        C36321k7.A1K(r5, " error: ", A0u);
        AF7 af7 = this.A01;
        if (af7 != null) {
            af7.A07(r5, this.A00, 1);
        }
        AnonymousClass9YX r1 = this.A04;
        if (r1 != null) {
            r1.A04(str2, r5.A00);
        }
        AnonymousClass5GM r12 = this.A02;
        if (r12 != null && (str = this.A03) != null) {
            r12.A03(r5, str);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A06(X.C202059ky r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: onResponseError action: "
            r1.append(r0)
            java.lang.String r4 = r5.A05
            r1.append(r4)
            java.lang.String r0 = " error: "
            X.C36321k7.A1K(r6, r0, r1)
            X.AF7 r2 = r5.A01
            if (r2 == 0) goto L_0x001d
            int r1 = r5.A00
            r0 = 1
            r2.A07(r6, r1, r0)
        L_0x001d:
            X.5GM r1 = r5.A02
            if (r1 == 0) goto L_0x0028
            java.lang.String r0 = r5.A03
            if (r0 == 0) goto L_0x0028
            r1.A03(r6, r0)
        L_0x0028:
            X.9YX r3 = r5.A04
            if (r3 == 0) goto L_0x0082
            int r0 = r6.A00
            r3.A04(r4, r0)
            int r4 = r6.A00
            r0 = 403(0x193, float:5.65E-43)
            if (r4 == r0) goto L_0x006b
            r0 = 405(0x195, float:5.68E-43)
            if (r4 == r0) goto L_0x006b
            r0 = 406(0x196, float:5.69E-43)
            if (r4 == r0) goto L_0x006b
            r0 = 426(0x1aa, float:5.97E-43)
            if (r4 == r0) goto L_0x006b
            r0 = 460(0x1cc, float:6.45E-43)
            if (r4 == r0) goto L_0x006b
            r0 = 410(0x19a, float:5.75E-43)
            if (r4 == r0) goto L_0x006b
            r0 = 409(0x199, float:5.73E-43)
            if (r4 == r0) goto L_0x006b
            r0 = 2826008(0x2b1f18, float:3.96008E-39)
            if (r4 == r0) goto L_0x006b
            r0 = 440(0x1b8, float:6.17E-43)
            if (r4 != r0) goto L_0x0082
            monitor-enter(r3)
            r3.A02 = r4     // Catch:{ all -> 0x007e }
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.A07     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "tos-"
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r4)     // Catch:{ all -> 0x007e }
            r2.add(r0)     // Catch:{ all -> 0x007e }
            goto L_0x0081
        L_0x006b:
            monitor-enter(r3)
            r3.A01 = r4     // Catch:{ all -> 0x007e }
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.A07     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "payability-"
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r4)     // Catch:{ all -> 0x007e }
            r2.add(r0)     // Catch:{ all -> 0x007e }
            goto L_0x0081
        L_0x007e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0081:
            monitor-exit(r3)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178498gd.A06(X.9ky):void");
    }

    public void A07(C203399nx r6) {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PAY: onResponseSuccess for op: action: ");
        String str2 = this.A05;
        C36321k7.A1a(A0u, str2);
        AF7 af7 = this.A01;
        if (af7 != null) {
            af7.A07((C202059ky) null, this.A00, 2);
        }
        AnonymousClass5GM r0 = this.A02;
        if (!(r0 == null || (str = this.A03) == null)) {
            Map map = r0.A03.A03;
            C21700zf r02 = (C21700zf) map.get(str);
            if (r02 != null) {
                r02.A0C(2);
                map.remove(str);
            }
        }
        AnonymousClass9YX r03 = this.A04;
        if (r03 != null) {
            r03.A03(str2);
        }
    }

    public C178498gd(Context context, AnonymousClass17Y r3, C29221Vu r4, AnonymousClass9YX r5, AF7 af7, String str, int i) {
        super(context, r4, r3);
        this.A03 = null;
        this.A02 = null;
        this.A05 = str;
        this.A04 = r5;
        this.A01 = af7;
        this.A00 = i;
    }

    public C178498gd(Context context, AnonymousClass17Y r4, C29221Vu r5, AnonymousClass9YX r6, String str) {
        super(context, r5, r4);
        this.A01 = null;
        this.A00 = 0;
        this.A03 = null;
        this.A02 = null;
        this.A05 = str;
        this.A04 = r6;
    }
}
