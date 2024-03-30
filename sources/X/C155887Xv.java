package X;

import java.util.List;

/* renamed from: X.7Xv  reason: invalid class name and case insensitive filesystem */
public final class C155887Xv extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ C009003v $save;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155887Xv(C009003v r2) {
        super(2);
        this.$save = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C160267kj r0;
        AnonymousClass7bM r6 = (AnonymousClass7bM) obj;
        List list = (List) this.$save.invoke(r6, obj2);
        int size = list.size();
        int i = 0;
        while (i < size) {
            Object obj3 = list.get(i);
            if (obj3 == null || (r0 = ((C137036fU) r6).A01) == null || r0.B2M(obj3)) {
                i++;
            } else {
                throw AnonymousClass001.A08("item can't be saved");
            }
        }
        if (C36401kF.A1a(list)) {
            return C36441kJ.A15(list);
        }
        return null;
    }
}
