package X;

/* renamed from: X.9ZY  reason: invalid class name */
public class AnonymousClass9ZY implements B0G {
    public Object A00;
    public final int A01;

    public AnonymousClass9ZY(C201309jJ r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.Float} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r0 == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        r0 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r6.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        r0 = r7.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e3, code lost:
        r6.append(']');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e8, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bxd(java.lang.Appendable r6, java.lang.Object r7, X.C201179j1 r8) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x000b;
                case 1: goto L_0x0012;
                case 2: goto L_0x0028;
                case 3: goto L_0x003b;
                case 4: goto L_0x0057;
                case 5: goto L_0x0073;
                case 6: goto L_0x008f;
                case 7: goto L_0x00ab;
                case 8: goto L_0x00c7;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r7 = (java.lang.String) r7
            r8.A00(r6, r7)
            return
        L_0x000b:
            java.lang.Double r7 = (java.lang.Double) r7
            boolean r0 = r7.isInfinite()
            goto L_0x002e
        L_0x0012:
            r2 = 34
            r6.append(r2)
            java.lang.String r1 = r7.toString()
            X.9j1 r0 = X.C197039b2.A00
            if (r1 == 0) goto L_0x0024
            X.B0F r0 = r8.A02
            r0.B6q(r6, r1)
        L_0x0024:
            r6.append(r2)
            return
        L_0x0028:
            java.lang.Float r7 = (java.lang.Float) r7
            boolean r0 = r7.isInfinite()
        L_0x002e:
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = "null"
        L_0x0032:
            r6.append(r0)
            return
        L_0x0036:
            java.lang.String r0 = r7.toString()
            goto L_0x0032
        L_0x003b:
            int[] r7 = (int[]) r7
            r0 = 91
            r6.append(r0)
            int r3 = r7.length
            r2 = 0
            r1 = 0
        L_0x0045:
            if (r2 >= r3) goto L_0x00e3
            r0 = r7[r2]
            boolean r1 = X.C165587tf.A1Z(r6, r1)
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r6.append(r0)
            int r2 = r2 + 1
            goto L_0x0045
        L_0x0057:
            short[] r7 = (short[]) r7
            r0 = 91
            r6.append(r0)
            int r3 = r7.length
            r2 = 0
            r1 = 0
        L_0x0061:
            if (r2 >= r3) goto L_0x00e3
            short r0 = r7[r2]
            boolean r1 = X.C165587tf.A1Z(r6, r1)
            java.lang.String r0 = java.lang.Short.toString(r0)
            r6.append(r0)
            int r2 = r2 + 1
            goto L_0x0061
        L_0x0073:
            long[] r7 = (long[]) r7
            r0 = 91
            r6.append(r0)
            int r4 = r7.length
            r3 = 0
            r2 = 0
        L_0x007d:
            if (r3 >= r4) goto L_0x00e3
            r0 = r7[r3]
            boolean r2 = X.C165587tf.A1Z(r6, r2)
            java.lang.String r0 = java.lang.Long.toString(r0)
            r6.append(r0)
            int r3 = r3 + 1
            goto L_0x007d
        L_0x008f:
            float[] r7 = (float[]) r7
            r0 = 91
            r6.append(r0)
            int r3 = r7.length
            r2 = 0
            r1 = 0
        L_0x0099:
            if (r2 >= r3) goto L_0x00e3
            r0 = r7[r2]
            boolean r1 = X.C165587tf.A1Z(r6, r1)
            java.lang.String r0 = java.lang.Float.toString(r0)
            r6.append(r0)
            int r2 = r2 + 1
            goto L_0x0099
        L_0x00ab:
            double[] r7 = (double[]) r7
            r0 = 91
            r6.append(r0)
            int r4 = r7.length
            r3 = 0
            r2 = 0
        L_0x00b5:
            if (r3 >= r4) goto L_0x00e3
            r0 = r7[r3]
            boolean r2 = X.C165587tf.A1Z(r6, r2)
            java.lang.String r0 = java.lang.Double.toString(r0)
            r6.append(r0)
            int r3 = r3 + 1
            goto L_0x00b5
        L_0x00c7:
            boolean[] r7 = (boolean[]) r7
            r0 = 91
            r6.append(r0)
            int r3 = r7.length
            r2 = 0
            r1 = 0
        L_0x00d1:
            if (r2 >= r3) goto L_0x00e3
            boolean r0 = r7[r2]
            boolean r1 = X.C165587tf.A1Z(r6, r1)
            java.lang.String r0 = java.lang.Boolean.toString(r0)
            r6.append(r0)
            int r2 = r2 + 1
            goto L_0x00d1
        L_0x00e3:
            r0 = 93
            r6.append(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9ZY.Bxd(java.lang.Appendable, java.lang.Object, X.9j1):void");
    }
}
