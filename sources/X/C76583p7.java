package X;

import android.os.Handler;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3p7  reason: invalid class name and case insensitive filesystem */
public class C76583p7 implements C236119d {
    public final AnonymousClass19A A00;
    public final Handler A01 = C36341k9.A0H();
    public final WeakReference A02;

    public void BVN(String str) {
        Log.e("sendVerifyLinkRequest/delivery failure ");
        Object obj = this.A02.get();
        if (obj != null) {
            this.A01.post(new C81113wU(obj, 33));
        }
    }

    public void BiM(C203399nx r8, String str) {
        Handler handler;
        int i;
        int i2;
        String str2;
        C203399nx A0c = r8.A0c(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
        Object obj = this.A02.get();
        if (A0c == null) {
            int A002 = AnonymousClass3ME.A00(r8);
            if (obj != null) {
                this.A01.post(new C81283wl(obj, A002, 29));
            }
            C36321k7.A1U("sendVerifyLinkRequest/response-error ", AnonymousClass000.A0u(), A002);
            return;
        }
        C203399nx A0c2 = A0c.A0c("status");
        if (A0c2 == null) {
            if (obj != null) {
                handler = this.A01;
                i = 34;
            }
            Log.w("sendVerifyLinkRequest/response-error -1");
        }
        try {
            if (A0c2.A0e() != null) {
                i2 = Integer.parseInt(A0c2.A0e());
                if (i2 == 200) {
                    C203399nx A0c3 = A0c.A0c("url");
                    if (A0c3 == null) {
                        str2 = null;
                    } else {
                        str2 = A0c3.A0e();
                    }
                    if (obj != null) {
                        this.A01.post(new AnonymousClass751(46, str2, obj));
                        return;
                    }
                    return;
                }
            } else {
                i2 = 0;
            }
            if (obj != null) {
                this.A01.post(new C81283wl(obj, i2, 30));
            }
            C36321k7.A1U("sendVerifyLinkRequest/response-error ", AnonymousClass000.A0u(), i2);
            return;
        } catch (NumberFormatException unused) {
            if (obj != null) {
                handler = this.A01;
                i = 35;
            }
        }
        handler.post(new C81113wU(obj, i));
        Log.w("sendVerifyLinkRequest/response-error -1");
    }

    public C76583p7(AnonymousClass4QO r2, AnonymousClass19A r3) {
        this.A02 = AnonymousClass001.A0F(r2);
        this.A00 = r3;
    }

    public void BWw(C203399nx r6, String str) {
        int A002 = AnonymousClass3ME.A00(r6);
        C36321k7.A1U("sendVerifyLinkRequest/response-error ", AnonymousClass000.A0u(), A002);
        Object obj = this.A02.get();
        if (obj != null) {
            this.A01.post(new C81283wl(obj, A002, 28));
        }
    }
}
