package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.3pK  reason: invalid class name and case insensitive filesystem */
public class C76713pK implements C236119d {
    public final AnonymousClass1NG A00;
    public final C19970wo A01;
    public final C19420v0 A02;
    public final AnonymousClass19A A03;
    public final AnonymousClass3EB A04;

    public void BiM(C203399nx r10, String str) {
        C203399nx A0c = r10.A0c("list");
        if (A0c != null) {
            HashSet A16 = C36441kJ.A16();
            HashMap A0J = AnonymousClass001.A0J();
            String A0x = C36391kE.A0x(A0c, "dhash");
            C203399nx[] r8 = A0c.A02;
            if (r8 != null) {
                for (C203399nx r3 : r8) {
                    C203399nx.A0A(r3, "item");
                    Jid A0X = r3.A0X(UserJid.class, "jid");
                    String A0x2 = C36391kE.A0x(r3, "display_name");
                    if (!AnonymousClass14B.A0F(A0x2) && (A0X instanceof C223313w)) {
                        A0J.put(A0X, A0x2);
                    }
                    A16.add(A0X);
                }
            }
            this.A00.A0L(A0x, A0J, A16);
        } else {
            C36341k9.A0w(C19420v0.A00(this.A02), "block_list_receive_time", C19970wo.A00(this.A01));
        }
        AnonymousClass3EB r1 = this.A04;
        if (r1 != null) {
            r1.A00(4);
        }
    }

    public C76713pK(AnonymousClass1NG r1, C19970wo r2, C19420v0 r3, AnonymousClass19A r4, AnonymousClass3EB r5) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
    }

    public void BVN(String str) {
        C36321k7.A1Q("getblocklistprotocolhelper/onDeliveryFailure iq=", str, AnonymousClass000.A0u());
    }

    public void BWw(C203399nx r4, String str) {
        int A002 = AnonymousClass3ME.A00(r4);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("getblocklistprotocolhelper/onError, iq=");
        A0u.append(str);
        C36321k7.A1T("; errorCode=", A0u, A002);
    }
}
