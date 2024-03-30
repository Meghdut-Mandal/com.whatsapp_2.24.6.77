package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8VA  reason: invalid class name */
public class AnonymousClass8VA extends AID {
    public final AnonymousClass9MR A00;
    public final C199349fA A01;
    public final AnonymousClass19A A02;
    public final AnonymousClass3L6 A03;
    public final AnonymousClass777 A04 = new AnonymousClass777();
    public final AnonymousClass9EH A05;
    public final AnonymousClass9HM A06;

    public void BVN(String str) {
        this.A03.A01("order_view_tag");
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GetOrderProtocol/delivery-error with iqId ");
        A0u.append(str);
        C36341k9.A1O(A0u, ">");
        this.A04.BVM(new C52812qD(str));
    }

    public void BVl(UserJid userJid) {
        AnonymousClass9HO.A00(C36441kJ.A0Q(421, "Failed to generate direct connection info"), this.A04, (Object) null);
        C36321k7.A1K(userJid, "GetOrderProtocol/onDirectConnectionError/jid= ", AnonymousClass000.A0u());
    }

    public void BVm(UserJid userJid) {
        String A09 = this.A02.A09();
        this.A01.A02(this, A00(this, A09), A09, 248);
        C36321k7.A1K(userJid, "GetOrderProtocol/onDirectConnectionSucceeded/Retrying with jid= ", AnonymousClass000.A0u());
    }

    public void BWw(C203399nx r5, String str) {
        this.A03.A01("order_view_tag");
        Pair A012 = AnonymousClass3ME.A01(r5);
        if (A012 == null) {
            AnonymousClass9HO.A00(C36441kJ.A0Q(C36361kB.A0i(), "error code is null"), this.A04, (Object) null);
        } else if (!A02(this.A00.A02, C36381kD.A04(A012))) {
            AnonymousClass9HO.A00(A012, this.A04, (Object) null);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("GetOrderProtocol/response-error with iqId <");
            A0u.append(str);
            C36321k7.A1L(A012, "> and error ", A0u);
        }
    }

    public void BiM(C203399nx r36, String str) {
        C128826Dt r19;
        long j;
        String str2;
        String str3;
        C206759tv r20;
        String A0e;
        String A0e2;
        String A0e3;
        String A0e4;
        C132386Tk r7;
        String A0e5;
        C134736bW r3;
        C203399nx A0c;
        String A0e6;
        String A0e7;
        this.A03.A01("order_view_tag");
        AnonymousClass9HM r9 = this.A06;
        C203399nx r1 = r36;
        AnonymousClass00C.A0D(r1, 0);
        C203399nx A0c2 = r1.A0c("order");
        C195939Ww r0 = null;
        if (A0c2 != null) {
            String A0i = A0c2.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
            String A0i2 = A0c2.A0i("creation_ts", (String) null);
            List A0j = A0c2.A0j("product");
            AnonymousClass00C.A08(A0j);
            AnonymousClass9P0 r12 = r9.A01;
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator it = A0j.iterator();
            while (it.hasNext()) {
                C203399nx A0s = C36431kI.A0s(it);
                C203399nx A0c3 = A0s.A0c(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                C203399nx A0c4 = A0s.A0c(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                C203399nx A0c5 = A0s.A0c("price");
                C203399nx A0c6 = A0s.A0c("currency");
                C203399nx A0c7 = A0s.A0c("image");
                C203399nx A0c8 = A0s.A0c("quantity");
                C203399nx A0c9 = A0s.A0c("status");
                C203399nx A0c10 = A0s.A0c("variant_info");
                if (A0c3 == null) {
                    A0e2 = null;
                } else {
                    A0e2 = A0c3.A0e();
                }
                if (A0c4 == null) {
                    A0e3 = null;
                } else {
                    A0e3 = A0c4.A0e();
                }
                if (A0c8 == null) {
                    A0e4 = null;
                } else {
                    A0e4 = A0c8.A0e();
                }
                if (A0c6 == null || AnonymousClass14B.A0F(A0c6.A0e())) {
                    r7 = null;
                } else {
                    r7 = new C132386Tk(A0c6.A0e());
                }
                BigDecimal A0z = C165607th.A0z(r7, A0c5);
                if (A0c9 == null) {
                    A0e5 = null;
                } else {
                    A0e5 = A0c9.A0e();
                }
                boolean A1P = AnonymousClass000.A1P("deleted".equalsIgnoreCase(A0e5) ? 1 : 0);
                C134966bu r6 = null;
                if (A0c7 != null) {
                    C203399nx A0c11 = A0c7.A0c(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    C203399nx A0c12 = A0c7.A0c("url");
                    if (A0c11 == null) {
                        A0e6 = null;
                    } else {
                        A0e6 = A0c11.A0e();
                    }
                    if (A0c12 == null) {
                        A0e7 = null;
                    } else {
                        A0e7 = A0c12.A0e();
                    }
                    if (!(A0e6 == null || A0e7 == null)) {
                        r6 = new C134966bu(A0e6, A0e7);
                    }
                }
                if (!(A0c10 == null || (A0c = A0c10.A0c("properties")) == null)) {
                    List A0j2 = A0c.A0j("property");
                    ArrayList A0I2 = AnonymousClass001.A0I();
                    Iterator it2 = A0j2.iterator();
                    while (it2.hasNext()) {
                        C203399nx A0s2 = C36431kI.A0s(it2);
                        A0I2.add(new C134606bJ(A0s2.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) null), A0s2.A0i("value", (String) null)));
                    }
                    if (!A0I2.isEmpty()) {
                        r3 = new C134736bW((C134546bD) null, (C134666bP) null, (List) null, A0I2);
                        if (!(A0e2 == null || A0e3 == null || A0e4 == null)) {
                            A0I.add(new C206439tP(r3, r6, r7, A0e2, A0e3, A0z, Integer.parseInt(A0e4), A1P ? 1 : 0));
                        }
                    }
                }
                r3 = null;
                A0I.add(new C206439tP(r3, r6, r7, A0e2, A0e3, A0z, Integer.parseInt(A0e4), A1P ? 1 : 0));
            }
            C203399nx A0c13 = A0c2.A0c("applied_promotion");
            if (A0c13 != null) {
                AnonymousClass9HL r62 = r9.A00;
                String A0e8 = A0c13.A0d("discount").A0e();
                if (A0e8 != null) {
                    AnonymousClass011 A002 = r62.A00.A00(A0e8);
                    String str4 = (String) A002.first;
                    int A08 = C90474aD.A08(A002);
                    String A0h = A0c13.A0h(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    C203399nx A0c14 = A0c13.A0c(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    if (A0c14 != null) {
                        str2 = A0c14.A0e();
                    } else {
                        str2 = null;
                    }
                    String str5 = "";
                    if (str2 == null) {
                        str2 = str5;
                    }
                    C203399nx A0c15 = A0c13.A0c("description");
                    if (A0c15 == null || (str3 = A0c15.A0e()) == null) {
                        str3 = str5;
                    }
                    C203399nx A0c16 = A0c13.A0c("more_info");
                    if (!(A0c16 == null || (A0e = A0c16.A0e()) == null)) {
                        str5 = A0e;
                    }
                    C203399nx A0c17 = A0c13.A0c("image");
                    if (A0c17 != null) {
                        r20 = C31841cT.A00(A0c17);
                    } else {
                        r20 = null;
                    }
                    r19 = new C128826Dt(r20, A0h, str2, str4, str3, str5, (Date) null, (Date) null, A08, 0);
                } else {
                    throw C36381kD.A0l();
                }
            } else {
                r19 = null;
            }
            if (A0i2 == null || AnonymousClass098.A06(A0i2)) {
                j = 0;
            } else {
                j = Long.parseLong(A0i2);
            }
            C193089Ju A003 = r12.A00(A0c2.A0c("price"));
            if (A0i != null) {
                r0 = new C195939Ww(r19, A003, A0i, A0I, j);
            }
        }
        if (r0 != null) {
            AnonymousClass9HO.A00((Pair) null, this.A04, r0);
            return;
        }
        AnonymousClass9HO.A00(C36441kJ.A0Q(C36361kB.A0i(), "order is null"), this.A04, (Object) null);
    }

    public AnonymousClass8VA(AnonymousClass1KK r2, AnonymousClass9EH r3, AnonymousClass9MR r4, AnonymousClass9HM r5, C199349fA r6, AnonymousClass19A r7, AnonymousClass3L6 r8) {
        super(r2);
        this.A03 = r8;
        this.A02 = r7;
        this.A06 = r5;
        this.A00 = r4;
        this.A01 = r6;
        this.A05 = r3;
    }

    public static C203399nx A00(AnonymousClass8VA r10, String str) {
        AnonymousClass1AL[] r2;
        ArrayList A0I = AnonymousClass001.A0I();
        AnonymousClass9MR r3 = r10.A00;
        C203399nx.A0C("width", Integer.toString(r3.A01), A0I);
        C203399nx.A0C("height", Integer.toString(r3.A00), A0I);
        C203399nx A052 = C203399nx.A05("image_dimensions", (AnonymousClass1AL[]) null, C165577te.A1b(A0I, 0));
        C203399nx r0 = new C203399nx("token", r3.A04, (AnonymousClass1AL[]) null);
        ArrayList A0r = C90484aE.A0r(A052);
        A0r.add(r0);
        AnonymousClass1KK r02 = r10.A01;
        UserJid userJid = r3.A02;
        String A09 = r02.A09(userJid);
        if (A09 != null) {
            C203399nx.A0C("direct_connection_encrypted_info", A09, A0r);
        }
        AnonymousClass9EH r1 = r10.A05;
        AnonymousClass1AL r102 = new AnonymousClass1AL("op", "get");
        AnonymousClass1AL r32 = new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r3.A03);
        if (r1.A00.A0E(3215)) {
            r2 = new AnonymousClass1AL[3];
            r2[0] = r102;
            r2[1] = r32;
            C36341k9.A1L("biz_jid", userJid.getRawString(), r2, 2);
        } else {
            r2 = new AnonymousClass1AL[]{r102, r32};
        }
        C203399nx A053 = C203399nx.A05("order", r2, C165577te.A1b(A0r, 0));
        AnonymousClass1AL[] r22 = new AnonymousClass1AL[5];
        C36341k9.A1L("smax_id", "5", r22, 0);
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r22, 1);
        C36341k9.A1L("xmlns", "fb:thrift_iq", r22, 2);
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r22, 3);
        C36341k9.A1V(r22, 4);
        return C36391kE.A0m(A053, r22);
    }
}
