package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import java.util.List;

/* renamed from: X.9Xr  reason: invalid class name and case insensitive filesystem */
public class C196109Xr {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public final int A03;
    public final C178888i4 A04;

    public void A00() {
        ViewStub viewStub = (ViewStub) C012005e.A02(this.A04.A00, R.id.default_payment_method_stub);
        viewStub.setLayoutResource(R.layout.f9nameremoved);
        View inflate = viewStub.inflate();
        this.A00 = C012005e.A02(inflate, R.id.default_payment_method_row);
        this.A01 = C36401kF.A0G(inflate, R.id.default_payment_method_icon);
        this.A02 = C36391kE.A0O(inflate, R.id.default_payment_method_text);
    }

    public void A01(C207249un r5, boolean z) {
        C178888i4 r0;
        C175858bB r02;
        C175858bB r1;
        AnonymousClass3UF.A0E(this.A01, this.A03);
        boolean A1S = AnonymousClass000.A1S(r5.A01, 2);
        ImageView imageView = this.A01;
        int i = R.drawable.ic_settings_unstarred;
        if (A1S) {
            i = R.drawable.ic_settings_starred;
        }
        imageView.setImageResource(i);
        TextView textView = this.A02;
        int i2 = R.string.f12nameremoved;
        if (A1S) {
            i2 = R.string.f12nameremoved;
        }
        textView.setText(i2);
        View view = this.A00;
        if (!A1S) {
            r0 = this.A04;
        } else {
            r0 = null;
        }
        view.setOnClickListener(r0);
        if (C203449o2.A08(r5) && (r02 = (C175858bB) r5.A08) != null && !r02.A0X) {
            if (this instanceof C178788hM) {
                C178788hM r3 = (C178788hM) this;
                C207249un r12 = r3.A04.A04;
                if (C203449o2.A08(r12) && (r1 = (C175858bB) r12.A08) != null) {
                    if (!r1.A0X) {
                        r3.A02.setVisibility(8);
                    }
                    if (!r1.A0T) {
                        r3.A01.setVisibility(8);
                    }
                }
                r3.A00.setVisibility(8);
                return;
            }
            this.A00.setVisibility(8);
        }
    }

    public void A02(List list) {
        this.A01.setImageResource(R.drawable.ic_settings_starred);
        this.A02.setText(R.string.f12nameremoved);
        this.A00.setOnClickListener((View.OnClickListener) null);
    }

    public C196109Xr(C178888i4 r2) {
        int i;
        this.A04 = r2;
        if (r2 instanceof BrazilPaymentCardDetailsActivity) {
            i = R.color.f6nameremoved;
        } else {
            i = R.color.f6nameremoved;
        }
        this.A03 = AnonymousClass00F.A00(r2, i);
    }
}
