package X;

import android.os.ConditionVariable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3DO  reason: invalid class name */
public final class AnonymousClass3DO {
    public final C220412q A00;
    public final C196139Xw A01;

    public AnonymousClass3DO(C220412q r2, C196139Xw r3) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final C203399nx A00(C28981Uw r13, String str, String str2, List list) {
        String str3;
        C44072La r1;
        List list2 = list;
        C36321k7.A11(str2, r13, list2);
        ArrayList A0J = C36321k7.A0J(list2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            A0J.add(new C50562l7(r13, this.A01.A02(C36391kE.A0l(it), str2)));
        }
        C65073Qp A0W = C36371kC.A0W(this.A00, r13);
        if (!(A0W instanceof C44072La) || (r1 = (C44072La) A0W) == null || (str3 = r1.A0K) == null) {
            str3 = "";
        }
        ArrayList arrayList = C50602lB.A00;
        C50602lB r3 = new C50602lB(C55312uQ.A00(str2));
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C36331k8.A1C(A0T, str);
        AnonymousClass6QB A0q = C36441kJ.A0q("spam_list");
        C36351kA.A1I(r13, A0q, "jid");
        if (C203539oF.A0P(str3, 0, 65536, false)) {
            C36331k8.A1D(A0q, "subject", str3);
        }
        if (C203539oF.A0Y(A0J, 0, 30)) {
            Iterator it2 = A0J.iterator();
            while (it2.hasNext()) {
                C592133b.A01(A0q, it2);
            }
        }
        C36361kB.A1H(A0q, A0T);
        ConditionVariable conditionVariable = C18740tg.A00;
        A0T.A06(r3.A00);
        return A0T.A03();
    }
}
