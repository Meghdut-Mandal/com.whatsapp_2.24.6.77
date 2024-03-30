package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.8V8  reason: invalid class name */
public class AnonymousClass8V8 extends AID {
    public final AnonymousClass9XP A00;
    public final AnonymousClass3L6 A01;
    public final C31781cN A02;
    public final C23027B0x A03;
    public final C19600wD A04;
    public final C199349fA A05;
    public final AnonymousClass19A A06;
    public final C63273Jk A07;

    public void A03() {
        if (!this.A04.A09()) {
            this.A03.BXK(this.A00, -1);
            return;
        }
        String A09 = this.A06.A09();
        C63273Jk r0 = this.A07;
        AnonymousClass9XP r2 = this.A00;
        UserJid userJid = r2.A04;
        r0.A00(userJid, A09, 270);
        String str = r2.A05;
        if (str == null) {
            this.A01.A02("view_collection_details_tag");
        }
        C199349fA r7 = this.A05;
        ArrayList A0I = AnonymousClass001.A0I();
        C203399nx.A0C("limit", Integer.toString(r2.A01), A0I);
        C203399nx.A0C("width", Integer.toString(r2.A02), A0I);
        C203399nx.A0C("height", Integer.toString(r2.A00), A0I);
        C203399nx.A0C("is_category", Boolean.toString(r2.A08), A0I);
        String str2 = r2.A07;
        if (str2 != null) {
            C203399nx.A0C("catalog_session_id", str2, A0I);
        }
        if (str != null) {
            C203399nx.A0C("after", str, A0I);
        }
        String A092 = this.A01.A09(userJid);
        if (A092 != null) {
            C203399nx.A0C("direct_connection_encrypted_info", A092, A0I);
        }
        AnonymousClass9ZM.A00(r2.A03, A0I, false);
        AnonymousClass1AL[] r3 = new AnonymousClass1AL[2];
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r2.A06, r3, 0);
        r3[1] = new AnonymousClass1AL((Jid) userJid, "biz_jid");
        C203399nx A052 = C203399nx.A05("collection", r3, C165577te.A1b(A0I, 0));
        AnonymousClass1AL[] r32 = new AnonymousClass1AL[5];
        C36341k9.A1V(r32, 0);
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09, r32, 1);
        C36341k9.A1L("smax_id", "30", r32, 2);
        C36341k9.A1L("xmlns", "w:biz:catalog", r32, 3);
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r32, 4);
        r7.A02(this, C36391kE.A0m(A052, r32), A09, 270);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("app/sendGetCollectionProductList jid=");
        A0u.append(userJid);
        C36321k7.A1a(A0u, " success");
    }

    public void BVN(String str) {
        AnonymousClass9XP r2 = this.A00;
        if (r2.A05 == null) {
            this.A01.A01("view_collection_details_tag");
        }
        this.A07.A01(str);
        Log.e("GetCollectionProductListProtocol/sendGetCollectionProductLis/delivery-error");
        this.A03.BXK(r2, -1);
    }

    public void BVl(UserJid userJid) {
        Log.e("GetCollectionProductListProtocol/sendGetCollectionProductLis/direct-connection-error");
        this.A03.BXK(this.A00, 421);
    }

    public void BVm(UserJid userJid) {
        Log.i("GetCollectionProductListProtocolonDirectConnectionSucceeded/retry-request");
        A03();
    }

    public void BWw(C203399nx r4, String str) {
        AnonymousClass9XP r2 = this.A00;
        if (r2.A05 == null) {
            this.A01.A01("view_collection_details_tag");
        }
        this.A07.A01(str);
        Log.e("GetCollectionProductListProtocol/sendGetCollectionProductList/response-error");
        int A002 = AnonymousClass3ME.A00(r4);
        if (!A02(r2.A04, A002)) {
            this.A03.BXK(r2, A002);
        }
    }

    public void BiM(C203399nx r5, String str) {
        C195929Wv A012;
        AnonymousClass9XP r3 = this.A00;
        if (r3.A05 == null) {
            this.A01.A01("view_collection_details_tag");
        }
        this.A07.A02(str);
        C31781cN r1 = this.A02;
        C203399nx A0c = r5.A0c("collection");
        if (A0c == null || (A012 = r1.A01(A0c)) == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("GetCollectionProductListProtocol/sendGetCollectionProductList/onSuccess/emptyPage jid=");
            C36331k8.A1P(r3.A04, A0u);
            this.A03.BXK(r3, 0);
            return;
        }
        C21113A8y a8y = new C21113A8y(C31791cO.A00(A0c.A0c("paging")), A012);
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("GetCollectionProductListProtocol/sendGetCollectionProductList/onSuccess jid=");
        C36321k7.A1N(r3.A04, A0u2);
        this.A03.BiN(a8y, r3);
    }

    public AnonymousClass8V8(AnonymousClass1KK r1, AnonymousClass9XP r2, C31781cN r3, C23027B0x b0x, C19600wD r5, C199349fA r6, AnonymousClass19A r7, AnonymousClass3L6 r8, C63273Jk r9) {
        super(r1);
        this.A02 = r3;
        this.A01 = r8;
        this.A06 = r7;
        this.A00 = r2;
        this.A04 = r5;
        this.A03 = b0x;
        this.A05 = r6;
        this.A07 = r9;
    }
}
