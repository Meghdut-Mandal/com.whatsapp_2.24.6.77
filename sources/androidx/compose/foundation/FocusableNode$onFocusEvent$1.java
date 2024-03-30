package androidx.compose.foundation;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass6QC;
import X.C009003v;
import X.C023509x;
import X.C157547di;
import X.C94834ir;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.FocusableNode$onFocusEvent$1", f = "Focusable.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {})
public final class FocusableNode$onFocusEvent$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C94834ir this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusableNode$onFocusEvent$1(C94834ir r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new FocusableNode$onFocusEvent$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new FocusableNode$onFocusEvent$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C157547di r1 = this.this$0.A02;
            this.label = 1;
            if (r1.B1x((AnonymousClass6QC) null, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
