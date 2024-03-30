package com.whatsapp.backup.google;

import X.AVa;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass07B;
import X.AnonymousClass09Y;
import X.AnonymousClass12P;
import X.AnonymousClass13R;
import X.AnonymousClass190;
import X.AnonymousClass1Q9;
import X.AnonymousClass1QN;
import X.AnonymousClass1RC;
import X.AnonymousClass1RU;
import X.AnonymousClass1X8;
import X.AnonymousClass29P;
import X.AnonymousClass2NP;
import X.AnonymousClass3L4;
import X.AnonymousClass3RQ;
import X.AnonymousClass3SJ;
import X.AnonymousClass3TA;
import X.AnonymousClass3TF;
import X.AnonymousClass3TX;
import X.AnonymousClass3U8;
import X.AnonymousClass3US;
import X.AnonymousClass3UY;
import X.AnonymousClass3YD;
import X.AnonymousClass6FS;
import X.AnonymousClass6PR;
import X.AnonymousClass6UR;
import X.AnonymousClass6Y6;
import X.AnonymousClass6YV;
import X.AnonymousClass73M;
import X.AnonymousClass751;
import X.C001700s;
import X.C03570Gk;
import X.C100804vn;
import X.C107095Mn;
import X.C110185aG;
import X.C111795cr;
import X.C131006Ni;
import X.C131096Ns;
import X.C1497072l;
import X.C162707p1;
import X.C163027pX;
import X.C163317q0;
import X.C165147sx;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C19420v0;
import X.C19460v5;
import X.C19470v6;
import X.C19550w8;
import X.C19630wG;
import X.C19770wU;
import X.C19890wg;
import X.C20020wt;
import X.C20050ww;
import X.C20060wx;
import X.C20310xM;
import X.C203559oI;
import X.C20830yE;
import X.C21010yW;
import X.C21350z4;
import X.C21520zN;
import X.C224314h;
import X.C224514j;
import X.C224714l;
import X.C229216m;
import X.C24051Aw;
import X.C24431Ck;
import X.C24461Cn;
import X.C24801Dv;
import X.C27111My;
import X.C29501Ww;
import X.C33101ei;
import X.C33131el;
import X.C33151eo;
import X.C33171eq;
import X.C33751fs;
import X.C33771fu;
import X.C34191gb;
import X.C34201gc;
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
import X.C429721s;
import X.C55782vB;
import X.C62603Gu;
import X.C62623Gw;
import X.C65983Uf;
import X.C80373vI;
import X.C88344Si;
import X.C88774Tz;
import X.C90464aC;
import X.C90474aD;
import X.C90484aE;
import X.C90494aF;
import X.C90504aG;
import X.C90514aH;
import X.C90524aI;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.app.Dialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Environment;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel;
import com.whatsapp.dialogs.PromptDialogFragment;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class RestoreFromBackupActivity extends C100804vn implements C88344Si, C88774Tz {
    public int A00;
    public Button A01;
    public ProgressBar A02;
    public TextView A03;
    public TextView A04;
    public C19460v5 A05;
    public C20050ww A06;
    public C33771fu A07;
    public AnonymousClass1RU A08;
    public C24461Cn A09;
    public C24431Ck A0A;
    public AnonymousClass6PR A0B;
    public C33101ei A0C;
    public AnonymousClass6FS A0D;
    public C33171eq A0E;
    public GoogleDriveRestoreAnimationView A0F;
    public C131096Ns A0G;
    public RestoreFromBackupViewModel A0H;
    public C229216m A0I;
    public C33751fs A0J;
    public C19630wG A0K;
    public C20830yE A0L;
    public C21350z4 A0M;
    public C20310xM A0N;
    public AnonymousClass1Q9 A0O;
    public C131006Ni A0P;
    public AnonymousClass12P A0Q;
    public AnonymousClass1QN A0R;
    public AnonymousClass13R A0S;
    public C62603Gu A0T;
    public C21520zN A0U;
    public C21010yW A0V;
    public C19890wg A0W;
    public C62623Gw A0X;
    public C29501Ww A0Y;
    public AnonymousClass1X8 A0Z;
    public AnonymousClass3TX A0a;
    public C24051Aw A0b;
    public C20020wt A0c;
    public AnonymousClass005 A0d;
    public String A0e;
    public boolean A0f;
    public boolean A0g = false;
    public boolean A0h;
    public long A0i;
    public long A0j;
    public View A0k;
    public TextView A0l;
    public C107095Mn A0m;
    public boolean A0n;
    public final ServiceConnection A0o;
    public final ConditionVariable A0p;
    public final ConditionVariable A0q;
    public final C33151eo A0r;
    public final C33131el A0s;
    public final List A0t;
    public final Set A0u;
    public final AtomicBoolean A0v;
    public final AtomicBoolean A0w;
    public final AtomicBoolean A0x;
    public final AtomicBoolean A0y;
    public final ConditionVariable A0z;

    public RestoreFromBackupActivity() {
        super(true, false);
        C163027pX.A00(this, 14);
        this.A0t = AnonymousClass001.A0I();
        this.A0u = Collections.newSetFromMap(C90524aI.A0s());
        this.A0z = new ConditionVariable(false);
        this.A0p = new ConditionVariable(false);
        this.A0x = new AtomicBoolean();
        this.A0q = new ConditionVariable(false);
        this.A0v = new AtomicBoolean(false);
        this.A0w = new AtomicBoolean(false);
        this.A0y = new AtomicBoolean(true);
        this.A0o = new C110185aG(this, 1);
        this.A0s = new C162707p1(this, 2);
        this.A0r = new AnonymousClass29P(this);
    }

    private void A0G(int i) {
        boolean A072 = this.A0L.A07();
        int i2 = R.string.f12nameremoved;
        if (A072) {
            i2 = R.string.f12nameremoved;
        }
        RequestPermissionActivity.A0J(this, "google_backup", new int[]{R.drawable.vec_ic_baseline_cloud_upload_48}, i, R.string.f12nameremoved, i2, R.string.f12nameremoved, this.A0L.A0H(), !this.A0I.A00());
    }

    public static void A0I(RestoreFromBackupActivity restoreFromBackupActivity) {
        RestoreFromBackupActivity restoreFromBackupActivity2 = restoreFromBackupActivity;
        restoreFromBackupActivity.A0a.A08("backup_found", "restore");
        if (A0o(restoreFromBackupActivity)) {
            return;
        }
        if (restoreFromBackupActivity.A08.A01() < restoreFromBackupActivity.A0i) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("restore>RestoreFromBackupActivity/perform-restore-initiated/show-restore insufficient storage, available: ");
            A0u2.append(restoreFromBackupActivity.A08.A01());
            A0u2.append(" required: ");
            C36351kA.A1S(A0u2, restoreFromBackupActivity.A0i);
            boolean A002 = C20060wx.A00();
            int i = R.string.f12nameremoved;
            if (A002) {
                i = R.string.f12nameremoved;
            }
            String A0v2 = C36391kE.A0v(restoreFromBackupActivity, AnonymousClass3TF.A03(restoreFromBackupActivity.A00, restoreFromBackupActivity.A0i), new Object[1], 0, i);
            AnonymousClass3L4 r4 = new AnonymousClass3L4(13);
            String string = restoreFromBackupActivity.getString(R.string.f12nameremoved);
            Bundle bundle = r4.A00;
            bundle.putString("title", string);
            bundle.putCharSequence("message", A0v2);
            String string2 = restoreFromBackupActivity.getString(R.string.f12nameremoved);
            if (Build.VERSION.SDK_INT >= 26) {
                string2 = restoreFromBackupActivity.getString(R.string.f12nameremoved);
            }
            bundle.putString("positive_button", string2);
            bundle.putString("neutral_button", restoreFromBackupActivity.getString(R.string.f12nameremoved));
            C36331k8.A12(r4.A00(), restoreFromBackupActivity);
            return;
        }
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append("restore>RestoreFromBackupActivity/perform-restore-initiated/show-restore starting restore from ");
        C36321k7.A1a(A0u3, C34191gb.A07(restoreFromBackupActivity.A0B.A05));
        Log.i("restore>RestoreFromBackupActivity/perform-restore-initiated/show-restore/stopping-approx-transfer-size-calc-thread");
        restoreFromBackupActivity.A0v.set(true);
        AnonymousClass6PR r8 = restoreFromBackupActivity.A0B;
        if (r8.A02) {
            A0L(restoreFromBackupActivity, 2);
            restoreFromBackupActivity.startActivityForResult(AnonymousClass190.A0G(restoreFromBackupActivity, 2), 0);
            return;
        }
        restoreFromBackupActivity.A3n();
        restoreFromBackupActivity2.A04.Boy(new AnonymousClass73M(restoreFromBackupActivity2, r8, r8.A05, 0, r8.A00));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C19770wU r3;
        Runnable r2;
        int i3 = i;
        int i4 = i2;
        if (i3 == 5) {
            C36321k7.A1T("restore>RestoreFromBackupActivity/request-permissions/result/", AnonymousClass000.A0u(), i4);
        } else if (i3 == 6) {
            C36321k7.A1T("restore>RestoreFromBackupActivity/request-permissions-storage-and-contact/result/", AnonymousClass000.A0u(), i4);
            A0i(this, false);
            return;
        } else if (i3 == 2) {
            C36321k7.A1T("restore>RestoreFromBackupActivity/request-to-fix-google-play-services/result/", AnonymousClass000.A0u(), i4);
            A0h(this, false);
            return;
        } else {
            Intent intent2 = intent;
            if (i3 == 1) {
                if (i4 == -1) {
                    C18740tg.A06(intent2);
                    this.A0e = intent2.getStringExtra("authtoken");
                    this.A0q.open();
                    r3 = this.A04;
                    r2 = new C1497072l(this, 17);
                } else {
                    return;
                }
            } else if (i3 == 3) {
                if (i4 == -1) {
                    C18740tg.A06(intent2);
                    C18740tg.A06(intent2.getExtras());
                    String string = intent2.getExtras().getString("authAccount");
                    C34191gb.A07(string);
                    if (string == null) {
                        Log.e("restore>RestoreFromBackupActivity/activity-result/account-picker/no account was provided");
                        return;
                    } else {
                        r3 = this.A04;
                        r2 = new AnonymousClass751(17, string, this);
                    }
                } else {
                    C36321k7.A1S("restore>RestoreFromBackupActivity/activity-result/account-picker-request/", AnonymousClass000.A0u(), i4);
                    A0F();
                    A3l(false);
                    return;
                }
            } else if (i3 == 4) {
                C36321k7.A1T("restore>RestoreFromBackupActivity/activity-result/account-added-request/", AnonymousClass000.A0u(), i4);
                Intent className = C36431kI.A0D().setClassName(getPackageName(), "com.whatsapp.backup.google.RestoreFromBackupActivity");
                className.setAction("action_show_restore_one_time_setup");
                startActivity(className);
                return;
            } else if (i == 0) {
                C36321k7.A1T("restore>RestoreFromBackupActivity/activity-result/password-input-activity/", AnonymousClass000.A0u(), i4);
                if (i4 == -1) {
                    A0L(this, 7);
                    if (this.A0H.A00 == 23) {
                        A3r((C131006Ni) null, 27);
                        A3n();
                        A0Q(this, true);
                        return;
                    }
                    AnonymousClass6PR r13 = this.A0B;
                    A3n();
                    this.A04.Boy(new AnonymousClass73M(this, r13, r13.A05, 0, r13.A00));
                    return;
                }
                return;
            } else if (i3 == 7) {
                A0k(true);
                return;
            } else if (i3 == 8) {
                if (this.A0L.A0H()) {
                    C18740tg.A01();
                    if (!A0n(this)) {
                        AnonymousClass3L4 r1 = new AnonymousClass3L4(22);
                        C90484aE.A10(this, r1, R.string.f12nameremoved);
                        C90484aE.A12(this, r1, R.string.f12nameremoved);
                        r1.A02(false);
                        C90484aE.A11(this, r1, R.string.f12nameremoved);
                        C90484aE.A19(C36341k9.A0O(this), C90474aD.A0S(this, r1, R.string.f12nameremoved), (String) null);
                        return;
                    }
                    return;
                }
            } else if (i3 == 25) {
                if (i4 == 1) {
                    this.A05.A0H(new C1497072l(this, 21));
                    return;
                } else if (i4 == 2) {
                    startActivityForResult(AnonymousClass190.A1M(this, (String) null, false, true), 26);
                    return;
                } else if (i4 == 3) {
                    A3p();
                    return;
                } else {
                    return;
                }
            } else if (i3 != 26) {
                super.onActivityResult(i3, i4, intent2);
                return;
            } else if (i4 == -1) {
                setResult(5);
                finish();
                return;
            } else if (i2 == 0 && this.A0H.A00 == 21) {
                A0J(this);
                setResult(1);
                return;
            } else {
                return;
            }
            r3.Boy(r2);
            return;
        }
        A0h(this, true);
    }

    public void onCreate(Bundle bundle) {
        C131006Ni r0;
        Bundle bundle2;
        AnonymousClass07B A0Q2;
        super.onCreate(bundle);
        AnonymousClass1RC.A05(this, C224314h.A01(this, R.attr.f4nameremoved));
        this.A0H = (RestoreFromBackupViewModel) C36441kJ.A0b(this).A00(RestoreFromBackupViewModel.class);
        if (!C34191gb.A08(this.A0K.A00)) {
            Log.w("restore>RestoreFromBackupActivity/google drive access is not possible");
            setResult(0);
        } else {
            setContentView((int) R.layout.f9nameremoved);
            Toolbar toolbar = (Toolbar) findViewById(R.id.title_toolbar);
            if (!ViewConfiguration.get(getApplicationContext()).hasPermanentMenuKey() && (A0Q2 = C36431kI.A0Q(this, toolbar)) != null) {
                A0Q2.A0U(false);
                A0Q2.A0X(false);
            }
            setTitle(R.string.f12nameremoved);
            findViewById(R.id.gdrive_looking_for_backup_progress_bar);
            AnonymousClass00F.A00(this, C224514j.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved));
            findViewById(R.id.calculating_transfer_size_progress_bar);
            AnonymousClass00F.A00(this, C224514j.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved));
            this.A02 = (ProgressBar) C03570Gk.A0B(this, R.id.google_drive_progress);
            this.A04 = C36401kF.A0H(this, R.id.google_drive_progress_info);
            this.A0k = C03570Gk.A0B(this, R.id.gdrive_restore_encrypted_backup);
            this.A01 = (Button) C03570Gk.A0B(this, R.id.perform_restore);
            this.A03 = C36401kF.A0H(this, R.id.gdrive_restore_info);
            C165147sx.A01(this, this.A0H.A02, 9);
            this.A0h = getApplicationContext().bindService(AnonymousClass190.A14(getApplicationContext(), (String) null), this.A0o, 1);
            if (bundle == null) {
                this.A0H.A00 = 21;
                this.A0P = null;
                C36341k9.A0u(C19420v0.A00(this.A09).remove("gdrive_activity_state"), "gdrive_activity_msgstore_init_key");
            } else {
                AnonymousClass005 r4 = this.A09.A00;
                Pair A0I2 = C36341k9.A0I(Integer.valueOf(C36391kE.A0H(r4).getInt("gdrive_activity_state", -1)), C36391kE.A0H(r4).getInt("gdrive_activity_msgstore_init_key", -1));
                RestoreFromBackupViewModel restoreFromBackupViewModel = this.A0H;
                int A042 = C36381kD.A04(A0I2);
                if (A042 == -1) {
                    A042 = 21;
                }
                restoreFromBackupViewModel.A00 = A042;
                if (A042 == 26) {
                    int A032 = C36381kD.A03(A0I2);
                    if (A032 == -1) {
                        r0 = new C131006Ni(0);
                    } else if (A032 == 21 || A032 <= 7) {
                        r0 = new C131006Ni(A032);
                    } else {
                        throw AnonymousClass000.A0d("Initialization state is not recognized. State = ", AnonymousClass000.A0u(), A032);
                    }
                } else {
                    r0 = null;
                }
                this.A0P = r0;
            }
            C65983Uf.A0M(this.A00, this, this.A00, R.id.title_toolbar, false, false, this.A08.A0F(false));
            if (this.A0H.A00 == 24 && !this.A0C.A0T.get()) {
                Log.i("restore>RestoreFromBackupActivity/update-state/it looks like restoring from gdrive has been completed but we missed it, let's try again");
                A3r(this.A0P, 22);
            }
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = bundle.getBundle("restore_account_data");
            }
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("restore>RestoreFromBackupActivity/update-state/");
            C36321k7.A1a(A0u2, A07(this.A0H.A00));
            int i = this.A0H.A00;
            switch (i) {
                case 21:
                    Intent intent = getIntent();
                    if (intent.getAction() == null) {
                        Log.e("restore>RestoreFromBackupActivity/update-state/new state but no action provided. Finishing.");
                        break;
                    } else {
                        onNewIntent(intent);
                        return;
                    }
                case 22:
                    if (bundle2 != null) {
                        this.A0B = AnonymousClass6PR.A00(bundle2);
                        A3r((C131006Ni) null, 22);
                        A0H(this.A0B, this);
                        C36391kE.A1R(this.A04, this, bundle, 10);
                        return;
                    }
                    throw AnonymousClass001.A09("restore_account_data cannot be null");
                case 23:
                    A3r((C131006Ni) null, 23);
                    A3o();
                    return;
                case 24:
                    if (bundle2 != null) {
                        this.A0B = AnonymousClass6PR.A00(bundle2);
                        A3r((C131006Ni) null, 22);
                        A0H(this.A0B, this);
                        A3r((C131006Ni) null, 24);
                        A3n();
                        if (C90514aH.A0G(this) == 3) {
                            Log.i("restore>RestoreFromBackupActivity/update-state/gdrive-msgstore-download-pending");
                            return;
                        }
                        Log.i("restore>RestoreFromBackupActivity/update-state/gdrive-msgstore-download-not-pending");
                        A0Q(this, true);
                        return;
                    }
                    throw AnonymousClass001.A09("restore_account_data cannot be null");
                case 25:
                    if (bundle2 != null) {
                        this.A0B = AnonymousClass6PR.A00(bundle2);
                        return;
                    }
                    return;
                case 26:
                    C131006Ni r2 = this.A0P;
                    if (bundle2 != null) {
                        this.A0B = AnonymousClass6PR.A00(bundle2);
                        A3r((C131006Ni) null, 22);
                        A0H(this.A0B, this);
                    } else {
                        A3r((C131006Ni) null, 23);
                        A3o();
                    }
                    A3n();
                    C36321k7.A1K(r2, "restore>RestoreFromBackupActivity/update-state/msgstore-init-status/", AnonymousClass000.A0u());
                    A3k(r2);
                    return;
                case 27:
                    A3r((C131006Ni) null, 23);
                    A3o();
                    A3n();
                    A0Q(this, true);
                    A3r((C131006Ni) null, 27);
                    return;
                default:
                    throw C90464aC.A0R("Unknown state: ", AnonymousClass000.A0u(), i);
            }
        }
        finish();
    }

    public void onDestroy() {
        this.A0f = true;
        if (this.A0x.compareAndSet(true, false)) {
            this.A0E.A02(this.A0r);
        }
        if (this.A0h) {
            getApplicationContext().unbindService(this.A0o);
        }
        this.A0X.A00();
        super.onDestroy();
    }

    private SpannableStringBuilder A01(String str, String str2) {
        HashMap A0J2 = AnonymousClass001.A0J();
        A0J2.put(str2, new C429721s(this, this.A01, this.A05, this.A08, this.A04.A00("https://faq.whatsapp.com/android/chats/how-to-restore-your-chat-history").toString()));
        return AnonymousClass6YV.A03(str, A0J2);
    }

    private void A0F() {
        Log.i("restore>RestoreFromBackupActivity/skip restore");
        this.A0n = true;
        setResult(2);
    }

    public static void A0J(RestoreFromBackupActivity restoreFromBackupActivity) {
        Log.i("restore>RestoreFromBackupActivity/skip-restore-and-prepare-empty-message-store/show-new-user-settings");
        restoreFromBackupActivity.A0F();
        restoreFromBackupActivity.A3l(false);
        restoreFromBackupActivity.A09.A1G(System.currentTimeMillis() + 604800000);
    }

    public static void A0K(RestoreFromBackupActivity restoreFromBackupActivity) {
        Log.i("restore>RestoreFromBackupActivity/start to download message store");
        AnonymousClass6PR r0 = restoreFromBackupActivity.A0B;
        if (r0 == null || !r0.A01) {
            C111795cr.A01(restoreFromBackupActivity, AnonymousClass190.A14(restoreFromBackupActivity, "action_restore"));
        } else {
            restoreFromBackupActivity.A0r.Bb1(true);
        }
        restoreFromBackupActivity.A05.A0H(new C1497072l(restoreFromBackupActivity, 20));
    }

    public static void A0L(RestoreFromBackupActivity restoreFromBackupActivity, int i) {
        AnonymousClass2NP r1 = new AnonymousClass2NP();
        r1.A00 = Integer.valueOf(i);
        restoreFromBackupActivity.A0V.Bly(r1);
    }

    public static void A0M(RestoreFromBackupActivity restoreFromBackupActivity, int i) {
        AnonymousClass3L4 r1 = new AnonymousClass3L4(i);
        C90484aE.A12(restoreFromBackupActivity, r1, R.string.f12nameremoved);
        r1.A02(true);
        C90484aE.A11(restoreFromBackupActivity, r1, R.string.f12nameremoved);
        PromptDialogFragment A0S2 = C90474aD.A0S(restoreFromBackupActivity, r1, R.string.f12nameremoved);
        if (!A0n(restoreFromBackupActivity)) {
            C90484aE.A19(C36341k9.A0O(restoreFromBackupActivity), A0S2, (String) null);
        }
    }

    public static void A0Q(RestoreFromBackupActivity restoreFromBackupActivity, boolean z) {
        String str;
        AnonymousClass6PR r0;
        if (z && (r0 = restoreFromBackupActivity.A0B) != null && r0.A02) {
            A0L(restoreFromBackupActivity, 8);
        }
        restoreFromBackupActivity.setTitle(R.string.f12nameremoved);
        boolean A2B = restoreFromBackupActivity.A09.A2B();
        StringBuilder A0u2 = AnonymousClass000.A0u();
        if (A2B) {
            str = "restore>RestoreFromBackupActivity/msgstore-download/finished with success: ";
        } else {
            str = "restore>RestoreFromBackupActivity/msgstore-download/not performed since we are using local backup, success: ";
        }
        A0u2.append(str);
        A0u2.append(z);
        C36321k7.A1a(A0u2, ", starting to restore it.");
        super.A3l(z);
    }

    public static void A0i(RestoreFromBackupActivity restoreFromBackupActivity, boolean z) {
        if (restoreFromBackupActivity.A0L.A0H()) {
            if (z) {
                restoreFromBackupActivity.A0G(6);
                return;
            }
        } else if (restoreFromBackupActivity.A0O.A0C() > 0) {
            restoreFromBackupActivity.A0O.A00 = 3;
            restoreFromBackupActivity.A3r((C131006Ni) null, 23);
            restoreFromBackupActivity.A3o();
            return;
        }
        restoreFromBackupActivity.A0O.A00 = 4;
        restoreFromBackupActivity.A0F();
        restoreFromBackupActivity.A3l(false);
    }

    public static void A0j(RestoreFromBackupActivity restoreFromBackupActivity, boolean z) {
        View view = restoreFromBackupActivity.A0k;
        if (z) {
            view.setVisibility(0);
            A0L(restoreFromBackupActivity, 1);
            return;
        }
        view.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r0.A01 != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0l(boolean r11) {
        /*
            r10 = this;
            X.3TX r1 = r10.A0a
            if (r11 == 0) goto L_0x00dd
            java.lang.String r0 = "restore_successful"
        L_0x0006:
            r1.A04(r0)
            X.C18740tg.A01()
            X.6PR r0 = r10.A0B
            r8 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.A01
            r6 = 1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r6 = 0
        L_0x0018:
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = r10.A0F
            if (r0 != 0) goto L_0x0027
            r0 = 2131430561(0x7f0b0ca1, float:1.8482826E38)
            android.view.View r0 = X.C03570Gk.A0B(r10, r0)
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = (com.whatsapp.backup.google.GoogleDriveRestoreAnimationView) r0
            r10.A0F = r0
        L_0x0027:
            r0.A03(r7)
            r0 = 2131433400(0x7f0b17b8, float:1.8488585E38)
            android.view.View r0 = X.C03570Gk.A0B(r10, r0)
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r10.A02
            r0.setVisibility(r1)
            android.widget.TextView r0 = r10.A04
            r0.setVisibility(r1)
            android.widget.TextView r0 = r10.A0l
            if (r0 != 0) goto L_0x004d
            r0 = 2131430557(0x7f0b0c9d, float:1.8482818E38)
            android.widget.TextView r0 = X.C36401kF.A0H(r10, r0)
            r10.A0l = r0
        L_0x004d:
            r0.setVisibility(r1)
            if (r11 == 0) goto L_0x005f
            r0 = 2131427543(0x7f0b00d7, float:1.8476705E38)
            android.widget.TextView r1 = X.C36391kE.A0Q(r10, r0)
            r0 = 2131891181(0x7f1213ed, float:1.9417075E38)
            r1.setText(r0)
        L_0x005f:
            r0 = 2131431804(0x7f0b117c, float:1.8485348E38)
            android.widget.TextView r5 = X.C36401kF.A0H(r10, r0)
            r5.setVisibility(r7)
            if (r6 == 0) goto L_0x00c1
            X.0v0 r1 = r10.A09
            java.util.concurrent.Executor r0 = X.AnonymousClass6Y6.A00
            r0 = 2
            r1.A1A(r0)
            X.0ts r9 = r10.A00
            r4 = 2131755129(0x7f100079, float:1.9141129E38)
            X.12P r0 = r10.A0Q
            int r0 = r0.A02()
            long r0 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r8]
            X.12P r2 = r10.A0Q
            int r2 = r2.A02()
            X.AnonymousClass000.A1L(r3, r2, r7)
            java.lang.String r2 = r9.A0L(r3, r4, r0)
        L_0x008e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/after-msgstore-verified/restore-media/ "
            X.C36321k7.A1Q(r0, r2, r1)
            r5.setText(r2)
            r0 = 2131432070(0x7f0b1286, float:1.8485887E38)
            android.view.View r1 = X.C03570Gk.A0B(r10, r0)
            r1.setVisibility(r7)
            X.0yb r0 = r10.A08
            android.view.accessibility.AccessibilityManager r0 = r0.A0M()
            if (r0 == 0) goto L_0x00b8
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L_0x00b8
            r1.setFocusableInTouchMode(r8)
            r1.requestFocus()
        L_0x00b8:
            X.6cp r0 = new X.6cp
            r0.<init>(r10, r7, r11, r6)
            r1.setOnClickListener(r0)
            return
        L_0x00c1:
            X.0ts r9 = r10.A00
            r4 = 2131755130(0x7f10007a, float:1.914113E38)
            X.12P r0 = r10.A0Q
            int r0 = r0.A02()
            long r1 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r8]
            X.12P r0 = r10.A0Q
            int r0 = r0.A02()
            X.AnonymousClass000.A1L(r3, r0, r7)
            java.lang.String r2 = r9.A0L(r3, r4, r1)
            goto L_0x008e
        L_0x00dd:
            java.lang.String r0 = "restore_unsuccessful"
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.RestoreFromBackupActivity.A0l(boolean):void");
    }

    private boolean A0m() {
        if (this.A0u.size() < this.A0t.size() || this.A0y.get()) {
            return true;
        }
        return false;
    }

    public static boolean A0o(RestoreFromBackupActivity restoreFromBackupActivity) {
        if (!restoreFromBackupActivity.A0L.A0H() || !AnonymousClass3US.A0A(restoreFromBackupActivity.A09, AnonymousClass3TA.A04())) {
            return false;
        }
        restoreFromBackupActivity.A0G(8);
        return true;
    }

    public void A2F() {
        if (!this.A0g) {
            this.A0g = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r1 = A0L2.A5g;
            C90464aC.A11(r1, this);
            C18830tt r2 = r1.A00;
            C90464aC.A0y(r1, r2, this, C36321k7.A05(r1, r2, this));
            this.A00 = r2.A56();
            this.A07 = C36351kA.A0P(r1);
            this.A0K = C36351kA.A0W(r1);
            this.A0c = C90504aG.A0X(r1);
            this.A0V = C36351kA.A0g(r1);
            this.A05 = C19470v6.A00;
            this.A06 = C36381kD.A0U(r1);
            this.A0a = (AnonymousClass3TX) r2.A1p.get();
            this.A0U = (C21520zN) r1.A01.get();
            this.A08 = (AnonymousClass1RU) r1.A08.get();
            this.A0N = C36371kC.A0Z(r1);
            this.A0A = (C24431Ck) r1.A2z.get();
            this.A0M = (C21350z4) r1.A2V.get();
            this.A0S = (AnonymousClass13R) r1.A5P.get();
            this.A0O = (AnonymousClass1Q9) r1.A5D.get();
            this.A0X = C27111My.A38(A0L2);
            this.A0I = C36381kD.A0X(r1);
            this.A0T = (C62603Gu) r2.A8A.get();
            this.A0D = (AnonymousClass6FS) r1.A3g.get();
            this.A0Q = (AnonymousClass12P) r1.A5G.get();
            this.A0Y = (C29501Ww) r1.A7K.get();
            this.A0G = (C131096Ns) r1.A7N.get();
            this.A0L = C36351kA.A0X(r1);
            this.A0d = C18840tu.A00(r1.A7g);
            this.A0J = C90504aG.A0N(r2);
            this.A0b = (C24051Aw) r1.A3E.get();
            this.A0Z = (AnonymousClass1X8) r1.AdX.get();
            this.A09 = (C24461Cn) r1.A0c.get();
            this.A0R = (AnonymousClass1QN) r1.A5H.get();
            this.A0W = C36351kA.A0m(r1);
            this.A0C = (C33101ei) r1.A3f.get();
            this.A0E = (C33171eq) r1.A3i.get();
        }
    }

    public void A3o() {
        Log.i("restore>RestoreFromBackupActivity/show-restore-ui-for-local-backup");
        C03570Gk.A0B(this, R.id.google_drive_looking_for_backup_view).setVisibility(8);
        C03570Gk.A0B(this, R.id.google_drive_restore_view).setVisibility(0);
        this.A0z.open();
        setTitle(R.string.f12nameremoved);
        C36391kE.A16(this, R.id.calculating_progress_view, 8);
        C36391kE.A16(this, R.id.gdrive_restore_size_info, 8);
        C36391kE.A16(this, R.id.calculating_transfer_size_progress_bar, 8);
        String A0B2 = AnonymousClass3UY.A0B(this.A00, this.A0O.A0E());
        TextView A0H2 = C36401kF.A0H(this, R.id.gdrive_restore_info);
        Object[] A0L2 = AnonymousClass001.A0L();
        A0L2[0] = A0B2;
        C36341k9.A0s(this, A0H2, A0L2, R.string.f12nameremoved);
        C165147sx.A01(this, this.A0H.A01, 8);
        RestoreFromBackupViewModel restoreFromBackupViewModel = this.A0H;
        C1497072l.A00(restoreFromBackupViewModel.A06, restoreFromBackupViewModel, 30);
        boolean A0Q2 = this.A0O.A0Q();
        A0j(this, A0Q2);
        if (this.A0F == null) {
            this.A0F = (GoogleDriveRestoreAnimationView) findViewById(R.id.google_drive_restore_animation_view);
        }
        TextView A0H3 = C36401kF.A0H(this, R.id.restore_general_info);
        boolean A002 = C20060wx.A00();
        int i = R.string.f12nameremoved;
        if (A002) {
            i = R.string.f12nameremoved;
        }
        A0H3.setText(i);
        C36421kH.A10(C03570Gk.A0B(this, R.id.dont_restore), this, 11);
        this.A01.setOnClickListener(new AnonymousClass3YD(1, this, A0Q2));
        this.A0a.A04("backup_found");
    }

    public void A3r(C131006Ni r5, int i) {
        Integer num;
        this.A0H.A00 = i;
        this.A0P = r5;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("restore>RestoreFromBackupActivity/state ");
        A0u2.append(A07(i));
        C36421kH.A1N(A0u2);
        Object obj = r5;
        if (r5 == null) {
            obj = "";
        }
        C36321k7.A1N(obj, A0u2);
        C19420v0 r2 = this.A09;
        int i2 = this.A0H.A00;
        C131006Ni r0 = this.A0P;
        if (r0 != null) {
            num = Integer.valueOf(r0.A00);
        } else {
            num = null;
        }
        SharedPreferences.Editor A002 = C19420v0.A00(r2);
        A002.putInt("gdrive_activity_state", i2);
        if (num != null) {
            A002.putInt("gdrive_activity_msgstore_init_key", num.intValue());
        } else {
            A002.remove("gdrive_activity_msgstore_init_key");
        }
        A002.apply();
    }

    public void BVh(int i) {
        String str;
        String str2;
        String str3;
        if (i == 10 || i == 11) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("restore>RestoreFromBackupActivity/user clicked skip restore for");
            if (i == 11) {
                str = "google";
            } else {
                str = "local";
            }
            A0u2.append(str);
            C36321k7.A1a(A0u2, "backup");
        } else if (i == 12) {
            Log.i("restore>RestoreFromBackupActivity/restore-media-on-cellular-dialog/Wi-Fi unavailable and user agreed to restore media on cellular.");
            C36341k9.A0x(C19420v0.A00(this.A09), "gdrive_media_restore_network_setting", String.valueOf(1));
            Log.i("restore>RestoreFromBackupActivity/start to restore media");
            C111795cr.A01(this, AnonymousClass190.A14(this, "action_restore_media"));
            Log.i("restore>RestoreFromBackupActivity/msgstore-download-finish/setting result of Google Drive activity to BACKUP_FOUND_AND_RESTORED.");
            setResult(3);
            finish();
        } else if (i == 14) {
            Log.i("restore>RestoreFromBackupActivity/no-local-or-gdrive-backup-found-dialog/no google drive backups found and user is not interested in adding an account for that either.");
            if (!C19550w8.A01() || C36371kC.A1U(C36331k8.A06(this), "chat_transfer_finished") || !this.A0U.A0E(4485)) {
                A0J(this);
                setResult(1);
                return;
            }
            Intent className = C36431kI.A0D().setClassName(getPackageName(), "com.whatsapp.backup.google.RestoreTransferSelectorActivity");
            className.putExtra("backup_time", (String) null);
            startActivityForResult(className, 25);
        } else if (i == 16) {
            Log.i("restore>RestoreFromBackupActivity/one-time-setup-is-taking-too-long/user decided to cancel looking for backups");
            AnonymousClass6UR.A02();
            this.A0w.set(true);
            if (this.A0O.A0C() > 0) {
                A3r((C131006Ni) null, 23);
                A3o();
                return;
            }
            A0F();
            A3l(false);
        } else {
            if (i == 18) {
                Log.i("restore>RestoreFromBackupActivity/failed-to-restore-messages-from-selected-backup/user decided to continue without restore");
                A0F();
            } else {
                if (i == 19) {
                    str3 = "restore>RestoreFromBackupActivity/failed-to-restore-messages/internal-storage-out-of-free-space/user clicked ok";
                } else if (i == 20) {
                    if (A0m()) {
                        str3 = "restore>RestoreFromBackupActivity/msgstore-jid-mismatch/restore-from-older";
                    } else {
                        Log.i("restore>RestoreFromBackupActivity/msgstore-jid-mismatch/skip");
                    }
                } else if (i == 22) {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://faq.whatsapp.com/android/chats/how-to-restore-your-chat-history")));
                    return;
                } else if (i == 23) {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://faq.whatsapp.com/android/chats/how-to-restore-your-chat-history")));
                    A0k(true);
                    return;
                } else if (i == 24) {
                    if (C36371kC.A1T(Build.VERSION.SDK_INT, 26)) {
                        str2 = "android.os.storage.action.MANAGE_STORAGE";
                    } else {
                        str2 = "android.settings.INTERNAL_STORAGE_SETTINGS";
                    }
                    startActivityForResult(C36441kJ.A0I(str2), 7);
                    return;
                } else {
                    throw C90464aC.A0R("unexpected dialog box: ", AnonymousClass000.A0u(), i);
                }
                Log.i(str3);
                A0k(true);
                return;
            }
            A3l(false);
            A0l(false);
        }
    }

    public void BVi(int i) {
        if (i == 13) {
            Log.i("restore>RestoreFromBackupActivity/insufficient-space-dialog/neutral-click");
            return;
        }
        throw C90464aC.A0R("unexpected dialog box: ", AnonymousClass000.A0u(), i);
    }

    public void BVj(int i) {
        String str;
        if (i == 10) {
            Log.i("restore>RestoreFromBackupActivity/show-restore/user declined to restore from local backup");
            setResult(2);
            A0J(this);
        } else if (i == 11) {
            Log.i("restore>RestoreFromBackupActivity/user confirmed to skip restore");
            if (this.A0O.A0C() <= 0 || !this.A0y.get()) {
                A3p();
                return;
            }
            A3r((C131006Ni) null, 23);
            A3o();
        } else {
            if (i == 12) {
                Log.i("restore>RestoreFromBackupActivity/restore-media-on-cellular-dialog/Wi-Fi unavailable and user declined to restore media on cellular.");
                setResult(3);
            } else {
                if (i == 13) {
                    Log.i("restore>RestoreFromBackupActivity/insufficient-storage-for-restore/user-decided-to-visit-storage-settings");
                } else if (i == 14) {
                    Log.i("restore>RestoreFromBackupActivity/one-time-setup/no google drive backups found and user decided to add an account or give permission to an existing one.");
                    Account[] accountsByType = AccountManager.get(this).getAccountsByType("com.google");
                    int length = accountsByType.length;
                    int i2 = length + 1;
                    String[] strArr = new String[i2];
                    for (int i3 = 0; i3 < length; i3++) {
                        strArr[i3] = accountsByType[i3].name;
                    }
                    int i4 = i2 - 1;
                    C36421kH.A0k(this, R.string.f12nameremoved, i4, strArr);
                    String[] strArr2 = new String[i2];
                    boolean[] zArr = new boolean[i2];
                    List list = this.A0t;
                    list.clear();
                    for (int i5 = 0; i5 < length; i5++) {
                        list.add(accountsByType[i5]);
                        if (this.A0u.contains(accountsByType[i5])) {
                            C36421kH.A0k(this, R.string.f12nameremoved, i5, strArr2);
                            zArr[i5] = false;
                        } else {
                            strArr2[i5] = null;
                            zArr[i5] = true;
                        }
                    }
                    zArr[i4] = true;
                    SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
                    Bundle A0N2 = C90484aE.A0N(this);
                    A0N2.putStringArray("multi_line_list_items_key", strArr);
                    A0N2.putStringArray("multi_line_list_item_values_key", strArr2);
                    A0N2.putBooleanArray("list_item_enabled_key", zArr);
                    A0N2.putString("disabled_item_toast_key", getString(R.string.f12nameremoved));
                    singleChoiceListDialogFragment.A17(A0N2);
                    if (!A0n(this)) {
                        singleChoiceListDialogFragment.A1f(getSupportFragmentManager(), (String) null);
                        return;
                    }
                    return;
                } else if (i == 15) {
                    Log.i("restore>RestoreFromBackupActivity/google-play-services-is-broken/user decided to skip restore");
                    setResult(1);
                } else if (i == 16) {
                    Log.i("restore>RestoreFromBackupActivity/one-time-setup-taking-too-long/user decided to wait for restore");
                    return;
                } else {
                    if (i == 18) {
                        Log.i("restore>RestoreFromBackupActivity/failed-to-restore-from-selected-backup/restoring from an older backup");
                    } else if (i != 19) {
                        if (i == 20) {
                            Log.i("restore>RestoreFromBackupActivity/msgstore-jid-mistmatch/user decided to re-register");
                            C19890wg r1 = this.A0W;
                            Log.i("RegistrationUtils/clearAllRegistrationPref");
                            SharedPreferences.Editor A0G2 = C36381kD.A0G(r1, C29501Ww.A01(this, "com.whatsapp.registration.phonenumberentry.RegisterPhone"));
                            A0G2.clear();
                            if (!A0G2.commit()) {
                                Log.w("RegistrationUtils/clearAllRegistrationPref/failed");
                            }
                            this.A0Y.A09();
                            C90494aF.A0r(this, AnonymousClass190.A09(this));
                            this.A0M.A03("RestoreFromBackupActivity");
                            return;
                        } else if (i == 21) {
                            Log.i("restore>RestoreFromBackupActivity/failed-to-restore-from-selected-backup/re-enter-encryption-key");
                            A0k(false);
                            return;
                        } else if (i == 22) {
                            return;
                        } else {
                            if (!(i == 23 || i == 24)) {
                                throw C90464aC.A0R("restore>RestoreFromBackupActivity/unexpected dialog box: ", AnonymousClass000.A0u(), i);
                            }
                        }
                    }
                    A0k(true);
                    return;
                }
                if (C36371kC.A1T(Build.VERSION.SDK_INT, 26)) {
                    str = "android.os.storage.action.MANAGE_STORAGE";
                } else {
                    str = "android.settings.INTERNAL_STORAGE_SETTINGS";
                }
                startActivityForResult(C36441kJ.A0I(str), 7);
                return;
            }
            finish();
        }
    }

    public void BVr(int i) {
        if (i == 17) {
            Log.i("restore>RestoreFromBackupActivity/account-selector-dialog/user dismissed the dialog");
            A0h(this, true);
            return;
        }
        throw C90464aC.A0R("Unexpected dialog id:", AnonymousClass000.A0u(), i);
    }

    public void Bgl(String[] strArr, int i, int i2) {
        if (i != 17) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            C90464aC.A1K("Unexpected dialogId: ", " index:", A0u2, i, i2);
            throw AnonymousClass001.A09(A0u2.toString());
        } else if (strArr[i2].equals(getString(R.string.f12nameremoved))) {
            AnonymousClass6Y6.A00.execute(new AVa(this, AccountManager.get(this).addAccount("com.google", (String) null, (String[]) null, (Bundle) null, this, (AccountManagerCallback) null, (Handler) null), 9));
            Log.i("restore>RestoreFromBackupActivity/show-accounts/waiting-for-add-account-activity-to-return");
        } else {
            Intent A0D2 = C36431kI.A0D();
            A0D2.putExtra("authAccount", strArr[i2]);
            onActivityResult(3, -1, A0D2);
        }
    }

    public void onBackPressed() {
        if (this.A08.A0F(false)) {
            Log.i("restore>RestoreFromBackupActivity/onBackPressed/is adding new account");
            C65983Uf.A0I(this, (Runnable) null, (String) null, this.A0A.A01(), this.A09.A0I());
            return;
        }
        C24801Dv.A02(this);
    }

    public void onNewIntent(Intent intent) {
        Intent intent2 = intent;
        super.onNewIntent(intent2);
        if (intent2.getAction() == null) {
            Log.e("restore>RestoreFromBackupActivity/new-intent action is null");
        } else if (!intent2.getAction().equals("action_show_restore_one_time_setup")) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("restore>RestoreFromBackupActivity/new-intent/unexpected action: ");
            C36321k7.A1Z(A0u2, intent2.getAction());
            finish();
        } else {
            Dialog A012 = AnonymousClass6Y6.A01(this, new C163317q0(this, 1), C34201gc.A00(this.A0K.A00), 2, false);
            if (A012 != null && !A0n(this)) {
                boolean A1U = C36371kC.A1U(C36341k9.A0E(this.A09), "new_jid");
                C36321k7.A1X("gdrive-util/is-new-jid/", AnonymousClass000.A0u(), A1U);
                if (!A1U) {
                    Log.i("restore>RestoreFromBackupActivity/new-intent/existing user with unavailable google play services");
                    A012.show();
                    return;
                }
            }
            if (C90524aI.A0f(this) == null) {
                A0h(this, false);
            } else if (AnonymousClass000.A1S(this.A09.A0F(), 3)) {
                Log.i("restore>RestoreFromBackupActivity/new-intent/continue-msgstore-download");
                C36391kE.A16(this, R.id.google_drive_looking_for_backup_view, 8);
                C36391kE.A16(this, R.id.google_drive_restore_view, 0);
                A3n();
                String A0f2 = C90524aI.A0f(this);
                C18740tg.A06(A0f2);
                long A0U2 = this.A09.A0U(A0f2);
                long A0T2 = this.A09.A0T(A0f2);
                String string = getString(R.string.f12nameremoved);
                if (A0T2 > 0) {
                    string = AnonymousClass3UY.A0B(this.A00, A0T2);
                }
                if (!this.A09.A2B()) {
                    string = AnonymousClass3UY.A0B(this.A00, this.A0O.A0E());
                }
                String A032 = AnonymousClass3TF.A03(this.A00, A0U2);
                if (this.A0B == null) {
                    this.A0B = new AnonymousClass6PR(A0f2, A0T2, A0U2, this.A09.A2B(), false, C36331k8.A06(this).getBoolean("gdrive_last_restore_file_is_encrypted", false));
                }
                TextView A0H2 = C36401kF.A0H(this, R.id.gdrive_restore_info);
                Object[] objArr = new Object[3];
                objArr[0] = A0f2;
                C36411kG.A1Q(string, A032, objArr, 1);
                C36341k9.A0s(this, A0H2, objArr, R.string.f12nameremoved);
                A0j(this, this.A0B.A02);
                A0K(this);
            } else if (this.A09.A0C() != 0) {
                Log.i("restore>RestoreFromBackupActivity/new-intent/msgstore-download-already-finished, restoring");
                C36391kE.A16(this, R.id.google_drive_looking_for_backup_view, 8);
                C36391kE.A16(this, R.id.google_drive_restore_view, 0);
                C001700s r1 = this.A0H.A02;
                C165147sx.A01(this, r1, 9);
                Number A0z2 = C36441kJ.A0z(r1);
                if (A0z2 != null) {
                    this.A03.setText(AnonymousClass3RQ.A02(this, this.A00, A0z2.longValue()));
                }
                RestoreFromBackupViewModel restoreFromBackupViewModel = this.A0H;
                C1497072l.A00(restoreFromBackupViewModel.A06, restoreFromBackupViewModel, 31);
                A0j(this, C36331k8.A06(this).getBoolean("gdrive_last_restore_file_is_encrypted", false));
                A3n();
                A0Q(this, true);
            } else {
                A0J(this);
                setResult(2);
            }
        }
    }

    public static String A07(int i) {
        switch (i) {
            case 21:
                return "new";
            case 22:
                return "restore-from-gdrive";
            case 23:
                return "restore-from-local";
            case 24:
                return "restoring-from-gdrive";
            case 25:
                return "return-from-auth";
            case 26:
                return "msgstore-restored";
            case 27:
                return "restoring-from-local";
            default:
                throw C90464aC.A0R("Unknown state: ", AnonymousClass000.A0u(), i);
        }
    }

    public static void A0H(AnonymousClass6PR r11, RestoreFromBackupActivity restoreFromBackupActivity) {
        int i;
        long j;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("restore>RestoreFromBackupActivity/show-restore-ui-for-google-backup/");
        String str = r11.A05;
        C36321k7.A1a(A0u2, C34191gb.A07(str));
        long j2 = r11.A04;
        long j3 = r11.A00;
        C36361kB.A0v(restoreFromBackupActivity, R.id.google_drive_looking_for_backup_view);
        C03570Gk.A0B(restoreFromBackupActivity, R.id.google_drive_restore_view).setVisibility(0);
        restoreFromBackupActivity.A0z.open();
        restoreFromBackupActivity.setTitle(R.string.f12nameremoved);
        if (restoreFromBackupActivity.A0F == null) {
            restoreFromBackupActivity.A0F = (GoogleDriveRestoreAnimationView) restoreFromBackupActivity.findViewById(R.id.google_drive_restore_animation_view);
        }
        boolean z = r11.A01;
        TextView A0H2 = C36401kF.A0H(restoreFromBackupActivity, R.id.restore_general_info);
        if (z) {
            boolean A002 = C20060wx.A00();
            i = R.string.f12nameremoved;
            if (A002) {
                i = R.string.f12nameremoved;
            }
        } else {
            i = R.string.f12nameremoved;
        }
        A0H2.setText(i);
        StringBuilder A0i2 = C90524aI.A0i(restoreFromBackupActivity.getString(R.string.f12nameremoved));
        StringBuilder A0u3 = AnonymousClass000.A0u();
        if (j2 > 0) {
            A0i2.setLength(0);
            A0i2.append(AnonymousClass3UY.A0B(restoreFromBackupActivity.A00, j2));
        }
        if (r11.A01) {
            j = 0;
        } else {
            j = j3;
        }
        restoreFromBackupActivity.A0i = j;
        if (j3 >= 0) {
            A0u3.setLength(0);
            A0u3.append(AnonymousClass3TF.A03(restoreFromBackupActivity.A00, j3));
        }
        if (!r11.A03) {
            A0i2.setLength(0);
            A0i2.append(AnonymousClass3UY.A0B(restoreFromBackupActivity.A00, restoreFromBackupActivity.A0O.A0E()));
            Log.i("restore>RestoreFromBackupActivity/show-restore-ui-for-google-backup/local backup is newer than google drive backup, showing local backup timestamp.");
        }
        TextView A0H3 = C36401kF.A0H(restoreFromBackupActivity, R.id.gdrive_restore_info);
        boolean z2 = r11.A01;
        int i2 = R.string.f12nameremoved;
        if (z2) {
            i2 = R.string.f12nameremoved;
        }
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = str;
        C90514aH.A1Q(A0i2, A1Q, 1);
        C90514aH.A1Q(A0u3, A1Q, 2);
        C36341k9.A0s(restoreFromBackupActivity, A0H3, A1Q, i2);
        A0j(restoreFromBackupActivity, r11.A02);
        C36421kH.A10(C03570Gk.A0B(restoreFromBackupActivity, R.id.dont_restore), restoreFromBackupActivity, 9);
        C36421kH.A10(restoreFromBackupActivity.A01, restoreFromBackupActivity, 10);
        restoreFromBackupActivity.A0a.A04("backup_found");
        if (C19550w8.A01() && !C36371kC.A1U(C36331k8.A06(restoreFromBackupActivity), "chat_transfer_finished") && restoreFromBackupActivity.A0U.A0E(4485)) {
            String obj = A0i2.toString();
            Intent className = C36431kI.A0D().setClassName(restoreFromBackupActivity.getPackageName(), "com.whatsapp.backup.google.RestoreTransferSelectorActivity");
            className.putExtra("backup_time", obj);
            restoreFromBackupActivity.startActivityForResult(className, 25);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r13.A0I.A00() == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0h(com.whatsapp.backup.google.RestoreFromBackupActivity r39, boolean r40) {
        /*
            X.C18740tg.A01()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/perform-one-time-setup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r12 = 0
            r13 = r39
            X.0yE r1 = r13.A0L
            java.lang.String r0 = "android.permission.GET_ACCOUNTS"
            int r0 = r1.A02(r0)
            r2 = 1
            if (r0 != 0) goto L_0x001f
            X.16m r0 = r13.A0I
            boolean r0 = r0.A00()
            r1 = 0
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r1 = 1
        L_0x0020:
            X.0yE r0 = r13.A0L
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0041
            X.16m r0 = r13.A0I
            boolean r0 = r0.A00()
        L_0x002e:
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            if (r1 != 0) goto L_0x0036
            if (r0 == 0) goto L_0x0056
        L_0x0036:
            if (r40 == 0) goto L_0x0048
            if (r0 == 0) goto L_0x004d
            r13.setResult(r2)
            r13.finish()
            return
        L_0x0041:
            X.0yE r0 = r13.A0L
            boolean r0 = r0.A0D()
            goto L_0x002e
        L_0x0048:
            r0 = 5
            r13.A0G(r0)
            return
        L_0x004d:
            r1 = 23
            r0 = 0
            r13.A3r(r0, r1)
            r13.A3o()
        L_0x0056:
            X.0wG r0 = r13.A0K
            android.content.Context r0 = r0.A00
            android.accounts.AccountManager r1 = android.accounts.AccountManager.get(r0)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r0 = "com.google"
            android.accounts.Account[] r14 = r1.getAccountsByType(r0)     // Catch:{ Exception -> 0x0065 }
            goto L_0x006d
        L_0x0065:
            r1 = move-exception
            java.lang.String r0 = "gdrive-activity/get-google-accounts"
            com.whatsapp.util.Log.e(r0, r1)
            android.accounts.Account[] r14 = new android.accounts.Account[r12]
        L_0x006d:
            java.util.List r0 = r13.A0t
            r0.clear()
            java.util.Collections.addAll(r0, r14)
            X.17Y r0 = r13.A05
            r40 = r0
            X.0wG r0 = r13.A0K
            r27 = r0
            X.179 r0 = r13.A06
            r26 = r0
            X.0zN r0 = r13.A0U
            r32 = r0
            java.util.Set r0 = r13.A0u
            r39 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.A0y
            r37 = r0
            X.1Q9 r0 = r13.A0O
            r30 = r0
            X.0v0 r0 = r13.A09
            r29 = r0
            X.0yC r0 = r13.A0D
            r18 = r0
            X.0wN r0 = r13.A03
            r17 = r0
            X.0wt r15 = r13.A0c
            X.0wU r11 = r13.A04
            X.0y0 r10 = r13.A04
            X.0ww r9 = r13.A06
            X.1Ck r8 = r13.A0A
            X.13R r7 = r13.A0S
            X.6Ns r6 = r13.A0G
            X.0yE r5 = r13.A0L
            X.1Aw r4 = r13.A0b
            X.1Cn r3 = r13.A09
            java.util.concurrent.atomic.AtomicBoolean r2 = r13.A0v
            X.1el r1 = r13.A0s
            X.0wD r0 = r13.A07
            X.5zG r16 = new X.5zG
            r31 = r7
            r33 = r18
            r34 = r4
            r35 = r15
            r36 = r11
            r38 = r2
            r20 = r3
            r21 = r8
            r22 = r13
            r23 = r6
            r24 = r1
            r25 = r0
            r28 = r5
            r18 = r10
            r19 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            java.util.concurrent.atomic.AtomicBoolean r1 = r13.A0w
            X.1ei r0 = r13.A0C
            X.5Mn r2 = new X.5Mn
            r17 = r2
            r18 = r40
            r19 = r0
            r20 = r13
            r21 = r16
            r22 = r26
            r23 = r27
            r24 = r29
            r25 = r30
            r26 = r32
            r27 = r39
            r28 = r37
            r29 = r1
            r30 = r14
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r13.A0m = r2
            X.0wU r1 = r13.A04
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r1.Box(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.RestoreFromBackupActivity.A0h(com.whatsapp.backup.google.RestoreFromBackupActivity, boolean):void");
    }

    private void A0k(boolean z) {
        C18740tg.A01();
        C03570Gk.A0B(this, R.id.restore_actions_view).setVisibility(0);
        C36391kE.A16(this, R.id.restore_general_info, 0);
        C36391kE.A16(this, R.id.calculating_progress_view, 0);
        C36391kE.A16(this, R.id.google_drive_looking_for_backup_view, 0);
        C03570Gk.A0B(this, R.id.google_drive_restore_animation_view).setVisibility(8);
        C36391kE.A16(this, R.id.google_drive_progress, 8);
        C36391kE.A16(this, R.id.google_drive_progress_info, 8);
        C36391kE.A16(this, R.id.google_drive_restore_view, 8);
        C36391kE.A16(this, R.id.google_drive_media_will_be_downloaded_later_notice, 8);
        C36391kE.A16(this, R.id.msgrestore_result_box, 8);
        C36391kE.A16(this, R.id.nextBtn, 8);
        File databasePath = getDatabasePath("msgstore.db");
        if (databasePath.exists()) {
            boolean delete = databasePath.delete();
            StringBuilder A0v2 = AnonymousClass000.A0v("restore>RestoreFromBackupActivity/show-msgstore-downloading-view/restore-failed ");
            if (!delete) {
                A0v2.append(databasePath);
                C36341k9.A1O(A0v2, " exists but cannot be deleted, message restore might fail");
            } else {
                A0v2.append(databasePath);
                C36321k7.A1a(A0v2, " deleted");
            }
        }
        this.A0R.A00();
        A0h(this, !z);
    }

    public static boolean A0n(RestoreFromBackupActivity restoreFromBackupActivity) {
        if (AnonymousClass3SJ.A04(restoreFromBackupActivity) || restoreFromBackupActivity.A0f) {
            return true;
        }
        return false;
    }

    public static boolean A0p(RestoreFromBackupActivity restoreFromBackupActivity, String str, int i) {
        C18740tg.A00();
        C90464aC.A1I("restore>RestoreFromBackupActivity/auth-request/ account being used is ", str, AnonymousClass000.A0u());
        restoreFromBackupActivity.A04.Boy(new C80373vI(restoreFromBackupActivity, str, i, 0));
        Log.i("restore>RestoreFromBackupActivity/auth-request/blocking on tokenReceived");
        restoreFromBackupActivity.A0q.block(100000);
        return AnonymousClass000.A1V(restoreFromBackupActivity.A0e);
    }

    public void A3k(C131006Ni r11) {
        String str;
        AnonymousClass3L4 r3;
        PromptDialogFragment A002;
        AnonymousClass6PR r0;
        int i;
        Object[] objArr;
        String string;
        AnonymousClass3L4 r32;
        int i2;
        C18740tg.A01();
        if (this.A0n) {
            finish();
            return;
        }
        int i3 = this.A0H.A00;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        if (i3 == 26) {
            C36321k7.A1K(r11, "restore>RestoreFromBackupActivity/after-msgstore-verified/state-is-msgstore-restored/call-ignored ", A0u2);
            return;
        }
        C36321k7.A1K(r11, "restore>RestoreFromBackupActivity/after-msgstore-verified/status:", A0u2);
        A3r(r11, 26);
        int i4 = r11.A00;
        C90464aC.A1N(" is unexpected here", C90504aG.A0q(i4), C36381kD.A1U(i4, 2));
        if (i4 == 1 || i4 == 21) {
            C1497072l.A00(this.A04, this, 13);
            A0l(true);
            return;
        }
        if (i4 == 5) {
            C18740tg.A01();
            if (!A0n(this)) {
                SpannableStringBuilder A012 = A01(getString(R.string.f12nameremoved), "restore-failure-low-on-storage-learn-more");
                r32 = new AnonymousClass3L4(19);
                C90484aE.A10(this, r32, R.string.f12nameremoved);
                Bundle bundle = r32.A00;
                bundle.putCharSequence("message", A012);
                r32.A01();
                r32.A02(false);
                String string2 = getString(R.string.f12nameremoved);
                if (Build.VERSION.SDK_INT >= 26) {
                    string2 = getString(R.string.f12nameremoved);
                }
                bundle.putString("positive_button", string2);
                i2 = R.string.f12nameremoved;
            } else {
                return;
            }
        } else {
            String externalStorageState = Environment.getExternalStorageState();
            if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
                C36321k7.A1R("restore>RestoreFromBackupActivity/storage-state/error-external-storage-unavailable/state=", externalStorageState, AnonymousClass000.A0u());
                C18740tg.A01();
                if (!A0n(this)) {
                    r32 = new AnonymousClass3L4(23);
                    C90484aE.A10(this, r32, R.string.f12nameremoved);
                    C90484aE.A12(this, r32, R.string.f12nameremoved);
                    r32.A02(false);
                    C90484aE.A11(this, r32, R.string.f12nameremoved);
                    i2 = R.string.f12nameremoved;
                } else {
                    return;
                }
            } else if (this.A0L.A07() || this.A0L.A03(AnonymousClass3TA.A04()) == 0) {
                AnonymousClass6PR r1 = this.A0B;
                if (r1 == null || !r1.A03) {
                    this.A0y.set(false);
                    str = "restore>RestoreFromBackupActivity/after-msgstore-verified/failed/local backup is unrestorable";
                } else {
                    this.A0u.add(new Account(r1.A05, "com.google"));
                    StringBuilder A0u3 = AnonymousClass000.A0u();
                    A0u3.append("restore>RestoreFromBackupActivity/after-msgstore-verified/failed/google drive backup is unrestorable for ");
                    str = AnonymousClass000.A0q(C34191gb.A07(this.A0B.A05), A0u3);
                }
                Log.i(str);
                if (i4 == 3) {
                    C18740tg.A01();
                    if (!A0n(this)) {
                        String[] strArr = (String[]) Collections.unmodifiableSet(this.A0O.A0e).toArray(new String[0]);
                        StringBuilder A0u4 = AnonymousClass000.A0u();
                        A0u4.append("restore>RestoreFromBackupActivity/get-jid-mismatch-message for ");
                        C36321k7.A1a(A0u4, Arrays.toString(strArr));
                        int length = strArr.length;
                        if (length == 0) {
                            string = getString(R.string.f12nameremoved);
                        } else {
                            if (length == 1) {
                                i = R.string.f12nameremoved;
                                objArr = new Object[]{AnonymousClass3U8.A01(C203559oI.A00(), this.A09.A0g()), strArr[0]};
                            } else {
                                Arrays.sort(strArr);
                                int i5 = length - 1;
                                String[] strArr2 = new String[i5];
                                String str2 = strArr[i5];
                                System.arraycopy(strArr, 0, strArr2, 0, i5);
                                i = R.string.f12nameremoved;
                                objArr = new Object[]{AnonymousClass3U8.A01(C203559oI.A00(), this.A09.A0g()), C55782vB.A00(this.A00, Arrays.asList(strArr2), false), str2};
                            }
                            string = getString(i, objArr);
                        }
                        SpannableStringBuilder A013 = A01(string, "restore-failure-jid-mismatch-learn-more");
                        r32 = new AnonymousClass3L4(20);
                        C90484aE.A10(this, r32, R.string.f12nameremoved);
                        r32.A00.putCharSequence("message", A013);
                        r32.A01();
                        r32.A02(false);
                        C90484aE.A11(this, r32, R.string.f12nameremoved);
                        boolean A0m2 = A0m();
                        i2 = R.string.f12nameremoved;
                        if (A0m2) {
                            i2 = R.string.f12nameremoved;
                        }
                    } else {
                        return;
                    }
                } else {
                    if (i4 == 0 && (r0 = this.A0B) != null && r0.A03) {
                        ArrayList A0I2 = AnonymousClass001.A0I();
                        AnonymousClass6Y6.A04(this.A0C, this.A06.A02(), A0I2);
                        try {
                            C21520zN r12 = this.A0U;
                            AnonymousClass00C.A0D(r12, 0);
                            if (r12.A0E(5284)) {
                                A0I2.addAll(this.A0O.A0L());
                            } else {
                                File A0I3 = this.A0O.A0I();
                                if (A0I3 != null) {
                                    A0I2.add(A0I3);
                                }
                            }
                        } catch (IOException unused) {
                            Log.e("restore>RestoreFromBackupActivity/after-msgstore-verified/handle-failure/unable to get last backup file for cleanup");
                        }
                        Iterator it = A0I2.iterator();
                        while (it.hasNext()) {
                            C90504aG.A0a(it).delete();
                        }
                        StringBuilder A0u5 = AnonymousClass000.A0u();
                        A0u5.append("restore>RestoreFromBackupActivity/after-msgstore-verified/handle-failure/clean up downloaded files for");
                        C36321k7.A1a(A0u5, C34191gb.A07(this.A0B.A05));
                    }
                    TextUtils.join(",", this.A0t);
                    TextUtils.join(",", this.A0u);
                    if (this.A09.A2J()) {
                        C18740tg.A01();
                        if (!A0n(this)) {
                            r3 = new AnonymousClass3L4(21);
                            C90484aE.A12(this, r3, R.string.f12nameremoved);
                            r3.A02(false);
                            C90484aE.A11(this, r3, R.string.f12nameremoved);
                        } else {
                            return;
                        }
                    } else if (A0m()) {
                        C18740tg.A01();
                        if (!A0n(this)) {
                            r3 = new AnonymousClass3L4(18);
                            C90484aE.A12(this, r3, R.string.f12nameremoved);
                            r3.A02(false);
                            C90484aE.A11(this, r3, R.string.f12nameremoved);
                            r3.A00.putString("negative_button", getString(R.string.f12nameremoved));
                        } else {
                            return;
                        }
                    } else {
                        A3l(false);
                        A0l(false);
                        BO5(R.string.f12nameremoved);
                        return;
                    }
                    A002 = r3.A00();
                    AnonymousClass09Y A0O2 = C36341k9.A0O(this);
                    A0O2.A0D(A002, (String) null);
                    A0O2.A00(true);
                }
            } else {
                Log.w("restore>RestoreFromBackupActivity/storage-state/error-permission-unavailable");
                A0k(true);
                A0o(this);
                return;
            }
        }
        A002 = C90474aD.A0S(this, r32, i2);
        AnonymousClass09Y A0O22 = C36341k9.A0O(this);
        A0O22.A0D(A002, (String) null);
        A0O22.A00(true);
    }

    public void A3n() {
        C18740tg.A01();
        Log.i("restore>RestoreFromBackupActivity/show-msgstore-downloading-view");
        C03570Gk.A0B(this, R.id.restore_actions_view).setVisibility(8);
        C36391kE.A16(this, R.id.restore_general_info, 8);
        C36391kE.A16(this, R.id.calculating_progress_view, 8);
        C03570Gk.A0B(this, R.id.google_drive_restore_animation_view).setVisibility(0);
        this.A02.setVisibility(0);
        this.A02.setIndeterminate(true);
        AnonymousClass00F.A00(this, C224314h.A01(this, R.attr.f4nameremoved));
        this.A04.setVisibility(0);
        this.A0l = C36391kE.A0Q(this, R.id.google_drive_media_will_be_downloaded_later_notice);
        long j = this.A0j;
        if (j == 0) {
            j = C36331k8.A06(this).getLong("gdrive_approx_media_download_size", 0);
            this.A0j = j;
        }
        if (j > 0) {
            String A032 = AnonymousClass3TF.A03(this.A00, j);
            C36341k9.A0s(this, this.A0l, new Object[]{A032}, R.string.f12nameremoved);
            this.A0l.setVisibility(0);
        }
    }

    public void A3p() {
        String A072;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("restore>RestoreFromBackupActivity/skip-restore/user declined to restore backup from ");
        AnonymousClass6PR r0 = this.A0B;
        if (r0 == null) {
            A072 = "<unset account>";
        } else {
            A072 = C34191gb.A07(r0.A05);
        }
        C36321k7.A1a(A0u2, A072);
        Log.i("restore>RestoreFromBackupActivity/skip-restore/stopping-approx-transfer-size-calc-thread");
        AnonymousClass6PR r02 = this.A0B;
        if (r02 != null && r02.A02) {
            A0L(this, 6);
        }
        this.A0v.set(true);
        C19420v0 r1 = this.A09;
        Executor executor = AnonymousClass6Y6.A00;
        r1.A1A(0);
        this.A09.A0q();
        this.A09.A2R(0);
        this.A09.A1u(false);
        C1497072l r12 = new C1497072l(this, 19);
        if (C224714l.A02()) {
            this.A04.Boy(r12);
        } else {
            r12.run();
        }
        this.A0D.A06(10);
        String A0f2 = C90524aI.A0f(this);
        if (A0f2 != null) {
            Intent A14 = AnonymousClass190.A14(this, "action_remove_backup_info");
            A14.putExtra("account_name", A0f2);
            A14.putExtra("remove_account_name", true);
            C111795cr.A01(this, A14);
        }
        setResult(2);
        A0J(this);
    }

    public void A3q(long j, long j2) {
        String A0v2;
        C18740tg.A00();
        this.A0i = j;
        this.A0j = j2;
        C36341k9.A0w(C19420v0.A00(this.A09), "gdrive_approx_media_download_size", j2);
        C36321k7.A1V("washaredpreferences/save-gdrive-media-download-transfer-size/", AnonymousClass000.A0u(), j2);
        if (j <= 0) {
            A0v2 = getString(R.string.f12nameremoved);
        } else {
            A0v2 = C36391kE.A0v(this, AnonymousClass3TF.A03(this.A00, j), AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
        }
        this.A0z.block();
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("restore>RestoreFromBackupActivity/update-restore-info/ total download size: ");
        A0u2.append(j);
        C36321k7.A1V(" media download size: ", A0u2, j2);
        this.A05.A0H(new AnonymousClass751(18, A0v2, this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.f12nameremoved);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        StringBuilder A0v2;
        String str;
        StringBuilder A0v3;
        String str2;
        if (menuItem.getItemId() != 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        String str3 = "one-time-restore";
        this.A0Z.A02(str3);
        C62623Gw r5 = this.A0X;
        AnonymousClass1X8 r4 = this.A0Z;
        C131006Ni r0 = this.A0P;
        if (r0 != null) {
            int i = r0.A00;
            if (i == 3) {
                A0v3 = AnonymousClass000.A0v(str3);
                str2 = "-jid-mismatch";
            } else if (i == 4) {
                A0v3 = AnonymousClass000.A0v(str3);
                str2 = "-integrity-check-failed";
            }
            str3 = AnonymousClass000.A0q(str2, A0v3);
        }
        int A002 = C34201gc.A00(this.A0K.A00);
        if (A002 != 0) {
            if (A002 == 1) {
                A0v2 = AnonymousClass000.A0v(str3);
                str = "-no-gs";
            } else if (A002 != 2) {
                A0v2 = AnonymousClass000.A0u();
                if (A002 != 3) {
                    A0v2.append(str3);
                    str = "-gs-invalid";
                } else {
                    A0v2.append(str3);
                    str = "-gs-disabled";
                }
            } else {
                A0v2 = AnonymousClass000.A0v(str3);
                str = "-update-gs";
            }
            str3 = AnonymousClass000.A0q(str, A0v2);
        }
        r5.A01(this, r4, str3);
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass6PR r0 = this.A0B;
        if (r0 != null) {
            bundle.putBundle("restore_account_data", r0.A01());
        }
        bundle.putLong("total_download_size", this.A0i);
        bundle.putLong("media_download_size", this.A0j);
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("restore>RestoreFromBackupActivity/save-state/total-download-size:");
        A0u2.append(this.A0i);
        A0u2.append(", media-download-size:");
        A0u2.append(this.A0j);
        A0u2.append(", restore-account-data:");
        C36321k7.A1N(this.A0B, A0u2);
    }

    public void setTitle(int i) {
        C36401kF.A0H(this, R.id.title_toolbar_text).setText(i);
        C65983Uf.A0O(this, this.A0U, R.id.title_toolbar_text);
    }
}
