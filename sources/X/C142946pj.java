package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import javax.crypto.SecretKey;

/* renamed from: X.6pj  reason: invalid class name and case insensitive filesystem */
public final class C142946pj implements C23022B0s {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1KR A01;
    public final /* synthetic */ C160037kM A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ SecretKey A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ byte[] A07;

    public C142946pj(AnonymousClass1KR r1, C160037kM r2, String str, SecretKey secretKey, byte[] bArr, int i, boolean z, boolean z2) {
        this.A05 = z;
        this.A01 = r1;
        this.A06 = z2;
        this.A00 = i;
        this.A02 = r2;
        this.A03 = str;
        this.A04 = secretKey;
        this.A07 = bArr;
    }

    public void BYU(UserJid userJid) {
        String str;
        AnonymousClass1KY r6 = this.A01.A00;
        C160037kM r5 = this.A02;
        boolean z = this.A05;
        boolean z2 = this.A06;
        int i = this.A00;
        Log.w("FlowsLogger/FlowsDataCryptoProcessor/loadGalaxyBizPublicKey()/onGetBusinessPublicKeyError()");
        if (z) {
            AnonymousClass1KT r1 = r6.A05;
            if (z2) {
                str = "fetch_key_network_1_end";
            } else {
                str = "fetch_key_network_end";
            }
            C90494aF.A0x(r1, str, i);
            r1.A0F(z2, i);
            r1.A0E(z2, i);
            r1.A0B(i, "extensions-public-key-error-response", (String) null);
        }
        if (r5 != null) {
            r5.BV7("extensions-public-key-error-response");
        }
        if (r5 != null) {
            r5.BZU(false, "extensions-public-key-error-response");
        }
        r6.A00.A0E("extensions-public-key-error-response", "", false);
    }

    public void BYV(UserJid userJid, String str, String str2, String str3) {
        String str4;
        if (this.A05) {
            AnonymousClass1KT r2 = this.A01.A03;
            boolean z = this.A06;
            int i = this.A00;
            if (z) {
                str4 = "fetch_key_network_1_end";
            } else {
                str4 = "fetch_key_network_end";
            }
            C90494aF.A0x(r2, str4, i);
        }
        UserJid userJid2 = userJid;
        String str5 = str2;
        String str6 = str3;
        this.A01.A00.A02(this.A02, userJid2, str5, str6, this.A03, this.A04, this.A07, this.A00, this.A06);
    }
}
