package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.8VV  reason: invalid class name */
public final class AnonymousClass8VV extends AnonymousClass80H {
    public final int A00;
    public final View A01;
    public final C18820ts A02;
    public final C20810yC A03;
    public final AnonymousClass1RJ A04;
    public final AnonymousClass1RJ A05;
    public final AnonymousClass1RJ A06;
    public final AnonymousClass1RJ A07;
    public final AnonymousClass1RJ A08;
    public final AnonymousClass1RJ A09;
    public final AnonymousClass1RJ A0A;
    public final AnonymousClass1RJ A0B;

    public static AnonymousClass1RJ A00(View view, int i) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return new AnonymousClass1RJ(findViewById);
        }
        return null;
    }

    public static final void A01(AnonymousClass1RJ r1, AnonymousClass1RJ r2, String str) {
        TextView textView;
        if (str == null || str.length() == 0) {
            if (r1 != null) {
                r1.A03(8);
            }
            if (r2 != null) {
                r2.A03(8);
                return;
            }
            return;
        }
        if (r1 != null) {
            r1.A03(0);
        }
        if (r2 != null && (textView = (TextView) C36391kE.A0L(r2, 0)) != null) {
            textView.setText(str);
        }
    }

    public AnonymousClass8VV(View view, C18820ts r7, C20810yC r8) {
        super(view);
        AnonymousClass1RJ r4;
        this.A02 = r7;
        this.A03 = r8;
        this.A01 = view.findViewById(R.id.cart_content_divider);
        View findViewById = view.findViewById(R.id.cart_price_details_subtotal_label);
        AnonymousClass1RJ r1 = null;
        if (findViewById != null) {
            r4 = new AnonymousClass1RJ(findViewById);
        } else {
            r4 = null;
        }
        this.A0B = r4;
        this.A0A = A00(view, R.id.cart_price_details_subtotal_amount);
        AnonymousClass1RJ A002 = A00(view, R.id.cart_price_details_product_discount_label);
        this.A09 = A002;
        this.A08 = A00(view, R.id.cart_price_details_product_discount_amount);
        this.A05 = A00(view, R.id.cart_price_details_coupon_discount_label);
        this.A04 = A00(view, R.id.cart_price_details_coupon_discount_amount);
        AnonymousClass1RJ A003 = A00(view, R.id.cart_price_details_estimated_total_label);
        this.A07 = A003;
        View findViewById2 = view.findViewById(R.id.cart_price_details_estimated_total_amount);
        this.A06 = findViewById2 != null ? new AnonymousClass1RJ(findViewById2) : r1;
        this.A00 = C36341k9.A0F(view).getDimensionPixelSize(R.dimen.f7nameremoved);
        if (r4 != null) {
            r4.A07(ATD.A00);
        }
        if (A002 != null) {
            A002.A07(ATC.A00);
        }
        if (A003 != null) {
            A003.A07(ATB.A00);
        }
    }
}
