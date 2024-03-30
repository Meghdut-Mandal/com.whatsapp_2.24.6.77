package X;

import android.app.Activity;
import com.whatsapp.RequestPermissionActivity;

/* renamed from: X.1Q4  reason: invalid class name */
public class AnonymousClass1Q4 {
    public final C20830yE A00;
    public final C24341Cb A01;
    public final C20060wx A02;
    public final C20810yC A03;
    public final C21010yW A04;

    public boolean A00(Activity activity, C225014r r9, C226515g r10, int i) {
        if (RequestPermissionActivity.A0I(activity, this.A00, i) && this.A01.A04(r10)) {
            if (this.A02.A01() >= ((long) C20800yB.A00(C21000yV.A02, this.A03, 3658)) * 1048576) {
                return true;
            }
            AnonymousClass1V2.A05(activity, r9, this.A04, 5);
        }
        return false;
    }

    public AnonymousClass1Q4(C24341Cb r1, C20830yE r2, C20060wx r3, C20810yC r4, C21010yW r5) {
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r1;
        this.A00 = r2;
    }
}
