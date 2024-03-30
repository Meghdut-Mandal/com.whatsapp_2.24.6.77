package com.whatsapp.interop.ui;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass3JS;
import X.C012005e;
import X.C20380xT;
import X.C36321k7;
import X.C36341k9;
import X.C36361kB;
import X.C36421kH;
import X.C48752hz;
import X.C50972mw;
import X.C51392nk;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;
import java.util.Objects;

public final class InteropSystemAboutBottomSheet extends Hilt_InteropSystemAboutBottomSheet {
    public View A00;
    public C20380xT A01;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        this.A00 = view;
        AnonymousClass01I A0i = A0i();
        View view2 = this.A00;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            Point point = new Point();
            Rect A06 = AnonymousClass001.A06();
            C36321k7.A0K(A0i, point);
            C36361kB.A0C(A0i).getWindowVisibleDisplayFrame(A06);
            layoutParams.height = (int) (((float) (point.y - A06.top)) * 0.86f);
            view2.setLayoutParams(layoutParams);
        }
        View A02 = C012005e.A02(view, R.id.about_bottom_sheet_fragment);
        AnonymousClass00C.A0E(A02, "null cannot be cast to non-null type com.whatsapp.wds.components.textlayout.WDSTextLayout");
        WDSTextLayout wDSTextLayout = (WDSTextLayout) A02;
        wDSTextLayout.setFootnoteText(A0n(R.string.f12nameremoved));
        wDSTextLayout.setHeadlineText(A0n(R.string.f12nameremoved));
        AnonymousClass3JS[] r5 = new AnonymousClass3JS[3];
        r5[0] = new AnonymousClass3JS(C36421kH.A0a(this, R.string.f12nameremoved), (CharSequence) null, R.drawable.wds_vec_ic_lock_open);
        r5[1] = new AnonymousClass3JS(C36421kH.A0a(this, R.string.f12nameremoved), (CharSequence) null, R.drawable.wds_vec_ic_safety_tip);
        wDSTextLayout.setContent(new C50972mw(C36341k9.A0m(new AnonymousClass3JS(C36421kH.A0a(this, R.string.f12nameremoved), (CharSequence) null, R.drawable.wds_vec_ic_settings_account_unfilled_description), r5, 2)));
        wDSTextLayout.setLayoutSize(C51392nk.MEDIUM);
        wDSTextLayout.setSecondaryButtonText(A0n(R.string.f12nameremoved));
        wDSTextLayout.setSecondaryButtonClickListener(new C48752hz(this, 16));
    }

    public int A1i() {
        return R.layout.f9nameremoved;
    }
}
