package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.2lF  reason: invalid class name and case insensitive filesystem */
public class C50642lF extends C50492l0 implements C16510pM {
    public C50642lF(Jid jid, int i) {
        String str;
        AnonymousClass6QB A0q = C36441kJ.A0q("message");
        List asList = Arrays.asList(new Class[]{AnonymousClass148.class, UserJid.class});
        if (i != 0) {
            str = "from";
        } else {
            str = "to";
        }
        if (C203539oF.A0J(jid, str, asList, false)) {
            C36351kA.A1I(jid, A0q, str);
        }
        C592133b.A00(A0q, this);
    }
}
