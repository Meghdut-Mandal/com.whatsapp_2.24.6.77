package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.6vb  reason: invalid class name and case insensitive filesystem */
public class C146436vb implements C160107kT {
    public final AnonymousClass005 A00 = C165307tD.A00(this, 9);
    public final /* synthetic */ C101334xN A01;

    public /* synthetic */ void BW6(boolean z) {
    }

    public C146436vb(C101334xN r2) {
        this.A01 = r2;
    }

    public void BW4(long j) {
        C101334xN r6 = this.A01;
        r6.A0I(j);
        C129166Fp r3 = r6.A0e;
        r3.A0B(j);
        C124935z2 r0 = r6.A01;
        if (r0 != null) {
            r0.A0A = j;
        }
        try {
            AnonymousClass68C r02 = r6.A0f;
            File file = r02.A0C;
            if (r02.A02 == 2 && file != null && j >= 65536) {
                C132246Su r1 = (C132246Su) this.A00.get();
                if (r1.A00 == 0 && !r1.A02(j)) {
                    if (r1.A00 == 1) {
                        r6.A0B.A0N(file).createNewFile();
                        r3.A0G(AnonymousClass6ML.A00(file, (int) j));
                        return;
                    }
                    throw new C108605Ue();
                }
            }
        } catch (C108605Ue | IOException e) {
            Log.e("MediaDownload/maybeCreateStreamCheckSuccessFile", e);
        }
    }

    public void BW7(C133136Wx r1, C129166Fp r2) {
    }
}
