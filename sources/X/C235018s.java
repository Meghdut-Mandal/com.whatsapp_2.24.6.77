package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

@Deprecated
/* renamed from: X.18s  reason: invalid class name and case insensitive filesystem */
public class C235018s {
    public final C21100yf A00;
    public final C234518n A01;
    public final C234318l A02;
    public final C234618o A03;
    public final C234218k A04;
    public final C235118t A05;
    public final AnonymousClass189 A06;
    public final C233618e A07;

    public C192739Ij A00() {
        try {
            C593533p A042 = this.A02.A04();
            C199299f5 r2 = new C199299f5(A042.A01);
            C118185nT r1 = new C118185nT(A042.A00);
            Log.i("axolotl loading identity key pair");
            return new C192739Ij(r2, r1);
        } catch (AnonymousClass18E unused) {
            throw new SQLiteException("Invalid public key stored in identities table");
        }
    }

    public C198809eE A01(C128046Aq r3) {
        try {
            return new C198809eE(this.A06.A0D(AnonymousClass6R2.A00(r3)).A00());
        } catch (IOException unused) {
            throw new AssertionError("serialize/deserialize failed from Session object");
        }
    }

    public void A02(C199299f5 r4, C128046Aq r5) {
        try {
            this.A06.A0Q(new AnonymousClass3FZ(C133256Xm.A01(r4.A00.A00())), AnonymousClass6R2.A00(r5));
        } catch (AnonymousClass110 unused) {
            throw new AssertionError("Conversion between ECPublicKey and CurvePublicKey should never fail");
        }
    }

    public void A03(C128046Aq r10, C198809eE r11) {
        try {
            if (r11.A01.A00.aliceBaseKey_.A06().length != 0) {
                AnonymousClass189 r8 = this.A06;
                AnonymousClass6EZ A002 = AnonymousClass6R2.A00(r10);
                LinkedList linkedList = new LinkedList();
                Iterator it = r11.A00.iterator();
                while (it.hasNext()) {
                    linkedList.add(((C202719mV) it.next()).A00);
                }
                C172218Mz r2 = (C172218Mz) AnonymousClass8PZ.DEFAULT_INSTANCE.A0p();
                AnonymousClass8S2 r0 = r11.A01.A00;
                r2.A0S();
                AnonymousClass8PZ r1 = (AnonymousClass8PZ) r2.A00;
                r0.getClass();
                r1.currentSession_ = r0;
                r1.bitField0_ |= 1;
                r2.A0U(linkedList);
                byte[] A0o = r2.A0R().A0o();
                boolean A012 = C20800yB.A01(C21000yV.A02, r8.A0N, 4009);
                AnonymousClass1M0 A042 = r8.A0L.A04();
                if (A012) {
                    C1495671s B1k = A042.B1k();
                    synchronized (r8.A0G) {
                        try {
                            r8.A0B.A03(A002, A0o);
                            A042.B5o(new C35631j0(r8, A002, A0o, 0));
                            B1k.A00();
                            B1k.close();
                            A042.close();
                        } catch (Throwable th) {
                            B1k.close();
                            A042.close();
                            throw th;
                        }
                    }
                    return;
                }
                try {
                    C1495671s B1k2 = A042.B1k();
                    try {
                        C233218a r3 = r8.A0G;
                        synchronized (r3) {
                            try {
                                r8.A0B.A03(A002, A0o);
                                r3.A03(new C198789eC(A0o), A002);
                                B1k2.A00();
                            } catch (IOException e) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("axolotl storeSession for ");
                                sb.append(A002);
                                sb.append(" failed to update");
                                Log.e(sb.toString(), e);
                            }
                        }
                        B1k2.close();
                        A042.close();
                    } catch (Throwable th2) {
                        B1k2.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    try {
                        A042.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } else {
                throw new IOException("Alice base key missing from session");
            }
        } catch (IOException e2) {
            throw new IllegalArgumentException("Cannot store invalid session", e2);
        }
    }

    public boolean A04() {
        Cursor A09;
        AnonymousClass1M0 A032 = this.A03.A01.get();
        try {
            A09 = A032.A02.A09("SELECT COUNT(*) as count FROM prekeys WHERE sent_to_server = 0 AND direct_distribution = 0", "SignalPreKeyStore/hasUnsentPreKeys", (String[]) null);
            if (A09.moveToNext()) {
                boolean z = false;
                if (A09.getInt(A09.getColumnIndexOrThrow("count")) != 0) {
                    z = true;
                }
                A09.close();
                A032.close();
                StringBuilder sb = new StringBuilder();
                sb.append("axolotl has unsent prekeys: ");
                sb.append(z);
                Log.i(sb.toString());
                return z;
            }
            throw new SQLiteException("Unable to count unsent entries in prekeys table");
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C235018s(C21100yf r2, C234518n r3, C234318l r4, C234618o r5, C234218k r6, C233618e r7, C234718p r8, AnonymousClass189 r9) {
        this.A00 = r2;
        this.A06 = r9;
        this.A07 = r7;
        this.A04 = r6;
        this.A05 = new C235118t(r8);
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
    }
}
