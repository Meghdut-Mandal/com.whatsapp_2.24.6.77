package X;

/* renamed from: X.5Y6  reason: invalid class name */
public abstract class AnonymousClass5Y6 {
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r6.equals("full") != false) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0011 A[SYNTHETIC, Splitter:B:8:0x0011] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, long r9) {
        /*
            java.lang.String r1 = "DatetimeTextProviderUtils"
            if (r6 == 0) goto L_0x000e
            int r4 = X.AnonymousClass6Y7.A05(r6)     // Catch:{ 5R5 -> 0x0009 }
            goto L_0x000f
        L_0x0009:
            java.lang.String r0 = "Error while parsing DateTime format"
            X.AnonymousClass6RS.A01(r1, r0)
        L_0x000e:
            r4 = 2
        L_0x000f:
            if (r7 == 0) goto L_0x001b
            int r3 = X.AnonymousClass6Y7.A05(r7)     // Catch:{ 5R5 -> 0x0016 }
            goto L_0x001c
        L_0x0016:
            java.lang.String r0 = "Error while parsing Time format"
            X.AnonymousClass6RS.A01(r1, r0)
        L_0x001b:
            r3 = r4
        L_0x001c:
            if (r6 != 0) goto L_0x0020
            java.lang.String r6 = "medium"
        L_0x0020:
            int r1 = r5.hashCode()
            r2 = 2
            r0 = -1
            switch(r1) {
                case 3076014: goto L_0x0048;
                case 3560141: goto L_0x0041;
                case 1793702779: goto L_0x003a;
                default: goto L_0x0029;
            }
        L_0x0029:
            switch(r0) {
                case 0: goto L_0x0054;
                case 1: goto L_0x008e;
                case 2: goto L_0x004f;
                default: goto L_0x002c;
            }
        L_0x002c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown dateformat type: "
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r5, r1)
            throw r0
        L_0x003a:
            java.lang.String r0 = "datetime"
            short r0 = X.C90514aH.A1C(r0, r5)
            goto L_0x0029
        L_0x0041:
            java.lang.String r0 = "time"
            short r0 = X.C90514aH.A1B(r0, r5)
            goto L_0x0029
        L_0x0048:
            java.lang.String r0 = "date"
            short r0 = X.C90504aG.A0y(r0, r5)
            goto L_0x0029
        L_0x004f:
            java.text.DateFormat r2 = java.text.DateFormat.getDateTimeInstance(r4, r3)
            goto L_0x0092
        L_0x0054:
            java.lang.String r0 = "short"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "medium"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "long"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "full"
            boolean r1 = r6.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0076
        L_0x0075:
            r0 = 1
        L_0x0076:
            if (r0 == 0) goto L_0x0086
            int r0 = X.AnonymousClass6Y7.A05(r6)     // Catch:{ 5R5 -> 0x0081 }
            java.text.DateFormat r2 = java.text.DateFormat.getDateInstance(r0)     // Catch:{ 5R5 -> 0x0081 }
            goto L_0x0092
        L_0x0081:
            java.text.DateFormat r2 = java.text.DateFormat.getDateInstance(r2)
            goto L_0x0092
        L_0x0086:
            java.util.Locale r0 = java.util.Locale.US
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            r2.<init>(r6, r0)
            goto L_0x0092
        L_0x008e:
            java.text.DateFormat r2 = java.text.DateFormat.getTimeInstance(r3)
        L_0x0092:
            if (r8 != 0) goto L_0x00a0
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.TimeZone r0 = r0.getTimeZone()
            java.lang.String r8 = r0.getID()
        L_0x00a0:
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r8)
            r2.setTimeZone(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r0
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            java.lang.String r0 = r2.format(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Y6.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):java.lang.String");
    }
}
