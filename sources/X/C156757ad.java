package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.7ad  reason: invalid class name and case insensitive filesystem */
public class C156757ad extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient C29011Uz A00;
    public transient AnonymousClass1V0 A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C156757ad() {
        /*
            r1 = this;
            X.673 r0 = new X.673
            r0.<init>()
            X.AnonymousClass673.A00(r0)
            org.whispersystems.jobqueue.JobParameters r0 = r0.A01()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C156757ad.<init>():void");
    }

    public void A0B() {
        Log.i("Fetch2FAEmailStatusJob/onRun: asking for 2FA status");
        AnonymousClass1V0 r3 = this.A01;
        AnonymousClass19A r7 = r3.A01;
        String A09 = r7.A09();
        C36321k7.A1Q("TwoFactorXmppMethods/sendGetTwoFactorAuth; iq=", A09, AnonymousClass000.A0u());
        C99424tL r2 = new C99424tL();
        C65463Se r8 = new C65463Se(r2, r3, 3);
        C203399nx r4 = new C203399nx("2fa", (AnonymousClass1AL[]) null);
        AnonymousClass1AL[] r32 = new AnonymousClass1AL[4];
        r32[0] = new AnonymousClass1AL((Jid) C177588e2.A00, "to");
        r32[1] = new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09);
        C36351kA.A1N("xmlns", "urn:xmpp:whatsapp:account", r32);
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r32, 3);
        r7.A0K(r8, C36391kE.A0m(r4, r32), A09, 114, 32000);
        try {
            r2.get(32000, TimeUnit.MILLISECONDS);
            if (C36371kC.A01(C29011Uz.A00(this.A00), "two_factor_auth_email_set") == 0) {
                Log.w("Fetch2FAEmailStatusJob/onRun: email status fetching failed");
                throw new Exception("Failing Fetch2FAEmailStatusJob, fetching status failed");
            }
        } catch (Exception unused) {
            Log.i("Fetch2FAEmailStatusJob/onRun: timeout waiting for response");
            throw new Exception("Failing Fetch2FAEmailStatusJob, timeout for response");
        }
    }

    public void Bqf(Context context) {
        C18830tt r1 = C90464aC.A0I(context).AfI.A00;
        this.A01 = C18830tt.AD7(r1);
        this.A00 = (C29011Uz) r1.A49.get();
    }
}
