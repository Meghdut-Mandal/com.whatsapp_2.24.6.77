package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.Set;

public final class A9V implements C22921AyX {
    public final WaTextView A00;
    public final AnonymousClass00T A01;
    public final AnonymousClass190 A02;
    public final C24681Dj A03;
    public final C32681e1 A04;
    public final Set A05;

    public void BSD(C22922AyY ayY) {
        boolean A002 = C53362rC.A00(this.A03, this.A05);
        WaTextView waTextView = this.A00;
        if (A002) {
            C32681e1 r4 = this.A04;
            AnonymousClass00T r0 = this.A01;
            waTextView.setText(r4.A02((Context) C36381kD.A0p(r0), new AVW(this, 32), ((Context) C36381kD.A0p(r0)).getString(R.string.f12nameremoved), "third-party-settings"));
            return;
        }
        waTextView.setText(R.string.f12nameremoved);
    }

    public A9V(View view, AnonymousClass190 r3, C24681Dj r4, C32681e1 r5, Set set) {
        C36321k7.A19(set, r4, r5, r3);
        this.A05 = set;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = C36431kI.A1I(new C22092Agd(view));
        this.A00 = C36351kA.A0Q(view, R.id.block_list_footer_text);
    }
}
