package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass040;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C006302t;
import X.C009003v;
import X.C019408g;
import X.C023509x;
import X.C14090kx;
import X.C161897ne;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", i = {}, l = {232}, m = "invokeSuspend", n = {}, s = {})
public final class TapGestureDetectorKt$detectTapAndPress$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C019408g $onPress;
    public final /* synthetic */ C006302t $onTap;
    public final /* synthetic */ PressGestureScopeImpl $pressScope;
    public final /* synthetic */ C161897ne $this_detectTapAndPress;
    public /* synthetic */ Object L$0;
    public int label;

    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", i = {0}, l = {237, 245}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C14090kx implements C009003v {
        public /* synthetic */ Object L$0;
        public int label;

        public final C023509x create(Object obj, C023509x r8) {
            AnonymousClass040 r5 = r9;
            C019408g r4 = r8;
            AnonymousClass1 r0 = new AnonymousClass1(pressGestureScopeImpl, r8, r7, r4, r5);
            r0.L$0 = obj;
            return r0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0091 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                X.0AO r7 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
                int r0 = r9.label
                r8 = 2
                r6 = 1
                r5 = 0
                if (r0 == 0) goto L_0x0044
                if (r0 == r6) goto L_0x0064
                if (r0 != r8) goto L_0x0092
                X.AnonymousClass0AN.A00(r10)
            L_0x0010:
                X.6E5 r10 = (X.AnonymousClass6E5) r10
                if (r10 != 0) goto L_0x0023
                X.040 r2 = r9
                androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r5
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3
                r0.<init>(r5)
                X.C36331k8.A1T(r0, r2)
            L_0x0020:
                X.0AJ r7 = X.AnonymousClass0AJ.A00
                return r7
            L_0x0023:
                X.6Jc r0 = r10.A01
                r0.A00 = r6
                r0.A01 = r6
                X.040 r2 = r9
                androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r5
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4
                r0.<init>(r5)
                X.C36331k8.A1T(r0, r2)
                X.02t r3 = r7
                if (r3 == 0) goto L_0x0020
                long r1 = r10.A06
                X.6Xf r0 = new X.6Xf
                r0.<init>(r1)
                r3.invoke(r0)
                goto L_0x0020
            L_0x0044:
                X.AnonymousClass0AN.A00(r10)
                java.lang.Object r4 = r9.L$0
                X.7nd r4 = (X.C161887nd) r4
                X.040 r2 = r9
                androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r5
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1
                r0.<init>(r5)
                X.C36331k8.A1T(r0, r2)
                r9.L$0 = r4
                r9.label = r6
                X.5Rl r0 = X.C107935Rl.Main
                java.lang.Object r10 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r4, r0, r9, r6)
                if (r10 != r7) goto L_0x006b
                return r7
            L_0x0064:
                java.lang.Object r4 = r9.L$0
                X.7nd r4 = (X.C161887nd) r4
                X.AnonymousClass0AN.A00(r10)
            L_0x006b:
                X.6E5 r10 = (X.AnonymousClass6E5) r10
                X.6Jc r0 = r10.A01
                r0.A00 = r6
                r0.A01 = r6
                X.08g r3 = r8
                X.08g r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00
                if (r3 == r0) goto L_0x0085
                X.040 r2 = r9
                androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r5
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2
                r0.<init>(r1, r10, r5, r3)
                X.C36331k8.A1T(r0, r2)
            L_0x0085:
                r9.L$0 = r5
                r9.label = r8
                X.5Rl r0 = X.C107935Rl.Main
                java.lang.Object r10 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00(r4, r0, r9)
                if (r10 != r7) goto L_0x0010
                return r7
            L_0x0092:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapAndPress$2(PressGestureScopeImpl pressGestureScopeImpl, C161897ne r3, C023509x r4, C006302t r5, C019408g r6) {
        super(2, r4);
        this.$this_detectTapAndPress = r3;
        this.$onPress = r6;
        this.$onTap = r5;
        this.$pressScope = pressGestureScopeImpl;
    }

    public final C023509x create(Object obj, C023509x r8) {
        C161897ne r2 = this.$this_detectTapAndPress;
        C019408g r5 = this.$onPress;
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.$pressScope, r2, r8, this.$onTap, r5);
        tapGestureDetectorKt$detectTapAndPress$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final AnonymousClass040 r9 = (AnonymousClass040) this.L$0;
            C161897ne r2 = this.$this_detectTapAndPress;
            final C019408g r8 = this.$onPress;
            final C006302t r7 = this.$onTap;
            final PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
            AnonymousClass1 r4 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (r2.B1e(this, new ForEachGestureKt$awaitEachGesture$2((C023509x) null, getContext(), r4)) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$detectTapAndPress$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
