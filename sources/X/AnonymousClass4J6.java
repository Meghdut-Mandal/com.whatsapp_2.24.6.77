package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4J6  reason: invalid class name */
public final class AnonymousClass4J6 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C40951wN $adapter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4J6(C40951wN r2) {
        super(1);
        this.$adapter = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C40951wN r3 = this.$adapter;
        AnonymousClass00C.A0B(list);
        ArrayList A0l = C36341k9.A0l(list);
        A0l.addAll(list);
        List list2 = r3.A00;
        C36341k9.A1A(new C40191v6(list2, list), r3, A0l, list2);
        return AnonymousClass0AJ.A00;
    }
}
