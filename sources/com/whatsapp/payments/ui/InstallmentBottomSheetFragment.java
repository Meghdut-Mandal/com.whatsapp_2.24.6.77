package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass02E;
import X.AnonymousClass9IG;
import X.C131606Ps;
import X.C165567td;
import X.C167997zX;
import X.C18740tg;
import X.C18820ts;
import X.C193189Ke;
import X.C19630wG;
import X.C206629ti;
import X.C23075B3f;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36401kF;
import X.C36421kH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;

public final class InstallmentBottomSheetFragment extends Hilt_InstallmentBottomSheetFragment {
    public C19630wG A00;
    public C18820ts A01;
    public C23075B3f A02;
    public C193189Ke A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public List A07 = AnonymousClass001.A0I();

    public static final void A00(InstallmentBottomSheetFragment installmentBottomSheetFragment) {
        A03(installmentBottomSheetFragment, 4);
        AnonymousClass02E A022 = AnonymousClass02E.A02(installmentBottomSheetFragment, true);
        AnonymousClass02E r4 = installmentBottomSheetFragment.A0I;
        AnonymousClass00C.A0E(r4, "null cannot be cast to non-null type com.whatsapp.payments.ui.PaymentBottomSheet");
        PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) r4;
        if (A022 instanceof ConfirmPaymentFragment) {
            ConfirmPaymentFragment confirmPaymentFragment = (ConfirmPaymentFragment) A022;
            Integer num = installmentBottomSheetFragment.A04;
            C18740tg.A06(num);
            AnonymousClass00C.A08(num);
            Integer valueOf = Integer.valueOf(num.intValue());
            confirmPaymentFragment.A0O = valueOf;
            ConfirmPaymentFragment.A03(confirmPaymentFragment.A0E, confirmPaymentFragment, confirmPaymentFragment.A0L, valueOf);
            paymentBottomSheet.A1n(A022);
        }
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ArrayList arrayList;
        Integer num;
        String str;
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        Bundle bundle2 = this.A0A;
        Integer num2 = null;
        if (bundle2 != null) {
            arrayList = bundle2.getParcelableArrayList("arg_installment_list");
        } else {
            arrayList = null;
        }
        this.A07 = arrayList;
        Bundle bundle3 = this.A0A;
        if (bundle3 != null) {
            num = Integer.valueOf(bundle3.getInt("arg_selected_position"));
        } else {
            num = null;
        }
        this.A04 = num;
        Bundle bundle4 = this.A0A;
        if (bundle4 != null) {
            str = bundle4.getString("arg_referral_screen");
        } else {
            str = null;
        }
        this.A06 = str;
        Bundle bundle5 = this.A0A;
        if (bundle5 != null) {
            num2 = Integer.valueOf(bundle5.getInt("arg_max_installment_count"));
        }
        this.A05 = num2;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.installment_recycler_view);
        C18820ts r1 = this.A01;
        if (r1 != null) {
            C19630wG r0 = this.A00;
            if (r0 != null) {
                C167997zX r9 = new C167997zX(r0, r1);
                List list = this.A07;
                C18740tg.A06(list);
                AnonymousClass00C.A08(list);
                Integer num3 = this.A04;
                C18740tg.A06(num3);
                AnonymousClass00C.A08(num3);
                int intValue = num3.intValue();
                r9.A00 = intValue;
                AnonymousClass9IG r5 = new AnonymousClass9IG(this, r9);
                if (C36401kF.A1a(list)) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        r9.A03.add(new C193189Ke(r5, (C206629ti) list.get(i), AnonymousClass000.A1S(intValue, i)));
                    }
                }
                recyclerView.setAdapter(r9);
                C36421kH.A13(inflate.findViewById(R.id.back), this, 22);
                C36421kH.A13(inflate.findViewById(R.id.select_button), this, 21);
                return inflate;
            }
            throw C36331k8.A0d("waContext");
        }
        throw C36321k7.A09();
    }

    public static final void A03(InstallmentBottomSheetFragment installmentBottomSheetFragment, int i) {
        List list;
        C131606Ps A0F = C165567td.A0F();
        Integer num = installmentBottomSheetFragment.A04;
        if (!(num == null || (list = installmentBottomSheetFragment.A07) == null)) {
            C18740tg.A06(num);
            C206629ti r0 = (C206629ti) list.get(num.intValue());
            if (r0 != null) {
                int i2 = r0.A00;
                if (Integer.valueOf(i2) != null) {
                    A0F.A02("num_installments", i2);
                }
            }
        }
        Integer num2 = installmentBottomSheetFragment.A05;
        if (num2 != null) {
            C18740tg.A06(num2);
            A0F.A02("max_num_installments", num2.intValue());
        }
        C23075B3f b3f = installmentBottomSheetFragment.A02;
        if (b3f != null) {
            b3f.BOp(A0F, C36361kB.A0i(), Integer.valueOf(i), "installments_selection_prompt", installmentBottomSheetFragment.A06);
            return;
        }
        throw C36331k8.A0d("paymentUiEventLogger");
    }
}
