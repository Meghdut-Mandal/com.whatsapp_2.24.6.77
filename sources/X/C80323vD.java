package X;

import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.registration.ChangeNumberOverview;
import com.whatsapp.settings.SettingsChatHistoryFragment;
import com.whatsapp.settings.SettingsUserProxyActivity;
import com.whatsapp.settings.SettingsUserProxyViewModel;
import com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment;
import com.whatsapp.twofactor.SettingsTwoFactorAuthActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3vD  reason: invalid class name and case insensitive filesystem */
public class C80323vD implements Runnable {
    public Object A00;
    public boolean A01;
    public final int A02;

    public C80323vD(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    public final void run() {
        AnonymousClass17Y r2;
        C81163wZ r1;
        Set entrySet;
        int i;
        String str;
        long j;
        Set emptySet;
        C104665Ar r5;
        C135066c4 r3;
        AnonymousClass4YK r22;
        int i2;
        int i3;
        switch (this.A02) {
            case 0:
                ChangeNumberOverview changeNumberOverview = (ChangeNumberOverview) this.A00;
                boolean z = this.A01;
                AnonymousClass1EU r0 = changeNumberOverview.A04;
                if (r0 != null) {
                    AnonymousClass1EU.A00(r0);
                    boolean z2 = true;
                    if (r0.A05.A0S(1).size() <= 0) {
                        z2 = false;
                    }
                    C19460v5 r12 = changeNumberOverview.A01;
                    if (r12 == null) {
                        throw C36331k8.A0d("subscriptionManager");
                    } else if (r12.A05()) {
                        r12.A02();
                        throw AnonymousClass001.A0A("isMetaVerifiedSubscriptionActive");
                    } else {
                        changeNumberOverview.A05.Bp3(new C81223wf(changeNumberOverview, z, z2));
                        return;
                    }
                } else {
                    throw C36331k8.A0d("paymentsManager");
                }
            case 1:
                SettingsChatHistoryFragment settingsChatHistoryFragment = (SettingsChatHistoryFragment) this.A00;
                boolean z3 = this.A01;
                AnonymousClass1X4 r7 = settingsChatHistoryFragment.A03;
                C220712t r4 = r7.A0T;
                C36321k7.A1X("msgstore/archiveall ", AnonymousClass000.A0u(), z3);
                C220712t.A01(r4, z3);
                Collection<C65073Qp> A0F = r4.A00.A0F();
                for (C65073Qp r13 : A0F) {
                    if (!r13.A0j) {
                        r13.A0i = z3;
                    }
                }
                AnonymousClass005 r14 = r4.A01;
                ((C24731Do) r14.get()).A0B.A00();
                ((C24731Do) r14.get()).A09.A01(new C35291iS(r4, A0F, 6, z3), 4);
                C36421kH.A1C(r7);
                AnonymousClass1CR r6 = r7.A1B;
                LinkedHashSet linkedHashSet = new LinkedHashSet(r6.A0W().keySet());
                HashSet A16 = C36441kJ.A16();
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    AnonymousClass11F A0a = C36401kF.A0a(it);
                    A16.addAll(r7.A0D.A05(A0a, false));
                    r6.A0T(A0a);
                }
                r7.A0D.A0Q(A16);
                SystemClock.sleep(300);
                r2 = settingsChatHistoryFragment.A00;
                r1 = new C81163wZ((Object) settingsChatHistoryFragment, 21);
                break;
            case 2:
                boolean z4 = this.A01;
                SettingsChatHistoryFragment settingsChatHistoryFragment2 = (SettingsChatHistoryFragment) ((C89814Xz) this.A00).A00;
                AnonymousClass1X4 r42 = settingsChatHistoryFragment2.A03;
                ArrayList A04 = r42.A0H.A04();
                ArrayList A0I = AnonymousClass001.A0I();
                HashSet A162 = C36441kJ.A16();
                Iterator it2 = A04.iterator();
                while (it2.hasNext()) {
                    AnonymousClass11F A0a2 = C36401kF.A0a(it2);
                    if (r42.A0U.A02(A0a2) > 0) {
                        r42.A0z.A0D(A0a2, (AnonymousClass3T1) null);
                        r42.A02.A0H(new C35621iz(r42, A0a2, 16));
                    }
                    AnonymousClass141 A012 = r42.A0V.A01(A0a2);
                    if (!A012.A0G() && A012.A0F == null) {
                        A0I.add(A012);
                    }
                    if (!A012.A0G()) {
                        AnonymousClass1X4.A08(r42, A0a2);
                    }
                    A162.addAll(r42.A0D.A06(A0a2, z4));
                }
                r42.A0E.A0m(A0I);
                C20310xM r23 = r42.A0X;
                Log.i("CoreMessageStore/deleteallmsgs");
                C224214g r9 = new C224214g("msgstore/deleteallmsgs");
                r23.A1H.clear();
                AnonymousClass1M0 A05 = r23.A0c.A05();
                try {
                    C1495671s B1k = A05.B1k();
                    try {
                        A05.A02.A0D("DELETE FROM chat WHERE _id IN  (SELECT c._id FROM chat AS c LEFT JOIN jid AS j ON c.jid_row_id=j._id WHERE j.type != 1)", "DELETE_CHAT_SQL");
                        C20310xM.A06(r23, r9);
                        C220412q r15 = r23.A0I;
                        synchronized (r15) {
                            entrySet = C220412q.A00(r15).entrySet();
                        }
                        Iterator it3 = entrySet.iterator();
                        while (it3.hasNext()) {
                            Map.Entry A11 = AnonymousClass000.A11(it3);
                            AnonymousClass11F r8 = (AnonymousClass11F) A11.getKey();
                            C65073Qp r16 = (C65073Qp) A11.getValue();
                            r16.A0A();
                            if ((r8 instanceof AnonymousClass147) && r16.A00 == 1) {
                                r23.A0z(r8, (Long) null);
                            }
                        }
                        B1k.A00();
                        B1k.close();
                        A05.close();
                        C36321k7.A0t(r9, "CoreMessageStore/deleteallmsgs time spent:", AnonymousClass000.A0u());
                        C20690y0 r17 = r23.A05;
                        AnonymousClass6YY.A0Q(r17.A08().A0O);
                        AnonymousClass6YY.A0Q(r17.A08().A0G);
                        if (z4) {
                            C20310xM.A02(r23);
                        }
                        Message.obtain(r23.A0T.A01, 9).sendToTarget();
                        AnonymousClass1DM r24 = r42.A0F;
                        A05 = r24.A03.A00.A04();
                        C229416o.A02(A05, "wa_trusted_contacts", (String) null, (String[]) null);
                        C229416o.A02(A05, "wa_trusted_contacts_send", (String) null, (String[]) null);
                        A05.close();
                        AnonymousClass1DM.A03(r24).clear();
                        AnonymousClass1DM.A02(r24).clear();
                        r42.A0D.A0Q(A162);
                        r42.A0o.A0O();
                        C36421kH.A1C(r42);
                        r42.A08.A01();
                        r2 = settingsChatHistoryFragment2.A00;
                        r1 = new C81163wZ((Object) settingsChatHistoryFragment2, 22);
                        break;
                    } catch (Throwable th) {
                        B1k.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        A05.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            case 3:
                boolean z5 = this.A01;
                SettingsUserProxyViewModel settingsUserProxyViewModel = ((SettingsUserProxyActivity) this.A00).A09;
                synchronized (settingsUserProxyViewModel) {
                    AnonymousClass1BX r52 = settingsUserProxyViewModel.A0D;
                    r52.A05(z5);
                    if (z5) {
                        if (settingsUserProxyViewModel.A02 != null) {
                            if (settingsUserProxyViewModel.A0E.A00.A01() == null && (str = settingsUserProxyViewModel.A02) != null) {
                                settingsUserProxyViewModel.A0X(str);
                            }
                            settingsUserProxyViewModel.A0V(1, false);
                        }
                        C36341k9.A19(settingsUserProxyViewModel.A07, z5);
                        settingsUserProxyViewModel.A03 = false;
                    } else {
                        if (!settingsUserProxyViewModel.A03) {
                            if (settingsUserProxyViewModel.A02 == null) {
                                i = 0;
                            } else {
                                i = 5;
                                if (settingsUserProxyViewModel.A09.A02()) {
                                    i = 4;
                                }
                            }
                            settingsUserProxyViewModel.A0V(i, false);
                            r52.A04((String) null);
                            settingsUserProxyViewModel.A0C.A00(false);
                        }
                        C36341k9.A19(settingsUserProxyViewModel.A07, z5);
                        settingsUserProxyViewModel.A03 = false;
                    }
                    settingsUserProxyViewModel.A0T();
                    C36341k9.A19(settingsUserProxyViewModel.A07, z5);
                    settingsUserProxyViewModel.A03 = false;
                }
                return;
            case 4:
                C37161lu r02 = (C37161lu) this.A00;
                boolean z6 = this.A01;
                AnonymousClass00C.A0D(r02, 0);
                C47542ew r25 = (C47542ew) r02.A0C.get();
                if (r25 == null) {
                    return;
                }
                if (z6) {
                    r25.A03 = true;
                    r25.A05.A01();
                    C47542ew.A00(r25, r25.A0A.A03);
                    return;
                }
                r25.A01.A06(R.string.f12nameremoved, 0);
                r25.A0A.A02(r25);
                r25.A02 = false;
                return;
            case 5:
                StarOrRemoveFromRecentsStickerDialogFragment starOrRemoveFromRecentsStickerDialogFragment = (StarOrRemoveFromRecentsStickerDialogFragment) this.A00;
                if (this.A01) {
                    r5 = (C104665Ar) starOrRemoveFromRecentsStickerDialogFragment.A04.get();
                    r3 = starOrRemoveFromRecentsStickerDialogFragment.A01;
                    r22 = null;
                } else {
                    String str2 = starOrRemoveFromRecentsStickerDialogFragment.A01.A0E;
                    AnonymousClass00C.A0D(str2, 0);
                    Pair A0C = ((C104665Ar) starOrRemoveFromRecentsStickerDialogFragment.A05.get()).A0C(str2);
                    if (A0C != null) {
                        Object obj = A0C.second;
                        AnonymousClass00C.A07(obj);
                        j = C36431kI.A09(obj);
                    } else {
                        j = 0;
                    }
                    String str3 = starOrRemoveFromRecentsStickerDialogFragment.A01.A0E;
                    if (str3 != null) {
                        emptySet = starOrRemoveFromRecentsStickerDialogFragment.A00.A0B(str3, j);
                    } else {
                        emptySet = Collections.emptySet();
                    }
                    r5 = (C104665Ar) starOrRemoveFromRecentsStickerDialogFragment.A05.get();
                    r3 = starOrRemoveFromRecentsStickerDialogFragment.A01;
                    r22 = new AnonymousClass4YK(starOrRemoveFromRecentsStickerDialogFragment, emptySet, 0);
                }
                r5.A0I(r22, r3);
                return;
            case 6:
                C37151lt.A00((C37151lt) this.A00, this.A01);
                return;
            case 7:
                SettingsTwoFactorAuthActivity settingsTwoFactorAuthActivity = (SettingsTwoFactorAuthActivity) this.A00;
                boolean z7 = this.A01;
                if (!settingsTwoFactorAuthActivity.BLh()) {
                    View findViewById = settingsTwoFactorAuthActivity.findViewById(R.id.title);
                    TextView A0Q = C36391kE.A0Q(settingsTwoFactorAuthActivity, R.id.enable_button);
                    View findViewById2 = settingsTwoFactorAuthActivity.findViewById(R.id.learn_more_button);
                    View findViewById3 = settingsTwoFactorAuthActivity.findViewById(R.id.twa_fac_steps_layout);
                    ViewGroup.LayoutParams layoutParams = A0Q.getLayoutParams();
                    int i4 = 0;
                    if (z7 || !settingsTwoFactorAuthActivity.A0B) {
                        C36361kB.A15(findViewById, findViewById2, findViewById3, 8);
                        A0Q.setText(R.string.f12nameremoved);
                        layoutParams.width = -2;
                        int i5 = R.dimen.f7nameremoved;
                        if (z7) {
                            i5 = R.dimen.f7nameremoved;
                        }
                        ViewGroup.MarginLayoutParams A0a3 = AnonymousClass000.A0a(settingsTwoFactorAuthActivity.A04);
                        A0a3.setMargins(A0a3.leftMargin, C36361kB.A02(settingsTwoFactorAuthActivity, i5), A0a3.rightMargin, A0a3.bottomMargin);
                    } else {
                        C36361kB.A15(findViewById, findViewById2, findViewById3, 0);
                        A0Q.setText(R.string.f12nameremoved);
                        layoutParams.width = -1;
                        AnonymousClass3Y9.A00(findViewById2, settingsTwoFactorAuthActivity, 7);
                    }
                    ImageView imageView = settingsTwoFactorAuthActivity.A04;
                    if (z7) {
                        boolean A1X = C36401kF.A1X(settingsTwoFactorAuthActivity.A00);
                        i2 = R.drawable.settings_2fa_done;
                        if (A1X) {
                            i2 = R.drawable.settings_2fa_done_rtl;
                        }
                    } else {
                        i2 = R.drawable.settings_2fa;
                    }
                    C36391kE.A18(settingsTwoFactorAuthActivity, imageView, i2);
                    settingsTwoFactorAuthActivity.A03.setVisibility(C36381kD.A00(z7 ? 1 : 0));
                    settingsTwoFactorAuthActivity.A02.setVisibility(C36351kA.A00(z7));
                    View view = settingsTwoFactorAuthActivity.A01;
                    if (!z7) {
                        i4 = 8;
                    }
                    view.setVisibility(i4);
                    TextView textView = settingsTwoFactorAuthActivity.A08;
                    boolean z8 = settingsTwoFactorAuthActivity.A0B;
                    if (z7) {
                        i3 = R.string.f12nameremoved;
                        if (z8) {
                            i3 = R.string.f12nameremoved;
                        }
                    } else {
                        i3 = R.string.f12nameremoved;
                        if (z8) {
                            i3 = R.string.f12nameremoved;
                        }
                    }
                    textView.setText(i3);
                    TextView textView2 = settingsTwoFactorAuthActivity.A07;
                    int A013 = C36371kC.A01(C29011Uz.A00(settingsTwoFactorAuthActivity.A0A), "two_factor_auth_email_set");
                    int i6 = R.string.f12nameremoved;
                    if (A013 == 1) {
                        i6 = R.string.f12nameremoved;
                    }
                    textView2.setText(i6);
                    return;
                }
                return;
            default:
                C51082nC r43 = (C51082nC) this.A00;
                boolean z9 = this.A01;
                if (!((C28781Ua) r43.A02.get()).A00()) {
                    AnonymousClass005 r26 = r43.A00;
                    AnonymousClass1UM A10 = C36431kI.A10(r26);
                    AnonymousClass1US r18 = AnonymousClass1US.CROSSPOST_STATE_DAILY_STATS_CRON;
                    if (A10.A06(r18)) {
                        C36431kI.A10(r26).A04(r18, false);
                        return;
                    }
                    return;
                }
                if (!z9) {
                    AnonymousClass1UM A102 = C36431kI.A10(r43.A00);
                    AnonymousClass00C.A0D(AnonymousClass000.A0l(AnonymousClass1US.CROSSPOST_STATE_DAILY_STATS_CRON, "FbAccountManager/hasUserConsented called by ", AnonymousClass000.A0u()), 0);
                    if (!AnonymousClass1UI.A00(A102.A00.A03).getBoolean("pref_xfamily_fb_account_user_consented", false)) {
                        return;
                    }
                }
                AnonymousClass2P0 r32 = new AnonymousClass2P0();
                AnonymousClass005 r27 = r43.A00;
                AnonymousClass1UM A103 = C36431kI.A10(r27);
                AnonymousClass1US r19 = AnonymousClass1US.CROSSPOST_STATE_DAILY_STATS_CRON;
                r32.A00 = Boolean.valueOf(A103.A06(r19));
                r32.A01 = C36431kI.A10(r27).A01(r19);
                ((C21010yW) r43.A01.get()).Bly(r32);
                return;
        }
        r2.A0H(r1);
    }
}
