package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Kz  reason: invalid class name and case insensitive filesystem */
public final class C86454Kz extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ List $excludeLidWithoutDisplayName;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86454Kz(List list) {
        super(1);
        this.$excludeLidWithoutDisplayName = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        List list = this.$excludeLidWithoutDisplayName;
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (AnonymousClass00C.A0J(it.next(), obj)) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
