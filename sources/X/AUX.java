package X;

public class AUX implements Cloneable {
    public Integer A00;
    public float A01;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        return r1 / r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float A00() {
        /*
            r3 = this;
            r2 = 1119879168(0x42c00000, float:96.0)
            java.lang.Integer r0 = r3.A00
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x000e
            switch(r1) {
                case 3: goto L_0x0011;
                case 4: goto L_0x0015;
                case 5: goto L_0x001c;
                case 6: goto L_0x0023;
                case 7: goto L_0x0029;
                default: goto L_0x000e;
            }
        L_0x000e:
            float r0 = r3.A01
            return r0
        L_0x0011:
            float r1 = r3.A01
            float r1 = r1 * r2
            return r1
        L_0x0015:
            float r1 = r3.A01
            float r1 = r1 * r2
            r0 = 1076006748(0x40228f5c, float:2.54)
            goto L_0x002e
        L_0x001c:
            float r1 = r3.A01
            float r1 = r1 * r2
            r0 = 1103835955(0x41cb3333, float:25.4)
            goto L_0x002e
        L_0x0023:
            float r1 = r3.A01
            float r1 = r1 * r2
            r0 = 1116733440(0x42900000, float:72.0)
            goto L_0x002e
        L_0x0029:
            float r1 = r3.A01
            float r1 = r1 * r2
            r0 = 1086324736(0x40c00000, float:6.0)
        L_0x002e:
            float r1 = r1 / r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AUX.A00():float");
    }

    public float A01(AnonymousClass9p5 r6) {
        float sqrt;
        if (this.A00 != C023109s.A0X) {
            return A02(r6);
        }
        C198179d2 r1 = r6.A02;
        C198839eH r0 = r1.A02;
        if (r0 == null && (r0 = r1.A03) == null) {
            return this.A01;
        }
        float f = r0.A03;
        float f2 = r0.A00;
        if (f == f2) {
            sqrt = this.A01 * f;
        } else {
            sqrt = this.A01 * ((float) (Math.sqrt((double) ((f * f) + (f2 * f2))) / 1.414213562373095d));
        }
        return sqrt / 100.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        return r2 * r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        return r2 / r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        return r3.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float A02(X.AnonymousClass9p5 r4) {
        /*
            r3 = this;
            java.lang.Integer r0 = r3.A00
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x0017;
                case 2: goto L_0x0022;
                case 3: goto L_0x0030;
                case 4: goto L_0x0036;
                case 5: goto L_0x003f;
                case 6: goto L_0x0048;
                case 7: goto L_0x0058;
                case 8: goto L_0x000c;
                default: goto L_0x0009;
            }
        L_0x0009:
            float r0 = r3.A01
            return r0
        L_0x000c:
            X.9d2 r1 = r4.A02
            X.9eH r0 = r1.A02
            if (r0 != 0) goto L_0x0050
            X.9eH r0 = r1.A03
            if (r0 != 0) goto L_0x0050
            goto L_0x0009
        L_0x0017:
            float r2 = r3.A01
            X.9d2 r0 = r4.A02
            android.graphics.Paint r0 = r0.A00
            float r1 = r0.getTextSize()
            goto L_0x0034
        L_0x0022:
            float r2 = r3.A01
            X.9d2 r0 = r4.A02
            android.graphics.Paint r0 = r0.A00
            float r1 = r0.getTextSize()
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            goto L_0x0034
        L_0x0030:
            float r2 = r3.A01
            r1 = 1119879168(0x42c00000, float:96.0)
        L_0x0034:
            float r2 = r2 * r1
            return r2
        L_0x0036:
            float r2 = r3.A01
            r0 = 1119879168(0x42c00000, float:96.0)
            float r2 = r2 * r0
            r0 = 1076006748(0x40228f5c, float:2.54)
            goto L_0x005f
        L_0x003f:
            float r2 = r3.A01
            r0 = 1119879168(0x42c00000, float:96.0)
            float r2 = r2 * r0
            r0 = 1103835955(0x41cb3333, float:25.4)
            goto L_0x005f
        L_0x0048:
            float r2 = r3.A01
            r0 = 1119879168(0x42c00000, float:96.0)
            float r2 = r2 * r0
            r0 = 1116733440(0x42900000, float:72.0)
            goto L_0x005f
        L_0x0050:
            float r2 = r3.A01
            float r0 = r0.A03
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            goto L_0x005f
        L_0x0058:
            float r2 = r3.A01
            r0 = 1119879168(0x42c00000, float:96.0)
            float r2 = r2 * r0
            r0 = 1086324736(0x40c00000, float:6.0)
        L_0x005f:
            float r2 = r2 / r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AUX.A02(X.9p5):float");
    }

    public float A03(AnonymousClass9p5 r3) {
        if (this.A00 != C023109s.A0X) {
            return A02(r3);
        }
        C198179d2 r1 = r3.A02;
        C198839eH r0 = r1.A02;
        if (r0 == null && (r0 = r1.A03) == null) {
            return this.A01;
        }
        return (this.A01 * r0.A00) / 100.0f;
    }

    public float A04(AnonymousClass9p5 r3, float f) {
        if (this.A00 == C023109s.A0X) {
            return (this.A01 * f) / 100.0f;
        }
        return A02(r3);
    }

    public AUX(Integer num, float f) {
        this.A01 = f;
        this.A00 = num;
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(String.valueOf(this.A01));
        switch (this.A00.intValue()) {
            case 1:
                str = "em";
                break;
            case 2:
                str = "ex";
                break;
            case 3:
                str = "in";
                break;
            case 4:
                str = "cm";
                break;
            case 5:
                str = "mm";
                break;
            case 6:
                str = "pt";
                break;
            case 7:
                str = "pc";
                break;
            case 8:
                str = "percent";
                break;
            default:
                str = "px";
                break;
        }
        return AnonymousClass000.A0q(str, A0u);
    }

    public AUX(float f) {
        this.A01 = f;
        this.A00 = C023109s.A00;
    }
}
