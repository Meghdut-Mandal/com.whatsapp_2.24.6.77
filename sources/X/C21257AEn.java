package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;

/* renamed from: X.AEn  reason: case insensitive filesystem */
public final class C21257AEn implements B1Q {
    public final /* synthetic */ C178688gw A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public void Bdl(C202059ky r3) {
        AnonymousClass00C.A0D(r3, 0);
        Log.e("PAY: FcsPaymentsDataEncryptionResource getProviderEncryptionKeyAsync iq returned null");
        C178688gw.A00(this.A00, r3.A00);
    }

    public void Bdm(AF3 af3) {
        String encodeToString;
        AnonymousClass00C.A0D(af3, 0);
        C178688gw r3 = this.A00;
        String str = this.A02;
        String str2 = this.A01;
        AnonymousClass00C.A0D(str2, 1);
        if (AnonymousClass00C.A0J(str, "OTP")) {
            encodeToString = r3.A03.A04(af3, str2);
        } else {
            String str3 = C19430v1.A0B;
            AnonymousClass00C.A09(str3);
            Charset forName = Charset.forName(str3);
            AnonymousClass00C.A08(forName);
            byte[] bytes = str2.getBytes(forName);
            AnonymousClass00C.A08(bytes);
            encodeToString = Base64.encodeToString(AF3.A00(af3, bytes), 2);
        }
        if (encodeToString == null || encodeToString.length() == 0) {
            C178688gw.A00(r3, -1);
            return;
        }
        C159627jf r4 = r3.A00;
        if (r4 == null) {
            throw C36331k8.A0d("resourceResultCallback");
        }
        AnonymousClass011[] r32 = new AnonymousClass011[4];
        C36341k9.A1J("data", encodeToString, r32, 0);
        C36341k9.A1J("key_type", af3.A03, r32, 1);
        C36341k9.A1J("key_provider", af3.A05, r32, 2);
        C36341k9.A1J("key_version", af3.A04, r32, 3);
        r4.BiH(C000400e.A08(r32));
    }

    public C21257AEn(C178688gw r1, String str, String str2) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = str2;
    }
}
