package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1EY  reason: invalid class name */
public class AnonymousClass1EY {
    public static final C24851Ea A05 = new C24851Ea("unset", (String) null, false);
    public C24601Db A00;
    public AnonymousClass1EW A01;
    public C24631De A02;
    public String A03;
    public final C24611Dc A04 = C24611Dc.A00("BasePaymentAccountSetup", "onboarding", "COMMON");

    private synchronized void A01(List list) {
        JSONObject jSONObject = new JSONObject();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C24851Ea r3 = (C24851Ea) it.next();
            String str = r3.A00;
            if (!TextUtils.isEmpty(str)) {
                try {
                    String str2 = r3.A03;
                    if (r3.A02) {
                        str = "skipped";
                    }
                    jSONObject.put(str2, str);
                } catch (JSONException e) {
                    this.A04.A0A("setCompletedStep threw: ", e);
                }
            }
        }
        C24611Dc r2 = this.A04;
        StringBuilder sb = new StringBuilder();
        sb.append("storing steps: ");
        sb.append(jSONObject);
        r2.A06(sb.toString());
        C24601Db r0 = this.A00;
        String str3 = this.A03;
        r0.A03().edit().putString(C24601Db.A00(str3), jSONObject.toString()).apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean A02(int r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            X.1Db r0 = r10.A00     // Catch:{ all -> 0x006f }
            android.content.SharedPreferences r2 = r0.A03()     // Catch:{ all -> 0x006f }
            java.lang.String r1 = "has_p2mlite_account"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)     // Catch:{ all -> 0x006f }
            r6 = 1
            if (r0 != 0) goto L_0x006d
            X.1De r0 = r10.A02     // Catch:{ all -> 0x006f }
            X.9l8 r1 = r0.A02()     // Catch:{ all -> 0x006f }
            r9 = 0
            if (r1 == 0) goto L_0x006b
            java.lang.String r0 = r10.A03     // Catch:{ all -> 0x006f }
            X.1Ea[] r5 = r1.A03(r0)     // Catch:{ all -> 0x006f }
            if (r5 == 0) goto L_0x006b
            int r4 = r5.length     // Catch:{ all -> 0x006f }
            if (r4 == 0) goto L_0x006b
            java.util.ArrayList r3 = r10.A05()     // Catch:{ all -> 0x006f }
            r2 = 0
        L_0x002a:
            r7 = r5[r2]     // Catch:{ all -> 0x006f }
            r8 = 0
        L_0x002d:
            int r0 = r3.size()     // Catch:{ all -> 0x006f }
            if (r8 >= r0) goto L_0x0046
            java.lang.Object r0 = r3.get(r8)     // Catch:{ all -> 0x006f }
            X.1Ea r0 = (X.C24851Ea) r0     // Catch:{ all -> 0x006f }
            java.lang.String r1 = r0.A03     // Catch:{ all -> 0x006f }
            java.lang.String r0 = r7.A03     // Catch:{ all -> 0x006f }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x0047
            int r8 = r8 + 1
            goto L_0x002d
        L_0x0046:
            r8 = -1
        L_0x0047:
            if (r11 == r6) goto L_0x0053
            java.lang.String r1 = r7.A03     // Catch:{ all -> 0x006f }
            java.lang.String r0 = "2fa"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x0066
        L_0x0053:
            if (r8 < 0) goto L_0x006b
            java.lang.Object r0 = r3.get(r8)     // Catch:{ all -> 0x006f }
            X.1Ea r0 = (X.C24851Ea) r0     // Catch:{ all -> 0x006f }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x006f }
            java.lang.String r0 = r7.A00     // Catch:{ all -> 0x006f }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x0066
            goto L_0x006b
        L_0x0066:
            int r2 = r2 + 1
            if (r2 >= r4) goto L_0x006d
            goto L_0x002a
        L_0x006b:
            monitor-exit(r10)
            return r9
        L_0x006d:
            monitor-exit(r10)
            return r6
        L_0x006f:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1EY.A02(int):boolean");
    }

    public synchronized C24851Ea A03() {
        C24851Ea r0;
        ArrayList A06 = A06(A05());
        r0 = null;
        if (!A06.isEmpty()) {
            r0 = (C24851Ea) A06.get(0);
        }
        return r0;
    }

    public synchronized ArrayList A05() {
        ArrayList arrayList;
        String string = this.A00.A03().getString(C24601Db.A00(this.A03), "");
        arrayList = new ArrayList();
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string2 = jSONObject.getString(next);
                    boolean equals = string2.equals("skipped");
                    if (equals) {
                        string2 = "-1";
                    }
                    C24851Ea r0 = new C24851Ea(next, string2, false);
                    r0.A02 = equals;
                    arrayList.add(r0);
                }
            } catch (JSONException e) {
                this.A04.A0A("getCompletedStep threw: ", e);
            }
        }
        return arrayList;
    }

    public synchronized ArrayList A06(List list) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        C202159l8 A022 = this.A02.A02();
        if (A022 != null) {
            for (C24851Ea r8 : A022.A03(this.A03)) {
                int i = 0;
                while (true) {
                    if (i < list.size()) {
                        if (((C24851Ea) list.get(i)).A03.equals(r8.A03)) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i < 0 || !((C24851Ea) list.get(i)).A00.equals(r8.A00) || (((C24851Ea) list.get(i)).A02 && !r8.A01)) {
                    arrayList.add(new C24851Ea(r8.A03, r8.A00, r8.A01));
                }
            }
        }
        return arrayList;
    }

    public synchronized void A07() {
        this.A00.A0I(this.A03);
        A00();
    }

    public synchronized void A08() {
        C24601Db r5 = this.A00;
        String str = this.A03;
        String string = r5.A03().getString(C24601Db.A00(str), "");
        boolean z = r5.A03().getBoolean("payments_sandbox", false);
        r5.A0I(str);
        A00();
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                ArrayList arrayList = new ArrayList();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!"tos_no_wallet".equals(next)) {
                        arrayList.add(next);
                    } else if (z) {
                        r5.A0P(z);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONObject.remove((String) it.next());
                }
                r5.A03().edit().putString(C24601Db.A00(str), jSONObject.toString()).apply();
            } catch (JSONException e) {
                this.A04.A0A("clearAllButTos threw: ", e);
            }
        }
        C24611Dc r3 = this.A04;
        StringBuilder sb = new StringBuilder();
        sb.append("clearAllButTos ended with steps: ");
        sb.append(r5.A03().getString(C24601Db.A00(str), ""));
        sb.append(" sandbox: ");
        sb.append(r5.A03().getBoolean("payments_sandbox", false));
        r3.A06(sb.toString());
    }

    public synchronized void A09(C24851Ea r6) {
        if (r6 != null) {
            ArrayList A052 = A05();
            Iterator it = A052.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C24851Ea r2 = (C24851Ea) it.next();
                if (r2.A03.equals(r6.A03)) {
                    A052.remove(r2);
                    A01(A052);
                    break;
                }
            }
        } else {
            C24611Dc r22 = this.A04;
            StringBuilder sb = new StringBuilder();
            sb.append("/removeCompletedStep step to remove cannot be null: ");
            sb.append(r6);
            r22.A06(sb.toString());
        }
    }

    public synchronized void A0A(C24851Ea r7) {
        if (r7 != null) {
            String str = r7.A03;
            if (!str.equals("unset")) {
                ArrayList A052 = A05();
                ArrayList A06 = A06(A052);
                Iterator it = A052.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C24851Ea) it.next()).A03.equals(str)) {
                            break;
                        }
                    } else {
                        A052.add(r7);
                        Iterator it2 = A06.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C24851Ea r1 = (C24851Ea) it2.next();
                            if (r1.A03.equals(str)) {
                                A06.remove(r1);
                                break;
                            }
                        }
                        C24611Dc r2 = this.A04;
                        StringBuilder sb = new StringBuilder();
                        sb.append("setCompletedStep setting step: ");
                        sb.append(r7);
                        sb.append(" as complete making completed steps: ");
                        sb.append(A052);
                        sb.append(" incomplete steps: ");
                        sb.append(A06);
                        r2.A06(sb.toString());
                        A01(A052);
                    }
                }
            }
        }
    }

    public synchronized void A0B(String str) {
        A0A(A04(str));
    }

    public synchronized boolean A0C() {
        boolean z;
        C202159l8 A022 = this.A02.A02();
        z = false;
        if (A022 != null && !A022.A07 && (A0G("tos_no_wallet") || A0G("tos_with_wallet"))) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (A0F() != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0D() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A0E()     // Catch:{ all -> 0x0011 }
            if (r0 != 0) goto L_0x000e
            boolean r1 = r2.A0F()     // Catch:{ all -> 0x0011 }
            r0 = 0
            if (r1 == 0) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            monitor-exit(r2)
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1EY.A0D():boolean");
    }

    public synchronized boolean A0E() {
        return A02(1);
    }

    public synchronized boolean A0F() {
        return A02(2);
    }

    private void A00() {
        ArrayList arrayList = new ArrayList();
        AnonymousClass1EW r3 = this.A01;
        Iterator it = r3.A04().iterator();
        while (it.hasNext()) {
            C21667AUj aUj = (C21667AUj) it.next();
            if (aUj.A03 != null) {
                arrayList.add(aUj.A06);
            }
        }
        if (arrayList.size() > 0) {
            r3.A06(arrayList);
        }
    }

    public C24851Ea A04(String str) {
        C202159l8 A022 = this.A02.A02();
        if (A022 == null) {
            return null;
        }
        for (C24851Ea r1 : A022.A03(this.A03)) {
            if (r1.A03.equals(str)) {
                return r1;
            }
        }
        return null;
    }

    public AnonymousClass1EY(AnonymousClass1EW r4, C24601Db r5, C24631De r6, String str) {
        this.A01 = r4;
        this.A00 = r5;
        this.A02 = r6;
        this.A03 = str;
    }

    public boolean A0G(String str) {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            if (((C24851Ea) it.next()).A03.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
