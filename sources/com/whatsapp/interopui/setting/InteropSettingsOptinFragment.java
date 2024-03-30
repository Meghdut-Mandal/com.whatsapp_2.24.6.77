package com.whatsapp.interopui.setting;

import X.AnonymousClass00C;
import X.AnonymousClass3E7;
import X.AnonymousClass3JS;
import X.C012005e;
import X.C20380xT;
import X.C36341k9;
import X.C36421kH;
import X.C48752hz;
import X.C50972mw;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public final class InteropSettingsOptinFragment extends Hilt_InteropSettingsOptinFragment {
    public AnonymousClass3E7 A00;
    public C20380xT A01;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        View A02 = C012005e.A02(view, R.id.settings_optin_fragment);
        AnonymousClass00C.A0E(A02, "null cannot be cast to non-null type com.whatsapp.wds.components.textlayout.WDSTextLayout");
        WDSTextLayout wDSTextLayout = (WDSTextLayout) A02;
        wDSTextLayout.setFootnoteText(A0n(R.string.f12nameremoved));
        wDSTextLayout.setHeadlineText(A0n(R.string.f12nameremoved));
        AnonymousClass3JS[] r5 = new AnonymousClass3JS[3];
        r5[0] = new AnonymousClass3JS(C36421kH.A0a(this, R.string.f12nameremoved), (CharSequence) null, R.drawable.wds_vec_ic_lock_open);
        r5[1] = new AnonymousClass3JS(C36421kH.A0a(this, R.string.f12nameremoved), (CharSequence) null, R.drawable.wds_vec_ic_safety_tip);
        wDSTextLayout.setContent(new C50972mw(C36341k9.A0m(new AnonymousClass3JS(C36421kH.A0a(this, R.string.f12nameremoved), (CharSequence) null, R.drawable.wds_vec_ic_settings_account_unfilled_description), r5, 2)));
        wDSTextLayout.setPrimaryButtonText(A0n(R.string.f12nameremoved));
        wDSTextLayout.setPrimaryButtonClickListener(new C48752hz(this, 17));
        wDSTextLayout.setSecondaryButtonText(A0n(R.string.f12nameremoved));
        wDSTextLayout.setSecondaryButtonClickListener(new C48752hz(this, 18));
    }
}
