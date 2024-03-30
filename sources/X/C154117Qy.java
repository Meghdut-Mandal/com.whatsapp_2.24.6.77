package X;

import java.util.List;

/* renamed from: X.7Qy  reason: invalid class name and case insensitive filesystem */
public final class C154117Qy extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ List $toPlace;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154117Qy(List list) {
        super(1);
        this.$toPlace = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = this.$toPlace;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass011 r0 = (AnonymousClass011) list.get(i);
                AnonymousClass6WO.A00((AnonymousClass6Q4) r0.first, 0.0f, ((AnonymousClass6TU) r0.second).A00);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
