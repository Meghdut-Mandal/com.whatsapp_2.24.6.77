package X;

/* renamed from: X.1Da  reason: invalid class name and case insensitive filesystem */
public class C24591Da {
    public final C21100yf A00;
    public final C19970wo A01;
    public final C20810yC A02;
    public final C24601Db A03;
    public final C24631De A04;
    public final C24641Df A05;

    public boolean A01() {
        if (A04(2)) {
            if (!C20800yB.A01(C21000yV.A02, this.A02, 1159)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A03() {
        if (A04(0) || A01()) {
            return true;
        }
        this.A04.A02();
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(int r9) {
        /*
            r8 = this;
            r5 = 1
            if (r9 == 0) goto L_0x0070
            if (r9 != r5) goto L_0x003b
            X.0yf r1 = r8.A00
            X.0yi r0 = X.C21100yf.A0b
        L_0x0009:
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x003b
            X.1Db r7 = r8.A03
            java.lang.String r6 = "payments_enabled_till"
            android.content.SharedPreferences r2 = r7.A03()
            r0 = -1
            long r3 = r2.getLong(r6, r0)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0032
            android.content.SharedPreferences r0 = r7.A03()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r6)
            r0.apply()
        L_0x0032:
            X.1De r0 = r8.A04
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0075
            return r5
        L_0x003b:
            X.1Db r4 = r8.A03
            android.content.SharedPreferences r2 = r4.A03()
            java.lang.String r1 = "pref_dog_food_country_code"
            r0 = 0
            java.lang.String r0 = r2.getString(r1, r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r1 = "setMockedCountry() not supported in non-debug builds"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0052:
            X.0wo r0 = r8.A01
            long r6 = X.C19970wo.A00(r0)
            if (r9 == 0) goto L_0x006d
            if (r9 == r5) goto L_0x006d
            java.lang.String r3 = "merchant_payments_enabled_till"
        L_0x005e:
            android.content.SharedPreferences r2 = r4.A03()
            r0 = -1
            long r1 = r2.getLong(r3, r0)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
            goto L_0x0032
        L_0x006d:
            java.lang.String r3 = "payments_enabled_till"
            goto L_0x005e
        L_0x0070:
            X.0yf r1 = r8.A00
            X.0yi r0 = X.C21100yf.A0c
            goto L_0x0009
        L_0x0075:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24591Da.A04(int):boolean");
    }

    public boolean A02() {
        if (this.A00.A09(C21100yf.A0b)) {
            return true;
        }
        return false;
    }

    public C24591Da(C21100yf r1, C19970wo r2, C20810yC r3, C24601Db r4, C24631De r5, C24641Df r6) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
    }
}
