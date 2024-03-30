package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9fz  reason: invalid class name and case insensitive filesystem */
public final class C199799fz {
    public AE0 A00;
    public final AnonymousClass00T A01 = C36431kI.A1I(new C22189AiC(this));
    public final C19760wT A02;

    public final C195839Wg A01(String str) {
        long j;
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass00T r5 = this.A01;
        C195839Wg r0 = (C195839Wg) C90514aH.A16(r5).get(str);
        if (r0 != null) {
            j = r0.A00;
        } else {
            j = 0;
        }
        if (j < C165597tg.A0B()) {
            C90514aH.A16(r5).remove(str);
            A00(this, C90514aH.A16(r5));
        }
        return (C195839Wg) C90514aH.A16(r5).get(str);
    }

    public final boolean A02() {
        AnonymousClass00T r7 = this.A01;
        Iterator A0y = AnonymousClass000.A0y(C90514aH.A16(r7));
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            if (((C195839Wg) A11.getValue()).A00 < C165597tg.A0B()) {
                C90514aH.A16(r7).remove(((C195839Wg) A11.getValue()).A03);
                A00(this, C90514aH.A16(r7));
            }
        }
        return !C90514aH.A16(r7).isEmpty();
    }

    public C199799fz(C19760wT r2, AE0 ae0) {
        C36321k7.A0x(ae0, r2);
        this.A00 = ae0;
        this.A02 = r2;
    }

    public static final void A00(C199799fz r7, Map map) {
        JSONArray A0u = C90524aI.A0u();
        try {
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                C195839Wg r4 = (C195839Wg) C36351kA.A0u(A0y);
                JSONObject A1B = C36441kJ.A1B();
                A1B.put("credentialId", r4.A03);
                A1B.put("internationalActivationStatus", r4.A02);
                A1B.put("startTime", r4.A01);
                A1B.put("endTime", r4.A00);
                A0u.put(A1B);
            }
            AE0 ae0 = r7.A00;
            synchronized (ae0) {
                C24601Db r0 = ae0.A01;
                C36341k9.A0x(C90494aF.A0E(r0), "payments_upi_international_status", A0u.toString());
            }
        } catch (JSONException unused) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs saveInternationalState threw: an exception ");
        }
    }
}
