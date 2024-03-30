package X;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0zR  reason: invalid class name and case insensitive filesystem */
public class C21560zR implements C19710wO {
    public final C21540zP A00;
    public final C21580zT A01;
    public final C21570zS A02;
    public final C19970wo A03;
    public final C21450zG A04;

    public String BIB() {
        return "QplUploadScheduler";
    }

    public /* synthetic */ void BRM() {
    }

    public static boolean A00(C21560zR r6, int i) {
        if (TimeUnit.MINUTES.toMillis((long) i) < Math.abs(System.currentTimeMillis() - ((SharedPreferences) ((C19420v0) r6.A04.A00.get()).A00.get()).getLong("qpl_last_upload_ts", -1))) {
            return true;
        }
        return false;
    }

    public void BRL() {
        new C35731jA((Object) this, 27).run();
    }

    public C21560zR(C19970wo r1, C21540zP r2, C21580zT r3, C21450zG r4, C21570zS r5) {
        this.A03 = r1;
        this.A04 = r4;
        this.A02 = r5;
        this.A00 = r2;
        this.A01 = r3;
    }
}
