package X;

import android.content.Context;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9cx  reason: invalid class name and case insensitive filesystem */
public class C198129cx {
    public String A00;
    public final Context A01;
    public final AnonymousClass17Y A02;
    public final C29221Vu A03;
    public final C29121Vk A04;
    public final C200049gU A05;
    public final C29131Vl A06;

    public C198129cx(Context context, AnonymousClass17Y r8, C29221Vu r9, C29121Vk r10, C200049gU r11, C29131Vl r12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        String str11 = str5;
        String str12 = str6;
        this.A01 = context;
        this.A02 = r8;
        this.A06 = r12;
        this.A04 = r10;
        this.A03 = r9;
        this.A05 = r11;
        if (str3.length() == 12) {
            StringBuilder A0u = AnonymousClass000.A0u();
            C165577te.A1O(str3, A0u, 0, 4);
            A0u.append("9");
            str3 = AnonymousClass000.A0q(str3.substring(4), A0u);
        }
        try {
            JSONObject A1B = C36441kJ.A1B();
            A1B.put("fullName", str);
            A1B.put("personalID", str2);
            JSONObject A0x = C90484aE.A0x(str3, "phone", A1B);
            A0x.put("street", str4);
            String str13 = "";
            A0x.put("addressNumber", str5 == null ? str13 : str11);
            A0x.put("extraLine", str6 == null ? str13 : str12);
            A0x.put("neighborhood", str7 != null ? str7 : str13);
            A0x.put("city", str8);
            A0x.put("state", str9);
            A0x.put("addressCode", str10);
            A0x.put("country", "BR");
            A1B.put("address", A0x);
            this.A00 = A1B.toString();
        } catch (JSONException e) {
            C36321k7.A1J(e, "PAY: BrazilSendKYCAction Exception: ", AnonymousClass000.A0u());
        }
    }

    public static void A00(C198129cx r15, B1P b1p, AF3 af3, String str) {
        Context context = r15.A01;
        AnonymousClass17Y r10 = r15.A02;
        C29131Vl r14 = r15.A06;
        C193869Nf r8 = new C193869Nf(context, r10, r15.A03, r15.A04, r15.A05, r14);
        try {
            C203399nx[] r4 = new C203399nx[1];
            AF3 af32 = af3;
            byte[] A002 = AF3.A00(af32, r15.A00.getBytes(C19430v1.A0B));
            C24611Dc r2 = r8.A05;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("sendKyc Text Blob : ");
            C165567td.A18(r2, Base64.encodeToString(A002, 2), A0u);
            AnonymousClass1AL[] r22 = new AnonymousClass1AL[1];
            boolean A1Y = C36371kC.A1Y("key-type", af32.A03, r22);
            C203399nx.A0G("text", A002, r22, r4, A1Y ? 1 : 0);
            ArrayList A0I = AnonymousClass001.A0I();
            C36381kD.A1M("action", "send-kyc-data", A0I);
            String str2 = af32.A05;
            C36381kD.A1M("provider", str2, A0I);
            C36381kD.A1M("key-version", af32.A04, A0I);
            String str3 = str;
            if (str != null) {
                C36381kD.A1M("kyc-action-type", str3, A0I);
            }
            C36381kD.A1M("device-id", r8.A06.A01(), A0I);
            C203399nx A052 = C203399nx.A05("account", C165577te.A1a(A0I, A1Y), r4);
            r8.A03.A0H(new C178448fx(r8.A00, r8.A02, b1p, r8, r8.A01, "send-kyc-data", str2), A052, "set", 0);
        } catch (UnsupportedEncodingException e) {
            throw new Error(e);
        }
    }
}
