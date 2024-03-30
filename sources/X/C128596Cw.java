package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6Cw  reason: invalid class name and case insensitive filesystem */
public class C128596Cw {
    public Map A00;
    public final AnonymousClass613 A01;
    public final C19700wN A02;
    public final C1031254b A03;
    public final AnonymousClass6ZN A04 = new AnonymousClass6ZN(this);

    public synchronized String A00(String str) {
        String A1A;
        Throwable th;
        Map map = this.A00;
        HashMap hashMap = map;
        if (map == null) {
            HashMap A0J = AnonymousClass001.A0J();
            AnonymousClass1M0 A002 = this.A01.A00.A00();
            try {
                Cursor A09 = A002.A02.A09("SELECT key, value FROM properties", "XPM_GET_ALL_PROPERTIES", (String[]) null);
                A002.close();
                try {
                    if (A09.moveToFirst()) {
                        int columnIndexOrThrow = A09.getColumnIndexOrThrow("key");
                        int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("value");
                        do {
                            A0J.put(A09.getString(columnIndexOrThrow), A09.getString(columnIndexOrThrow2));
                        } while (A09.moveToNext());
                    }
                    A09.close();
                    this.A00 = A0J;
                    hashMap = A0J;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } catch (Throwable th3) {
                th = th3;
                A002.close();
                throw th;
            }
        }
        A1A = C36431kI.A1A(str, hashMap);
        if (A1A == null) {
            return null;
        }
        return A1A;
    }

    public synchronized void A01(String str, String str2) {
        C1495671s B1k;
        C219512b r6 = this.A03.A01;
        C1270366r r0 = this.A01.A00;
        AnonymousClass1M0 A012 = r0.A01();
        try {
            C1495671s B1k2 = A012.B1k();
            try {
                AnonymousClass1M0 A013 = r0.A01();
                try {
                    B1k = A013.B1k();
                    C224114e r3 = A013.A02;
                    r3.A03("properties", "key = ?", "XPM_DELETE_PROPERTY", C90474aD.A1b(str));
                    if (str2 != null) {
                        ContentValues A0E = C36441kJ.A0E();
                        A0E.put("key", str);
                        A0E.put("value", str2);
                        r3.A05("properties", "XPM_SET_PROPERTY", A0E);
                    }
                    B1k.A00();
                    B1k.close();
                    A013.close();
                    AnonymousClass6ZN r2 = this.A04;
                    Object A11 = C36441kJ.A11();
                    Object obj = r6.A02.get();
                    C18740tg.A06(obj);
                    ((HashMap) obj).put(A11, r2);
                    B1k2.A00();
                    Map map = this.A00;
                    if (map != null) {
                        if (str2 != null) {
                            map.put(str, str2);
                        } else {
                            map.remove(str);
                        }
                    }
                    B1k2.close();
                    A012.close();
                } catch (Throwable th) {
                    A013.close();
                    throw th;
                }
            } catch (Throwable th2) {
                B1k2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A012.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
        return;
        throw th;
    }

    public boolean A02(String str) {
        String A002 = A00(str);
        if (A002 != null) {
            String A0y = C90514aH.A0y(A002);
            if (A0y.equals("true")) {
                return true;
            }
            if (!A0y.equals("false")) {
                C19700wN r2 = this.A02;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Malformed boolean: ");
                A0u.append(str);
                r2.A0E("xpm-file-prefetcher-properties", AnonymousClass000.A0p("=", A002, A0u), false);
            }
        }
        return false;
    }

    public C128596Cw(C19700wN r2, C1031254b r3, AnonymousClass613 r4) {
        this.A02 = r2;
        this.A01 = r4;
        this.A03 = r3;
    }
}
