package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;

/* renamed from: X.3EZ  reason: invalid class name */
public final class AnonymousClass3EZ {
    public final C19700wN A00;
    public final AnonymousClass1LV A01;
    public final AnonymousClass4TD A02;
    public final AnonymousClass147 A03;
    public final AnonymousClass19A A04;

    public final void A00(GroupJid groupJid) {
        AnonymousClass19A r9 = this.A04;
        String A09 = r9.A09();
        AnonymousClass1LV r0 = this.A01;
        AnonymousClass147 r5 = this.A03;
        GroupJid A012 = r0.A01(r5);
        ArrayList A0I = AnonymousClass001.A0I();
        C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "sub_group", A0I);
        A0I.add(new AnonymousClass1AL((Jid) groupJid, "jid"));
        if (A012 != null) {
            A0I.add(new AnonymousClass1AL((Jid) A012, "sub_group_jid"));
        }
        C203399nx r3 = new C203399nx("query_linked", (AnonymousClass1AL[]) A0I.toArray(new AnonymousClass1AL[0]));
        AnonymousClass1AL[] r2 = new AnonymousClass1AL[4];
        C36331k8.A1R(A09, r2, 0);
        C36341k9.A1S(r2, 1);
        C36331k8.A1B(r5, "get", r2, 2);
        r9.A0E(new C76563p5(this.A00, this.A02), C36391kE.A0m(r3, r2), A09, 298, 32000);
    }

    public AnonymousClass3EZ(C19700wN r1, AnonymousClass1LV r2, AnonymousClass4TD r3, AnonymousClass147 r4, AnonymousClass19A r5) {
        C36321k7.A12(r1, r5, r2);
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
    }
}
