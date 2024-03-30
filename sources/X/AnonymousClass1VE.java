package X;

import android.content.SharedPreferences;

/* renamed from: X.1VE  reason: invalid class name */
public class AnonymousClass1VE {
    public SharedPreferences A00;
    public final C19970wo A01;
    public final C19890wg A02;
    public final C19770wU A03;

    public static synchronized SharedPreferences A00(AnonymousClass1VE r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A02.A00("instrumentation");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public static String A01(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("/package/");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
        r2 = r1.substring(9);
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashSet A02() {
        /*
            r6 = this;
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            android.content.SharedPreferences r0 = A00(r6)
            java.util.Map r0 = r0.getAll()
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x001a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "/package/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x001a
            r0 = 9
            java.lang.String r2 = r1.substring(r0)
            java.lang.String r0 = "/"
            int r1 = r2.indexOf(r0)
            if (r1 < 0) goto L_0x001a
            r0 = 0
            java.lang.String r0 = r2.substring(r0, r1)
            if (r0 == 0) goto L_0x001a
            r4.add(r0)
            goto L_0x001a
        L_0x0047:
            java.util.Iterator r4 = r4.iterator()
        L_0x004b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x006c
            java.lang.Object r3 = r4.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = "auth/token"
            java.lang.String r2 = A01(r3, r0)
            android.content.SharedPreferences r1 = A00(r6)
            r0 = 0
            java.lang.String r0 = r1.getString(r2, r0)
            if (r0 == 0) goto L_0x004b
            r5.add(r3)
            goto L_0x004b
        L_0x006c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1VE.A02():java.util.HashSet");
    }

    public void A03(C87914Qr r4) {
        if (this.A00 != null) {
            r4.B72(A02());
        } else {
            this.A03.Boy(new C35721j9(this, r4, 31));
        }
    }

    public void A04(String str) {
        String A012 = A01(str, "auth/token");
        String A013 = A01(str, "auth/token_ts");
        String A014 = A01(str, "auth/encryption_key");
        String A015 = A01(str, "metadata/last_active_time");
        String A016 = A01(str, "metadata/delayed_notification_shown");
        String A017 = A01(str, "metadata/last_call_ranking_time");
        A00(this).edit().remove(A012).remove(A013).remove(A014).remove(A015).remove(A016).remove(A017).remove(A01(str, "metadata/last_message_ranking_time")).apply();
    }

    public AnonymousClass1VE(C19970wo r1, C19890wg r2, C19770wU r3) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
    }
}
