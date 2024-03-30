package X;

import android.text.TextUtils;
import com.whatsapp.backup.google.workers.GoogleEncryptedReUploadWorker;
import java.util.Random;

/* renamed from: X.6se  reason: invalid class name and case insensitive filesystem */
public class C144686se implements C30631aW {
    public final C24431Ck A00;
    public final C19970wo A01;
    public final C19420v0 A02;
    public final C21570zS A03;

    public /* synthetic */ void BV2() {
    }

    public void BV3() {
        C19420v0 r3 = this.A00.A03;
        if (r3.A2I() && r3.A0C() != 0 && r3.A0C() != 1) {
            String A0c = r3.A0c();
            if (r3.A2I() && !TextUtils.isEmpty(A0c) && r3.A0N(A0c) == 1) {
                GoogleEncryptedReUploadWorker.A02(this.A02, this.A03, C023109s.A01, new Random(), false);
            }
        }
    }

    public C144686se(C24431Ck r1, C19970wo r2, C19420v0 r3, C21570zS r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
    }
}
