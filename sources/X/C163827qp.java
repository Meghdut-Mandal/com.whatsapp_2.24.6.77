package X;

import com.whatsapp.util.Log;

/* renamed from: X.7qp  reason: invalid class name and case insensitive filesystem */
public class C163827qp implements C158697hv {
    public final int A00;

    public C163827qp(int i) {
        this.A00 = i;
    }

    public void BU1(C111855cx r2) {
        switch (this.A00) {
            case 0:
                Log.i("SupportBloksActivity - Completed language update async action");
                return;
            case 1:
                if (!(r2 instanceof C107345Ns)) {
                    Log.w("CareCsatSurveyLauncherProxy - failed to launch Care CSAT survey via Bloks async action");
                    return;
                }
                return;
            default:
                return;
        }
    }
}
