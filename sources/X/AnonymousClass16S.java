package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.PaymentConfiguration;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.16S  reason: invalid class name */
public class AnonymousClass16S implements AnonymousClass00O {
    public C1031454d A00;
    public PaymentConfiguration A01;
    public final C19700wN A02;
    public final C19970wo A03;
    public final C19630wG A04;
    public final AnonymousClass11g A05;
    public final AnonymousClass12S A06;
    public final C20810yC A07;
    public final AnonymousClass16T A08;
    public volatile boolean A09;

    public static boolean A04(List list) {
        int A092;
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C207249un r2 = (C207249un) it.next();
                if (r2 != null) {
                    if (TextUtils.isEmpty(r2.A0A) || (A092 = r2.A09()) == 0) {
                        Log.w("PAY: PaymentsHelper sanitizePaymentMethods got empty credential id or account type");
                        return false;
                    }
                    if (C202349ld.A02(r2.A09)) {
                        r2.A0E(C207249un.A07(A092));
                    }
                    C202159l8 r0 = C202159l8.A0E;
                }
            }
            return true;
        }
        return false;
    }

    public synchronized C175728ax A05(UserJid userJid) {
        C175728ax r6;
        B66 A002;
        Cursor A092;
        r6 = null;
        C198699e3 A003 = this.A01.A00(C202159l8.A01(AnonymousClass3SI.A02(AnonymousClass3U8.A07(userJid))).A03);
        if (!(A003 == null || (A002 = C198699e3.A00(A003)) == null || (r6 = A002.BKV()) == null)) {
            AnonymousClass1M0 A032 = this.A00.get();
            try {
                A092 = A032.A02.A09(C196709aP.A00, "readContactInfo/QUERY_SCHEMA_PAY_CONTACTS", new String[]{userJid.getRawString()});
                while (A092.moveToNext()) {
                    A03(A092, r6, userJid);
                }
                A092.close();
                A032.close();
            } catch (Throwable th) {
                try {
                    A032.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PAY: PaymentStore readContactInfo returned: ");
        sb.append(r6);
        Log.i(sb.toString());
        return r6;
        throw th;
    }

    public synchronized ArrayList A0B() {
        return A0C((int[]) null, 0);
    }

    public synchronized ArrayList A0C(int[] iArr, int i) {
        ArrayList arrayList;
        Cursor A092;
        B66 b66;
        C175728ax r0;
        arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (iArr != null) {
            for (int i2 : iArr) {
                arrayList2.add(Long.toString((long) (i2 << (i * 4))));
            }
        }
        AnonymousClass1M0 A032 = this.A00.get();
        try {
            C224114e r7 = A032.A02;
            long j = 15 << (i * 4);
            boolean z = false;
            if (i == 0) {
                z = true;
            }
            String str = C196709aP.A00;
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT ");
            sb.append(AnonymousClass96W.A00(AnonymousClass99b.A00));
            sb.append(" FROM ");
            sb.append("contacts");
            sb.append(C196709aP.A00(arrayList2, j, z));
            A092 = r7.A09(sb.toString(), "readAllContactInfos/QUERY_SCHEMA_PAY_CONTACTS", (String[]) null);
            while (A092.moveToNext()) {
                UserJid A022 = UserJid.Companion.A02(A092.getString(A092.getColumnIndexOrThrow("jid")));
                if (A022 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("PAY: PaymentTransactionStore/readContactInfos: Skipping Jid because it is not valid: ");
                    sb2.append(A092.getString(A092.getColumnIndexOrThrow("jid")));
                    Log.i(sb2.toString());
                } else {
                    C198699e3 A002 = this.A01.A00(C202159l8.A01(AnonymousClass3SI.A02(AnonymousClass3U8.A07(A022))).A03);
                    if (A002 != null) {
                        b66 = C198699e3.A00(A002);
                    } else {
                        b66 = null;
                    }
                    if (b66 != null) {
                        r0 = b66.BKV();
                    } else {
                        r0 = null;
                    }
                    if (r0 != null) {
                        A03(A092, r0, A022);
                        arrayList.add(r0);
                    }
                }
            }
            A092.close();
            A032.close();
            if (iArr != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int valueOf : iArr) {
                    arrayList3.add(Integer.valueOf(valueOf));
                }
            }
        } catch (Throwable th) {
            try {
                A032.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        return arrayList;
        throw th;
    }

    public synchronized List A0D() {
        List emptyList;
        AnonymousClass1M0 A032 = this.A00.get();
        try {
            emptyList = Collections.emptyList();
            A032.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        return emptyList;
        throw th;
    }

    public synchronized void A0F(UserJid userJid, Boolean bool, String str, HashMap hashMap) {
        synchronized (this) {
            A0I(userJid, bool, str, hashMap, (HashMap) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r4 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011f, code lost:
        if (r1 != false) goto L_0x0121;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0I(com.whatsapp.jid.UserJid r13, java.lang.Boolean r14, java.lang.String r15, java.util.HashMap r16, java.util.HashMap r17) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.lang.String r0 = X.AnonymousClass3U8.A07(r13)     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = X.AnonymousClass3SI.A02(r0)     // Catch:{ all -> 0x0126 }
            X.9l8 r0 = X.C202159l8.A01(r0)     // Catch:{ all -> 0x0126 }
            java.lang.String r1 = r0.A03     // Catch:{ all -> 0x0126 }
            com.whatsapp.payments.PaymentConfiguration r0 = r12.A01     // Catch:{ all -> 0x0126 }
            r11 = 0
            if (r0 == 0) goto L_0x0124
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x0124
            java.lang.String r0 = "UNSET"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x0124
            X.8ax r4 = r12.A05(r13)     // Catch:{ all -> 0x0126 }
            if (r4 == 0) goto L_0x002c
            com.whatsapp.jid.UserJid r0 = r4.A04     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x0053
        L_0x002c:
            com.whatsapp.payments.PaymentConfiguration r1 = r12.A01     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = X.AnonymousClass3U8.A07(r13)     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = X.AnonymousClass3SI.A02(r0)     // Catch:{ all -> 0x0126 }
            X.9l8 r0 = X.C202159l8.A01(r0)     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x0126 }
            X.9e3 r0 = r1.A00(r0)     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x0051
            X.B66 r0 = X.C198699e3.A00(r0)     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x0051
            X.8ax r4 = r0.BKV()     // Catch:{ all -> 0x0126 }
            if (r4 == 0) goto L_0x0124
            r4.A04 = r13     // Catch:{ all -> 0x0126 }
            goto L_0x0053
        L_0x0051:
            if (r4 == 0) goto L_0x0124
        L_0x0053:
            r11 = 1
            if (r14 == 0) goto L_0x0073
            boolean r0 = r4.A06     // Catch:{ all -> 0x0126 }
            boolean r1 = r14.booleanValue()     // Catch:{ all -> 0x0126 }
            if (r0 != r1) goto L_0x0066
            java.lang.String r0 = r4.A05     // Catch:{ all -> 0x0126 }
            boolean r0 = X.C1901797e.A00(r0, r15)     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x0073
        L_0x0066:
            r4.A0B(r1)     // Catch:{ all -> 0x0126 }
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x0071
            r4.A05 = r15     // Catch:{ all -> 0x0126 }
        L_0x0071:
            r1 = 1
            goto L_0x0074
        L_0x0073:
            r1 = 0
        L_0x0074:
            if (r16 == 0) goto L_0x00cb
            boolean r0 = r16.isEmpty()     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x00cb
            java.util.Set r0 = r16.entrySet()     // Catch:{ all -> 0x0126 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x0126 }
        L_0x0084:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r0 = r10.next()     // Catch:{ all -> 0x0126 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0126 }
            java.lang.Object r6 = r0.getKey()     // Catch:{ all -> 0x0126 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0126 }
            int r1 = r6.intValue()     // Catch:{ all -> 0x0126 }
            java.lang.Object r9 = r0.getValue()     // Catch:{ all -> 0x0126 }
            X.00I r9 = (X.AnonymousClass00I) r9     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = r9.A00     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0126 }
            int r8 = X.C175728ax.A01(r0)     // Catch:{ all -> 0x0126 }
            X.9bx r7 = X.C175728ax.A02(r4)     // Catch:{ all -> 0x0126 }
            int r5 = r1 * 4
            r0 = 15
            long r0 = r0 << r5
            long r2 = ~r0     // Catch:{ all -> 0x0126 }
            long r0 = r7.A00     // Catch:{ all -> 0x0126 }
            long r2 = r2 & r0
            int r8 = r8 << r5
            long r0 = (long) r8     // Catch:{ all -> 0x0126 }
            long r0 = r0 | r2
            r7.A00 = r0     // Catch:{ all -> 0x0126 }
            java.lang.Object r1 = r9.A01     // Catch:{ all -> 0x0126 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0126 }
            X.9bx r0 = X.C175728ax.A02(r4)     // Catch:{ all -> 0x0126 }
            java.util.Map r0 = r0.A01     // Catch:{ all -> 0x0126 }
            r0.put(r6, r1)     // Catch:{ all -> 0x0126 }
            goto L_0x0084
        L_0x00ca:
            r1 = 1
        L_0x00cb:
            if (r17 == 0) goto L_0x011e
            boolean r0 = r17.isEmpty()     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x011e
            java.util.Set r0 = r17.entrySet()     // Catch:{ all -> 0x0126 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0126 }
        L_0x00db:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x0121
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0126 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0126 }
            java.lang.Object r3 = r0.getKey()     // Catch:{ all -> 0x0126 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0126 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x0126 }
            X.00I r2 = (X.AnonymousClass00I) r2     // Catch:{ all -> 0x0126 }
            java.lang.Object r1 = r2.A00     // Catch:{ all -> 0x0126 }
            if (r1 == 0) goto L_0x00db
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0126 }
            X.9by r0 = r4.A02     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x0104
            X.9by r0 = new X.9by     // Catch:{ all -> 0x0126 }
            r0.<init>()     // Catch:{ all -> 0x0126 }
            r4.A02 = r0     // Catch:{ all -> 0x0126 }
        L_0x0104:
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x0126 }
            r0.put(r3, r1)     // Catch:{ all -> 0x0126 }
            java.lang.Object r1 = r2.A01     // Catch:{ all -> 0x0126 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0126 }
            X.9by r0 = r4.A02     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x0118
            X.9by r0 = new X.9by     // Catch:{ all -> 0x0126 }
            r0.<init>()     // Catch:{ all -> 0x0126 }
            r4.A02 = r0     // Catch:{ all -> 0x0126 }
        L_0x0118:
            java.util.Map r0 = r0.A01     // Catch:{ all -> 0x0126 }
            r0.put(r3, r1)     // Catch:{ all -> 0x0126 }
            goto L_0x00db
        L_0x011e:
            r11 = r1
            if (r1 == 0) goto L_0x0124
        L_0x0121:
            r12.A0H(r4)     // Catch:{ all -> 0x0126 }
        L_0x0124:
            monitor-exit(r12)
            return r11
        L_0x0126:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass16S.A0I(com.whatsapp.jid.UserJid, java.lang.Boolean, java.lang.String, java.util.HashMap, java.util.HashMap):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.8bA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: X.8b4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: X.8bB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: X.8bA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: X.8b2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: X.8bA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: X.8bA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: X.8bA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: X.8b9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: X.8b4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: X.8bB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: X.8bA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: X.8bA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: X.8b4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: X.8bA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: X.8bA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: X.8bA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: X.8bA} */
    /* JADX WARNING: type inference failed for: r4v19, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C207249un A00(android.database.Cursor r21, X.AnonymousClass16S r22) {
        /*
            java.lang.String r0 = "country"
            r9 = r21
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r13 = r9.getString(r0)
            java.lang.String r0 = "type"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r16 = r9.getInt(r0)
            java.lang.String r0 = "credential_id"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r10 = r9.getString(r0)
            X.9l8 r8 = X.C202159l8.A00(r13)
            java.lang.String r0 = "country_data"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r11 = r9.getString(r0)
            java.lang.String r0 = "readable_name"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r7 = r9.getString(r0)
            java.lang.String r0 = "issuer_name"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r6 = r9.getString(r0)
            java.lang.String r0 = "subtype"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r21 = r9.getInt(r0)
            java.lang.String r0 = "creation_ts"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r0 = r9.getInt(r0)
            long r0 = (long) r0
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            java.lang.String r2 = "updated_ts"
            int r2 = r9.getColumnIndexOrThrow(r2)
            int r2 = r9.getInt(r2)
            long r2 = (long) r2
            long r2 = r2 * r4
            java.lang.String r4 = "debit_mode"
            int r4 = r9.getColumnIndexOrThrow(r4)
            int r15 = r9.getInt(r4)
            java.lang.String r4 = "credit_mode"
            int r4 = r9.getColumnIndexOrThrow(r4)
            int r14 = r9.getInt(r4)
            java.lang.String r4 = "p2m_debit_mode"
            int r4 = r9.getColumnIndexOrThrow(r4)
            int r19 = r9.getInt(r4)
            java.lang.String r4 = "p2m_credit_mode"
            int r4 = r9.getColumnIndexOrThrow(r4)
            int r20 = r9.getInt(r4)
            java.lang.String r4 = "icon"
            int r4 = r9.getColumnIndexOrThrow(r4)
            byte[] r5 = r9.getBlob(r4)
            r17 = r22
            r4 = r17
            com.whatsapp.payments.PaymentConfiguration r12 = r4.A01
            r4 = 0
            X.9e3 r12 = r12.A00(r13)
            if (r12 == 0) goto L_0x00ad
            X.B66 r12 = X.C198699e3.A00(r12)
        L_0x00a9:
            switch(r16) {
                case 1: goto L_0x016f;
                case 2: goto L_0x014e;
                case 3: goto L_0x0108;
                case 4: goto L_0x016f;
                case 5: goto L_0x00cb;
                case 6: goto L_0x016f;
                case 7: goto L_0x016f;
                case 8: goto L_0x016f;
                case 9: goto L_0x00af;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            return r4
        L_0x00ad:
            r12 = 0
            goto L_0x00a9
        L_0x00af:
            if (r12 == 0) goto L_0x00c8
            X.8b9 r4 = r12.BKW()
            if (r4 == 0) goto L_0x00c8
            r4.A06(r11)
            java.lang.String r0 = r4.A02
        L_0x00bc:
            X.8b3 r11 = new X.8b3
            r1 = r11
            r2 = r8
            r3 = r4
            r4 = r0
            r5 = r10
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r11
        L_0x00c8:
            java.lang.String r0 = ""
            goto L_0x00bc
        L_0x00cb:
            if (r12 == 0) goto L_0x0102
            X.8bE r5 = r12.BKX()
            if (r5 == 0) goto L_0x0100
            r5.A06(r11)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x00e2
            java.util.List r0 = r17.A0D()
            r5.A0D = r0
        L_0x00e2:
            java.lang.String r3 = r5.A09
            boolean r2 = r5.A0E
            boolean r1 = r5.A0F
            java.lang.String r4 = r5.A08
            int r0 = r5.A00
        L_0x00ec:
            X.8b1 r11 = new X.8b1
            r12 = r8
            r13 = r5
            r14 = r10
            r15 = r4
            r16 = r3
            r17 = r7
            r18 = r0
            r19 = r2
            r20 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r11
        L_0x0100:
            r3 = r4
            goto L_0x0104
        L_0x0102:
            r3 = r4
            r5 = r4
        L_0x0104:
            r2 = 0
            r1 = 0
            r0 = 0
            goto L_0x00ec
        L_0x0108:
            java.lang.String r0 = "balance_1000"
            int r0 = r9.getColumnIndexOrThrow(r0)
            long r0 = r9.getLong(r0)
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r0)
            r0 = -3
            java.math.BigDecimal r2 = r2.scaleByPowerOfTen(r0)
            java.lang.String r0 = "balance_ts"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r1 = r9.getInt(r0)
            if (r12 == 0) goto L_0x0136
            X.8b8 r0 = r12.BKZ()
            if (r0 == 0) goto L_0x0136
            java.lang.String r1 = "fromDBString"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0136:
            X.8b2 r11 = new X.8b2
            r11.<init>(r8, r4, r15, r14)
            r11.A0A = r10
            r11.A0E(r7)
            r11.A0F(r8, r2)
            r11.A08 = r4
            r11.A0B = r6
            long r2 = (long) r1
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r11.A00 = r2
            goto L_0x0192
        L_0x014e:
            if (r12 == 0) goto L_0x0159
            X.8bA r4 = r12.BKT()
            if (r4 == 0) goto L_0x0159
            r4.A06(r11)
        L_0x0159:
            X.8az r11 = new X.8az
            r12 = r8
            r13 = r15
            r15 = r0
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r17)
            r11.A0A = r10
            r11.A0E(r7)
            r11.A0B = r6
            r11.A0D = r5
            r11.A08 = r4
            return r11
        L_0x016f:
            if (r12 == 0) goto L_0x0198
            X.8bB r4 = r12.BKU()
            if (r4 == 0) goto L_0x0198
            r4.A06(r11)
            X.6c7 r2 = r4.A08
            if (r2 != 0) goto L_0x0195
            r2 = 0
        L_0x017f:
            java.lang.String r2 = (java.lang.String) r2
        L_0x0181:
            X.8b4 r11 = new X.8b4
            r17 = r15
            r18 = r14
            r14 = r2
            r15 = r7
            r13 = r10
            r12 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r11.A05 = r0
            r11.A08 = r4
        L_0x0192:
            r11.A0D = r5
            return r11
        L_0x0195:
            java.lang.Object r2 = r2.A00
            goto L_0x017f
        L_0x0198:
            r2 = 0
            goto L_0x0181
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass16S.A00(android.database.Cursor, X.16S):X.9un");
    }

    public static void A03(Cursor cursor, C175728ax r4, UserJid userJid) {
        r4.A04 = userJid;
        boolean z = true;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("merchant")) != 1) {
            z = false;
        }
        r4.A0B(z);
        C175728ax.A02(r4).A00 = cursor.getLong(cursor.getColumnIndexOrThrow("consumer_status"));
        r4.A09(cursor.getInt(cursor.getColumnIndexOrThrow("default_payment_type")));
        r4.A06(cursor.getString(cursor.getColumnIndexOrThrow("country_data")));
    }

    public C207249un A07(String str) {
        Cursor A092;
        C207249un r0;
        AnonymousClass1M0 A032 = this.A00.get();
        try {
            A092 = A032.A02.A09(AnonymousClass9B4.A00, "readPaymentMethodByCredId/QUERY_SCHEMA_PAY_METHODS", new String[]{str});
            if (A092.moveToLast()) {
                r0 = A00(A092, this);
            } else {
                r0 = null;
            }
            A092.close();
            A032.close();
            return r0;
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

    public ArrayList A08() {
        Cursor A092;
        ArrayList arrayList = new ArrayList();
        AnonymousClass1M0 A032 = this.A00.get();
        try {
            A092 = A032.A02.A09(AnonymousClass9B4.A01, "readMerchantMethods/QUERY_SCHEMA_PAY_METHODS", new String[]{String.valueOf(5)});
            while (A092.moveToNext()) {
                C207249un A002 = A00(A092, this);
                if (A002 != null) {
                    arrayList.add((C175768b1) A002);
                }
            }
            A092.close();
            A032.close();
            return arrayList;
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

    public ArrayList A09() {
        Cursor A092;
        ArrayList arrayList = new ArrayList();
        AnonymousClass1M0 A032 = this.A00.get();
        try {
            A092 = A032.A02.A09(AnonymousClass9B4.A03, "readPaymentAndMerchantMethods/QUERY_SCHEMA_PAY_METHODS", (String[]) null);
            while (A092.moveToNext()) {
                C207249un A002 = A00(A092, this);
                if (A002 != null) {
                    arrayList.add(A002);
                }
            }
            A092.close();
            A032.close();
            return arrayList;
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

    public ArrayList A0A() {
        Cursor A092;
        ArrayList arrayList = new ArrayList();
        AnonymousClass1M0 A032 = this.A00.get();
        try {
            A092 = A032.A02.A09(AnonymousClass9B4.A02, "readPaymentMethods/QUERY_SCHEMA_PAY_METHODS", new String[]{String.valueOf(5), String.valueOf(9)});
            while (A092.moveToNext()) {
                C207249un A002 = A00(A092, this);
                if (A002 != null) {
                    arrayList.add(A002);
                }
            }
            A092.close();
            A032.close();
            return arrayList;
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

    public void A0E(C175708av r9, String str) {
        Cursor A092;
        AnonymousClass1M0 A032 = this.A00.get();
        try {
            A092 = A032.A02.A09(AnonymousClass99d.A00, "readPaymentTransactionTmpInfo/QUERY_SCHEMA_PAY_TRANSACTIONS_TMP", new String[]{str});
            while (A092.moveToNext()) {
                String string = A092.getString(A092.getColumnIndexOrThrow("tmp_metadata"));
                long j = ((long) A092.getInt(A092.getColumnIndexOrThrow("tmp_ts"))) * 1000;
                r9.A0P(str);
                r9.A06(string);
                if (j > -1) {
                    r9.A0M(j);
                }
            }
            A092.close();
            A032.close();
            return;
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

    public boolean A0G() {
        AnonymousClass1M0 A042 = this.A00.A04();
        try {
            int A032 = A042.A02.A03("methods", (String) null, "removeAllPaymentMethods/DELETE_SCHEMA_PAY_METHODS", (String[]) null);
            if (A032 >= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("PAY: PaymentStore removeAllPaymentMethods deleted num rows: ");
                sb.append(A032);
                Log.i(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("PAY: PaymentStore removeAllPaymentMethods could not delete all rows: ");
                sb2.append(A032);
                Log.w(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("PAY: PaymentStore removeAllPaymentMethods deleted num payout rows: ");
            sb3.append(0);
            Log.i(sb3.toString());
            boolean z = false;
            if (A032 >= 0) {
                z = true;
            }
            A042.close();
            return z;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public synchronized boolean A0H(C175728ax r24) {
        C1495671s B1k;
        boolean z;
        long j;
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(r24);
            AnonymousClass1M0 A042 = this.A00.A04();
            try {
                B1k = A042.B1k();
                Iterator it = arrayList.iterator();
                long j2 = 0;
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    C175728ax r12 = (C175728ax) it.next();
                    UserJid userJid = r12.A04;
                    if (userJid != null) {
                        C175728ax A052 = A05(userJid);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("jid", userJid.getRawString());
                        contentValues.put("country_data", r12.A05());
                        int i = 0;
                        if (r12.A0C()) {
                            i = 1;
                        }
                        contentValues.put("merchant", Integer.valueOf(i));
                        contentValues.put("consumer_status", Long.valueOf(C175728ax.A02(r12).A00));
                        contentValues.put("default_payment_type", Integer.valueOf(r12.A07()));
                        if (A052 == null || A052.A04 == null) {
                            j = A042.A02.A04("contacts", "storeContacts/INSERT_SCHEMA_PAY_CONTACTS_TABLE", contentValues);
                        } else {
                            C224114e r7 = A042.A02;
                            C224114e r17 = r7;
                            j = (long) r17.A01(contentValues, "contacts", "jid=?", "storeContacts/UPDATE_SCHEMA_PAY_CONTACTS", new String[]{userJid.getRawString()});
                        }
                        if (j < 0) {
                            z = false;
                        }
                        j2 += z ? 1 : 0;
                    }
                }
                B1k.A00();
                B1k.close();
                A042.close();
                StringBuilder sb = new StringBuilder();
                sb.append("PAY: PaymentStore storeContacts stored: ");
                sb.append(j2);
                sb.append(" rows with contacts size: ");
                sb.append(arrayList.size());
                Log.i(sb.toString());
                if (j2 != ((long) arrayList.size())) {
                    z = false;
                }
            } catch (Throwable th) {
                try {
                    A042.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return z;
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c2 A[Catch:{ all -> 0x0204, all -> 0x0209, all -> 0x020e }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d3 A[Catch:{ all -> 0x0204, all -> 0x0209, all -> 0x020e }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0132 A[Catch:{ all -> 0x0204, all -> 0x0209, all -> 0x020e }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0151 A[Catch:{ all -> 0x0204, all -> 0x0209, all -> 0x020e }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015a A[Catch:{ all -> 0x0204, all -> 0x0209, all -> 0x020e }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0161 A[Catch:{ all -> 0x0204, all -> 0x0209, all -> 0x020e }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0175 A[Catch:{ all -> 0x0204, all -> 0x0209, all -> 0x020e }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0183 A[Catch:{ all -> 0x0204, all -> 0x0209, all -> 0x020e }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01a9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0J(java.util.List r30) {
        /*
            r29 = this;
            r24 = 0
            r28 = r30
            int r0 = r28.size()
            if (r0 > 0) goto L_0x0021
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "PAY: PaymentStore storePaymentMethods got newMethods: "
            r1.append(r0)
            r0 = r28
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r24
        L_0x0021:
            r0 = r29
            java.util.ArrayList r23 = r0.A09()
            X.54d r0 = r0.A00
            X.1M0 r9 = r0.A04()
            X.71s r22 = r9.B1k()     // Catch:{ all -> 0x020e }
            java.util.Iterator r21 = r28.iterator()     // Catch:{ all -> 0x0204 }
            r20 = 0
        L_0x0037:
            boolean r0 = r21.hasNext()     // Catch:{ all -> 0x0204 }
            if (r0 == 0) goto L_0x01c4
            java.lang.Object r13 = r21.next()     // Catch:{ all -> 0x0204 }
            X.9un r13 = (X.C207249un) r13     // Catch:{ all -> 0x0204 }
            java.lang.String r12 = r13.A0A     // Catch:{ all -> 0x0204 }
            X.9l8 r0 = r13.A07     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x0204 }
            r15 = r0
            X.6c7 r0 = r13.A09     // Catch:{ all -> 0x0204 }
            r16 = r0
            java.lang.String r0 = r13.A0B     // Catch:{ all -> 0x0204 }
            r27 = r0
            long r6 = r13.A05     // Catch:{ all -> 0x0204 }
            long r4 = r13.A06     // Catch:{ all -> 0x0204 }
            X.8bF r0 = r13.A08     // Catch:{ all -> 0x0204 }
            if (r0 == 0) goto L_0x005f
            java.lang.String r14 = r0.A05()     // Catch:{ all -> 0x0204 }
            goto L_0x0060
        L_0x005f:
            r14 = 0
        L_0x0060:
            if (r12 == 0) goto L_0x0184
            if (r16 == 0) goto L_0x0184
            int r11 = r13.A09()     // Catch:{ all -> 0x0204 }
            int r0 = r13.A01     // Catch:{ all -> 0x0204 }
            r26 = r0
            int r0 = r13.A00     // Catch:{ all -> 0x0204 }
            r25 = r0
            r1 = 3
            r18 = 0
            r0 = 1
            if (r11 == r0) goto L_0x0077
            goto L_0x007f
        L_0x0077:
            r0 = r13
            X.8b4 r0 = (X.C175798b4) r0     // Catch:{ all -> 0x0204 }
            int r10 = r0.A01     // Catch:{ all -> 0x0204 }
            r2 = 0
            goto L_0x0091
        L_0x007f:
            if (r11 == r1) goto L_0x0093
            r0 = 4
            if (r11 == r0) goto L_0x0077
            r0 = 6
            if (r11 == r0) goto L_0x0077
            r0 = 7
            if (r11 == r0) goto L_0x0077
            r0 = 8
            if (r11 == r0) goto L_0x0077
            r2 = 0
            r10 = 0
        L_0x0091:
            r8 = 0
            goto L_0x00a7
        L_0x0093:
            r1 = r13
            X.8b2 r1 = (X.C175778b2) r1     // Catch:{ all -> 0x0204 }
            X.16X r0 = r1.A01     // Catch:{ all -> 0x0204 }
            if (r0 == 0) goto L_0x012d
            boolean r0 = r0.A02()     // Catch:{ all -> 0x0204 }
            if (r0 == 0) goto L_0x012d
            X.16X r0 = r1.A01     // Catch:{ all -> 0x0204 }
            java.math.BigDecimal r8 = r0.A00     // Catch:{ all -> 0x0204 }
        L_0x00a4:
            long r2 = r1.A00     // Catch:{ all -> 0x0204 }
            r10 = 0
        L_0x00a7:
            r0 = r23
            X.9un r17 = A01(r12, r0)     // Catch:{ all -> 0x0204 }
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x0204 }
            r1.<init>()     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "credential_id"
            r1.put(r0, r12)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "country"
            r1.put(r0, r15)     // Catch:{ all -> 0x0204 }
            boolean r0 = X.C202349ld.A02(r16)     // Catch:{ all -> 0x0204 }
            if (r0 != 0) goto L_0x00cd
            r0 = r16
            java.lang.Object r15 = r0.A00     // Catch:{ all -> 0x0204 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "readable_name"
            r1.put(r0, r15)     // Catch:{ all -> 0x0204 }
        L_0x00cd:
            boolean r0 = android.text.TextUtils.isEmpty(r27)     // Catch:{ all -> 0x0204 }
            if (r0 != 0) goto L_0x00da
            java.lang.String r15 = "issuer_name"
            r0 = r27
            r1.put(r15, r0)     // Catch:{ all -> 0x0204 }
        L_0x00da:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "type"
            r1.put(r0, r15)     // Catch:{ all -> 0x0204 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "subtype"
            r1.put(r0, r10)     // Catch:{ all -> 0x0204 }
            r15 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r15
            int r0 = (int) r6     // Catch:{ all -> 0x0204 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "creation_ts"
            r1.put(r0, r6)     // Catch:{ all -> 0x0204 }
            long r4 = r4 / r15
            int r0 = (int) r4     // Catch:{ all -> 0x0204 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "updated_ts"
            r1.put(r0, r4)     // Catch:{ all -> 0x0204 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r26)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "debit_mode"
            r1.put(r0, r4)     // Catch:{ all -> 0x0204 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r25)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "credit_mode"
            r1.put(r0, r4)     // Catch:{ all -> 0x0204 }
            int r0 = r13.A03     // Catch:{ all -> 0x0204 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "p2m_debit_mode"
            r1.put(r0, r4)     // Catch:{ all -> 0x0204 }
            int r0 = r13.A02     // Catch:{ all -> 0x0204 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "p2m_credit_mode"
            r1.put(r0, r4)     // Catch:{ all -> 0x0204 }
            goto L_0x0130
        L_0x012d:
            r8 = 0
            goto L_0x00a4
        L_0x0130:
            if (r8 == 0) goto L_0x014f
            r0 = 3
            java.math.BigDecimal r0 = r8.scaleByPowerOfTen(r0)     // Catch:{ all -> 0x0204 }
            long r4 = r0.longValue()     // Catch:{ all -> 0x0204 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "balance_1000"
            r1.put(r0, r4)     // Catch:{ all -> 0x0204 }
            long r2 = r2 / r15
            int r0 = (int) r2     // Catch:{ all -> 0x0204 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "balance_ts"
            r1.put(r0, r2)     // Catch:{ all -> 0x0204 }
        L_0x014f:
            if (r14 == 0) goto L_0x0156
            java.lang.String r0 = "country_data"
            r1.put(r0, r14)     // Catch:{ all -> 0x0204 }
        L_0x0156:
            byte[] r2 = r13.A0D     // Catch:{ all -> 0x0204 }
            if (r2 == 0) goto L_0x015f
            java.lang.String r0 = "icon"
            r1.put(r0, r2)     // Catch:{ all -> 0x0204 }
        L_0x015f:
            if (r17 == 0) goto L_0x0175
            X.14e r2 = r9.A02     // Catch:{ all -> 0x0204 }
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0204 }
            r0[r24] = r12     // Catch:{ all -> 0x0204 }
            java.lang.String r4 = "methods"
            java.lang.String r5 = "credential_id=?"
            java.lang.String r6 = "storePaymentMethods/UPDATE_SCHEMA_PAY_METHODS"
            r3 = r1
            r7 = r0
            int r2 = r2.A01(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0204 }
            goto L_0x0181
        L_0x0175:
            X.14e r3 = r9.A02     // Catch:{ all -> 0x0204 }
            java.lang.String r2 = "methods"
            java.lang.String r0 = "storePaymentMethods/INSERT_SCHEMA_PAY_METHODS_TABLE"
            long r0 = r3.A04(r2, r0, r1)     // Catch:{ all -> 0x0204 }
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
        L_0x0181:
            if (r2 < 0) goto L_0x01a9
            goto L_0x0186
        L_0x0184:
            r2 = 0
            goto L_0x019b
        L_0x0186:
            r2 = 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0204 }
            r1.<init>()     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "PAY: PaymentStore storePaymentMethods stored account type: "
            r1.append(r0)     // Catch:{ all -> 0x0204 }
            r1.append(r11)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0204 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0204 }
        L_0x019b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0204 }
            if (r0 == 0) goto L_0x01bd
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0204 }
            r20 = r20 | r0
            goto L_0x0037
        L_0x01a9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0204 }
            r1.<init>()     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "PAY: PaymentStore storePaymentMethods could not store: "
            r1.append(r0)     // Catch:{ all -> 0x0204 }
            r1.append(r11)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0204 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0204 }
        L_0x01bd:
            r22.close()     // Catch:{ all -> 0x020e }
            r9.close()
            return r24
        L_0x01c4:
            java.util.Iterator r5 = r23.iterator()     // Catch:{ all -> 0x0204 }
        L_0x01c8:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0204 }
            if (r0 == 0) goto L_0x01fa
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x0204 }
            X.9un r2 = (X.C207249un) r2     // Catch:{ all -> 0x0204 }
            java.lang.String r1 = r2.A0A     // Catch:{ all -> 0x0204 }
            r0 = r28
            X.9un r0 = A01(r1, r0)     // Catch:{ all -> 0x0204 }
            if (r0 != 0) goto L_0x01c8
            java.lang.String r1 = r2.A0A     // Catch:{ all -> 0x0204 }
            java.lang.String r4 = "storePaymentMethods/DELETE_SCHEMA_PAY_METHODS"
            X.14e r3 = r9.A02     // Catch:{ all -> 0x0204 }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0204 }
            r2[r24] = r1     // Catch:{ all -> 0x0204 }
            java.lang.String r1 = "methods"
            java.lang.String r0 = "credential_id=?"
            int r1 = r3.A03(r1, r0, r4, r2)     // Catch:{ all -> 0x0204 }
            r0 = 0
            if (r1 <= 0) goto L_0x01f5
            r0 = 1
        L_0x01f5:
            r0 = r0 | r20
            r20 = r0
            goto L_0x01c8
        L_0x01fa:
            r22.A00()     // Catch:{ all -> 0x0204 }
            r22.close()     // Catch:{ all -> 0x020e }
            r9.close()
            return r20
        L_0x0204:
            r1 = move-exception
            r22.close()     // Catch:{ all -> 0x0209 }
            goto L_0x020d
        L_0x0209:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x020e }
        L_0x020d:
            throw r1     // Catch:{ all -> 0x020e }
        L_0x020e:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0213 }
            throw r1
        L_0x0213:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass16S.A0J(java.util.List):boolean");
    }

    public AnonymousClass16S(C19700wN r1, C19970wo r2, C19630wG r3, AnonymousClass16T r4, AnonymousClass11g r5, AnonymousClass12S r6, C20810yC r7) {
        C18740tg.A06(r3);
        this.A04 = r3;
        this.A07 = r7;
        this.A02 = r1;
        C18740tg.A06(r2);
        this.A03 = r2;
        this.A06 = r6;
        this.A05 = r5;
        this.A08 = r4;
    }

    public static C207249un A01(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C207249un r1 = (C207249un) it.next();
            if (str.equals(r1.A0A)) {
                return r1;
            }
        }
        return null;
    }

    public static C207249un A02(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C207249un r2 = (C207249un) it.next();
            if (r2.A01 == 2) {
                return r2;
            }
        }
        return null;
    }

    public C207249un A06() {
        Iterator it = A0A().iterator();
        while (it.hasNext()) {
            C207249un r2 = (C207249un) it.next();
            if (r2.A01 == 2) {
                return r2;
            }
        }
        return null;
    }
}
