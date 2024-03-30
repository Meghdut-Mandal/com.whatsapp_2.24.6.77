package com.whatsapp.settings;

import X.AnonymousClass11F;
import X.AnonymousClass143;
import X.AnonymousClass16D;
import X.AnonymousClass1CR;
import X.AnonymousClass1H2;
import X.AnonymousClass1RC;
import X.AnonymousClass3LI;
import X.B86;
import X.B8C;
import X.C100834vr;
import X.C165597tg;
import X.C167817yy;
import X.C18740tg;
import X.C18820ts;
import X.C20380xT;
import X.C20600xp;
import X.C22847Aww;
import X.C24801Dv;
import X.C29411Wn;
import X.C36331k8;
import X.C36361kB;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.TwoStatePreference;
import com.whatsapp.R;
import com.whatsapp.preference.WaRingtonePreference;
import com.whatsapp.util.Log;

public class SettingsJidNotificationFragment extends Hilt_SettingsJidNotificationFragment {
    public C24801Dv A00;
    public C29411Wn A01;
    public AnonymousClass16D A02;
    public C18820ts A03;
    public AnonymousClass1H2 A04;
    public AnonymousClass11F A05;
    public AnonymousClass1CR A06;
    public C20380xT A07;

    private void A00() {
        AnonymousClass3LI A0d = C36361kB.A0d(this.A05, this.A06);
        A1b(R.xml.f14nameremoved);
        WaRingtonePreference waRingtonePreference = (WaRingtonePreference) B7M("jid_message_tone");
        String A072 = A0d.A07();
        waRingtonePreference.A00 = 7;
        waRingtonePreference.A02 = true;
        waRingtonePreference.A03 = true;
        waRingtonePreference.A01 = A072;
        waRingtonePreference.A0H(C20600xp.A06(this.A00, A072));
        waRingtonePreference.A0A = new B86(waRingtonePreference, this, 0);
        ListPreference listPreference = (ListPreference) B7M("jid_message_vibrate");
        C165597tg.A16(listPreference, A0d.A08());
        B8C.A01(listPreference, this, 0);
        ListPreference listPreference2 = (ListPreference) B7M("jid_message_popup");
        if (Build.VERSION.SDK_INT >= 29) {
            int A002 = AnonymousClass1RC.A00(this.A00, R.attr.f4nameremoved, R.color.f6nameremoved);
            PreferenceGroup preferenceGroup = (PreferenceGroup) B7M("notification");
            PreferenceGroup.A00(listPreference2, preferenceGroup);
            preferenceGroup.A06();
            C167817yy r2 = new C167817yy(this.A00, this, A002);
            C165597tg.A15(listPreference2, r2);
            boolean z = listPreference2.A0P;
            if (r2.A0P != z) {
                r2.A0P = z;
                r2.A05();
            }
            preferenceGroup.A0U(r2);
            r2.A0T(listPreference2.A00);
            r2.A0H(r2.A05.getString(R.string.f12nameremoved));
        } else {
            C165597tg.A16(listPreference2, A0d.A06());
            B8C.A01(listPreference2, this, 1);
        }
        ListPreference listPreference3 = (ListPreference) B7M("jid_message_light");
        listPreference3.A0U(this.A03.A0Q(SettingsNotifications.A0r));
        C165597tg.A16(listPreference3, A0d.A05());
        B8C.A01(listPreference3, this, 2);
        TwoStatePreference twoStatePreference = (TwoStatePreference) B7M("jid_use_high_priority_notifications");
        twoStatePreference.A0T(!A0d.A0C());
        B8C.A01(twoStatePreference, this, 3);
        if (AnonymousClass143.A0G(this.A05)) {
            Preference B7M = B7M("jid_call");
            if (B7M != null) {
                PreferenceScreen preferenceScreen = this.A01.A06;
                PreferenceGroup.A00(B7M, preferenceScreen);
                preferenceScreen.A06();
            }
        } else {
            WaRingtonePreference waRingtonePreference2 = (WaRingtonePreference) B7M("jid_call_ringtone");
            String A032 = A0d.A03();
            waRingtonePreference2.A00 = 1;
            waRingtonePreference2.A02 = true;
            waRingtonePreference2.A03 = true;
            waRingtonePreference2.A01 = A032;
            waRingtonePreference2.A0H(C20600xp.A06(this.A00, A032));
            waRingtonePreference2.A0A = new B86(waRingtonePreference2, this, 1);
            ListPreference listPreference4 = (ListPreference) B7M("jid_call_vibrate");
            C165597tg.A16(listPreference4, A0d.A04());
            B8C.A01(listPreference4, this, 4);
        }
        TwoStatePreference twoStatePreference2 = (TwoStatePreference) B7M("jid_use_custom");
        twoStatePreference2.A0T(A0d.A0L);
        B8C.A01(twoStatePreference2, this, 5);
        A03(this);
    }

    public static void A03(SettingsJidNotificationFragment settingsJidNotificationFragment) {
        boolean z = C36361kB.A0d(settingsJidNotificationFragment.A05, settingsJidNotificationFragment.A06).A0L;
        settingsJidNotificationFragment.B7M("jid_message_tone").A0M(z);
        settingsJidNotificationFragment.B7M("jid_message_vibrate").A0M(z);
        settingsJidNotificationFragment.B7M("jid_message_popup").A0M(z);
        settingsJidNotificationFragment.B7M("jid_message_light").A0M(z);
        settingsJidNotificationFragment.B7M("jid_use_high_priority_notifications").A0M(z);
        if (!AnonymousClass143.A0G(settingsJidNotificationFragment.A05)) {
            settingsJidNotificationFragment.B7M("jid_call_ringtone").A0M(z);
            settingsJidNotificationFragment.B7M("jid_call_vibrate").A0M(z);
        }
    }

    public void A1N(int i, int i2, Intent intent) {
        Object obj = "";
        if (i == 1) {
            if (intent != null) {
                Object parcelableExtra = intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                Preference B7M = B7M("jid_message_tone");
                C22847Aww aww = B7M.A0A;
                if (parcelableExtra != null) {
                    obj = parcelableExtra;
                }
                aww.BdG(B7M, obj);
                return;
            }
        } else if (i == 2 && intent != null) {
            Object parcelableExtra2 = intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            Preference B7M2 = B7M("jid_call_ringtone");
            C22847Aww aww2 = B7M2.A0A;
            if (parcelableExtra2 != null) {
                obj = parcelableExtra2;
            }
            aww2.BdG(B7M2, obj);
            return;
        }
        super.A1N(i, i2, intent);
    }

    public boolean BdI(Preference preference) {
        String str = preference.A0J;
        if (str.equals("jid_message_tone")) {
            startActivityForResult(((WaRingtonePreference) preference).A0S(), 1);
            return true;
        } else if (!str.equals("jid_call_ringtone")) {
            return super.BdI(preference);
        } else {
            startActivityForResult(((WaRingtonePreference) preference).A0S(), 2);
            return true;
        }
    }

    public void A1M() {
        super.A1M();
        if (AnonymousClass1CR.A0C(this.A06, this.A05.getRawString())) {
            Log.i("settings-jid-notifications/onStart settings-store updated, refreshing ui");
            this.A01.A06.A0T();
            A00();
        }
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        A10(true);
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        menu.add(0, R.id.menuitem_reset_notification_settings, 0, R.string.f12nameremoved).setShowAsAction(0);
    }

    public boolean A1X(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_reset_notification_settings) {
            return false;
        }
        AnonymousClass1CR r3 = this.A06;
        AnonymousClass3LI A0d = C36361kB.A0d(this.A05, r3);
        AnonymousClass3LI A022 = A0d.A02();
        A0d.A0D = A022.A07();
        A0d.A0E = A022.A08();
        A0d.A0C = A022.A06();
        A0d.A0B = A022.A05();
        A0d.A09 = A022.A03();
        A0d.A0A = A022.A04();
        A0d.A0L = false;
        A0d.A0G = false;
        AnonymousClass1CR.A06(A0d, r3);
        this.A01.A06.A0T();
        A00();
        return true;
    }

    public void A1Y(String str, Bundle bundle) {
        AnonymousClass11F A0F = C36331k8.A0F(A0h());
        C18740tg.A06(A0F);
        this.A05 = A0F;
        String string = A0i().getString(R.string.f12nameremoved);
        C100834vr r0 = this.A00;
        if (r0 != null) {
            r0.setTitle(string);
        }
        A00();
    }
}
