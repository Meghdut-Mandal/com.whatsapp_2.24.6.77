package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7Zo  reason: invalid class name and case insensitive filesystem */
public final class C156337Zo extends AnonymousClass00R implements C009003v {
    public static final C156337Zo A00 = new C156337Zo();

    public C156337Zo() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass7bM r7 = (AnonymousClass7bM) obj;
        List list = ((AnonymousClass75Q) obj2).A01;
        ArrayList A0r = C36361kB.A0r(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0r.add(AnonymousClass6JC.A00(AnonymousClass6JC.A07, r7, list.get(i)));
        }
        return A0r;
    }
}
