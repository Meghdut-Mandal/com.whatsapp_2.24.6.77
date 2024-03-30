package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8VB  reason: invalid class name */
public class AnonymousClass8VB extends AID {
    public C195799Wb A00;
    public C23042B1n A01;
    public final AnonymousClass9UA A02;
    public final C19420v0 A03;
    public final AnonymousClass3L6 A04;
    public final AnonymousClass17Y A05;
    public final AnonymousClass9EI A06;
    public final C199349fA A07;
    public final AnonymousClass19A A08;
    public final C63273Jk A09;

    public static void A00(C195799Wb r16, AnonymousClass8VB r17) {
        List<C134606bJ> list;
        AnonymousClass8VB r8 = r17;
        String A092 = r8.A08.A09();
        C63273Jk r0 = r8.A09;
        C195799Wb r2 = r16;
        UserJid userJid = r2.A00;
        r0.A00(userJid, A092, 252);
        C199349fA r4 = r8.A07;
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = r2.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass6B4 A0M = C165617ti.A0M(it);
            ArrayList A0I2 = AnonymousClass001.A0I();
            C207269up r14 = A0M.A02;
            C203399nx.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r14.A0F, A0I2);
            C203399nx.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r14.A05, A0I2);
            C203399nx.A0C("quantity", Long.toString(A0M.A00), A0I2);
            BigDecimal bigDecimal = r14.A06;
            C134726bV r12 = r14.A02;
            Date date = r2.A03;
            if (bigDecimal != null) {
                if (r12 != null && r12.A00(date)) {
                    bigDecimal = r12.A00;
                }
                C203399nx.A0C("price", Long.toString(bigDecimal.multiply(C129676Ia.A00).longValue()), A0I2);
            }
            C132386Tk r02 = r14.A04;
            if (r02 != null) {
                C203399nx.A0C("currency", r02.A00, A0I2);
            }
            C134736bW r03 = r14.A0B;
            if (!(r03 == null || (list = r03.A02) == null)) {
                ArrayList A0J = C36321k7.A0J(list);
                for (C134606bJ r15 : list) {
                    AnonymousClass1AL[] r1 = new AnonymousClass1AL[2];
                    C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r15.A00, r1, 0);
                    C36341k9.A1L("value", r15.A01, r1, 1);
                    C203399nx.A0E("property", A0J, r1);
                }
                ArrayList A0u = C90504aG.A0u(A0J);
                if (true ^ A0u.isEmpty()) {
                    C203399nx.A0B(C203399nx.A05("properties", (AnonymousClass1AL[]) null, C165577te.A1b(A0u, 0)), "variant_info", A0I2, (AnonymousClass1AL[]) null);
                }
            }
            C203399nx.A0F("product", A0I, (AnonymousClass1AL[]) null, C165577te.A1b(A0I2, 0));
        }
        String str = r2.A01;
        if (str != null) {
            AnonymousClass1AL[] r13 = new AnonymousClass1AL[1];
            C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r13, 0);
            C203399nx.A0E("promotion", A0I, r13);
        }
        String A093 = r8.A01.A09(userJid);
        if (A093 != null) {
            r8.A00 = r2;
            C203399nx.A0C("direct_connection_encrypted_info", A093, A0I);
        }
        AnonymousClass1AL[] r3 = new AnonymousClass1AL[2];
        C36341k9.A1L("op", "create", r3, 0);
        C36341k9.A1L("biz_jid", userJid.getRawString(), r3, 1);
        C203399nx A052 = C203399nx.A05("order", r3, C165577te.A1b(A0I, 0));
        AnonymousClass1AL[] r32 = new AnonymousClass1AL[5];
        C36341k9.A1L("smax_id", "10", r32, 0);
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092, r32, 1);
        C36341k9.A1L("xmlns", "fb:thrift_iq", r32, 2);
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r32, 3);
        C36341k9.A1V(r32, 4);
        r4.A01(r8, C36391kE.A0m(A052, r32), A092, 252);
        C36321k7.A1K(userJid, "CreateOrderProtocol/doSendCreateOrderRequest/biz_jid=", AnonymousClass000.A0u());
    }

    public void BVN(String str) {
        this.A04.A01("order_creates_tag");
        this.A09.A01(str);
        this.A05.A0H(new AVW(this, 18));
    }

    public void BVl(UserJid userJid) {
        this.A05.A0H(new AVW(this, 19));
    }

    public void BVm(UserJid userJid) {
        this.A05.A0H(new AVW(this, 20));
    }

    public void BWw(C203399nx r5, String str) {
        int A042;
        this.A04.A01("order_creates_tag");
        this.A09.A01(str);
        Pair A012 = AnonymousClass3ME.A01(r5);
        C195799Wb r2 = this.A00;
        if (r2 == null || A012 == null || (A042 = C36381kD.A04(A012)) != 421) {
            this.A00 = null;
            this.A05.A0H(new AVa(this, A012, 41));
            return;
        }
        A02(r2.A00, A042);
    }

    public void BiM(C203399nx r7, String str) {
        C193079Jt r3;
        this.A04.A01("order_creates_tag");
        this.A09.A02(str);
        AnonymousClass9EI r5 = this.A06;
        C203399nx A0c = r7.A0c("order");
        if (A0c != null) {
            String A0i = A0c.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
            String A0i2 = A0c.A0i("token", (String) null);
            C193089Ju A002 = r5.A00.A00(A0c.A0c("price"));
            if (A0i != null) {
                r3 = new C193079Jt(A002, A0i, A0i2);
                this.A05.A0H(new AVa(this, r3, 42));
            }
        }
        r3 = null;
        this.A05.A0H(new AVa(this, r3, 42));
    }

    public AnonymousClass8VB(AnonymousClass17Y r1, AnonymousClass1KK r2, AnonymousClass9UA r3, AnonymousClass9EI r4, C19420v0 r5, C199349fA r6, AnonymousClass19A r7, AnonymousClass3L6 r8, C63273Jk r9) {
        super(r2);
        this.A06 = r4;
        this.A05 = r1;
        this.A04 = r8;
        this.A08 = r7;
        this.A07 = r6;
        this.A03 = r5;
        this.A02 = r3;
        this.A09 = r9;
    }
}
