package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0l1  reason: invalid class name */
public final class AnonymousClass0l1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;

    public AnonymousClass0l1(C023509x r2) {
        super(2, r2);
    }

    public final C023509x create(Object obj, C023509x r3) {
        AnonymousClass0l1 r0 = new AnonymousClass0l1(r3);
        r0.L$0 = obj;
        return r0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass0l1 r1 = new AnonymousClass0l1((C023509x) obj2);
        r1.L$0 = obj;
        return r1.invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            boolean z = false;
            if (this.L$0 != C05070Ne.START) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        throw AnonymousClass000.A0e();
    }
}
