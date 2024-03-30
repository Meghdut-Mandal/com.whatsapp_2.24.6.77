package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.3dr  reason: invalid class name and case insensitive filesystem */
public final class C69643dr implements C88414Sp {
    public final /* synthetic */ AnonymousClass4SV A00;
    public final /* synthetic */ C24971Em A01;

    public C69643dr(AnonymousClass4SV r1, C24971Em r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BXH() {
        Log.i("WabaiConsentManager/sync/error");
        this.A00.BfK(false);
    }

    public void BiH(Map map) {
        Log.i("WabaiConsentManager/sync/success");
        Boolean bool = (Boolean) map.get(20231027L);
        if (bool != null && bool.booleanValue()) {
            ((C63473Ke) this.A01.A04.getValue()).A03("yes", true);
        }
        this.A00.BfK(true);
    }
}
