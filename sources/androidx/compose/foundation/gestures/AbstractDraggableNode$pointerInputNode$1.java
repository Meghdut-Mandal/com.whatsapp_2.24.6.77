package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C009403z;
import X.C023509x;
import X.C161897ne;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1", f = "Draggable.kt", i = {}, l = {456}, m = "invokeSuspend", n = {}, s = {})
public final class AbstractDraggableNode$pointerInputNode$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AbstractDraggableNode this$0;

    @DebugMetadata(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1", f = "Draggable.kt", i = {0}, l = {458}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public /* synthetic */ Object L$0;
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            AnonymousClass1 r0 = new AnonymousClass1(abstractDraggableNode, r3, r5);
            r0.L$0 = obj;
            return r0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
            if (X.C009403z.A04(r4) == false) goto L_0x003b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
                int r0 = r7.label
                r5 = 1
                if (r0 == 0) goto L_0x0011
                if (r0 != r5) goto L_0x0037
                java.lang.Object r4 = r7.L$0
                X.040 r4 = (X.AnonymousClass040) r4
                X.AnonymousClass0AN.A00(r8)     // Catch:{ CancellationException -> 0x002d }
                goto L_0x0034
            L_0x0011:
                X.AnonymousClass0AN.A00(r8)
                java.lang.Object r4 = r7.L$0
                X.040 r4 = (X.AnonymousClass040) r4
                X.7ne r3 = r3     // Catch:{ CancellationException -> 0x002d }
                androidx.compose.foundation.gestures.AbstractDraggableNode r2 = r2     // Catch:{ CancellationException -> 0x002d }
                r1 = 0
                androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1 r0 = new androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1     // Catch:{ CancellationException -> 0x002d }
                r0.<init>(r2, r1, r4)     // Catch:{ CancellationException -> 0x002d }
                r7.L$0 = r4     // Catch:{ CancellationException -> 0x002d }
                r7.label = r5     // Catch:{ CancellationException -> 0x002d }
                java.lang.Object r0 = r3.B1e(r7, r0)     // Catch:{ CancellationException -> 0x002d }
                if (r0 != r6) goto L_0x0034
                return r6
            L_0x002d:
                r1 = move-exception
                boolean r0 = X.C009403z.A04(r4)
                if (r0 == 0) goto L_0x003b
            L_0x0034:
                X.0AJ r0 = X.AnonymousClass0AJ.A00
                return r0
            L_0x0037:
                java.lang.IllegalStateException r1 = X.AnonymousClass000.A0e()
            L_0x003b:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractDraggableNode$pointerInputNode$1(AbstractDraggableNode abstractDraggableNode, C023509x r3) {
        super(2, r3);
        this.this$0 = abstractDraggableNode;
    }

    public final C023509x create(Object obj, C023509x r4) {
        AbstractDraggableNode$pointerInputNode$1 abstractDraggableNode$pointerInputNode$1 = new AbstractDraggableNode$pointerInputNode$1(this.this$0, r4);
        abstractDraggableNode$pointerInputNode$1.L$0 = obj;
        return abstractDraggableNode$pointerInputNode$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final C161897ne r3 = (C161897ne) this.L$0;
            final AbstractDraggableNode abstractDraggableNode = this.this$0;
            if (abstractDraggableNode.A05) {
                AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
                this.label = 1;
                if (C009403z.A00(this, r0) == r5) {
                    return r5;
                }
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AbstractDraggableNode$pointerInputNode$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
