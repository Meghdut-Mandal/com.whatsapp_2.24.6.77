package com.whatsapp.group;

import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass143;
import X.AnonymousClass3OQ;
import X.AnonymousClass3TE;
import X.AnonymousClass4GR;
import X.AnonymousClass4GS;
import X.AnonymousClass4GT;
import X.C000800j;
import X.C001400p;
import X.C009504a;
import X.C009904e;
import X.C18800tq;
import X.C36331k8;
import X.C36351kA;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C58272zb;
import X.C609539z;
import X.C65673Ta;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Collection;

public final class NewGroupRouter extends Hilt_NewGroupRouter {
    public static final AnonymousClass3OQ A0A = new AnonymousClass3OQ();
    public C58272zb A00;
    public final AnonymousClass00T A01;
    public final AnonymousClass00T A02 = AnonymousClass3TE.A03(this, "create_lazily", false);
    public final AnonymousClass00T A03 = AnonymousClass3TE.A03(this, "duplicate_ug_found", false);
    public final AnonymousClass00T A04 = AnonymousClass3TE.A02(this, "entry_point", -1);
    public final AnonymousClass00T A05;
    public final AnonymousClass00T A06;
    public final AnonymousClass00T A07 = AnonymousClass3TE.A03(this, "optional_participants", false);
    public final AnonymousClass00T A08;
    public final AnonymousClass00T A09;

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        if (bundle == null) {
            C36331k8.A0y(this.A0F);
            C58272zb r0 = this.A00;
            if (r0 != null) {
                Context A0a = A0a();
                AnonymousClass01I A0i = A0i();
                C18800tq r02 = r0.A00.A02;
                C609539z r4 = new C609539z(A0i, A0a, this, C36351kA.A0J(r02), C36351kA.A0a(r02));
                r4.A00 = r4.A03.BnD(new C65673Ta(r4, 5), new C009504a());
                Context A0a2 = A0a();
                Intent A0D = C36431kI.A0D();
                A0D.setClassName(A0a2.getPackageName(), "com.whatsapp.group.newgroup.NewGroup");
                A0D.putExtra("duplicate_ug_exists", C36331k8.A1b(this.A03));
                A0D.putExtra("entry_point", C36331k8.A02(this.A04));
                A0D.putExtra("create_group_for_community", C36331k8.A1b(this.A02));
                A0D.putExtra("optional_participants", C36331k8.A1b(this.A07));
                A0D.putExtra("selected", AnonymousClass143.A07((Collection) this.A09.getValue()));
                A0D.putExtra("parent_group_jid_to_link", C36381kD.A0w(C36441kJ.A0m(this.A08)));
                A0D.putExtra("messages_to_forward_bundle", (Bundle) this.A06.getValue());
                A0D.putExtra("include_captions", C36331k8.A1b(this.A05));
                A0D.putExtra("appended_message", C36431kI.A1E(this.A01));
                C009904e r03 = r4.A00;
                if (r03 != null) {
                    r03.A02(A0D);
                    return;
                }
                throw C36331k8.A0d("createGroup");
            }
            throw C36331k8.A0d("createGroupResultHandlerFactory");
        }
    }

    public NewGroupRouter() {
        C000800j r3 = C000800j.NONE;
        this.A09 = C001400p.A00(r3, new AnonymousClass4GT(this));
        this.A08 = C001400p.A00(r3, new AnonymousClass4GS(this));
        this.A06 = C001400p.A00(r3, new AnonymousClass4GR(this));
        this.A05 = AnonymousClass3TE.A03(this, "include_captions", false);
        this.A01 = AnonymousClass3TE.A00(this, "appended_message");
    }
}
