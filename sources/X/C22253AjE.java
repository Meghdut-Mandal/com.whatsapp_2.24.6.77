package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.AjE  reason: case insensitive filesystem */
public final class C22253AjE extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $iqId;
    public final /* synthetic */ C195919Wu $request;
    public final /* synthetic */ AnonymousClass8V9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22253AjE(C195919Wu r2, AnonymousClass8V9 r3, String str) {
        super(0);
        this.this$0 = r3;
        this.$iqId = str;
        this.$request = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass8V9 r4 = this.this$0;
        String str = this.$iqId;
        C195919Wu r3 = this.$request;
        boolean A1a = C36341k9.A1a(str, r3);
        ArrayList A0I = AnonymousClass001.A0I();
        C203399nx.A0C("width", String.valueOf(r3.A01), A0I);
        C203399nx.A0C("height", String.valueOf(r3.A00), A0I);
        C203399nx A05 = C203399nx.A05("image_dimensions", (AnonymousClass1AL[]) null, C165577te.A1b(A0I, 0));
        C13540k2 r2 = new C13540k2();
        r2.add(A05);
        Iterator it = r3.A04.iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            ArrayList A0I2 = AnonymousClass001.A0I();
            C203399nx.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0C, A0I2);
            C203399nx.A0F("product", r2, (AnonymousClass1AL[]) null, C165577te.A1b(A0I2, 0));
        }
        AnonymousClass1KK r0 = r4.A01;
        UserJid userJid = r3.A03;
        String A09 = r0.A09(userJid);
        if (A09 != null) {
            r4.A00 = r3;
            C203399nx.A0C("direct_connection_encrypted_info", A09, r2);
        }
        AnonymousClass9ZM.A00(r3.A02, r2, A1a);
        C13540k2 A00 = AnonymousClass03S.A00(r2);
        AnonymousClass1AL[] r32 = new AnonymousClass1AL[2];
        C36341k9.A1L("op", "refresh", r32, 0);
        C36341k9.A1L("biz_jid", userJid.getRawString(), r32, A1a ? 1 : 0);
        C203399nx A052 = C203399nx.A05("cart", r32, C165577te.A1b(A00, 0));
        AnonymousClass1AL[] r33 = new AnonymousClass1AL[5];
        C36341k9.A1L("smax_id", "11", r33, 0);
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r33, A1a);
        C36341k9.A1L("xmlns", "fb:thrift_iq", r33, 2);
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r33, 3);
        C36341k9.A1V(r33, 4);
        return C36391kE.A0m(A052, r33);
    }
}
