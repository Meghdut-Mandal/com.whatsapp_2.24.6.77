package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6FV  reason: invalid class name */
public final class AnonymousClass6FV {
    public C122675vF A00;
    public C129196Ft A01;
    public C129196Ft A02;
    public final C1268365v A03 = new C1268365v();
    public final List A04 = AnonymousClass001.A0I();

    public final void A02() {
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A04.clear();
        this.A03.A00.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        r0 = r3.size();
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047 A[LOOP:1: B:15:0x0041->B:17:0x0047, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e A[EDGE_INSN: B:26:0x005e->B:22:0x005e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C129196Ft r5) {
        /*
            r4 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            boolean r0 = r5 instanceof X.AnonymousClass5Ci
            if (r0 == 0) goto L_0x0063
            java.util.List r3 = r4.A04
            boolean r0 = X.C36401kF.A1a(r3)
            if (r0 == 0) goto L_0x0063
            r0 = r5
            X.5Ci r0 = (X.AnonymousClass5Ci) r0
            X.6Px r0 = r0.A03
            boolean r0 = r0 instanceof X.C104975Ct
            java.util.Iterator r2 = r3.iterator()
            if (r0 == 0) goto L_0x004f
        L_0x001d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005e
            X.6Ft r1 = X.C90524aI.A0N(r2)
            boolean r0 = r1 instanceof X.AnonymousClass5Ci
            if (r0 == 0) goto L_0x0034
            r0 = r1
            X.5Ci r0 = (X.AnonymousClass5Ci) r0
            X.6Px r0 = r0.A03
            boolean r0 = r0 instanceof X.C104975Ct
            if (r0 != 0) goto L_0x001d
        L_0x0034:
            int r0 = r3.indexOf(r1)
        L_0x0038:
            r3.add(r0, r5)
        L_0x003b:
            r4.A01 = r5
            java.util.Iterator r1 = r3.iterator()
        L_0x0041:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0069
            X.6Ft r0 = X.C90524aI.A0N(r1)
            r0.A0D()
            goto L_0x0041
        L_0x004f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass5Ci
            if (r0 != 0) goto L_0x004f
            goto L_0x0034
        L_0x005e:
            int r0 = r3.size()
            goto L_0x0038
        L_0x0063:
            java.util.List r3 = r4.A04
            r3.add(r5)
            goto L_0x003b
        L_0x0069:
            X.5Cp r1 = new X.5Cp
            r1.<init>(r5)
            X.65v r0 = r4.A03
            java.util.List r0 = r0.A00
            r0.add(r1)
            r0 = 0
            r4.A02 = r0
            r4.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6FV.A03(X.6Ft):void");
    }

    public final C129196Ft A00(PointF pointF) {
        int i;
        List list = this.A04;
        int A07 = C36431kI.A07(list);
        if (A07 < 0) {
            return null;
        }
        do {
            i = A07 - 1;
            C129196Ft r5 = (C129196Ft) list.get(A07);
            if (!(r5 instanceof AnonymousClass5Ci)) {
                float f = pointF.x;
                float f2 = pointF.y;
                if (r5 instanceof AnonymousClass5Cg) {
                    RectF rectF = r5.A02;
                    if (rectF.contains(f, f2)) {
                        float centerX = f - rectF.centerX();
                        float centerY = f2 - rectF.centerY();
                        float f3 = (float) 2;
                        float width = rectF.width() / f3;
                        float height = rectF.height() / f3;
                        if (((centerX * centerX) / (width * width)) + ((centerY * centerY) / (height * height)) <= 1.0f) {
                            return r5;
                        }
                    }
                } else {
                    boolean z = r5 instanceof AnonymousClass5Cd;
                    float f4 = -r5.A00;
                    if (z) {
                        RectF rectF2 = r5.A02;
                        float centerX2 = rectF2.centerX();
                        float centerY2 = rectF2.centerY();
                        float[] A0v = C90524aI.A0v();
                        A0v[0] = f;
                        A0v[1] = f2;
                        Matrix A0B = C90524aI.A0B();
                        A0B.setRotate(f4, centerX2, centerY2);
                        A0B.mapPoints(A0v);
                        float f5 = A0v[0];
                        float f6 = A0v[1];
                        if (rectF2.contains(f5, f6)) {
                            float f7 = rectF2.left;
                            float f8 = rectF2.bottom;
                            float f9 = rectF2.right;
                            float f10 = rectF2.top;
                            float f11 = f10 - f8;
                            float f12 = f9 - f7;
                            if (((double) C90494aF.A01(C90504aG.A02(f6, f12, f5 * f11, f9, f8), f10 * f7)) / Math.sqrt((double) ((f11 * f11) + (f12 * f12))) < ((double) C129196Ft.A05)) {
                                return r5;
                            }
                        }
                    } else {
                        RectF rectF3 = r5.A02;
                        float centerX3 = rectF3.centerX();
                        float centerY3 = rectF3.centerY();
                        float[] A0v2 = C90524aI.A0v();
                        A0v2[0] = f;
                        A0v2[1] = f2;
                        Matrix A0B2 = C90524aI.A0B();
                        A0B2.setRotate(f4, centerX3, centerY3);
                        A0B2.mapPoints(A0v2);
                        if (rectF3.contains(A0v2[0], A0v2[1])) {
                            return r5;
                        }
                    }
                }
            }
            A07 = i;
        } while (i >= 0);
        return null;
    }

    public final void A04(C129196Ft r5) {
        List list = this.A04;
        int indexOf = list.indexOf(r5);
        if (indexOf != -1) {
            this.A03.A00.add(new AnonymousClass5Cr(r5, indexOf));
            list.remove(r5);
            if (r5 == this.A01) {
                this.A01 = null;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        if ((r3 instanceof X.AnonymousClass5Cs) == false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        r9 = (X.AnonymousClass5Cs) r3;
        r15 = X.C36441kJ.A0N();
        r15.left = (float) r4.getDouble("left");
        r15.right = (float) r4.getDouble("right");
        r15.top = (float) r4.getDouble("top");
        r15.bottom = (float) r4.getDouble("bottom");
        r8 = r4.getInt("color");
        r7 = (float) r4.getDouble("rotate");
        r2 = (float) r4.getDouble("strokeWidth");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b5, code lost:
        if (r4.has("text") == false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b7, code lost:
        r19 = (float) r4.getDouble("text-size");
        r18 = r2;
        r17 = r7;
        r14 = new X.C104935Ca(r15, X.C90474aD.A0e("text", r4), r17, r18, r19, r8, r4.getInt("fontStyle"), r4.getInt("alignment"), r4.getInt("background_style"), r4.getInt("min_layout_width"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e7, code lost:
        r9.A00 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e9, code lost:
        r1 = r4.getInt("shape_index");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ef, code lost:
        if (r1 < 0) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f5, code lost:
        if (r1 >= r5.size()) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f7, code lost:
        r3.A00 = (X.C129196Ft) r5.get(r1);
        r11.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0103, code lost:
        r14 = new X.C122675vF(r15, r7, r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010b, code lost:
        if ((r3 instanceof X.AnonymousClass5Cr) == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010d, code lost:
        ((X.AnonymousClass5Cr) r3).A00 = r4.getInt("index");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.lang.String r26) {
        /*
            r25 = this;
            if (r26 == 0) goto L_0x0123
            r0 = r25
            X.65v r2 = r0.A03     // Catch:{ JSONException -> 0x011d }
            java.util.List r5 = r0.A04     // Catch:{ JSONException -> 0x011d }
            r0 = 1
            X.AnonymousClass00C.A0D(r5, r0)     // Catch:{ JSONException -> 0x011d }
            org.json.JSONObject r1 = X.C36441kJ.A1C(r26)     // Catch:{ JSONException -> 0x011d }
            java.lang.String r0 = "actions"
            org.json.JSONArray r12 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x011d }
            java.util.List r11 = r2.A00     // Catch:{ JSONException -> 0x011d }
            r11.clear()     // Catch:{ JSONException -> 0x011d }
            int r10 = r12.length()     // Catch:{ JSONException -> 0x011d }
            r6 = 0
        L_0x0020:
            if (r6 >= r10) goto L_0x0123
            org.json.JSONObject r4 = r12.getJSONObject(r6)     // Catch:{ JSONException -> 0x011d }
            java.lang.String r0 = "type"
            java.lang.String r1 = X.C90474aD.A0e(r0, r4)     // Catch:{ JSONException -> 0x011d }
            int r0 = r1.hashCode()     // Catch:{ JSONException -> 0x011d }
            switch(r0) {
                case 49116392: goto L_0x005f;
                case 1021915016: goto L_0x0051;
                case 1953129077: goto L_0x0043;
                case 1971936087: goto L_0x0035;
                default: goto L_0x0033;
            }     // Catch:{ JSONException -> 0x011d }
        L_0x0033:
            goto L_0x0119
        L_0x0035:
            java.lang.String r0 = "undo_modify_shape"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x011d }
            if (r0 == 0) goto L_0x0119
            X.5Cs r3 = new X.5Cs     // Catch:{ JSONException -> 0x011d }
            r3.<init>()     // Catch:{ JSONException -> 0x011d }
            goto L_0x006c
        L_0x0043:
            java.lang.String r0 = "undo_change_z_order"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x011d }
            if (r0 == 0) goto L_0x0119
            X.5Cq r3 = new X.5Cq     // Catch:{ JSONException -> 0x011d }
            r3.<init>()     // Catch:{ JSONException -> 0x011d }
            goto L_0x006c
        L_0x0051:
            java.lang.String r0 = "undo_delete_shape"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x011d }
            if (r0 == 0) goto L_0x0119
            X.5Cr r3 = new X.5Cr     // Catch:{ JSONException -> 0x011d }
            r3.<init>()     // Catch:{ JSONException -> 0x011d }
            goto L_0x006c
        L_0x005f:
            java.lang.String r0 = "undo_add_shape"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x011d }
            if (r0 == 0) goto L_0x0119
            X.5Cp r3 = new X.5Cp     // Catch:{ JSONException -> 0x011d }
            r3.<init>()     // Catch:{ JSONException -> 0x011d }
        L_0x006c:
            boolean r0 = r3 instanceof X.AnonymousClass5Cs     // Catch:{ JSONException -> 0x011d }
            if (r0 == 0) goto L_0x0109
            r9 = r3
            X.5Cs r9 = (X.AnonymousClass5Cs) r9     // Catch:{ JSONException -> 0x011d }
            android.graphics.RectF r15 = X.C36441kJ.A0N()     // Catch:{ JSONException -> 0x011d }
            java.lang.String r0 = "left"
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x011d }
            float r2 = (float) r0     // Catch:{ JSONException -> 0x011d }
            r15.left = r2     // Catch:{ JSONException -> 0x011d }
            java.lang.String r0 = "right"
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x011d }
            float r2 = (float) r0     // Catch:{ JSONException -> 0x011d }
            r15.right = r2     // Catch:{ JSONException -> 0x011d }
            java.lang.String r0 = "top"
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x011d }
            float r2 = (float) r0     // Catch:{ JSONException -> 0x011d }
            r15.top = r2     // Catch:{ JSONException -> 0x011d }
            java.lang.String r0 = "bottom"
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x011d }
            float r2 = (float) r0     // Catch:{ JSONException -> 0x011d }
            r15.bottom = r2     // Catch:{ JSONException -> 0x011d }
            java.lang.String r0 = "color"
            int r8 = r4.getInt(r0)     // Catch:{ JSONException -> 0x011d }
            java.lang.String r0 = "rotate"
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x011d }
            float r7 = (float) r0     // Catch:{ JSONException -> 0x011d }
            java.lang.String r0 = "strokeWidth"
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x011d }
            float r2 = (float) r0     // Catch:{ JSONException -> 0x011d }
            java.lang.String r1 = "text"
            boolean r0 = r4.has(r1)     // Catch:{ JSONException -> 0x011d }
            if (r0 == 0) goto L_0x0103
            java.lang.String r16 = X.C90474aD.A0e(r1, r4)     // Catch:{ JSONException -> 0x011d }
            java.lang.String r0 = "text-size"
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x011d }
            float r13 = (float) r0     // Catch:{ JSONException -> 0x011d }
            java.lang.String r0 = "fontStyle"
            int r21 = r4.getInt(r0)     // Catch:{ JSONException -> 0x011d }
            java.lang.String r0 = "alignment"
            int r22 = r4.getInt(r0)     // Catch:{ JSONException -> 0x011d }
            java.lang.String r0 = "background_style"
            int r23 = r4.getInt(r0)     // Catch:{ JSONException -> 0x011d }
            java.lang.String r0 = "min_layout_width"
            int r24 = r4.getInt(r0)     // Catch:{ JSONException -> 0x011d }
            X.5Ca r14 = new X.5Ca     // Catch:{ JSONException -> 0x011d }
            r20 = r8
            r19 = r13
            r18 = r2
            r17 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ JSONException -> 0x011d }
        L_0x00e7:
            r9.A00 = r14     // Catch:{ JSONException -> 0x011d }
        L_0x00e9:
            java.lang.String r0 = "shape_index"
            int r1 = r4.getInt(r0)     // Catch:{ JSONException -> 0x011d }
            if (r1 < 0) goto L_0x0119
            int r0 = r5.size()     // Catch:{ JSONException -> 0x011d }
            if (r1 >= r0) goto L_0x0119
            java.lang.Object r0 = r5.get(r1)     // Catch:{ JSONException -> 0x011d }
            X.6Ft r0 = (X.C129196Ft) r0     // Catch:{ JSONException -> 0x011d }
            r3.A00 = r0     // Catch:{ JSONException -> 0x011d }
            r11.add(r3)     // Catch:{ JSONException -> 0x011d }
            goto L_0x0119
        L_0x0103:
            X.5vF r14 = new X.5vF     // Catch:{ JSONException -> 0x011d }
            r14.<init>(r15, r7, r2, r8)     // Catch:{ JSONException -> 0x011d }
            goto L_0x00e7
        L_0x0109:
            boolean r0 = r3 instanceof X.AnonymousClass5Cr     // Catch:{ JSONException -> 0x011d }
            if (r0 == 0) goto L_0x00e9
            r1 = r3
            X.5Cr r1 = (X.AnonymousClass5Cr) r1     // Catch:{ JSONException -> 0x011d }
            java.lang.String r0 = "index"
            int r0 = r4.getInt(r0)     // Catch:{ JSONException -> 0x011d }
            r1.A00 = r0     // Catch:{ JSONException -> 0x011d }
            goto L_0x00e9
        L_0x0119:
            int r6 = r6 + 1
            goto L_0x0020
        L_0x011d:
            r1 = move-exception
            java.lang.String r0 = "ShapeRepository/loadUndoState"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6FV.A05(java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A06() {
        /*
            r3 = this;
            java.util.List r0 = r3.A04
            java.util.Iterator r2 = r0.iterator()
        L_0x0006:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001a
            X.6Ft r1 = X.C90524aI.A0N(r2)
            boolean r0 = r1 instanceof X.AnonymousClass5CY
            if (r0 != 0) goto L_0x0018
            boolean r0 = r1 instanceof X.C104965Cn
            if (r0 == 0) goto L_0x0006
        L_0x0018:
            r0 = 1
            return r0
        L_0x001a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6FV.A06():boolean");
    }

    public final ArrayList A01() {
        ArrayList A0I = AnonymousClass001.A0I();
        for (Object next : this.A04) {
            if (next instanceof AnonymousClass5Ci) {
                A0I.add(next);
            }
        }
        return A0I;
    }
}
