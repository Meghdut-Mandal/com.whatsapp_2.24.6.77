package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0l3  reason: invalid class name and case insensitive filesystem */
public final class C14140l3 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass05K $subscriptionCount;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14140l3(C023509x r2, AnonymousClass05K r3) {
        super(2, r2);
        this.$subscriptionCount = r3;
    }

    public final C023509x create(Object obj, C023509x r4) {
        C14140l3 r0 = new C14140l3(r4, this.$subscriptionCount);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            Object obj2 = this.L$0;
            C10770fC r3 = new C10770fC();
            AnonymousClass05K r2 = this.$subscriptionCount;
            C18480tE r0 = new C18480tE(obj2, (Object) r3, 4);
            this.label = 1;
            if (r2.B36(this, r0) == r6) {
                return r6;
            }
        } else if (i != 1) {
            throw AnonymousClass000.A0e();
        } else {
            AnonymousClass0AN.A00(obj);
        }
        throw new C13170jR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C14140l3) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
