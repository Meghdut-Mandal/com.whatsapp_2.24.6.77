package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1F3  reason: invalid class name */
public class AnonymousClass1F3 {
    public final AnonymousClass16J A00;
    public final AnonymousClass12P A01;
    public final AnonymousClass1F4 A02;
    public final AnonymousClass1F6 A03;
    public final AnonymousClass16T A04;
    public final AnonymousClass1F7 A05;

    public static ContentValues A00(AnonymousClass2cT r8) {
        String str;
        JSONObject jSONObject;
        int i;
        ContentValues contentValues = new ContentValues();
        C207149ud r82 = r8.A00;
        if (r82 != null) {
            int i2 = r82.A05;
            int i3 = 1;
            if (i2 != 1) {
                i3 = 0;
                if (i2 == 2) {
                    i3 = 8;
                }
            }
            contentValues.put("element_type", Integer.valueOf(i3));
            String str2 = r82.A04;
            contentValues.put("reply_values", str2);
            if (i3 == 8) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("description", str2);
                    jSONObject2.put("footer_text", r82.A02);
                    jSONObject2.put("response_message_type", r82.A05);
                    C206919uD r3 = r82.A01;
                    if (r3 == null) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject();
                        jSONObject.put("native_flow_response_name", r3.A00);
                        jSONObject.put("native_flow_response_params_json", r3.A01);
                    }
                    jSONObject2.put("native_flow_response_content", jSONObject);
                    AnonymousClass90O r0 = r82.A00;
                    if (r0 != null) {
                        i = r0.value;
                    } else {
                        i = 0;
                    }
                    jSONObject2.put("native_flow_response_body_format", i);
                } catch (JSONException e) {
                    Log.w("InteractiveResponseMessageConverter/toJSONObject/serialization error", e);
                    jSONObject2 = null;
                }
                if (jSONObject2 != null) {
                    str = jSONObject2.toString();
                } else {
                    str = null;
                }
            } else {
                str = r82.A02;
            }
            contentValues.put("reply_description", str);
        }
        return contentValues;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:? A[ADDED_TO_REGION, ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ed A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C207219uk A01(X.AnonymousClass16T r30, org.json.JSONObject r31) {
        /*
            java.lang.String r3 = "selectListType"
            r0 = r31
            int r9 = r0.optInt(r3)
            r14 = 0
            r1 = 5
            if (r9 != r1) goto L_0x003e
            java.lang.String r1 = "native_flow_content"
            java.lang.String r1 = r0.getString(r1)
            X.9uX r3 = A03(r1)
            r7 = 0
            if (r3 == 0) goto L_0x003d
            X.9tl r2 = A02(r0)
            java.lang.String r1 = "description"
            java.lang.String r4 = r0.optString(r1)
            java.lang.String r1 = "footerText"
            java.lang.String r5 = r0.optString(r1, r14)
            java.lang.String r1 = "buttonText"
            java.lang.String r6 = r0.optString(r1)
            X.9uk r7 = new X.9uk
            r1 = r7
            r1.<init>((X.C206659tl) r2, (X.C207089uX) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6)
        L_0x0035:
            java.lang.String r1 = "templateId"
            java.lang.String r0 = r0.optString(r1, r14)
            r7.A0B = r0
        L_0x003d:
            return r7
        L_0x003e:
            r6 = 4
            if (r9 != r6) goto L_0x0092
            java.lang.String r1 = "shops_info"
            java.lang.String r2 = r0.optString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            r7 = 0
            if (r1 != 0) goto L_0x003d
            X.C18740tg.A06(r2)     // Catch:{ JSONException -> 0x037f }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x037f }
            r4.<init>(r2)     // Catch:{ JSONException -> 0x037f }
            java.lang.String r1 = "id"
            java.lang.String r5 = r4.optString(r1)     // Catch:{ JSONException -> 0x037f }
            java.lang.String r1 = "shop_surface"
            int r2 = r4.optInt(r1)     // Catch:{ JSONException -> 0x037f }
            java.lang.String r1 = "message_version"
            int r1 = r4.optInt(r1)     // Catch:{ JSONException -> 0x037f }
            X.9tn r4 = new X.9tn     // Catch:{ JSONException -> 0x037f }
            r4.<init>(r5, r2, r1)     // Catch:{ JSONException -> 0x037f }
            int r2 = r0.getInt(r3)
            X.9tl r10 = A02(r0)
            java.lang.String r1 = "description"
            java.lang.String r15 = r0.optString(r1)
            if (r2 != r6) goto L_0x0368
            X.09w r19 = X.C023409w.A00
            X.9uk r7 = new X.9uk
            r8 = r14
            r9 = r14
            r16 = r14
            r17 = r14
            r18 = r14
            r20 = 4
            r12 = r14
            r13 = r4
            r11 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0035
        L_0x0092:
            r1 = 3
            java.lang.String r17 = "checkout_info"
            java.lang.String r5 = "footerText"
            java.lang.String r12 = "description"
            r21 = r30
            if (r9 != r1) goto L_0x00c9
            X.9tl r9 = A02(r0)
            java.lang.String r11 = r0.optString(r12)
            java.lang.String r12 = r0.optString(r5, r14)
            r1 = r17
            org.json.JSONObject r2 = r0.optJSONObject(r1)
            r1 = r21
            X.9ui r8 = X.C203219nY.A03(r1, r2)
            X.C18740tg.A06(r8)
            java.lang.String r1 = "native_flow_content"
            java.lang.String r1 = r0.optString(r1)
            X.9uX r10 = A03(r1)
            X.9uk r7 = new X.9uk
            r7.<init>((X.C207199ui) r8, (X.C206659tl) r9, (X.C207089uX) r10, (java.lang.String) r11, (java.lang.String) r12)
            goto L_0x0035
        L_0x00c9:
            r1 = 7
            if (r9 != r1) goto L_0x0155
            java.lang.String r1 = "carousel_content"
            java.lang.String r4 = r0.getString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x038c
            X.C18740tg.A06(r4)     // Catch:{ JSONException -> 0x0386 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0386 }
            r2.<init>(r4)     // Catch:{ JSONException -> 0x0386 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0386 }
            r4.<init>()     // Catch:{ JSONException -> 0x0386 }
            java.lang.String r1 = "cards"
            org.json.JSONArray r6 = r2.optJSONArray(r1)     // Catch:{ JSONException -> 0x0386 }
            if (r6 == 0) goto L_0x0131
            r2 = 0
        L_0x00ee:
            int r1 = r6.length()     // Catch:{ JSONException -> 0x0386 }
            if (r2 >= r1) goto L_0x0131
            org.json.JSONObject r7 = r6.getJSONObject(r2)     // Catch:{ JSONException -> 0x0386 }
            if (r7 == 0) goto L_0x012e
            int r1 = r7.optInt(r3)     // Catch:{ JSONException -> 0x0386 }
            if (r1 <= 0) goto L_0x010a
            r1 = r21
            X.9uk r1 = A01(r1, r7)     // Catch:{ JSONException -> 0x0386 }
            r4.add(r1)     // Catch:{ JSONException -> 0x0386 }
            goto L_0x012e
        L_0x010a:
            java.lang.String r1 = "native_flow_content"
            java.lang.String r1 = r7.getString(r1)     // Catch:{ JSONException -> 0x0386 }
            X.9uX r17 = A03(r1)     // Catch:{ JSONException -> 0x0386 }
            X.9tl r16 = A02(r7)     // Catch:{ JSONException -> 0x0386 }
            java.lang.String r18 = r7.optString(r12)     // Catch:{ JSONException -> 0x0386 }
            java.lang.String r19 = r7.optString(r5)     // Catch:{ JSONException -> 0x0386 }
            java.lang.String r1 = "buttonText"
            java.lang.String r20 = r7.optString(r1)     // Catch:{ JSONException -> 0x0386 }
            X.9uk r15 = new X.9uk     // Catch:{ JSONException -> 0x0386 }
            r15.<init>((X.C206659tl) r16, (X.C207089uX) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20)     // Catch:{ JSONException -> 0x0386 }
            r4.add(r15)     // Catch:{ JSONException -> 0x0386 }
        L_0x012e:
            int r2 = r2 + 1
            goto L_0x00ee
        L_0x0131:
            X.9tU r9 = new X.9tU     // Catch:{ JSONException -> 0x0386 }
            r9.<init>(r4)     // Catch:{ JSONException -> 0x0386 }
            X.9tl r10 = A02(r0)
            java.lang.String r15 = r0.optString(r12, r14)
            java.lang.String r16 = r0.optString(r5, r14)
            X.09w r19 = X.C023409w.A00
            X.9uk r7 = new X.9uk
            r13 = r14
            r17 = r14
            r18 = r14
            r20 = 7
            r8 = r14
            r12 = r14
            r11 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0035
        L_0x0155:
            r1 = 9
            if (r9 != r1) goto L_0x0210
            java.lang.String r1 = "native_flow_content"
            java.lang.String r1 = r0.getString(r1)
            X.9uX r16 = A03(r1)
            java.lang.String r1 = "single_product_info"
            org.json.JSONObject r3 = r0.getJSONObject(r1)
            r19 = 0
            if (r3 == 0) goto L_0x01eb
            java.lang.String r1 = "business_owner_jid"
            java.lang.String r2 = r3.optString(r1)
            if (r2 == 0) goto L_0x01eb
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r20 = X.C222813r.A01(r2)
            java.lang.String r1 = "product_id"
            java.lang.String r21 = r3.optString(r1)
            if (r21 == 0) goto L_0x01eb
            java.lang.String r1 = "title"
            java.lang.String r22 = r3.optString(r1)
            if (r22 == 0) goto L_0x01eb
            java.lang.String r1 = "currency_code"
            java.lang.String r4 = r3.optString(r1)
            if (r4 == 0) goto L_0x01b8
            int r1 = r4.length()
            if (r1 == 0) goto L_0x01b8
            X.6Tk r6 = new X.6Tk     // Catch:{ IllegalArgumentException -> 0x01bd }
            r6.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x01bd }
            java.lang.String r1 = "price_amount"
            long r1 = r3.optLong(r1)     // Catch:{ IllegalArgumentException -> 0x01bd }
            java.math.BigDecimal r29 = X.C129676Ia.A00(r6, r1)     // Catch:{ IllegalArgumentException -> 0x01bd }
            X.6Tk r6 = new X.6Tk     // Catch:{ IllegalArgumentException -> 0x01bf }
            r6.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x01bf }
            java.lang.String r1 = "sale_price_amount"
            long r1 = r3.optLong(r1)     // Catch:{ IllegalArgumentException -> 0x01bf }
            java.math.BigDecimal r30 = X.C129676Ia.A00(r6, r1)     // Catch:{ IllegalArgumentException -> 0x01bf }
            goto L_0x01c2
        L_0x01b8:
            r29 = r14
            r30 = r14
            goto L_0x01c2
        L_0x01bd:
            r29 = r14
        L_0x01bf:
            r4 = r14
            r30 = r14
        L_0x01c2:
            java.lang.String r23 = r3.optString(r12)
            java.lang.String r1 = "retailer_id"
            java.lang.String r25 = r3.optString(r1)
            java.lang.String r1 = "product_url"
            java.lang.String r26 = r3.optString(r1)
            java.lang.String r1 = "product_image_count"
            int r31 = r3.optInt(r1)
            java.lang.String r1 = "body"
            java.lang.String r27 = r3.optString(r1)
            java.lang.String r1 = "footer"
            java.lang.String r28 = r3.optString(r1)
            X.3XY r19 = new X.3XY
            r24 = r4
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x01eb:
            if (r16 == 0) goto L_0x038d
            if (r19 == 0) goto L_0x038d
            X.9tl r15 = A02(r0)
            java.lang.String r20 = r0.optString(r12)
            java.lang.String r21 = r0.optString(r5)
            X.09w r24 = X.C023409w.A00
            X.9uk r7 = new X.9uk
            r13 = r14
            r18 = r14
            r22 = r14
            r23 = r14
            r25 = 9
            r12 = r7
            r17 = r14
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0035
        L_0x0210:
            X.9tl r20 = A02(r0)
            java.lang.String r25 = r0.optString(r12)
            java.lang.String r26 = r0.optString(r5, r14)
            java.lang.String r1 = "buttonText"
            java.lang.String r27 = r0.optString(r1)
            java.lang.String r1 = "sections"
            org.json.JSONArray r11 = r0.optJSONArray(r1)
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            if (r11 == 0) goto L_0x028a
            r10 = 0
        L_0x0230:
            int r1 = r11.length()
            if (r10 >= r1) goto L_0x028a
            org.json.JSONObject r2 = r11.getJSONObject(r10)
            java.lang.String r1 = "items"
            org.json.JSONArray r8 = r2.optJSONArray(r1)
            java.lang.String r7 = "title"
            java.lang.String r6 = r2.optString(r7)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r8 == 0) goto L_0x0279
            r4 = 0
        L_0x024e:
            int r1 = r8.length()
            if (r4 >= r1) goto L_0x0279
            org.json.JSONObject r1 = r8.getJSONObject(r4)
            java.lang.String r2 = "id"
            java.lang.String r3 = r1.optString(r2)
            java.lang.String r2 = r1.optString(r7)
            java.lang.String r13 = r1.optString(r12)
            r1 = 1
            X.AnonymousClass00C.A0D(r3, r1)
            r1 = 2
            X.AnonymousClass00C.A0D(r2, r1)
            X.9ts r1 = new X.9ts
            r1.<init>(r3, r14, r2, r13)
            r5.add(r1)
            int r4 = r4 + 1
            goto L_0x024e
        L_0x0279:
            r1 = 1
            X.AnonymousClass00C.A0D(r6, r1)
            X.9to r2 = new X.9to
            r2.<init>(r6, r14, r5)
            r1 = r16
            r1.add(r2)
            int r10 = r10 + 1
            goto L_0x0230
        L_0x028a:
            java.lang.String r1 = "product_info"
            org.json.JSONObject r11 = r0.optJSONObject(r1)
            r12 = 0
            if (r11 != 0) goto L_0x02b9
            r3 = r14
        L_0x0294:
            r1 = r17
            org.json.JSONObject r2 = r0.optJSONObject(r1)
            r1 = r21
            X.9ui r18 = X.C203219nY.A03(r1, r2)
            X.9uk r7 = new X.9uk
            r21 = r14
            r23 = r14
            r24 = r14
            r28 = r14
            r17 = r7
            r19 = r14
            r22 = r3
            r29 = r16
            r30 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x0035
        L_0x02b9:
            java.lang.String r1 = "business_owner_jid"
            java.lang.String r4 = r11.optString(r1)
            X.13r r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ 0wR -> 0x0350 }
            com.whatsapp.jid.UserJid r15 = X.C222813r.A01(r4)     // Catch:{ 0wR -> 0x0350 }
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.String r1 = "product_sections"
            org.json.JSONArray r8 = r11.optJSONArray(r1)
            r7 = 0
            if (r8 == 0) goto L_0x0318
            r6 = 0
        L_0x02d4:
            int r1 = r8.length()
            if (r6 >= r1) goto L_0x0318
            org.json.JSONObject r5 = r8.optJSONObject(r6)
            java.lang.String r1 = "product_section_products"
            org.json.JSONArray r4 = r5.optJSONArray(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r4 == 0) goto L_0x0307
            r2 = 0
        L_0x02ec:
            int r1 = r4.length()
            if (r2 >= r1) goto L_0x0307
            org.json.JSONObject r13 = r4.optJSONObject(r2)
            java.lang.String r1 = "product_id"
            java.lang.String r13 = r13.optString(r1)
            X.9tW r1 = new X.9tW
            r1.<init>(r13)
            r3.add(r1)
            int r2 = r2 + 1
            goto L_0x02ec
        L_0x0307:
            java.lang.String r1 = "product_sections_title"
            java.lang.String r2 = r5.optString(r1)
            X.9td r1 = new X.9td
            r1.<init>(r2, r3)
            r10.add(r1)
            int r6 = r6 + 1
            goto L_0x02d4
        L_0x0318:
            java.lang.String r1 = "product_header_info"
            org.json.JSONObject r2 = r11.optJSONObject(r1)
            if (r2 == 0) goto L_0x0348
            java.lang.String r1 = "product_header_info_thumb"
            java.lang.String r3 = r2.optString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x0330
            byte[] r12 = android.util.Base64.decode(r3, r7)
        L_0x0330:
            java.lang.String r1 = "product_header_info_id"
            java.lang.String r3 = r2.optString(r1)
            java.lang.String r1 = "product_header_is_rejected"
            boolean r1 = r2.optBoolean(r1, r7)
            X.9tm r2 = new X.9tm
            r2.<init>(r12, r3, r1)
        L_0x0341:
            X.9u1 r3 = new X.9u1
            r3.<init>(r15, r2, r10)
            goto L_0x0294
        L_0x0348:
            java.lang.String r1 = ""
            X.9tm r2 = new X.9tm
            r2.<init>(r14, r1, r7)
            goto L_0x0341
        L_0x0350:
            r3 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "MultiElementConverter/parseProductListInfo/Invalid jid: "
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.e(r1, r3)
            r3 = r14
            goto L_0x0294
        L_0x0368:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Not a shop content: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x037f:
            r1 = move-exception
            java.lang.String r0 = "ShopInfoContentConverter/parseJSON error"
            com.whatsapp.util.Log.w(r0, r1)
            return r7
        L_0x0386:
            r1 = move-exception
            java.lang.String r0 = "CarouselMessageConverter/parseJSON/deserialization error"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x038c:
            return r14
        L_0x038d:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1F3.A01(X.16T, org.json.JSONObject):X.9uk");
    }

    public static C206659tl A02(JSONObject jSONObject) {
        byte[] bArr;
        String str = null;
        String optString = jSONObject.optString("title");
        if (!TextUtils.isEmpty(optString)) {
            str = optString;
        }
        String str2 = null;
        String optString2 = jSONObject.optString("sub_title");
        if (!TextUtils.isEmpty(optString2)) {
            str2 = optString2;
        }
        String str3 = null;
        String optString3 = jSONObject.optString("header_thumbnail");
        if (!TextUtils.isEmpty(optString3)) {
            str3 = optString3;
        }
        if (!TextUtils.isEmpty(str3)) {
            bArr = Base64.decode(str3, 0);
        } else {
            bArr = null;
        }
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || bArr != null) {
            return new C206659tl(str, bArr, str2);
        }
        return null;
    }

    public static void A04(ContentValues contentValues, AnonymousClass1F3 r8, String str, String str2, int i, long j) {
        AnonymousClass1M0 A052 = r8.A01.A05();
        try {
            C224114e r3 = A052.A02;
            ContentValues contentValues2 = contentValues;
            if (r3.A01(contentValues2, str, "element_type = ? AND message_row_id = ?", str2, new String[]{String.valueOf(i), String.valueOf(j)}) == 0) {
                r3.A04(str, str2, contentValues2);
            }
            A052.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public static void A05(AnonymousClass1F3 r17, AnonymousClass3T1 r18, String str, long j) {
        C206969uL r13;
        String str2;
        AnonymousClass1M0 A042 = r17.A01.get();
        try {
            Cursor A09 = A042.A02.A09(str, "GET_MESSAGE_UI_ELEMENTS_BY_MESSAGE_ROW_ID_SQL", new String[]{String.valueOf(j)});
            try {
                if (A09.moveToFirst()) {
                    int i = A09.getInt(A09.getColumnIndexOrThrow("element_type"));
                    String string = A09.getString(A09.getColumnIndexOrThrow("element_content"));
                    if (i == 2 && !TextUtils.isEmpty(string)) {
                        C18740tg.A06(string);
                        JSONObject jSONObject = new JSONObject(string);
                        ArrayList arrayList = new ArrayList();
                        JSONArray optJSONArray = jSONObject.optJSONArray("buttons");
                        if (optJSONArray != null) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                                JSONObject optJSONObject = jSONObject2.optJSONObject("native_flow_info");
                                if (optJSONObject != null) {
                                    String string2 = optJSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("params");
                                    if (optJSONObject2 == null) {
                                        str2 = null;
                                    } else {
                                        str2 = optJSONObject2.toString();
                                    }
                                    r13 = new C206969uL(string2, str2);
                                } else {
                                    r13 = null;
                                }
                                arrayList.add(new AnonymousClass3EY(r13, jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), jSONObject2.optString("displayText"), jSONObject2.optInt("button_type", 0), jSONObject2.optBoolean("selected")));
                            }
                        }
                        r18.A10(new AnonymousClass37E(jSONObject.optString("content"), jSONObject.optString("footer"), arrayList));
                    }
                }
            } catch (JSONException e) {
                Log.w("ButtonsConverter/parseJSON/deserialization error", e);
            } catch (Throwable th) {
                if (A09 != null) {
                    A09.close();
                }
                throw th;
            }
            A09.close();
            A042.close();
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public static void A06(AnonymousClass1F3 r15, AnonymousClass37E r16, String str, long j) {
        String str2;
        AnonymousClass37E r2 = r16;
        if (r16 != null) {
            ContentValues contentValues = new ContentValues();
            long j2 = j;
            contentValues.put("message_row_id", Long.valueOf(j2));
            contentValues.put("element_type", 2);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("content", r2.A00);
                jSONObject.put("footer", r2.A01);
                JSONArray jSONArray = new JSONArray();
                for (AnonymousClass3EY r22 : r2.A02) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r22.A04);
                    String str3 = r22.A03;
                    if (str3 != null) {
                        jSONObject2.put("displayText", str3);
                    }
                    jSONObject2.put("selected", r22.A00);
                    jSONObject2.put("button_type", r22.A01);
                    C206969uL r23 = r22.A02;
                    if (r23 != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r23.A00);
                        String str4 = r23.A01;
                        if (str4 != null && str4.length() > 0) {
                            jSONObject3.put("params", new JSONObject(str4));
                        }
                        jSONObject2.put("native_flow_info", jSONObject3);
                    }
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("buttons", jSONArray);
                str2 = jSONObject.toString();
            } catch (JSONException e) {
                Log.w("ButtonsConverter/toJSONObject/serialization error", e);
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                contentValues.put("element_content", str2);
            }
            A04(contentValues, r15, str, "MessageUIElementsStore/insertOrUpdateQuotedButtonMessageElement", 2, j2);
        }
    }

    public static void A07(AnonymousClass1F3 r7, AnonymousClass2cU r8, String str, String str2) {
        Cursor A09;
        boolean z = false;
        if (r8.A1N > 0) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MessageUIElementsStore/fillReplyDataIfAvailable/message must have row_id set; key=");
        sb.append(r8.A1J);
        C18740tg.A0E(z, sb.toString());
        String[] strArr = {String.valueOf(r8.A1N)};
        AnonymousClass1M0 A042 = r7.A01.get();
        try {
            A09 = A042.A02.A09(str, str2, strArr);
            if (A09.moveToLast()) {
                String string = A09.getString(A09.getColumnIndexOrThrow("reply_values"));
                String string2 = A09.getString(A09.getColumnIndexOrThrow("reply_description"));
                r8.A16(string);
                r8.A00 = string2;
            }
            A09.close();
            A042.close();
            return;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public static void A08(AnonymousClass1F3 r10, AnonymousClass2cT r11, String str, String str2) {
        int i;
        C207149ud r2;
        AnonymousClass90O r0;
        boolean z = false;
        if (r11.A1N > 0) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MessageUIElementsStore/fillReplyDataIfAvailable/message must have row_id set; key=");
        sb.append(r11.A1J);
        C18740tg.A0E(z, sb.toString());
        String[] strArr = {String.valueOf(r11.A1N)};
        AnonymousClass1M0 A042 = r10.A01.get();
        try {
            Cursor A09 = A042.A02.A09(str, str2, strArr);
            try {
                if (A09.moveToLast()) {
                    int i2 = A09.getInt(A09.getColumnIndexOrThrow("element_type"));
                    if (i2 == 1) {
                        i = 1;
                    } else {
                        i = 0;
                        if (i2 == 8) {
                            i = 2;
                        }
                    }
                    String string = A09.getString(A09.getColumnIndexOrThrow("reply_description"));
                    if (1 == i || i == 0) {
                        r2 = new C207149ud(A09.getString(A09.getColumnIndexOrThrow("reply_values")), string, (String) null, i);
                    } else {
                        C206919uD r9 = null;
                        if (!TextUtils.isEmpty(string)) {
                            JSONObject jSONObject = new JSONObject(string);
                            if (2 == jSONObject.optInt("response_message_type")) {
                                String optString = jSONObject.optString("description", "");
                                JSONObject optJSONObject = jSONObject.optJSONObject("native_flow_response_content");
                                if (optJSONObject != null) {
                                    r9 = new C206919uD(optJSONObject.optString("native_flow_response_name", ""), optJSONObject.optString("native_flow_response_params_json", ""));
                                }
                                int optInt = jSONObject.optInt("native_flow_response_body_format", 0);
                                if (optInt == 0) {
                                    r0 = AnonymousClass90O.DEFAULT;
                                } else if (optInt != 1) {
                                    r0 = null;
                                } else {
                                    r0 = AnonymousClass90O.EXTENSIONS_1;
                                }
                                r2 = new C207149ud(r0, r9, optString);
                            }
                        }
                    }
                    r11.A00 = r2;
                }
            } catch (JSONException e) {
                Log.w("InteractiveResponseMessageConverter/parseJSON/deserialization error", e);
            } catch (Throwable th) {
                if (A09 != null) {
                    A09.close();
                }
                throw th;
            }
            A09.close();
            A042.close();
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public static void A09(AnonymousClass1F3 r8, C23043B1o b1o, String str, long j) {
        AnonymousClass1M0 A042 = r8.A01.get();
        try {
            Cursor A09 = A042.A02.A09(str, "GET_MESSAGE_UI_ELEMENTS_BY_MESSAGE_ROW_ID_SQL", new String[]{String.valueOf(j)});
            try {
                if (A09.moveToFirst()) {
                    int i = A09.getInt(A09.getColumnIndexOrThrow("element_type"));
                    String string = A09.getString(A09.getColumnIndexOrThrow("element_content"));
                    if (i == 1 || i == 3 || i == 4 || i == 7 || i == 5 || i == 6 || i == 9) {
                        AnonymousClass16T r1 = r8.A04;
                        if (!TextUtils.isEmpty(string)) {
                            C207219uk A012 = A01(r1, new JSONObject(string));
                            if (A012 != null) {
                                b1o.BqZ(A012);
                            }
                        }
                        if (i == 9) {
                            AnonymousClass3T1 r9 = (AnonymousClass3T1) b1o;
                            if (r9 instanceof AnonymousClass2bZ) {
                                C63503Kh r6 = ((AnonymousClass2bZ) r9).A01;
                                if (!r6.A01) {
                                    if (C224714l.A02()) {
                                        r8.A02.A02(new C35701j7(r8, r9, 14), new C63503Kh[]{r6});
                                    } else {
                                        AnonymousClass1F4.A00(r8.A02, new C63503Kh[]{r6}[0]);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                Log.w("InteractiveMessageConverter/parseJSON/deserialization error", e);
            } catch (Throwable th) {
                if (A09 != null) {
                    A09.close();
                }
                throw th;
            }
            A09.close();
            A042.close();
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public int A0A(C207219uk r9) {
        if (r9 == null) {
            return 0;
        }
        int i = r9.A00;
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 6) {
            return 3;
        }
        if (i == 3) {
            C207199ui r0 = r9.A01;
            if (r0 == null || r0.A09.A09.isEmpty()) {
                return 7;
            }
            return 4;
        } else if (i == 4) {
            return 5;
        } else {
            if (i == 5) {
                return 6;
            }
            if (i == 7) {
                return 9;
            }
            if (i == 9) {
                return 6;
            }
            return 0;
        }
    }

    public void A0B(AnonymousClass2cU r10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("element_type", 2);
        contentValues.put("reply_values", r10.A0b());
        contentValues.put("reply_description", r10.A00);
        contentValues.put("message_row_id", Long.valueOf(r10.A1N));
        A04(contentValues, this, "message_ui_elements_reply", "MessageUIElementsStore/insertOrUpdateButtonsResponseMessage", 2, r10.A1N);
    }

    public void A0D(C23043B1o b1o, long j) {
        String str;
        C23043B1o b1o2 = b1o;
        if (b1o2.BA8() != null) {
            ContentValues contentValues = new ContentValues();
            long j2 = j;
            Long valueOf = Long.valueOf(j2);
            contentValues.put("message_row_id", valueOf);
            contentValues.put("element_type", Integer.valueOf(A0A(b1o2.BA8())));
            JSONObject A002 = AnonymousClass96X.A00(b1o2.BA8());
            if (A002 != null) {
                str = A002.toString();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                contentValues.put("element_content", str);
            }
            A04(contentValues, this, "message_ui_elements", "MessageUIElementsStore/insertMessageMultiElement", A0A(b1o2.BA8()), j2);
            if (A0A(b1o2.BA8()) == 9) {
                AnonymousClass1F6 r8 = this.A03;
                if (b1o2 instanceof AnonymousClass2bZ) {
                    if (C20800yB.A01(C21000yV.A02, r8.A03, 4668) && C203369nr.A09((AnonymousClass3T1) b1o2)) {
                        List list = (List) ((AnonymousClass2bZ) b1o2).A01.A00;
                        for (int i = 0; i < list.size(); i++) {
                            AnonymousClass3T1 r9 = (AnonymousClass3T1) list.get(i);
                            if (r9 instanceof AnonymousClass2bU) {
                                AnonymousClass2bU r92 = (AnonymousClass2bU) r9;
                                AnonymousClass1M0 A052 = r8.A02.A05();
                                try {
                                    ContentValues contentValues2 = new ContentValues();
                                    C65013Qj r10 = r92.A01;
                                    if (r10 != null) {
                                        C18740tg.A06(r10);
                                        contentValues2.put("file_size", Long.valueOf(r10.A0C));
                                        AnonymousClass3SW.A03(contentValues2, "media_key", r10.A0a);
                                        contentValues2.put("media_key_timestamp", Long.valueOf(r10.A0D));
                                        contentValues2.put("width", Integer.valueOf(r10.A0A));
                                        contentValues2.put("height", Integer.valueOf(r10.A06));
                                        AnonymousClass3SW.A01(contentValues2, "direct_path", r10.A0J);
                                        File file = r10.A0I;
                                        if (file != null) {
                                            contentValues2.put("file_path", r8.A00.A08(file));
                                        } else {
                                            contentValues2.putNull("file_path");
                                        }
                                        AnonymousClass3SW.A01(contentValues2, "partial_media_hash", r10.A0O);
                                        AnonymousClass3SW.A01(contentValues2, "partial_media_enc_hash", r10.A0N);
                                        AnonymousClass3SW.A03(contentValues2, "scans_sidecar", r10.A0X);
                                        AnonymousClass3SW.A02(contentValues2, "transferred", r10.A0V);
                                    }
                                    AnonymousClass163 r1 = r8.A01;
                                    AnonymousClass11F r0 = r92.A1J.A00;
                                    C18740tg.A06(r0);
                                    long A08 = r1.A08(r0);
                                    String str2 = r92.A07;
                                    String str3 = r92.A05;
                                    long j3 = r92.A00;
                                    String str4 = r92.A04;
                                    String str5 = r92.A03;
                                    contentValues2.put("message_row_id", valueOf);
                                    contentValues2.put("addon_message_index", Integer.valueOf(i));
                                    contentValues2.put("chat_row_id", Long.valueOf(A08));
                                    AnonymousClass3SW.A01(contentValues2, "message_url", str2);
                                    AnonymousClass3SW.A01(contentValues2, "mime_type", str3);
                                    contentValues2.put("file_length", Long.valueOf(j3));
                                    AnonymousClass3SW.A01(contentValues2, "file_hash", str4);
                                    AnonymousClass3SW.A01(contentValues2, "enc_file_hash", str5);
                                    C63683Kz A0V = r92.A0V();
                                    if (A0V != null && A0V.A01()) {
                                        AnonymousClass3SW.A03(contentValues2, "thumbnail", A0V.A02());
                                    }
                                    AnonymousClass3L1 r93 = r92.A0a;
                                    if (r93 != null) {
                                        AnonymousClass3SW.A01(contentValues2, "thumbnail_direct_path", r93.A04);
                                        AnonymousClass3SW.A01(contentValues2, "thumbnail_hash", r93.A08);
                                        AnonymousClass3SW.A01(contentValues2, "enc_thumbnail_hash", r93.A05);
                                    }
                                    C224114e r102 = A052.A02;
                                    if (r102.A01(contentValues2, "addon_message_media", "message_row_id = ? AND addon_message_index = ?", "UPDATE_SECONDARY_MESSAGE_MEDIA_SQL", new String[]{String.valueOf(j2), String.valueOf(i)}) == 0) {
                                        r102.A04("addon_message_media", "INSERT_SECONDARY_MESSAGE_MEDIA_SQL", contentValues2);
                                    }
                                    A052.close();
                                } catch (Throwable th) {
                                    th.addSuppressed(th);
                                    throw th;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public AnonymousClass1F3(AnonymousClass1F6 r1, AnonymousClass16J r2, AnonymousClass12P r3, AnonymousClass16T r4, AnonymousClass1F7 r5, AnonymousClass1F4 r6) {
        this.A00 = r2;
        this.A02 = r6;
        this.A01 = r3;
        this.A03 = r1;
        this.A04 = r4;
        this.A05 = r5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x008b A[Catch:{ JSONException -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090 A[Catch:{ JSONException -> 0x00a1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C207089uX A03(java.lang.String r14) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            r8 = 0
            if (r0 == 0) goto L_0x0008
            return r8
        L_0x0008:
            X.C18740tg.A06(r14)     // Catch:{ JSONException -> 0x00a1 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00a1 }
            r5.<init>(r14)     // Catch:{ JSONException -> 0x00a1 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ JSONException -> 0x00a1 }
            r12.<init>()     // Catch:{ JSONException -> 0x00a1 }
            java.lang.String r0 = "content_of_nfm"
            r7 = 0
            int r14 = r5.optInt(r0, r7)     // Catch:{ JSONException -> 0x00a1 }
            java.lang.String r0 = "buttons"
            org.json.JSONArray r6 = r5.optJSONArray(r0)     // Catch:{ JSONException -> 0x00a1 }
            java.lang.String r0 = "message_params_json"
            java.lang.String r11 = r5.optString(r0)     // Catch:{ JSONException -> 0x00a1 }
            if (r6 == 0) goto L_0x0058
        L_0x002a:
            int r0 = r6.length()     // Catch:{ JSONException -> 0x00a1 }
            if (r7 >= r0) goto L_0x0058
            org.json.JSONObject r1 = r6.getJSONObject(r7)     // Catch:{ JSONException -> 0x00a1 }
            if (r1 == 0) goto L_0x0055
            java.lang.String r0 = "name"
            java.lang.String r4 = r1.optString(r0)     // Catch:{ JSONException -> 0x00a1 }
            java.lang.String r0 = "params"
            java.lang.String r3 = r1.optString(r0)     // Catch:{ JSONException -> 0x00a1 }
            java.lang.String r0 = "selected"
            boolean r2 = r1.optBoolean(r0)     // Catch:{ JSONException -> 0x00a1 }
            X.9uL r1 = new X.9uL     // Catch:{ JSONException -> 0x00a1 }
            r1.<init>(r4, r3)     // Catch:{ JSONException -> 0x00a1 }
            X.9tc r0 = new X.9tc     // Catch:{ JSONException -> 0x00a1 }
            r0.<init>(r1, r2)     // Catch:{ JSONException -> 0x00a1 }
            r12.add(r0)     // Catch:{ JSONException -> 0x00a1 }
        L_0x0055:
            int r7 = r7 + 1
            goto L_0x002a
        L_0x0058:
            java.lang.String r0 = "form_state"
            org.json.JSONObject r3 = r5.optJSONObject(r0)     // Catch:{ JSONException -> 0x00a1 }
            r0 = 2
            if (r14 != r0) goto L_0x008d
            if (r3 == 0) goto L_0x006a
            java.lang.String r0 = "form_elements_values"
            org.json.JSONObject r2 = r3.optJSONObject(r0)     // Catch:{ JSONException -> 0x00a1 }
            goto L_0x006b
        L_0x006a:
            r2 = r8
        L_0x006b:
            if (r11 == 0) goto L_0x0088
            boolean r0 = r11.isEmpty()     // Catch:{ JSONException -> 0x00a1 }
            if (r0 != 0) goto L_0x0088
            X.9Qf r1 = new X.9Qf     // Catch:{ JSONException -> 0x0082 }
            r1.<init>()     // Catch:{ JSONException -> 0x0082 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0082 }
            r0.<init>(r11)     // Catch:{ JSONException -> 0x0082 }
            X.0k2 r13 = r1.A00(r0, r2)     // Catch:{ JSONException -> 0x0082 }
            goto L_0x0089
        L_0x0082:
            r1 = move-exception
            java.lang.String r0 = "NativeFlowMessageConverter/parseDynamicMessageElements/deserialization error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ JSONException -> 0x00a1 }
        L_0x0088:
            r13 = r8
        L_0x0089:
            if (r3 != 0) goto L_0x0090
            r10 = r8
            goto L_0x009b
        L_0x008d:
            r13 = r8
            r10 = r8
            goto L_0x009b
        L_0x0090:
            java.lang.String r0 = "is_form_disabled"
            boolean r0 = r3.optBoolean(r0)     // Catch:{ JSONException -> 0x00a1 }
            X.9tV r10 = new X.9tV     // Catch:{ JSONException -> 0x00a1 }
            r10.<init>(r0)     // Catch:{ JSONException -> 0x00a1 }
        L_0x009b:
            X.9uX r9 = new X.9uX     // Catch:{ JSONException -> 0x00a1 }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x00a1 }
            return r9
        L_0x00a1:
            r1 = move-exception
            java.lang.String r0 = "NativeFlowMessageConverter/parseJSON/deserialization error"
            com.whatsapp.util.Log.w(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1F3.A03(java.lang.String):X.9uX");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r1 != 2) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.AnonymousClass2cT r10) {
        /*
            r9 = this;
            android.content.ContentValues r2 = A00(r10)
            long r0 = r10.A1N
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "message_row_id"
            r2.put(r0, r1)
            long r7 = r10.A1N
            X.9ud r0 = r10.A00
            if (r0 == 0) goto L_0x001f
            int r1 = r0.A05
            r6 = 1
            if (r1 == r6) goto L_0x0020
            r0 = 2
            r6 = 8
            if (r1 == r0) goto L_0x0020
        L_0x001f:
            r6 = 0
        L_0x0020:
            java.lang.String r4 = "message_ui_elements_reply"
            java.lang.String r5 = "MessageUIElementsStore/insertOrUpdateResponseMessage"
            r3 = r9
            A04(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1F3.A0C(X.2cT):void");
    }
}
