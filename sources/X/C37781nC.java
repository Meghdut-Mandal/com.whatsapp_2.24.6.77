package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1nC  reason: invalid class name and case insensitive filesystem */
public class C37781nC extends ArrayAdapter {
    public int A00 = 0;
    public final List A01;

    public View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false);
        }
        TextView A0O = C36391kE.A0O(view, R.id.title);
        TextView A0O2 = C36391kE.A0O(view, R.id.subtitle);
        CompoundButton compoundButton = (CompoundButton) C012005e.A02(view, R.id.phone_number_selection_radio_button);
        C48792i4 r3 = new C48792i4(this, i, 2);
        AnonymousClass3XG r2 = (AnonymousClass3XG) this.A01.get(i);
        String str = r2.A01;
        if (TextUtils.isEmpty(str)) {
            A0O.setVisibility(8);
        } else {
            A0O.setVisibility(0);
            A0O.setText(str);
        }
        A0O2.setText(r2.A00);
        if (i == this.A00) {
            z = true;
        }
        compoundButton.setChecked(z);
        compoundButton.setOnClickListener(r3);
        view.setOnClickListener(r3);
        return view;
    }

    public C37781nC(Context context, List list) {
        super(context, R.layout.f9nameremoved, list);
        this.A01 = list;
    }
}
