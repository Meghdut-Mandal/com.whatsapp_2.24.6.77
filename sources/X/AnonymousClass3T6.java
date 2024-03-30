package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.jid.Jid;

/* renamed from: X.3T6  reason: invalid class name */
public abstract class AnonymousClass3T6 {
    public static void A02(Bundle bundle, AnonymousClass3QT r4, AnonymousClass2Fm r5) {
        if (bundle != null) {
            String string = bundle.getString("contact_data_first_name");
            if (!TextUtils.isEmpty(string)) {
                AnonymousClass00C.A0D(string, 0);
                r4.A00 = AnonymousClass3QT.A01(string);
                r4.A04.setText(string);
            }
            String string2 = bundle.getString("contact_data_last_name");
            if (!TextUtils.isEmpty(string2)) {
                AnonymousClass00C.A0D(string2, 0);
                r4.A01 = AnonymousClass3QT.A01(string2);
                r4.A05.setText(string2);
            }
            String string3 = bundle.getString("contact_data_business_name");
            if (!TextUtils.isEmpty(string3)) {
                AnonymousClass00C.A0D(string3, 0);
                r4.A03.setText(string3);
                r4.A06.setVisibility(0);
                r4.A07.setVisibility(0);
            }
            String string4 = bundle.getString("contact_data_phone");
            if (!TextUtils.isEmpty(string4)) {
                try {
                    AUN A0F = C203559oI.A00().A0F(string4, (String) null);
                    String num = Integer.toString(A0F.countryCode_);
                    String A02 = C203559oI.A02(A0F);
                    r5.A06(num);
                    AnonymousClass00C.A0D(A02, 0);
                    WaEditText waEditText = r5.A05;
                    if (waEditText == null) {
                        throw C36331k8.A0d("phoneField");
                    }
                    waEditText.setText(A02);
                    r5.A01 = C36321k7.A0D(num, A02.replaceAll("[^0-9]", ""));
                } catch (AnonymousClass172 e) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Error while parsing phoneNumber, message: ");
                    C36321k7.A1Z(A0u, e.message);
                }
            }
        }
    }

    public static void A03(View view, boolean z) {
        if (!z) {
            C012005e.A02(view, R.id.sync_to_phone_icon).setVisibility(0);
            C36351kA.A1A(view, R.id.sync_to_phone_toggle_text, 0);
            C36351kA.A1A(view, R.id.sync_to_device, 0);
        }
        C012005e.A02(view, R.id.add_information).setVisibility(8);
        C36351kA.A1A(view, R.id.save_to_icon, 8);
        C36351kA.A1A(view, R.id.contacts_storage_options_selector, 8);
    }

    public static boolean A04(C229216m r1, C20830yE r2) {
        if (r2.A02("android.permission.GET_ACCOUNTS") != 0 || !r1.A00()) {
            return false;
        }
        return true;
    }

    public static Intent A00(C62533Gn r3, AnonymousClass3QT r4, AnonymousClass2Fm r5, AnonymousClass312 r6, boolean z, boolean z2) {
        Jid A0h;
        Intent A0D = C36431kI.A0D();
        if (z2) {
            A0D.putExtra("contact_updated", true);
        }
        if (r3.A01) {
            String A02 = r4.A02();
            if (TextUtils.isEmpty(A02)) {
                A02 = r5.A03();
            }
            A0D.putExtra("newly_added_contact_name_key", A02);
            if (z) {
                A0D.putExtra("newly_added_contact_wa_only", !r6.A00.isChecked());
            }
            A0D.putExtra("newly_added_contact_phone_number_key", r5.A03());
            AnonymousClass141 r0 = r3.A00;
            if (!(r0 == null || (A0h = C36431kI.A0h(r0)) == null)) {
                A0D.putExtra("newly_added_contact_jid_key", A0h.getRawString());
            }
        }
        return A0D;
    }

    public static void A01(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, int i, int i2, int i3) {
        C39001qm A00 = AnonymousClass3LW.A00(activity);
        A00.A0Z(activity.getString(i));
        A00.A0Q(onClickListener, activity.getString(i2));
        A00.A0S(onClickListener2, activity.getString(i3));
        if (!activity.isFinishing()) {
            C36341k9.A11(A00);
        }
    }
}
