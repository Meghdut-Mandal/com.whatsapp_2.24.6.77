package X;

import android.content.DialogInterface;
import com.whatsapp.R;

/* renamed from: X.AEs  reason: case insensitive filesystem */
public class C21262AEs implements C159617je {
    public final /* synthetic */ AnonymousClass155 A00;
    public final /* synthetic */ C202199lE A01;
    public final /* synthetic */ boolean A02;

    public C21262AEs(AnonymousClass155 r1, C202199lE r2, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = z;
    }

    public void BWi(C130696Mb r5) {
        C202059ky r0 = r5.A00;
        if (r0 == null) {
            r0 = C202059ky.A00();
        }
        int i = r0.A00;
        C202199lE r1 = this.A01;
        AnonymousClass155 r2 = this.A00;
        if (i == 25554) {
            r1.A04(r2, this.A02);
        } else {
            C202939my.A00(r2, (DialogInterface.OnDismissListener) null, r2.getString(R.string.f12nameremoved)).show();
        }
    }

    public void onResult(Object obj) {
        this.A01.A04(this.A00, this.A02);
    }
}
