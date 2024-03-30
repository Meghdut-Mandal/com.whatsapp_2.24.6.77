package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7Zj  reason: invalid class name and case insensitive filesystem */
public final class C156287Zj extends AnonymousClass00R implements C009003v {
    public static final C156287Zj A00 = new C156287Zj();

    public C156287Zj() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass7bM r6 = (AnonymousClass7bM) obj;
        List list = (List) obj2;
        ArrayList A0r = C36361kB.A0r(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0r.add(AnonymousClass6JC.A00(AnonymousClass6JC.A02, r6, list.get(i)));
        }
        return A0r;
    }
}
