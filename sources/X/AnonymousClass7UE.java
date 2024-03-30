package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7UE  reason: invalid class name */
public final class AnonymousClass7UE extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ List $localBusinesses;
    public final /* synthetic */ AnonymousClass6YD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UE(AnonymousClass6YD r2, List list) {
        super(1);
        this.$localBusinesses = list;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6E6 r5 = (AnonymousClass6E6) obj;
        AnonymousClass00C.A0D(r5, 0);
        List list = this.$localBusinesses;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (AnonymousClass6YD.A0A((C132056Ry) it.next(), r5.A07)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return C36441kJ.A0x(z);
    }
}
