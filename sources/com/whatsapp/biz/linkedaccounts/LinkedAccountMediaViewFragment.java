package com.whatsapp.biz.linkedaccounts;

import X.AnonymousClass000;
import X.AnonymousClass16D;
import X.AnonymousClass185;
import X.AnonymousClass3L0;
import X.AnonymousClass3NM;
import X.AnonymousClass3UY;
import X.AnonymousClass3XV;
import X.C012005e;
import X.C18740tg;
import X.C18820ts;
import X.C196169Xz;
import X.C19970wo;
import X.C201549jr;
import X.C206949uI;
import X.C20810yC;
import X.C20830yE;
import X.C24801Dv;
import X.C36361kB;
import X.C68253bb;
import X.C75703nf;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

public class LinkedAccountMediaViewFragment extends Hilt_LinkedAccountMediaViewFragment {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C24801Dv A04;
    public AnonymousClass3NM A05;
    public C201549jr A06;
    public C206949uI A07;
    public AnonymousClass16D A08;
    public AnonymousClass185 A09;
    public C19970wo A0A;
    public C20830yE A0B;
    public C18820ts A0C;
    public C20810yC A0D;
    public UserJid A0E;
    public C196169Xz A0F;
    public List A0G;
    public boolean A0H = false;
    public boolean A0I;

    public static void A00(LinkedAccountMediaViewFragment linkedAccountMediaViewFragment, long j) {
        String A0B2 = AnonymousClass3UY.A0B(linkedAccountMediaViewFragment.A0C, linkedAccountMediaViewFragment.A0A.A08(j));
        int i = linkedAccountMediaViewFragment.A00;
        int i2 = R.string.f12nameremoved;
        if (i == 0) {
            i2 = R.string.f12nameremoved;
        }
        StringBuilder A0v = AnonymousClass000.A0v(linkedAccountMediaViewFragment.A0n(i2));
        A0v.append(" ");
        A0v.append(8226);
        String A0p = AnonymousClass000.A0p(" ", A0B2, A0v);
        TextView textView = linkedAccountMediaViewFragment.A05;
        if (textView != null) {
            textView.setText(A0p);
        }
    }

    public void A1R(Bundle bundle) {
        bundle.putInt("extra_target_post_index", this.A08.getCurrentItem());
    }

    public void A1Q(Bundle bundle) {
        int i;
        super.A1Q(bundle);
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            Parcelable parcelable = bundle2.getParcelable("extra_business_jid");
            C18740tg.A06(parcelable);
            this.A0E = (UserJid) parcelable;
            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("extra_post_list");
            C18740tg.A06(parcelableArrayList);
            this.A0G = parcelableArrayList;
            this.A00 = bundle2.getInt("extra_account_type");
            this.A0I = bundle2.getBoolean("extra_is_v2_5_enabled", false);
            if (bundle != null) {
                i = bundle.getInt("extra_target_post_index", 0);
            } else {
                i = bundle2.getInt("extra_target_post_index", 0);
            }
            this.A03 = i;
            this.A01 = i;
            this.A07 = (C206949uI) bundle2.getParcelable("extra_common_fields_for_analytics");
            this.A02 = bundle2.getInt("extra_entry_point");
            A1m(new C75703nf(this));
            this.A08.A0J(this.A03, false);
            this.A08.A0K(new C68253bb(this));
            this.A08.setScrollEnabled(this.A0I);
            if (this.A02 == 1) {
                A10(true);
            }
        }
    }

    public void A1S(Bundle bundle, View view) {
        Bundle bundle2;
        super.A1S(bundle, view);
        if (bundle == null && (bundle2 = this.A00) != null) {
            this.A0D = true;
            this.A0A.A0D(bundle2, this);
        }
        this.A01.setVisibility(8);
        C012005e.A02(view, R.id.title_holder).setClickable(false);
        AnonymousClass3L0 A022 = this.A09.A02(this.A0E);
        if (A022 != null) {
            String str = A022.A08;
            TextEmojiLabel textEmojiLabel = this.A06;
            if (textEmojiLabel != null) {
                textEmojiLabel.setText(str);
            }
        }
        A00(this, ((AnonymousClass3XV) this.A0G.get(this.A03)).A00);
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        menu.add(0, 1, 0, R.string.f12nameremoved);
    }

    public boolean A1X(MenuItem menuItem) {
        if (menuItem.getItemId() != 1) {
            return false;
        }
        Uri parse = Uri.parse("https://help.instagram.com/contact/383679321740945");
        String str = ((AnonymousClass3XV) this.A0G.get(this.A01)).A03;
        if (!TextUtils.isEmpty(str)) {
            parse = Uri.parse(str);
        }
        if (A1D() != null) {
            C36361kB.A0y(A1D(), parse, this.A04);
        }
        return true;
    }
}
