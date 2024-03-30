package com.whatsapp.privacy.usernotice;

import X.AnonymousClass000;
import X.AnonymousClass0BJ;
import X.AnonymousClass0PN;
import X.AnonymousClass17Y;
import X.AnonymousClass3RM;
import X.AnonymousClass3Y5;
import X.AnonymousClass4SH;
import X.AnonymousClass5HO;
import X.AnonymousClass5TI;
import X.AnonymousClass5TJ;
import X.AnonymousClass6AX;
import X.C011004s;
import X.C011504z;
import X.C012005e;
import X.C111305c4;
import X.C111315c5;
import X.C111565cU;
import X.C1276168z;
import X.C128156Bc;
import X.C131506Pi;
import X.C138366hk;
import X.C162287oL;
import X.C164757sK;
import X.C164797sO;
import X.C16550pQ;
import X.C16720pz;
import X.C18740tg;
import X.C20810yC;
import X.C21060yb;
import X.C29341Wg;
import X.C29371Wj;
import X.C33041ec;
import X.C34081gQ;
import X.C36331k8;
import X.C36341k9;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C48762i0;
import X.C65123Qv;
import X.C79373tc;
import X.C90484aE;
import X.C90494aF;
import X.C90514aH;
import X.C90524aI;
import X.C99194so;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BulletSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;

public class UserNoticeBottomSheetDialogFragment extends Hilt_UserNoticeBottomSheetDialogFragment implements C16550pQ {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public NestedScrollView A04;
    public AnonymousClass17Y A05;
    public C21060yb A06;
    public C20810yC A07;
    public C33041ec A08;
    public C29371Wj A09;
    public C29341Wg A0A;
    public AnonymousClass5HO A0B;
    public Runnable A0C;
    public int A0D;
    public ValueAnimator A0E;
    public ImageView A0F;
    public LinearLayout A0G;
    public UserNoticeModalIconView A0H;
    public final AnonymousClass4SH A0I = new C79373tc(this);
    public final View.OnClickListener A0J = new C48762i0(this, 12);
    public final C16720pz A0K = new C138366hk(this);

    public static void A05(UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment) {
        int i = 0;
        boolean A1R = AnonymousClass000.A1R((((float) userNoticeBottomSheetDialogFragment.A04.getScrollY()) > (userNoticeBottomSheetDialogFragment.A03.getY() - ((float) userNoticeBottomSheetDialogFragment.A0D)) ? 1 : (((float) userNoticeBottomSheetDialogFragment.A04.getScrollY()) == (userNoticeBottomSheetDialogFragment.A03.getY() - ((float) userNoticeBottomSheetDialogFragment.A0D)) ? 0 : -1)));
        TextView textView = userNoticeBottomSheetDialogFragment.A03;
        int i2 = 0;
        if (A1R) {
            i2 = 4;
        }
        textView.setVisibility(i2);
        TextView textView2 = userNoticeBottomSheetDialogFragment.A02;
        if (!A1R) {
            i = 8;
        }
        textView2.setVisibility(i);
    }

    public static void A06(UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment, boolean z, boolean z2) {
        long j;
        ValueAnimator valueAnimator = userNoticeBottomSheetDialogFragment.A0E;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            userNoticeBottomSheetDialogFragment.A0E = valueAnimator2;
            C90494aF.A0q(valueAnimator2);
            C111565cU.A00(userNoticeBottomSheetDialogFragment.A0E, userNoticeBottomSheetDialogFragment, 34);
        } else {
            valueAnimator.cancel();
            userNoticeBottomSheetDialogFragment.A0E.removeAllListeners();
        }
        userNoticeBottomSheetDialogFragment.A0E.addListener(new C162287oL(4, userNoticeBottomSheetDialogFragment, z));
        float alpha = userNoticeBottomSheetDialogFragment.A01.getAlpha();
        float f = 0.0f;
        if (z) {
            f = 1.0f;
        }
        ValueAnimator valueAnimator3 = userNoticeBottomSheetDialogFragment.A0E;
        float[] A0v = C90524aI.A0v();
        C90484aE.A1O(A0v, alpha, f);
        valueAnimator3.setFloatValues(A0v);
        ValueAnimator valueAnimator4 = userNoticeBottomSheetDialogFragment.A0E;
        if (z2) {
            j = 400;
        } else {
            j = 0;
        }
        valueAnimator4.setDuration(j);
        userNoticeBottomSheetDialogFragment.A0E.start();
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C1276168z r5;
        AnonymousClass5TI r9;
        AnonymousClass5TJ r10;
        File A0S;
        File A0S2;
        Log.i("UserNoticeBottomSheetDialogFragment/onCreateView");
        Bundle A0b = A0b();
        String A17 = C36431kI.A17(A0b, "icon_light_url");
        String A172 = C36431kI.A17(A0b, "icon_dark_url");
        String A173 = C36431kI.A17(A0b, "icon_description");
        String A174 = C36431kI.A17(A0b, "title");
        int i = A0b.getInt("bullets_size", 0);
        ArrayList A14 = C36441kJ.A14(i);
        for (int i2 = 0; i2 < i; i2++) {
            String string = A0b.getString(AnonymousClass000.A0r("bullet_text_", AnonymousClass000.A0u(), i2));
            A14.add(new C128156Bc(string, A0b.getString(AnonymousClass000.A0r("bullet_icon_light_url_", C36421kH.A0f(string), i2)), A0b.getString(AnonymousClass000.A0r("bullet_icon_dark_url_", AnonymousClass000.A0u(), i2))));
        }
        String A175 = C36431kI.A17(A0b, "agree_button_text");
        long j = A0b.getLong("start_time_millis");
        C1276168z r4 = null;
        if (j != 0) {
            r5 = new C1276168z(j);
        } else {
            r5 = null;
        }
        AnonymousClass6AX r7 = new AnonymousClass6AX(A0b.getLongArray("duration_repeat"), A0b.getLong("duration_static", -1));
        long j2 = A0b.getLong("end_time_millis");
        if (j2 != 0) {
            r4 = new C1276168z(j2);
        }
        C131506Pi r8 = new C131506Pi(r7, r5, r4, "onDemand");
        String string2 = A0b.getString("body");
        String string3 = A0b.getString("footer");
        String string4 = A0b.getString("dismiss_button_text");
        String string5 = A0b.getString("icon_role");
        if (string5 != null) {
            r9 = C111305c4.A00(string5);
        } else {
            r9 = null;
        }
        String string6 = A0b.getString("icon_style");
        if (string6 != null) {
            r10 = C111315c5.A00(string6);
        } else {
            r10 = null;
        }
        AnonymousClass5HO r72 = new AnonymousClass5HO(r8, r9, r10, A17, A172, A173, A174, A175, string2, string3, string4, A14);
        String string7 = A0b.getString("light_icon_path");
        if (string7 == null) {
            A0S = null;
        } else {
            A0S = C90524aI.A0S(string7);
        }
        r72.A01 = A0S;
        String string8 = A0b.getString("dark_icon_path");
        if (string8 == null) {
            A0S2 = null;
        } else {
            A0S2 = C90524aI.A0S(string8);
        }
        r72.A00 = A0S2;
        this.A0B = r72;
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, true);
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new C164797sO(inflate, this, 3));
        this.A04 = (NestedScrollView) C012005e.A02(inflate, R.id.user_notice_modal_scrollview);
        this.A01 = C012005e.A02(inflate, R.id.user_notice_modal_scroll_decoration_group);
        C012005e.A02(inflate, R.id.user_notice_modal_scroll_button).setOnClickListener(this.A0J);
        this.A04.setNestedScrollingEnabled(false);
        NestedScrollView nestedScrollView = this.A04;
        nestedScrollView.A0A = this.A0K;
        C164757sK.A00(nestedScrollView.getViewTreeObserver(), this, 19);
        this.A00 = C012005e.A02(inflate, R.id.user_notice_modal_button_divider);
        ImageView A0G2 = C36401kF.A0G(inflate, R.id.user_notice_modal_default_icon);
        this.A0F = A0G2;
        A0G2.setContentDescription(this.A0B.A04);
        UserNoticeModalIconView userNoticeModalIconView = (UserNoticeModalIconView) C012005e.A02(inflate, R.id.user_notice_modal_server_icon);
        this.A0H = userNoticeModalIconView;
        userNoticeModalIconView.A00 = this.A0F;
        userNoticeModalIconView.A04(this.A0B);
        TextEmojiLabel A0O = C36401kF.A0O(inflate, R.id.user_notice_modal_body);
        C36391kE.A1J(A0O);
        A03(A0O, this.A0B.A02);
        A03(C36401kF.A0O(inflate, R.id.user_notice_modal_footer), this.A0B.A04);
        TextView A0O2 = C36391kE.A0O(inflate, R.id.user_notice_modal_title);
        this.A03 = A0O2;
        A0O2.setText(this.A0B.A07);
        C012005e.A0a(this.A03, true);
        this.A02 = C36391kE.A0O(inflate, R.id.user_notice_modal_sticky_title);
        int dimensionPixelSize = C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        int dimensionPixelSize2 = C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A0D = dimensionPixelSize2;
        this.A02.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        this.A02.setMaxLines(5);
        this.A02.setEllipsize(TextUtils.TruncateAt.END);
        if (!A1o()) {
            C011504z.A04(C36381kD.A0H(A0a(), R.drawable.bottom_sheet_background), this.A02);
        }
        this.A02.setText(this.A0B.A07);
        C011004s.A05(this.A02, C36341k9.A0G(this).getDimension(R.dimen.f7nameremoved));
        C012005e.A0a(this.A02, true);
        LinearLayout A0U = C90514aH.A0U(inflate, R.id.user_notice_modal_bullets);
        this.A0G = A0U;
        LayoutInflater from = LayoutInflater.from(A0a());
        int dimensionPixelSize3 = C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        for (int i3 = 0; i3 < this.A0B.A08.size(); i3++) {
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) from.inflate(R.layout.f9nameremoved, A0U, false);
            textEmojiLabel.setTag(Integer.valueOf(i3));
            A0U.addView(textEmojiLabel);
            C36331k8.A10(textEmojiLabel, this.A07);
            C36331k8.A16(textEmojiLabel, this.A06);
            SpannableString A002 = AnonymousClass3RM.A00(A0a(), this.A0I, ((C128156Bc) this.A0B.A08.get(i3)).A02);
            SpannableString A0O3 = C36441kJ.A0O(A002.toString());
            A0O3.setSpan(new BulletSpan(dimensionPixelSize3), 0, A002.length(), 17);
            for (Object obj : A002.getSpans(0, A002.length(), Object.class)) {
                A0O3.setSpan(obj, A002.getSpanStart(obj), A002.getSpanEnd(obj), 17);
            }
            textEmojiLabel.setText(A0O3);
        }
        TextView A0O4 = C36391kE.A0O(inflate, R.id.user_notice_modal_agree_button);
        A0O4.setText(this.A0B.A01);
        AnonymousClass3Y5.A00(A0O4, this, 16);
        TextView A0O5 = C36391kE.A0O(inflate, R.id.user_notice_modal_dismiss_button);
        if (C36421kH.A1a(this.A0B.A03)) {
            A0O5.setText(this.A0B.A03);
            AnonymousClass3Y5.A00(A0O5, this, 17);
        } else {
            A0O5.setVisibility(8);
            AnonymousClass0BJ r0 = (AnonymousClass0BJ) A0O4.getLayoutParams();
            r0.A0U = 0;
            A0O4.setLayoutParams(r0);
        }
        A1g(C36421kH.A1a(this.A0B.A03));
        C29371Wj r2 = this.A09;
        int i4 = 7;
        if (C36421kH.A1a(this.A0B.A03)) {
            i4 = 3;
        }
        C29371Wj.A01(r2, Integer.valueOf(i4));
        return inflate;
    }

    private void A03(TextEmojiLabel textEmojiLabel, String str) {
        if (TextUtils.isEmpty(str)) {
            textEmojiLabel.setVisibility(8);
            return;
        }
        C36331k8.A10(textEmojiLabel, this.A07);
        C36331k8.A16(textEmojiLabel, this.A06);
        Context A0a = A0a();
        C18740tg.A06(str);
        textEmojiLabel.setText(AnonymousClass3RM.A00(A0a, this.A0I, str));
    }

    public void A1J() {
        super.A1J();
        this.A04.A0A = null;
    }

    public void A1n(View view) {
        super.A1n(view);
        BottomSheetBehavior A022 = BottomSheetBehavior.A02(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = C36411kG.A00() - C65123Qv.A02(view.getContext(), C21060yb.A01(A0a()));
        view.setLayoutParams(layoutParams);
        A022.A0a(new C99194so(A022, this));
        A022.A0W(3);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A1n(AnonymousClass0PN.A00(A1Z(), R.id.design_bottom_sheet));
        int dimensionPixelSize = C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        C34081gQ.A05(this.A0F, dimensionPixelSize, dimensionPixelSize);
        int dimensionPixelSize2 = C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        C34081gQ.A05(this.A0H, dimensionPixelSize2, dimensionPixelSize2);
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(this.A0G);
        int dimensionPixelSize3 = C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        A0a.leftMargin = dimensionPixelSize3;
        A0a.rightMargin = dimensionPixelSize3;
        this.A0G.setLayoutParams(A0a);
        int dimensionPixelSize4 = C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        NestedScrollView nestedScrollView = this.A04;
        nestedScrollView.setPadding(dimensionPixelSize4, nestedScrollView.getPaddingTop(), dimensionPixelSize4, this.A04.getPaddingBottom());
        TextView textView = this.A02;
        textView.setPadding(dimensionPixelSize4, textView.getPaddingTop(), dimensionPixelSize4, this.A02.getPaddingBottom());
        C164757sK.A00(this.A04.getViewTreeObserver(), this, 19);
    }
}
