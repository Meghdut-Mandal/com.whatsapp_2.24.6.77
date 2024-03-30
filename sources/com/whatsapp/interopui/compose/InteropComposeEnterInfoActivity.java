package com.whatsapp.interopui.compose;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass155;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass1M4;
import X.AnonymousClass1N4;
import X.AnonymousClass2Fl;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Y3;
import X.AnonymousClass4C6;
import X.AnonymousClass4KO;
import X.AnonymousClass4NE;
import X.AnonymousClass4NF;
import X.AnonymousClass4NG;
import X.AnonymousClass4WK;
import X.C012005e;
import X.C1272367m;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19770wU;
import X.C21060yb;
import X.C27751Pr;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C66023Uj;
import X.C66743Xd;
import X.C79103tB;
import X.C87524Pd;
import X.C89344We;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;
import java.util.Locale;

public final class InteropComposeEnterInfoActivity extends AnonymousClass155 implements C87524Pd {
    public ProgressDialog A00;
    public ViewStub A01;
    public TextInputLayout A02;
    public TextInputLayout A03;
    public AnonymousClass1N4 A04;
    public WaEditText A05;
    public WaEditText A06;
    public WaEditText A07;
    public WaEditText A08;
    public C66743Xd A09;
    public C27751Pr A0A;
    public AnonymousClass190 A0B;
    public C1272367m A0C;
    public AnonymousClass2Fl A0D;
    public AnonymousClass1M4 A0E;
    public WDSButton A0F;
    public boolean A0G;
    public final AnonymousClass00T A0H;

    public void BUo(String str) {
        if (this.A0B != null) {
            startActivityForResult(AnonymousClass190.A1C(this, str, (String) null), 0);
            return;
        }
        throw C36331k8.A0X();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("integratorInfo");
        if (parcelableExtra != null) {
            this.A09 = (C66743Xd) parcelableExtra;
            setContentView((int) R.layout.f9nameremoved);
            this.A01 = (ViewStub) C36361kB.A0H(this, R.id.user_id_view_place_holder);
            WDSButton wDSButton = (WDSButton) C36361kB.A0H(this, R.id.compose_create_chat_button);
            this.A0F = wDSButton;
            if (wDSButton == null) {
                throw C36331k8.A0d("createChatButton");
            }
            wDSButton.setEnabled(false);
            this.A00 = new ProgressDialog(this);
            C66743Xd r0 = this.A09;
            if (r0 == null) {
                throw C36331k8.A0d("integratorInfo");
            }
            int ordinal = r0.A01.ordinal();
            if (ordinal == 0) {
                ViewStub viewStub = this.A01;
                if (viewStub == null) {
                    throw C36331k8.A0d("userIdViewStub");
                }
                viewStub.setLayoutResource(R.layout.f9nameremoved);
                ViewStub viewStub2 = this.A01;
                if (viewStub2 == null) {
                    throw C36331k8.A0d("userIdViewStub");
                }
                View inflate = viewStub2.inflate();
                TextInputLayout textInputLayout = (TextInputLayout) C36361kB.A0G(inflate, R.id.compose_enter_info_user_layout);
                this.A03 = textInputLayout;
                if (textInputLayout == null) {
                    throw C36331k8.A0d("userNameEditTextLayout");
                }
                textInputLayout.setHint((int) R.string.f12nameremoved);
                this.A07 = (WaEditText) C012005e.A02(inflate, R.id.compose_enter_info_user);
            } else if (ordinal == 1) {
                ViewStub viewStub3 = this.A01;
                if (viewStub3 == null) {
                    throw C36331k8.A0d("userIdViewStub");
                }
                viewStub3.setLayoutResource(R.layout.f9nameremoved);
                ViewStub viewStub4 = this.A01;
                if (viewStub4 == null) {
                    throw C36331k8.A0d("userIdViewStub");
                }
                View inflate2 = viewStub4.inflate();
                AnonymousClass00C.A0B(inflate2);
                AnonymousClass17Y r9 = this.A05;
                AnonymousClass00C.A07(r9);
                C19770wU r14 = this.A04;
                AnonymousClass00C.A07(r14);
                AnonymousClass1M4 r13 = this.A0E;
                if (r13 != null) {
                    C21060yb r11 = this.A08;
                    AnonymousClass00C.A07(r11);
                    C18820ts r12 = this.A00;
                    AnonymousClass00C.A07(r12);
                    AnonymousClass1N4 r8 = this.A04;
                    if (r8 != null) {
                        this.A0D = new AnonymousClass2Fl(this, inflate2, r8, r9, this, r11, r12, r13, r14);
                        this.A08 = (WaEditText) C012005e.A02(inflate2, R.id.phone_field);
                        this.A05 = (WaEditText) C012005e.A02(inflate2, R.id.country_code_field);
                    } else {
                        throw C36331k8.A0d("countryPhoneInfo");
                    }
                } else {
                    throw C36331k8.A0d("countryUtils");
                }
            } else if (ordinal == 2) {
                ViewStub viewStub5 = this.A01;
                if (viewStub5 == null) {
                    throw C36331k8.A0d("userIdViewStub");
                }
                viewStub5.setLayoutResource(R.layout.f9nameremoved);
                ViewStub viewStub6 = this.A01;
                if (viewStub6 == null) {
                    throw C36331k8.A0d("userIdViewStub");
                }
                View inflate3 = viewStub6.inflate();
                TextInputLayout textInputLayout2 = (TextInputLayout) C36361kB.A0G(inflate3, R.id.compose_enter_info_user_layout);
                this.A02 = textInputLayout2;
                if (textInputLayout2 == null) {
                    throw C36331k8.A0d("userEmailEditTextLayout");
                }
                textInputLayout2.setHint((int) R.string.f12nameremoved);
                this.A06 = (WaEditText) C012005e.A02(inflate3, R.id.compose_enter_info_user);
            }
            Toolbar toolbar = (Toolbar) C36361kB.A0H(this, R.id.compose_enter_info_toolbar);
            super.setSupportActionBar(toolbar);
            C36321k7.A0O(this);
            C36331k8.A0s(toolbar.getContext(), toolbar, this.A00, R.drawable.ic_back);
            toolbar.A0J(toolbar.getContext(), R.style.f13nameremoved);
            AnonymousClass3MZ.A00(toolbar);
            WDSTextLayout wDSTextLayout = (WDSTextLayout) findViewById(R.id.item_integrator_info);
            C66743Xd r02 = this.A09;
            if (r02 == null) {
                throw C36331k8.A0d("integratorInfo");
            }
            wDSTextLayout.setHeadlineText(r02.A03);
            int A052 = C36441kJ.A05(getResources(), R.dimen.f7nameremoved);
            C1272367m r2 = this.A0C;
            if (r2 != null) {
                C66743Xd r03 = this.A09;
                if (r03 == null) {
                    throw C36331k8.A0d("integratorInfo");
                }
                r2.A01(new C79103tB(this, wDSTextLayout, A052), r03.A04);
                WaEditText waEditText = this.A07;
                AnonymousClass4NE r22 = AnonymousClass4NE.A00;
                if (waEditText != null) {
                    waEditText.addTextChangedListener(new AnonymousClass4WK(r22, this, 3));
                }
                WaEditText waEditText2 = this.A06;
                AnonymousClass4NF r23 = AnonymousClass4NF.A00;
                if (waEditText2 != null) {
                    waEditText2.addTextChangedListener(new AnonymousClass4WK(r23, this, 3));
                }
                WaEditText waEditText3 = this.A08;
                AnonymousClass4NG r24 = AnonymousClass4NG.A00;
                if (waEditText3 != null) {
                    waEditText3.addTextChangedListener(new AnonymousClass4WK(r24, this, 3));
                }
                WDSButton wDSButton2 = this.A0F;
                if (wDSButton2 == null) {
                    throw C36331k8.A0d("createChatButton");
                }
                AnonymousClass3Y3.A00(wDSButton2, this, 35);
                C66023Uj.A01(this, ((InteropComposeEnterInfoViewModel) this.A0H.getValue()).A00, new AnonymousClass4KO(this), 31);
                return;
            }
            throw C36331k8.A0d("imageLoader");
        }
        throw C36381kD.A0l();
    }

    public static final void A01(InteropComposeEnterInfoActivity interopComposeEnterInfoActivity) {
        ProgressDialog progressDialog = interopComposeEnterInfoActivity.A00;
        if (progressDialog == null) {
            throw C36331k8.A0d("progressDialog");
        } else if (progressDialog.isShowing()) {
            ProgressDialog progressDialog2 = interopComposeEnterInfoActivity.A00;
            if (progressDialog2 == null) {
                throw C36331k8.A0d("progressDialog");
            }
            progressDialog2.dismiss();
        }
    }

    public void A2F() {
        if (!this.A0G) {
            this.A0G = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A0C = (C1272367m) r1.A2K.get();
            this.A0A = C36381kD.A0b(A0B2);
            this.A0E = C36361kB.A0f(A0B2);
            this.A04 = C36351kA.A0K(A0B2);
            this.A0B = C36351kA.A0h(A0B2);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        InputMethodManager inputMethodManager;
        if (i == 0) {
            AnonymousClass2Fl r4 = this.A0D;
            if (r4 == null) {
                throw C36331k8.A0d("interopPhoneNumberController");
            }
            if (i2 == -1 && intent != null) {
                String stringExtra = intent.getStringExtra("iso");
                String stringExtra2 = intent.getStringExtra("cc");
                if (!(stringExtra == null || stringExtra2 == null)) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    String upperCase = stringExtra.toUpperCase(Locale.ROOT);
                    AnonymousClass00C.A08(upperCase);
                    A0u.append(upperCase);
                    r4.A00.setText(AnonymousClass000.A0p(" +", stringExtra2, A0u));
                    r4.A05(stringExtra);
                }
            }
            WaEditText waEditText = r4.A01;
            waEditText.requestFocus();
            Editable text = waEditText.getText();
            if (text != null) {
                waEditText.setSelection(text.length());
            }
            Object systemService = r4.A06.getSystemService("input_method");
            if ((systemService instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) systemService) != null && !inputMethodManager.isAcceptingText()) {
                inputMethodManager.toggleSoftInput(1, 1);
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public InteropComposeEnterInfoActivity(int i) {
        this.A0G = false;
        C89344We.A00(this, 3);
    }

    public InteropComposeEnterInfoActivity() {
        this(0);
        this.A0H = C36431kI.A1I(new AnonymousClass4C6(this));
    }
}
