package X;

import com.whatsapp.util.Log;

public class B9V implements B1V {
    public Object A00;
    public final int A01;

    public B9V(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BWY() {
        if (this.A01 != 0) {
            Log.e("PAY: PaymentIncentiveManager/syncIncentiveData/refreshUserClaimInfo failed");
            ((AnonymousClass9RV) this.A00).A01.BWY();
            return;
        }
        Log.e("PAY: PaymentIncentiveManager/refreshUserClaimInfo/processSuccessfulGetClaimInfo failed");
        B1V b1v = ((AnonymousClass9KZ) this.A00).A01;
        if (b1v != null) {
            b1v.BWY();
        }
    }

    public void Bi8(C198019cl r3) {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            AnonymousClass9RV r0 = (AnonymousClass9RV) obj;
            r0.A01.Bi7(r0.A02.A01());
            return;
        }
        B1V b1v = ((AnonymousClass9KZ) obj).A01;
        if (b1v != null) {
            b1v.Bi8(r3);
        }
    }
}
