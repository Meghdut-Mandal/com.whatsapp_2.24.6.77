package X;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.7ZW  reason: invalid class name */
public final class AnonymousClass7ZW extends AnonymousClass00R implements C009003v {
    public static final AnonymousClass7ZW A00 = new AnonymousClass7ZW();

    public AnonymousClass7ZW() {
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
