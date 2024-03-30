package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.1N4  reason: invalid class name */
public class AnonymousClass1N4 {
    public static volatile AnonymousClass1N4 A04;
    public C26641Ky A00 = null;
    public ArrayList A01;
    public boolean A02 = false;
    public final Context A03;

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.close();
        r5.A02 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A01(X.AnonymousClass1N4 r5) {
        /*
            monitor-enter(r5)
            boolean r0 = r5.A02     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x0088
            r1 = 243(0xf3, float:3.4E-43)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x008a }
            r0.<init>(r1)     // Catch:{ all -> 0x008a }
            r5.A01 = r0     // Catch:{ all -> 0x008a }
            android.content.Context r0 = r5.A03     // Catch:{ all -> 0x008a }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ all -> 0x008a }
            r0 = 2132017163(0x7f14000b, float:1.9672597E38)
            java.io.InputStream r2 = r1.openRawResource(r0)     // Catch:{ all -> 0x008a }
            java.lang.String r1 = X.C19430v1.A0B     // Catch:{ all -> 0x008a }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x008a }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x008a }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x008a }
            r3.<init>(r0)     // Catch:{ all -> 0x008a }
        L_0x0027:
            java.lang.String r4 = r3.readLine()     // Catch:{ all -> 0x007e }
            if (r4 == 0) goto L_0x0077
            java.lang.String r0 = "\t"
            java.lang.String[] r2 = android.text.TextUtils.split(r4, r0)     // Catch:{ NumberFormatException -> 0x0061, IllegalArgumentException -> 0x004b }
            if (r2 == 0) goto L_0x0045
            int r1 = r2.length     // Catch:{ NumberFormatException -> 0x0061, IllegalArgumentException -> 0x004b }
            r0 = 12
            if (r1 < r0) goto L_0x0045
            java.util.ArrayList r1 = r5.A01     // Catch:{ NumberFormatException -> 0x0061, IllegalArgumentException -> 0x004b }
            X.3O9 r0 = new X.3O9     // Catch:{ NumberFormatException -> 0x0061, IllegalArgumentException -> 0x004b }
            r0.<init>(r2)     // Catch:{ NumberFormatException -> 0x0061, IllegalArgumentException -> 0x004b }
            r1.add(r0)     // Catch:{ NumberFormatException -> 0x0061, IllegalArgumentException -> 0x004b }
            goto L_0x0027
        L_0x0045:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ NumberFormatException -> 0x0061, IllegalArgumentException -> 0x004b }
            r0.<init>()     // Catch:{ NumberFormatException -> 0x0061, IllegalArgumentException -> 0x004b }
            throw r0     // Catch:{ NumberFormatException -> 0x0061, IllegalArgumentException -> 0x004b }
        L_0x004b:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            r1.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "countries/load/bad-line: "
            r1.append(r0)     // Catch:{ all -> 0x007e }
            r1.append(r4)     // Catch:{ all -> 0x007e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x007e }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x007e }
            goto L_0x0027
        L_0x0061:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            r1.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "countries/load/bad-number: "
            r1.append(r0)     // Catch:{ all -> 0x007e }
            r1.append(r4)     // Catch:{ all -> 0x007e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x007e }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x007e }
            goto L_0x0027
        L_0x0077:
            r3.close()     // Catch:{ all -> 0x008a }
            r0 = 1
            r5.A02 = r0     // Catch:{ all -> 0x008a }
            goto L_0x0088
        L_0x007e:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0083 }
            goto L_0x0087
        L_0x0083:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x008a }
        L_0x0087:
            throw r1     // Catch:{ all -> 0x008a }
        L_0x0088:
            monitor-exit(r5)
            return
        L_0x008a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1N4.A01(X.1N4):void");
    }

    public AnonymousClass3O9 A02(String str) {
        synchronized (this) {
            if (this.A00 == null) {
                try {
                    A01(this);
                    C26641Ky r3 = new C26641Ky(this.A01.size());
                    Iterator it = this.A01.iterator();
                    while (it.hasNext()) {
                        AnonymousClass3O9 r1 = (AnonymousClass3O9) it.next();
                        r3.A03(r1.A02, r1);
                    }
                    this.A00 = r3;
                } catch (IOException unused) {
                    throw new RuntimeException("empty metadata");
                }
            }
        }
        try {
            return (AnonymousClass3O9) this.A00.A01(str);
        } catch (IllegalArgumentException unused2) {
            return null;
        }
    }

    public static AnonymousClass1N4 A00() {
        if (A04 == null) {
            synchronized (AnonymousClass1N4.class) {
                if (A04 == null) {
                    Context context = C221413a.A00;
                    if (context != null) {
                        A04 = new AnonymousClass1N4(context);
                    } else {
                        throw new IllegalStateException("CountryPhoneInfoContext.setApplicationContext() was not initialized!");
                    }
                }
            }
        }
        return A04;
    }

    public AnonymousClass1N4(Context context) {
        this.A03 = context;
    }

    public String A03(int i, String str) {
        int i2;
        String[] strArr;
        A01(this);
        Iterator it = this.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AnonymousClass3O9 r6 = (AnonymousClass3O9) it.next();
            int i3 = r6.A00;
            if (i3 == i) {
                if (i3 == 7 || i3 == 241 || i3 == 998) {
                    int length = str.length();
                    int i4 = 0;
                    while (i2 < length) {
                        String[] strArr2 = r6.A0A;
                        if (strArr2 == null) {
                            break;
                        } else if (AnonymousClass3O9.A00(r6, length - i2) > 0) {
                            int length2 = strArr2.length;
                            int i5 = 0;
                            while (i5 < length2) {
                                if (strArr2[i5].charAt(0) == str.charAt(i2)) {
                                    i4 = i2 + 1;
                                } else {
                                    i5++;
                                }
                            }
                        }
                    }
                } else {
                    i2 = 0;
                    while (i2 < str.length() && (strArr = r6.A0A) != null) {
                        int i6 = 0;
                        boolean z = false;
                        while (true) {
                            if (i6 < strArr.length) {
                                if (z) {
                                    break;
                                }
                                if (strArr[i6].charAt(0) == str.charAt(i2)) {
                                    z = true;
                                }
                                i6++;
                            } else if (!z) {
                            }
                        }
                        i2++;
                    }
                }
                return str.substring(i2);
            }
        }
        return str;
    }

    public String A04(String str) {
        if (!TextUtils.isEmpty(str)) {
            A01(this);
            try {
                int parseInt = Integer.parseInt(str);
                Iterator it = this.A01.iterator();
                while (it.hasNext()) {
                    AnonymousClass3O9 r1 = (AnonymousClass3O9) it.next();
                    if (r1.A00 == parseInt) {
                        return r1.A04;
                    }
                }
            } catch (NumberFormatException e) {
                Log.i("countries/get-tos-region", e);
                return "";
            }
        }
        return "";
    }

    public String A05(String str) {
        int i;
        A01(this);
        int length = str.length();
        if (length != 2) {
            if (length == 3 && !str.equals("999")) {
                Iterator it = this.A01.iterator();
                while (it.hasNext()) {
                    AnonymousClass3O9 r4 = (AnonymousClass3O9) it.next();
                    int[] iArr = r4.A06;
                    if (iArr != null) {
                        int i2 = 0;
                        while (i2 < iArr.length) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(iArr[i2]);
                            sb.append("");
                            if (str.equals(sb.toString())) {
                                i = r4.A00;
                            } else {
                                i2++;
                            }
                        }
                        continue;
                    }
                }
            }
            return null;
        }
        AnonymousClass3O9 A022 = A02(str.toUpperCase(Locale.US));
        if (A022 != null) {
            i = A022.A00;
        }
        return null;
        return Integer.toString(i);
    }
}
