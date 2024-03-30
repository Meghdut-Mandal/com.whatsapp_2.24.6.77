package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteFullException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1YR  reason: invalid class name */
public class AnonymousClass1YR {
    public final C19970wo A00;
    public final AnonymousClass1A3 A01;
    public final AnonymousClass163 A02;
    public final AnonymousClass176 A03;
    public final AnonymousClass12T A04;
    public final C220612s A05;
    public final AnonymousClass12P A06;
    public final AnonymousClass17T A07;
    public final AnonymousClass1A1 A08;
    public final Map A09;
    public final AtomicBoolean A0A;

    public int A01(AnonymousClass11F r4) {
        int i = 0;
        if (r4 != null) {
            Iterator it = A02().iterator();
            while (it.hasNext()) {
                if (r4.equals(((AnonymousClass3T1) it.next()).A1J.A00)) {
                    i++;
                }
            }
        }
        return i;
    }

    private void A00() {
        Cursor A092;
        AtomicBoolean atomicBoolean = this.A0A;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                ArrayList arrayList = new ArrayList();
                C224214g r7 = new C224214g(false);
                r7.A04("unsentmsgstore/unsendmessages");
                long A022 = this.A07.A02(C19970wo.A00(this.A00) - 172800000);
                try {
                    AnonymousClass1M0 A042 = this.A06.get();
                    try {
                        A092 = A042.A02.A09(AnonymousClass2xD.A0M, "UNSENT_MESSAGES_SQL", new String[]{String.valueOf(A022)});
                        int columnIndexOrThrow = A092.getColumnIndexOrThrow("chat_row_id");
                        while (A092.moveToNext()) {
                            AnonymousClass11F A0A2 = this.A02.A0A((long) A092.getInt(columnIndexOrThrow));
                            if (A0A2 == null) {
                                Log.w("unsentmsgstore/unsent/jid is null!");
                            } else {
                                AnonymousClass3T1 A012 = this.A08.A01(A092, A0A2);
                                if (A012 == null) {
                                    Log.w("unsentmsgstore/unsent/can't read message from cursor.");
                                } else {
                                    int i = A012.A1I;
                                    if (!(i == 8 || i == 10 || i == 7)) {
                                        int i2 = A012.A0D;
                                        if (i2 != 7 || !AnonymousClass143.A0G(A012.A1J.A00)) {
                                            if (!A012.A10 || (A0A2 instanceof C177618e5)) {
                                                StringBuilder sb = new StringBuilder();
                                                sb.append("unsentmsgstore/unsent/add key=");
                                                sb.append(A012.A1J.A01);
                                                sb.append(" type=");
                                                sb.append(i);
                                                sb.append(" status=");
                                                sb.append(i2);
                                                Log.i(sb.toString());
                                                arrayList.add(A012);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        A092.close();
                        A042.close();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("unsentmsgstore/unsent ");
                        sb2.append(arrayList.size());
                        sb2.append(" | time spent:");
                        sb2.append(r7.A01());
                        Log.i(sb2.toString());
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            AnonymousClass3T1 r2 = (AnonymousClass3T1) it.next();
                            this.A09.put(r2.A1J, r2);
                        }
                        if (!atomicBoolean.compareAndSet(false, true)) {
                            Log.e("unsent messages cache initialization failed to change the related flag");
                        }
                    } catch (Throwable th) {
                        A042.close();
                        throw th;
                    }
                } catch (IllegalStateException e) {
                    Log.i("unsentmsgstore/unsent/IllegalStateException ", e);
                } catch (SQLiteDatabaseCorruptException e2) {
                    Log.e((Throwable) e2);
                    this.A05.A03();
                } catch (SQLiteFullException e3) {
                    this.A04.A00(0);
                    throw e3;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
        return;
        throw th;
    }

    public ArrayList A02() {
        long A002 = C19970wo.A00(this.A00);
        if (!this.A0A.get()) {
            A00();
        }
        Map map = this.A03.A02;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((AnonymousClass3T1) ((Map.Entry) it.next()).getValue()).A0I + 86400000 < A002) {
                it.remove();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore/unsendmessages/cached:");
        sb.append(map.size());
        Log.i(sb.toString());
        ArrayList arrayList = new ArrayList(map.size());
        for (Object add : map.values()) {
            arrayList.add(add);
        }
        Collections.sort(arrayList, C81703xR.A00);
        return arrayList;
    }

    public boolean A03() {
        if (!this.A0A.get()) {
            A00();
        }
        AnonymousClass176 r1 = this.A03;
        long A002 = C19970wo.A00(this.A00);
        Map map = r1.A02;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((AnonymousClass3T1) ((Map.Entry) it.next()).getValue()).A0I + 86400000 < A002) {
                it.remove();
            }
        }
        return !map.isEmpty();
    }

    public AnonymousClass1YR(C19970wo r2, AnonymousClass1A3 r3, AnonymousClass163 r4, AnonymousClass176 r5, AnonymousClass12T r6, C220612s r7, AnonymousClass12P r8, AnonymousClass17T r9, AnonymousClass1A1 r10) {
        this.A00 = r2;
        this.A02 = r4;
        this.A07 = r9;
        this.A08 = r10;
        this.A01 = r3;
        this.A04 = r6;
        this.A03 = r5;
        this.A06 = r8;
        this.A05 = r7;
        this.A09 = r5.A02;
        this.A0A = r5.A04;
    }
}
