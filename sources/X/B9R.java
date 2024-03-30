package X;

import androidx.car.app.model.OnCheckedChangeDelegateImpl;
import androidx.car.app.navigation.model.PanModeDelegateImpl;

public class B9R implements AnonymousClass7dU {
    public Object A00;
    public boolean A01;
    public final int A02;

    public B9R(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    public final Object B5f() {
        int i = this.A02;
        Object obj = this.A00;
        if (i != 0) {
            ((PanModeDelegateImpl.PanModeListenerStub) obj).m40lambda$onPanModeChanged$0$androidxcarappnavigationmodelPanModeDelegateImpl$PanModeListenerStub(this.A01);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        ((OnCheckedChangeDelegateImpl.OnCheckedChangeListenerStub) obj).m31lambda$onCheckedChange$0$androidxcarappmodelOnCheckedChangeDelegateImpl$OnCheckedChangeListenerStub(this.A01);
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }
}
