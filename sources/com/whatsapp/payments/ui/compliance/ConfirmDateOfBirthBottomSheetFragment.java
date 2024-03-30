package com.whatsapp.payments.ui.compliance;

import X.AF6;
import X.AVY;
import X.AnonymousClass00C;
import X.AnonymousClass02E;
import X.AnonymousClass0BN;
import X.AnonymousClass1N3;
import X.AnonymousClass9ZG;
import X.B7U;
import X.C165597tg;
import X.C18740tg;
import X.C18820ts;
import X.C193649Mh;
import X.C203949pD;
import X.C20810yC;
import X.C21060yb;
import X.C32681e1;
import X.C34011gJ;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36401kF;
import X.C36421kH;
import X.C93154fy;
import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.base.WaFragment;
import com.whatsapp.payments.ui.P2mLiteConfirmDateOfBirthBottomSheetFragment;
import com.whatsapp.wds.components.button.WDSButton;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class ConfirmDateOfBirthBottomSheetFragment extends WaFragment {
    public ProgressBar A00;
    public TextEmojiLabel A01;
    public WaEditText A02;
    public AnonymousClass1N3 A03;
    public C21060yb A04;
    public C18820ts A05;
    public C20810yC A06;
    public C193649Mh A07;
    public C32681e1 A08;
    public WDSButton A09;
    public Calendar A0A;
    public final DatePickerDialog.OnDateSetListener A0B = new C203949pD(this);

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View A0J = C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
        TextEmojiLabel A0O = C36351kA.A0O(A0J, R.id.confirm_dob_desc_view);
        AnonymousClass00C.A0D(A0O, 0);
        this.A01 = A0O;
        ProgressBar progressBar = (ProgressBar) C36361kB.A0G(A0J, R.id.loading_progress);
        AnonymousClass00C.A0D(progressBar, 0);
        this.A00 = progressBar;
        WaEditText waEditText = (WaEditText) C36361kB.A0G(A0J, R.id.dob_edit_view);
        AnonymousClass00C.A0D(waEditText, 0);
        this.A02 = waEditText;
        WDSButton wDSButton = (WDSButton) C36361kB.A0G(A0J, R.id.continue_btn);
        AnonymousClass00C.A0D(wDSButton, 0);
        this.A09 = wDSButton;
        A1Z().setInputType(0);
        A1Z().setFocusable(false);
        TextEmojiLabel textEmojiLabel = this.A01;
        if (textEmojiLabel != null) {
            Rect rect = AnonymousClass0BN.A0A;
            C21060yb r2 = this.A04;
            if (r2 != null) {
                textEmojiLabel.setAccessibilityHelper(new C34011gJ(textEmojiLabel, r2));
                TextEmojiLabel textEmojiLabel2 = this.A01;
                if (textEmojiLabel2 != null) {
                    C20810yC r1 = this.A06;
                    if (r1 != null) {
                        C36331k8.A1A(r1, textEmojiLabel2);
                        TextEmojiLabel textEmojiLabel3 = this.A01;
                        if (textEmojiLabel3 != null) {
                            C32681e1 r6 = this.A08;
                            if (r6 != null) {
                                Context A1D = A1D();
                                String A0n = A0n(R.string.f12nameremoved);
                                String[] strArr = {"p2m-lite-desc-link"};
                                String[] strArr2 = new String[1];
                                AnonymousClass1N3 r3 = this.A03;
                                if (r3 != null) {
                                    C20810yC r22 = this.A06;
                                    if (r22 != null) {
                                        String A092 = r22.A09(2701);
                                        C18740tg.A06(A092);
                                        strArr2[0] = C165597tg.A0k(r3, A092);
                                        textEmojiLabel3.setText(r6.A01(A1D, A0n, new Runnable[]{new AVY(this, 27)}, strArr, strArr2));
                                        AnonymousClass02E r32 = this.A0I;
                                        Calendar calendar = this.A0A;
                                        calendar.set(1, calendar.get(1) - 18);
                                        C93154fy r5 = new C93154fy(this.A0B, A0a(), (Calendar) null, R.style.f13nameremoved, calendar.get(1), calendar.get(2), calendar.get(5));
                                        r5.A01.setMaxDate(calendar.getTimeInMillis());
                                        C36421kH.A12(A1Z(), r5, 3);
                                        A1Z().addTextChangedListener(new B7U(this, 3));
                                        A1b(A00(this, C36421kH.A0Z(A1Z())));
                                        WDSButton wDSButton2 = this.A09;
                                        if (wDSButton2 != null) {
                                            C36421kH.A12(wDSButton2, this, 4);
                                            C36371kC.A1F(C36361kB.A0G(A0J, R.id.close_btn), this, r32, 39);
                                            return A0J;
                                        }
                                        throw C36331k8.A0d("continueButton");
                                    }
                                    throw C36321k7.A07();
                                }
                                throw C36331k8.A0d("waLinkFactory");
                            }
                            throw C36331k8.A0b();
                        }
                        throw C36331k8.A0d("descText");
                    }
                    throw C36321k7.A07();
                }
                throw C36331k8.A0d("descText");
            }
            throw C36331k8.A0d("systemServices");
        }
        throw C36331k8.A0d("descText");
    }

    public void A1a(Integer num, String str, String str2, int i) {
        P2mLiteConfirmDateOfBirthBottomSheetFragment p2mLiteConfirmDateOfBirthBottomSheetFragment = (P2mLiteConfirmDateOfBirthBottomSheetFragment) this;
        AF6 af6 = p2mLiteConfirmDateOfBirthBottomSheetFragment.A00;
        if (af6 != null) {
            af6.A01(AnonymousClass9ZG.A00(), num, str, str2, p2mLiteConfirmDateOfBirthBottomSheetFragment.A02, p2mLiteConfirmDateOfBirthBottomSheetFragment.A01, i, true);
            return;
        }
        throw C36331k8.A0d("p2mLiteEventLogger");
    }

    public final WaEditText A1Z() {
        WaEditText waEditText = this.A02;
        if (waEditText != null) {
            return waEditText;
        }
        throw C36331k8.A0d("dobEditText");
    }

    public final void A1b(boolean z) {
        WDSButton wDSButton = this.A09;
        if (wDSButton != null) {
            wDSButton.setEnabled(z);
            return;
        }
        throw C36331k8.A0d("continueButton");
    }

    public ConfirmDateOfBirthBottomSheetFragment() {
        Calendar instance = Calendar.getInstance();
        AnonymousClass00C.A08(instance);
        this.A0A = instance;
    }

    public static final boolean A00(ConfirmDateOfBirthBottomSheetFragment confirmDateOfBirthBottomSheetFragment, String str) {
        int length = str.length();
        if (length != 0) {
            if (length <= 0) {
                return true;
            }
            C18820ts r0 = confirmDateOfBirthBottomSheetFragment.A05;
            if (r0 != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", C36401kF.A0x(r0));
                simpleDateFormat.setLenient(false);
                try {
                    simpleDateFormat.parse(str);
                    return true;
                } catch (ParseException unused) {
                }
            } else {
                throw C36321k7.A09();
            }
        }
        return false;
    }
}
