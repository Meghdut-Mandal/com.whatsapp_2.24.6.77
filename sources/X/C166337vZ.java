package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.whatsapp.R;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.List;

/* renamed from: X.7vZ  reason: invalid class name and case insensitive filesystem */
public class C166337vZ extends ArrayAdapter {
    public List A00 = AnonymousClass001.A0I();
    public final C199849g7 A01;
    public final B6J A02;

    public int getViewTypeCount() {
        return 1;
    }

    public int getCount() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        PaymentMethodRow paymentMethodRow;
        if (view == null) {
            paymentMethodRow = new PaymentMethodRow(getContext());
        } else {
            paymentMethodRow = (PaymentMethodRow) view;
        }
        C207249un r2 = (C207249un) this.A00.get(i);
        if (r2 != null) {
            this.A01.A03(r2, this.A02, paymentMethodRow);
        }
        return paymentMethodRow;
    }

    public C166337vZ(Context context, C199849g7 r4, B6J b6j) {
        super(context, R.layout.f9nameremoved, AnonymousClass001.A0I());
        this.A01 = r4;
        this.A02 = b6j;
    }
}
