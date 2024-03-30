package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", i = {}, l = {210}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0l2  reason: invalid class name and case insensitive filesystem */
public final class C14130l2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass05H $this_debounceInternal;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14130l2(C023509x r2, AnonymousClass05H r3) {
        super(2, r2);
        this.$this_debounceInternal = r3;
    }

    public final C023509x create(Object obj, C023509x r4) {
        C14130l2 r0 = new C14130l2(r4, this.$this_debounceInternal);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            Object obj2 = this.L$0;
            AnonymousClass05H r2 = this.$this_debounceInternal;
            C18470tD r0 = new C18470tD(obj2, 0);
            this.label = 1;
            if (r2.B36(this, r0) == r5) {
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
        return ((C14130l2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
