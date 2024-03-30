package X;

import com.whatsapp.jid.UserJid;
import javax.crypto.SecretKey;

/* renamed from: X.64x  reason: invalid class name and case insensitive filesystem */
public final class C1266564x {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1KY A01;
    public final /* synthetic */ C160037kM A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ SecretKey A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ byte[] A08;

    public C1266564x(AnonymousClass1KY r1, C160037kM r2, UserJid userJid, String str, String str2, SecretKey secretKey, byte[] bArr, int i, boolean z) {
        this.A01 = r1;
        this.A03 = userJid;
        this.A02 = r2;
        this.A05 = str;
        this.A00 = i;
        this.A07 = z;
        this.A04 = str2;
        this.A06 = secretKey;
        this.A08 = bArr;
    }

    public void A00(boolean z) {
        if (z) {
            AnonymousClass1KY r0 = this.A01;
            UserJid userJid = this.A03;
            AnonymousClass1KY.A01(r0, this.A02, userJid, this.A05, this.A04, this.A06, this.A08, this.A00, this.A07);
            return;
        }
        AnonymousClass1KY.A00(this.A01, this.A02, this.A03, this.A00, this.A07);
    }
}
