package X;

import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4JL  reason: invalid class name */
public final class AnonymousClass4JL extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ List $suggestionsKeys;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4JL(List list) {
        super(1);
        this.$suggestionsKeys = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        UserJid userJid;
        AnonymousClass3KN r6 = (AnonymousClass3KN) obj;
        List list = this.$suggestionsKeys;
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C63123Iv r2 = (C63123Iv) it.next();
                if (AnonymousClass00C.A0J(r2.A00, r6.A02) && ((userJid = r2.A01) == null || userJid.equals(r6.A04))) {
                    break;
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
