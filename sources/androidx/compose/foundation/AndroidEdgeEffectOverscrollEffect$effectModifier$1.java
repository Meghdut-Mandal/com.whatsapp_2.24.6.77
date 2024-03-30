package androidx.compose.foundation;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C14090kx;
import X.C161897ne;
import androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", f = "AndroidOverscroll.android.kt", i = {}, l = {320}, m = "invokeSuspend", n = {}, s = {})
public final class AndroidEdgeEffectOverscrollEffect$effectModifier$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    @DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1", f = "AndroidOverscroll.android.kt", i = {0, 1}, l = {321, 325}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture"}, s = {"L$0", "L$0"})
    /* renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C14090kx implements C009003v {
        public /* synthetic */ Object L$0;
        public int label;

        public final C023509x create(Object obj, C023509x r4) {
            AnonymousClass1 r0 = new AnonymousClass1(r4);
            r0.L$0 = obj;
            return r0;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00bf A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0053 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
                int r1 = r14.label
                r3 = 2
                r7 = 0
                r0 = 1
                if (r1 == 0) goto L_0x0081
                if (r1 == r0) goto L_0x0096
                if (r1 != r3) goto L_0x00c0
                java.lang.Object r2 = r14.L$0
                X.7nd r2 = (X.C161887nd) r2
                X.AnonymousClass0AN.A00(r15)
            L_0x0014:
                X.5rt r15 = (X.C120675rt) r15
                java.util.List r9 = r15.A02
                java.util.ArrayList r8 = X.C36361kB.A0r(r9)
                int r6 = r9.size()
                r13 = 0
                r5 = 0
            L_0x0022:
                if (r5 >= r6) goto L_0x0035
                java.lang.Object r1 = r9.get(r5)
                r0 = r1
                X.6E5 r0 = (X.AnonymousClass6E5) r0
                boolean r0 = r0.A0B
                if (r0 == 0) goto L_0x0032
                r8.add(r1)
            L_0x0032:
                int r5 = r5 + 1
                goto L_0x0022
            L_0x0035:
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r12 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this
                int r11 = r8.size()
            L_0x003b:
                if (r13 >= r11) goto L_0x0053
                java.lang.Object r10 = r8.get(r13)
                r0 = r10
                X.6E5 r0 = (X.AnonymousClass6E5) r0
                long r5 = r0.A05
                X.68N r0 = r12.A03
                if (r0 == 0) goto L_0x0050
                long r0 = r0.A00
                int r9 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r9 == 0) goto L_0x0054
            L_0x0050:
                int r13 = r13 + 1
                goto L_0x003b
            L_0x0053:
                r10 = r7
            L_0x0054:
                X.6E5 r10 = (X.AnonymousClass6E5) r10
                if (r10 != 0) goto L_0x0060
                java.lang.Object r10 = X.C007103b.A0M(r8)
                X.6E5 r10 = (X.AnonymousClass6E5) r10
                if (r10 == 0) goto L_0x0074
            L_0x0060:
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r6 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this
                long r0 = r10.A05
                X.68N r5 = new X.68N
                r5.<init>(r0)
                r6.A03 = r5
                long r0 = r10.A06
                X.6Xf r5 = new X.6Xf
                r5.<init>(r0)
                r6.A02 = r5
            L_0x0074:
                boolean r0 = X.C36411kG.A1a(r8)
                if (r0 != 0) goto L_0x00b3
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r0 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this
                r0.A03 = r7
                X.0AJ r0 = X.AnonymousClass0AJ.A00
                return r0
            L_0x0081:
                X.AnonymousClass0AN.A00(r15)
                java.lang.Object r2 = r14.L$0
                X.7nd r2 = (X.C161887nd) r2
                r14.L$0 = r2
                r14.label = r0
                r1 = 0
                X.5Rl r0 = X.C107935Rl.Main
                java.lang.Object r15 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r2, r0, r14, r1)
                if (r15 != r4) goto L_0x009d
                return r4
            L_0x0096:
                java.lang.Object r2 = r14.L$0
                X.7nd r2 = (X.C161887nd) r2
                X.AnonymousClass0AN.A00(r15)
            L_0x009d:
                X.6E5 r15 = (X.AnonymousClass6E5) r15
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r6 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this
                long r0 = r15.A05
                X.68N r5 = new X.68N
                r5.<init>(r0)
                r6.A03 = r5
                long r0 = r15.A06
                X.6Xf r5 = new X.6Xf
                r5.<init>(r0)
                r6.A02 = r5
            L_0x00b3:
                r14.L$0 = r2
                r14.label = r3
                X.5Rl r0 = X.C107935Rl.Main
                java.lang.Object r15 = r2.B1d(r0, r14)
                if (r15 != r4) goto L_0x0014
                return r4
            L_0x00c0:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$effectModifier$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, C023509x r3) {
        super(2, r3);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    public final C023509x create(Object obj, C023509x r4) {
        AndroidEdgeEffectOverscrollEffect$effectModifier$1 androidEdgeEffectOverscrollEffect$effectModifier$1 = new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this.this$0, r4);
        androidEdgeEffectOverscrollEffect$effectModifier$1.L$0 = obj;
        return androidEdgeEffectOverscrollEffect$effectModifier$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.this$0;
            AnonymousClass1 r2 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (((C161897ne) this.L$0).B1e(this, new ForEachGestureKt$awaitEachGesture$2((C023509x) null, getContext(), r2)) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AndroidEdgeEffectOverscrollEffect$effectModifier$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
