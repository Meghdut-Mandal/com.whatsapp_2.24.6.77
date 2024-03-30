package X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: X.6MU  reason: invalid class name */
public class AnonymousClass6MU {
    public final String A00;
    public final Map A01;

    public void A00(C125255za r3) {
        if (r3 != null) {
            this.A01.put(r3.A01(), r3);
        }
    }

    public AnonymousClass6MU(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A00 = str;
            this.A01 = AnonymousClass001.A0J();
            return;
        }
        throw AnonymousClass001.A08("feature should always be set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r6 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (r6.A04 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r4 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r4.A01 != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        r1 = new X.C98474rU(r3, r2, "file", (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r6 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r6.A04 == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        if (r4 == null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        if (r4.A01 == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        r4 = r5;
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007d, code lost:
        r5 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6MU() {
        /*
            r10 = this;
            r10.<init>()
            java.lang.String r0 = "wa_cask_ard_temp_store"
            r10.A00 = r0
            java.util.HashMap r9 = X.AnonymousClass001.A0J()
            r10.A01 = r9
            java.util.Map r8 = java.util.Collections.emptyMap()
            java.lang.String r0 = "user_scope"
            java.lang.Object r7 = r8.remove(r0)
            X.4rW r7 = (X.C98494rW) r7
            java.lang.String r0 = "max_size"
            java.lang.Object r6 = r8.remove(r0)
            X.4rX r6 = (X.C98504rX) r6
            r5 = 0
            if (r6 != 0) goto L_0x0025
            r6 = r5
        L_0x0025:
            java.lang.String r0 = "stale_removal"
            java.lang.Object r4 = r8.remove(r0)
            X.4rV r4 = (X.C98484rV) r4
            if (r4 != 0) goto L_0x0030
            r4 = r5
        L_0x0030:
            if (r6 == 0) goto L_0x0036
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x003e
        L_0x0036:
            if (r4 == 0) goto L_0x0062
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0062
            if (r6 == 0) goto L_0x0043
        L_0x003e:
            boolean r0 = r6.A04
            r3 = r6
            if (r0 != 0) goto L_0x0044
        L_0x0043:
            r3 = r5
        L_0x0044:
            if (r4 == 0) goto L_0x004b
            boolean r0 = r4.A01
            r2 = r4
            if (r0 != 0) goto L_0x004c
        L_0x004b:
            r2 = r5
        L_0x004c:
            java.lang.String r0 = "file"
            X.4rU r1 = new X.4rU
            r1.<init>(r3, r2, r0, r5)
            if (r6 == 0) goto L_0x005a
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x005a
            r6 = r5
        L_0x005a:
            if (r4 == 0) goto L_0x007d
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x007d
        L_0x0060:
            r4 = r5
            r5 = r1
        L_0x0062:
            java.lang.String r0 = "version"
            java.lang.Object r0 = r8.remove(r0)
            X.5za r0 = (X.C125255za) r0
            r10.A00(r7)
            r10.A00(r5)
            r10.A00(r6)
            r10.A00(r4)
            r10.A00(r0)
            r9.putAll(r8)
            return
        L_0x007d:
            r5 = r4
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MU.<init>():void");
    }
}
