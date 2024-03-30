package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6Pi  reason: invalid class name and case insensitive filesystem */
public class C131506Pi {
    public final AnonymousClass6AX A00;
    public final C1276168z A01;
    public final C1276168z A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C131506Pi r5 = (C131506Pi) obj;
            if (!C1901797e.A00(this.A02, r5.A02) || !C1901797e.A00(this.A00, r5.A00) || !C1901797e.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public static C131506Pi A00(JSONObject jSONObject) {
        C1276168z r3;
        long[] jArr;
        Long l;
        AnonymousClass6AX r2;
        C1276168z r4 = null;
        if (jSONObject.has("start")) {
            r3 = new C1276168z(jSONObject.getLong("start"));
        } else {
            r3 = null;
        }
        if (jSONObject.has("repeat")) {
            JSONArray jSONArray = jSONObject.getJSONArray("repeat");
            jArr = new long[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                jArr[i] = jSONArray.getLong(i);
            }
        } else {
            jArr = null;
        }
        if (jSONObject.has("static")) {
            l = Long.valueOf(jSONObject.getLong("static"));
        } else {
            l = null;
        }
        if (jArr == null || l == null) {
            r2 = null;
        } else {
            r2 = new AnonymousClass6AX(jArr, l.longValue());
        }
        if (jSONObject.has("end")) {
            r4 = new C1276168z(jSONObject.getLong("end"));
        }
        return new C131506Pi(r2, r3, r4, "onDemand");
    }

    public C131506Pi(AnonymousClass6AX r2, C1276168z r3, C1276168z r4, String str) {
        this.A02 = r3;
        this.A00 = r2;
        this.A01 = r4;
        if (str.isEmpty()) {
            this.A03 = "onDemand";
        } else {
            this.A03 = str;
        }
    }

    public JSONObject A01() {
        JSONObject A1B = C36441kJ.A1B();
        C1276168z r0 = this.A02;
        if (r0 != null) {
            A1B.put("start", r0.A00);
        }
        AnonymousClass6AX r7 = this.A00;
        if (r7 != null) {
            long[] jArr = r7.A01;
            if (jArr != null) {
                JSONArray A0u = C90524aI.A0u();
                for (long valueOf : jArr) {
                    A0u.put(Long.valueOf(valueOf));
                }
                A1B.put("repeat", A0u);
            }
            A1B.put("static", r7.A00);
        }
        C1276168z r02 = this.A01;
        if (r02 != null) {
            A1B.put("end", r02.A00);
        }
        return A1B;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = this.A02;
        A1Q[1] = this.A00;
        return C90484aE.A0D(this.A01, A1Q);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UserNoticeContentTiming{start=");
        A0u.append(this.A02);
        A0u.append(", duration=");
        A0u.append(this.A00);
        A0u.append(", end=");
        return C90464aC.A0X(this.A01, A0u);
    }
}
