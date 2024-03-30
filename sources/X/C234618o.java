package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.18o  reason: invalid class name and case insensitive filesystem */
public class C234618o {
    public final C19970wo A00;
    public final AnonymousClass18M A01;
    public final C21100yf A02;

    public int A00() {
        Cursor A09;
        AnonymousClass1M0 A03 = this.A01.get();
        try {
            A09 = A03.A02.A09("SELECT COUNT(*) as count FROM prekeys WHERE sent_to_server = 0 AND direct_distribution = 0", "SignalPreKeyStore/getUnsentPreKeysCount", (String[]) null);
            if (A09.moveToNext()) {
                int i = A09.getInt(A09.getColumnIndexOrThrow("count"));
                A09.close();
                A03.close();
                return i;
            }
            throw new SQLiteException("unable to fetch count from table");
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public ArrayList A01() {
        Cursor A09;
        ArrayList arrayList = new ArrayList();
        AnonymousClass1M0 A03 = this.A01.get();
        try {
            A09 = A03.A02.A09("SELECT prekey_id, record FROM prekeys WHERE sent_to_server = 0 AND direct_distribution = 0 LIMIT ?", "SignalPreKeyStore/getUnsentPreKeys", new String[]{String.valueOf(this.A02.A04(C21100yf.A1z))});
            while (A09.moveToNext()) {
                arrayList.add(new C593633q(A09.getInt(A09.getColumnIndexOrThrow("prekey_id")), A09.getBlob(A09.getColumnIndexOrThrow("record"))));
            }
            A09.close();
            A03.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A02(int i) {
        AnonymousClass1M0 A04 = this.A01.A04();
        try {
            C224114e r6 = A04.A02;
            String[] strArr = {String.valueOf(i)};
            StringBuilder sb = new StringBuilder();
            sb.append("axolotl deleted ");
            sb.append((long) r6.A03("prekeys", "prekey_id = ?", "SignalPreKeyStore/removePreKey", strArr));
            sb.append(" pre keys with id ");
            sb.append(i);
            Log.i(sb.toString());
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A03(int[] iArr) {
        Throwable th;
        AnonymousClass18M r7 = this.A01;
        AnonymousClass1M0 A04 = r7.A04();
        try {
            C1495671s B1k = A04.B1k();
            try {
                long A002 = C19970wo.A00(this.A00) / 1000;
                int i = 0;
                while (true) {
                    int length = iArr.length;
                    if (i < length) {
                        int min = Math.min(i + 200, length);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("sent_to_server", true);
                        contentValues.put("upload_timestamp", Long.valueOf(A002));
                        StringBuilder sb = new StringBuilder("?");
                        String[] strArr = new String[(min - i)];
                        for (int i2 = i; i2 < min; i2++) {
                            strArr[i2 - i] = String.valueOf(iArr[i2]);
                            if (i2 != i) {
                                sb.append(",?");
                            }
                        }
                        AnonymousClass1M0 A042 = r7.A04();
                        try {
                            C224114e r13 = A042.A02;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("prekey_id IN (");
                            sb2.append(sb);
                            sb2.append(")");
                            int A012 = r13.A01(contentValues, "prekeys", sb2.toString(), "SignalPreKeyStore/setPreKeysAsSentToServer", strArr);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("updated ");
                            sb3.append(A012);
                            sb3.append(" prekeys; values=");
                            sb3.append(contentValues);
                            Log.i(sb3.toString());
                            A042.close();
                            i = min;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    } else {
                        AnonymousClass1M0 A043 = r7.A04();
                        try {
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("upload_timestamp", Long.valueOf(A002));
                            A043.A02.A04("prekey_uploads", "SignalPreKeyStore/savePreKeyUpload", contentValues2);
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("axolotl addPreKeyUpload ts:");
                            sb4.append(A002);
                            Log.i(sb4.toString());
                            A043.close();
                            B1k.A00();
                            B1k.close();
                            A04.close();
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            A043.close();
                            throw th;
                        }
                    }
                }
            } catch (Throwable th4) {
                B1k.close();
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                A04.close();
                throw th5;
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
                throw th5;
            }
        }
    }

    public byte[] A04(int i) {
        Cursor A09;
        byte[] bArr;
        AnonymousClass1M0 A03 = this.A01.get();
        try {
            A09 = A03.A02.A09("SELECT record FROM prekeys WHERE prekey_id = ?", "SignalPreKeyStore/getPreKey", new String[]{String.valueOf(i)});
            if (!A09.moveToNext()) {
                bArr = null;
            } else {
                bArr = A09.getBlob(A09.getColumnIndexOrThrow("record"));
            }
            A09.close();
            A03.close();
            return bArr;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C234618o(C21100yf r1, C19970wo r2, AnonymousClass18M r3) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r1;
    }
}
