package X;

import android.os.ConditionVariable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2l7  reason: invalid class name and case insensitive filesystem */
public class C50562l7 extends C592133b {
    public C50562l7(List list) {
        AnonymousClass6QB A0q = C36441kJ.A0q("user_initiated_extension");
        if (C203539oF.A0Y(list, 1, 100)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C592133b.A01(A0q, it);
            }
        }
        C592133b.A00(A0q, this);
    }

    public C50562l7(C185698ue r4, C16510pM r5) {
        AnonymousClass6QB A0q = C36441kJ.A0q("message");
        ConditionVariable conditionVariable = C18740tg.A00;
        A0q.A06(r4.A00);
        C18740tg.A0D(true, "Expected mixinGroup to be nonnull");
        A0q.A06(((C592133b) r5).A00);
        C592133b.A00(A0q, this);
    }

    public C50562l7(Long l, String str, String str2, String str3, String str4, String str5) {
        AnonymousClass6QB A0q = C36441kJ.A0q("extension_screen");
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0q, "extension_id", str);
        }
        if (C203539oF.A0P(str2, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0q, "session_id", str2);
        }
        if (C203539oF.A0L(l, 0, 9007199254740991L, false)) {
            C36411kG.A1K(A0q, "t", l.longValue());
        }
        if (C203539oF.A0P(str3, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0q, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str3);
        }
        if (C203539oF.A0P(str4, 0, 9007199254740991L, true)) {
            C36331k8.A1D(A0q, "entry_point", str4);
        }
        AnonymousClass6QB A0q2 = C36441kJ.A0q("data");
        String str6 = str5;
        if (C203539oF.A0P(str6, 0, 9007199254740991L, false)) {
            A0q2.A07(str6);
        }
        C36361kB.A1H(A0q2, A0q);
        C592133b.A00(A0q, this);
    }

    public C50562l7(AnonymousClass147 r3, C185698ue r4) {
        AnonymousClass6QB A0q = C36441kJ.A0q("message");
        C36351kA.A1I(r3, A0q, "from");
        ConditionVariable conditionVariable = C18740tg.A00;
        A0q.A06(r4.A00);
        C592133b.A00(A0q, this);
    }

    public C50562l7(C28981Uw r3, C185698ue r4) {
        AnonymousClass6QB A0q = C36441kJ.A0q("message");
        C36351kA.A1I(r3, A0q, "from");
        ConditionVariable conditionVariable = C18740tg.A00;
        A0q.A06(r4.A00);
        C592133b.A00(A0q, this);
    }

    public C50562l7(UserJid userJid) {
        AnonymousClass6QB A0q = C36441kJ.A0q("contact");
        if (C203539oF.A0N(userJid, PublicKeyCredentialControllerUtility.JSON_KEY_USER)) {
            C36351kA.A1I(userJid, A0q, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        }
        C592133b.A00(A0q, this);
    }

    public C50562l7(C185708uf r3) {
        AnonymousClass6QB A0q = C36441kJ.A0q("amount");
        ConditionVariable conditionVariable = C18740tg.A00;
        A0q.A06(r3.A00);
        C592133b.A00(A0q, this);
    }

    public C50562l7(C185718ug r3) {
        AnonymousClass6QB A0q = C36441kJ.A0q("extension_screen");
        ConditionVariable conditionVariable = C18740tg.A00;
        A0q.A06(r3.A00);
        C592133b.A00(A0q, this);
    }
}
