package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9jD  reason: invalid class name and case insensitive filesystem */
public final class C201259jD {
    public final List A00;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.B2T A00() {
        /*
            r9 = this;
            java.util.List r0 = r9.A00
            java.util.Iterator r8 = r0.iterator()
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r6 = r8.next()
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0054
            r4 = r6
            X.B2T r4 = (X.B2T) r4
            boolean r0 = r4 instanceof X.AD7
            if (r0 == 0) goto L_0x006d
            r3 = r4
            X.AD7 r3 = (X.AD7) r3
            org.json.JSONObject r2 = r3.A00
            r1 = 1
            if (r2 == 0) goto L_0x0065
            java.lang.String r0 = "summary"
            boolean r0 = r2.optBoolean(r0)
            if (r0 != r1) goto L_0x0065
            r7 = 0
        L_0x002e:
            java.lang.Object r5 = r8.next()
            r4 = r5
            X.B2T r4 = (X.B2T) r4
            boolean r0 = r4 instanceof X.AD7
            if (r0 == 0) goto L_0x005f
            r3 = r4
            X.AD7 r3 = (X.AD7) r3
            org.json.JSONObject r2 = r3.A00
            r1 = 1
            if (r2 == 0) goto L_0x0057
            java.lang.String r0 = "summary"
            boolean r0 = r2.optBoolean(r0)
            if (r0 != r1) goto L_0x0057
            r0 = 0
        L_0x004a:
            if (r7 <= r0) goto L_0x004e
            r6 = r5
            r7 = r0
        L_0x004e:
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto L_0x002e
        L_0x0054:
            X.B2T r6 = (X.B2T) r6
            return r6
        L_0x0057:
            boolean r0 = r3.A00()
            if (r0 == 0) goto L_0x005f
            r0 = 1
            goto L_0x004a
        L_0x005f:
            boolean r0 = r4 instanceof X.AnonymousClass92H
            if (r0 == 0) goto L_0x004e
            r0 = 2
            goto L_0x004a
        L_0x0065:
            boolean r0 = r3.A00()
            if (r0 == 0) goto L_0x006d
            r7 = 1
            goto L_0x002e
        L_0x006d:
            boolean r0 = r4 instanceof X.AnonymousClass92H
            r7 = 3
            if (r0 == 0) goto L_0x002e
            r7 = 2
            goto L_0x002e
        L_0x0074:
            java.util.NoSuchElementException r0 = X.C165617ti.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201259jD.A00():X.B2T");
    }

    public String toString() {
        String A0p;
        List list = this.A00;
        if (list.isEmpty() || (A0p = AnonymousClass000.A0p("Response errors: ", C007103b.A0Q(",", "", "", list, new C22416AmH(this)), AnonymousClass000.A0u())) == null) {
            return "";
        }
        return A0p;
    }

    public C201259jD(Throwable th, JSONArray jSONArray) {
        ArrayList A0I = AnonymousClass001.A0I();
        this.A00 = A0I;
        if (th != null) {
            A0I.add(!(th instanceof AnonymousClass92H) ? new C177308da("Unknown error", th) : th);
        }
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                List list = this.A00;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                AnonymousClass00C.A08(jSONObject);
                list.add(new AD7(jSONObject));
            }
        }
        if (!C36401kF.A1a(this.A00)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("MexErrorSummary was used but there are no errors. Failure and rawErrors should not both be null. Failure: ");
            A0u.append(th);
            throw AnonymousClass000.A0f(jSONArray, "  rawErrors: ", A0u);
        }
    }

    public C201259jD() {
        this((Throwable) null, (JSONArray) null);
    }
}
