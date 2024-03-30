package X;

import android.content.ContentValues;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.AbstractMap;

/* renamed from: X.17k  reason: invalid class name and case insensitive filesystem */
public class C231617k {
    public final C19700wN A00;
    public final C219712j A01;
    public final AnonymousClass12P A02;
    public final AnonymousClass12O A03;
    public final C231717l A04;
    public final C19770wU A05;

    public C231617k(C19700wN r2, C219712j r3, AnonymousClass12P r4, AnonymousClass12O r5, C19770wU r6) {
        C231717l r0 = new C231717l();
        this.A01 = r3;
        this.A00 = r2;
        this.A05 = r6;
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = r0;
    }

    public static void A00(C26901Ly r4, C231617k r5, UserJid userJid) {
        C35701j7 r3 = new C35701j7(r5, userJid, 43);
        AnonymousClass1M0 r42 = (AnonymousClass1M0) r4;
        C18740tg.A0C(r42.A02.A00.inTransaction());
        C219512b r2 = r42.A01;
        AnonymousClass6UJ r1 = new AnonymousClass6UJ(r2, r3, 0);
        Object obj = r2.A02.get();
        C18740tg.A06(obj);
        ((AbstractMap) obj).put(userJid, r1);
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 178 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap A01(java.util.Set r22) {
        /*
            r21 = this;
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r22.iterator()
        L_0x000e:
            boolean r0 = r3.hasNext()
            r9 = r21
            if (r0 == 0) goto L_0x0040
            java.lang.Object r2 = r3.next()
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            X.17l r0 = r9.A04
            java.util.Map r1 = r0.A00
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r1.get(r2)
        L_0x002a:
            if (r0 == 0) goto L_0x0030
            r10.put(r2, r0)
            goto L_0x000e
        L_0x0030:
            X.12j r0 = r9.A01
            long r0 = r0.A07(r2)
            java.lang.String r0 = java.lang.Long.toString(r0)
            r4.add(r0)
            goto L_0x000e
        L_0x003e:
            r0 = 0
            goto L_0x002a
        L_0x0040:
            java.lang.String[] r0 = X.C19430v1.A0N
            java.lang.Object[] r2 = r4.toArray(r0)
            r0 = 975(0x3cf, float:1.366E-42)
            X.72Z r1 = new X.72Z
            r1.<init>(r2, r0)
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            X.12P r0 = r9.A02
            X.1M0 r13 = r0.get()
            monitor-enter(r9)     // Catch:{ all -> 0x01d1 }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x01ce }
            r7.<init>()     // Catch:{ all -> 0x01ce }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x01ce }
            r12.<init>()     // Catch:{ all -> 0x01ce }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ all -> 0x01ce }
        L_0x0067:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x01ce }
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r4 = r14.next()     // Catch:{ all -> 0x01ce }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ all -> 0x01ce }
            X.14e r3 = r13.A02     // Catch:{ all -> 0x01ce }
            int r2 = r4.length     // Catch:{ all -> 0x01ce }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ce }
            r1.<init>()     // Catch:{ all -> 0x01ce }
            java.lang.String r0 = "SELECT user_jid_row_id, device_jid_row_id, key_index FROM user_device WHERE user_jid_row_id IN "
            r1.append(r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r0 = X.AnonymousClass1M2.A00(r2)     // Catch:{ all -> 0x01ce }
            r1.append(r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01ce }
            java.lang.String r0 = "GET_DEVICE_JIDS_BY_USER_JIDS_SQL"
            android.database.Cursor r6 = r3.A09(r1, r0, r4)     // Catch:{ all -> 0x01ce }
            java.lang.String r0 = "user_jid_row_id"
            int r5 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "device_jid_row_id"
            int r4 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "key_index"
            int r3 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00d8 }
        L_0x00a3:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x00d4
            long r1 = r6.getLong(r5)     // Catch:{ all -> 0x00d8 }
            long r17 = r6.getLong(r4)     // Catch:{ all -> 0x00d8 }
            long r19 = r6.getLong(r3)     // Catch:{ all -> 0x00d8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x00d8 }
            r7.add(r0)     // Catch:{ all -> 0x00d8 }
            X.12j r11 = r9.A01     // Catch:{ all -> 0x00d8 }
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r11.A0C(r0, r1)     // Catch:{ all -> 0x00d8 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x00d8 }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x00d8 }
            X.36i r15 = new X.36i     // Catch:{ all -> 0x00d8 }
            r16 = r0
            r15.<init>(r16, r17, r19)     // Catch:{ all -> 0x00d8 }
            r12.add(r15)     // Catch:{ all -> 0x00d8 }
            goto L_0x00a3
        L_0x00d4:
            r6.close()     // Catch:{ all -> 0x01ce }
            goto L_0x0067
        L_0x00d8:
            r1 = move-exception
            if (r6 == 0) goto L_0x00e3
            r6.close()     // Catch:{ all -> 0x00df }
            goto L_0x00e3
        L_0x00df:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01ce }
        L_0x00e3:
            throw r1     // Catch:{ all -> 0x01ce }
        L_0x00e4:
            X.12j r1 = r9.A01     // Catch:{ all -> 0x01ce }
            java.lang.Class<com.whatsapp.jid.DeviceJid> r0 = com.whatsapp.jid.DeviceJid.class
            java.util.HashMap r4 = r1.A0D(r0, r7)     // Catch:{ all -> 0x01ce }
            java.util.Iterator r7 = r12.iterator()     // Catch:{ all -> 0x01ce }
        L_0x00f0:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x01ce }
            if (r0 == 0) goto L_0x0153
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x01ce }
            X.36i r6 = (X.C600636i) r6     // Catch:{ all -> 0x01ce }
            com.whatsapp.jid.UserJid r5 = r6.A02     // Catch:{ all -> 0x01ce }
            java.lang.Object r3 = r8.get(r5)     // Catch:{ all -> 0x01ce }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x01ce }
            if (r3 != 0) goto L_0x010e
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x01ce }
            r3.<init>()     // Catch:{ all -> 0x01ce }
            r8.put(r5, r3)     // Catch:{ all -> 0x01ce }
        L_0x010e:
            long r0 = r6.A00     // Catch:{ all -> 0x01ce }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01ce }
            java.lang.Object r2 = r4.get(r2)     // Catch:{ all -> 0x01ce }
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2     // Catch:{ all -> 0x01ce }
            if (r2 == 0) goto L_0x0126
            long r0 = r6.A01     // Catch:{ all -> 0x01ce }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01ce }
            r3.put(r2, r0)     // Catch:{ all -> 0x01ce }
            goto L_0x00f0
        L_0x0126:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ce }
            r3.<init>()     // Catch:{ all -> 0x01ce }
            java.lang.String r2 = "DeviceStore/getDeviceMapsForUsers/dangling device "
            r3.append(r2)     // Catch:{ all -> 0x01ce }
            r3.append(r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r0 = " for user "
            r3.append(r0)     // Catch:{ all -> 0x01ce }
            r3.append(r5)     // Catch:{ all -> 0x01ce }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01ce }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01ce }
            X.0wN r3 = r9.A00     // Catch:{ all -> 0x01ce }
            java.lang.String r2 = "dangling-device"
            int r0 = r5.getType()     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01ce }
            r0 = 0
            r3.A0E(r2, r1, r0)     // Catch:{ all -> 0x01ce }
            goto L_0x00f0
        L_0x0153:
            java.util.Set r0 = r8.entrySet()     // Catch:{ all -> 0x01ce }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x01ce }
        L_0x015b:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x01ce }
            if (r0 == 0) goto L_0x01ab
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x01ce }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x01ce }
            java.lang.Object r4 = r0.getKey()     // Catch:{ all -> 0x01ce }
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ all -> 0x01ce }
            X.0x0 r3 = new X.0x0     // Catch:{ all -> 0x01ce }
            r3.<init>()     // Catch:{ all -> 0x01ce }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01ce }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x01ce }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x01ce }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x01ce }
        L_0x0180:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01ce }
            if (r0 == 0) goto L_0x019c
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x01ce }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x01ce }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x01ce }
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1     // Catch:{ all -> 0x01ce }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01ce }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x01ce }
            r3.put(r1, r0)     // Catch:{ all -> 0x01ce }
            goto L_0x0180
        L_0x019c:
            X.0wy r1 = r3.build()     // Catch:{ all -> 0x01ce }
            X.17l r0 = r9.A04     // Catch:{ all -> 0x01ce }
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x01ce }
            r0.put(r4, r1)     // Catch:{ all -> 0x01ce }
            r10.put(r4, r1)     // Catch:{ all -> 0x01ce }
            goto L_0x015b
        L_0x01ab:
            java.util.Iterator r2 = r22.iterator()     // Catch:{ all -> 0x01ce }
        L_0x01af:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01ce }
            if (r0 == 0) goto L_0x01c9
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x01ce }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x01ce }
            boolean r0 = r10.containsKey(r1)     // Catch:{ all -> 0x01ce }
            if (r0 != 0) goto L_0x01af
            X.0wy r0 = X.C20070wy.of()     // Catch:{ all -> 0x01ce }
            r10.put(r1, r0)     // Catch:{ all -> 0x01ce }
            goto L_0x01af
        L_0x01c9:
            monitor-exit(r9)     // Catch:{ all -> 0x01ce }
            r13.close()
            return r10
        L_0x01ce:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01ce }
            throw r0     // Catch:{ all -> 0x01d1 }
        L_0x01d1:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x01d6 }
            throw r1
        L_0x01d6:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C231617k.A01(java.util.Set):java.util.HashMap");
    }

    public void A02(C20760y7 r16, UserJid userJid) {
        AnonymousClass1M0 A052;
        AnonymousClass12P r10 = this.A02;
        AnonymousClass1M0 A053 = r10.A05();
        try {
            C1495671s B1k = A053.B1k();
            try {
                C225614x it = r16.iterator();
                while (true) {
                    UserJid userJid2 = userJid;
                    if (it.hasNext()) {
                        DeviceJid fromUserJidAndDeviceIdNullable = DeviceJid.getFromUserJidAndDeviceIdNullable(userJid2, ((DeviceJid) it.next()).getDevice());
                        boolean z = false;
                        if (fromUserJidAndDeviceIdNullable != null) {
                            z = true;
                        }
                        C18740tg.A0D(z, "DeviceJid must not be null");
                        if (fromUserJidAndDeviceIdNullable != null) {
                            C219712j r0 = this.A01;
                            long A07 = r0.A07(userJid2);
                            long A072 = r0.A07(fromUserJidAndDeviceIdNullable);
                            A052 = r10.A05();
                            A052.A02.A03("user_device", "user_jid_row_id= ? AND device_jid_row_id = ?", "DELETE_DEVICE_JID_SQL", new String[]{String.valueOf(A07), String.valueOf(A072)});
                            A052.close();
                        }
                    } else {
                        B1k.A00();
                        A00(A053, this, userJid2);
                        B1k.close();
                        A053.close();
                        return;
                    }
                }
            } catch (Throwable th) {
                B1k.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A053.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public void A03(DeviceJid deviceJid, UserJid userJid, long j) {
        AnonymousClass1M0 A052 = this.A02.A05();
        try {
            C219712j r0 = this.A01;
            long A07 = r0.A07(userJid);
            long A072 = r0.A07(deviceJid);
            ContentValues contentValues = new ContentValues(3);
            contentValues.put("user_jid_row_id", Long.valueOf(A07));
            contentValues.put("device_jid_row_id", Long.valueOf(A072));
            contentValues.put("key_index", Long.valueOf(j));
            A052.A02.A08("user_device", "INSERT_DEVICE_JID_SQL", contentValues, 4);
            A052.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A04(UserJid userJid) {
        AnonymousClass1M0 A052;
        AnonymousClass12P r1 = this.A02;
        AnonymousClass1M0 A053 = r1.A05();
        try {
            C1495671s B1k = A053.B1k();
            try {
                long A07 = this.A01.A07(userJid);
                A052 = r1.A05();
                A052.A02.A03("user_device", "user_jid_row_id= ?", "DELETE_DEVICE_OF_USER_JID_SQL", new String[]{String.valueOf(A07)});
                A052.close();
                B1k.A00();
                A00(A053, this, userJid);
                B1k.close();
                A053.close();
                return;
            } catch (Throwable th) {
                B1k.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A053.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }
}
