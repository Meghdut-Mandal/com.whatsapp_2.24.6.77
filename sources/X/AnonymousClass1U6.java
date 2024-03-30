package X;

import android.app.Service;
import android.content.Context;

/* renamed from: X.1U6  reason: invalid class name */
public abstract class AnonymousClass1U6 extends Service {
    public C228816i A00;
    public C18820ts A01;

    public void attachBaseContext(Context context) {
        C18800tq r1 = (C18800tq) C18810tr.A00(context, C18800tq.class);
        this.A01 = r1.BxU();
        C228916j A0Z = C18830tt.A0Z(r1.AfI.A00);
        this.A00 = A0Z;
        super.attachBaseContext(new C229016k(context, A0Z, this.A01));
    }
}
