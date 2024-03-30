package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.app.Dialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.backup.google.BaseNewUserSetupActivity$AuthRequestDialogFragment;
import com.whatsapp.backup.google.SingleChoiceListDialogFragment;
import com.whatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4y9  reason: invalid class name and case insensitive filesystem */
public abstract class C101704y9 extends C100894wD implements C88344Si, C88774Tz {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ImageView A06;
    public TextView A07;
    public TextView A08;
    public SwitchCompat A09;
    public SwitchCompat A0A;
    public WaTextView A0B;
    public C24431Ck A0C;
    public C33101ei A0D;
    public AnonymousClass6FS A0E;
    public C33161ep A0F;
    public GoogleDriveNewUserSetupViewModel A0G;
    public C229216m A0H;
    public C19630wG A0I;
    public C20830yE A0J;
    public C21570zS A0K;
    public AnonymousClass005 A0L;
    public boolean A0M;
    public String[] A0N;
    public final ConditionVariable A0O = new ConditionVariable(false);
    public final ConditionVariable A0P = new ConditionVariable(false);
    public final AtomicBoolean A0Q = new AtomicBoolean();
    public final ServiceConnection A0R = new C110185aG(this, 0);
    public volatile boolean A0S;

    private void A0H() {
        this.A04.Boy(new C1503374w(this, AccountManager.get(this).addAccount("com.google", (String) null, (String[]) null, (Bundle) null, this, (AccountManagerCallback) null, (Handler) null), new BaseNewUserSetupActivity$AuthRequestDialogFragment(), 33));
    }

    public void onDestroy() {
        this.A0M = true;
        this.A0Q.set(false);
        unbindService(this.A0R);
        super.onDestroy();
    }

    public static void A0J(C101704y9 r4, String str, String str2) {
        r4.A0P.open();
        C90484aE.A1A(r4);
        if (str != null) {
            GoogleDriveNewUserSetupViewModel googleDriveNewUserSetupViewModel = r4.A0G;
            C19420v0 r1 = googleDriveNewUserSetupViewModel.A04;
            if (!TextUtils.equals(r1.A0c(), str2)) {
                r1.A1R(str2);
                AnonymousClass6FS r2 = googleDriveNewUserSetupViewModel.A03;
                synchronized (r2.A0B) {
                    r2.A00 = null;
                }
                C90464aC.A1I("gdrive-new-user-view-model/update-account-name new accountName is ", str2, AnonymousClass000.A0u());
                googleDriveNewUserSetupViewModel.A00.A0D(str2);
                Intent A14 = AnonymousClass190.A14(r4, "action_fetch_backup_info");
                A14.putExtra("account_name", str2);
                C111795cr.A01(r4, A14);
            } else {
                C90464aC.A1I("gdrive-new-user-view-model/update-account-name account unchanged, token received for ", str2, AnonymousClass000.A0u());
            }
        }
        C1497072l.A00(r4.A04, r4, 6);
    }

    public void A3j() {
        this.A0G.A0S(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bgl(java.lang.String[] r8, int r9, int r10) {
        /*
            r7 = this;
            X.0v0 r0 = r7.A09
            int r2 = r0.A0C()
            if (r10 < 0) goto L_0x00ab
            int[] r1 = com.whatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel.A07
            r0 = 5
            if (r10 >= r0) goto L_0x00ab
            r0 = r1[r10]
        L_0x000f:
            if (r0 == 0) goto L_0x00a2
            if (r2 != 0) goto L_0x001c
            X.005 r2 = r7.A0L
            X.0v0 r1 = r7.A09
            android.view.View r0 = r7.A01
            X.C53282r4.A00(r7, r0, r1, r2)
        L_0x001c:
            r0 = 10
            if (r9 != r0) goto L_0x00ae
            int[] r2 = com.whatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel.A07
            r0 = 5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            if (r10 <= r0) goto L_0x0033
            java.lang.String r0 = "settings-gdrive/change-freq/unexpected-choice/"
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r10)
        L_0x002f:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0032:
            return
        L_0x0033:
            java.lang.String r0 = "settings-gdrive/change-freq/index:"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "/value:"
            r1.append(r0)
            r0 = r2[r10]
            X.C36321k7.A1Y(r1, r0)
            X.0v0 r0 = r7.A09
            int r3 = r0.A0C()
            r2 = r2[r10]
            com.whatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel r0 = r7.A0G
            boolean r0 = r0.A0S(r2)
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = "settings-gdrive/change-freq failed to set the new frequency."
            goto L_0x002f
        L_0x0058:
            r1 = 8
            android.view.View r0 = r7.A01
            if (r2 == 0) goto L_0x0078
            r0.setVisibility(r1)
            if (r3 != 0) goto L_0x0032
            int r1 = X.C90514aH.A0G(r7)
            r0 = 1
            if (r1 == r0) goto L_0x0032
            X.0v0 r0 = r7.A09
            boolean r0 = X.AnonymousClass6Y6.A05(r0)
            if (r0 != 0) goto L_0x0032
            android.view.View r0 = r7.A00
            r0.performClick()
            return
        L_0x0078:
            r0.setVisibility(r1)
            X.0v0 r0 = r7.A09
            java.lang.String r3 = "gdrive_next_prompt_for_setup_timestamp"
            r1 = -1
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r0)
            long r5 = r0.getLong(r3, r1)
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r1 = r1 + r3
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0032
            X.0v0 r2 = r7.A09
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r3
            r2.A1G(r0)
            return
        L_0x00a2:
            android.view.View r1 = r7.A01
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x001c
        L_0x00ab:
            r0 = r2
            goto L_0x000f
        L_0x00ae:
            r0 = 17
            if (r9 != r0) goto L_0x00cb
            r1 = r8[r10]
            r0 = 2131889959(0x7f120f27, float:1.9414596E38)
            java.lang.String r0 = r7.getString(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c5
            r7.A0H()
            return
        L_0x00c5:
            r0 = r8[r10]
            r7.A0K(r0)
            return
        L_0x00cb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "unexpected dialog box: "
            java.lang.IllegalStateException r0 = X.C90464aC.A0R(r0, r1, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101704y9.Bgl(java.lang.String[], int, int):void");
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

    public static void A0I(BaseNewUserSetupActivity$AuthRequestDialogFragment baseNewUserSetupActivity$AuthRequestDialogFragment, C101704y9 r4, String str) {
        C18740tg.A00();
        C90464aC.A1I("settings-gdrive/auth-request account being used is ", str, AnonymousClass000.A0u());
        r4.A0S = false;
        r4.A05.A0H(new AVa(r4, baseNewUserSetupActivity$AuthRequestDialogFragment, 3));
        ConditionVariable conditionVariable = r4.A0P;
        conditionVariable.close();
        C1502274l.A00(r4.A04, r4, baseNewUserSetupActivity$AuthRequestDialogFragment, str, 10);
        Log.i("settings-gdrive/auth-request blocking on tokenReceived");
        C224214g r3 = new C224214g("settings-gdrive/fetch-auth-token");
        conditionVariable.block(AnonymousClass6X5.A0L);
        r4.A05.A0H(new AVa(r4, r3, 5));
    }

    private void A0K(String str) {
        C90464aC.A1I("setting-gdrive/activity-result/account-picker accountName is ", str, AnonymousClass000.A0u());
        if (str != null) {
            C1502274l.A00(this.A04, this, new BaseNewUserSetupActivity$AuthRequestDialogFragment(), str, 11);
        } else if (C90524aI.A0f(this) == null) {
            Log.i("setting-gdrive/activity-result/account-picker accountName is null");
            A3j();
        }
    }

    public void A3i() {
        int i;
        C18740tg.A01();
        if (!AnonymousClass3SJ.A04(this) && !this.A0M) {
            if (C90514aH.A0G(this) == 1) {
                Log.i("settings-gdrive/account-selector/backup/running");
                i = R.string.f12nameremoved;
            } else if (AnonymousClass6Y6.A05(this.A09)) {
                Log.i("settings-gdrive/account-selector/restore/running");
                i = R.string.f12nameremoved;
            } else if (this.A0J.A02("android.permission.GET_ACCOUNTS") != 0 || !this.A0H.A00()) {
                C90504aG.A19(this);
                return;
            } else {
                String A0f = C90524aI.A0f(this);
                Account[] accountsByType = AccountManager.get(this).getAccountsByType("com.google");
                int length = accountsByType.length;
                if (length > 0) {
                    C36321k7.A1T("settings-gdrive/account-selector/starting-account-picker/num-accounts/", AnonymousClass000.A0u(), length);
                    int i2 = -1;
                    int i3 = length + 1;
                    String[] strArr = new String[i3];
                    int i4 = 0;
                    do {
                        strArr[i4] = accountsByType[i4].name;
                        if (A0f != null && A0f.equals(strArr[i4])) {
                            i2 = i4;
                        }
                        i4++;
                    } while (i4 < length);
                    C36421kH.A0k(this, R.string.f12nameremoved, i3 - 1, strArr);
                    SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
                    Bundle A0N2 = C90484aE.A0N(this);
                    A0N2.putInt("selected_item_index", i2);
                    A0N2.putStringArray("multi_line_list_items_key", strArr);
                    singleChoiceListDialogFragment.A17(A0N2);
                    if (getSupportFragmentManager().A0N("account-picker") == null) {
                        AnonymousClass09Y A0O2 = C36341k9.A0O(this);
                        A0O2.A0D(singleChoiceListDialogFragment, "account-picker");
                        A0O2.A00(true);
                        return;
                    }
                    return;
                }
                Log.i("settings-gdrive/account-selector/no-account-found/start-add-account-activity");
                A0H();
                return;
            }
            BO5(i);
        }
    }

    public void BVh(int i) {
        String str;
        switch (i) {
            case 12:
                str = "settings-gdrive/cancel-media-restore-dialog/user-decided-not-to-cancel";
                break;
            case 13:
                str = "settings-gdrive/perform-backup user declined to perform Google Drive backup over cellular (when the settings say Wi-Fi only)";
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
                this.A0E.A04();
                return;
            case 13:
                Log.i("settings-gdrive/perform-backup user decided to perform Google Drive backup over cellular (when the settings say Wi-Fi only)");
                this.A0D.A01();
                C111795cr.A00(this, this.A0E);
                return;
            case 14:
                Log.i("settings-gdrive/google-play-services-is-broken");
                this.A0G.A0S(0);
                return;
            case 15:
                Log.i("settings-gdrive/user-confirmed-media-restore-over-cellular");
                this.A0D.A02();
                return;
            case 16:
                Log.i("settings-gdrive/user-confirmed-backup-over-cellular");
                this.A0D.A01();
                return;
            case 18:
                Log.i("settings-gdrive/user-confirmed-cancel-encrypted-backup");
                Log.i("settings-gdrive/cancel-backup");
                this.A06.setVisibility(8);
                this.A0E.A04();
                if (AnonymousClass6Y6.A08(this.A0D)) {
                    try {
                        Iterator A13 = C90514aH.A13(C90514aH.A0V(this.A0K).A04("com.whatsapp.backup.google.google-backup-worker").get());
                        while (A13.hasNext()) {
                            if (!AnonymousClass6GL.A01(((AnonymousClass6DP) A13.next()).A00)) {
                                C90514aH.A0V(this.A0K).A0B("com.whatsapp.backup.google.google-backup-worker");
                                return;
                            }
                        }
                        return;
                    } catch (InterruptedException | ExecutionException unused) {
                        Log.e("settings-gdrive/cancel-backup couldn't get work info for BackupWorker.");
                        return;
                    }
                } else {
                    return;
                }
            default:
                throw C90464aC.A0R("unexpected dialog box: ", AnonymousClass000.A0u(), i);
        }
    }

    public void BVr(int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("settings-gdrive/dialogId-");
        A0u.append(i);
        C36321k7.A1a(A0u, "-dismissed");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("settings-gdrive/activity-result request: ");
        A0u.append(i);
        C36321k7.A1T(" result: ", A0u, i2);
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
                    A0K(str2);
                } else if (i == 150 && i2 == -1) {
                    A3i();
                }
            } else if (i2 == -1) {
                C18740tg.A06(intent);
                A0J(this, intent.getStringExtra("authtoken"), intent.getStringExtra("authAccount"));
            } else {
                C90484aE.A1A(this);
            }
        } else if (i2 == -1) {
            boolean A2I = this.A0C.A03.A2I();
            WaTextView waTextView = this.A0B;
            int i3 = R.string.f12nameremoved;
            if (A2I) {
                i3 = R.string.f12nameremoved;
            }
            waTextView.setText(i3);
        }
    }

    public void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        this.A0G = (GoogleDriveNewUserSetupViewModel) C36441kJ.A0b(this).A00(GoogleDriveNewUserSetupViewModel.class);
        setTitle(R.string.f12nameremoved);
        setContentView((int) R.layout.f9nameremoved);
        C36381kD.A0O(this).A0U(true);
        this.A01 = C03570Gk.A0B(this, R.id.backup_banner_view);
        this.A00 = findViewById(R.id.settings_gdrive_change_account_view);
        this.A07 = C36401kF.A0H(this, R.id.settings_gdrive_account_name_summary);
        this.A06 = C36411kG.A0Q(this, R.id.cancel_download);
        this.A03 = findViewById(R.id.settings_gdrive_change_frequency_view);
        this.A08 = C36391kE.A0Q(this, R.id.settings_gdrive_backup_options_summary);
        this.A05 = findViewById(R.id.settings_gdrive_network_settings_view);
        this.A0A = (SwitchCompat) findViewById(R.id.gdrive_network_setting);
        this.A04 = findViewById(R.id.settings_gdrive_backup_include_video);
        this.A02 = findViewById(R.id.settings_gdrive_e2e_encryption);
        this.A0B = (WaTextView) findViewById(R.id.settings_gdrive_e2e_encryption_value);
        this.A09 = (SwitchCompat) findViewById(R.id.include_video_setting);
        int[] iArr = GoogleDriveNewUserSetupViewModel.A06;
        this.A0N = new String[5];
        int i = 0;
        do {
            int i2 = iArr[i];
            if (i2 == R.string.f12nameremoved) {
                this.A0N[i] = C36341k9.A0e(this, new Object[1], R.string.f12nameremoved, 0, R.string.f12nameremoved);
            } else {
                C36421kH.A0k(this, i2, i, this.A0N);
            }
            i++;
        } while (i < 5);
        C48732hx.A00(this.A02, this, 24);
        C165147sx.A01(this, this.A0G.A02, 5);
        C165147sx.A01(this, this.A0G.A00, 7);
        C165147sx.A01(this, this.A0G.A01, 6);
        boolean A2I = this.A0C.A03.A2I();
        WaTextView waTextView = this.A0B;
        int i3 = R.string.f12nameremoved;
        if (A2I) {
            i3 = R.string.f12nameremoved;
        }
        waTextView.setText(i3);
        C135426cg r1 = new C135426cg(this, 4);
        this.A00.setOnClickListener(r1);
        this.A05.setOnClickListener(r1);
        this.A03.setOnClickListener(r1);
        this.A04.setOnClickListener(r1);
        bindService(AnonymousClass190.A14(this, (String) null), this.A0R, 1);
        if (!C34191gb.A08(this.A0I.A00)) {
            Log.i("settings-gdrive/create google drive access not allowed.");
            finish();
        }
        if ((bundle == null || !bundle.getBoolean("intent_already_parsed", false)) && (intent = getIntent()) != null && intent.getAction() != null) {
            onNewIntent(intent);
        }
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
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("settings-gdrive/new-intent/unexpected-action/");
                    C36321k7.A1Z(A0u, intent.getAction());
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

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("intent_already_parsed", true);
    }
}
