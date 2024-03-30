package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1FL  reason: invalid class name */
public class AnonymousClass1FL {
    public final C002000v A00 = new C002000v(2500);
    public final C219712j A01;
    public final AnonymousClass12P A02;

    public synchronized void A02(UserJid userJid) {
        Long A002 = A00(userJid);
        long j = 1;
        if (A002 != null) {
            j = 1 + A002.longValue();
        }
        long A07 = this.A01.A07(userJid);
        AnonymousClass1M0 A05 = this.A02.A05();
        try {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("user_jid_row_id", Long.valueOf(A07));
            contentValues.put("version", Long.valueOf(j));
            A05.A02.A08("primary_device_version", "INSERT_PRIMARY_DEVICE_VERSION_SQL", contentValues, 5);
            C002000v r1 = this.A00;
            synchronized (r1) {
                r1.A05(userJid);
            }
            A05.close();
        } catch (Throwable th) {
            try {
                A05.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2 = r3.A02.A09("SELECT version FROM primary_device_version WHERE user_jid_row_id = ?", "GET_PRIMARY_DEVICE_VERSION_SQL", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r2.moveToNext() == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r0 = r2.getLong(r2.getColumnIndexOrThrow("version"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0 = java.lang.Long.valueOf(r0);
        r4.A08(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0058, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005a, code lost:
        if (r2 != null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0064, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0065, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0069, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x006b, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        r5 = new java.lang.String[]{java.lang.String.valueOf(r6.A01.A07(r7))};
        r3 = r6.A02.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Long A00(com.whatsapp.jid.UserJid r7) {
        /*
            r6 = this;
            X.00v r4 = r6.A00
            monitor-enter(r4)
            java.lang.Object r0 = r4.A04(r7)     // Catch:{ all -> 0x006f }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return r0
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]
            r2 = 0
            X.12j r0 = r6.A01
            long r0 = r0.A07(r7)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5[r2] = r0
            X.12P r0 = r6.A02
            X.1M0 r3 = r0.get()
            X.14e r2 = r3.A02     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = "SELECT version FROM primary_device_version WHERE user_jid_row_id = ?"
            java.lang.String r0 = "GET_PRIMARY_DEVICE_VERSION_SQL"
            android.database.Cursor r2 = r2.A09(r1, r0, r5)     // Catch:{ all -> 0x0065 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "version"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0059 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0059 }
            monitor-enter(r4)     // Catch:{ all -> 0x0059 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x004e }
            r4.A08(r7, r0)     // Catch:{ all -> 0x004e }
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            r2.close()     // Catch:{ all -> 0x0065 }
            r3.close()
            return r0
        L_0x004e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0051:
            r2.close()     // Catch:{ all -> 0x0065 }
            r3.close()
            r0 = 0
            return r0
        L_0x0059:
            r1 = move-exception
            if (r2 == 0) goto L_0x0064
            r2.close()     // Catch:{ all -> 0x0060 }
            goto L_0x0064
        L_0x0060:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0065 }
        L_0x0064:
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x006a }
            throw r1
        L_0x006a:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x006f:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FL.A00(com.whatsapp.jid.UserJid):java.lang.Long");
    }

    public HashMap A01(Set set) {
        Long valueOf;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        C002000v r7 = this.A00;
        synchronized (r7) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                UserJid userJid = (UserJid) it.next();
                if (r7.A04(userJid) != null) {
                    hashMap.put(userJid, (Long) r7.A04(userJid));
                } else {
                    arrayList.add(userJid);
                }
            }
        }
        String[] strArr = new String[arrayList.size()];
        int i = 0;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            strArr[i] = String.valueOf(this.A01.A07((Jid) it2.next()));
            i++;
        }
        AnonymousClass72Z r1 = new AnonymousClass72Z(strArr, 975);
        AnonymousClass1M0 A04 = this.A02.get();
        try {
            Iterator it3 = r1.iterator();
            while (it3.hasNext()) {
                String[] strArr2 = (String[]) it3.next();
                C224114e r3 = A04.A02;
                int length = strArr2.length;
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT user_jid_row_id, version FROM primary_device_version WHERE user_jid_row_id IN ");
                sb.append(AnonymousClass1M2.A00(length));
                Cursor A09 = r3.A09(sb.toString(), "GET_PRIMARY_DEVICE_VERSIONS_SQL", strArr2);
                try {
                    int columnIndexOrThrow = A09.getColumnIndexOrThrow("user_jid_row_id");
                    int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("version");
                    while (A09.moveToNext()) {
                        UserJid userJid2 = (UserJid) this.A01.A0C(UserJid.class, A09.getLong(columnIndexOrThrow));
                        C18740tg.A06(userJid2);
                        long j = A09.getLong(columnIndexOrThrow2);
                        synchronized (r7) {
                            valueOf = Long.valueOf(j);
                            r7.A08(userJid2, valueOf);
                        }
                        hashMap.put(userJid2, valueOf);
                    }
                    A09.close();
                } catch (Throwable th) {
                    if (A09 != null) {
                        A09.close();
                    }
                    throw th;
                }
            }
            A04.close();
            return hashMap;
        } catch (Throwable th2) {
            try {
                A04.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public AnonymousClass1FL(C219712j r3, AnonymousClass12P r4) {
        this.A01 = r3;
        this.A02 = r4;
    }
}
