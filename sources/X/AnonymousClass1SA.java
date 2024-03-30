package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1SA  reason: invalid class name */
public final class AnonymousClass1SA {
    public List A00;
    public Map A01;
    public final AnonymousClass16D A02;

    public AnonymousClass1SA(AnonymousClass16D r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A02 = r2;
    }

    public final List A00() {
        List list;
        List list2 = this.A00;
        if (list2 != null) {
            return list2;
        }
        synchronized (this) {
            list = this.A00;
            if (list == null) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                this.A02.A0o(copyOnWriteArrayList);
                list = C007103b.A0Y(copyOnWriteArrayList);
                this.A00 = list;
            }
            AnonymousClass00C.A0E(list, "null cannot be cast to non-null type kotlin.collections.List<com.whatsapp.data.WAContact>");
        }
        return list;
    }
}
