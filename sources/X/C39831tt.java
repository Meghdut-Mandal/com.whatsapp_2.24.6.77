package X;

import com.whatsapp.util.Log;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1tt  reason: invalid class name and case insensitive filesystem */
public abstract class C39831tt extends AnonymousClass04R {
    public String A00;
    public final C001700s A01;
    public final C21100yf A02;
    public final C19970wo A03;
    public final C20310xM A04;
    public final C20810yC A05;
    public final C131606Ps A06 = new C131606Ps(new C131606Ps[0]);
    public final C23075B3f A07;
    public final C29551Xb A08;
    public final C28201Rs A09 = C36441kJ.A0t();

    public String A0S() {
        if (this instanceof AnonymousClass2a4) {
            return "report_this_payment_submitted";
        }
        if (this instanceof AnonymousClass2a1) {
            return "contact_support_integrity_dpo_submitted";
        }
        if (this instanceof AnonymousClass2a0) {
            return "appeal_request_ack";
        }
        if (this instanceof AnonymousClass2Zz) {
            return "contact_support_submitted";
        }
        if (this instanceof AnonymousClass2a3) {
            return "contact_support_submitted_p2p";
        }
        return "contact_ombudsman_submitted";
    }

    public String A0T() {
        if (this instanceof AnonymousClass2a4) {
            return "report_this_payment";
        }
        if (this instanceof AnonymousClass2a1) {
            return "contact_support_integrity_dpo";
        }
        if (this instanceof AnonymousClass2a0) {
            return "restore_payment";
        }
        if (this instanceof AnonymousClass2Zz) {
            return "contact_support";
        }
        if (this instanceof AnonymousClass2a3) {
            return "contact_support_p2p";
        }
        return "contact_ombudsman";
    }

    public void A0X(String str) {
        this.A00 = str;
        this.A06.A03("transaction_id", str);
    }

    public C39831tt(C21100yf r4, C19970wo r5, C20310xM r6, C20810yC r7, C23075B3f b3f, C29551Xb r9) {
        C001700s A0S = C36431kI.A0S();
        this.A01 = A0S;
        this.A05 = r7;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A08 = r9;
        this.A07 = b3f;
        A0S.A0D(new AnonymousClass35B(1));
    }

    public String A0U(String str, String str2) {
        String str3;
        StringBuilder A0u = AnonymousClass000.A0u();
        if (this instanceof AnonymousClass2a4) {
            str3 = "### ";
        } else if (this instanceof AnonymousClass2a1) {
            str3 = "##### ";
        } else if (this instanceof AnonymousClass2a0) {
            str3 = "#### ";
        } else if (this instanceof AnonymousClass2Zz) {
            str3 = "## ";
        } else {
            if (this instanceof AnonymousClass2a3) {
                str3 = "###### ";
            }
            return AnonymousClass000.A0q(str2, A0u);
        }
        A0u.append(str3);
        if (!AnonymousClass14B.A0F(str)) {
            A0u.append(str);
        }
        A0u.append(10);
        return AnonymousClass000.A0q(str2, A0u);
    }

    public void A0V(String str) {
        C131606Ps A002 = C203049nB.A00();
        A002.A01(this.A06);
        A002.A03("status", str);
        this.A07.BOp(A002, C36361kB.A0i(), 114, A0T(), (String) null);
    }

    public void A0W(String str) {
        int i;
        if (str.getBytes().length >= 10) {
            Matcher matcher = Pattern.compile("[a-zA-Z\\u0080-\\u00ff]+").matcher(str);
            int i2 = 0;
            while (matcher.find()) {
                i2++;
                if (i2 >= 3) {
                    A0V("sent");
                    this.A01.A0D(new AnonymousClass35B(4));
                    boolean z = this instanceof AnonymousClass2a2;
                    C20810yC r1 = this.A05;
                    if (z) {
                        i = 1925;
                    } else {
                        i = 1924;
                    }
                    String A092 = r1.A09(i);
                    C18740tg.A06(A092);
                    try {
                        C29551Xb r2 = this.A08;
                        C222713q r0 = AnonymousClass11F.A00;
                        this.A04.A0h(r2.A00(C222713q.A01(A092), (AnonymousClass3T1) null, C79963uZ.A00, A0U(this.A00, str), (List) null, C19970wo.A00(this.A03)));
                        return;
                    } catch (C19740wR unused) {
                        Log.e("PAY: BrazilPaymentCareBaseViewModel - failed to send message to Payment Support Brazil JID");
                        return;
                    }
                }
            }
        }
        A0V("failed");
        this.A01.A0D(new AnonymousClass35B(2));
    }
}
