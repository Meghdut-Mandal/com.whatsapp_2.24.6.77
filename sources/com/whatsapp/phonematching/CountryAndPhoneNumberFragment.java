package com.whatsapp.phonematching;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00E;
import X.AnonymousClass00F;
import X.AnonymousClass155;
import X.AnonymousClass1M4;
import X.AnonymousClass1N4;
import X.AnonymousClass3MT;
import X.AnonymousClass3U2;
import X.AnonymousClass3Y5;
import X.AnonymousClass4W2;
import X.AnonymousClass6X5;
import X.C18820ts;
import X.C21060yb;
import X.C24801Dv;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36441kJ;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.components.PhoneNumberEntry;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;

public abstract class CountryAndPhoneNumberFragment extends Hilt_CountryAndPhoneNumberFragment {
    public int A00 = 8;
    public EditText A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public AnonymousClass1N4 A05;
    public AnonymousClass155 A06;
    public WaEditText A07;
    public C21060yb A08;
    public C18820ts A09;
    public MatchPhoneNumberFragment A0A;
    public AnonymousClass1M4 A0B;
    public int A0C;
    public int A0D;
    public TextView A0E;
    public PhoneNumberEntry A0F;
    public String A0G = null;
    public String A0H;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        return A0n(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        return X.C36401kF.A0q(r6, r6.A03.getText(), new java.lang.Object[1], 0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A1Z(int r7) {
        /*
            r6 = this;
            r5 = 0
            r0 = 1
            switch(r7) {
                case 2: goto L_0x0029;
                case 3: goto L_0x0021;
                case 4: goto L_0x001d;
                case 5: goto L_0x0019;
                case 6: goto L_0x0015;
                default: goto L_0x0005;
            }
        L_0x0005:
            r2 = 2131893389(0x7f121c8d, float:1.9421553E38)
        L_0x0008:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            android.widget.TextView r0 = r6.A03
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = X.C36401kF.A0q(r6, r0, r1, r5, r2)
            return r0
        L_0x0015:
            r2 = 2131893390(0x7f121c8e, float:1.9421555E38)
            goto L_0x0008
        L_0x0019:
            r2 = 2131893391(0x7f121c8f, float:1.9421557E38)
            goto L_0x0008
        L_0x001d:
            r0 = 2131893401(0x7f121c99, float:1.9421577E38)
            goto L_0x0024
        L_0x0021:
            r0 = 2131893386(0x7f121c8a, float:1.9421547E38)
        L_0x0024:
            java.lang.String r0 = r6.A0n(r0)
            return r0
        L_0x0029:
            X.155 r4 = r6.A06
            r3 = 2131893385(0x7f121c89, float:1.9421545E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0M()
            r1 = 1
            X.AnonymousClass000.A1L(r2, r0, r5)
            r0 = 3
            X.AnonymousClass000.A1L(r2, r0, r1)
            java.lang.String r0 = r4.getString(r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.phonematching.CountryAndPhoneNumberFragment.A1Z(int):java.lang.String");
    }

    public static void A03(CountryAndPhoneNumberFragment countryAndPhoneNumberFragment, boolean z) {
        TextView textView = countryAndPhoneNumberFragment.A0E;
        AnonymousClass155 r1 = countryAndPhoneNumberFragment.A06;
        int i = R.color.f6nameremoved;
        if (z) {
            i = R.color.f6nameremoved;
        }
        C36331k8.A0r(r1, textView, i);
        int i2 = R.color.f6nameremoved;
        if (z) {
            i2 = R.color.f6nameremoved;
        }
        countryAndPhoneNumberFragment.A03.getBackground().setColorFilter(AnonymousClass00F.A00(countryAndPhoneNumberFragment.A06, i2), PorterDuff.Mode.SRC_IN);
        TextView textView2 = countryAndPhoneNumberFragment.A02;
        int i3 = 4;
        if (z) {
            i3 = 0;
        }
        textView2.setVisibility(i3);
    }

    public void A1a() {
        View view;
        String A0f = C36331k8.A0f(this.A01);
        String A0n = C36361kB.A0n(this.A07);
        int A002 = AnonymousClass3U2.A00(this.A05, C36331k8.A0f(this.A01), C36361kB.A0n(this.A07));
        switch (A002) {
            case 2:
                AnonymousClass155 r4 = this.A06;
                Object[] A0M = AnonymousClass001.A0M();
                AnonymousClass000.A1J(A0M, 1);
                AnonymousClass000.A1L(A0M, 3, 1);
                r4.BO6(r4.getString(R.string.f12nameremoved, A0M));
                break;
            case 3:
                this.A06.BO6(A0n(R.string.f12nameremoved));
                this.A01.setText("");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                this.A06.BO6(A1Z(A002));
                view = this.A07;
                break;
            default:
                int parseInt = Integer.parseInt(A0f);
                String replaceAll = A0n.replaceAll("\\D", "");
                try {
                    replaceAll = this.A05.A03(parseInt, replaceAll);
                } catch (IOException e) {
                    Log.e("CountryAndPhoneNumberFragment/phone failed trimLeadingZero from CountryPhoneInfo", e);
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("CountryAndPhoneNumberFragment/phone/cc=");
                A0u.append(A0f);
                C36321k7.A1Q("/number=", replaceAll, A0u);
                this.A0G = A0f;
                MatchPhoneNumberFragment matchPhoneNumberFragment = this.A0A;
                if (matchPhoneNumberFragment != null) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("MatchPhoneNumberFragment/submit/cc ");
                    A0u2.append(A0f);
                    A0u2.append(" ph=");
                    A0u2.append(replaceAll);
                    A0u2.append(" jid=");
                    C36351kA.A1L(C36441kJ.A0n(matchPhoneNumberFragment.A00), A0u2);
                    matchPhoneNumberFragment.A02.A00.Btz();
                    matchPhoneNumberFragment.A02.sendEmptyMessageDelayed(4, AnonymousClass6X5.A0L);
                    if (!matchPhoneNumberFragment.A02.A00.Bpq(A0f, replaceAll)) {
                        matchPhoneNumberFragment.A02.removeMessages(4);
                        matchPhoneNumberFragment.A02.A00.B5d();
                        AnonymousClass155 r42 = matchPhoneNumberFragment.A01;
                        r42.BO6(C36341k9.A0e(r42, AnonymousClass001.A0L(), R.string.f12nameremoved, 0, R.string.f12nameremoved));
                        return;
                    }
                    return;
                }
                return;
        }
        view = this.A01;
        view.requestFocus();
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0E2 = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        this.A0F = (PhoneNumberEntry) A0E2.findViewById(R.id.phone_number_entry);
        this.A03 = C36391kE.A0P(A0E2, R.id.registration_country);
        this.A02 = C36391kE.A0P(A0E2, R.id.registration_country_error_view);
        this.A04 = C36391kE.A0P(A0E2, R.id.registration_phone_error_view);
        this.A0E = C36391kE.A0P(A0E2, R.id.registration_country_label);
        PhoneNumberEntry phoneNumberEntry = this.A0F;
        this.A01 = phoneNumberEntry.A01;
        this.A07 = phoneNumberEntry.A02;
        phoneNumberEntry.A03 = new AnonymousClass4W2(this, 0);
        TelephonyManager A0K = this.A08.A0K();
        if (A0K == null) {
            Log.w("CountryAndPhoneNumberFragment tm=null");
        } else {
            Charset charset = AnonymousClass1M4.A06;
            String simCountryIso = A0K.getSimCountryIso();
            if (simCountryIso != null) {
                try {
                    this.A0G = this.A05.A05(simCountryIso);
                } catch (IOException e) {
                    Log.e("CountryAndPhoneNumberFragment/iso/code failed to get code from CountryPhoneInfo", e);
                }
            }
        }
        this.A03.setBackground(AnonymousClass00E.A00(this.A06, R.drawable.abc_spinner_textfield_background_material));
        this.A07.setTextDirection(3);
        AnonymousClass3Y5.A00(this.A03, this, 5);
        this.A07.requestFocus();
        this.A0D = AnonymousClass3MT.A00(this.A07);
        this.A0C = AnonymousClass3MT.A00(this.A01);
        String str = this.A0G;
        if (str != null) {
            this.A01.setText(str);
        }
        if (!TextUtils.isEmpty(this.A0H)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("CountryAndPhoneNumberFragment/country: ");
            C36321k7.A1a(A0u, this.A0H);
            this.A0F.A03(this.A0H);
        }
        return A0E2;
    }

    public void A1K() {
        super.A1K();
        this.A0D = AnonymousClass3MT.A00(this.A07);
        this.A0C = AnonymousClass3MT.A00(this.A01);
    }

    public void A1L() {
        super.A1L();
        String str = this.A0G;
        if (str != null) {
            this.A01.setText(str);
        }
        String str2 = this.A0H;
        if (str2 != null) {
            this.A03.setText(this.A0B.A03(this.A09, str2));
        }
        AnonymousClass3MT.A01(this.A01, this.A0C);
        AnonymousClass3MT.A01(this.A07, this.A0D);
        this.A07.clearFocus();
    }

    public void A1N(int i, int i2, Intent intent) {
        super.A1N(i, i2, intent);
        if (i == 0 && i2 == -1 && intent != null) {
            this.A0G = intent.getStringExtra("cc");
            this.A0H = intent.getStringExtra("iso");
            String stringExtra = intent.getStringExtra("country_name");
            this.A01.setText(this.A0G);
            this.A03.setText(stringExtra);
            this.A0F.A03(this.A0H);
            if (this.A0D == -1) {
                this.A0D = Integer.MAX_VALUE;
            }
        }
    }

    public void A1O(Context context) {
        super.A1O(context);
        this.A06 = (AnonymousClass155) C24801Dv.A01(context, AnonymousClass155.class);
    }
}
