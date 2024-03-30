package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0lF  reason: invalid class name and case insensitive filesystem */
public final class C14200lF extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Object $initialValue;
    public final /* synthetic */ AnonymousClass05J $shared;
    public final /* synthetic */ AnonymousClass05H $upstream;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14200lF(Object obj, C023509x r3, AnonymousClass05H r4, AnonymousClass05J r5) {
        super(2, r3);
        this.$upstream = r4;
        this.$shared = r5;
        this.$initialValue = obj;
    }

    public final C023509x create(Object obj, C023509x r6) {
        C14200lF r0 = new C14200lF(this.$initialValue, r6, this.$upstream, this.$shared);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            int ordinal = ((C05070Ne) this.L$0).ordinal();
            if (ordinal == 0) {
                AnonymousClass05H r1 = this.$upstream;
                AnonymousClass05J r0 = this.$shared;
                this.label = 1;
                if (r1.B36(this, r0) == r4) {
                    return r4;
                }
            } else if (ordinal == 2) {
                Object obj2 = this.$initialValue;
                AnonymousClass035 r12 = AnonymousClass0RX.A00;
                AnonymousClass05J r02 = this.$shared;
                if (obj2 == r12) {
                    r02.BoY();
                } else {
                    r02.BwB(obj2);
                }
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C14200lF) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
