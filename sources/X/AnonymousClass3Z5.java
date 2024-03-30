package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.3Z5  reason: invalid class name */
public class AnonymousClass3Z5 implements View.OnLongClickListener {
    public final AnonymousClass17Y A00;
    public final C21060yb A01;
    public final String A02;

    public boolean onLongClick(View view) {
        ClipboardManager A09 = this.A01.A09();
        if (A09 == null) {
            return true;
        }
        try {
            String str = this.A02;
            A09.setPrimaryClip(ClipData.newPlainText(str, str));
            this.A00.A06(R.string.f12nameremoved, 0);
            return true;
        } catch (NullPointerException | SecurityException e) {
            Log.e("contactinfo/copy", e);
            this.A00.A06(R.string.f12nameremoved, 0);
            return true;
        }
    }

    public AnonymousClass3Z5(AnonymousClass17Y r1, C21060yb r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }
}
