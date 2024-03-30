package X;

import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.9df  reason: invalid class name and case insensitive filesystem */
public class C198499df {
    public final C202029kv A00;

    public static void A00(C173508Ry r2, C46912bs r3, boolean z) {
        r3.A00 = r2.degreesLatitude_;
        r3.A01 = r2.degreesLongitude_;
        int i = r2.bitField0_;
        if ((i & 16) != 0) {
            r3.A02 = r2.url_;
        }
        if ((i & 4) != 0) {
            r3.A01 = r2.name_;
        }
        if ((i & 8) != 0) {
            r3.A00 = r2.address_;
        }
        if ((i & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            r3.A1D(r2.jpegThumbnail_.A06(), z);
            r3.A02 = 2;
        }
    }

    public C198499df(C202029kv r1) {
        this.A00 = r1;
    }

    public void A01(AnonymousClass8K7 r6, C80103un r7, C46912bs r8, byte[] bArr, boolean z) {
        C63683Kz A0V = r8.A0V();
        double d = r8.A00;
        C173508Ry r3 = (C173508Ry) C90524aI.A0H(r6);
        int i = C173508Ry.ACCURACY_IN_METERS_FIELD_NUMBER;
        r3.bitField0_ |= 1;
        r3.degreesLatitude_ = d;
        double d2 = r8.A01;
        C173508Ry r32 = (C173508Ry) C90524aI.A0H(r6);
        r32.bitField0_ |= 2;
        r32.degreesLongitude_ = d2;
        if (!TextUtils.isEmpty(r8.A02)) {
            String str = r8.A02;
            C173508Ry r1 = (C173508Ry) C90524aI.A0H(r6);
            str.getClass();
            r1.bitField0_ |= 16;
            r1.url_ = str;
        }
        if (!TextUtils.isEmpty(r8.A01)) {
            String str2 = r8.A01;
            C173508Ry r12 = (C173508Ry) C90524aI.A0H(r6);
            str2.getClass();
            r12.bitField0_ |= 4;
            r12.name_ = str2;
        }
        if (!TextUtils.isEmpty(r8.A00)) {
            String str3 = r8.A00;
            C173508Ry r13 = (C173508Ry) C90524aI.A0H(r6);
            str3.getClass();
            r13.bitField0_ |= 8;
            r13.address_ = str3;
        }
        if (!z && A0V.A02() != null) {
            AnonymousClass8I5 A0O = C90474aD.A0O(r6, A0V.A02());
            C173508Ry r14 = (C173508Ry) r6.A00;
            r14.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            r14.jpegThumbnail_ = A0O;
        }
        if (C202029kv.A02(r7, r8, bArr)) {
            AnonymousClass8SG A03 = this.A00.A03(r7, r8, bArr, z);
            C173508Ry r15 = (C173508Ry) C90524aI.A0H(r6);
            A03.getClass();
            r15.contextInfo_ = A03;
            r15.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        }
    }
}
