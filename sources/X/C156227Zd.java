package X;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.7Zd  reason: invalid class name and case insensitive filesystem */
public final class C156227Zd extends AnonymousClass00R implements C009003v {
    public static final C156227Zd A00 = new C156227Zd();

    public C156227Zd() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Collection collection = (Collection) obj;
        Collection collection2 = (Collection) obj2;
        if (collection == null) {
            return collection2;
        }
        ArrayList A15 = C36441kJ.A15(collection);
        A15.addAll(collection2);
        return A15;
    }
}
