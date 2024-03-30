package com.whatsapp.group;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass040;
import X.AnonymousClass0A2;
import X.AnonymousClass147;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass3Y2;
import X.AnonymousClass4C0;
import X.AnonymousClass4GQ;
import X.C000800j;
import X.C001400p;
import X.C008903u;
import X.C023109s;
import X.C023509x;
import X.C05250Oz;
import X.C109325Xd;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C20380xT;
import X.C32681e1;
import X.C33311f5;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36421kH;
import X.C36431kI;
import X.C55712v4;
import X.C89334Wd;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ViewGroup;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.toggle.WDSSwitch;

public final class HistorySettingActivity extends AnonymousClass155 {
    public SwitchCompat A00;
    public AnonymousClass16D A01;
    public C20380xT A02;
    public C32681e1 A03;
    public boolean A04 = false;
    public final AnonymousClass00T A05;
    public final AnonymousClass00T A06;

    public void onDestroy() {
        this.A00 = null;
        super.onDestroy();
    }

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = C36341k9.A0R(A0B);
            this.A02 = C36331k8.A0I(A0B);
            this.A03 = C36351kA.A0p(r1);
        }
    }

    public HistorySettingActivity() {
        super(R.layout.f9nameremoved);
        C89334Wd.A00(this, 40);
        this.A05 = C001400p.A00(C000800j.PUBLICATION, new AnonymousClass4GQ(this));
        this.A06 = C36431kI.A1I(new AnonymousClass4C0(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C18820ts r1 = this.A00;
        AnonymousClass00C.A07(r1);
        C55712v4.A00(this, (Toolbar) C36361kB.A0H(this, R.id.toolbar), r1, C36361kB.A0m(this, R.string.f12nameremoved));
        getWindow().setNavigationBarColor(C36351kA.A02(this.A00.getContext(), this.A00.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        C36391kE.A0Q(this, R.id.title).setText(R.string.f12nameremoved);
        TextEmojiLabel A0I = C36421kH.A0I(this, R.id.shared_time_text);
        C32681e1 r5 = this.A03;
        if (r5 != null) {
            Context context = A0I.getContext();
            Object[] A0L = AnonymousClass001.A0L();
            C20380xT r12 = this.A02;
            if (r12 != null) {
                A0I.setText(r5.A00(context, C36391kE.A0v(this, r12.A02("330159992681779").toString(), A0L, 0, R.string.f12nameremoved)));
                C36331k8.A10(A0I, A0I.getAbProps());
                C36331k8.A16(A0I, this.A08);
                ViewGroup A0E = C36421kH.A0E(this, R.id.switch_layout);
                Property property = SwitchCompat.A0b;
                WDSSwitch wDSSwitch = new WDSSwitch(C36371kC.A0B(this.A00), (AttributeSet) null, 0, 6, (C05250Oz) null);
                wDSSwitch.setId(R.id.history_settings_switch);
                this.A00 = wDSSwitch;
                A0E.addView(wDSSwitch);
                HistorySettingViewModel historySettingViewModel = (HistorySettingViewModel) this.A06.getValue();
                AnonymousClass147 A0k = C36431kI.A0k(this.A05);
                AnonymousClass00C.A0D(A0k, 0);
                historySettingViewModel.A01 = A0k;
                AnonymousClass040 A002 = C109325Xd.A00(historySettingViewModel);
                HistorySettingViewModel$updateChecked$1 historySettingViewModel$updateChecked$1 = new HistorySettingViewModel$updateChecked$1(historySettingViewModel, (C023509x) null);
                C008903u r3 = C008903u.A00;
                Integer num = C023109s.A00;
                AnonymousClass0A2.A02(num, r3, historySettingViewModel$updateChecked$1, A002);
                C36331k8.A1T(new HistorySettingViewModel$updateEnabled$1(historySettingViewModel, (C023509x) null), C109325Xd.A00(historySettingViewModel));
                AnonymousClass0A2.A02(num, r3, new HistorySettingActivity$bindSwitch$1(this, (C023509x) null), C33311f5.A00(this));
                SwitchCompat switchCompat = this.A00;
                if (switchCompat != null) {
                    AnonymousClass3Y2.A00(switchCompat, this, 37);
                }
                AnonymousClass0A2.A02(num, r3, new HistorySettingActivity$bindError$1(this, (C023509x) null), C33311f5.A00(this));
                return;
            }
            throw C36331k8.A0d("faqLinkFactory");
        }
        throw C36331k8.A0b();
    }
}
