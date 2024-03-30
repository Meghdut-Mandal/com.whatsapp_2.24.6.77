package X;

import android.app.Activity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Objects;

/* renamed from: X.3Qm  reason: invalid class name and case insensitive filesystem */
public abstract class C65043Qm {
    public TextWatcher A00;
    public EditText A01;
    public LinearLayout A02;
    public TextView A03;
    public TextInputLayout A04;
    public WaEditText A05;
    public final Activity A06;
    public final AnonymousClass1N4 A07;
    public final AnonymousClass17Y A08;
    public final C87524Pd A09;
    public final C21060yb A0A;
    public final C18820ts A0B;
    public final AnonymousClass1M4 A0C;
    public final C19770wU A0D;
    public final View A0E;

    public C65043Qm(Activity activity, View view, AnonymousClass1N4 r4, AnonymousClass17Y r5, C87524Pd r6, C21060yb r7, C18820ts r8, AnonymousClass1M4 r9, C19770wU r10) {
        C36321k7.A17(r5, r10, r9, 3);
        C36321k7.A13(r7, r8, r4);
        this.A0E = view;
        this.A06 = activity;
        this.A08 = r5;
        this.A0D = r10;
        this.A0C = r9;
        this.A0A = r7;
        this.A0B = r8;
        this.A07 = r4;
        this.A09 = r6;
    }

    public final void A04() {
        InputFilter[] inputFilterArr = {new InputFilter.LengthFilter(17)};
        WaEditText waEditText = this.A05;
        if (waEditText == null) {
            throw C36331k8.A0d("phoneField");
        }
        waEditText.setFilters(inputFilterArr);
        WaEditText waEditText2 = this.A05;
        if (waEditText2 == null) {
            throw C36331k8.A0d("phoneField");
        }
        waEditText2.setTextDirection(3);
        EditText editText = this.A01;
        if (editText == null) {
            throw C36331k8.A0d("countryCodeField");
        }
        editText.setTextDirection(3);
        LinearLayout linearLayout = this.A02;
        if (linearLayout == null) {
            throw C36331k8.A0d("phoneFieldContainer");
        }
        AnonymousClass04F.A05(linearLayout, 0);
        if (C36401kF.A1X(this.A0B)) {
            EditText editText2 = this.A01;
            if (editText2 == null) {
                throw C36331k8.A0d("countryCodeField");
            }
            AnonymousClass04F.A05(editText2, 1);
        }
        WaEditText waEditText3 = this.A05;
        if (waEditText3 == null) {
            throw C36331k8.A0d("phoneField");
        }
        C89574Xb.A00(waEditText3, this, 1);
        WaEditText waEditText4 = this.A05;
        if (waEditText4 == null) {
            throw C36331k8.A0d("phoneField");
        }
        waEditText4.A01 = new C90364a2(this, 1);
        EditText editText3 = this.A01;
        if (editText3 == null) {
            throw C36331k8.A0d("countryCodeField");
        }
        C66943Xx.A00(editText3, this, 25);
        this.A0D.Bp2(C80213v2.A00(this, 26), "getCountryCode");
    }

    public final void A06(String str) {
        AnonymousClass00C.A0D(str, 0);
        String A002 = AnonymousClass1M4.A00(str);
        if (A002 != null && A002.length() != 0) {
            A05(A002);
            String A0p = AnonymousClass000.A0p(" +", str, AnonymousClass000.A0v(A002));
            EditText editText = this.A01;
            if (editText == null) {
                throw C36331k8.A0d("countryCodeField");
            }
            editText.setText(A0p);
        }
    }

    public static final String A00(C65043Qm r3) {
        WaEditText waEditText = r3.A05;
        if (waEditText == null) {
            throw C36331k8.A0d("phoneField");
        }
        Editable text = waEditText.getText();
        Objects.requireNonNull(text);
        String valueOf = String.valueOf(text);
        String str = "";
        if (valueOf != null) {
            str = valueOf.replaceAll("\\D", str);
        }
        AnonymousClass00C.A08(str);
        String A012 = r3.A01();
        if (AnonymousClass000.A1R(A012.length()) && AnonymousClass097.A03(A012) != null) {
            try {
                String A032 = r3.A07.A03(Integer.parseInt(A012), str);
                AnonymousClass00C.A08(A032);
                return A032;
            } catch (IOException e) {
                Log.e("ContactFormActivity/cc failed trimLeadingZero from CountryPhoneInfo", e);
            }
        }
        return str;
    }

    public final String A01() {
        EditText editText = this.A01;
        if (editText == null) {
            throw C36331k8.A0d("countryCodeField");
        }
        String A0n = C36361kB.A0n(editText);
        String substring = A0n.substring(AnonymousClass099.A0C(A0n, "+", 0, false) + 1);
        AnonymousClass00C.A08(substring);
        return substring;
    }

    public void A05(String str) {
        if (this instanceof AnonymousClass2Fl) {
            AnonymousClass2Fl r2 = (AnonymousClass2Fl) this;
            if (str.length() != 0) {
                TextWatcher textWatcher = r2.A00;
                if (textWatcher != null) {
                    r2.A01.removeTextChangedListener(textWatcher);
                }
                try {
                    AnonymousClass4WI r1 = new AnonymousClass4WI(2, str, r2);
                    r2.A00 = r1;
                    r2.A01.addTextChangedListener(r1);
                } catch (NullPointerException unused) {
                    Log.e("PhoneNumberEntry/formatter exception");
                }
                WaEditText waEditText = r2.A01;
                Editable text = waEditText.getText();
                String str2 = "";
                if (text != null) {
                    str2 = new C10880fN("\\D").A00(text, str2);
                }
                waEditText.setText(str2);
                return;
            }
            return;
        }
        AnonymousClass2Fm r22 = (AnonymousClass2Fm) this;
        if (!TextUtils.isEmpty(str)) {
            TextWatcher textWatcher2 = r22.A00;
            if (textWatcher2 != null) {
                r22.A04.removeTextChangedListener(textWatcher2);
            }
            try {
                AnonymousClass4WI r12 = new AnonymousClass4WI(1, str, r22);
                r22.A00 = r12;
                r22.A04.addTextChangedListener(r12);
            } catch (NullPointerException unused2) {
                Log.e("PhoneNumberEntry/formatter exception");
            }
            WaEditText waEditText2 = r22.A04;
            Editable text2 = waEditText2.getText();
            Objects.requireNonNull(text2);
            String obj = text2.toString();
            String str3 = "";
            if (obj != null) {
                str3 = obj.replaceAll("\\D", str3);
            }
            waEditText2.setText(str3);
        }
    }

    public final String A02() {
        String A002 = A00(this);
        if (A002.length() == 0) {
            return "";
        }
        return AnonymousClass000.A0p(A01(), A002, AnonymousClass000.A0u());
    }

    public final String A03() {
        String A002 = A00(this);
        if (A002.length() == 0) {
            return "";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append('+');
        return AnonymousClass000.A0p(A01(), A002, A0u);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (X.AnonymousClass3U2.A01(r5.A07, A01(), A00(r5)) != 1) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A07() {
        /*
            r5 = this;
            r3 = 2131888255(0x7f12087f, float:1.941114E38)
            com.whatsapp.WaEditText r0 = r5.A05
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "phoneField"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x000e:
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x002c
            int r0 = r0.length()
            if (r0 == 0) goto L_0x002c
            r4 = 0
            X.1N4 r2 = r5.A07
            java.lang.String r1 = r5.A01()
            java.lang.String r0 = A00(r5)
            int r1 = X.AnonymousClass3U2.A01(r2, r1, r0)
            r0 = 1
            if (r1 == r0) goto L_0x0070
        L_0x002c:
            android.widget.TextView r1 = r5.A03
            r4 = 1
            if (r1 == 0) goto L_0x004e
            com.whatsapp.WaEditText r0 = r5.A05
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "phoneField"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x003c:
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x004b
            int r0 = r0.length()
            if (r0 == 0) goto L_0x004b
            r3 = 2131888256(0x7f120880, float:1.9411142E38)
        L_0x004b:
            r1.setText(r3)
        L_0x004e:
            r3 = r5
            boolean r0 = r5 instanceof X.AnonymousClass2Fl
            if (r0 != 0) goto L_0x0070
            X.2Fm r3 = (X.AnonymousClass2Fm) r3
            android.widget.TextView r1 = r3.A02
            r0 = 0
            r1.setVisibility(r0)
            com.google.android.material.textfield.TextInputLayout r2 = r3.A03
            r2.requestFocus()
            X.3Df r0 = r3.A07
            androidx.core.widget.NestedScrollView r1 = r0.A01
            int r0 = r2.getTop()
            r1.A0F(r0)
            java.lang.String r0 = " "
            r2.setError(r0)
        L_0x0070:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65043Qm.A07():boolean");
    }
}
