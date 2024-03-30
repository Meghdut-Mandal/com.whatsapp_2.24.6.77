package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass00F;
import X.AnonymousClass17Y;
import X.AnonymousClass1EU;
import X.AnonymousClass2ZN;
import X.B6J;
import X.B7G;
import X.C012005e;
import X.C165567td;
import X.C166337vZ;
import X.C175898bF;
import X.C18740tg;
import X.C18820ts;
import X.C199849g7;
import X.C203449o2;
import X.C207249un;
import X.C207469vG;
import X.C22978AzU;
import X.C23078B3k;
import X.C36361kB;
import X.C36391kE;
import X.C36411kG;
import X.C36421kH;
import X.C36441kJ;
import X.C61233Bb;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.ArrayList;
import java.util.List;

public class PaymentMethodsListPickerFragment extends Hilt_PaymentMethodsListPickerFragment implements B6J {
    public AnonymousClass17Y A00;
    public C18820ts A01;
    public AnonymousClass2ZN A02;
    public AnonymousClass1EU A03;
    public C22978AzU A04;
    public C199849g7 A05;
    public C166337vZ A06;
    public C23078B3k A07;
    public final C61233Bb A08 = new B7G(this, 5);

    public boolean BtK() {
        return true;
    }

    public static PaymentMethodsListPickerFragment A00(List list) {
        PaymentMethodsListPickerFragment paymentMethodsListPickerFragment = new PaymentMethodsListPickerFragment();
        Bundle A072 = AnonymousClass001.A07();
        A072.putParcelableArrayList("arg_methods", C36441kJ.A15(list));
        paymentMethodsListPickerFragment.A17(A072);
        return paymentMethodsListPickerFragment;
    }

    public int BEA(C207249un r2) {
        C23078B3k b3k = this.A07;
        if (b3k != null) {
            return b3k.BEA(r2);
        }
        return 0;
    }

    public String BEC(C207249un r3) {
        String BEC;
        C23078B3k b3k = this.A07;
        if (b3k != null && (BEC = b3k.BEC(r3)) != null) {
            return BEC;
        }
        Context A0a = A0a();
        C175898bF r0 = r3.A08;
        C18740tg.A06(r0);
        if (!r0.A09()) {
            return A0a.getString(R.string.f12nameremoved);
        }
        if (C203449o2.A03(A0a, r3) != null) {
            return C203449o2.A03(A0a, r3);
        }
        return "";
    }

    public String BED(C207249un r2) {
        C23078B3k b3k = this.A07;
        if (b3k != null) {
            return b3k.BED(r2);
        }
        return null;
    }

    public boolean Bt7(C207249un r3) {
        C23078B3k b3k = this.A07;
        if (b3k == null || b3k.Bt7(r3)) {
            return true;
        }
        return false;
    }

    public boolean BtO() {
        C23078B3k b3k = this.A07;
        if (b3k == null || !b3k.BtO()) {
            return false;
        }
        return true;
    }

    public void Bti(C207249un r2, PaymentMethodRow paymentMethodRow) {
        C23078B3k b3k = this.A07;
        if (b3k != null) {
            b3k.Bti(r2, paymentMethodRow);
        }
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1H() {
        super.A1H();
        this.A02.unregisterObserver(this.A08);
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A02.registerObserver(this.A08);
    }

    public void A1S(Bundle bundle, View view) {
        View view2;
        View B8I;
        ArrayList parcelableArrayList = A0b().getParcelableArrayList("arg_methods");
        C18740tg.A06(parcelableArrayList);
        ListView listView = (ListView) view.findViewById(R.id.methods_list);
        C23078B3k b3k = this.A07;
        if (b3k != null) {
            b3k.BFd(A0c(), (ViewGroup) null);
        }
        C166337vZ r0 = new C166337vZ(view.getContext(), this.A05, this);
        this.A06 = r0;
        r0.A00 = parcelableArrayList;
        r0.notifyDataSetChanged();
        listView.setAdapter(this.A06);
        C23078B3k b3k2 = this.A07;
        if (b3k2 == null || !b3k2.BtM()) {
            view2 = null;
        } else {
            view2 = A0c().inflate(R.layout.f9nameremoved, (ViewGroup) null);
            C165567td.A0n(view2, R.id.add_new_account_icon, AnonymousClass00F.A00(view.getContext(), R.color.f6nameremoved));
            C36391kE.A0O(view2, R.id.add_new_account_text).setText(R.string.f12nameremoved);
            listView.addFooterView(view2);
        }
        ViewGroup A0O = C36411kG.A0O(view, R.id.additional_bottom_row);
        C23078B3k b3k3 = this.A07;
        if (!(b3k3 == null || (B8I = b3k3.B8I(A0c(), (ViewGroup) null)) == null)) {
            A0O.addView(B8I);
            C36421kH.A13(A0O, this, 29);
        }
        if (this.A07 != null) {
            FrameLayout frameLayout = (FrameLayout) C012005e.A02(view, R.id.footer_view);
            View BC1 = this.A07.BC1(A0c(), frameLayout);
            if (BC1 != null) {
                frameLayout.setVisibility(0);
                frameLayout.addView(BC1);
            } else {
                frameLayout.setVisibility(8);
            }
        }
        listView.setOnItemClickListener(new C207469vG(view2, listView, this));
        View findViewById = view.findViewById(R.id.back);
        findViewById.setVisibility(0);
        C36421kH.A13(findViewById, this, 30);
        View findViewById2 = view.findViewById(R.id.icon_lock);
        C23078B3k b3k4 = this.A07;
        if (b3k4 == null || b3k4.BtW()) {
            findViewById2.setVisibility(0);
        } else {
            findViewById2.setVisibility(4);
        }
    }
}
