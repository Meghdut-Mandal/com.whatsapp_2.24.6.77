package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0LI  reason: invalid class name */
public class AnonymousClass0LI extends AnonymousClass0LJ {
    public static final Parcelable.Creator CREATOR = new C08200aM();
    public final Parcel A00;
    public final int A01;
    public final AnonymousClass0KG A02;
    public final String A03;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x036f, code lost:
        r5.append(r0);
        r5.append("\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0377, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x040a, code lost:
        r5.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x040e, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011f, code lost:
        r10 = X.AnonymousClass0YG.A02(r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0125, code lost:
        if (r9.A05 == false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0127, code lost:
        r10 = (java.util.AbstractList) r10;
        r5.append("[");
        r8 = r10.size();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0133, code lost:
        if (r2 >= r8) goto L_0x0445;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0135, code lost:
        if (r2 == 0) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0137, code lost:
        r5.append(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013a, code lost:
        A01(r10.get(r2), r5, r9.A02);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0146, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0148, code lost:
        A01(r10, r5, r9.A02);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(android.os.Parcel r18, java.lang.StringBuilder r19, java.util.Map r20) {
        /*
            r17 = this;
            android.util.SparseArray r7 = new android.util.SparseArray
            r7.<init>()
            java.util.Iterator r2 = X.AnonymousClass000.A0y(r20)
        L_0x0009:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001f
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r2)
            java.lang.Object r0 = r1.getValue()
            X.0Kz r0 = (X.C04530Kz) r0
            int r0 = r0.A03
            r7.put(r0, r1)
            goto L_0x0009
        L_0x001f:
            r0 = 123(0x7b, float:1.72E-43)
            r5 = r19
            r5.append(r0)
            r3 = r18
            int r4 = X.AnonymousClass0ZA.A00(r3)
            r6 = 0
            r8 = 0
        L_0x002e:
            int r0 = r3.dataPosition()
            if (r0 >= r4) goto L_0x045b
            int r1 = r3.readInt()
            char r0 = (char) r1
            java.lang.Object r2 = r7.get(r0)
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r2 == 0) goto L_0x002e
            java.lang.String r11 = ","
            if (r8 == 0) goto L_0x0048
            r5.append(r11)
        L_0x0048:
            java.lang.Object r0 = r2.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r9 = r2.getValue()
            X.0Kz r9 = (X.C04530Kz) r9
            java.lang.String r10 = "\""
            r5.append(r10)
            r5.append(r0)
            java.lang.String r0 = "\":"
            r5.append(r0)
            X.0oJ r0 = r9.A00
            if (r0 == 0) goto L_0x014f
            int r2 = r9.A07
            switch(r2) {
                case 0: goto L_0x0083;
                case 1: goto L_0x00cc;
                case 2: goto L_0x008d;
                case 3: goto L_0x00e4;
                case 4: goto L_0x00f1;
                case 5: goto L_0x00ff;
                case 6: goto L_0x0075;
                case 7: goto L_0x0097;
                case 8: goto L_0x009d;
                case 9: goto L_0x009d;
                case 10: goto L_0x00a2;
                case 11: goto L_0x044d;
                default: goto L_0x006a;
            }
        L_0x006a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown field out type = "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0d(r0, r1, r2)
            throw r1
        L_0x0075:
            int r0 = X.AnonymousClass0ZA.A01(r3, r1)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            goto L_0x011f
        L_0x0083:
            int r0 = X.AnonymousClass0ZA.A01(r3, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x011f
        L_0x008d:
            long r0 = X.AnonymousClass0ZA.A03(r3, r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            goto L_0x011f
        L_0x0097:
            java.lang.String r2 = X.AnonymousClass0ZA.A08(r3, r1)
            goto L_0x011f
        L_0x009d:
            byte[] r2 = X.AnonymousClass0ZA.A0I(r3, r1)
            goto L_0x011f
        L_0x00a2:
            android.os.Bundle r10 = X.AnonymousClass0ZA.A04(r3, r1)
            java.util.HashMap r8 = X.AnonymousClass001.A0J()
            java.util.Set r0 = r10.keySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x00b2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c7
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)
            java.lang.String r0 = r10.getString(r1)
            X.AnonymousClass006.A01(r0)
            r8.put(r1, r0)
            goto L_0x00b2
        L_0x00c7:
            java.lang.Object r10 = X.AnonymousClass0YG.A02(r9, r8)
            goto L_0x0123
        L_0x00cc:
            int r2 = X.AnonymousClass0ZA.A02(r3, r1)
            int r1 = r3.dataPosition()
            if (r2 == 0) goto L_0x0146
            byte[] r0 = r3.createByteArray()
            int r1 = r1 + r2
            r3.setDataPosition(r1)
            java.math.BigInteger r2 = new java.math.BigInteger
            r2.<init>(r0)
            goto L_0x011f
        L_0x00e4:
            r0 = 4
            X.AnonymousClass0ZA.A0F(r3, r1, r0)
            float r0 = r3.readFloat()
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            goto L_0x011f
        L_0x00f1:
            r0 = 8
            X.AnonymousClass0ZA.A0F(r3, r1, r0)
            double r0 = r3.readDouble()
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            goto L_0x011f
        L_0x00ff:
            int r8 = X.AnonymousClass0ZA.A02(r3, r1)
            int r0 = r3.dataPosition()
            if (r8 == 0) goto L_0x0146
            byte[] r2 = r3.createByteArray()
            int r1 = r3.readInt()
            int r0 = r0 + r8
            r3.setDataPosition(r0)
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2)
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r0, r1)
        L_0x011f:
            java.lang.Object r10 = X.AnonymousClass0YG.A02(r9, r2)
        L_0x0123:
            boolean r0 = r9.A05
            if (r0 == 0) goto L_0x0148
            java.util.AbstractList r10 = (java.util.AbstractList) r10
            java.lang.String r0 = "["
            r5.append(r0)
            int r8 = r10.size()
            r2 = 0
        L_0x0133:
            if (r2 >= r8) goto L_0x0445
            if (r2 == 0) goto L_0x013a
            r5.append(r11)
        L_0x013a:
            int r1 = r9.A02
            java.lang.Object r0 = r10.get(r2)
            A01(r0, r5, r1)
            int r2 = r2 + 1
            goto L_0x0133
        L_0x0146:
            r2 = 0
            goto L_0x011f
        L_0x0148:
            int r0 = r9.A02
            A01(r10, r5, r0)
            goto L_0x044a
        L_0x014f:
            boolean r0 = r9.A0A
            r8 = r17
            if (r0 == 0) goto L_0x031b
            java.lang.String r0 = "["
            r5.append(r0)
            int r0 = r9.A07
            switch(r0) {
                case 0: goto L_0x0166;
                case 1: goto L_0x019a;
                case 2: goto L_0x01d2;
                case 3: goto L_0x01fb;
                case 4: goto L_0x0224;
                case 5: goto L_0x024d;
                case 6: goto L_0x028e;
                case 7: goto L_0x017f;
                case 8: goto L_0x0454;
                case 9: goto L_0x0454;
                case 10: goto L_0x0454;
                case 11: goto L_0x02b7;
                default: goto L_0x015f;
            }
        L_0x015f:
            java.lang.String r0 = "Unknown field type out."
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r0)
            throw r1
        L_0x0166:
            int[] r8 = X.AnonymousClass0ZA.A0J(r3, r1)
            int r2 = r8.length
            r1 = 0
        L_0x016c:
            if (r1 >= r2) goto L_0x0445
            if (r1 == 0) goto L_0x0173
            r5.append(r11)
        L_0x0173:
            r0 = r8[r1]
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r5.append(r0)
            int r1 = r1 + 1
            goto L_0x016c
        L_0x017f:
            java.lang.String[] r8 = X.AnonymousClass0ZA.A0L(r3, r1)
            int r2 = r8.length
            r1 = 0
        L_0x0185:
            if (r1 >= r2) goto L_0x0445
            if (r1 == 0) goto L_0x018c
            r5.append(r11)
        L_0x018c:
            r5.append(r10)
            r0 = r8[r1]
            r5.append(r0)
            r5.append(r10)
            int r1 = r1 + 1
            goto L_0x0185
        L_0x019a:
            int r12 = X.AnonymousClass0ZA.A02(r3, r1)
            int r10 = r3.dataPosition()
            if (r12 != 0) goto L_0x01b6
            r9 = 0
        L_0x01a5:
            int r2 = r9.length
            r1 = 0
        L_0x01a7:
            if (r1 >= r2) goto L_0x0445
            if (r1 == 0) goto L_0x01ae
            r5.append(r11)
        L_0x01ae:
            r0 = r9[r1]
            r5.append(r0)
            int r1 = r1 + 1
            goto L_0x01a7
        L_0x01b6:
            int r8 = r3.readInt()
            java.math.BigInteger[] r9 = new java.math.BigInteger[r8]
            r2 = 0
        L_0x01bd:
            if (r2 >= r8) goto L_0x01cd
            byte[] r1 = r3.createByteArray()
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1)
            r9[r2] = r0
            int r2 = r2 + 1
            goto L_0x01bd
        L_0x01cd:
            int r10 = r10 + r12
            r3.setDataPosition(r10)
            goto L_0x01a5
        L_0x01d2:
            int r1 = X.AnonymousClass0ZA.A02(r3, r1)
            int r0 = r3.dataPosition()
            if (r1 != 0) goto L_0x01f2
            r9 = 0
        L_0x01dd:
            int r8 = r9.length
            r2 = 0
        L_0x01df:
            if (r2 >= r8) goto L_0x0445
            if (r2 == 0) goto L_0x01e6
            r5.append(r11)
        L_0x01e6:
            r0 = r9[r2]
            java.lang.String r0 = java.lang.Long.toString(r0)
            r5.append(r0)
            int r2 = r2 + 1
            goto L_0x01df
        L_0x01f2:
            long[] r9 = r3.createLongArray()
            int r0 = r0 + r1
            r3.setDataPosition(r0)
            goto L_0x01dd
        L_0x01fb:
            int r1 = X.AnonymousClass0ZA.A02(r3, r1)
            int r0 = r3.dataPosition()
            if (r1 != 0) goto L_0x021b
            r8 = 0
        L_0x0206:
            int r2 = r8.length
            r1 = 0
        L_0x0208:
            if (r1 >= r2) goto L_0x0445
            if (r1 == 0) goto L_0x020f
            r5.append(r11)
        L_0x020f:
            r0 = r8[r1]
            java.lang.String r0 = java.lang.Float.toString(r0)
            r5.append(r0)
            int r1 = r1 + 1
            goto L_0x0208
        L_0x021b:
            float[] r8 = r3.createFloatArray()
            int r0 = r0 + r1
            r3.setDataPosition(r0)
            goto L_0x0206
        L_0x0224:
            int r1 = X.AnonymousClass0ZA.A02(r3, r1)
            int r0 = r3.dataPosition()
            if (r1 != 0) goto L_0x0244
            r9 = 0
        L_0x022f:
            int r8 = r9.length
            r2 = 0
        L_0x0231:
            if (r2 >= r8) goto L_0x0445
            if (r2 == 0) goto L_0x0238
            r5.append(r11)
        L_0x0238:
            r0 = r9[r2]
            java.lang.String r0 = java.lang.Double.toString(r0)
            r5.append(r0)
            int r2 = r2 + 1
            goto L_0x0231
        L_0x0244:
            double[] r9 = r3.createDoubleArray()
            int r0 = r0 + r1
            r3.setDataPosition(r0)
            goto L_0x022f
        L_0x024d:
            int r13 = X.AnonymousClass0ZA.A02(r3, r1)
            int r12 = r3.dataPosition()
            if (r13 != 0) goto L_0x0269
            r10 = 0
        L_0x0258:
            int r2 = r10.length
            r1 = 0
        L_0x025a:
            if (r1 >= r2) goto L_0x0445
            if (r1 == 0) goto L_0x0261
            r5.append(r11)
        L_0x0261:
            r0 = r10[r1]
            r5.append(r0)
            int r1 = r1 + 1
            goto L_0x025a
        L_0x0269:
            int r9 = r3.readInt()
            java.math.BigDecimal[] r10 = new java.math.BigDecimal[r9]
            r8 = 0
        L_0x0270:
            if (r8 >= r9) goto L_0x0289
            byte[] r0 = r3.createByteArray()
            int r2 = r3.readInt()
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1, r2)
            r10[r8] = r0
            int r8 = r8 + 1
            goto L_0x0270
        L_0x0289:
            int r12 = r12 + r13
            r3.setDataPosition(r12)
            goto L_0x0258
        L_0x028e:
            int r1 = X.AnonymousClass0ZA.A02(r3, r1)
            int r0 = r3.dataPosition()
            if (r1 != 0) goto L_0x02ae
            r8 = 0
        L_0x0299:
            int r2 = r8.length
            r1 = 0
        L_0x029b:
            if (r1 >= r2) goto L_0x0445
            if (r1 == 0) goto L_0x02a2
            r5.append(r11)
        L_0x02a2:
            boolean r0 = r8[r1]
            java.lang.String r0 = java.lang.Boolean.toString(r0)
            r5.append(r0)
            int r1 = r1 + 1
            goto L_0x029b
        L_0x02ae:
            boolean[] r8 = r3.createBooleanArray()
            int r0 = r0 + r1
            r3.setDataPosition(r0)
            goto L_0x0299
        L_0x02b7:
            int r16 = X.AnonymousClass0ZA.A02(r3, r1)
            int r15 = r3.dataPosition()
            r14 = 0
            if (r16 == 0) goto L_0x02ee
            int r13 = r3.readInt()
            android.os.Parcel[] r12 = new android.os.Parcel[r13]
            r10 = 0
        L_0x02c9:
            if (r10 >= r13) goto L_0x02e8
            int r2 = r3.readInt()
            if (r2 == 0) goto L_0x02e5
            int r1 = r3.dataPosition()
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r0.appendFrom(r3, r1, r2)
            r12[r10] = r0
            int r1 = r1 + r2
            r3.setDataPosition(r1)
        L_0x02e2:
            int r10 = r10 + 1
            goto L_0x02c9
        L_0x02e5:
            r12[r10] = r14
            goto L_0x02e2
        L_0x02e8:
            int r15 = r15 + r16
            r3.setDataPosition(r15)
            r14 = r12
        L_0x02ee:
            int r10 = r14.length
            r2 = 0
        L_0x02f0:
            if (r2 >= r10) goto L_0x0445
            if (r2 <= 0) goto L_0x02f7
            r5.append(r11)
        L_0x02f7:
            r0 = r14[r2]
            r0.setDataPosition(r6)
            java.lang.String r1 = r9.A04
            X.AnonymousClass006.A01(r1)
            X.0KG r0 = r9.A01
            X.AnonymousClass006.A01(r0)
            X.0KG r0 = r9.A01
            java.util.HashMap r0 = r0.A02
            java.lang.Object r1 = r0.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            X.AnonymousClass006.A01(r1)
            r0 = r14[r2]
            r8.A00(r0, r5, r1)
            int r2 = r2 + 1
            goto L_0x02f0
        L_0x031b:
            int r0 = r9.A07
            switch(r0) {
                case 0: goto L_0x0334;
                case 1: goto L_0x03b9;
                case 2: goto L_0x033d;
                case 3: goto L_0x03d1;
                case 4: goto L_0x03dd;
                case 5: goto L_0x03ea;
                case 6: goto L_0x0327;
                case 7: goto L_0x0346;
                case 8: goto L_0x0352;
                case 9: goto L_0x0360;
                case 10: goto L_0x0379;
                case 11: goto L_0x0410;
                default: goto L_0x0320;
            }
        L_0x0320:
            java.lang.String r0 = "Unknown field type out"
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r0)
            throw r1
        L_0x0327:
            int r0 = X.AnonymousClass0ZA.A01(r3, r1)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r5.append(r0)
            goto L_0x044a
        L_0x0334:
            int r0 = X.AnonymousClass0ZA.A01(r3, r1)
            r5.append(r0)
            goto L_0x044a
        L_0x033d:
            long r0 = X.AnonymousClass0ZA.A03(r3, r1)
            r5.append(r0)
            goto L_0x044a
        L_0x0346:
            java.lang.String r0 = X.AnonymousClass0ZA.A08(r3, r1)
            r5.append(r10)
            java.lang.String r0 = X.C07000Vy.A00(r0)
            goto L_0x036f
        L_0x0352:
            byte[] r0 = X.AnonymousClass0ZA.A0I(r3, r1)
            r5.append(r10)
            if (r0 == 0) goto L_0x0377
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r6)
            goto L_0x036f
        L_0x0360:
            byte[] r1 = X.AnonymousClass0ZA.A0I(r3, r1)
            r5.append(r10)
            if (r1 == 0) goto L_0x0377
            r0 = 10
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)
        L_0x036f:
            r5.append(r0)
            r5.append(r10)
            goto L_0x044a
        L_0x0377:
            r0 = 0
            goto L_0x036f
        L_0x0379:
            android.os.Bundle r9 = X.AnonymousClass0ZA.A04(r3, r1)
            java.util.Set r1 = r9.keySet()
            java.lang.String r0 = "{"
            r5.append(r0)
            java.util.Iterator r8 = r1.iterator()
            r2 = 1
        L_0x038b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x03b5
            java.lang.String r1 = X.AnonymousClass001.A0C(r8)
            if (r2 != 0) goto L_0x039a
            r5.append(r11)
        L_0x039a:
            r5.append(r10)
            r5.append(r1)
            java.lang.String r0 = "\":\""
            r5.append(r0)
            java.lang.String r0 = r9.getString(r1)
            java.lang.String r0 = X.C07000Vy.A00(r0)
            r5.append(r0)
            r5.append(r10)
            r2 = 0
            goto L_0x038b
        L_0x03b5:
            java.lang.String r0 = "}"
            goto L_0x0447
        L_0x03b9:
            int r2 = X.AnonymousClass0ZA.A02(r3, r1)
            int r1 = r3.dataPosition()
            if (r2 == 0) goto L_0x040e
            byte[] r0 = r3.createByteArray()
            int r1 = r1 + r2
            r3.setDataPosition(r1)
            java.math.BigInteger r2 = new java.math.BigInteger
            r2.<init>(r0)
            goto L_0x040a
        L_0x03d1:
            r0 = 4
            X.AnonymousClass0ZA.A0F(r3, r1, r0)
            float r0 = r3.readFloat()
            r5.append(r0)
            goto L_0x044a
        L_0x03dd:
            r0 = 8
            X.AnonymousClass0ZA.A0F(r3, r1, r0)
            double r0 = r3.readDouble()
            r5.append(r0)
            goto L_0x044a
        L_0x03ea:
            int r8 = X.AnonymousClass0ZA.A02(r3, r1)
            int r0 = r3.dataPosition()
            if (r8 == 0) goto L_0x040e
            byte[] r2 = r3.createByteArray()
            int r1 = r3.readInt()
            int r0 = r0 + r8
            r3.setDataPosition(r0)
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2)
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r0, r1)
        L_0x040a:
            r5.append(r2)
            goto L_0x044a
        L_0x040e:
            r2 = 0
            goto L_0x040a
        L_0x0410:
            int r1 = X.AnonymousClass0ZA.A02(r3, r1)
            int r0 = r3.dataPosition()
            if (r1 != 0) goto L_0x0439
            r2 = 0
        L_0x041b:
            r2.setDataPosition(r6)
            java.lang.String r1 = r9.A04
            X.AnonymousClass006.A01(r1)
            X.0KG r0 = r9.A01
            X.AnonymousClass006.A01(r0)
            X.0KG r0 = r9.A01
            java.util.HashMap r0 = r0.A02
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            X.AnonymousClass006.A01(r0)
            r8.A00(r2, r5, r0)
            goto L_0x044a
        L_0x0439:
            android.os.Parcel r2 = android.os.Parcel.obtain()
            r2.appendFrom(r3, r0, r1)
            int r0 = r0 + r1
            r3.setDataPosition(r0)
            goto L_0x041b
        L_0x0445:
            java.lang.String r0 = "]"
        L_0x0447:
            r5.append(r0)
        L_0x044a:
            r8 = 1
            goto L_0x002e
        L_0x044d:
            java.lang.String r0 = "Method does not accept concrete type."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r0)
            throw r1
        L_0x0454:
            java.lang.String r0 = "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
            java.lang.UnsupportedOperationException r1 = X.AnonymousClass001.A0E(r0)
            throw r1
        L_0x045b:
            int r0 = r3.dataPosition()
            if (r0 != r4) goto L_0x0467
            r0 = 125(0x7d, float:1.75E-43)
            r5.append(r0)
            return
        L_0x0467:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Overread allowed size end="
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r4)
            X.0jP r1 = new X.0jP
            r1.<init>(r3, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0LI.A00(android.os.Parcel, java.lang.StringBuilder, java.util.Map):void");
    }

    public static final void A01(Object obj, StringBuilder sb, int i) {
        String str;
        byte[] bArr;
        int i2;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                AnonymousClass006.A01(obj);
                str = C07000Vy.A00(obj.toString());
                break;
            case 8:
                sb.append("\"");
                bArr = (byte[]) obj;
                i2 = 0;
                break;
            case 9:
                sb.append("\"");
                bArr = (byte[]) obj;
                i2 = 10;
                break;
            case 10:
                AnonymousClass006.A01(obj);
                AnonymousClass0QP.A00(sb, (HashMap) obj);
                return;
            case 11:
                throw AnonymousClass001.A08("Method does not accept concrete type.");
            default:
                throw AnonymousClass000.A0d("Unknown type = ", AnonymousClass000.A0u(), i);
        }
        if (bArr == null) {
            str = null;
        } else {
            str = Base64.encodeToString(bArr, i2);
        }
        sb.append(str);
        sb.append("\"");
    }

    public final Object A05(String str) {
        throw AnonymousClass001.A0E("Converting to JSON does not require this method.");
    }

    public final Map A06() {
        AnonymousClass0KG r0 = this.A02;
        if (r0 == null) {
            return null;
        }
        String str = this.A03;
        AnonymousClass006.A01(str);
        return (Map) r0.A02.get(str);
    }

    public final boolean A08(String str) {
        throw AnonymousClass001.A0E("Converting to JSON does not require this method.");
    }

    public final String toString() {
        AnonymousClass0KG r4 = this.A02;
        AnonymousClass006.A02(r4, "Cannot convert to JSON on client side.");
        Parcel parcel = this.A00;
        parcel.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        String str = this.A03;
        AnonymousClass006.A01(str);
        Map map = (Map) r4.A02.get(str);
        AnonymousClass006.A01(map);
        A00(parcel, sb, map);
        return sb.toString();
    }

    public AnonymousClass0LI(Parcel parcel, AnonymousClass0KG r3, int i) {
        String str;
        this.A01 = i;
        AnonymousClass006.A01(parcel);
        this.A00 = parcel;
        this.A02 = r3;
        if (r3 == null) {
            str = null;
        } else {
            str = r3.A01;
        }
        this.A03 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A01);
        Parcel parcel2 = this.A00;
        if (parcel2 != null) {
            int A022 = AnonymousClass0Z9.A02(parcel, 2);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            AnonymousClass0Z9.A07(parcel, A022);
        }
        AnonymousClass0Z9.A0B(parcel, this.A02, 3, i, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
