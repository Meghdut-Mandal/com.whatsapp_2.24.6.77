package X;

import android.view.View;
import java.util.List;

public class BA1 implements B2o {
    public Object A00;
    public final int A01;

    public BA1(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BdV(C199559fW r4) {
        if (this.A01 != 0 && r4.A00() != null) {
            List list = ((C1690583b) this.A00).A02.A00;
            AnonymousClass00C.A08(list);
            if (0 < list.size()) {
                list.get(0);
                throw AnonymousClass001.A0A("onSurfaceCreated");
            }
        }
    }

    public void BdW(C199559fW r4) {
        if (this.A01 != 0 && r4.A00() != null) {
            List list = ((C1690583b) this.A00).A02.A00;
            AnonymousClass00C.A08(list);
            if (0 < list.size()) {
                list.get(0);
                throw AnonymousClass001.A0A("onSurfaceDestroyed");
            }
        }
    }

    public void BdX(C199559fW r4, int i, int i2) {
        if (this.A01 != 0 && r4.A00() != null) {
            List list = ((C1690583b) this.A00).A02.A00;
            AnonymousClass00C.A08(list);
            if (0 < list.size()) {
                list.get(0);
                throw AnonymousClass001.A0A("onSurfaceChanged");
            }
        }
    }

    public void BdZ(View view) {
        if (this.A01 == 0) {
            AnonymousClass6YR.A04("AREngineHelper", "updateTouchInput ");
        }
    }
}
