package com.google.android.gms.auth.api.signin;

import X.AnonymousClass001;
import X.AnonymousClass0Z9;
import X.C06370Ti;
import X.C07240Ww;
import X.C07990a1;
import X.C10440eF;
import X.C12120hX;
import X.C17370rB;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public class GoogleSignInOptions extends C10440eF implements C17370rB, ReflectedParcelable {
    public static Comparator A0B = new C12120hX();
    public static final GoogleSignInOptions A0C;
    public static final GoogleSignInOptions A0D;
    public static final Scope A0E = new Scope(1, "profile");
    public static final Scope A0F = new Scope(1, "openid");
    public static final Scope A0G;
    public static final Scope A0H = new Scope(1, "https://www.googleapis.com/auth/games");
    public static final Parcelable.Creator CREATOR = new C07990a1();
    public Account A00;
    public String A01;
    public String A02;
    public String A03;
    public ArrayList A04;
    public boolean A05;
    public Map A06;
    public final int A07;
    public final ArrayList A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r6.A00 == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (android.text.TextUtils.isEmpty(r6.A01) != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 0
            if (r6 != 0) goto L_0x0004
            return r4
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r6 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r6     // Catch:{ ClassCastException -> 0x007e }
            java.util.ArrayList r0 = r5.A04     // Catch:{ ClassCastException -> 0x007e }
            int r0 = r0.size()     // Catch:{ ClassCastException -> 0x007e }
            if (r0 > 0) goto L_0x007e
            java.util.ArrayList r0 = r6.A04     // Catch:{ ClassCastException -> 0x007e }
            int r0 = r0.size()     // Catch:{ ClassCastException -> 0x007e }
            if (r0 > 0) goto L_0x007e
            java.util.ArrayList r3 = r5.A08     // Catch:{ ClassCastException -> 0x007e }
            int r2 = r3.size()     // Catch:{ ClassCastException -> 0x007e }
            java.util.ArrayList r1 = r6.A08     // Catch:{ ClassCastException -> 0x007e }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ ClassCastException -> 0x007e }
            r0.<init>(r1)     // Catch:{ ClassCastException -> 0x007e }
            int r0 = r0.size()     // Catch:{ ClassCastException -> 0x007e }
            if (r2 != r0) goto L_0x007e
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ ClassCastException -> 0x007e }
            r0.<init>(r1)     // Catch:{ ClassCastException -> 0x007e }
            boolean r0 = r3.containsAll(r0)     // Catch:{ ClassCastException -> 0x007e }
            if (r0 == 0) goto L_0x007e
            android.accounts.Account r1 = r5.A00     // Catch:{ ClassCastException -> 0x007e }
            if (r1 != 0) goto L_0x005a
            android.accounts.Account r0 = r6.A00     // Catch:{ ClassCastException -> 0x007e }
            if (r0 != 0) goto L_0x007e
        L_0x003c:
            java.lang.String r1 = r5.A01     // Catch:{ ClassCastException -> 0x007e }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x007e }
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = r6.A01     // Catch:{ ClassCastException -> 0x007e }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ ClassCastException -> 0x007e }
            if (r0 == 0) goto L_0x007e
        L_0x004c:
            boolean r1 = r5.A0A     // Catch:{ ClassCastException -> 0x007e }
            boolean r0 = r6.A0A     // Catch:{ ClassCastException -> 0x007e }
            goto L_0x0063
        L_0x0051:
            java.lang.String r0 = r6.A01     // Catch:{ ClassCastException -> 0x007e }
            boolean r0 = r1.equals(r0)     // Catch:{ ClassCastException -> 0x007e }
            if (r0 != 0) goto L_0x004c
            goto L_0x007d
        L_0x005a:
            android.accounts.Account r0 = r6.A00     // Catch:{ ClassCastException -> 0x007e }
            boolean r0 = r1.equals(r0)     // Catch:{ ClassCastException -> 0x007e }
            if (r0 == 0) goto L_0x007e
            goto L_0x003c
        L_0x0063:
            if (r1 != r0) goto L_0x007e
            boolean r1 = r5.A05     // Catch:{ ClassCastException -> 0x007e }
            boolean r0 = r6.A05     // Catch:{ ClassCastException -> 0x007e }
            if (r1 != r0) goto L_0x007e
            boolean r1 = r5.A09     // Catch:{ ClassCastException -> 0x007e }
            boolean r0 = r6.A09     // Catch:{ ClassCastException -> 0x007e }
            if (r1 != r0) goto L_0x007e
            java.lang.String r1 = r5.A03     // Catch:{ ClassCastException -> 0x007e }
            java.lang.String r0 = r6.A03     // Catch:{ ClassCastException -> 0x007e }
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch:{ ClassCastException -> 0x007e }
            if (r0 == 0) goto L_0x007e
            r0 = 1
            return r0
        L_0x007d:
            return r4
        L_0x007e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    static {
        new Scope(1, "email");
        Scope scope = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        A0G = scope;
        C07240Ww r2 = new C07240Ww();
        Set set = r2.A01;
        set.add(A0F);
        set.add(A0E);
        A0D = r2.A00();
        C07240Ww r22 = new C07240Ww();
        Set set2 = r22.A01;
        set2.add(scope);
        set2.addAll(Arrays.asList(new Scope[0]));
        A0C = r22.A00();
    }

    public GoogleSignInOptions(Account account, String str, String str2, String str3, ArrayList arrayList, Map map, int i, boolean z, boolean z2, boolean z3) {
        this.A07 = i;
        this.A08 = arrayList;
        this.A00 = account;
        this.A05 = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A01 = str;
        this.A02 = str2;
        this.A04 = new ArrayList(map.values());
        this.A06 = map;
        this.A03 = str3;
    }

    public int hashCode() {
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList arrayList = this.A08;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            A0I.add(((Scope) arrayList.get(i)).A01);
        }
        Collections.sort(A0I);
        C06370Ti r3 = new C06370Ti();
        r3.A00(A0I);
        r3.A00(this.A00);
        r3.A00(this.A01);
        int i2 = (31 * r3.A00) + (this.A0A ? 1 : 0);
        r3.A00 = i2;
        int i3 = (31 * i2) + (this.A05 ? 1 : 0);
        r3.A00 = i3;
        r3.A00 = (31 * i3) + (this.A09 ? 1 : 0);
        r3.A00(this.A03);
        return r3.A00;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A07);
        AnonymousClass0Z9.A0E(parcel, new ArrayList(this.A08), 2, false);
        AnonymousClass0Z9.A0B(parcel, this.A00, 3, i, false);
        AnonymousClass0Z9.A0A(parcel, 4, this.A05);
        AnonymousClass0Z9.A0A(parcel, 5, this.A09);
        AnonymousClass0Z9.A0A(parcel, 6, this.A0A);
        AnonymousClass0Z9.A0C(parcel, this.A01, 7, false);
        AnonymousClass0Z9.A0C(parcel, this.A02, 8, false);
        AnonymousClass0Z9.A0E(parcel, this.A04, 9, false);
        AnonymousClass0Z9.A0C(parcel, this.A03, 10, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
