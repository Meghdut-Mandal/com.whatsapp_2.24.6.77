package X;

import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.report.ReportActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2jo  reason: invalid class name and case insensitive filesystem */
public class C49862jo extends C132446Tt {
    public final AnonymousClass17Y A00;
    public final AnonymousClass4UG A01;
    public final C51622o7 A02;
    public final WeakReference A03;

    public C49862jo(C225314u r2, AnonymousClass17Y r3, AnonymousClass4UG r4, C51622o7 r5) {
        super(r2, true);
        this.A03 = AnonymousClass001.A0F(r2);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    public void A0A() {
        C225314u A0W = C36411kG.A0W(this.A03);
        if (A0W != null && !A0W.BLh()) {
            A0W.Bu2(0, R.string.f12nameremoved);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C225314u A0W = C36411kG.A0W(this.A03);
        if (A0W != null && !A0W.BLh()) {
            A0W.Bnv();
            this.A01.Bn9(this.A02);
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass4UG r4 = this.A01;
        C51622o7 r3 = this.A02;
        ReportActivity reportActivity = (ReportActivity) r4;
        try {
            reportActivity.A09.A00(new AnonymousClass3MN(r3, reportActivity, 1), r3).get(32000, TimeUnit.MILLISECONDS);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 < 500) {
                try {
                    Thread.sleep(500 - elapsedRealtime2);
                    return null;
                } catch (InterruptedException unused) {
                }
            }
        } catch (Exception e) {
            Log.w("send-request-gdpr-report/timeout", e);
            C81153wY.A00(this.A00, this, 37);
        }
        return null;
    }
}
