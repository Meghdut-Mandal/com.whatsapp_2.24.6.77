package com.whatsapp.contact.contactform;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass16D;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass19A;
import X.AnonymousClass1H2;
import X.AnonymousClass1M4;
import X.AnonymousClass1N4;
import X.AnonymousClass1NG;
import X.AnonymousClass2Fm;
import X.AnonymousClass312;
import X.AnonymousClass3B5;
import X.AnonymousClass3D5;
import X.AnonymousClass3F1;
import X.AnonymousClass3P7;
import X.AnonymousClass3QT;
import X.AnonymousClass3T6;
import X.AnonymousClass3US;
import X.AnonymousClass4XM;
import X.AnonymousClass4XY;
import X.C012005e;
import X.C18820ts;
import X.C19600wD;
import X.C19700wN;
import X.C19770wU;
import X.C20810yC;
import X.C20830yE;
import X.C21060yb;
import X.C21159AAt;
import X.C223313w;
import X.C229216m;
import X.C32661dz;
import X.C36341k9;
import X.C36351kA;
import X.C36401kF;
import X.C608739r;
import X.C61313Bj;
import X.C61323Bk;
import X.C61733Df;
import X.C62533Gn;
import X.C63443Kb;
import X.C63863Ls;
import X.C64523Oi;
import X.C65383Rv;
import X.C66943Xx;
import X.C67183Yv;
import X.C70283eu;
import X.C87524Pd;
import X.C87534Pe;
import X.C87544Pf;
import X.C88714Tt;
import X.C89574Xb;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.whatsapp.R;

public class ContactFormBottomSheetFragment extends Hilt_ContactFormBottomSheetFragment implements C88714Tt, C87524Pd, C87534Pe, C87544Pf {
    public AnonymousClass1N4 A00;
    public C19700wN A01;
    public C61313Bj A02;
    public C61323Bk A03;
    public AnonymousClass17Y A04;
    public AnonymousClass1NG A05;
    public C19600wD A06;
    public C229216m A07;
    public AnonymousClass16D A08;
    public C64523Oi A09;
    public AnonymousClass3QT A0A;
    public AnonymousClass2Fm A0B;
    public C63443Kb A0C;
    public C61733Df A0D;
    public C65383Rv A0E;
    public C21159AAt A0F;
    public C21060yb A0G;
    public C20830yE A0H;
    public C18820ts A0I;
    public AnonymousClass1H2 A0J;
    public C20810yC A0K;
    public AnonymousClass19A A0L;
    public C32661dz A0M;
    public AnonymousClass1M4 A0N;
    public C19770wU A0O;
    public C62533Gn A0P;
    public AnonymousClass3D5 A0Q;
    public AnonymousClass3F1 A0R;
    public AnonymousClass3P7 A0S;
    public AnonymousClass312 A0T;
    public boolean A0U;

    public void BUo(String str) {
        startActivityForResult(AnonymousClass190.A1C(A0i(), str, (String) null), 0);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean A1Y = C36401kF.A1Y(this.A0K);
        int i = R.layout.f9nameremoved;
        if (A1Y) {
            i = R.layout.f9nameremoved;
        }
        return layoutInflater.inflate(i, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        C223313w A012;
        String string;
        String string2;
        View view2 = view;
        super.A1S(bundle, view2);
        AnonymousClass01I A0i = A0i();
        AnonymousClass00C.A0D(view2, 1);
        this.A0Q = new AnonymousClass3D5(A0i, view2);
        AnonymousClass01I A0i2 = A0i();
        AnonymousClass3D5 r3 = this.A0Q;
        AnonymousClass00C.A0D(r3, 2);
        this.A0D = new C61733Df(A0i2, view2, r3);
        AnonymousClass01I A0i3 = A0i();
        AnonymousClass1H2 r4 = this.A0J;
        C61733Df r32 = this.A0D;
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r32, 3);
        this.A0A = new AnonymousClass3QT(A0i3, view2, r32, r4);
        AnonymousClass01I A0i4 = A0i();
        C65383Rv r33 = this.A0E;
        AnonymousClass00C.A0D(r33, 2);
        this.A0P = new C62533Gn(A0i4, view2, r33);
        AnonymousClass312 r2 = new AnonymousClass312(view2);
        this.A0T = r2;
        r2.A00.setOnCheckedChangeListener(new AnonymousClass4XY(this, 4));
        AnonymousClass01I A0i5 = A0i();
        C19770wU r11 = this.A0O;
        AnonymousClass19A r10 = this.A0L;
        AnonymousClass16D r9 = this.A08;
        AnonymousClass1NG r5 = this.A05;
        C21159AAt aAt = this.A0F;
        C70283eu r19 = new C70283eu(A0i5, r5, this.A06, r9, this.A0P, aAt, r10, r11);
        AnonymousClass01I A0i6 = A0i();
        AnonymousClass17Y r13 = this.A04;
        C19770wU r12 = this.A0O;
        AnonymousClass1M4 r112 = this.A0N;
        Bundle bundle2 = this.A0A;
        String str = "";
        String str2 = str;
        if (!(bundle2 == null || (string2 = bundle2.getString("contact_data_phone")) == null)) {
            str = string2;
        }
        C21060yb r102 = this.A0G;
        C18820ts r92 = this.A0I;
        this.A0B = new AnonymousClass2Fm(A0i6, view2, this.A00, r13, this, r19, this.A0P, this.A0D, r102, r92, r112, r12, str);
        AnonymousClass01I A0i7 = A0i();
        C20810yC r93 = this.A0K;
        AnonymousClass17Y r52 = this.A04;
        C19770wU r42 = this.A0O;
        AnonymousClass3B5 r16 = new AnonymousClass3B5(A0i7, view2, r52, this.A07, this, this.A0H, r93, r42);
        AnonymousClass01I A0i8 = A0i();
        AnonymousClass3QT r43 = this.A0A;
        AnonymousClass2Fm r34 = this.A0B;
        AnonymousClass17Y r22 = this.A04;
        C36341k9.A1E(r43, 2, r34);
        AnonymousClass00C.A0D(r22, 4);
        new C608739r(A0i8, view2, r22, this, r43, r34);
        Bundle bundle3 = this.A0A;
        if (!(bundle3 == null || (string = bundle3.getString("contact_data_phone")) == null)) {
            str2 = string;
        }
        Bundle bundle4 = this.A0A;
        if (bundle4 == null || (A012 = C223313w.A01.A01(bundle4.getString("contact_data_lid"))) == null || !str2.isEmpty()) {
            if (C36401kF.A1Y(this.A0K)) {
                AnonymousClass3T6.A03(view2, false);
            }
            AnonymousClass3P7 A002 = this.A03.A00(this.A0P, this.A0A, this.A0B, this, this.A0T);
            this.A0S = A002;
            C20810yC r94 = this.A0K;
            AnonymousClass17Y r122 = this.A04;
            C19700wN r113 = this.A01;
            C19770wU r8 = this.A0O;
            C229216m r132 = this.A07;
            C20830yE r6 = this.A0H;
            C64523Oi r14 = this.A09;
            AnonymousClass3QT r53 = this.A0A;
            AnonymousClass2Fm r44 = this.A0B;
            AnonymousClass3D5 r35 = this.A0Q;
            AnonymousClass3P7 r21 = A002;
            AnonymousClass3D5 r192 = r35;
            AnonymousClass2Fm r18 = r44;
            AnonymousClass3QT r17 = r53;
            this.A0C = new C63443Kb(r113, r122, r132, r14, this.A0P, r16, r17, r18, r192, this, r21, this.A0T, r6, r94, r8, (Long) null, (Long) null, (String) null);
        } else {
            C36351kA.A1A(view2, R.id.phone_field, 8);
            C36351kA.A1A(view2, R.id.country_code_field, 8);
            C36351kA.A1A(view2, R.id.phone_icon, 8);
            this.A0R = this.A02.A00(this.A0A, this.A0Q, this, A012);
        }
        Dialog dialog = this.A02;
        if (dialog != null) {
            dialog.setOnShowListener(new C63863Ls(dialog, this, 1));
        }
        C66943Xx.A00(C012005e.A02(view2, R.id.close_button), this, 26);
        AnonymousClass3D5 r54 = this.A0Q;
        r54.A00.setVisibility(8);
        r54.A01.setVisibility(0);
        C36351kA.A1A(view2, R.id.toolbar, 8);
        C36351kA.A1A(view2, R.id.header, 0);
        AnonymousClass2Fm r36 = this.A0B;
        C89574Xb.A00(r36.A04, r36, 2);
        AnonymousClass3QT r37 = this.A0A;
        EditText editText = r37.A04;
        editText.setOnFocusChangeListener(new C67183Yv(editText, r37));
        EditText editText2 = r37.A05;
        editText2.setOnFocusChangeListener(new C67183Yv(editText2, r37));
        EditText editText3 = r37.A03;
        editText3.setOnFocusChangeListener(new C67183Yv(editText3, r37));
        Bundle bundle5 = this.A0A;
        if (bundle5 == null) {
            this.A0D.A00();
            this.A0A.A04.requestFocus();
            return;
        }
        if (TextUtils.isEmpty(bundle5.getString("contact_data_first_name"))) {
            this.A0D.A00();
            this.A0A.A04.requestFocus();
        }
        AnonymousClass3T6.A02(bundle5, this.A0A, this.A0B);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r4.A0P.A00 != null) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bfh(android.content.Intent r5) {
        /*
            r4 = this;
            X.2Fm r1 = r4.A0B
            com.whatsapp.WaEditText r0 = r1.A05
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = "phoneField"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x000d:
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x001b
        L_0x0019:
            java.lang.String r0 = ""
        L_0x001b:
            boolean r0 = r1.A09(r0)
            r3 = 1
            if (r0 != 0) goto L_0x0029
            X.3Gn r0 = r4.A0P
            X.141 r1 = r0.A00
            r0 = 0
            if (r1 == 0) goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            X.1dz r2 = r4.A0M
            r1 = 4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A02(r0, r1)
            r4.A0U = r3
            r4.A1c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.contactform.ContactFormBottomSheetFragment.Bfh(android.content.Intent):void");
    }

    public void A1N(int i, int i2, Intent intent) {
        super.A1N(i, i2, intent);
        if (i == 150) {
            this.A0C.A00();
        } else if (i == 0) {
            this.A0B.A08(i2, intent);
        }
    }

    public int A1Y() {
        return R.style.f13nameremoved;
    }

    public boolean BLL() {
        return !A12();
    }

    public void BQo() {
        if (A12()) {
            A1c();
        }
    }

    public void Bff() {
        AnonymousClass01I A0h = A0h();
        if (A0h != null && !A0h.isFinishing() && !this.A0i) {
            AnonymousClass3T6.A01(A0h, new AnonymousClass4XM(this, 11), new AnonymousClass4XM(this, 12), R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A0D.A01.getLayoutParams().height == -1) {
            this.A0Q.A00(configuration);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Bundle A072 = AnonymousClass001.A07();
        A072.putBoolean("is_contact_saved", this.A0U);
        A0l().A0o("request_bottom_sheet_fragment", A072);
    }

    public void requestPermission() {
        if (A1D() != null) {
            startActivityForResult(AnonymousClass3US.A02(A0a(), R.string.f12nameremoved, R.string.f12nameremoved, false), 150);
        }
    }
}
