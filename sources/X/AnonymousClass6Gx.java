package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.6Gx  reason: invalid class name */
public abstract class AnonymousClass6Gx {
    public static final ArrayList A00(AnonymousClass16D r4, Collection collection, Set set) {
        ArrayList A0I = AnonymousClass001.A0I();
        if (set.containsAll(collection)) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AnonymousClass11F A0a = C36401kF.A0a(it);
                if (!collection.contains(A0a)) {
                    AnonymousClass00C.A0E(A0a, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                    if (r4.A0q((UserJid) A0a)) {
                        A0I.add(A0a);
                    }
                }
            }
        }
        return A0I;
    }
}
