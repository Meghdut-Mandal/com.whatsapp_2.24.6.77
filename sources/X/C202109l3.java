package X;

import android.content.SharedPreferences;

/* renamed from: X.9l3  reason: invalid class name and case insensitive filesystem */
public final class C202109l3 {
    public final SharedPreferences A00;
    public final C19970wo A01;
    public final String A02;

    public int A03(C188408zX r4, String str) {
        String str2;
        AnonymousClass00C.A0D(str, 1);
        int ordinal = r4.ordinal();
        if (ordinal == 0) {
            str2 = "impressionCount";
        } else if (ordinal == 1) {
            str2 = "primaryActionCount";
        } else if (ordinal != 2) {
            str2 = "dismissActionCount";
        } else {
            str2 = "secondaryActionCount";
        }
        return C36371kC.A01(this.A00, A01(str, str2));
    }

    public long A04(C188408zX r4, String str) {
        String str2;
        AnonymousClass00C.A0D(str, 1);
        int ordinal = r4.ordinal();
        if (ordinal == 0) {
            str2 = "lastImpressionTime";
        } else if (ordinal == 1) {
            str2 = "primaryActionTime";
        } else if (ordinal != 2) {
            str2 = "dismissActionTime";
        } else {
            str2 = "secondaryActionTime";
        }
        return C36341k9.A0B(this.A00, A01(str, str2));
    }

    public C202109l3(SharedPreferences sharedPreferences, C19970wo r3, String str) {
        C36321k7.A11(r3, str, sharedPreferences);
        this.A01 = r3;
        this.A00 = sharedPreferences;
        if (str.length() == 0) {
            throw AnonymousClass001.A09("surfaceId cannot be empty");
        }
        this.A02 = str;
    }

    public static final String A00(C202109l3 r2, String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(r2.A02);
        return C90464aC.A0f(str, A0u, '/');
    }

    public static final String A01(String str, String str2) {
        if (str.length() != 0) {
            return C90464aC.A0f(str2, AnonymousClass000.A0v(str), '/');
        }
        throw AnonymousClass001.A09("promotionId cannot be empty");
    }

    public static final void A02(C202109l3 r6, String str, String str2, String str3, String str4) {
        String A012 = A01(str, str2);
        String A013 = A01(str, str3);
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = r6.A00;
        SharedPreferences.Editor putLong = sharedPreferences.edit().putInt(A012, C36371kC.A01(sharedPreferences, A012) + 1).putLong(A013, currentTimeMillis);
        if (str4 != null) {
            putLong.putLong(A00(r6, str4), currentTimeMillis);
        }
        putLong.apply();
    }
}
