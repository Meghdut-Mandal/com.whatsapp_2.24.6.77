package androidx.window.java.layout;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.AnonymousClass05H;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass4Z8;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", f = "WindowInfoTrackerCallbackAdapter.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
public final class WindowInfoTrackerCallbackAdapter$addListener$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass026 $consumer;
    public final /* synthetic */ AnonymousClass05H $flow;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerCallbackAdapter$addListener$1$1(AnonymousClass026 r2, C023509x r3, AnonymousClass05H r4) {
        super(2, r3);
        this.$flow = r4;
        this.$consumer = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new WindowInfoTrackerCallbackAdapter$addListener$1$1(this.$consumer, r5, this.$flow);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05H r3 = this.$flow;
            AnonymousClass4Z8 r0 = new AnonymousClass4Z8(this.$consumer, 3);
            this.label = 1;
            if (r3.B36(this, r0) == r5) {
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
        return ((WindowInfoTrackerCallbackAdapter$addListener$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
