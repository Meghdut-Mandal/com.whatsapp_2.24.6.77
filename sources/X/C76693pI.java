package X;

import com.whatsapp.util.Log;

/* renamed from: X.3pI  reason: invalid class name and case insensitive filesystem */
public class C76693pI implements C236119d {
    public final /* synthetic */ int A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ byte[] A02;
    public final /* synthetic */ AnonymousClass1XF A03;

    public C76693pI(AnonymousClass1XF r1, String str, byte[] bArr, int i) {
        this.A03 = r1;
        this.A02 = bArr;
        this.A01 = str;
        this.A00 = i;
    }

    public void BVN(String str) {
        Log.e("BackupTokenProtocolHelper/sendBackupTokenRequest/IQ delivery failure");
    }

    public void BWw(C203399nx r2, String str) {
        Log.e("BackupTokenProtocolHelper/sendBackupTokenRequest/IQ error");
    }

    public void BiM(C203399nx r8, String str) {
        Log.i("BackupTokenProtocolHelper/sendBackupTokenRequest/success");
        this.A03.A04.Boy(new C80523vX(this, this.A02, this.A01, this.A00, 10));
    }
}
