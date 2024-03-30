package X;

/* renamed from: X.8ro  reason: invalid class name and case insensitive filesystem */
public class C184048ro extends C118095nK {
    public String A00;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        r4 = X.C203399nx.A0Q(r6, r0);
        r3 = java.lang.String.class;
        r2 = X.C90474aD.A0Y();
        r0 = 100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        r4 = X.C203399nx.A0Q(r6, r0);
        r3 = java.lang.String.class;
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00aa, code lost:
        r4 = new java.lang.String[]{r0};
        r3 = java.lang.String.class;
        r0 = -9007199254740991L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b5, code lost:
        r2 = java.lang.Long.valueOf(r0);
        r0 = 9007199254740991L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r5.A00 = (java.lang.String) X.C203379ns.A04(r6, r3, r2, java.lang.Long.valueOf(r0), r4);
        r5.A00 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C184048ro(X.C203399nx r6, int r7) {
        /*
            r5 = this;
            switch(r7) {
                case 0: goto L_0x0023;
                case 1: goto L_0x0029;
                case 2: goto L_0x002f;
                case 3: goto L_0x0035;
                case 4: goto L_0x003b;
                case 5: goto L_0x0041;
                case 6: goto L_0x0053;
                case 7: goto L_0x0061;
                case 8: goto L_0x0073;
                case 9: goto L_0x008a;
                case 10: goto L_0x0095;
                case 11: goto L_0x00a0;
                default: goto L_0x0003;
            }
        L_0x0003:
            r5.<init>()
            java.lang.String r0 = "display_name"
            java.lang.String[] r4 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Long r2 = X.C90474aD.A0Y()
            r0 = 128(0x80, double:6.32E-322)
        L_0x0014:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = X.C203379ns.A04(r6, r3, r2, r0, r4)
            java.lang.String r0 = (java.lang.String) r0
            r5.A00 = r0
            r5.A00 = r6
            return
        L_0x0023:
            r5.<init>()
            java.lang.String r0 = "commerce_url"
            goto L_0x0058
        L_0x0029:
            r5.<init>()
            java.lang.String r0 = "reject_reason"
            goto L_0x0058
        L_0x002f:
            r5.<init>()
            java.lang.String r0 = "url"
            goto L_0x0058
        L_0x0035:
            r5.<init>()
            java.lang.String r0 = "end_date"
            goto L_0x0046
        L_0x003b:
            r5.<init>()
            java.lang.String r0 = "start_date"
            goto L_0x0046
        L_0x0041:
            r5.<init>()
            java.lang.String r0 = "product_id"
        L_0x0046:
            java.lang.String[] r4 = X.C203399nx.A0Q(r6, r0)
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Long r2 = X.C90474aD.A0Y()
            r0 = 100
            goto L_0x0014
        L_0x0053:
            r5.<init>()
            java.lang.String r0 = "description"
        L_0x0058:
            java.lang.String[] r4 = X.C203399nx.A0Q(r6, r0)
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0 = 1
            goto L_0x00b5
        L_0x0061:
            r5.<init>()
            java.lang.String r0 = "lowest_price"
            java.lang.String[] r4 = X.C203399nx.A0Q(r6, r0)
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Long r2 = X.C90474aD.A0Y()
            r0 = 20
            goto L_0x0014
        L_0x0073:
            r5.<init>()
            java.lang.String r0 = "item"
            X.C203399nx.A0A(r6, r0)
            java.lang.String r0 = "hash"
            java.lang.String[] r4 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Long r2 = X.C90474aD.A0Y()
            r0 = 256(0x100, double:1.265E-321)
            goto L_0x0014
        L_0x008a:
            r5.<init>()
            java.lang.String r0 = "header"
            X.C203399nx.A0A(r6, r0)
            java.lang.String r0 = "title"
            goto L_0x00aa
        L_0x0095:
            r5.<init>()
            java.lang.String r0 = "trigger"
            X.C203399nx.A0A(r6, r0)
            java.lang.String r0 = "name"
            goto L_0x00aa
        L_0x00a0:
            r5.<init>()
            java.lang.String r0 = "l2checkout"
            X.C203399nx.A0A(r6, r0)
            java.lang.String r0 = "merchant_public_key"
        L_0x00aa:
            java.lang.String[] r4 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
        L_0x00b5:
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r0 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C184048ro.<init>(X.9nx, int):void");
    }
}
