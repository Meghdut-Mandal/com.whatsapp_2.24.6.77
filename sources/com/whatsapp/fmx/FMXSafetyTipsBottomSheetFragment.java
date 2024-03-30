package com.whatsapp.fmx;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass143;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass1NG;
import X.AnonymousClass3Y2;
import X.AnonymousClass3YG;
import X.AnonymousClass4GD;
import X.C000800j;
import X.C001400p;
import X.C012005e;
import X.C20380xT;
import X.C222813r;
import X.C24801Dv;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36421kH;
import X.C36441kJ;
import X.C62643Gy;
import X.C85474Hf;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.settings.SettingsRowIconText;

public final class FMXSafetyTipsBottomSheetFragment extends Hilt_FMXSafetyTipsBottomSheetFragment {
    public C24801Dv A00;
    public AnonymousClass1NG A01;
    public AnonymousClass16D A02;
    public C62643Gy A03;
    public C20380xT A04;
    public final AnonymousClass00T A05;
    public final AnonymousClass00T A06;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        AnonymousClass00T r6 = this.A05;
        if (r6.getValue() == null) {
            A1c();
            return;
        }
        View A0G = C36361kB.A0G(view, R.id.block_contact_container);
        AnonymousClass1NG r1 = this.A01;
        if (r1 != null) {
            C222813r r0 = UserJid.Companion;
            C36421kH.A0v(A0G, r1.A0O(C222813r.A00(C36441kJ.A0m(r6))) ? 1 : 0, 8, 0);
            AnonymousClass01I A0h = A0h();
            if ((A0h instanceof AnonymousClass155) && A0h != null) {
                AnonymousClass3Y2.A00(C012005e.A02(view, R.id.safety_tips_close_button), this, 7);
                C62643Gy r02 = this.A03;
                if (r02 != null) {
                    if (r02.A05) {
                        C36351kA.A1A(view, R.id.fmx_block_contact_subtitle, 8);
                        C36351kA.A1A(view, R.id.fmx_report_spam_subtitle, 8);
                        C36351kA.A1A(view, R.id.fmx_block_contact_arrow, 8);
                        C36351kA.A1A(view, R.id.fmx_report_spam_arrow, 8);
                    }
                    AnonymousClass3YG.A00(C012005e.A02(view, R.id.safety_tips_learn_more), this, A0h, 21);
                    AnonymousClass3YG.A00(C36361kB.A0G(view, R.id.block_contact_container), this, A0h, 20);
                    AnonymousClass3YG.A00(C36361kB.A0G(view, R.id.report_spam_container), this, A0h, 19);
                    if (AnonymousClass143.A0H(C222813r.A00(C36441kJ.A0m(r6)))) {
                        C36351kA.A1A(view, R.id.fmx_safety_tips_profile_name_id, 8);
                        C36351kA.A1A(view, R.id.fmx_safety_tips_phone_number_id, 8);
                        C36351kA.A1A(view, R.id.fmx_safety_tips_3p_personal_info_id, 0);
                        ((SettingsRowIconText) C012005e.A02(view, R.id.fmx_safety_tips_3p_personal_info_id)).A01((Drawable) null, false);
                        return;
                    }
                    return;
                }
                throw C36331k8.A0d("fmxManager");
            }
            return;
        }
        throw C36331k8.A0d("blockListManager");
    }

    public FMXSafetyTipsBottomSheetFragment() {
        C000800j r2 = C000800j.NONE;
        this.A05 = C001400p.A00(r2, new AnonymousClass4GD(this));
        this.A06 = C001400p.A00(r2, new C85474Hf(this, "argContactId"));
    }
}
