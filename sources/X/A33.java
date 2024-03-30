package X;

import com.facebook.xanalytics.XAnalyticsAdapter;
import org.json.JSONObject;

public final class A33 implements XAnalyticsAdapter {
    public C188308zN A00;
    public String A01;
    public final AnonymousClass9IW A02;

    public void cleanup() {
    }

    public void flush() {
    }

    public String getStructureSamplingConfig(String str) {
        return "";
    }

    public void logCounter(String str, double d) {
    }

    public void logCounter(String str, double d, String str2) {
    }

    public boolean shouldLog(String str) {
        AnonymousClass00C.A0D(str, 0);
        if (str.equals("arfx_render_time") || str.equals("arfx_waterfall")) {
            return true;
        }
        return false;
    }

    public static final void A00(JSONObject jSONObject) {
        Object opt = jSONObject.opt("effect_instance_id");
        if (opt != null && !opt.equals(JSONObject.NULL) && AnonymousClass00C.A0J(opt.toString(), "0")) {
            jSONObject.put("effect_instance_id", "");
        }
    }

    public A33(AnonymousClass9IW r1) {
        this.A02 = r1;
    }

    public void logEvent(String str, String str2, String str3, boolean z, double d) {
        C36321k7.A0w(str, str2);
        logEventBypassSampling(str, str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.58C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.8cS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.58C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.58C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.58C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.58C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.58C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.58C} */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0162, code lost:
        if (r1 == null) goto L_0x0164;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void logEventBypassSampling(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            X.C36321k7.A0w(r14, r15)
            java.lang.String r0 = "arfx_render_time"
            boolean r0 = r14.equals(r0)
            java.lang.String r5 = "delivery_operation_id"
            if (r0 == 0) goto L_0x021e
            org.json.JSONObject r7 = X.C36441kJ.A1C(r15)
            java.lang.String r0 = r13.A01
            if (r0 == 0) goto L_0x0018
            r7.put(r5, r0)
        L_0x0018:
            A00(r7)
            X.9IW r3 = r13.A02
            X.0yC r1 = r3.A00
            r0 = 3359(0xd1f, float:4.707E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0169
            X.8cS r2 = new X.8cS
            r2.<init>()
            java.lang.String r0 = "camera_product_name"
            r1 = 0
            java.lang.String r0 = X.C63893Lv.A00(r0, r7, r1)
            r2.A0Q = r0
            java.lang.String r0 = "effect_session_id"
            java.lang.String r0 = X.C63893Lv.A00(r0, r7, r1)
            r2.A0T = r0
            java.lang.String r0 = X.C63893Lv.A00(r5, r7, r1)
            r2.A0R = r0
            java.lang.String r0 = "product_session_id"
            java.lang.String r0 = X.C63893Lv.A00(r0, r7, r1)
            r2.A0W = r0
            java.lang.String r0 = "effect_instance_id"
            java.lang.String r0 = X.C63893Lv.A00(r0, r7, r1)
            r2.A0S = r0
            java.lang.String r1 = "initialization_duration_ms"
            boolean r0 = r7.has(r1)
            if (r0 == 0) goto L_0x0061
            java.lang.Long r0 = X.C165577te.A0b(r1, r7)
            r2.A0J = r0
        L_0x0061:
            java.lang.String r1 = "services_load_time_ms"
            boolean r0 = r7.has(r1)
            if (r0 == 0) goto L_0x006f
            java.lang.Long r0 = X.C165577te.A0b(r1, r7)
            r2.A0M = r0
        L_0x006f:
            java.lang.String r1 = "effect_load_time_ms"
            boolean r0 = r7.has(r1)
            if (r0 == 0) goto L_0x007d
            java.lang.Long r0 = X.C165577te.A0b(r1, r7)
            r2.A02 = r0
        L_0x007d:
            java.lang.String r1 = "session_duration_ms"
            boolean r0 = r7.has(r1)
            if (r0 == 0) goto L_0x008b
            java.lang.Long r0 = X.C165577te.A0b(r1, r7)
            r2.A0N = r0
        L_0x008b:
            java.lang.String r1 = "first_frame_render_time_ms"
            boolean r0 = r7.has(r1)
            if (r0 == 0) goto L_0x0099
            java.lang.Long r0 = X.C165577te.A0b(r1, r7)
            r2.A03 = r0
        L_0x0099:
            java.lang.String r5 = "frame_count"
            boolean r0 = r7.has(r5)
            if (r0 == 0) goto L_0x00a7
            java.lang.Long r0 = X.C165577te.A0b(r5, r7)
            r2.A0H = r0
        L_0x00a7:
            java.lang.String r8 = "average_render_time_ms"
            boolean r0 = r7.has(r8)
            if (r0 == 0) goto L_0x00b5
            java.lang.Long r0 = X.C165577te.A0b(r8, r7)
            r2.A01 = r0
        L_0x00b5:
            java.lang.String r4 = "variance_ms"
            boolean r0 = r7.has(r4)
            if (r0 == 0) goto L_0x00c3
            java.lang.Long r0 = X.C165577te.A0b(r4, r7)
            r2.A0O = r0
        L_0x00c3:
            java.lang.String r9 = "average_frame_time_ms"
            boolean r0 = r7.has(r9)
            if (r0 == 0) goto L_0x00d1
            java.lang.Long r0 = X.C165577te.A0b(r9, r7)
            r2.A00 = r0
        L_0x00d1:
            java.lang.String r6 = "frame_time_variance_ms"
            boolean r0 = r7.has(r6)
            if (r0 == 0) goto L_0x00df
            java.lang.Long r0 = X.C165577te.A0b(r6, r7)
            r2.A0I = r0
        L_0x00df:
            java.lang.String r0 = "input_size"
            org.json.JSONArray r0 = r7.optJSONArray(r0)
            java.lang.String r12 = "size"
            r11 = 0
            java.lang.String r10 = "frames"
            if (r0 == 0) goto L_0x0104
            org.json.JSONObject r1 = r0.optJSONObject(r11)
            if (r1 == 0) goto L_0x0104
            java.lang.String r0 = X.C63893Lv.A00(r12, r1, r11)
            r2.A0U = r0
            boolean r0 = r1.has(r10)
            if (r0 == 0) goto L_0x0104
            java.lang.Long r0 = X.C165577te.A0b(r10, r1)
            r2.A0K = r0
        L_0x0104:
            java.lang.String r0 = "virtual_input_size"
            org.json.JSONArray r0 = r7.optJSONArray(r0)
            if (r0 == 0) goto L_0x0124
            org.json.JSONObject r1 = r0.optJSONObject(r11)
            if (r1 == 0) goto L_0x0124
            java.lang.String r0 = X.C63893Lv.A00(r12, r1, r11)
            r2.A0X = r0
            boolean r0 = r1.has(r10)
            if (r0 == 0) goto L_0x0124
            java.lang.Long r0 = X.C165577te.A0b(r10, r1)
            r2.A0P = r0
        L_0x0124:
            java.lang.String r0 = "output_size"
            org.json.JSONArray r0 = r7.optJSONArray(r0)
            if (r0 == 0) goto L_0x0144
            org.json.JSONObject r1 = r0.optJSONObject(r11)
            if (r1 == 0) goto L_0x0144
            java.lang.String r0 = X.C63893Lv.A00(r12, r1, r11)
            r2.A0V = r0
            boolean r0 = r1.has(r10)
            if (r0 == 0) goto L_0x0144
            java.lang.Long r0 = X.C165577te.A0b(r10, r1)
            r2.A0L = r0
        L_0x0144:
            java.lang.String r0 = "foreground_time_detail"
            org.json.JSONObject r7 = r7.optJSONObject(r0)
            if (r7 == 0) goto L_0x0164
            java.lang.String r0 = "front"
            org.json.JSONObject r1 = r7.optJSONObject(r0)
            if (r1 != 0) goto L_0x016a
            java.lang.String r0 = "back"
            org.json.JSONObject r1 = r7.optJSONObject(r0)
            if (r1 != 0) goto L_0x016a
            java.lang.String r0 = "unspecified"
            org.json.JSONObject r1 = r7.optJSONObject(r0)
            if (r1 != 0) goto L_0x016a
        L_0x0164:
            X.0yW r0 = r3.A01
            r0.Bly(r2)
        L_0x0169:
            return
        L_0x016a:
            boolean r0 = r1.has(r9)
            if (r0 == 0) goto L_0x0176
            java.lang.Long r0 = X.C165577te.A0b(r9, r1)
            r2.A04 = r0
        L_0x0176:
            boolean r0 = r1.has(r8)
            if (r0 == 0) goto L_0x0182
            java.lang.Long r0 = X.C165577te.A0b(r8, r1)
            r2.A05 = r0
        L_0x0182:
            boolean r0 = r1.has(r5)
            if (r0 == 0) goto L_0x018e
            java.lang.Long r0 = X.C165577te.A0b(r5, r1)
            r2.A0E = r0
        L_0x018e:
            boolean r0 = r1.has(r6)
            if (r0 == 0) goto L_0x019a
            java.lang.Long r0 = X.C165577te.A0b(r6, r1)
            r2.A0F = r0
        L_0x019a:
            boolean r0 = r1.has(r4)
            if (r0 == 0) goto L_0x01a6
            java.lang.Long r0 = X.C165577te.A0b(r4, r1)
            r2.A0G = r0
        L_0x01a6:
            java.lang.String r0 = "fps"
            org.json.JSONObject r4 = r1.optJSONObject(r0)
            if (r4 == 0) goto L_0x0164
            java.lang.String r1 = "average"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x01bc
            java.lang.Long r0 = X.C165577te.A0b(r1, r4)
            r2.A06 = r0
        L_0x01bc:
            boolean r0 = r4.has(r5)
            if (r0 == 0) goto L_0x01c8
            java.lang.Long r0 = X.C165577te.A0b(r5, r4)
            r2.A07 = r0
        L_0x01c8:
            java.lang.String r1 = "outlier_fps"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x01d6
            java.lang.Long r0 = X.C165577te.A0b(r1, r4)
            r2.A08 = r0
        L_0x01d6:
            java.lang.String r1 = "p0"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x01e4
            java.lang.Long r0 = X.C165577te.A0b(r1, r4)
            r2.A09 = r0
        L_0x01e4:
            java.lang.String r1 = "p1"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x01f2
            java.lang.Long r0 = X.C165577te.A0b(r1, r4)
            r2.A0A = r0
        L_0x01f2:
            java.lang.String r1 = "p10"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x0200
            java.lang.Long r0 = X.C165577te.A0b(r1, r4)
            r2.A0B = r0
        L_0x0200:
            java.lang.String r1 = "p50"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x020e
            java.lang.Long r0 = X.C165577te.A0b(r1, r4)
            r2.A0D = r0
        L_0x020e:
            java.lang.String r1 = "p100"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x0164
            java.lang.Long r0 = X.C165577te.A0b(r1, r4)
            r2.A0C = r0
            goto L_0x0164
        L_0x021e:
            java.lang.String r0 = "arfx_waterfall"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0169
            org.json.JSONObject r4 = X.C36441kJ.A1C(r15)
            java.lang.String r0 = r13.A01
            if (r0 == 0) goto L_0x0231
            r4.put(r5, r0)
        L_0x0231:
            X.8zN r0 = r13.A00
            if (r0 == 0) goto L_0x0246
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0296
            r0 = 2
            if (r1 == r0) goto L_0x0293
            java.lang.String r1 = "unknown"
        L_0x0241:
            java.lang.String r0 = "session_start_intent"
            r4.put(r0, r1)
        L_0x0246:
            A00(r4)
            X.9IW r3 = r13.A02
            X.0yC r1 = r3.A00
            r0 = 3359(0xd1f, float:4.707E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0169
            X.58C r2 = new X.58C
            r2.<init>()
            java.lang.String r0 = "camera_product_name"
            r1 = 0
            java.lang.String r0 = X.C63893Lv.A00(r0, r4, r1)
            r2.A00 = r0
            java.lang.String r0 = "effect_session_id"
            java.lang.String r0 = X.C63893Lv.A00(r0, r4, r1)
            r2.A03 = r0
            java.lang.String r0 = X.C63893Lv.A00(r5, r4, r1)
            r2.A01 = r0
            java.lang.String r0 = "product_session_id"
            java.lang.String r0 = X.C63893Lv.A00(r0, r4, r1)
            r2.A04 = r0
            java.lang.String r0 = "effect_instance_id"
            java.lang.String r0 = X.C63893Lv.A00(r0, r4, r1)
            r2.A02 = r0
            java.lang.String r0 = "waterfall_event"
            java.lang.String r0 = X.C63893Lv.A00(r0, r4, r1)
            r2.A06 = r0
            java.lang.String r0 = "session_start_intent"
            java.lang.String r0 = X.C63893Lv.A00(r0, r4, r1)
            r2.A05 = r0
            goto L_0x0164
        L_0x0293:
            java.lang.String r1 = "system"
            goto L_0x0241
        L_0x0296:
            java.lang.String r1 = "user"
            goto L_0x0241
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A33.logEventBypassSampling(java.lang.String, java.lang.String):void");
    }
}
