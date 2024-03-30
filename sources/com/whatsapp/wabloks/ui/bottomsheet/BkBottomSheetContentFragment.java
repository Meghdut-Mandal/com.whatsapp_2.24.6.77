package com.whatsapp.wabloks.ui.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass6S9;
import X.AnonymousClass6XK;
import X.C012005e;
import X.C116695l0;
import X.C131616Pt;
import X.C135476cl;
import X.C140456lc;
import X.C158077fl;
import X.C162977pS;
import X.C164197rQ;
import X.C18740tg;
import X.C36351kA;
import X.C36361kB;
import X.C90464aC;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;

public class BkBottomSheetContentFragment extends Hilt_BkBottomSheetContentFragment {
    public Toolbar A00;
    public C116695l0 A01;
    public C158077fl A02;
    public AnonymousClass005 A03;
    public String A04;
    public String A05;
    public boolean A06;

    public void A1J() {
        this.A00 = null;
        super.A1J();
    }

    public void A1H() {
        C158077fl r1 = this.A02;
        if (!(r1 == null || this.A01 == null)) {
            try {
                A1b(r1);
            } catch (NullPointerException e) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(AnonymousClass000.A0k(this));
                C36351kA.A1Q("Failed to execute onContentDismiss Expression: ", A0u, e);
            }
        }
        if (this.A0i && this.A01 != null) {
            String A0W = C90464aC.A0W(this.A01, "bk_bottom_sheet_content_fragment", AnonymousClass000.A0u());
            AnonymousClass00C.A0D(A0W, 0);
            ((C131616Pt) this.A03.get()).A03(new C162977pS(A0W, 0), "bk_bottom_sheet_content_fragment");
        }
        super.A1H();
    }

    public static BkBottomSheetContentFragment A00(C116695l0 r5, C131616Pt r6, String str, boolean z) {
        Bundle A07 = AnonymousClass001.A07();
        String A0W = C90464aC.A0W(r5, "bk_bottom_sheet_content_fragment", AnonymousClass000.A0u());
        A07.putString("bottom_sheet_fragment_tag", str);
        A07.putBoolean("bottom_sheet_back_stack", z);
        A07.putString("bk_bottom_sheet_content_fragment", A0W);
        AnonymousClass00C.A0D(A0W, 0);
        r6.A02(new C162977pS(A0W, 0), new AnonymousClass6S9(r5), "bk_bottom_sheet_content_fragment");
        BkBottomSheetContentFragment bkBottomSheetContentFragment = new BkBottomSheetContentFragment();
        bkBottomSheetContentFragment.A17(A07);
        bkBottomSheetContentFragment.A02 = (AnonymousClass6XK) C140456lc.A0I(r5.A00, 35);
        return bkBottomSheetContentFragment;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1Q(Bundle bundle) {
        String string = A0b().getString("bk_bottom_sheet_content_fragment", "");
        AnonymousClass00C.A0D(string, 0);
        C116695l0 r0 = (C116695l0) ((C131616Pt) this.A03.get()).A01(new C162977pS(string, 0), "bk_bottom_sheet_content_fragment");
        this.A01 = r0;
        if (r0 != null) {
            this.A02 = (AnonymousClass6XK) C140456lc.A0I(r0.A00, 35);
        }
        super.A1Q(bundle);
    }

    public void A1S(Bundle bundle, View view) {
        C164197rQ A002;
        Bundle A0b = A0b();
        this.A00 = (Toolbar) C012005e.A02(view, R.id.bk_bottom_sheet_toolbar);
        this.A04 = A0b.getString("bottom_sheet_fragment_tag");
        this.A06 = A0b.getBoolean("bottom_sheet_back_stack");
        C116695l0 r0 = this.A01;
        if (r0 != null) {
            String A0K = C140456lc.A0K(r0.A00);
            this.A05 = A0K;
            if (!TextUtils.isEmpty(A0K)) {
                this.A00.setVisibility(0);
                this.A00.setTitle((CharSequence) this.A05);
            }
            if (this.A01.A00.A0X(38) == null) {
                A002 = null;
            } else {
                A002 = C164197rQ.A00(this, 44);
            }
            this.A02 = A002;
            boolean z = this.A06;
            Toolbar toolbar = this.A00;
            if (z) {
                toolbar.setVisibility(0);
                this.A00.getNavigationIcon().setVisible(true, true);
                this.A00.setNavigationOnClickListener(new C135476cl(this, 29));
            } else {
                Drawable navigationIcon = toolbar.getNavigationIcon();
                C18740tg.A06(navigationIcon);
                navigationIcon.setVisible(false, false);
            }
        }
        super.A1S(bundle, view);
    }
}
