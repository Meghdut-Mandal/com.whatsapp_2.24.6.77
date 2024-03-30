package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.3Zs  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67413Zs implements TextView.OnEditorActionListener {
    public final /* synthetic */ TextInputEditText A00;
    public final /* synthetic */ SecretCodeAuthenticationBottomSheet A01;

    public /* synthetic */ C67413Zs(TextInputEditText textInputEditText, SecretCodeAuthenticationBottomSheet secretCodeAuthenticationBottomSheet) {
        this.A00 = textInputEditText;
        this.A01 = secretCodeAuthenticationBottomSheet;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        WDSButton wDSButton;
        WDSButton wDSButton2;
        TextInputEditText textInputEditText = this.A00;
        SecretCodeAuthenticationBottomSheet secretCodeAuthenticationBottomSheet = this.A01;
        if (((keyEvent != null && keyEvent.getKeyCode() == 66) || i == textInputEditText.getImeOptions()) && (wDSButton = secretCodeAuthenticationBottomSheet.A02) != null && wDSButton.isEnabled() && (wDSButton2 = secretCodeAuthenticationBottomSheet.A02) != null) {
            wDSButton2.callOnClick();
        }
        return true;
    }
}
