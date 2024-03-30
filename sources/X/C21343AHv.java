package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.community.JoinGroupBottomSheetFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.AHv  reason: case insensitive filesystem */
public final class C21343AHv implements C236119d {
    public final /* synthetic */ C225314u A00;
    public final /* synthetic */ AnonymousClass9Nc A01;
    public final /* synthetic */ C186018vH A02;

    public void BWw(C203399nx r1, String str) {
    }

    public void BiM(C203399nx r22, String str) {
        C203399nx r1 = r22;
        AnonymousClass00C.A0D(r1, 1);
        C203399nx A0e = C90514aH.A0e(r1, this.A02);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        C203379ns.A03(r1, cls, A0P, A0Q, "result", strArr, false);
        String[] A0l = C165617ti.A0l();
        Class<Jid> cls2 = Jid.class;
        C203539oF r3 = C203379ns.A00;
        C203379ns.A03(r1, cls2, A0P, A0Q, r3.A0Z(A0e, cls2, A0P, A0Q, (Object) null, new String[]{"to"}, false), A0l, true);
        String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        C203379ns.A03(r1, cls, A0P, A0Q, r3.A0Z(A0e, cls, A0P, A0Q, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), strArr2, true);
        ArrayList A09 = C203539oF.A09(r1, C21458AMg.A00, new String[]{"pre_reg_add_requests", "add_request"}, 0, 1024);
        if (C36411kG.A1a(A09)) {
            AnonymousClass03X.A08(A09, new C23176B8k(C22554Aof.A00, 6));
            C225314u r2 = this.A00;
            if (!AnonymousClass3SJ.A04(r2)) {
                C65443Sb.A02(JoinGroupBottomSheetFragment.A05((AnonymousClass147) ((C184328sG) ((C184068rq) A09.get(0)).A00).A03, (UserJid) ((C184068rq) ((C184328sG) ((C184068rq) A09.get(0)).A00).A00).A00, ((C183998rj) ((C184328sG) ((C184068rq) A09.get(0)).A00).A01).A00, C165587tf.A0B(((C184328sG) ((C184068rq) A09.get(0)).A00).A02)), r2.getSupportFragmentManager());
            }
        }
    }

    public C21343AHv(C225314u r1, AnonymousClass9Nc r2, C186018vH r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BVN(String str) {
        this.A01.A00 = false;
    }
}
