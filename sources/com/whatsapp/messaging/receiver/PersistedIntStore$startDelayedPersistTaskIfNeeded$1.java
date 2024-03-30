package com.whatsapp.messaging.receiver;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C130436Lb;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.receiver.PersistedIntStore$startDelayedPersistTaskIfNeeded$1", f = "PersistedIntStore.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
public final class PersistedIntStore$startDelayedPersistTaskIfNeeded$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C130436Lb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersistedIntStore$startDelayedPersistTaskIfNeeded$1(C130436Lb r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new PersistedIntStore$startDelayedPersistTaskIfNeeded$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new PersistedIntStore$startDelayedPersistTaskIfNeeded$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r7.label
            r2 = 1
            if (r0 == 0) goto L_0x0011
            if (r0 != r2) goto L_0x008a
            X.AnonymousClass0AN.A00(r8)
        L_0x000c:
            X.6Lb r6 = r7.this$0
            monitor-enter(r6)
            r1 = 0
            goto L_0x0021
        L_0x0011:
            X.AnonymousClass0AN.A00(r8)
            X.6Lb r0 = r7.this$0
            long r0 = r0.A04
            r7.label = r2
            java.lang.Object r0 = X.C07330Xf.A00(r7, r0)
            if (r0 != r3) goto L_0x000c
            return r3
        L_0x0021:
            r6.A03 = r1     // Catch:{ all -> 0x0087 }
            boolean r0 = r6.A02     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0083
            r6.A02 = r1     // Catch:{ all -> 0x0087 }
            java.util.LinkedHashSet r0 = r6.A00     // Catch:{ all -> 0x0087 }
            int[] r2 = X.C007103b.A0m(r0)     // Catch:{ all -> 0x0087 }
            monitor-exit(r6)
            int r1 = r2.length
            android.content.SharedPreferences r0 = r6.A05
            if (r1 != 0) goto L_0x0044
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "key"
            android.content.SharedPreferences$Editor r5 = r1.remove(r0)
        L_0x003f:
            r5.commit()
            monitor-enter(r6)
            goto L_0x0080
        L_0x0044:
            android.content.SharedPreferences$Editor r5 = r0.edit()
            X.AnonymousClass00C.A08(r5)
            java.lang.String r4 = "key"
            int r0 = r1 * 4
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            java.nio.IntBuffer r0 = r1.asIntBuffer()
            r0.put(r2)
            byte[] r3 = r1.array()
            r2 = 0
            if (r3 == 0) goto L_0x007e
            java.lang.String r0 = android.util.Base64.encodeToString(r3, r2)
            X.AnonymousClass00C.A08(r0)
            java.lang.String r1 = X.C36371kC.A0y(r0)
        L_0x006c:
            java.lang.String r0 = android.util.Base64.encodeToString(r3, r2)
            X.AnonymousClass00C.A08(r0)
            java.lang.CharSequence r0 = X.AnonymousClass099.A0D(r0)
            r0.toString()
            r5.putString(r4, r1)
            goto L_0x003f
        L_0x007e:
            r1 = 0
            goto L_0x006c
        L_0x0080:
            X.C130436Lb.A00(r6)     // Catch:{ all -> 0x0087 }
        L_0x0083:
            monitor-exit(r6)
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0087:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x008a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.receiver.PersistedIntStore$startDelayedPersistTaskIfNeeded$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
