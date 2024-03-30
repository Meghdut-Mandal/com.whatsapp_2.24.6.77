package X;

import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.CircleWaImageView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.5FG  reason: invalid class name */
public class AnonymousClass5FG extends C46482Xv {
    public AnonymousClass51O A00;
    public C226815j A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final CircleWaImageView A04;
    public final WaTextView A05;
    public final WaTextView A06;
    public final AnonymousClass6WN A07;
    public final AnonymousClass16I A08;
    public final AnonymousClass1RY A09;
    public final WaTextView A0A;

    public void A0B() {
        AnonymousClass6V2 r1 = this.A07.A0H;
        r1.A07 = null;
        r1.A03();
        this.A09.A02();
        C226815j r12 = this.A01;
        if (r12 != null) {
            this.A08.unregisterObserver(r12);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass51O r5 = (AnonymousClass51O) obj;
        this.A00 = r5;
        boolean z = r5.A01;
        r5.A03 = !z;
        this.A07.A06(r5);
        this.A05.setVisibility(8);
        this.A02.setVisibility(8);
        this.A03.setVisibility(8);
        if (z) {
            this.A09.A0B(this.A04, new AnonymousClass141(C36421kH.A0N(r5.A00.A0F)), false);
            C162737p4 r1 = new C162737p4(r5, this, 1);
            this.A01 = r1;
            this.A08.registerObserver(r1);
        }
        if (r5.A00.A08 == 2) {
            WaTextView waTextView = this.A06;
            waTextView.setText(R.string.f12nameremoved);
            waTextView.setVisibility(0);
        }
    }

    public void A0D() {
        AnonymousClass51O r1 = this.A00;
        if (r1 != null) {
            this.A07.A07(r1);
        }
    }

    public AnonymousClass5FG(View view, AnonymousClass6WN r4, AnonymousClass16I r5, C27731Pn r6) {
        super(view);
        this.A08 = r5;
        this.A09 = r6.A05(view.getContext(), "business-profile-typeahead-recent-item");
        this.A07 = r4;
        this.A04 = (CircleWaImageView) C012005e.A02(view, R.id.business_avatar);
        this.A02 = C90514aH.A0U(view, R.id.open_status_layout);
        this.A05 = C36401kF.A0Q(view, R.id.address);
        this.A06 = C36401kF.A0Q(view, R.id.category);
        this.A0A = C36401kF.A0Q(view, R.id.price_tier);
        this.A03 = C90514aH.A0U(view, R.id.service_offerings_layout);
        r4.A05(view);
    }
}
