package X;

import java.util.List;

/* renamed from: X.4Lq  reason: invalid class name and case insensitive filesystem */
public final class C86624Lq extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C40391vT $adapter;
    public final /* synthetic */ int $position;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86624Lq(C40391vT r2, int i) {
        super(1);
        this.$position = i;
        this.$adapter = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list;
        C62733Hi r0 = (C62733Hi) C007103b.A0P(((C62743Hj) obj).A00, this.$position);
        C40391vT r1 = this.$adapter;
        if (r0 != null) {
            list = r0.A01;
        } else {
            list = C023409w.A00;
        }
        r1.A0M(list);
        return AnonymousClass0AJ.A00;
    }
}
