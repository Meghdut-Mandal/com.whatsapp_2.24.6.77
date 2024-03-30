package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Sp  reason: invalid class name and case insensitive filesystem */
public class C195129Sp {
    public final Context A00;
    public final AnonymousClass17Y A01;
    public final AnonymousClass6VM A02;
    public final C29221Vu A03;
    public final C29121Vk A04;
    public final C200049gU A05;
    public final C194399Pn A06;
    public final C19730wQ A07;
    public final C19970wo A08;
    public final AnonymousClass19A A09;
    public final C24601Db A0A;
    public final AnonymousClass646 A0B;

    public void A00(C202059ky r19, AF3 af3) {
        if (r19 == null) {
            AF3 af32 = af3;
            if (af3 != null) {
                Log.i("PAY: BrazilDeviceRegistrationAction starts to bind device");
                AF2 af2 = (AF2) af32.A00;
                String A002 = this.A0B.A00(5);
                String A072 = this.A0A.A07();
                AnonymousClass6VM r4 = this.A02;
                String A003 = AnonymousClass6VM.A00(r4, 5);
                String str = null;
                if (!TextUtils.isEmpty(A003)) {
                    byte[] bArr = new byte[0];
                    try {
                        byte[] bArr2 = (byte[]) JniBridge.jvidispatchOO(32, A003.getBytes(C19430v1.A0B));
                        bArr = bArr2;
                        if (bArr2 == null) {
                        }
                    } catch (UnsupportedEncodingException e) {
                        Log.e("PAY: BrazilTokenizationHelper/generateDevicePublicKeyPem failed generating public pem key: ", e);
                    }
                    str = new String(bArr).split("\u0000")[0];
                }
                JSONObject A1B = C36441kJ.A1B();
                try {
                    A1B.put("deviceId", A002).put("devicePublicKey", str).put("walletId", A072);
                } catch (JSONException e2) {
                    C36321k7.A1K(e2, "PAY: BrazilDeviceRegistrationAction payload generation failed :", AnonymousClass000.A0u());
                    e2.printStackTrace();
                }
                String A032 = r4.A03(af2, A1B.toString());
                String A004 = C237919w.A00(this.A07, this.A08);
                AnonymousClass19A r11 = this.A09;
                String A092 = r11.A09();
                AnonymousClass6QB A0T = C36421kH.A0T();
                C165567td.A1D(A0T);
                C203539oF.A0E(A0T, A092);
                AnonymousClass6QB A0a = C165587tf.A0a();
                C36331k8.A1D(A0a, "action", "br-device-registration");
                C203539oF.A0F(A0a, A004);
                AnonymousClass6QB A0q = C36441kJ.A0q("elo");
                if (C203539oF.A0V(A032, 1, false)) {
                    C36331k8.A1D(A0q, "ciphered_binding_info", A032);
                }
                if (C203539oF.A0T(A002, 1, false)) {
                    C36331k8.A1D(A0q, "network_device_id", A002);
                }
                A0T.A05(C165567td.A0I(A0q, A0a));
                r11.A0E(new B7H(this.A00, this.A03, this.A01, this, 2), A0T.A03(), A092, 204, 0);
                return;
            }
        }
        Log.i("PAY: BrazilDeviceRegistrationAction missing key");
        C194399Pn r2 = this.A06;
        new C202059ky();
        r2.A00((C193879Ng) null);
    }

    public C195129Sp(Context context, AnonymousClass17Y r2, C19730wQ r3, C19970wo r4, AnonymousClass19A r5, AnonymousClass6VM r6, C29221Vu r7, C24601Db r8, C29121Vk r9, C200049gU r10, C194399Pn r11, AnonymousClass646 r12) {
        this.A08 = r4;
        this.A00 = context;
        this.A01 = r2;
        this.A07 = r3;
        this.A09 = r5;
        this.A0A = r8;
        this.A04 = r9;
        this.A0B = r12;
        this.A02 = r6;
        this.A03 = r7;
        this.A05 = r10;
        this.A06 = r11;
    }
}
