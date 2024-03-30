package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9uk  reason: invalid class name and case insensitive filesystem */
public final class C207219uk implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206029sb();
    public int A00;
    public C207199ui A01;
    public C206489tU A02;
    public C206659tl A03;
    public C207089uX A04;
    public C206819u1 A05;
    public C206679tn A06;
    public AnonymousClass3XY A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public List A0C;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C207219uk) {
                C207219uk r5 = (C207219uk) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A09, r5.A09) || !AnonymousClass00C.A0J(this.A0A, r5.A0A) || !AnonymousClass00C.A0J(this.A08, r5.A08) || !AnonymousClass00C.A0J(this.A0C, r5.A0C) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A0B, r5.A0B) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A07, r5.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A00);
        C206659tl r0 = this.A03;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r0.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A08);
        Iterator A0o = C90474aD.A0o(parcel, this.A0C);
        while (A0o.hasNext()) {
            ((C206689to) A0o.next()).writeToParcel(parcel, i);
        }
        C206819u1 r02 = this.A05;
        if (r02 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r02.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A01, i);
        C206679tn r03 = this.A06;
        if (r03 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r03.writeToParcel(parcel, i);
        }
        C207089uX r04 = this.A04;
        if (r04 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r04.writeToParcel(parcel, i);
        }
        C206489tU r05 = this.A02;
        if (r05 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r05.writeToParcel(parcel, i);
        }
        AnonymousClass3XY r06 = this.A07;
        if (r06 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r06.writeToParcel(parcel, i);
    }

    public final String A02() {
        C206569tc r0;
        C207089uX r02 = this.A04;
        if (r02 == null || (r0 = (C206569tc) C007103b.A0M(r02.A03)) == null) {
            return null;
        }
        return r0.A01.A00;
    }

    public final String A03() {
        C206569tc r0;
        C207089uX r02 = this.A04;
        if (r02 == null || (r0 = (C206569tc) C007103b.A0M(r02.A03)) == null) {
            return null;
        }
        return r0.A01.A01;
    }

    public final boolean A04() {
        if (this.A01 == null || this.A00 != 3) {
            return false;
        }
        if ("review_and_pay".equals(A02()) || !A01(this) || !"payment_method".equals(A02()) || !"payment_status".equals(A02())) {
            return true;
        }
        return false;
    }

    public final boolean A05() {
        int i = this.A00;
        if ((i == 5 || i == 9) && this.A04 != null) {
            return true;
        }
        return false;
    }

    public final byte[] A06() {
        byte[] bArr;
        int i;
        C206819u1 r2 = this.A05;
        if (r2 != null && ((i = this.A00) == 2 || i == 6)) {
            return r2.A01.A02;
        }
        C207199ui r22 = this.A01;
        if (r22 != null && this.A00 == 3) {
            return r22.A0N;
        }
        C206659tl r0 = this.A03;
        if (r0 == null || (bArr = r0.A02) == null) {
            return null;
        }
        return bArr;
    }

    public int hashCode() {
        return ((((((((((((C36351kA.A05(this.A0C, ((((((((this.A00 * 31) + AnonymousClass000.A0H(this.A03)) * 31) + C36341k9.A09(this.A09)) * 31) + C36341k9.A09(this.A0A)) * 31) + C36341k9.A09(this.A08)) * 31) + AnonymousClass000.A0H(this.A05)) * 31) + C36341k9.A09(this.A0B)) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + AnonymousClass000.A0H(this.A06)) * 31) + AnonymousClass000.A0H(this.A04)) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + C36411kG.A09(this.A07);
    }

    public C207219uk(C207199ui r1, C206489tU r2, C206659tl r3, C207089uX r4, C206819u1 r5, C206679tn r6, AnonymousClass3XY r7, String str, String str2, String str3, String str4, List list, int i) {
        this.A00 = i;
        this.A03 = r3;
        this.A09 = str;
        this.A0A = str2;
        this.A08 = str3;
        this.A0C = list;
        this.A05 = r5;
        this.A0B = str4;
        this.A01 = r1;
        this.A06 = r6;
        this.A04 = r4;
        this.A02 = r2;
        this.A07 = r7;
    }

    public static C207199ui A00(C23043B1o b1o) {
        C207219uk BA8 = b1o.BA8();
        C18740tg.A06(BA8);
        C207199ui r0 = BA8.A01;
        C18740tg.A06(r0);
        return r0;
    }

    public static boolean A01(C207219uk r1) {
        return "review_order".equals(r1.A02());
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("InteractiveMessageContent(messageType=");
        A0u.append(this.A00);
        A0u.append(", header=");
        A0u.append(this.A03);
        A0u.append(", description=");
        A0u.append(this.A09);
        A0u.append(", footer=");
        A0u.append(this.A0A);
        A0u.append(", buttonText=");
        A0u.append(this.A08);
        A0u.append(", sections=");
        A0u.append(this.A0C);
        A0u.append(", productListInfo=");
        A0u.append(this.A05);
        A0u.append(", templateId=");
        A0u.append(this.A0B);
        A0u.append(", checkoutInfoContent=");
        A0u.append(this.A01);
        A0u.append(", shopContent=");
        A0u.append(this.A06);
        A0u.append(", nativeFlowContent=");
        A0u.append(this.A04);
        A0u.append(", carouselContent=");
        A0u.append(this.A02);
        A0u.append(", singleProductInfo=");
        return AnonymousClass000.A0m(this.A07, A0u);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C207219uk(C207199ui r15, C206659tl r16, C207089uX r17, String str, String str2) {
        this(r15, (C206489tU) null, r16, r17, (C206819u1) null, (C206679tn) null, (AnonymousClass3XY) null, str, str2, (String) null, (String) null, C023409w.A00, 3);
        AnonymousClass00C.A0D(r15, 4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C207219uk(X.C206659tl r15, X.C207089uX r16, java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            r14 = this;
            r0 = 4
            r10 = r19
            X.AnonymousClass00C.A0D(r10, r0)
            r13 = 5
            r4 = r16
            X.AnonymousClass00C.A0D(r4, r13)
            r1 = 0
            X.09w r12 = X.C023409w.A00
            r0 = r14
            r3 = r15
            r8 = r17
            r9 = r18
            r2 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r11 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207219uk.<init>(X.9tl, X.9uX, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
