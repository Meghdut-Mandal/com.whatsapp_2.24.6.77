package X;

import android.os.ConditionVariable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.3Ct  reason: invalid class name and case insensitive filesystem */
public final class C61613Ct {
    public final C196139Xw A00;

    public C61613Ct(C196139Xw r1) {
        this.A00 = r1;
    }

    public final C203399nx A00(C177528dw r8, AnonymousClass3T1 r9, String str, String str2) {
        C36321k7.A11(str2, r8, r9);
        C196139Xw r0 = this.A00;
        C185718ug A002 = r0.A00(r8);
        C185698ue A02 = r0.A02(r9, str2);
        ArrayList arrayList = C50602lB.A00;
        C50602lB r5 = new C50602lB(C55312uQ.A00(str2));
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C36331k8.A1C(A0T, str);
        AnonymousClass6QB A0q = C36441kJ.A0q("spam_list");
        C36351kA.A1I(r8, A0q, "jid");
        AnonymousClass6QB A0q2 = C36441kJ.A0q("message");
        C36351kA.A1I(r8, A0q2, "from");
        ConditionVariable conditionVariable = C18740tg.A00;
        A0q2.A06(A02.A00);
        C36361kB.A1H(A0q2, A0q);
        if (A002 != null) {
            A0q.A06(A002.A00);
        }
        C36361kB.A1H(A0q, A0T);
        A0T.A06(r5.A00);
        return A0T.A03();
    }
}
