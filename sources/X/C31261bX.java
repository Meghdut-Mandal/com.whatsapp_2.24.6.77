package X;

import android.content.ContentValues;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1bX  reason: invalid class name and case insensitive filesystem */
public final class C31261bX {
    public final C31271bY A00;

    public C31261bX(C31271bY r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public static final String A01(String str, JSONObject jSONObject) {
        if (!jSONObject.isNull(str)) {
            String string = jSONObject.getString(str);
            AnonymousClass00C.A0B(string);
            return string;
        }
        String format = String.format(Locale.ENGLISH, "%s is null", Arrays.copyOf(new Object[]{str}, 1));
        AnonymousClass00C.A08(format);
        throw new JSONException(format);
    }

    /* JADX INFO: finally extract failed */
    public final void A04(C192669Ic r21) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        C192669Ic r2 = r21;
        AnonymousClass00C.A0D(r2, 0);
        int parseInt = Integer.parseInt(r2.A00);
        Map map = r2.A01;
        C31271bY r0 = this.A00;
        Integer valueOf = Integer.valueOf(parseInt);
        C229716r r19 = r0.A00;
        AnonymousClass1M0 A04 = r19.A04();
        try {
            A04.A02.A03("quick_promotion_payload", "surface_id = ? ", "DELETE_QUICK_PROMOTION_PAYLOAD_WITH_SURFACE_ID", new String[]{String.valueOf(valueOf)});
            A04.close();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                List<C21642ATi> A0c = C007103b.A0c((Iterable) entry.getValue(), new C89824Ya(3));
                JSONArray jSONArray = new JSONArray();
                for (C21642ATi aTi : A0c) {
                    AnonymousClass00C.A0D(aTi, 0);
                    JSONObject jSONObject6 = new JSONObject();
                    try {
                        jSONObject6.put("promotionId", aTi.A0F);
                        jSONObject6.put("triggers", new JSONArray(aTi.A0H));
                        jSONObject6.put("isServerForcePass", aTi.A0M);
                        jSONObject6.put("startTimeEpochSeconds", aTi.A05);
                        jSONObject6.put("endTimeEpochSeconds", aTi.A03);
                        jSONObject6.put("clientTtlSeconds", aTi.A02);
                        jSONObject6.put("isUncancelable", aTi.A0N);
                        jSONObject6.put("isBypassSurfaceDelay", aTi.A0K);
                        jSONObject6.put("isExposureHoldout", aTi.A0L);
                        jSONObject6.put("maxImpressions", aTi.A01);
                        C193929Nl r13 = aTi.A07;
                        if (r13 != null) {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.putOpt("title", r13.A06);
                            jSONObject7.putOpt("content", r13.A05);
                            C607239c r02 = r13.A01;
                            JSONObject jSONObject8 = null;
                            if (r02 != null) {
                                jSONObject2 = A02(r02);
                            } else {
                                jSONObject2 = null;
                            }
                            jSONObject7.putOpt("primaryAction", jSONObject2);
                            C607239c r03 = r13.A02;
                            if (r03 != null) {
                                jSONObject3 = A02(r03);
                            } else {
                                jSONObject3 = null;
                            }
                            jSONObject7.putOpt("secondaryAction", jSONObject3);
                            C607239c r04 = r13.A00;
                            if (r04 != null) {
                                jSONObject4 = A02(r04);
                            } else {
                                jSONObject4 = null;
                            }
                            jSONObject7.putOpt("dismissPromotion", jSONObject4);
                            C193239Ko r15 = r13.A04;
                            if (r15 != null) {
                                jSONObject5 = new JSONObject();
                                jSONObject5.putOpt("description", r15.A00);
                                byte[] bArr = r15.A02;
                                if (bArr != null) {
                                    jSONObject5.putOpt("lightDataValue", Base64.encodeToString(bArr, 2));
                                }
                                byte[] bArr2 = r15.A01;
                                if (bArr2 != null) {
                                    jSONObject5.putOpt("darkDataValue", Base64.encodeToString(bArr2, 2));
                                }
                            } else {
                                jSONObject5 = null;
                            }
                            jSONObject7.putOpt("image", jSONObject5);
                            C192099Fr r05 = r13.A03;
                            if (r05 != null) {
                                jSONObject8 = new JSONObject();
                                jSONObject8.putOpt("title", r05.A00);
                            }
                            jSONObject7.putOpt("header", jSONObject8);
                            jSONObject6.putOpt("primaryCreative", jSONObject7);
                        }
                        jSONObject6.putOpt("booleanFilter", C200479hT.A01(C197849cT.A03, aTi.A08.A00));
                        jSONObject6.put("hasNativeTemplate", aTi.A0J);
                        jSONObject6.put("hasBloks", aTi.A0I);
                        jSONObject6.put("skipsContentValidation", aTi.A0P);
                        jSONObject6.put("priority", aTi.A04);
                        jSONObject6.put("instanceLogData", aTi.A0E);
                        jSONObject6.put("templateName", aTi.A0G);
                        jSONObject6.put("eligibilityDurationAfterImpressionMs", aTi.A00);
                        jSONObject6.putOpt("dismissable", aTi.A09);
                        jSONObject6.putOpt("surfaceDelayTime", aTi.A0B);
                        jSONObject6.putOpt("experimentKey", aTi.A0C);
                        jSONObject6.putOpt("impressionCooldown", aTi.A0A);
                        jSONObject6.putOpt("instanceId", aTi.A0D);
                        C592233c r06 = aTi.A06;
                        if (r06 == null) {
                            jSONObject = null;
                        } else {
                            jSONObject = new JSONObject(r06.A00);
                        }
                        jSONObject6.putOpt("contentAttributes", jSONObject);
                        jSONObject6.putOpt("logEligibilityWaterfall", Boolean.valueOf(aTi.A0O));
                    } catch (Exception e) {
                        Log.e("waquickpromotionclient/WAQuickPromotion/Error parsing toJson.", e);
                        jSONObject6 = null;
                    }
                    jSONArray.put(jSONObject6);
                }
                String obj = jSONArray.toString();
                AnonymousClass1M0 A042 = r19.A04();
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    ContentValues contentValues = new ContentValues(5);
                    contentValues.put("surface_id", valueOf);
                    contentValues.put("trigger_id", str);
                    contentValues.put("trigger_context", (String) null);
                    contentValues.put("qp_details", obj);
                    contentValues.put("insertion_time", Long.valueOf(currentTimeMillis));
                    A042.A02.A08("quick_promotion_payload", "INSERT_WITH_ON_CONFLICT_QUICK_PROMOTION_PAYLOAD", contentValues, 5);
                    A042.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            A04.close();
            throw th;
        }
    }

    public static final C607239c A00(JSONObject jSONObject) {
        String str;
        String str2;
        String str3 = null;
        if (jSONObject.has("title")) {
            str = A01("title", jSONObject);
        } else {
            str = null;
        }
        if (jSONObject.has("url")) {
            str2 = A01("url", jSONObject);
        } else {
            str2 = null;
        }
        if (jSONObject.has("fallBackUrl")) {
            str3 = A01("fallBackUrl", jSONObject);
        }
        return new C607239c(str, str2, str3, jSONObject.getInt("limit"), jSONObject.getBoolean("dismissPromotion"));
    }

    public static final JSONObject A02(C607239c r3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("title", r3.A02);
        jSONObject.putOpt("url", r3.A03);
        jSONObject.putOpt("fallBackUrl", r3.A01);
        jSONObject.put("limit", r3.A00);
        jSONObject.put("dismissPromotion", r3.A04);
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02d7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A03(java.lang.String r59, int r60) {
        /*
            r58 = this;
            r0 = r58
            X.1bY r2 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r60)
            r0 = 2
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0 = 0
            r4[r0] = r1
            r0 = 1
            r4[r0] = r59
            X.16r r0 = r2.A00
            X.1M0 r3 = r0.get()
            X.14e r2 = r3.A02     // Catch:{ all -> 0x02e8 }
            java.lang.String r1 = "SELECT qp_details FROM quick_promotion_payload WHERE surface_id =? AND trigger_id =?"
            java.lang.String r0 = "SELECT_QUICK_PROMOTION_PAYLOAD"
            android.database.Cursor r2 = r2.A09(r1, r0, r4)     // Catch:{ all -> 0x02e8 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x02dc }
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = "qp_details"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02dc }
            java.lang.String r1 = r2.getString(r0)     // Catch:{ all -> 0x02dc }
            goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            r2.close()     // Catch:{ all -> 0x02e8 }
            r3.close()
            java.util.ArrayList r22 = new java.util.ArrayList
            r22.<init>()
            if (r1 == 0) goto L_0x02db
            org.json.JSONArray r21 = new org.json.JSONArray
            r0 = r21
            r0.<init>(r1)
            r11 = 0
            int r20 = r21.length()
        L_0x0050:
            r0 = r20
            if (r11 >= r0) goto L_0x02db
            r0 = r21
            org.json.JSONObject r1 = r0.getJSONObject(r11)
            if (r1 == 0) goto L_0x02d7
            java.lang.String r19 = "contentAttributes"
            java.lang.String r18 = "instanceId"
            java.lang.String r15 = "impressionCooldown"
            java.lang.String r14 = "experimentKey"
            java.lang.String r13 = "surfaceDelayTime"
            java.lang.String r12 = "dismissable"
            java.lang.String r9 = "booleanFilter"
            java.lang.String r0 = "primaryCreative"
            java.lang.String r2 = "promotionId"
            java.lang.String r30 = A01(r2, r1)     // Catch:{ Exception -> 0x02c9 }
            java.util.HashSet r17 = new java.util.HashSet     // Catch:{ Exception -> 0x02c9 }
            r17.<init>()     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r2 = "triggers"
            org.json.JSONArray r6 = r1.getJSONArray(r2)     // Catch:{ Exception -> 0x02c9 }
            r5 = 0
            int r4 = r6.length()     // Catch:{ Exception -> 0x02c9 }
        L_0x0082:
            if (r5 >= r4) goto L_0x0090
            java.lang.String r3 = r6.getString(r5)     // Catch:{ Exception -> 0x02c9 }
            r2 = r17
            r2.add(r3)     // Catch:{ Exception -> 0x02c9 }
            int r5 = r5 + 1
            goto L_0x0082
        L_0x0090:
            java.lang.String r2 = "isServerForcePass"
            boolean r46 = r1.getBoolean(r2)     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r2 = "startTimeEpochSeconds"
            long r38 = r1.getLong(r2)     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r2 = "endTimeEpochSeconds"
            long r40 = r1.getLong(r2)     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r2 = "clientTtlSeconds"
            long r42 = r1.getLong(r2)     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r2 = "isUncancelable"
            boolean r47 = r1.getBoolean(r2)     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r2 = "isBypassSurfaceDelay"
            boolean r48 = r1.getBoolean(r2)     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r2 = "isExposureHoldout"
            boolean r49 = r1.getBoolean(r2)     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r2 = "maxImpressions"
            int r36 = r1.getInt(r2)     // Catch:{ Exception -> 0x02c9 }
            boolean r2 = r1.has(r0)     // Catch:{ Exception -> 0x02c9 }
            if (r2 == 0) goto L_0x028a
            org.json.JSONObject r0 = r1.getJSONObject(r0)     // Catch:{ Exception -> 0x02c9 }
            X.AnonymousClass00C.A0B(r0)     // Catch:{ Exception -> 0x02c9 }
            r2 = 0
            X.AnonymousClass00C.A0D(r0, r2)     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r3 = "title"
            boolean r2 = r0.has(r3)     // Catch:{ Exception -> 0x02c9 }
            r7 = 0
            if (r2 == 0) goto L_0x0286
            java.lang.String r56 = A01(r3, r0)     // Catch:{ Exception -> 0x02c9 }
        L_0x00de:
            java.lang.String r2 = "content"
            boolean r4 = r0.has(r2)     // Catch:{ Exception -> 0x02c9 }
            if (r4 == 0) goto L_0x0282
            java.lang.String r57 = A01(r2, r0)     // Catch:{ Exception -> 0x02c9 }
        L_0x00ea:
            java.lang.String r2 = "primaryAction"
            boolean r4 = r0.has(r2)     // Catch:{ Exception -> 0x02c9 }
            if (r4 == 0) goto L_0x027e
            org.json.JSONObject r2 = r0.getJSONObject(r2)     // Catch:{ Exception -> 0x02c9 }
            X.AnonymousClass00C.A08(r2)     // Catch:{ Exception -> 0x02c9 }
            X.39c r51 = A00(r2)     // Catch:{ Exception -> 0x02c9 }
        L_0x00fd:
            java.lang.String r2 = "secondaryAction"
            boolean r4 = r0.has(r2)     // Catch:{ Exception -> 0x02c9 }
            if (r4 == 0) goto L_0x027a
            org.json.JSONObject r2 = r0.getJSONObject(r2)     // Catch:{ Exception -> 0x02c9 }
            X.AnonymousClass00C.A08(r2)     // Catch:{ Exception -> 0x02c9 }
            X.39c r52 = A00(r2)     // Catch:{ Exception -> 0x02c9 }
        L_0x0110:
            java.lang.String r2 = "dismissPromotion"
            boolean r4 = r0.has(r2)     // Catch:{ Exception -> 0x02c9 }
            if (r4 == 0) goto L_0x0276
            org.json.JSONObject r2 = r0.getJSONObject(r2)     // Catch:{ Exception -> 0x02c9 }
            X.AnonymousClass00C.A08(r2)     // Catch:{ Exception -> 0x02c9 }
            X.39c r53 = A00(r2)     // Catch:{ Exception -> 0x02c9 }
        L_0x0123:
            java.lang.String r2 = "image"
            boolean r4 = r0.has(r2)     // Catch:{ Exception -> 0x02c9 }
            if (r4 == 0) goto L_0x0273
            org.json.JSONObject r2 = r0.getJSONObject(r2)     // Catch:{ Exception -> 0x02c9 }
            X.AnonymousClass00C.A08(r2)     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r4 = "description"
            boolean r5 = r2.has(r4)     // Catch:{ Exception -> 0x02c9 }
            r6 = 0
            if (r5 == 0) goto L_0x0270
            java.lang.String r10 = A01(r4, r2)     // Catch:{ Exception -> 0x02c9 }
        L_0x013f:
            java.lang.String r4 = "lightDataValue"
            boolean r8 = r2.has(r4)     // Catch:{ Exception -> 0x02c9 }
            r5 = 2
            if (r8 == 0) goto L_0x026d
            java.lang.String r4 = A01(r4, r2)     // Catch:{ Exception -> 0x02c9 }
            byte[] r8 = android.util.Base64.decode(r4, r5)     // Catch:{ Exception -> 0x02c9 }
        L_0x0150:
            java.lang.String r4 = "darkDataValue"
            boolean r16 = r2.has(r4)     // Catch:{ Exception -> 0x02c9 }
            if (r16 == 0) goto L_0x0160
            java.lang.String r2 = A01(r4, r2)     // Catch:{ Exception -> 0x02c9 }
            byte[] r6 = android.util.Base64.decode(r2, r5)     // Catch:{ Exception -> 0x02c9 }
        L_0x0160:
            X.9Ko r4 = new X.9Ko     // Catch:{ Exception -> 0x02c9 }
            r4.<init>(r10, r8, r6)     // Catch:{ Exception -> 0x02c9 }
        L_0x0165:
            java.lang.String r2 = "header"
            boolean r5 = r0.has(r2)     // Catch:{ Exception -> 0x02c9 }
            if (r5 == 0) goto L_0x0183
            org.json.JSONObject r0 = r0.getJSONObject(r2)     // Catch:{ Exception -> 0x02c9 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ Exception -> 0x02c9 }
            boolean r2 = r0.has(r3)     // Catch:{ Exception -> 0x02c9 }
            if (r2 == 0) goto L_0x026a
            java.lang.String r0 = A01(r3, r0)     // Catch:{ Exception -> 0x02c9 }
        L_0x017e:
            X.9Fr r7 = new X.9Fr     // Catch:{ Exception -> 0x02c9 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x02c9 }
        L_0x0183:
            X.9Nl r25 = new X.9Nl     // Catch:{ Exception -> 0x02c9 }
            r50 = r25
            r54 = r7
            r55 = r4
            r50.<init>(r51, r52, r53, r54, r55, r56, r57)     // Catch:{ Exception -> 0x02c9 }
        L_0x018e:
            X.8z7 r2 = X.C188148z7.UNKNOWN     // Catch:{ Exception -> 0x02c9 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x02c9 }
            r4.<init>()     // Catch:{ Exception -> 0x02c9 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x02c9 }
            r3.<init>()     // Catch:{ Exception -> 0x02c9 }
            X.9cT r0 = new X.9cT     // Catch:{ Exception -> 0x02c9 }
            r0.<init>(r2, r4, r3)     // Catch:{ Exception -> 0x02c9 }
            X.9Ft r4 = new X.9Ft     // Catch:{ Exception -> 0x02c9 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x02c9 }
            boolean r0 = r1.has(r9)     // Catch:{ Exception -> 0x02c9 }
            if (r0 == 0) goto L_0x01ca
            org.json.JSONObject r0 = r1.getJSONObject(r9)     // Catch:{ Exception -> 0x02c9 }
            X.9hT r3 = X.C197849cT.A03     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02c9 }
            if (r0 == 0) goto L_0x0259
            int r4 = r0.length()     // Catch:{ Exception -> 0x02c9 }
            if (r4 == 0) goto L_0x0259
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x02c9 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x02c9 }
            X.9cT r0 = X.C200479hT.A00(r3, r2)     // Catch:{ Exception -> 0x02c9 }
        L_0x01c5:
            X.9Ft r4 = new X.9Ft     // Catch:{ Exception -> 0x02c9 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x02c9 }
        L_0x01ca:
            java.lang.String r0 = "hasNativeTemplate"
            boolean r50 = r1.getBoolean(r0)     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r0 = "hasBloks"
            boolean r51 = r1.getBoolean(r0)     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r0 = "skipsContentValidation"
            boolean r52 = r1.getBoolean(r0)     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r0 = "priority"
            long r44 = r1.getLong(r0)     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r0 = "instanceLogData"
            java.lang.String r31 = A01(r0, r1)     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r0 = "templateName"
            java.lang.String r32 = A01(r0, r1)     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r0 = "eligibilityDurationAfterImpressionMs"
            int r37 = r1.getInt(r0)     // Catch:{ Exception -> 0x02c9 }
            boolean r0 = r1.has(r12)     // Catch:{ Exception -> 0x02c9 }
            if (r0 == 0) goto L_0x0256
            boolean r0 = r1.getBoolean(r12)     // Catch:{ Exception -> 0x02c9 }
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x02c9 }
        L_0x0202:
            boolean r0 = r1.has(r13)     // Catch:{ Exception -> 0x02c9 }
            if (r0 == 0) goto L_0x0253
            int r0 = r1.getInt(r13)     // Catch:{ Exception -> 0x02c9 }
            java.lang.Integer r28 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02c9 }
        L_0x0210:
            boolean r0 = r1.has(r14)     // Catch:{ Exception -> 0x02c9 }
            if (r0 == 0) goto L_0x0250
            java.lang.String r33 = A01(r14, r1)     // Catch:{ Exception -> 0x02c9 }
        L_0x021a:
            boolean r0 = r1.has(r15)     // Catch:{ Exception -> 0x02c9 }
            if (r0 == 0) goto L_0x024d
            int r0 = r1.getInt(r15)     // Catch:{ Exception -> 0x02c9 }
            java.lang.Integer r29 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02c9 }
        L_0x0228:
            r0 = r18
            boolean r0 = r1.has(r0)     // Catch:{ Exception -> 0x02c9 }
            if (r0 == 0) goto L_0x024a
            r0 = r18
            java.lang.String r34 = r1.getString(r0)     // Catch:{ Exception -> 0x02c9 }
        L_0x0236:
            r0 = r19
            boolean r0 = r1.has(r0)     // Catch:{ Exception -> 0x02c9 }
            if (r0 == 0) goto L_0x02ae
            r0 = r19
            org.json.JSONObject r2 = r1.getJSONObject(r0)     // Catch:{ Exception -> 0x02c9 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Exception -> 0x02c9 }
            r3.<init>()     // Catch:{ Exception -> 0x02c9 }
            goto L_0x028e
        L_0x024a:
            r34 = 0
            goto L_0x0236
        L_0x024d:
            r29 = 0
            goto L_0x0228
        L_0x0250:
            r33 = 0
            goto L_0x021a
        L_0x0253:
            r28 = 0
            goto L_0x0210
        L_0x0256:
            r27 = 0
            goto L_0x0202
        L_0x0259:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x02c9 }
            r4.<init>()     // Catch:{ Exception -> 0x02c9 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x02c9 }
            r3.<init>()     // Catch:{ Exception -> 0x02c9 }
            X.9cT r0 = new X.9cT     // Catch:{ Exception -> 0x02c9 }
            r0.<init>(r2, r4, r3)     // Catch:{ Exception -> 0x02c9 }
            goto L_0x01c5
        L_0x026a:
            r0 = 0
            goto L_0x017e
        L_0x026d:
            r8 = r7
            goto L_0x0150
        L_0x0270:
            r10 = r7
            goto L_0x013f
        L_0x0273:
            r4 = r7
            goto L_0x0165
        L_0x0276:
            r53 = r7
            goto L_0x0123
        L_0x027a:
            r52 = r7
            goto L_0x0110
        L_0x027e:
            r51 = r7
            goto L_0x00fd
        L_0x0282:
            r57 = r7
            goto L_0x00ea
        L_0x0286:
            r56 = r7
            goto L_0x00de
        L_0x028a:
            r25 = 0
            goto L_0x018e
        L_0x028e:
            if (r2 == 0) goto L_0x02ae
            java.util.Iterator r6 = r2.keys()     // Catch:{ Exception -> 0x02c9 }
        L_0x0294:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x02c9 }
            if (r0 == 0) goto L_0x02b0
            java.lang.Object r0 = r6.next()     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r5 = r2.getString(r0)     // Catch:{ Exception -> 0x02c9 }
            X.AnonymousClass00C.A0B(r0)     // Catch:{ Exception -> 0x02c9 }
            X.AnonymousClass00C.A0B(r5)     // Catch:{ Exception -> 0x02c9 }
            r3.put(r0, r5)     // Catch:{ Exception -> 0x02c9 }
            goto L_0x0294
        L_0x02ae:
            r2 = 0
            goto L_0x02b5
        L_0x02b0:
            X.33c r2 = new X.33c     // Catch:{ Exception -> 0x02c9 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x02c9 }
        L_0x02b5:
            java.lang.String r0 = "logEligibilityWaterfall"
            boolean r53 = r1.optBoolean(r0)     // Catch:{ Exception -> 0x02c9 }
            X.ATi r0 = new X.ATi     // Catch:{ Exception -> 0x02c9 }
            r26 = r4
            r35 = r17
            r23 = r0
            r24 = r2
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42, r44, r46, r47, r48, r49, r50, r51, r52, r53)     // Catch:{ Exception -> 0x02c9 }
            goto L_0x02d0
        L_0x02c9:
            r1 = move-exception
            java.lang.String r0 = "waquickpromotionclient/WAQuickPromotion/Error parsing FromJson."
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
        L_0x02d0:
            if (r0 == 0) goto L_0x02d7
            r1 = r22
            r1.add(r0)
        L_0x02d7:
            int r11 = r11 + 1
            goto L_0x0050
        L_0x02db:
            return r22
        L_0x02dc:
            r1 = move-exception
            if (r2 == 0) goto L_0x02e7
            r2.close()     // Catch:{ all -> 0x02e3 }
            goto L_0x02e7
        L_0x02e3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x02e8 }
        L_0x02e7:
            throw r1     // Catch:{ all -> 0x02e8 }
        L_0x02e8:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x02ed }
            throw r1
        L_0x02ed:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31261bX.A03(java.lang.String, int):java.util.ArrayList");
    }
}
