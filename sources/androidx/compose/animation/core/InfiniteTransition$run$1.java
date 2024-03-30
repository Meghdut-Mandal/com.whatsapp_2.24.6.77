package androidx.compose.animation.core;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass63C;
import X.C009003v;
import X.C023509x;
import X.C161547n5;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1", f = "InfiniteTransition.kt", i = {0, 0, 1, 1}, l = {181, 205}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "durationScale", "$this$LaunchedEffect", "durationScale"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class InfiniteTransition$run$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C161547n5 $toolingOverride;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AnonymousClass63C this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfiniteTransition$run$1(AnonymousClass63C r2, C161547n5 r3, C023509x r4) {
        super(2, r4);
        this.$toolingOverride = r3;
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        InfiniteTransition$run$1 infiniteTransition$run$1 = new InfiniteTransition$run$1(this.this$0, this.$toolingOverride, r5);
        infiniteTransition$run$1.L$0 = obj;
        return infiniteTransition$run$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0035 A[RETURN] */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.0AO r7 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x006a
            if (r0 == r5) goto L_0x0036
            if (r0 != r6) goto L_0x007b
            java.lang.Object r4 = r8.L$1
            X.0fD r4 = (X.C10780fD) r4
            java.lang.Object r3 = r8.L$0
            X.040 r3 = (X.AnonymousClass040) r3
            X.AnonymousClass0AN.A00(r9)
        L_0x0017:
            X.7n5 r1 = r8.$toolingOverride
            X.63C r0 = r8.this$0
            X.7Uw r2 = new X.7Uw
            r2.<init>(r0, r1, r4, r3)
            r8.L$0 = r3
            r8.L$1 = r4
            r8.label = r5
            X.02h r1 = r8.getContext()
            X.77j r0 = X.C162257oI.A00
            r1.get(r0)
            java.lang.Object r0 = X.AnonymousClass5WC.A00(r8, r2)
            if (r0 != r7) goto L_0x0041
            return r7
        L_0x0036:
            java.lang.Object r4 = r8.L$1
            X.0fD r4 = (X.C10780fD) r4
            java.lang.Object r3 = r8.L$0
            X.040 r3 = (X.AnonymousClass040) r3
            X.AnonymousClass0AN.A00(r9)
        L_0x0041:
            float r1 = r4.element
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0017
            X.7IW r1 = new X.7IW
            r1.<init>(r3)
            r2 = 0
            androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 r0 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1
            r0.<init>(r2, r1)
            X.0nA r1 = new X.0nA
            r1.<init>(r0)
            androidx.compose.animation.core.InfiniteTransition$run$1$3 r0 = new androidx.compose.animation.core.InfiniteTransition$run$1$3
            r0.<init>(r2)
            r8.L$0 = r3
            r8.L$1 = r4
            r8.label = r6
            java.lang.Object r0 = X.C07350Xh.A00(r8, r0, r1)
            if (r0 != r7) goto L_0x0017
            return r7
        L_0x006a:
            X.AnonymousClass0AN.A00(r9)
            java.lang.Object r3 = r8.L$0
            X.040 r3 = (X.AnonymousClass040) r3
            X.0fD r4 = new X.0fD
            r4.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.element = r0
            goto L_0x0017
        L_0x007b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransition$run$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InfiniteTransition$run$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
