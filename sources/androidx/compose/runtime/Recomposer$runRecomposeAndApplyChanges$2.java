package androidx.compose.runtime;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C019408g;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {540, 551}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "alreadyComposed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"})
public final class Recomposer$runRecomposeAndApplyChanges$2 extends AnonymousClass0A1 implements C019408g {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public int label;
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, C023509x r3) {
        super(3, r3);
        this.this$0 = recomposer;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, (C023509x) obj3);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = obj2;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: type inference failed for: r12v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0121  */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            X.0AO r11 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r10 = r21
            int r2 = r10.label
            r1 = 2
            if (r2 == 0) goto L_0x008b
            r0 = 1
            if (r2 == r0) goto L_0x00f6
            if (r2 != r1) goto L_0x0151
            java.lang.Object r9 = r10.L$7
            X.76f r9 = (X.C1506876f) r9
            java.lang.Object r8 = r10.L$6
            X.76f r8 = (X.C1506876f) r8
            java.lang.Object r7 = r10.L$5
            java.util.Set r7 = (java.util.Set) r7
            java.lang.Object r6 = r10.L$4
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r5 = r10.L$3
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r10.L$2
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r10.L$1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r10.L$0
            X.7oJ r2 = (X.C162267oJ) r2
            X.AnonymousClass0AN.A00(r22)
        L_0x0031:
            androidx.compose.runtime.Recomposer r13 = r10.this$0
            X.05L r0 = androidx.compose.runtime.Recomposer.A0M
            java.lang.Object r0 = r13.A0C
            r19 = r0
            monitor-enter(r19)
            java.util.Map r1 = r13.A0I     // Catch:{ all -> 0x014e }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x014e }
            r0 = r0 ^ 1
            r14 = 0
            if (r0 == 0) goto L_0x007c
            java.util.Collection r0 = r1.values()     // Catch:{ all -> 0x014e }
            java.util.ArrayList r18 = X.AnonymousClass03U.A07(r0)     // Catch:{ all -> 0x014e }
            r1.clear()     // Catch:{ all -> 0x014e }
            java.util.ArrayList r12 = X.C36401kF.A0v(r18)     // Catch:{ all -> 0x014e }
            int r17 = r18.size()     // Catch:{ all -> 0x014e }
            r1 = 0
        L_0x0059:
            r0 = r17
            if (r1 >= r0) goto L_0x0076
            r0 = r18
            r0.get(r1)     // Catch:{ all -> 0x014e }
            r16 = 0
            java.util.Map r0 = r13.A0H     // Catch:{ all -> 0x014e }
            r15 = r0
            r0 = r16
            java.lang.Object r0 = r15.get(r0)     // Catch:{ all -> 0x014e }
            r15 = r0
            r0 = r16
            X.C90494aF.A1F(r0, r15, r12)     // Catch:{ all -> 0x014e }
            int r1 = r1 + 1
            goto L_0x0059
        L_0x0076:
            java.util.Map r0 = r13.A0H     // Catch:{ all -> 0x014e }
            r0.clear()     // Catch:{ all -> 0x014e }
            goto L_0x007e
        L_0x007c:
            X.09w r12 = X.C023409w.A00     // Catch:{ all -> 0x014e }
        L_0x007e:
            monitor-exit(r19)
            int r0 = r12.size()
        L_0x0083:
            if (r14 >= r0) goto L_0x00b0
            r12.get(r14)
            int r14 = r14 + 1
            goto L_0x0083
        L_0x008b:
            X.AnonymousClass0AN.A00(r22)
            java.lang.Object r2 = r10.L$0
            X.7oJ r2 = (X.C162267oJ) r2
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.LinkedHashSet r6 = X.C36441kJ.A17()
            java.util.LinkedHashSet r7 = X.C36441kJ.A17()
            X.76f r8 = new X.76f
            r8.<init>()
            X.76f r9 = new X.76f
            r9.<init>()
        L_0x00b0:
            androidx.compose.runtime.Recomposer r0 = r10.this$0
            java.lang.Object r0 = r0.A0C
            monitor-enter(r0)
            monitor-exit(r0)
            androidx.compose.runtime.Recomposer r14 = r10.this$0
            r10.L$0 = r2
            r10.L$1 = r3
            r10.L$2 = r4
            r10.L$3 = r5
            r10.L$4 = r6
            r10.L$5 = r7
            r10.L$6 = r8
            r10.L$7 = r9
            r0 = 1
            r10.label = r0
            boolean r0 = androidx.compose.runtime.Recomposer.A05(r14)
            if (r0 != 0) goto L_0x00f1
            X.0AR r13 = X.AnonymousClass0AA.A02(r10)
            r12 = r13
            java.lang.Object r1 = r14.A0C
            monitor-enter(r1)
            boolean r0 = androidx.compose.runtime.Recomposer.A05(r14)     // Catch:{ all -> 0x0156 }
            if (r0 != 0) goto L_0x00e2
            r14.A05 = r13     // Catch:{ all -> 0x0156 }
            r12 = 0
        L_0x00e2:
            monitor-exit(r1)
            if (r12 == 0) goto L_0x00ea
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            r12.resumeWith(r0)
        L_0x00ea:
            java.lang.Object r0 = r13.A0G()
            if (r0 != r11) goto L_0x00f1
            goto L_0x00f3
        L_0x00f1:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
        L_0x00f3:
            if (r0 != r11) goto L_0x0119
            return r11
        L_0x00f6:
            java.lang.Object r9 = r10.L$7
            X.76f r9 = (X.C1506876f) r9
            java.lang.Object r8 = r10.L$6
            X.76f r8 = (X.C1506876f) r8
            java.lang.Object r7 = r10.L$5
            java.util.Set r7 = (java.util.Set) r7
            java.lang.Object r6 = r10.L$4
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r5 = r10.L$3
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r10.L$2
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r10.L$1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r10.L$0
            X.7oJ r2 = (X.C162267oJ) r2
            X.AnonymousClass0AN.A00(r22)
        L_0x0119:
            androidx.compose.runtime.Recomposer r0 = r10.this$0
            boolean r0 = androidx.compose.runtime.Recomposer.A06(r0)
            if (r0 == 0) goto L_0x00b0
            androidx.compose.runtime.Recomposer r13 = r10.this$0
            X.7Vf r12 = new X.7Vf
            r18 = r5
            r19 = r6
            r20 = r7
            r15 = r9
            r16 = r3
            r17 = r4
            r14 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r10.L$0 = r2
            r10.L$1 = r3
            r10.L$2 = r4
            r10.L$3 = r5
            r10.L$4 = r6
            r10.L$5 = r7
            r10.L$6 = r8
            r10.L$7 = r9
            r0 = 2
            r10.label = r0
            java.lang.Object r0 = r2.BxV(r10, r12)
            if (r0 != r11) goto L_0x0031
            return r11
        L_0x014e:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        L_0x0151:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0156:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
