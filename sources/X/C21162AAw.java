package X;

import android.widget.ProgressBar;
import com.whatsapp.R;

/* renamed from: X.AAw  reason: case insensitive filesystem */
public class C21162AAw implements C160427kz {
    public final /* synthetic */ ProgressBar A00;
    public final /* synthetic */ C179158jJ A01;

    public C21162AAw(ProgressBar progressBar, C179158jJ r2) {
        this.A01 = r2;
        this.A00 = progressBar;
    }

    public void BQX() {
        this.A00.setVisibility(8);
        C179158jJ r3 = this.A01;
        r3.A05.A06(R.string.f12nameremoved, 0);
        r3.finish();
    }

    public void BWm(Integer num) {
        this.A01.finish();
    }

    public void BjA(Integer num) {
        this.A00.setVisibility(8);
        C179158jJ r3 = this.A01;
        r3.A05.A06(R.string.f12nameremoved, 0);
        r3.finish();
    }

    public void onSuccess() {
        this.A00.setVisibility(8);
        C179158jJ.A0k(this.A01);
    }
}
