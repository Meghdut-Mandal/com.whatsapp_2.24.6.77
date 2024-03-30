package X;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.util.Map;

/* renamed from: X.0zv  reason: invalid class name and case insensitive filesystem */
public class C21860zv {
    public static final int A07 = (C21870zw.A00.getBytes().length + 1);
    public static final byte[] A08 = {0, 10};
    public AnonymousClass106 A00;
    public MappedByteBuffer A01;
    public Map A02;
    public final C19930wk A03;
    public volatile File A04;
    public volatile String A05 = "unknown";
    public volatile boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x010e, code lost:
        if (r8.isEmpty() != false) goto L_0x0110;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C121535tI A00(java.io.File r16) {
        /*
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x0038 }
            r1 = r16
            r0.<init>(r1)     // Catch:{ IOException -> 0x0038 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0038 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0038 }
            r2.readLine()     // Catch:{ all -> 0x002e }
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x002e }
        L_0x0018:
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = "\u0000"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x002a
            r8.addFirst(r1)     // Catch:{ all -> 0x002e }
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x002e }
            goto L_0x0018
        L_0x002a:
            r2.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x0038
        L_0x002e:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0033 }
            goto L_0x0037
        L_0x0033:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0038 }
        L_0x0037:
            throw r1     // Catch:{ IOException -> 0x0038 }
        L_0x0038:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.util.Iterator r16 = r8.iterator()
            r15 = 0
            r4 = 0
            r11 = r4
            r6 = r4
            r3 = r4
            r14 = 0
        L_0x0047:
            boolean r0 = r16.hasNext()
            java.lang.String r2 = "Calling"
            java.lang.String r7 = "App"
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r13 = r16.next()
            java.lang.String r13 = (java.lang.String) r13
            r12 = 1
            if (r4 != 0) goto L_0x0063
            java.lang.String r0 = "AppInit End"
            boolean r0 = X.C1901797e.A00(r13, r0)
            if (r0 == 0) goto L_0x0063
            r15 = 1
        L_0x0063:
            java.lang.String r0 = "Calling End"
            boolean r0 = X.C1901797e.A00(r13, r0)
            if (r0 == 0) goto L_0x0075
            if (r4 != 0) goto L_0x0074
            boolean r0 = r7.equals(r11)
            if (r0 == 0) goto L_0x0074
            r4 = r11
        L_0x0074:
            r14 = 1
        L_0x0075:
            java.lang.String r0 = "Calling Resume"
            boolean r0 = X.C1901797e.A00(r13, r0)
            if (r0 == 0) goto L_0x0085
            if (r6 != 0) goto L_0x0085
            r0 = r14 ^ 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
        L_0x0085:
            if (r4 != 0) goto L_0x00cc
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            r10 = 0
            if (r0 != 0) goto L_0x00bf
            java.lang.String r0 = " backgrounded"
            boolean r0 = r13.endsWith(r0)
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = " Resume"
            boolean r0 = r13.endsWith(r0)
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = " visible"
            boolean r0 = r13.endsWith(r0)
            if (r0 == 0) goto L_0x00bf
        L_0x00a6:
            java.lang.String r9 = r13.trim()
            r1 = 2
            java.lang.String r0 = " "
            java.lang.String[] r9 = r9.split(r0, r1)
            int r0 = r9.length
            if (r0 <= r12) goto L_0x00bf
            r1 = 0
            r0 = r9[r1]
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00bf
            r10 = r9[r1]
        L_0x00bf:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x00cc
            boolean r0 = r7.equals(r10)
            if (r0 == 0) goto L_0x00d6
            r11 = r10
        L_0x00cc:
            r5.append(r13)
            java.lang.String r0 = ":"
            r5.append(r0)
            goto L_0x0047
        L_0x00d6:
            boolean r0 = r7.equals(r11)
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r2.equals(r10)
            if (r0 != 0) goto L_0x00e3
            r10 = r11
        L_0x00e3:
            r4 = r10
            goto L_0x00cc
        L_0x00e5:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            goto L_0x00e3
        L_0x00ea:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x00f7
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x00f7
            r4 = r11
        L_0x00f7:
            boolean r0 = r7.equals(r11)
            r1 = 2
            if (r0 == 0) goto L_0x0102
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
        L_0x0102:
            java.lang.String r0 = "AppInit"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x012f
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0115
        L_0x0110:
            r0 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x0115:
            boolean r0 = r7.equals(r4)
            if (r0 == 0) goto L_0x012d
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x012d
        L_0x0123:
            java.lang.String r1 = r5.toString()
            X.5tI r0 = new X.5tI
            r0.<init>(r3, r1, r2)
            return r0
        L_0x012d:
            r2 = r4
            goto L_0x0123
        L_0x012f:
            if (r15 == 0) goto L_0x0110
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = r7
            goto L_0x0115
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21860zv.A00(java.io.File):X.5tI");
    }

    public Map A01() {
        BufferedReader bufferedReader;
        if (!this.A06) {
            return new AnonymousClass008();
        }
        Map map = this.A02;
        if (map != null) {
            return map;
        }
        AnonymousClass008 r5 = new AnonymousClass008(5);
        for (int i = 0; i < 5; i++) {
            String valueOf = String.valueOf(i);
            if (!valueOf.equals(this.A05)) {
                File file = new File(this.A04, valueOf);
                if (file.exists()) {
                    try {
                        bufferedReader = new BufferedReader(new FileReader(file));
                        r5.put(bufferedReader.readLine(), file);
                        bufferedReader.close();
                    } catch (IOException unused) {
                        continue;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    continue;
                }
            }
        }
        this.A02 = r5;
        return r5;
        throw th;
    }

    public void A02(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        this.A03.execute(new C35481il(8, sb.toString(), this));
    }

    public C21860zv(C19770wU r3) {
        this.A03 = new C19930wk(r3, true);
    }
}
