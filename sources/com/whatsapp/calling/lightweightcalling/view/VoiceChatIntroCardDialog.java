package com.whatsapp.calling.lightweightcalling.view;

import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass0BT;
import X.AnonymousClass1PZ;
import X.AnonymousClass3JS;
import X.AnonymousClass3UE;
import X.C012005e;
import X.C135456cj;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36381kD;
import X.C36431kI;
import X.C50972mw;
import X.C51002mz;
import X.C51372ni;
import X.C51382nj;
import X.C63013Ik;
import X.C63323Jp;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;
import java.util.Iterator;
import java.util.Objects;

public final class VoiceChatIntroCardDialog extends Hilt_VoiceChatIntroCardDialog {
    public View.OnClickListener A00;
    public AnonymousClass1PZ A01;
    public boolean A02;
    public View A03;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        this.A03 = view;
        A03();
        View A022 = C012005e.A02(view, R.id.content);
        AnonymousClass00C.A0E(A022, "null cannot be cast to non-null type com.whatsapp.wds.components.textlayout.WDSTextLayout");
        WDSTextLayout wDSTextLayout = (WDSTextLayout) A022;
        C63323Jp r7 = new C63323Jp(AnonymousClass0BT.A00((Resources.Theme) null, C36341k9.A0G(this), R.drawable.vec_voice_chat_intro_header), C51372ni.MEDIUM, C36341k9.A0G(this).getString(R.string.f12nameremoved), C36341k9.A0G(this).getString(R.string.f12nameremoved));
        C51382nj r8 = C51382nj.FOOTER;
        AnonymousClass3JS[] r5 = new AnonymousClass3JS[2];
        r5[0] = new AnonymousClass3JS(C36381kD.A0s(C36341k9.A0G(this), R.string.f12nameremoved), C36341k9.A0G(this).getString(R.string.f12nameremoved), R.drawable.vec_ic_lwc_mic_on);
        C50972mw r9 = new C50972mw(C36341k9.A0m(new AnonymousClass3JS(C36381kD.A0s(C36341k9.A0G(this), R.string.f12nameremoved), C36341k9.A0G(this).getString(R.string.f12nameremoved), R.drawable.ic_notifications_off), r5, 1));
        wDSTextLayout.setTextLayoutViewState(new C51002mz(new C63013Ik(new C135456cj(this, 25), C36381kD.A0s(C36341k9.A0G(this), R.string.f12nameremoved)), new C63013Ik(new C135456cj(this, 24), C36381kD.A0s(C36341k9.A0G(this), R.string.f12nameremoved)), r7, r8, r9, (CharSequence) null));
        View A023 = C012005e.A02(wDSTextLayout, R.id.content_container);
        AnonymousClass00C.A0E(A023, "null cannot be cast to non-null type android.view.ViewGroup");
        Iterator A12 = C36381kD.A12(A023);
        while (A12.hasNext()) {
            View A024 = C012005e.A02(C36431kI.A0K(A12), R.id.bullet_icon);
            AnonymousClass00C.A0E(A024, "null cannot be cast to non-null type com.whatsapp.WaImageView");
            ImageView imageView = (ImageView) A024;
            imageView.setColorFilter(C36351kA.A02(imageView.getContext(), imageView.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        A03();
    }

    private final void A03() {
        AnonymousClass01I A0h = A0h();
        if (A0h != null) {
            float f = 0.85f;
            if (C36341k9.A04(A0a()) == 2) {
                f = 1.0f;
            }
            View view = this.A03;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                layoutParams.height = (int) (((float) AnonymousClass3UE.A00(A0h)) * f);
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public void A1J() {
        super.A1J();
        if (!this.A02) {
            AnonymousClass1PZ r2 = this.A01;
            if (r2 != null) {
                r2.A00(23, 38);
            } else {
                throw C36331k8.A0d("callUserJourneyLogger");
            }
        }
        this.A03 = null;
        this.A02 = false;
    }

    public int A1i() {
        return R.layout.f9nameremoved;
    }
}
