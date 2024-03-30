package X;

import java.util.List;

/* renamed from: X.7Qw  reason: invalid class name and case insensitive filesystem */
public final class C154097Qw extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ List $placeables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154097Qw(List list) {
        super(1);
        this.$placeables = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6WO r6 = (AnonymousClass6WO) obj;
        List list = this.$placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r6.A04((AnonymousClass6Q4) list.get(i), 0, 0);
        }
        return AnonymousClass0AJ.A00;
    }
}
