package X;

import android.view.ViewTreeObserver;
import java.io.File;

/* renamed from: X.6dN  reason: invalid class name and case insensitive filesystem */
public class C135856dN implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00 = true;
    public final /* synthetic */ C132476Tw A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ C1492470k A03;

    public void onGlobalLayout() {
        C1492470k r3 = this.A03;
        double floor = Math.floor((double) (C36441kJ.A01(r3.A03) / r3.A03.A0B));
        if (floor != 0.0d || !this.A00) {
            this.A00 = true;
            C36351kA.A1C(r3.A0J.A01(), this);
            r3.A0K.Bp1(new AnonymousClass73H(this.A01, this, this.A02, floor));
            return;
        }
        this.A00 = false;
    }

    public C135856dN(C132476Tw r2, C1492470k r3, File file) {
        this.A03 = r3;
        this.A02 = file;
        this.A01 = r2;
    }
}
