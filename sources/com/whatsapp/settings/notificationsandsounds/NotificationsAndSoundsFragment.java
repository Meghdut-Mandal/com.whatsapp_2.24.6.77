package com.whatsapp.settings.notificationsandsounds;

import X.AAG;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass11F;
import X.AnonymousClass190;
import X.AnonymousClass1CR;
import X.AnonymousClass4HD;
import X.AnonymousClass4HE;
import X.AnonymousClass4PX;
import X.AnonymousClass4XY;
import X.AnonymousClass97A;
import X.B8C;
import X.BAA;
import X.C000800j;
import X.C001400p;
import X.C009504a;
import X.C009904e;
import X.C019308f;
import X.C02800By;
import X.C100834vr;
import X.C12560iI;
import X.C152967Mn;
import X.C152977Mo;
import X.C152987Mp;
import X.C18740tg;
import X.C191639Dt;
import X.C19770wU;
import X.C20600xp;
import X.C207579vR;
import X.C222713q;
import X.C22452Amr;
import X.C22847Aww;
import X.C24381Cf;
import X.C24521Ct;
import X.C32641dx;
import X.C36331k8;
import X.C36441kJ;
import X.C81203wd;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.whatsapp.R;
import com.whatsapp.preference.WaMuteSettingPreference;
import com.whatsapp.preference.WaRingtonePreference;

public final class NotificationsAndSoundsFragment extends Hilt_NotificationsAndSoundsFragment {
    public C191639Dt A00;
    public AnonymousClass4PX A01;
    public C24381Cf A02;
    public AnonymousClass190 A03;
    public AnonymousClass11F A04;
    public C32641dx A05;
    public WaMuteSettingPreference A06;
    public WaMuteSettingPreference A07;
    public AnonymousClass1CR A08;
    public C19770wU A09;
    public final CompoundButton.OnCheckedChangeListener A0A = new AnonymousClass4XY(this, 23);
    public final CompoundButton.OnCheckedChangeListener A0B = new AnonymousClass4XY(this, 22);
    public final C22847Aww A0C = new B8C(this, 9);
    public final AnonymousClass00T A0D;
    public final C009904e A0E;
    public final C24521Ct A0F = new AAG(this);
    public final C207579vR A0G;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        C24381Cf r1 = this.A02;
        if (r1 != null) {
            r1.registerObserver(this.A0F);
            AnonymousClass00T r4 = this.A0D;
            NotificationsAndSoundsViewModel notificationsAndSoundsViewModel = (NotificationsAndSoundsViewModel) r4.getValue();
            BAA.A00(A0m(), notificationsAndSoundsViewModel.A03, new AnonymousClass97A(this, 8), 25);
            BAA.A00(A0m(), notificationsAndSoundsViewModel.A01, new AnonymousClass97A(this, 9), 22);
            BAA.A00(A0m(), notificationsAndSoundsViewModel.A02, new AnonymousClass97A(this, 10), 23);
            BAA.A00(A0m(), notificationsAndSoundsViewModel.A05, new C22452Amr(this), 24);
            NotificationsAndSoundsViewModel notificationsAndSoundsViewModel2 = (NotificationsAndSoundsViewModel) r4.getValue();
            AnonymousClass11F r3 = this.A04;
            notificationsAndSoundsViewModel2.A00 = r3;
            notificationsAndSoundsViewModel2.A06.Boy(new C81203wd(notificationsAndSoundsViewModel2, r3, 3));
            this.A02.setItemAnimator((C02800By) null);
            return;
        }
        throw C36331k8.A0d("conversationObservers");
    }

    public static final void A00(NotificationsAndSoundsFragment notificationsAndSoundsFragment, String str, String str2) {
        WaRingtonePreference waRingtonePreference;
        if ((AnonymousClass00C.A0J(str2, "jid_message_tone") || AnonymousClass00C.A0J(str2, "jid_call_ringtone")) && str != null && (waRingtonePreference = (WaRingtonePreference) notificationsAndSoundsFragment.B7M(str2)) != null) {
            waRingtonePreference.A01 = str;
            waRingtonePreference.A0H(C20600xp.A06(notificationsAndSoundsFragment.A00, str));
        }
    }

    public static final void A03(NotificationsAndSoundsFragment notificationsAndSoundsFragment, String str, String str2) {
        ListPreference listPreference;
        String str3;
        CharSequence charSequence;
        if ((AnonymousClass00C.A0J(str2, "jid_message_vibration") || AnonymousClass00C.A0J(str2, "jid_call_vibration")) && str != null && (listPreference = (ListPreference) notificationsAndSoundsFragment.B7M(str2)) != null) {
            listPreference.A0T(str);
            CharSequence[] charSequenceArr = listPreference.A01;
            if (charSequenceArr == null || (charSequence = charSequenceArr[Integer.parseInt(str)]) == null) {
                str3 = null;
            } else {
                str3 = charSequence.toString();
            }
            listPreference.A0H(str3);
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
        this.A04 = A022;
        String string = A0i().getString(R.string.f12nameremoved);
        C100834vr r0 = this.A00;
        if (r0 != null) {
            r0.setTitle(string);
        }
        A1b(R.xml.f14nameremoved);
    }

    public boolean BdI(Preference preference) {
        if (!AnonymousClass00C.A0J(preference.A0J, "jid_message_tone") && !AnonymousClass00C.A0J(preference.A0J, "jid_call_ringtone")) {
            return super.BdI(preference);
        }
        this.A0G.A00 = preference.A0J;
        this.A0E.A02(((WaRingtonePreference) preference).A0S());
        return true;
    }

    public NotificationsAndSoundsFragment() {
        AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, new C152977Mo(new C152967Mn(this)));
        C019308f A1A = C36441kJ.A1A(NotificationsAndSoundsViewModel.class);
        this.A0D = new C12560iI(new C152987Mp(A002), new AnonymousClass4HE(this, A002), new AnonymousClass4HD(A002), A1A);
        C207579vR r1 = new C207579vR(this);
        this.A0G = r1;
        this.A0E = BnD(r1, new C009504a());
    }

    public void A1J() {
        super.A1J();
        C24381Cf r1 = this.A02;
        if (r1 != null) {
            r1.unregisterObserver(this.A0F);
            return;
        }
        throw C36331k8.A0d("conversationObservers");
    }
}
