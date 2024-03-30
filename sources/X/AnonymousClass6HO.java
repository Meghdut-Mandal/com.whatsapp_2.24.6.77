package X;

import org.json.JSONObject;

/* renamed from: X.6HO  reason: invalid class name */
public abstract class AnonymousClass6HO {
    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.LinkedHashMap, java.util.AbstractMap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(java.lang.Object r4) {
        /*
            boolean r0 = r4 instanceof org.json.JSONObject
            if (r0 == 0) goto L_0x002d
            java.util.LinkedHashMap r3 = X.C36431kI.A1G()
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            java.util.Iterator r2 = r4.keys()
            X.AnonymousClass00C.A08(r2)
        L_0x0011:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004f
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)
            java.lang.Object r0 = r4.get(r1)
            X.AnonymousClass00C.A0B(r1)
            X.AnonymousClass00C.A0B(r0)
            java.lang.Object r0 = A00(r0)
            r3.put(r1, r0)
            goto L_0x0011
        L_0x002d:
            boolean r0 = r4 instanceof org.json.JSONArray
            if (r0 == 0) goto L_0x0050
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            r2 = 0
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            int r1 = r4.length()
        L_0x003c:
            if (r2 >= r1) goto L_0x004f
            java.lang.Object r0 = r4.get(r2)
            X.AnonymousClass00C.A08(r0)
            java.lang.Object r0 = A00(r0)
            r3.add(r0)
            int r2 = r2 + 1
            goto L_0x003c
        L_0x004f:
            return r3
        L_0x0050:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6HO.A00(java.lang.Object):java.lang.Object");
    }

    public static final String A01(String str, String str2, JSONObject jSONObject) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str);
        }
        return str2;
    }
}
