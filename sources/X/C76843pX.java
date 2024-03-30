package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3pX  reason: invalid class name and case insensitive filesystem */
public class C76843pX implements C236119d {
    public final AnonymousClass19A A00;

    public void A00(String str, String str2) {
        AnonymousClass19A r6 = this.A00;
        String A09 = r6.A09();
        ArrayList arrayList = C50662lH.A00;
        C177588e2 r2 = C177588e2.A00;
        byte[] bytes = str.getBytes();
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, "xmlns", "md");
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C36351kA.A1I(r2, A0T, "to");
        if (C203539oF.A0P(A09, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09);
        }
        AnonymousClass6QB A0q = C36441kJ.A0q("link_code_companion_reg");
        C36331k8.A1D(A0q, "stage", "refresh_code");
        A0q.A08(str2, "force_manual_refresh", C50662lH.A00);
        AnonymousClass6QB A0q2 = C36441kJ.A0q("link_code_pairing_ref");
        C203539oF.A0I(bytes, -9007199254740991L, 9007199254740991L);
        A0q2.A01 = bytes;
        C36361kB.A1H(A0q2, A0q);
        C36361kB.A1H(A0q, A0T);
        r6.A0E(this, A0T.A03(), A09, 372, 120000);
    }

    public void BVN(String str) {
        Log.w("LinkCodeRefreshCodeProtocolHelper/sendRefreshCodeIq onDeliveryFailure");
    }

    public void BiM(C203399nx r1, String str) {
    }

    public C76843pX(AnonymousClass19A r1) {
        this.A00 = r1;
    }

    public void BWw(C203399nx r4, String str) {
        String str2;
        Pair A01 = AnonymousClass3ME.A01(r4);
        if (A01 != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("LinkCodeRefreshCodeProtocolHelper/sendRefreshCodeIq error code=");
            A0u.append(A01.first);
            A0u.append("; text=");
            str2 = AnonymousClass000.A0q((String) A01.second, A0u);
        } else {
            str2 = "LinkCodeRefreshCodeProtocolHelper/sendRefreshCodeIq unknown code";
        }
        Log.e(str2);
    }
}
