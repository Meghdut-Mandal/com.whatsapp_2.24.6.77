package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {242}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
/* renamed from: X.0lE  reason: invalid class name and case insensitive filesystem */
public final class C14190lE extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass05G $downstream;
    public final /* synthetic */ C10810fG $lastValue;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14190lE(C023509x r2, C10810fG r3, AnonymousClass05G r4) {
        super(2, r2);
        this.$lastValue = r3;
        this.$downstream = r4;
    }

    public final C023509x create(Object obj, C023509x r5) {
        C14190lE r0 = new C14190lE(r5, this.$lastValue, this.$downstream);
        r0.L$0 = obj;
        return r0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C14190lE) create(new AnonymousClass0X8(((AnonymousClass0X8) obj).A00), (C023509x) obj2)).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C10810fG r4;
        AnonymousClass0n9 r0;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            Object obj2 = ((AnonymousClass0X8) this.L$0).A00;
            r4 = this.$lastValue;
            boolean z = obj2 instanceof C06340Tf;
            if (!z) {
                r4.element = obj2;
            }
            AnonymousClass05G r2 = this.$downstream;
            if (z) {
                if (!(obj2 instanceof AnonymousClass0n9) || (r0 = (AnonymousClass0n9) obj2) == null || (r0 = r0.A00) == null) {
                    Object obj3 = r4.element;
                    if (obj3 != null) {
                        if (obj3 == C05980Rv.A01) {
                            obj3 = null;
                        }
                        this.L$0 = obj2;
                        this.L$1 = r4;
                        this.label = 1;
                        if (r2.B6N(obj3, this) == r6) {
                            return r6;
                        }
                    }
                }
                throw r0;
            }
            return AnonymousClass0AJ.A00;
        } else if (i == 1) {
            r4 = (C10810fG) this.L$1;
            AnonymousClass0AN.A00(obj);
        } else {
            Throwable th = AnonymousClass000.A0e();
            throw th;
        }
        r4.element = C05980Rv.A00;
        return AnonymousClass0AJ.A00;
    }
}
