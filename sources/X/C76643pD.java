package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.3pD  reason: invalid class name and case insensitive filesystem */
public class C76643pD implements C236119d {
    public final AnonymousClass17Y A00;
    public final AnonymousClass19A A01;
    public final AnonymousClass37H A02;

    public void BVN(String str) {
        Log.e("sendGetContactQrCode/delivery-error");
        this.A00.Bp3(new C80373vI(this, (String) null, 0, 8));
    }

    public void BWw(C203399nx r6, String str) {
        Log.e("sendGetContactQrCode/response-error");
        this.A00.Bp3(new C80373vI(this, (String) null, AnonymousClass3ME.A00(r6), 8));
    }

    public void BiM(C203399nx r6, String str) {
        String str2;
        String str3;
        C203399nx A0c = r6.A0c("qr");
        if (A0c == null || !"contact".equals(A0c.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null))) {
            str2 = null;
            str3 = "sendGetContactQrCode/error: invalid response";
        } else {
            str2 = A0c.A0i("code", (String) null);
            if (str2 != null) {
                str3 = "sendGetContactQrCode/success";
            }
            str3 = "sendGetContactQrCode/error: invalid response";
        }
        Log.e(str3);
        this.A00.Bp3(new C80373vI(this, str2, 0, 8));
    }

    public C76643pD(AnonymousClass17Y r1, AnonymousClass19A r2, AnonymousClass37H r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
