package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.3p5  reason: invalid class name and case insensitive filesystem */
public final class C76563p5 implements C236119d {
    public final C19700wN A00;
    public final AnonymousClass4TD A01;

    public void BVN(String str) {
    }

    public void BWw(C203399nx r3, String str) {
        AnonymousClass00C.A0D(r3, 1);
        this.A01.onError(AnonymousClass3ME.A00(r3));
    }

    public void BiM(C203399nx r20, String str) {
        C203399nx r1 = r20;
        C36331k8.A1I(str, r1);
        C203399nx A0c = r1.A0c("linked_group");
        if (A0c != null) {
            List A0j = A0c.A0j("group");
            AnonymousClass00C.A08(A0j);
            if (!A0j.isEmpty()) {
                C203399nx r2 = (C203399nx) A0j.get(0);
                UserJid userJid = (UserJid) r2.A0X(UserJid.class, "creator");
                long A012 = AnonymousClass6R8.A01(r2.A0i("creation", (String) null), 0) * 1000;
                String A0i = r2.A0i("subject", (String) null);
                long A013 = AnonymousClass6R8.A01(r2.A0i("s_t", (String) null), 0) * 1000;
                int i = 0;
                if (r2.A0c("default_sub_group") != null) {
                    i = 3;
                }
                String A0i2 = r2.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
                if (A0i2 != null) {
                    boolean A1Z = C36331k8.A1Z(r2, "admin_request_required");
                    try {
                        LinkedHashMap A06 = AnonymousClass3UA.A06(r2, this.A00);
                        this.A01.Bhz(AnonymousClass143.A02(A0i2), userJid, AnonymousClass3UA.A04(r2), A0i, A06, C36371kC.A05(r2, A06), i, AnonymousClass3MD.A00(r2), A012, A013, A1Z);
                    } catch (C19740wR e) {
                        Log.e("GetSubgroupInfoProtocolCallbackonSuccess/invalid jid exception", e);
                    }
                }
            }
        }
    }

    public C76563p5(C19700wN r1, AnonymousClass4TD r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
