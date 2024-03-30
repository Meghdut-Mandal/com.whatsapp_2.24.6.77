package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import java.util.List;

/* renamed from: X.7zW  reason: invalid class name and case insensitive filesystem */
public class C167987zW extends AnonymousClass0CZ {
    public final AnonymousClass9FI A00;
    public final List A01;
    public final /* synthetic */ IndiaUpiBankAccountPickerActivity A02;

    public C167987zW(AnonymousClass9FI r1, IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity, List list) {
        this.A02 = indiaUpiBankAccountPickerActivity;
        this.A01 = list;
        this.A00 = r1;
    }

    public int A0J() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r12, int i) {
        String str;
        Drawable drawable;
        AnonymousClass80P r122 = (AnonymousClass80P) r12;
        List list = this.A01;
        C193899Ni r4 = (C193899Ni) list.get(i);
        IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = this.A02;
        if (!TextUtils.isEmpty(indiaUpiBankAccountPickerActivity.A0H)) {
            indiaUpiBankAccountPickerActivity.A0G.A00(indiaUpiBankAccountPickerActivity.getResources().getDrawable(R.drawable.bank_logo_placeholder_with_circle_bg), (Drawable) null, r122.A01, (C160197kc) null, indiaUpiBankAccountPickerActivity.A0H);
        } else {
            r122.A01.setImageResource(R.drawable.bank_logo_placeholder_with_circle_bg);
        }
        int size = list.size();
        RadioButton radioButton = r122.A02;
        if (size == 1) {
            radioButton.setVisibility(8);
        } else {
            radioButton.setVisibility(0);
        }
        TextView textView = r122.A04;
        boolean equals = "CREDIT".equals(r4.A02);
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = r4.A03;
        A0M[1] = r4.A04;
        if (equals) {
            str = "%s %s";
        } else {
            str = "%s ••%s";
        }
        textView.setText(String.format(str, A0M));
        radioButton.setChecked(r4.A00);
        r122.A05.setText(r4.A05);
        boolean z = !r4.A06;
        View view = r122.A0H;
        if (z) {
            C36331k8.A0r(view.getContext(), textView, C224514j.A00(view.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
            r122.A03.setText(r4.A01);
            radioButton.setEnabled(true);
        } else {
            C36331k8.A0r(view.getContext(), textView, R.color.f6nameremoved);
            r122.A03.setText(R.string.f12nameremoved);
            radioButton.setEnabled(false);
        }
        if (indiaUpiBankAccountPickerActivity.A0J || !z) {
            drawable = null;
        } else {
            drawable = AnonymousClass00E.A00(view.getContext(), R.drawable.selector_orange_gradient);
        }
        view.setBackground(drawable);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        List list = AnonymousClass0D3.A0I;
        return new AnonymousClass80P(C36361kB.A0E(this.A02.getLayoutInflater(), viewGroup, R.layout.f9nameremoved), this.A00);
    }
}
