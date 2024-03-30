package com.whatsapp.settings.notificationsandsounds;

import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass11F;
import X.AnonymousClass17Y;
import X.AnonymousClass1CR;
import X.AnonymousClass1RC;
import X.AnonymousClass3LI;
import X.B8C;
import X.C100834vr;
import X.C165597tg;
import X.C18740tg;
import X.C18820ts;
import X.C19770wU;
import X.C222713q;
import X.C36321k7;
import X.C36331k8;
import X.C81173wa;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.preference.ListPreference;
import androidx.preference.PreferenceGroup;
import androidx.preference.TwoStatePreference;
import com.whatsapp.R;
import com.whatsapp.settings.SettingsNotifications;

public final class AdvancedNotificationSettingsFragment extends Hilt_AdvancedNotificationSettingsFragment {
    public AnonymousClass17Y A00;
    public C18820ts A01;
    public AnonymousClass11F A02;
    public AnonymousClass3LI A03;
    public AnonymousClass1CR A04;
    public C19770wU A05;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        C19770wU r1 = this.A05;
        if (r1 != null) {
            r1.Boy(new C81173wa((Object) this, 0));
            return;
        }
        throw C36331k8.A0d("waWorkers");
    }

    public static final void A00(AdvancedNotificationSettingsFragment advancedNotificationSettingsFragment) {
        boolean z;
        String str;
        String str2;
        ListPreference listPreference = (ListPreference) advancedNotificationSettingsFragment.B7M("jid_message_popup");
        if (listPreference != null) {
            listPreference.A0N(true);
            if (Build.VERSION.SDK_INT >= 23) {
                int A002 = AnonymousClass1RC.A00(listPreference.A05, R.attr.f4nameremoved, R.color.f6nameremoved);
                PreferenceGroup preferenceGroup = (PreferenceGroup) advancedNotificationSettingsFragment.B7M("notification");
                if (preferenceGroup != null) {
                    PreferenceGroup.A00(listPreference, preferenceGroup);
                    preferenceGroup.A06();
                }
                AdvancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1 advancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1 = new AdvancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1(advancedNotificationSettingsFragment.A00, advancedNotificationSettingsFragment, A002);
                C165597tg.A15(listPreference, advancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1);
                boolean z2 = listPreference.A0P;
                if (advancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1.A0P != z2) {
                    advancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1.A0P = z2;
                    advancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1.A05();
                }
                if (preferenceGroup != null) {
                    preferenceGroup.A0U(advancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1);
                }
                advancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1.A0T(listPreference.A00);
                advancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1.A0H(advancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1.A05.getString(R.string.f12nameremoved));
            } else {
                AnonymousClass3LI r0 = advancedNotificationSettingsFragment.A03;
                if (r0 != null) {
                    str2 = r0.A06();
                } else {
                    str2 = null;
                }
                C165597tg.A16(listPreference, str2);
                B8C.A01(listPreference, advancedNotificationSettingsFragment, 8);
            }
        }
        ListPreference listPreference2 = (ListPreference) advancedNotificationSettingsFragment.B7M("jid_message_light");
        if (listPreference2 != null) {
            C18820ts r1 = advancedNotificationSettingsFragment.A01;
            if (r1 != null) {
                listPreference2.A0U(r1.A0Q(SettingsNotifications.A0r));
                AnonymousClass3LI r02 = advancedNotificationSettingsFragment.A03;
                if (r02 != null) {
                    str = r02.A05();
                } else {
                    str = null;
                }
                C165597tg.A16(listPreference2, str);
                B8C.A01(listPreference2, advancedNotificationSettingsFragment, 6);
            } else {
                throw C36321k7.A09();
            }
        }
        TwoStatePreference twoStatePreference = (TwoStatePreference) advancedNotificationSettingsFragment.B7M("jid_use_high_priority_notifications");
        if (twoStatePreference != null) {
            AnonymousClass3LI r03 = advancedNotificationSettingsFragment.A03;
            if (r03 != null) {
                z = r03.A0C();
            } else {
                z = false;
            }
            twoStatePreference.A0T(z);
            B8C.A01(twoStatePreference, advancedNotificationSettingsFragment, 7);
        }
    }

    public void A1Y(String str, Bundle bundle) {
        String str2;
        Intent intent;
        C222713q r2 = AnonymousClass11F.A00;
        AnonymousClass01I A0h = A0h();
        if (A0h == null || (intent = A0h.getIntent()) == null) {
            str2 = null;
        } else {
            str2 = intent.getStringExtra("jid");
        }
        AnonymousClass11F A022 = r2.A02(str2);
        C18740tg.A06(A022);
        this.A02 = A022;
        String string = A0i().getString(R.string.f12nameremoved);
        C100834vr r0 = this.A00;
        if (r0 != null) {
            r0.setTitle(string);
        }
        A1b(R.xml.f14nameremoved);
    }

    public final AnonymousClass1CR A1c() {
        AnonymousClass1CR r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("chatSettingsStore");
    }
}
