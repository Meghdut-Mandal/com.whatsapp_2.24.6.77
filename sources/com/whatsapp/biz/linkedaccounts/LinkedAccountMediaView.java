package com.whatsapp.biz.linkedaccounts;

import X.AnonymousClass001;
import X.AnonymousClass01z;
import X.AnonymousClass02E;
import X.AnonymousClass09Y;
import X.AnonymousClass155;
import X.AnonymousClass15L;
import X.AnonymousClass3CG;
import X.AnonymousClass3U9;
import X.C18800tq;
import X.C18830tt;
import X.C206949uI;
import X.C36321k7;
import X.C36331k8;
import X.C36431kI;
import X.C89314Wb;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import java.util.ArrayList;

public class LinkedAccountMediaView extends AnonymousClass155 implements AnonymousClass15L {
    public boolean A00;

    public void BVx() {
    }

    public void Bao() {
    }

    public void Bim() {
    }

    public boolean Bta() {
        return true;
    }

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
        }
    }

    public LinkedAccountMediaView(int i) {
        this.A00 = false;
        C89314Wb.A00(this, 23);
    }

    public static void A01(Context context, View view, C206949uI r5, UserJid userJid, String str, ArrayList arrayList, int i, int i2, int i3, boolean z) {
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(context.getPackageName(), "com.whatsapp.biz.linkedaccounts.LinkedAccountMediaView");
        A0D.putExtra("extra_business_jid", userJid);
        A0D.putExtra("extra_target_post_index", i);
        A0D.putExtra("extra_account_type", i2);
        A0D.putExtra("extra_is_v2_5_enabled", z);
        A0D.putParcelableArrayListExtra("extra_post_list", arrayList);
        A0D.putExtra("extra_common_fields_for_analytics", r5);
        A0D.putExtra("extra_entry_point", i3);
        AnonymousClass3U9.A09(context, A0D, view, new AnonymousClass3CG(context), str);
    }

    public void Ban() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        MediaViewBaseFragment.A03(this);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            setContentView((int) R.layout.f9nameremoved);
            AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
            AnonymousClass02E A0N = supportFragmentManager.A0N("linked_account_media_view_fragment");
            if (A0N == null) {
                A0N = new LinkedAccountMediaViewFragment();
            }
            Bundle A07 = AnonymousClass001.A07();
            A07.putParcelable("extra_business_jid", intent.getParcelableExtra("extra_business_jid"));
            A07.putParcelableArrayList("extra_post_list", intent.getParcelableArrayListExtra("extra_post_list"));
            A07.putInt("extra_account_type", intent.getIntExtra("extra_account_type", 0));
            A07.putInt("extra_target_post_index", intent.getIntExtra("extra_target_post_index", 0));
            A07.putBoolean("extra_is_v2_5_enabled", intent.getBooleanExtra("extra_is_v2_5_enabled", false));
            A07.putBundle("animation_bundle", intent.getBundleExtra("animation_bundle"));
            A07.putParcelable("extra_common_fields_for_analytics", intent.getParcelableExtra("extra_common_fields_for_analytics"));
            A07.putInt("extra_entry_point", intent.getIntExtra("extra_entry_point", 0));
            A0N.A17(A07);
            AnonymousClass09Y r1 = new AnonymousClass09Y(supportFragmentManager);
            r1.A0F(A0N, "linked_account_media_view_fragment", R.id.media_view_fragment_container);
            r1.A01();
        }
    }

    public LinkedAccountMediaView() {
        this(0);
    }
}
