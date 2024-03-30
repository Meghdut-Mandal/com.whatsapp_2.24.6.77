package X;

/* renamed from: X.5VJ  reason: invalid class name */
public class AnonymousClass5VJ extends Exception {
    public int a;
    public String b;

    public AnonymousClass5VJ() {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5VJ(java.lang.Integer r3) {
        /*
            r2 = this;
            int r0 = r3.intValue()
            switch(r0) {
                case 0: goto L_0x003d;
                case 1: goto L_0x003a;
                case 2: goto L_0x0037;
                case 3: goto L_0x0034;
                case 4: goto L_0x0031;
                case 5: goto L_0x002e;
                case 6: goto L_0x002b;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.String r1 = "Trust is not valid"
        L_0x0009:
            r2.<init>(r1)
            switch(r0) {
                case 0: goto L_0x0028;
                case 1: goto L_0x0025;
                case 2: goto L_0x0022;
                case 3: goto L_0x001f;
                case 4: goto L_0x001c;
                case 5: goto L_0x0019;
                case 6: goto L_0x0016;
                default: goto L_0x000f;
            }
        L_0x000f:
            r0 = 1008(0x3f0, float:1.413E-42)
        L_0x0011:
            r2.a = r0
            r2.b = r1
            return
        L_0x0016:
            r0 = 1007(0x3ef, float:1.411E-42)
            goto L_0x0011
        L_0x0019:
            r0 = 1006(0x3ee, float:1.41E-42)
            goto L_0x0011
        L_0x001c:
            r0 = 1005(0x3ed, float:1.408E-42)
            goto L_0x0011
        L_0x001f:
            r0 = 1004(0x3ec, float:1.407E-42)
            goto L_0x0011
        L_0x0022:
            r0 = 1003(0x3eb, float:1.406E-42)
            goto L_0x0011
        L_0x0025:
            r0 = 1002(0x3ea, float:1.404E-42)
            goto L_0x0011
        L_0x0028:
            r0 = 1001(0x3e9, float:1.403E-42)
            goto L_0x0011
        L_0x002b:
            java.lang.String r1 = "Unknown error occurred."
            goto L_0x0009
        L_0x002e:
            java.lang.String r1 = "Keys are not valid. Please contact your system administrator UPI support team"
            goto L_0x0009
        L_0x0031:
            java.lang.String r1 = "XML File is not found or cannot be read."
            goto L_0x0009
        L_0x0034:
            java.lang.String r1 = "XML Parser configuration error.Keys.xml may not be formatted correctly."
            goto L_0x0009
        L_0x0037:
            java.lang.String r1 = "Public key file not found please contact your system administrator UPI support team"
            goto L_0x0009
        L_0x003a:
            java.lang.String r1 = "Your organization key is invalid. Please contact your system administrator or UPI support team."
            goto L_0x0009
        L_0x003d:
            java.lang.String r1 = "Your organization key is empty. Please provide a organization key."
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5VJ.<init>(java.lang.Integer):void");
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error ");
        A0u.append(this.a);
        A0u.append(" : ");
        return AnonymousClass000.A0q(this.b, A0u);
    }
}
