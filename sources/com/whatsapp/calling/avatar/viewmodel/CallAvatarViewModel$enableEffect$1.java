package com.whatsapp.calling.avatar.viewmodel;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C110285aQ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$enableEffect$1", f = "CallAvatarViewModel.kt", i = {0, 1}, l = {744, 752, 762}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
public final class CallAvatarViewModel$enableEffect$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $productSessionId;
    public final /* synthetic */ boolean $shouldApplyLoadingState;
    public final /* synthetic */ C110285aQ $stateBeforeEnabling;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CallAvatarViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallAvatarViewModel$enableEffect$1(CallAvatarViewModel callAvatarViewModel, C110285aQ r3, String str, C023509x r5, boolean z) {
        super(2, r5);
        this.this$0 = callAvatarViewModel;
        this.$shouldApplyLoadingState = z;
        this.$productSessionId = str;
        this.$stateBeforeEnabling = r3;
    }

    public final C023509x create(Object obj, C023509x r8) {
        CallAvatarViewModel callAvatarViewModel = this.this$0;
        boolean z = this.$shouldApplyLoadingState;
        CallAvatarViewModel$enableEffect$1 callAvatarViewModel$enableEffect$1 = new CallAvatarViewModel$enableEffect$1(callAvatarViewModel, this.$stateBeforeEnabling, this.$productSessionId, r8, z);
        callAvatarViewModel$enableEffect$1.L$0 = obj;
        return callAvatarViewModel$enableEffect$1;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r2 = r18
            X.0AO r7 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r5 = r17
            int r0 = r5.label
            r8 = 3
            r9 = 2
            r4 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 == r6) goto L_0x0020
            if (r0 == r9) goto L_0x001b
            if (r0 != r8) goto L_0x0016
            goto L_0x009e
        L_0x0016:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x001b:
            java.lang.Object r3 = r5.L$0
            X.040 r3 = (X.AnonymousClass040) r3
            goto L_0x0053
        L_0x0020:
            java.lang.Object r3 = r5.L$0
            X.040 r3 = (X.AnonymousClass040) r3
            goto L_0x003b
        L_0x0025:
            X.AnonymousClass0AN.A00(r2)
            java.lang.Object r3 = r5.L$0
            X.040 r3 = (X.AnonymousClass040) r3
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            X.1hi r2 = r0.A0F     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            boolean r1 = r5.$shouldApplyLoadingState     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            X.52R r0 = new X.52R     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            r0.<init>(r1)     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            r2.A0D(r0)     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            goto L_0x003e
        L_0x003b:
            X.AnonymousClass0AN.A00(r2)     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
        L_0x003e:
            X.17Z r0 = X.AnonymousClass17Z.$redex_init_class     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            com.whatsapp.calling.avatar.data.FetchAvatarEffectUseCase r2 = r0.A0B     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            java.lang.String r1 = r5.$productSessionId     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            X.5lN r0 = r0.A0C     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            r5.L$0 = r3     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            r5.label = r9     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            java.lang.Object r2 = r2.A02(r0, r1, r5)     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            if (r2 != r7) goto L_0x0056
            return r7
        L_0x0053:
            X.AnonymousClass0AN.A00(r2)     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
        L_0x0056:
            X.6Dc r2 = (X.C128656Dc) r2     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            X.5lM r1 = r0.A09     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            X.1XW r0 = r1.A00     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            X.6OQ r1 = r0.A00()     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            X.5vm r10 = r2.A00     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            java.lang.String r13 = r2.A03     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            java.lang.String r14 = r2.A05     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            java.lang.String r15 = r2.A04     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            java.lang.String r0 = r2.A06     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            r12 = 0
            if (r1 == 0) goto L_0x009b
            X.6c7 r11 = r1.A04     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            X.6c7 r12 = r1.A02     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
        L_0x0077:
            X.6Dc r9 = new X.6Dc     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            X.1hi r1 = r0.A0F     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            X.52N r0 = X.AnonymousClass52N.A00     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            r1.A0D(r0)     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r2 = r5.this$0     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            com.whatsapp.calling.avatar.camera.InitializeAvatarEffectUseCase r1 = r2.A08     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            X.5pf r0 = new X.5pf     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            r0.<init>(r2, r3)     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            r5.L$0 = r4     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            r5.label = r8     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            java.lang.Object r0 = r1.A00(r0, r9, r5)     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            if (r0 != r7) goto L_0x00a1
            goto L_0x009d
        L_0x009b:
            r11 = r4
            goto L_0x0077
        L_0x009d:
            return r7
        L_0x009e:
            X.AnonymousClass0AN.A00(r2)     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
        L_0x00a1:
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            X.6WJ r3 = r0.A06     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            monitor-enter(r3)     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            X.58r r9 = r3.A01     // Catch:{ all -> 0x00fe }
            if (r9 == 0) goto L_0x00ef
            X.5TV r0 = X.AnonymousClass5TV.EFFECT_ENABLED     // Catch:{ all -> 0x00fe }
            boolean r0 = X.AnonymousClass6WJ.A03(r0, r9)     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x00ef
            X.0wo r0 = r3.A02     // Catch:{ all -> 0x00fe }
            long r7 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x00fe }
            java.lang.Long r0 = r9.A0F     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x00e5
            long r0 = r0.longValue()     // Catch:{ all -> 0x00fe }
            long r7 = r7 - r0
            java.lang.Long r0 = r9.A0E     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x00e0
            long r1 = r0.longValue()     // Catch:{ all -> 0x00fe }
            long r7 = r7 - r1
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x00fe }
            r9.A0D = r0     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x00ea
            long r1 = r1 + r7
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x00fe }
            r9.A0G = r0     // Catch:{ all -> 0x00fe }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00fe }
            r9.A03 = r0     // Catch:{ all -> 0x00fe }
            goto L_0x00ef
        L_0x00e0:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()     // Catch:{ all -> 0x00fe }
            goto L_0x00ee
        L_0x00e5:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()     // Catch:{ all -> 0x00fe }
            goto L_0x00ee
        L_0x00ea:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()     // Catch:{ all -> 0x00fe }
        L_0x00ee:
            throw r0     // Catch:{ all -> 0x00fe }
        L_0x00ef:
            monitor-exit(r3)     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            X.1hi r1 = r0.A0F     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            X.52Q r0 = new X.52Q     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            r0.<init>(r6)     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            r1.A0D(r0)     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            goto L_0x0190
        L_0x00fe:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
            throw r0     // Catch:{ CancellationException -> 0x0197, 78i -> 0x0115, all -> 0x0101 }
        L_0x0101:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = "voip/CallAvatarViewModel/enableEffect Unexpected error occurred="
            X.C36321k7.A1J(r2, r0, r1)     // Catch:{ all -> 0x01ae }
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0     // Catch:{ all -> 0x01ae }
            X.6WJ r1 = r0.A06     // Catch:{ all -> 0x01ae }
            r0 = 99
            r1.A05(r0)     // Catch:{ all -> 0x01ae }
            throw r2     // Catch:{ all -> 0x01ae }
        L_0x0115:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = "voip/CallAvatarViewModel/enableEffect Error occurred="
            X.C36321k7.A1J(r2, r0, r1)     // Catch:{ all -> 0x01ae }
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0     // Catch:{ all -> 0x01ae }
            X.6WJ r1 = r0.A06     // Catch:{ all -> 0x01ae }
            X.52C r0 = X.AnonymousClass52C.A00     // Catch:{ all -> 0x01ae }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x01ae }
            r3 = 1
            if (r0 != 0) goto L_0x016c
            X.52A r0 = X.AnonymousClass52A.A00     // Catch:{ all -> 0x01ae }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x01ae }
            if (r0 != 0) goto L_0x016c
            boolean r0 = r2 instanceof X.AnonymousClass526     // Catch:{ all -> 0x01ae }
            if (r0 != 0) goto L_0x016d
            X.52B r0 = X.AnonymousClass52B.A00     // Catch:{ all -> 0x01ae }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x01ae }
            if (r0 != 0) goto L_0x016a
            boolean r0 = r2 instanceof X.AnonymousClass525     // Catch:{ all -> 0x01ae }
            if (r0 != 0) goto L_0x016a
            X.529 r0 = X.AnonymousClass529.A00     // Catch:{ all -> 0x01ae }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x01ae }
            if (r0 == 0) goto L_0x014f
            r3 = 10
            goto L_0x016d
        L_0x014f:
            X.527 r0 = X.AnonymousClass527.A00     // Catch:{ all -> 0x01ae }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x01ae }
            if (r0 == 0) goto L_0x015a
            r3 = 11
            goto L_0x016d
        L_0x015a:
            X.528 r0 = X.AnonymousClass528.A00     // Catch:{ all -> 0x01ae }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x01ae }
            if (r0 == 0) goto L_0x0165
            r3 = 99
            goto L_0x016d
        L_0x0165:
            X.0jS r0 = X.C36441kJ.A18()     // Catch:{ all -> 0x01ae }
            throw r0     // Catch:{ all -> 0x01ae }
        L_0x016a:
            r3 = 7
            goto L_0x016d
        L_0x016c:
            r3 = 2
        L_0x016d:
            r1.A05(r3)     // Catch:{ all -> 0x01ae }
            X.5aQ r1 = r5.$stateBeforeEnabling     // Catch:{ all -> 0x01ae }
            boolean r0 = r1 instanceof X.AnonymousClass52M     // Catch:{ all -> 0x01ae }
            r7 = 0
            if (r0 == 0) goto L_0x0180
            X.52M r1 = (X.AnonymousClass52M) r1     // Catch:{ all -> 0x01ae }
            X.5aP r0 = r1.A00     // Catch:{ all -> 0x01ae }
            boolean r0 = r0 instanceof X.AnonymousClass52I     // Catch:{ all -> 0x01ae }
            r3 = 1
            if (r0 != 0) goto L_0x0181
        L_0x0180:
            r3 = 0
        L_0x0181:
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0     // Catch:{ all -> 0x01ae }
            X.1hi r1 = r0.A0F     // Catch:{ all -> 0x01ae }
            if (r3 == 0) goto L_0x0188
            r7 = 1
        L_0x0188:
            X.52S r0 = new X.52S     // Catch:{ all -> 0x01ae }
            r0.<init>(r2, r7, r6)     // Catch:{ all -> 0x01ae }
            r1.A0D(r0)     // Catch:{ all -> 0x01ae }
        L_0x0190:
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0
            r0.A01 = r4
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0197:
            r7 = move-exception
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0     // Catch:{ all -> 0x01ae }
            X.1hi r3 = r0.A0F     // Catch:{ all -> 0x01ae }
            boolean r0 = r7 instanceof X.AnonymousClass79N     // Catch:{ all -> 0x01ae }
            if (r0 == 0) goto L_0x01ac
            X.528 r2 = X.AnonymousClass528.A00     // Catch:{ all -> 0x01ae }
        L_0x01a2:
            r1 = 0
            X.52S r0 = new X.52S     // Catch:{ all -> 0x01ae }
            r0.<init>(r2, r1, r6)     // Catch:{ all -> 0x01ae }
            r3.A0D(r0)     // Catch:{ all -> 0x01ae }
            throw r7     // Catch:{ all -> 0x01ae }
        L_0x01ac:
            r2 = r4
            goto L_0x01a2
        L_0x01ae:
            r1 = move-exception
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0
            r0.A01 = r4
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$enableEffect$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallAvatarViewModel$enableEffect$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
