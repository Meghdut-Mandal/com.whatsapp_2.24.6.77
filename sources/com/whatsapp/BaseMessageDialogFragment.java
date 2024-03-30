package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass01z;
import X.AnonymousClass02E;
import X.AnonymousClass3LW;
import X.AnonymousClass3UG;
import X.AnonymousClass4XL;
import X.AnonymousClass4XO;
import X.C225314u;
import X.C36371kC;
import X.C36381kD;
import X.C36431kI;
import X.C39001qm;
import X.C66413Vw;
import X.C66423Vx;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.product.newsletterenforcements.enforcedmessages.DeleteEnforcedMessageDialogFragment;
import com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class BaseMessageDialogFragment extends Hilt_BaseMessageDialogFragment {
    public void A1f(AnonymousClass01z r2, String str) {
        AnonymousClass00C.A0D(r2, 0);
        C36381kD.A1F(this, r2, str);
    }

    public final String A1k(String str, String str2, String str3) {
        Object obj;
        int i = A0b().getInt(str);
        if (i == 0) {
            return null;
        }
        AbstractList stringArrayList = A0b().getStringArrayList(str2);
        if (stringArrayList == null) {
            return A0n(i);
        }
        ArrayList<Integer> integerArrayList = A0b().getIntegerArrayList(str3);
        if (integerArrayList == null || integerArrayList.size() != stringArrayList.size()) {
            throw AnonymousClass001.A08("Failed requirement.");
        }
        int size = stringArrayList.size();
        Object[] objArr = new Object[size];
        int size2 = stringArrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Number number = integerArrayList.get(i2);
            if (number == null || number.intValue() != 1) {
                obj = stringArrayList.get(i2);
            } else {
                Object obj2 = stringArrayList.get(i2);
                AnonymousClass00C.A08(obj2);
                obj = C36431kI.A15((String) obj2);
            }
            objArr[i2] = obj;
        }
        return A0o(i, Arrays.copyOf(objArr, size));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass02E r3 = this.A0I;
        if (r3 != null && (r3 instanceof MediaViewFragment)) {
            MediaViewBaseFragment mediaViewBaseFragment = (MediaViewBaseFragment) r3;
            if (A0b().getInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID, -1) == 101) {
                mediaViewBaseFragment.A1g();
                return;
            }
        }
        AnonymousClass01I A0h = A0h();
        if (A0h instanceof C225314u) {
            ((C225314u) A0h).A2x(A0b().getInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID, -1));
        }
    }

    public void A1M() {
        if (A0b().getInt("secondary_action_color_res", -1) != -1) {
            this.A00 = A0b().getInt("secondary_action_color_res", -1);
        }
        super.A1M();
    }

    public final Dialog A1a(Bundle bundle) {
        CharSequence charSequence;
        int i;
        DialogInterface.OnClickListener onClickListener;
        C39001qm A05 = AnonymousClass3LW.A05(this);
        A05.A0r(true);
        boolean z = this instanceof LegacyMessageDialogFragment;
        if (z) {
            CharSequence charSequence2 = A0b().getCharSequence("title");
            if (charSequence2 == null) {
                charSequence2 = A1k("title_res", "title_params_values", "title_params_types");
            }
            A05.setTitle(charSequence2);
        } else if (A0b().getInt("title_res") != 0) {
            A05.A0L(A0b().getInt("title_res"));
        }
        if (z) {
            LegacyMessageDialogFragment legacyMessageDialogFragment = (LegacyMessageDialogFragment) this;
            int i2 = legacyMessageDialogFragment.A0b().getInt("message_view_id");
            if (i2 != 0) {
                A05.A0M(i2);
            } else {
                CharSequence charSequence3 = legacyMessageDialogFragment.A0b().getCharSequence("message");
                if (charSequence3 == null) {
                    charSequence3 = legacyMessageDialogFragment.A1k("message_res", "message_params_values", "message_params_types");
                }
                charSequence = AnonymousClass3UG.A03(legacyMessageDialogFragment.A0a(), (Paint) null, legacyMessageDialogFragment.A02, charSequence3);
                A05.A0Z(charSequence);
            }
        } else if (A0b().getInt("message_res") != 0) {
            charSequence = A1k("message_res", "message_params_values", "message_params_types");
            A05.A0Z(charSequence);
        }
        if (this instanceof ReportToAdminDialogFragment) {
            A05.setPositiveButton(R.string.f12nameremoved, new AnonymousClass4XO(this, 1));
            i = R.string.f12nameremoved;
            onClickListener = C66423Vx.A00;
        } else if (this instanceof DeleteEnforcedMessageDialogFragment) {
            A05.setPositiveButton(R.string.f12nameremoved, new AnonymousClass4XO(this, 0));
            i = R.string.f12nameremoved;
            onClickListener = C66413Vw.A00;
        } else {
            LegacyMessageDialogFragment legacyMessageDialogFragment2 = (LegacyMessageDialogFragment) this;
            if (legacyMessageDialogFragment2.A0b().getInt("primary_action_text_id_res") == 0 || legacyMessageDialogFragment2.A00 == null) {
                A05.setPositiveButton(R.string.f12nameremoved, AnonymousClass4XL.A00(legacyMessageDialogFragment2, 2));
                return C36371kC.A0O(A05);
            }
            A05.setPositiveButton(legacyMessageDialogFragment2.A0b().getInt("primary_action_text_id_res"), legacyMessageDialogFragment2.A00);
            if (!(legacyMessageDialogFragment2.A0b().getInt("secondary_action_text_res") == 0 || legacyMessageDialogFragment2.A01 == null)) {
                A05.setNegativeButton(legacyMessageDialogFragment2.A0b().getInt("secondary_action_text_res"), legacyMessageDialogFragment2.A01);
            }
            return C36371kC.A0O(A05);
        }
        A05.setNegativeButton(i, onClickListener);
        return C36371kC.A0O(A05);
    }
}
