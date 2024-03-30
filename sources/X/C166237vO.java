package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: X.7vO  reason: invalid class name and case insensitive filesystem */
public class C166237vO extends OrientationEventListener {
    public final /* synthetic */ C20952A0j A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166237vO(Context context, C20952A0j a0j) {
        super(context);
        this.A00 = a0j;
    }

    public void onOrientationChanged(int i) {
        int i2 = ((((i + 45) + 360) / 90) % 4) * 90;
        C20952A0j a0j = this.A00;
        int A002 = C20952A0j.A00(a0j);
        if (a0j.A03 != i2 || a0j.A04 != A002) {
            a0j.A03 = i2;
            a0j.A0L.Bc2(i2);
            C20952A0j.A03(a0j, a0j.A0D);
        }
    }
}
