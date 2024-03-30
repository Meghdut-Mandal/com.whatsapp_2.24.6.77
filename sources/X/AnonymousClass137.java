package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.137  reason: invalid class name */
public abstract class AnonymousClass137 {
    public final C19700wN A00;
    public final C19890wg A01;
    public final C21100yf A02;

    public C1264463z A06(byte[] bArr) {
        C1264463z A012 = ((AnonymousClass138) this).A00.A01(AnonymousClass6JD.A0V, bArr);
        if (A012 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("EncryptedKeyHelperAESPassword/");
            sb.append("crypto issue on encryption");
            Log.e(sb.toString());
        }
        return A012;
    }

    public void A07() {
    }

    public byte[] A08(C1264463z r4, Integer num) {
        String str;
        byte[] A022 = ((AnonymousClass138) this).A00.A02(r4, AnonymousClass6JD.A0V);
        if (A022 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("EncryptedKeyHelperAESPassword/");
            sb.append("crypto issue on decryption while ");
            if (num.intValue() != 0) {
                str = "READ_ACTIVE";
            } else {
                str = "READ_SELFTEST";
            }
            sb.append(str);
            Log.e(sb.toString());
        }
        return A022;
    }

    public static void A00(String str, Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append("EncryptedKeyHelper/reportEncryptedKeyHelperProblem/");
        sb.append(str);
        Log.e(sb.toString(), exc);
    }

    public void A05(String str, Throwable th) {
        Log.e("EncryptedKeyHelper/reportKeystoreCriticalException/", th);
        SharedPreferences A002 = this.A01.A00("keystore");
        long j = A002.getLong("client_static_keypair_enc_success", 0);
        long j2 = A002.getLong("client_static_keypair_enc_failed", 0);
        C19700wN r5 = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("keystore-error-");
        sb.append(str);
        sb.append("-");
        sb.append(th.getClass().getSimpleName());
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(th.getMessage());
        sb2.append(String.format(Locale.US, " KS Stats OK/KO: %d/%d", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        r5.A0D(obj, sb2.toString(), th);
    }

    public AnonymousClass137(C19700wN r1, C21100yf r2, C19890wg r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }
}
