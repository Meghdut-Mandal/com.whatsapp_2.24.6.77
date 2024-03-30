package X;

/* renamed from: X.6Nt  reason: invalid class name and case insensitive filesystem */
public class C131106Nt {
    public final int A00;
    public final byte[] A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C131106Nt(java.lang.String r3, int r4) {
        /*
            r2 = this;
            r1 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0015
            r0 = -1005(0xfffffffffffffc13, float:NaN)
            if (r4 != r0) goto L_0x0015
            java.lang.String r0 = "Invalid signature!"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0019
            r4 = -1203(0xfffffffffffffb4d, float:NaN)
        L_0x0015:
            r2.<init>((byte[]) r1, (int) r4)
            return
        L_0x0019:
            java.lang.String r0 = "Unknown type: "
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "No keys for: "
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "Bad key type: "
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "Over 2000 messages into the future!"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003c
            r4 = -1202(0xfffffffffffffb4e, float:NaN)
            goto L_0x0015
        L_0x003c:
            java.lang.String r0 = "Bad Mac!"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0047
            r4 = -1204(0xfffffffffffffb4c, float:NaN)
            goto L_0x0015
        L_0x0047:
            java.lang.String r0 = "No valid sessions."
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0015
            r4 = -1205(0xfffffffffffffb4b, float:NaN)
            goto L_0x0015
        L_0x0052:
            r4 = -1002(0xfffffffffffffc16, float:NaN)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131106Nt.<init>(java.lang.String, int):void");
    }

    public boolean A00() {
        int i = this.A00;
        if (i == -1008 || i == -1002 || i == -1003 || i == -1005 || i == -1203 || i == -1202 || i == -1204 || i == -1205 || i == -1206) {
            return true;
        }
        return false;
    }

    public C131106Nt(byte[] bArr, int i) {
        this.A01 = bArr;
        this.A00 = i;
    }
}
