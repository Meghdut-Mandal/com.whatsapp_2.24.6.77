package com.whatsapp.registration.phonenumberentry;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass0FM;
import X.AnonymousClass13E;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass1A6;
import X.AnonymousClass1A7;
import X.AnonymousClass1M4;
import X.AnonymousClass1N3;
import X.AnonymousClass1N4;
import X.AnonymousClass1Pd;
import X.AnonymousClass1QD;
import X.AnonymousClass1QE;
import X.AnonymousClass1X8;
import X.AnonymousClass1Z0;
import X.AnonymousClass24S;
import X.AnonymousClass2d8;
import X.AnonymousClass3AK;
import X.AnonymousClass3C2;
import X.AnonymousClass3D0;
import X.AnonymousClass3KB;
import X.AnonymousClass3KW;
import X.AnonymousClass3LN;
import X.AnonymousClass3LW;
import X.AnonymousClass3MI;
import X.AnonymousClass3MT;
import X.AnonymousClass3OU;
import X.AnonymousClass3RF;
import X.AnonymousClass3SI;
import X.AnonymousClass3SJ;
import X.AnonymousClass3SK;
import X.AnonymousClass3TX;
import X.AnonymousClass3U2;
import X.AnonymousClass3US;
import X.AnonymousClass3UV;
import X.AnonymousClass3XJ;
import X.AnonymousClass4OX;
import X.AnonymousClass4W2;
import X.AnonymousClass4XP;
import X.AnonymousClass6OK;
import X.AnonymousClass6RR;
import X.AnonymousClass97V;
import X.AnonymousClass9XW;
import X.C03570Gk;
import X.C18740tg;
import X.C18750th;
import X.C18800tq;
import X.C18830tt;
import X.C19420v0;
import X.C19460v5;
import X.C19550w8;
import X.C19630wG;
import X.C19770wU;
import X.C19890wg;
import X.C19970wo;
import X.C199929gH;
import X.C200079gZ;
import X.C203559oI;
import X.C20720y3;
import X.C21060yb;
import X.C21510zM;
import X.C21520zN;
import X.C220412q;
import X.C23045B1q;
import X.C25271Fq;
import X.C28361Si;
import X.C29501Ww;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C37031lh;
import X.C39001qm;
import X.C48762i0;
import X.C50112kE;
import X.C50212kO;
import X.C51972og;
import X.C52012ok;
import X.C55212uG;
import X.C55252uK;
import X.C57972z7;
import X.C62033Em;
import X.C62623Gw;
import X.C63293Jm;
import X.C63543Kl;
import X.C64833Pp;
import X.C65983Uf;
import X.C77353qM;
import X.C77373qO;
import X.C77383qP;
import X.C81153wY;
import X.C82123yB;
import X.C87074Nj;
import X.C89234Vt;
import X.C89274Vx;
import X.C89914Yj;
import X.C90104Zc;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.components.PhoneNumberEntry;
import com.whatsapp.registration.SelectPhoneNumberDialog;
import com.whatsapp.registration.flashcall.FlashCallConsentBottomSheetFragment;
import com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

public class RegisterPhone extends AnonymousClass2d8 implements C23045B1q, C87074Nj, AnonymousClass4OX {
    public static boolean A0s;
    public static boolean A0t;
    public int A00 = 30;
    public int A01;
    public long A02 = 0;
    public long A03 = 0;
    public long A04 = 0;
    public long A05 = 0;
    public long A06 = 0;
    public Dialog A07;
    public Button A08;
    public ScrollView A09;
    public TextView A0A;
    public C19460v5 A0B;
    public C19460v5 A0C;
    public AnonymousClass3C2 A0D;
    public C57972z7 A0E;
    public TextEmojiLabel A0F;
    public AnonymousClass1Pd A0G;
    public AnonymousClass1A6 A0H;
    public C25271Fq A0I;
    public AnonymousClass13E A0J;
    public C200079gZ A0K;
    public AnonymousClass9XW A0L;
    public C20720y3 A0M;
    public C28361Si A0N;
    public C19890wg A0O;
    public AnonymousClass3KB A0P;
    public C62623Gw A0Q;
    public AnonymousClass1X8 A0R;
    public AnonymousClass1QE A0S;
    public AnonymousClass1QD A0T;
    public C63293Jm A0U;
    public C50212kO A0V;
    public AnonymousClass3KW A0W;
    public AnonymousClass005 A0X;
    public AnonymousClass005 A0Y;
    public AnonymousClass005 A0Z;
    public AnonymousClass005 A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public boolean A0e;
    public boolean A0f = false;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public C77353qM A0k;
    public C77383qP A0l;
    public boolean A0m;
    public boolean A0n = false;
    public boolean A0o = false;
    public boolean A0p = false;
    public final C64833Pp A0q = new C64833Pp(false, false);
    public final C62033Em A0r = new C62033Em();

    public static C77353qM A0i(RegisterPhone registerPhone) {
        RegisterPhone registerPhone2 = registerPhone;
        C77353qM r0 = registerPhone.A0k;
        if (r0 != null) {
            return r0;
        }
        C77353qM A002 = registerPhone.A0D.A00(registerPhone2, 3, C36361kB.A03(registerPhone.A0P.A07), registerPhone.A04, registerPhone.A05, registerPhone.A0B.A0E(3902));
        registerPhone2.A0k = A002;
        return A002;
    }

    private void A0k() {
        boolean booleanValue;
        C29501Ww r1;
        Intent A19;
        A3k(0);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RegisterPhone/startVerificationScreen/useSmsRetriever=");
        A0u.append(this.A0p);
        A0u.append("/shouldStartBanAppealFlowForBlockedUser=");
        C36331k8.A1S(A0u, this.A0i);
        if (AnonymousClass24S.A0F(this) != null) {
            C29501Ww.A02(this.A0J, 12, true);
            int A032 = C36361kB.A03(this.A0P.A07);
            long j = this.A04;
            long j2 = this.A05;
            long j3 = this.A06;
            boolean z = this.A0p;
            A19 = AnonymousClass190.A19(this, (String) AnonymousClass24S.A0F(this), A032, AnonymousClass24S.A01(this), C36361kB.A03(this.A0P.A0E), j, j2, j3, -1, z, false, false, false, AnonymousClass000.A1S(C36361kB.A03(this.A0P.A00), 3));
        } else if (C65983Uf.A0R(C36361kB.A03(this.A0P.A06))) {
            C29501Ww.A02(this.A0J, 17, true);
            int A033 = C36361kB.A03(this.A0P.A07);
            long j4 = this.A04;
            long j5 = this.A05;
            long j6 = this.A06;
            long j7 = this.A02;
            boolean z2 = this.A0p;
            Boolean bool = C18750th.A03;
            A19 = AnonymousClass190.A19(this, (String) null, A033, AnonymousClass24S.A01(this), C36361kB.A03(this.A0P.A0E), j4, j5, j6, j7, z2, true, false, false, false);
        } else if (this.A0i) {
            C29501Ww.A02(this.A0J, 9, true);
            A19 = AnonymousClass190.A0I(this, 0, 3, this.A04, this.A05, 0, false, this.A0p);
        } else {
            Boolean bool2 = (Boolean) this.A0P.A0D.A04();
            if (bool2 == null) {
                booleanValue = false;
            } else {
                booleanValue = bool2.booleanValue();
            }
            ExistViewModel existViewModel = this.A0P;
            if (!booleanValue) {
                int i = 4;
                if (C36361kB.A03(existViewModel.A0G) == 4) {
                    C29501Ww.A02(this.A0J, 4, true);
                    A19 = AnonymousClass190.A0J(this, C36361kB.A03(this.A0P.A07), this.A04, this.A05, this.A06, -1, false);
                } else {
                    int A012 = AnonymousClass24S.A01(this);
                    if (A012 == 1 || A012 == 3) {
                        r1 = this.A0J;
                        i = 15;
                    } else {
                        int A034 = C36361kB.A03(this.A0P.A0E);
                        r1 = this.A0J;
                        if (A034 == 1) {
                            i = 23;
                        }
                    }
                    C29501Ww.A02(r1, i, true);
                    int A035 = C36361kB.A03(this.A0P.A07);
                    long j8 = this.A04;
                    long j9 = this.A05;
                    long j10 = this.A06;
                    boolean z3 = this.A0p;
                    AnonymousClass3OU r12 = AnonymousClass3OU.A00;
                    A19 = AnonymousClass190.A19(this, (String) null, A035, AnonymousClass24S.A01(this), C36361kB.A03(this.A0P.A0E), j8, j9, j10, -1, z3, true, false, false, false);
                }
            } else if (C36361kB.A03(existViewModel.A00) == 1) {
                C29501Ww.A02(this.A0J, 14, true);
                A19 = AnonymousClass190.A0N(this, this.A04, this.A05, false, this.A0p);
            } else {
                int A036 = C36361kB.A03(this.A0P.A00);
                C29501Ww r13 = this.A0J;
                if (A036 == 3) {
                    C29501Ww.A02(r13, 16, true);
                    A19 = AnonymousClass190.A1Q(this, false);
                } else {
                    C29501Ww.A02(r13, 13, true);
                    A19 = AnonymousClass190.A0I(this, 0, 1, this.A04, this.A05, 0, false, this.A0p);
                }
            }
        }
        startActivity(A19);
        finish();
    }

    public void A3n() {
        this.A0e = false;
        this.A00 = 30;
        if (this.A0A.getVisibility() == 0) {
            AlphaAnimation A0L2 = C36371kC.A0L();
            A0L2.setDuration(150);
            this.A0A.startAnimation(A0L2);
            C89234Vt.A00(A0L2, this, 17);
            return;
        }
        this.A0A.setVisibility(8);
    }

    public void A3o() {
        A0s = false;
        String A0h2 = C36331k8.A0h(this.A0O.A02.getText());
        String A0h3 = C36331k8.A0h(this.A0O.A03.getText());
        if (A0h2 == null || A0h3 == null || A0h2.equals("") || C65983Uf.A0B(this.A02, A0h3, A0h2, this.A0b) == null) {
            A3n();
        } else {
            new C37031lh(this).start();
        }
    }

    public void Bus() {
        this.A0p = true;
        A0k();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        if (i == 0) {
            if (i2 == -1) {
                ExistViewModel existViewModel = this.A0P;
                existViewModel.A03.A0D(intent.getStringExtra("cc"));
                String stringExtra = intent.getStringExtra("iso");
                String stringExtra2 = intent.getStringExtra("country_name");
                this.A0O.A02.setText(AnonymousClass24S.A0G(this));
                this.A0O.A04.setText(stringExtra2);
                this.A0O.A05.A03(stringExtra);
                SharedPreferences preferences = getPreferences(0);
                SharedPreferences.Editor edit = preferences.edit();
                edit.putString("com.whatsapp.registration.RegisterPhone.input_country_code", AnonymousClass24S.A0G(this));
                edit.putString("com.whatsapp.registration.RegisterPhone.country_code", AnonymousClass24S.A0G(this));
                if (preferences.getInt("com.whatsapp.registration.RegisterPhone.phone_number_position", -1) == -1) {
                    edit.putInt("com.whatsapp.registration.RegisterPhone.phone_number_position", Integer.MAX_VALUE);
                }
                edit.putInt("com.whatsapp.registration.RegisterPhone.country_code_position", -1);
                if (!edit.commit()) {
                    Log.w("RegisterPhone/actresult/commit failed");
                }
            }
            this.A0h = false;
            return;
        }
        if (i == 1) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("RegisterPhone/sms permission ");
            if (i2 == -1) {
                str = "granted";
            } else {
                str = "denied";
            }
            C36321k7.A1a(A0u, str);
            if (C36361kB.A03(this.A0P.A0F) != 16) {
                A0k();
                return;
            }
        } else if (i == 155) {
            if (i2 == -1) {
                this.A0b = AnonymousClass3SI.A01(this.A08, this.A08, this.A09);
                A0n(this);
                return;
            }
            return;
        } else if (i != 3) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        this.A0k.A04(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        if (r8 == 30) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A0j(com.whatsapp.registration.phonenumberentry.RegisterPhone r5, java.lang.String r6, java.lang.String r7, int r8) {
        /*
            X.0yE r0 = r5.A09
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "7"
            return r0
        L_0x000b:
            X.1N4 r1 = r5.A02
            java.lang.String r0 = r5.A0b
            java.lang.String r0 = X.C65983Uf.A0B(r1, r7, r6, r0)
            r4 = 1
            boolean r3 = X.AnonymousClass000.A1V(r0)
            java.lang.String r1 = r5.A0b
            if (r1 == 0) goto L_0x002a
            boolean r0 = A0t
            if (r0 != 0) goto L_0x002d
            boolean r0 = A0s
            if (r0 != 0) goto L_0x002d
            if (r3 != 0) goto L_0x002d
            boolean r0 = r5.A0j
            if (r0 != 0) goto L_0x002d
        L_0x002a:
            java.lang.String r0 = "6"
            return r0
        L_0x002d:
            java.lang.String r2 = "\\D"
            java.lang.String r0 = ""
            java.lang.String r1 = r1.replaceAll(r2, r0)
            java.lang.String r0 = r7.replaceAll(r2, r0)
            if (r3 != 0) goto L_0x0052
            int r0 = X.C65983Uf.A00(r0, r1)
            if (r0 != 0) goto L_0x0052
        L_0x0041:
            r0 = 30
            if (r8 != r0) goto L_0x005d
            boolean r0 = r5.A0g
            if (r0 == 0) goto L_0x005f
            boolean r0 = r5.A0j
            if (r0 == 0) goto L_0x0054
            if (r4 == 0) goto L_0x007c
            java.lang.String r0 = "0"
            return r0
        L_0x0052:
            r4 = 0
            goto L_0x0041
        L_0x0054:
            if (r4 == 0) goto L_0x007c
            boolean r0 = A0t
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = "3"
            return r0
        L_0x005d:
            if (r8 != r0) goto L_0x0064
        L_0x005f:
            if (r3 == 0) goto L_0x0064
            java.lang.String r0 = "4"
            return r0
        L_0x0064:
            r0 = 31
            java.lang.String r2 = "2"
            java.lang.String r1 = "1"
            if (r8 != r0) goto L_0x0071
            boolean r0 = r5.A0j
            if (r0 != 0) goto L_0x007b
        L_0x0070:
            return r2
        L_0x0071:
            r0 = 32
            if (r8 != r0) goto L_0x007c
            if (r4 != 0) goto L_0x007c
            boolean r0 = r5.A0j
            if (r0 == 0) goto L_0x0070
        L_0x007b:
            return r1
        L_0x007c:
            java.lang.String r0 = "5"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.phonenumberentry.RegisterPhone.A0j(com.whatsapp.registration.phonenumberentry.RegisterPhone, java.lang.String, java.lang.String, int):java.lang.String");
    }

    public static void A0l(RegisterPhone registerPhone) {
        Log.i("RegisterPhone/reset-state");
        registerPhone.A0i = false;
        registerPhone.A3k(7);
        C65983Uf.A0Q(registerPhone.A09, "");
        registerPhone.A0P.A0B.A0D(0L);
        registerPhone.A09.A1U((String) null);
        registerPhone.A0J.A0D((String) null, (String) null, (String) null);
        C29501Ww.A02(registerPhone.A0J, 0, true);
    }

    public static void A0m(RegisterPhone registerPhone) {
        Log.i("RegisterPhone/retryExistCall");
        RegisterPhone registerPhone2 = registerPhone;
        long A052 = (((long) (registerPhone2.A0B.A05(3186) * 1000.0f)) + registerPhone2.A03) - C36431kI.A08(registerPhone2);
        long A072 = AnonymousClass24S.A07(registerPhone2);
        C19970wo r6 = registerPhone2.A07;
        String A0G2 = AnonymousClass24S.A0G(registerPhone2);
        C18740tg.A06(A0G2);
        String A0H2 = AnonymousClass24S.A0H(registerPhone2);
        C18740tg.A06(A0H2);
        C19630wG r7 = registerPhone2.A08;
        String A0j2 = A0j(registerPhone2, AnonymousClass24S.A0G(registerPhone2), AnonymousClass24S.A0H(registerPhone2), registerPhone2.A00);
        JSONObject A002 = registerPhone2.A0r.A00();
        AnonymousClass6OK r11 = registerPhone2.A0E;
        C21510zM r10 = registerPhone2.A0C;
        registerPhone2.A0V = new C50212kO(r6, r7, registerPhone2.A09, registerPhone2.A0B, r10, r11, registerPhone2.A0P, registerPhone2.A0I, registerPhone2.A0L, new C77373qO(registerPhone2), A0G2, A0H2, A0j2, A002, A072);
        C36321k7.A1V("RegisterPhone/retryExistCall/check device switching eligibility again, delay: ", AnonymousClass000.A0u(), A052);
        int i = (A052 > 0 ? 1 : (A052 == 0 ? 0 : -1));
        C19770wU r5 = registerPhone2.A04;
        if (i > 0) {
            r5.BpM(new C81153wY((Object) registerPhone2, 6), "RegisterPhone/retry-exist", A052);
        } else {
            C36371kC.A1P(registerPhone2.A0V, r5);
        }
        registerPhone2.Bu0();
    }

    public static void A0n(RegisterPhone registerPhone) {
        AnonymousClass17Y r1;
        int i;
        Log.i("RegisterPhone/whats-my-number/permission-granted");
        C62033Em r8 = registerPhone.A0r;
        r8.A01 = C36361kB.A0i();
        TelephonyManager A0K2 = registerPhone.A08.A0K();
        boolean z = false;
        if (A0K2 != null && A0K2.getSimState() == 1) {
            z = true;
        }
        if (z) {
            Log.i("RegisterPhone/whats-my-number/no-sim");
            r8.A04 = -1;
            r1 = registerPhone.A05;
            i = R.string.f12nameremoved;
        } else {
            ArrayList<AnonymousClass3XJ> A032 = AnonymousClass3SI.A03((C203559oI) registerPhone.A0Y.get(), registerPhone.A08, registerPhone.A09);
            int size = A032.size();
            AnonymousClass1N4 r5 = registerPhone.A02;
            ArrayList A0I2 = AnonymousClass001.A0I();
            for (AnonymousClass3XJ r2 : A032) {
                if (AnonymousClass3U2.A00(r5, r2.A00, r2.A02) == 1) {
                    A0I2.add(r2);
                }
            }
            int size2 = A0I2.size();
            r8.A03 = Integer.valueOf(C36381kD.A1U(size, size2) ? 1 : 0);
            r8.A04 = Integer.valueOf(size2);
            if (size2 == 0) {
                Log.i("RegisterPhone/whats-my-number/unable-to-get-phone-number-from-sim");
                r1 = registerPhone.A05;
                i = R.string.f12nameremoved;
            } else {
                Log.i("RegisterPhone/whats-my-number/show-select-phone-number-dialog");
                registerPhone.A0C.A01(registerPhone.A0O.A03);
                SelectPhoneNumberDialog selectPhoneNumberDialog = new SelectPhoneNumberDialog();
                Bundle A072 = AnonymousClass001.A07();
                A072.putParcelableArrayList("deviceSimInfoList", C36441kJ.A15(A0I2));
                C36381kD.A17(A072, selectPhoneNumberDialog, registerPhone);
                return;
            }
        }
        r1.A06(i, 1);
    }

    public static void A0o(RegisterPhone registerPhone, boolean z) {
        String str;
        String str2;
        Log.i("RegisterPhone/continueToNextScreen");
        RegisterPhone registerPhone2 = registerPhone;
        AnonymousClass3SJ.A00(registerPhone, 21);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RegisterPhone/continueToNextScreen/autoconf serverStartMessage is ");
        if (AnonymousClass24S.A0F(registerPhone) != null) {
            str = "valid";
        } else {
            str = "null";
        }
        A0u.append(str);
        A0u.append(", waOldEligible: ");
        A0u.append(AnonymousClass24S.A01(registerPhone));
        A0u.append(", emailOtpEligible: ");
        A0u.append(C36361kB.A03(registerPhone.A0P.A06));
        A0u.append(", shouldStartBanAppealFlowForBlockedUser: ");
        A0u.append(registerPhone.A0i);
        A0u.append(", passkeyEligibility: ");
        A0u.append(registerPhone.A0U.A01());
        A0u.append(", flashType :");
        C36321k7.A1Y(A0u, C36361kB.A03(registerPhone.A0P.A07));
        if (AnonymousClass24S.A0F(registerPhone) != null) {
            str2 = "RegisterPhone/continueToNextScreen/autoconf";
        } else if (!z && !registerPhone.A0B.A0E(7556) && A0q(registerPhone)) {
            Log.i("RegisterPhone/continueToNextScreen/passkey");
            A0p(registerPhone, false);
            return;
        } else if (C36361kB.A03(registerPhone.A0P.A06) == 1) {
            str2 = "RegisterPhone/continueToNextScreen/email_otp";
        } else {
            if (registerPhone.A0i) {
                Log.i("RegisterPhone/continueToNextScreen/ban_appeal_flow");
                registerPhone.A09.A1l(AnonymousClass24S.A0G(registerPhone), AnonymousClass24S.A0H(registerPhone));
            } else {
                int A012 = AnonymousClass24S.A01(registerPhone);
                if (A012 == 1 || A012 == 3 || AnonymousClass24S.A01(registerPhone) == 4) {
                    str2 = "RegisterPhone/continueToNextScreen/device_switching";
                } else if (C36361kB.A03(registerPhone.A0P.A0E) != 1) {
                    if (C55252uK.A00(registerPhone.A08, registerPhone.A0B, C36361kB.A03(registerPhone.A0P.A07))) {
                        Log.i("RegisterPhone/continueToNextScreen/flash_call");
                        int A032 = C36361kB.A03(registerPhone.A0P.A07);
                        if (!registerPhone.A0B.A0E(6080) || !(A032 == 4 || A032 == 5)) {
                            registerPhone.A3k(0);
                            registerPhone2.A33(AnonymousClass190.A0K(registerPhone2, C36361kB.A03(registerPhone.A0P.A07), registerPhone.A04, registerPhone.A05, false), true);
                            return;
                        }
                        registerPhone.A3k(16);
                        registerPhone.Btm(new FlashCallConsentBottomSheetFragment());
                        registerPhone.getSupportFragmentManager().A0l(new AnonymousClass3RF(registerPhone, 14), registerPhone, "FLASH_CALL_CONSENT_BOTTOM_SHEET_FRAGMENT_RESULT");
                        return;
                    }
                    Log.i("RegisterPhone/continueToNextScreen/sms_or_voice");
                    AnonymousClass97V.A00(registerPhone.A08, registerPhone.A09, registerPhone, registerPhone.A0B.A0E(3902));
                    return;
                }
            }
            registerPhone.A0k();
        }
        Log.i(str2);
        registerPhone.A0k();
    }

    public static void A0p(RegisterPhone registerPhone, boolean z) {
        RegisterPhone registerPhone2 = registerPhone;
        registerPhone2.A3k(17);
        C57972z7 r0 = registerPhone2.A0E;
        WeakReference A0F2 = AnonymousClass001.A0F(registerPhone2);
        boolean z2 = z;
        C82123yB r2 = new C82123yB(registerPhone2, z2);
        C18800tq r02 = r0.A00.A01;
        C19630wG A0W2 = C36351kA.A0W(r02);
        C21060yb A0U2 = C36351kA.A0U(r02);
        C21520zN A0Y2 = C36401kF.A0Y(r02);
        C19420v0 A0Y3 = C36351kA.A0Y(r02);
        AnonymousClass3UV A0t2 = C36431kI.A0t(r02);
        C19770wU A0Z2 = C36341k9.A0Z(r02);
        C18830tt r1 = r02.A00;
        C77383qP r9 = new C77383qP(A0U2, A0W2, A0Y3, A0Y2, A0t2, (C199929gH) r1.A0I.get(), C36431kI.A0u(r1), C18830tt.A8v(r1), A0Z2, A0F2, r2);
        registerPhone2.A0l = r9;
        if (z2) {
            registerPhone2.A0N.A06("enter_number", "passkey_start_login");
            if (!TextUtils.isEmpty((String) registerPhone2.A0P.A08.A04())) {
                Log.i("RegisterPhone/passkeyLoginEvent/passkey_start_login_success");
                registerPhone2.A0N.A06("enter_number", "passkey_start_login_success");
                registerPhone2.A0l.A00((String) registerPhone2.A0P.A08.A04());
                return;
            }
            Log.e("RegisterPhone/passkeyEvent/passkey_start_login_error/invalidCode");
            registerPhone2.A0N.A09("enter_number", "passkey_start_login_error", "invalid_or_empty_code");
            AnonymousClass3SJ.A01(registerPhone2, 21);
            return;
        }
        Log.i("PasskeyVerification/passkeyLoginEvent/passkey_start_login");
        AnonymousClass3TX r3 = r9.A06;
        r3.A06("enter_number", "passkey_start_login");
        C19420v0 r5 = r9.A02;
        if (AnonymousClass6RR.A00(r5.A0f()) || AnonymousClass6RR.A00(r5.A0h())) {
            Log.i("PasskeyVerification/passkeyLoginEvent/passkey_start_login/error=null_or_empty_phone_number");
            r3.A09("enter_number", "passkey_start_login_error", "null_or_empty_phone_number");
            r9.A0A.invoke(C51972og.CODE_REQUEST_FAILURE, (Object) null);
            return;
        }
        C19770wU r03 = r9.A08;
        String A0f2 = r5.A0f();
        AnonymousClass00C.A08(A0f2);
        String A0h2 = r5.A0h();
        AnonymousClass00C.A08(A0h2);
        int A0B2 = r5.A0B();
        AnonymousClass005 r4 = r5.A00;
        int i = C36391kE.A0H(r4).getInt("pref_flash_call_manage_call_permission_granted", -1);
        int i2 = C36391kE.A0H(r4).getInt("pref_flash_call_call_log_permission_granted", -1);
        C36441kJ.A1E(new C50112kE(r9.A00, r9.A01, r5, r9.A04, r9.A05, C65983Uf.A08(r5, r9.A03), r9, A0f2, A0h2, "passkey", (String) null, (String) null, (String) null, A0B2, i, i2, true, false), r03);
    }

    public static boolean A0q(RegisterPhone registerPhone) {
        registerPhone.A0N.A06("enter_number", "passkey_eligibility_check");
        C52012ok A012 = registerPhone.A0U.A01();
        C36321k7.A1K(A012, "RegisterPhone/isPasskeyEnabled/eligibility=", AnonymousClass000.A0u());
        if (A012 == C52012ok.ENABLED) {
            return true;
        }
        registerPhone.A0N.A09("enter_number", "passkey_eligibility_check_failed", A012.toString());
        return false;
    }

    public SharedPreferences getPreferences(int i) {
        return this.A0O.A00(getLocalClassName());
    }

    public void onBackPressed() {
        if (this.A0n) {
            Log.i("RegisterPhone/onBackPressed/is adding new account");
            C65983Uf.A0F(this, this.A06, this.A09, this.A0A);
            return;
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        Boolean bool = C18750th.A03;
        this.A04.Boy(new C81153wY((Object) this, 8));
        setContentView((int) R.layout.f9nameremoved);
        A3p();
        AnonymousClass3MI.A00(getApplicationContext(), this.A09, this.A04);
        this.A0b = AnonymousClass3SI.A01(this.A08, this.A08, this.A09);
        if (bundle != null) {
            this.A0i = bundle2.getBoolean("shouldStartBanAppealForBlockedUser");
        }
        if (C36441kJ.A08(this) != 1) {
            Log.e("RegisterPhone/create/wrong-state bounce to main");
            C36351kA.A12(this);
            return;
        }
        boolean A0F2 = this.A06.A0F(this.A01.A02());
        this.A0n = A0F2;
        int i = 0;
        C65983Uf.A0M(this.A00, this, this.A00, R.id.title_toolbar, false, false, A0F2);
        TextView A0Q2 = C36391kE.A0Q(this, R.id.register_phone_toolbar_title);
        A0Q2.setText(R.string.f12nameremoved);
        if (this.A0E.A02(5920)) {
            C36331k8.A0r(this, A0Q2, R.color.f6nameremoved);
        }
        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            if (intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.show_underage_account_ban_dialog", false)) {
                AnonymousClass3SJ.A01(this, 125);
            }
            if (intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.resetstate", false)) {
                A0l(this);
            }
            this.A0m = intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", false);
            if (!(intent.getStringExtra("com.whatsapp.registration.RegisterPhone.country_code") == null || intent.getStringExtra("com.whatsapp.registration.RegisterPhone.phone_number") == null)) {
                C36341k9.A0x(getPreferences(0).edit().putString("com.whatsapp.registration.RegisterPhone.input_phone_number", intent.getStringExtra("com.whatsapp.registration.RegisterPhone.phone_number")), "com.whatsapp.registration.RegisterPhone.input_country_code", intent.getStringExtra("com.whatsapp.registration.RegisterPhone.country_code"));
            }
            if (intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.tapped_sms_link", false)) {
                Log.i("RegisterPhone/link/instructions/dialog");
                BO6(C36341k9.A0e(this, new Object[1], R.string.f12nameremoved, 0, R.string.f12nameremoved));
            }
        } else {
            this.A0m = false;
        }
        AnonymousClass3AK r1 = new AnonymousClass3AK();
        this.A0O = r1;
        r1.A05 = (PhoneNumberEntry) findViewById(R.id.registration_fields);
        AnonymousClass3AK r2 = this.A0O;
        PhoneNumberEntry phoneNumberEntry = r2.A05;
        phoneNumberEntry.A03 = new AnonymousClass4W2(this, 3);
        r2.A02 = phoneNumberEntry.A01;
        r2.A04 = C36391kE.A0Q(this, R.id.registration_country);
        C36361kB.A0z(this, this.A0O.A04, this.A00, R.drawable.abc_spinner_textfield_background_material);
        AnonymousClass3AK r12 = this.A0O;
        WaEditText waEditText = r12.A05.A02;
        r12.A03 = waEditText;
        waEditText.setTextDirection(3);
        if (C36401kF.A1X(this.A00)) {
            C36421kH.A0y(this.A0O.A05, this.A0O.A05, getResources().getDimensionPixelSize(R.dimen.f7nameremoved), this.A0O.A05.getPaddingTop(), this.A0O.A05.getPaddingRight());
        }
        this.A09 = (ScrollView) findViewById(R.id.scroll_view);
        TextEmojiLabel A0I2 = C36421kH.A0I(this, R.id.registration_info);
        this.A0F = A0I2;
        C36331k8.A1A(this.A0D, A0I2);
        C36331k8.A16(this.A0F, this.A08);
        TextEmojiLabel textEmojiLabel = this.A0F;
        AnonymousClass1N3 r6 = this.A04;
        String string = getString(R.string.f12nameremoved);
        C64833Pp r21 = this.A0q;
        SpannableStringBuilder A0P2 = C36441kJ.A0P(Html.fromHtml(string));
        URLSpan[] uRLSpanArr = (URLSpan[]) A0P2.getSpans(0, string.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                C36351kA.A18(A0P2, uRLSpan, new C89274Vx(this, this, r6.A00, r6.A01, r21, r6, r6.A02, uRLSpan.getURL()));
            }
            for (URLSpan removeSpan : uRLSpanArr) {
                A0P2.removeSpan(removeSpan);
            }
        }
        textEmojiLabel.setText(A0P2);
        this.A0F.setVisibility(8);
        TextView A0Q3 = C36391kE.A0Q(this, R.id.mistyped_undercard_text);
        this.A0A = A0Q3;
        A0Q3.setVisibility(8);
        if (C36371kC.A0t(getPreferences(0), "com.whatsapp.registration.RegisterPhone.input_country_code") == null) {
            TelephonyManager A0K2 = this.A08.A0K();
            if (A0K2 == null) {
                Log.w("RegisterPhone/tm=null");
            } else {
                Charset charset = AnonymousClass1M4.A06;
                String simCountryIso = A0K2.getSimCountryIso();
                if (simCountryIso != null) {
                    try {
                        String A052 = this.A02.A05(simCountryIso);
                        if (A052 != null) {
                            SharedPreferences.Editor edit = getPreferences(0).edit();
                            edit.putString("com.whatsapp.registration.RegisterPhone.input_country_code", A052);
                            edit.apply();
                        }
                    } catch (IOException e) {
                        C36351kA.A1Q(" failed to lookupCallingCode from CountryPhoneInfo", C36331k8.A0k("RegisterPhone/iso: ", simCountryIso), e);
                    }
                }
            }
        }
        C48762i0.A00(this.A0O.A04, this, 19);
        this.A0O.A03.requestFocus();
        this.A0O.A03.setCursorVisible(true);
        if (this.A0P.A03.A04() != null) {
            this.A0O.A02.setText(AnonymousClass24S.A0G(this));
        }
        String A0u = C36371kC.A0u(this.A0O.A04);
        if (A0u.length() > 0) {
            this.A0O.A05.A03(A0u);
        }
        if (C65983Uf.A0S(getResources())) {
            getWindow().setSoftInputMode(3);
        }
        if (this.A03.A03()) {
            Log.w("RegisterPhone/clock-wrong");
            AnonymousClass3SK.A02(this, this.A0M, this.A0N);
        } else if (this.A03.A02()) {
            Log.w("RegisterPhone/sw-expired");
            AnonymousClass3SK.A03(this, this.A0M, this.A0N);
        }
        this.A08 = (Button) C03570Gk.A0B(this, R.id.registration_submit);
        View A0B2 = C03570Gk.A0B(this, R.id.nta_continue);
        View A0B3 = C03570Gk.A0B(this, R.id.text_or);
        ViewGroup.LayoutParams layoutParams = this.A08.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = A0B2.getLayoutParams();
        int i2 = -2;
        if (this.A0E.A02(6245)) {
            i2 = -1;
        }
        layoutParams.width = i2;
        layoutParams2.width = i2;
        C48762i0.A00(this.A08, this, 21);
        if (AnonymousClass3D0.A00(this.A0a).A01 && this.A0E.A02(6840)) {
            A0B3.setVisibility(0);
            A0B2.setVisibility(0);
            C48762i0.A00(A0B2, this, 20);
        }
        C90104Zc.A00(this.A09.getViewTreeObserver(), this, 29);
        Log.i("RegisterPhone/whats-my-number/enabled");
        TextEmojiLabel A0I3 = C36421kH.A0I(this, R.id.description);
        C36321k7.A0m(this, A0I3);
        String string2 = getString(R.string.f12nameremoved);
        if (this.A0E.A02(5920)) {
            i = C36351kA.A01(this, R.attr.f4nameremoved, R.color.f6nameremoved);
        }
        C81153wY r22 = new C81153wY((Object) this, 10);
        HashMap A0J2 = AnonymousClass001.A0J();
        A0J2.put("whats-my-number", r22);
        A0I3.setText(AnonymousClass3LN.A00((TextAppearanceSpan) null, string2, A0J2, i, false));
        A0I3.setLinkTextColor(AnonymousClass00F.A00(this, C36341k9.A05(this)));
        this.A0N.A05("enter_number");
        this.A04.Bp1(new C81153wY((Object) this, 4));
    }

    public Dialog onCreateDialog(int i) {
        C39001qm A002;
        AnonymousClass0FM create;
        if (i != 21) {
            return super.onCreateDialog(i);
        }
        Log.i("RegisterPhone/dialog/num_confirm");
        Boolean bool = (Boolean) this.A0P.A0A.A04();
        if (bool == null || !bool.booleanValue()) {
            if (this.A0B.A0E(3847)) {
                View A0K2 = C36381kD.A0K(LayoutInflater.from(this), R.layout.f9nameremoved);
                C36391kE.A0O(A0K2, R.id.confirm_phone_number_text_view).setText(C65983Uf.A0D(this.A00, AnonymousClass24S.A0G(this), AnonymousClass24S.A0H(this)));
                A002 = AnonymousClass3LW.A00(this);
                A002.A0j(A0K2);
                A002.A0r(false);
                C39001qm.A0F(A002, this, 10, R.string.f12nameremoved);
                A002.A0f(new AnonymousClass4XP(this, 9), R.string.f12nameremoved);
            } else {
                String A0v = C36391kE.A0v(this, C65983Uf.A0D(this.A00, AnonymousClass24S.A0G(this), AnonymousClass24S.A0H(this)), AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
                A002 = AnonymousClass3LW.A00(this);
                A002.A0p(Html.fromHtml(A0v));
                A002.A0r(false);
                C39001qm.A0F(A002, this, 10, R.string.f12nameremoved);
                A002.A0g(new AnonymousClass4XP(this, 9), R.string.f12nameremoved);
            }
            create = A002.create();
        } else {
            boolean booleanValue = Boolean.valueOf(this.A0E.A02(6367)).booleanValue();
            int i2 = R.string.f12nameremoved;
            if (booleanValue) {
                i2 = R.string.f12nameremoved;
            }
            String A0v2 = C36391kE.A0v(this, C65983Uf.A0D(this.A00, AnonymousClass24S.A0G(this), AnonymousClass24S.A0H(this)), AnonymousClass001.A0L(), 0, i2);
            int i3 = R.string.f12nameremoved;
            int i4 = R.string.f12nameremoved;
            if (booleanValue) {
                i3 = R.string.f12nameremoved;
                i4 = R.string.f12nameremoved;
            }
            C39001qm A003 = AnonymousClass3LW.A00(this);
            A003.A0p(Html.fromHtml(A0v2));
            A003.A0r(false);
            C39001qm.A0F(A003, this, 8, i3);
            A003.A0g(new AnonymousClass4XP(this, 9), i4);
            create = A003.create();
        }
        create.setOnDismissListener(new C89914Yj(this, 4));
        this.A07 = create;
        return create;
    }

    public void onDestroy() {
        if (this.A0V != null) {
            Log.i("RegisterPhone/destroy canceling task");
            this.A0V.A0D(true);
            this.A0V = null;
        }
        this.A0Q.A00();
        super.onDestroy();
    }

    public void A2X() {
        super.A2X();
        if (this.A0n) {
            boolean z = AnonymousClass1Z0.A00((AnonymousClass1Z0) this.A0X.get()).A02;
            this.A0o = z;
            C36321k7.A1X("RegisterPhone/onActivityStartAsync/isMultiAccountCompanionModeEnabled:", AnonymousClass000.A0u(), z);
            if (this.A0o) {
                C81153wY.A00(this.A05, this, 9);
            }
        }
    }

    public boolean A2g() {
        return this.A0n;
    }

    public void A3l(String str, String str2, String str3) {
        super.A3l(str, str2, str3);
        A3k(7);
        this.A0N.A08("enter_number", "successful");
        boolean z = this.A0H.A00;
        C29501Ww r2 = this.A0J;
        if (z) {
            C65983Uf.A0K(this, this.A0I, r2, false);
        } else {
            C29501Ww.A02(r2, 2, true);
            startActivity(AnonymousClass190.A0A(this));
        }
        finish();
    }

    public void A3p() {
        boolean booleanExtra = getIntent().getBooleanExtra("should_show_notif", true);
        if (C19550w8.A09() && booleanExtra) {
            C19420v0 r3 = this.A09;
            String[] strArr = {"android.permission.POST_NOTIFICATIONS"};
            AnonymousClass00C.A0D(r3, 1);
            AnonymousClass3US.A08(r3, strArr);
            C03570Gk.A0C(this, strArr, 2);
        }
    }

    public void BmG() {
        int A012 = AnonymousClass24S.A01(this);
        if (A012 == 1 || A012 == 3 || C65983Uf.A0R(C36361kB.A03(this.A0P.A06)) || AnonymousClass24S.A01(this) == 4 || C36361kB.A03(this.A0P.A0E) == 1 || this.A09.A02("android.permission.RECEIVE_SMS") == 0) {
            Log.i("RegisterPhone/proceedWithoutSmsRetriever/NOT requesting RECEIVE_SMS permission");
            this.A0p = false;
            A0k();
            return;
        }
        Log.i("RegisterPhone/proceedWithoutSmsRetriever/requesting RECEIVE_SMS permission");
        C65983Uf.A0N(this, 1);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.tapped_sms_link", false)) {
            Log.i("RegisterPhone/newintent/link/instructions/dialog");
            BO6(C36341k9.A0e(this, AnonymousClass001.A0L(), R.string.f12nameremoved, 0, R.string.f12nameremoved));
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String obj;
        String str;
        String str2;
        Intent intent;
        switch (menuItem.getItemId()) {
            case 0:
                this.A0J.A09();
                C36361kB.A0t(this);
                return true;
            case 1:
                String replaceAll = C36361kB.A0n(this.A0O.A02).replaceAll("\\D", "");
                String replaceAll2 = C36361kB.A0n(this.A0O.A03).replaceAll("\\D", "");
                C18750th.A0E(this, C55212uG.A00(C36321k7.A0D(replaceAll, replaceAll2)), C18750th.A0G());
                return true;
            case 2:
                C18750th.A09(this);
                return true;
            case 3:
                this.A04.Boy(new C81153wY((Object) this, 5));
                return true;
            case 4:
                byte[] A0I2 = C18750th.A0I(this, C55212uG.A00(C36321k7.A0D(C36361kB.A0n(this.A0O.A02).replaceAll("\\D", ""), C36361kB.A0n(this.A0O.A03).replaceAll("\\D", ""))));
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("RegisterPhone/rc=");
                if (A0I2 == null) {
                    obj = "(null)";
                } else {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    int length = A0I2.length;
                    for (int i = 0; i < length; i++) {
                        A0u2.append(String.format("%02X", new Object[]{Byte.valueOf(A0I2[i])}));
                    }
                    obj = A0u2.toString();
                }
                C36321k7.A1a(A0u, obj);
                return true;
            case 5:
                AnonymousClass1X8 r1 = this.A0R;
                Boolean bool = (Boolean) this.A0P.A05.A04();
                if (bool == null || !bool.booleanValue()) {
                    str = "notValidNumber";
                } else {
                    str = "validNumber";
                }
                r1.A03(str);
                AnonymousClass1X8 r12 = this.A0R;
                Boolean bool2 = (Boolean) this.A0P.A04.A04();
                if (bool2 == null || !bool2.booleanValue()) {
                    str2 = "notEmptyNumber";
                } else {
                    str2 = "emptyNumber";
                }
                r12.A03(str2);
                this.A0R.A02("register-phone");
                this.A0Q.A01(this, this.A0R, "register-phone");
                return true;
            case 6:
                startActivity(C36431kI.A0D().setClassName(this, "com.whatsapp.DebugToolsActivity"));
                return true;
            case 7:
                this.A0G.A01(2);
                this.A0N.A08("enter_number", "tapped");
                Context context = this.A08.A00;
                intent = C36431kI.A0D();
                intent.setClassName(context.getPackageName(), "com.whatsapp.companionmode.registration.RegisterAsCompanionActivity");
                intent.putExtra("entry_point", "entry_phone_reg");
                break;
            case 8:
                C18740tg.A06(((AnonymousClass3D0) this.A0a.get()).A01());
                intent = C36431kI.A0D();
                intent.setClassName(getPackageName(), "com.whatsapp.bridge.wfs.ui.LinkedUsersActivity");
                break;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
        startActivity(intent);
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        C63543Kl r1 = this.A0H;
        r1.A00 = true;
        C65983Uf.A0Q(r1.A03, C65983Uf.A00);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RegisterPhone/pause ");
        C36321k7.A1Y(A0u, C36361kB.A03(this.A0P.A0F));
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putString("com.whatsapp.registration.RegisterPhone.country_code", AnonymousClass24S.A0G(this));
        edit.putString("com.whatsapp.registration.RegisterPhone.phone_number", AnonymousClass24S.A0H(this));
        edit.putInt("com.whatsapp.registration.RegisterPhone.verification_state", C36361kB.A03(this.A0P.A0F));
        edit.putString("com.whatsapp.registration.RegisterPhone.input_phone_number", C36361kB.A0n(this.A0O.A03));
        edit.putString("com.whatsapp.registration.RegisterPhone.input_country_code", C36361kB.A0n(this.A0O.A02));
        edit.putInt("com.whatsapp.registration.RegisterPhone.country_code_position", AnonymousClass3MT.A00(this.A0O.A02));
        edit.putInt("com.whatsapp.registration.RegisterPhone.phone_number_position", AnonymousClass3MT.A00(this.A0O.A03));
        if (!edit.commit()) {
            Log.w("RegisterPhone/pause/commit failed");
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        if (!this.A0n || this.A0o) {
            menu.add(0, 7, 0, R.string.f12nameremoved);
        }
        menu.add(0, 5, 0, R.string.f12nameremoved);
        return super.onPrepareOptionsMenu(menu);
    }

    public void onResume() {
        super.onResume();
        this.A0H.A00();
        SharedPreferences preferences = getPreferences(0);
        ExistViewModel existViewModel = this.A0P;
        existViewModel.A03.A0D(preferences.getString("com.whatsapp.registration.RegisterPhone.country_code", (String) null));
        ExistViewModel existViewModel2 = this.A0P;
        existViewModel2.A09.A0D(preferences.getString("com.whatsapp.registration.RegisterPhone.phone_number", (String) null));
        ExistViewModel existViewModel3 = this.A0P;
        C36341k9.A16(existViewModel3.A0F, preferences.getInt("com.whatsapp.registration.RegisterPhone.verification_state", 7));
        if (this.A0m) {
            this.A0m = false;
            C36391kE.A1K(this.A0O.A03);
        } else {
            String string = preferences.getString("com.whatsapp.registration.RegisterPhone.input_phone_number", (String) null);
            this.A0O.A03.setText(string);
            if (!TextUtils.isEmpty(string)) {
                C36341k9.A18(this.A0P.A04, false);
                C36341k9.A18(this.A0P.A05, true);
            }
        }
        this.A0O.A02.setText(preferences.getString("com.whatsapp.registration.RegisterPhone.input_country_code", (String) null));
        if (TextUtils.isEmpty(this.A0O.A02.getText())) {
            this.A0O.A02.requestFocus();
        }
        AnonymousClass3MT.A01(this.A0O.A03, preferences.getInt("com.whatsapp.registration.RegisterPhone.phone_number_position", -1));
        AnonymousClass3MT.A01(this.A0O.A02, preferences.getInt("com.whatsapp.registration.RegisterPhone.country_code_position", -1));
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RegisterPhone/resume ");
        C36321k7.A1Y(A0u, C36361kB.A03(this.A0P.A0F));
        if (C36361kB.A03(this.A0P.A0F) == 15) {
            if (this.A0P.A03.A04() == null || this.A0P.A09.A04() == null) {
                Log.i("RegisterPhone/reset-state");
                A3k(7);
            } else {
                AnonymousClass3SJ.A01(this, 21);
            }
        }
        this.A0I.A03(1, "RegisterPhone1");
        C29501Ww.A02(this.A0J, 1, true);
        AnonymousClass1A6 r1 = this.A0H;
        C220412q.A00(r1.A02);
        AnonymousClass1A7 r12 = r1.A01;
        synchronized (r12) {
            if (r12.A00) {
                r12.A03.clear();
            }
            r12.A01.clear();
        }
        this.A0I.A0H(false);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("shouldStartBanAppealForBlockedUser", this.A0i);
    }
}
