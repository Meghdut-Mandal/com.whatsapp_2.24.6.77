package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8hl  reason: invalid class name and case insensitive filesystem */
public abstract class C178838hl extends C178988iL implements B1K {
    public AnonymousClass16T A00;
    public AEA A01;
    public C202059ky A02;
    public AnonymousClass9YX A03;
    public C179648kT A04;
    public C198629dt A05;
    public boolean A06 = false;
    public AnonymousClass8gM A07;
    public final C24611Dc A08 = C165607th.A0b("IndiaUpiPaymentBankSetupActivity");

    public static boolean A12(C175718aw r3, AE0 ae0, ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return ((C175818b6) arrayList.get(0)).A00 <= 1 || !TextUtils.isEmpty(ae0.A0B()) || !(arrayList2 == null || arrayList2.size() <= 0 || r3 == null);
    }

    public void A47(List list, boolean z) {
        IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = (IndiaUpiBankPickerActivity) this;
        if (z) {
            return;
        }
        if (list.isEmpty()) {
            int i = 0;
            do {
                indiaUpiBankPickerActivity.A00.addView(View.inflate(indiaUpiBankPickerActivity, R.layout.f9nameremoved, (ViewGroup) null), new LinearLayout.LayoutParams(-1, -2));
                i++;
            } while (i < 25);
            indiaUpiBankPickerActivity.A01.setVisibility(8);
            indiaUpiBankPickerActivity.A02.setVisibility(8);
            indiaUpiBankPickerActivity.A03.setVisibility(0);
            indiaUpiBankPickerActivity.A03.A03();
            indiaUpiBankPickerActivity.A04.setVisibility(0);
            indiaUpiBankPickerActivity.A04.A03();
            return;
        }
        indiaUpiBankPickerActivity.A02.setVisibility(0);
        indiaUpiBankPickerActivity.A04.setVisibility(8);
        indiaUpiBankPickerActivity.A03.setVisibility(8);
        indiaUpiBankPickerActivity.A01.setVisibility(8);
        indiaUpiBankPickerActivity.A04.A04();
        indiaUpiBankPickerActivity.A03.A04();
        indiaUpiBankPickerActivity.A00.removeAllViews();
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        Character ch = null;
        boolean z2 = false;
        while (it.hasNext()) {
            C175818b6 r3 = (C175818b6) it.next();
            if (r3.A0J) {
                if (!z2) {
                    A0I2.add(new C1270666u((C175818b6) null, (String) null, 2));
                    z2 = true;
                }
                A0I2.add(new C1270666u(r3, (String) null, 1));
            } else {
                String str = (String) C165577te.A0g(r3.A01);
                C18740tg.A05(str);
                char charAt = str.charAt(0);
                if (ch == null || ch.charValue() != charAt) {
                    ch = Character.valueOf(charAt);
                    A0I.add(new C1270666u((C175818b6) null, ch.toString(), 0));
                }
                A0I.add(new C1270666u(r3, (String) null, 3));
            }
        }
        A0I2.addAll(A0I);
        indiaUpiBankPickerActivity.A0B = A0I2;
        indiaUpiBankPickerActivity.A06.A0L(A0I2);
        indiaUpiBankPickerActivity.A04.A00.A08("bankPickerShown");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A03 = this.A0L.A04;
        this.A0Y = C165597tg.A0T(this);
        C20810yC r4 = this.A0D;
        AnonymousClass17Y r2 = this.A05;
        AnonymousClass19A r5 = this.A0H;
        AnonymousClass1EU r9 = this.A0P;
        this.A07 = new AnonymousClass8gM(this, r2, this.A00, r4, r5, this.A0L, this.A0K, this.A0M, r9, this, this.A0S, this.A0V);
        onConfigurationChanged(AnonymousClass000.A0U(this));
    }

    public static void A0z(C202059ky r5, C178838hl r6, boolean z) {
        String str;
        int i;
        if (z) {
            str = "upi-batch";
        } else {
            str = "upi-get-banks";
        }
        if (!AEA.A02(r6, str, r5.A00, false)) {
            C24611Dc r4 = r6.A08;
            StringBuilder A0v = AnonymousClass000.A0v(str);
            A0v.append(" failed with error: ");
            A0v.append(r5);
            C165567td.A18(r4, "; showErrorAndFinish", A0v);
            int i2 = r5.A00;
            if (i2 == 21129) {
                AVY avy = new AVY(r6, 8);
                C39001qm A002 = AnonymousClass3LW.A00(r6);
                A002.A0d(R.string.f12nameremoved);
                A002.A0c(R.string.f12nameremoved);
                A002.A0h(new C163437qC(avy, r6, 12), R.string.f12nameremoved);
                A002.A0r(false);
                A002.A0b();
                return;
            }
            C199729fr A032 = r6.A01.A03(r6.A03, i2);
            r6.A04.A00.A0C(3);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("showErrorAndFinish: ");
            C165577te.A1D(r4, A0u, A032.A00);
            r6.A3w();
            if (A032.A00 == 0) {
                A032.A00 = R.string.f12nameremoved;
                String str2 = r6.A03.A04;
                if ("upi-batch".equalsIgnoreCase(str2)) {
                    i = R.string.f12nameremoved;
                } else if ("upi-get-banks".equalsIgnoreCase(str2)) {
                    i = R.string.f12nameremoved;
                }
                A032.A00 = i;
            }
            if (r6.A0k) {
                r6.A3v();
                Intent A012 = C173858Tk.A01(r6, A032);
                A012.putExtra("error", A032.A00);
                r6.A42(A012);
                A012.putExtra("extra_skip_value_props_display", false);
                r6.A33(A012, true);
                return;
            }
            C36331k8.A12(C199729fr.A00(r6, A032), r6);
        }
    }

    private void A10(C202059ky r5, boolean z) {
        AF7 af7 = this.A0S;
        int i = 4;
        if (z) {
            i = 3;
        }
        C176658cT A022 = af7.A02(r5, i);
        A022.A0Y = this.A0b;
        A022.A0b = "nav_bank_select";
        A022.A0a = this.A0e;
        C173858Tk.A0r(A022, this);
        C165567td.A16(this.A08, A022, "logBanksList: ", AnonymousClass000.A0u());
    }

    public static void A11(C178838hl r5) {
        ArrayList arrayList;
        boolean A0E = r5.A0D.A0E(2746);
        boolean z = false;
        AE0 ae0 = r5.A0M;
        if (!A0E) {
            C202269lR r0 = r5.A0L;
            if (!A12(r0.A03, ae0, r0.A05, r0.A07)) {
                return;
            }
            arrayList = r5.A0L.A05;
        } else if (ae0.A0M() || r5.A0I.A0F()) {
            AE0 ae02 = r5.A0M;
            C202269lR r02 = r5.A0L;
            if (!A12(r02.A03, ae02, r02.A05, r02.A07)) {
                AE0 ae03 = r5.A0M;
                C202269lR r03 = r5.A0L;
                if (A12(r03.A03, ae03, r03.A06, r03.A07)) {
                    arrayList = r5.A0L.A06;
                    z = true;
                } else {
                    return;
                }
            }
            arrayList = r5.A0L.A05;
        } else {
            return;
        }
        r5.A47(arrayList, z);
    }

    private boolean A13(String str) {
        if (!this.A0D.A0E(7727) || "CREDIT".equals(this.A0a) || TextUtils.isEmpty(str)) {
            return false;
        }
        return true;
    }

    public void BS3(C202059ky r3, boolean z, boolean z2, boolean z3) {
        if (this.A0D.A0E(2746)) {
            if (z2) {
                z2 = true;
            } else if (z3) {
                return;
            } else {
                if (this.A02 == null) {
                    this.A02 = r3;
                    this.A06 = false;
                    return;
                }
                if (!z) {
                    this.A0M.A0L(false);
                }
                A10(r3, false);
                if (!this.A0m) {
                    A0z(r3, this, false);
                    return;
                }
                this.A06 = false;
                this.A02 = r3;
            }
        }
        if (!z && !z2) {
            this.A0M.A0L(false);
        }
        A10(r3, z2);
        if (!this.A0m) {
            A0z(r3, this, z2);
            return;
        }
        this.A06 = z2;
        this.A02 = r3;
    }

    public void BS4(C175718aw r4, ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2, boolean z3) {
        C202269lR r2;
        ArrayList arrayList3;
        if (this.A0D.A0E(2746)) {
            if (z) {
                this.A0M.A0L(true);
                PaymentIncentiveViewModel paymentIncentiveViewModel = this.A0Y;
                if (paymentIncentiveViewModel != null) {
                    C165597tg.A1E(paymentIncentiveViewModel.A07, paymentIncentiveViewModel, 8);
                }
            }
            if (A12(r4, this.A0M, arrayList, arrayList2)) {
                if (!A13(this.A0D.A09(7728))) {
                    r2 = this.A0L;
                    arrayList3 = C36441kJ.A15(arrayList);
                    Collections.sort(arrayList3, AnonymousClass76A.A00);
                    if (z2) {
                        r2.A06 = arrayList3;
                    }
                    r2.A05 = arrayList3;
                }
            }
            this.A08.A05("Invalid Banks Data, throwing error");
            BS3(C202059ky.A00(), false, z, z3);
            return;
        }
        if (z) {
            this.A0M.A0L(true);
            PaymentIncentiveViewModel paymentIncentiveViewModel2 = this.A0Y;
            if (paymentIncentiveViewModel2 != null) {
                C165597tg.A1E(paymentIncentiveViewModel2.A07, paymentIncentiveViewModel2, 8);
            }
        }
        if (A12(r4, this.A0M, arrayList, arrayList2)) {
            if (!A13(this.A0D.A09(7728))) {
                r2 = this.A0L;
                arrayList3 = C36441kJ.A15(arrayList);
                Collections.sort(arrayList3, AnonymousClass76A.A00);
                r2.A05 = arrayList3;
            }
        }
        this.A08.A05("Invalid Banks Data, throwing error");
        BS3(C202059ky.A00(), false, z, z3);
        return;
        C202269lR r0 = this.A0L;
        r0.A07 = arrayList2;
        r0.A03 = r4;
        C36321k7.A1K(arrayList2, "PAY: IndiaUpiPaymentSetup setPspAndBanksList pspConfig: ", AnonymousClass000.A0u());
        C36321k7.A1K(r4, "PAY: IndiaUpiPaymentSetup setPspAndBanksList pspRouting: ", AnonymousClass000.A0u());
        C24611Dc r22 = this.A08;
        StringBuilder A0u = AnonymousClass000.A0u();
        C36341k9.A1N("banks returned: ", A0u, arrayList);
        C165607th.A1E(r22, A0u);
        A10((C202059ky) null, z);
        if (!this.A0m) {
            A11(this);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C24611Dc r2 = this.A08;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("onActivityResult: request: ");
        A0u.append(i);
        r2.A0A(AnonymousClass000.A0r(" result: ", A0u, i2), (Throwable) null);
        if (i != 1000) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            A3v();
            finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A07.A00 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r6 = this;
            super.onResume()
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto L_0x0072
            X.1Dc r2 = r6.A08
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "bank setup onResume states: "
            r1.append(r0)
            X.9YX r0 = r6.A03
            X.C165567td.A17(r2, r0, r1)
            java.lang.String r4 = X.C173858Tk.A0L(r6)
            X.9dt r2 = r6.A05
            r1 = 0
            java.lang.String r0 = r6.A0a
            X.9IL r0 = r2.A00(r1, r0)
            java.lang.String r3 = r0.A01
            X.0yC r1 = r6.A0D
            r0 = 2746(0xaba, float:3.848E-42)
            boolean r0 = r1.A0E(r0)
            r2 = 0
            if (r0 == 0) goto L_0x007d
            X.AE0 r0 = r6.A0M
            boolean r0 = r0.A0M()
            r5 = 1
            if (r0 != 0) goto L_0x0073
            X.1EZ r0 = r6.A0I
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0073
            X.8gM r1 = r6.A07
            java.lang.String r0 = X.C173858Tk.A0L(r6)
            r1.A00(r0, r3, r5)
            X.9lR r0 = r6.A0L
            java.util.ArrayList r0 = r0.A05
            if (r0 != 0) goto L_0x0058
            X.8gM r0 = r6.A07
            r0.A01(r4, r3, r2, r5)
        L_0x0058:
            X.AF7 r0 = r6.A0S
            r0.Buu()
        L_0x005d:
            X.0yC r1 = r6.A0D
            r0 = 7728(0x1e30, float:1.0829E-41)
            java.lang.String r2 = r1.A09(r0)
            boolean r0 = r6.A13(r2)
            if (r0 == 0) goto L_0x0072
            X.0wU r1 = r6.A04
            r0 = 11
            X.C36421kH.A1H(r1, r6, r2, r0)
        L_0x0072:
            return
        L_0x0073:
            X.9lR r1 = r6.A0L
            java.util.ArrayList r0 = r1.A05
            if (r0 == 0) goto L_0x009d
            r6.A47(r0, r2)
            goto L_0x0058
        L_0x007d:
            X.9lR r0 = r6.A0L
            java.util.ArrayList r0 = r0.A05
            if (r0 != 0) goto L_0x00b6
            X.AE0 r0 = r6.A0M
            boolean r0 = r0.A0M()
            if (r0 != 0) goto L_0x00b0
            X.1EZ r0 = r6.A0I
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x00b0
            X.8gM r1 = r6.A07
            java.lang.String r0 = X.C173858Tk.A0L(r6)
            r1.A00(r0, r3, r2)
            goto L_0x0058
        L_0x009d:
            java.util.ArrayList r0 = r1.A06
            if (r0 != 0) goto L_0x00b0
            X.9k4 r1 = r6.A0N
            java.lang.String r0 = r6.A0a
            boolean r0 = r1.A08(r0)
            if (r0 != 0) goto L_0x00b0
            X.8gM r0 = r6.A07
            r0.A01(r4, r3, r5, r2)
        L_0x00b0:
            X.8gM r0 = r6.A07
            r0.A01(r4, r3, r2, r2)
            goto L_0x0058
        L_0x00b6:
            r6.A47(r0, r2)
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178838hl.onResume():void");
    }
}
