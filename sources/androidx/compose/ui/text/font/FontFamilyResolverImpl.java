package androidx.compose.ui.text.font;

import X.AnonymousClass6JE;
import X.C006302t;
import X.C008903u;
import X.C113615fp;
import X.C118395np;
import X.C154207Rh;
import X.C157027bi;
import X.C157037bj;
import X.C161207mN;
import X.C65183Rb;

public final class FontFamilyResolverImpl implements C157027bi {
    public final C65183Rb A00;
    public final AnonymousClass6JE A01;
    public final C157037bj A02;
    public final C161207mN A03;
    public final C118395np A04;
    public final C006302t A05 = new C154207Rh(this);

    public /* synthetic */ FontFamilyResolverImpl(C157037bj r5, C161207mN r6) {
        C118395np r3 = C113615fp.A01;
        C65183Rb r1 = new C65183Rb(C113615fp.A00, C008903u.A00);
        AnonymousClass6JE r0 = new AnonymousClass6JE();
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r3;
        this.A00 = r1;
        this.A01 = r0;
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
    public static final X.C161527n3 A00(androidx.compose.ui.text.font.FontFamilyResolverImpl r6, X.C128416Ce r7) {
        /*
            X.5np r5 = r6.A04
            X.7Tw r4 = new X.7Tw
            r4.<init>(r6, r7)
            X.5XY r3 = r5.A01
            monitor-enter(r3)
            X.6El r2 = r5.A00     // Catch:{ all -> 0x0036 }
            java.lang.Object r1 = r2.A01(r7)     // Catch:{ all -> 0x0036 }
            X.7n3 r1 = (X.C161527n3) r1     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0034
            monitor-exit(r3)
            X.7Tx r0 = new X.7Tx     // Catch:{ Exception -> 0x002b }
            r0.<init>(r7, r5)     // Catch:{ Exception -> 0x002b }
            java.lang.Object r1 = r4.invoke(r0)     // Catch:{ Exception -> 0x002b }
            X.7n3 r1 = (X.C161527n3) r1     // Catch:{ Exception -> 0x002b }
            monitor-enter(r3)
            java.lang.Object r0 = r2.A01(r7)     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0034
            r2.A02(r7, r1)     // Catch:{ all -> 0x0036 }
            goto L_0x0034
        L_0x002b:
            r2 = move-exception
            java.lang.String r1 = "Could not load font"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x0034:
            monitor-exit(r3)
            return r1
        L_0x0036:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.FontFamilyResolverImpl.A00(androidx.compose.ui.text.font.FontFamilyResolverImpl, X.6Ce):X.7n3");
    }
}
