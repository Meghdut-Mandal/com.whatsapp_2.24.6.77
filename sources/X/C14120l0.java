package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0l0  reason: invalid class name and case insensitive filesystem */
public final class C14120l0 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ int I$0;
    public int label;

    public C14120l0(C023509x r2) {
        super(2, r2);
    }

    public final C023509x create(Object obj, C023509x r4) {
        C14120l0 r1 = new C14120l0(r4);
        r1.I$0 = AnonymousClass000.A0I(obj);
        return r1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            return Boolean.valueOf(AnonymousClass000.A1R(this.I$0));
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C14120l0) create(Integer.valueOf(AnonymousClass000.A0I(obj)), (C023509x) obj2)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
