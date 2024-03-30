package X;

import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.3Cd  reason: invalid class name and case insensitive filesystem */
public final class C61503Cd {
    public final AnonymousClass19A A00;

    public C61503Cd(AnonymousClass19A r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final void A00(AnonymousClass4U5 r20, AnonymousClass147 r21, List list) {
        AnonymousClass147 r6 = r21;
        List list2 = list;
        int A1a = C36341k9.A1a(r6, list2);
        AnonymousClass19A r12 = this.A00;
        String A09 = r12.A09();
        int size = list2.size();
        C203399nx[] r8 = new C203399nx[size];
        int i = 0;
        while (true) {
            AnonymousClass1AL[] r2 = new AnonymousClass1AL[A1a];
            if (i < size) {
                r2[0] = new AnonymousClass1AL((Jid) list2.get(i), "jid");
                r8[i] = new C203399nx("group", r2);
                i++;
            } else {
                C36341k9.A1L("link_type", "sub_group", r2, 0);
                C203399nx r22 = new C203399nx(new C203399nx("link", r2, r8), "links", (AnonymousClass1AL[]) null);
                AnonymousClass1AL[] r1 = new AnonymousClass1AL[4];
                C36331k8.A1R(A09, r1, 0);
                C36341k9.A1S(r1, A1a);
                C36331k8.A1B(r6, "set", r1, 2);
                r12.A0E(new C76503oy(r20), C36391kE.A0m(r22, r1), A09, 301, 32000);
                return;
            }
        }
    }
}
