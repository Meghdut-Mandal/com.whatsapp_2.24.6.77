package com.whatsapp.conversationslist;

import X.AnonymousClass155;
import X.AnonymousClass1DH;
import X.AnonymousClass3UF;
import X.AnonymousClass4XY;
import X.C03570Gk;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36441kJ;
import X.C66963Xz;
import X.C89334Wd;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.components.WaSwitchView;

public class ArchiveNotificationSettingActivity extends AnonymousClass155 {
    public AnonymousClass1DH A00;
    public boolean A01;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = (AnonymousClass1DH) A0B.A0K.get();
        }
    }

    public ArchiveNotificationSettingActivity(int i) {
        this.A01 = false;
        C89334Wd.A00(this, 6);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean A1W = C36381kD.A1W(this);
        setContentView((int) R.layout.f9nameremoved);
        setTitle(R.string.f12nameremoved);
        Toolbar A0N = C36361kB.A0N(this);
        AnonymousClass3UF.A0C(this, A0N, this.A00);
        A0N.setTitle((CharSequence) getString(R.string.f12nameremoved));
        A0N.setBackgroundResource(C36441kJ.A04(this));
        A0N.A0J(this, R.style.f13nameremoved);
        A0N.setNavigationOnClickListener(new C66963Xz(this, 38));
        setSupportActionBar(A0N);
        WaSwitchView waSwitchView = (WaSwitchView) C03570Gk.A0B(this, R.id.notify_new_message_switch_view);
        waSwitchView.setChecked(A1W ^ this.A09.A2G());
        waSwitchView.setOnCheckedChangeListener(new AnonymousClass4XY(this, 5));
        waSwitchView.setOnClickListener(new C66963Xz(waSwitchView, 36));
        WaSwitchView waSwitchView2 = (WaSwitchView) C03570Gk.A0B(this, R.id.auto_hide_switch_view);
        waSwitchView2.setChecked(C36371kC.A1U(C36331k8.A06(this), "auto_archive_inactive_chats"));
        waSwitchView2.setOnCheckedChangeListener(new AnonymousClass4XY(this, 6));
        waSwitchView2.setOnClickListener(new C66963Xz(waSwitchView2, 37));
        waSwitchView2.setVisibility(8);
    }

    public ArchiveNotificationSettingActivity() {
        this(0);
    }
}
