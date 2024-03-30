package androidx.compose.foundation;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009403z;
import X.C019408g;
import X.C023509x;
import X.C133206Xf;
import X.C161437mu;
import X.C161877nc;
import X.C93364gR;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.ClickablePointerInputNode$pointerInput$2", f = "Clickable.kt", i = {}, l = {984}, m = "invokeSuspend", n = {}, s = {})
public final class ClickablePointerInputNode$pointerInput$2 extends AnonymousClass0A1 implements C019408g {
    public /* synthetic */ long J$0;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C93364gR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickablePointerInputNode$pointerInput$2(C93364gR r2, C023509x r3) {
        super(3, r3);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        long j = ((C133206Xf) obj2).A00;
        ClickablePointerInputNode$pointerInput$2 clickablePointerInputNode$pointerInput$2 = new ClickablePointerInputNode$pointerInput$2(this.this$0, (C023509x) obj3);
        clickablePointerInputNode$pointerInput$2.L$0 = obj;
        clickablePointerInputNode$pointerInput$2.J$0 = j;
        return clickablePointerInputNode$pointerInput$2.invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C161877nc r6 = (C161877nc) this.L$0;
            long j = this.J$0;
            C93364gR r1 = this.this$0;
            if (r1.A02) {
                this.label = 1;
                C161437mu r7 = r1.A00;
                if (r7 != null && C009403z.A00(this, new ClickableKt$handlePressInteraction$2(r1.A03, r6, r7, (C023509x) null, r1.A04, j)) == r3) {
                    return r3;
                }
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
