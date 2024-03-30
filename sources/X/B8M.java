package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.whatsapp.R;

public class B8M implements View.OnLongClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public B8M(C167797yq r1, String str, int i) {
        this.A02 = i;
        this.A00 = r1;
        this.A01 = str;
    }

    public final boolean onLongClick(View view) {
        C167797yq r4 = (C167797yq) this.A00;
        String str = this.A01;
        ClipboardManager A09 = r4.A0N.A09();
        if (A09 != null) {
            try {
                A09.setPrimaryClip(ClipData.newPlainText(str, str));
                r4.A0I.A06(R.string.f12nameremoved, 0);
                return true;
            } catch (NullPointerException | SecurityException e) {
                r4.A0c.A0A("getTransactionIdRow paymentTransactionID", e);
            }
        }
        r4.A0I.A06(R.string.f12nameremoved, 0);
        return true;
    }
}
