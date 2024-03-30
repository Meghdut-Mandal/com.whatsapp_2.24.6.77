package X;

import android.content.Context;
import android.os.Environment;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.3PY  reason: invalid class name */
public class AnonymousClass3PY {
    public final C20810yC A00;
    public final C31211bS A01;
    public final C24341Cb A02;
    public final C20060wx A03;
    public final C21520zN A04;

    public String A01(Context context) {
        C20060wx r3 = this.A03;
        long A022 = r3.A02();
        long[] jArr = new long[1];
        if (this.A02.A03(new AnonymousClass3MM(jArr, this, 1))) {
            jArr[0] = r3.A01();
        }
        String externalStorageState = Environment.getExternalStorageState();
        return this.A01.A05(context, (Pair) null, (AnonymousClass147) null, "blocked_ban_appeals", (String) null, (String) null, externalStorageState, (List) null, (List) null, (JSONObject) null, jArr[0], A022, true, false, false);
    }

    public boolean A02() {
        if (this.A04.A0E(2500) || this.A00.A0E(1536)) {
            return true;
        }
        return false;
    }

    public AnonymousClass3PY(C24341Cb r1, C20060wx r2, C21520zN r3, C20810yC r4, C31211bS r5) {
        this.A00 = r4;
        this.A03 = r2;
        this.A04 = r3;
        this.A01 = r5;
        this.A02 = r1;
    }

    public static File A00(AnonymousClass3PY r6, File file, int i) {
        Log.rotate();
        Log.compress();
        return r6.A01.A04(file, i, true, true, r6.A02());
    }
}
