package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8dx  reason: invalid class name and case insensitive filesystem */
public final class C177538dx extends C177618e5 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205679s2();
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C177538dx(String str) {
        super(str);
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
        int length = str.length();
        if (length != 0 && length <= 20) {
            char charAt = str.charAt(0);
            if (AnonymousClass00C.A00(charAt, 49) >= 0 && AnonymousClass00C.A00(charAt, 57) <= 0) {
                int i = 1;
                while (i < length) {
                    char charAt2 = str.charAt(i);
                    i = (AnonymousClass00C.A00(charAt2, 48) >= 0 && AnonymousClass00C.A00(charAt2, 57) <= 0) ? i + 1 : i;
                }
                return;
            }
        }
        throw new C19740wR(str);
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "broadcast";
    }

    public int getType() {
        return 3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r3.length() == 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C177538dx A00(java.lang.String r3) {
        /*
            if (r3 == 0) goto L_0x0009
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            r2 = 0
            if (r0 != 0) goto L_0x002c
            com.whatsapp.jid.Jid r1 = X.C222513o.A00(r3)     // Catch:{ all -> 0x0020 }
            boolean r0 = r1 instanceof X.C177538dx     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x001a
            X.8dx r1 = (X.C177538dx) r1     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x001a
            goto L_0x0025
        L_0x001a:
            X.0wR r0 = new X.0wR     // Catch:{ all -> 0x0020 }
            r0.<init>((java.lang.String) r3)     // Catch:{ all -> 0x0020 }
            throw r0     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r0 = move-exception
            X.03N r1 = X.C90524aI.A0t(r0)
        L_0x0025:
            boolean r0 = r1 instanceof X.AnonymousClass03N
            if (r0 != 0) goto L_0x002a
            r2 = r1
        L_0x002a:
            X.8dx r2 = (X.C177538dx) r2
        L_0x002c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177538dx.A00(java.lang.String):X.8dx");
    }

    public String getObfuscatedString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(AnonymousClass14B.A0B(this.user, 4));
        A0u.append('@');
        return AnonymousClass000.A0q("broadcast", A0u);
    }
}
