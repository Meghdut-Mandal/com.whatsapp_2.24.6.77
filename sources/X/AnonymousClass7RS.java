package X;

import java.util.List;

/* renamed from: X.7RS  reason: invalid class name */
public final class AnonymousClass7RS extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ List $placeables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7RS(List list) {
        super(1);
        this.$placeables = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6WO r6 = (AnonymousClass6WO) obj;
        List list = this.$placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r6.A05((AnonymousClass6Q4) list.get(i), C113565fk.A01);
        }
        return AnonymousClass0AJ.A00;
    }
}
