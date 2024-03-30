package com.whatsapp.group;

import X.AnonymousClass147;
import X.AnonymousClass17X;
import X.AnonymousClass22g;
import X.AnonymousClass27v;
import X.AnonymousClass6PM;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C19730wQ;
import X.C225614x;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36381kD;
import X.C89334Wd;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public class EditGroupAdminsSelector extends AnonymousClass27v {
    public AnonymousClass17X A00;
    public boolean A01;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            AnonymousClass22g.A0l(this);
            AnonymousClass22g.A0h(r2, r1, this);
            AnonymousClass22g.A0L(A0L, r2, this);
            this.A00 = C36351kA.A0b(r2);
        }
    }

    public EditGroupAdminsSelector(int i) {
        this.A01 = false;
        C89334Wd.A00(this, 33);
    }

    public void A42(ArrayList arrayList) {
        String stringExtra = getIntent().getStringExtra("gid");
        C18740tg.A06(stringExtra);
        AnonymousClass147 A06 = AnonymousClass147.A01.A06(stringExtra);
        if (A06 != null) {
            C225614x it = C36381kD.A0R(this.A00, A06).iterator();
            while (it.hasNext()) {
                AnonymousClass6PM r1 = (AnonymousClass6PM) it.next();
                C19730wQ r0 = this.A02;
                UserJid userJid = r1.A03;
                if (!r0.A0M(userJid) && r1.A01 != 2) {
                    C36381kD.A1H(this.A09, userJid, arrayList);
                }
            }
        }
    }

    public EditGroupAdminsSelector() {
        this(0);
    }
}
