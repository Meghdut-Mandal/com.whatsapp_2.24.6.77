package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8VH  reason: invalid class name */
public abstract class AnonymousClass8VH extends AID {
    public final UserJid A00;

    public final void A05(C207109uZ r5) {
        String str;
        if (r5 == null || !r5.A0X) {
            A03();
            return;
        }
        C206609tg r0 = r5.A02;
        if (!(r0 == null || (str = r0.A00) == null)) {
            this.A01.A07.A1i(this.A00.getRawString(), str);
        }
        this.A01.A0D(this, this.A00, false);
    }

    public static void A01(AnonymousClass1KK r0, AnonymousClass8VH r1) {
        if ((r0.A03.A00() & 128) > 0) {
            r1.A04();
        } else {
            r1.A03();
        }
    }

    public void A03() {
        C21700zf A0V;
        C203399nx A0m;
        C185718ug r14;
        C185718ug r15;
        C185718ug r2;
        C185648uZ r0;
        C21700zf A0V2;
        if (this instanceof AnonymousClass8VD) {
            AnonymousClass8VD r3 = (AnonymousClass8VD) this;
            String A09 = r3.A04.A09();
            r3.A05.A02("view_product_tag");
            C199349fA r6 = r3.A03;
            AnonymousClass9NZ r8 = r3.A02;
            AnonymousClass1KK r02 = r3.A01;
            UserJid userJid = r8.A01;
            String A092 = r02.A09(userJid);
            String str = r8.A04;
            C18740tg.A0E(!TextUtils.isEmpty(str), "catalog productId cannot be null or empty");
            ArrayList A0I = AnonymousClass001.A0I();
            C203399nx.A0C("product_id", str, A0I);
            Integer num = r8.A03;
            if (num != null) {
                C203399nx.A0C("width", num.toString(), A0I);
            }
            Integer num2 = r8.A02;
            if (num2 != null) {
                C203399nx.A0C("height", num2.toString(), A0I);
            }
            C203399nx.A0C("catalog_session_id", r8.A05, A0I);
            if (r8.A06) {
                C203399nx.A0C("fetch_compliance_info", "true", A0I);
            }
            AnonymousClass9ZM.A00(r8.A00, A0I, false);
            if (!TextUtils.isEmpty(A092)) {
                C203399nx.A0C("direct_connection_encrypted_info", A092, A0I);
            }
            AnonymousClass1AL[] r22 = new AnonymousClass1AL[1];
            C90504aG.A1E(userJid, "jid", r22, 0);
            C203399nx A05 = C203399nx.A05("product", r22, C165577te.A1b(A0I, 0));
            AnonymousClass1AL[] r4 = new AnonymousClass1AL[4];
            C36331k8.A1R(A09, r4, 0);
            C36341k9.A1L("xmlns", "w:biz:catalog", r4, 1);
            C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r4, 2);
            C36341k9.A1V(r4, 3);
            r6.A02(r3, C36391kE.A0m(A05, r4), A09, 196);
        } else if (this instanceof AnonymousClass8VG) {
            AnonymousClass8VG r32 = (AnonymousClass8VG) this;
            String A093 = r32.A05.A09();
            C193989Nr r7 = r32.A01;
            String str2 = r7.A06;
            if (str2 == null && (A0V2 = C165597tg.A0V(r32.A06)) != null) {
                A0V2.A07("datasource_collections");
            }
            C63273Jk r03 = r32.A07;
            UserJid userJid2 = r7.A05;
            r03.A00(userJid2, A093, 271);
            C199349fA r82 = r32.A04;
            if (r32.A03.A0E(5886)) {
                String A094 = r32.A01.A09(userJid2);
                C185718ug r13 = null;
                if (A094 != null) {
                    r14 = new C185718ug(A094, 20);
                } else {
                    r14 = null;
                }
                AnonymousClass9W6 r23 = r7.A00;
                if (r23 != null) {
                    r15 = new C185718ug(C007103b.A0Q(",", "", "", r23.A02, C22562Aor.A00), 21);
                    r2 = new C185718ug(C36441kJ.A0y(r23.A01), C36441kJ.A0y(r23.A00));
                } else {
                    r15 = null;
                    r2 = null;
                }
                Long A0y = C36441kJ.A0y(r7.A01);
                Long A0y2 = C36441kJ.A0y(3);
                Long A0y3 = C36441kJ.A0y(r7.A03);
                Long A0y4 = C36441kJ.A0y(r7.A02);
                if (str2 != null) {
                    r0 = new C185648uZ(str2, 28);
                } else {
                    r0 = null;
                }
                String str3 = r7.A07;
                if (str3 != null) {
                    r13 = new C185718ug(str3, 19);
                }
                C185948vA r11 = new C185948vA(userJid2, r13, r14, r15, r2, r0, A0y, A0y2, A0y3, A0y4, A093);
                r32.A08.A00.put(A093, r11);
                A0m = r11.A00;
                AnonymousClass00C.A08(A0m);
            } else {
                ArrayList A0I2 = AnonymousClass001.A0I();
                C203399nx.A0C("width", String.valueOf(r7.A03), A0I2);
                C203399nx.A0C("height", String.valueOf(r7.A02), A0I2);
                if (str2 != null) {
                    C203399nx.A0C("after", str2, A0I2);
                }
                String str4 = r7.A07;
                if (str4 != null) {
                    C203399nx.A0C("catalog_session_id", str4, A0I2);
                }
                C203399nx.A0C("collection_limit", String.valueOf(r7.A01), A0I2);
                C203399nx.A0C("item_limit", String.valueOf(3), A0I2);
                String A095 = r32.A01.A09(userJid2);
                if (A095 != null) {
                    C203399nx.A0C("direct_connection_encrypted_info", A095, A0I2);
                }
                AnonymousClass9ZM.A00(r7.A00, A0I2, false);
                AnonymousClass1AL[] r5 = new AnonymousClass1AL[1];
                C90504aG.A1E(userJid2, "biz_jid", r5, 0);
                C203399nx A052 = C203399nx.A05("collections", r5, C165577te.A1b(A0I2, 0));
                AnonymousClass1AL[] r52 = new AnonymousClass1AL[5];
                C90504aG.A1E(r7.A04, "to", r52, 0);
                C36331k8.A1R(A093, r52, 1);
                C36341k9.A1L("smax_id", "35", r52, 2);
                C165567td.A1S("w:biz:catalog", r52, 3, 4);
                A0m = C36391kE.A0m(A052, r52);
            }
            r82.A02(r32, A0m, A093, 271);
        } else if (this instanceof AnonymousClass8VC) {
            AnonymousClass8VC r33 = (AnonymousClass8VC) this;
            C21114A8z.A00(r33.A02, 0);
            String A096 = r33.A04.A09();
            AnonymousClass1KK r04 = r33.A01;
            UserJid userJid3 = r33.A00;
            String A097 = r04.A09(userJid3);
            r33.A05.A02("plm_details_view_tag");
            C199349fA r62 = r33.A03;
            List list = r33.A08;
            String str5 = r33.A07;
            String str6 = r33.A06;
            ArrayList A0I3 = AnonymousClass001.A0I();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C203399nx.A0B(new C203399nx(PublicKeyCredentialControllerUtility.JSON_KEY_ID, AnonymousClass001.A0C(it), (AnonymousClass1AL[]) null), "product", A0I3, (AnonymousClass1AL[]) null);
            }
            C203399nx.A0C("width", str5, A0I3);
            C203399nx.A0C("height", str6, A0I3);
            if (A097 != null) {
                C203399nx.A0C("direct_connection_encrypted_info", A097, A0I3);
            }
            C203399nx A053 = C203399nx.A05("product_list", new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) userJid3, "jid")}, C165577te.A1b(A0I3, 0));
            AnonymousClass1AL[] r42 = new AnonymousClass1AL[5];
            C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A096, r42, 0);
            C36341k9.A1L("xmlns", "w:biz:catalog", r42, 1);
            C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r42, 2);
            C36341k9.A1L("smax_id", "21", r42, 3);
            C36341k9.A1V(r42, 4);
            r62.A02(r33, C36391kE.A0m(A053, r42), A096, 164);
            C36321k7.A1K(userJid3, "RequestBizProductListProtocolHelper/doSendRequest/jid=", AnonymousClass000.A0u());
        } else if (this instanceof AnonymousClass8VF) {
            AnonymousClass8VF r34 = (AnonymousClass8VF) this;
            String A098 = r34.A04.A09();
            C200939iV r53 = r34.A02;
            String str7 = r53.A08;
            if (str7 == null && (A0V = C165597tg.A0V(r34.A05)) != null) {
                A0V.A07("datasource_catalog");
            }
            C199349fA r72 = r34.A03;
            AnonymousClass1KK r05 = r34.A01;
            UserJid userJid4 = r53.A07;
            String A099 = r05.A09(userJid4);
            ArrayList A0I4 = AnonymousClass001.A0I();
            C203399nx.A0C("limit", Integer.toString(r53.A04), A0I4);
            C203399nx.A0C("width", Integer.toString(r53.A06), A0I4);
            C203399nx.A0C("height", Integer.toString(r53.A05), A0I4);
            if (str7 != null) {
                C203399nx.A0C("after", str7, A0I4);
            }
            String str8 = r53.A09;
            if (str8 != null) {
                C203399nx.A0C("catalog_session_id", str8, A0I4);
            }
            if (A099 != null) {
                C203399nx.A0C("direct_connection_encrypted_info", A099, A0I4);
            }
            AnonymousClass9ZM.A00(r53.A01, A0I4, false);
            ArrayList A0I5 = AnonymousClass001.A0I();
            C165577te.A16(userJid4, "jid", A0I5);
            Boolean bool = Boolean.TRUE;
            if (bool == r53.A02) {
                C36381kD.A1M("allow_shop_source", bool.toString(), A0I5);
            }
            C203399nx A054 = C203399nx.A05("product_catalog", C165577te.A1a(A0I5, A0I5.size()), C165577te.A1b(A0I4, 0));
            AnonymousClass1AL[] r43 = new AnonymousClass1AL[4];
            C36331k8.A1R(A098, r43, 0);
            C36341k9.A1L("xmlns", "w:biz:catalog", r43, 1);
            C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r43, 2);
            C36341k9.A1V(r43, 3);
            r72.A02(r34, C36391kE.A0m(A054, r43), A098, 164);
        } else {
            AnonymousClass8VE r35 = (AnonymousClass8VE) this;
            AnonymousClass19A r63 = r35.A01;
            String A0910 = r63.A09();
            AnonymousClass1KK r06 = r35.A01;
            UserJid userJid5 = r35.A00;
            String A0911 = r06.A09(userJid5);
            if (A0911 != null) {
                C203399nx r24 = new C203399nx("direct_connection_encrypted_info", A0911, (AnonymousClass1AL[]) null);
                AnonymousClass1AL[] r1 = new AnonymousClass1AL[1];
                C90504aG.A1E(userJid5, "biz_jid", r1, 0);
                C203399nx r83 = new C203399nx(r24, "verify_postcode", r1);
                AnonymousClass1AL[] r44 = new AnonymousClass1AL[5];
                C36331k8.A1R(A0910, r44, 0);
                C165567td.A1S("w:biz:catalog", r44, 1, 2);
                C36361kB.A1Q("smax_id", "70", r44);
                r44[4] = new AnonymousClass1AL((Jid) C177588e2.A00, "to");
                C203399nx A0m2 = C36391kE.A0m(r83, r44);
                r35.A02.A00(userJid5, A0910, 317);
                r63.A0F(r35, A0m2, A0910, 317, 32000);
                return;
            }
            r35.A00.Bd9("error", 422);
        }
    }

    public final void A04() {
        AnonymousClass1KK r2 = this.A01;
        UserJid userJid = this.A00;
        if (r2.A09(userJid) == null || r2.A04.A06(userJid)) {
            BAG.A00(r2, userJid, this, 1);
        } else {
            A03();
        }
    }

    public void A06(UserJid userJid, String str, int i) {
        C19700wN r3;
        String A0r;
        String str2;
        if (this instanceof AnonymousClass8VD) {
            AnonymousClass8VD r2 = (AnonymousClass8VD) this;
            C36321k7.A1S("ProductRequestProtocolHelper/onError/error - ", AnonymousClass000.A0u(), i);
            r2.A05.A01("view_product_tag");
            r2.A00.BXY(r2.A02, i);
        } else if (this instanceof AnonymousClass8VG) {
            AnonymousClass8VG r22 = (AnonymousClass8VG) this;
            if (str != null) {
                r22.A08.A00.remove(str);
            }
            AnonymousClass8VG.A00(r22);
            if (str != null) {
                r22.A07.A01(str);
            }
            C36321k7.A1S("GetCollectionsProtocol/onError/error - ", AnonymousClass000.A0u(), i);
            r22.A00.A01(r22.A01, i);
        } else {
            if (this instanceof AnonymousClass8VC) {
                AnonymousClass8VC r23 = (AnonymousClass8VC) this;
                r23.A05.A01("plm_details_view_tag");
                StringBuilder A0u = AnonymousClass000.A0u();
                C36321k7.A1Z(A0u, C165607th.A0r(userJid, "RequestBizProductListProtocolHelper/onError/response-error, jid = ", A0u));
                C21114A8z.A00(r23.A02, 2);
                r3 = r23.A00;
                A0r = AnonymousClass000.A0r("error_code=", AnonymousClass000.A0u(), i);
                str2 = "RequestBizProductListProtocolHelper/get product list error";
            } else if (this instanceof AnonymousClass8VF) {
                AnonymousClass8VF r24 = (AnonymousClass8VF) this;
                AnonymousClass8VF.A00(r24);
                C36321k7.A1J(userJid, "sendGetBizProductCatalog/response-error/jid=", AnonymousClass000.A0u());
                r24.A01.BXL(r24.A02, i);
                r3 = r24.A00;
                A0r = AnonymousClass000.A0r("error_code=", AnonymousClass000.A0u(), i);
                str2 = "RequestBizProductCatalogProtocolHelper/get product catalog error";
            } else {
                AnonymousClass8VE r1 = (AnonymousClass8VE) this;
                if (str != null) {
                    r1.A02.A01(str);
                }
                r1.A08("error", i);
                return;
            }
            r3.A0E(str2, A0r, true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8VH(AnonymousClass1KK r1, UserJid userJid) {
        super(r1);
        C36321k7.A0x(r1, userJid);
        this.A00 = userJid;
    }

    public void BVl(UserJid userJid) {
        StringBuilder A0i = C36341k9.A0i(userJid);
        C36321k7.A1Z(A0i, C165607th.A0r(userJid, "LOG_TAG/onDirectConnectionError, jid = ", A0i));
        A06(userJid, (String) null, 422);
    }

    public void BVm(UserJid userJid) {
        StringBuilder A0i = C36341k9.A0i(userJid);
        C36321k7.A1a(A0i, C165607th.A0r(userJid, "DirectConnectionProtocolHelperEntryPoint/onDirectConnectionSucceeded, jid =  ", A0i));
        A03();
    }

    public void BWw(C203399nx r5, String str) {
        boolean A1a = C36331k8.A1a(str, r5);
        int A002 = AnonymousClass3ME.A00(r5);
        if (A002 != 421 || this.A00) {
            A06(this.A00, str, A002);
            return;
        }
        if (this instanceof AnonymousClass8VD) {
            Log.i("ProductRequestProtocolHelper/onDirectConnectionRevokeKey");
            ((AnonymousClass8VD) this).A05.A01("view_product_tag");
        } else if (this instanceof AnonymousClass8VG) {
            AnonymousClass8VG r3 = (AnonymousClass8VG) this;
            AnonymousClass8VG.A00(r3);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("GetCollectionsProtocol/onDirectConnectionRevokeKey/jid - ");
            C36321k7.A1N(r3.A01.A05, A0u);
        } else if (this instanceof AnonymousClass8VC) {
            AnonymousClass8VC r32 = (AnonymousClass8VC) this;
            r32.A05.A01("plm_details_view_tag");
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("RequestBizProductListProtocolHelper/onDirectConnectionRevokeKey, jid = ");
            C36321k7.A1a(A0u2, r32.A00.getRawString());
        } else if (this instanceof AnonymousClass8VF) {
            AnonymousClass8VF r33 = (AnonymousClass8VF) this;
            AnonymousClass8VF.A00(r33);
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("sendGetBizProductCatalog/onDirectConnectionRevokeKey/jid=");
            C36321k7.A1N(r33.A00, A0u3);
        } else {
            Log.i("DCPostcodeVerificationProtocolHelper/onDirectConnectionRevokeKey");
        }
        this.A00 = A1a;
        this.A01.A0D(this, this.A00, A1a);
    }
}
