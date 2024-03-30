package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity;

public class B6s extends AnonymousClass04N {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    public B6s(Object obj, String str, String str2, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A01 = str2;
    }

    public AnonymousClass04R B3o(Class cls) {
        Class cls2 = cls;
        if (this.A03 != 0) {
            if (cls2.isAssignableFrom(C167757yl.class)) {
                IndiaUpiQrCodeUrlValidationActivity indiaUpiQrCodeUrlValidationActivity = (IndiaUpiQrCodeUrlValidationActivity) this.A00;
                C21100yf r7 = indiaUpiQrCodeUrlValidationActivity.A06;
                C197639c2 r6 = indiaUpiQrCodeUrlValidationActivity.A05;
                C167757yl r8 = new C167757yl(r7, indiaUpiQrCodeUrlValidationActivity.A00, indiaUpiQrCodeUrlValidationActivity.A02, indiaUpiQrCodeUrlValidationActivity.A04, r6);
                BA9 ba9 = new BA9(this, 45);
                C28201Rs r1 = r8.A00;
                r1.A08(indiaUpiQrCodeUrlValidationActivity, ba9);
                String str = this.A02;
                String str2 = this.A01;
                if (TextUtils.isEmpty(str)) {
                    C193699Mm.A00(r1, 0);
                    return r8;
                }
                r8.A01 = str2;
                r8.A03.A0D(C203479o6.A01(str, str2));
                C197639c2 r5 = r8.A07;
                C135086c7 A0P = C165617ti.A0P(C146356vT.A00(), String.class, r8.A0S().A0O, "upiHandle");
                C191939Fb r0 = new C191939Fb(r8);
                AnonymousClass9OF r62 = r5.A01;
                Context context = r62.A01.A00;
                AnonymousClass17Y r82 = r62.A00;
                AnonymousClass19A r10 = r62.A03;
                C29131Vl r12 = r62.A09;
                new AnonymousClass8gL(context, r82, r62.A02, r10, r62.A04, r62.A05, r62.A06, r62.A07, r62.A08, r12).A01(A0P, (C135086c7) null, new AE2(indiaUpiQrCodeUrlValidationActivity, A0P, r5, r0));
                return r8;
            }
            throw AnonymousClass001.A08("Invalid viewModel");
        } else if (cls2.isAssignableFrom(C167617yQ.class)) {
            IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment = (IndiaUpiQrCodeScannedDialogFragment) this.A00;
            C19630wG r9 = indiaUpiQrCodeScannedDialogFragment.A0D;
            C20810yC r83 = indiaUpiQrCodeScannedDialogFragment.A0F;
            C167617yQ r102 = new C167617yQ(indiaUpiQrCodeScannedDialogFragment.A0B, r9, indiaUpiQrCodeScannedDialogFragment.A0E, r83, indiaUpiQrCodeScannedDialogFragment.A0I, indiaUpiQrCodeScannedDialogFragment.A0J, indiaUpiQrCodeScannedDialogFragment.A0K);
            BA9 ba92 = new BA9(this, 39);
            BA9 ba93 = new BA9(this, 41);
            BA9 ba94 = new BA9(this, 37);
            BA9 ba95 = new BA9(this, 38);
            BA9 ba96 = new BA9(this, 42);
            BA9 ba97 = new BA9(this, 43);
            BA9 ba98 = new BA9(this, 40);
            BA9 ba99 = new BA9(this, 36);
            BA9 ba910 = new BA9(this, 44);
            r102.A02.A08(indiaUpiQrCodeScannedDialogFragment, ba92);
            r102.A05.A08(indiaUpiQrCodeScannedDialogFragment, ba93);
            r102.A09.A08(indiaUpiQrCodeScannedDialogFragment, ba94);
            r102.A08.A08(indiaUpiQrCodeScannedDialogFragment, ba95);
            r102.A01.A08(indiaUpiQrCodeScannedDialogFragment, ba96);
            r102.A00.A08(indiaUpiQrCodeScannedDialogFragment, ba97);
            r102.A03.A08(indiaUpiQrCodeScannedDialogFragment, ba98);
            r102.A07.A08(indiaUpiQrCodeScannedDialogFragment, ba99);
            r102.A04.A08(indiaUpiQrCodeScannedDialogFragment, ba910);
            r102.A0A.A08(indiaUpiQrCodeScannedDialogFragment, new BA9(this, 35));
            r102.A0S(this.A02, this.A01);
            return r102;
        } else {
            throw AnonymousClass001.A08("Invalid viewModel");
        }
    }
}
