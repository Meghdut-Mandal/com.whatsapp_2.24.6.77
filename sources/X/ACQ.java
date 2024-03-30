package X;

import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class ACQ implements C22944Ayu {
    public static final C13540k2 A00(C22944Ayu ayu, JSONArray jSONArray, long j) {
        Object B3d;
        AnonymousClass00C.A0D(jSONArray, 1);
        C13540k2 r3 = new C13540k2();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (!(optJSONObject == null || (B3d = ayu.B3d(optJSONObject, j)) == null)) {
                r3.add(B3d);
            }
        }
        return AnonymousClass03S.A00(r3);
    }

    public Object B3d(JSONObject jSONObject, long j) {
        AnonymousClass00C.A0D(jSONObject, 0);
        try {
            return A02(jSONObject, j);
        } catch (Exception e) {
            Log.e("BaseGraphQLResponseConverter/convert/Could not convert GraphQL response", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r2.length() == 0) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass9VS A01(org.json.JSONObject r4) {
        /*
            r3 = this;
            java.lang.String r0 = "paging"
            java.lang.String r1 = "after"
            r2 = 0
            org.json.JSONObject r0 = r4.optJSONObject(r0)
            if (r0 != 0) goto L_0x0012
            r0 = 0
            X.9VS r1 = new X.9VS
            r1.<init>(r2, r0)
            return r1
        L_0x0012:
            java.lang.String r2 = X.AnonymousClass9ZU.A00(r1, r0)
            if (r2 == 0) goto L_0x001f
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            r0 = r0 ^ 1
            X.9VS r1 = new X.9VS
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ACQ.A01(org.json.JSONObject):X.9VS");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r2 = X.AnonymousClass9ZU.A00("price", r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02(org.json.JSONObject r23, long r24) {
        /*
            r22 = this;
            r0 = r22
            boolean r2 = r0 instanceof X.C174188Vm
            r1 = r23
            if (r2 == 0) goto L_0x0056
            X.8Vm r0 = (X.C174188Vm) r0
            java.lang.String r3 = "price"
            boolean r2 = X.AnonymousClass9ZU.A01(r3, r1)
            r6 = 0
            if (r2 == 0) goto L_0x059f
            java.lang.String r2 = X.AnonymousClass9ZU.A00(r3, r1)
            X.6Tk r5 = r0.A00
            java.math.BigDecimal r4 = r0.A03(r5, r2)
            if (r4 == 0) goto L_0x059f
            java.lang.String r2 = "start_date"
            boolean r0 = r1.has(r2)
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = X.AnonymousClass9ZU.A00(r2, r1)
            r3 = 0
            if (r0 == 0) goto L_0x0039
            java.util.Date r3 = X.AnonymousClass9ZL.A00(r0)     // Catch:{ Exception -> 0x0035 }
            goto L_0x0039
        L_0x0033:
            r3 = r6
            goto L_0x0039
        L_0x0035:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0039:
            java.lang.String r2 = "end_date"
            boolean r0 = r1.has(r2)
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = X.AnonymousClass9ZU.A00(r2, r1)
            if (r0 == 0) goto L_0x0050
            java.util.Date r6 = X.AnonymousClass9ZL.A00(r0)     // Catch:{ Exception -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0050:
            X.6bV r0 = new X.6bV
            r0.<init>(r5, r4, r3, r6)
            return r0
        L_0x0056:
            boolean r4 = r0 instanceof X.C174208Vo
            r2 = r24
            if (r4 == 0) goto L_0x00ec
            X.8Vo r0 = (X.C174208Vo) r0
            java.lang.String r7 = "promotion_id"
            java.lang.String r6 = "name"
            java.lang.String r5 = "discount"
            java.lang.String[] r4 = new java.lang.String[]{r7, r6, r5}
            boolean r4 = X.AnonymousClass9ZU.A03(r1, r4)
            r11 = 0
            if (r4 == 0) goto L_0x0530
            java.lang.String r5 = r1.getString(r5)
            X.5zj r4 = r0.A00
            X.AnonymousClass00C.A0B(r5)
            X.011 r4 = r4.A00(r5)
            java.lang.Object r14 = r4.first
            java.lang.String r14 = (java.lang.String) r14
            int r19 = X.C90474aD.A08(r4)
            java.lang.String r12 = X.C90474aD.A0e(r7, r1)
            java.lang.String r13 = X.C90474aD.A0e(r6, r1)
            java.lang.String r4 = "minimum_cart_price"
            long r20 = r1.optLong(r4)
            java.lang.String r4 = "start_date"
            java.lang.String r4 = X.AnonymousClass9ZU.A00(r4, r1)
            r17 = 0
            if (r4 == 0) goto L_0x00a5
            java.util.Date r17 = X.AnonymousClass9ZL.A00(r4)     // Catch:{ ParseException -> 0x00a1 }
            goto L_0x00a5
        L_0x00a1:
            r4 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r4)
        L_0x00a5:
            java.lang.String r4 = "end_date"
            java.lang.String r4 = X.AnonymousClass9ZU.A00(r4, r1)
            r18 = 0
            if (r4 == 0) goto L_0x00b8
            java.util.Date r18 = X.AnonymousClass9ZL.A00(r4)     // Catch:{ ParseException -> 0x00b4 }
            goto L_0x00b8
        L_0x00b4:
            r4 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r4)
        L_0x00b8:
            java.lang.String r4 = "description"
            java.lang.String r15 = X.AnonymousClass9ZU.A00(r4, r1)
            java.lang.String r16 = ""
            if (r15 != 0) goto L_0x00c4
            r15 = r16
        L_0x00c4:
            java.lang.String r4 = "more_info"
            java.lang.String r4 = X.AnonymousClass9ZU.A00(r4, r1)
            if (r4 == 0) goto L_0x00ce
            r16 = r4
        L_0x00ce:
            java.lang.String r4 = "media"
            org.json.JSONObject r4 = r1.optJSONObject(r4)
            if (r4 == 0) goto L_0x00e6
            java.lang.String r1 = "image"
            org.json.JSONObject r1 = r4.optJSONObject(r1)
            if (r1 == 0) goto L_0x00e6
            X.Ayu r0 = r0.A01
            java.lang.Object r11 = r0.B3d(r1, r2)
            X.9tv r11 = (X.C206759tv) r11
        L_0x00e6:
            X.6Dt r10 = new X.6Dt
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r10
        L_0x00ec:
            boolean r4 = r0 instanceof X.C174148Vi
            if (r4 == 0) goto L_0x01de
            X.8Vi r0 = (X.C174148Vi) r0
            java.lang.String r5 = "name"
            java.lang.String r7 = "options"
            java.lang.String[] r4 = new java.lang.String[]{r5, r7}
            boolean r4 = X.AnonymousClass9ZU.A03(r1, r4)
            if (r4 == 0) goto L_0x035d
            java.lang.String r5 = X.AnonymousClass9ZU.A00(r5, r1)
            if (r5 == 0) goto L_0x01d9
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            org.json.JSONArray r10 = r1.optJSONArray(r7)
            if (r10 == 0) goto L_0x0199
            r9 = 0
            int r8 = r10.length()
        L_0x0119:
            if (r9 >= r8) goto L_0x019e
            org.json.JSONObject r7 = r10.optJSONObject(r9)
            if (r7 == 0) goto L_0x0153
            java.lang.String r1 = "value"
            java.lang.String r11 = X.AnonymousClass9ZU.A00(r1, r7)
            if (r11 == 0) goto L_0x0194
            java.lang.String r1 = "thumbnail_media"
            org.json.JSONObject r7 = r7.optJSONObject(r1)
            if (r7 == 0) goto L_0x0187
            X.Ayu r1 = r0.A00
            java.lang.Object r1 = r1.B3d(r7, r2)
            X.9tv r1 = (X.C206759tv) r1
            if (r1 == 0) goto L_0x0187
            X.4zY r7 = new X.4zY
            r7.<init>(r1, r11)
        L_0x0140:
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x0156
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x0156
            boolean r1 = r7 instanceof X.C102244zY
            if (r1 == 0) goto L_0x0156
        L_0x0150:
            r6.add(r7)
        L_0x0153:
            int r9 = r9 + 1
            goto L_0x0119
        L_0x0156:
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x016a
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x016a
            boolean r1 = r7 instanceof X.C102234zX
            if (r1 == 0) goto L_0x016a
        L_0x0166:
            r4.add(r7)
            goto L_0x0153
        L_0x016a:
            boolean r1 = X.C36411kG.A1a(r6)
            if (r1 == 0) goto L_0x0174
            boolean r1 = r7 instanceof X.C102234zX
            if (r1 != 0) goto L_0x018d
        L_0x0174:
            boolean r1 = X.C36411kG.A1a(r4)
            if (r1 == 0) goto L_0x017e
            boolean r1 = r7 instanceof X.C102244zY
            if (r1 != 0) goto L_0x018d
        L_0x017e:
            boolean r1 = r7 instanceof X.C102244zY
            if (r1 != 0) goto L_0x0150
            boolean r1 = r7 instanceof X.C102234zX
            if (r1 == 0) goto L_0x0153
            goto L_0x0166
        L_0x0187:
            X.4zX r7 = new X.4zX
            r7.<init>(r11)
            goto L_0x0140
        L_0x018d:
            java.lang.String r0 = "Either all options should contain ProductImage or none of them should contain it"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0194:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        L_0x0199:
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            goto L_0x01bc
        L_0x019e:
            boolean r0 = X.C36411kG.A1a(r6)
            if (r0 == 0) goto L_0x01af
            boolean r0 = X.C36411kG.A1a(r4)
            if (r0 == 0) goto L_0x01af
            java.lang.String r0 = "getOptions: both result candidates or not empty. Preceding logic should prevent such cases!"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x01af:
            boolean r0 = X.C36411kG.A1a(r6)
            if (r0 != 0) goto L_0x01bc
            boolean r0 = X.C36411kG.A1a(r4)
            if (r0 == 0) goto L_0x0199
            r6 = r4
        L_0x01bc:
            java.lang.Object r1 = X.C007103b.A0L(r6)
            boolean r0 = r1 instanceof X.C102234zX
            if (r0 == 0) goto L_0x01ca
            X.4zV r0 = new X.4zV
            r0.<init>(r5, r6)
            return r0
        L_0x01ca:
            boolean r0 = r1 instanceof X.C102244zY
            if (r0 == 0) goto L_0x01d4
            X.4zW r0 = new X.4zW
            r0.<init>(r5, r6)
            return r0
        L_0x01d4:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x01d9:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        L_0x01de:
            boolean r4 = r0 instanceof X.C174138Vh
            if (r4 == 0) goto L_0x0203
            X.8Vh r0 = (X.C174138Vh) r0
            r3 = 0
            java.lang.String r2 = "description"
            java.lang.String r4 = X.AnonymousClass9ZU.A00(r2, r1)
            java.lang.String r2 = "multi_price"
            boolean r3 = r1.optBoolean(r2, r3)
            java.lang.String r2 = "lowest_price"
            java.lang.String r2 = X.AnonymousClass9ZU.A00(r2, r1)
            X.6Tk r1 = r0.A00
            java.math.BigDecimal r1 = r0.A03(r1, r2)
            X.6bP r0 = new X.6bP
            r0.<init>(r4, r1, r3)
            return r0
        L_0x0203:
            boolean r4 = r0 instanceof X.C174198Vn
            if (r4 == 0) goto L_0x02dc
            X.8Vn r0 = (X.C174198Vn) r0
            java.lang.String r9 = "variant_properties"
            boolean r4 = X.AnonymousClass9ZU.A01(r9, r1)
            r11 = 0
            if (r4 == 0) goto L_0x0530
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.lang.String r4 = "types"
            org.json.JSONArray r10 = r1.optJSONArray(r4)
            if (r10 == 0) goto L_0x0239
            r7 = 0
            int r6 = r10.length()
        L_0x0223:
            if (r7 >= r6) goto L_0x0239
            org.json.JSONObject r5 = r10.optJSONObject(r7)
            if (r5 == 0) goto L_0x0236
            X.Ayu r4 = r0.A02
            java.lang.Object r4 = r4.B3d(r5, r2)
            if (r4 == 0) goto L_0x0236
            r8.add(r4)
        L_0x0236:
            int r7 = r7 + 1
            goto L_0x0223
        L_0x0239:
            int r5 = r8.size()
            r4 = 2
            if (r5 > r4) goto L_0x0530
            boolean r4 = r8 instanceof java.util.Collection
            r6 = 0
            if (r4 == 0) goto L_0x027f
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L_0x027f
        L_0x024b:
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
            org.json.JSONArray r12 = r1.optJSONArray(r9)
            if (r12 == 0) goto L_0x02a8
            r11 = 0
            int r9 = r12.length()
        L_0x025a:
            if (r11 >= r9) goto L_0x02a8
            org.json.JSONObject r5 = r12.optJSONObject(r11)
            if (r5 == 0) goto L_0x027c
            java.lang.String r4 = "name"
            java.lang.String r7 = X.AnonymousClass9ZU.A00(r4, r5)
            java.lang.String r6 = "Required value was null."
            if (r7 == 0) goto L_0x02a3
            java.lang.String r4 = "value"
            java.lang.String r5 = X.AnonymousClass9ZU.A00(r4, r5)
            if (r5 == 0) goto L_0x029e
            X.6bJ r4 = new X.6bJ
            r4.<init>(r7, r5)
            r10.add(r4)
        L_0x027c:
            int r11 = r11 + 1
            goto L_0x025a
        L_0x027f:
            java.util.Iterator r5 = r8.iterator()
        L_0x0283:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x029a
            java.lang.Object r4 = r5.next()
            boolean r4 = r4 instanceof X.C102224zW
            if (r4 == 0) goto L_0x0283
            int r6 = r6 + 1
            if (r6 >= 0) goto L_0x0283
            java.lang.RuntimeException r0 = X.C36371kC.A0s()
            throw r0
        L_0x029a:
            r4 = 1
            if (r6 <= r4) goto L_0x024b
            return r11
        L_0x029e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r6)
            throw r0
        L_0x02a3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r6)
            throw r0
        L_0x02a8:
            java.lang.String r6 = "listing_details"
            boolean r5 = X.AnonymousClass9ZU.A01(r6, r1)
            r4 = 0
            if (r5 == 0) goto L_0x02bf
            org.json.JSONObject r5 = r1.optJSONObject(r6)
            if (r5 == 0) goto L_0x02bf
            X.Ayu r4 = r0.A01
            java.lang.Object r4 = r4.B3d(r5, r2)
            X.6bP r4 = (X.C134666bP) r4
        L_0x02bf:
            java.lang.String r7 = "availability"
            boolean r6 = X.AnonymousClass9ZU.A01(r7, r1)
            r5 = 0
            if (r6 == 0) goto L_0x02d6
            org.json.JSONObject r1 = r1.optJSONObject(r7)
            if (r1 == 0) goto L_0x02d6
            X.Ayu r0 = r0.A00
            java.lang.Object r5 = r0.B3d(r1, r2)
            X.6bD r5 = (X.C134546bD) r5
        L_0x02d6:
            X.6bW r11 = new X.6bW
            r11.<init>(r5, r4, r8, r10)
            return r11
        L_0x02dc:
            boolean r4 = r0 instanceof X.C174078Vb
            if (r4 == 0) goto L_0x035f
            java.lang.String r2 = "listing"
            boolean r0 = X.AnonymousClass9ZU.A01(r2, r1)
            if (r0 == 0) goto L_0x035d
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()
            org.json.JSONArray r13 = r1.optJSONArray(r2)
            if (r13 == 0) goto L_0x0357
            r11 = 0
            int r10 = r13.length()
        L_0x02f7:
            if (r11 >= r10) goto L_0x0357
            org.json.JSONObject r1 = r13.optJSONObject(r11)
            java.lang.String r0 = "is_available"
            boolean r9 = r1.optBoolean(r0)
            java.lang.String r0 = "product_id"
            java.lang.String r8 = r1.optString(r0)
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "options"
            org.json.JSONArray r6 = r1.optJSONArray(r0)
            if (r6 == 0) goto L_0x033f
            r5 = 0
            int r4 = r6.length()
        L_0x031a:
            if (r5 >= r4) goto L_0x033f
            org.json.JSONObject r1 = r6.optJSONObject(r5)
            if (r1 == 0) goto L_0x033c
            java.lang.String r0 = "name"
            java.lang.String r3 = X.AnonymousClass9ZU.A00(r0, r1)
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L_0x0352
            java.lang.String r0 = "value"
            java.lang.String r1 = X.AnonymousClass9ZU.A00(r0, r1)
            if (r1 == 0) goto L_0x034d
            X.6bJ r0 = new X.6bJ
            r0.<init>(r3, r1)
            r7.add(r0)
        L_0x033c:
            int r5 = r5 + 1
            goto L_0x031a
        L_0x033f:
            X.AnonymousClass00C.A0B(r8)
            X.6bO r0 = new X.6bO
            r0.<init>(r8, r7, r9)
            r12.add(r0)
            int r11 = r11 + 1
            goto L_0x02f7
        L_0x034d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r2)
            throw r0
        L_0x0352:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r2)
            throw r0
        L_0x0357:
            X.6bD r0 = new X.6bD
            r0.<init>(r12)
            return r0
        L_0x035d:
            r0 = 0
            return r0
        L_0x035f:
            boolean r4 = r0 instanceof X.C174128Vg
            if (r4 == 0) goto L_0x0391
            java.lang.String r3 = "status"
            java.lang.String r2 = "can_appeal"
            java.lang.String[] r0 = new java.lang.String[]{r3, r2}
            boolean r0 = X.AnonymousClass9ZU.A03(r1, r0)
            if (r0 == 0) goto L_0x055e
            java.lang.String r0 = X.AnonymousClass9ZU.A00(r3, r1)
            int r6 = X.AnonymousClass962.A00(r0)
            boolean r7 = r1.optBoolean(r2)
            X.09w r5 = X.C023409w.A00
            java.lang.String r0 = "reject_reason"
            java.lang.String r3 = X.AnonymousClass9ZU.A00(r0, r1)
            java.lang.String r0 = "commerce_url"
            java.lang.String r4 = X.AnonymousClass9ZU.A00(r0, r1)
            X.9tw r2 = new X.9tw
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0390:
            return r2
        L_0x0391:
            boolean r4 = r0 instanceof X.C174068Va
            if (r4 == 0) goto L_0x03d4
            java.lang.String r5 = "id"
            boolean r0 = X.AnonymousClass9ZU.A01(r5, r1)
            r6 = 0
            if (r0 == 0) goto L_0x059f
            java.lang.String r0 = "original_dimensions"
            org.json.JSONObject r4 = r1.optJSONObject(r0)
            if (r4 == 0) goto L_0x059f
            java.lang.String r3 = "height"
            java.lang.String r2 = "width"
            java.lang.String[] r0 = new java.lang.String[]{r3, r2}
            boolean r0 = X.AnonymousClass9ZU.A03(r4, r0)
            if (r0 == 0) goto L_0x059f
            java.lang.String r7 = X.AnonymousClass9ZU.A00(r5, r1)
            if (r7 == 0) goto L_0x0457
            java.lang.String r0 = "original_image_url"
            java.lang.String r8 = X.AnonymousClass9ZU.A00(r0, r1)
            java.lang.String r0 = "request_image_url"
            java.lang.String r9 = X.AnonymousClass9ZU.A00(r0, r1)
            int r11 = r4.optInt(r3)
            int r10 = r4.optInt(r2)
            X.9tv r6 = new X.9tv
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x03d4:
            boolean r4 = r0 instanceof X.C174178Vl
            if (r4 == 0) goto L_0x0404
            X.8Vl r0 = (X.C174178Vl) r0
            java.lang.String r4 = "xwa_product_catalog_get_single_collection"
            org.json.JSONObject r5 = r1.optJSONObject(r4)
            r6 = 0
            if (r5 == 0) goto L_0x0403
            java.lang.String r1 = "collection"
            org.json.JSONObject r4 = r5.optJSONObject(r1)
            if (r4 == 0) goto L_0x0403
            X.Ayu r1 = r0.A01
            java.lang.Object r2 = r1.B3d(r4, r2)
            X.9Wv r2 = (X.C195929Wv) r2
            if (r2 == 0) goto L_0x0403
            X.9VS r1 = r0.A01(r5)
            X.A8y r6 = new X.A8y
            r6.<init>(r1, r2)
            X.9QY r0 = r0.A00
            r0.A00(r6, r4)
        L_0x0403:
            return r6
        L_0x0404:
            boolean r4 = r0 instanceof X.C174118Vf
            if (r4 == 0) goto L_0x042b
            X.8Vf r0 = (X.C174118Vf) r0
            java.lang.String r4 = "xwa_product_catalog_get_collections"
            org.json.JSONObject r5 = r1.optJSONObject(r4)
            r6 = 0
            if (r5 == 0) goto L_0x0403
            java.lang.String r1 = "collections"
            org.json.JSONArray r4 = r5.optJSONArray(r1)
            if (r4 == 0) goto L_0x0403
            X.Ayu r1 = r0.A00
            X.0k2 r1 = A00(r1, r4, r2)
            X.9VS r0 = r0.A01(r5)
            X.9VR r6 = new X.9VR
            r6.<init>(r0, r1)
            return r6
        L_0x042b:
            boolean r4 = r0 instanceof X.C174168Vk
            if (r4 == 0) goto L_0x045c
            X.8Vk r0 = (X.C174168Vk) r0
            java.lang.String r4 = "xwa_product_catalog_get_categories"
            org.json.JSONObject r5 = r1.optJSONObject(r4)
            if (r5 == 0) goto L_0x0454
            java.lang.String r1 = "categories"
            org.json.JSONArray r4 = r5.optJSONArray(r1)
            if (r4 == 0) goto L_0x0454
            X.ACQ r1 = r0.A01
            X.0k2 r1 = A00(r1, r4, r2)
        L_0x0447:
            X.A90 r2 = new X.A90
            r2.<init>(r1)
            if (r5 == 0) goto L_0x0390
            X.9QY r0 = r0.A00
            r0.A00(r2, r5)
            return r2
        L_0x0454:
            X.09w r1 = X.C023409w.A00
            goto L_0x0447
        L_0x0457:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        L_0x045c:
            boolean r4 = r0 instanceof X.C174108Ve
            if (r4 == 0) goto L_0x0483
            X.8Ve r0 = (X.C174108Ve) r0
            java.lang.String r5 = "xwa_product_catalog_get_promotions"
            boolean r4 = X.AnonymousClass9ZU.A01(r5, r1)
            if (r4 == 0) goto L_0x055e
            org.json.JSONObject r4 = r1.getJSONObject(r5)
            java.lang.String r1 = "promotions"
            org.json.JSONArray r1 = r4.getJSONArray(r1)
            X.Ayu r0 = r0.A00
            X.AnonymousClass00C.A0B(r1)
            X.0k2 r0 = A00(r0, r1, r2)
            X.68d r2 = new X.68d
            r2.<init>(r0)
            return r2
        L_0x0483:
            boolean r4 = r0 instanceof X.AnonymousClass8VZ
            if (r4 == 0) goto L_0x04c0
            java.lang.String r0 = "status"
            java.lang.String r2 = X.AnonymousClass9ZU.A00(r0, r1)
            r4 = 0
            if (r2 == 0) goto L_0x04a8
            boolean r0 = X.AnonymousClass098.A06(r2)
            if (r0 != 0) goto L_0x04a8
            java.lang.String r0 = "approved"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x04a8
            java.lang.String r0 = "rejected"
            boolean r0 = r0.equalsIgnoreCase(r2)
            int r4 = X.C36371kC.A00(r0)
        L_0x04a8:
            java.lang.String r0 = "can_appeal"
            boolean r3 = r1.optBoolean(r0)
            java.lang.String r0 = "reject_reason"
            java.lang.String r2 = X.AnonymousClass9ZU.A00(r0, r1)
            java.lang.String r0 = "commerce_url"
            java.lang.String r1 = X.AnonymousClass9ZU.A00(r0, r1)
            X.9Wa r0 = new X.9Wa
            r0.<init>(r2, r1, r4, r3)
            return r0
        L_0x04c0:
            boolean r4 = r0 instanceof X.C174158Vj
            if (r4 == 0) goto L_0x0531
            X.8Vj r0 = (X.C174158Vj) r0
            java.lang.String r6 = "id"
            java.lang.String r5 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r6, r5}
            boolean r4 = X.AnonymousClass9ZU.A03(r1, r4)
            r11 = 0
            if (r4 == 0) goto L_0x0530
            java.lang.String r14 = X.AnonymousClass9ZU.A00(r6, r1)
            if (r14 == 0) goto L_0x0530
            java.lang.String r6 = X.AnonymousClass9ZU.A00(r5, r1)
            if (r6 == 0) goto L_0x0530
            java.lang.String r7 = " "
            java.lang.String[] r5 = new java.lang.String[]{r7}
            r4 = 0
            java.util.List r6 = X.AnonymousClass099.A0L(r6, r5, r4)
            X.7XS r5 = X.AnonymousClass7XS.A00
            java.lang.String r4 = ""
            java.lang.String r15 = X.C007103b.A0Q(r7, r4, r4, r6, r5)
            java.lang.String r4 = "status_info"
            org.json.JSONObject r5 = r1.optJSONObject(r4)
            if (r5 == 0) goto L_0x0507
            X.Ayu r4 = r0.A01
            java.lang.Object r12 = r4.B3d(r5, r2)
            X.9Wa r12 = (X.C195789Wa) r12
            if (r12 != 0) goto L_0x050d
            return r11
        L_0x0507:
            r4 = 0
            X.9Wa r12 = new X.9Wa
            r12.<init>(r11, r11, r4, r4)
        L_0x050d:
            java.lang.String r4 = "products"
            org.json.JSONArray r1 = r1.optJSONArray(r4)
            if (r1 == 0) goto L_0x052d
            X.Ayu r0 = r0.A00
            X.0k2 r0 = A00(r0, r1, r2)
        L_0x051b:
            java.util.ArrayList r16 = X.C36361kB.A0q(r0)
            int r0 = r16.size()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            X.9Wv r11 = new X.9Wv
            r11.<init>(r12, r13, r14, r15, r16)
            return r11
        L_0x052d:
            X.09w r0 = X.C023409w.A00
            goto L_0x051b
        L_0x0530:
            return r11
        L_0x0531:
            boolean r4 = r0 instanceof X.C174098Vd
            if (r4 == 0) goto L_0x0560
            X.8Vd r0 = (X.C174098Vd) r0
            java.lang.String r4 = "category"
            org.json.JSONObject r4 = r1.optJSONObject(r4)
            if (r4 == 0) goto L_0x055e
            X.ACQ r5 = r0.A00
            java.lang.Object r4 = r5.B3d(r4, r2)
            X.6Cn r4 = (X.C128506Cn) r4
            if (r4 == 0) goto L_0x055e
            java.lang.String r0 = "sub_categories"
            org.json.JSONArray r0 = r1.optJSONArray(r0)
            if (r0 == 0) goto L_0x055b
            X.0k2 r0 = A00(r5, r0, r2)
        L_0x0555:
            X.69h r2 = new X.69h
            r2.<init>(r4, r0)
            return r2
        L_0x055b:
            X.09w r0 = X.C023409w.A00
            goto L_0x0555
        L_0x055e:
            r2 = 0
            return r2
        L_0x0560:
            X.8Vc r0 = (X.C174088Vc) r0
            java.lang.String r4 = "category_id"
            java.lang.String r8 = X.AnonymousClass9ZU.A00(r4, r1)
            java.lang.String r4 = "name"
            java.lang.String r9 = X.AnonymousClass9ZU.A00(r4, r1)
            java.lang.String r4 = "media"
            org.json.JSONObject r5 = r1.optJSONObject(r4)
            r6 = 0
            if (r5 == 0) goto L_0x059d
            java.lang.String r4 = "image"
            org.json.JSONObject r4 = r5.optJSONObject(r4)
            if (r4 == 0) goto L_0x059d
            X.Ayu r0 = r0.A00
            java.lang.Object r7 = r0.B3d(r4, r2)
            X.9tv r7 = (X.C206759tv) r7
        L_0x0587:
            if (r8 == 0) goto L_0x059f
            if (r9 == 0) goto L_0x059f
            if (r7 == 0) goto L_0x059f
            java.lang.String r0 = "is_last_level"
            boolean r11 = r1.optBoolean(r0)
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
            X.6Cn r6 = new X.6Cn
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x059d:
            r7 = r6
            goto L_0x0587
        L_0x059f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ACQ.A02(org.json.JSONObject, long):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r1 != 0) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.math.BigDecimal A03(X.C132386Tk r3, java.lang.String r4) {
        /*
            r2 = this;
            if (r4 == 0) goto L_0x0024
            if (r3 == 0) goto L_0x0024
            r1 = 1
            java.lang.Float r0 = X.AnonymousClass6R8.A02(r4, r1)     // Catch:{ NumberFormatException -> 0x0018 }
            if (r0 == 0) goto L_0x0014
            float r0 = r0.floatValue()     // Catch:{ NumberFormatException -> 0x0018 }
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r0 = 1
            if (r1 == 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r0 = r0 ^ 1
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 == 0) goto L_0x0024
            long r0 = java.lang.Long.parseLong(r4)
            java.math.BigDecimal r0 = X.C129676Ia.A00(r3, r0)
            return r0
        L_0x0024:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ACQ.A03(X.6Tk, java.lang.String):java.math.BigDecimal");
    }
}
