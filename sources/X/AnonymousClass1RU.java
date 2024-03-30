package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1RU  reason: invalid class name */
public final class AnonymousClass1RU {
    public Long A00;
    public String A01;
    public long A02;
    public AnonymousClass18U A03;
    public final C19700wN A04;
    public final C19730wQ A05;
    public final AnonymousClass1RV A06;
    public final C19970wo A07;
    public final C25271Fq A08;
    public final C19420v0 A09;
    public final C19900wh A0A;
    public final C18820ts A0B;
    public final C20810yC A0C;
    public final AnonymousClass005 A0D;
    public final AnonymousClass005 A0E;
    public final C24801Dv A0F;
    public final C25781Hq A0G;
    public final C19770wU A0H;
    public final AnonymousClass005 A0I;
    public final AnonymousClass005 A0J;

    public AnonymousClass1RU(C24801Dv r18, C19700wN r19, C19730wQ r20, AnonymousClass1RV r21, AnonymousClass18U r22, C19970wo r23, C25271Fq r24, C19420v0 r25, C19900wh r26, C18820ts r27, C20810yC r28, C25781Hq r29, C19770wU r30, AnonymousClass005 r31, AnonymousClass005 r32, AnonymousClass005 r33, AnonymousClass005 r34) {
        C19970wo r12 = r23;
        AnonymousClass00C.A0D(r12, 1);
        C20810yC r7 = r28;
        AnonymousClass00C.A0D(r7, 2);
        C19730wQ r14 = r20;
        AnonymousClass00C.A0D(r14, 3);
        C19700wN r15 = r19;
        AnonymousClass00C.A0D(r15, 4);
        C19770wU r0 = r30;
        AnonymousClass00C.A0D(r0, 5);
        C24801Dv r16 = r18;
        AnonymousClass00C.A0D(r16, 6);
        AnonymousClass18U r13 = r22;
        AnonymousClass00C.A0D(r13, 7);
        C18820ts r8 = r27;
        AnonymousClass00C.A0D(r8, 8);
        AnonymousClass005 r5 = r31;
        AnonymousClass00C.A0D(r5, 9);
        C19420v0 r10 = r25;
        AnonymousClass00C.A0D(r10, 10);
        C25271Fq r11 = r24;
        AnonymousClass00C.A0D(r11, 12);
        AnonymousClass005 r4 = r32;
        AnonymousClass00C.A0D(r4, 13);
        C19900wh r9 = r26;
        AnonymousClass00C.A0D(r9, 14);
        AnonymousClass005 r3 = r33;
        AnonymousClass00C.A0D(r3, 15);
        AnonymousClass005 r2 = r34;
        AnonymousClass00C.A0D(r2, 16);
        C25781Hq r6 = r29;
        AnonymousClass00C.A0D(r6, 17);
        this.A07 = r12;
        this.A0C = r7;
        this.A05 = r14;
        this.A04 = r15;
        this.A0H = r0;
        this.A0F = r16;
        this.A03 = r13;
        this.A0B = r8;
        this.A0J = r5;
        this.A09 = r10;
        this.A06 = r21;
        this.A08 = r11;
        this.A0I = r4;
        this.A0A = r9;
        this.A0D = r3;
        this.A0E = r2;
        this.A0G = r6;
    }

    public static final AnonymousClass11F A00(Intent intent) {
        AnonymousClass00C.A0D(intent, 0);
        return AnonymousClass11F.A00.A02(intent.getStringExtra("account_switching_sender_jid"));
    }

    public final String A04(String str) {
        AnonymousClass00C.A0D(str, 0);
        C18820ts r1 = this.A0B;
        Parcelable.Creator creator = PhoneUserJid.CREATOR;
        String A072 = AnonymousClass3U8.A07(C222913s.A00(str));
        if (A072 == null) {
            A072 = str;
        }
        String A0H2 = r1.A0H(A072);
        if (A0H2 != null) {
            str = A0H2;
        }
        String replace = str.replace(' ', 160);
        AnonymousClass00C.A08(replace);
        return replace;
    }

    public final String A05(String str, String str2) {
        String str3;
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass00C.A0D(str2, 1);
        Log.i("AccountSwitcher/getLidForPhoneNumberIfRegistered");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String obj = sb.toString();
        for (AnonymousClass3KU r9 : AnonymousClass1Z0.A00((AnonymousClass1Z0) this.A0D.get()).A01) {
            String str4 = r9.A07;
            if (TextUtils.equals(str4, obj) || TextUtils.equals(AnonymousClass3U2.A03(AnonymousClass3U8.A01(C203559oI.A00(), str4)), obj)) {
                str3 = "AccountSwitcher/getLidForPhoneNumberIfRegistered/phone number matches different format";
            } else if (AnonymousClass098.A07(str4, str, true)) {
                String A0E2 = AnonymousClass099.A0E(str, str4);
                int length = A0E2.length();
                int length2 = str2.length();
                if (length == length2) {
                    Log.i("AccountSwitcher/getLidForPhoneNumberIfRegistered/closelyMatches/same length");
                    if (A0E2.equals(str2)) {
                    }
                } else {
                    int abs = Math.abs(length - length2);
                    if (abs > 2) {
                        Log.i("AccountSwitcher/getLidForPhoneNumberIfRegistered/closelyMatches/phone number length difference is greater than 2");
                    } else {
                        String str5 = str2;
                        if (length < length2) {
                            str5 = A0E2;
                        }
                        if (length < length2) {
                            A0E2 = str2;
                        }
                        int i = 0;
                        int i2 = 0;
                        int i3 = 0;
                        while (i < str5.length() && i2 < A0E2.length()) {
                            if (A0E2.charAt(i2) != str5.charAt(i)) {
                                i3++;
                            } else {
                                i++;
                            }
                            i2++;
                        }
                        if (i3 + (A0E2.length() - i2) <= abs) {
                        }
                    }
                }
                str3 = "AccountSwitcher/getLidForPhoneNumberIfRegistered/phone number closely matches with registered account";
            }
            Log.i(str3);
            return r9.A08;
        }
        return null;
    }

    public final void A07(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountSwitcher/maybeSwitchToMostRecentAccount/source : ");
        sb.append(i);
        Log.i(sb.toString());
        this.A0H.Box(new C49192ii(context, this, i), new Void[0]);
    }

    public final void A08(Intent intent) {
        String stringExtra;
        AnonymousClass00C.A0D(intent, 0);
        if (intent.getBooleanExtra("is_success", false)) {
            if (intent.hasExtra("request_type")) {
                boolean z = false;
                int intExtra = intent.getIntExtra("request_type", 0);
                if (intExtra == 1 || intExtra == 2 || intExtra == 4) {
                    z = true;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("AccountSwitcher/processIntentAfterAccountSwitching/shouldShowAccountSwitchingToast: ");
                sb.append(z);
                Log.i(sb.toString());
                C19420v0 r3 = this.A09;
                C19420v0.A00(r3).putBoolean("show_account_switching_toast", z).apply();
                if (1 == intent.getIntExtra("request_type", 0)) {
                    C19420v0.A00(r3).putInt("add_account_source", intent.getIntExtra("source", 0)).apply();
                }
            }
            int intExtra2 = intent.getIntExtra("request_type", 0);
            if (intExtra2 == 1 || intExtra2 == 2 || intExtra2 == 3 || intExtra2 == 4) {
                Long valueOf = Long.valueOf(C19970wo.A00(this.A07));
                this.A00 = valueOf;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("AccountSwitcher/processIntentAfterAccountSwitching/lastSwitchedTsMs=");
                sb2.append(valueOf);
                Log.i(sb2.toString());
            }
            if (intent.hasExtra("number_of_accounts")) {
                int intExtra3 = intent.getIntExtra("number_of_accounts", 0);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("AccountSwitcher/processIntentAfterAccountSwitching/ACTIVITY_EXTRA_NUMBER_OF_ACCOUNTS: ");
                sb3.append(intExtra3);
                Log.i(sb3.toString());
                this.A09.A1D(intExtra3);
                C20920yN r32 = this.A0G.A08;
                Long valueOf2 = Long.valueOf((long) (intExtra3 + 1));
                AnonymousClass00C.A0D(r32, 0);
                r32.BqE(valueOf2, 15265, 0);
                r32.BqE(valueOf2, 15265, 1);
            }
        }
        if (intent.hasExtra("account_language") && (stringExtra = intent.getStringExtra("account_language")) != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("AccountSwitcher/processIntentAfterAccountSwitching/ACTIVITY_EXTRA_ACCOUNT_LANGUAGE: ");
            sb4.append(stringExtra);
            Log.i(sb4.toString());
            this.A0A.A01.edit().putString("forced_language", stringExtra).apply();
            this.A0B.A0P(stringExtra);
        }
    }

    public final void A09(Intent intent) {
        AnonymousClass00C.A0D(intent, 0);
        Log.i("AccountSwitcher/processNewUserIntentAfterAccountSwitching");
        String stringExtra = intent.getStringExtra("device_id");
        if (!(stringExtra == null || stringExtra.length() == 0)) {
            Log.i("AccountSwitcher/processNewUserIntentAfterAccountSwitching/init device id");
            C19420v0 r3 = this.A09;
            if (((SharedPreferences) r3.A00.get()).getString("perf_device_id", (String) null) == null) {
                C19420v0.A00(r3).putString("perf_device_id", stringExtra).apply();
            }
        }
        String stringExtra2 = intent.getStringExtra("phone_id");
        long longExtra = intent.getLongExtra("phone_id_timestamp", 0);
        if (!(stringExtra2 == null || stringExtra2.length() == 0 || longExtra <= this.A09.A0V("phoneid_timestamp"))) {
            Log.i("AccountSwitcher/processNewUserIntentAfterAccountSwitching/init phone id");
            ((C29071Vf) this.A0J.get()).BrX(new AnonymousClass61Z(stringExtra2, longExtra));
        }
        boolean booleanExtra = intent.getBooleanExtra("should_open_link_companion", false);
        if (booleanExtra) {
            C19420v0.A00(this.A09).putBoolean("account_switching_open_link_companion", true).apply();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("AccountSwitcher/processNewUserIntentAfterAccountSwitching/isOpenLinkCompanionFlow=");
        sb.append(booleanExtra);
        Log.i(sb.toString());
    }

    public final boolean A0D(Context context, Intent intent) {
        String str;
        AnonymousClass00C.A0D(intent, 1);
        boolean z = false;
        if (intent.getIntExtra("request_type", 0) == 3) {
            if (!intent.getBooleanExtra("abandon_add_account_from_back_press", false)) {
                return false;
            }
            C19420v0 r9 = this.A09;
            boolean A0J2 = AnonymousClass00C.A0J(((SharedPreferences) r9.A00.get()).getString("abandon_add_account_landing_screen", (String) null), "settings_account");
            z = true;
            C24801Dv r8 = this.A0F;
            C20810yC r2 = this.A0C;
            C21000yV r0 = C21000yV.A02;
            if (A0J2) {
                boolean A012 = C20800yB.A01(r0, r2, 7582);
                Intent intent2 = new Intent();
                intent2.setClassName(context.getPackageName(), "com.whatsapp.settings.SettingsAccount");
                if (A012) {
                    str = "account_switcher_add_account";
                } else {
                    str = "account_switcher";
                }
                intent2.putExtra(str, true);
                intent2.putExtra("source", 15);
                r8.A06(context, intent2);
                C19420v0.A00(r9).putString("abandon_add_account_landing_screen", (String) null).apply();
                return true;
            }
            r8.A06(context, AnonymousClass190.A0L(context, 1, C20800yB.A01(r0, r2, 7582)));
            C19420v0.A00(r9).putString("abandon_add_account_landing_screen", (String) null).apply();
        }
        return z;
    }

    public final boolean A0E(Context context, String str, String str2, AnonymousClass00S r21, int i, boolean z, boolean z2, boolean z3) {
        AnonymousClass6TO r2;
        int i2;
        AnonymousClass1RV r7 = this.A06;
        int A002 = r7.A00();
        StringBuilder sb = new StringBuilder();
        sb.append("AccountSwitcher/maybeLaunchAccountSwitchingActivity addAccount:");
        sb.append(z);
        sb.append(", isCall:");
        boolean z4 = z2;
        sb.append(z4);
        sb.append(", source:");
        int i3 = i;
        sb.append(i3);
        sb.append(", shouldAllowSwitchingAccounts:");
        sb.append(A002);
        Log.i(sb.toString());
        boolean z5 = true;
        Context context2 = context;
        AnonymousClass00S r22 = r21;
        if (A002 != 0) {
            if (A002 == 1) {
                Activity A003 = C18860tw.A00(context2);
                if (A003 != null && !AnonymousClass3SJ.A04(A003)) {
                    AnonymousClass005 r4 = r7.A01;
                    long A012 = (AnonymousClass1V2.A01((C20060wx) r4.get(), (C20810yC) r7.A00.get()) - ((C20060wx) r4.get()).A02()) + SearchActionVerificationClientService.MS_TO_NS;
                    C39001qm A004 = AnonymousClass3LW.A00(context2);
                    A004.A0q(context2.getString(R.string.f12nameremoved));
                    A004.A0p(context2.getString(R.string.f12nameremoved, new Object[]{AnonymousClass3TF.A02(this.A0B, A012)}));
                    A004.A0h(new C89684Xm(context2, this, 0), R.string.f12nameremoved);
                    A004.A0f(new AnonymousClass4XK(r22, 2), R.string.f12nameremoved);
                    A004.A0r(true);
                    A004.create().show();
                } else if (r21 != null) {
                    r22.invoke();
                }
                Object obj = this.A0I.get();
                AnonymousClass00C.A08(obj);
                r2 = (AnonymousClass6TO) obj;
                i2 = 25;
            } else if (A002 != 2) {
                A01(context2, r22, R.string.f12nameremoved, R.string.f12nameremoved);
                Object obj2 = this.A0I.get();
                AnonymousClass00C.A08(obj2);
                r2 = (AnonymousClass6TO) obj2;
                i2 = 24;
            } else {
                A01(context2, r22, R.string.f12nameremoved, R.string.f12nameremoved);
                Object obj3 = this.A0I.get();
                AnonymousClass00C.A08(obj3);
                r2 = (AnonymousClass6TO) obj3;
                i2 = 23;
            }
            r2.A02((Boolean) null, i3, i2);
            return false;
        }
        AnonymousClass18U r1 = this.A03;
        if (r1.A04()) {
            r1.A02(true);
        }
        if (z) {
            AnonymousClass1Z0 r72 = (AnonymousClass1Z0) this.A0D.get();
            boolean A013 = C20800yB.A01(C21000yV.A02, this.A0C, 5840);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccountSwitchingDataRepo/setIsCompanionModeEnabled/");
            sb2.append(A013);
            Log.i(sb2.toString());
            AnonymousClass6C2 A005 = AnonymousClass1Z0.A00(r72);
            AnonymousClass1Z0.A01(new AnonymousClass6C2(A005.A00, A005.A01, A005.A03, A013), r72);
            Log.i("AccountSwitcher/clearExistingNotifications");
            this.A08.A03(57, "clearNotificationsBeforeAccountSwitching");
            AnonymousClass61Z BFs = ((C29071Vf) this.A0J.get()).BFs();
            C19420v0 r3 = this.A09;
            String A0e = r3.A0e();
            String str3 = BFs.A01;
            long j = BFs.A00;
            int A0I2 = r3.A0I();
            String A014 = this.A0A.A01();
            boolean z6 = false;
            if (A0I2 >= 0) {
                z6 = true;
            }
            C18740tg.A0B(z6);
            Intent intent = new Intent();
            intent.setClassName(context2.getPackageName(), "com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity");
            intent.putExtra("request_type", 1);
            intent.putExtra("device_id", A0e);
            intent.putExtra("phone_id", str3);
            intent.putExtra("phone_id_timestamp", j);
            intent.putExtra("number_of_accounts", A0I2 + 1);
            if (A014 != null) {
                intent.putExtra("account_language", A014);
            }
            if (z3) {
                intent.putExtra("should_open_link_companion", true);
            }
            intent.putExtra("source", i3);
            intent.addFlags(268468224);
            z5 = A02(context2, intent, this);
        } else {
            String str4 = str;
            if (str != null) {
                this.A0H.Bp0(new C49572jL(context2, this, str4, str2, i3, z4), new Void[0]);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (r21 != null) {
            r22.invoke();
        }
        return z5;
    }

    public final AnonymousClass3KU A03() {
        String str;
        String str2;
        boolean z;
        String str3;
        Log.i("AccountSwitcher/getCurrentAccount");
        C19730wQ r3 = this.A05;
        C223313w A082 = r3.A08();
        if (A082 != null) {
            str = A082.getRawString();
        } else {
            str = null;
        }
        r3.A0G();
        PhoneUserJid phoneUserJid = r3.A03;
        if (phoneUserJid != null) {
            str2 = phoneUserJid.user;
        } else {
            str2 = null;
        }
        if (str == null || str.length() == 0) {
            Log.i("AccountSwitcher/getCurrentAccount/lid is null or empty");
            z = true;
        } else {
            z = false;
        }
        if (str2 == null || str2.length() == 0) {
            Log.i("AccountSwitcher/getCurrentAccount/phoneUserJid is null or empty");
        } else if (!z) {
            if (str != null) {
                String A022 = r3.A0A.A02();
                AnonymousClass00C.A08(A022);
                return new AnonymousClass3KU(str, str2, A022, 0, 0, C19970wo.A00(this.A07), 0, ((SharedPreferences) this.A09.A00.get()).getLong("registration_success_time_ms", 0), true, r3.A0L());
            }
            throw new IllegalStateException("Required value was null.");
        }
        AnonymousClass005 r4 = this.A09.A00;
        if (!((SharedPreferences) r4.get()).getBoolean("support_ban_appeal_user_banned_from_chat_disconnect", false)) {
            return null;
        }
        Log.i("AccountSwitcher/getCurrentAccount/userBannedFromChatDisconnect");
        Log.i("AccountSwitcher/getBannedCurrentAccount");
        String string = ((SharedPreferences) r4.get()).getString("account_switching_banned_account_lid", (String) null);
        String string2 = ((SharedPreferences) r4.get()).getString("account_switching_banned_account_phone_user_jid", (String) null);
        if (string == null || string.length() == 0) {
            str3 = "AccountSwitcher/getBannedCurrentAccount/lid is null or empty";
        } else if (string2 == null || string2.length() == 0) {
            str3 = "AccountSwitcher/getBannedCurrentAccount/phoneUserJid is null or empty";
        } else {
            String A023 = this.A0A.A02();
            AnonymousClass00C.A08(A023);
            return new AnonymousClass3KU(string, string2, A023, 0, 0, C19970wo.A00(this.A07), 0, 0, true, false);
        }
        Log.i(str3);
        return null;
    }

    public final void A06(Activity activity, String str, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("AccountSwitcher/abandonAddAccount/");
        if (str != null) {
            str2 = AnonymousClass3LV.A01(str);
        } else {
            str2 = null;
        }
        sb.append(str2);
        Log.i(sb.toString());
        A02(activity, AnonymousClass190.A1H(activity, str, this.A0A.A01(), this.A09.A0I(), z), this);
    }

    public final boolean A0A() {
        if (this.A09.A0I() > 0) {
            return true;
        }
        return false;
    }

    public final boolean A0B() {
        C20810yC r3 = this.A0C;
        C21000yV r2 = C21000yV.A02;
        if (!C20800yB.A01(r2, r3, 5840)) {
            C19730wQ r1 = this.A05;
            if ((!r1.A0L() || !A0A()) && r1.A0L()) {
                return false;
            }
        }
        if (C20800yB.A01(r2, r3, 4377) || A0A()) {
            return true;
        }
        return false;
    }

    public final boolean A0C() {
        for (AnonymousClass3KU r0 : AnonymousClass1Z0.A00((AnonymousClass1Z0) this.A0D.get()).A01) {
            if (r0.A00 > 0) {
                return true;
            }
        }
        return false;
    }

    public static final void A01(Context context, AnonymousClass00S r5, int i, int i2) {
        Activity A002 = C18860tw.A00(context);
        if (A002 != null && !AnonymousClass3SJ.A04(A002)) {
            C39001qm A003 = AnonymousClass3LW.A00(context);
            A003.A0p(context.getString(i2));
            A003.A0q(context.getString(i));
            A003.A0h(new AnonymousClass4XK(r5, 3), R.string.f12nameremoved);
            A003.A0r(true);
            A003.create().show();
        } else if (r5 != null) {
            r5.invoke();
        }
    }

    public static final boolean A02(Context context, Intent intent, AnonymousClass1RU r7) {
        if (System.currentTimeMillis() - r7.A02 < AnonymousClass6X5.A0L) {
            Log.i("AccountSwitcher/shouldTakeAccountSwitchingAction/ignoring as last action was recently called");
            return false;
        }
        r7.A02 = System.currentTimeMillis();
        r7.A0F.A06(context, intent);
        return true;
    }

    public final boolean A0F(boolean z) {
        if (!A0B() || !A0A() || z) {
            return false;
        }
        return true;
    }
}
