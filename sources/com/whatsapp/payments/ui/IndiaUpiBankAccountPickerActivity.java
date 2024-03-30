package com.whatsapp.payments.ui;

import X.AE0;
import X.AEA;
import X.AF7;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass07B;
import X.AnonymousClass0BT;
import X.AnonymousClass0CZ;
import X.AnonymousClass16T;
import X.AnonymousClass17Y;
import X.AnonymousClass19A;
import X.AnonymousClass1EU;
import X.AnonymousClass1EZ;
import X.AnonymousClass1XD;
import X.AnonymousClass5GM;
import X.AnonymousClass658;
import X.AnonymousClass6CW;
import X.AnonymousClass6PS;
import X.AnonymousClass6YV;
import X.AnonymousClass8gK;
import X.AnonymousClass9FI;
import X.AnonymousClass9KX;
import X.AnonymousClass9Q4;
import X.AnonymousClass9RT;
import X.AnonymousClass9YX;
import X.B1L;
import X.B7Z;
import X.C131606Ps;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165607th;
import X.C167987zW;
import X.C173858Tk;
import X.C175748az;
import X.C175818b6;
import X.C176658cT;
import X.C178538gh;
import X.C179128jE;
import X.C179648kT;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C193899Ni;
import X.C194709Qv;
import X.C195389Uc;
import X.C19630wG;
import X.C19770wU;
import X.C199129ek;
import X.C199729fr;
import X.C201529jn;
import X.C202059ky;
import X.C202269lR;
import X.C203449o2;
import X.C207359uy;
import X.C20810yC;
import X.C21060yb;
import X.C22967AzJ;
import X.C23173B8h;
import X.C23191B8z;
import X.C24611Dc;
import X.C24801Dv;
import X.C27111My;
import X.C29121Vk;
import X.C29131Vl;
import X.C29221Vu;
import X.C30021Yx;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36441kJ;
import X.C90484aE;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class IndiaUpiBankAccountPickerActivity extends C179128jE implements AnonymousClass1XD, B1L, C22967AzJ {
    public int A00;
    public int A01;
    public RecyclerView A02;
    public AnonymousClass16T A03;
    public AEA A04;
    public C175818b6 A05;
    public C30021Yx A06;
    public AnonymousClass9YX A07;
    public C195389Uc A08;
    public AnonymousClass9RT A09;
    public AnonymousClass6PS A0A;
    public C194709Qv A0B;
    public C179648kT A0C;
    public AnonymousClass9Q4 A0D;
    public C201529jn A0E;
    public C29131Vl A0F;
    public AnonymousClass6CW A0G;
    public String A0H;
    public List A0I;
    public boolean A0J;
    public View A0K;
    public View A0L;
    public View A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public ImageView A0Q;
    public TextView A0R;
    public TextView A0S;
    public C199129ek A0T;
    public AnonymousClass8gK A0U;
    public ArrayList A0V;
    public boolean A0W;
    public boolean A0X;
    public final C24611Dc A0Y;
    public final C176658cT A0Z;

    public void BVU(C202059ky r1) {
    }

    private void A0z(C175748az r4) {
        C24611Dc r2 = this.A0Y;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("showSuccessAndFinish: ");
        C165567td.A18(r2, this.A07.toString(), A0u);
        A3w();
        this.A0A = r4;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("Is first payment method:");
        A0u2.append(this.A0l);
        A0u2.append(", entry point:");
        C36321k7.A1Y(A0u2, this.A02);
        A44("nav_select_account");
    }

    public static void A10(IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity) {
        if (indiaUpiBankAccountPickerActivity.A01 < 0) {
            Log.e("selected account position is invalid");
            return;
        }
        indiaUpiBankAccountPickerActivity.A0C.A00.A08("bankAccountAddClicked");
        indiaUpiBankAccountPickerActivity.A0K.setVisibility(8);
        indiaUpiBankAccountPickerActivity.A0J = true;
        AnonymousClass0CZ r0 = indiaUpiBankAccountPickerActivity.A02.A0G;
        if (r0 != null) {
            r0.A06();
        }
        boolean z = indiaUpiBankAccountPickerActivity.A0k;
        indiaUpiBankAccountPickerActivity.A0U.A00((C175818b6) indiaUpiBankAccountPickerActivity.A0V.get(indiaUpiBankAccountPickerActivity.A01), new C23191B8z(indiaUpiBankAccountPickerActivity, 1), z, z);
        indiaUpiBankAccountPickerActivity.A0S.Buu();
        C176658cT r1 = indiaUpiBankAccountPickerActivity.A0Z;
        r1.A0G = C36441kJ.A0y(indiaUpiBankAccountPickerActivity.A01);
        r1.A07 = C36371kC.A0p();
        r1.A0b = "nav_select_account";
        r1.A0Y = indiaUpiBankAccountPickerActivity.A0b;
        C176658cT.A02(r1, 1);
        C173858Tk.A0r(r1, indiaUpiBankAccountPickerActivity);
    }

    public static void A11(IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity, C199729fr r5, boolean z) {
        int i = r5.A00;
        indiaUpiBankAccountPickerActivity.A0Y.A06(AnonymousClass000.A0r("showSuccessAndFinish: resId ", AnonymousClass000.A0u(), i));
        indiaUpiBankAccountPickerActivity.A3w();
        if (i == 0) {
            i = R.string.f12nameremoved;
            String str = indiaUpiBankAccountPickerActivity.A07.A04;
            if ("upi-register-vpa".equalsIgnoreCase(str)) {
                i = R.string.f12nameremoved;
            }
            if ("upi-get-accounts".equalsIgnoreCase(str)) {
                i = R.string.f12nameremoved;
            }
        }
        if (indiaUpiBankAccountPickerActivity.A0k || z) {
            indiaUpiBankAccountPickerActivity.A3v();
            Intent A012 = C173858Tk.A01(indiaUpiBankAccountPickerActivity, r5);
            A012.putExtra("error", i);
            A012.putExtra("error_type", indiaUpiBankAccountPickerActivity.A00);
            int i2 = indiaUpiBankAccountPickerActivity.A00;
            if (i2 >= 1 && i2 <= 6) {
                A012.putExtra("extra_bank_account", indiaUpiBankAccountPickerActivity.A05);
            }
            if (!indiaUpiBankAccountPickerActivity.A0k) {
                A012.putExtra("try_again", 1);
            }
            if (indiaUpiBankAccountPickerActivity.A00 == 1) {
                A012.putExtra("extra_error_screen_name", "bank_account_not_found");
                A012.putExtra("extra_referral_screen", "device_binding");
            }
            A012.addFlags(335544320);
            indiaUpiBankAccountPickerActivity.A42(A012);
            A012.putExtra("extra_previous_screen", "nav_select_account");
            indiaUpiBankAccountPickerActivity.A33(A012, true);
        } else {
            indiaUpiBankAccountPickerActivity.BO5(i);
        }
        indiaUpiBankAccountPickerActivity.A0C.A00.A0C(3);
    }

    public static void A12(IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity, Integer num) {
        C176658cT r1 = indiaUpiBankAccountPickerActivity.A0Z;
        r1.A0b = "nav_select_account";
        r1.A0Y = indiaUpiBankAccountPickerActivity.A0b;
        r1.A08 = C36361kB.A0i();
        r1.A07 = num;
        C173858Tk.A0r(r1, indiaUpiBankAccountPickerActivity);
    }

    public void A2F() {
        if (!this.A0W) {
            this.A0W = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r3 = A0L2.A5g;
            C165567td.A11(r3, this);
            C18830tt r1 = r3.A00;
            C165567td.A0v(r3, r1, this, C36321k7.A05(r3, r1, this));
            C173858Tk.A0h(A0L2, r3, r1, this);
            C173858Tk.A0i(A0L2, r3, r1, this, C165577te.A0f(r3));
            C173858Tk.A0q(r3, r1, this);
            C173858Tk.A0p(r3, r1, this);
            this.A0F = C165587tf.A0Z(r3);
            this.A04 = C165607th.A0W(r1);
            this.A03 = C165587tf.A0Q(r3);
            this.A0A = C165607th.A0Z(r3);
            this.A06 = (C30021Yx) r3.AVk.get();
            this.A0E = r3.AHh();
            this.A0C = C173858Tk.A0G(r1);
            this.A08 = C165587tf.A0U(r1);
            this.A09 = (AnonymousClass9RT) r1.AAk.get();
            this.A0B = C27111My.A2v(A0L2);
        }
    }

    public void A47() {
        ArrayList arrayList = this.A0V;
        if (arrayList == null || arrayList.size() == 0) {
            this.A0Q.setVisibility(0);
            this.A0R.setVisibility(8);
            this.A0M.setVisibility(4);
            this.A0O.setVisibility(0);
            this.A02.setVisibility(8);
            this.A0K.setVisibility(8);
            this.A0L.setVisibility(8);
            this.A0P.setVisibility(0);
            this.A0N.setVisibility(8);
            this.A0Q.setImageDrawable(getResources().getDrawable(R.drawable.ic_account_search));
            this.A0S.setText(R.string.f12nameremoved);
            this.A0T.A00(this.A05, C173858Tk.A0L(this));
        } else {
            this.A0Z.A0H = C36441kJ.A0y(arrayList.size());
            this.A0I = AnonymousClass001.A0I();
            this.A01 = -1;
            this.A0J = false;
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.A0V;
                if (i >= arrayList2.size()) {
                    break;
                }
                C175818b6 r7 = (C175818b6) arrayList2.get(i);
                String A042 = C203449o2.A04((String) C165577te.A0g(r7.A02));
                this.A0I.add(new C193899Ni((String) C165577te.A0g(r7.A02), A042, (String) C165577te.A0g(r7.A01), getString(r7.A0B()), r7.A0A, r7.A0I));
                i++;
            }
            this.A0M.setVisibility(0);
            this.A0O.setVisibility(8);
            this.A02.setVisibility(0);
            int i2 = 0;
            while (true) {
                if (i2 >= this.A0I.size()) {
                    break;
                }
                C193899Ni r1 = (C193899Ni) this.A0I.get(i2);
                if (this.A01 == -1 && !r1.A06) {
                    this.A01 = i2;
                    r1.A00 = true;
                    break;
                }
                i2++;
            }
            this.A0Q.setVisibility(0);
            this.A0P.setVisibility(0);
            this.A0K.setVisibility(0);
            this.A0L.setVisibility(0);
            this.A0N.setVisibility(0);
            this.A0Q.setImageDrawable(AnonymousClass0BT.A00((Resources.Theme) null, getResources(), R.drawable.ic_account_found));
            int size = this.A0V.size();
            TextView textView = this.A0S;
            if (size == 1) {
                textView.setText(R.string.f12nameremoved);
                this.A0R.setVisibility(8);
            } else {
                textView.setText(R.string.f12nameremoved);
                this.A0R.setText(R.string.f12nameremoved);
                this.A0R.setVisibility(0);
            }
            if (this.A01 == -1) {
                this.A0K.setEnabled(false);
                this.A0L.setVisibility(4);
            } else {
                this.A0L.setVisibility(0);
                this.A0K.setEnabled(true);
                C207359uy.A00(this.A0K, this, 8);
            }
            List list = this.A0I;
            if (list != null) {
                this.A02.setAdapter(new C167987zW(new AnonymousClass9FI(this), this, list));
                this.A0C.A00.A08("bankAccountPickerShown");
            }
        }
        invalidateOptionsMenu();
    }

    public void BS2(C202059ky r10, ArrayList arrayList) {
        String A042;
        long size;
        C199729fr A032;
        int i;
        C24611Dc r4 = this.A0Y;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("onBankAccountsList: ");
        A0u.append(arrayList);
        C165567td.A16(r4, r10, " error: ", A0u);
        if (!TextUtils.isEmpty(C173858Tk.A0K(this))) {
            A042 = C173858Tk.A0K(this);
        } else {
            A042 = this.A0L.A04(this.A05);
        }
        AF7 af7 = this.A0S;
        af7.A0A(A042);
        C176658cT A022 = af7.A02(r10, 18);
        A022.A0O = this.A05.A0B;
        if (arrayList == null) {
            A022.A01 = C36381kD.A0j();
            size = 0;
        } else {
            A022.A01 = C36371kC.A0m();
            size = (long) arrayList.size();
        }
        A022.A0H = Long.valueOf(size);
        A022.A0b = "nav_select_account";
        A022.A0Y = this.A0b;
        C173858Tk.A0r(A022, this);
        r4.A04(AnonymousClass000.A0l(A022, "logGetAccounts: ", AnonymousClass000.A0u()));
        if (arrayList == null || arrayList.isEmpty()) {
            if (arrayList != null) {
                this.A00 = 1;
                if (!A46(this.A05, new C202059ky(11473), getString(R.string.f12nameremoved))) {
                    A032 = new C199729fr(R.string.f12nameremoved);
                } else {
                    return;
                }
            } else if (r10 != null && !AEA.A02(this, "upi-get-accounts", r10.A00, true)) {
                String A012 = this.A0A.A01(r10.A00);
                int i2 = r10.A00;
                if (i2 == 11467 || i2 == 11543) {
                    A3w();
                    this.A0M.B5D(this.A0L.A04(this.A05), true);
                    A11(this, new C199729fr(R.string.f12nameremoved), true);
                    this.A0L.A08();
                    return;
                } else if (A012 != null) {
                    A3w();
                    if (!A46(this.A05, r10, A012)) {
                        A11(this, new C199729fr(r10.A00, A012), true);
                        return;
                    }
                    return;
                } else {
                    if (i2 == 11473) {
                        A3w();
                        i = R.string.f12nameremoved;
                    } else if (i2 == 11485) {
                        A3w();
                        this.A00 = 5;
                        i = R.string.f12nameremoved;
                    } else if (i2 == 11487) {
                        A3w();
                        this.A00 = 6;
                        i = R.string.f12nameremoved;
                    } else {
                        A032 = this.A04.A03(this.A07, i2);
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        A0u2.append("onBankAccountsList failure. showErrorAndFinish: ");
                        C165577te.A1D(r4, A0u2, C90484aE.A0B(C36441kJ.A10("upi-get-accounts", this.A07.A06)));
                        int i3 = A032.A00;
                        if (i3 == R.string.f12nameremoved || i3 == R.string.f12nameremoved || i3 == R.string.f12nameremoved) {
                            this.A0k = false;
                            A11(this, A032, false);
                            return;
                        }
                        this.A00 = 1;
                    }
                    A032 = new C199729fr(i);
                }
            } else {
                return;
            }
            A11(this, A032, true);
            return;
        }
        getIntent().putParcelableArrayListExtra("extra_accounts_list", arrayList);
        this.A0V = arrayList;
        if (arrayList.size() != 1 || ((C175818b6) arrayList.get(0)).A0I) {
            A47();
            return;
        }
        this.A0X = true;
        boolean z = this.A0k;
        this.A0U.A00((C175818b6) arrayList.get(0), new C23191B8z(this, 0), z, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        if (X.C175818b6.A00((X.C175818b6) r0) == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r13.A00 != 1383026) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BeO(X.C175748az r12, X.C202059ky r13) {
        /*
            r11 = this;
            X.1Dc r2 = r11.A0Y
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "onRegisterVpa registered: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r12, r0, r1)
            r2.A04(r0)
            X.8kT r0 = r11.A0C
            r1 = 3
            if (r13 != 0) goto L_0x0015
            r1 = 2
        L_0x0015:
            X.0zf r0 = r0.A00
            r0.A0C(r1)
            r5 = 1383026(0x151a72, float:1.938032E-39)
            r2 = 0
            if (r13 == 0) goto L_0x0025
            int r0 = r13.A00
            r1 = 1
            if (r0 == r5) goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            boolean r0 = r11.A0X
            if (r0 == 0) goto L_0x0039
            if (r12 != 0) goto L_0x0039
            if (r1 != 0) goto L_0x0039
            r11.A0X = r2
            r11.A47()
            java.lang.String r0 = "Auto Add single account failed, falling back to default"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0039:
            X.1Db r0 = r11.A0P
            android.content.SharedPreferences r0 = r0.A03()
            java.lang.String r4 = "payment_usync_triggered"
            boolean r0 = r0.getBoolean(r4, r2)
            if (r0 != 0) goto L_0x005d
            X.0wU r3 = r11.A04
            X.0xY r1 = r11.A04
            java.util.Objects.requireNonNull(r1)
            r0 = 34
            X.AVX.A00(r3, r1, r0)
            X.1Db r0 = r11.A0P
            android.content.SharedPreferences$Editor r1 = X.C90494aF.A0E(r0)
            r0 = 1
            X.C36331k8.A0w(r1, r4, r0)
        L_0x005d:
            if (r12 == 0) goto L_0x00ca
            X.8bF r0 = r12.A08
            if (r0 == 0) goto L_0x006c
            X.8b6 r0 = (X.C175818b6) r0
            boolean r0 = X.C175818b6.A00(r0)
            r10 = 1
            if (r0 != 0) goto L_0x006d
        L_0x006c:
            r10 = 0
        L_0x006d:
            X.1Yx r7 = r11.A06
            com.whatsapp.jid.UserJid r6 = r11.A0F
            r5 = 3
            X.1Db r3 = r7.A02
            android.content.SharedPreferences r2 = r3.A03()
            java.lang.String r1 = "payments_inviter_jids_with_expiry"
            java.lang.String r0 = ""
            java.lang.String r0 = r2.getString(r1, r0)
            java.util.HashMap r0 = X.C24601Db.A02(r3, r0)
            java.util.Iterator r9 = X.C90484aE.A0s(r0)
        L_0x0088:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00c6
            java.lang.Object r8 = r9.next()
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            boolean r0 = r8.equals(r6)
            X.C30021Yx.A00(r8, r7, r5, r0)
            X.1Yy r2 = r7.A04
            X.0wo r0 = r7.A00
            long r3 = X.C19970wo.A00(r0)
            boolean r1 = r8.equals(r6)
            X.19w r0 = r2.A00
            X.3Qa r0 = X.C36411kG.A0o(r8, r0)
            if (r10 == 0) goto L_0x00c0
            X.8n4 r2 = new X.8n4
            r2.<init>(r0, r3)
        L_0x00b4:
            r2.A00 = r5
            r2.A01 = r1
            X.0xM r1 = r7.A01
            r0 = 16
            r1.A0m(r2, r0)
            goto L_0x0088
        L_0x00c0:
            X.8n3 r2 = new X.8n3
            r2.<init>(r0, r3)
            goto L_0x00b4
        L_0x00c6:
            r11.A0z(r12)
            return
        L_0x00ca:
            if (r13 == 0) goto L_0x0104
            int r1 = r13.A00
            r0 = 11472(0x2cd0, float:1.6076E-41)
            if (r1 != r0) goto L_0x00d8
            X.1Vk r0 = r11.A0M
            r0.A09(r11)
            return
        L_0x00d8:
            r0 = 10756(0x2a04, float:1.5072E-41)
            if (r1 != r0) goto L_0x00f9
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiDobPickerActivity> r0 = com.whatsapp.payments.ui.IndiaUpiDobPickerActivity.class
            android.content.Intent r2 = X.C36441kJ.A0H(r11, r0)
            java.util.ArrayList r1 = r11.A0V
            int r0 = r11.A01
            java.lang.Object r0 = r1.get(r0)
            X.8bA r0 = (X.C175848bA) r0
            X.6c7 r1 = r0.A02
            java.lang.String r0 = "bank_account"
            r2.putExtra(r0, r1)
            r0 = 1023(0x3ff, float:1.434E-42)
            r11.BuO(r2, r0)
            return
        L_0x00f9:
            if (r1 != r5) goto L_0x0104
            r1 = 2131895292(0x7f1223fc, float:1.9425413E38)
            X.9fr r0 = new X.9fr
            r0.<init>(r1)
            goto L_0x010c
        L_0x0104:
            X.AEA r1 = r11.A04
            X.9YX r0 = r11.A07
            X.9fr r0 = r1.A03(r0, r2)
        L_0x010c:
            A11(r11, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity.BeO(X.8az, X.9ky):void");
    }

    public void Bes(C202059ky r4) {
        C165567td.A16(this.A0Y, r4, "getPaymentMethods. paymentNetworkError: ", AnonymousClass000.A0u());
        A11(this, this.A04.A03(this.A07, r4.A00), false);
    }

    public void Bf0(C202059ky r4) {
        C165567td.A16(this.A0Y, r4, "getPaymentMethods. paymentNetworkError: ", AnonymousClass000.A0u());
        if (!AEA.A02(this, "upi-register-vpa", r4.A00, true)) {
            A11(this, this.A04.A03(this.A07, r4.A00), false);
        }
    }

    public void Bf1(AnonymousClass9KX r4) {
        C24611Dc r2 = this.A0Y;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("getPaymentMethods. onResponseSuccess: ");
        C165577te.A1E(r2, A0u, r4.A02);
        List list = ((C178538gh) r4).A00;
        if (list == null || list.isEmpty()) {
            A11(this, this.A04.A03(this.A07, 0), false);
            return;
        }
        this.A0I.A0A(this.A0I.A04("add_bank"));
        A0z((C175748az) null);
    }

    public void onBackPressed() {
        this.A0Y.A06("onBackPressed");
        A12(this, C36361kB.A0i());
        A3x();
    }

    public void onCreate(Bundle bundle) {
        C36331k8.A0l(this);
        super.onCreate(bundle);
        C165567td.A0j(this);
        this.A0D = new AnonymousClass9Q4(this.A0I);
        C18740tg.A06(C36371kC.A0H(this));
        this.A0V = C36371kC.A0H(this).getParcelableArrayList("extra_accounts_list");
        this.A0H = C36371kC.A0H(this).getString("extra_selected_account_bank_logo");
        this.A05 = (C175818b6) getIntent().getParcelableExtra("extra_selected_bank");
        AnonymousClass9YX r2 = this.A0L.A04;
        this.A07 = r2;
        r2.A00("upi-bank-account-picker");
        C20810yC r32 = this.A0D;
        AnonymousClass17Y r15 = this.A05;
        AnonymousClass19A r14 = this.A0H;
        C29131Vl r13 = this.A0F;
        AnonymousClass1EU r12 = this.A0P;
        AnonymousClass1EZ r3 = this.A0I;
        AnonymousClass16T r11 = this.A03;
        C202269lR r10 = this.A0L;
        C29121Vk r22 = this.A0M;
        C29221Vu r9 = this.A0K;
        AE0 ae0 = this.A0M;
        AF7 af7 = this.A0S;
        AnonymousClass5GM r6 = this.A0V;
        this.A0U = new AnonymousClass8gK(this, r15, r11, r32, r14, r10, ae0, r3, r9, r22, r12, this, af7, r6, r13);
        C19630wG r5 = this.A05;
        C19770wU r4 = this.A04;
        AnonymousClass5GM r27 = r6;
        AF7 af72 = af7;
        AnonymousClass1EU r24 = r12;
        C29221Vu r23 = r9;
        AE0 ae02 = ae0;
        C202269lR r21 = r10;
        C175818b6 r20 = this.A05;
        AnonymousClass19A r19 = r14;
        C20810yC r18 = r32;
        AnonymousClass16T r17 = r11;
        C19630wG r16 = r5;
        this.A0T = new C199129ek(r15, r16, r17, r18, r19, r20, r21, ae02, r23, r24, this, af72, r27, this.A0E, r13, r4);
        File A0w = C36441kJ.A0w(getCacheDir(), "BankLogos");
        if (!A0w.mkdirs() && !A0w.isDirectory()) {
            this.A0Y.A06("BankAccountPickerUI/create unable to create bank logos cache directory");
        }
        AnonymousClass658 r33 = new AnonymousClass658(this.A05, this.A05, this.A0D, A0w, "india-upi-bank-account-picker");
        r33.A00 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A0G = r33.A01();
        setContentView((int) R.layout.f9nameremoved);
        this.A0K = findViewById(R.id.add_button);
        this.A0L = findViewById(R.id.progress);
        this.A0P = findViewById(R.id.upi_logo);
        this.A0O = findViewById(R.id.shimmer_layout);
        this.A02 = (RecyclerView) findViewById(R.id.recycler_view);
        this.A0M = findViewById(R.id.header_divider);
        this.A0S = C36391kE.A0Q(this, R.id.bank_account_picker_title);
        this.A0R = C36391kE.A0Q(this, R.id.bank_account_picker_description);
        this.A0Q = C36411kG.A0Q(this, R.id.hero_img);
        this.A0N = findViewById(R.id.note_layout);
        AnonymousClass07B A0F2 = C173858Tk.A0F(this);
        if (A0F2 != null) {
            A0F2.A0U(true);
            A0F2.A0I(R.string.f12nameremoved);
        }
        C20810yC r8 = this.A0D;
        AnonymousClass17Y r7 = this.A05;
        C24801Dv r62 = this.A01;
        C21060yb r52 = this.A08;
        AnonymousClass17Y r112 = r7;
        C24801Dv r102 = r62;
        AnonymousClass6YV.A0E(this, Uri.parse("https://faq.whatsapp.com/general/payments/learn-more-about-sharing-the-legal-name-on-your-bank-account"), r102, r112, C36401kF.A0O(this.A0N, R.id.note_name_visible_to_others), r52, r8, C36391kE.A0v(this, "learn-more", new Object[1], 0, R.string.f12nameremoved), "learn-more");
        A47();
        this.A0S.A08((C131606Ps) null, 0, (Integer) null, this.A0b, "nav_select_account", this.A0e);
    }

    public IndiaUpiBankAccountPickerActivity(int i) {
        this.A0W = false;
        B7Z.A00(this, 3);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1023) {
            return;
        }
        if (i2 == -1) {
            this.A0B.A00(intent, this, new C23173B8h(this, 0));
        } else {
            finish();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        A43(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0U.A01 = null;
        this.A0P.A07(this);
        this.A0G.A02.A02(false);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_help && !this.A0J && this.A0O.getVisibility() != 0) {
            A41(R.string.f12nameremoved, "nav_select_account", "payments:account-select");
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.A0Y.A06("action bar home");
            A12(this, 1);
            A3x();
            return true;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        if (menu.findItem(R.id.menuitem_help) != null) {
            menu.findItem(R.id.menuitem_help).setVisible(AnonymousClass000.A1P(this.A0O.getVisibility()));
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public IndiaUpiBankAccountPickerActivity() {
        this(0);
        this.A0Y = C165607th.A0b("IndiaUpiBankAccountPickerActivity");
        this.A01 = -1;
        this.A0Z = new C176658cT();
        this.A0X = false;
    }
}
