package X;

import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import java.util.Iterator;

/* renamed from: X.6vI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C146246vI implements C158337gl {
    public final /* synthetic */ CallInfo A00;
    public final /* synthetic */ CallState A01;

    public /* synthetic */ C146246vI(CallState callState, CallInfo callInfo) {
        this.A01 = callState;
        this.A00 = callInfo;
    }

    public final void B70(Iterable iterable) {
        CallState callState = this.A01;
        CallInfo callInfo = this.A00;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((AnonymousClass6FT) it.next()).A08(callState, callInfo);
        }
    }
}
