package com.whatsapp.contact.contactform;

import X.AnonymousClass000;
import X.AnonymousClass11F;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass190;
import X.AnonymousClass196;
import X.AnonymousClass19A;
import X.AnonymousClass1M4;
import X.AnonymousClass1N4;
import X.AnonymousClass1NG;
import X.AnonymousClass2Fm;
import X.AnonymousClass312;
import X.AnonymousClass3D5;
import X.AnonymousClass3EO;
import X.AnonymousClass3P7;
import X.AnonymousClass3T6;
import X.AnonymousClass4XM;
import X.C18800tq;
import X.C18830tt;
import X.C20430xY;
import X.C20830yE;
import X.C21159AAt;
import X.C229216m;
import X.C27111My;
import X.C32661dz;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36411kG;
import X.C36421kH;
import X.C608739r;
import X.C61133Ar;
import X.C61313Bj;
import X.C61323Bk;
import X.C62533Gn;
import X.C63443Kb;
import X.C64523Oi;
import X.C65383Rv;
import X.C70283eu;
import X.C87174Nt;
import X.C87524Pd;
import X.C87534Pe;
import X.C87544Pf;
import X.C88714Tt;
import X.C89324Wc;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;

public class ContactFormActivity extends AnonymousClass155 implements C88714Tt, C87524Pd, C87534Pe, C87544Pf, C87174Nt {
    public AnonymousClass11F A00;
    public AnonymousClass1N4 A01;
    public C61313Bj A02;
    public C61323Bk A03;
    public AnonymousClass1NG A04;
    public AnonymousClass196 A05;
    public C229216m A06;
    public AnonymousClass16D A07;
    public C64523Oi A08;
    public C61133Ar A09;
    public C63443Kb A0A;
    public C65383Rv A0B;
    public C21159AAt A0C;
    public C20430xY A0D;
    public C20830yE A0E;
    public AnonymousClass19A A0F;
    public C32661dz A0G;
    public AnonymousClass1M4 A0H;
    public Long A0I;
    public int A0J;
    public AnonymousClass3EO A0K;
    public C70283eu A0L;
    public C608739r A0M;
    public C62533Gn A0N;
    public AnonymousClass2Fm A0O;
    public AnonymousClass3D5 A0P;
    public AnonymousClass3P7 A0Q;
    public AnonymousClass312 A0R;
    public Long A0S;
    public boolean A0T;

    public void BUo(String str) {
        startActivityForResult(AnonymousClass190.A1C(this, str, (String) null), 0);
    }

    public void Bff() {
        if (!isFinishing()) {
            AnonymousClass3T6.A01(this, new AnonymousClass4XM(this, 8), new AnonymousClass4XM(this, 9), R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved);
        }
    }

    public void requestPermission() {
        RequestPermissionActivity.A0G(this, false);
    }

    public void A2F() {
        if (!this.A0T) {
            this.A0T = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r3 = r2.A00;
            C36321k7.A0X(r2, r3, this, C36321k7.A05(r2, r3, this));
            this.A05 = (AnonymousClass196) r2.A8N.get();
            this.A0H = C36361kB.A0f(r2);
            this.A0F = C36361kB.A0c(r2);
            this.A07 = C36341k9.A0R(r2);
            this.A0D = C36421kH.A0K(r2);
            this.A04 = C36381kD.A0V(r2);
            this.A0C = C36411kG.A0b(r2);
            this.A01 = C36351kA.A0K(r2);
            this.A0G = C36371kC.A0k(r2);
            this.A0B = (C65383Rv) r3.A2M.get();
            this.A06 = C36381kD.A0X(r2);
            this.A0E = C36351kA.A0X(r2);
            this.A08 = r2.A5o();
            this.A02 = (C61313Bj) A0L2.A0O.get();
            this.A03 = (C61323Bk) A0L2.A0P.get();
        }
    }

    public void BQo() {
        this.A0G.A02((Boolean) null, 5);
    }

    public void Bfh(Intent intent) {
        this.A0G.A02(Boolean.valueOf(AnonymousClass000.A1V(this.A0N.A00)), 4);
        C36331k8.A0o(this, intent);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0) {
            this.A0O.A08(i2, intent);
        } else if (i == 1) {
            C36331k8.A0m(this.A0M.A00);
        } else if (i == 150) {
            this.A0A.A00();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        if (!this.A0K.A00()) {
            super.onBackPressed();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008e, code lost:
        if (r1 == false) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r45) {
        /*
            r44 = this;
            r4 = r44
            r0 = r45
            super.onCreate(r0)
            X.0yC r0 = r4.A0D
            r6 = 5868(0x16ec, float:8.223E-42)
            boolean r1 = r0.A0E(r6)
            r0 = 2131624469(0x7f0e0215, float:1.8876119E38)
            if (r1 == 0) goto L_0x0017
            r0 = 2131624471(0x7f0e0217, float:1.8876123E38)
        L_0x0017:
            android.content.Intent r3 = X.C36431kI.A0F(r4, r0)
            java.lang.String r5 = "contact_id"
            r0 = 0
            r29 = 0
            if (r3 == 0) goto L_0x015e
            boolean r2 = r3.hasExtra(r5)
            if (r2 == 0) goto L_0x015e
            long r0 = r3.getLongExtra(r5, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0031:
            r4.A0I = r0
            java.lang.String r0 = "is_whatsapp_contact"
            r7 = 0
            r3.getBooleanExtra(r0, r7)
            java.lang.String r2 = "wa_contact_table_column_id"
            boolean r0 = r3.hasExtra(r2)
            if (r0 == 0) goto L_0x015a
            r0 = -1
            long r0 = r3.getLongExtra(r2, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x004b:
            r4.A0S = r0
            java.lang.String r1 = "contact_sync_policy"
            boolean r0 = r3.hasExtra(r1)
            if (r0 == 0) goto L_0x0157
            int r0 = r3.getIntExtra(r1, r7)
        L_0x0059:
            r4.A0J = r0
            r0 = 2131888236(0x7f12086c, float:1.9411102E38)
            r4.setTitle(r0)
            androidx.appcompat.widget.Toolbar r1 = X.C36361kB.A0N(r4)
            r4.setSupportActionBar(r1)
            X.07B r2 = X.C36381kD.A0O(r4)
            java.lang.Long r0 = r4.A0I
            if (r0 == 0) goto L_0x007f
            X.0yC r0 = r4.A0D
            boolean r0 = r0.A0E(r6)
            if (r0 == 0) goto L_0x007f
            X.4Xl r0 = new X.4Xl
            r0.<init>(r4, r7)
            r1.A0C = r0
        L_0x007f:
            android.content.Intent r1 = r4.getIntent()
            if (r1 == 0) goto L_0x0090
            java.lang.String r0 = "contact_data_phone"
            boolean r1 = r1.hasExtra(r0)
            r0 = 2131888251(0x7f12087b, float:1.9411132E38)
            if (r1 != 0) goto L_0x0093
        L_0x0090:
            r0 = 2131890988(0x7f12132c, float:1.9416683E38)
        L_0x0093:
            r2.A0I(r0)
            r0 = 1
            r2.A0U(r0)
            android.os.Bundle r1 = r3.getExtras()
            java.lang.String r43 = ""
            r28 = r43
            if (r1 == 0) goto L_0x00ae
            java.lang.String r0 = "contact_data_phone"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x00ae
            r43 = r0
        L_0x00ae:
            android.view.View r8 = r4.A00
            r1 = 1
            X.AnonymousClass00C.A0D(r8, r1)
            X.3D5 r0 = new X.3D5
            r0.<init>(r4, r8)
            r4.A0P = r0
            X.3Df r13 = new X.3Df
            r13.<init>(r4, r8, r0)
            X.1H2 r0 = r4.A0C
            r15 = 1
            X.AnonymousClass00C.A0D(r0, r1)
            r12 = 2
            X.3QT r2 = new X.3QT
            r2.<init>(r4, r8, r13, r0)
            X.3Rv r1 = r4.A0B
            X.AnonymousClass00C.A0D(r1, r12)
            X.3Gn r0 = new X.3Gn
            r0.<init>(r4, r8, r1)
            r4.A0N = r0
            X.312 r0 = new X.312
            r0.<init>(r8)
            r4.A0R = r0
            r11 = 3
            X.4XY r1 = new X.4XY
            r1.<init>(r4, r11)
            androidx.appcompat.widget.SwitchCompat r0 = r0.A00
            r0.setOnCheckedChangeListener(r1)
            X.0wU r0 = r4.A04
            r24 = r0
            X.19A r14 = r4.A0F
            X.16D r9 = r4.A07
            X.1NG r7 = r4.A04
            X.AAt r1 = r4.A0C
            X.0wD r0 = r4.A07
            X.3Gn r10 = r4.A0N
            r21 = r10
            X.3eu r10 = new X.3eu
            r16 = r10
            r17 = r4
            r18 = r7
            r19 = r0
            r20 = r9
            r22 = r1
            r23 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r4.A0L = r10
            X.17Y r0 = r4.A05
            r16 = r0
            X.1M4 r14 = r4.A0H
            X.0yb r9 = r4.A08
            X.0ts r7 = r4.A00
            X.1N4 r1 = r4.A01
            X.2Fm r0 = new X.2Fm
            r35 = r4
            r30 = r0
            r31 = r4
            r32 = r8
            r33 = r1
            r34 = r16
            r36 = r10
            r37 = r21
            r38 = r13
            r39 = r9
            r40 = r7
            r41 = r14
            r42 = r24
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r4.A0O = r0
            java.lang.Long r0 = r4.A0I
            boolean r0 = X.AnonymousClass000.A1V(r0)
            java.lang.String r9 = "native_contact_sync_to_device"
            if (r0 == 0) goto L_0x01d2
            X.0yC r0 = r4.A0D
            boolean r0 = r0.A0E(r6)
            if (r0 == 0) goto L_0x01d2
            java.lang.String r0 = "contact_chat_jid"
            java.lang.String r1 = r3.getStringExtra(r0)
            goto L_0x0162
        L_0x0157:
            r0 = -1
            goto L_0x0059
        L_0x015a:
            r0 = r29
            goto L_0x004b
        L_0x015e:
            r0 = r29
            goto L_0x0031
        L_0x0162:
            X.13q r0 = X.AnonymousClass11F.A00     // Catch:{ 0wR -> 0x016b }
            X.11F r0 = X.C222713q.A01(r1)     // Catch:{ 0wR -> 0x016b }
            r4.A00 = r0     // Catch:{ 0wR -> 0x016b }
            goto L_0x0172
        L_0x016b:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0172:
            boolean r6 = r3.hasExtra(r9)
            r0 = 0
            if (r6 == 0) goto L_0x0320
            long r6 = r3.getLongExtra(r9, r0)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
        L_0x0182:
            long r17 = r6.longValue()
            int r6 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0195
            r6 = 2131434531(0x7f0b1c23, float:1.8490879E38)
            android.view.View r7 = X.C012005e.A02(r8, r6)
            r6 = 0
            r7.setVisibility(r6)
        L_0x0195:
            X.0wU r14 = r4.A04
            X.196 r13 = r4.A05
            X.16D r10 = r4.A07
            X.0xY r7 = r4.A0D
            X.11F r6 = r4.A00
            int r16 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            boolean r25 = X.AnonymousClass000.A1Q(r16)
            java.lang.Long r0 = r4.A0I
            r24 = r0
            X.2Fm r1 = r4.A0O
            X.17Y r0 = r4.A05
            X.C36351kA.A1J(r14, r13, r15)
            X.AnonymousClass00C.A0D(r10, r12)
            X.C36331k8.A1G(r7, r11, r6)
            r12 = 7
            X.C36361kB.A1J(r1, r12, r0)
            X.3Ar r12 = new X.3Ar
            r15 = r12
            r16 = r0
            r17 = r13
            r18 = r10
            r19 = r4
            r20 = r1
            r21 = r7
            r22 = r6
            r23 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r4.A09 = r12
        L_0x01d2:
            X.2Fm r1 = r4.A0O
            X.17Y r0 = r4.A05
            X.C36331k8.A1G(r1, r11, r0)
            X.39r r10 = new X.39r
            r14 = r4
            r11 = r4
            r12 = r8
            r13 = r0
            r15 = r2
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r4.A0M = r10
            X.0yC r10 = r4.A0D
            X.17Y r7 = r4.A05
            X.0wU r6 = r4.A04
            X.16m r1 = r4.A06
            X.0yE r0 = r4.A0E
            X.3B5 r19 = new X.3B5
            r24 = r4
            r20 = r4
            r21 = r8
            r22 = r7
            r23 = r1
            r25 = r0
            r26 = r10
            r27 = r6
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            android.os.Bundle r1 = r3.getExtras()
            if (r1 == 0) goto L_0x0216
            java.lang.String r0 = "contact_data_phone"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x0216
            r28 = r0
        L_0x0216:
            android.os.Bundle r1 = r3.getExtras()
            if (r1 == 0) goto L_0x027f
            java.lang.String r0 = "contact_data_lid"
            java.lang.String r1 = r1.getString(r0)
            X.6Nb r0 = X.C223313w.A01
            X.13w r6 = r0.A01(r1)
            if (r6 == 0) goto L_0x027f
            r0 = 2131432667(0x7f0b14db, float:1.8487098E38)
            android.view.View r9 = X.C012005e.A02(r8, r0)
            r0 = 2131429288(0x7f0b07a8, float:1.8480244E38)
            android.view.View r7 = X.C012005e.A02(r8, r0)
            r0 = 2131432670(0x7f0b14de, float:1.8487104E38)
            android.view.View r5 = X.C012005e.A02(r8, r0)
            r0 = 2131427579(0x7f0b00fb, float:1.8476778E38)
            android.view.View r1 = X.C012005e.A02(r8, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r28)
            if (r0 != 0) goto L_0x0276
            r0 = 0
            r9.setEnabled(r0)
            r7.setEnabled(r0)
            r5.setEnabled(r0)
        L_0x0256:
            X.3Bj r1 = r4.A02
            X.3D5 r0 = r4.A0P
            X.3F1 r11 = r1.A00(r2, r0, r4, r6)
            X.2Fm r0 = r4.A0O
            X.3Kb r10 = r4.A0A
        L_0x0262:
            X.3EO r6 = new X.3EO
            r7 = r4
            r8 = r2
            r9 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            r4.A0K = r6
            android.os.Bundle r1 = r3.getExtras()
            X.2Fm r0 = r4.A0O
            X.AnonymousClass3T6.A02(r1, r2, r0)
            return
        L_0x0276:
            r0 = 8
            X.C36361kB.A15(r9, r7, r5, r0)
            r1.setVisibility(r0)
            goto L_0x0256
        L_0x027f:
            r10 = 0
            boolean r6 = r3.hasExtra(r9)
            r0 = 0
            if (r6 == 0) goto L_0x031c
            long r6 = r3.getLongExtra(r9, r0)
            java.lang.Long r7 = java.lang.Long.valueOf(r6)
        L_0x0290:
            X.0yC r6 = r4.A0D
            boolean r6 = X.C36401kF.A1Y(r6)
            if (r6 == 0) goto L_0x02a1
            java.lang.Long r6 = r4.A0I
            boolean r6 = X.AnonymousClass000.A1V(r6)
            X.AnonymousClass3T6.A03(r8, r6)
        L_0x02a1:
            X.312 r9 = r4.A0R
            if (r7 == 0) goto L_0x02ae
            long r7 = r7.longValue()
            int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x02ae
            r10 = 1
        L_0x02ae:
            androidx.appcompat.widget.SwitchCompat r6 = r9.A00
            r6.setChecked(r10)
            java.lang.String r6 = "extra_contact_phone_number"
            java.lang.String r31 = r3.getStringExtra(r6)
            X.3Bk r8 = r4.A03
            X.312 r7 = r4.A0R
            X.3Gn r9 = r4.A0N
            X.2Fm r6 = r4.A0O
            r10 = r2
            r11 = r6
            r12 = r4
            r13 = r7
            X.3P7 r6 = r8.A00(r9, r10, r11, r12, r13)
            r4.A0Q = r6
            X.0yC r6 = r4.A0D
            r16 = r6
            X.17Y r15 = r4.A05
            X.0wN r14 = r4.A03
            X.0wU r13 = r4.A04
            boolean r6 = r3.hasExtra(r5)
            if (r6 == 0) goto L_0x02e3
            long r0 = r3.getLongExtra(r5, r0)
            java.lang.Long r29 = java.lang.Long.valueOf(r0)
        L_0x02e3:
            X.16m r12 = r4.A06
            X.0yE r11 = r4.A0E
            X.3Oi r9 = r4.A08
            X.2Fm r8 = r4.A0O
            X.3D5 r7 = r4.A0P
            X.312 r6 = r4.A0R
            X.3P7 r5 = r4.A0Q
            X.3Gn r1 = r4.A0N
            java.lang.Long r0 = r4.A0S
            X.3Kb r10 = new X.3Kb
            r23 = r4
            r24 = r5
            r25 = r6
            r26 = r11
            r27 = r16
            r28 = r13
            r30 = r0
            r18 = r1
            r20 = r2
            r21 = r8
            r22 = r7
            r17 = r9
            r16 = r12
            r13 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r4.A0A = r10
            X.2Fm r0 = r4.A0O
            r11 = 0
            goto L_0x0262
        L_0x031c:
            r7 = r29
            goto L_0x0290
        L_0x0320:
            r6 = r29
            goto L_0x0182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.contactform.ContactFormActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!(this.A0I == null || !this.A0D.A0E(5868) || menu == null)) {
            getMenuInflater().inflate(R.menu.f11nameremoved, menu);
            if (!this.A0D.A0E(5868) || this.A0J != 1) {
                menu.findItem(R.id.save_to_phone).setVisible(false);
            } else {
                MenuItem findItem = menu.findItem(R.id.save_to_phone);
                findItem.setVisible(true);
                findItem.setTitle(getString(R.string.f12nameremoved));
            }
            menu.findItem(R.id.delete_contact).setTitle(getString(R.string.f12nameremoved));
        }
        return super.onCreateOptionsMenu(menu);
    }

    public ContactFormActivity(int i) {
        this.A0T = false;
        C89324Wc.A00(this, 27);
    }

    public boolean BLL() {
        return isFinishing();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0P.A00(configuration);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0L.A00();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || !this.A0K.A00()) {
            return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    public ContactFormActivity() {
        this(0);
        this.A0J = -1;
    }
}
