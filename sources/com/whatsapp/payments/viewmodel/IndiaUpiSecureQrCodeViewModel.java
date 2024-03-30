package com.whatsapp.payments.viewmodel;

import X.AE0;
import X.AnonymousClass04R;
import X.AnonymousClass08S;
import X.AnonymousClass16W;
import X.AnonymousClass16X;
import X.AnonymousClass17Y;
import X.AnonymousClass19A;
import X.AnonymousClass1AL;
import X.AnonymousClass1EU;
import X.AnonymousClass6QB;
import X.AnonymousClass8gA;
import X.AnonymousClass9I1;
import X.AnonymousClass9IM;
import X.AnonymousClass9Qx;
import X.AnonymousClass9YX;
import X.B7M;
import X.BAA;
import X.C001700s;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165607th;
import X.C18740tg;
import X.C19630wG;
import X.C19900wh;
import X.C19970wo;
import X.C203479o6;
import X.C203539oF;
import X.C21100yf;
import X.C24601Db;
import X.C24631De;
import X.C29121Vk;
import X.C29221Vu;
import X.C36331k8;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public class IndiaUpiSecureQrCodeViewModel extends AnonymousClass04R {
    public final AnonymousClass08S A00;
    public final AnonymousClass08S A01;
    public final C001700s A02;
    public final C21100yf A03;
    public final C19970wo A04;
    public final C19900wh A05;
    public final AE0 A06;
    public final C29121Vk A07;
    public final AnonymousClass1EU A08;
    public final AnonymousClass17Y A09;
    public final C19630wG A0A;
    public final AnonymousClass19A A0B;
    public final C29221Vu A0C;
    public final C24631De A0D;

    public static void A01(IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel, int i) {
        if (indiaUpiSecureQrCodeViewModel.A03.A09(C21100yf.A0h)) {
            indiaUpiSecureQrCodeViewModel.A01.A0D(new AnonymousClass9IM(2, -1));
            AE0 ae0 = indiaUpiSecureQrCodeViewModel.A06;
            synchronized (ae0) {
                String[] strArr = {"signedQrCode", "signedQrCodeTs"};
                try {
                    C24601Db r3 = ae0.A01;
                    String A062 = r3.A06();
                    if (!TextUtils.isEmpty(A062)) {
                        JSONObject A1C = C36441kJ.A1C(A062);
                        int i2 = 0;
                        do {
                            A1C.remove(strArr[i2]);
                            i2++;
                        } while (i2 < 2);
                        C165577te.A1B(r3, A1C);
                    }
                } catch (JSONException e) {
                    Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteFromPaymentInfo for keys threw: ", e);
                }
            }
            C203479o6 A0S = indiaUpiSecureQrCodeViewModel.A0S();
            A0S.A0I = null;
            A0S.A04 = "02";
            indiaUpiSecureQrCodeViewModel.A00.A0D(A0S);
            Context context = indiaUpiSecureQrCodeViewModel.A0A.A00;
            AnonymousClass17Y r9 = indiaUpiSecureQrCodeViewModel.A09;
            AnonymousClass9YX r12 = new AnonymousClass9YX();
            AnonymousClass8gA r7 = new AnonymousClass8gA(context, r9, indiaUpiSecureQrCodeViewModel.A0B, indiaUpiSecureQrCodeViewModel.A0C, r12, indiaUpiSecureQrCodeViewModel.A07);
            String A072 = indiaUpiSecureQrCodeViewModel.A0S().A07();
            AnonymousClass9Qx r8 = new AnonymousClass9Qx(indiaUpiSecureQrCodeViewModel, i);
            AnonymousClass19A r92 = r7.A02;
            String A092 = r92.A09();
            AnonymousClass6QB A0T = C36421kH.A0T();
            C165567td.A1C(new AnonymousClass1AL("xmlns", "w:pay"), A0T);
            C203539oF.A0E(A0T, A092);
            AnonymousClass6QB A0a = C165587tf.A0a();
            C36331k8.A1D(A0a, "action", "upi-sign-qr-code");
            if (C203539oF.A0V(A072, 1, false)) {
                C36331k8.A1D(A0a, "qr-code", A072);
            }
            r92.A0E(new B7M(r7.A00, r7.A01, r7.A03, AnonymousClass9I1.A04(r7, "upi-sign-qr-code"), r7, r8), C165567td.A0I(A0a, A0T), A092, 204, 0);
            return;
        }
        indiaUpiSecureQrCodeViewModel.A01.A0D(new AnonymousClass9IM(0, i));
        return;
    }

    public static void A02(IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel, String str, int i) {
        AnonymousClass9IM r1;
        AnonymousClass08S r5 = indiaUpiSecureQrCodeViewModel.A00;
        C203479o6 r4 = (C203479o6) r5.A04();
        if (str.equals(r4.A0A)) {
            r1 = new AnonymousClass9IM(3, i);
        } else {
            C24631De r12 = indiaUpiSecureQrCodeViewModel.A0D;
            AnonymousClass16X r3 = ((AnonymousClass16W) r12.A01()).A01;
            AnonymousClass16X A0R = C165607th.A0R(r12.A01(), str);
            if (A0R == null || A0R.A00.compareTo(r3.A00) < 0) {
                r4.A0A = null;
                r5.A0D(r4);
                r1 = new AnonymousClass9IM(0, i);
            } else {
                r4.A0A = str;
                r5.A0D(r4);
                A01(indiaUpiSecureQrCodeViewModel, i);
                return;
            }
        }
        indiaUpiSecureQrCodeViewModel.A01.A0D(r1);
    }

    public C203479o6 A0S() {
        Object A042 = this.A00.A04();
        C18740tg.A06(A042);
        return (C203479o6) A042;
    }

    public IndiaUpiSecureQrCodeViewModel(AnonymousClass17Y r7, C21100yf r8, C19970wo r9, C19630wG r10, C19900wh r11, AnonymousClass19A r12, AE0 ae0, C29221Vu r14, C29121Vk r15, C24631De r16, AnonymousClass1EU r17) {
        AnonymousClass08S r5 = new AnonymousClass08S();
        this.A01 = r5;
        AnonymousClass08S r3 = new AnonymousClass08S();
        this.A00 = r3;
        C001700s A0S = C36431kI.A0S();
        this.A02 = A0S;
        this.A04 = r9;
        this.A09 = r7;
        this.A0A = r10;
        this.A03 = r8;
        this.A0B = r12;
        this.A08 = r17;
        this.A07 = r15;
        this.A0D = r16;
        this.A0C = r14;
        this.A06 = ae0;
        this.A05 = r11;
        r5.A0D(new AnonymousClass9IM(0, -1));
        r3.A0D(new C203479o6());
        r3.A0F(A0S, new BAA(this, 17));
    }
}
