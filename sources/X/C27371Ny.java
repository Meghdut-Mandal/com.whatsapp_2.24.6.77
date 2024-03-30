package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.1Ny  reason: invalid class name and case insensitive filesystem */
public class C27371Ny {
    public final C001700s A00;
    public final AnonymousClass17Y A01;
    public final C19600wD A02;
    public final C19970wo A03;
    public final C235518x A04;
    public final C21010yW A05;
    public final AnonymousClass19A A06;

    public void A00() {
        Log.i("DisappearingModeManager/getDisappearingModeSetting");
        AnonymousClass19A r4 = this.A06;
        String A09 = r4.A09();
        r4.A0K(new AnonymousClass3TH(this, 0), new C203399nx("iq", new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) C177588e2.A00, "to"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09), new AnonymousClass1AL("xmlns", "disappearing_mode"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get")}), A09, 296, 20000);
    }

    public C27371Ny(AnonymousClass17Y r2, C19600wD r3, C19970wo r4, C235518x r5, C21010yW r6, AnonymousClass19A r7) {
        this.A03 = r4;
        this.A01 = r2;
        this.A05 = r6;
        this.A06 = r7;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r5.A00;
    }
}
