package com.whatsapp.registration.accountdefence;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass07B;
import X.AnonymousClass0FM;
import X.AnonymousClass13E;
import X.AnonymousClass155;
import X.AnonymousClass1X8;
import X.AnonymousClass3G5;
import X.AnonymousClass3LW;
import X.AnonymousClass3UY;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C19420v0;
import X.C21520zN;
import X.C32681e1;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C39001qm;
import X.C65973Ue;
import X.C65983Uf;
import X.C81143wX;
import X.C89354Wf;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.util.Objects;

public class DeviceConfirmationRegistrationActivity extends AnonymousClass155 {
    public ProgressDialog A00;
    public TextEmojiLabel A01;
    public TextEmojiLabel A02;
    public TextEmojiLabel A03;
    public C33751fs A04;
    public C21520zN A05;
    public AnonymousClass13E A06;
    public NewDeviceConfirmationRegistrationViewModel A07;
    public C32681e1 A08;
    public boolean A09;
    public boolean A0A;

    public Dialog onCreateDialog(int i) {
        C39001qm r3;
        int i2;
        int i3;
        switch (i) {
            case 11:
                View inflate = getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) null);
                C39001qm A002 = AnonymousClass3LW.A00(this);
                A002.A0j(inflate);
                A002.A0d(R.string.f12nameremoved);
                C39001qm.A0D(A002, this, 37, R.string.f12nameremoved);
                C39001qm.A0C(A002, this, 38, R.string.f12nameremoved);
                AnonymousClass0FM create = A002.create();
                A01(C36401kF.A0P(inflate, R.id.message), C81143wX.A00(this, 36), "send-device-confirmation-dialog-learn-more");
                return create;
            case 12:
                View inflate2 = getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) null);
                r3 = AnonymousClass3LW.A00(this);
                TextView A0P = C36391kE.A0P(inflate2, R.id.verification_complete_message);
                if (A0P != null) {
                    A0P.setText(R.string.f12nameremoved);
                }
                r3.setView(inflate2);
                break;
            case 13:
                r3 = AnonymousClass3LW.A00(this);
                r3.A0c(R.string.f12nameremoved);
                i2 = R.string.f12nameremoved;
                i3 = 39;
                break;
            case 14:
                r3 = AnonymousClass3LW.A00(this);
                r3.A0d(R.string.f12nameremoved);
                r3.A0c(R.string.f12nameremoved);
                i2 = R.string.f12nameremoved;
                i3 = 40;
                break;
            case 15:
                long A0S = this.A07.A0S();
                View inflate3 = getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) null);
                TextEmojiLabel A0O = C36401kF.A0O(inflate3, R.id.message);
                C39001qm A003 = AnonymousClass3LW.A00(this);
                A003.A0j(inflate3);
                A003.A0q(C36391kE.A0v(this, AnonymousClass3UY.A0D(this.A00, A0S), new Object[1], 0, R.string.f12nameremoved));
                C39001qm.A0D(A003, this, 41, R.string.f12nameremoved);
                AnonymousClass0FM create2 = A003.create();
                A0O.setText(R.string.f12nameremoved);
                A01(A0O, C81143wX.A00(this, 30), "send-device-confirmation-too-recent-dialog-learn-more");
                return create2;
            case 16:
                r3 = AnonymousClass3LW.A00(this);
                r3.A0d(R.string.f12nameremoved);
                r3.A0c(R.string.f12nameremoved);
                r3.A0r(false);
                i2 = R.string.f12nameremoved;
                i3 = 42;
                break;
            case 17:
                NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel = this.A07;
                String str = newDeviceConfirmationRegistrationViewModel.A01;
                C18740tg.A06(str);
                String str2 = newDeviceConfirmationRegistrationViewModel.A00;
                C18740tg.A06(str2);
                String A0E = C65983Uf.A0E(str2, str);
                C18740tg.A06(A0E);
                String A0v = C36391kE.A0v(this, this.A00.A0H(A0E.replace(' ', 160)), new Object[1], 0, R.string.device_confirmation_dialog_description_learn_more);
                r3 = AnonymousClass3LW.A00(this);
                r3.A0p(Html.fromHtml(A0v));
                i2 = R.string.f12nameremoved;
                i3 = 36;
                break;
            default:
                return super.onCreateDialog(i);
        }
        C39001qm.A0D(r3, this, i3, i2);
        return r3.create();
    }

    private void A01(TextEmojiLabel textEmojiLabel, Runnable runnable, String str) {
        C32681e1 r3 = this.A08;
        Context context = textEmojiLabel.getContext();
        String A0u = C36371kC.A0u(textEmojiLabel);
        Objects.requireNonNull(runnable);
        SpannableStringBuilder A022 = r3.A02(context, C81143wX.A00(runnable, 35), A0u, str);
        C36321k7.A0m(this, textEmojiLabel);
        textEmojiLabel.setText(A022);
    }

    public static void A07(DeviceConfirmationRegistrationActivity deviceConfirmationRegistrationActivity) {
        Log.i("DeviceConfirmationRegistrationActivity/removeProgressDialog/");
        ProgressDialog progressDialog = deviceConfirmationRegistrationActivity.A00;
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        deviceConfirmationRegistrationActivity.A00 = null;
    }

    public void A2F() {
        if (!this.A0A) {
            this.A0A = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A08 = C36351kA.A0p(r1);
            this.A06 = (AnonymousClass13E) A0B.A96.get();
            this.A05 = C36401kF.A0Y(A0B);
            this.A04 = C36361kB.A0X(r1);
        }
    }

    public DeviceConfirmationRegistrationActivity(int i) {
        this.A0A = false;
        C89354Wf.A00(this, 49);
    }

    public void onCreate(Bundle bundle) {
        Intent intent;
        AnonymousClass07B A0Q;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        Toolbar toolbar = (Toolbar) findViewById(R.id.title_toolbar);
        if (!ViewConfiguration.get(this).hasPermanentMenuKey() && (A0Q = C36431kI.A0Q(this, toolbar)) != null) {
            A0Q.A0U(false);
            A0Q.A0X(false);
        }
        C65983Uf.A0O(this, this.A05, R.id.title_toolbar_text);
        NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel = (NewDeviceConfirmationRegistrationViewModel) C36441kJ.A0b(this).A00(NewDeviceConfirmationRegistrationViewModel.class);
        this.A07 = newDeviceConfirmationRegistrationViewModel;
        C19420v0 r1 = newDeviceConfirmationRegistrationViewModel.A08;
        newDeviceConfirmationRegistrationViewModel.A00 = r1.A0f();
        newDeviceConfirmationRegistrationViewModel.A01 = r1.A0h();
        this.A06.A04(this.A07);
        if (bundle == null && (intent = getIntent()) != null) {
            boolean hasExtra = intent.hasExtra("sms_retry_time");
            boolean hasExtra2 = intent.hasExtra("voice_retry_time");
            long longExtra = intent.getLongExtra("sms_retry_time", 0);
            long longExtra2 = intent.getLongExtra("voice_retry_time", 0);
            this.A09 = getIntent().getBooleanExtra("change_number", false);
            boolean booleanExtra = getIntent().getBooleanExtra("use_sms_retriever", false);
            NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel2 = this.A07;
            boolean z = this.A09;
            if (hasExtra) {
                AnonymousClass3G5 r9 = newDeviceConfirmationRegistrationViewModel2.A0E.A05;
                C36321k7.A1V("AccountDefenceLocalDataRepository/saveSmsRetryTime/", AnonymousClass000.A0u(), longExtra);
                SharedPreferences.Editor A0G = C36381kD.A0G(r9.A00, "AccountDefenceLocalDataRepository_prefs");
                A0G.putLong("com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.sms_retry_time", longExtra);
                if (!A0G.commit()) {
                    Log.e("AccountDefenceLocalDataRepositoryAccountDefenceLocalDataRepository/saveSmsRetryTime/error");
                }
            }
            if (hasExtra2) {
                AnonymousClass3G5 r7 = newDeviceConfirmationRegistrationViewModel2.A0E.A05;
                C36321k7.A1V("AccountDefenceLocalDataRepository/saveVoiceRetryTime/", AnonymousClass000.A0u(), longExtra2);
                SharedPreferences.Editor A0G2 = C36381kD.A0G(r7.A00, "AccountDefenceLocalDataRepository_prefs");
                A0G2.putLong("com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.voice_retry_time", longExtra2);
                if (!A0G2.commit()) {
                    Log.e("AccountDefenceLocalDataRepositoryAccountDefenceLocalDataRepository/saveVoiceRetryTime/error");
                }
            }
            newDeviceConfirmationRegistrationViewModel2.A03 = z;
            newDeviceConfirmationRegistrationViewModel2.A04 = booleanExtra;
        }
        C65973Ue.A00(this, this.A07.A0H, 19);
        C65973Ue.A00(this, this.A07.A0G, 18);
        NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel3 = this.A07;
        int A002 = newDeviceConfirmationRegistrationViewModel3.A0C.A00();
        C36321k7.A1T("NewDeviceConfirmationRegistrationViewModel/validateRegistrationState/registration state is ", AnonymousClass000.A0u(), A002);
        if (A002 != 14) {
            C36341k9.A16(newDeviceConfirmationRegistrationViewModel3.A0H, 1);
        }
        this.A02 = C36441kJ.A0e(this, R.id.device_confirmation_learn_more);
        this.A03 = C36441kJ.A0e(this, R.id.device_confirmation_resend_notice);
        this.A01 = C36441kJ.A0e(this, R.id.device_confirmation_second_code);
        TextEmojiLabel textEmojiLabel = this.A02;
        Object[] A0L = AnonymousClass001.A0L();
        NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel4 = this.A07;
        String str = newDeviceConfirmationRegistrationViewModel4.A01;
        C18740tg.A06(str);
        String str2 = newDeviceConfirmationRegistrationViewModel4.A00;
        C18740tg.A06(str2);
        String A0E = C65983Uf.A0E(str2, str);
        C18740tg.A06(A0E);
        A0L[0] = this.A00.A0H(A0E.replace(' ', 160));
        C36341k9.A0s(this, textEmojiLabel, A0L, R.string.device_confirmation_learn_more_message);
        A01(this.A02, C81143wX.A00(this, 31), "device-confirmation-learn-more");
        A01(this.A03, C81143wX.A00(this, 32), "device-confirmation-resend-notice");
        A01(this.A01, C81143wX.A00(this, 33), "confirm-with-second-code");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 2, 0, R.string.f12nameremoved);
        if (!this.A09) {
            menu.add(0, 1, 0, R.string.f12nameremoved);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 1) {
            if (itemId == 2) {
                NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel = this.A07;
                AnonymousClass1X8 r2 = newDeviceConfirmationRegistrationViewModel.A0D;
                r2.A02("device-confirm");
                newDeviceConfirmationRegistrationViewModel.A0A.A01(this, r2, "device-confirm");
            }
            return super.onOptionsItemSelected(menuItem);
        }
        this.A07.A0T();
        return true;
    }

    public DeviceConfirmationRegistrationActivity() {
        this(0);
    }
}
