package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public class BA4 implements AnonymousClass00P, AnonymousClass00S {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    public BA4(AnonymousClass8V7 r1, String str, String str2, int i) {
        this.A03 = i;
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public final Object invoke() {
        C185718ug r6;
        int i = this.A03;
        AnonymousClass8V7 r0 = (AnonymousClass8V7) this.A00;
        if (i != 0) {
            String str = this.A01;
            String str2 = this.A02;
            AnonymousClass9N9 r2 = r0.A01;
            ArrayList A0I = AnonymousClass001.A0I();
            C203399nx.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r2.A03, A0I);
            String str3 = r2.A04;
            if (!TextUtils.isEmpty(str3)) {
                C203399nx.A0C("reason", str3, A0I);
            }
            C203399nx.A0C("catalog_session_id", r2.A05, A0I);
            if (str2 != null) {
                C203399nx.A0C("direct_connection_encrypted_info", str2, A0I);
            }
            AnonymousClass1AL[] r3 = new AnonymousClass1AL[2];
            boolean A1Y = C36371kC.A1Y(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "report_product", r3);
            r3[1] = new AnonymousClass1AL((Jid) r2.A02, "biz_jid");
            C203399nx A05 = C203399nx.A05("request", r3, C165577te.A1b(A0I, A1Y ? 1 : 0));
            AnonymousClass1AL[] r22 = new AnonymousClass1AL[4];
            C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r22, A1Y);
            C36341k9.A1L("xmlns", "fb:thrift_iq", r22, 1);
            C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r22, 2);
            C36341k9.A1V(r22, 3);
            return C36391kE.A0m(A05, r22);
        }
        String str4 = this.A01;
        String str5 = this.A02;
        AnonymousClass9N9 r23 = r0.A01;
        UserJid userJid = r23.A02;
        String str6 = r23.A03;
        C185648uZ r7 = new C185648uZ(r23.A04, 29);
        C185718ug r5 = new C185718ug(r23.A05, 19);
        if (str5 != null) {
            r6 = new C185718ug(str5, 20);
        } else {
            r6 = null;
        }
        return new C186018vH(userJid, r5, r6, r7, str4, str6);
    }
}
