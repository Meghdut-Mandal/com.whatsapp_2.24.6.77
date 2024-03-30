package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0l9  reason: invalid class name */
public final class AnonymousClass0l9 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass05H[] $flows;
    public final /* synthetic */ C019508h $transform$inlined;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0l9(C023509x r2, C019508h r3, AnonymousClass05H[] r4) {
        super(2, r2);
        this.$flows = r4;
        this.$transform$inlined = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        AnonymousClass0l9 r0 = new AnonymousClass0l9(r5, this.$transform$inlined, this.$flows);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05H[] r4 = this.$flows;
            C14550lo r3 = C14550lo.A00;
            C14280lN r0 = new C14280lN((C023509x) null, this.$transform$inlined);
            this.label = 1;
            if (AnonymousClass0R5.A00(this, r3, r0, (AnonymousClass05G) this.L$0, r4) == r7) {
                return r7;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass0l9) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
