package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.1Nu  reason: invalid class name and case insensitive filesystem */
public class C27331Nu {
    public final AnonymousClass19A A00;
    public final AnonymousClass005 A01;
    public final C19700wN A02;

    public void A00() {
        Log.i("BroadcastXmppMethods/sendGetBroadcastLists");
        AnonymousClass19A r5 = this.A00;
        String A09 = r5.A09();
        r5.A0E(new AnonymousClass3TH(this, 1), new C203399nx(new C203399nx("lists", (AnonymousClass1AL[]) null), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09), new AnonymousClass1AL("xmlns", "w:b"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass1AL((Jid) C177588e2.A00, "to")}), A09, 59, 32000);
    }

    public C27331Nu(C19700wN r1, AnonymousClass19A r2, AnonymousClass005 r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }
}
