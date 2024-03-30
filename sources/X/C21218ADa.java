package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.ADa  reason: case insensitive filesystem */
public class C21218ADa implements C160107kT {
    public final /* synthetic */ C201469jf A00;
    public final /* synthetic */ AnonymousClass9Q1 A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ void BW4(long j) {
    }

    public C21218ADa(C201469jf r1, AnonymousClass9Q1 r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }

    public void BW6(boolean z) {
        C36321k7.A1X("dyiReportManager/download-report/on-download-canceled transferred -> ", AnonymousClass000.A0u(), z);
        if (!z) {
            C201469jf r3 = this.A00;
            C20690y0 r0 = r3.A02;
            String str = this.A02;
            File A0Q = r0.A0Q(str);
            if (A0Q.exists() && !A0Q.delete()) {
                Log.e("dyiReportManager/reset/failed-delete-report-file");
            }
            r3.A08.A0F(2, str);
        }
    }

    public void BW7(C133136Wx r5, C129166Fp r6) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("dyiReportManager/download-report/on-download-canceled success -> ");
        boolean A03 = r5.A03();
        C36331k8.A1S(A0u, A03);
        if (A03) {
            C201469jf r3 = this.A00;
            String str = this.A02;
            synchronized (r3) {
                r3.A08.A0F(4, str);
            }
            AnonymousClass9Q1 r1 = this.A01;
            Log.i("DyiViewModel/download-report/on-success");
            C180358ld r0 = r1.A00;
            C36341k9.A17(r0.A02, r0.A06.A02(r0.A08));
            return;
        }
        this.A01.A00();
        this.A00.A08.A0F(2, this.A02);
    }
}
