package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.1a1  reason: invalid class name and case insensitive filesystem */
public class C30321a1 {
    public final AnonymousClass19A A00;

    public void A00(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("sendmethods/sendSafetyNetVerifyAppsResult appsListSize=");
        sb.append("null");
        sb.append(" errorCode=");
        sb.append(i);
        sb.append(" errorMessage=");
        sb.append(str);
        Log.i(sb.toString());
        C203399nx r2 = new C203399nx("error", str, new AnonymousClass1AL[]{new AnonymousClass1AL("code", Integer.toString(i))});
        AnonymousClass6QB r0 = new AnonymousClass6QB("verify_apps");
        r0.A05(r2);
        C203399nx A03 = r0.A03();
        AnonymousClass6QB r02 = new AnonymousClass6QB("ib");
        r02.A05(A03);
        this.A00.A0G(r02.A03(), 273);
    }

    public void A01(String str, int i, String str2) {
        C203399nx r2;
        StringBuilder sb = new StringBuilder();
        sb.append("sendmethods/sendAttestationResult jws=");
        sb.append(str);
        sb.append(" errorCode=");
        sb.append(i);
        sb.append(" errorMessage=");
        sb.append(str2);
        Log.i(sb.toString());
        if (str == null) {
            r2 = new C203399nx("error", str2, new AnonymousClass1AL[]{new AnonymousClass1AL("code", Integer.toString(i))});
        } else {
            r2 = new C203399nx("jws", str, (AnonymousClass1AL[]) null);
        }
        this.A00.A0G(new C203399nx(new C203399nx(r2, PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION, (AnonymousClass1AL[]) null), "ib", (AnonymousClass1AL[]) null), 194);
    }

    public C30321a1(AnonymousClass19A r1) {
        this.A00 = r1;
    }
}
