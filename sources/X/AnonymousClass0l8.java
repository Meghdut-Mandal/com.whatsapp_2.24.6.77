package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0l8  reason: invalid class name */
public final class AnonymousClass0l8 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Object $element;
    public final /* synthetic */ C17300r3 $this_trySendBlocking;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0l8(Object obj, C023509x r3, C17300r3 r4) {
        super(2, r3);
        this.$this_trySendBlocking = r4;
        this.$element = obj;
    }

    public final C023509x create(Object obj, C023509x r5) {
        AnonymousClass0l8 r0 = new AnonymousClass0l8(this.$element, r5, this.$this_trySendBlocking);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object r1;
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C17300r3 r12 = this.$this_trySendBlocking;
            Object obj3 = this.$element;
            try {
                this.label = 1;
                if (r12.Bpf(obj3, this) == r3) {
                    return r3;
                }
            } catch (Throwable th) {
                obj2 = new AnonymousClass03N(th);
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        obj2 = AnonymousClass0AJ.A00;
        if (!(obj2 instanceof AnonymousClass03N)) {
            r1 = AnonymousClass0AJ.A00;
        } else {
            r1 = new AnonymousClass0n9(AnonymousClass0AK.A00(obj2));
        }
        return new AnonymousClass0X8(r1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass0l8) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
