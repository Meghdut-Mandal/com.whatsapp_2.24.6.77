package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.R;

/* renamed from: X.0FM  reason: invalid class name */
public class AnonymousClass0FM extends AnonymousClass0DT implements DialogInterface {
    public final AnonymousClass0YZ A00 = new AnonymousClass0YZ(getContext(), getWindow(), this);

    public static int A00(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.f4nameremoved, typedValue, true);
        return typedValue.resourceId;
    }

    public void A04(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        AnonymousClass0YZ r2 = this.A00;
        Message obtainMessage = r2.A09.obtainMessage(i, onClickListener);
        if (i == -3) {
            r2.A0P = charSequence;
            r2.A0B = obtainMessage;
        } else if (i != -2) {
            r2.A0Q = charSequence;
            r2.A0C = obtainMessage;
        } else {
            r2.A0O = charSequence;
            r2.A0A = obtainMessage;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A00.A0N;
        if (nestedScrollView == null || !nestedScrollView.A0H(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A00.A0N;
        if (nestedScrollView == null || !nestedScrollView.A0H(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public AnonymousClass0FM(Context context, int i) {
        super(context, A00(context, i));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00.A03();
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AnonymousClass0YZ r0 = this.A00;
        r0.A0S = charSequence;
        TextView textView = r0.A0M;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
