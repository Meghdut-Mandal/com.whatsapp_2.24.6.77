package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.6pk  reason: invalid class name and case insensitive filesystem */
public final class C142956pk implements C159207iz {
    public final /* synthetic */ AnonymousClass67M A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ Set A02;
    public final /* synthetic */ C006302t A03;

    public void BXd(C128516Co r3, int i) {
        Object r0;
        C006302t r1 = this.A03;
        if (i == -1) {
            r0 = new AnonymousClass53l();
        } else {
            r0 = new AnonymousClass53m();
        }
        r1.invoke(r0);
    }

    public C142956pk(AnonymousClass67M r1, UserJid userJid, Set set, C006302t r4) {
        this.A00 = r1;
        this.A02 = set;
        this.A01 = userJid;
        this.A03 = r4;
    }

    public void BXe(C128516Co r7, A90 a90) {
        AnonymousClass67M r5 = this.A00;
        Set set = this.A02;
        UserJid userJid = this.A01;
        LinkedHashMap A1G = C36431kI.A1G();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            A1G.put(A0C, r5.A03.A01(userJid, A0C));
        }
        this.A03.invoke(new C1030753o(A1G, false));
    }
}
