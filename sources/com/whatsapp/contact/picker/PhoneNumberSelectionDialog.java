package com.whatsapp.contact.picker;

import X.AnonymousClass001;
import X.AnonymousClass0FM;
import X.AnonymousClass15Q;
import X.AnonymousClass3LW;
import X.AnonymousClass4XI;
import X.C18740tg;
import X.C19970wo;
import X.C37781nC;
import X.C39001qm;
import X.C48722hw;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import java.util.ArrayList;

public class PhoneNumberSelectionDialog extends Hilt_PhoneNumberSelectionDialog {
    public AnonymousClass15Q A00;
    public C19970wo A01;

    public static PhoneNumberSelectionDialog A03(String str, ArrayList arrayList) {
        PhoneNumberSelectionDialog phoneNumberSelectionDialog = new PhoneNumberSelectionDialog();
        Bundle A07 = AnonymousClass001.A07();
        A07.putString(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, str);
        A07.putParcelableArrayList("phoneNumberSelectionInfoList", arrayList);
        phoneNumberSelectionDialog.A17(A07);
        return phoneNumberSelectionDialog;
    }

    public void A19() {
        super.A19();
        this.A00 = null;
    }

    public void A1O(Context context) {
        super.A1O(context);
        if (context instanceof AnonymousClass15Q) {
            this.A00 = (AnonymousClass15Q) context;
        }
    }

    public Dialog A1a(Bundle bundle) {
        Bundle A0b = A0b();
        String string = A0b.getString(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
        ArrayList parcelableArrayList = A0b.getParcelableArrayList("phoneNumberSelectionInfoList");
        C18740tg.A06(parcelableArrayList);
        Context A0a = A0a();
        C37781nC r5 = new C37781nC(A0a, parcelableArrayList);
        C39001qm A002 = AnonymousClass3LW.A00(A0a);
        A002.A0q(string);
        A002.A00.A0O((DialogInterface.OnClickListener) null, r5);
        A002.A0h(new AnonymousClass4XI(r5, parcelableArrayList, this, 5), R.string.f12nameremoved);
        A002.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
        A002.A0r(true);
        AnonymousClass0FM create = A002.create();
        create.A00.A0K.setOnItemClickListener(new C48722hw(r5, this, this.A01));
        return create;
    }
}
