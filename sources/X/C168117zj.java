package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7zj  reason: invalid class name and case insensitive filesystem */
public final class C168117zj extends AnonymousClass0CZ {
    public int A00 = -1;
    public ArrayList A01 = AnonymousClass001.A0I();
    public final C18820ts A02;
    public final AnonymousClass1EU A03;
    public final C22977AzT A04;
    public final C199849g7 A05;

    public static final C178908iD A00(ViewGroup viewGroup) {
        View inflate = C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false);
        List list = AnonymousClass0D3.A0I;
        AnonymousClass00C.A0B(inflate);
        return new C178908iD(inflate);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        C23203B9l b9l = new C23203B9l(this, 0);
        switch (i) {
            case 0:
                return new C178918iE(C90514aH.A0Q(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
            case 1:
                List list = AnonymousClass0D3.A0I;
                return new C178928iF(C90514aH.A0Q(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved), this.A02, this.A03, b9l, this.A05);
            case 2:
                return new C178898iC(C90514aH.A0Q(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
            case 3:
                List list2 = AnonymousClass0D3.A0I;
                return A00(viewGroup);
            case 4:
                List list3 = AnonymousClass0D3.A0I;
                View view = A00(viewGroup).A0H;
                AnonymousClass00C.A07(view);
                return new C178948iH(view, b9l);
            case 5:
                List list4 = AnonymousClass0D3.A0I;
                View view2 = A00(viewGroup).A0H;
                AnonymousClass00C.A07(view2);
                return new C178938iG(view2, b9l);
            case 6:
                List list5 = AnonymousClass0D3.A0I;
                View view3 = A00(viewGroup).A0H;
                AnonymousClass00C.A07(view3);
                return new C178958iI(view3, b9l);
            default:
                throw AnonymousClass000.A0d("Unexpected view type: ", AnonymousClass000.A0u(), i);
        }
    }

    public int A0J() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r8, int i) {
        AnonymousClass80D r82 = (AnonymousClass80D) r8;
        AnonymousClass00C.A0D(r82, 0);
        Object obj = this.A01.get(i);
        AnonymousClass00C.A08(obj);
        AnonymousClass9FW r2 = (AnonymousClass9FW) obj;
        if (r2 instanceof C23040B1l) {
            ((C23040B1l) r2).setChecked(AnonymousClass000.A1S(i, this.A00));
        }
        if (r82 instanceof C178928iF) {
            C178928iF r83 = (C178928iF) r82;
            AnonymousClass00C.A0D(r2, 0);
            C180218lO r22 = (C180218lO) r2;
            C207249un r4 = r22.A01;
            C199849g7 r3 = r83.A01;
            PaymentMethodRow paymentMethodRow = r83.A02;
            r3.A03(r4, r22.A02, paymentMethodRow);
            paymentMethodRow.A00();
            C36391kE.A1I(paymentMethodRow, r83, 32);
            paymentMethodRow.setRadioButtonChecked(r22.A00);
        } else if (r82 instanceof C178918iE) {
            C178918iE r84 = (C178918iE) r82;
            AnonymousClass00C.A0D(r2, 0);
            String str = ((C180178lK) r2).A00;
            if (str.length() == 0) {
                r84.A0H.setVisibility(8);
                return;
            }
            r84.A0H.setVisibility(0);
            r84.A00.A0I(str);
        } else if (r82 instanceof C178908iD) {
            C178908iD r85 = (C178908iD) r82;
            if (r85 instanceof C178958iI) {
                C178958iI r86 = (C178958iI) r85;
                AnonymousClass00C.A0D(r2, 0);
                View view = r86.A0H;
                Context context = view.getContext();
                PaymentMethodRow paymentMethodRow2 = r86.A01;
                paymentMethodRow2.A02.setText(context.getString(R.string.f12nameremoved));
                paymentMethodRow2.A00.setImageResource(R.drawable.ic_card);
                paymentMethodRow2.A05(false);
                paymentMethodRow2.A00();
                paymentMethodRow2.setRadioButtonChecked(((C180208lN) r2).A00);
                ImageView imageView = paymentMethodRow2.A00;
                AnonymousClass00C.A08(imageView);
                int A052 = C36441kJ.A05(view.getResources(), R.dimen.f7nameremoved);
                imageView.setPadding(A052, A052, A052, A052);
                AnonymousClass06T.A00(C36431kI.A0G(context, R.color.f6nameremoved), imageView);
                C36371kC.A13(context, imageView, R.drawable.ic_payment_option_background);
                C36391kE.A1I(paymentMethodRow2, r86, 31);
            } else if (r85 instanceof C178948iH) {
                C178948iH r87 = (C178948iH) r85;
                AnonymousClass00C.A0D(r2, 0);
                PaymentMethodRow paymentMethodRow3 = r87.A01;
                paymentMethodRow3.A02.setText(C36441kJ.A0F(r87).getString(R.string.f12nameremoved));
                paymentMethodRow3.A00.setImageResource(R.drawable.ic_wa_app_logo);
                paymentMethodRow3.A05(false);
                paymentMethodRow3.A00();
                paymentMethodRow3.setRadioButtonChecked(((C180198lM) r2).A00);
                C36391kE.A1I(paymentMethodRow3, r87, 30);
            } else if (r85 instanceof C178938iG) {
                C178938iG r88 = (C178938iG) r85;
                AnonymousClass00C.A0D(r2, 0);
                View view2 = r88.A0H;
                Context context2 = view2.getContext();
                PaymentMethodRow paymentMethodRow4 = r88.A01;
                paymentMethodRow4.A02.setText(context2.getString(R.string.f12nameremoved));
                paymentMethodRow4.A03(context2.getString(R.string.f12nameremoved));
                paymentMethodRow4.A00.setImageResource(R.drawable.ic_card);
                paymentMethodRow4.A05(false);
                paymentMethodRow4.A00();
                paymentMethodRow4.setRadioButtonChecked(((C180188lL) r2).A00);
                ImageView imageView2 = paymentMethodRow4.A00;
                AnonymousClass00C.A08(imageView2);
                int A053 = C36441kJ.A05(view2.getResources(), R.dimen.f7nameremoved);
                imageView2.setPadding(A053, A053, A053, A053);
                AnonymousClass06T.A00(C36431kI.A0G(context2, R.color.f6nameremoved), imageView2);
                C36371kC.A13(context2, imageView2, R.drawable.ic_payment_option_background);
                C36391kE.A1I(paymentMethodRow4, r88, 29);
            } else {
                AnonymousClass00C.A0D(r2, 0);
                r85.A00.addView(((C180168lJ) r2).A00);
            }
        } else {
            AnonymousClass00C.A0D(r2, 0);
            r82.A0H.setOnClickListener(((C180158lI) r2).A00);
        }
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass9FW) this.A01.get(i)).A00;
    }

    public C168117zj(C18820ts r2, AnonymousClass1EU r3, C22977AzT azT, C199849g7 r5) {
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r5;
        this.A04 = azT;
    }

    public final void A0L(List list) {
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                throw C36351kA.A0v();
            }
            AnonymousClass9FW r2 = (AnonymousClass9FW) next;
            if ((r2 instanceof C23040B1l) && ((C23040B1l) r2).isChecked()) {
                this.A00 = i;
            }
            i = i2;
        }
        ArrayList arrayList = this.A01;
        arrayList.clear();
        arrayList.addAll(list);
    }
}
