package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.6zN  reason: invalid class name and case insensitive filesystem */
public class C148756zN implements C88594Th, C158537hf {
    public final C33771fu A00;

    public /* synthetic */ void BRD() {
    }

    public /* synthetic */ void BRJ() {
    }

    public void BRI() {
        C33771fu r3 = this.A00;
        AnonymousClass179 r2 = r3.A00;
        File A07 = r2.A07("WhatsApp.download");
        if (A07.exists()) {
            Log.a(A07.delete());
        }
        if (!r2.A07("WhatsApp.upgrade").exists()) {
            File A072 = r2.A07("WhatsApp.apk");
            if (A072.exists()) {
                Log.a(A072.delete());
            }
            C36341k9.A0u(C19420v0.A00(r3.A01), "last_upgrade_remote_sha256");
        }
    }

    public C148756zN(C33771fu r1) {
        this.A00 = r1;
    }
}
