package X;

import android.database.sqlite.SQLiteException;
import android.util.LruCache;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/* renamed from: X.18u  reason: invalid class name and case insensitive filesystem */
public class C235218u {
    public static final Random A06 = new Random();
    public final LruCache A00 = new LruCache(100);
    public final C19700wN A01;
    public final C235018s A02;
    public final C19970wo A03;
    public final AnonymousClass187 A04;
    public final C20810yC A05;

    public static C131106Nt A00(Exception exc, byte[] bArr, int i) {
        int i2;
        int length;
        String str;
        if (exc != null) {
            Log.w("axolotl", exc);
        }
        String str2 = null;
        if (i == 0) {
            if (bArr == null || (length = bArr.length) == 0) {
                Log.w("SignalCoordinator/createDecryptionResult axolotl derived null or empty plaintext from message");
                i2 = -1000;
            } else {
                byte b = bArr[length - 1] & 255;
                if (b == 0) {
                    str = "MessageUtil/removePadding/ axolotl derived plaintext has invalid padding";
                } else if (b >= length) {
                    str = "MessageUtil/removePadding/ axolotl derived entire plaintext as padding";
                } else {
                    int i3 = length - b;
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, 0, bArr2, 0, i3);
                    if (bArr2.length != 0) {
                        return new C131106Nt(bArr2, 0);
                    }
                    i2 = -10000;
                }
                Log.w(str);
                i2 = -10000;
            }
            return new C131106Nt((byte[]) null, i2);
        }
        if (exc != null) {
            str2 = exc.getMessage();
        }
        return new C131106Nt(str2, i);
    }

    public static boolean A01(AnonymousClass8QQ r2, AnonymousClass8QQ r3) {
        AnonymousClass8PY r0 = r2.localFingerprint_;
        if (r0 == null) {
            r0 = AnonymousClass8PY.DEFAULT_INSTANCE;
        }
        byte[] A062 = r0.content_.A06();
        AnonymousClass8PY r02 = r3.localFingerprint_;
        if (r02 == null) {
            r02 = AnonymousClass8PY.DEFAULT_INSTANCE;
        }
        if (MessageDigest.isEqual(A062, r02.content_.A06())) {
            AnonymousClass8PY r03 = r2.localFingerprint_;
            if (r03 == null) {
                r03 = AnonymousClass8PY.DEFAULT_INSTANCE;
            }
            byte[] A063 = r03.identifier_.A06();
            AnonymousClass8PY r04 = r3.localFingerprint_;
            if (r04 == null) {
                r04 = AnonymousClass8PY.DEFAULT_INSTANCE;
            }
            if (MessageDigest.isEqual(A063, r04.identifier_.A06())) {
                AnonymousClass8PY r05 = r2.remoteFingerprint_;
                if (r05 == null) {
                    r05 = AnonymousClass8PY.DEFAULT_INSTANCE;
                }
                byte[] A064 = r05.content_.A06();
                AnonymousClass8PY r06 = r3.remoteFingerprint_;
                if (r06 == null) {
                    r06 = AnonymousClass8PY.DEFAULT_INSTANCE;
                }
                if (MessageDigest.isEqual(A064, r06.content_.A06())) {
                    AnonymousClass8PY r07 = r2.remoteFingerprint_;
                    if (r07 == null) {
                        r07 = AnonymousClass8PY.DEFAULT_INSTANCE;
                    }
                    byte[] A065 = r07.identifier_.A06();
                    AnonymousClass8PY r08 = r3.remoteFingerprint_;
                    if (r08 == null) {
                        r08 = AnonymousClass8PY.DEFAULT_INSTANCE;
                    }
                    if (!MessageDigest.isEqual(A065, r08.identifier_.A06())) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A02(AnonymousClass8QQ r2, AnonymousClass8QQ r3) {
        AnonymousClass8PY r0 = r2.localFingerprint_;
        if (r0 == null) {
            r0 = AnonymousClass8PY.DEFAULT_INSTANCE;
        }
        byte[] A062 = r0.content_.A06();
        AnonymousClass8PY r02 = r3.remoteFingerprint_;
        if (r02 == null) {
            r02 = AnonymousClass8PY.DEFAULT_INSTANCE;
        }
        if (MessageDigest.isEqual(A062, r02.content_.A06())) {
            AnonymousClass8PY r03 = r2.localFingerprint_;
            if (r03 == null) {
                r03 = AnonymousClass8PY.DEFAULT_INSTANCE;
            }
            byte[] A063 = r03.identifier_.A06();
            AnonymousClass8PY r04 = r3.remoteFingerprint_;
            if (r04 == null) {
                r04 = AnonymousClass8PY.DEFAULT_INSTANCE;
            }
            if (MessageDigest.isEqual(A063, r04.identifier_.A06())) {
                AnonymousClass8PY r05 = r2.remoteFingerprint_;
                if (r05 == null) {
                    r05 = AnonymousClass8PY.DEFAULT_INSTANCE;
                }
                byte[] A064 = r05.content_.A06();
                AnonymousClass8PY r06 = r3.localFingerprint_;
                if (r06 == null) {
                    r06 = AnonymousClass8PY.DEFAULT_INSTANCE;
                }
                if (MessageDigest.isEqual(A064, r06.content_.A06())) {
                    AnonymousClass8PY r07 = r2.remoteFingerprint_;
                    if (r07 == null) {
                        r07 = AnonymousClass8PY.DEFAULT_INSTANCE;
                    }
                    byte[] A065 = r07.identifier_.A06();
                    AnonymousClass8PY r08 = r3.localFingerprint_;
                    if (r08 == null) {
                        r08 = AnonymousClass8PY.DEFAULT_INSTANCE;
                    }
                    if (!MessageDigest.isEqual(A065, r08.identifier_.A06())) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static byte[] A03(byte[] bArr) {
        int nextInt = A06.nextInt(16) + 1;
        int length = bArr.length;
        int i = length + nextInt;
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        Arrays.fill(bArr2, length, i, (byte) nextInt);
        return bArr2;
    }

    public AnonymousClass34P A04() {
        try {
            C593533p A042 = this.A02.A02.A04();
            C199299f5 r4 = new C199299f5(A042.A01);
            C118185nT r1 = new C118185nT(A042.A00);
            Log.i("axolotl loading identity key pair");
            byte b = (byte) 5;
            return new AnonymousClass34P(new AnonymousClass66J(r1.A00, b), new AnonymousClass3FZ(new AnonymousClass3IG(r4.A00.A00, b)));
        } catch (AnonymousClass18E unused) {
            throw new SQLiteException("Invalid public key stored in identities table");
        }
    }

    public C202579mF A05(AnonymousClass6EZ r8) {
        C235018s r2 = this.A02;
        return new C202579mF(r2, r2, r2, r2.A05, new C128046Aq(AnonymousClass6R2.A01(r8), r8.A00));
    }

    public void A06() {
        C235018s r7 = this.A02;
        int A042 = r7.A00.A04(C21100yf.A1z);
        int A002 = r7.A03.A00();
        if (A002 >= A042) {
            StringBuilder sb = new StringBuilder();
            sb.append("skipping key generation because already more than ");
            sb.append(A042);
            sb.append(" are unsent");
            Log.i(sb.toString());
            return;
        }
        while (true) {
            A042 -= A002;
            if (A042 > 0) {
                A002 = Math.min(A042, 50);
                int A022 = r7.A02.A02();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("axolotl generating ");
                sb2.append(A002);
                sb2.append(" new prekeys starting from ");
                sb2.append(A022);
                sb2.append(" and recording them in the db");
                Log.i(sb2.toString());
                ArrayList arrayList = new ArrayList();
                LinkedList linkedList = new LinkedList();
                int i = A022 - 1;
                for (int i2 = 0; i2 < A002; i2++) {
                    linkedList.add(new C198539dj(C200529hY.A02(), ((i + i2) % 16777214) + 1));
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    AnonymousClass8QT r0 = ((C198539dj) it.next()).A00;
                    arrayList.add(new C593633q(r0.id_, r0.A0o()));
                }
                r7.A06.A0W(arrayList, ((A022 + A002) % 16777214) + 1);
            } else {
                return;
            }
        }
    }

    public C235218u(C19700wN r3, C235018s r4, C19970wo r5, AnonymousClass187 r6, C20810yC r7) {
        this.A03 = r5;
        this.A05 = r7;
        this.A01 = r3;
        this.A04 = r6;
        this.A02 = r4;
    }
}
