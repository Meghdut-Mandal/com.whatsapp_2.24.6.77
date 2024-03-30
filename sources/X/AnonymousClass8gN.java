package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.8gN  reason: invalid class name */
public class AnonymousClass8gN extends AnonymousClass9I1 {
    public final C24611Dc A00 = C165597tg.A0S("IndiaUpiRegisterAliasAction");
    public final AnonymousClass17Y A01;
    public final C19630wG A02;
    public final C29221Vu A03;
    public final AF7 A04;
    public final C29131Vl A05;

    public AnonymousClass8gN(AnonymousClass17Y r2, C19630wG r3, C202269lR r4, C29221Vu r5, C29121Vk r6, AF7 af7, C29131Vl r8) {
        super(r4.A04, r6);
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r8;
        this.A03 = r5;
        this.A04 = af7;
    }

    public static void A00(C202059ky r2, AnonymousClass8gN r3, String str) {
        AF7 af7;
        int i;
        if (str.equalsIgnoreCase("add")) {
            af7 = r3.A04;
            i = 22;
        } else if (str.equalsIgnoreCase("port")) {
            af7 = r3.A04;
            i = 24;
        } else {
            return;
        }
        af7.BOb(r2, i);
    }

    public void A01(C135086c7 r16, C135086c7 r17, C22966AzI azI, String str, String str2, String str3) {
        Log.i("PAY: registerAlias called");
        AnonymousClass9YX r5 = this.A00;
        r5.A02("register-alias");
        ArrayList A0I = AnonymousClass001.A0I();
        C36381kD.A1M("alias_value", C165577te.A0k(r17), A0I);
        C36381kD.A1M("alias_type", str2, A0I);
        String str4 = str;
        if (!TextUtils.isEmpty(str4)) {
            C36381kD.A1M("vpa_id", str4, A0I);
        }
        C135086c7 r1 = r16;
        if (!C202349ld.A02(r1)) {
            C36381kD.A1M("vpa", (String) r1.A00, A0I);
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        C36381kD.A1M("action", "register-alias", A0I2);
        C36381kD.A1M("device_id", this.A05.A01(), A0I2);
        String str5 = str3;
        C36381kD.A1M("op", str5, A0I2);
        this.A01.A0H(new AnonymousClass8gY(this.A02.A00, this.A01, this.A03, r5, azI, this, str5), new C203399nx(C203399nx.A04("alias", C165577te.A1a(A0I, 0)), "account", C165577te.A1a(A0I2, 0)), "set", 0);
    }
}
