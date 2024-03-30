package X;

import java.util.List;

/* renamed from: X.7RC  reason: invalid class name */
public final class AnonymousClass7RC extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ List $it;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7RC(List list) {
        super(1);
        this.$it = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = this.$it;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C006302t) list.get(i)).invoke(obj);
        }
        return AnonymousClass0AJ.A00;
    }
}
