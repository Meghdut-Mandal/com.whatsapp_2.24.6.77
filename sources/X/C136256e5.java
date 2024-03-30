package X;

import android.content.Intent;
import androidx.car.app.IStartCarApp;

/* renamed from: X.6e5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C136256e5 implements AnonymousClass7dV {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ IStartCarApp A01;

    public /* synthetic */ C136256e5(Intent intent, IStartCarApp iStartCarApp) {
        this.A01 = iStartCarApp;
        this.A00 = intent;
    }

    public final Object call() {
        this.A01.startCarApp(this.A00);
        return null;
    }
}
