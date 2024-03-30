package androidx.compose.foundation.gestures;

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
import X.C94824iq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$1", f = "Scrollable.kt", i = {}, l = {669}, m = "invokeSuspend", n = {}, s = {})
public final class MouseWheelScrollNode$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C94824iq this$0;

    @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1", f = "Scrollable.kt", i = {0}, l = {671}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1  reason: invalid class name */
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
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00a7 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x002d A[EDGE_INSN: B:22:0x002d->B:9:0x002d ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x001c  */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                X.0AO r8 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
                int r0 = r12.label
                r7 = 1
                if (r0 == 0) goto L_0x0096
                if (r0 != r7) goto L_0x00a8
                java.lang.Object r6 = r12.L$0
                X.7nd r6 = (X.C161887nd) r6
                X.AnonymousClass0AN.A00(r13)
            L_0x0010:
                X.5rt r13 = (X.C120675rt) r13
                java.util.List r5 = r13.A02
                int r2 = r5.size()
                r4 = 0
                r1 = 0
            L_0x001a:
                if (r1 >= r2) goto L_0x002d
                java.lang.Object r0 = r5.get(r1)
                X.6E5 r0 = (X.AnonymousClass6E5) r0
                boolean r0 = r0.A00()
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x009d
                int r1 = r1 + 1
                goto L_0x001a
            L_0x002d:
                X.4iq r0 = X.C94824iq.this
                X.7b7 r0 = r0.A00
                X.AnonymousClass00C.A0B(r0)
                X.4iq r9 = X.C94824iq.this
                long r0 = X.C133206Xf.A03
                X.6Xf r2 = new X.6Xf
                r2.<init>(r0)
                int r11 = r5.size()
                r10 = 0
            L_0x0042:
                if (r10 >= r11) goto L_0x005a
                java.lang.Object r0 = r5.get(r10)
                X.6E5 r0 = (X.AnonymousClass6E5) r0
                long r2 = r2.A00
                long r0 = r0.A09
                long r0 = X.C133206Xf.A03(r2, r0)
                X.6Xf r2 = new X.6Xf
                r2.<init>(r0)
                int r10 = r10 + 1
                goto L_0x0042
            L_0x005a:
                long r0 = r2.A00
                r2 = 64
                float r2 = (float) r2
                float r2 = r6.Bvq(r2)
                float r3 = -r2
                float r2 = X.C133206Xf.A00(r0)
                float r2 = r2 * r3
                float r0 = X.C133206Xf.A01(r0)
                float r0 = r0 * r3
                long r0 = X.C90464aC.A0B(r2, r0)
                androidx.compose.foundation.gestures.ScrollingLogic r10 = r9.A01
                X.040 r9 = r9.A07()
                r3 = 0
                androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1$2$1$1 r2 = new androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1$2$1$1
                r2.<init>(r10, r3, r0)
                X.C36331k8.A1T(r2, r9)
                int r1 = r5.size()
            L_0x0085:
                if (r4 >= r1) goto L_0x009d
                java.lang.Object r0 = r5.get(r4)
                X.6E5 r0 = (X.AnonymousClass6E5) r0
                X.6Jc r0 = r0.A01
                r0.A00 = r7
                r0.A01 = r7
                int r4 = r4 + 1
                goto L_0x0085
            L_0x0096:
                X.AnonymousClass0AN.A00(r13)
                java.lang.Object r6 = r12.L$0
                X.7nd r6 = (X.C161887nd) r6
            L_0x009d:
                r12.L$0 = r6
                r12.label = r7
                java.lang.Object r13 = androidx.compose.foundation.gestures.ScrollableKt.A00(r6, r12)
                if (r13 != r8) goto L_0x0010
                return r8
            L_0x00a8:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollNode$1(C94824iq r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        MouseWheelScrollNode$1 mouseWheelScrollNode$1 = new MouseWheelScrollNode$1(this.this$0, r4);
        mouseWheelScrollNode$1.L$0 = obj;
        return mouseWheelScrollNode$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final C94824iq r2 = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (((C161897ne) this.L$0).B1e(this, r0) == r5) {
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
        return ((MouseWheelScrollNode$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
