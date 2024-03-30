package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* renamed from: X.8kR  reason: invalid class name and case insensitive filesystem */
public class C179628kR extends AnonymousClass80E {
    public final C21060yb A00;
    public final AnonymousClass1FR A01;
    public final WaTextView A02;
    public final WaTextView A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final View A06;
    public final View A07;
    public final TextEmojiLabel A08;
    public final WaTextView A09;
    public final WaTextView A0A;
    public final WaTextView A0B;
    public final WaTextView A0C;
    public final WaTextView A0D;
    public final WaTextView A0E;
    public final WaTextView A0F;
    public final WaTextView A0G;
    public final WaTextView A0H;
    public final WaTextView A0I;
    public final WaTextView A0J;
    public final WaTextView A0K;
    public final C20810yC A0L;
    public final C32681e1 A0M;

    private String A00(C18820ts r6, String str, int i) {
        String A0t = C36381kD.A0t(this.A0H, i);
        if (TextUtils.isEmpty(str)) {
            return A0t;
        }
        boolean A1Y = C36351kA.A1Y(r6);
        StringBuilder A0u = AnonymousClass000.A0u();
        if (A1Y) {
            C36321k7.A1O(A0t, " (", str, ") ", A0u);
        } else {
            C36321k7.A1O(" (", str, ") ", A0t, A0u);
        }
        return A0u.toString();
    }

    private void A01(int i) {
        this.A07.setVisibility(i);
        WaTextView waTextView = this.A0F;
        waTextView.setVisibility(i);
        waTextView.setVisibility(i);
        this.A0H.setVisibility(i);
        this.A0I.setVisibility(i);
        this.A09.setVisibility(i);
        this.A0A.setVisibility(i);
        this.A0D.setVisibility(i);
        this.A0E.setVisibility(i);
        this.A0B.setVisibility(i);
        this.A0C.setVisibility(i);
    }

    private void A02(Context context, int i) {
        this.A04.setVisibility(i);
        this.A05.setVisibility(i);
        TextEmojiLabel textEmojiLabel = this.A08;
        textEmojiLabel.setVisibility(i);
        C36331k8.A16(textEmojiLabel, this.A00);
        C20810yC r4 = this.A0L;
        C36331k8.A1A(r4, textEmojiLabel);
        String[] strArr = {r4.A09(4144)};
        textEmojiLabel.setText(this.A0M.A01(textEmojiLabel.getContext(), context.getResources().getString(R.string.f12nameremoved), new Runnable[]{C21684AWe.A00, C21685AWf.A00, C21686AWg.A00}, new String[]{"installment-learn-more"}, strArr));
    }

    public void A0B(AnonymousClass9FT r40) {
        String A062;
        String str;
        String A002;
        String A0l;
        int i;
        C179448k9 r2 = (C179448k9) r40;
        C18820ts r1 = r2.A01;
        C207199ui r3 = r2.A03;
        C207009uP r4 = r3.A09;
        C206979uM r8 = r4.A06;
        String A072 = r3.A07(r1, r8);
        String str2 = r2.A04;
        String str3 = r2.A05;
        C206979uM r7 = r4.A04;
        String A073 = r3.A07(r1, r7);
        C206979uM r15 = r4.A05;
        String A074 = r3.A07(r1, r15);
        AnonymousClass1FR r5 = this.A01;
        boolean A0l2 = r5.A0l(r3);
        C18820ts r52 = r5.A05;
        if (A0l2) {
            A062 = C207199ui.A01(r52, r3);
        } else {
            A062 = r3.A06(r52);
        }
        C207079uW r9 = r2.A02;
        if (r9 == null || (i = r9.A01) <= 1) {
            A02(r2.A00, 8);
            this.A02.setVisibility(8);
            this.A03.setVisibility(8);
        } else {
            Context context = r2.A00;
            C207119ua r11 = r9.A02;
            if (r11 != null) {
                AnonymousClass00C.A0D(r1, 0);
                AnonymousClass16U r12 = r11.A01;
                AnonymousClass00C.A08(r12);
                String B7d = r12.B7d(r1, r11.A02);
                AnonymousClass00C.A08(B7d);
                Resources resources = context.getResources();
                Object[] A0M2 = AnonymousClass001.A0M();
                C90494aF.A1H(String.valueOf(i), B7d, A0M2);
                A03(this.A04, this.A05, r1, (String) null, resources.getString(R.string.f12nameremoved, A0M2), R.string.f12nameremoved);
            }
            C207119ua r112 = r9.A03;
            if (r112 == null || r112.A01() <= 0) {
                this.A02.setVisibility(8);
                this.A03.setVisibility(8);
            } else {
                AnonymousClass00C.A0D(r1, 0);
                AnonymousClass16U r10 = r112.A01;
                AnonymousClass00C.A08(r10);
                String B7d2 = r10.B7d(r1, r112.A02);
                AnonymousClass00C.A08(B7d2);
                WaTextView waTextView = this.A02;
                WaTextView waTextView2 = this.A03;
                A03(waTextView, waTextView2, r1, (String) null, B7d2, R.string.f12nameremoved);
                waTextView.setVisibility(0);
                waTextView2.setVisibility(0);
            }
            A02(context, 0);
        }
        String str4 = null;
        if (r8 == null) {
            str = null;
        } else {
            str = r8.A02;
        }
        if (r7 != null) {
            str4 = r7.A02;
        }
        if (!TextUtils.isEmpty(A072) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(A073) || !TextUtils.isEmpty(str3)) {
            A01(0);
            A03(this.A0F, this.A0G, r1, (String) null, A074, R.string.f12nameremoved);
            A03(this.A0H, this.A0I, r1, str, A072, R.string.f12nameremoved);
            WaTextView waTextView3 = this.A09;
            WaTextView waTextView4 = this.A0A;
            C206979uM r102 = r4.A03;
            if (TextUtils.isEmpty(str2) || r102 == null) {
                C36421kH.A0x(waTextView3, waTextView4);
            } else {
                String str5 = r102.A02;
                if (TextUtils.isEmpty(str5)) {
                    C18740tg.A06(r102);
                    C207119ua A032 = r3.A03(r102);
                    BigDecimal multiply = A032.A02.A00.multiply(new BigDecimal(A032.A00));
                    C18740tg.A06(r15);
                    BigDecimal stripTrailingZeros = multiply.divide(r3.A03(r15).A02.A00, RoundingMode.HALF_UP).stripTrailingZeros();
                    AnonymousClass16U r32 = r3.A08;
                    if (r32 != null) {
                        AnonymousClass16V r33 = (AnonymousClass16V) r32;
                        A0l = AnonymousClass6US.A02(r1, r33.A02, r33.A03, stripTrailingZeros, false);
                    } else {
                        A0l = AnonymousClass000.A0l(stripTrailingZeros, "", AnonymousClass000.A0u());
                    }
                    A002 = C36351kA.A0w(waTextView3.getContext(), A0l, 1, R.string.f12nameremoved);
                } else {
                    A002 = A00(r1, str5, R.string.f12nameremoved);
                }
                waTextView3.setText(A002);
                waTextView3.setVisibility(0);
                waTextView4.setText(str2);
                waTextView4.setVisibility(0);
                int i2 = 5;
                int i3 = 3;
                if (C36401kF.A1X(r1)) {
                    i3 = 5;
                }
                waTextView3.setGravity(i3);
                if (C36401kF.A1X(r1)) {
                    i2 = 3;
                }
                waTextView4.setGravity(i2);
            }
            A03(this.A0B, this.A0C, r1, (String) null, str3, R.string.f12nameremoved);
            A03(this.A0D, this.A0E, r1, str4, A073, R.string.f12nameremoved);
        } else {
            A01(8);
        }
        WaTextView waTextView5 = this.A0J;
        waTextView5.setText(A062);
        boolean z = r2.A06;
        WaTextView waTextView6 = this.A0K;
        int A003 = C36351kA.A00(z ? 1 : 0);
        waTextView6.setVisibility(A003);
        waTextView5.setVisibility(A003);
        this.A06.setVisibility(A003);
    }

    public C179628kR(View view, C21060yb r3, C20810yC r4, AnonymousClass1FR r5, C32681e1 r6) {
        super(view);
        this.A0L = r4;
        this.A0M = r6;
        this.A01 = r5;
        this.A00 = r3;
        this.A0F = C36401kF.A0Q(view, R.id.subtotal_key);
        this.A0G = C36401kF.A0Q(view, R.id.subtotal_amount);
        this.A0H = C36401kF.A0Q(view, R.id.taxes_key);
        this.A0I = C36401kF.A0Q(view, R.id.taxes_amount);
        this.A09 = C36401kF.A0Q(view, R.id.discount_key);
        this.A0A = C36401kF.A0Q(view, R.id.discount_amount);
        this.A0B = C36401kF.A0Q(view, R.id.offer_key);
        this.A0C = C36401kF.A0Q(view, R.id.offer_amount);
        this.A0D = C36401kF.A0Q(view, R.id.shipping_key);
        this.A0E = C36401kF.A0Q(view, R.id.shipping_amount);
        this.A0K = C36401kF.A0Q(view, R.id.total_charge_key);
        this.A0J = C36401kF.A0Q(view, R.id.total_charge_amount);
        this.A07 = C012005e.A02(view, R.id.dashed_underline2);
        this.A06 = C012005e.A02(view, R.id.dashed_underline3);
        this.A04 = C36401kF.A0Q(view, R.id.installment_key);
        this.A05 = C36401kF.A0Q(view, R.id.installment_amount);
        this.A02 = C36401kF.A0Q(view, R.id.fees_key);
        this.A03 = C36401kF.A0Q(view, R.id.fees_amount);
        this.A08 = C36401kF.A0O(view, R.id.installment_disclaimer);
    }

    private void A03(WaTextView waTextView, WaTextView waTextView2, C18820ts r6, String str, String str2, int i) {
        if (TextUtils.isEmpty(str2)) {
            C36421kH.A0x(waTextView, waTextView2);
            return;
        }
        waTextView.setText(A00(r6, str, i));
        waTextView.setVisibility(0);
        waTextView2.setText(str2);
        waTextView2.setVisibility(0);
        int i2 = 5;
        int i3 = 3;
        if (C36401kF.A1X(r6)) {
            i3 = 5;
        }
        waTextView.setGravity(i3);
        if (C36401kF.A1X(r6)) {
            i2 = 3;
        }
        waTextView2.setGravity(i2);
    }
}
