package com.whatsapp.registration.phonenumberentry;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass07B;
import X.AnonymousClass185;
import X.AnonymousClass190;
import X.AnonymousClass1C4;
import X.AnonymousClass1M4;
import X.AnonymousClass1P5;
import X.AnonymousClass1RC;
import X.AnonymousClass24S;
import X.AnonymousClass2d9;
import X.AnonymousClass34N;
import X.AnonymousClass3AK;
import X.AnonymousClass3DH;
import X.AnonymousClass3KB;
import X.AnonymousClass3LW;
import X.AnonymousClass3MT;
import X.AnonymousClass3SJ;
import X.AnonymousClass3U2;
import X.AnonymousClass4TQ;
import X.AnonymousClass4VT;
import X.AnonymousClass4W2;
import X.AnonymousClass6OK;
import X.C177848eT;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C19420v0;
import X.C19630wG;
import X.C19770wU;
import X.C19970wo;
import X.C20310xM;
import X.C20720y3;
import X.C21510zM;
import X.C23045B1q;
import X.C25271Fq;
import X.C27111My;
import X.C29341Wg;
import X.C29501Ww;
import X.C30231Zs;
import X.C33541fX;
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
import X.C39001qm;
import X.C48762i0;
import X.C50212kO;
import X.C65983Uf;
import X.C81143wX;
import X.C89364Wg;
import X.C89634Xh;
import X.C89924Yk;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.components.PhoneNumberEntry;
import com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.json.JSONObject;

public class ChangeNumber extends AnonymousClass2d9 implements C23045B1q {
    public static String A0P;
    public static String A0Q;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public View A06;
    public ScrollView A07;
    public AnonymousClass185 A08;
    public C25271Fq A09;
    public C20310xM A0A;
    public AnonymousClass1P5 A0B;
    public C20720y3 A0C;
    public AnonymousClass1C4 A0D;
    public C30231Zs A0E;
    public C29341Wg A0F;
    public AnonymousClass3KB A0G;
    public AnonymousClass3AK A0H;
    public AnonymousClass005 A0I;
    public ArrayList A0J;
    public boolean A0K;
    public final Handler A0L;
    public final Runnable A0M;
    public final AnonymousClass4TQ A0N;
    public final C33541fX A0O;

    public void Bu0() {
        AnonymousClass3SJ.A00(this, 1);
        super.Bu0();
    }

    public void Bus() {
        A0h(this, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r9, int r10, android.content.Intent r11) {
        /*
            r8 = this;
            r2 = -1
            r0 = 1
            if (r9 != r0) goto L_0x0160
            if (r10 != r2) goto L_0x0177
            if (r11 == 0) goto L_0x0177
            java.lang.String r0 = "selectedJids"
            java.util.ArrayList r0 = r11.getStringArrayListExtra(r0)
            r8.A0J = r0
            X.1VX r2 = r8.A01
            X.0wQ r0 = r8.A02
            com.whatsapp.jid.PhoneUserJid r0 = X.C36371kC.A0e(r0)
            java.lang.String r1 = r0.user
            java.util.ArrayList r0 = r8.A0J
            X.3Ie r3 = new X.3Ie
            r3.<init>(r1, r0)
            java.lang.String r0 = "changenumbermanager/savechangenumbercontacts"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wG r0 = r2.A00     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x0080 }
            android.content.Context r2 = r0.A00     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x0080 }
            java.lang.String r1 = "change_number_contacts.json"
            r0 = 0
            java.io.FileOutputStream r2 = r2.openFileOutput(r1, r0)     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x0080 }
            java.lang.String r1 = X.C19430v1.A0B     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x0080 }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x0080 }
            r0.<init>(r2, r1)     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x0080 }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x0080 }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x0080 }
            r2.beginObject()     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "old_jid"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = r3.A00     // Catch:{ all -> 0x0072 }
            r1.value(r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "notify_jids"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x0072 }
            r0.beginArray()     // Catch:{ all -> 0x0072 }
            java.util.List r0 = r3.A01     // Catch:{ all -> 0x0072 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0072 }
        L_0x005a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = X.AnonymousClass001.A0C(r1)     // Catch:{ all -> 0x0072 }
            r2.value(r0)     // Catch:{ all -> 0x0072 }
            goto L_0x005a
        L_0x0068:
            r2.endArray()     // Catch:{ all -> 0x0072 }
            r2.endObject()     // Catch:{ all -> 0x0072 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x0080 }
            goto L_0x0086
        L_0x0072:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0077 }
            goto L_0x007b
        L_0x0077:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x0080 }
        L_0x007b:
            throw r1     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x0080 }
        L_0x007c:
            r1 = move-exception
            java.lang.String r0 = "ChangeNumberManager/saveChangeNumberContacts/notFoundJson "
            goto L_0x0083
        L_0x0080:
            r1 = move-exception
            java.lang.String r0 = "ChangeNumberManager/saveChangeNumberContacts/ioErrorJson "
        L_0x0083:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0086:
            X.3AK r0 = r8.A0H
            android.widget.EditText r0 = r0.A02
            java.lang.String r7 = X.C36331k8.A0f(r0)
            X.3AK r0 = r8.A0H
            android.widget.EditText r0 = r0.A03
            java.lang.String r3 = X.C36361kB.A0n(r0)
            X.3AK r0 = r8.A0H
            boolean r0 = A0i(r8, r0, r7, r3)
            if (r0 == 0) goto L_0x0177
            X.3AK r0 = r8.A0O
            android.widget.EditText r0 = r0.A02
            java.lang.String r2 = X.C36331k8.A0f(r0)
            X.3AK r0 = r8.A0O
            android.widget.EditText r0 = r0.A03
            java.lang.String r1 = X.C36361kB.A0n(r0)
            X.3AK r0 = r8.A0O
            boolean r0 = A0i(r8, r0, r2, r1)
            if (r0 == 0) goto L_0x0177
            int r2 = java.lang.Integer.parseInt(r7)
            java.lang.String r1 = "\\D"
            java.lang.String r0 = ""
            java.lang.String r6 = r3.replaceAll(r1, r0)
            X.1N4 r0 = r8.A02     // Catch:{ IOException -> 0x00c9 }
            java.lang.String r6 = r0.A03(r2, r6)     // Catch:{ IOException -> 0x00c9 }
            goto L_0x00cf
        L_0x00c9:
            r1 = move-exception
            java.lang.String r0 = "ChangeNumber/phone failed trimLeadingZero from CountryPhoneInfo"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00cf:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ChangeNumber/phone/cc="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "/number="
            X.C36321k7.A1Q(r0, r6, r1)
            A0P = r7
            A0Q = r6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ChangeNumber/submit/cc "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " ph="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " jid="
            r1.append(r0)
            com.whatsapp.jid.PhoneUserJid r0 = X.C36411kG.A0j(r8)
            X.C36351kA.A1L(r0, r1)
            X.0y3 r0 = r8.A0C
            X.19J r0 = r0.A0H
            int r1 = r0.A04
            r0 = 2
            if (r1 != r0) goto L_0x0138
            r5 = 1
            X.AnonymousClass3SJ.A01(r8, r5)
            android.os.Handler r4 = r8.A0L
            r2 = 30000(0x7530, double:1.4822E-319)
            r1 = 4
            r4.sendEmptyMessageDelayed(r1, r2)
            X.1C4 r0 = r8.A0D
            boolean r0 = r0.A06(r7, r6)
            if (r0 != 0) goto L_0x0177
            r4.removeMessages(r1)
            X.AnonymousClass3SJ.A00(r8, r5)
            r3 = 2131893393(0x7f121c91, float:1.9421561E38)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r1 = 0
            r0 = 2131888230(0x7f120866, float:1.941109E38)
            java.lang.String r0 = X.C36341k9.A0e(r8, r2, r0, r1, r3)
        L_0x0134:
            r8.BO6(r0)
            return
        L_0x0138:
            java.lang.String r0 = "ChangeNumber/submit/no-connectivity"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r0 = 2131887652(0x7f120624, float:1.9409917E38)
            X.C36351kA.A14(r8, r1, r0)
            X.C36421kH.A1N(r1)
            r0 = 2131888229(0x7f120865, float:1.9411087E38)
            X.C36351kA.A14(r8, r1, r0)
            java.lang.String r0 = "\n\n"
            r1.append(r0)
            r0 = 2131888230(0x7f120866, float:1.941109E38)
            X.C36351kA.A14(r8, r1, r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0134
        L_0x0160:
            r0 = 2
            if (r9 != r0) goto L_0x017b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ChangeNumber/register/phone/sms permission "
            r1.append(r0)
            if (r10 != r2) goto L_0x0178
            java.lang.String r0 = "granted"
        L_0x0170:
            X.C36321k7.A1a(r1, r0)
            r0 = 0
            A0h(r8, r0)
        L_0x0177:
            return
        L_0x0178:
            java.lang.String r0 = "denied"
            goto L_0x0170
        L_0x017b:
            super.onActivityResult(r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.phonenumberentry.ChangeNumber.onActivityResult(int, int, android.content.Intent):void");
    }

    public Dialog onCreateDialog(int i) {
        if (i == 1) {
            String string = getString(R.string.f12nameremoved);
            ProgressDialog progressDialog = new ProgressDialog(this);
            C36331k8.A0p(progressDialog, string);
            return progressDialog;
        } else if (i != 2) {
            return super.onCreateDialog(i);
        } else {
            C39001qm A002 = AnonymousClass3LW.A00(this);
            A002.A0c(R.string.f12nameremoved);
            C39001qm.A0F(A002, this, 6, R.string.f12nameremoved);
            return A002.create();
        }
    }

    public static void A0Q(ChangeNumber changeNumber) {
        ChangeNumber changeNumber2 = changeNumber;
        if (changeNumber2.isFinishing()) {
            Log.i("ChangeNumber/verify/cancel");
            return;
        }
        changeNumber2.A0P.A0B.A0D(0L);
        changeNumber2.A09.A1U((String) null);
        changeNumber2.A0B.A0O();
        Log.i("BusinessDirectoryStorageManager/onNumberChanged");
        C177848eT r1 = ((AnonymousClass3DH) changeNumber2.A0I.get()).A01;
        Log.i("BusinessDirectorySharedPrefManager/deleteLocation");
        C36341k9.A0u(r1.A00().edit(), "current_search_location");
        C19770wU r0 = changeNumber2.A04;
        long A072 = AnonymousClass24S.A07(changeNumber2);
        C19970wo r2 = changeNumber2.A07;
        String A0G2 = AnonymousClass24S.A0G(changeNumber2);
        C18740tg.A06(A0G2);
        String A0H2 = AnonymousClass24S.A0H(changeNumber2);
        C18740tg.A06(A0H2);
        C19630wG r3 = changeNumber2.A08;
        AnonymousClass6OK r7 = changeNumber2.A0E;
        C21510zM r6 = changeNumber2.A0C;
        C36331k8.A1F(new C50212kO(r2, r3, changeNumber2.A09, changeNumber2.A0B, r6, r7, changeNumber2.A0G, changeNumber2.A0I, changeNumber2.A0L, changeNumber2, A0G2, A0H2, (String) null, (JSONObject) null, A072), r0);
    }

    public static void A0h(ChangeNumber changeNumber, boolean z) {
        boolean booleanValue;
        boolean z2;
        Intent A0I2;
        ChangeNumber changeNumber2 = changeNumber;
        boolean z3 = z;
        if (changeNumber2.A0B.A0E(3902)) {
            C36331k8.A0w(C36421kH.A0A(changeNumber2), "registration_use_sms_retriever", z3);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ChangeNumber/startVerifyCode/useSmsRetriever=");
        A0u.append(z3);
        A0u.append("/shouldStartAccountDefenceFlow=");
        Boolean bool = (Boolean) changeNumber2.A0P.A0D.A04();
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        C36331k8.A1S(A0u, booleanValue);
        if (AnonymousClass24S.A0F(changeNumber2) != null) {
            if (changeNumber2.A0B.A0E(4031)) {
                C29501Ww.A02(changeNumber2.A0J, 12, true);
            }
            int A032 = C36361kB.A03(changeNumber2.A0P.A07);
            long j = changeNumber2.A03;
            long j2 = changeNumber2.A04;
            long j3 = changeNumber2.A05;
            z2 = true;
            long j4 = j3;
            long j5 = j2;
            A0I2 = AnonymousClass190.A19(changeNumber2, (String) AnonymousClass24S.A0F(changeNumber2), A032, AnonymousClass24S.A01(changeNumber2), 0, j, j5, j4, -1, z3, false, true, false, AnonymousClass000.A1S(C36361kB.A03(changeNumber2.A0P.A00), 3));
        } else if (C65983Uf.A0R(C36361kB.A03(changeNumber2.A0P.A06))) {
            C29501Ww.A02(changeNumber2.A0J, 17, true);
            int A033 = C36361kB.A03(changeNumber2.A0P.A07);
            long j6 = changeNumber2.A03;
            long j7 = changeNumber2.A04;
            long j8 = changeNumber2.A05;
            long j9 = changeNumber2.A02;
            z2 = true;
            long j10 = j8;
            long j11 = j9;
            long j12 = j7;
            A0I2 = AnonymousClass190.A19(changeNumber2, (String) AnonymousClass24S.A0F(changeNumber2), A033, AnonymousClass24S.A01(changeNumber2), 0, j6, j12, j10, j11, z3, false, true, false, AnonymousClass000.A1S(C36361kB.A03(changeNumber2.A0P.A00), 3));
        } else {
            Boolean bool2 = (Boolean) changeNumber2.A0P.A0D.A04();
            if (bool2 == null || !bool2.booleanValue()) {
                z2 = true;
                if (AnonymousClass24S.A01(changeNumber2) == 4) {
                    A0I2 = AnonymousClass190.A0J(changeNumber2, 0, changeNumber2.A03, changeNumber2.A04, changeNumber2.A05, -1, true);
                } else {
                    Log.i("ChangeNumber/startVerifyCode/fallback");
                    A0I2 = AnonymousClass190.A0I(changeNumber2, AnonymousClass24S.A01(changeNumber2), 0, changeNumber2.A03, changeNumber2.A04, changeNumber2.A05, true, z3);
                }
            } else {
                z2 = true;
                if (C36361kB.A03(changeNumber2.A0P.A00) == 1) {
                    C29501Ww.A02(changeNumber2.A0J, 14, true);
                    A0I2 = AnonymousClass190.A0N(changeNumber2, changeNumber2.A03, changeNumber2.A04, true, z3);
                } else {
                    int A034 = C36361kB.A03(changeNumber2.A0P.A00);
                    C29501Ww r2 = changeNumber2.A0J;
                    if (A034 == 3) {
                        C29501Ww.A02(r2, 16, true);
                        A0I2 = AnonymousClass190.A1Q(changeNumber2, true);
                    } else {
                        C29501Ww.A02(r2, 13, true);
                        A0I2 = AnonymousClass190.A0I(changeNumber2, 0, 1, changeNumber2.A03, changeNumber2.A04, 0, true, z3);
                    }
                }
            }
        }
        changeNumber2.A33(A0I2, z2);
    }

    public static boolean A0i(ChangeNumber changeNumber, AnonymousClass3AK r7, String str, String str2) {
        EditText editText;
        int i;
        switch (AnonymousClass3U2.A00(changeNumber.A02, str, str2)) {
            case 1:
                int parseInt = Integer.parseInt(str);
                String replaceAll = str2.replaceAll("\\D", "");
                try {
                    replaceAll = changeNumber.A02.A03(parseInt, replaceAll);
                } catch (IOException e) {
                    Log.e("ChangeNumber/cc failed trimLeadingZero from CountryPhoneInfo", e);
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("ChangeNumber/cc=");
                A0u.append(str);
                C36321k7.A1Q("/number=", replaceAll, A0u);
                AnonymousClass24S.A0O(changeNumber, str, replaceAll);
                return true;
            case 2:
                Object[] A0M2 = AnonymousClass001.A0M();
                AnonymousClass000.A1L(A0M2, 1, 0);
                AnonymousClass000.A1L(A0M2, 3, 1);
                changeNumber.BO6(changeNumber.getString(R.string.f12nameremoved, A0M2));
                editText = r7.A02;
                break;
            case 3:
                changeNumber.BO5(R.string.f12nameremoved);
                r7.A02.setText("");
                editText = r7.A02;
                break;
            case 4:
                changeNumber.BO5(R.string.f12nameremoved);
                editText = r7.A03;
                break;
            case 5:
                i = R.string.f12nameremoved;
                break;
            case 6:
                i = R.string.f12nameremoved;
                break;
            default:
                i = R.string.f12nameremoved;
                break;
        }
        changeNumber.BO6(C36391kE.A0v(changeNumber, changeNumber.A0R.A03(changeNumber.A00, r7.A06), new Object[1], 0, i));
        editText = r7.A03;
        editText.requestFocus();
        return false;
    }

    public void A2F() {
        if (!this.A0K) {
            this.A0K = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A05 = C36351kA.A0P(r2);
            AnonymousClass24S.A0L(r2, r1, this, r2.A91.get());
            AnonymousClass24S.A0K(A0L2, r2, r1, this, r2.A9t.get());
            this.A0D = C36421kH.A0Q(r2);
            this.A0C = C36401kF.A0c(r2);
            this.A0A = C36371kC.A0Z(r2);
            this.A0F = (C29341Wg) r2.A8q.get();
            this.A08 = C36371kC.A0U(r2);
            this.A09 = C36391kE.A0d(r2);
            this.A0B = C36411kG.A0l(r2);
            this.A0G = (AnonymousClass3KB) r1.AAz.get();
            this.A0E = (C30231Zs) r2.AUm.get();
            this.A0I = C18840tu.A00(r1.A0d);
        }
    }

    public void BmG() {
        Log.i("ChangeNumber/proceedWithoutSmsRetriever/requesting RECEIVE_SMS permission");
        C65983Uf.A0N(this, 2);
    }

    public void onDestroy() {
        C30231Zs r2 = this.A0E;
        AnonymousClass4TQ r1 = this.A0N;
        AnonymousClass00C.A0D(r1, 0);
        r2.A00.remove(r1);
        super.onDestroy();
    }

    public ChangeNumber(int i) {
        this.A0K = false;
        C89364Wg.A00(this, 10);
    }

    public void A3l(String str, String str2, String str3) {
        super.A3l(str, str2, str3);
        if (this.A0H.A00) {
            C65983Uf.A0K(this, this.A09, this.A0J, false);
        }
        this.A0J.A0E();
        finish();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C89924Yk.A00(this.A07.getViewTreeObserver(), this, 8);
    }

    public void onCreate(Bundle bundle) {
        String simCountryIso;
        super.onCreate(bundle);
        this.A0C.A02();
        this.A09.A0u();
        AnonymousClass1RC.A09(getWindow(), false);
        C36391kE.A14(this);
        setTitle(R.string.f12nameremoved);
        AnonymousClass07B A0O2 = C36381kD.A0O(this);
        A0O2.A0U(true);
        A0O2.A0V(true);
        setContentView((int) R.layout.f9nameremoved);
        PhoneNumberEntry phoneNumberEntry = (PhoneNumberEntry) findViewById(R.id.registration_fields);
        PhoneNumberEntry phoneNumberEntry2 = (PhoneNumberEntry) findViewById(R.id.registration_new_fields);
        AnonymousClass3AK r0 = new AnonymousClass3AK();
        this.A0H = r0;
        r0.A05 = phoneNumberEntry;
        AnonymousClass3AK r02 = new AnonymousClass3AK();
        this.A0O = r02;
        r02.A05 = phoneNumberEntry2;
        this.A07 = (ScrollView) findViewById(R.id.scroll_view);
        this.A06 = findViewById(R.id.bottom_button_container);
        AnonymousClass3AK r03 = this.A0H;
        WaEditText waEditText = phoneNumberEntry.A01;
        r03.A02 = waEditText;
        C36331k8.A0q(this, waEditText, R.string.f12nameremoved);
        AnonymousClass3AK r04 = this.A0O;
        WaEditText waEditText2 = phoneNumberEntry2.A01;
        r04.A02 = waEditText2;
        C36331k8.A0q(this, waEditText2, R.string.f12nameremoved);
        this.A0H.A03 = phoneNumberEntry.A02;
        AnonymousClass3AK r1 = this.A0O;
        WaEditText waEditText3 = phoneNumberEntry2.A02;
        r1.A03 = waEditText3;
        waEditText3.setTextDirection(3);
        this.A0H.A03.setTextDirection(3);
        this.A00 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        TelephonyManager A0K2 = this.A08.A0K();
        Charset charset = AnonymousClass1M4.A06;
        if (!(A0K2 == null || (simCountryIso = A0K2.getSimCountryIso()) == null)) {
            try {
                A0P = this.A02.A05(simCountryIso);
            } catch (IOException e) {
                Log.e("ChangeNumber/iso/code failed to get code from CountryPhoneInfo", e);
            }
        }
        phoneNumberEntry.A03 = new AnonymousClass4W2(this, 1);
        phoneNumberEntry2.A03 = new AnonymousClass4W2(this, 2);
        AnonymousClass24S.A0M(this);
        TextView A0Q2 = C36391kE.A0Q(this, R.id.next_btn);
        A0Q2.setText(R.string.f12nameremoved);
        A0Q2.setOnClickListener(this.A0O);
        String str = A0P;
        if (str != null) {
            this.A0H.A02.setText(str);
            this.A0O.A02.setText(A0P);
        }
        String str2 = this.A0H.A06;
        if (str2 != null && str2.length() > 0) {
            C36321k7.A1Q("ChangeNumber/country: ", str2, AnonymousClass000.A0u());
            this.A0H.A05.A03(str2);
            this.A0O.A05.A03(str2);
        }
        ExistViewModel existViewModel = this.A0P;
        existViewModel.A02.A0D(C36371kC.A0t(C36331k8.A06(this), "change_number_new_number_banned"));
        C30231Zs r2 = this.A0E;
        AnonymousClass4TQ r12 = this.A0N;
        AnonymousClass00C.A0D(r12, 0);
        r2.A00.add(r12);
        this.A00 = C36361kB.A02(this, R.dimen.f7nameremoved);
        C89634Xh.A00(this.A07.getViewTreeObserver(), this, 7);
        C89924Yk.A00(this.A07.getViewTreeObserver(), this, 8);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onPause() {
        SharedPreferences.Editor remove;
        super.onPause();
        AnonymousClass24S.A0M(this);
        this.A0P.A02.A04();
        Object A042 = this.A0P.A02.A04();
        C19420v0 r0 = this.A09;
        if (A042 != null) {
            String A0G2 = AnonymousClass24S.A0G(this);
            String A0H2 = AnonymousClass24S.A0H(this);
            SharedPreferences.Editor A002 = C19420v0.A00(r0);
            StringBuilder A0u = AnonymousClass000.A0u();
            AnonymousClass000.A1D("+", A0G2, A0H2, A0u);
            remove = A002.putString("change_number_new_number_banned", A0u.toString());
        } else if (C36371kC.A0t(C36341k9.A0E(r0), "change_number_new_number_banned") != null) {
            remove = C36421kH.A0A(this).remove("change_number_new_number_banned");
        } else {
            return;
        }
        remove.apply();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        A0P = bundle.getString("oldCountryCode");
        A0Q = bundle.getString("oldPhoneNumber");
        this.A0J = bundle.getStringArrayList("notifyJids");
        this.A01 = bundle.getInt("mode");
    }

    public void onResume() {
        super.onResume();
        String str = A0P;
        if (str != null) {
            this.A0H.A02.setText(str);
        }
        AnonymousClass3AK r0 = this.A0H;
        AnonymousClass3MT.A01(r0.A02, r0.A00);
        AnonymousClass3AK r02 = this.A0H;
        AnonymousClass3MT.A01(r02.A03, r02.A01);
        AnonymousClass3AK r03 = this.A0O;
        AnonymousClass3MT.A01(r03.A02, r03.A00);
        AnonymousClass3AK r04 = this.A0O;
        AnonymousClass3MT.A01(r04.A03, r04.A01);
        this.A0H.A03.clearFocus();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("oldCountryCode", A0P);
        bundle.putCharSequence("oldPhoneNumber", A0Q);
        bundle.putStringArrayList("notifyJids", this.A0J);
        bundle.putInt("mode", this.A01);
    }

    public ChangeNumber() {
        this(0);
        this.A03 = 0;
        this.A04 = 0;
        this.A05 = 0;
        this.A02 = 0;
        this.A0M = C81143wX.A00(this, 47);
        this.A0N = new AnonymousClass34N(this, 2);
        this.A0L = new AnonymousClass4VT(Looper.getMainLooper(), this, 7);
        this.A0O = new C48762i0(this, 18);
    }
}
