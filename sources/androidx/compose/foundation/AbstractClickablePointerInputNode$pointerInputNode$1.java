package androidx.compose.foundation;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C009403z;
import X.C019408g;
import X.C023509x;
import X.C120615rn;
import X.C133206Xf;
import X.C153917Qe;
import X.C161897ne;
import X.C90464aC;
import X.C90484aE;
import X.C93364gR;
import X.C94464iG;
import X.C94854it;
import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.AbstractClickablePointerInputNode$pointerInputNode$1", f = "Clickable.kt", i = {}, l = {938}, m = "invokeSuspend", n = {}, s = {})
public final class AbstractClickablePointerInputNode$pointerInputNode$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C94854it this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractClickablePointerInputNode$pointerInputNode$1(C94854it r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        AbstractClickablePointerInputNode$pointerInputNode$1 abstractClickablePointerInputNode$pointerInputNode$1 = new AbstractClickablePointerInputNode$pointerInputNode$1(this.this$0, r4);
        abstractClickablePointerInputNode$pointerInputNode$1.L$0 = obj;
        return abstractClickablePointerInputNode$pointerInputNode$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C161897ne r11 = (C161897ne) this.L$0;
            C94854it r5 = this.this$0;
            this.label = 1;
            C93364gR r52 = (C93364gR) r5;
            C120615rn r6 = r52.A03;
            long j = ((C94464iG) r11).A00;
            long A0J = C90484aE.A0J(((int) (j >> 32)) / 2, ((int) (j & 4294967295L)) / 2);
            long A0B = C90464aC.A0B((float) ((int) (A0J >> 32)), (float) ((int) (A0J & 4294967295L)));
            long j2 = C133206Xf.A03;
            r6.A00 = A0B;
            ClickablePointerInputNode$pointerInput$2 clickablePointerInputNode$pointerInput$2 = new ClickablePointerInputNode$pointerInput$2(r52, (C023509x) null);
            C153917Qe r13 = new C153917Qe(r52);
            C019408g r0 = TapGestureDetectorKt.A00;
            if (C009403z.A00(this, new TapGestureDetectorKt$detectTapAndPress$2(new PressGestureScopeImpl(r11), r11, (C023509x) null, r13, clickablePointerInputNode$pointerInput$2)) == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AbstractClickablePointerInputNode$pointerInputNode$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
