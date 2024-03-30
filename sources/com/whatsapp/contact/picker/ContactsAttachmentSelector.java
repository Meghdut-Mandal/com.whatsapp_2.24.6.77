package com.whatsapp.contact.picker;

import X.AnonymousClass04H;
import X.AnonymousClass1N4;
import X.AnonymousClass2GH;
import X.AnonymousClass3MR;
import X.C012005e;
import X.C19630wG;
import X.C28271Rz;
import X.C39451sL;
import X.C53592rZ;
import X.C64813Pn;
import X.C89084Ve;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;

public class ContactsAttachmentSelector extends AnonymousClass2GH {
    public AnonymousClass1N4 A00;
    public C39451sL A01;
    public C19630wG A02;
    public C28271Rz A03;
    public C64813Pn A04;
    public boolean A05;
    public BottomSheetBehavior A06;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 8) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A05 = AnonymousClass3MR.A00(this.A0D);
        C39451sL r0 = (C39451sL) new AnonymousClass04H(new C89084Ve(this, 0), this).A00(C39451sL.class);
        this.A01 = r0;
        C53592rZ.A00(this, r0.A03, 48);
        C53592rZ.A00(this, this.A01.A00, 49);
        if (this.A05) {
            View A022 = C012005e.A02(this.A00, R.id.contact_picker_activity);
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            this.A06 = bottomSheetBehavior;
            this.A04.A02(A022, bottomSheetBehavior, this, this.A0C);
            C64813Pn.A00(this, getSupportActionBar());
        }
    }

    public void onStart() {
        super.onStart();
        if (this.A05) {
            this.A04.A03(this.A06, this);
        }
    }
}
