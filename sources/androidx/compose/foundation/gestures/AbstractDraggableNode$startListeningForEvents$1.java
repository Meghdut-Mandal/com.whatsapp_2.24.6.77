package androidx.compose.foundation.gestures;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {431, 433, 435, 442, 444, 447}, m = "invokeSuspend", n = {"$this$launch", "event", "$this$launch", "event", "$this$launch", "event", "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
public final class AbstractDraggableNode$startListeningForEvents$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ AbstractDraggableNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractDraggableNode$startListeningForEvents$1(AbstractDraggableNode abstractDraggableNode, C023509x r3) {
        super(2, r3);
        this.this$0 = abstractDraggableNode;
    }

    public final C023509x create(Object obj, C023509x r4) {
        AbstractDraggableNode$startListeningForEvents$1 abstractDraggableNode$startListeningForEvents$1 = new AbstractDraggableNode$startListeningForEvents$1(this.this$0, r4);
        abstractDraggableNode$startListeningForEvents$1.L$0 = obj;
        return abstractDraggableNode$startListeningForEvents$1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        if (X.C009403z.A04(r2) == false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r8 = new X.C10810fG();
        r1 = r10.this$0.A0C;
        r10.L$0 = r2;
        r10.L$1 = r8;
        r10.L$2 = r8;
        r10.label = 1;
        r11 = r1.Bmx(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
        if (r11 == r4) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        r0.element = r11;
        r5 = r8.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        if ((r5 instanceof X.C93394gU) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        r10.L$0 = r2;
        r10.L$1 = r8;
        r10.L$2 = null;
        r10.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        if (androidx.compose.foundation.gestures.AbstractDraggableNode.A00(r10.this$0, (X.C93394gU) r5, r10, r2) != r4) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0084, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r9 = r10.this$0;
        r1 = new androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1.AnonymousClass1((X.C023509x) null);
        r10.L$0 = r2;
        r10.L$1 = r8;
        r10.label = 3;
        r9 = (X.C93374gS) r9;
        r7 = r9.A01;
        r7 = (X.C136556eb) r7;
        r0 = r7.A01.A03.BpQ(X.AnonymousClass5RT.UserInput, r10, new androidx.compose.foundation.gestures.ScrollDraggableState$drag$2(r7, (X.C023509x) null, new androidx.compose.foundation.gestures.DraggableNode$drag$2(r9, (X.C023509x) null, r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ad, code lost:
        if (r0 == r4) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00af, code lost:
        r0 = X.AnonymousClass0AJ.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b1, code lost:
        if (r0 == r4) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b3, code lost:
        r0 = X.AnonymousClass0AJ.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b5, code lost:
        if (r0 != r4) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bb, code lost:
        r5 = r8.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bf, code lost:
        if ((r5 instanceof X.C93404gV) == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c1, code lost:
        r1 = r10.this$0;
        X.AnonymousClass00C.A0E(r5, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped");
        r10.L$0 = r2;
        r10.L$1 = null;
        r10.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d5, code lost:
        if (androidx.compose.foundation.gestures.AbstractDraggableNode.A01(r1, (X.C93404gV) r5, r10, r2) != r4) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00da, code lost:
        if ((r5 instanceof X.C93414gW) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00dc, code lost:
        r1 = r10.this$0;
        r10.L$0 = r2;
        r10.L$1 = null;
        r10.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e9, code lost:
        if (androidx.compose.foundation.gestures.AbstractDraggableNode.A02(r1, r10, r2) != r4) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fc, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fd, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0100, code lost:
        return X.AnonymousClass0AJ.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r10.label
            r3 = 0
            switch(r0) {
                case 0: goto L_0x0043;
                case 1: goto L_0x0033;
                case 2: goto L_0x0027;
                case 3: goto L_0x001d;
                case 4: goto L_0x0015;
                case 5: goto L_0x0015;
                case 6: goto L_0x000d;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x000d:
            java.lang.Object r2 = r10.L$0
            X.040 r2 = (X.AnonymousClass040) r2
            X.AnonymousClass0AN.A00(r11)
            goto L_0x004a
        L_0x0015:
            java.lang.Object r2 = r10.L$0
            X.040 r2 = (X.AnonymousClass040) r2
            X.AnonymousClass0AN.A00(r11)     // Catch:{ CancellationException -> 0x00ec }
            goto L_0x004a
        L_0x001d:
            java.lang.Object r8 = r10.L$1
            X.0fG r8 = (X.C10810fG) r8
            java.lang.Object r2 = r10.L$0
            X.040 r2 = (X.AnonymousClass040) r2
            goto L_0x00b8
        L_0x0027:
            java.lang.Object r8 = r10.L$1
            X.0fG r8 = (X.C10810fG) r8
            java.lang.Object r2 = r10.L$0
            X.040 r2 = (X.AnonymousClass040) r2
            X.AnonymousClass0AN.A00(r11)
            goto L_0x0085
        L_0x0033:
            java.lang.Object r0 = r10.L$2
            X.0fG r0 = (X.C10810fG) r0
            java.lang.Object r8 = r10.L$1
            X.0fG r8 = (X.C10810fG) r8
            java.lang.Object r2 = r10.L$0
            X.040 r2 = (X.AnonymousClass040) r2
            X.AnonymousClass0AN.A00(r11)
            goto L_0x0069
        L_0x0043:
            X.AnonymousClass0AN.A00(r11)
            java.lang.Object r2 = r10.L$0
            X.040 r2 = (X.AnonymousClass040) r2
        L_0x004a:
            boolean r0 = X.C009403z.A04(r2)
            if (r0 == 0) goto L_0x00fe
            X.0fG r8 = new X.0fG
            r8.<init>()
            androidx.compose.foundation.gestures.AbstractDraggableNode r0 = r10.this$0
            X.0sR r1 = r0.A0C
            r10.L$0 = r2
            r10.L$1 = r8
            r10.L$2 = r8
            r0 = 1
            r10.label = r0
            java.lang.Object r11 = r1.Bmx(r10)
            if (r11 == r4) goto L_0x0084
            r0 = r8
        L_0x0069:
            r0.element = r11
            java.lang.Object r5 = r8.element
            boolean r0 = r5 instanceof X.C93394gU
            if (r0 == 0) goto L_0x004a
            androidx.compose.foundation.gestures.AbstractDraggableNode r1 = r10.this$0
            X.4gU r5 = (X.C93394gU) r5
            r10.L$0 = r2
            r10.L$1 = r8
            r10.L$2 = r3
            r0 = 2
            r10.label = r0
            java.lang.Object r0 = androidx.compose.foundation.gestures.AbstractDraggableNode.A00(r1, r5, r10, r2)
            if (r0 != r4) goto L_0x0085
        L_0x0084:
            return r4
        L_0x0085:
            androidx.compose.foundation.gestures.AbstractDraggableNode r9 = r10.this$0     // Catch:{ CancellationException -> 0x00ec }
            androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1$1 r1 = new androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1$1     // Catch:{ CancellationException -> 0x00ec }
            r1.<init>(r9, r3, r8)     // Catch:{ CancellationException -> 0x00ec }
            r10.L$0 = r2     // Catch:{ CancellationException -> 0x00ec }
            r10.L$1 = r8     // Catch:{ CancellationException -> 0x00ec }
            r0 = 3
            r10.label = r0     // Catch:{ CancellationException -> 0x00ec }
            X.4gS r9 = (X.C93374gS) r9     // Catch:{ CancellationException -> 0x00ec }
            X.7b6 r7 = r9.A01     // Catch:{ CancellationException -> 0x00ec }
            X.5RT r6 = X.AnonymousClass5RT.UserInput     // Catch:{ CancellationException -> 0x00ec }
            androidx.compose.foundation.gestures.DraggableNode$drag$2 r5 = new androidx.compose.foundation.gestures.DraggableNode$drag$2     // Catch:{ CancellationException -> 0x00ec }
            r5.<init>(r9, r3, r1)     // Catch:{ CancellationException -> 0x00ec }
            X.6eb r7 = (X.C136556eb) r7     // Catch:{ CancellationException -> 0x00ec }
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r7.A01     // Catch:{ CancellationException -> 0x00ec }
            X.7lC r1 = r0.A03     // Catch:{ CancellationException -> 0x00ec }
            androidx.compose.foundation.gestures.ScrollDraggableState$drag$2 r0 = new androidx.compose.foundation.gestures.ScrollDraggableState$drag$2     // Catch:{ CancellationException -> 0x00ec }
            r0.<init>(r7, r3, r5)     // Catch:{ CancellationException -> 0x00ec }
            java.lang.Object r0 = r1.BpQ(r6, r10, r0)     // Catch:{ CancellationException -> 0x00ec }
            if (r0 == r4) goto L_0x00b1
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ CancellationException -> 0x00ec }
        L_0x00b1:
            if (r0 == r4) goto L_0x00b5
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ CancellationException -> 0x00ec }
        L_0x00b5:
            if (r0 != r4) goto L_0x00bb
            return r4
        L_0x00b8:
            X.AnonymousClass0AN.A00(r11)     // Catch:{ CancellationException -> 0x00ec }
        L_0x00bb:
            java.lang.Object r5 = r8.element     // Catch:{ CancellationException -> 0x00ec }
            boolean r0 = r5 instanceof X.C93404gV     // Catch:{ CancellationException -> 0x00ec }
            if (r0 == 0) goto L_0x00d8
            androidx.compose.foundation.gestures.AbstractDraggableNode r1 = r10.this$0     // Catch:{ CancellationException -> 0x00ec }
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped"
            X.AnonymousClass00C.A0E(r5, r0)     // Catch:{ CancellationException -> 0x00ec }
            X.4gV r5 = (X.C93404gV) r5     // Catch:{ CancellationException -> 0x00ec }
            r10.L$0 = r2     // Catch:{ CancellationException -> 0x00ec }
            r10.L$1 = r3     // Catch:{ CancellationException -> 0x00ec }
            r0 = 4
            r10.label = r0     // Catch:{ CancellationException -> 0x00ec }
            java.lang.Object r0 = androidx.compose.foundation.gestures.AbstractDraggableNode.A01(r1, r5, r10, r2)     // Catch:{ CancellationException -> 0x00ec }
            if (r0 != r4) goto L_0x004a
            goto L_0x00fc
        L_0x00d8:
            boolean r0 = r5 instanceof X.C93414gW     // Catch:{ CancellationException -> 0x00ec }
            if (r0 == 0) goto L_0x004a
            androidx.compose.foundation.gestures.AbstractDraggableNode r1 = r10.this$0     // Catch:{ CancellationException -> 0x00ec }
            r10.L$0 = r2     // Catch:{ CancellationException -> 0x00ec }
            r10.L$1 = r3     // Catch:{ CancellationException -> 0x00ec }
            r0 = 5
            r10.label = r0     // Catch:{ CancellationException -> 0x00ec }
            java.lang.Object r0 = androidx.compose.foundation.gestures.AbstractDraggableNode.A02(r1, r10, r2)     // Catch:{ CancellationException -> 0x00ec }
            if (r0 != r4) goto L_0x004a
            goto L_0x00fd
        L_0x00ec:
            androidx.compose.foundation.gestures.AbstractDraggableNode r1 = r10.this$0
            r10.L$0 = r2
            r10.L$1 = r3
            r0 = 6
            r10.label = r0
            java.lang.Object r0 = androidx.compose.foundation.gestures.AbstractDraggableNode.A02(r1, r10, r2)
            if (r0 != r4) goto L_0x004a
            return r4
        L_0x00fc:
            return r4
        L_0x00fd:
            return r4
        L_0x00fe:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AbstractDraggableNode$startListeningForEvents$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
