package com.whatsapp.payments.ui.orderdetails;

import X.AnonymousClass001;
import X.AnonymousClass1LB;
import X.AnonymousClass3NG;
import X.AnonymousClass6ZA;
import X.AnonymousClass9FS;
import X.AnonymousClass9IH;
import X.C012005e;
import X.C131606Ps;
import X.C165567td;
import X.C168047zc;
import X.C193679Mk;
import X.C203049nB;
import X.C206369tH;
import X.C20810yC;
import X.C21060yb;
import X.C22987Azd;
import X.C23075B3f;
import X.C36361kB;
import X.C36421kH;
import X.C36441kJ;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.List;

public class PaymentOptionsBottomSheet extends Hilt_PaymentOptionsBottomSheet {
    public AnonymousClass1LB A00;
    public C21060yb A01;
    public C20810yC A02;
    public AnonymousClass6ZA A03 = new AnonymousClass6ZA();
    public C23075B3f A04;
    public C22987Azd A05;
    public String A06;
    public RecyclerView A07;
    public String A08;
    public List A09;
    public boolean A0A;

    public void A1k(AnonymousClass3NG r3) {
        r3.A00.A06 = false;
    }

    public static void A05(PaymentOptionsBottomSheet paymentOptionsBottomSheet, Integer num, String str, int i) {
        String str2;
        if (paymentOptionsBottomSheet.A0A) {
            C131606Ps A0F = C165567td.A0F();
            A0F.A03("transaction_type", "purchase");
            if ("WhatsappPay".equals(str)) {
                str2 = "native";
            } else if ("CustomPaymentInstructions".equals(str)) {
                str2 = "cpi";
            } else {
                if ("pix".equals(str)) {
                    A0F.A03("payment_type", "pix");
                }
                C203049nB.A03(A0F, paymentOptionsBottomSheet.A04, num, "payment_options_prompt", paymentOptionsBottomSheet.A08, i);
            }
            A0F.A03("payment_type", str2);
            C203049nB.A03(A0F, paymentOptionsBottomSheet.A04, num, "payment_options_prompt", paymentOptionsBottomSheet.A08, i);
        }
    }

    public void A1S(Bundle bundle, View view) {
        C193679Mk r14;
        Bundle bundle2 = bundle;
        View view2 = view;
        super.A1S(bundle2, view2);
        if (bundle == null) {
            this.A06 = A0b().getString("selected_payment_method", "WhatsappPay");
            this.A09 = A0b().getParcelableArrayList("payment_method_list");
            this.A08 = A0b().getString("referral_screen");
            bundle2 = A0b();
        } else {
            this.A06 = bundle2.getString("selected_payment_method", "WhatsappPay");
            this.A09 = bundle2.getParcelableArrayList("payment_method_list");
            this.A08 = bundle2.getString("referral_screen");
        }
        this.A0A = bundle2.getBoolean("should_log_event");
        C36421kH.A12(C012005e.A02(view2, R.id.close), this, 17);
        C168047zc r4 = new C168047zc(this.A01, this.A02);
        String str = this.A06;
        List<C206369tH> list = this.A09;
        AnonymousClass9FS r0 = new AnonymousClass9FS(this);
        AnonymousClass1LB r15 = this.A00;
        r4.A00 = str;
        List list2 = r4.A03;
        list2.clear();
        AnonymousClass9IH r12 = new AnonymousClass9IH(r0, r4);
        for (C206369tH r11 : list) {
            String str2 = r11.A0A;
            if ("WhatsappPay".equals(str2)) {
                r14 = new C193679Mk((AnonymousClass1LB) null, r11, r12, 0, "WhatsappPay".equals(str));
            } else {
                r14 = new C193679Mk(r15, r11, r12, 1, str.equals(str2));
            }
            list2.add(r14);
        }
        RecyclerView recyclerView = (RecyclerView) C012005e.A02(view2, R.id.payment_option_recycler_view);
        this.A07 = recyclerView;
        recyclerView.setAdapter(r4);
        C36421kH.A12(C012005e.A02(view2, R.id.continue_button), this, 18);
        A05(this, (Integer) null, this.A06, 0);
    }

    public static PaymentOptionsBottomSheet A03(String str, String str2, List list, boolean z) {
        Bundle A072 = AnonymousClass001.A07();
        A072.putString("selected_payment_method", str);
        A072.putParcelableArrayList("payment_method_list", C36441kJ.A15(list));
        A072.putString("referral_screen", str2);
        A072.putBoolean("should_log_event", z);
        PaymentOptionsBottomSheet paymentOptionsBottomSheet = new PaymentOptionsBottomSheet();
        paymentOptionsBottomSheet.A17(A072);
        return paymentOptionsBottomSheet;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1J() {
        super.A1J();
        this.A05 = null;
    }

    public void A1R(Bundle bundle) {
        super.A1R(bundle);
        bundle.putString("selected_payment_method", this.A06);
        bundle.putParcelableArrayList("payment_method_list", C36441kJ.A15(this.A09));
        bundle.putString("referral_screen", this.A08);
        bundle.putBoolean("should_log_event", this.A0A);
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        AnonymousClass6ZA r0 = this.A03;
        if (r0 != null) {
            r0.onDismiss(dialogInterface);
        }
    }
}
