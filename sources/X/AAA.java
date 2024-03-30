package X;

import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;

public final class AAA implements C22934Ayk {
    public final C20310xM A00;
    public final C21337AHp A01;

    public void BJg(byte[] bArr) {
        String str;
        AnonymousClass3T1 A012 = this.A01.A01(AB3.A00);
        if (!A012.A1F()) {
            Log.i("decryptmessagerunnable/axolotl message decryption had no data; ciphertext only");
            if (bArr != null) {
                try {
                    str = new String(bArr, C19430v1.A0B);
                } catch (UnsupportedEncodingException unused) {
                }
                A012.A16(str);
            }
            str = null;
            A012.A16(str);
        }
        this.A00.A0P(A012);
    }

    public AAA(C20310xM r1, C21337AHp aHp) {
        this.A00 = r1;
        this.A01 = aHp;
    }
}
