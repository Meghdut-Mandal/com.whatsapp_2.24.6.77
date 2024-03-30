package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1y5  reason: invalid class name and case insensitive filesystem */
public class C41981y5 extends AnonymousClass0D3 {
    public final CheckBox A00;
    public final TextView A01;

    public C41981y5(View view) {
        super(view);
        this.A01 = C36391kE.A0O(view, R.id.media_section);
        CheckBox checkBox = (CheckBox) C012005e.A02(view, R.id.media_select_all_checkbox);
        this.A00 = checkBox;
        checkBox.setText(view.getResources().getText(R.string.f12nameremoved));
        checkBox.setOnCheckedChangeListener(C67373Zo.A00);
    }
}
