package X;

import android.text.TextUtils;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tasks.zzw;
import com.whatsapp.util.Log;

/* renamed from: X.1BW  reason: invalid class name */
public class AnonymousClass1BW {
    public final AnonymousClass1BZ A00;
    public final C20810yC A01;
    public final C19700wN A02;
    public final C19630wG A03;
    public final AnonymousClass1BX A04;

    public void A00() {
        if (C34201gc.A00(this.A03.A00) == 0 && !this.A04.A07()) {
            if (C20800yB.A01(C21000yV.A01, this.A01, 4391)) {
                AnonymousClass1BZ r2 = this.A00;
                if (!C132946Vx.A02()) {
                    synchronized (AnonymousClass1BY.class) {
                        if (!C132946Vx.A02()) {
                            zzw A002 = C132946Vx.A00(r2.A00.A00);
                            try {
                                Tasks.await(A002);
                                if (A002.isSuccessful()) {
                                    r2.A00();
                                    return;
                                }
                            } catch (Exception unused) {
                                Log.e("AbstractCronetEngineProvider/installAndCreateCronetEngine/Sync cronet engine install failed");
                            }
                        }
                    }
                }
                r2.A00();
            }
            return;
        }
        return;
        r2.A00();
    }

    public AnonymousClass1BW(C19700wN r1, C19630wG r2, AnonymousClass1BZ r3, C20810yC r4, AnonymousClass1BX r5) {
        this.A01 = r4;
        this.A03 = r2;
        this.A02 = r1;
        this.A04 = r5;
        this.A00 = r3;
    }

    public void A01(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (C20800yB.A01(C21000yV.A02, this.A01, 5478)) {
                this.A02.A0E("CronetExceptionFinal", str, true);
            }
        }
    }
}
