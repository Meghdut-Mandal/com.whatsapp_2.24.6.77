package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Kg  reason: invalid class name and case insensitive filesystem */
public final class C26461Kg {
    public final C26471Kh A00;
    public final AnonymousClass1KY A01;
    public final AnonymousClass1KT A02;
    public final C26451Kf A03;
    public final C20810yC A04;
    public final C005502l A05;
    public final C19700wN A06;
    public final C19970wo A07;
    public final AnonymousClass1KW A08;
    public final C26491Kj A09;
    public final C26551Kp A0A;
    public final C19770wU A0B;

    public C26461Kg(C19700wN r2, C26471Kh r3, C19970wo r4, AnonymousClass1KW r5, AnonymousClass1KY r6, C26491Kj r7, AnonymousClass1KT r8, C26451Kf r9, C26551Kp r10, C20810yC r11, C19770wU r12, C005502l r13) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r11, 5);
        AnonymousClass00C.A0D(r12, 6);
        AnonymousClass00C.A0D(r4, 7);
        AnonymousClass00C.A0D(r13, 11);
        this.A08 = r5;
        this.A06 = r2;
        this.A00 = r3;
        this.A09 = r7;
        this.A04 = r11;
        this.A0B = r12;
        this.A07 = r4;
        this.A03 = r9;
        this.A0A = r10;
        this.A02 = r8;
        this.A05 = r13;
        this.A01 = r6;
    }

    public final AnonymousClass6AE A04(String str, long j) {
        AnonymousClass00C.A0D(str, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("extensions_metadata_v2_");
        sb.append(str);
        String string = ((SharedPreferences) this.A08.A00.get()).getString(sb.toString(), (String) null);
        if (string == null || string.length() == 0) {
            return new AnonymousClass6AE(C108115Sf.NOT_PRESENT, (C121585tN) null);
        }
        try {
            C121585tN A022 = A02(new JSONObject(string));
            if (System.currentTimeMillis() > A022.A00 + j) {
                return new AnonymousClass6AE(C108115Sf.EXPIRED, (C121585tN) null);
            }
            return new AnonymousClass6AE(C108115Sf.SUCCESS, A022);
        } catch (JSONException e) {
            Log.w("FlowsLogger/FlowsMetadataManager/canReadFromSharedPref() - Json parsing exception", e);
            return new AnonymousClass6AE(C108115Sf.PARSE_ERROR, (C121585tN) null);
        }
    }

    public final C121585tN A05(UserJid userJid, Integer num, String str) {
        int intValue;
        String str2;
        int i;
        String str3;
        if (str != null) {
            C20810yC r2 = this.A04;
            C21000yV r1 = C21000yV.A02;
            if (C20800yB.A01(r1, r2, 7352)) {
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
                C26451Kf r5 = this.A03;
                Integer valueOf = Integer.valueOf(i);
                r5.A08(valueOf, "metadata_cache_start");
                AnonymousClass6AE A042 = A04(str, ((long) C20800yB.A00(r1, r2, 2891)) * 60000);
                int ordinal = A042.A00.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 1) {
                        str3 = "no_cache";
                    } else if (ordinal != 0) {
                        if (ordinal == 3) {
                            str3 = "cache_parse_error";
                        }
                        r5.A04(i, "fetch_cache_hit", false);
                        r5.A08(valueOf, "metadata_cache_end");
                        return null;
                    } else {
                        str3 = "cache_expired";
                    }
                    r5.A0C(i, str3);
                    r5.A04(i, "fetch_cache_hit", false);
                    r5.A08(valueOf, "metadata_cache_end");
                    return null;
                }
                r5.A04(i, "fetch_cache_hit", true);
                r5.A08(valueOf, "metadata_cache_end");
                return A042.A01;
            }
        }
        C26451Kf r52 = this.A03;
        r52.A08(num, "metadata_cache_start");
        C121585tN r6 = null;
        if (A0A(userJid, ((long) C20800yB.A00(C21000yV.A02, this.A04, 2891)) * 60000)) {
            if (num != null) {
                intValue = num.intValue();
                r52.A04(intValue, "fetch_cache_hit", false);
                str2 = "cache_expired";
            }
            return r6;
        }
        AnonymousClass1KW r0 = this.A08;
        String rawString = userJid.getRawString();
        AnonymousClass00C.A0D(rawString, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("extensions_metadata_");
        sb.append(rawString);
        String string = ((SharedPreferences) r0.A00.get()).getString(sb.toString(), (String) null);
        if (string != null) {
            if (num != null) {
                try {
                    r52.A04(num.intValue(), "fetch_cache_hit", true);
                } catch (JSONException e) {
                    Log.w("FlowsLogger/FlowsMetadataManager/canReadFromSharedPref() - Json parsing exception", e);
                    if (num != null) {
                        int intValue2 = num.intValue();
                        r52.A04(intValue2, "fetch_cache_hit", false);
                        r52.A03(intValue2, "metadata_network_fetch_reason", "cache_parse_error");
                    }
                } catch (Throwable th) {
                    r52.A08(num, "metadata_cache_end");
                    throw th;
                }
            }
            r6 = A02(new JSONObject(string));
            r52.A08(num, "metadata_cache_end");
            return r6;
        }
        if (num != null) {
            intValue = num.intValue();
            r52.A04(intValue, "fetch_cache_hit", false);
            str2 = "no_cache";
        }
        return r6;
        r52.A03(intValue, "metadata_network_fetch_reason", str2);
        r52.A08(num, "metadata_cache_end");
        return r6;
    }

    public final void A07(C158247gc r11, UserJid userJid, Integer num, String str, String str2, String str3, boolean z) {
        this.A0B.Boy(new AnonymousClass745(r11, this, userJid, num, str3, str, str2, z));
    }

    public final void A09(UserJid userJid, String str, String str2, String str3, C009003v r26) {
        boolean A0A2;
        String str4 = str;
        AnonymousClass00C.A0D(str4, 0);
        C20810yC r6 = this.A04;
        C21000yV r5 = C21000yV.A02;
        long A002 = ((long) C20800yB.A00(r5, r6, 4849)) * 60000;
        UserJid userJid2 = userJid;
        if (C20800yB.A01(r5, r6, 7352)) {
            A0A2 = false;
            if (A04(str4, A002).A00 != C108115Sf.SUCCESS) {
                A0A2 = true;
            }
        } else {
            A0A2 = A0A(userJid2, A002);
        }
        AnonymousClass1KT r2 = this.A02;
        int hashCode = str4.hashCode();
        C009003v r3 = r26;
        if (A0A2) {
            r2.A0G(false, hashCode);
            r2.A08(Integer.valueOf(hashCode), "metadata_network_start");
            C26451Kf r22 = this.A03;
            int A0B2 = r22.A0B(userJid2, "screen_transition_integrity_check");
            r22.A06(userJid2, str2, str3, str4, A0B2);
            r22.A04(A0B2, "fetch_cache_hit", false);
            A07(new C145396tp(this, str4, r3, A0B2), userJid2, Integer.valueOf(A0B2), (String) null, (String) null, str4, false);
            return;
        }
        r2.A0G(true, hashCode);
        r3.invoke(true, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass6CM A00(X.C158247gc r22, X.C26461Kg r23, X.C123815x8 r24, com.whatsapp.jid.UserJid r25, java.lang.Integer r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, boolean r30) {
        /*
            r4 = r23
            X.1Kf r11 = r4.A03
            java.lang.String r2 = "metadata_network_end"
            r12 = r26
            r11.A08(r12, r2)
            X.1KT r1 = r4.A02
            r3 = 0
            r9 = r29
            if (r29 == 0) goto L_0x017d
            int r0 = r9.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x001a:
            r1.A08(r0, r2)
            r1 = 1
            r2 = 0
            r8 = r24
            int r0 = r8.A00
            r16 = 3
            r5 = r22
            if (r0 != 0) goto L_0x0206
            X.60z r0 = r8.A03
            X.AnonymousClass00C.A08(r0)
            java.lang.Object r10 = r0.A00
            X.6BQ r10 = (X.AnonymousClass6BQ) r10
            if (r10 == 0) goto L_0x0179
            java.util.List r7 = r10.A02
            X.6AF r6 = r10.A01
        L_0x0038:
            r4.A08(r8, r12)
            r13 = r25
            X.AnonymousClass00C.A0D(r13, r1)
            if (r26 == 0) goto L_0x0176
            int r14 = r12.intValue()
        L_0x0046:
            java.lang.String r0 = "endpoint_public_key_received"
            if (r6 == 0) goto L_0x0165
            java.lang.String r8 = r6.A00
            if (r8 == 0) goto L_0x0165
            int r15 = r8.length()
            if (r15 == 0) goto L_0x0165
            java.lang.String r6 = r6.A01
            if (r6 == 0) goto L_0x0165
            int r15 = r6.length()
            if (r15 == 0) goto L_0x0165
            r11.A04(r14, r0, r1)
            X.1KY r1 = r4.A01
            X.6tj r0 = new X.6tj
            r0.<init>(r4, r14)
            r25 = -1
            r24 = r3
            r26 = 0
            r22 = r3
            r23 = r3
            r18 = r0
            r19 = r13
            r20 = r8
            r21 = r6
            r17 = r1
            r17.A02(r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x007f:
            if (r7 == 0) goto L_0x01de
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x01de
            if (r10 == 0) goto L_0x0162
            X.6PG r8 = r10.A00
        L_0x008b:
            long r0 = java.lang.System.currentTimeMillis()
            X.5tN r6 = new X.5tN
            r6.<init>(r8, r7, r0)
            if (r29 == 0) goto L_0x00fb
            X.0yC r8 = r4.A04
            r1 = 7352(0x1cb8, float:1.0302E-41)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r8, r1)
            if (r0 == 0) goto L_0x00fb
            X.1KW r1 = r4.A08
            org.json.JSONObject r0 = A03(r6)
            java.lang.String r10 = r0.toString()
            X.AnonymousClass00C.A08(r10)
            X.0u1 r0 = r1.A00
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r8 = r0.edit()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "extensions_metadata_v2_"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            android.content.SharedPreferences$Editor r0 = r8.putString(r0, r10)
            r0.apply()
        L_0x00d3:
            if (r30 == 0) goto L_0x01ca
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r7.iterator()
        L_0x00de:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0180
            java.lang.Object r7 = r8.next()
            r0 = r7
            X.6Di r0 = (X.C128716Di) r0
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "DRAFT"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00de
            r9.add(r7)
            goto L_0x00de
        L_0x00fb:
            X.1KW r1 = r4.A08
            java.lang.String r11 = r13.getRawString()
            org.json.JSONObject r0 = A03(r6)
            java.lang.String r10 = r0.toString()
            X.AnonymousClass00C.A08(r10)
            X.AnonymousClass00C.A0D(r11, r2)
            X.0u1 r8 = r1.A00
            java.lang.Object r0 = r8.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r9 = r0.edit()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "extensions_metadata_"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            android.content.SharedPreferences$Editor r0 = r9.putString(r0, r10)
            r0.apply()
            java.lang.String r11 = r13.getRawString()
            long r0 = java.lang.System.currentTimeMillis()
            X.AnonymousClass00C.A0D(r11, r2)
            java.lang.Object r8 = r8.get()
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            android.content.SharedPreferences$Editor r10 = r8.edit()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r8 = "extensions_metadata_timestamp_"
            r9.append(r8)
            r9.append(r11)
            java.lang.String r8 = r9.toString()
            android.content.SharedPreferences$Editor r0 = r10.putLong(r8, r0)
            r0.apply()
            goto L_0x00d3
        L_0x0162:
            r8 = r3
            goto L_0x008b
        L_0x0165:
            X.0yC r8 = r4.A04
            r6 = 7352(0x1cb8, float:1.0302E-41)
            X.0yV r1 = X.C21000yV.A02
            boolean r1 = X.C20800yB.A01(r1, r8, r6)
            if (r1 == 0) goto L_0x007f
            r11.A04(r14, r0, r2)
            goto L_0x007f
        L_0x0176:
            r14 = -1
            goto L_0x0046
        L_0x0179:
            r7 = r3
            r6 = r3
            goto L_0x0038
        L_0x017d:
            r0 = r3
            goto L_0x001a
        L_0x0180:
            java.util.Iterator r10 = r9.iterator()
        L_0x0184:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01c5
            java.lang.Object r9 = r10.next()
            X.6Di r9 = (X.C128716Di) r9
            java.lang.String r8 = r9.A05
            if (r8 == 0) goto L_0x0184
            X.1Kp r0 = r4.A0A
            java.lang.String r7 = r9.A03
            int r18 = r7.hashCode()
            X.5TS r12 = X.AnonymousClass5TS.PREFETCH_CONVERSATION
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r2)
            r16 = r27
            r17 = r28
            r11 = r0
            r15 = r7
            r11.A0C(r12, r13, r14, r15, r16, r17, r18)
            X.1Kj r1 = r4.A09
            java.lang.String r0 = r9.A06
            X.6DG r14 = new X.6DG
            r19 = 0
            r20 = 1
            r15 = r3
            r16 = r7
            r17 = r8
            r18 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.util.LinkedList r0 = r1.A05
            r0.add(r14)
            goto L_0x0184
        L_0x01c5:
            X.1Kj r0 = r4.A09
            r0.A0F()
        L_0x01ca:
            r1 = 2
            if (r5 == 0) goto L_0x01d4
            java.lang.Short r0 = java.lang.Short.valueOf(r1)
            r5.BPu(r6, r0, r3, r2)
        L_0x01d4:
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            X.6CM r0 = new X.6CM
            r0.<init>(r6, r1, r3, r2)
            return r0
        L_0x01de:
            java.lang.String r8 = "extensions-metadata-empty-response"
            r11.A0E(r12, r8, r3)
            if (r5 == 0) goto L_0x01f7
            X.09w r0 = X.C023409w.A00
            long r6 = java.lang.System.currentTimeMillis()
            X.5tN r1 = new X.5tN
            r1.<init>(r3, r0, r6)
            java.lang.Short r0 = java.lang.Short.valueOf(r16)
            r5.BPu(r1, r0, r8, r2)
        L_0x01f7:
            java.lang.String r0 = "FlowsLogger/FlowsMetadataManager/makeFlowsMetaDataRequest()/callbackResponse() - Flows metadata response received is empty (potentially expected)."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.Short r0 = java.lang.Short.valueOf(r16)
            X.6CM r4 = new X.6CM
            r4.<init>(r3, r0, r8, r2)
            return r4
        L_0x0206:
            X.66O r0 = r8.A04
            java.lang.Object r6 = r0.A00(r3)
            r0 = 2498098(0x261e32, float:3.500581E-39)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.AnonymousClass00C.A0J(r6, r0)
            java.lang.String r6 = "extensions-metadata-response-error"
            if (r0 == 0) goto L_0x0231
            r11.A07(r12)
            if (r22 == 0) goto L_0x0227
            java.lang.Short r0 = java.lang.Short.valueOf(r16)
            r5.BPu(r3, r0, r6, r1)
        L_0x0227:
            java.lang.Short r0 = java.lang.Short.valueOf(r16)
            X.6CM r4 = new X.6CM
            r4.<init>(r3, r0, r6, r1)
            return r4
        L_0x0231:
            r11.A0E(r12, r6, r3)
            if (r22 == 0) goto L_0x023d
            java.lang.Short r0 = java.lang.Short.valueOf(r16)
            r5.BPu(r3, r0, r6, r2)
        L_0x023d:
            X.0wN r4 = r4.A06
            java.lang.String r0 = ""
            r4.A0E(r6, r0, r1)
            java.lang.String r0 = "FlowsLogger/FlowsMetadataManager/makeFlowsMetaDataRequest()/callbackResponse() - Response is not success"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.Short r0 = java.lang.Short.valueOf(r16)
            X.6CM r4 = new X.6CM
            r4.<init>(r3, r0, r6, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26461Kg.A00(X.7gc, X.1Kg, X.5x8, com.whatsapp.jid.UserJid, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean):X.6CM");
    }

    public static final AnonymousClass6CM A01(C158247gc r6, C26461Kg r7, Integer num, String str, Throwable th) {
        Integer num2;
        C26451Kf r3 = r7.A03;
        r3.A08(num, "metadata_network_end");
        AnonymousClass1KT r1 = r7.A02;
        if (str != null) {
            num2 = Integer.valueOf(str.hashCode());
        } else {
            num2 = null;
        }
        r1.A08(num2, "metadata_network_end");
        r3.A0E(num, "extensions-metadata-graphql-response-error", th.getMessage());
        if (r6 != null) {
            r6.BPu((C121585tN) null, 3, "extensions-metadata-graphql-response-error", false);
        }
        r7.A06.A0E("extensions-metadata-graphql-response-error", "", true);
        Log.w("FlowsLogger/FlowsMetadataManager/handleMetadataErrorResponse()", th);
        return new AnonymousClass6CM((C121585tN) null, 3, "extensions-metadata-graphql-response-error", false);
    }

    public static final C121585tN A02(JSONObject jSONObject) {
        AnonymousClass6PG r3;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("extensionIdLinks");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(C110815bH.A00(optJSONObject));
                }
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("compatibility");
        if (optJSONObject2 != null) {
            r3 = AnonymousClass6PG.A03.A02(optJSONObject2);
        } else {
            r3 = null;
        }
        return new C121585tN(r3, arrayList, jSONObject.optLong("timeStampInMillis"));
    }

    public static final JSONObject A03(C121585tN r7) {
        JSONObject jSONObject;
        String str;
        JSONArray jSONArray = new JSONArray();
        for (C128716Di r5 : r7.A02) {
            AnonymousClass00C.A0D(r5, 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("flow_id", r5.A03);
            jSONObject2.put("data_api_version", r5.A02);
            jSONObject2.put("state", r5.A00);
            jSONObject2.put("flow_version_ids", r5.A04);
            jSONObject2.put("psl_cdn_url", r5.A05);
            jSONObject2.put("psl_signature", r5.A06);
            String[] strArr = r5.A07;
            if (strArr != null) {
                str = AnonymousClass02R.A09(", ", "", "", strArr);
            } else {
                str = null;
            }
            jSONObject2.put("categories", str);
            jSONObject2.put("well_version", r5.A01);
            jSONArray.put(jSONObject2);
        }
        AnonymousClass6PG r3 = r7.A01;
        if (r3 != null) {
            jSONObject = new JSONObject();
            jSONObject.put("welj", AnonymousClass6SY.A01(r3.A02));
            jSONObject.put("data_channel", AnonymousClass6SY.A01(r3.A00));
            jSONObject.put("flow_message", AnonymousClass6SY.A01(r3.A01));
        } else {
            jSONObject = null;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("extensionIdLinks", jSONArray);
        jSONObject3.put("compatibility", jSONObject);
        jSONObject3.put("timeStampInMillis", r7.A00);
        return jSONObject3;
    }

    public final Object A06(UserJid userJid, String str, String str2, String str3, C023509x r7) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C12600iM.A01;
        C12600iM r0 = new C12600iM(AnonymousClass0AA.A01(r7));
        A09(userJid, str, str2, str3, new AnonymousClass4NQ(r0));
        return r0.A00();
    }

    public final void A08(C123815x8 r6, Integer num) {
        int i;
        String obj = r6.A05.toString();
        AnonymousClass00C.A08(obj);
        byte[] bytes = obj.getBytes(AnonymousClass0S4.A05);
        AnonymousClass00C.A08(bytes);
        int length = bytes.length;
        C26451Kf r4 = this.A03;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        r4.A02(i, "metadata_response_size", (long) length);
    }

    public final boolean A0B(Integer num) {
        C20810yC r2 = this.A04;
        C21000yV r1 = C21000yV.A02;
        if (!C20800yB.A01(r1, r2, 5333) || !C20800yB.A01(r1, r2, 1319)) {
            return false;
        }
        this.A03.A0E(num, "extensions-metadata-response-error", (String) null);
        Log.w("FlowsLogger/FlowsMetadataManager/makeFlowsMetaDataRequest() - request sanctioned.");
        return true;
    }

    public final boolean A0A(UserJid userJid, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass1KW r1 = this.A08;
        String rawString = userJid.getRawString();
        AnonymousClass00C.A0D(rawString, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("extensions_metadata_timestamp_");
        sb.append(rawString);
        if (currentTimeMillis > ((SharedPreferences) r1.A00.get()).getLong(sb.toString(), 0) + j) {
            return true;
        }
        return false;
    }
}
