package X;

import androidx.car.app.model.AlertCallbackDelegateImpl;
import androidx.car.app.model.OnSelectedDelegateImpl;

public class B9O implements AnonymousClass7dU {
    public int A00;
    public Object A01;
    public final int A02;

    public B9O(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public final Object B5f() {
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            ((OnSelectedDelegateImpl.OnSelectedListenerStub) obj).m35lambda$onSelected$0$androidxcarappmodelOnSelectedDelegateImpl$OnSelectedListenerStub(this.A00);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        ((AlertCallbackDelegateImpl.AlertCallbackStub) obj).m27lambda$onAlertCancelled$0$androidxcarappmodelAlertCallbackDelegateImpl$AlertCallbackStub(this.A00);
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }
}
