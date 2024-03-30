package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1FN  reason: invalid class name */
public class AnonymousClass1FN {
    public final AnonymousClass1FM A00;
    public final AnonymousClass1FK A01;
    public final AnonymousClass12P A02;
    public final AnonymousClass1A1 A03;

    public HashSet A00(C64933Qa r2) {
        AnonymousClass1FJ r0;
        if (this.A03.A03(r2) == null) {
            r0 = this.A00;
        } else {
            r0 = this.A01;
        }
        return r0.A04(r2);
    }

    public void A01(DeviceJid deviceJid, AnonymousClass3T1 r20, long j) {
        AnonymousClass1FJ r4;
        String str;
        String str2;
        AnonymousClass1M0 A05;
        String str3;
        AnonymousClass3T1 r9 = r20;
        if (r9 instanceof AnonymousClass2bM) {
            r4 = this.A00;
        } else {
            r4 = this.A01;
        }
        if (!r9.A1P && r9.A1N != -1) {
            C587931b A012 = r4.A01(r9);
            StringBuilder sb = new StringBuilder();
            boolean z = r4 instanceof AnonymousClass1FK;
            if (z) {
                str = "MessageReceiptDeviceStore/";
            } else {
                str = "MessageAddOnReceiptDeviceStore/";
            }
            sb.append(str);
            sb.append("updateDeviceReceiptsForMessage/key=");
            C64933Qa r5 = r9.A1J;
            sb.append(r5);
            sb.append("; deviceJid=");
            DeviceJid deviceJid2 = deviceJid;
            sb.append(deviceJid2);
            sb.append("; receipt=");
            ConcurrentHashMap concurrentHashMap = A012.A00;
            sb.append(concurrentHashMap.get(deviceJid2));
            sb.append("; timestamp=");
            long j2 = j;
            sb.append(j2);
            Log.i(sb.toString());
            AnonymousClass00C.A0D(deviceJid2, 0);
            if (j > 0) {
                AnonymousClass3CX r13 = (AnonymousClass3CX) concurrentHashMap.get(deviceJid2);
                if (r13 == null) {
                    concurrentHashMap.put(deviceJid2, new AnonymousClass3CX(j2));
                } else {
                    long j3 = r13.A00;
                    if (1 > j3 || j3 > j) {
                        r13.A00 = j2;
                    } else {
                        return;
                    }
                }
                long A07 = r4.A02.A07(deviceJid2);
                ContentValues contentValues = new ContentValues(3);
                if (z) {
                    str2 = "message_row_id";
                } else {
                    str2 = "message_add_on_row_id";
                }
                contentValues.put(str2, Long.valueOf(r9.A1N));
                contentValues.put("receipt_device_timestamp", Long.valueOf(j2));
                contentValues.put("receipt_device_jid_row_id", Long.valueOf(A07));
                try {
                    A05 = r4.A04.A05();
                    C224114e r10 = A05.A02;
                    if (z) {
                        str3 = "receipt_device";
                    } else {
                        str3 = "message_add_on_receipt_device";
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append("=? AND ");
                    sb2.append("receipt_device_jid_row_id");
                    sb2.append("=?");
                    String obj = sb2.toString();
                    String[] strArr = {String.valueOf(r9.A1N), String.valueOf(A07)};
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append("writeDeviceReceipt/UPDATE_RECEIPT_DEVICE");
                    String[] strArr2 = strArr;
                    if (((long) r10.A01(contentValues, str3, obj, sb3.toString(), strArr2)) == 0) {
                        contentValues.put("primary_device_version", r4.A05.A00(deviceJid2.userJid));
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str);
                        sb4.append("writeDeviceReceipt/INSERT_RECEIPT_DEVICE");
                        if (r10.A04(str3, sb4.toString(), contentValues) == -1) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(str);
                            sb5.append("writedevicereceipt/replace/failed ");
                            sb5.append(r5);
                            sb5.append(" ");
                            sb5.append(deviceJid2);
                            Log.e(sb5.toString());
                            C19700wN r7 = r4.A01;
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("key=");
                            sb6.append(r5);
                            sb6.append(" device=");
                            sb6.append(deviceJid2);
                            r7.A0E("ReceiptsMessageStore: replace failed", sb6.toString(), true);
                        }
                    }
                    A05.close();
                    return;
                } catch (SQLiteDatabaseCorruptException e) {
                    Log.e((Throwable) e);
                    r4.A03.A03();
                    return;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                return;
            }
        } else {
            return;
        }
        throw th;
    }

    public void A02(AnonymousClass3T1 r4, Set set) {
        AnonymousClass1FJ r1;
        if (r4 instanceof AnonymousClass2bM) {
            r1 = this.A00;
        } else {
            r1 = this.A01;
        }
        C64933Qa r2 = r4.A1J;
        set.size();
        try {
            r1.A05(r4, set, false);
        } catch (SQLiteConstraintException e) {
            Log.e((Throwable) e);
            StringBuilder sb = new StringBuilder();
            sb.append("BaseReceiptDeviceStore: Tried to add message twice: Message id:");
            sb.append(r2.A01);
            throw new IllegalStateException(sb.toString());
        }
    }

    public void A03(AnonymousClass3T1 r3, Set set) {
        AnonymousClass1FJ r1;
        if (r3 instanceof AnonymousClass2bM) {
            r1 = this.A00;
        } else {
            r1 = this.A01;
        }
        set.size();
        r1.A05(r3, set, false);
    }

    public void A04(Set set) {
        C1495671s B1k;
        AnonymousClass1M0 A05 = this.A02.A05();
        try {
            B1k = A05.B1k();
            this.A01.A06(set);
            this.A00.A06(set);
            B1k.A00();
            B1k.close();
            A05.close();
            return;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass1FN(AnonymousClass1FM r1, AnonymousClass1FK r2, AnonymousClass12P r3, AnonymousClass1A1 r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
