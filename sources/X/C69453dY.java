package X;

import android.app.Activity;
import com.whatsapp.R;

/* renamed from: X.3dY  reason: invalid class name and case insensitive filesystem */
public final class C69453dY implements AnonymousClass4PI {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass4PI A01;
    public final /* synthetic */ AnonymousClass1NG A02;
    public final /* synthetic */ AnonymousClass141 A03;
    public final /* synthetic */ boolean A04;

    public C69453dY(Activity activity, AnonymousClass4PI r2, AnonymousClass1NG r3, AnonymousClass141 r4, boolean z) {
        this.A04 = z;
        this.A02 = r3;
        this.A00 = activity;
        this.A03 = r4;
        this.A01 = r2;
    }

    public void BfK(boolean z) {
        if (z) {
            boolean z2 = this.A04;
            int i = R.string.f12nameremoved;
            if (z2) {
                i = R.string.f12nameremoved;
            }
            AnonymousClass1NG r0 = this.A02;
            AnonymousClass17Y r6 = r0.A02;
            Activity activity = this.A00;
            Object[] objArr = new Object[1];
            C36361kB.A1F(r0.A08, this.A03, objArr, 0);
            r6.A0E(activity.getString(i, objArr), 1);
        }
        AnonymousClass4PI r02 = this.A01;
        if (r02 != null) {
            r02.BfK(z);
        }
    }
}
