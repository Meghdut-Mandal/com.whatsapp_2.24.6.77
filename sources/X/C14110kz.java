package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0kz  reason: invalid class name and case insensitive filesystem */
public final class C14110kz extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass05H $this_launchIn;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14110kz(C023509x r2, AnonymousClass05H r3) {
        super(2, r2);
        this.$this_launchIn = r3;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new C14110kz(r4, this.$this_launchIn);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new C14110kz((C023509x) obj2, this.$this_launchIn).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05H r1 = this.$this_launchIn;
            this.label = 1;
            if (r1.B36(this, C13080j8.A00) == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
