package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.7VQ  reason: invalid class name */
public final class AnonymousClass7VQ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ Set $fulfilledRequest;
    public final /* synthetic */ C006302t $onResult;
    public final /* synthetic */ int $searchQueryBusinessType;
    public final /* synthetic */ C10810fG $searchQueryResponse;
    public final /* synthetic */ C122315ue this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VQ(C122315ue r2, Set set, C006302t r4, C10810fG r5, int i) {
        super(1);
        this.this$0 = r2;
        this.$fulfilledRequest = set;
        this.$searchQueryResponse = r5;
        this.$searchQueryBusinessType = i;
        this.$onResult = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = (C110155aD) obj;
        AnonymousClass00C.A0D(obj2, 0);
        Set set = this.$fulfilledRequest;
        C10810fG r8 = this.$searchQueryResponse;
        int i = this.$searchQueryBusinessType;
        C006302t r6 = this.$onResult;
        Integer A0j = C36361kB.A0j();
        set.add(A0j);
        if (obj2 instanceof AnonymousClass51A) {
            C124875yw r13 = ((AnonymousClass51A) obj2).A00;
            List list = r13.A09;
            List list2 = ((C124875yw) r8.element).A09;
            AnonymousClass00C.A07(list2);
            list.addAll(list2);
            List list3 = r13.A0A;
            List list4 = r13.A0C;
            AnonymousClass6P1 r15 = r13.A01;
            String str = r13.A04;
            String str2 = r13.A05;
            String str3 = r13.A08;
            String str4 = r13.A07;
            int i2 = r13.A00;
            Double d = r13.A02;
            List list5 = list3;
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            AnonymousClass6P1 r14 = r15;
            Double d2 = d;
            r8.element = new C124875yw(r14, d2, str5, str6, str7, str4, r13.A06, r13.A03, list5, list, list4, r13.A0B, i2);
            if ((AnonymousClass000.A1Z(set, 4) && set.contains(A0j)) || i == 1) {
                obj2 = new AnonymousClass51A((C124875yw) r8.element);
            }
            return AnonymousClass0AJ.A00;
        }
        r6.invoke(obj2);
        return AnonymousClass0AJ.A00;
    }
}
