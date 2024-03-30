package androidx.compose.foundation.gestures;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C133156Wz;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", i = {0, 1, 1, 2, 2}, l = {804, 807, 810}, m = "invokeSuspend", n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
public final class ScrollingLogic$onDragStopped$performFling$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ long J$0;
    public long J$1;
    public int label;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onDragStopped$performFling$1(ScrollingLogic scrollingLogic, C023509x r3) {
        super(2, r3);
        this.this$0 = scrollingLogic;
    }

    public final C023509x create(Object obj, C023509x r5) {
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this.this$0, r5);
        scrollingLogic$onDragStopped$performFling$1.J$0 = ((C133156Wz) obj).A00;
        return scrollingLogic$onDragStopped$performFling$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ScrollingLogic$onDragStopped$performFling$1) create(new C133156Wz(((C133156Wz) obj).A00), (C023509x) obj2)).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0078 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r8 = r13
            int r0 = r13.label
            r5 = 3
            r7 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 == r3) goto L_0x003d
            if (r0 == r7) goto L_0x0059
            if (r0 != r5) goto L_0x0079
            long r11 = r13.J$1
            long r0 = r13.J$0
            X.AnonymousClass0AN.A00(r14)
        L_0x0017:
            X.6Wz r14 = (X.C133156Wz) r14
            long r2 = r14.A00
            long r2 = X.C133156Wz.A00(r11, r2)
            long r0 = X.C133156Wz.A00(r0, r2)
            X.6Wz r6 = new X.6Wz
            r6.<init>(r0)
            return r6
        L_0x0029:
            X.AnonymousClass0AN.A00(r14)
            long r0 = r13.J$0
            androidx.compose.foundation.gestures.ScrollingLogic r2 = r13.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r2 = r2.A04
            r13.J$0 = r0
            r13.label = r3
            java.lang.Object r14 = r2.A00(r13, r0)
            if (r14 != r6) goto L_0x0042
            return r6
        L_0x003d:
            long r0 = r13.J$0
            X.AnonymousClass0AN.A00(r14)
        L_0x0042:
            X.6Wz r14 = (X.C133156Wz) r14
            long r2 = r14.A00
            long r2 = X.C133156Wz.A00(r0, r2)
            androidx.compose.foundation.gestures.ScrollingLogic r4 = r13.this$0
            r13.J$0 = r0
            r13.J$1 = r2
            r13.label = r7
            java.lang.Object r14 = r4.A02(r13, r2)
            if (r14 != r6) goto L_0x0060
            return r6
        L_0x0059:
            long r2 = r13.J$1
            long r0 = r13.J$0
            X.AnonymousClass0AN.A00(r14)
        L_0x0060:
            X.6Wz r14 = (X.C133156Wz) r14
            long r11 = r14.A00
            androidx.compose.foundation.gestures.ScrollingLogic r4 = r13.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r7 = r4.A04
            long r9 = X.C133156Wz.A00(r2, r11)
            r13.J$0 = r0
            r13.J$1 = r11
            r13.label = r5
            java.lang.Object r14 = r7.A01(r8, r9, r11)
            if (r14 != r6) goto L_0x0017
            return r6
        L_0x0079:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
