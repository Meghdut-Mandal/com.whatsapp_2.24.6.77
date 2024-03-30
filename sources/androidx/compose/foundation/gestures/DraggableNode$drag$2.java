package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C136526eY;
import X.C157487dc;
import X.C93374gS;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", i = {}, l = {322}, m = "invokeSuspend", n = {}, s = {})
public final class DraggableNode$drag$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C009003v $block;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C93374gS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableNode$drag$2(C93374gS r2, C023509x r3, C009003v r4) {
        super(2, r3);
        this.this$0 = r2;
        this.$block = r4;
    }

    public final C023509x create(Object obj, C023509x r5) {
        DraggableNode$drag$2 draggableNode$drag$2 = new DraggableNode$drag$2(this.this$0, r5, this.$block);
        draggableNode$drag$2.L$0 = obj;
        return draggableNode$drag$2;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C93374gS r0 = this.this$0;
            r0.A00 = (C157487dc) this.L$0;
            C009003v r1 = this.$block;
            C136526eY r02 = r0.A03;
            this.label = 1;
            if (r1.invoke(r02, this) == r3) {
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
        return ((DraggableNode$drag$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
