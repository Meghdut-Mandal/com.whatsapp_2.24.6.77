package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9gl  reason: invalid class name and case insensitive filesystem */
public final class C200169gl {
    public Set A00 = C36441kJ.A17();
    public final C20810yC A01;
    public final AE0 A02;

    public final synchronized C206719tr A01() {
        Object obj;
        Iterator it = this.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C206719tr r2 = (C206719tr) obj;
            if (AnonymousClass00C.A0J(r2.A03, "numeric_id") && AnonymousClass00C.A0J(r2.A02, "available")) {
                break;
            }
        }
        return (C206719tr) obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (X.AnonymousClass00C.A0J(r1, "blocked") != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.ArrayList A02() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Set r0 = r5.A00     // Catch:{ all -> 0x0038 }
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0038 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0038 }
        L_0x000b:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0032
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0038 }
            r0 = r2
            X.9tr r0 = (X.C206719tr) r0     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = r0.A02     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = "deregistered"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "blocked"
            boolean r1 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ all -> 0x0038 }
            r0 = 1
            if (r1 == 0) goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            if (r0 == 0) goto L_0x000b
            r4.add(r2)     // Catch:{ all -> 0x0038 }
            goto L_0x000b
        L_0x0032:
            java.util.ArrayList r0 = X.C36361kB.A0q(r4)     // Catch:{ all -> 0x0038 }
            monitor-exit(r5)
            return r0
        L_0x0038:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200169gl.A02():java.util.ArrayList");
    }

    public synchronized void A03(C206719tr r7) {
        Object obj;
        Set set = this.A00;
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (AnonymousClass00C.A0J(((C206719tr) obj).A01, r7.A01)) {
                break;
            }
        }
        C206719tr r3 = (C206719tr) obj;
        if (r3 != null) {
            Set A06 = C13640kC.A06(r3, set);
            AnonymousClass00C.A0D(A06, 0);
            LinkedHashSet linkedHashSet = new LinkedHashSet(C000300d.A02(A06.size() + 1));
            linkedHashSet.addAll(A06);
            linkedHashSet.add(r7);
            if (A00(this, linkedHashSet)) {
                set.remove(r3);
                set.add(r7);
            }
        }
    }

    public final synchronized void A04(C206719tr r7) {
        Object obj;
        synchronized (this) {
            AnonymousClass00C.A0D(r7, 0);
            Set set = this.A00;
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (AnonymousClass00C.A0J(((C206719tr) obj).A01, r7.A01)) {
                    break;
                }
            }
            if (((C206719tr) obj) != null) {
                A03(r7);
            } else if (!AnonymousClass00C.A0J(r7.A03, "mobile_number") || !A07()) {
                if (A02().size() != this.A01.A07(3114) + 1 && !set.contains(r7)) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(C000300d.A02(set.size() + 1));
                    linkedHashSet.addAll(set);
                    linkedHashSet.add(r7);
                    if (A00(this, linkedHashSet)) {
                        set.add(r7);
                    }
                }
            }
        }
    }

    public final synchronized boolean A06() {
        boolean z;
        int i;
        int A07 = this.A01.A07(3114);
        ArrayList A022 = A02();
        z = false;
        if (!(A022 instanceof Collection) || !A022.isEmpty()) {
            Iterator it = A022.iterator();
            i = 0;
            while (it.hasNext()) {
                if (AnonymousClass00C.A0J(((C206719tr) it.next()).A03, "numeric_id") && (i = i + 1) < 0) {
                    throw C36371kC.A0s();
                }
            }
        } else {
            i = 0;
        }
        if (A07 > i) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r2 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A07() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = r4.A02()     // Catch:{ all -> 0x0026 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0026 }
        L_0x0009:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0023
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0026 }
            r0 = r2
            X.9tr r0 = (X.C206719tr) r0     // Catch:{ all -> 0x0026 }
            java.lang.String r1 = r0.A03     // Catch:{ all -> 0x0026 }
            java.lang.String r0 = "mobile_number"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0009
            r0 = 1
            if (r2 != 0) goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            monitor-exit(r4)
            return r0
        L_0x0026:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200169gl.A07():boolean");
    }

    public final boolean A05() {
        String A19 = C36431kI.A19(this.A01, 2965);
        if (A19.length() != 0) {
            List A0i = C90494aF.A0i(A19, ",");
            String A0B = this.A02.A0B();
            if (!(A0i == null || A0B == null)) {
                return A0i.contains(A0B);
            }
        }
        return false;
    }

    public C200169gl(C20810yC r10, AE0 ae0) {
        String A0t;
        C36321k7.A0x(ae0, r10);
        this.A02 = ae0;
        this.A01 = r10;
        synchronized (ae0) {
            A0t = C36371kC.A0t(ae0.A01.A03(), "payments_upi_aliases");
        }
        if (A0t != null && A0t.length() != 0) {
            JSONArray jSONArray = new JSONArray(A0t);
            Iterator it = C15040mb.A05(0, jSONArray.length()).iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = jSONArray.getJSONObject(C165617ti.A05(it));
                this.A00.add(new C206719tr(C165617ti.A0P(C146356vT.A00(), String.class, jSONObject.getString("alias"), "upiAlias"), C90474aD.A0e("aliasType", jSONObject), C90474aD.A0e("aliasId", jSONObject), C90474aD.A0e("aliasStatus", jSONObject)));
            }
        }
    }

    public static final boolean A00(C200169gl r6, Set set) {
        JSONArray A0u = C90524aI.A0u();
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C206719tr r3 = (C206719tr) it.next();
                JSONObject A1B = C36441kJ.A1B();
                C165607th.A1D(r3.A00, "alias", A1B);
                A1B.put("aliasType", r3.A03);
                A1B.put("aliasId", r3.A01);
                A1B.put("aliasStatus", r3.A02);
                A0u.put(A1B);
            }
            AE0 ae0 = r6.A02;
            synchronized (ae0) {
                C24601Db r0 = ae0.A01;
                C36341k9.A0x(C90494aF.A0E(r0), "payments_upi_aliases", A0u.toString());
            }
            return true;
        } catch (JSONException unused) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs setAlias threw: an exception ");
            return false;
        }
    }
}
