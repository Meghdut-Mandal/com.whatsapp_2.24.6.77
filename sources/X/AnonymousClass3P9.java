package X;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.3P9  reason: invalid class name */
public class AnonymousClass3P9 {
    public int A00 = -1;
    public int A01 = 0;
    public int A02;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = 0;
    public DialogInterface.OnClickListener A06;
    public DialogInterface.OnClickListener A07;
    public CharSequence A08;
    public CharSequence A09;
    public Object[] A0A;
    public Object[] A0B;

    public static AnonymousClass3P9 A00(CharSequence charSequence) {
        AnonymousClass3P9 r2 = new AnonymousClass3P9();
        r2.A08 = charSequence;
        r2.A05 = R.string.f12nameremoved;
        r2.A0B = new Object[0];
        return r2;
    }

    public static final void A01(Bundle bundle, String str, String str2, Object[] objArr) {
        int i;
        if (objArr != null) {
            int length = objArr.length;
            int i2 = 0;
            if (length != 0) {
                ArrayList A14 = C36441kJ.A14(length);
                ArrayList A142 = C36441kJ.A14(length);
                do {
                    Object obj = objArr[i2];
                    AnonymousClass00C.A0D(obj, 0);
                    if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short)) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    A142.add(i);
                    A14.add(obj.toString());
                    i2++;
                } while (i2 < length);
                bundle.putStringArrayList(str, A14);
                bundle.putIntegerArrayList(str2, A142);
            }
        }
    }

    public LegacyMessageDialogFragment A02() {
        DialogInterface.OnClickListener onClickListener;
        DialogInterface.OnClickListener onClickListener2;
        LegacyMessageDialogFragment legacyMessageDialogFragment = new LegacyMessageDialogFragment();
        int i = this.A00;
        int i2 = this.A05;
        int i3 = this.A01;
        Object[] objArr = this.A0A;
        int i4 = this.A03;
        int i5 = this.A04;
        Bundle A072 = AnonymousClass001.A07();
        if (i != -1) {
            A072.putInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID, i);
        }
        if (i2 != 0) {
            A072.putInt("title_res", i2);
        }
        if (i3 != 0) {
            A072.putInt("message_res", i3);
            A01(A072, "message_params_values", "message_params_types", objArr);
        }
        if (i4 != 0) {
            A072.putInt("primary_action_text_id_res", i4);
        }
        if (i5 != 0) {
            A072.putInt("secondary_action_text_res", i5);
        }
        if (this.A05 != 0) {
            A01(A072, "title_params_values", "title_params_types", this.A0B);
        }
        CharSequence charSequence = this.A09;
        if (charSequence != null) {
            A072.putCharSequence("title", charSequence);
        }
        CharSequence charSequence2 = this.A08;
        if (charSequence2 != null) {
            A072.putCharSequence("message", charSequence2);
        }
        int i6 = this.A02;
        if (i6 != 0) {
            A072.putInt("message_view_id", i6);
        }
        if (!(this.A03 == 0 || (onClickListener2 = this.A06) == null)) {
            legacyMessageDialogFragment.A00 = onClickListener2;
        }
        if (!(this.A04 == 0 || (onClickListener = this.A07) == null)) {
            legacyMessageDialogFragment.A01 = onClickListener;
        }
        legacyMessageDialogFragment.A17(A072);
        return legacyMessageDialogFragment;
    }
}
