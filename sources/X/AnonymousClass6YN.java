package X;

import android.util.JsonWriter;
import android.util.Pair;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6YN  reason: invalid class name */
public final class AnonymousClass6YN {
    public static final AnonymousClass6YN A00 = new AnonymousClass6YN();

    public static final int A00(C131526Pk r10, AnonymousClass179 r11, C20830yE r12, String str) {
        long j;
        String str2;
        AnonymousClass00C.A0D(str, 0);
        C36341k9.A1E(r11, 2, r12);
        File A0S = C90524aI.A0S(str);
        if (!A0S.exists()) {
            return 1;
        }
        if (r10 == null) {
            return 2;
        }
        long length = A0S.length();
        C128486Cl r5 = r10.A02;
        if (r5 != null) {
            j = r5.A00;
        } else {
            j = r10.A00;
        }
        if (length == j) {
            String A04 = C34191gb.A04(r11, r12, A0S, A0S.length());
            if (A04 == null) {
                C36321k7.A1K(A0S, "gdrive/v2/utils/is-local-same-as-remote/md5-is-null/ ", AnonymousClass000.A0u());
                return 1;
            }
            if (r5 != null) {
                str2 = r5.A03;
            } else {
                str2 = r10.A03;
            }
            if (A04.equals(str2)) {
                return 3;
            }
        }
        return 4;
    }

    public static final C132346Te A01(C33131el r2, C133226Xi r3, String str, String str2) {
        AnonymousClass00C.A0D(str, 1);
        try {
            return (C132346Te) AnonymousClass6UR.A00(new C162687oz(r3, str, 0), r2, str2);
        } catch (C101764yF unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x001b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A04(java.util.Map r9) {
        /*
            r5 = 0
            X.AnonymousClass00C.A0D(r9, r5)
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = "msgstore.db.crypt(\\d+)|msgstore-increment-(\\d+).db.crypt(\\d+)"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r0)
            X.AnonymousClass00C.A08(r3)
            java.util.Iterator r8 = X.AnonymousClass000.A10(r9)
        L_0x001b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0066
            java.lang.String r6 = X.AnonymousClass001.A0C(r8)
            java.lang.String r0 = java.io.File.separator
            X.AnonymousClass00C.A09(r0)
            java.util.List r7 = X.C90504aG.A0v(r6, r0, r5)
            boolean r0 = r7.isEmpty()
            r2 = 1
            if (r0 != 0) goto L_0x0063
            int r0 = r7.size()
            java.util.ListIterator r1 = r7.listIterator(r0)
        L_0x003d:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x0063
            int r0 = X.C36411kG.A0A(r1)
            if (r0 == 0) goto L_0x003d
            java.util.List r0 = X.C36411kG.A14(r7, r1)
        L_0x004d:
            java.lang.String[] r1 = X.C36431kI.A1b(r0)
            int r0 = r1.length
            int r0 = r0 - r2
            r0 = r1[r0]
            boolean r0 = X.C36361kB.A1Z(r0, r3)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r9.get(r6)
            r4.add(r0)
            goto L_0x001b
        L_0x0063:
            X.09w r0 = X.C023409w.A00
            goto L_0x004d
        L_0x0066:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YN.A04(java.util.Map):java.util.ArrayList");
    }

    public static final Map A06(C33131el r8, C132346Te r9, List list) {
        AnonymousClass00C.A0D(list, 2);
        HashMap hashMap = new HashMap(1000);
        String str = null;
        do {
            Pair pair = (Pair) AnonymousClass6UR.A00(new C162677oy(r9, str, 1), r8, "gdrive/v2/load-files");
            if (pair == null) {
                return null;
            }
            str = (String) pair.second;
            Iterator A13 = C90514aH.A13(pair.first);
            while (A13.hasNext()) {
                C131526Pk r3 = (C131526Pk) A13.next();
                String A01 = r3.A01();
                AnonymousClass00C.A08(A01);
                C131526Pk r1 = (C131526Pk) hashMap.put(A01, r3);
                if (r1 != null) {
                    if (A01.equals(r3.A06)) {
                        list.add(r3);
                        String A012 = r1.A01();
                        AnonymousClass00C.A08(A012);
                        hashMap.put(A012, r1);
                    } else {
                        list.add(r1);
                    }
                }
            }
        } while (str != null);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("gdrive/v2/load-files result ");
        C36321k7.A1Y(A0u, hashMap.size());
        return Collections.unmodifiableMap(hashMap);
    }

    public static final boolean A0A(C24461Cn r7, C20810yC r8) {
        boolean A1a = C36341k9.A1a(r8, r7);
        boolean z = C36411kG.A0E(r7.A01).getBoolean("_new_user", false);
        boolean A0E = r8.A0E(6178);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("gdrive/backup/axolotlMode/result1= ");
        A0u.append(z);
        C36321k7.A1X(" & ", A0u, A0E);
        if (z && A0E) {
            return A1a;
        }
        boolean A09 = r7.A09("bg_gpb_eligible_timestamp", 2592000000L);
        boolean A0E2 = r8.A0E(4775);
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("gdrive/backup/axolotlMode/result2= ");
        A0u2.append(A09);
        C36321k7.A1X(" & ", A0u2, A0E2);
        if (!A09 || !A0E2) {
            return false;
        }
        r7.A07(A1a);
        return A1a;
    }

    public static final boolean A0B(AnonymousClass7fU r3, C33131el r4, C133226Xi r5, C131526Pk r6, File file) {
        AnonymousClass00C.A0D(r4, 2);
        C101684y7 r2 = new C101684y7(r3, r4, r5, r6, file);
        StringBuilder A0u = AnonymousClass000.A0u();
        C90464aC.A1A(file, "restore>gdrive/restore/file ", A0u);
        Boolean bool = (Boolean) AnonymousClass6UR.A00(r2, r4, A0u.toString());
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public static final boolean A0C(C33131el r2, C133226Xi r3, int i) {
        AnonymousClass00C.A0D(r2, 1);
        Boolean bool = (Boolean) AnonymousClass6UR.A01(new C101584xx(r3), r2, "gdrive-backup-util/fetch-token", i);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public static final boolean A0D(C131526Pk r7) {
        AnonymousClass00C.A0D(r7, 0);
        for (AnonymousClass5U6 r3 : (AnonymousClass5U6[]) C113115f1.A00.toArray(new AnonymousClass5U6[0])) {
            String str = r7.A06;
            AnonymousClass00C.A07(str);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(".crypt");
            String A10 = C36381kD.A10(A0u, r3.version);
            AnonymousClass00C.A0D(A10, 1);
            if (str.endsWith(A10)) {
                return true;
            }
        }
        String str2 = r7.A06;
        AnonymousClass00C.A07(str2);
        return str2.endsWith(".mcrypt1");
    }

    public static final boolean A0F(C19420v0 r2) {
        AnonymousClass00C.A0D(r2, 0);
        int A0E = r2.A0E();
        if (A0E == 11 || A0E == 31 || A0E == 30 || A0E == 28 || A0E == 29) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A03(java.util.Map r3) {
        /*
            java.io.StringWriter r1 = new java.io.StringWriter
            r1.<init>()
            android.util.JsonWriter r2 = new android.util.JsonWriter
            r2.<init>(r1)
            X.6YN r0 = A00     // Catch:{ all -> 0x0017 }
            r0.A07(r2, r3)     // Catch:{ all -> 0x0017 }
            r2.close()
            java.lang.String r0 = X.C36381kD.A0y(r1)
            return r0
        L_0x0017:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YN.A03(java.util.Map):java.lang.String");
    }

    public static final Map A05(C33131el r6, C132346Te r7) {
        HashMap hashMap = new HashMap(1000);
        String str = null;
        do {
            Pair pair = (Pair) AnonymousClass6UR.A00(new C162677oy(r7, str, 0), r6, "gdrive/v2/load-files");
            if (pair == null) {
                return null;
            }
            str = (String) pair.second;
            Iterator A13 = C90514aH.A13(pair.first);
            while (A13.hasNext()) {
                C131526Pk r1 = (C131526Pk) A13.next();
                String A01 = r1.A01();
                AnonymousClass00C.A08(A01);
                hashMap.put(A01, r1);
            }
        } while (str != null);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("gdrive/v2/load-files result ");
        C36321k7.A1Y(A0u, hashMap.size());
        return Collections.unmodifiableMap(hashMap);
    }

    public static final void A09(AnonymousClass5VQ r2, AnonymousClass7fW r3) {
        int i;
        Log.e("gdrive/backup/exception-during-backup", r2);
        if (r2 instanceof C101884yR) {
            Throwable cause = r2.getCause();
            if (cause instanceof C03930Im) {
                Log.e("gdrive/backup/exception-during-backup/auth-failed/google-play-services-unavailable");
                i = 21;
            } else if (cause instanceof UserRecoverableAuthException) {
                Log.e("gdrive/backup/exception-during-backup/auth-failed/user-recoverable-exception");
                i = 28;
            } else if (cause instanceof SecurityException) {
                Log.e("gdrive/backup/exception-during-backup/auth-failed/security-exception");
                i = 30;
            } else if (cause instanceof NullPointerException) {
                Log.e("gdrive/backup/exception-during-backup/auth-failed/null-pointer-exception");
                i = 31;
            } else {
                Log.e("gdrive/backup/exception-during-backup/auth-failed/unknown-cause", cause);
                i = 11;
            }
        } else if (r2 instanceof C101874yQ) {
            i = 12;
        } else {
            i = 18;
            if (!(r2 instanceof C101764yF)) {
                if (r2 instanceof C101824yL) {
                    i = 15;
                } else {
                    i = 19;
                    if (!(r2 instanceof C101804yJ) && !(r2 instanceof C101774yG)) {
                        if (r2 instanceof C101794yI) {
                            i = 13;
                        } else if (r2 instanceof C101814yK) {
                            i = 16;
                        } else if (r2 instanceof C101864yP) {
                            i = 23;
                        } else {
                            i = 25;
                            if (!(r2 instanceof C101784yH)) {
                                r3.onError(26);
                                Log.e("gdrive/backup/exception-during-backup/unexpected-failure", r2);
                                return;
                            }
                        }
                    }
                }
            }
        }
        r3.onError(i);
    }

    public static final String A02(File file) {
        try {
            return file.getCanonicalPath();
        } catch (IOException e) {
            C36321k7.A1M(file, "gdrive/backup/failed to get canonical path for ", AnonymousClass000.A0u(), e);
            return null;
        }
    }

    private final void A07(JsonWriter jsonWriter, Map map) {
        jsonWriter.beginObject();
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            String A0f = C90494aF.A0f(A11);
            Object value = A11.getValue();
            jsonWriter.name(A0f);
            if (value instanceof Number) {
                jsonWriter.value((Number) value);
            } else if (value instanceof String) {
                jsonWriter.value((String) value);
            } else if (value instanceof Boolean) {
                jsonWriter.value(AnonymousClass000.A1X(value));
            } else if (value instanceof Map) {
                AnonymousClass00C.A0E(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                A07(jsonWriter, (Map) value);
            } else if (value instanceof Set) {
                jsonWriter.beginArray();
                for (Object obj : ((Collection) value).toArray(new Object[0])) {
                    C90494aF.A10(obj);
                    jsonWriter.value((String) obj);
                }
                jsonWriter.endArray();
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Unexpected value type ");
                A0u.append(value);
                A0u.append(" for ");
                throw AnonymousClass000.A0c(A0f, A0u);
            }
        }
        jsonWriter.endObject();
    }

    public static final void A08(C24431Ck r4, Collection collection) {
        String A0c;
        int i;
        C36321k7.A0w(r4, collection);
        C19420v0 r42 = r4.A03;
        if (r42.A2I()) {
            boolean z = true;
            Iterator it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!A0D((C131526Pk) it.next())) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (r42.A2I() && (A0c = r42.A0c()) != null) {
                if (!z) {
                    i = 1;
                    if (r42.A0N(A0c) == 1) {
                        return;
                    }
                } else {
                    i = 2;
                }
                r42.A1b(A0c, i);
            }
        }
    }

    public static final boolean A0E(C19420v0 r6) {
        String A0c = r6.A0c();
        if (A0c == null || A0c.length() == 0 || r6.A0T(A0c) == 0) {
            return false;
        }
        return true;
    }
}
