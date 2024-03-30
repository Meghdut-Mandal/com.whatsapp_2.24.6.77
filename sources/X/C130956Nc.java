package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.6Nc  reason: invalid class name and case insensitive filesystem */
public final class C130956Nc {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: X.5Ck} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: X.5CZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: X.5Cc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: X.5CY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: X.5Cn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: X.5Cj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: X.5Cg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: X.5Ch} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: X.5Ci} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: X.5Ce} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: X.5Cf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: X.5Cl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: X.5Cd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: X.5CX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: X.5Cm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: X.5Co} */
    /* JADX WARNING: type inference failed for: r8v1, types: [X.6Px] */
    /* JADX WARNING: type inference failed for: r23v3, types: [X.5Cu] */
    /* JADX WARNING: type inference failed for: r23v4, types: [X.5Ct] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0397, code lost:
        r2.A0M(r8);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03b0, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass6VQ A02(android.content.Context r35, X.C18820ts r36, X.AnonymousClass1H2 r37, X.AnonymousClass1HA r38, java.lang.String r39) {
        /*
            r34 = this;
            java.lang.String r22 = "blurred-bitmap-provider"
            r4 = r35
            r7 = r36
            r13 = r37
            r33 = r38
            r0 = r33
            X.C36321k7.A18(r4, r13, r7, r0)
            if (r39 == 0) goto L_0x0428
            int r0 = r39.length()
            if (r0 == 0) goto L_0x0428
            org.json.JSONObject r5 = X.C36441kJ.A1C(r39)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            android.graphics.RectF r21 = X.C36441kJ.A0N()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r0 = r21
            float r1 = X.C90504aG.A04(r0, r5)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            android.graphics.RectF r3 = X.C36441kJ.A0N()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "crop-l"
            int r0 = r5.getInt(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r0 = r0 / r1
            r3.left = r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "crop-t"
            int r0 = r5.getInt(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r0 = r0 / r1
            r3.top = r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "crop-r"
            int r0 = r5.getInt(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r0 = r0 / r1
            r3.right = r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "crop-b"
            int r0 = r5.getInt(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r0 = r0 / r1
            r3.bottom = r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "rotate"
            int r20 = r5.getInt(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "shapes"
            org.json.JSONArray r19 = r5.getJSONArray(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.util.ArrayList r18 = X.AnonymousClass001.A0I()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            int r17 = r19.length()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r6 = 0
        L_0x0066:
            r0 = r17
            if (r6 >= r0) goto L_0x03b1
            r0 = r19
            org.json.JSONObject r8 = r0.getJSONObject(r6)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            X.AnonymousClass00C.A0B(r8)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r14 = 0
            X.AnonymousClass00C.A0D(r8, r14)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "type"
            java.lang.String r1 = r8.getString(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r1 == 0) goto L_0x03a6
            int r0 = r1.hashCode()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            switch(r0) {
                case -2069773495: goto L_0x038a;
                case -1890252483: goto L_0x037a;
                case -1853985446: goto L_0x036c;
                case -1676415975: goto L_0x0343;
                case -1493474063: goto L_0x031d;
                case -1489367378: goto L_0x030f;
                case -841189240: goto L_0x0300;
                case -841116134: goto L_0x02f1;
                case 110873: goto L_0x01d9;
                case 3423314: goto L_0x01ca;
                case 3496420: goto L_0x01bb;
                case 3556653: goto L_0x010f;
                case 93090825: goto L_0x0100;
                case 96632902: goto L_0x00f1;
                case 1102578873: goto L_0x00e2;
                case 1901043637: goto L_0x0088;
                default: goto L_0x0086;
            }     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
        L_0x0086:
            goto L_0x03a6
        L_0x0088:
            java.lang.String r0 = "location"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 == 0) goto L_0x03a6
            r0 = 2131886535(0x7f1201c7, float:1.9407652E38)
            java.lang.String r0 = X.C36361kB.A0m(r4, r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            X.5Co r2 = new X.5Co     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.<init>(r4, r7, r0, r14)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.A0M(r8)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "latitude"
            double r0 = r8.getDouble(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.A00 = r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "longitude"
            double r0 = r8.getDouble(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.A01 = r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "Location"
            java.lang.String r0 = X.C90474aD.A0e(r0, r8)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.A06 = r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "displayLocation"
            java.lang.String r0 = X.C90474aD.A0e(r0, r8)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.A05 = r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "theme"
            boolean r0 = r8.getBoolean(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.A07 = r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            X.AnonymousClass5Co.A00(r2)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            android.graphics.RectF r10 = r2.A02     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r9 = r10.width()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r8 = r10.height()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r1 = r10.left     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r0 = r10.top     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r9 = r9 + r1
            float r8 = r8 + r0
            r10.set(r1, r0, r9, r8)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r10.sort()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            goto L_0x039a
        L_0x00e2:
            java.lang.String r0 = "newsletter"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 == 0) goto L_0x03a6
            X.5Cm r2 = new X.5Cm     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.<init>(r8)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            goto L_0x039a
        L_0x00f1:
            java.lang.String r0 = "emoji"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 == 0) goto L_0x03a6
            X.5CX r2 = new X.5CX     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.<init>(r4, r13, r8)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            goto L_0x039a
        L_0x0100:
            java.lang.String r0 = "arrow"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 == 0) goto L_0x03a6
            X.5Cd r2 = new X.5Cd     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.<init>()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            goto L_0x0397
        L_0x010f:
            java.lang.String r9 = "text"
            boolean r0 = r1.equals(r9)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 == 0) goto L_0x03a6
            X.5Cl r2 = new X.5Cl     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.<init>(r4, r7, r13)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "orig-w"
            int r0 = r8.getInt(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r10 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r10
            r2.A02 = r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "orig-h"
            int r0 = r8.getInt(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r0 = r0 / r10
            r2.A01 = r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "orig-l"
            int r0 = r8.getInt(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r0 = r0 / r10
            r2.A03 = r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "orig-r"
            int r0 = r8.getInt(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r0 = r0 / r10
            r2.A04 = r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r1 = 0
            r2.A00 = r1     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r24 = X.C90474aD.A0e(r9, r8)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "text-size"
            int r0 = r8.getInt(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r9 = (float) r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r9 = r9 / r10
            java.lang.String r0 = "style"
            int r26 = r8.getInt(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "alignment"
            int r27 = r8.getInt(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "background_style"
            int r28 = r8.getInt(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "min-layout-width"
            int r29 = r8.getInt(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r23 = r2
            r25 = r9
            r23.A0P(r24, r25, r26, r27, r28, r29)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r10 = r2.A0A     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            android.text.TextPaint r9 = r2.A0C     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r0 = r2.A05     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r9.setTextSize(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r0 = r2.A02     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            int r0 = (int) r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            int r0 = r0 + 1
            android.text.StaticLayout r0 = X.AnonymousClass5Cl.A01(r4, r13, r2, r10, r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.A09 = r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.A00 = r1     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r11 = "layout"
            int r10 = r0.getLineCount()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r9 = 0
        L_0x0191:
            if (r9 >= r10) goto L_0x01ac
            android.text.StaticLayout r0 = r2.A09     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 != 0) goto L_0x019d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r11)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            goto L_0x03b0
        L_0x019d:
            float r1 = r0.getLineWidth(r9)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r0 = r2.A00     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a9
            r2.A00 = r1     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
        L_0x01a9:
            int r9 = r9 + 1
            goto L_0x0191
        L_0x01ac:
            android.text.StaticLayout r0 = r2.A09     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 != 0) goto L_0x01b6
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r11)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            goto L_0x03b0
        L_0x01b6:
            r0.getHeight()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            goto L_0x0397
        L_0x01bb:
            java.lang.String r0 = "rect"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 == 0) goto L_0x03a6
            X.5Cf r2 = new X.5Cf     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.<init>()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            goto L_0x0397
        L_0x01ca:
            java.lang.String r0 = "oval"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 == 0) goto L_0x03a6
            X.5Ce r2 = new X.5Ce     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.<init>()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            goto L_0x0397
        L_0x01d9:
            java.lang.String r0 = "pen"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 == 0) goto L_0x03a6
            float r12 = X.C36341k9.A00(r4)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r0 = 1
            X.5Ci r2 = new X.5Ci     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.<init>(r12)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.A0M(r8)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.A05 = r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r10 = "brush_blur"
            boolean r16 = r8.optBoolean(r10, r14)     // Catch:{ JSONException -> 0x03aa }
            java.lang.String r0 = "points"
            org.json.JSONArray r15 = r8.getJSONArray(r0)     // Catch:{ JSONException -> 0x03aa }
            r11 = 0
            if (r16 != 0) goto L_0x0205
            java.lang.String r0 = "times"
            org.json.JSONArray r11 = r8.getJSONArray(r0)     // Catch:{ JSONException -> 0x03aa }
        L_0x0205:
            java.lang.String r9 = "width"
            int r0 = r8.getInt(r9)     // Catch:{ JSONException -> 0x03aa }
            float r1 = (float) r0     // Catch:{ JSONException -> 0x03aa }
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            r0 = 0
            if (r16 == 0) goto L_0x0215
            if (r15 == 0) goto L_0x03aa
            goto L_0x0219
        L_0x0215:
            if (r15 == 0) goto L_0x03aa
            if (r11 == 0) goto L_0x03aa
        L_0x0219:
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x03aa
            boolean r0 = r8.optBoolean(r10, r14)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 == 0) goto L_0x0267
            android.graphics.Bitmap r12 = r2.A01     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            android.graphics.PointF r11 = r2.A02     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            int r10 = r2.A00     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            android.graphics.Paint r1 = r2.A01     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            int r0 = r8.getInt(r9)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r9 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r9
            java.util.ArrayList r9 = X.C131646Px.A02(r8)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.Object r14 = r9.get(r14)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            android.graphics.PointF r14 = (android.graphics.PointF) r14     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r28 = 0
            X.5Ct r8 = new X.5Ct     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r23 = r8
            r24 = r12
            r25 = r1
            r26 = r14
            r27 = r11
            r29 = r0
            r30 = r10
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r11 = 1
        L_0x0253:
            int r0 = r9.size()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r11 >= r0) goto L_0x02ed
            java.lang.Object r10 = r9.get(r11)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            android.graphics.PointF r10 = (android.graphics.PointF) r10     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r0 = 0
            r8.A06(r10, r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            int r11 = r11 + 1
            goto L_0x0253
        L_0x0267:
            android.graphics.Bitmap r0 = r2.A01     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r24 = r0
            android.graphics.PointF r0 = r2.A02     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r27 = r0
            int r0 = r2.A00     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r30 = r0
            android.graphics.Paint r0 = r2.A01     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r16 = r0
            int r0 = r8.getInt(r9)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            float r11 = (float) r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r0 = 1120403456(0x42c80000, float:100.0)
            float r11 = r11 / r0
            java.util.ArrayList r10 = X.C131646Px.A02(r8)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "times"
            org.json.JSONArray r15 = r8.getJSONArray(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r8 = 0
        L_0x028e:
            int r0 = r15.length()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r8 >= r0) goto L_0x029e
            long r0 = r15.getLong(r8)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            X.C36391kE.A1W(r9, r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            int r8 = r8 + 1
            goto L_0x028e
        L_0x029e:
            java.lang.Object r0 = r10.get(r14)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            android.graphics.PointF r0 = (android.graphics.PointF) r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.Object r1 = r9.get(r14)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            long r31 = X.C36431kI.A09(r1)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            X.5Cu r8 = new X.5Cu     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r23 = r8
            r25 = r16
            r26 = r0
            r28 = r11
            r29 = r12
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r14 = 1
            r12 = 1
        L_0x02bd:
            int r0 = r10.size()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r12 >= r0) goto L_0x02d7
            java.lang.Object r11 = r10.get(r12)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            android.graphics.PointF r11 = (android.graphics.PointF) r11     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.Object r0 = r9.get(r12)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            long r0 = X.C36431kI.A09(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r8.A06(r11, r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            int r12 = r12 + 1
            goto L_0x02bd
        L_0x02d7:
            int r0 = r10.size()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            int r0 = r0 - r14
            java.lang.Object r10 = r10.get(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            android.graphics.PointF r10 = (android.graphics.PointF) r10     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.Object r0 = r9.get(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            long r0 = X.C36431kI.A09(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r8.A05(r10, r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
        L_0x02ed:
            r2.A03 = r8     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            goto L_0x039a
        L_0x02f1:
            java.lang.String r0 = "speech-bubble-rect"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 == 0) goto L_0x03a6
            X.5Ch r2 = new X.5Ch     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.<init>()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            goto L_0x0397
        L_0x0300:
            java.lang.String r0 = "speech-bubble-oval"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 == 0) goto L_0x03a6
            X.5Cg r2 = new X.5Cg     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.<init>()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            goto L_0x0397
        L_0x030f:
            java.lang.String r0 = "image-file"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 == 0) goto L_0x03a6
            X.5Cj r2 = new X.5Cj     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.<init>((org.json.JSONObject) r8)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            goto L_0x039a
        L_0x031d:
            java.lang.String r0 = "analog-clock"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 == 0) goto L_0x03a6
            X.5Cn r2 = new X.5Cn     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.<init>(r4, r7, r14)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "hour"
            int r0 = r8.getInt(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.A00 = r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "minute"
            int r0 = r8.getInt(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.A01 = r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "theme"
            boolean r0 = r8.getBoolean(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.A08 = r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            goto L_0x0397
        L_0x0343:
            java.lang.String r0 = "digital-clock"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 == 0) goto L_0x03a6
            X.5CY r2 = new X.5CY     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.<init>(r4, r7, r14)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "theme"
            boolean r0 = r8.getBoolean(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.A06 = r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "time"
            java.lang.String r0 = X.C90474aD.A0e(r0, r8)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.A02 = r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "period"
            java.lang.String r0 = X.C90474aD.A0e(r0, r8)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.A01 = r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            X.AnonymousClass5CY.A00(r2)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            goto L_0x0397
        L_0x036c:
            java.lang.String r0 = "circular-mask"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 == 0) goto L_0x03a6
            X.5Cc r2 = new X.5Cc     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.<init>()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            goto L_0x0397
        L_0x037a:
            java.lang.String r0 = "sticker"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 == 0) goto L_0x03a6
            X.5CZ r2 = new X.5CZ     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r0 = r33
            r2.<init>(r4, r0, r8)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            goto L_0x039a
        L_0x038a:
            java.lang.String r0 = "thinking-bubble"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 == 0) goto L_0x03a6
            X.5Ck r2 = new X.5Ck     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2.<init>()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
        L_0x0397:
            r2.A0M(r8)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
        L_0x039a:
            X.6Ft r2 = (X.C129196Ft) r2     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r2 == 0) goto L_0x03a6
            r2.A0D()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r0 = r18
            r0.add(r2)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
        L_0x03a6:
            int r6 = r6 + 1
            goto L_0x0066
        L_0x03aa:
            java.lang.String r0 = "Json is not valid for PenBrushModel"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
        L_0x03b0:
            throw r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
        L_0x03b1:
            X.6VQ r4 = new X.6VQ     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2 = r21
            r1 = r18
            r0 = r20
            r4.<init>(r2, r3, r1, r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r0 = r22
            boolean r0 = r5.has(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 == 0) goto L_0x041d
            r0 = r22
            org.json.JSONObject r3 = r5.getJSONObject(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r3 == 0) goto L_0x041d
            java.lang.String r0 = "small-bitmap"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r0, r2)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            int r0 = r1.length     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "origin-width"
            int r1 = r3.getInt(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.lang.String r0 = "origin-height"
            int r0 = r3.getInt(r0)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            X.6L5 r5 = new X.6L5     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r5.<init>(r1, r0, r2)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.util.List r0 = r4.A04     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
        L_0x03f7:
            boolean r0 = r2.hasNext()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 == 0) goto L_0x0409
            java.lang.Object r1 = r2.next()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            boolean r0 = r1 instanceof X.AnonymousClass5Ci     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 == 0) goto L_0x03f7
            r3.add(r1)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            goto L_0x03f7
        L_0x0409:
            java.util.Iterator r1 = r3.iterator()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
        L_0x040d:
            boolean r0 = r1.hasNext()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            if (r0 == 0) goto L_0x041d
            java.lang.Object r0 = r1.next()     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            X.5Ci r0 = (X.AnonymousClass5Ci) r0     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            r0.A0P(r5)     // Catch:{ JSONException -> 0x041e, IllegalArgumentException -> 0x0422 }
            goto L_0x040d
        L_0x041d:
            return r4
        L_0x041e:
            r1 = move-exception
            java.lang.String r0 = "Doodle/load unable to load from JSON"
            goto L_0x0425
        L_0x0422:
            r1 = move-exception
            java.lang.String r0 = "Doodle/Drawable or picture unable to load from JSON"
        L_0x0425:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0428:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130956Nc.A02(android.content.Context, X.0ts, X.1H2, X.1HA, java.lang.String):X.6VQ");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass6VQ A00(android.content.Context r4, X.C18820ts r5, X.AnonymousClass1H2 r6, X.AnonymousClass1HA r7, java.io.File r8) {
        /*
            X.C36321k7.A18(r4, r6, r5, r7)
            java.io.BufferedReader r2 = X.C90504aG.A0Z(r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0023 }
        L_0x000b:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0015
            r1.append(r0)     // Catch:{ all -> 0x0023 }
            goto L_0x000b
        L_0x0015:
            X.6Nc r3 = X.AnonymousClass6VQ.A05     // Catch:{ all -> 0x0023 }
            java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x0023 }
            X.6VQ r0 = r3.A02(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0023 }
            r2.close()
            return r0
        L_0x0023:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130956Nc.A00(android.content.Context, X.0ts, X.1H2, X.1HA, java.io.File):X.6VQ");
    }

    public final AnonymousClass6VQ A01(Context context, C18820ts r4, AnonymousClass1H2 r5, AnonymousClass1HA r6, File file) {
        C36321k7.A18(context, r5, r4, r6);
        try {
            return A00(context, r4, r5, r6, file);
        } catch (IOException e) {
            Log.e("Doodle/safeLoad could not load doodle from file", e);
            return null;
        }
    }
}
