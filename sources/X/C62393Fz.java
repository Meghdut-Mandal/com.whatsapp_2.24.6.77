package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.3Fz  reason: invalid class name and case insensitive filesystem */
public class C62393Fz {
    public final AnonymousClass19A A00;
    public final AnonymousClass4TE A01;

    public void A00(GroupJid groupJid, GroupJid groupJid2, String str, String str2, String str3, String str4, String str5) {
        String str6;
        C203399nx r2;
        AnonymousClass19A r6 = this.A00;
        GroupJid groupJid3 = groupJid2;
        Jid jid = groupJid3;
        String str7 = str3;
        boolean A1V = AnonymousClass000.A1V(str7);
        String str8 = str2;
        boolean A1V2 = AnonymousClass000.A1V(str8);
        AnonymousClass1AL[] r7 = new AnonymousClass1AL[(true + (A1V ? 1 : 0) + (A1V2 ? 1 : 0))];
        C36341k9.A1L("query", str5, r7, 0);
        String str9 = str4;
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str9, r7, 1);
        int i = 2;
        if (A1V) {
            C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str7, r7, 2);
            i = 3;
        }
        GroupJid groupJid4 = groupJid;
        if (A1V2) {
            C36341k9.A1L("invite", str8, r7, i);
            r2 = new C203399nx("picture", r7);
            if (groupJid2 == null) {
                jid = C177578e1.A00;
            }
        } else {
            C18740tg.A06(groupJid4);
            if (groupJid2 == null) {
                str6 = "parent_group";
                jid = groupJid4;
            } else {
                str6 = "sub_group";
            }
            AnonymousClass1AL[] r22 = new AnonymousClass1AL[2];
            C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str6, r22, 0);
            r22[1] = new AnonymousClass1AL(jid, "jid");
            r2 = new C203399nx(new C203399nx("query_linked", r22), "picture", r7);
            jid = groupJid4;
        }
        AnonymousClass1AL[] r3 = new AnonymousClass1AL[4];
        String str10 = str;
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str10, r3, 0);
        C36341k9.A1S(r3, 1);
        C36331k8.A1B(jid, "get", r3, 2);
        r6.A0E(new C76763pP(this.A01, groupJid3, groupJid4, str9, str7), C36391kE.A0m(r2, r3), str10, 300, 32000);
    }

    public C62393Fz(AnonymousClass4TE r1, AnonymousClass19A r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
