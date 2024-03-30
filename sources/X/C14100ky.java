package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {232}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0ky  reason: invalid class name and case insensitive filesystem */
public final class C14100ky extends AnonymousClass0A1 implements C006302t {
    public final /* synthetic */ AnonymousClass05G $downstream;
    public final /* synthetic */ C10810fG $lastValue;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14100ky(C023509x r2, C10810fG r3, AnonymousClass05G r4) {
        super(1, r2);
        this.$downstream = r4;
        this.$lastValue = r3;
    }

    public final C023509x create(C023509x r4) {
        return new C14100ky(r4, this.$lastValue, this.$downstream);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((C14100ky) create((C023509x) obj)).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05G r2 = this.$downstream;
            AnonymousClass035 r1 = C05980Rv.A01;
            Object obj2 = this.$lastValue.element;
            if (obj2 == r1) {
                obj2 = null;
            }
            this.label = 1;
            if (r2.B6N(obj2, this) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        this.$lastValue.element = null;
        return AnonymousClass0AJ.A00;
    }
}
