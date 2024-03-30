package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3pY  reason: invalid class name and case insensitive filesystem */
public final class C76853pY implements C236119d {
    public final AnonymousClass19A A00;
    public final WeakReference A01;

    public C76853pY(AnonymousClass19A r2, WeakReference weakReference) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = weakReference;
    }

    public final void A00(boolean z, String str) {
        String str2 = str;
        AnonymousClass00C.A0D(str2, 1);
        AnonymousClass19A r8 = this.A00;
        String A09 = r8.A09();
        AnonymousClass1AL[] r4 = new AnonymousClass1AL[2];
        boolean A1Y = C36371kC.A1Y("approve", String.valueOf(z), r4);
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2, r4, 1);
        C203399nx r5 = new C203399nx("device_logout", r4);
        AnonymousClass1AL[] r42 = new AnonymousClass1AL[5];
        C36341k9.A1L("xmlns", "w:account_defence", r42, A1Y ? 1 : 0);
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09, r42, 1);
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r42, 2);
        r42[3] = new AnonymousClass1AL("smax_id", 87);
        r42[4] = new AnonymousClass1AL((Jid) C177588e2.A00, "to");
        r8.A0E(this, C36391kE.A0m(r5, r42), A09, 354, 20000);
    }

    public void BWw(C203399nx r3, String str) {
        AnonymousClass00C.A0D(r3, 1);
        int A04 = C36371kC.A04(r3);
        C88334Sh r0 = (C88334Sh) this.A01.get();
        if (r0 != null) {
            r0.onError(A04);
        }
    }

    public void BiM(C203399nx r4, String str) {
        boolean z;
        String A0i;
        AnonymousClass00C.A0D(r4, 1);
        C203399nx A0c = r4.A0c("device_logout");
        if (A0c == null || (A0i = A0c.A0i("success", "true")) == null) {
            z = false;
        } else {
            z = A0i.equals("true");
        }
        C88334Sh r1 = (C88334Sh) this.A01.get();
        if (z) {
            if (r1 != null && ((AnonymousClass3SZ) r1).A01 == 0) {
                Log.i("DeviceConfirmationRegAlertDialogFragment/ Successfully sent Do Not Allow IQ");
            }
        } else if (r1 != null) {
            r1.onError(-2);
        }
    }

    public void BVN(String str) {
        C88334Sh r1 = (C88334Sh) this.A01.get();
        if (r1 != null) {
            r1.onError(-1);
        }
    }
}
