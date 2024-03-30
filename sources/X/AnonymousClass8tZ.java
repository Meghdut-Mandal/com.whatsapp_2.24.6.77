package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

/* renamed from: X.8tZ  reason: invalid class name */
public final class AnonymousClass8tZ extends C118095nK implements C23000Azq {
    public final C183998rj A00;
    public final C183998rj A01;
    public final C184038rn A02;
    public final C184038rn A03;

    public void Azs(AnonymousClass9EJ r9) {
        C132386Tk r4;
        AnonymousClass9OJ r6;
        C184038rn r0;
        Date date;
        C183998rj r2 = this.A01;
        if (r2 != null) {
            r9.A00.A01.A07 = r2.A00;
        }
        C183998rj r02 = this.A00;
        Date date2 = null;
        if (r02 != null) {
            String str = r02.A00;
            if (!AnonymousClass14B.A0F(str)) {
                r4 = new C132386Tk(str);
                r6 = r9.A00.A01;
                r6.A05 = r4;
                r0 = this.A02;
                if (!(r4 == null || r0 == null)) {
                    r6.A08 = C129676Ia.A00(r4, C36431kI.A09(r0.A00));
                }
                C184038rn r03 = this.A03;
                if (r4 != null && r03 != null) {
                    C184958tH r7 = (C184958tH) r03.A00;
                    BigDecimal A002 = C129676Ia.A00(r4, Long.parseLong(r7.A02));
                    try {
                        C183998rj r04 = (C183998rj) r7.A01;
                        if (r04 != null) {
                            date = AnonymousClass9ZL.A00(r04.A00);
                        } else {
                            date = null;
                        }
                        try {
                            C183998rj r05 = (C183998rj) r7.A00;
                            if (r05 != null) {
                                date2 = AnonymousClass9ZL.A00(r05.A00);
                            }
                        } catch (ParseException e) {
                            e = e;
                            Log.e("Unable to parse sale dates", e);
                            r6.A03 = new C134726bV(r4, A002, date, date2);
                            return;
                        }
                    } catch (ParseException e2) {
                        e = e2;
                        date = null;
                        Log.e("Unable to parse sale dates", e);
                        r6.A03 = new C134726bV(r4, A002, date, date2);
                        return;
                    }
                    r6.A03 = new C134726bV(r4, A002, date, date2);
                    return;
                }
            }
        }
        r4 = null;
        r6 = r9.A00.A01;
        r6.A05 = r4;
        r0 = this.A02;
        r6.A08 = C129676Ia.A00(r4, C36431kI.A09(r0.A00));
        C184038rn r032 = this.A03;
        if (r4 != null) {
        }
    }

    public AnonymousClass8tZ(C203399nx r5) {
        C203399nx.A0A(r5, "product");
        C203379ns.A0D(r5, String.class, C90474aD.A0Y(), C165577te.A0a(), new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID, "#elementValue"});
        this.A01 = (C183998rj) C203379ns.A02(r5, C21392AJs.A00, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME});
        this.A02 = (C184038rn) C203379ns.A02(r5, C21393AJt.A00, new String[]{"price"});
        this.A00 = (C183998rj) C203379ns.A02(r5, C21394AJu.A00, new String[]{"currency"});
        this.A03 = (C184038rn) C203379ns.A02(r5, C21395AJv.A00, new String[]{"sale_price"});
        this.A00 = r5;
    }
}
