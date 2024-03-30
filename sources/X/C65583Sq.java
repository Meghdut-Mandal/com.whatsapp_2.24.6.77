package X;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Objects;

/* renamed from: X.3Sq  reason: invalid class name and case insensitive filesystem */
public final class C65583Sq {
    public static final String[] A08;
    public static final String[] A09 = {"raw_contact_id", "display_name", "data1", "data2", "data3", "sort_key", "account_type", "starred"};
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C65583Sq r7 = (C65583Sq) obj;
        return this.A01 == r7.A01 && TextUtils.equals(this.A03, r7.A03) && TextUtils.equals(this.A05, r7.A05) && this.A00 == r7.A00 && TextUtils.equals(this.A04, r7.A04) && TextUtils.equals(this.A06, r7.A06) && this.A07 == r7.A07;
    }

    static {
        String[] A1S = C36441kJ.A1S();
        A1S[0] = "com.whatsapp";
        A1S[1] = "com.whatsapp.w4b";
        A08 = A1S;
    }

    public static Cursor A00(C21060yb r5, String str) {
        Log.i("phone/getcursor/query/start");
        C21050ya A0O = r5.A0O();
        if (A0O == null) {
            Log.w("phone/getcursor/cr null");
            return null;
        }
        Cursor A032 = A0O.A03(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, A09, A01(), (String[]) null, (String) null);
        Log.i("phone/getcursor/query/end");
        StringBuilder A0u = AnonymousClass000.A0u();
        if (A032 == null) {
            return A032;
        }
        A0u.append(str);
        A0u.append('/');
        C36321k7.A1Y(A0u, A032.getCount());
        return A032;
    }

    public int hashCode() {
        long j = this.A01;
        return (((((((int) (j >>> 32)) * 31) + ((int) j)) * 31) + this.A00) * 31) + C36421kH.A05(this.A05);
    }

    public C65583Sq(String str, String str2, String str3, String str4, String str5, int i, long j, boolean z) {
        Objects.requireNonNull(str2, "number must not be null");
        this.A01 = j;
        this.A03 = str;
        this.A05 = str2;
        this.A00 = i;
        this.A04 = str3;
        this.A06 = str4;
        this.A02 = str5;
        this.A07 = z;
    }

    public static String A01() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("(");
        A0u.append("account_type");
        A0u.append(" IS NULL OR (");
        A0u.append("account_type");
        A0u.append(" NOT IN (");
        char c = 0;
        while (true) {
            String[] strArr = A08;
            if (c < 1) {
                DatabaseUtils.appendEscapedSQLString(A0u, strArr[c]);
                A0u.append(",");
                c = 1;
            } else {
                DatabaseUtils.appendEscapedSQLString(A0u, strArr[1]);
                C36321k7.A1a(A0u, ")))");
                return A0u.toString();
            }
        }
    }
}
