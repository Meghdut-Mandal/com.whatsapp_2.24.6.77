package X;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1FI  reason: invalid class name */
public class AnonymousClass1FI {
    public Map A00;
    public final C220412q A01;
    public final C219712j A02;
    public final AnonymousClass12P A03;
    public final C24941Ej A04;
    public final C19970wo A05;
    public final AnonymousClass163 A06;
    public final C219612i A07;

    public static void A01(C26911Lz r4, AnonymousClass11F r5, int i, int i2) {
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("jid", r5.getRawString());
        contentValues.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, Integer.valueOf(i));
        contentValues.put("message_count", Integer.valueOf(i2));
        if (((AnonymousClass1M0) r4).A02.A04("frequents", "insertFrequents/INSERT_FREQUENTS_LEGACY", contentValues) == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("frequentMessageStore/insertFrequents/failed jid=");
            sb.append(r5);
            sb.append(" type=");
            sb.append(i);
            Log.e(sb.toString());
        }
    }

    public ArrayList A02(AnonymousClass4QE r10, boolean z, boolean z2) {
        C224214g r6 = new C224214g(false);
        r6.A03();
        Map A032 = A03();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : A032.entrySet()) {
            AnonymousClass11F r5 = ((AnonymousClass3IJ) entry.getKey()).A01;
            if ((!AnonymousClass143.A0I(r5) || !z) && (!z2 || !AnonymousClass143.A0H(r5))) {
                int i = ((AnonymousClass3IJ) entry.getKey()).A00;
                int intValue = ((Number) entry.getValue()).intValue();
                if (r10 != null) {
                    intValue *= r10.BJF(i);
                }
                if (intValue != 0) {
                    C21663AUf aUf = (C21663AUf) hashMap.get(r5);
                    if (aUf == null) {
                        aUf = new C21663AUf(this.A01.A08(r5));
                    }
                    aUf.A00 += intValue;
                    hashMap.put(r5, aUf);
                }
            }
        }
        ArrayList arrayList = new ArrayList(hashMap.entrySet());
        Collections.sort(arrayList, AXZ.A00);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList2.add(entry2.getKey());
            entry2.getKey();
            entry2.getValue();
            entry2.getValue();
        }
        Log.i(String.format(Locale.US, "frequentmsgstore/getfrequents took %d ms", new Object[]{Long.valueOf(r6.A00())}));
        return arrayList2;
    }

    public static void A00(AnonymousClass1FI r8, AnonymousClass11F r9, int i, int i2, boolean z) {
        long A072 = r8.A02.A07(r9);
        if (!z) {
            AnonymousClass6QI A002 = r8.A04.A00("UPDATE frequent   SET message_count = ? WHERE jid_row_id = ? AND type = ?", "UPDATE_FREQUENT");
            A002.A05(2, A072);
            A002.A05(3, (long) i);
            A002.A05(1, (long) i2);
            if (A002.A01() == 1) {
                return;
            }
        }
        AnonymousClass6QI A003 = r8.A04.A00("INSERT INTO frequent(jid_row_id, type, message_count) VALUES (?, ?, ?)", "INSERT_FREQUENT");
        A003.A05(1, A072);
        A003.A05(2, (long) i);
        A003.A05(3, (long) i2);
        if (A003.A02() == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("frequentMessageStore/insertOrUpdateFrequent/failed jid=");
            sb.append(r9);
            sb.append(" type=");
            sb.append(i);
            Log.e(sb.toString());
        }
    }

    public Map A03() {
        Cursor A09;
        if (this.A00 == null) {
            this.A00 = new ConcurrentHashMap();
            AnonymousClass1M0 A042 = this.A03.get();
            try {
                A09 = A042.A02.A09("SELECT jid_row_id, type, message_count FROM frequent", "GET_FREQUENT", (String[]) null);
                int columnIndexOrThrow = A09.getColumnIndexOrThrow("jid_row_id");
                int columnIndexOrThrow2 = A09.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                int columnIndexOrThrow3 = A09.getColumnIndexOrThrow("message_count");
                while (A09.moveToNext()) {
                    AnonymousClass11F r1 = (AnonymousClass11F) this.A02.A0C(AnonymousClass11F.class, A09.getLong(columnIndexOrThrow));
                    if (r1 != null) {
                        if (!AnonymousClass143.A0I(r1) || this.A01.A0M(r1)) {
                            this.A00.put(new AnonymousClass3IJ(r1, (byte) A09.getInt(columnIndexOrThrow2)), Integer.valueOf(A09.getInt(columnIndexOrThrow3)));
                        }
                    }
                }
                A09.close();
                A042.close();
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        return this.A00;
        throw th;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004c, code lost:
        if (r15 <= r17) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r19 = this;
            java.lang.String r7 = "frequents"
            r4 = 0
            X.14g r6 = new X.14g
            r6.<init>((boolean) r4)
            java.lang.String r0 = "frequentmsgstore/updateFrequents"
            r6.A04(r0)
            r9 = r19
            X.12P r0 = r9.A03
            X.1M0 r3 = r0.A05()
            X.14e r10 = r3.A02     // Catch:{ all -> 0x018e }
            X.0wo r8 = r9.A05     // Catch:{ all -> 0x018e }
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x018e }
            r0 = 691200000(0x2932e000, double:3.414981744E-315)
            long r17 = r17 - r0
            r0 = 0
            java.lang.String r11 = "SELECT sort_id, received_timestamp FROM available_message_view WHERE received_timestamp > 0 ORDER BY sort_id DESC LIMIT 4096"
            java.lang.String r5 = "GET_SAMPLE_FOR_FREQUENTS"
            r2 = 0
            android.database.Cursor r14 = r10.A09(r11, r5, r2)     // Catch:{ all -> 0x018e }
            java.lang.String r5 = "received_timestamp"
            int r13 = r14.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x0182 }
            java.lang.String r5 = "sort_id"
            int r11 = r14.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x0182 }
            r12 = 0
        L_0x003a:
            boolean r5 = r14.moveToNext()     // Catch:{ all -> 0x0182 }
            if (r5 == 0) goto L_0x004e
            long r15 = r14.getLong(r13)     // Catch:{ all -> 0x0182 }
            long r0 = r14.getLong(r11)     // Catch:{ all -> 0x0182 }
            int r12 = r12 + 1
            int r5 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r5 > 0) goto L_0x003a
        L_0x004e:
            r14.close()     // Catch:{ all -> 0x018e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x018e }
            r11.<init>()     // Catch:{ all -> 0x018e }
            java.lang.String r5 = "frequentmsgstore/updateFrequents/start sort_id:"
            r11.append(r5)     // Catch:{ all -> 0x018e }
            r11.append(r0)     // Catch:{ all -> 0x018e }
            java.lang.String r5 = " "
            r11.append(r5)     // Catch:{ all -> 0x018e }
            r11.append(r12)     // Catch:{ all -> 0x018e }
            java.lang.String r5 = r11.toString()     // Catch:{ all -> 0x018e }
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ all -> 0x018e }
            r5 = 2
            java.lang.String[] r12 = new java.lang.String[r5]     // Catch:{ all -> 0x018e }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x018e }
            r12[r4] = r0     // Catch:{ all -> 0x018e }
            r0 = 6
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x018e }
            r5 = 1
            r12[r5] = r0     // Catch:{ all -> 0x018e }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ all -> 0x018e }
            r11.<init>()     // Catch:{ all -> 0x018e }
            java.lang.String r1 = "SELECT chat_row_id, message_type FROM available_message_view WHERE sort_id >= ? AND from_me = 1 AND status != ?"
            java.lang.String r0 = "GET_MESSAGES_FOR_FREQUENTS"
            android.database.Cursor r12 = r10.A09(r1, r0, r12)     // Catch:{ all -> 0x018e }
            java.lang.String r0 = "message_type"
            int r13 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017b }
        L_0x0091:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x017b }
            if (r0 == 0) goto L_0x00c8
            X.163 r0 = r9.A06     // Catch:{ all -> 0x017b }
            X.11F r14 = r0.A0B(r12)     // Catch:{ all -> 0x017b }
            if (r14 == 0) goto L_0x0091
            boolean r0 = r14 instanceof X.C177528dw     // Catch:{ all -> 0x017b }
            if (r0 != 0) goto L_0x0091
            int r0 = r12.getInt(r13)     // Catch:{ all -> 0x017b }
            byte r0 = (byte) r0     // Catch:{ all -> 0x017b }
            X.3IJ r1 = new X.3IJ     // Catch:{ all -> 0x017b }
            r1.<init>(r14, r0)     // Catch:{ all -> 0x017b }
            java.lang.Object r0 = r11.get(r1)     // Catch:{ all -> 0x017b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x017b }
            if (r0 != 0) goto L_0x00bd
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x017b }
        L_0x00b9:
            r11.put(r1, r0)     // Catch:{ all -> 0x017b }
            goto L_0x0091
        L_0x00bd:
            int r0 = r0.intValue()     // Catch:{ all -> 0x017b }
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x017b }
            goto L_0x00b9
        L_0x00c8:
            r12.close()     // Catch:{ all -> 0x018e }
            r11.size()     // Catch:{ all -> 0x018e }
            X.71s r13 = r3.B1k()     // Catch:{ all -> 0x018e }
            java.lang.String r0 = "updateFrequents/DELETE_FREQUENTS_LEGACY"
            r10.A03(r7, r2, r0, r2)     // Catch:{ all -> 0x0176 }
            java.lang.String r1 = "frequent"
            java.lang.String r0 = "updateFrequents/DELETE_FREQUENT"
            r10.A03(r1, r2, r0, r2)     // Catch:{ all -> 0x0176 }
            java.util.Set r0 = r11.entrySet()     // Catch:{ all -> 0x0176 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x0176 }
        L_0x00e6:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0176 }
            if (r0 == 0) goto L_0x0110
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x0176 }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ all -> 0x0176 }
            java.lang.Object r0 = r10.getKey()     // Catch:{ all -> 0x0176 }
            X.3IJ r0 = (X.AnonymousClass3IJ) r0     // Catch:{ all -> 0x0176 }
            X.11F r2 = r0.A01     // Catch:{ all -> 0x0176 }
            java.lang.Object r0 = r10.getKey()     // Catch:{ all -> 0x0176 }
            X.3IJ r0 = (X.AnonymousClass3IJ) r0     // Catch:{ all -> 0x0176 }
            int r1 = r0.A00     // Catch:{ all -> 0x0176 }
            java.lang.Object r0 = r10.getValue()     // Catch:{ all -> 0x0176 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0176 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0176 }
            A01(r3, r2, r1, r0)     // Catch:{ all -> 0x0176 }
            goto L_0x00e6
        L_0x0110:
            java.util.Set r0 = r11.entrySet()     // Catch:{ all -> 0x0176 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x0176 }
        L_0x0118:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0176 }
            if (r0 == 0) goto L_0x0142
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x0176 }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ all -> 0x0176 }
            java.lang.Object r0 = r10.getKey()     // Catch:{ all -> 0x0176 }
            X.3IJ r0 = (X.AnonymousClass3IJ) r0     // Catch:{ all -> 0x0176 }
            X.11F r2 = r0.A01     // Catch:{ all -> 0x0176 }
            java.lang.Object r0 = r10.getKey()     // Catch:{ all -> 0x0176 }
            X.3IJ r0 = (X.AnonymousClass3IJ) r0     // Catch:{ all -> 0x0176 }
            int r1 = r0.A00     // Catch:{ all -> 0x0176 }
            java.lang.Object r0 = r10.getValue()     // Catch:{ all -> 0x0176 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0176 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0176 }
            A00(r9, r2, r1, r0, r5)     // Catch:{ all -> 0x0176 }
            goto L_0x0118
        L_0x0142:
            r13.A00()     // Catch:{ all -> 0x0176 }
            r13.close()     // Catch:{ all -> 0x018e }
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x018e }
            r0.<init>(r11)     // Catch:{ all -> 0x018e }
            r9.A00 = r0     // Catch:{ all -> 0x018e }
            X.12i r2 = r9.A07     // Catch:{ all -> 0x018e }
            long r0 = X.C19970wo.A00(r8)     // Catch:{ all -> 0x018e }
            r2.A03(r7, r0)     // Catch:{ all -> 0x018e }
            r3.close()
            r6.A01()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[r5]
            long r0 = r6.A00()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2[r4] = r0
            java.lang.String r0 = "frequentmsgstore/updateFrequents took %d ms"
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0176:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0189 }
            goto L_0x018d
        L_0x017b:
            r1 = move-exception
            if (r12 == 0) goto L_0x018d
            r12.close()     // Catch:{ all -> 0x0189 }
            goto L_0x018d
        L_0x0182:
            r1 = move-exception
            if (r14 == 0) goto L_0x018d
            r14.close()     // Catch:{ all -> 0x0189 }
            goto L_0x018d
        L_0x0189:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x018e }
        L_0x018d:
            throw r1     // Catch:{ all -> 0x018e }
        L_0x018e:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0193 }
            throw r1
        L_0x0193:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FI.A04():void");
    }

    public void A05(AnonymousClass11F r9) {
        C1495671s B1k;
        AnonymousClass1M0 A052 = this.A03.A05();
        try {
            B1k = A052.B1k();
            A052.A02.A03("frequents", "jid = ?", "deleteFrequents/DELETE_FREQUENTS_LEGACY", new String[]{r9.getRawString()});
            long A072 = this.A02.A07(r9);
            AnonymousClass6QI A002 = this.A04.A00("DELETE FROM frequent WHERE jid_row_id = ?", "DELETE_FREQUENT_FOR_JID");
            A002.A05(1, A072);
            A002.A01();
            B1k.A00();
            B1k.close();
            A052.close();
            Map map = this.A00;
            if (map != null) {
                ArrayList arrayList = new ArrayList();
                for (AnonymousClass3IJ r1 : map.keySet()) {
                    if (r9.equals(r1.A01)) {
                        arrayList.add(r1);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.A00.remove(it.next());
                }
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public boolean A06() {
        if (this.A07.A00("frequents", 0) + 86400000 >= C19970wo.A00(this.A05)) {
            return false;
        }
        A04();
        return true;
    }

    public AnonymousClass1FI(C19970wo r1, AnonymousClass163 r2, C220412q r3, C219712j r4, AnonymousClass12P r5, C219612i r6, C24941Ej r7) {
        this.A05 = r1;
        this.A02 = r4;
        this.A06 = r2;
        this.A01 = r3;
        this.A07 = r6;
        this.A04 = r7;
        this.A03 = r5;
    }
}
