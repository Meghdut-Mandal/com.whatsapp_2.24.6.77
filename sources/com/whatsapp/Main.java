package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00h;
import X.AnonymousClass0NT;
import X.AnonymousClass0XN;
import X.AnonymousClass11F;
import X.AnonymousClass12P;
import X.AnonymousClass190;
import X.AnonymousClass1Pd;
import X.AnonymousClass1RU;
import X.AnonymousClass1VX;
import X.AnonymousClass24I;
import X.AnonymousClass3LW;
import X.AnonymousClass3SJ;
import X.AnonymousClass3TX;
import X.AnonymousClass6TO;
import X.C000600g;
import X.C09210c0;
import X.C11390gE;
import X.C11980hJ;
import X.C11990hK;
import X.C12550iH;
import X.C16150oh;
import X.C18300sw;
import X.C18910u1;
import X.C191779Eh;
import X.C19460v5;
import X.C20360xR;
import X.C21360z5;
import X.C26021Io;
import X.C29301Wc;
import X.C29411Wn;
import X.C33771fu;
import X.C39001qm;
import X.C54522t5;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.util.Objects;

public class Main extends AnonymousClass24I implements C16150oh {
    public C19460v5 A00;
    public C21360z5 A01;
    public AnonymousClass1RU A02;
    public AnonymousClass1Pd A03;
    public AnonymousClass12P A04;
    public C20360xR A05;
    public C191779Eh A06;
    public WhatsAppLibLoader A07;
    public AnonymousClass005 A08;
    public AnonymousClass005 A09;
    public AnonymousClass005 A0A;
    public AnonymousClass005 A0B;
    public AnonymousClass005 A0C;
    public AnonymousClass005 A0D;
    public AnonymousClass005 A0E;
    public AnonymousClass005 A0F;
    public AnonymousClass005 A0G;
    public AnonymousClass005 A0H;
    public AnonymousClass005 A0I;
    public boolean A0J;
    public AnonymousClass0NT A0K;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0063, code lost:
        if (isFinishing() != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        startActivity(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a6, code lost:
        if (((X.AnonymousClass1VX) r13.A0A.get()).A02() != false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a9, code lost:
        ((X.C29501Ww) r13.A0E.get()).A0B(1);
        r4 = X.AnonymousClass190.A0B(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ee, code lost:
        ((X.C29501Ww) r13.A0E.get()).A0B(4);
        r4 = A01(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0105, code lost:
        if (r13.A09.A2P() != false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0107, code lost:
        r4 = new android.content.Intent();
        r4.setClassName(getPackageName(), "com.whatsapp.userban.ui.BanAppealActivity");
        r4.putExtra("launch_source", 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x011c, code lost:
        r4 = A01(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        ((X.C29501Ww) r13.A0E.get()).A0B(0);
        r4 = new android.content.Intent();
        r4.setClassName(getPackageName(), "com.whatsapp.registration.EULA");
        r4.putExtra("show_registration_first_dlg", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005d, code lost:
        if (r13.A0J == false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3j() {
        /*
            r13 = this;
            r6 = r13
            X.0wQ r0 = r13.A02
            com.whatsapp.Me r0 = r0.A06()
            if (r0 != 0) goto L_0x01e3
            boolean r0 = r13.isFinishing()
            if (r0 != 0) goto L_0x006b
            X.12U r0 = r13.A0A
            int r2 = r0.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Main/messageStoreVerified/registration state is "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r2)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 4
            r12 = 1
            r5 = 0
            switch(r2) {
                case 0: goto L_0x0071;
                case 1: goto L_0x003d;
                case 2: goto L_0x008d;
                case 3: goto L_0x0028;
                case 4: goto L_0x00ee;
                case 5: goto L_0x003d;
                case 6: goto L_0x00b9;
                case 7: goto L_0x00c8;
                case 8: goto L_0x00e9;
                case 9: goto L_0x00ff;
                case 10: goto L_0x0107;
                case 11: goto L_0x0122;
                case 12: goto L_0x009a;
                case 13: goto L_0x011c;
                case 14: goto L_0x0132;
                case 15: goto L_0x0159;
                case 16: goto L_0x018f;
                case 17: goto L_0x011c;
                case 18: goto L_0x00c8;
                case 19: goto L_0x011c;
                case 20: goto L_0x00a9;
                case 21: goto L_0x01a1;
                case 22: goto L_0x01bb;
                case 23: goto L_0x009a;
                default: goto L_0x0028;
            }
        L_0x0028:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "main/invalid/registration state="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; default to EULA"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x003d:
            X.005 r0 = r13.A0E
            java.lang.Object r0 = r0.get()
            X.1Ww r0 = (X.C29501Ww) r0
            r0.A0B(r5)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.EULA"
            r4.setClassName(r1, r0)
            java.lang.String r0 = "show_registration_first_dlg"
            r4.putExtra(r0, r5)
        L_0x005b:
            boolean r0 = r13.A0J
            if (r0 == 0) goto L_0x0068
            boolean r0 = r13.isFinishing()
            if (r0 != 0) goto L_0x0068
            r13.startActivity(r4)
        L_0x0068:
            r13.finish()
        L_0x006b:
            java.lang.String r0 = "main/me App.me is null, can't proceed."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0071:
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r3 = "show_registration_first_dlg"
            boolean r2 = r0.getBooleanExtra(r3, r5)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.EULA"
            r4.setClassName(r1, r0)
            r4.putExtra(r3, r2)
            goto L_0x005b
        L_0x008d:
            java.lang.String r0 = "main/no-me/regname"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r13.A0G()
            android.content.Intent r4 = X.AnonymousClass190.A0A(r13)
            goto L_0x005b
        L_0x009a:
            X.005 r0 = r13.A0A
            java.lang.Object r0 = r0.get()
            X.1VX r0 = (X.AnonymousClass1VX) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00a9
            goto L_0x00ee
        L_0x00a9:
            X.005 r0 = r13.A0E
            java.lang.Object r0 = r0.get()
            X.1Ww r0 = (X.C29501Ww) r0
            r0.A0B(r12)
            android.content.Intent r4 = X.AnonymousClass190.A0B(r13)
            goto L_0x005b
        L_0x00b9:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.account.delete.DeleteAccountConfirmation"
            r4.setClassName(r1, r0)
            goto L_0x005b
        L_0x00c8:
            X.005 r0 = r13.A0B
            java.lang.Object r2 = r0.get()
            X.3TX r2 = (X.AnonymousClass3TX) r2
            java.lang.String r1 = "verification_successful"
            java.lang.String r0 = "continue"
            r2.A08(r1, r0)
            X.005 r0 = r13.A0A
            java.lang.Object r0 = r0.get()
            X.1VX r0 = (X.AnonymousClass1VX) r0
            boolean r0 = r0.A02()
            android.content.Intent r4 = X.AnonymousClass190.A1R(r13, r0)
            goto L_0x005b
        L_0x00e9:
            java.lang.String r0 = "main/messageStoreVerified/registration-state-is-registration-flash-primary"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00ee:
            X.005 r0 = r13.A0E
            java.lang.Object r0 = r0.get()
            X.1Ww r0 = (X.C29501Ww) r0
            r0.A0B(r1)
            android.content.Intent r4 = r13.A01(r2)
            goto L_0x005b
        L_0x00ff:
            X.0v0 r0 = r13.A09
            boolean r0 = r0.A2P()
            if (r0 == 0) goto L_0x011c
        L_0x0107:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.userban.ui.BanAppealActivity"
            r4.setClassName(r1, r0)
            java.lang.String r0 = "launch_source"
            r4.putExtra(r0, r12)
            goto L_0x005b
        L_0x011c:
            android.content.Intent r4 = r13.A01(r2)
            goto L_0x005b
        L_0x0122:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.migration.export.ui.ExportMigrationDataExportedActivity"
            r4.setClassName(r1, r0)
            goto L_0x005b
        L_0x0132:
            X.005 r0 = r13.A0A
            java.lang.Object r0 = r0.get()
            X.1VX r0 = (X.AnonymousClass1VX) r0
            boolean r3 = r0.A02()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity"
            android.content.Intent r4 = r2.setClassName(r1, r0)
            java.lang.String r0 = "change_number"
            r4.putExtra(r0, r3)
            java.lang.String r0 = "use_sms_retriever"
            r4.putExtra(r0, r5)
            goto L_0x005b
        L_0x0159:
            X.005 r0 = r13.A0A
            java.lang.Object r0 = r0.get()
            X.1VX r0 = (X.AnonymousClass1VX) r0
            boolean r3 = r0.A02()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.verifyphone.VerifyPhoneNumber"
            android.content.Intent r4 = r2.setClassName(r1, r0)
            java.lang.String r0 = "changenumber"
            r4.putExtra(r0, r3)
            java.lang.String r0 = "use_sms_retriever"
            r4.putExtra(r0, r5)
            java.lang.String r0 = "wa_old_eligible"
            r4.putExtra(r0, r12)
            java.lang.String r0 = "code_verification_mode"
            r4.putExtra(r0, r5)
            java.lang.String r0 = "EXTRA_IS_APP_RESTARTED"
            r4.putExtra(r0, r12)
            goto L_0x005b
        L_0x018f:
            X.005 r0 = r13.A0A
            java.lang.Object r0 = r0.get()
            X.1VX r0 = (X.AnonymousClass1VX) r0
            boolean r0 = r0.A02()
            android.content.Intent r4 = X.AnonymousClass190.A1Q(r13, r0)
            goto L_0x005b
        L_0x01a1:
            X.005 r0 = r13.A0H
            java.lang.Object r0 = r0.get()
            X.3Pc r0 = (X.C64703Pc) r0
            X.C18740tg.A06(r0)
            r7 = 0
            r10 = 21
            r11 = -1
            r9 = r7
            r8 = r7
            android.content.Intent r4 = X.C64703Pc.A00(r6, r7, r8, r9, r10, r11, r12)
            r0.A01()
            goto L_0x005b
        L_0x01bb:
            r5 = 0
            X.005 r0 = r13.A0A
            java.lang.Object r0 = r0.get()
            X.1VX r0 = (X.AnonymousClass1VX) r0
            boolean r3 = r0.A02()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.SendSmsToWa"
            android.content.Intent r4 = r2.setClassName(r1, r0)
            java.lang.String r0 = "sendSmsNumber"
            r4.putExtra(r0, r5)
            java.lang.String r0 = "changeNumber"
            r4.putExtra(r0, r3)
            goto L_0x005b
        L_0x01e3:
            X.12U r0 = r13.A0A
            int r1 = r0.A00()
            r0 = 2
            if (r1 != r0) goto L_0x0209
            java.lang.String r0 = "main/me/regname"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r13.A0G()
            android.content.Intent r1 = X.AnonymousClass190.A0A(r13)
            boolean r0 = r13.A0J
            if (r0 == 0) goto L_0x0205
            boolean r0 = r13.isFinishing()
            if (r0 != 0) goto L_0x0205
            r13.startActivity(r1)
        L_0x0205:
            r13.finish()
            return
        L_0x0209:
            r1 = 3
            X.12U r0 = r13.A0A
            int r0 = r0.A00()
            if (r0 == r1) goto L_0x021d
            X.005 r0 = r13.A0E
            java.lang.Object r0 = r0.get()
            X.1Ww r0 = (X.C29501Ww) r0
            r0.A0B(r1)
        L_0x021d:
            java.lang.String r0 = "main/verified/setregverified"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0xR r0 = r13.A05
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x022e
            r13.A07()
            return
        L_0x022e:
            java.lang.String r0 = "main/messageStoreVerified/gotoActivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r13.A0F()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Main.A3j():void");
    }

    public void onStart() {
        super.onStart();
        this.A0J = true;
    }

    private Intent A01(int i) {
        int i2;
        if (i == 13) {
            i2 = 1;
        } else {
            i2 = 0;
            if (i == 9) {
                i2 = 3;
            }
        }
        boolean A022 = ((AnonymousClass1VX) this.A0A.get()).A02();
        Intent className = new Intent().setClassName(getPackageName(), "com.whatsapp.registration.verifyphone.VerifyPhoneNumber");
        className.putExtra("changenumber", A022);
        className.putExtra("use_sms_retriever", false);
        className.putExtra("wa_old_eligible", 0);
        className.putExtra("code_verification_mode", i2);
        className.putExtra("EXTRA_IS_APP_RESTARTED", true);
        return className;
    }

    private void A07() {
        AnonymousClass0NT r0 = this.A0K;
        if (r0 == null || r0.A06() != 1) {
            AnonymousClass0NT r2 = new AnonymousClass0NT(this);
            this.A0K = r2;
            this.A04.Bp0(r2, new Void[0]);
            return;
        }
        Log.i("main/show dialog sync");
        if (this.A0J) {
            AnonymousClass3SJ.A01(this, 104);
        }
    }

    /* access modifiers changed from: private */
    public void A0F() {
        Log.i("main/gotoActivity");
        A0H();
    }

    private void A0G() {
        ((AnonymousClass3TX) this.A0B.get()).A08("verification_successful", "continue");
    }

    private void A0I() {
        this.A04.Boy(new C11390gE(this));
        ((C26021Io) this.A0I.get()).A01();
    }

    private void A0L(Me me) {
        if (me == null || this.A04.A08()) {
            this.A0J = true;
            A3j();
        } else if (A3m()) {
            int A012 = ((C29301Wc) this.A09.get()).A01();
            Log.i(AnonymousClass000.A0r("main/create/backupfilesfound ", AnonymousClass000.A0u(), A012));
            if (A012 > 0) {
                AnonymousClass3SJ.A01(this, 105);
            } else {
                A3l(false);
            }
        }
    }

    public AnonymousClass005 A3i() {
        AnonymousClass005 r1 = this.A0E;
        Objects.requireNonNull(r1);
        return C18910u1.A00(new C12550iH(r1));
    }

    public /* synthetic */ void A3n() {
        ((C29411Wn) this.A0G.get()).A03();
    }

    public /* synthetic */ void A3o() {
        startActivity(new Intent("android.intent.action.VIEW").setDataAndType((Uri) null, "application/vnd.android.package-archive").setFlags(1));
        AnonymousClass3SJ.A00(this, 0);
        finish();
    }

    public /* synthetic */ void A3p() {
        ((C33771fu) this.A0F.get()).A01();
        AnonymousClass3SJ.A00(this, 0);
        A0H();
    }

    public /* synthetic */ void A3r(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener, Me me) {
        this.A04.A08();
        Log.i("Main/keepSplashscreen/message-store-ready now redirect");
        this.A05.A0H(new C11980hJ(view, onPreDrawListener, this, me));
    }

    public void onCreate(Bundle bundle) {
        Intent intent;
        Intent intent2;
        Method method = C000600g.A03;
        AnonymousClass00h.A01("Main/onCreate");
        A2d(false);
        A2e(false);
        try {
            this.A02.A0A("Main");
            this.A02.A0B("Main", "onCreate", "_start");
            this.A02.A09("main_onCreate");
            super.onCreate(bundle);
            setTitle(R.string.f12nameremoved);
            if (!this.A07.A04()) {
                Log.i("aborting due to native libraries missing");
                intent = new Intent();
                intent.setClassName(getPackageName(), "com.whatsapp.corruptinstallation.CorruptInstallationActivity");
            } else {
                if (C21360z5.A00()) {
                    Log.w("main/device-not-supported");
                    setTheme(R.style.f13nameremoved);
                    Btm(new DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment());
                } else if (this.A03.A03()) {
                    intent = new Intent();
                    intent.setClassName(getPackageName(), "com.whatsapp.companionmode.registration.CompanionPostLogoutActivity");
                } else {
                    this.A02.A08(getIntent());
                    if (this.A02.A0D(this, getIntent())) {
                        ((AnonymousClass6TO) this.A08.get()).A01(getIntent());
                        finish();
                    } else {
                        int A002 = this.A0A.A00();
                        Me A062 = this.A02.A06();
                        if (A062 == null && A002 == 0) {
                            this.A02.A09(getIntent());
                            if (!isFinishing()) {
                                if (!this.A02.A0F(((AnonymousClass1VX) this.A0A.get()).A02()) || !this.A09.A0Y().booleanValue()) {
                                    boolean booleanExtra = getIntent().getBooleanExtra("show_registration_first_dlg", false);
                                    intent2 = new Intent();
                                    intent2.setClassName(getPackageName(), "com.whatsapp.registration.EULA");
                                    intent2.putExtra("show_registration_first_dlg", booleanExtra);
                                } else {
                                    intent2 = new Intent();
                                    intent2.setClassName(getPackageName(), "com.whatsapp.companionmode.registration.RegisterAsCompanionActivity");
                                    intent2.putExtra("entry_point", "entry_account_switching");
                                }
                                startActivity(intent2);
                                AnonymousClass0XN.A00(this);
                            }
                        } else if (A002 == 6) {
                            if (!isFinishing()) {
                                intent = new Intent();
                                intent.setClassName(getPackageName(), "com.whatsapp.account.delete.DeleteAccountConfirmation");
                            }
                        } else if (!this.A0D.A0E(6588) || this.A04.A09()) {
                            A0L(A062);
                        } else {
                            Log.i("main/create/message-store-not-ready");
                            A0M(A062);
                        }
                    }
                }
            }
            startActivity(intent);
            finish();
        } finally {
            this.A02.A0B("Main", "onCreate", "_end");
            this.A02.A08("main_onCreate");
            AnonymousClass00h.A00();
        }
    }

    private void A0H() {
        if (!isFinishing()) {
            Intent intent = getIntent();
            if (intent != null && !"android.intent.action.MAIN".equals(intent.getAction()) && (intent.getFlags() & 67108864) != 0 && this.A09.A0L() == 0) {
                Log.i("main/recreate_shortcut");
                A0J(this, getString(R.string.f12nameremoved));
                C54522t5.A00(this, getString(R.string.f12nameremoved));
                this.A09.A10();
            }
            Intent intent2 = getIntent();
            AnonymousClass00C.A0D(intent2, 0);
            boolean z = false;
            int intExtra = intent2.getIntExtra("request_type", 0);
            if (intExtra == 1 || intExtra == 2 || intExtra == 3 || intExtra == 4) {
                z = true;
            }
            Intent intent3 = getIntent();
            AnonymousClass00C.A0D(intent3, 0);
            boolean booleanExtra = intent3.getBooleanExtra("is_success", false);
            if (z) {
                A0I();
                ((AnonymousClass6TO) this.A08.get()).A01(getIntent());
            }
            if (this.A0J && !isFinishing()) {
                Intent A032 = AnonymousClass190.A03(this);
                A032.putExtra("show_payment_account_recovery", getIntent().getBooleanExtra("show_payment_account_recovery", false));
                if (z && booleanExtra) {
                    AnonymousClass11F A002 = AnonymousClass1RU.A00(getIntent());
                    Intent intent4 = getIntent();
                    AnonymousClass00C.A0D(intent4, 0);
                    if (intent4.getBooleanExtra("is_missed_call_notification", false)) {
                        A032 = AnonymousClass190.A04(this);
                    } else if (A002 != null) {
                        A032 = new AnonymousClass190().A1Y(this, A002);
                    }
                }
                startActivity(A032);
                overridePendingTransition(0, 0);
            }
            finish();
        }
    }

    public static void A0J(Context context, String str) {
        Intent A092 = AnonymousClass190.A09(context);
        A092.addFlags(268435456);
        A092.addFlags(67108864);
        Intent intent = new Intent();
        try {
            intent.putExtra("android.intent.extra.shortcut.INTENT", Intent.parseUri(A092.toUri(0), 0));
        } catch (URISyntaxException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("RegisterName/remove-shortcut cannot parse shortcut uri ");
            Log.e(AnonymousClass000.A0q(e.getMessage(), A0u), e);
        }
        intent.putExtra("android.intent.extra.shortcut.NAME", str);
        intent.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
        context.sendBroadcast(intent);
    }

    private void A0M(Me me) {
        View findViewById = findViewById(16908290);
        if (findViewById == null) {
            Log.i("Main/keepSplashscreen/no content view found");
            A0L(me);
            return;
        }
        C09210c0 r2 = C09210c0.A00;
        findViewById.getViewTreeObserver().addOnPreDrawListener(r2);
        this.A04.Bp1(new C11990hK(findViewById, r2, this, me));
    }

    public /* synthetic */ void A3q(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener, Me me) {
        view.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        A0L(me);
    }

    public Dialog onCreateDialog(int i) {
        setTheme(R.style.f13nameremoved);
        if (i != 0) {
            return super.onCreateDialog(i);
        }
        Log.i("main/dialog/upgrade");
        this.A02.A07("upgrade");
        C39001qm A002 = AnonymousClass3LW.A00(this);
        A002.A0d(R.string.f12nameremoved);
        A002.A0c(R.string.f12nameremoved);
        A002.A0r(false);
        A002.A0h(new C18300sw(this, 0), R.string.f12nameremoved);
        A002.A0f(new C18300sw(this, 1), R.string.f12nameremoved);
        return A002.create();
    }

    public void onResume() {
        super.onResume();
    }

    public void onStop() {
        super.onStop();
        this.A0J = false;
    }
}
