package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1FJ  reason: invalid class name */
public abstract class AnonymousClass1FJ {
    public static int A06 = 200;
    public final C002000v A00 = new C002000v(250);
    public final C19700wN A01;
    public final C219712j A02;
    public final C220612s A03;
    public final AnonymousClass12P A04;
    public final AnonymousClass1FL A05;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public X.C587931b A01(X.AnonymousClass3T1 r8) {
        /*
            r7 = this;
            r6 = r7
            boolean r0 = r7 instanceof X.AnonymousClass1FK
            if (r0 == 0) goto L_0x0030
            r5 = r7
            X.1FK r5 = (X.AnonymousClass1FK) r5
            X.00v r3 = r5.A00
            long r0 = r8.A1N
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r4 = r3.A04(r0)
            X.31b r4 = (X.C587931b) r4
            if (r4 != 0) goto L_0x0067
            long r1 = r8.A1N
            X.3Qa r0 = r8.A1J
            X.31b r4 = X.AnonymousClass1FK.A00(r5, r0, r1)
            long r0 = r8.A1N
            monitor-enter(r6)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0064 }
            java.lang.Object r0 = r3.A04(r1)     // Catch:{ all -> 0x0064 }
            X.31b r0 = (X.C587931b) r0     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x0062
            goto L_0x005d
        L_0x0030:
            r2 = r7
            X.1FM r2 = (X.AnonymousClass1FM) r2
            boolean r0 = r8 instanceof X.AnonymousClass2bM
            X.C18740tg.A0B(r0)
            X.00v r3 = r2.A00
            long r0 = r8.A1N
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r4 = r3.A04(r0)
            X.31b r4 = (X.C587931b) r4
            if (r4 != 0) goto L_0x0067
            X.3Qa r0 = r8.A1J
            X.31b r4 = X.AnonymousClass1FM.A00(r2, r0)
            long r0 = r8.A1N
            monitor-enter(r6)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0064 }
            java.lang.Object r0 = r3.A04(r1)     // Catch:{ all -> 0x0064 }
            X.31b r0 = (X.C587931b) r0     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x0062
        L_0x005d:
            r3.A08(r1, r4)     // Catch:{ all -> 0x0064 }
            monitor-exit(r6)
            return r4
        L_0x0062:
            monitor-exit(r6)
            return r0
        L_0x0064:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0067:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FJ.A01(X.3T1):X.31b");
    }

    public String A02(int i) {
        if (this instanceof AnonymousClass1FK) {
            boolean z = false;
            if (i > 0) {
                z = true;
            }
            C18740tg.A0B(z);
            StringBuilder sb = new StringBuilder("INSERT INTO receipt_device (message_row_id, receipt_device_jid_row_id, primary_device_version) SELECT ?, ?, ?");
            for (int i2 = 1; i2 < i; i2++) {
                sb.append(" UNION ALL SELECT ?,?,?");
            }
            return sb.toString();
        }
        boolean z2 = false;
        if (i > 0) {
            z2 = true;
        }
        C18740tg.A0B(z2);
        StringBuilder sb2 = new StringBuilder("INSERT INTO message_add_on_receipt_device (message_add_on_row_id, receipt_device_jid_row_id, primary_device_version) SELECT ?, ?, ?");
        for (int i3 = 1; i3 < i; i3++) {
            sb2.append(" UNION ALL SELECT ?,?,?");
        }
        return sb2.toString();
    }

    public HashMap A03(C64933Qa r11) {
        String str;
        Cursor A09;
        Cursor A092;
        if (this instanceof AnonymousClass1FK) {
            AnonymousClass1FK r4 = (AnonymousClass1FK) this;
            HashMap hashMap = new HashMap();
            AnonymousClass3T1 A032 = r4.A01.A03(r11);
            if (A032 != null) {
                String[] strArr = {String.valueOf(A032.A1N)};
                try {
                    AnonymousClass1M0 A042 = r4.A04.get();
                    try {
                        A092 = A042.A02.A09("SELECT receipt_device_jid_row_id, primary_device_version FROM receipt_device WHERE message_row_id = ?", "MessageReceiptDeviceStore/GET_PRIMARY_DEVICE_VERSIONS_SQL", strArr);
                        int columnIndexOrThrow = A092.getColumnIndexOrThrow("primary_device_version");
                        int columnIndexOrThrow2 = A092.getColumnIndexOrThrow("receipt_device_jid_row_id");
                        while (A092.moveToNext()) {
                            DeviceJid deviceJid = (DeviceJid) r4.A02.A0C(DeviceJid.class, A092.getLong(columnIndexOrThrow2));
                            if (deviceJid != null) {
                                boolean z = false;
                                if (deviceJid.getDevice() == 0) {
                                    z = true;
                                }
                                if (z && !A092.isNull(columnIndexOrThrow)) {
                                    hashMap.put(deviceJid.userJid, Long.valueOf(A092.getLong(columnIndexOrThrow)));
                                }
                            }
                        }
                        A092.close();
                        A042.close();
                        return hashMap;
                    } catch (Throwable th) {
                        A042.close();
                        throw th;
                    }
                } catch (SQLiteDatabaseCorruptException e) {
                    Log.e((Throwable) e);
                    r4.A03.A03();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            return hashMap;
        }
        AnonymousClass1FM r7 = (AnonymousClass1FM) this;
        HashMap hashMap2 = new HashMap();
        AnonymousClass11F r1 = r11.A00;
        C18740tg.A06(r1);
        String[] strArr2 = new String[3];
        strArr2[0] = String.valueOf(r7.A00.A08(r1));
        if (r11.A02) {
            str = "1";
        } else {
            str = "0";
        }
        strArr2[1] = str;
        strArr2[2] = r11.A01;
        AnonymousClass1M0 A043 = r7.A04.get();
        try {
            A09 = A043.A02.A09("SELECT receipt_device_jid_row_id, primary_device_version FROM message_add_on JOIN message_add_on_receipt_device ON message_add_on._id = message_add_on_receipt_device.message_add_on_row_id WHERE chat_row_id = ? AND from_me = ? AND key_id = ?", "MessageAddOnReceiptDeviceStore/GET_PRIMARY_DEVICE_VERSIONS_SQL", strArr2);
            int columnIndexOrThrow3 = A09.getColumnIndexOrThrow("primary_device_version");
            int columnIndexOrThrow4 = A09.getColumnIndexOrThrow("receipt_device_jid_row_id");
            while (A09.moveToNext()) {
                DeviceJid deviceJid2 = (DeviceJid) r7.A02.A0C(DeviceJid.class, A09.getLong(columnIndexOrThrow4));
                if (deviceJid2 != null) {
                    boolean z2 = false;
                    if (deviceJid2.getDevice() == 0) {
                        z2 = true;
                    }
                    if (z2 && !A09.isNull(columnIndexOrThrow3)) {
                        hashMap2.put(deviceJid2.userJid, Long.valueOf(A09.getLong(columnIndexOrThrow3)));
                    }
                }
            }
            A09.close();
            A043.close();
            return hashMap2;
        } catch (Throwable th3) {
            try {
                A043.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
        throw th;
        throw th;
    }

    public HashSet A04(C64933Qa r3) {
        C587931b A002;
        if (this instanceof AnonymousClass1FK) {
            AnonymousClass1FK r1 = (AnonymousClass1FK) this;
            AnonymousClass3T1 A032 = r1.A01.A03(r3);
            if (A032 == null) {
                return new HashSet();
            }
            A002 = r1.A01(A032);
        } else {
            A002 = AnonymousClass1FM.A00((AnonymousClass1FM) this, r3);
        }
        Set keySet = A002.A00.keySet();
        AnonymousClass00C.A08(keySet);
        return new HashSet(keySet);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:39|40|83) */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        A06 = java.lang.Math.max(10, A06 - 10);
        r4 = r4 / 2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00d4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.AnonymousClass3T1 r19, java.util.Set r20, boolean r21) {
        /*
            r18 = this;
            r3 = r20
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0193
            r10 = r19
            long r4 = r10.A1N
            r1 = -1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0193
            r9 = r18
            X.00v r2 = r9.A00
            long r0 = r10.A1N
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r2.A04(r0)
            if (r0 != 0) goto L_0x0037
            X.31b r8 = new X.31b
            r8.<init>()
        L_0x0027:
            X.C18740tg.A06(r8)
            X.1FL r1 = r9.A05
            X.0wN r0 = r9.A01
            java.util.Set r0 = X.AnonymousClass143.A09(r0, r3)
            java.util.HashMap r13 = r1.A01(r0)
            goto L_0x0044
        L_0x0037:
            long r0 = r10.A1N
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r8 = r2.A04(r0)
            X.31b r8 = (X.C587931b) r8
            goto L_0x0027
        L_0x0044:
            X.12P r0 = r9.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x018a }
            X.1M0 r7 = r0.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x018a }
            X.71s r17 = r7.B1k()     // Catch:{ all -> 0x0180 }
            r6 = 0
            r0 = 1
            if (r21 == 0) goto L_0x009d
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x0176 }
            long r0 = r10.A1N     // Catch:{ all -> 0x0176 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0176 }
            r4[r6] = r0     // Catch:{ all -> 0x0176 }
            X.14e r11 = r7.A02     // Catch:{ all -> 0x0176 }
            boolean r12 = r9 instanceof X.AnonymousClass1FK     // Catch:{ all -> 0x0176 }
            if (r12 == 0) goto L_0x006a
            java.lang.String r5 = "receipt_device"
        L_0x0064:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0176 }
            r1.<init>()     // Catch:{ all -> 0x0176 }
            goto L_0x006d
        L_0x006a:
            java.lang.String r5 = "message_add_on_receipt_device"
            goto L_0x0064
        L_0x006d:
            if (r12 == 0) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            java.lang.String r0 = "message_add_on_row_id"
            goto L_0x0075
        L_0x0073:
            java.lang.String r0 = "message_row_id"
        L_0x0075:
            r1.append(r0)     // Catch:{ all -> 0x0176 }
            java.lang.String r0 = " = ?"
            r1.append(r0)     // Catch:{ all -> 0x0176 }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x0176 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0176 }
            r1.<init>()     // Catch:{ all -> 0x0176 }
            if (r12 == 0) goto L_0x0089
            goto L_0x008c
        L_0x0089:
            java.lang.String r0 = "MessageAddOnReceiptDeviceStore/"
            goto L_0x008e
        L_0x008c:
            java.lang.String r0 = "MessageReceiptDeviceStore/"
        L_0x008e:
            r1.append(r0)     // Catch:{ all -> 0x0176 }
            java.lang.String r0 = "addBlankReceiptsForTargetDevicesImpl/DELETE_RECEIPT_DEVICE"
            r1.append(r0)     // Catch:{ all -> 0x0176 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0176 }
            r11.A03(r5, r2, r0, r4)     // Catch:{ all -> 0x0176 }
        L_0x009d:
            com.whatsapp.jid.DeviceJid[] r0 = new com.whatsapp.jid.DeviceJid[r6]     // Catch:{ all -> 0x0176 }
            java.lang.Object[] r11 = r3.toArray(r0)     // Catch:{ all -> 0x0176 }
            com.whatsapp.jid.DeviceJid[] r11 = (com.whatsapp.jid.DeviceJid[]) r11     // Catch:{ all -> 0x0176 }
            int r5 = r11.length     // Catch:{ all -> 0x0176 }
            int r0 = A06     // Catch:{ all -> 0x0176 }
            int r4 = java.lang.Math.min(r5, r0)     // Catch:{ all -> 0x0176 }
            r3 = 0
        L_0x00ad:
            java.lang.String r12 = "INSERT_DEVICE_RECEIPT_SQL"
            if (r3 != 0) goto L_0x00e2
            java.lang.String r2 = r9.A02(r4)     // Catch:{ SQLiteException -> 0x00d4 }
            X.14e r1 = r7.A02     // Catch:{ SQLiteException -> 0x00d4 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00d4 }
            r14.<init>()     // Catch:{ SQLiteException -> 0x00d4 }
            boolean r0 = r9 instanceof X.AnonymousClass1FK     // Catch:{ SQLiteException -> 0x00d4 }
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = "MessageReceiptDeviceStore/"
        L_0x00c2:
            r14.append(r0)     // Catch:{ SQLiteException -> 0x00d4 }
            r14.append(r12)     // Catch:{ SQLiteException -> 0x00d4 }
            java.lang.String r0 = r14.toString()     // Catch:{ SQLiteException -> 0x00d4 }
            X.6QI r3 = r1.A0C(r2, r0)     // Catch:{ SQLiteException -> 0x00d4 }
            goto L_0x00ad
        L_0x00d1:
            java.lang.String r0 = "MessageAddOnReceiptDeviceStore/"
            goto L_0x00c2
        L_0x00d4:
            int r1 = A06     // Catch:{ all -> 0x0176 }
            r0 = 10
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r0, r1)     // Catch:{ all -> 0x0176 }
            A06 = r0     // Catch:{ all -> 0x0176 }
            int r4 = r4 / 2
            goto L_0x00ad
        L_0x00e2:
            if (r5 <= 0) goto L_0x0163
            if (r4 <= r5) goto L_0x0106
            java.lang.String r3 = r9.A02(r5)     // Catch:{ all -> 0x0176 }
            X.14e r2 = r7.A02     // Catch:{ all -> 0x0176 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0176 }
            r1.<init>()     // Catch:{ all -> 0x0176 }
            boolean r0 = r9 instanceof X.AnonymousClass1FK     // Catch:{ all -> 0x0176 }
            if (r0 == 0) goto L_0x010a
            java.lang.String r0 = "MessageReceiptDeviceStore/"
        L_0x00f7:
            r1.append(r0)     // Catch:{ all -> 0x0176 }
            r1.append(r12)     // Catch:{ all -> 0x0176 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0176 }
            X.6QI r3 = r2.A0C(r3, r0)     // Catch:{ all -> 0x0176 }
            r4 = r5
        L_0x0106:
            r3.A03()     // Catch:{ all -> 0x0176 }
            goto L_0x010d
        L_0x010a:
            java.lang.String r0 = "MessageAddOnReceiptDeviceStore/"
            goto L_0x00f7
        L_0x010d:
            r16 = r6
            r2 = 1
        L_0x0110:
            int r0 = r4 * 3
            if (r2 > r0) goto L_0x0158
            r15 = r11[r16]     // Catch:{ all -> 0x0176 }
            r0 = 0
            X.3CX r14 = new X.3CX     // Catch:{ all -> 0x0176 }
            r14.<init>(r0)     // Catch:{ all -> 0x0176 }
            r0 = 0
            X.AnonymousClass00C.A0D(r15, r0)     // Catch:{ all -> 0x0176 }
            java.util.concurrent.ConcurrentHashMap r0 = r8.A00     // Catch:{ all -> 0x0176 }
            r0.put(r15, r14)     // Catch:{ all -> 0x0176 }
            long r0 = r10.A1N     // Catch:{ all -> 0x0176 }
            r3.A05(r2, r0)     // Catch:{ all -> 0x0176 }
            int r14 = r2 + 1
            X.12j r1 = r9.A02     // Catch:{ all -> 0x0176 }
            r0 = r11[r16]     // Catch:{ all -> 0x0176 }
            long r0 = r1.A07(r0)     // Catch:{ all -> 0x0176 }
            r3.A05(r14, r0)     // Catch:{ all -> 0x0176 }
            r0 = r11[r16]     // Catch:{ all -> 0x0176 }
            com.whatsapp.jid.UserJid r0 = r0.userJid     // Catch:{ all -> 0x0176 }
            java.lang.Object r0 = r13.get(r0)     // Catch:{ all -> 0x0176 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0176 }
            if (r0 != 0) goto L_0x014a
            int r0 = r2 + 2
            r3.A04(r0)     // Catch:{ all -> 0x0176 }
            goto L_0x0153
        L_0x014a:
            int r14 = r2 + 2
            long r0 = r0.longValue()     // Catch:{ all -> 0x0176 }
            r3.A05(r14, r0)     // Catch:{ all -> 0x0176 }
        L_0x0153:
            int r16 = r16 + 1
            int r2 = r2 + 3
            goto L_0x0110
        L_0x0158:
            android.database.sqlite.SQLiteStatement r0 = r3.A00     // Catch:{ all -> 0x0176 }
            r0.execute()     // Catch:{ all -> 0x0176 }
            X.AnonymousClass6QI.A00(r3)     // Catch:{ all -> 0x0176 }
            int r6 = r6 + r4
            int r5 = r5 - r4
            goto L_0x00e2
        L_0x0163:
            r17.A00()     // Catch:{ all -> 0x0176 }
            r1 = 2
            X.1j0 r0 = new X.1j0     // Catch:{ all -> 0x0176 }
            r0.<init>(r9, r10, r8, r1)     // Catch:{ all -> 0x0176 }
            r7.B5o(r0)     // Catch:{ all -> 0x0176 }
            r17.close()     // Catch:{ all -> 0x0180 }
            r7.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x018a }
            return
        L_0x0176:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x017b }
            goto L_0x017f
        L_0x017b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0180 }
        L_0x017f:
            throw r1     // Catch:{ all -> 0x0180 }
        L_0x0180:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0185 }
            goto L_0x0189
        L_0x0185:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x018a }
        L_0x0189:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x018a }
        L_0x018a:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.12s r0 = r9.A03
            r0.A03()
        L_0x0193:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FJ.A05(X.3T1, java.util.Set, boolean):void");
    }

    public boolean A07(DeviceJid deviceJid, AnonymousClass3T1 r10) {
        C587931b r0;
        C220612s r02;
        String str;
        Cursor A09;
        Cursor A092;
        if (this instanceof AnonymousClass1FK) {
            r0 = (C587931b) this.A00.A04(Long.valueOf(r10.A1N));
            if (r0 == null) {
                String[] strArr = {String.valueOf(r10.A1N), String.valueOf(this.A02.A07(deviceJid))};
                try {
                    AnonymousClass1M0 A042 = this.A04.get();
                    try {
                        A092 = A042.A02.A09("SELECT receipt_device_jid_row_id FROM receipt_device WHERE message_row_id = ? AND receipt_device_jid_row_id = ?", "MessageReceiptDeviceStore/GET_DEVICE_RECEIPT_SQL", strArr);
                        boolean moveToNext = A092.moveToNext();
                        A092.close();
                        A042.close();
                        return moveToNext;
                    } catch (Throwable th) {
                        A042.close();
                        throw th;
                    }
                } catch (SQLiteDatabaseCorruptException e) {
                    Log.e((Throwable) e);
                    r02 = this.A03;
                    r02.A03();
                    return false;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        } else {
            AnonymousClass1FM r4 = (AnonymousClass1FM) this;
            r0 = (C587931b) r4.A00.A04(Long.valueOf(r10.A1N));
            if (r0 == null) {
                C64933Qa r3 = r10.A1J;
                AnonymousClass11F r1 = r3.A00;
                C18740tg.A06(r1);
                long A08 = r4.A00.A08(r1);
                String valueOf = String.valueOf(r4.A02.A07(deviceJid));
                String[] strArr2 = new String[4];
                strArr2[0] = String.valueOf(A08);
                if (r3.A02) {
                    str = "1";
                } else {
                    str = "0";
                }
                strArr2[1] = str;
                strArr2[2] = r3.A01;
                strArr2[3] = valueOf;
                try {
                    AnonymousClass1M0 A043 = r4.A04.get();
                    try {
                        A09 = A043.A02.A09("SELECT receipt_device_jid_row_id FROM message_add_on JOIN message_add_on_receipt_device ON message_add_on._id = message_add_on_receipt_device.message_add_on_row_id WHERE chat_row_id = ? AND from_me = ? AND key_id = ? AND receipt_device_jid_row_id = ?", "MessageAddOnReceiptDeviceStore/GET_DEVICE_RECEIPT_SQL", strArr2);
                        boolean moveToNext2 = A09.moveToNext();
                        A09.close();
                        A043.close();
                        return moveToNext2;
                    } catch (Throwable th3) {
                        A043.close();
                        throw th3;
                    }
                } catch (SQLiteDatabaseCorruptException e2) {
                    Log.e((Throwable) e2);
                    r02 = r4.A03;
                    r02.A03();
                    return false;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
        }
        Set keySet = r0.A00.keySet();
        AnonymousClass00C.A08(keySet);
        return keySet.contains(deviceJid);
        throw th;
        throw th;
    }

    public AnonymousClass1FJ(C19700wN r3, C219712j r4, C220612s r5, AnonymousClass12P r6, AnonymousClass1FL r7) {
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r5;
    }

    public void A06(Set set) {
        String str;
        String str2;
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (deviceJid.getDevice() != 0) {
                hashSet.add(Long.toString(this.A02.A07(deviceJid)));
            }
        }
        if (!hashSet.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("receipt_device_jid_row_id");
            sb.append(" IN ");
            sb.append(AnonymousClass1M2.A00(hashSet.size()));
            sb.append(" AND ");
            sb.append("receipt_device_timestamp");
            sb.append(" IS NULL");
            String obj = sb.toString();
            AnonymousClass1M0 A052 = this.A04.A05();
            try {
                C224114e r5 = A052.A02;
                boolean z = this instanceof AnonymousClass1FK;
                if (z) {
                    str = "receipt_device";
                } else {
                    str = "message_add_on_receipt_device";
                }
                String[] strArr = (String[]) hashSet.toArray(new String[0]);
                StringBuilder sb2 = new StringBuilder();
                if (z) {
                    str2 = "MessageReceiptDeviceStore/";
                } else {
                    str2 = "MessageAddOnReceiptDeviceStore/";
                }
                sb2.append(str2);
                sb2.append("deleteCompanionReceiptsForUndeliveredMessages/DELETE_RECEIPT_DEVICE");
                int A032 = r5.A03(str, obj, sb2.toString(), strArr);
                A052.close();
                if (A032 > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append("deleteCompanionReceiptsForUndeliveredMessages/deviceIds = ");
                    sb3.append(set);
                    Log.i(sb3.toString());
                    this.A00.A07(-1);
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }
}
