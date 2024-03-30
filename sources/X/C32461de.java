package X;

import android.view.View;
import com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2;
import com.whatsapp.util.Log;

/* renamed from: X.1de  reason: invalid class name and case insensitive filesystem */
public class C32461de {
    public final /* synthetic */ CallsHistoryFragmentV2 A00;

    public C32461de(CallsHistoryFragmentV2 callsHistoryFragmentV2) {
        this.A00 = callsHistoryFragmentV2;
    }

    public void A00(View view, C34841hj r7) {
        CallsHistoryFragmentV2 callsHistoryFragmentV2 = this.A00;
        AnonymousClass01I A0h = callsHistoryFragmentV2.A0h();
        if (A0h == null) {
            Log.w("voip/CallsFragment no activity registered to open contact");
            return;
        }
        C64713Pd r1 = new C64713Pd(view, r7.BDC(), (Integer) 6);
        r1.A04 = C011004s.A03(view);
        r1.A02(A0h);
        callsHistoryFragmentV2.A0F.A0X(r7);
    }
}
