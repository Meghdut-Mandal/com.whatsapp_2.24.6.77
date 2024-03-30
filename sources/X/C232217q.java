package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.17q  reason: invalid class name and case insensitive filesystem */
public class C232217q extends C19580wB {
    public void A00(UserJid userJid, Set set, Set set2) {
        if (!set.isEmpty() || !set2.isEmpty()) {
            for (AnonymousClass4QJ Bk5 : getObservers()) {
                Bk5.Bk5(userJid, set, set2);
            }
        }
    }
}
