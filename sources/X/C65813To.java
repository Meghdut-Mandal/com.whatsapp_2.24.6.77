package X;

import android.os.Environment;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;

/* renamed from: X.3To  reason: invalid class name and case insensitive filesystem */
public class C65813To {
    public final AnonymousClass3DT A00;
    public final C24341Cb A01;
    public final C19970wo A02;
    public final C19630wG A03;
    public final C24381Cf A04;
    public final AnonymousClass2ZD A05;

    public static File A03(C65813To r1) {
        File A002 = C55722v5.A00(r1.A03.A00, "Cached Voice Notes");
        if (A002 == null) {
            Log.e("draftvoicenotecache/getcachedvoicenotefile/problem creating directory ");
        }
        return A002;
    }

    public Pair A04(AnonymousClass11F r9, AnonymousClass3T1 r10, File file, File file2) {
        File A002;
        FileOutputStream fileOutputStream;
        C18740tg.A07(r9, "Jid cannot be null");
        C18740tg.A07(file, "Voice note file cannot be null");
        C18740tg.A0E(AnonymousClass6YY.A07(file.getAbsolutePath()).equals("opus"), "Invalid file type for voice note file. Use opus");
        if ("mounted".equals(Environment.getExternalStorageState()) && (A002 = A00(r9, this)) != null) {
            File A012 = A01(r9, this);
            if (r10 == null) {
                File A022 = A02(r9, this);
                if (A022 != null && A022.exists()) {
                    A022.delete();
                }
            } else {
                File A023 = A02(r9, this);
                if (A023 == null) {
                    Log.i("draftvoicenotecache/savequotedmessage/quoted message file is null");
                } else {
                    C64933Qa r7 = r10.A1J;
                    try {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append(AnonymousClass143.A03(r7.A00));
                        A0u.append(":;:");
                        A0u.append(r7.A02);
                        A0u.append(":;:");
                        String A0q = AnonymousClass000.A0q(r7.A01, A0u);
                        fileOutputStream = new FileOutputStream(A023);
                        fileOutputStream.write(A0q.getBytes());
                        fileOutputStream.close();
                    } catch (IOException e) {
                        Log.e("draftvoicenotecache/savequotedmessage/ ", e);
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
            C24341Cb r1 = this.A01;
            if (AnonymousClass6YY.A0M(r1, file, A002)) {
                if (!(file2 == null || A012 == null)) {
                    AnonymousClass6YY.A0M(r1, file2, A012);
                }
                return C36441kJ.A0Q(A002, A012);
            }
        }
        return new Pair((Object) null, (Object) null);
        throw th;
    }

    public C602537c A05(AnonymousClass11F r8) {
        C64933Qa r1;
        String str;
        DataInputStream dataInputStream;
        C18740tg.A07(r8, "Jid cannot be null");
        File A002 = A00(r8, this);
        if (A002 == null || !A002.exists()) {
            return null;
        }
        File A012 = A01(r8, this);
        File A022 = A02(r8, this);
        if (A022 != null && A022.exists()) {
            try {
                dataInputStream = new DataInputStream(new FileInputStream(A022));
                byte[] bArr = new byte[((int) A022.length())];
                dataInputStream.readFully(bArr);
                String[] split = new String(bArr).split(":;:");
                r1 = new C64933Qa(C36421kH.A0N(split[0]), split[2], Boolean.valueOf(split[1]).booleanValue());
                dataInputStream.close();
            } catch (FileNotFoundException e) {
                e = e;
                str = "draftvoicenotecache/getquotedmessagekey/ ";
            } catch (IOException e2) {
                e = e2;
                str = "draftvoicenotecache/getquotedmessagekey/";
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            return new C602537c(r1, A002, A012);
        }
        r1 = null;
        return new C602537c(r1, A002, A012);
        throw th;
        Log.e(str, e);
        r1 = null;
        return new C602537c(r1, A002, A012);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (X.AnonymousClass6YY.A0P(r0) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.AnonymousClass11F r6) {
        /*
            r5 = this;
            java.lang.String r0 = "Chat jid cannot be null"
            X.C18740tg.A07(r6, r0)
            java.io.File r0 = A00(r6, r5)
            java.io.File r1 = A01(r6, r5)
            if (r0 == 0) goto L_0x0016
            boolean r0 = X.AnonymousClass6YY.A0P(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            if (r1 == 0) goto L_0x001c
            X.AnonymousClass6YY.A0P(r1)
        L_0x001c:
            java.io.File r1 = A02(r6, r5)
            if (r1 == 0) goto L_0x002b
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x002b
            r1.delete()
        L_0x002b:
            if (r2 == 0) goto L_0x0058
            X.2ZD r0 = r5.A05
            java.util.Iterator r4 = X.C36361kB.A0s(r0)
        L_0x0033:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0058
            java.lang.Object r3 = r4.next()
            X.31N r3 = (X.AnonymousClass31N) r3
            X.3fk r1 = r3.A00
            X.11F r0 = r1.A45
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0033
            X.17Y r2 = X.C70803fk.A09(r1)
            r1 = 38
            X.3wT r0 = new X.3wT
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.A0H(r0)
            goto L_0x0033
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65813To.A06(X.11F):void");
    }

    public C65813To(C24341Cb r3, C19970wo r4, C19630wG r5, C24381Cf r6, AnonymousClass2ZD r7, AnonymousClass3DT r8) {
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = r8;
        this.A01 = r3;
        this.A04 = r6;
        this.A05 = r7;
        r6.registerObserver(new AnonymousClass4YE(this, 20));
    }

    public static File A00(AnonymousClass11F r5, C65813To r6) {
        File A032 = A03(r6);
        if (A032 == null) {
            return null;
        }
        Locale locale = Locale.US;
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = r5.getRawString();
        A0M[1] = "opus";
        return C36441kJ.A0w(A032, String.format(locale, "%s.%s", A0M));
    }

    public static File A01(AnonymousClass11F r5, C65813To r6) {
        File A032 = A03(r6);
        if (A032 == null) {
            return null;
        }
        Locale locale = Locale.US;
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = r5.getRawString();
        A0M[1] = "viz";
        return C36441kJ.A0w(A032, String.format(locale, "%s.%s", A0M));
    }

    public static File A02(AnonymousClass11F r5, C65813To r6) {
        File A032 = A03(r6);
        if (A032 == null) {
            Log.i("draftvoicenotecache/getquotedmessagefile/cached voice note directory is null");
            return null;
        }
        Locale locale = Locale.US;
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = r5.getRawString();
        return C36441kJ.A0w(A032, String.format(locale, "%s.txt", A0L));
    }
}
