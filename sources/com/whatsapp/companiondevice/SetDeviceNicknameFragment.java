package com.whatsapp.companiondevice;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass1H2;
import X.AnonymousClass1LU;
import X.AnonymousClass1N0;
import X.AnonymousClass2gA;
import X.AnonymousClass4JR;
import X.C18820ts;
import X.C19890wg;
import X.C21060yb;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36431kI;
import X.C53592rZ;
import X.C66763Xf;
import X.C66943Xx;
import X.C67113Yo;
import X.C835349t;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.jid.DeviceJid;

public final class SetDeviceNicknameFragment extends Hilt_SetDeviceNicknameFragment {
    public C21060yb A00;
    public C18820ts A01;
    public AnonymousClass1LU A02;
    public AnonymousClass1N0 A03;
    public AnonymousClass1H2 A04;
    public C19890wg A05;
    public final AnonymousClass00T A06 = C36431kI.A1I(new C835349t(this));

    public void A1S(Bundle bundle, View view) {
        View view2 = view;
        AnonymousClass00C.A0D(view2, 0);
        super.A1S(bundle, view2);
        Bundle A0b = A0b();
        DeviceJid A022 = DeviceJid.Companion.A02(A0b.getString("device_jid_raw_string"));
        String string = A0b.getString("existing_display_name");
        String string2 = A0b.getString("device_string");
        C53592rZ.A01(this, ((LinkedDeviceEnterNicknameViewModel) this.A06.getValue()).A01, new AnonymousClass4JR(this), 33);
        WaEditText waEditText = (WaEditText) C36361kB.A0G(view2, R.id.nickname_edit_text);
        TextView A0M = C36341k9.A0M(view2, R.id.counter_tv);
        int i = 0;
        waEditText.setFilters(new C66763Xf[]{new C66763Xf(50)});
        waEditText.A0C(false);
        AnonymousClass1H2 r14 = this.A04;
        if (r14 != null) {
            C21060yb r11 = this.A00;
            if (r11 != null) {
                C18820ts r12 = this.A01;
                if (r12 != null) {
                    C19890wg r15 = this.A05;
                    if (r15 != null) {
                        AnonymousClass1N0 r13 = this.A03;
                        if (r13 != null) {
                            waEditText.addTextChangedListener(new AnonymousClass2gA(waEditText, A0M, r11, r12, r13, r14, r15, 50, 50, false, false, false));
                            waEditText.setText(string);
                            if (string != null) {
                                i = string.length();
                            }
                            waEditText.setSelection(i);
                            waEditText.setHint(string2);
                            C67113Yo.A00(C36361kB.A0G(view2, R.id.save_btn), this, A022, waEditText, 26);
                            C66943Xx.A00(C36361kB.A0G(view2, R.id.cancel_btn), this, 19);
                            return;
                        }
                        throw C36331k8.A0d("emojiRichFormatterStaticCaller");
                    }
                    throw C36331k8.A0d("sharedPreferencesFactory");
                }
                throw C36321k7.A09();
            }
            throw C36331k8.A0W();
        }
        throw C36331k8.A0d("emojiLoader");
    }

    public int A1Y() {
        return R.style.f13nameremoved;
    }

    public int A1i() {
        return R.layout.f9nameremoved;
    }
}
