package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6EK  reason: invalid class name */
public abstract class AnonymousClass6EK {
    public final String A00;

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A00(org.json.JSONObject r12) {
        /*
            r11 = this;
            java.lang.String r2 = r11.A00
            boolean r0 = r12.has(r2)
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r6 = r12.get(r2)
            boolean r0 = r6 instanceof org.json.JSONArray
            if (r0 == 0) goto L_0x00e2
            org.json.JSONArray r6 = (org.json.JSONArray) r6
            int r0 = r6.length()
            java.util.ArrayList r5 = X.C36441kJ.A14(r0)
            r4 = 0
        L_0x001b:
            int r0 = r6.length()
            if (r4 >= r0) goto L_0x00e1
            boolean r0 = r11 instanceof X.C102054yi
            if (r0 == 0) goto L_0x0064
            org.json.JSONObject r9 = r6.getJSONObject(r4)
            java.util.HashMap r3 = X.AnonymousClass001.A0J()
            java.util.Iterator r10 = r9.keys()
        L_0x0031:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x006c
            java.lang.String r8 = X.AnonymousClass001.A0C(r10)
            java.lang.Object r7 = r9.get(r8)
            boolean r0 = r7 instanceof org.json.JSONArray
            if (r0 == 0) goto L_0x0060
            org.json.JSONArray r7 = (org.json.JSONArray) r7
            int r0 = r7.length()
            byte[] r2 = new byte[r0]
            r1 = 0
        L_0x004c:
            int r0 = r7.length()
            if (r1 >= r0) goto L_0x005c
            int r0 = r7.getInt(r1)
            byte r0 = (byte) r0
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x004c
        L_0x005c:
            r3.put(r8, r2)
            goto L_0x0031
        L_0x0060:
            r3.put(r8, r7)
            goto L_0x0031
        L_0x0064:
            boolean r0 = r11 instanceof X.C102044yh
            if (r0 == 0) goto L_0x0074
            java.lang.String r3 = r6.getString(r4)
        L_0x006c:
            if (r3 == 0) goto L_0x0071
        L_0x006e:
            r5.add(r3)
        L_0x0071:
            int r4 = r4 + 1
            goto L_0x001b
        L_0x0074:
            boolean r0 = r11 instanceof X.C102034yg
            if (r0 == 0) goto L_0x0081
            long r0 = r6.getLong(r4)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            goto L_0x006c
        L_0x0081:
            org.json.JSONObject r7 = r6.getJSONObject(r4)
            java.lang.String r0 = "table_name"
            java.lang.String r8 = r7.getString(r0)
            java.lang.String r0 = "table_id_field"
            java.lang.String r2 = r7.getString(r0)
            java.lang.String r1 = "lookup_field"
            boolean r0 = r7.has(r1)
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = r7.optString(r1)
        L_0x009d:
            X.6LG r3 = new X.6LG
            r3.<init>(r8, r2, r0)
            java.lang.String r1 = "deleted_id_files"
            boolean r0 = r7.has(r1)
            if (r0 == 0) goto L_0x00b8
            X.4yh r0 = new X.4yh
            r0.<init>(r1)
            java.util.ArrayList r1 = r0.A00(r7)
            java.util.List r0 = r3.A04
            r0.addAll(r1)
        L_0x00b8:
            java.lang.String r1 = "modified_entity_files"
            boolean r0 = r7.has(r1)
            if (r0 == 0) goto L_0x00ce
            X.4yh r0 = new X.4yh
            r0.<init>(r1)
            java.util.ArrayList r1 = r0.A00(r7)
            java.util.List r0 = r3.A05
            r0.addAll(r1)
        L_0x00ce:
            java.lang.String r2 = "records_count_in_db"
            boolean r0 = r7.has(r2)
            if (r0 == 0) goto L_0x006e
            r0 = 0
            long r0 = r7.optLong(r2, r0)
            r3.A00 = r0
            goto L_0x006e
        L_0x00df:
            r0 = 0
            goto L_0x009d
        L_0x00e1:
            return r5
        L_0x00e2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid type of element '"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "' - expect JSONArray."
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r1)
            throw r0
        L_0x00fa:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Missing root element '"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "'"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6EK.A00(org.json.JSONObject):java.util.ArrayList");
    }

    public void A02(Object obj, JSONArray jSONArray) {
        if (this instanceof C102054yi) {
            jSONArray.put(new JSONObject((Map) obj));
        } else if ((this instanceof C102044yh) || (this instanceof C102034yg)) {
            jSONArray.put(obj);
        } else {
            AnonymousClass6LG r6 = (AnonymousClass6LG) obj;
            JSONObject A1B = C36441kJ.A1B();
            A1B.put("table_name", r6.A03);
            A1B.put("table_id_field", r6.A02);
            String str = r6.A01;
            if (str != null) {
                A1B.put("lookup_field", str);
            }
            boolean z = false;
            List list = r6.A04;
            boolean z2 = true;
            if (Collections.unmodifiableList(list).size() > 0) {
                List unmodifiableList = Collections.unmodifiableList(list);
                if (unmodifiableList.size() != 0) {
                    A1B.put("deleted_id_files", new C102044yh("deleted_id_files").A01(unmodifiableList).get("deleted_id_files"));
                }
                z = true;
            }
            List list2 = r6.A05;
            if (Collections.unmodifiableList(list2).size() > 0) {
                List unmodifiableList2 = Collections.unmodifiableList(list2);
                if (unmodifiableList2.size() != 0) {
                    A1B.put("modified_entity_files", new C102044yh("modified_entity_files").A01(unmodifiableList2).get("modified_entity_files"));
                }
            } else {
                z2 = z;
            }
            A1B.put("records_count_in_db", r6.A00);
            if (z2) {
                jSONArray.put(A1B);
            }
        }
    }

    public AnonymousClass6EK(String str) {
        this.A00 = str;
    }

    public JSONObject A01(List list) {
        JSONArray A0u = C90524aI.A0u();
        for (Object A02 : list) {
            A02(A02, A0u);
        }
        JSONObject A1B = C36441kJ.A1B();
        A1B.put(this.A00, A0u);
        return A1B;
    }
}
