package X;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.settings.SettingsSetupUserProxyActivity;

/* renamed from: X.4LH  reason: invalid class name */
public final class AnonymousClass4LH extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ SettingsSetupUserProxyActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4LH(SettingsSetupUserProxyActivity settingsSetupUserProxyActivity) {
        super(1);
        this.this$0 = settingsSetupUserProxyActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String valueOf;
        String valueOf2;
        AnonymousClass011 r6 = (AnonymousClass011) obj;
        SettingsSetupUserProxyActivity settingsSetupUserProxyActivity = this.this$0;
        AnonymousClass3QR r4 = (AnonymousClass3QR) r6.second;
        TextInputLayout textInputLayout = settingsSetupUserProxyActivity.A01;
        if (textInputLayout == null) {
            throw C36331k8.A0d("proxyInputEditText");
        }
        EditText editText = textInputLayout.A0B;
        if (editText != null) {
            String str = r4.A02;
            if (str == null && (str = r4.A05) == null) {
                str = "";
            }
            Editable text = editText.getText();
            AnonymousClass00C.A08(text);
            if (!AnonymousClass00C.A0J(C36371kC.A0y(text), str) && str.length() > 0) {
                C36391kE.A1K(editText);
                editText.append(str);
            }
        }
        int i = r4.A00;
        if (i == 443) {
            valueOf = settingsSetupUserProxyActivity.getString(R.string.f12nameremoved);
        } else {
            valueOf = String.valueOf(i);
        }
        AnonymousClass00C.A0B(valueOf);
        int i2 = r4.A01;
        if (i2 == 587) {
            valueOf2 = settingsSetupUserProxyActivity.getString(R.string.f12nameremoved);
        } else {
            valueOf2 = String.valueOf(i2);
        }
        AnonymousClass00C.A0B(valueOf2);
        WaTextView waTextView = settingsSetupUserProxyActivity.A02;
        if (waTextView == null) {
            throw C36331k8.A0d("chatPortTextView");
        }
        waTextView.setText(valueOf);
        WaTextView waTextView2 = settingsSetupUserProxyActivity.A03;
        if (waTextView2 == null) {
            throw C36331k8.A0d("mediaPortTextView");
        }
        waTextView2.setText(valueOf2);
        int A0I = AnonymousClass000.A0I(r6.first);
        if (A0I == 0) {
            View view = this.this$0.A00;
            if (view == null) {
                throw C36331k8.A0d("saveProxyButton");
            }
            view.setEnabled(true);
            SettingsSetupUserProxyActivity settingsSetupUserProxyActivity2 = this.this$0;
            View view2 = settingsSetupUserProxyActivity2.A00;
            if (view2 == null) {
                throw C36331k8.A0d("saveProxyButton");
            }
            AnonymousClass3YC.A00(view2, settingsSetupUserProxyActivity2, r6, 13);
        } else if (A0I == 1 || A0I == 2) {
            View view3 = this.this$0.A00;
            if (view3 == null) {
                throw C36331k8.A0d("saveProxyButton");
            }
            view3.setEnabled(false);
        }
        return AnonymousClass0AJ.A00;
    }
}
