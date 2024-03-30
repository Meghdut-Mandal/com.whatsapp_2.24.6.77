package com.whatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass12P;
import X.AnonymousClass13I;
import X.AnonymousClass141;
import X.AnonymousClass15x;
import X.AnonymousClass164;
import X.AnonymousClass16D;
import X.AnonymousClass16E;
import X.AnonymousClass16I;
import X.AnonymousClass16K;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass1A5;
import X.AnonymousClass1AQ;
import X.AnonymousClass1CF;
import X.AnonymousClass1DH;
import X.AnonymousClass1DY;
import X.AnonymousClass1KK;
import X.AnonymousClass1O6;
import X.AnonymousClass1O8;
import X.AnonymousClass1P3;
import X.AnonymousClass1Pp;
import X.AnonymousClass1Q9;
import X.AnonymousClass1QC;
import X.AnonymousClass1QD;
import X.AnonymousClass1QE;
import X.AnonymousClass1RU;
import X.AnonymousClass1X8;
import X.AnonymousClass1XA;
import X.AnonymousClass1XF;
import X.AnonymousClass1XN;
import X.AnonymousClass226;
import X.AnonymousClass228;
import X.AnonymousClass22t;
import X.AnonymousClass35R;
import X.AnonymousClass36G;
import X.AnonymousClass3A5;
import X.AnonymousClass3D0;
import X.AnonymousClass3DY;
import X.AnonymousClass3ED;
import X.AnonymousClass3J6;
import X.AnonymousClass3LW;
import X.AnonymousClass3NT;
import X.AnonymousClass3SJ;
import X.AnonymousClass3TX;
import X.AnonymousClass3UV;
import X.AnonymousClass4VT;
import X.AnonymousClass4WJ;
import X.AnonymousClass6F7;
import X.AnonymousClass6O1;
import X.AnonymousClass9JF;
import X.C023509x;
import X.C03570Gk;
import X.C100804vn;
import X.C1261362r;
import X.C165087sr;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C18840tu;
import X.C18910u1;
import X.C19420v0;
import X.C19460v5;
import X.C19470v6;
import X.C19630wG;
import X.C19650wI;
import X.C19730wQ;
import X.C19770wU;
import X.C19890wg;
import X.C19900wh;
import X.C199459fL;
import X.C19970wo;
import X.C20280xJ;
import X.C20350xQ;
import X.C20430xY;
import X.C20610xq;
import X.C20720y3;
import X.C20810yC;
import X.C20830yE;
import X.C20920yN;
import X.C21010yW;
import X.C21060yb;
import X.C21360z5;
import X.C21510zM;
import X.C21520zN;
import X.C220612s;
import X.C220712t;
import X.C226815j;
import X.C229216m;
import X.C236519h;
import X.C24801Dv;
import X.C27111My;
import X.C27121Mz;
import X.C27301Nr;
import X.C27331Nu;
import X.C27341Nv;
import X.C27371Ny;
import X.C27501Ol;
import X.C27591Ow;
import X.C27761Ps;
import X.C28361Si;
import X.C29501Ww;
import X.C33101ei;
import X.C33311f5;
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
import X.C39001qm;
import X.C46322Wl;
import X.C49892jr;
import X.C54522t5;
import X.C56662wg;
import X.C57792yp;
import X.C588531h;
import X.C590232i;
import X.C590332j;
import X.C590832o;
import X.C590932p;
import X.C61593Cr;
import X.C61933Eb;
import X.C62603Gu;
import X.C62623Gw;
import X.C63293Jm;
import X.C64113Mr;
import X.C65743Th;
import X.C65983Uf;
import X.C66803Xj;
import X.C80933wC;
import X.C81143wX;
import X.C88004Ra;
import X.C88014Rb;
import X.C88024Rc;
import X.C88314Sf;
import X.C89354Wf;
import X.C89604Xe;
import android.app.AlarmManager;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.whatsapp.Me;
import com.whatsapp.PushnameEmojiBlacklistDialogFragment;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.infra.graphql.generated.registration.GetRegistrationUpsellResponseImpl;
import com.whatsapp.registration.passkeys.PasskeyFacade;
import com.whatsapp.registration.passkeys.PasskeyFacade$maybeCreatePasskeyWithoutEducationScreen$1;
import com.whatsapp.util.Log;

public class RegisterName extends C100804vn implements C88004Ra {
    public static C80933wC A1r;
    public View A00;
    public ImageView A01;
    public C19460v5 A02;
    public C19460v5 A03;
    public C19460v5 A04;
    public C19460v5 A05;
    public C19460v5 A06;
    public C19460v5 A07;
    public C19460v5 A08;
    public C19460v5 A09;
    public C19460v5 A0A;
    public C19460v5 A0B;
    public C19460v5 A0C;
    public C19460v5 A0D;
    public C57792yp A0E;
    public C27341Nv A0F;
    public C21360z5 A0G;
    public AnonymousClass3DY A0H;
    public WaEditText A0I;
    public AnonymousClass164 A0J;
    public AnonymousClass1RU A0K;
    public C33101ei A0L;
    public AnonymousClass1KK A0M;
    public AnonymousClass36G A0N;
    public C229216m A0O;
    public AnonymousClass1Pp A0P;
    public AnonymousClass16D A0Q;
    public AnonymousClass16I A0R;
    public AnonymousClass171 A0S;
    public AnonymousClass16K A0T;
    public C27761Ps A0U;
    public C20430xY A0V;
    public AnonymousClass1O6 A0W;
    public C27301Nr A0X;
    public AnonymousClass1DH A0Y;
    public C20830yE A0Z;
    public C220712t A0a;
    public AnonymousClass1A5 A0b;
    public AnonymousClass1Q9 A0c;
    public AnonymousClass15x A0d;
    public C220612s A0e;
    public AnonymousClass12P A0f;
    public AnonymousClass16E A0g;
    public C588531h A0h;
    public AnonymousClass141 A0i;
    public C27371Ny A0j;
    public AnonymousClass1DY A0k;
    public C1261362r A0l;
    public AnonymousClass6O1 A0m;
    public AnonymousClass1XN A0n;
    public AnonymousClass3J6 A0o;
    public EmojiSearchProvider A0p;
    public C62603Gu A0q;
    public C21520zN A0r;
    public C21510zM A0s;
    public C20920yN A0t;
    public C21010yW A0u;
    public C20350xQ A0v;
    public AnonymousClass1CF A0w;
    public C20720y3 A0x;
    public C20280xJ A0y;
    public C27331Nu A0z;
    public C28361Si A10;
    public AnonymousClass1XA A11;
    public C19890wg A12;
    public AnonymousClass1O8 A13;
    public AnonymousClass1P3 A14;
    public AnonymousClass13I A15;
    public AnonymousClass3ED A16;
    public AnonymousClass35R A17;
    public AnonymousClass228 A18;
    public AnonymousClass226 A19;
    public C62623Gw A1A;
    public AnonymousClass3UV A1B;
    public C29501Ww A1C;
    public C61933Eb A1D;
    public AnonymousClass1X8 A1E;
    public AnonymousClass1XF A1F;
    public AnonymousClass1QE A1G;
    public AnonymousClass1QD A1H;
    public AnonymousClass1QC A1I;
    public AnonymousClass3TX A1J;
    public C590932p A1K;
    public AnonymousClass3NT A1L;
    public AnonymousClass3A5 A1M;
    public C63293Jm A1N;
    public C88014Rb A1O;
    public C88024Rc A1P;
    public AnonymousClass1AQ A1Q;
    public C19650wI A1R;
    public AnonymousClass005 A1S;
    public AnonymousClass005 A1T;
    public AnonymousClass005 A1U;
    public AnonymousClass005 A1V;
    public Integer A1W;
    public Integer A1X;
    public Integer A1Y;
    public Integer A1Z;
    public boolean A1a;
    public boolean A1b = false;
    public boolean A1c;
    public boolean A1d;
    public long A1e;
    public Bitmap A1f;
    public View A1g;
    public Button A1h;
    public C226815j A1i;
    public AnonymousClass22t A1j;
    public C49892jr A1k;
    public RegistrationScrollView A1l;
    public final Handler A1m;
    public final C88314Sf A1n;
    public final Handler A1o;
    public final C590232i A1p;
    public final C66803Xj A1q;

    public RegisterName() {
        super(true, true);
        C89354Wf.A00(this, 45);
        this.A1q = new AnonymousClass4WJ(this, 17);
        this.A1i = null;
        this.A1o = new AnonymousClass4VT(Looper.getMainLooper(), this, 5);
        this.A1m = new AnonymousClass4VT(Looper.getMainLooper(), this, 6);
        this.A1n = new C89604Xe(this, 11);
        this.A1p = new C590232i(this);
    }

    private void A01() {
        AnonymousClass17Y r2 = this.A05;
        C590932p r6 = this.A1K;
        AnonymousClass1QD r5 = this.A1H;
        C49892jr r1 = new C49892jr(r2, this.A0e, this, r5, r6);
        this.A1k = r1;
        C36331k8.A1F(r1, this.A04);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0054, code lost:
        if (r2 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006b, code lost:
        if (r3.A1c == false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0H(com.whatsapp.registration.RegisterName r7) {
        /*
            r3 = r7
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131168107(0x7f070b6b, float:1.7950506E38)
            int r6 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131168105(0x7f070b69, float:1.7950502E38)
            float r5 = r1.getDimension(r0)
            r2 = 0
            r7 = 0
            r3.A1c = r7
            X.141 r0 = r3.A0i
            if (r0 == 0) goto L_0x007c
            com.whatsapp.jid.PhoneUserJid r0 = X.C36411kG.A0j(r3)
            boolean r0 = X.C202899mr.A02(r0)
            if (r0 != 0) goto L_0x007c
            android.widget.ImageView r1 = r3.A01
            r0 = 1
            r1.setEnabled(r0)
            android.view.View r1 = r3.A1g
            r0 = 8
            r1.setVisibility(r0)
            X.16K r1 = r3.A0T
            X.141 r0 = r3.A0i
            java.io.File r0 = r1.A01(r0)
            X.C18740tg.A06(r0)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0056
            X.1Ps r2 = r3.A0U
            X.141 r4 = r3.A0i
            android.graphics.Bitmap r2 = r2.A07(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x0052
            r7 = 1
        L_0x0052:
            r3.A1c = r7
            if (r2 != 0) goto L_0x0076
        L_0x0056:
            android.content.SharedPreferences r1 = X.C36331k8.A06(r3)
            java.lang.String r0 = "pref_nta_profile_pic"
            java.lang.String r0 = X.C36371kC.A0t(r1, r0)
            if (r0 == 0) goto L_0x006d
            X.0wU r1 = r3.A04
            r0 = 16
            X.C81143wX.A01(r1, r3, r0)
            boolean r0 = r3.A1c
            if (r0 != 0) goto L_0x0076
        L_0x006d:
            X.1Pp r1 = r3.A0P
            r0 = 2131232608(0x7f080760, float:1.808133E38)
            android.graphics.Bitmap r2 = X.AnonymousClass1Pp.A01(r3, r1, r5, r0, r6)
        L_0x0076:
            android.widget.ImageView r0 = r3.A01
            r0.setImageBitmap(r2)
            return
        L_0x007c:
            android.widget.ImageView r0 = r3.A01
            r0.setEnabled(r7)
            android.view.View r0 = r3.A1g
            r0.setVisibility(r7)
            android.graphics.Bitmap r2 = r3.A1f
            if (r2 != 0) goto L_0x0076
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r6, r6, r0)
            r3.A1f = r2
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.RegisterName.A0H(com.whatsapp.registration.RegisterName):void");
    }

    private boolean A0J() {
        int i;
        int i2;
        int[] iArr;
        int i3;
        char c = 0;
        if (this.A0Z.A07()) {
            int i4 = C36341k9.A0E(this.A0Z.A01).getInt("reg_skip_storage_perm", 0);
            i = R.string.f12nameremoved;
            if (i4 == 2) {
                i = R.string.f12nameremoved;
            }
            i2 = R.string.f12nameremoved;
            iArr = new int[1];
            i3 = R.drawable.permission_contacts_small;
        } else {
            i = R.string.f12nameremoved;
            i2 = R.string.f12nameremoved;
            iArr = new int[3];
            C36421kH.A1O(iArr, R.drawable.permission_contacts_small, 0, 1);
            c = 2;
            i3 = R.drawable.permission_storage;
        }
        iArr[c] = i3;
        return RequestPermissionActivity.A0J(this, "connect_with_friends", iArr, 17, i, i2, R.string.f12nameremoved, this.A0Z.A0H(), !this.A0O.A00());
    }

    public Dialog onCreateDialog(int i) {
        if (i == 0) {
            Log.i("RegisterName/dialog/initprogress");
            if (A1r == null) {
                Log.w("RegisterName/dialog/initprogress/init-null/remove");
                C36341k9.A0H().postDelayed(C81143wX.A00(this, 13), 3);
            }
            AnonymousClass226 r1 = new AnonymousClass226(this.A08, this.A07, this.A00, this);
            this.A19 = r1;
            r1.setCancelable(false);
            return this.A19;
        } else if (i == 1) {
            Log.w("RegisterName/dialog/failed-net");
            C39001qm A002 = AnonymousClass3LW.A00(this);
            A002.A0d(R.string.f12nameremoved);
            A002.A0p(C36341k9.A0e(this, new Object[1], R.string.f12nameremoved, 0, R.string.f12nameremoved));
            C39001qm.A0D(A002, this, 17, R.string.f12nameremoved);
            return A002.create();
        } else if (i == 22) {
            String string = getString(R.string.f12nameremoved);
            ProgressDialog progressDialog = new ProgressDialog(this);
            C36331k8.A0p(progressDialog, string);
            return progressDialog;
        } else if (i == 103) {
            Log.i("RegisterName/dialog/restore");
            AnonymousClass228 r4 = new AnonymousClass228(this, this.A08, this.A07, this.A00, this.A0c, this.A0f, this, this.A1C);
            this.A18 = r4;
            r4.setCancelable(false);
            C81143wX.A01(this.A04, this, 17);
            return this.A18;
        } else if (i != 109) {
            return super.onCreateDialog(i);
        } else {
            Log.w("RegisterName/dialog/cant-connect");
            C19770wU r12 = this.A04;
            return C65983Uf.A04(this, this.A0H, this.A07, this.A08, this.A0Z, this.A0w, this.A1B, r12);
        }
    }

    public static void A07(RegisterName registerName) {
        Log.i("restore>RegisterName/checking for google and local backups");
        Intent className = C36431kI.A0D().setClassName(registerName.getPackageName(), "com.whatsapp.backup.google.RestoreFromBackupActivity");
        className.setAction("action_show_restore_one_time_setup");
        registerName.startActivityForResult(className, 14);
    }

    public static void A0G(RegisterName registerName) {
        C80933wC r3 = A1r;
        if (r3 == null || r3.A03) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("RegisterName/check-initializer, null?");
            C36331k8.A1S(A0u2, AnonymousClass000.A1W(r3));
            RegisterName registerName2 = registerName;
            C57792yp r32 = registerName2.A0E;
            C590232i r21 = registerName2.A1p;
            Handler handler = registerName2.A1o;
            C20810yC A0V2 = C36341k9.A0V(r32.A00.A01);
            C19470v6 r19 = C19470v6.A00;
            C27121Mz r4 = r32.A00;
            C18800tq r1 = r4.A01;
            C19730wQ A0N2 = C36351kA.A0N(r1);
            C21010yW A0g2 = C36351kA.A0g(r1);
            AnonymousClass1DH r17 = (AnonymousClass1DH) r1.A0K.get();
            AnonymousClass16E A0e2 = C36391kE.A0e(r1);
            AnonymousClass164 r16 = (AnonymousClass164) r1.A99.get();
            AnonymousClass16D A0R2 = C36341k9.A0R(r1);
            AnonymousClass171 A0S2 = C36341k9.A0S(r1);
            C18820ts A0T2 = C36341k9.A0T(r1);
            C20350xQ A0a2 = C36361kB.A0a(r1);
            C20430xY A0K2 = C36421kH.A0K(r1);
            C29501Ww A0d2 = C36401kF.A0d(r1);
            C19420v0 A0Y2 = C36351kA.A0Y(r1);
            C27331Nu AFX = C18800tq.AFX(r1);
            C27341Nv A0X2 = C36411kG.A0X(r1);
            AnonymousClass1DY A99 = C18800tq.A99(r1);
            AnonymousClass1A5 A0X3 = C36371kC.A0X(r1);
            C18830tt r33 = r1.A00;
            C80933wC r172 = new C80933wC(handler, r19, r19, (C19460v5) r1.A5x.get(), r19, r19, A0N2, A0X2, r16, (AnonymousClass3D0) r33.A4M.get(), (AnonymousClass36G) r33.A2k.get(), A0R2, A0S2, A0K2, (AnonymousClass1O6) r1.A2J.get(), (C27301Nr) r1.A2m.get(), r17, A0Y2, (C19900wh) r1.A9J.get(), A0T2, A0X3, (AnonymousClass15x) r1.A5E.get(), A0e2, (C27371Ny) r1.A2o.get(), A99, A0V2, A0g2, A0a2, (C20280xJ) r1.A7d.get(), AFX, (AnonymousClass1XA) r1.A6L.get(), (AnonymousClass1O8) r1.A6q.get(), r21, A0d2, new C590332j((C19630wG) r4.A00.A5g.A91.get()), (AnonymousClass1AQ) r1.A37.get());
            A1r = r172;
            r172.A01 = registerName2.A1e;
            C81143wX.A01(registerName2.A04, registerName2, 15);
            AnonymousClass3SJ.A01(registerName2, 0);
            if (((CompoundButton) C03570Gk.A0B(registerName2, R.id.cbx_app_shortcut)).isChecked()) {
                C54522t5.A00(registerName2, registerName2.getString(R.string.f12nameremoved));
            }
            View view = registerName2.A00;
            if (view != null) {
                view.setVisibility(4);
            }
            C36341k9.A0w(C36421kH.A0A(registerName2), "com.whatsapp.registername.initializer_start_time", System.currentTimeMillis());
            C36341k9.A0x(C19420v0.A00(registerName2.A09), "account_switching_logged_out_phone_number", (String) null);
            C36341k9.A0x(C36421kH.A0A(registerName2), "account_switching_banned_account_lid", (String) null);
            C36341k9.A0x(C36421kH.A0A(registerName2), "account_switching_banned_account_phone_user_jid", (String) null);
            AnonymousClass3A5 r5 = registerName2.A1M;
            Intent intent = C36441kJ.A0I("com.whatsapp.alarm.ONBOARDING_INCOMPLETE").setPackage("com.whatsapp");
            AnonymousClass00C.A08(intent);
            PendingIntent A012 = C65743Th.A01(r5.A02.A00, 0, intent, 536870912);
            if (A012 != null) {
                AlarmManager A052 = r5.A01.A05();
                if (A052 != null) {
                    A052.cancel(A012);
                } else {
                    Log.w("OnboardingIncompleteNotificationManager/cancelNotification/AlarmManager-is-null");
                }
                A012.cancel();
            }
            registerName2.A1m.sendEmptyMessageDelayed(0, 600000);
            registerName2.A1J.A04("home");
        }
    }

    private void A0I(Integer num, Integer num2) {
        if (this.A0Z.A0D() && this.A1Z.intValue() == 1) {
            this.A1Z = num;
        }
        if (this.A0O.A00() && this.A1Y.intValue() == 1) {
            this.A1Y = num2;
        }
    }

    public void A2F() {
        if (!this.A1b) {
            this.A1b = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r1 = A0L2.A5g;
            C36321k7.A0c(r1, this);
            C18830tt r5 = r1.A00;
            C36321k7.A0X(r1, r5, this, C36321k7.A05(r1, r5, this));
            this.A00 = r5.A56();
            C19470v6 r2 = C19470v6.A00;
            this.A06 = r2;
            this.A0G = C36401kF.A0N(r1);
            this.A04 = r2;
            this.A0C = r2;
            this.A0D = r2;
            this.A07 = r2;
            this.A0u = C36351kA.A0g(r1);
            this.A0Y = (AnonymousClass1DH) r1.A0K.get();
            this.A0a = (C220712t) r1.A1b.get();
            this.A0g = C36391kE.A0e(r1);
            this.A0J = (AnonymousClass164) r1.A99.get();
            this.A1J = C36431kI.A0u(r5);
            this.A0n = C36351kA.A0d(r1);
            this.A0l = C36371kC.A0b(r5);
            this.A15 = (AnonymousClass13I) r1.A4a.get();
            this.A0H = C36361kB.A0Q(r1);
            this.A05 = r2;
            this.A0s = (C21510zM) r1.A9t.get();
            this.A0K = C36351kA.A0R(r1);
            this.A0r = C36401kF.A0Y(r1);
            this.A0P = C36361kB.A0V(r1);
            this.A0Q = C36341k9.A0R(r1);
            this.A0x = C36401kF.A0c(r1);
            this.A0S = C36341k9.A0S(r1);
            this.A16 = (AnonymousClass3ED) r5.ABY.get();
            this.A09 = r2;
            this.A0R = C36351kA.A0S(r1);
            this.A1Q = (AnonymousClass1AQ) r1.A37.get();
            this.A0v = C36361kB.A0a(r1);
            this.A0X = (C27301Nr) r1.A2m.get();
            this.A1R = C36411kG.A0q(r1);
            this.A1N = r5.A8y();
            this.A0t = (C20920yN) r1.A78.get();
            this.A0T = (AnonymousClass16K) r1.A2C.get();
            this.A0V = C36421kH.A0K(r1);
            this.A1I = (AnonymousClass1QC) r1.AR8.get();
            this.A0c = (AnonymousClass1Q9) r1.A5D.get();
            this.A0y = (C20280xJ) r1.A7d.get();
            this.A0w = C36361kB.A0b(r1);
            this.A1A = C27111My.A38(A0L2);
            this.A0O = C36381kD.A0X(r1);
            this.A0p = C36351kA.A0f(r5);
            this.A0q = (C62603Gu) r5.A8A.get();
            this.A10 = C36371kC.A0g(r1);
            this.A0f = (AnonymousClass12P) r1.A5G.get();
            this.A13 = (AnonymousClass1O8) r1.A6q.get();
            this.A14 = C36391kE.A0k(r1);
            this.A1C = C36401kF.A0d(r1);
            this.A0Z = C36351kA.A0X(r1);
            this.A0z = C18800tq.AFX(r1);
            this.A1O = (C88014Rb) A0L2.A3F.get();
            this.A1P = (C88024Rc) A0L2.A3G.get();
            this.A0F = C36411kG.A0X(r1);
            this.A1E = C36391kE.A0o(r1);
            this.A0M = (AnonymousClass1KK) r1.A19.get();
            this.A1G = (AnonymousClass1QE) r1.AFr.get();
            this.A08 = (C19460v5) r1.A5x.get();
            this.A0B = (C19460v5) r1.A5y.get();
            this.A0j = (C27371Ny) r1.A2o.get();
            this.A1K = C27111My.A3C(A0L2);
            this.A1B = C36431kI.A0t(r1);
            this.A0k = C18800tq.A99(r1);
            this.A11 = (AnonymousClass1XA) r1.A6L.get();
            this.A12 = C36351kA.A0m(r1);
            this.A1F = r1.AJl();
            this.A0m = C36351kA.A0c(r5);
            this.A02 = r2;
            this.A0d = (AnonymousClass15x) r1.A5E.get();
            this.A03 = r2;
            this.A1U = C18840tu.A00(A0L2.A3W);
            this.A0U = C36361kB.A0W(r1);
            this.A0b = C36371kC.A0X(r1);
            this.A0N = (AnonymousClass36G) r5.A2k.get();
            this.A1S = C18840tu.A00(r1.A0H);
            this.A0W = (AnonymousClass1O6) r1.A2J.get();
            this.A1H = (AnonymousClass1QD) r1.A4G.get();
            this.A0e = (C220612s) r1.A5F.get();
            this.A0L = (C33101ei) r1.A3f.get();
            this.A1L = (AnonymousClass3NT) r5.A8k.get();
            this.A1D = new C61933Eb(C18800tq.A99(r1), (C27591Ow) r1.A5M.get(), r1.A00.A8y(), (C88014Rb) A0L2.A3F.get(), (C88024Rc) A0L2.A3G.get());
            this.A0A = r2;
            this.A1T = C18840tu.A00(A0L2.A0T);
            this.A0h = r5.A4v();
            this.A17 = new AnonymousClass35R((C19970wo) r1.A8b.get(), (C20810yC) r1.A02.get());
            this.A1V = C18840tu.A00(r5.A4M);
            this.A0E = (C57792yp) A0L2.A1r.get();
            this.A1M = new AnonymousClass3A5((C236519h) r1.A0G.get(), (C21060yb) r1.A8W.get(), (C19970wo) r1.A8b.get(), (C19630wG) r1.A91.get(), (C19420v0) r1.A9G.get(), (C21520zN) r1.A01.get());
        }
    }

    public AnonymousClass005 A3i() {
        return new C18910u1(this.A1C, (AnonymousClass004) null);
    }

    public void A3n() {
        Log.i("RegisterName/start");
        Editable text = this.A0I.getText();
        C18740tg.A06(text);
        String trim = text.toString().trim();
        String[] strArr = C56662wg.A01;
        int i = 0;
        while (!trim.contains(strArr[i])) {
            i++;
            if (i >= 3) {
                if (trim.length() == 0) {
                    Log.w("RegisterName/no-pushname");
                    this.A05.A06(R.string.f12nameremoved, 0);
                    return;
                }
                Log.i("RegisterName/showNextScreen");
                if (this.A0D.A0E(8045)) {
                    C61933Eb r5 = this.A1D;
                    C61593Cr r4 = new C61593Cr(this);
                    C199459fL.A00(new C46322Wl(r4, r5), r5.A01.A01(new AnonymousClass9JF(C36441kJ.A0d(), GetRegistrationUpsellResponseImpl.class, "GetRegistrationUpsell"))).A00();
                    return;
                }
                A0G(this);
                return;
            }
        }
        Log.w("RegisterName/checkmarks in pushname");
        Btm(PushnameEmojiBlacklistDialogFragment.A03(trim));
    }

    public void A3o() {
        C220712t.A02(this.A0a, false);
        this.A0e.A01();
        this.A0V.A05();
        A3j();
    }

    public void onBackPressed() {
        AnonymousClass22t r0 = this.A1j;
        if (r0 != null && r0.isShowing()) {
            this.A1j.dismiss();
        } else if (this.A0K.A0F(false)) {
            Log.i("RegisterName/onBackPressed/is adding new account");
            C65983Uf.A0G(this, this.A09, this.A0A);
        } else {
            C24801Dv.A02(this);
        }
    }

    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r4.getBoolean("started_gdrive_new_user_activity", false) == false) goto L_0x001c;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r7v2, types: [boolean, int] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r31) {
        /*
            r30 = this;
            r1 = r30
            r4 = r31
            super.onCreate(r4)
            r0 = 2131893410(0x7f121ca2, float:1.9421596E38)
            r2 = 2131893410(0x7f121ca2, float:1.9421596E38)
            r1.setTitle(r0)
            r3 = 0
            if (r31 == 0) goto L_0x001c
            java.lang.String r0 = "started_gdrive_new_user_activity"
            boolean r4 = r4.getBoolean(r0, r3)
            r0 = 1
            if (r4 != 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r1.A1d = r0
            X.0v5 r0 = r1.A0C
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "RegisterName/create/setting up new reg flow/build is smb"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0v5 r0 = r1.A0C
            r0.A02()
            java.lang.String r0 = "getSmbRegistrationLayoutId"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0038:
            java.lang.String r0 = "RegisterName/create/setting up old reg flow"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2131626021(0x7f0e0825, float:1.8879266E38)
            r1.setContentView((int) r0)
            X.0ts r5 = r1.A00
            android.view.View r4 = r1.A00
            r9 = 2131434753(0x7f0b1d01, float:1.8491329E38)
            X.1RU r0 = r1.A0K
            boolean r12 = r0.A0F(r3)
            r11 = 0
            r10 = 0
            r6 = r4
            r7 = r1
            r8 = r5
            X.C65983Uf.A0M(r6, r7, r8, r9, r10, r11, r12)
            int r4 = X.C36441kJ.A08(r1)
            r0 = 2
            if (r4 == r0) goto L_0x0078
            r0 = 3
            if (r4 != r0) goto L_0x0072
            java.lang.String r0 = "RegisterName/create/registration already verified bounce to main"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0067:
            android.content.Intent r0 = X.AnonymousClass190.A09(r1)
        L_0x006b:
            r1.startActivity(r0)
            r1.finish()
        L_0x0071:
            return
        L_0x0072:
            java.lang.String r0 = "RegisterName/create/bad-state bounce to main"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0067
        L_0x0078:
            X.0v0 r0 = r1.A09
            java.lang.String r5 = r0.A0g()
            X.C36331k8.A0n(r1)
            r0 = 2131434724(0x7f0b1ce4, float:1.849127E38)
            r4 = 2131434724(0x7f0b1ce4, float:1.849127E38)
            android.view.View r6 = X.C03570Gk.A0B(r1, r0)
            com.whatsapp.WaTextView r6 = (com.whatsapp.WaTextView) r6
            r0 = 2131433242(0x7f0b171a, float:1.8488264E38)
            android.view.View r0 = r1.findViewById(r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            r1.A0I = r0
            r0 = 2131433234(0x7f0b1712, float:1.8488248E38)
            android.view.View r0 = X.C03570Gk.A0B(r1, r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.A1h = r0
            r0 = 2131428743(0x7f0b0587, float:1.847914E38)
            android.widget.ImageView r0 = X.C36411kG.A0Q(r1, r0)
            r1.A01 = r0
            r6.setText(r2)
            r0 = 2131427977(0x7f0b0289, float:1.8477585E38)
            android.widget.TextView r2 = X.C36401kF.A0H(r1, r0)
            r0 = 2131893409(0x7f121ca1, float:1.9421594E38)
            r2.setText(r0)
            X.0zN r0 = r1.A0r
            X.C65983Uf.A0O(r1, r0, r4)
            android.widget.Button r2 = r1.A1h
            r0 = 22
            X.AnonymousClass3Y6.A00(r2, r1, r0)
            if (r5 != 0) goto L_0x00da
            java.lang.String r0 = "RegisterName/create/missing-params bounce to regphone"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1Ww r2 = r1.A1C
            r0 = 1
            X.C29501Ww.A02(r2, r0, r0)
            android.content.Intent r0 = X.AnonymousClass190.A0B(r1)
            goto L_0x006b
        L_0x00da:
            r2 = 8
            r0 = 2131434087(0x7f0b1a67, float:1.8489978E38)
            X.C36391kE.A16(r1, r0, r2)
            r0 = 2131428682(0x7f0b054a, float:1.8479015E38)
            android.view.View r0 = X.C03570Gk.A0B(r1, r0)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r3)
            r0 = 2131429813(0x7f0b09b5, float:1.848131E38)
            android.view.View r13 = r1.findViewById(r0)
            android.widget.ImageButton r13 = (android.widget.ImageButton) r13
            if (r13 == 0) goto L_0x0171
            X.0yC r0 = r1.A0D
            r17 = r0
            X.1N2 r0 = r1.A0C
            r16 = r0
            X.0wN r15 = r1.A03
            X.1H2 r14 = r1.A0C
            X.1XN r12 = r1.A0n
            X.0yb r11 = r1.A08
            X.0ts r10 = r1.A00
            X.62r r9 = r1.A0l
            com.whatsapp.emoji.search.EmojiSearchProvider r8 = r1.A0p
            X.0v0 r7 = r1.A09
            X.0wg r5 = r1.A12
            r0 = 2131431353(0x7f0b0fb9, float:1.8484433E38)
            android.view.View r4 = r1.findViewById(r0)
            X.4Oz r4 = (X.C87484Oz) r4
            com.whatsapp.WaEditText r3 = r1.A0I
            r0 = 30
            java.lang.Integer r28 = java.lang.Integer.valueOf(r0)
            r29 = 0
            X.6O1 r2 = r1.A0m
            X.22t r0 = new X.22t
            r22 = r12
            r23 = r14
            r24 = r8
            r25 = r17
            r26 = r5
            r27 = r16
            r20 = r9
            r21 = r2
            r18 = r7
            r19 = r10
            r16 = r3
            r17 = r11
            r14 = r15
            r15 = r4
            r12 = r1
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r1.A1j = r0
            X.4Sf r2 = r1.A1n
            r0.A0H(r2)
            r0 = 2131429849(0x7f0b09d9, float:1.8481382E38)
            android.view.View r3 = r1.findViewById(r0)
            com.whatsapp.emoji.search.EmojiSearchContainer r3 = (com.whatsapp.emoji.search.EmojiSearchContainer) r3
            X.22t r0 = r1.A1j
            X.3J6 r2 = new X.3J6
            r2.<init>(r1, r0, r3)
            r1.A0o = r2
            r0 = 8
            X.AnonymousClass3J6.A00(r2, r1, r0)
            X.22t r2 = r1.A1j
            r0 = 12
            X.3wX r0 = X.C81143wX.A00(r1, r0)
            r2.A0F = r0
        L_0x0171:
            android.widget.ImageView r2 = r1.A01
            r0 = 2131896926(0x7f122a5e, float:1.9428727E38)
            X.C36331k8.A0q(r1, r2, r0)
            android.widget.ImageView r2 = r1.A01
            r0 = 24
            X.AnonymousClass3Y6.A00(r2, r1, r0)
            r0 = 2131428744(0x7f0b0588, float:1.8479141E38)
            android.view.View r0 = r1.findViewById(r0)
            r1.A1g = r0
            X.0yE r0 = r1.A0Z
            boolean r0 = r0.A0D()
            int r0 = X.C36371kC.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A1Z = r0
            X.16m r0 = r1.A0O
            boolean r0 = r0.A00()
            int r0 = X.C36371kC.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A1Y = r0
            X.3wC r0 = A1r
            if (r0 == 0) goto L_0x02d4
            X.142 r0 = X.C36431kI.A0V(r1)
            r1.A0i = r0
            A0H(r1)
            r7 = 0
            X.AnonymousClass3SJ.A01(r1, r7)
        L_0x01ba:
            X.0ts r2 = r1.A00
            com.whatsapp.WaEditText r0 = r1.A0I
            X.AnonymousClass1JZ.A09(r0, r2)
            r0 = 2131431868(0x7f0b11bc, float:1.8485477E38)
            android.widget.TextView r12 = X.C36401kF.A0H(r1, r0)
            com.whatsapp.WaEditText r8 = r1.A0I
            X.1H2 r9 = r1.A0C
            X.0yb r5 = r1.A08
            X.0ts r4 = r1.A00
            X.0wg r3 = r1.A12
            X.1N0 r2 = r1.A0B
            r0 = 25
            X.2gA r10 = new X.2gA
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r18 = 25
            r17 = r3
            r15 = r2
            r16 = r9
            r13 = r5
            r14 = r4
            r11 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r8.addTextChangedListener(r10)
            com.whatsapp.WaEditText r4 = r1.A0I
            r2 = 1
            android.text.InputFilter[] r3 = new android.text.InputFilter[r2]
            X.3Xf r2 = new X.3Xf
            r2.<init>(r0)
            r3[r7] = r2
            r4.setFilters(r3)
            r0 = 2131427364(0x7f0b0024, float:1.8476342E38)
            android.view.View r2 = r1.findViewById(r0)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r0 = 2131433227(0x7f0b170b, float:1.8488234E38)
            android.view.View r0 = r1.findViewById(r0)
            com.whatsapp.registration.RegistrationScrollView r0 = (com.whatsapp.registration.RegistrationScrollView) r0
            r1.A1l = r0
            if (r0 == 0) goto L_0x0218
            r0.setTopAndBottomScrollingElevation(r2, r6)
        L_0x0218:
            X.0wU r2 = r1.A04
            r0 = 14
            X.C81143wX.A01(r2, r1, r0)
            X.3Jm r0 = r1.A1N
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x022c
            com.whatsapp.WaEditText r0 = r1.A0I
            r0.A0C(r7)
        L_0x022c:
            X.0v5 r0 = r1.A0A
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x023b
            com.whatsapp.WaEditText r2 = r1.A0I
            r0 = 8
            X.C89574Xb.A00(r2, r1, r0)
        L_0x023b:
            X.0z5 r0 = r1.A0G
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x02be
            java.lang.String r0 = "RegisterName/clock-wrong"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0y3 r2 = r1.A0x
            X.1Si r0 = r1.A10
            X.AnonymousClass3SK.A02(r1, r2, r0)
        L_0x024f:
            X.1Ww r2 = r1.A1C
            r8 = 2
            r0 = 1
            X.C29501Ww.A02(r2, r8, r0)
            r0 = 33
            X.4W3 r2 = X.AnonymousClass4W3.A00(r1, r0)
            r1.A1i = r2
            X.16I r0 = r1.A0R
            r0.registerObserver(r2)
            X.0v0 r2 = r1.A09
            byte[] r0 = new byte[r7]
            r2.A29(r0)
            X.3A5 r3 = r1.A1M
            X.0zN r1 = r3.A04
            r0 = 7780(0x1e64, float:1.0902E-41)
            long r4 = X.C36441kJ.A0B(r1, r0)
            r1 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0281
            java.lang.String r0 = "OnboardingIncompleteNotificationManager/scheduleNotification/too-soon"
        L_0x027d:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0281:
            X.0v0 r0 = r3.A03
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)
            java.lang.String r0 = "pref_onboarding_incomplete_notif_shown"
            boolean r0 = r1.getBoolean(r0, r7)
            if (r0 == 0) goto L_0x0292
            java.lang.String r0 = "OnboardingIncompleteNotificationManager/scheduleNotification/already-sent-notification"
            goto L_0x027d
        L_0x0292:
            java.lang.String r0 = "com.whatsapp.alarm.ONBOARDING_INCOMPLETE"
            android.content.Intent r1 = X.C36441kJ.A0I(r0)
            java.lang.String r0 = "com.whatsapp"
            android.content.Intent r2 = r1.setPackage(r0)
            X.AnonymousClass00C.A08(r2)
            X.0wG r0 = r3.A02
            android.content.Context r1 = r0.A00
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r7 = X.C65743Th.A01(r1, r7, r2, r0)
            X.19h r0 = r3.A00
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r9 = r9 + r4
            X.19i r6 = r0.A00
            r11 = 0
            boolean r0 = r6.A02(r7, r8, r9, r11)
            if (r0 != 0) goto L_0x0071
            java.lang.String r0 = "OnboardingIncompleteNotificationManager/scheduleNotification/AlarmManager-is-null"
            goto L_0x027d
        L_0x02be:
            X.0z5 r0 = r1.A0G
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x024f
            java.lang.String r0 = "RegisterName/sw-expired"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0y3 r2 = r1.A0x
            X.1Si r0 = r1.A10
            X.AnonymousClass3SK.A03(r1, r2, r0)
            goto L_0x024f
        L_0x02d4:
            r7 = 0
            android.content.Intent r0 = r1.getIntent()
            if (r0 == 0) goto L_0x02eb
            android.content.Intent r2 = r1.getIntent()
            java.lang.String r0 = "google_migrate_import_canceled"
            boolean r0 = r2.getBooleanExtra(r0, r7)
            if (r0 == 0) goto L_0x02eb
            r1.A3l(r7)
            return
        L_0x02eb:
            android.content.Intent r0 = r1.getIntent()
            if (r0 == 0) goto L_0x0301
            android.content.Intent r2 = r1.getIntent()
            java.lang.String r0 = "google_migrate_import_success"
            boolean r0 = r2.getBooleanExtra(r0, r7)
            if (r0 == 0) goto L_0x0301
            r1.A3o()
            return
        L_0x0301:
            android.content.SharedPreferences r2 = X.C36331k8.A06(r1)
            java.lang.String r0 = "chat_transfer_finished"
            boolean r0 = r2.getBoolean(r0, r7)
            if (r0 != 0) goto L_0x032f
            android.content.SharedPreferences r2 = X.C36331k8.A06(r1)
            java.lang.String r0 = "first_party_migration_initiated"
            boolean r0 = r2.getBoolean(r0, r7)
            if (r0 == 0) goto L_0x032f
            X.0zN r2 = r1.A0r
            r0 = 2989(0xbad, float:4.188E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x032f
            r0 = 0
            android.content.Intent r2 = X.AnonymousClass190.A1M(r1, r0, r7, r7)
            r0 = 19
            r1.startActivityForResult(r2, r0)
            goto L_0x01ba
        L_0x032f:
            boolean r0 = r1.A0J()
            if (r0 == 0) goto L_0x01ba
            r1.A01()
            goto L_0x01ba
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.RegisterName.onCreate(android.os.Bundle):void");
    }

    public static void A0F(RegisterName registerName) {
        View view;
        long A082 = C36371kC.A08(C36331k8.A06(registerName), "com.whatsapp.registername.initializer_start_time");
        if (A082 > 0 && C36441kJ.A0A(A082) > 600000 && (view = registerName.A00) != null) {
            view.setVisibility(0);
        }
    }

    public void A3j() {
        C19420v0 r0;
        String A0f2;
        String A0h2;
        if (C36371kC.A0H(this) == null || !getIntent().getBooleanExtra("debug", false)) {
            r0 = this.A1C.A0F;
            A0f2 = r0.A0f();
            A0h2 = r0.A0h();
        } else {
            Me A0M2 = C36401kF.A0M(this);
            C18740tg.A06(A0M2);
            A0f2 = A0M2.cc;
            A0h2 = A0M2.number;
            r0 = this.A09;
        }
        Me me = new Me(A0f2, A0h2, r0.A0g());
        if (me.jabber_id == null) {
            Log.e("RegisterName/messagestoreverified/missing-params bounce to regphone");
            C29501Ww.A02(this.A1C, 1, true);
            A33(AnonymousClass190.A0B(this), true);
            return;
        }
        C19730wQ r1 = this.A02;
        r1.A0G();
        if (!C19730wQ.A03(me, r1, "me")) {
            finish();
            return;
        }
        C19730wQ r02 = this.A02;
        r02.A0G();
        C19730wQ.A01(me, r02);
        ((C27501Ol) this.A1S.get()).A03(this);
        C64113Mr.A00(this.A0G, this.A09);
        Log.i("RegisterName/set_dirty");
        this.A0x.A0z = true;
        this.A1C.A07();
        this.A0x.A07();
        Log.i("RegisterName//msgstoreverified/group_sync_required");
        this.A0v.A0U(3, true);
        this.A1e = SystemClock.uptimeMillis();
        this.A0i = C36381kD.A0T(this.A02);
        this.A13.A01(C36411kG.A0j(this), 0, 2);
        if (C36331k8.A06(this).getLong("message_store_verified_time", 0) == 0) {
            C19420v0 r03 = this.A09;
            C36341k9.A0w(C19420v0.A00(r03), "message_store_verified_time", System.currentTimeMillis());
        }
        A0H(this);
        if (this.A18 != null) {
            if (this.A0f.A03() != 0) {
                Log.i("RegisterName/restoredialog/congrats");
                this.A18.A00(2);
            } else {
                Log.i("RegisterName/restoredialog/empty-msg-restore");
                if (!this.A1d && this.A0L.A0C()) {
                    Intent A0D2 = C36431kI.A0D();
                    A0D2.setClassName(getPackageName(), "com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity");
                    BuO(A0D2, 15);
                    this.A1d = true;
                }
                AnonymousClass3SJ.A00(this, 103);
            }
        } else if (this.A0Z.A02("android.permission.GET_ACCOUNTS") != 0) {
            Log.i("RegisterName/delay google drive setup due to lack of permissions");
            this.A09.A1G(System.currentTimeMillis() + 604800000);
        }
        Log.e("ConsumerBridge/onScheduleGenerateEncryptionKeys()");
        ((AnonymousClass6F7) ((C20610xq) ((C590832o) this.A1T.get()).A00.A01(C20610xq.class)).A00.get()).A01();
        C81143wX.A01(this.A04, this, 11);
        if (!C36371kC.A1U(C36341k9.A0E(this.A1N.A00), "reg_abprop_passkey_create_education_screen")) {
            PasskeyFacade B40 = this.A1O.B40(this.A1P.B41(1));
            C165087sr r3 = new C165087sr(this, 5);
            C36331k8.A1T(new PasskeyFacade$maybeCreatePasskeyWithoutEducationScreen$1(this, B40, (C023509x) null, r3), C33311f5.A00(this));
        }
        C81143wX.A01(this.A04, this, 20);
    }

    public void A3l(boolean z) {
        super.A3l(z);
        AnonymousClass228 r1 = this.A18;
        if (r1 != null && z) {
            r1.A00(1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a0, code lost:
        A3l(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d7, code lost:
        A3o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00da, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01eb, code lost:
        A0G(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ee, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r11, int r12, android.content.Intent r13) {
        /*
            r10 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "RegisterName/activity-result request:"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " result:"
            X.C36321k7.A1T(r0, r1, r12)
            r8 = 5
            r9 = -1
            r7 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r1 = 0
            r6 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r2 = 2
            r5 = 1
            switch(r11) {
                case 12: goto L_0x0161;
                case 13: goto L_0x0115;
                case 14: goto L_0x023f;
                case 15: goto L_0x0239;
                case 16: goto L_0x01ef;
                case 17: goto L_0x00f2;
                case 18: goto L_0x005e;
                case 19: goto L_0x003d;
                case 20: goto L_0x0027;
                case 21: goto L_0x01c1;
                case 22: goto L_0x01c1;
                case 23: goto L_0x01eb;
                default: goto L_0x0023;
            }
        L_0x0023:
            super.onActivityResult(r11, r12, r13)
        L_0x0026:
            return
        L_0x0027:
            if (r12 != r5) goto L_0x002d
            A07(r10)
            return
        L_0x002d:
            if (r12 != r2) goto L_0x003a
            r0 = 0
            android.content.Intent r1 = X.AnonymousClass190.A1M(r10, r0, r1, r5)
            r0 = 19
            r10.startActivityForResult(r1, r0)
            return
        L_0x003a:
            if (r12 != r6) goto L_0x0026
            goto L_0x00a0
        L_0x003d:
            android.content.SharedPreferences$Editor r1 = X.C36421kH.A0A(r10)
            java.lang.String r0 = "chat_transfer_finished"
            X.C36331k8.A0w(r1, r0, r5)
            if (r12 != r9) goto L_0x0052
            java.lang.String r0 = "RegisterName/activity-result/chat-transfer/succeeded from donor entry point"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.A0J()
            goto L_0x00d7
        L_0x0052:
            if (r12 != 0) goto L_0x0026
            boolean r0 = r10.A0J()
            if (r0 == 0) goto L_0x0026
            r10.A01()
            return
        L_0x005e:
            long r7 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r3 = X.C36331k8.A06(r10)
            java.lang.String r0 = "google_migrate_import_start_time"
            long r3 = X.C36341k9.A0B(r3, r0)
            long r7 = r7 - r3
            if (r12 != r2) goto L_0x00a4
            X.3NT r0 = r10.A1L
            android.content.SharedPreferences r0 = X.AnonymousClass3NT.A00(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r3 = "google_migrate_ios_funnel_id"
            android.content.SharedPreferences$Editor r0 = r0.remove(r3)
            java.lang.String r2 = "google_migrate_ios_export_duration"
            X.C36341k9.A0u(r0, r2)
            X.3NT r0 = r10.A1L
            android.content.SharedPreferences r0 = X.AnonymousClass3NT.A00(r0)
            r4 = 0
            java.lang.String r5 = r0.getString(r3, r4)
            X.3NT r0 = r10.A1L
            android.content.SharedPreferences r0 = X.AnonymousClass3NT.A00(r0)
            java.lang.String r6 = r0.getString(r2, r4)
            X.3TX r2 = r10.A1J
            java.lang.String r3 = "profile_photo"
            r2.A0B(r3, r4, r5, r6, r7)
        L_0x00a0:
            r10.A3l(r1)
            return
        L_0x00a4:
            if (r12 != r5) goto L_0x00db
            X.3NT r0 = r10.A1L
            android.content.SharedPreferences r0 = X.AnonymousClass3NT.A00(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "google_migrate_ios_funnel_id"
            android.content.SharedPreferences$Editor r0 = r0.remove(r2)
            java.lang.String r1 = "google_migrate_ios_export_duration"
            X.C36341k9.A0u(r0, r1)
            X.3NT r0 = r10.A1L
            android.content.SharedPreferences r0 = X.AnonymousClass3NT.A00(r0)
            r4 = 0
            java.lang.String r5 = r0.getString(r2, r4)
            X.3NT r0 = r10.A1L
            android.content.SharedPreferences r0 = X.AnonymousClass3NT.A00(r0)
            java.lang.String r6 = r0.getString(r1, r4)
            X.3TX r2 = r10.A1J
            java.lang.String r3 = "profile_photo"
            r2.A0B(r3, r4, r5, r6, r7)
        L_0x00d7:
            r10.A3o()
            return
        L_0x00db:
            if (r12 != r6) goto L_0x0026
            X.1Ww r0 = r10.A1C
            r0.A09()
            android.content.Intent r1 = X.AnonymousClass190.A0B(r10)
            java.lang.String r0 = "com.whatsapp.registration.RegisterPhone.clear_phone_number"
            r1.putExtra(r0, r5)
            r10.startActivity(r1)
            r10.finish()
            return
        L_0x00f2:
            r10.A0I(r4, r4)
            r10.A01()
            X.3Jm r0 = r10.A1N
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x0105
            com.whatsapp.WaEditText r0 = r10.A0I
            r0.A0C(r1)
        L_0x0105:
            X.16m r0 = r10.A0O
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0026
            X.0wU r1 = r10.A04
            r0 = 14
            X.C81143wX.A01(r1, r10, r0)
            return
        L_0x0115:
            X.1P3 r0 = r10.A14
            X.C36411kG.A1J(r0)
            if (r12 != r9) goto L_0x014b
            X.141 r1 = r10.A0i
            if (r1 != 0) goto L_0x0133
            java.lang.String r0 = "RegisterName/onActivityResult/meContact is null. Trying to set it again from meManager."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.142 r1 = X.C36431kI.A0V(r10)
            r10.A0i = r1
            if (r1 != 0) goto L_0x0133
            java.lang.String r0 = "RegisterName/onActivityResult/meContact is null. Can't set the profile image."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0133:
            X.1P3 r0 = r10.A14
            boolean r0 = r0.A0F(r1)
            if (r0 == 0) goto L_0x013e
            A0H(r10)
        L_0x013e:
            X.0v5 r1 = r10.A0A
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0026
            java.lang.NullPointerException r0 = X.C36411kG.A0u(r1)
            throw r0
        L_0x014b:
            if (r12 != 0) goto L_0x0026
            if (r13 == 0) goto L_0x0154
            X.1P3 r0 = r10.A14
            r0.A04(r13, r10)
        L_0x0154:
            X.0v5 r1 = r10.A0A
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x02e1
            java.lang.NullPointerException r0 = X.C36411kG.A0u(r1)
            throw r0
        L_0x0161:
            if (r12 != r9) goto L_0x01b4
            java.lang.String r2 = "profile_photo"
            if (r13 == 0) goto L_0x02fe
            java.lang.String r0 = "is_reset"
            boolean r0 = r13.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x018d
            X.3TX r1 = r10.A1J
            java.lang.String r0 = "did_not_set"
            r1.A08(r2, r0)
            X.1P3 r1 = r10.A14
            X.141 r0 = r10.A0i
            r1.A0D(r0)
            A0H(r10)
            X.0v5 r1 = r10.A0A
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0026
            java.lang.NullPointerException r0 = X.C36411kG.A0u(r1)
            throw r0
        L_0x018d:
            java.lang.String r0 = "skip_cropping"
            boolean r0 = r13.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x02e5
            X.1P3 r0 = r10.A14
            X.C36411kG.A1J(r0)
            X.1P3 r1 = r10.A14
            X.141 r0 = r10.A0i
            boolean r0 = r1.A0F(r0)
            if (r0 == 0) goto L_0x01a7
            A0H(r10)
        L_0x01a7:
            X.0v5 r1 = r10.A0A
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0026
            java.lang.NullPointerException r0 = X.C36411kG.A0u(r1)
            throw r0
        L_0x01b4:
            X.0v5 r1 = r10.A0A
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0026
            java.lang.NullPointerException r0 = X.C36411kG.A0u(r1)
            throw r0
        L_0x01c1:
            X.0yC r0 = r10.A0D
            boolean r0 = X.C36401kF.A1Y(r0)
            if (r0 == 0) goto L_0x01eb
            X.0yC r1 = r10.A0D
            r0 = 7785(0x1e69, float:1.0909E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x01eb
            java.lang.String r0 = "RegisterName//maybeShowMultiUserNativeContactsOnboardingScreen"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r0 = "com.whatsapp.contact.picker.nativecontacts.NativeContactsOptInActivity"
            r2.setClassName(r1, r0)
            r0 = 23
            r10.startActivityForResult(r2, r0)
            return
        L_0x01eb:
            A0G(r10)
            return
        L_0x01ef:
            if (r12 != r5) goto L_0x0233
            java.lang.String r0 = "RegisterName/activity-result/successfully-restored"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wh r0 = r10.A0A
            java.lang.String r1 = r0.A02()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0216
            boolean r0 = r10.isFinishing()
            if (r0 != 0) goto L_0x0216
            com.whatsapp.WaEditText r0 = r10.A0I
            r0.setText(r1)
            com.whatsapp.WaEditText r1 = r10.A0I
            int r0 = r1.length()
            r1.setSelection(r0)
        L_0x0216:
            r10.A3o()
        L_0x0219:
            X.1QE r4 = r10.A1G
            long r2 = android.os.SystemClock.elapsedRealtime()
            android.content.SharedPreferences r1 = X.C36331k8.A06(r10)
            java.lang.String r0 = "direct_migration_start_time"
            long r0 = X.C36371kC.A08(r1, r0)
            long r2 = r2 - r0
            X.1QF r1 = r4.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A09 = r0
            return
        L_0x0233:
            if (r12 != r2) goto L_0x0219
            A07(r10)
            goto L_0x0219
        L_0x0239:
            r0 = 103(0x67, float:1.44E-43)
            X.AnonymousClass3SJ.A00(r10, r0)
            return
        L_0x023f:
            X.3Jm r0 = r10.A1N
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x024c
            com.whatsapp.WaEditText r0 = r10.A0I
            r0.A0C(r1)
        L_0x024c:
            if (r12 != r6) goto L_0x0273
            java.lang.String r0 = "restore>RegisterName/activity-result backup found and is being restored."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.A3o()
            r10.A1W = r4
            X.228 r0 = r10.A18
            if (r0 == 0) goto L_0x025f
            r0.hide()
        L_0x025f:
            X.0wU r1 = r10.A04
            r0 = 14
            X.C81143wX.A01(r1, r10, r0)
        L_0x0266:
            X.3TX r2 = r10.A1J
            java.lang.String r1 = "profile_photo"
            java.lang.String r0 = "no_tap"
            r2.A07(r1, r0)
            r10.A0I(r3, r3)
            return
        L_0x0273:
            if (r12 != 0) goto L_0x0282
            java.lang.String r0 = "restore>RegisterName/activity-result restore canceled because Google Play Services were not available on the device"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.7lA r0 = X.C100804vn.A0O(r10)
            r0.BxC()
            goto L_0x0266
        L_0x0282:
            java.lang.String r4 = "skip"
            if (r12 != r2) goto L_0x029c
            java.lang.String r0 = "restore>RegisterName/activity-result backup found but not restored"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.A3l(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r10.A1W = r0
            X.3TX r0 = r10.A1J
            java.lang.String r2 = "backup_found"
        L_0x0298:
            r0.A07(r2, r4)
            goto L_0x0266
        L_0x029c:
            java.lang.String r2 = "no_backup_found"
            if (r12 != r5) goto L_0x02b6
            java.lang.String r0 = "restore>RegisterName/activity-result no google backup found"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.A3l(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r10.A1W = r0
            X.3TX r1 = r10.A1J
            java.lang.String r0 = "next"
            r1.A07(r2, r0)
            goto L_0x0266
        L_0x02b6:
            if (r12 != r7) goto L_0x02c4
            r10.A3l(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r10.A1W = r0
            X.3TX r0 = r10.A1J
            goto L_0x0298
        L_0x02c4:
            if (r12 != r8) goto L_0x02cf
            java.lang.String r0 = "RegisterName/activity-result/chat-transfer/succeeded from receiver entry point"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.A3o()
            goto L_0x0266
        L_0x02cf:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "restore>RegisterName/activity-result unknown result code "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " from RestoreFromBackupActivity."
            X.C36321k7.A1Z(r1, r0)
            goto L_0x0266
        L_0x02e1:
            r0 = 0
            r10.A1X = r0
            return
        L_0x02e5:
            java.lang.String r1 = "photo_source"
            boolean r0 = r13.hasExtra(r1)
            if (r0 == 0) goto L_0x02fe
            android.os.Bundle r0 = r13.getExtras()
            X.C18740tg.A06(r0)
            int r0 = r0.getInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.A1X = r0
        L_0x02fe:
            X.3TX r1 = r10.A1J
            java.lang.String r0 = "set_photo"
            r1.A08(r2, r0)
            X.1P3 r1 = r10.A14
            r0 = 13
            r1.A05(r13, r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.RegisterName.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass226 r1 = this.A19;
        if (r1 != null) {
            r1.onCreate(r1.onSaveInstanceState());
            AnonymousClass226 r2 = this.A19;
            r2.A01.A00 = r2.findViewById(R.id.pay_ed_contact_support);
            A0F(this);
        }
        AnonymousClass228 r12 = this.A18;
        if (r12 != null) {
            r12.onCreate(r12.onSaveInstanceState());
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.f12nameremoved);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        if (isFinishing()) {
            this.A10.A09();
        }
        C226815j r1 = this.A1i;
        if (r1 != null) {
            this.A0R.unregisterObserver(r1);
            this.A1i = null;
        }
        C49892jr r12 = this.A1k;
        if (r12 != null) {
            r12.A00 = null;
            r12.A0D(true);
            this.A1k = null;
        }
        this.A1A.A00();
        RegistrationScrollView registrationScrollView = this.A1l;
        if (registrationScrollView != null) {
            registrationScrollView.getViewTreeObserver().removeOnScrollChangedListener(registrationScrollView.A07);
            if (registrationScrollView.A00 != null) {
                registrationScrollView.getViewTreeObserver().removeOnGlobalLayoutListener(registrationScrollView.A00);
            }
            this.A1l = null;
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            this.A1E.A02("register-name");
            this.A1A.A01(this, this.A1E, "register-name");
            return true;
        } else if (itemId != 1) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.A1C.A09();
            C36361kB.A0t(this);
            return true;
        }
    }

    public void onPause() {
        Handler handler;
        super.onPause();
        C80933wC r2 = A1r;
        if (!(r2 == null || (handler = r2.A02) == null)) {
            handler.removeMessages(0);
            r2.A02 = null;
        }
        Integer num = this.A1W;
        if (num != null) {
            C19420v0 r0 = this.A09;
            C36341k9.A0v(C19420v0.A00(r0), "reg_backup_status_key", num.intValue());
        }
        Integer num2 = this.A1X;
        if (num2 != null) {
            C19420v0 r02 = this.A09;
            C36341k9.A0v(C19420v0.A00(r02), "reg_profile_pic_source_key", num2.intValue());
        }
        if (this.A1a) {
            C36331k8.A0w(C36421kH.A0A(this), "reg_profile_pic_tapped_key", true);
        }
    }

    public void onResume() {
        super.onResume();
        if (A1r != null) {
            AnonymousClass3SJ.A01(this, 0);
            C80933wC r2 = A1r;
            Handler handler = this.A1o;
            if (r2.A03) {
                handler.sendEmptyMessage(0);
            }
            r2.A02 = handler;
            A0F(this);
        }
        if (this.A0A.A03() && this.A19 == null) {
            AnonymousClass3SJ.A01(this, 0);
            Log.i("RegisterName/resume reg verified; explicitly display continue screen");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("started_gdrive_new_user_activity", this.A1d);
    }
}
