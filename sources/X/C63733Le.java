package X;

import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;

/* renamed from: X.3Le  reason: invalid class name and case insensitive filesystem */
public abstract class C63733Le {
    public static ImageButton A00(Activity activity, C20810yC r4) {
        AnonymousClass00C.A0D(r4, 0);
        if (!r4.A0E(4268)) {
            return (ImageButton) C03570Gk.A0B(activity, R.id.emoji_picker_btn);
        }
        C36361kB.A0h(activity, R.id.input_emoji_picker_right).A03(0);
        ImageButton imageButton = (ImageButton) C03570Gk.A0B(activity, R.id.input_emoji_picker_right);
        C36361kB.A0v(activity, R.id.emoji_picker_btn);
        return imageButton;
    }

    public static WaImageButton A01(Activity activity, C20810yC r5) {
        AnonymousClass00C.A0D(r5, 0);
        if (r5.A0E(4268)) {
            C36361kB.A0h(activity, R.id.input_attach_button_left).A03(0);
            View A0B = C03570Gk.A0B(activity, R.id.entry);
            C36341k9.A0z(A0B, activity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), A0B.getPaddingTop());
            C36431kI.A0P(activity, R.id.input_attach_button_left).setImageResource(R.drawable.ic_action_add);
            return (WaImageButton) C03570Gk.A0B(activity, R.id.input_attach_button_left);
        }
        WaImageButton waImageButton = (WaImageButton) C03570Gk.A0B(activity, R.id.input_attach_button);
        waImageButton.setVisibility(0);
        return waImageButton;
    }
}
