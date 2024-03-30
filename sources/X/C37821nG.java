package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1nG  reason: invalid class name and case insensitive filesystem */
public final class C37821nG extends ArrayAdapter {
    public int A00;
    public final AnonymousClass1N4 A01;
    public final List A02;

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass37J r1;
        AnonymousClass00C.A0D(viewGroup, 2);
        boolean z = false;
        if (view == null) {
            view = C36371kC.A0J(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved, false);
            r1 = new AnonymousClass37J();
            view.setTag(r1);
            r1.A02 = C36351kA.A0E(view);
            r1.A01 = C36391kE.A0P(view, R.id.subtitle);
            r1.A00 = (RadioButton) view.findViewById(R.id.radio);
        } else {
            Object tag = view.getTag();
            AnonymousClass00C.A0E(tag, "null cannot be cast to non-null type com.whatsapp.registration.SelectPhoneNumberDialog.MyArrayAdapter.ViewHolder");
            r1 = (AnonymousClass37J) tag;
        }
        AnonymousClass3XJ r8 = (AnonymousClass3XJ) this.A02.get(i);
        String str = r8.A00;
        String str2 = r8.A02;
        TextView textView = r1.A02;
        if (textView != null) {
            textView.setText(C65983Uf.A0A(this.A01, str, C36321k7.A0D(str, str2)));
        }
        TextView textView2 = r1.A01;
        if (textView2 != null) {
            Context context = viewGroup.getContext();
            Object[] objArr = new Object[2];
            AnonymousClass000.A1L(objArr, i + 1, 0);
            objArr[1] = r8.A01;
            C36341k9.A0s(context, textView2, objArr, R.string.f12nameremoved);
        }
        RadioButton radioButton = r1.A00;
        if (radioButton != null) {
            if (i == this.A00) {
                z = true;
            }
            radioButton.setChecked(z);
        }
        return view;
    }

    public int getCount() {
        return this.A02.size();
    }

    public C37821nG(Context context, AnonymousClass1N4 r3, List list) {
        super(context, R.layout.f9nameremoved, list);
        this.A01 = r3;
        this.A02 = list;
    }
}
