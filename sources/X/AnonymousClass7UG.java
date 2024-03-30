package X;

import java.util.List;

/* renamed from: X.7UG  reason: invalid class name */
public final class AnonymousClass7UG extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C006302t $handler;
    public final /* synthetic */ String $parentCategoryId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UG(String str, C006302t r3) {
        super(1);
        this.$parentCategoryId = str;
        this.$handler = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C117065le r5 = (C117065le) obj;
        AnonymousClass00C.A0D(r5, 0);
        if (r5.A00) {
            C1030753o r52 = (C1030753o) r5;
            this.$handler.invoke(new C1030653n((List) C90494aF.A0Y(this.$parentCategoryId, r52.A01), r52.A00));
        } else {
            this.$handler.invoke(r5);
        }
        return AnonymousClass0AJ.A00;
    }
}
