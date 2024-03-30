package X;

public class BAS implements AnonymousClass004 {
    public Object A00;
    public final int A01;

    public BAS(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0075, code lost:
        r0 = 0.55f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0089, code lost:
        r1 = r1 - ((float) ((android.graphics.Rect) r0.get()).top);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a0, code lost:
        r3 = r3 / ((float) ((android.graphics.Rect) r0.get()).height());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b1, code lost:
        if (r3 < 0.0f) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b5, code lost:
        if (r3 > 1.0f) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bc, code lost:
        return java.lang.Float.valueOf(1.0f - r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bd, code lost:
        r0 = (r3 > 0.0f ? 1 : (r3 == 0.0f ? 0 : -1));
        r3 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c1, code lost:
        if (r0 >= 0) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c3, code lost:
        r3 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cf, code lost:
        r0 = 0.45f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d2, code lost:
        r1 = r1 * r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d7, code lost:
        return java.lang.Float.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014b, code lost:
        r2 = X.AnonymousClass00E.A00(r1, r0);
        X.C18740tg.A06(r2);
        X.AnonymousClass00C.A08(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0155, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get() {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x015f;
                case 1: goto L_0x0156;
                case 2: goto L_0x0142;
                case 3: goto L_0x0134;
                case 4: goto L_0x011b;
                case 5: goto L_0x0112;
                case 6: goto L_0x0109;
                case 7: goto L_0x0100;
                case 8: goto L_0x0005;
                case 9: goto L_0x00f6;
                case 10: goto L_0x00ec;
                case 11: goto L_0x0005;
                case 12: goto L_0x00e2;
                case 13: goto L_0x00d8;
                case 14: goto L_0x00c5;
                case 15: goto L_0x0094;
                case 16: goto L_0x0079;
                case 17: goto L_0x006b;
                case 18: goto L_0x005e;
                case 19: goto L_0x004d;
                case 20: goto L_0x0045;
                case 21: goto L_0x003c;
                case 22: goto L_0x0032;
                case 23: goto L_0x0028;
                case 24: goto L_0x001e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r4.A00
            X.9Ui r0 = (X.C195449Ui) r0
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            X.004 r1 = r0.A04
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.Object r0 = r1.get()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.getPadding(r2)
            return r2
        L_0x001e:
            java.lang.Object r0 = r4.A00
            X.08g r0 = (X.C019408g) r0
            X.AT2 r2 = new X.AT2
            r2.<init>(r0)
            return r2
        L_0x0028:
            java.lang.Object r0 = r4.A00
            X.03v r0 = (X.C009003v) r0
            X.AT1 r2 = new X.AT1
            r2.<init>(r0)
            return r2
        L_0x0032:
            java.lang.Object r0 = r4.A00
            X.03v r0 = (X.C009003v) r0
            X.AB2 r2 = new X.AB2
            r2.<init>(r0)
            return r2
        L_0x003c:
            java.lang.Object r0 = r4.A00
            X.8Xh r0 = (X.C174508Xh) r0
            int r0 = r0.A02
            float r1 = (float) r0
            goto L_0x00cf
        L_0x0045:
            java.lang.Object r0 = r4.A00
            X.8Xh r0 = (X.C174508Xh) r0
            int r0 = r0.A02
            float r1 = (float) r0
            goto L_0x0075
        L_0x004d:
            java.lang.Object r2 = r4.A00
            X.8Xi r2 = (X.C174518Xi) r2
            android.content.res.Resources r1 = r2.A02
            r0 = 2131168374(0x7f070c76, float:1.7951048E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r1 = (float) r0
            X.AZ4 r0 = r2.A0F
            goto L_0x0089
        L_0x005e:
            java.lang.Object r1 = r4.A00
            X.8Xi r1 = (X.C174518Xi) r1
            X.AZ4 r0 = r1.A0C
            float r3 = X.AZ4.A00(r0)
            X.AZ4 r0 = r1.A0F
            goto L_0x00a0
        L_0x006b:
            java.lang.Object r0 = r4.A00
            X.8Xi r0 = (X.C174518Xi) r0
            X.AZ4 r0 = r0.A09
            float r1 = X.AZ4.A00(r0)
        L_0x0075:
            r0 = 1057803469(0x3f0ccccd, float:0.55)
            goto L_0x00d2
        L_0x0079:
            java.lang.Object r2 = r4.A00
            X.8Xi r2 = (X.C174518Xi) r2
            android.content.res.Resources r1 = r2.A02
            r0 = 2131168374(0x7f070c76, float:1.7951048E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r1 = (float) r0
            X.AZ4 r0 = r2.A0E
        L_0x0089:
            java.lang.Object r0 = r0.get()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            int r0 = r0.top
            float r0 = (float) r0
            float r1 = r1 - r0
            goto L_0x00d3
        L_0x0094:
            java.lang.Object r1 = r4.A00
            X.8Xi r1 = (X.C174518Xi) r1
            X.AZ4 r0 = r1.A0B
            float r3 = X.AZ4.A00(r0)
            X.AZ4 r0 = r1.A0E
        L_0x00a0:
            java.lang.Object r0 = r0.get()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            int r0 = r0.height()
            float r0 = (float) r0
            float r3 = r3 / r0
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00bd
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00bd
        L_0x00b7:
            float r2 = r2 - r3
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
        L_0x00bd:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 >= 0) goto L_0x00b7
            r3 = 0
            goto L_0x00b7
        L_0x00c5:
            java.lang.Object r0 = r4.A00
            X.8Xi r0 = (X.C174518Xi) r0
            X.AZ4 r0 = r0.A09
            float r1 = X.AZ4.A00(r0)
        L_0x00cf:
            r0 = 1055286886(0x3ee66666, float:0.45)
        L_0x00d2:
            float r1 = r1 * r0
        L_0x00d3:
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            return r2
        L_0x00d8:
            java.lang.Object r0 = r4.A00
            X.9Ui r0 = (X.C195449Ui) r0
            android.content.Context r1 = r0.A00
            r0 = 2131231086(0x7f08016e, float:1.8078243E38)
            goto L_0x014b
        L_0x00e2:
            java.lang.Object r0 = r4.A00
            X.9Ui r0 = (X.C195449Ui) r0
            android.content.Context r1 = r0.A00
            r0 = 2131231067(0x7f08015b, float:1.8078205E38)
            goto L_0x014b
        L_0x00ec:
            java.lang.Object r0 = r4.A00
            X.9Ui r0 = (X.C195449Ui) r0
            android.content.Context r1 = r0.A00
            r0 = 2131231073(0x7f080161, float:1.8078217E38)
            goto L_0x014b
        L_0x00f6:
            java.lang.Object r0 = r4.A00
            X.9Ui r0 = (X.C195449Ui) r0
            android.content.Context r1 = r0.A00
            r0 = 2131231087(0x7f08016f, float:1.8078245E38)
            goto L_0x014b
        L_0x0100:
            java.lang.Object r0 = r4.A00
            X.B2s r0 = (X.C23066B2s) r0
            android.graphics.drawable.Drawable r2 = r0.BEl()
            return r2
        L_0x0109:
            java.lang.Object r0 = r4.A00
            X.B2s r0 = (X.C23066B2s) r0
            android.graphics.drawable.Drawable r2 = r0.BCc()
            return r2
        L_0x0112:
            java.lang.Object r0 = r4.A00
            X.B2s r0 = (X.C23066B2s) r0
            android.graphics.drawable.Drawable r2 = r0.BCb()
            return r2
        L_0x011b:
            java.lang.Object r0 = r4.A00
            X.9Ui r0 = (X.C195449Ui) r0
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            X.004 r1 = r0.A08
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.Object r0 = r1.get()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.getPadding(r2)
            return r2
        L_0x0134:
            java.lang.Object r0 = r4.A00
            X.9Ui r0 = (X.C195449Ui) r0
            android.content.Context r1 = r0.A00
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r0 = 2131231066(0x7f08015a, float:1.8078203E38)
            goto L_0x014b
        L_0x0142:
            java.lang.Object r0 = r4.A00
            X.9Ui r0 = (X.C195449Ui) r0
            android.content.Context r1 = r0.A00
            r0 = 2131231072(0x7f080160, float:1.8078215E38)
        L_0x014b:
            android.graphics.drawable.Drawable r2 = X.AnonymousClass00E.A00(r1, r0)
            X.C18740tg.A06(r2)
            X.AnonymousClass00C.A08(r2)
            return r2
        L_0x0156:
            java.lang.Object r0 = r4.A00
            X.B2s r0 = (X.C23066B2s) r0
            android.graphics.drawable.Drawable r2 = r0.BEk()
            return r2
        L_0x015f:
            java.lang.Object r0 = r4.A00
            X.9GV r0 = (X.AnonymousClass9GV) r0
            android.content.Context r3 = r0.A00
            java.lang.String r2 = X.C113675fv.A00()
            if (r2 != 0) goto L_0x016d
            java.lang.String r2 = "default"
        L_0x016d:
            java.lang.String r1 = "light_prefs"
            r0 = 0
            java.io.File r0 = r3.getDir(r1, r0)
            java.io.File r2 = X.C36441kJ.A0w(r0, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BAS.get():java.lang.Object");
    }
}
