package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.517  reason: invalid class name */
public class AnonymousClass517 extends C1044059o {
    public String A00;
    public String A01;
    public final int A02;
    public final C119215pS A03;
    public final C1260462i A04;
    public final AnonymousClass6QG A05;
    public final C134986bw A06;
    public final C20810yC A07;
    public final String A08;
    public final String A09;
    public final AnonymousClass1QW A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass517(X.C19700wN r14, X.AnonymousClass7fQ r15, X.C142616pA r16, X.C119215pS r17, X.C1260462i r18, X.AnonymousClass6QG r19, X.C134986bw r20, X.C19630wG r21, X.AnonymousClass17Z r22, X.C18820ts r23, X.C20810yC r24, X.C159487jR r25, X.C1265464l r26, X.AnonymousClass1QW r27, X.C142606p9 r28, X.C19770wU r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            r13 = this;
            r11 = 0
            r2 = r13
            r10 = r26
            r9 = r25
            r8 = r23
            r7 = r22
            r12 = r29
            r6 = r16
            r5 = r28
            r4 = r15
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r24
            r13.A07 = r0
            r0 = r18
            r13.A04 = r0
            r0 = r20
            r13.A06 = r0
            r0 = r30
            r13.A08 = r0
            r0 = r19
            r13.A05 = r0
            r0 = r31
            r13.A09 = r0
            r1 = r27
            r13.A0A = r1
            r0 = r32
            r13.A00 = r0
            r0 = r33
            r13.A01 = r0
            r0 = r17
            r13.A03 = r0
            r0 = r21
            android.content.Context r0 = r0.A00
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0X(r0)
            int r0 = r0.densityDpi
            r13.A02 = r0
            X.0yC r1 = r1.A03
            boolean r0 = X.C90494aF.A1X(r1)
            if (r0 == 0) goto L_0x005e
            r0 = 4844(0x12ec, float:6.788E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "6.0"
        L_0x005b:
            r13.A00 = r0
            return
        L_0x005e:
            java.lang.String r0 = "5.0"
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass517.<init>(X.0wN, X.7fQ, X.6pA, X.5pS, X.62i, X.6QG, X.6bw, X.0wG, X.17Z, X.0ts, X.0yC, X.7jR, X.64l, X.1QW, X.6p9, X.0wU, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static int A00(String str, AbstractCollection abstractCollection, JSONArray jSONArray, int i) {
        C144416s9 A012 = C144416s9.A01(jSONArray.getJSONObject(i));
        A012.A03 = str;
        abstractCollection.add(A012);
        return i + 1;
    }

    public /* bridge */ /* synthetic */ Object A07(JSONObject jSONObject) {
        C135016bz r0;
        C131426Oz r1;
        boolean z;
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        JSONObject jSONObject2 = jSONObject;
        JSONArray jSONArray = jSONObject2.getJSONArray("business_profiles");
        String optString = jSONObject2.optString("request_id");
        for (int i = 0; i < jSONArray.length(); i = A00(optString, A0I, jSONArray, i)) {
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("api_business_profiles");
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2 = A00(optString, A0I2, optJSONArray, i2)) {
            }
        }
        ArrayList A0I3 = AnonymousClass001.A0I();
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("subcategories");
        if (optJSONArray2 != null) {
            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                AnonymousClass544.A01(A0I3, optJSONArray2, i3);
            }
        }
        ArrayList A0I4 = AnonymousClass001.A0I();
        JSONArray optJSONArray3 = jSONObject2.optJSONArray("filter_categories");
        if (optJSONArray3 != null) {
            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                AnonymousClass544.A01(A0I4, optJSONArray3, i4);
            }
        }
        Double A0b = C90504aG.A0b("proximity_weight", jSONObject2);
        String optString2 = jSONObject2.optString("ranking_logic_ver");
        String optString3 = jSONObject2.optString("page_id");
        String string = jSONObject2.getString("csvm_config");
        JSONObject optJSONObject = jSONObject2.optJSONObject("map_view");
        if (optJSONObject == null) {
            r1 = new C131426Oz((C135016bz) null, AnonymousClass001.A0I());
        } else {
            HashMap A0J = AnonymousClass001.A0J();
            JSONArray optJSONArray4 = optJSONObject.optJSONArray("categories");
            if (optJSONArray4 != null) {
                for (int i5 = 0; i5 < optJSONArray4.length(); i5++) {
                    AnonymousClass544 A002 = AnonymousClass544.A00(optJSONArray4.getJSONObject(i5));
                    A0J.put(A002.A00, A002);
                }
            }
            JSONArray optJSONArray5 = optJSONObject.optJSONArray("business_profiles");
            ArrayList A0I5 = AnonymousClass001.A0I();
            if (optJSONArray5 != null) {
                for (int i6 = 0; i6 < optJSONArray5.length(); i6++) {
                    JSONObject jSONObject3 = optJSONArray5.getJSONObject(i6);
                    AnonymousClass00C.A0D(jSONObject3, 0);
                    String A0e = C90474aD.A0e(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject3);
                    double d = jSONObject3.getDouble("latitude");
                    double d2 = jSONObject3.getDouble("longitude");
                    if (jSONObject3.has("responsive")) {
                        z = true;
                        if (jSONObject3.getBoolean("responsive")) {
                            double d3 = jSONObject3.getDouble("biz_pre_rank_score");
                            Object A0o = C90514aH.A0o(jSONObject3.getString("category_id"), A0J);
                            AnonymousClass00C.A08(A0o);
                            AnonymousClass544 r2 = (AnonymousClass544) A0o;
                            AnonymousClass00C.A0D(r2, 6);
                            A0I5.add(new C144406s8((C144416s9) null, r2, (Double) null, (Double) null, A0e, d, d2, d3, Double.NaN, -1, -1, z));
                        }
                    }
                    z = false;
                    double d32 = jSONObject3.getDouble("biz_pre_rank_score");
                    Object A0o2 = C90514aH.A0o(jSONObject3.getString("category_id"), A0J);
                    AnonymousClass00C.A08(A0o2);
                    AnonymousClass544 r22 = (AnonymousClass544) A0o2;
                    AnonymousClass00C.A0D(r22, 6);
                    A0I5.add(new C144406s8((C144416s9) null, r22, (Double) null, (Double) null, A0e, d, d2, d32, Double.NaN, -1, -1, z));
                }
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("config");
            if (optJSONObject2 != null) {
                double d4 = optJSONObject2.getDouble("max_allowed_business_distance_in_meters");
                int i7 = optJSONObject2.getInt("max_num_of_businesses_to_select");
                ArrayList A0I6 = AnonymousClass001.A0I();
                JSONArray jSONArray2 = optJSONObject2.getJSONArray("zoom_level_for_layers");
                int length = jSONArray2.length();
                for (int i8 = 0; i8 < length; i8++) {
                    A0I6.add(Float.valueOf((float) jSONArray2.getDouble(i8)));
                }
                float f = (float) optJSONObject2.getDouble("default_zoom_level");
                JSONArray jSONArray3 = optJSONObject2.getJSONArray("segments");
                ArrayList A13 = C36411kG.A13(jSONArray3);
                int length2 = jSONArray3.length();
                for (int i9 = 0; i9 < length2; i9++) {
                    JSONObject jSONObject4 = jSONArray3.getJSONObject(i9);
                    float optDouble = (float) jSONObject4.optDouble("start_distance_in_meters");
                    float optDouble2 = (float) jSONObject4.optDouble("end_distance_in_meters");
                    int optInt = jSONObject4.optInt("show_compact_pin_for_layer_upto");
                    ArrayList A0I7 = AnonymousClass001.A0I();
                    JSONArray optJSONArray6 = jSONObject4.optJSONArray("layers");
                    if (optJSONArray6 != null) {
                        int length3 = optJSONArray6.length();
                        for (int i10 = 0; i10 < length3; i10++) {
                            JSONObject jSONObject5 = optJSONArray6.getJSONObject(i10);
                            A0I7.add(new C134616bK(jSONObject5.optInt("zoom_level_index"), jSONObject5.optInt("regular_pin_count")));
                        }
                    }
                    A13.add(new C134796bc(A0I7, optDouble, optDouble2, optInt, jSONObject4.getInt("grid_size")));
                }
                r0 = new C135016bz(A0I6, A13, d4, f, i7);
            } else {
                r0 = null;
            }
            r1 = new C131426Oz(r0, A0I5);
        }
        return new C128836Du(r1, A0b, optString3, optString, optString2, string, A0I3, A0I2, A0I, A0I4);
    }
}
