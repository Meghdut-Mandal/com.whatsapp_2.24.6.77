package X;

import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.1g2  reason: invalid class name and case insensitive filesystem */
public abstract class C33851g2 implements C33681fl {
    public View A00;
    public final C33571fa A01;
    public final C33641fh A02;

    public void A02(int i) {
        C19420v0 r3;
        long currentTimeMillis;
        String str;
        if (i != 1) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    return;
            }
        }
        C33641fh r1 = this.A02;
        if (r1 instanceof C33661fj) {
            r3 = ((C33661fj) r1).A00;
            currentTimeMillis = System.currentTimeMillis();
            str = "payments_onboarding_banner_start_cool_off_timestamp";
        } else {
            r3 = ((C33651fi) r1).A01;
            currentTimeMillis = System.currentTimeMillis();
            str = "payments_incentive_banner_start_cool_off_timestamp";
        }
        r3.A1h(str, currentTimeMillis);
    }

    public View A00() {
        int i;
        View view = this.A00;
        if (view != null) {
            return view;
        }
        C33571fa r3 = this.A01;
        LayoutInflater from = LayoutInflater.from(r3.getContext());
        if (this instanceof C33861g3) {
            i = R.layout.f9nameremoved;
        } else {
            i = R.layout.f9nameremoved;
        }
        View inflate = from.inflate(i, r3, false);
        this.A00 = inflate;
        return inflate;
    }

    public void A01() {
        View view = this.A00;
        C18740tg.A04(view);
        view.setVisibility(8);
        this.A02.A02();
    }

    public void BK9() {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public boolean Bt0() {
        return this.A02.A04();
    }

    public C33851g2(C33571fa r1, C33641fh r2) {
        this.A01 = r1;
        this.A02 = r2;
    }
}
