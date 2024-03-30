package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: X.9uc  reason: invalid class name and case insensitive filesystem */
public class C207139uc implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(32);
    public final C206869u8 A00;
    public final Integer A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a A[Catch:{ 19b -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0089 A[Catch:{ 19b -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008f A[Catch:{ 19b -> 0x0092 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C207139uc A00(X.C203399nx r9) {
        /*
            java.lang.String r5 = "kyc-rejection-code"
            r2 = 0
            java.lang.String r0 = "kyc-state"
            java.lang.String r4 = r9.A0i(r0, r2)     // Catch:{ 19b -> 0x0092 }
            java.lang.String r0 = "kyc-actions-requested"
            X.9nx r3 = r9.A0c(r0)     // Catch:{ 19b -> 0x0092 }
            if (r3 == 0) goto L_0x0053
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()     // Catch:{ 19b -> 0x0092 }
            java.lang.String r0 = "obligation"
            java.lang.String r1 = r3.A0h(r0)     // Catch:{ 19b -> 0x0092 }
            java.lang.String r0 = "upload-document"
            java.util.Iterator r8 = X.C203399nx.A08(r3, r0)     // Catch:{ 19b -> 0x0092 }
        L_0x0021:
            boolean r0 = r8.hasNext()     // Catch:{ 19b -> 0x0092 }
            if (r0 == 0) goto L_0x0055
            X.9nx r7 = X.C36431kI.A0s(r8)     // Catch:{ 19b -> 0x0092 }
            java.lang.String r0 = "type"
            java.lang.String r7 = r7.A0h(r0)     // Catch:{ 19b -> 0x0092 }
            java.lang.String r0 = "PROOF_OF_IDENTITY"
            boolean r0 = r0.equals(r7)     // Catch:{ 19b -> 0x0092 }
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "UPLOAD_DOC_IDENTITY"
        L_0x003b:
            r6.add(r0)     // Catch:{ 19b -> 0x0092 }
            goto L_0x0021
        L_0x003f:
            java.lang.String r0 = "PROOF_OF_ADDRESS"
            boolean r0 = r0.equals(r7)     // Catch:{ 19b -> 0x0092 }
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = "UPLOAD_DOC_ADDRESS"
            goto L_0x003b
        L_0x004a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 19b -> 0x0092 }
            java.lang.String r0 = "PAY: KycActionsRequested/fromProtocolTreeNode non-supported action type: "
            X.C36321k7.A1P(r0, r7, r1)     // Catch:{ 19b -> 0x0092 }
        L_0x0053:
            r3 = r2
            goto L_0x0074
        L_0x0055:
            java.lang.String r0 = "verify-card"
            X.9nx r0 = r3.A0c(r0)     // Catch:{ 19b -> 0x0092 }
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = "VERIFY_CARD"
            r6.add(r0)     // Catch:{ 19b -> 0x0092 }
        L_0x0062:
            java.lang.String r0 = "provide-ssn-last4"
            X.9nx r0 = r3.A0c(r0)     // Catch:{ 19b -> 0x0092 }
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = "PROVIDE_SSN_LAST4"
            r6.add(r0)     // Catch:{ 19b -> 0x0092 }
        L_0x006f:
            X.9u8 r3 = new X.9u8     // Catch:{ 19b -> 0x0092 }
            r3.<init>(r1, r6)     // Catch:{ 19b -> 0x0092 }
        L_0x0074:
            java.lang.String r0 = r9.A0i(r5, r2)     // Catch:{ 19b -> 0x0092 }
            if (r0 == 0) goto L_0x008f
            r0 = 0
            int r0 = r9.A0S(r5, r0)     // Catch:{ 19b -> 0x0092 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ 19b -> 0x0092 }
        L_0x0083:
            boolean r0 = X.AnonymousClass14B.A0F(r4)     // Catch:{ 19b -> 0x0092 }
            if (r0 != 0) goto L_0x0098
            X.9uc r0 = new X.9uc     // Catch:{ 19b -> 0x0092 }
            r0.<init>(r3, r1, r4)     // Catch:{ 19b -> 0x0092 }
            goto L_0x0091
        L_0x008f:
            r1 = r2
            goto L_0x0083
        L_0x0091:
            return r0
        L_0x0092:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentKycInfo/fromProtocolTreeNode "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0098:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207139uc.A00(X.9nx):X.9uc");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.A02);
        Integer num = this.A01;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        parcel.writeInt(i2);
        parcel.writeParcelable(this.A00, i);
    }

    public C207139uc(C206869u8 r1, Integer num, String str) {
        this.A02 = str;
        this.A01 = num;
        this.A00 = r1;
    }

    public C207139uc(Parcel parcel) {
        Integer valueOf;
        String readString = parcel.readString();
        Objects.requireNonNull(readString);
        this.A02 = readString;
        int readInt = parcel.readInt();
        if (readInt == -1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(readInt);
        }
        this.A01 = valueOf;
        this.A00 = (C206869u8) C36411kG.A0H(parcel, C206869u8.class);
    }
}
