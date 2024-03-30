package com.whatsapp.backup.google;

import X.AVa;
import X.AnonymousClass000;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass09Y;
import X.AnonymousClass14B;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass1N3;
import X.AnonymousClass1Q9;
import X.AnonymousClass1RJ;
import X.AnonymousClass1RU;
import X.AnonymousClass29N;
import X.AnonymousClass2RM;
import X.AnonymousClass3L4;
import X.AnonymousClass3MK;
import X.AnonymousClass3PI;
import X.AnonymousClass3RQ;
import X.AnonymousClass3SJ;
import X.AnonymousClass4QA;
import X.AnonymousClass4XV;
import X.AnonymousClass6DP;
import X.AnonymousClass6FS;
import X.AnonymousClass6GL;
import X.AnonymousClass6X5;
import X.AnonymousClass6Y6;
import X.AnonymousClass6YN;
import X.C012005e;
import X.C03570Gk;
import X.C111795cr;
import X.C130526Lk;
import X.C144596sV;
import X.C148436yr;
import X.C1497072l;
import X.C1502274l;
import X.C1503374w;
import X.C163027pX;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C18840tu;
import X.C19420v0;
import X.C19460v5;
import X.C19470v6;
import X.C19630wG;
import X.C19770wU;
import X.C20060wx;
import X.C20810yC;
import X.C20830yE;
import X.C21010yW;
import X.C21570zS;
import X.C224214g;
import X.C224514j;
import X.C226515g;
import X.C229216m;
import X.C24331Ca;
import X.C24341Cb;
import X.C24431Ck;
import X.C24461Cn;
import X.C24801Dv;
import X.C27111My;
import X.C32711e4;
import X.C33101ei;
import X.C33161ep;
import X.C33171eq;
import X.C33571fa;
import X.C33601fd;
import X.C33751fs;
import X.C33941gB;
import X.C35671j4;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C36571kW;
import X.C53282r4;
import X.C71783hK;
import X.C88344Si;
import X.C88774Tz;
import X.C90464aC;
import X.C90474aD;
import X.C90484aE;
import X.C90504aG;
import X.C90514aH;
import X.C90524aI;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.text.Html;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaLinearLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

public class SettingsGoogleDrive extends AnonymousClass155 implements C88344Si, C88774Tz {
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public View.OnClickListener A02;
    public View.OnClickListener A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public Button A0A;
    public ImageView A0B;
    public ImageView A0C;
    public ProgressBar A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public SwitchCompat A0M;
    public SwitchCompat A0N;
    public C19460v5 A0O;
    public TextEmojiLabel A0P;
    public WaLinearLayout A0Q;
    public WaTextView A0R;
    public WaTextView A0S;
    public C24331Ca A0T;
    public C24461Cn A0U;
    public C33601fd A0V;
    public C24431Ck A0W;
    public C33101ei A0X;
    public AnonymousClass6FS A0Y;
    public C33171eq A0Z;
    public C33161ep A0a;
    public SettingsGoogleDriveViewModel A0b;
    public C229216m A0c;
    public C33751fs A0d;
    public C24341Cb A0e;
    public C19630wG A0f;
    public C20830yE A0g;
    public C144596sV A0h;
    public AnonymousClass1Q9 A0i;
    public C21010yW A0j;
    public AnonymousClass190 A0k;
    public AnonymousClass3PI A0l;
    public C32711e4 A0m;
    public AnonymousClass1RJ A0n;
    public C21570zS A0o;
    public AnonymousClass005 A0p;
    public String[] A0q;
    public C130526Lk A0r;
    public C33941gB A0s;
    public AnonymousClass4QA A0t;
    public boolean A0u;
    public boolean A0v;
    public final ConditionVariable A0w;
    public final C226515g A0x;
    public volatile boolean A0y;

    private void A07() {
        this.A04.Boy(new C1503374w(this, AccountManager.get(this).addAccount("com.google", (String) null, (String[]) null, (Bundle) null, this, (AccountManagerCallback) null, (Handler) null), new AuthRequestDialogFragment(), 34));
    }

    public static void A0I(SettingsGoogleDrive settingsGoogleDrive) {
        SettingsGoogleDrive settingsGoogleDrive2 = settingsGoogleDrive;
        C24341Cb r0 = settingsGoogleDrive.A0e;
        C226515g r1 = settingsGoogleDrive.A0x;
        if (r0.A04(r1) && settingsGoogleDrive.A0e.A03(r1)) {
            settingsGoogleDrive.A0Y.A06(10);
            settingsGoogleDrive.A0b.A05.A0C(false);
            settingsGoogleDrive.A0b.A0B.A0C(false);
            AnonymousClass2RM r12 = new AnonymousClass2RM();
            r12.A05 = C90484aE.A0g();
            r12.A04 = 0;
            r12.A02 = C36361kB.A0i();
            C144596sV r10 = settingsGoogleDrive.A0h;
            C20060wx r9 = settingsGoogleDrive.A08;
            SettingsGoogleDrive settingsGoogleDrive3 = settingsGoogleDrive2;
            r10.A02(new C71783hK(settingsGoogleDrive2, settingsGoogleDrive3, settingsGoogleDrive.A0T, settingsGoogleDrive.A0g, settingsGoogleDrive.A00, r9, r10, new C148436yr(settingsGoogleDrive2, r12)), 0);
        }
    }

    public void onDestroy() {
        this.A0u = true;
        this.A0b.A0d.set(false);
        unbindService(this.A0b.A00);
        super.onDestroy();
    }

    public class AuthRequestDialogFragment extends Hilt_SettingsGoogleDrive_AuthRequestDialogFragment {
        public Dialog A1a(Bundle bundle) {
            C36571kW r2 = new C36571kW(A1D());
            r2.setTitle(R.string.f12nameremoved);
            r2.setIndeterminate(true);
            r2.setMessage(A0n(R.string.f12nameremoved));
            r2.setCancelable(true);
            AnonymousClass4XV.A00(r2, this, 7);
            return r2;
        }
    }

    public static int A01(SettingsGoogleDrive settingsGoogleDrive, boolean z) {
        if (z) {
            return 1;
        }
        C20810yC r2 = settingsGoogleDrive.A0D;
        if (A0Q(settingsGoogleDrive.A0U, settingsGoogleDrive.A09, r2)) {
            return 2;
        }
        if (settingsGoogleDrive.A0V.A01()) {
            return 4;
        }
        if (!((AnonymousClass1RU) settingsGoogleDrive.A0p.get()).A0A() || C36371kC.A1U(C36331k8.A06(settingsGoogleDrive), "backup_warning_shown")) {
            return 0;
        }
        return 3;
    }

    private void A0F(int i, int i2, int i3, int i4, int i5) {
        C36391kE.A1C(getResources(), this.A05, C224514j.A00(this, i, i2));
        ImageView A0G2 = C36401kF.A0G(this.A05, R.id.banner_icon);
        C012005e.A0F(AnonymousClass00F.A04(this, i3), A0G2);
        A0G2.setImageDrawable(C36381kD.A0H(this, i4));
        C90504aG.A11(this, A0G2, i5);
        C36361kB.A0v(this, R.id.banner_title);
        this.A05.setVisibility(0);
    }

    public static void A0H(SettingsGoogleDrive settingsGoogleDrive) {
        Log.i("settings-gdrive/cancel-backup");
        C36341k9.A19(settingsGoogleDrive.A0b.A09, false);
        settingsGoogleDrive.A0Y.A04();
        if (AnonymousClass6Y6.A08(settingsGoogleDrive.A0D)) {
            try {
                Iterator A13 = C90514aH.A13(C90514aH.A0V(settingsGoogleDrive.A0o).A04("com.whatsapp.backup.google.google-backup-worker").get());
                while (A13.hasNext()) {
                    if (!AnonymousClass6GL.A01(((AnonymousClass6DP) A13.next()).A00)) {
                        C90514aH.A0V(settingsGoogleDrive.A0o).A0B("com.whatsapp.backup.google.google-backup-worker");
                        return;
                    }
                }
            } catch (InterruptedException | ExecutionException unused) {
                Log.e("settings-gdrive/cancel-backup couldn't get work info for BackupWorker.");
            }
        }
    }

    public static void A0K(SettingsGoogleDrive settingsGoogleDrive, int i) {
        TextView textView = settingsGoogleDrive.A0I;
        int i2 = 8;
        if (i == 13) {
            textView.setText(R.string.f12nameremoved);
            textView = settingsGoogleDrive.A0I;
            i2 = 0;
        }
        textView.setVisibility(i2);
    }

    public static void A0L(SettingsGoogleDrive settingsGoogleDrive, String str, String str2) {
        settingsGoogleDrive.A0w.open();
        C90484aE.A1A(settingsGoogleDrive);
        if (str != null) {
            SettingsGoogleDriveViewModel settingsGoogleDriveViewModel = settingsGoogleDrive.A0b;
            C19420v0 r2 = settingsGoogleDriveViewModel.A0Y;
            if (!TextUtils.equals(r2.A0c(), str2)) {
                r2.A1R(str2);
                r2.A18(10);
                C36341k9.A16(settingsGoogleDriveViewModel.A0D, 10);
                AnonymousClass6FS r22 = settingsGoogleDriveViewModel.A0T;
                synchronized (r22.A0B) {
                    r22.A00 = null;
                }
                C90464aC.A1I("gdrive-setting-view-model/update-account-name new accountName is ", str2, AnonymousClass000.A0u());
                settingsGoogleDriveViewModel.A02.A0D(str2);
                settingsGoogleDriveViewModel.A0T();
                Intent A14 = AnonymousClass190.A14(settingsGoogleDrive, "action_fetch_backup_info");
                A14.putExtra("account_name", str2);
                C111795cr.A01(settingsGoogleDrive, A14);
            } else {
                C90464aC.A1I("gdrive-setting-view-model/update-account-name account unchanged, token received for ", str2, AnonymousClass000.A0u());
            }
        }
        C1497072l.A00(settingsGoogleDrive.A04, settingsGoogleDrive, 25);
    }

    public static void A0M(SettingsGoogleDrive settingsGoogleDrive, String str, String str2, int i, boolean z) {
        View A022;
        SettingsGoogleDrive settingsGoogleDrive2 = settingsGoogleDrive;
        int i2 = i;
        if (i2 == 1) {
            settingsGoogleDrive2.A0F(R.attr.f4nameremoved, R.color.f6nameremoved, R.color.f6nameremoved, R.drawable.ic_warning, R.color.f6nameremoved);
            TextEmojiLabel A0O2 = C36401kF.A0O(settingsGoogleDrive.A05, R.id.banner_description);
            A0O2.setClickable(AnonymousClass000.A1V(settingsGoogleDrive.A02));
            A0O2.setOnClickListener(settingsGoogleDrive.A02);
            if (!TextUtils.isEmpty(str2)) {
                A0O2.A0I(Html.fromHtml(str2));
            } else {
                Object[] objArr = new Object[1];
                C36421kH.A0k(settingsGoogleDrive, R.string.f12nameremoved, 0, objArr);
                C36341k9.A0s(settingsGoogleDrive, A0O2, objArr, R.string.f12nameremoved);
            }
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C03570Gk.A0B(settingsGoogleDrive, R.id.banner_title);
            if (!TextUtils.isEmpty(str)) {
                textEmojiLabel.A0I(Html.fromHtml(str));
                textEmojiLabel.setVisibility(0);
            } else {
                textEmojiLabel.setVisibility(8);
            }
            A022 = C012005e.A02(settingsGoogleDrive.A05, R.id.close);
            if (z) {
                A022.setVisibility(0);
                C36421kH.A10(A022, settingsGoogleDrive, 19);
                return;
            }
        } else if (i2 == 2) {
            settingsGoogleDrive2.A0F(R.attr.f4nameremoved, R.color.f6nameremoved, R.color.f6nameremoved, R.drawable.ic_backup_small, R.color.f6nameremoved);
            C130526Lk r9 = settingsGoogleDrive.A0r;
            if (r9 == null) {
                C20810yC r15 = settingsGoogleDrive.A0D;
                AnonymousClass190 r3 = settingsGoogleDrive.A0k;
                C21010yW r2 = settingsGoogleDrive.A0j;
                C24801Dv r11 = settingsGoogleDrive.A01;
                AnonymousClass1N3 r12 = settingsGoogleDrive.A04;
                C19420v0 r14 = settingsGoogleDrive.A09;
                r9 = new C130526Lk(settingsGoogleDrive2.A05, r11, r12, settingsGoogleDrive.A0U, r14, r15, r2, r3);
                settingsGoogleDrive2.A0r = r9;
            }
            C20810yC r4 = r9.A06;
            if (A0Q(r9.A04, r9.A05, r4) && !r9.A00) {
                View view = r9.A01;
                Context context = view.getContext();
                C36351kA.A0O(view, R.id.banner_description).A0I(Html.fromHtml(C36391kE.A0v(context, AnonymousClass14B.A03(context, C36381kD.A01(context)), new Object[1], 0, R.string.f12nameremoved)));
                C36411kG.A1C(view, r9, context, 8);
                C36411kG.A1C(C012005e.A02(view, R.id.close), r9, view, 9);
                view.setVisibility(0);
                r9.A00 = true;
                C130526Lk.A00(r9, 1);
                return;
            }
            return;
        } else if (i2 == 3) {
            settingsGoogleDrive2.A0F(R.attr.f4nameremoved, R.color.f6nameremoved, R.color.f6nameremoved, R.drawable.ic_backup_small, R.color.f6nameremoved);
            AnonymousClass005 r22 = settingsGoogleDrive.A0p;
            C53282r4.A00(settingsGoogleDrive, settingsGoogleDrive.A05, settingsGoogleDrive.A09, r22);
            return;
        } else if (i2 != 4) {
            A022 = settingsGoogleDrive.A05;
        } else {
            settingsGoogleDrive2.A0F(R.attr.f4nameremoved, R.color.f6nameremoved, R.color.f6nameremoved, R.drawable.ic_backup_small, R.color.f6nameremoved);
            C33941gB r5 = settingsGoogleDrive.A0s;
            if (r5 == null) {
                C20810yC r142 = settingsGoogleDrive.A0D;
                C21010yW r152 = settingsGoogleDrive.A0j;
                C24801Dv r8 = settingsGoogleDrive.A01;
                C18820ts r13 = settingsGoogleDrive.A00;
                C19420v0 r122 = settingsGoogleDrive2.A09;
                r5 = new C33941gB(settingsGoogleDrive2, settingsGoogleDrive2.A05, r8, (C33571fa) null, settingsGoogleDrive2.A0U, settingsGoogleDrive2.A0V, r122, r13, r142, r152, 1);
                settingsGoogleDrive2.A0s = r5;
            }
            r5.A01();
            return;
        }
        A022.setVisibility(8);
    }

    public void A2F() {
        if (!this.A0v) {
            this.A0v = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r1 = A0L2.A5g;
            C90464aC.A11(r1, this);
            C18830tt r3 = r1.A00;
            C90464aC.A0y(r1, r3, this, C36321k7.A05(r1, r3, this));
            this.A0f = C36351kA.A0W(r1);
            this.A0k = C36351kA.A0h(r1);
            this.A0j = C36351kA.A0g(r1);
            this.A0O = C19470v6.A00;
            this.A0m = (C32711e4) r3.A2Z.get();
            this.A0o = (C21570zS) r1.A9Z.get();
            this.A0W = (C24431Ck) r1.A2z.get();
            this.A0T = (C24331Ca) r1.ABI.get();
            this.A0e = C36431kI.A0a(r1);
            this.A0h = (C144596sV) r1.AQW.get();
            this.A0i = (AnonymousClass1Q9) r1.A5D.get();
            this.A0l = C27111My.A3F(A0L2);
            this.A0c = C36381kD.A0X(r1);
            this.A0Y = (AnonymousClass6FS) r1.A3g.get();
            this.A0g = C36351kA.A0X(r1);
            this.A0p = C18840tu.A00(r1.A08);
            this.A0d = C90504aG.A0N(r3);
            this.A0U = (C24461Cn) r1.A0c.get();
            this.A0V = C27111My.A08(A0L2);
            this.A0X = (C33101ei) r1.A3f.get();
            this.A0a = (C33161ep) r1.A3j.get();
            this.A0Z = (C33171eq) r1.A3i.get();
        }
    }

    public /* synthetic */ void A3i() {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            i = R.string.f12nameremoved;
        } else {
            i = R.string.f12nameremoved;
            if (i2 < 33) {
                i = R.string.f12nameremoved;
            }
        }
        RequestPermissionActivity.A07(this, i, R.string.f12nameremoved);
    }

    public void Bgl(String[] strArr, int i, int i2) {
        String str;
        if (i == 10) {
            int[] iArr = SettingsGoogleDriveViewModel.A0f;
            StringBuilder A0u2 = AnonymousClass000.A0u();
            if (i2 > 5) {
                str = AnonymousClass000.A0r("settings-gdrive/change-freq/unexpected-choice/", A0u2, i2);
            } else {
                A0u2.append("settings-gdrive/change-freq/index:");
                A0u2.append(i2);
                A0u2.append("/value:");
                C36321k7.A1Y(A0u2, iArr[i2]);
                int A0C2 = this.A09.A0C();
                int i3 = iArr[i2];
                if (!this.A0b.A0V(i3)) {
                    str = "settings-gdrive/change-freq failed to set the new frequency.";
                } else if (i3 == 0) {
                    this.A09.A18(10);
                    A0K(this, 10);
                    this.A05.setVisibility(8);
                    if (C36341k9.A0E(this.A09).getLong("gdrive_next_prompt_for_setup_timestamp", -1) < System.currentTimeMillis() + 2592000000L) {
                        this.A09.A1G(System.currentTimeMillis() + 2592000000L);
                        return;
                    }
                    return;
                } else if (A0C2 == 0) {
                    if (this.A05.getVisibility() != 0) {
                        int A0E2 = this.A09.A0E();
                        A0M(this, (String) null, (String) null, A01(this, C36381kD.A1U(A0E2, 10)), true);
                        A0K(this, A0E2);
                    }
                    if (C90514aH.A0G(this) != 1 && !AnonymousClass6Y6.A05(this.A09) && TextUtils.isEmpty(C90524aI.A0f(this))) {
                        this.A04.performClick();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            Log.e(str);
        } else if (i != 17) {
            throw C90464aC.A0R("unexpected dialog box: ", AnonymousClass000.A0u(), i);
        } else if (strArr[i2].equals(getString(R.string.f12nameremoved))) {
            A07();
        } else {
            A0O(strArr[i2]);
        }
    }

    public Dialog onCreateDialog(int i) {
        if (i == 600) {
            return AnonymousClass3RQ.A01(this);
        }
        if (i != 602) {
            return super.onCreateDialog(i);
        }
        return AnonymousClass3RQ.A00(this);
    }

    public void onPause() {
        C24341Cb r0 = this.A0e;
        AnonymousClass4QA r1 = this.A0t;
        if (r1 != null) {
            r0.A01.remove(r1);
        }
        super.onPause();
    }

    public SettingsGoogleDrive(int i) {
        this.A0v = false;
        C163027pX.A00(this, 15);
    }

    public static void A0G(AuthRequestDialogFragment authRequestDialogFragment, SettingsGoogleDrive settingsGoogleDrive, String str) {
        C18740tg.A00();
        C90464aC.A1I("settings-gdrive/auth-request account being used is ", str, AnonymousClass000.A0u());
        settingsGoogleDrive.A0y = false;
        settingsGoogleDrive.A05.A0H(new AVa(settingsGoogleDrive, authRequestDialogFragment, 13));
        ConditionVariable conditionVariable = settingsGoogleDrive.A0w;
        conditionVariable.close();
        C1502274l.A00(settingsGoogleDrive.A04, settingsGoogleDrive, authRequestDialogFragment, str, 12);
        Log.i("settings-gdrive/auth-request blocking on tokenReceived");
        C224214g r3 = new C224214g("settings-gdrive/fetch-auth-token");
        conditionVariable.block(AnonymousClass6X5.A0L);
        settingsGoogleDrive.A05.A0H(new AVa(settingsGoogleDrive, r3, 16));
    }

    public static void A0J(SettingsGoogleDrive settingsGoogleDrive) {
        int i;
        C18740tg.A01();
        if (!A0h(settingsGoogleDrive)) {
            if (C90514aH.A0G(settingsGoogleDrive) == 1) {
                Log.i("settings-gdrive/account-selector/backup/running");
                i = R.string.f12nameremoved;
            } else if (AnonymousClass6Y6.A05(settingsGoogleDrive.A09)) {
                Log.i("settings-gdrive/account-selector/restore/running");
                i = R.string.f12nameremoved;
            } else if (settingsGoogleDrive.A0g.A02("android.permission.GET_ACCOUNTS") != 0 || !settingsGoogleDrive.A0c.A00()) {
                C90504aG.A19(settingsGoogleDrive);
                return;
            } else {
                String A0f2 = C90524aI.A0f(settingsGoogleDrive);
                Account[] accountsByType = AccountManager.get(settingsGoogleDrive).getAccountsByType("com.google");
                int length = accountsByType.length;
                if (length > 0) {
                    C36321k7.A1T("settings-gdrive/account-selector/starting-account-picker/num-accounts/", AnonymousClass000.A0u(), length);
                    int i2 = -1;
                    int i3 = length + 1;
                    String[] strArr = new String[i3];
                    int i4 = 0;
                    do {
                        strArr[i4] = accountsByType[i4].name;
                        if (A0f2 != null && A0f2.equals(strArr[i4])) {
                            i2 = i4;
                        }
                        i4++;
                    } while (i4 < length);
                    C36421kH.A0k(settingsGoogleDrive, R.string.f12nameremoved, i3 - 1, strArr);
                    SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
                    Bundle A0N2 = C90484aE.A0N(settingsGoogleDrive);
                    A0N2.putInt("selected_item_index", i2);
                    A0N2.putStringArray("multi_line_list_items_key", strArr);
                    singleChoiceListDialogFragment.A17(A0N2);
                    if (settingsGoogleDrive.getSupportFragmentManager().A0N("account-picker") == null) {
                        AnonymousClass09Y A0O2 = C36341k9.A0O(settingsGoogleDrive);
                        A0O2.A0D(singleChoiceListDialogFragment, "account-picker");
                        A0O2.A00(true);
                        return;
                    }
                    return;
                }
                Log.i("settings-gdrive/account-selector/no-account-found/start-add-account-activity");
                settingsGoogleDrive.A07();
                return;
            }
            settingsGoogleDrive.BO5(i);
        }
    }

    private void A0O(String str) {
        C90464aC.A1I("setting-gdrive/activity-result/account-picker accountName is ", str, AnonymousClass000.A0u());
        if (str != null) {
            C1502274l.A00(this.A04, this, new AuthRequestDialogFragment(), str, 15);
        } else if (C90524aI.A0f(this) == null) {
            Log.i("setting-gdrive/activity-result/account-picker accountName is null");
            this.A0b.A0V(0);
        }
    }

    public static final boolean A0Q(C24461Cn r5, C19420v0 r6, C20810yC r7) {
        C36321k7.A0w(r7, r6);
        AnonymousClass00C.A0D(r5, 2);
        if (r7.A0E(4774) && !AnonymousClass6YN.A0A(r5, r7) && !C36371kC.A1U(C36411kG.A0E(r5.A01), "_new_user")) {
            AnonymousClass005 r3 = r6.A00;
            if (!C36391kE.A0H(r3).getBoolean("bg_gpb", true) || C36371kC.A01(C36391kE.A0H(r3), "bg_gpb_count") >= 2) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A0h(SettingsGoogleDrive settingsGoogleDrive) {
        if (AnonymousClass3SJ.A04(settingsGoogleDrive) || settingsGoogleDrive.A0u) {
            return true;
        }
        return false;
    }

    public void BVh(int i) {
        String str;
        switch (i) {
            case 12:
                str = "settings-gdrive/cancel-media-restore-dialog/user-decided-not-to-cancel";
                break;
            case 13:
                str = "settings-gdrive/perform-backup user declined to perform Google storage backup over cellular (when the settings say Wi-Fi only)";
                break;
            case 15:
                str = "settings-gdrive/user-declined-to-restore-media-over-cellular";
                break;
            case 16:
                str = "settings-gdrive/user-declined-to-backup-over-cellular";
                break;
            case 18:
                str = "settings-gdrive/user-declined-to-cancel-encrypted-backup";
                break;
            default:
                throw C90464aC.A0R("unexpected dialog box: ", AnonymousClass000.A0u(), i);
        }
        Log.i(str);
    }

    public void BVi(int i) {
        throw C90464aC.A0R("unexpected dialog box: ", AnonymousClass000.A0u(), i);
    }

    public void BVj(int i) {
        switch (i) {
            case 12:
                this.A0Y.A04();
                return;
            case 13:
                Log.i("settings-gdrive/perform-backup user decided to perform Google storage backup over cellular (when the settings say Wi-Fi only)");
                this.A0X.A01();
                C111795cr.A00(this, this.A0Y);
                return;
            case 14:
                Log.i("settings-gdrive/google-play-services-is-broken");
                this.A0b.A0V(0);
                return;
            case 15:
                Log.i("settings-gdrive/user-confirmed-media-restore-over-cellular");
                this.A0X.A02();
                return;
            case 16:
                Log.i("settings-gdrive/user-confirmed-backup-over-cellular");
                this.A0X.A01();
                return;
            case 18:
                Log.i("settings-gdrive/user-confirmed-cancel-encrypted-backup");
                A0H(this);
                return;
            default:
                throw C90464aC.A0R("unexpected dialog box: ", AnonymousClass000.A0u(), i);
        }
    }

    public void BVr(int i) {
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("settings-gdrive/dialogId-");
        A0u2.append(i);
        C36321k7.A1a(A0u2, "-dismissed");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C19770wU r2;
        Runnable r1;
        String str;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("settings-gdrive/activity-result request: ");
        A0u2.append(i);
        C36321k7.A1T(" result: ", A0u2, i2);
        super.onActivityResult(i, i2, intent);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    String str2 = null;
                    if (intent != null) {
                        str = intent.getStringExtra("authAccount");
                    } else {
                        str = null;
                    }
                    if (i2 == -1) {
                        str2 = str;
                    }
                    A0O(str2);
                    return;
                } else if (i != 150) {
                    if (i == 151 && i2 == -1) {
                        if (this.A09.A0E() == 23) {
                            this.A0Y.A06(10);
                        }
                        if (AnonymousClass6Y6.A05(this.A09) || this.A09.A0F() == 1) {
                            C33101ei r3 = this.A0X;
                            r3.A0O.Boy(new C35671j4(r3, 6));
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (i2 == -1) {
                    A0J(this);
                    return;
                } else {
                    return;
                }
            } else if (i2 == -1) {
                C18740tg.A06(intent);
                A0L(this, intent.getStringExtra("authtoken"), intent.getStringExtra("authAccount"));
                return;
            } else {
                C90484aE.A1A(this);
                return;
            }
        } else if (i2 == -1) {
            SettingsGoogleDriveViewModel settingsGoogleDriveViewModel = this.A0b;
            C36341k9.A18(settingsGoogleDriveViewModel.A0A, settingsGoogleDriveViewModel.A0Q.A03.A2I());
            String A0f2 = C90524aI.A0f(this);
            if (A0f2 == null || this.A09.A0U(A0f2) == -1) {
                r2 = this.A04;
                r1 = new C1497072l(this, 23);
            } else if (this.A09.A2T(A0f2) && !this.A09.A2I()) {
                PhoneUserJid A0n2 = C36441kJ.A0n(this.A02);
                if (A0n2 != null) {
                    this.A0Z.A01(new AnonymousClass29N(this));
                    Intent A14 = AnonymousClass190.A14(this, "action_delete");
                    A14.putExtra("account_name", C90524aI.A0f(this));
                    A14.putExtra("jid_user", A0n2.user);
                    r2 = this.A04;
                    r1 = new AVa(this, A14, 11);
                } else {
                    return;
                }
            } else if (this.A09.A2T(A0f2) || !this.A09.A2I()) {
                return;
            }
            r2.Boy(r1);
            return;
        } else {
            return;
        }
        A0I(this);
    }

    public void onBackPressed() {
        if (isTaskRoot()) {
            startActivity(AnonymousClass190.A09(this));
        }
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a7, code lost:
        if (r3 != 4) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0077, code lost:
        if (X.AnonymousClass6Y6.A05(r6) != false) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onCreate(r11)
            X.04H r1 = X.C36441kJ.A0b(r10)
            java.lang.Class<com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel> r0 = com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel.class
            X.04R r8 = r1.A00(r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r8 = (com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel) r8
            r10.A0b = r8
            android.os.Bundle r7 = X.C36371kC.A0H(r10)
            X.0wD r0 = r8.A0X
            r0.registerObserver(r8)
            X.00s r1 = r8.A0F
            X.0v0 r6 = r8.A0Y
            boolean r0 = r6.A2E()
            X.C36341k9.A18(r1, r0)
            java.lang.String r5 = r6.A0c()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = -1
            if (r0 != 0) goto L_0x0053
            android.content.SharedPreferences r4 = X.C36341k9.A0E(r6)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "gdrive_last_successful_backup_video_size:"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r5, r3)
            long r2 = r4.getLong(r0, r1)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0053
            X.00s r1 = r8.A0O
            X.4yb r0 = new X.4yb
            r0.<init>(r2)
            r1.A0D(r0)
        L_0x0053:
            X.00s r1 = r8.A02
            java.lang.String r0 = r6.A0c()
            r1.A0D(r0)
            X.00s r1 = r8.A04
            int r0 = r6.A0C()
            X.C36341k9.A16(r1, r0)
            X.00s r3 = r8.A07
            X.1ei r0 = r8.A0S
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0Q
            boolean r0 = r0.get()
            r2 = 1
            if (r0 != 0) goto L_0x0079
            boolean r1 = X.AnonymousClass6Y6.A05(r6)
            r0 = 1
            if (r1 == 0) goto L_0x007a
        L_0x0079:
            r0 = 0
        L_0x007a:
            X.C36341k9.A18(r3, r0)
            X.1Cn r0 = r8.A0P
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x008f
            r0 = 62
            r8.A0U(r2, r0)
            X.00s r0 = r8.A0I
            X.C36341k9.A18(r0, r2)
        L_0x008f:
            if (r7 == 0) goto L_0x00a9
            java.lang.String r0 = "entry_point"
            r4 = 1
            int r3 = r7.getInt(r0, r2)
            X.2NH r1 = new X.2NH
            r1.<init>()
            r0 = 0
            if (r3 == r2) goto L_0x039b
            r0 = 2
            if (r3 == r0) goto L_0x03a0
            r4 = 3
            if (r3 == r4) goto L_0x039b
            r0 = 4
            if (r3 == r0) goto L_0x03a0
        L_0x00a9:
            X.6sR r0 = new X.6sR
            r0.<init>(r10)
            r10.A0t = r0
            r0 = 2131894104(0x7f121f58, float:1.9423003E38)
            r10.setTitle(r0)
            r0 = 2131624069(0x7f0e0085, float:1.8875307E38)
            r10.setContentView((int) r0)
            X.07B r0 = X.C36381kD.A0O(r10)
            r3 = 1
            r0.A0U(r2)
            r0 = 2131427900(0x7f0b023c, float:1.847743E38)
            android.view.View r0 = X.C03570Gk.A0B(r10, r0)
            r10.A05 = r0
            r0 = 2131433967(0x7f0b19ef, float:1.8489735E38)
            android.view.View r1 = X.C03570Gk.A0B(r10, r0)
            X.1RJ r0 = new X.1RJ
            r0.<init>(r1)
            r10.A0n = r0
            r0 = 2131433962(0x7f0b19ea, float:1.8489724E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A04 = r0
            r0 = 2131433956(0x7f0b19e4, float:1.8489712E38)
            android.widget.TextView r0 = X.C36401kF.A0H(r10, r0)
            r10.A0E = r0
            r0 = 2131430553(0x7f0b0c99, float:1.848281E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r10.A0A = r0
            r0 = 2131430554(0x7f0b0c9a, float:1.8482812E38)
            android.widget.TextView r0 = X.C36391kE.A0Q(r10, r0)
            r10.A0G = r0
            r0 = 2131430573(0x7f0b0cad, float:1.848285E38)
            android.view.View r0 = X.C03570Gk.A0B(r10, r0)
            com.whatsapp.TextEmojiLabel r0 = (com.whatsapp.TextEmojiLabel) r0
            r10.A0P = r0
            r0 = 2131430558(0x7f0b0c9e, float:1.848282E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r10.A0D = r0
            r0 = 2130970135(0x7f040617, float:1.7548972E38)
            int r0 = X.C224314h.A01(r10, r0)
            X.AnonymousClass00F.A00(r10, r0)
            r0 = 2131428563(0x7f0b04d3, float:1.8478774E38)
            android.widget.ImageView r0 = X.C36411kG.A0Q(r10, r0)
            r10.A0B = r0
            r0 = 2131433418(0x7f0b17ca, float:1.8488621E38)
            android.widget.ImageView r0 = X.C36411kG.A0Q(r10, r0)
            r10.A0C = r0
            r0 = 2131433963(0x7f0b19eb, float:1.8489727E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A07 = r0
            r0 = 2131433960(0x7f0b19e8, float:1.848972E38)
            android.widget.TextView r0 = X.C36391kE.A0Q(r10, r0)
            r10.A0F = r0
            r0 = 2131433968(0x7f0b19f0, float:1.8489737E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A09 = r0
            r0 = 2131430483(0x7f0b0c53, float:1.8482668E38)
            android.view.View r0 = r10.findViewById(r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r10.A0N = r0
            r0 = 2131433957(0x7f0b19e5, float:1.8489714E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A08 = r0
            r0 = 2131433964(0x7f0b19ec, float:1.8489729E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A06 = r0
            r0 = 2131433966(0x7f0b19ee, float:1.8489733E38)
            android.view.View r0 = r10.findViewById(r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r10.A0R = r0
            r0 = 2131433955(0x7f0b19e3, float:1.848971E38)
            android.view.View r0 = r10.findViewById(r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r10.A0S = r0
            r0 = 2131430473(0x7f0b0c49, float:1.8482648E38)
            android.view.View r0 = r10.findViewById(r0)
            com.whatsapp.WaLinearLayout r0 = (com.whatsapp.WaLinearLayout) r0
            r10.A0Q = r0
            r0 = 2131430889(0x7f0b0de9, float:1.8483492E38)
            android.view.View r0 = r10.findViewById(r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r10.A0M = r0
            r0 = 2131430890(0x7f0b0dea, float:1.8483494E38)
            android.widget.TextView r0 = X.C36401kF.A0H(r10, r0)
            r10.A0L = r0
            r0 = 2131431296(0x7f0b0f80, float:1.8484317E38)
            android.widget.TextView r0 = X.C36401kF.A0H(r10, r0)
            r10.A0K = r0
            r0 = 2131430476(0x7f0b0c4c, float:1.8482654E38)
            android.widget.TextView r0 = X.C36401kF.A0H(r10, r0)
            r10.A0J = r0
            r0 = 2131430474(0x7f0b0c4a, float:1.848265E38)
            android.widget.TextView r0 = X.C36401kF.A0H(r10, r0)
            r10.A0H = r0
            r0 = 2131430475(0x7f0b0c4b, float:1.8482652E38)
            android.widget.TextView r0 = X.C36401kF.A0H(r10, r0)
            r10.A0I = r0
            X.0v0 r0 = r10.A09
            int r0 = r0.A0E()
            A0K(r10, r0)
            int[] r8 = com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel.A0e
            r0 = 5
            r7 = 5
            java.lang.String[] r0 = new java.lang.String[r0]
            r10.A0q = r0
            r6 = 0
            r5 = 0
        L_0x01d7:
            r1 = r8[r5]
            r4 = 2131894148(0x7f121f84, float:1.9423093E38)
            if (r1 != r4) goto L_0x0394
            java.lang.String[] r2 = r10.A0q
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131886640(0x7f120230, float:1.9407865E38)
            java.lang.String r0 = X.C36341k9.A0e(r10, r1, r0, r6, r4)
            r2[r5] = r0
        L_0x01eb:
            int r5 = r5 + 1
            if (r5 < r7) goto L_0x01d7
            android.view.View r1 = r10.A06
            r0 = 25
            X.C48732hx.A00(r1, r10, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r1 = r0.A0H
            r0 = 31
            X.C165147sx.A01(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r1 = r0.A0O
            r0 = 12
            X.C165147sx.A01(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r0 = r0.A0J
            r4 = 28
            X.C165147sx.A01(r10, r0, r4)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r1 = r0.A0F
            r0 = 24
            X.C165147sx.A01(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r1 = r0.A02
            r0 = 30
            X.C165147sx.A01(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r1 = r0.A04
            r0 = 29
            X.C165147sx.A01(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r1 = r0.A0M
            r0 = 22
            X.C165147sx.A01(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r1 = r0.A0K
            r0 = 21
            X.C165147sx.A01(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r1 = r0.A0L
            r0 = 26
            X.C165147sx.A01(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r0 = r0.A09
            r5 = 16
            X.C165147sx.A01(r10, r0, r5)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r1 = r0.A0N
            r0 = 23
            X.C165147sx.A01(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r0 = r0.A0B
            r6 = 18
            X.C165147sx.A01(r10, r0, r6)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r0 = r0.A06
            r9 = 14
            X.C165147sx.A01(r10, r0, r9)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r0 = r0.A07
            r8 = 15
            X.C165147sx.A01(r10, r0, r8)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r1 = r0.A05
            r0 = 13
            X.C165147sx.A01(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r1 = r0.A08
            r0 = 10
            X.C165147sx.A01(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r1 = r0.A0D
            r0 = 25
            X.C165147sx.A01(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r1 = r0.A0E
            r0 = 11
            X.C165147sx.A01(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r0 = r0.A0C
            X.08S r1 = X.AnonymousClass0VV.A01(r0)
            r0 = 19
            X.C165147sx.A01(r10, r1, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r0 = r0.A0A
            r7 = 17
            X.C165147sx.A01(r10, r0, r7)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r1 = r0.A0I
            r0 = 20
            X.C165147sx.A01(r10, r1, r0)
            androidx.appcompat.widget.SwitchCompat r1 = r10.A0N
            X.0v0 r0 = r10.A09
            int r0 = r0.A0D()
            r2 = 0
            boolean r0 = X.AnonymousClass000.A1S(r0, r3)
            r1.setChecked(r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r1 = r0.A0A
            X.1Ck r0 = r0.A0Q
            X.0v0 r0 = r0.A03
            boolean r0 = r0.A2I()
            X.C36341k9.A18(r1, r0)
            X.6cg r0 = new X.6cg
            r0.<init>(r10, r4)
            r10.A03 = r0
            X.6cg r0 = new X.6cg
            r0.<init>(r10, r9)
            r10.A00 = r0
            X.6cg r0 = new X.6cg
            r0.<init>(r10, r8)
            r10.A01 = r0
            android.widget.Button r0 = r10.A0A
            X.C36421kH.A10(r0, r10, r5)
            X.6cg r5 = new X.6cg
            r5.<init>(r10, r7)
            android.widget.ImageView r1 = r10.A0B
            android.view.View$OnClickListener r0 = r10.A00
            r1.setOnClickListener(r0)
            android.widget.ImageView r0 = r10.A0C
            X.C36421kH.A10(r0, r10, r6)
            com.whatsapp.TextEmojiLabel r0 = r10.A0P
            java.lang.String r1 = X.C36371kC.A0u(r0)
            X.72l r0 = new X.72l
            r0.<init>(r10, r4)
            android.text.SpannableStringBuilder r4 = X.C32711e4.A01(r10, r0, r1)
            com.whatsapp.TextEmojiLabel r1 = r10.A0P
            X.0yC r0 = r10.A0D
            X.C36331k8.A1A(r0, r1)
            com.whatsapp.TextEmojiLabel r0 = r10.A0P
            r0.setText(r4)
            android.view.View r0 = r10.A04
            r0.setOnClickListener(r5)
            X.1RJ r4 = r10.A0n
            r1 = 27
            X.6cg r0 = new X.6cg
            r0.<init>(r10, r1)
            r4.A05(r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            r0.A0T()
            android.view.View r0 = r10.A09
            r0.setOnClickListener(r5)
            android.view.View r0 = r10.A07
            r0.setOnClickListener(r5)
            android.view.View r0 = r10.A08
            r0.setOnClickListener(r5)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            X.00s r0 = r0.A03
            X.C165147sx.A01(r10, r0, r1)
            r0 = 0
            android.content.Intent r1 = X.AnonymousClass190.A14(r10, r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r10.A0b
            android.content.ServiceConnection r0 = r0.A00
            r10.bindService(r1, r0, r3)
            X.0wG r0 = r10.A0f
            android.content.Context r0 = r0.A00
            boolean r0 = X.C34191gb.A08(r0)
            if (r0 != 0) goto L_0x0366
            java.lang.String r0 = "settings-gdrive/create google drive access not allowed."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.finish()
        L_0x0366:
            if (r11 == 0) goto L_0x0384
            java.lang.String r0 = "intent_already_parsed"
            boolean r0 = r11.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x0384
        L_0x0370:
            X.3PI r3 = r10.A0l
            android.view.View r2 = r10.A00
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "search_result_key"
            java.lang.String r1 = r1.getStringExtra(r0)
            java.lang.String r0 = "chat_backup"
            r3.A02(r2, r0, r1)
            return
        L_0x0384:
            android.content.Intent r1 = r10.getIntent()
            if (r1 == 0) goto L_0x0370
            java.lang.String r0 = r1.getAction()
            if (r0 == 0) goto L_0x0370
            r10.onNewIntent(r1)
            goto L_0x0370
        L_0x0394:
            java.lang.String[] r0 = r10.A0q
            X.C36421kH.A0k(r10, r1, r5, r0)
            goto L_0x01eb
        L_0x039b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x03a4
        L_0x03a0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
        L_0x03a4:
            r1.A00 = r0
            X.0yW r0 = r8.A0a
            r0.Blw(r1)
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.SettingsGoogleDrive.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        AnonymousClass3L4 r1;
        int i;
        super.onNewIntent(intent);
        String action = intent.getAction();
        C36321k7.A1Q("settings-gdrive/new-intent/action/", action, AnonymousClass000.A0u());
        if (action != null) {
            String str = "action_perform_backup_over_cellular";
            if (!action.equals(str)) {
                str = "action_perform_media_restore_over_cellular";
                if (!action.equals(str)) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("settings-gdrive/new-intent/unexpected-action/");
                    C36321k7.A1Z(A0u2, intent.getAction());
                    return;
                }
                r1 = new AnonymousClass3L4(15);
                i = R.string.f12nameremoved;
            } else {
                r1 = new AnonymousClass3L4(16);
                i = R.string.f12nameremoved;
            }
            C90484aE.A12(this, r1, i);
            r1.A02(false);
            C90484aE.A11(this, r1, R.string.f12nameremoved);
            C90484aE.A19(C36341k9.A0O(this), C90474aD.A0S(this, r1, R.string.f12nameremoved), str);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        onBackPressed();
        return true;
    }

    public void onResume() {
        super.onResume();
        C24341Cb r0 = this.A0e;
        AnonymousClass4QA r1 = this.A0t;
        if (r1 != null) {
            r0.A01.add(r1);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("intent_already_parsed", true);
    }

    public SettingsGoogleDrive() {
        this(0);
        this.A0x = new AnonymousClass3MK(this, 0);
        this.A0w = new ConditionVariable(false);
    }
}
