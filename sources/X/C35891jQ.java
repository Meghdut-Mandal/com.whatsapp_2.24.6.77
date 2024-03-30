package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1jQ  reason: invalid class name and case insensitive filesystem */
public class C35891jQ extends C592133b {
    public C35891jQ(String str, String str2, String str3) {
        AnonymousClass6QB r0 = new AnonymousClass6QB("surface");
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            r0.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
        }
        String str4 = str2;
        if (str2 != null && C203539oF.A0P(str4, 0, 9007199254740991L, true)) {
            r0.A04(new AnonymousClass1AL("promotion_id", str2));
        }
        String str5 = str3;
        if (str3 != null && C203539oF.A0P(str5, 0, 9007199254740991L, true)) {
            r0.A04(new AnonymousClass1AL("instance_id", str3));
        }
        this.A00 = r0.A03();
    }

    public C35891jQ(List list, int i) {
        AnonymousClass6QB r4;
        switch (i) {
            case 2:
                r4 = new AnonymousClass6QB("approve");
                if (C203539oF.A0Y(list, 1, 1000)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        r4.A05(((C592133b) it.next()).A00);
                    }
                    break;
                }
                break;
            case 4:
                r4 = new AnonymousClass6QB("cancel");
                if (C203539oF.A0Y(list, 1, 1000)) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        r4.A05(((C592133b) it2.next()).A00);
                    }
                    break;
                }
                break;
            default:
                r4 = new AnonymousClass6QB("reject");
                if (C203539oF.A0Y(list, 1, 1000)) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        r4.A05(((C592133b) it3.next()).A00);
                    }
                    break;
                }
                break;
        }
        this.A00 = r4.A03();
    }

    public C35891jQ(AnonymousClass147 r12, Long l) {
        AnonymousClass6QB r4 = new AnonymousClass6QB("item");
        r4.A04(new AnonymousClass1AL((Jid) r12, "jid"));
        if (C203539oF.A0L(l, -1, 9007199254740991L, false)) {
            r4.A04(new AnonymousClass1AL("mute", l.longValue()));
        }
        this.A00 = r4.A03();
    }

    public C35891jQ(AnonymousClass147 r4, UserJid userJid) {
        AnonymousClass6QB r2 = new AnonymousClass6QB("sub_group_suggestion");
        if (C203539oF.A0N(userJid, "creator")) {
            r2.A04(new AnonymousClass1AL((Jid) userJid, "creator"));
        }
        if (C203539oF.A0N(r4, "jid")) {
            r2.A04(new AnonymousClass1AL((Jid) r4, "jid"));
        }
        this.A00 = r2.A03();
    }

    public C35891jQ(Long l, int i) {
        AnonymousClass6QB r2;
        long longValue;
        String str;
        Long l2 = l;
        if (1 - i != 0) {
            r2 = new AnonymousClass6QB("api_version");
            if (C203539oF.A0L(l2, 0, 32767, false)) {
                longValue = 4;
                str = "value";
            }
            this.A00 = r2.A03();
        }
        r2 = new AnonymousClass6QB("integrator");
        if (C203539oF.A0L(l2, 1, 999, false)) {
            longValue = l.longValue();
            str = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }
        this.A00 = r2.A03();
        r2.A04(new AnonymousClass1AL(str, longValue));
        this.A00 = r2.A03();
    }

    public C35891jQ(Long l, Long l2) {
        AnonymousClass6QB r5 = new AnonymousClass6QB("get_disclosure_stage_by_id");
        if (C203539oF.A0L(l, 0, 9007199254740991L, false)) {
            r5.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, l.longValue()));
        }
        if (C203539oF.A0L(l2, 0, 9007199254740991L, false)) {
            r5.A04(new AnonymousClass1AL("t", l2.longValue()));
        }
        this.A00 = r5.A03();
    }

    public C35891jQ(String str, Long l) {
        AnonymousClass6QB r2 = new AnonymousClass6QB(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        if (C203539oF.A0P(str, 1, 100, false)) {
            r2.A04(new AnonymousClass1AL("external_id", str));
        }
        if (C203539oF.A0L(l, 1, 999, false)) {
            r2.A04(new AnonymousClass1AL("integrator_id", l.longValue()));
        }
        this.A00 = r2.A03();
    }

    public C35891jQ(AnonymousClass147 r4) {
        AnonymousClass6QB r2 = new AnonymousClass6QB("sub_group_suggestion");
        if (C203539oF.A0N(r4, "jid")) {
            r2.A04(new AnonymousClass1AL((Jid) r4, "jid"));
        }
        this.A00 = r2.A03();
    }
}
