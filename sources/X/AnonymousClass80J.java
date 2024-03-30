package X;

import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.80J  reason: invalid class name */
public class AnonymousClass80J extends AnonymousClass0D3 {
    public final WaTextView A00;
    public final WaTextView A01;
    public final WaTextView A02;
    public final WaTextView A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final WaTextView A06;
    public final WaTextView A07;
    public final WaTextView A08;
    public final View A09;

    public static void A01(AnonymousClass80J r1, int i) {
        r1.A09.setVisibility(i);
        WaTextView waTextView = r1.A04;
        waTextView.setVisibility(i);
        waTextView.setVisibility(i);
        r1.A06.setVisibility(i);
        r1.A07.setVisibility(i);
        r1.A00.setVisibility(i);
        r1.A01.setVisibility(i);
        r1.A02.setVisibility(i);
        r1.A03.setVisibility(i);
    }

    public AnonymousClass80J(View view) {
        super(view);
        this.A04 = C36401kF.A0Q(view, R.id.subtotal_key);
        this.A05 = C36401kF.A0Q(view, R.id.subtotal_amount);
        this.A06 = C36401kF.A0Q(view, R.id.taxes_key);
        this.A07 = C36401kF.A0Q(view, R.id.taxes_amount);
        this.A00 = C36401kF.A0Q(view, R.id.discount_key);
        this.A01 = C36401kF.A0Q(view, R.id.discount_amount);
        this.A02 = C36401kF.A0Q(view, R.id.shipping_key);
        this.A03 = C36401kF.A0Q(view, R.id.shipping_amount);
        this.A08 = C36401kF.A0Q(view, R.id.total_charge_amount);
        this.A09 = C012005e.A02(view, R.id.dashed_underline2);
    }

    public static void A00(WaTextView waTextView, WaTextView waTextView2, C18820ts r7, AnonymousClass80J r8, String str, String str2, int i) {
        if (TextUtils.isEmpty(str2)) {
            C36421kH.A0x(waTextView, waTextView2);
            return;
        }
        String A0t = C36381kD.A0t(r8.A0H, i);
        if (!TextUtils.isEmpty(str)) {
            boolean A1Y = C36351kA.A1Y(r7);
            StringBuilder A0u = AnonymousClass000.A0u();
            if (A1Y) {
                C36321k7.A1O(A0t, " (", str, ") ", A0u);
            } else {
                C36321k7.A1O(" (", str, ") ", A0t, A0u);
            }
            A0t = A0u.toString();
        }
        waTextView.setText(A0t);
        waTextView.setVisibility(0);
        waTextView2.setText(str2);
        waTextView2.setVisibility(0);
        int i2 = 5;
        int i3 = 3;
        if (C36401kF.A1X(r7)) {
            i3 = 5;
        }
        waTextView.setGravity(i3);
        if (C36401kF.A1X(r7)) {
            i2 = 3;
        }
        waTextView2.setGravity(i2);
    }
}
