package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass04H;
import X.AnonymousClass147;
import X.AnonymousClass1H2;
import X.AnonymousClass1Pp;
import X.AnonymousClass1RY;
import X.C012005e;
import X.C16550pQ;
import X.C18820ts;
import X.C19770wU;
import X.C19890wg;
import X.C19970wo;
import X.C20810yC;
import X.C21060yb;
import X.C24801Dv;
import X.C26801Lo;
import X.C27731Pn;
import X.C27751Pr;
import X.C33511fU;
import X.C33751fs;
import X.C33771fu;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C40041ue;
import X.C48892iE;
import X.C53822rw;
import X.C58162zQ;
import X.C65533Sl;
import X.C68193bU;
import X.C74113l5;
import X.C81093wS;
import X.C87144Nq;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;
import java.util.List;

public class JoinGroupBottomSheetFragment extends Hilt_JoinGroupBottomSheetFragment implements C16550pQ {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public ImageView A05;
    public ImageView A06;
    public ImageView A07;
    public ImageView A08;
    public ImageView A09;
    public ImageView A0A;
    public ProgressBar A0B;
    public ScrollView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public C24801Dv A0H;
    public C58162zQ A0I;
    public TextEmojiLabel A0J;
    public C33771fu A0K;
    public WaTextView A0L;
    public C87144Nq A0M;
    public C40041ue A0N;
    public C74113l5 A0O;
    public AnonymousClass1Pp A0P;
    public AnonymousClass1RY A0Q;
    public C27731Pn A0R;
    public C33751fs A0S;
    public C21060yb A0T;
    public C19970wo A0U;
    public C18820ts A0V;
    public C27751Pr A0W;
    public AnonymousClass1H2 A0X;
    public C20810yC A0Y;
    public C26801Lo A0Z;
    public AnonymousClass147 A0a;
    public C19890wg A0b;
    public ReadMoreTextView A0c;
    public C19770wU A0d;
    public WDSButton A0e;
    public WDSButton A0f;
    public List A0g;
    public FrameLayout A0h;
    public ImageButton A0i;
    public TextView A0j;

    public static JoinGroupBottomSheetFragment A05(AnonymousClass147 r5, UserJid userJid, String str, long j) {
        JoinGroupBottomSheetFragment joinGroupBottomSheetFragment = new JoinGroupBottomSheetFragment();
        Bundle A072 = AnonymousClass001.A07();
        A072.putInt("use_case", 7);
        A072.putInt("surface_type", 2);
        A072.putString("invite_link_code", str);
        A072.putString("arg_group_jid", r5.getRawString());
        A072.putString("group_admin_jid", userJid.getRawString());
        A072.putLong("personal_invite_code_expiration", j);
        A072.putBoolean("invite_from_referrer", true);
        joinGroupBottomSheetFragment.A17(A072);
        return joinGroupBottomSheetFragment;
    }

    public static JoinGroupBottomSheetFragment A06(String str, int i, boolean z) {
        JoinGroupBottomSheetFragment joinGroupBottomSheetFragment = new JoinGroupBottomSheetFragment();
        Bundle A072 = AnonymousClass001.A07();
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                i2 = 1;
            } else if (i != 3) {
                i2 = 9;
                if (i != 6) {
                    i2 = 0;
                }
            } else {
                i2 = 5;
            }
        }
        A072.putInt("use_case", i2);
        A072.putInt("surface_type", 1);
        A072.putString("invite_link_code", str);
        A072.putBoolean("invite_from_referrer", z);
        joinGroupBottomSheetFragment.A17(A072);
        return joinGroupBottomSheetFragment;
    }

    public static JoinGroupBottomSheetFragment A03(GroupJid groupJid, GroupJid groupJid2, int i, int i2) {
        JoinGroupBottomSheetFragment joinGroupBottomSheetFragment = new JoinGroupBottomSheetFragment();
        Bundle A072 = AnonymousClass001.A07();
        A072.putString("arg_parent_group_jid", groupJid.getRawString());
        A072.putString("arg_group_jid", groupJid2.getRawString());
        A072.putInt("surface_type", i);
        int i3 = 3;
        if (i2 != 3) {
            i3 = 4;
            if (i2 == 6) {
                i3 = 8;
            }
        }
        A072.putInt("use_case", i3);
        joinGroupBottomSheetFragment.A17(A072);
        return joinGroupBottomSheetFragment;
    }

    public static void A07(JoinGroupBottomSheetFragment joinGroupBottomSheetFragment, int i) {
        if (i > 0) {
            TextView textView = joinGroupBottomSheetFragment.A0j;
            Context context = textView.getContext();
            Object[] A0L2 = AnonymousClass001.A0L();
            boolean A1b = C36361kB.A1b(A0L2, i);
            C36341k9.A0s(context, textView, A0L2, R.string.f12nameremoved);
            joinGroupBottomSheetFragment.A0j.setVisibility(A1b ? 1 : 0);
            return;
        }
        joinGroupBottomSheetFragment.A0j.setVisibility(8);
    }

    public static void A08(JoinGroupBottomSheetFragment joinGroupBottomSheetFragment, boolean z) {
        joinGroupBottomSheetFragment.A0J.setVisibility(C36351kA.A00(z ? 1 : 0));
        FrameLayout frameLayout = joinGroupBottomSheetFragment.A0h;
        int paddingLeft = frameLayout.getPaddingLeft();
        int paddingTop = joinGroupBottomSheetFragment.A0h.getPaddingTop();
        int paddingRight = joinGroupBottomSheetFragment.A0h.getPaddingRight();
        Resources A0G2 = C36341k9.A0G(joinGroupBottomSheetFragment);
        int i = R.dimen.f7nameremoved;
        if (z) {
            i = R.dimen.f7nameremoved;
        }
        frameLayout.setPadding(paddingLeft, paddingTop, paddingRight, A0G2.getDimensionPixelOffset(i));
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0J2 = C36411kG.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved);
        this.A0C = (ScrollView) C012005e.A02(A0J2, R.id.join_group_bottom_sheet_content_scrollview);
        this.A0h = C36441kJ.A0T(A0J2, R.id.join_group_bottom_sheet_content_body);
        this.A02 = C012005e.A02(A0J2, R.id.join_group_bottom_sheet_join_button_container);
        this.A04 = C012005e.A02(A0J2, R.id.subgroup_info_container_loading);
        this.A03 = C012005e.A02(A0J2, R.id.subgroup_info_container_loaded);
        this.A00 = C012005e.A02(A0J2, R.id.subgroup_info_container_error);
        this.A0E = C36391kE.A0O(A0J2, R.id.subgroup_info_container_error_message);
        this.A0F = C36391kE.A0O(A0J2, R.id.join_group_bottom_sheet_retry_button);
        WaTextView A0Q2 = C36401kF.A0Q(A0J2, R.id.join_group_bottom_sheet_group_title);
        this.A0L = A0Q2;
        C33511fU.A03(A0Q2);
        this.A05 = C36401kF.A0G(A0J2, R.id.join_group_bottom_sheet_group_icon);
        this.A0G = C36391kE.A0O(A0J2, R.id.join_group_bottom_sheet_group_subtitle);
        this.A0D = C36391kE.A0O(A0J2, R.id.join_group_bottom_sheet_group_participant_count);
        this.A0c = (ReadMoreTextView) C012005e.A02(A0J2, R.id.join_group_bottom_sheet_description_text);
        this.A0J = C36401kF.A0O(A0J2, R.id.join_group_bottom_sheet_disclaimer);
        this.A0e = C36431kI.A0y(A0J2, R.id.join_group_bottom_sheet_join_button);
        this.A0B = (ProgressBar) C012005e.A02(A0J2, R.id.join_group_bottom_sheet_join_button_spinner);
        this.A0f = C36431kI.A0y(A0J2, R.id.join_group_bottom_sheet_view_group);
        this.A0i = (ImageButton) C012005e.A02(A0J2, R.id.join_group_bottom_sheet_close_button);
        this.A01 = C012005e.A02(A0J2, R.id.join_group_contact_preview);
        this.A06 = C36401kF.A0G(A0J2, R.id.join_group_contact_preview_icon_1);
        this.A07 = C36401kF.A0G(A0J2, R.id.join_group_contact_preview_icon_2);
        this.A08 = C36401kF.A0G(A0J2, R.id.join_group_contact_preview_icon_3);
        this.A09 = C36401kF.A0G(A0J2, R.id.join_group_contact_preview_icon_4);
        this.A0A = C36401kF.A0G(A0J2, R.id.join_group_contact_preview_icon_5);
        ArrayList A0I2 = AnonymousClass001.A0I();
        this.A0g = A0I2;
        A0I2.add(this.A06);
        A0I2.add(this.A07);
        A0I2.add(this.A08);
        A0I2.add(this.A09);
        this.A0g.add(this.A0A);
        this.A0j = C36391kE.A0O(A0J2, R.id.join_group_contact_count_view);
        return A0J2;
    }

    public void A1O(Context context) {
        super.A1O(context);
        if (context instanceof C87144Nq) {
            this.A0M = (C87144Nq) context;
        }
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        String string = A0b().getString("arg_parent_group_jid");
        C65533Sl r2 = AnonymousClass147.A01;
        this.A0a = r2.A06(string);
        C58162zQ r4 = this.A0I;
        int i = A0b().getInt("use_case");
        int i2 = A0b().getInt("surface_type");
        C40041ue r0 = (C40041ue) new AnonymousClass04H(new C68193bU(r4, this.A0a, r2.A06(A0b().getString("arg_group_jid")), C36391kE.A0h(A0b(), "group_admin_jid"), A0b().getString("invite_link_code"), i, i2, A0b().getLong("personal_invite_code_expiration", 0), A0b().getBoolean("invite_from_referrer")), this).A00(C40041ue.class);
        this.A0N = r0;
        C53822rw.A00(this, r0.A0d, 20);
        C53822rw.A00(this, this.A0N.A0E, 19);
        C53822rw.A00(this, this.A0N.A0F, 16);
        C53822rw.A00(this, this.A0N.A0D, 14);
        C53822rw.A00(this, this.A0N.A0e, 21);
        C53822rw.A00(this, this.A0N.A0G, 17);
        C53822rw.A00(this, this.A0N.A0C, 15);
        C40041ue r22 = this.A0N;
        C81093wS.A01(r22.A0f, r22, 10);
        this.A0Q = this.A0R.A05(A0a(), "join-group-bottom-sheet");
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        C53822rw.A00(this, this.A0c.A09, 18);
        C48892iE.A00(this.A0i, this, 49);
    }
}
