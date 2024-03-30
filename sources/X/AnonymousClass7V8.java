package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.7V8  reason: invalid class name */
public final class AnonymousClass7V8 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ Set $fulfilledRequest;
    public final /* synthetic */ C006302t $onResult;
    public final /* synthetic */ C10810fG $searchQueryResponse;
    public final /* synthetic */ C122315ue this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7V8(C122315ue r2, Set set, C006302t r4, C10810fG r5) {
        super(1);
        this.this$0 = r2;
        this.$fulfilledRequest = set;
        this.$searchQueryResponse = r5;
        this.$onResult = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = (C110155aD) obj;
        AnonymousClass00C.A0D(obj2, 0);
        Set set = this.$fulfilledRequest;
        C10810fG r4 = this.$searchQueryResponse;
        C006302t r3 = this.$onResult;
        Integer A0o = C36371kC.A0o();
        set.add(A0o);
        if (obj2 instanceof AnonymousClass51A) {
            List list = ((C124875yw) r4.element).A09;
            List list2 = ((AnonymousClass51A) obj2).A00.A09;
            AnonymousClass00C.A07(list2);
            list.addAll(list2);
            if (set.contains(A0o) && AnonymousClass000.A1Z(set, 2)) {
                obj2 = new AnonymousClass51A((C124875yw) r4.element);
            }
            return AnonymousClass0AJ.A00;
        }
        r3.invoke(obj2);
        return AnonymousClass0AJ.A00;
    }
}
