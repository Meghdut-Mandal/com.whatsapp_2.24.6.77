package androidx.work.impl.workers;

import X.AnonymousClass000;
import X.AnonymousClass6VD;
import X.B0S;
import X.C112595e9;
import X.C128916Ec;
import X.C36321k7;
import X.C36441kJ;
import X.C97484pl;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.List;

public final class ConstraintTrackingWorker extends C128916Ec implements B0S {
    public C128916Ec A00;
    public final WorkerParameters A01;
    public final C97484pl A02 = new C97484pl();
    public final Object A03 = C36441kJ.A11();
    public volatile boolean A04;

    public void BR2(List list) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C36321k7.A0x(context, workerParameters);
        this.A01 = workerParameters;
    }

    public void BR3(List list) {
        AnonymousClass6VD.A02(AnonymousClass6VD.A00(), list, "Constraints changed for ", C112595e9.A00, AnonymousClass000.A0u());
        synchronized (this.A03) {
            this.A04 = true;
        }
    }
}
