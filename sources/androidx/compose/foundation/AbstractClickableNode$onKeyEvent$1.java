package androidx.compose.foundation;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C136706er;
import X.C136726et;
import X.C161437mu;
import X.C94844is;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", i = {}, l = {810}, m = "invokeSuspend", n = {}, s = {})
public final class AbstractClickableNode$onKeyEvent$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C136706er $press;
    public int label;
    public final /* synthetic */ C94844is this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$onKeyEvent$1(C94844is r2, C136706er r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$press = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new AbstractClickableNode$onKeyEvent$1(this.this$0, this.$press, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C161437mu r0 = this.this$0.A00;
            C136706er r1 = this.$press;
            this.label = 1;
            if (AnonymousClass0AO.A00(((C136726et) r0).A00.B6N(r1, this)) == r3) {
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
        return ((AbstractClickableNode$onKeyEvent$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
