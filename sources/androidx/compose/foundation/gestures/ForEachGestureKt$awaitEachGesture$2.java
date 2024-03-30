package androidx.compose.foundation.gestures;

import X.AnonymousClass09z;
import X.AnonymousClass0AJ;
import X.C005102h;
import X.C009003v;
import X.C023509x;
import X.C14090kx;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", i = {0, 1, 2}, l = {104, 107, 112}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0", "L$0"})
public final class ForEachGestureKt$awaitEachGesture$2 extends C14090kx implements C009003v {
    public final /* synthetic */ C009003v $block;
    public final /* synthetic */ C005102h $currentContext;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ForEachGestureKt$awaitEachGesture$2(C023509x r1, C005102h r2, C009003v r3) {
        super(r1);
        this.$currentContext = r2;
        this.$block = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(r5, this.$currentContext, this.$block);
        forEachGestureKt$awaitEachGesture$2.L$0 = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028 A[SYNTHETIC, Splitter:B:10:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035 A[Catch:{ CancellationException -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050 A[Catch:{ CancellationException -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.0AO r7 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 3
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0071
            if (r0 == r4) goto L_0x003f
            if (r0 == r5) goto L_0x0037
            if (r0 != r6) goto L_0x007e
            java.lang.Object r3 = r8.L$0
            X.7nd r3 = (X.C161887nd) r3
            X.AnonymousClass0AN.A00(r9)
        L_0x0016:
            X.02h r1 = r8.$currentContext
            X.03x r0 = X.C007403e.A00
            X.02i r0 = r1.get(r0)
            X.03e r0 = (X.C007403e) r0
            if (r0 == 0) goto L_0x0035
            boolean r0 = r0.BL7()
        L_0x0026:
            if (r0 == 0) goto L_0x007a
            X.03v r0 = r8.$block     // Catch:{ CancellationException -> 0x0051 }
            r8.L$0 = r3     // Catch:{ CancellationException -> 0x0051 }
            r8.label = r4     // Catch:{ CancellationException -> 0x0051 }
            java.lang.Object r0 = r0.invoke(r3, r8)     // Catch:{ CancellationException -> 0x0051 }
            if (r0 != r7) goto L_0x0046
            goto L_0x0079
        L_0x0035:
            r0 = 1
            goto L_0x0026
        L_0x0037:
            java.lang.Object r3 = r8.L$0
            X.7nd r3 = (X.C161887nd) r3
            X.AnonymousClass0AN.A00(r9)     // Catch:{ CancellationException -> 0x0051 }
            goto L_0x0016
        L_0x003f:
            java.lang.Object r3 = r8.L$0
            X.7nd r3 = (X.C161887nd) r3
            X.AnonymousClass0AN.A00(r9)     // Catch:{ CancellationException -> 0x0051 }
        L_0x0046:
            r8.L$0 = r3     // Catch:{ CancellationException -> 0x0051 }
            r8.label = r5     // Catch:{ CancellationException -> 0x0051 }
            java.lang.Object r0 = androidx.compose.foundation.gestures.ForEachGestureKt.A00(r3, r8)     // Catch:{ CancellationException -> 0x0051 }
            if (r0 != r7) goto L_0x0016
            goto L_0x007d
        L_0x0051:
            r2 = move-exception
            X.02h r1 = r8.$currentContext
            X.03x r0 = X.C007403e.A00
            X.02i r0 = r1.get(r0)
            X.03e r0 = (X.C007403e) r0
            if (r0 == 0) goto L_0x006f
            boolean r0 = r0.BL7()
        L_0x0062:
            if (r0 == 0) goto L_0x0082
            r8.L$0 = r3
            r8.label = r6
            java.lang.Object r0 = androidx.compose.foundation.gestures.ForEachGestureKt.A00(r3, r8)
            if (r0 != r7) goto L_0x0016
            return r7
        L_0x006f:
            r0 = 1
            goto L_0x0062
        L_0x0071:
            X.AnonymousClass0AN.A00(r9)
            java.lang.Object r3 = r8.L$0
            X.7nd r3 = (X.C161887nd) r3
            goto L_0x0016
        L_0x0079:
            return r7
        L_0x007a:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x007d:
            return r7
        L_0x007e:
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0e()
        L_0x0082:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ForEachGestureKt$awaitEachGesture$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
