package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.PaymentConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1Ed  reason: invalid class name and case insensitive filesystem */
public class C24881Ed {
    public static final String[] A0A = {"message_row_id", "remote_jid_row_id", "key_id", "interop_id", PublicKeyCredentialControllerUtility.JSON_KEY_ID, "timestamp", "init_timestamp", "status", "error_code", "sender_jid_row_id", "receiver_jid_row_id", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "currency_code", "amount_1000", "credential_id", "methods", "bank_transaction_id", "request_key_id", "metadata", "country", "version", "future_data", "service_id", "background_id", "purchase_initiator"};
    public PaymentConfiguration A00;
    public final C19970wo A01;
    public final C219712j A02;
    public final AnonymousClass12P A03;
    public final C24611Dc A04 = C24611Dc.A00("PaymentTransactionStore", "database", "COMMON");
    public final C19730wQ A05;
    public final C219612i A06;
    public final AnonymousClass16T A07;
    public final AnonymousClass16S A08;
    public final C24891Ee A09;

    public static int A00(ContentValues contentValues, C26911Lz r7, C202319lY r8) {
        return ((AnonymousClass1M0) r7).A02.A01(contentValues, "pay_transaction", "id=?", "expireOldPendingRequestsV2/UPDATE_PAY_TRANSACTION", new String[]{r8.A0K});
    }

    public static Cursor A01(C24881Ed r10, Integer num) {
        String str;
        String num2 = Integer.toString(20);
        String[] strArr = {num2, Integer.toString(12), Integer.toString(40), num2, "%\"isPendingRequestViewed\":true%"};
        AnonymousClass1M0 A042 = r10.A03.get();
        try {
            C224114e r3 = A042.A02;
            String[] strArr2 = A0A;
            if (num != null) {
                str = num.toString();
            } else {
                str = null;
            }
            Cursor A0A2 = r3.A0A("pay_transaction", strArr2, "((type=? AND status=?) OR (type=? AND status=?)) AND metadata NOT LIKE ?", strArr, (String) null, (String) null, str, "getUnviewedPendingRequestsCursor/QUERY_PAY_TRANSACTION");
            A042.close();
            return A0A2;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    private Pair A02() {
        String l = Long.toString(this.A02.A07(A0A(this)));
        Pair pair = new Pair(new String[]{l, l}, "( sender_jid_row_id=? OR receiver_jid_row_id=? )");
        StringBuilder sb = new StringBuilder();
        sb.append("( type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR (type=? AND ");
        sb.append((String) pair.second);
        sb.append(") OR (");
        sb.append(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        sb.append("=? AND ");
        sb.append("status");
        sb.append("!=? AND ");
        sb.append("status");
        sb.append("!=?) OR (");
        sb.append(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        sb.append("=? AND (");
        sb.append("status");
        sb.append("=? OR ");
        sb.append("status");
        sb.append("=? OR ");
        sb.append("status");
        sb.append("=?)) OR (");
        sb.append(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        sb.append("=? AND ");
        sb.append("status");
        sb.append("!=? AND ");
        sb.append("status");
        sb.append("!=? AND ");
        sb.append("status");
        sb.append("!=?))");
        String obj = sb.toString();
        Pair pair2 = new Pair(new String[0], (Object) null);
        String[] strArr = (String[]) pair2.first;
        Object obj2 = pair2.second;
        if (obj2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(" AND ");
            sb2.append((String) obj2);
            obj = sb2.toString();
        }
        boolean z = !TextUtils.isEmpty((CharSequence) null);
        if (z) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append(" AND credential_id=?");
            obj = sb3.toString();
        }
        int length = strArr.length;
        String[] strArr2 = new String[((z ? 1 : 0) + true + length)];
        int i = 0;
        strArr2[0] = Integer.toString(1);
        strArr2[1] = Integer.toString(2);
        strArr2[2] = Integer.toString(100);
        strArr2[3] = Integer.toString(6);
        strArr2[4] = Integer.toString(7);
        strArr2[5] = Integer.toString(8);
        strArr2[6] = Integer.toString(9);
        strArr2[7] = Integer.toString(1000);
        String[] strArr3 = (String[]) pair.first;
        strArr2[8] = strArr3[0];
        strArr2[9] = strArr3[1];
        strArr2[10] = Integer.toString(20);
        String num = Integer.toString(12);
        strArr2[11] = num;
        String num2 = Integer.toString(17);
        strArr2[12] = num2;
        strArr2[13] = Integer.toString(40);
        strArr2[14] = Integer.toString(415);
        strArr2[15] = Integer.toString(15);
        strArr2[16] = Integer.toString(16);
        strArr2[17] = Integer.toString(10);
        strArr2[18] = num;
        strArr2[19] = Integer.toString(19);
        strArr2[20] = num2;
        int i2 = 21;
        while (i < length) {
            strArr2[i2] = strArr[i];
            i++;
            i2++;
        }
        if (z) {
            strArr2[i2] = null;
        }
        return new Pair(obj, strArr2);
    }

    public static Pair A03() {
        String num = Integer.toString(12);
        return new Pair("((type=? AND status=?) OR (type=? AND (status=? OR status=?)))", new String[]{Integer.toString(20), num, Integer.toString(10), num, Integer.toString(19)});
    }

    public static Pair A05(C24881Ed r12, AnonymousClass11F r13) {
        Pair A022 = r12.A02();
        Pair A032 = A03();
        Pair pair = new Pair(new String[0], (Object) null);
        Pair A042 = A04(A032, new Pair(pair.second, pair.first), "AND");
        String[] strArr = new String[(((String[]) A022.second).length + 1 + ((String[]) A042.second).length)];
        long A072 = r12.A02.A07(r13);
        if (A072 != -1) {
            strArr[0] = String.valueOf(A072);
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append("remote_jid_row_id=?");
            sb.append(" AND (");
            sb.append((String) A022.first);
            sb.append(" OR ");
            sb.append((String) A042.first);
            sb.append("))");
            String obj = sb.toString();
            Object obj2 = A022.second;
            System.arraycopy(obj2, 0, strArr, 1, ((String[]) obj2).length);
            Object obj3 = A042.second;
            System.arraycopy(obj3, 0, strArr, ((String[]) A022.second).length + 1, ((String[]) obj3).length);
            return new Pair(obj, strArr);
        }
        C24611Dc r2 = r12.A04;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getPendingRequestsAndTransactionsQueryAndParams/no row id for jid/jid=");
        sb2.append(r13.getRawString());
        r2.A05(sb2.toString());
        return null;
    }

    public static ArrayList A0C(C24881Ed r12, AnonymousClass11F r13, int i) {
        Pair A052;
        String str;
        Cursor A0A2;
        ArrayList arrayList;
        if (r13 == null) {
            A052 = r12.A02();
        } else {
            A052 = A05(r12, r13);
        }
        if (A052 == null) {
            r12.A04.A05("readTransactionsV2/null queryPair");
            return new ArrayList();
        }
        String str2 = (String) A052.first;
        String[] strArr = (String[]) A052.second;
        if (i > 0) {
            str = Integer.toString(i);
        } else {
            str = "";
        }
        AnonymousClass1M0 A042 = r12.A03.get();
        try {
            A0A2 = A042.A02.A0A("pay_transaction", A0A, str2, strArr, (String) null, "init_timestamp DESC", str, "readTransactionsV2/QUERY_PAY_TRANSACTION");
            if (A0A2 != null) {
                arrayList = A0B(A0A2, r12, "readTransactionsV2");
                C24611Dc r3 = r12.A04;
                StringBuilder sb = new StringBuilder();
                sb.append("readTransactionsV2 returned: ");
                sb.append(arrayList.size());
                C24611Dc.A02(r3, (String) null, sb.toString());
                A0A2.close();
            } else {
                arrayList = new ArrayList();
            }
            A042.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public static synchronized ArrayList A0D(C24881Ed r13, boolean z) {
        List<C202319lY> list;
        ArrayList arrayList;
        C1495671s B1k;
        synchronized (r13) {
            long A002 = C19970wo.A00(r13.A01);
            if (z) {
                int[] iArr = C202319lY.A0T;
                int[] iArr2 = C202319lY.A0U;
                ArrayList arrayList2 = new ArrayList(7);
                for (int i = 0; i < 4; i++) {
                    arrayList2.add(Integer.valueOf(iArr[i]));
                }
                for (int i2 = 0; i2 < 3; i2++) {
                    arrayList2.add(Integer.valueOf(iArr2[i2]));
                }
                list = r13.A0U((Integer[]) arrayList2.toArray(new Integer[0]), new Integer[]{2, 200, 20, 10}, -1);
            } else {
                list = r13.A0S(-1);
            }
            arrayList = new ArrayList();
            try {
                AnonymousClass1M0 A052 = r13.A03.A05();
                try {
                    B1k = A052.B1k();
                    for (C202319lY r6 : list) {
                        ContentValues contentValues = new ContentValues();
                        Pair A072 = A07(r6.A0L, r6.A0K);
                        if (A072 != null) {
                            contentValues.put("status", 0);
                            contentValues.put("timestamp", Integer.valueOf((int) (A002 / 1000)));
                            C24611Dc r2 = r13.A04;
                            StringBuilder sb = new StringBuilder();
                            sb.append("failed transaction/key_id=");
                            sb.append(r6.A0L);
                            sb.append(", transaction_id=");
                            sb.append(r6.A0K);
                            r2.A06(sb.toString());
                            A0F(contentValues, A072, A052);
                            arrayList.add(new C64933Qa(r6.A0C, r6.A0L, r6.A0Q));
                        }
                    }
                    B1k.A00();
                    B1k.close();
                    A052.close();
                } catch (Throwable th) {
                    A052.close();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                C24611Dc r22 = r13.A04;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("PaymentTransactionStore/failPendingTransactions/failed: ");
                sb2.append(e);
                r22.A05(sb2.toString());
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return arrayList;
        throw th;
    }

    private synchronized ArrayList A0E(String str, String[] strArr, int i) {
        String str2;
        Cursor A0A2;
        ArrayList A0B;
        synchronized (this) {
            if (i > 0) {
                str2 = Integer.toString(i);
            } else {
                str2 = "";
            }
            try {
                AnonymousClass1M0 A042 = this.A03.get();
                try {
                    A0A2 = A042.A02.A0A("pay_transaction", A0A, str, strArr, (String) null, "init_timestamp DESC", str2, "readPendingRequestsV2/QUERY_PAY_TRANSACTION");
                    A0B = A0B(A0A2, this, "queryPaymentTransactionInfosV2");
                    C24611Dc r4 = this.A04;
                    StringBuilder sb = new StringBuilder();
                    sb.append("readPendingRequests returned: ");
                    sb.append(A0B.size());
                    C24611Dc.A02(r4, (String) null, sb.toString());
                    if (A0A2 != null) {
                        A0A2.close();
                    }
                    A042.close();
                } catch (Throwable th) {
                    A042.close();
                    throw th;
                }
            } catch (IllegalStateException e) {
                this.A04.A0A("queryPaymentTransactionInfosV2/IllegalStateException ", e);
                return new ArrayList();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return A0B;
        throw th;
    }

    public C202319lY A0J(String str) {
        Cursor A0A2;
        boolean z = true;
        String str2 = str;
        String[] strArr = {str};
        AnonymousClass1M0 A042 = this.A03.get();
        try {
            A0A2 = A042.A02.A0A("pay_transaction", A0A, "request_key_id=?", strArr, (String) null, (String) null, (String) null, "readTransactionInfoByRequestMessageId/QUERY_PAY_TRANSACTION");
            C202319lY r3 = null;
            if (A0A2.moveToLast()) {
                r3 = A09(A0A2, this);
            }
            A0A2.close();
            A042.close();
            C24611Dc r2 = this.A04;
            StringBuilder sb = new StringBuilder();
            sb.append("readTransactionInfoByRequestMessageId/");
            sb.append(str2);
            sb.append("/");
            if (r3 == null) {
                z = false;
            }
            sb.append(z);
            r2.A06(sb.toString());
            return r3;
        } catch (C19740wR e) {
            this.A04.A0A("PaymentTransactionStore/readTransactionInfoByRequestMessageId/InvalidJidException - Cannot read TransactionInfo from a message with invalid JID", e);
            A0A2.close();
            A042.close();
            return null;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C202319lY A0K(java.lang.String r14) {
        /*
            r13 = this;
            r3 = 1
            java.lang.String[] r8 = new java.lang.String[r3]
            r0 = 0
            r8[r0] = r14
            X.12P r0 = r13.A03
            X.1M0 r2 = r0.get()
            X.14e r4 = r2.A02     // Catch:{ all -> 0x0065 }
            java.lang.String r5 = "pay_transaction"
            java.lang.String[] r6 = A0A     // Catch:{ all -> 0x0065 }
            java.lang.String r7 = "id=?"
            r9 = 0
            java.lang.String r12 = "readTransactionInfoByTransId/QUERY_PAY_TRANSACTION"
            r11 = r9
            r10 = r9
            android.database.Cursor r5 = r4.A0A(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0065 }
            boolean r0 = r5.moveToLast()     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0030
            X.9lY r4 = A09(r5, r13)     // Catch:{ 0wR -> 0x0028 }
            goto L_0x0031
        L_0x0028:
            r4 = move-exception
            X.1Dc r1 = r13.A04     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = "PaymentTransactionStore/readTransactionInfoByTransId/InvalidJidException - Cannot read TransactionInfo from a message with invalid JID"
            r1.A0A(r0, r4)     // Catch:{ all -> 0x0059 }
        L_0x0030:
            r4 = 0
        L_0x0031:
            r5.close()     // Catch:{ all -> 0x0065 }
            r2.close()
            X.1Dc r2 = r13.A04
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "readTransactionInfoByTransId/"
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = "/"
            r1.append(r0)
            if (r4 != 0) goto L_0x004e
            r3 = 0
        L_0x004e:
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r2.A06(r0)
            return r4
        L_0x0059:
            r1 = move-exception
            if (r5 == 0) goto L_0x0064
            r5.close()     // Catch:{ all -> 0x0060 }
            goto L_0x0064
        L_0x0060:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0065 }
        L_0x0064:
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x006a }
            throw r1
        L_0x006a:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24881Ed.A0K(java.lang.String):X.9lY");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ac, code lost:
        if (r9 == null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d3, code lost:
        if (r2 != null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        if (r7 != null) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C202319lY A0L(java.lang.String r14, java.lang.String r15, long r16) {
        /*
            r13 = this;
            r2 = 0
            r9 = 0
            r3 = -1
            int r0 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x004c
            java.lang.String r0 = "message_row_id=?"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            X.3yS r1 = new X.3yS
            r1.<init>(r13)
            java.lang.String r0 = java.lang.Long.toString(r16)
            r1.add(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = " OR key_id=?"
            r3.append(r0)
            r1.add(r14)
        L_0x0029:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = " OR id=?"
            r3.append(r0)
            r1.add(r15)
        L_0x0037:
            java.lang.String r7 = r3.toString()
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r8 = r1.toArray(r0)
            java.lang.String[] r8 = (java.lang.String[]) r8
            if (r7 == 0) goto L_0x00ae
        L_0x0045:
            X.12P r0 = r13.A03
            X.1M0 r3 = r0.get()
            goto L_0x006a
        L_0x004c:
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            r1 = 1
            if (r0 != 0) goto L_0x005d
            r0 = 2
            java.lang.String[] r8 = new java.lang.String[r0]
            r8[r2] = r14
            r8[r1] = r14
            java.lang.String r7 = "key_id=? OR interop_id=?"
            goto L_0x0045
        L_0x005d:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x00ae
            java.lang.String[] r8 = new java.lang.String[r1]
            r8[r2] = r15
            java.lang.String r7 = "id=?"
            goto L_0x0045
        L_0x006a:
            X.14e r4 = r3.A02     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = "pay_transaction"
            java.lang.String[] r6 = A0A     // Catch:{ all -> 0x00a2 }
            java.lang.String r12 = "getMessagePaymentInfoV2/QUERY_PAY_TRANSACTION"
            r11 = r9
            r10 = r9
            android.database.Cursor r4 = r4.A0A(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00a2 }
            boolean r0 = r4.moveToLast()     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0092
            X.9lY r9 = A09(r4, r13)     // Catch:{ 0wR -> 0x0083 }
            goto L_0x0092
        L_0x0083:
            r2 = move-exception
            X.1Dc r1 = r13.A04     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "getMessagePaymentInfoV2/InvalidJidException - Cannot get PaymentInfo from a message with invalid JID"
            r1.A0A(r0, r2)     // Catch:{ all -> 0x0096 }
            r4.close()     // Catch:{ all -> 0x00a2 }
            r3.close()
            return r9
        L_0x0092:
            r4.close()     // Catch:{ all -> 0x00a2 }
            goto L_0x00b6
        L_0x0096:
            r1 = move-exception
            if (r4 == 0) goto L_0x00a1
            r4.close()     // Catch:{ all -> 0x009d }
            goto L_0x00a1
        L_0x009d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00a2 }
        L_0x00a1:
            throw r1     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00a7 }
            throw r1
        L_0x00a7:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00ac:
            if (r9 != 0) goto L_0x00e0
        L_0x00ae:
            X.1Dc r2 = r13.A04
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN PaymentTransactionStore#getMessagePaymentInfoV2 fetching from db, txn is null"
        L_0x00b2:
            r2.A06(r0)
            return r9
        L_0x00b6:
            r3.close()
            if (r9 == 0) goto L_0x00bf
            X.8av r2 = r9.A0A
            if (r2 != 0) goto L_0x00d5
        L_0x00bf:
            com.whatsapp.payments.PaymentConfiguration r2 = r13.A00
            if (r2 == 0) goto L_0x00ac
            if (r9 == 0) goto L_0x00ae
            java.lang.String r1 = r9.A0G
            java.lang.String r0 = r9.A0I
            X.B66 r0 = r2.A02(r1, r0)
            if (r0 == 0) goto L_0x00e0
            X.8av r2 = r0.BKY()
            if (r2 == 0) goto L_0x00e0
        L_0x00d5:
            java.lang.String r1 = r2.A0E()
            if (r1 == 0) goto L_0x00e0
            X.16S r0 = r13.A08
            r0.A0E(r2, r1)
        L_0x00e0:
            X.1Dc r2 = r13.A04
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN PaymentTransactionStore#getMessagePaymentInfoV2 fetching from db, and interop is "
            r1.append(r0)
            boolean r0 = r9.A0P
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24881Ed.A0L(java.lang.String, java.lang.String, long):X.9lY");
    }

    public ArrayList A0N() {
        String[] strArr = {String.valueOf(405), String.valueOf(1), String.valueOf(System.currentTimeMillis() - ((((((long) 60) * 24) * 60) * 60) * 1000))};
        StringBuilder sb = new StringBuilder();
        sb.append("readMostFrequentSuccessfulTransactions/QUERY_SUCCESSFUL_TRANSACTIONS");
        sb.append("/QUERY_PAY_TRANSACTION");
        String obj = sb.toString();
        String join = TextUtils.join(",", new String[]{"sender_jid_row_id", "receiver_jid_row_id"});
        StringBuilder sb2 = new StringBuilder();
        sb2.append("COUNT(");
        sb2.append("status");
        sb2.append(") AS ");
        sb2.append("frequency");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("MAX(init_timestamp) AS ");
        sb3.append("recentTransactionTs");
        String[] strArr2 = {"sender_jid_row_id", "receiver_jid_row_id", "status", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, sb2.toString(), sb3.toString()};
        AnonymousClass1M0 A042 = this.A03.get();
        try {
            C224114e r18 = A042.A02;
            Cursor A0A2 = r18.A0A("pay_transaction", strArr2, "status =? AND type =? AND init_timestamp <=? AND receiver_jid_row_id is not null", strArr, join, "frequency DESC", String.valueOf(4), obj);
            if (A0A2 != null) {
                try {
                    ArrayList arrayList = new ArrayList(A0A2.getCount());
                    while (A0A2.moveToNext()) {
                        int i = A0A2.getInt(A0A2.getColumnIndexOrThrow("status"));
                        C219712j r11 = this.A02;
                        Jid A092 = r11.A09(A0A2.getLong(A0A2.getColumnIndexOrThrow("sender_jid_row_id")));
                        C222813r r0 = UserJid.Companion;
                        UserJid A002 = C222813r.A00(A092);
                        UserJid A003 = C222813r.A00(r11.A09(A0A2.getLong(A0A2.getColumnIndexOrThrow("receiver_jid_row_id"))));
                        int i2 = A0A2.getInt(A0A2.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE));
                        String string = A0A2.getString(A0A2.getColumnIndexOrThrow("frequency"));
                        long j = A0A2.getLong(A0A2.getColumnIndexOrThrow("recentTransactionTs"));
                        C24611Dc r112 = this.A04;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("readTransactionInfoByTransId got from db: type: ");
                        sb4.append(i2);
                        sb4.append(" status: ");
                        sb4.append(i);
                        sb4.append(" sender: ");
                        sb4.append(A002);
                        sb4.append(" peer: ");
                        sb4.append(A003);
                        C24611Dc.A02(r112, (String) null, sb4.toString());
                        arrayList.add(new C21668AUl(A002, A003, Integer.valueOf(string).intValue(), j));
                    }
                    C24611Dc r2 = this.A04;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("readMostFrequentSuccessfulTransactions returned: ");
                    sb5.append(arrayList.size());
                    r2.A06(sb5.toString());
                    A0A2.close();
                    A042.close();
                    return arrayList;
                } catch (C19740wR e) {
                    this.A04.A0A("extractPaymentTransactionInfo/InvalidJidException - Skipped transaction with invalid JID", e);
                } catch (Throwable th) {
                    A0A2.close();
                    throw th;
                }
            } else {
                A042.close();
                return new ArrayList();
            }
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public synchronized ArrayList A0O() {
        ArrayList A0E;
        synchronized (this) {
            Pair A032 = A03();
            Pair pair = new Pair(new String[0], (Object) null);
            Pair A042 = A04(A032, new Pair(pair.second, pair.first), "AND");
            A0E = A0E((String) A042.first, (String[]) A042.second, -1);
        }
        return A0E;
    }

    public synchronized ArrayList A0P(int i) {
        ArrayList A0E;
        synchronized (this) {
            Pair pair = new Pair(new String[0], (Object) null);
            Pair A042 = A04(A04(A04(A03(), new Pair("(currency_code != ? OR metadata LIKE ?)", new String[]{((AnonymousClass16W) AnonymousClass16W.A06).A02, "%money%"}), "AND"), new Pair("(type=? AND status=?)", new String[]{Integer.toString(8), Integer.toString(608)}), "OR"), new Pair((String) pair.second, (String[]) pair.first), "AND");
            A0E = A0E((String) A042.first, (String[]) A042.second, i);
        }
        return A0E;
    }

    public synchronized List A0S(int i) {
        ArrayList arrayList;
        int[] iArr = C202319lY.A0T;
        int[] iArr2 = C202319lY.A0V;
        int[] iArr3 = C202319lY.A0U;
        arrayList = new ArrayList(18);
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList.add(Integer.valueOf(iArr[i2]));
        }
        for (int i3 = 0; i3 < 11; i3++) {
            arrayList.add(Integer.valueOf(iArr2[i3]));
        }
        for (int i4 = 0; i4 < 3; i4++) {
            arrayList.add(Integer.valueOf(iArr3[i4]));
        }
        return A0U((Integer[]) arrayList.toArray(new Integer[0]), new Integer[]{2, 1, 200, 100, 20, 10, 6, 7, 8}, i);
    }

    public synchronized List A0T(String str, Integer[] numArr, Integer[] numArr2, int i) {
        ArrayList arrayList;
        String str2;
        Cursor A0A2;
        AnonymousClass12P r3 = this.A03;
        r3.A06();
        if (!r3.A08) {
            arrayList = Collections.emptyList();
        } else {
            if (numArr.length > 0) {
                str2 = String.format("(%s IN (\"%s\"))", new Object[]{"status", TextUtils.join("\",\"", numArr)});
            } else {
                str2 = "";
            }
            String format = String.format("(%s IN (\"%s\"))", new Object[]{PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, TextUtils.join("\",\"", numArr2)});
            String str3 = null;
            if (TextUtils.isEmpty(str2)) {
                str2 = null;
            }
            if (TextUtils.isEmpty(format)) {
                format = str2;
            } else if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(" AND ");
                sb.append(format);
                format = sb.toString();
            }
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("credential_id=");
                sb2.append(str);
                String obj = sb2.toString();
                if (TextUtils.isEmpty(format)) {
                    format = obj;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(format);
                    sb3.append(" AND ");
                    sb3.append(obj);
                    format = sb3.toString();
                }
            }
            if (TextUtils.isEmpty(format)) {
                arrayList = new ArrayList();
            } else {
                String format2 = String.format("(%s) AND (%s IS NOT NULL)", new Object[]{format, PublicKeyCredentialControllerUtility.JSON_KEY_ID});
                C24611Dc r2 = this.A04;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("pending txns query: ");
                sb4.append(format2);
                C24611Dc.A02(r2, (String) null, sb4.toString());
                if (i > 0) {
                    str3 = Integer.toString(i);
                }
                try {
                    AnonymousClass1M0 A042 = r3.get();
                    try {
                        A0A2 = A042.A02.A0A("pay_transaction", A0A, format2, (String[]) null, (String) null, "timestamp DESC", str3, "readTransactionsWithTypeAndStatus/QUERY_PAY_TRANSACTION");
                        ArrayList A0B = A0B(A0A2, this, "readTransactionsWithTypeStatusAndCredentialId");
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("readPendingTransactions returned: ");
                        sb5.append(A0B.size());
                        C24611Dc.A02(r2, (String) null, sb5.toString());
                        if (A0A2 != null) {
                            A0A2.close();
                        }
                        A042.close();
                        arrayList = A0B;
                    } catch (Throwable th) {
                        A042.close();
                        throw th;
                    }
                } catch (IllegalStateException e) {
                    r2.A0A("readPendingTransactions/IllegalStateException ", e);
                    arrayList = new ArrayList();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
        return arrayList;
        throw th;
    }

    public synchronized List A0U(Integer[] numArr, Integer[] numArr2, int i) {
        return A0T((String) null, numArr, numArr2, i);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A0W(X.C202319lY r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            X.0wo r0 = r8.A01     // Catch:{ all -> 0x0077 }
            long r4 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x0077 }
            X.12P r0 = r8.A03     // Catch:{ SQLiteDatabaseCorruptException -> 0x006e }
            X.1M0 r3 = r0.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x006e }
            X.71s r7 = r3.B1k()     // Catch:{ all -> 0x0064 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x005a }
            r6.<init>()     // Catch:{ all -> 0x005a }
            java.lang.String r1 = r9.A0L     // Catch:{ all -> 0x005a }
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x005a }
            A07(r1, r0)     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "status"
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x005a }
            r6.put(r1, r0)     // Catch:{ all -> 0x005a }
            java.lang.String r2 = "timestamp"
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r0
            int r0 = (int) r4     // Catch:{ all -> 0x005a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x005a }
            r6.put(r2, r0)     // Catch:{ all -> 0x005a }
            X.1Dc r2 = r8.A04     // Catch:{ all -> 0x005a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005a }
            r1.<init>()     // Catch:{ all -> 0x005a }
            java.lang.String r0 = "expirePendingRequest key id:"
            r1.append(r0)     // Catch:{ all -> 0x005a }
            java.lang.String r0 = r9.A0L     // Catch:{ all -> 0x005a }
            r1.append(r0)     // Catch:{ all -> 0x005a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x005a }
            r2.A06(r0)     // Catch:{ all -> 0x005a }
            A00(r6, r3, r9)     // Catch:{ all -> 0x005a }
            r7.A00()     // Catch:{ all -> 0x005a }
            r7.close()     // Catch:{ all -> 0x0064 }
            r3.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x006e }
            goto L_0x0075
        L_0x005a:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x005f }
            goto L_0x0063
        L_0x005f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0064 }
        L_0x0063:
            throw r1     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0069 }
            goto L_0x006d
        L_0x0069:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x006e }
        L_0x006d:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x006e }
        L_0x006e:
            X.1Dc r1 = r8.A04     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = "expirePendingRequest failed."
            r1.A05(r0)     // Catch:{ all -> 0x0077 }
        L_0x0075:
            monitor-exit(r8)
            return
        L_0x0077:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24881Ed.A0W(X.9lY):void");
    }

    public boolean A0Z() {
        Cursor A012 = A01(this, 1);
        try {
            boolean moveToNext = A012.moveToNext();
            A012.close();
            return moveToNext;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r1 = r5.A02;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0099, code lost:
        if (r0 != null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009b, code lost:
        r0 = new X.C206829u4();
        r3.A03 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        r0.A00.put(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ac, code lost:
        return r4.A0H(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0b(X.C202319lY r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            X.8av r0 = r8.A0A     // Catch:{ all -> 0x00bf }
            r5 = 0
            if (r0 == 0) goto L_0x0008
            X.9ue r5 = r0.A00     // Catch:{ all -> 0x00bf }
        L_0x0008:
            r6 = 0
            if (r5 == 0) goto L_0x00bd
            X.0wQ r1 = r7.A05     // Catch:{ all -> 0x00bf }
            com.whatsapp.jid.UserJid r0 = r8.A0E     // Catch:{ all -> 0x00bf }
            boolean r0 = r1.A0M(r0)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00bd
            com.whatsapp.jid.UserJid r1 = r8.A0D     // Catch:{ all -> 0x00bf }
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x00bf }
            com.whatsapp.jid.UserJid r2 = X.C222813r.A00(r1)     // Catch:{ all -> 0x00bf }
            if (r2 == 0) goto L_0x00b6
            java.lang.String r0 = r8.A0K     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00b6
            X.16S r4 = r7.A08     // Catch:{ all -> 0x00bf }
            X.8ax r3 = r4.A05(r2)     // Catch:{ all -> 0x00bf }
            if (r3 == 0) goto L_0x002f
            com.whatsapp.jid.UserJid r0 = r3.A04     // Catch:{ all -> 0x00bf }
            if (r0 != 0) goto L_0x0053
        L_0x002f:
            java.lang.String r0 = X.AnonymousClass3U8.A07(r2)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = X.AnonymousClass3SI.A02(r0)     // Catch:{ all -> 0x00bf }
            X.9l8 r0 = X.C202159l8.A01(r0)     // Catch:{ all -> 0x00bf }
            com.whatsapp.payments.PaymentConfiguration r1 = r7.A00     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x00bf }
            X.9e3 r0 = r1.A00(r0)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x0069
            X.B66 r0 = X.C198699e3.A00(r0)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x0069
            X.8ax r3 = r0.BKV()     // Catch:{ all -> 0x00bf }
            if (r3 == 0) goto L_0x00bd
            r3.A04 = r2     // Catch:{ all -> 0x00bf }
        L_0x0053:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x00bf }
            r2.<init>()     // Catch:{ all -> 0x00bf }
            X.9u4 r0 = r3.A03     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x006d
            java.lang.String r1 = r5.A02     // Catch:{ all -> 0x00bf }
            java.util.HashMap r0 = r0.A00     // Catch:{ all -> 0x00bf }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00bf }
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x006d
            goto L_0x006c
        L_0x0069:
            if (r3 == 0) goto L_0x00bd
            goto L_0x0053
        L_0x006c:
            r2 = r0
        L_0x006d:
            int r0 = r8.A02     // Catch:{ NumberFormatException -> 0x00ad }
            switch(r0) {
                case 401: goto L_0x007a;
                case 402: goto L_0x007a;
                case 403: goto L_0x007a;
                case 404: goto L_0x0088;
                case 405: goto L_0x007a;
                case 406: goto L_0x0088;
                case 407: goto L_0x0088;
                case 408: goto L_0x0088;
                case 409: goto L_0x0088;
                case 410: goto L_0x007a;
                case 411: goto L_0x0088;
                case 412: goto L_0x0088;
                case 413: goto L_0x0088;
                case 414: goto L_0x0088;
                case 415: goto L_0x0088;
                case 416: goto L_0x0088;
                case 417: goto L_0x007a;
                case 418: goto L_0x0088;
                case 419: goto L_0x0088;
                case 420: goto L_0x007a;
                case 421: goto L_0x0088;
                default: goto L_0x0072;
            }     // Catch:{ NumberFormatException -> 0x00ad }
        L_0x0072:
            X.1Dc r1 = r7.A04     // Catch:{ NumberFormatException -> 0x00ad }
            java.lang.String r0 = "There's no valid transaction status. Updating the incentive record in the payment contacts table failed."
            r1.A05(r0)     // Catch:{ NumberFormatException -> 0x00ad }
            goto L_0x00bd
        L_0x007a:
            java.lang.String r0 = r8.A0K     // Catch:{ NumberFormatException -> 0x00ad }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x00ad }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ad }
            r2.add(r0)     // Catch:{ NumberFormatException -> 0x00ad }
            goto L_0x0095
        L_0x0088:
            java.lang.String r0 = r8.A0K     // Catch:{ NumberFormatException -> 0x00ad }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x00ad }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ad }
            r2.remove(r0)     // Catch:{ NumberFormatException -> 0x00ad }
        L_0x0095:
            java.lang.String r1 = r5.A02     // Catch:{ all -> 0x00bf }
            X.9u4 r0 = r3.A03     // Catch:{ all -> 0x00bf }
            if (r0 != 0) goto L_0x00a2
            X.9u4 r0 = new X.9u4     // Catch:{ all -> 0x00bf }
            r0.<init>()     // Catch:{ all -> 0x00bf }
            r3.A03 = r0     // Catch:{ all -> 0x00bf }
        L_0x00a2:
            java.util.HashMap r0 = r0.A00     // Catch:{ all -> 0x00bf }
            r0.put(r1, r2)     // Catch:{ all -> 0x00bf }
            boolean r0 = r4.A0H(r3)     // Catch:{ all -> 0x00bf }
            monitor-exit(r7)
            return r0
        L_0x00ad:
            r2 = move-exception
            X.1Dc r1 = r7.A04     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "There was a problem parsing the paymentTransactionInfo.id"
            r1.A0A(r0, r2)     // Catch:{ all -> 0x00bf }
            goto L_0x00bd
        L_0x00b6:
            X.1Dc r1 = r7.A04     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "insertOrUpdateIncentivePaymentContactInfo/ Receiver Jid or transaction id are null. Updating the incentive record in the payment contacts table failed."
            r1.A05(r0)     // Catch:{ all -> 0x00bf }
        L_0x00bd:
            monitor-exit(r7)
            return r6
        L_0x00bf:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24881Ed.A0b(X.9lY):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0139, code lost:
        if (r6 <= 0) goto L_0x013b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0c(X.C202319lY r19, X.C202319lY r20, java.lang.String r21) {
        /*
            r18 = this;
            r11 = 0
            r3 = r18
            r9 = r19
            r4 = r21
            r9.A0L = r4     // Catch:{ SQLiteDatabaseCorruptException -> 0x0161 }
            r10 = r20
            android.content.ContentValues r0 = r3.A0H(r10, r9)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0161 }
            if (r0 != 0) goto L_0x0019
            X.1Dc r1 = r3.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x0161 }
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessage() content-values are null, nothing to update"
            r1.A06(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0161 }
            return r11
        L_0x0019:
            int r0 = r0.size()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0161 }
            if (r0 <= 0) goto L_0x014a
            X.12P r0 = r3.A03     // Catch:{ SQLiteDatabaseCorruptException -> 0x0161 }
            X.1M0 r2 = r0.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0161 }
            android.content.ContentValues r13 = r3.A0I(r10, r9)     // Catch:{ all -> 0x0140 }
            r6 = 0
            if (r13 != 0) goto L_0x0036
            X.1Dc r8 = r3.A04     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessageV2 content values are null, nothing to update"
        L_0x0031:
            r8.A06(r0)     // Catch:{ all -> 0x0140 }
            goto L_0x0134
        L_0x0036:
            boolean r0 = r9.A0P     // Catch:{ all -> 0x0140 }
            java.lang.String r1 = "key_id"
            if (r0 != 0) goto L_0x0067
            r13.put(r1, r4)     // Catch:{ all -> 0x0140 }
        L_0x003f:
            java.lang.String r5 = "/"
            if (r20 != 0) goto L_0x0085
            X.14e r6 = r2.A02     // Catch:{ all -> 0x0140 }
            java.lang.String r1 = "pay_transaction"
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessageV2/REPLACE_PAY_TRANSACTION"
            long r6 = r6.A06(r1, r0, r13)     // Catch:{ all -> 0x0140 }
            X.1Dc r8 = r3.A04     // Catch:{ all -> 0x0140 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            r1.<init>()     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessageV2/"
            r1.append(r0)     // Catch:{ all -> 0x0140 }
            r1.append(r4)     // Catch:{ all -> 0x0140 }
            r1.append(r5)     // Catch:{ all -> 0x0140 }
            r1.append(r6)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0140 }
            goto L_0x0031
        L_0x0067:
            java.lang.String r0 = "interop_id"
            r13.put(r0, r4)     // Catch:{ all -> 0x0140 }
            r13.remove(r1)     // Catch:{ all -> 0x0140 }
            X.1Dc r1 = r3.A04     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessageV2 interop_id is added to content values"
            r1.A06(r0)     // Catch:{ all -> 0x0140 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0140 }
            if (r0 == 0) goto L_0x0082
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessageV2 keyId is empty"
        L_0x007e:
            r1.A06(r0)     // Catch:{ all -> 0x0140 }
            goto L_0x003f
        L_0x0082:
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessageV2 keyId is not empty"
            goto L_0x007e
        L_0x0085:
            boolean r0 = r10.A0P(r9)     // Catch:{ all -> 0x0140 }
            if (r0 == 0) goto L_0x013b
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x0140 }
            android.util.Pair r0 = A08(r4, r0)     // Catch:{ all -> 0x0140 }
            if (r0 != 0) goto L_0x00b1
            X.1Dc r8 = r3.A04     // Catch:{ all -> 0x0140 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            r1.<init>()     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessageV2 got null query and params for interop id: "
            r1.append(r0)     // Catch:{ all -> 0x0140 }
            r1.append(r4)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = " trans id: "
            r1.append(r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x0140 }
            r1.append(r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0140 }
            goto L_0x0031
        L_0x00b1:
            java.lang.Object r15 = r0.first     // Catch:{ all -> 0x0140 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0140 }
            java.lang.Object r6 = r0.second     // Catch:{ all -> 0x0140 }
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ all -> 0x0140 }
            X.1Dc r8 = r3.A04     // Catch:{ all -> 0x0140 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            r1.<init>()     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessageV2 already exists with old message id: "
            r1.append(r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = r10.A0L     // Catch:{ all -> 0x0140 }
            r1.append(r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "; new key id: "
            r1.append(r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = r9.A0L     // Catch:{ all -> 0x0140 }
            r1.append(r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = " old transaction id: "
            r1.append(r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = r10.A0K     // Catch:{ all -> 0x0140 }
            r1.append(r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = " new transaction id: "
            r1.append(r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x0140 }
            r1.append(r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = " query: "
            r1.append(r0)     // Catch:{ all -> 0x0140 }
            r1.append(r15)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = " params: "
            r1.append(r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = java.util.Arrays.toString(r6)     // Catch:{ all -> 0x0140 }
            r1.append(r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0140 }
            r0 = 0
            X.C24611Dc.A02(r8, r0, r1)     // Catch:{ all -> 0x0140 }
            X.14e r12 = r2.A02     // Catch:{ all -> 0x0140 }
            java.lang.String r14 = "pay_transaction"
            java.lang.String r16 = "insertOrUpdatePaymentInfoWithoutMessageV2/UPDATE_PAY_TRANSACTION"
            r17 = r6
            int r0 = r12.A01(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0140 }
            long r6 = (long) r0     // Catch:{ all -> 0x0140 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            r1.<init>()     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessageV2/found old row and updating transaction id: "
            r1.append(r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x0140 }
            r1.append(r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = " message id: "
            r1.append(r0)     // Catch:{ all -> 0x0140 }
            r1.append(r4)     // Catch:{ all -> 0x0140 }
            r1.append(r5)     // Catch:{ all -> 0x0140 }
            r1.append(r6)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0140 }
            goto L_0x0031
        L_0x0134:
            r4 = 0
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x013c
        L_0x013b:
            r0 = 0
        L_0x013c:
            r2.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0161 }
            return r0
        L_0x0140:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0145 }
            goto L_0x0149
        L_0x0145:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0161 }
        L_0x0149:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0161 }
        L_0x014a:
            X.1Dc r2 = r3.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x0161 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x0161 }
            r1.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0161 }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessage/found no columns to update: "
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0161 }
            r1.append(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0161 }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0161 }
            r2.A06(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0161 }
            return r11
        L_0x0161:
            r2 = move-exception
            X.1Dc r1 = r3.A04
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessage"
            r1.A0A(r0, r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24881Ed.A0c(X.9lY, X.9lY, java.lang.String):boolean");
    }

    public static Pair A04(Pair pair, Pair pair2, String str) {
        if (TextUtils.isEmpty((CharSequence) pair.first)) {
            return pair2;
        }
        if (TextUtils.isEmpty((CharSequence) pair2.first)) {
            return pair;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append((String) pair.first);
        sb.append(") ");
        sb.append(str);
        sb.append(" (");
        sb.append((String) pair2.first);
        sb.append(")");
        String obj = sb.toString();
        Object obj2 = pair.second;
        int length = ((String[]) obj2).length;
        String[] strArr = new String[(((String[]) pair2.second).length + length)];
        System.arraycopy(obj2, 0, strArr, 0, length);
        Object obj3 = pair2.second;
        System.arraycopy(obj3, 0, strArr, ((String[]) pair.second).length, ((String[]) obj3).length);
        return new Pair(obj, strArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A06(X.C24881Ed r9, X.C193889Nh r10) {
        /*
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.9tb r0 = r10.A01
            if (r0 == 0) goto L_0x00fe
            java.lang.String[] r0 = r0.A01
            java.util.Collections.addAll(r3, r0)
            X.9tb r0 = r10.A01
            java.lang.String r0 = r0.A00
        L_0x0017:
            r2.add(r0)
        L_0x001a:
            com.whatsapp.jid.UserJid r1 = A0A(r9)
            X.12j r0 = r9.A02
            long r0 = r0.A07(r1)
            java.lang.String r5 = java.lang.Long.toString(r0)
            boolean r0 = r10.A06
            r7 = 1
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = "(type=? OR type=? OR type=?)"
            r2.add(r0)
            java.lang.String r0 = java.lang.Integer.toString(r7)
            r3.add(r0)
            r0 = 10
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r3.add(r0)
            r0 = 100
            java.lang.String r0 = java.lang.Integer.toString(r0)
        L_0x0048:
            r3.add(r0)
        L_0x004b:
            java.lang.String r0 = "( receiver_jid_row_id=? OR sender_jid_row_id=? OR (service_id=? AND (type=? OR type=? OR type=? OR type=?)))"
            r2.add(r0)
            r3.add(r5)
            r3.add(r5)
            r0 = 6
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.add(r0)
            r0 = 7
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.add(r0)
            r0 = 8
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.add(r0)
            r0 = 9
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.add(r0)
            boolean r0 = r10.A02
            r4 = 0
            if (r0 == 0) goto L_0x00db
            java.lang.String r6 = "(status IN (?, ?, ?, ?))"
        L_0x007f:
            r0 = 4
            java.lang.String[] r5 = new java.lang.String[r0]
            r0 = 405(0x195, float:5.68E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5[r4] = r0
            r0 = 106(0x6a, float:1.49E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5[r7] = r0
            r1 = 2
            r0 = 604(0x25c, float:8.46E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5[r1] = r0
            r1 = 3
            r0 = 408(0x198, float:5.72E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5[r1] = r0
            android.util.Pair r1 = android.util.Pair.create(r5, r6)
            java.lang.Object r0 = r1.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.Collections.addAll(r3, r0)
            java.lang.Object r0 = r1.second
            r2.add(r0)
        L_0x00b4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "("
            r1.append(r0)
            java.lang.String r0 = " AND "
            java.lang.String r0 = android.text.TextUtils.join(r0, r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String[] r0 = new java.lang.String[r4]
            java.lang.Object[] r0 = r3.toArray(r0)
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            return r0
        L_0x00db:
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x00b4
            java.lang.String r6 = "(status NOT IN (?, ?, ?, ?))"
            goto L_0x007f
        L_0x00e2:
            X.978 r0 = r10.A00
            if (r0 == 0) goto L_0x004b
            X.C18740tg.A06(r0)
            r4 = 20
            r1 = 2
            java.lang.String r0 = "(type=? OR type=?)"
            r2.add(r0)
            java.lang.String r0 = java.lang.Integer.toString(r1)
            r3.add(r0)
            java.lang.String r0 = java.lang.Integer.toString(r4)
            goto L_0x0048
        L_0x00fe:
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x001a
            r0 = 18
            java.lang.String[] r4 = new java.lang.String[r0]
            r0 = 19
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            r4[r0] = r1
            r8 = 12
            java.lang.String r0 = java.lang.String.valueOf(r8)
            r6 = 1
            r4[r6] = r0
            r7 = 17
            java.lang.String r0 = java.lang.String.valueOf(r7)
            r5 = 2
            r4[r5] = r0
            r0 = 608(0x260, float:8.52E-43)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 3
            r4[r0] = r1
            java.lang.String r1 = java.lang.String.valueOf(r6)
            r0 = 4
            r4[r0] = r1
            java.lang.String r1 = java.lang.String.valueOf(r5)
            r0 = 5
            r4[r0] = r1
            r0 = 20
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5 = 6
            r4[r5] = r0
            r6 = 10
            java.lang.String r0 = java.lang.String.valueOf(r6)
            r1 = 7
            r4[r1] = r0
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r5 = 8
            r4[r5] = r0
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r1 = 9
            r4[r1] = r0
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r4[r6] = r0
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0 = 11
            r4[r0] = r1
            r0 = 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4[r8] = r0
            r0 = 300(0x12c, float:4.2E-43)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 13
            r4[r0] = r1
            r0 = 40
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 14
            r4[r0] = r1
            r0 = 415(0x19f, float:5.82E-43)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 15
            r4[r0] = r1
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 16
            r4[r0] = r1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4[r7] = r0
            java.lang.String r0 = "((status!=?) AND (status!=?) AND (status!=?) AND (status!=?) AND (type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR (type=? AND (status=? OR status=? OR status=?))))"
            android.util.Pair r1 = android.util.Pair.create(r4, r0)
            java.lang.Object r0 = r1.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.Collections.addAll(r3, r0)
            java.lang.Object r0 = r1.second
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24881Ed.A06(X.1Ed, X.9Nh):android.util.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0393, code lost:
        if (r2 == 602) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0144, code lost:
        if (r8 != 30) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0257, code lost:
        if (r8 != 3) goto L_0x025b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x032e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C202319lY A09(android.database.Cursor r49, X.C24881Ed r50) {
        /*
            r7 = r50
            X.12j r6 = r7.A02
            java.lang.String r0 = "remote_jid_row_id"
            r3 = r49
            int r0 = r3.getColumnIndexOrThrow(r0)
            long r0 = r3.getLong(r0)
            com.whatsapp.jid.Jid r1 = r6.A09(r0)
            X.13q r0 = X.AnonymousClass11F.A00
            X.11F r28 = X.C222713q.A00(r1)
            java.lang.String r0 = "key_id"
            int r0 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r27 = r3.getString(r0)
            java.lang.String r0 = "id"
            int r0 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r26 = r3.getString(r0)
            java.lang.String r0 = "init_timestamp"
            int r0 = r3.getColumnIndexOrThrow(r0)
            int r0 = r3.getInt(r0)
            long r0 = (long) r0
            r10 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r10
            java.lang.String r2 = "timestamp"
            int r4 = r3.getColumnIndexOrThrow(r2)
            boolean r2 = r3.isNull(r4)
            if (r2 == 0) goto L_0x025e
            r2 = 0
        L_0x0049:
            long r8 = (long) r2
            long r8 = r8 * r10
            r4 = 0
            long r14 = java.lang.Math.max(r8, r4)
            java.lang.String r2 = "status"
            int r2 = r3.getColumnIndexOrThrow(r2)
            int r25 = r3.getInt(r2)
            java.lang.String r2 = "sender_jid_row_id"
            int r2 = r3.getColumnIndexOrThrow(r2)
            long r4 = r3.getLong(r2)
            com.whatsapp.jid.Jid r4 = r6.A09(r4)
            X.13r r2 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r24 = X.C222813r.A00(r4)
            java.lang.String r2 = "receiver_jid_row_id"
            int r2 = r3.getColumnIndexOrThrow(r2)
            long r4 = r3.getLong(r2)
            com.whatsapp.jid.Jid r2 = r6.A09(r4)
            com.whatsapp.jid.UserJid r9 = X.C222813r.A00(r2)
            java.lang.String r2 = "type"
            int r2 = r3.getColumnIndexOrThrow(r2)
            int r8 = r3.getInt(r2)
            java.lang.String r2 = "currency_code"
            int r2 = r3.getColumnIndexOrThrow(r2)
            java.lang.String r23 = r3.getString(r2)
            java.lang.String r2 = "amount_1000"
            int r2 = r3.getColumnIndexOrThrow(r2)
            long r12 = r3.getLong(r2)
            java.lang.String r2 = "credential_id"
            int r2 = r3.getColumnIndexOrThrow(r2)
            java.lang.String r36 = r3.getString(r2)
            java.lang.String r2 = "error_code"
            int r2 = r3.getColumnIndexOrThrow(r2)
            java.lang.String r37 = r3.getString(r2)
            java.lang.String r2 = "bank_transaction_id"
            int r2 = r3.getColumnIndexOrThrow(r2)
            java.lang.String r38 = r3.getString(r2)
            java.lang.String r2 = "methods"
            int r2 = r3.getColumnIndexOrThrow(r2)
            java.lang.String r22 = r3.getString(r2)
            java.lang.String r2 = "metadata"
            int r2 = r3.getColumnIndexOrThrow(r2)
            java.lang.String r21 = r3.getString(r2)
            java.lang.String r2 = "request_key_id"
            int r2 = r3.getColumnIndexOrThrow(r2)
            java.lang.String r19 = r3.getString(r2)
            java.lang.String r2 = "country"
            int r2 = r3.getColumnIndexOrThrow(r2)
            java.lang.String r40 = r3.getString(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r40)
            if (r2 == 0) goto L_0x00ed
            java.lang.String r40 = "IN"
        L_0x00ed:
            java.lang.String r2 = "version"
            int r2 = r3.getColumnIndexOrThrow(r2)
            int r43 = r3.getInt(r2)
            java.lang.String r2 = "future_data"
            int r2 = r3.getColumnIndexOrThrow(r2)
            byte[] r11 = r3.getBlob(r2)
            java.lang.String r2 = "service_id"
            int r2 = r3.getColumnIndexOrThrow(r2)
            int r18 = r3.getInt(r2)
            java.lang.String r2 = "background_id"
            int r2 = r3.getColumnIndexOrThrow(r2)
            java.lang.String r2 = r3.getString(r2)
            r6 = 0
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x0122
            X.1Ee r4 = r7.A09
            X.6c9 r6 = r4.A03(r2)
        L_0x0122:
            java.lang.String r2 = "purchase_initiator"
            int r2 = r3.getColumnIndexOrThrow(r2)
            int r45 = r3.getInt(r2)
            X.0wQ r4 = r7.A05
            boolean r2 = r4.A0M(r9)
            if (r2 == 0) goto L_0x023e
            X.9nz r2 = X.C203419nz.$redex_init_class
            r2 = 20
            if (r8 == r2) goto L_0x0146
            r2 = 40
            if (r8 == r2) goto L_0x0146
            r2 = 10
            if (r8 == r2) goto L_0x0146
            r2 = 30
            if (r8 != r2) goto L_0x023e
        L_0x0146:
            r5 = 1
        L_0x0147:
            java.lang.String r2 = "interop_id"
            int r2 = r3.getColumnIndexOrThrow(r2)
            java.lang.String r20 = r3.getString(r2)
            X.1Dc r2 = r7.A04
            r50 = r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "readTransactionInfoByTransId got from db: id: "
            r3.append(r2)
            r2 = r26
            r3.append(r2)
            java.lang.String r2 = " timestamp: "
            r3.append(r2)
            r3.append(r14)
            java.lang.String r2 = " service_id: "
            r3.append(r2)
            r2 = r18
            r3.append(r2)
            java.lang.String r2 = " type: "
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = " status: "
            r3.append(r2)
            r2 = r25
            r3.append(r2)
            java.lang.String r2 = " description:  peer: "
            r3.append(r2)
            r3.append(r9)
            java.lang.String r2 = ""
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r4 = 0
            r2 = r50
            X.C24611Dc.A02(r2, r4, r3)
            r2 = 5
            if (r8 != r2) goto L_0x01ee
            boolean r2 = android.text.TextUtils.isEmpty(r23)
            if (r2 == 0) goto L_0x01ee
            X.9nz r2 = X.C203419nz.$redex_init_class
            r14 = 5
            r16 = 0
            X.9lY r3 = new X.9lY
            r12 = r3
            r13 = r40
            r15 = r43
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            r3.A0R = r11
            r16 = 0
        L_0x01bd:
            r3.A0C(r6)
            r0 = r28
            r3.A0C = r0
            r3.A0Q = r5
            boolean r0 = android.text.TextUtils.isEmpty(r27)
            if (r0 == 0) goto L_0x01d4
            boolean r0 = android.text.TextUtils.isEmpty(r20)
            if (r0 != 0) goto L_0x01d8
            r27 = r20
        L_0x01d4:
            r0 = r27
            r3.A0L = r0
        L_0x01d8:
            boolean r0 = android.text.TextUtils.isEmpty(r19)
            if (r0 != 0) goto L_0x01e2
            r0 = r19
            r3.A0M = r0
        L_0x01e2:
            boolean r0 = android.text.TextUtils.isEmpty(r22)
            if (r0 != 0) goto L_0x0317
            X.16U r19 = r3.A03()
            r2 = 0
            goto L_0x0264
        L_0x01ee:
            java.math.BigDecimal r3 = new java.math.BigDecimal
            r3.<init>(r12)
            r2 = -3
            java.math.BigDecimal r12 = r3.scaleByPowerOfTen(r2)
            X.16T r3 = r7.A07
            r2 = r23
            X.16U r2 = r3.A01(r2)
            r16 = 0
            X.9nz r3 = X.C203419nz.$redex_init_class
            r3 = 4
            if (r8 == r3) goto L_0x0239
            r3 = r2
            X.16V r3 = (X.AnonymousClass16V) r3
            int r3 = r3.A01
            X.16X r10 = new X.16X
            r10.<init>(r12, r3)
            X.9lY r3 = new X.9lY
            r29 = r3
            r30 = r2
            r31 = r10
            r32 = r24
            r33 = r9
            r34 = r23
            r35 = r26
            r39 = r4
            r41 = r8
            r42 = r25
            r44 = r18
            r46 = r0
            r48 = r14
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48)
            r3.A0R = r11
            r0 = 0
            r3.A0F(r0)
            r3.A07 = r2
            goto L_0x01bd
        L_0x0239:
            X.9lY r3 = X.C203419nz.A00(r0)
            goto L_0x01bd
        L_0x023e:
            r2 = r24
            boolean r2 = r4.A0M(r2)
            if (r2 == 0) goto L_0x025b
            X.9nz r2 = X.C203419nz.$redex_init_class
            r4 = 1
            r2 = 2
            if (r8 == r2) goto L_0x0146
            r2 = 200(0xc8, float:2.8E-43)
            if (r8 == r2) goto L_0x0146
            if (r8 == r4) goto L_0x0146
            r2 = 100
            if (r8 == r2) goto L_0x0146
            r2 = 3
            if (r8 != r2) goto L_0x025b
            goto L_0x0146
        L_0x025b:
            r5 = 0
            goto L_0x0147
        L_0x025e:
            int r2 = r3.getInt(r4)
            goto L_0x0049
        L_0x0264:
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ JSONException -> 0x030c }
            r0 = r22
            r11.<init>(r0)     // Catch:{ JSONException -> 0x030c }
            int r0 = r11.length()     // Catch:{ JSONException -> 0x030c }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ JSONException -> 0x030c }
            r12.<init>(r0)     // Catch:{ JSONException -> 0x030c }
            r10 = 0
            r9 = 0
        L_0x0276:
            int r0 = r11.length()     // Catch:{ JSONException -> 0x030c }
            if (r9 >= r0) goto L_0x0308
            org.json.JSONObject r13 = r11.getJSONObject(r9)     // Catch:{ JSONException -> 0x030c }
            java.lang.String r0 = "t"
            int r15 = r13.optInt(r0, r10)     // Catch:{ JSONException -> 0x030c }
            java.lang.String r0 = "st"
            java.lang.String r14 = r13.optString(r0, r4)     // Catch:{ JSONException -> 0x030c }
            java.lang.String r0 = "cc"
            java.lang.String r18 = r13.optString(r0, r4)     // Catch:{ JSONException -> 0x030c }
            java.lang.String r0 = "c"
            java.lang.String r5 = r13.optString(r0, r4)     // Catch:{ JSONException -> 0x030c }
            java.lang.String r0 = "n"
            java.lang.String r1 = r13.optString(r0, r4)     // Catch:{ JSONException -> 0x030c }
            java.lang.String r0 = "a"
            java.lang.String r6 = r13.optString(r0, r4)     // Catch:{ JSONException -> 0x030c }
            java.lang.String r8 = "sd"
            r0 = 1
            int r8 = r13.optInt(r8, r0)     // Catch:{ JSONException -> 0x030c }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x030c }
            if (r0 != 0) goto L_0x02f1
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x030c }
            if (r0 != 0) goto L_0x02f1
            r0 = r19
            X.16V r0 = (X.AnonymousClass16V) r0     // Catch:{ JSONException -> 0x030c }
            int r0 = r0.A01     // Catch:{ JSONException -> 0x030c }
            X.16X r6 = X.AnonymousClass16X.A00(r6, r0)     // Catch:{ JSONException -> 0x030c }
            if (r6 == 0) goto L_0x02eb
            boolean r0 = r6.A02()     // Catch:{ JSONException -> 0x030c }
            if (r0 == 0) goto L_0x02eb
            X.9l8 r0 = X.C202159l8.A00(r18)     // Catch:{ JSONException -> 0x030c }
            X.9un r5 = X.C207249un.A05(r0, r14, r5, r1, r15)     // Catch:{ JSONException -> 0x030c }
            boolean r0 = r5 instanceof X.C175798b4     // Catch:{ JSONException -> 0x030c }
            if (r0 == 0) goto L_0x02e0
            r1 = r5
            X.8b4 r1 = (X.C175798b4) r1     // Catch:{ JSONException -> 0x030c }
            java.lang.String r0 = "ci"
            int r0 = r13.optInt(r0, r10)     // Catch:{ JSONException -> 0x030c }
            r1.A01 = r0     // Catch:{ JSONException -> 0x030c }
        L_0x02e0:
            X.9K8 r0 = new X.9K8     // Catch:{ JSONException -> 0x030c }
            r0.<init>(r6, r5, r8)     // Catch:{ JSONException -> 0x030c }
            r12.add(r0)     // Catch:{ JSONException -> 0x030c }
            int r9 = r9 + 1
            goto L_0x0276
        L_0x02eb:
            java.lang.String r0 = "PAY: PaymentTransaction:Source:fromJsonString could not parse string amount"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ JSONException -> 0x030c }
            goto L_0x0314
        L_0x02f1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x030c }
            r1.<init>()     // Catch:{ JSONException -> 0x030c }
            java.lang.String r0 = "PAY: PaymentTransaction:Source:fromJsonString could not parse string: "
            r1.append(r0)     // Catch:{ JSONException -> 0x030c }
            r0 = r22
            r1.append(r0)     // Catch:{ JSONException -> 0x030c }
            java.lang.String r0 = r1.toString()     // Catch:{ JSONException -> 0x030c }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ JSONException -> 0x030c }
            goto L_0x0314
        L_0x0308:
            r12.size()     // Catch:{ JSONException -> 0x030c }
            goto L_0x0313
        L_0x030c:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentTransaction:Source:fromJsonString threw json exception in response: "
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x0314
        L_0x0313:
            r2 = r12
        L_0x0314:
            r3.A0E(r2)
        L_0x0317:
            boolean r0 = android.text.TextUtils.isEmpty(r20)
            if (r0 != 0) goto L_0x0320
            r0 = 1
            r3.A0P = r0
        L_0x0320:
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 != 0) goto L_0x03b9
            com.whatsapp.payments.PaymentConfiguration r2 = r7.A00
            if (r2 == 0) goto L_0x03b9
            int r6 = r3.A01
            if (r6 == 0) goto L_0x0366
            X.0v5 r0 = r2.A01
            java.lang.Object r5 = r0.A02()
            X.9F1 r5 = (X.AnonymousClass9F1) r5
            monitor-enter(r5)
            java.util.Map r0 = r5.A00     // Catch:{ all -> 0x0363 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0363 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0363 }
        L_0x0341:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0363 }
            if (r0 == 0) goto L_0x0360
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0363 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0363 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0363 }
            X.004 r0 = (X.AnonymousClass004) r0     // Catch:{ all -> 0x0363 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0363 }
            X.AF8 r1 = (X.AF8) r1     // Catch:{ all -> 0x0363 }
            int r0 = r1.BHO()     // Catch:{ all -> 0x0363 }
            if (r6 != r0) goto L_0x0341
            goto L_0x0361
        L_0x0360:
            r1 = 0
        L_0x0361:
            monitor-exit(r5)
            goto L_0x036e
        L_0x0363:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0366:
            java.lang.String r1 = r3.A0G
            java.lang.String r0 = r3.A0I
            X.B66 r1 = r2.A02(r1, r0)
        L_0x036e:
            if (r1 == 0) goto L_0x0376
            X.8av r0 = r1.BKY()
            r3.A0A = r0
        L_0x0376:
            X.8av r1 = r3.A0A
            if (r1 == 0) goto L_0x03b9
            r0 = r21
            r1.A06(r0)
            monitor-enter(r3)
            boolean r0 = r3.A0J()     // Catch:{ all -> 0x038d }
            if (r0 != 0) goto L_0x0395
            int r2 = r3.A02     // Catch:{ all -> 0x038d }
            r0 = 608(0x260, float:8.52E-43)
            if (r2 == r0) goto L_0x0395
            goto L_0x0390
        L_0x038d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0390:
            r1 = 602(0x25a, float:8.44E-43)
            r0 = 0
            if (r2 != r1) goto L_0x0396
        L_0x0395:
            r0 = 1
        L_0x0396:
            monitor-exit(r3)
            if (r0 == 0) goto L_0x03b9
            X.8av r0 = r3.A0A
            long r5 = r0.A09()
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x03b9
            X.0wo r0 = r7.A01
            long r1 = X.C19970wo.A00(r0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x03b9
            int r2 = r3.A03
            r1 = 8
            r0 = 16
            if (r2 != r1) goto L_0x03b7
            r0 = 607(0x25f, float:8.5E-43)
        L_0x03b7:
            r3.A02 = r0
        L_0x03b9:
            int r0 = r3.A01
            if (r0 != 0) goto L_0x03d1
            com.whatsapp.payments.PaymentConfiguration r2 = r7.A00
            if (r2 == 0) goto L_0x03f2
            java.lang.String r1 = r3.A0G
            java.lang.String r0 = r3.A0I
            X.B66 r0 = r2.A02(r1, r0)
            if (r0 == 0) goto L_0x03f2
            int r0 = r0.BHO()
        L_0x03cf:
            r3.A01 = r0
        L_0x03d1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "readTransactionFromCursor: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " countryData: "
            r1.append(r0)
            X.8av r0 = r3.A0A
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = r50
            X.C24611Dc.A02(r0, r4, r1)
            return r3
        L_0x03f2:
            r0 = 0
            goto L_0x03cf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24881Ed.A09(android.database.Cursor, X.1Ed):X.9lY");
    }

    public static UserJid A0A(C24881Ed r0) {
        C19730wQ r02 = r0.A05;
        r02.A0G();
        AnonymousClass142 r03 = r02.A0E;
        C18740tg.A06(r03);
        UserJid userJid = (UserJid) r03.A0H;
        C18740tg.A06(userJid);
        return userJid;
    }

    public static void A0F(ContentValues contentValues, Pair pair, C26911Lz r8) {
        ((AnonymousClass1M0) r8).A02.A01(contentValues, "pay_transaction", (String) pair.first, "failPendingTransactionV2/UPDATE_PAY_TRANSACTION", (String[]) pair.second);
    }

    public long A0G() {
        Cursor A092;
        long j;
        AnonymousClass1M0 A042 = this.A03.get();
        try {
            A092 = A042.A02.A09("SELECT COUNT(*) as count FROM pay_transaction", "COUNT_TRANSACTIONS_SQL", (String[]) null);
            if (A092.moveToNext()) {
                j = A092.getLong(A092.getColumnIndexOrThrow("count"));
            } else {
                this.A04.A06("PaymentTransactionStore/countAllTransactions/version=2/db no message");
                j = 0;
            }
            A092.close();
            A042.close();
            return j;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019f A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.ContentValues A0H(X.C202319lY r9, X.C202319lY r10) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0057
            boolean r0 = r9.A0P(r10)
            if (r0 != 0) goto L_0x0057
            X.1Dc r4 = r8.A04
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "writeTransactionToCValues skipping transaction with: "
            r5.append(r0)
            java.lang.String r0 = r10.A0K
            r5.append(r0)
            java.lang.String r0 = " as status is not updated  old ts: "
            r5.append(r0)
            long r0 = r9.A06
            r5.append(r0)
            java.lang.String r3 = " counter: "
            r5.append(r3)
            X.8av r0 = r9.A0A
            r2 = 0
            if (r0 == 0) goto L_0x0055
            int r0 = r0.A07()
        L_0x0031:
            r5.append(r0)
            java.lang.String r0 = " new ts: "
            r5.append(r0)
            long r0 = r10.A06
            r5.append(r0)
            r5.append(r3)
            X.8av r0 = r10.A0A
            if (r0 == 0) goto L_0x0049
            int r2 = r0.A07()
        L_0x0049:
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            r4.A06(r0)
            r0 = 0
            return r0
        L_0x0055:
            r0 = 0
            goto L_0x0031
        L_0x0057:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r0 = r10.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x006b
            java.lang.String r1 = r10.A0L
            java.lang.String r0 = "key_id"
            r3.put(r0, r1)
        L_0x006b:
            int r0 = r10.A03
            if (r0 == 0) goto L_0x0078
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "type"
            r3.put(r0, r1)
        L_0x0078:
            java.lang.String r0 = r10.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0087
            java.lang.String r1 = r10.A0K
            java.lang.String r0 = "id"
            r3.put(r0, r1)
        L_0x0087:
            X.16X r0 = r10.A08
            if (r0 == 0) goto L_0x00a7
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00a7
            X.16X r0 = r10.A08
            java.math.BigDecimal r1 = r0.A00
            r0 = 3
            java.math.BigDecimal r0 = r1.scaleByPowerOfTen(r0)
            long r0 = r0.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "amount_1000"
            r3.put(r0, r1)
        L_0x00a7:
            long r1 = r10.A05
            r6 = 1000(0x3e8, double:4.94E-321)
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bc
            long r1 = r1 / r6
            int r0 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "init_timestamp"
            r3.put(r0, r1)
        L_0x00bc:
            int r0 = r10.A02
            java.lang.String r1 = "status"
            if (r0 != 0) goto L_0x00c6
            if (r9 == 0) goto L_0x00cd
            int r0 = r9.A02
        L_0x00c6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r1, r0)
        L_0x00cd:
            long r1 = r10.A06
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00de
            long r1 = r1 / r6
            int r0 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "timestamp"
            r3.put(r0, r1)
        L_0x00de:
            java.lang.String r0 = r10.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ed
            java.lang.String r1 = r10.A0H
            java.lang.String r0 = "credential_id"
            r3.put(r0, r1)
        L_0x00ed:
            java.lang.String r0 = r10.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00fc
            java.lang.String r1 = r10.A0J
            java.lang.String r0 = "error_code"
            r3.put(r0, r1)
        L_0x00fc:
            java.lang.String r0 = r10.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x010b
            java.lang.String r1 = r10.A0F
            java.lang.String r0 = "bank_transaction_id"
            r3.put(r0, r1)
        L_0x010b:
            java.lang.String r0 = r10.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x011a
            java.lang.String r1 = r10.A0M
            java.lang.String r0 = "request_key_id"
            r3.put(r0, r1)
        L_0x011a:
            java.util.ArrayList r2 = r10.A0N
            java.lang.String r1 = "methods"
            if (r2 == 0) goto L_0x019f
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x019f
            java.lang.String r0 = X.C203419nz.A04(r2)
        L_0x012a:
            r3.put(r1, r0)
        L_0x012d:
            java.lang.String r2 = "metadata"
            if (r9 == 0) goto L_0x0196
            X.8av r1 = r9.A0A
            if (r1 == 0) goto L_0x0196
            X.8av r0 = r10.A0A
            if (r0 == 0) goto L_0x0143
            r1.A0O(r0)
            X.8av r1 = r9.A0A
            int r0 = r9.A02
            r1.A0K(r0)
        L_0x0143:
            java.lang.String r0 = r1.A0H()
        L_0x0147:
            r3.put(r2, r0)
        L_0x014a:
            java.lang.String r0 = r10.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0159
            java.lang.String r1 = r10.A0G
            java.lang.String r0 = "country"
            r3.put(r0, r1)
        L_0x0159:
            int r0 = r10.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "version"
            r3.put(r0, r1)
            byte[] r1 = r10.A0R
            if (r1 == 0) goto L_0x016d
            java.lang.String r0 = "future_data"
            r3.put(r0, r1)
        L_0x016d:
            int r0 = r10.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "service_id"
            r3.put(r0, r1)
            X.6c9 r2 = r10.A05()
            if (r2 == 0) goto L_0x018a
            java.lang.String r1 = r2.A0F
            java.lang.String r0 = "background_id"
            r3.put(r0, r1)
            X.1Ee r0 = r8.A09
            r0.A04(r2)
        L_0x018a:
            int r0 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "purchase_initiator"
            r3.put(r0, r1)
            return r3
        L_0x0196:
            X.8av r0 = r10.A0A
            if (r0 == 0) goto L_0x014a
            java.lang.String r0 = r0.A0H()
            goto L_0x0147
        L_0x019f:
            if (r9 == 0) goto L_0x012d
            java.util.ArrayList r0 = r9.A0N
            if (r0 == 0) goto L_0x012d
            java.lang.String r0 = X.C203419nz.A04(r0)
            goto L_0x012a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24881Ed.A0H(X.9lY, X.9lY):android.content.ContentValues");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f7, code lost:
        if (r0 != null) goto L_0x01a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01fa A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.ContentValues A0I(X.C202319lY r9, X.C202319lY r10) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0057
            boolean r0 = r9.A0P(r10)
            if (r0 != 0) goto L_0x0057
            X.1Dc r4 = r8.A04
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "writeTransactionToCValuesV2 skipping transaction with: "
            r5.append(r0)
            java.lang.String r0 = r10.A0K
            r5.append(r0)
            java.lang.String r0 = " as status is not updated  old ts: "
            r5.append(r0)
            long r0 = r9.A06
            r5.append(r0)
            java.lang.String r3 = " counter: "
            r5.append(r3)
            X.8av r0 = r9.A0A
            r2 = 0
            if (r0 == 0) goto L_0x0055
            int r0 = r0.A07()
        L_0x0031:
            r5.append(r0)
            java.lang.String r0 = " new ts: "
            r5.append(r0)
            long r0 = r10.A06
            r5.append(r0)
            r5.append(r3)
            X.8av r0 = r10.A0A
            if (r0 == 0) goto L_0x0049
            int r2 = r0.A07()
        L_0x0049:
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            r4.A06(r0)
            r0 = 0
            return r0
        L_0x0055:
            r0 = 0
            goto L_0x0031
        L_0x0057:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            X.11F r1 = r10.A0C
            java.lang.String r6 = "remote_jid_row_id"
            r4 = -1
            if (r1 != 0) goto L_0x006a
            if (r9 == 0) goto L_0x007b
            X.11F r1 = r9.A0C
            if (r1 == 0) goto L_0x007b
        L_0x006a:
            X.12j r0 = r8.A02
            long r1 = r0.A07(r1)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x007b
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r3.put(r6, r0)
        L_0x007b:
            java.lang.String r0 = r10.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008a
            java.lang.String r1 = r10.A0L
            java.lang.String r0 = "key_id"
            r3.put(r0, r1)
        L_0x008a:
            int r0 = r10.A03
            if (r0 == 0) goto L_0x0097
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "type"
            r3.put(r0, r1)
        L_0x0097:
            java.lang.String r0 = r10.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a6
            java.lang.String r1 = r10.A0K
            java.lang.String r0 = "id"
            r3.put(r0, r1)
        L_0x00a6:
            com.whatsapp.jid.UserJid r1 = r10.A0E
            if (r1 == 0) goto L_0x00b9
            X.12j r0 = r8.A02
            long r0 = r0.A07(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "sender_jid_row_id"
            r3.put(r0, r1)
        L_0x00b9:
            com.whatsapp.jid.UserJid r1 = r10.A0D
            if (r1 == 0) goto L_0x00cc
            X.12j r0 = r8.A02
            long r0 = r0.A07(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "receiver_jid_row_id"
            r3.put(r0, r1)
        L_0x00cc:
            if (r9 == 0) goto L_0x00e4
            java.lang.String r0 = r10.A0I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00eb
            java.lang.String r1 = r10.A0I
            X.16U r0 = X.AnonymousClass16W.A06
            X.16V r0 = (X.AnonymousClass16V) r0
            java.lang.String r0 = r0.A02
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00eb
        L_0x00e4:
            java.lang.String r1 = r10.A0I
            java.lang.String r0 = "currency_code"
            r3.put(r0, r1)
        L_0x00eb:
            X.16X r0 = r10.A08
            if (r0 == 0) goto L_0x010b
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x010b
            X.16X r0 = r10.A08
            java.math.BigDecimal r1 = r0.A00
            r0 = 3
            java.math.BigDecimal r0 = r1.scaleByPowerOfTen(r0)
            long r0 = r0.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "amount_1000"
            r3.put(r0, r1)
        L_0x010b:
            long r1 = r10.A05
            r6 = 1000(0x3e8, double:4.94E-321)
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0120
            long r1 = r1 / r6
            int r0 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "init_timestamp"
            r3.put(r0, r1)
        L_0x0120:
            int r0 = r10.A02
            java.lang.String r1 = "status"
            if (r0 != 0) goto L_0x012a
            if (r9 == 0) goto L_0x0131
            int r0 = r9.A02
        L_0x012a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r1, r0)
        L_0x0131:
            long r1 = r10.A06
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0142
            long r1 = r1 / r6
            int r0 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "timestamp"
            r3.put(r0, r1)
        L_0x0142:
            java.lang.String r0 = r10.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0151
            java.lang.String r1 = r10.A0H
            java.lang.String r0 = "credential_id"
            r3.put(r0, r1)
        L_0x0151:
            java.lang.String r0 = r10.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0160
            java.lang.String r1 = r10.A0J
            java.lang.String r0 = "error_code"
            r3.put(r0, r1)
        L_0x0160:
            java.lang.String r0 = r10.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x016f
            java.lang.String r1 = r10.A0F
            java.lang.String r0 = "bank_transaction_id"
            r3.put(r0, r1)
        L_0x016f:
            java.lang.String r0 = r10.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x017e
            java.lang.String r1 = r10.A0M
            java.lang.String r0 = "request_key_id"
            r3.put(r0, r1)
        L_0x017e:
            java.util.ArrayList r2 = r10.A0N
            java.lang.String r1 = "methods"
            if (r2 == 0) goto L_0x01fa
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x01fa
            java.lang.String r0 = X.C203419nz.A04(r2)
        L_0x018e:
            r3.put(r1, r0)
        L_0x0191:
            java.lang.String r2 = "metadata"
            if (r9 == 0) goto L_0x01f5
            X.8av r1 = r9.A0A
            if (r1 == 0) goto L_0x01f5
            X.8av r0 = r10.A0A
            if (r0 == 0) goto L_0x01a0
            r1.A0O(r0)
        L_0x01a0:
            X.8av r0 = r9.A0A
        L_0x01a2:
            java.lang.String r0 = r0.A0H()
            r3.put(r2, r0)
        L_0x01a9:
            java.lang.String r0 = r10.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01b8
            java.lang.String r1 = r10.A0G
            java.lang.String r0 = "country"
            r3.put(r0, r1)
        L_0x01b8:
            int r0 = r10.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "version"
            r3.put(r0, r1)
            byte[] r1 = r10.A0R
            if (r1 == 0) goto L_0x01cc
            java.lang.String r0 = "future_data"
            r3.put(r0, r1)
        L_0x01cc:
            int r0 = r10.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "service_id"
            r3.put(r0, r1)
            X.6c9 r2 = r10.A05()
            if (r2 == 0) goto L_0x01e9
            java.lang.String r1 = r2.A0F
            java.lang.String r0 = "background_id"
            r3.put(r0, r1)
            X.1Ee r0 = r8.A09
            r0.A04(r2)
        L_0x01e9:
            int r0 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "purchase_initiator"
            r3.put(r0, r1)
            return r3
        L_0x01f5:
            X.8av r0 = r10.A0A
            if (r0 == 0) goto L_0x01a9
            goto L_0x01a2
        L_0x01fa:
            if (r9 == 0) goto L_0x0191
            java.util.ArrayList r0 = r9.A0N
            if (r0 == 0) goto L_0x0191
            java.lang.String r0 = X.C203419nz.A04(r0)
            goto L_0x018e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24881Ed.A0I(X.9lY, X.9lY):android.content.ContentValues");
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:74:0x0146=Splitter:B:74:0x0146, B:96:0x01f9=Splitter:B:96:0x01f9} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0M(X.AnonymousClass3T1 r22, boolean r23) {
        /*
            r21 = this;
            r5 = r22
            X.9lY r0 = r5.A0M
            if (r0 == 0) goto L_0x0210
            r4 = 0
            r3 = r21
            X.12P r0 = r3.A03     // Catch:{ SQLiteDatabaseCorruptException -> 0x0207 }
            X.1M0 r2 = r0.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0207 }
            X.9lY r0 = r5.A0M     // Catch:{ all -> 0x01fd }
            X.8av r9 = r0.A0A     // Catch:{ all -> 0x01fd }
            if (r9 == 0) goto L_0x0101
            java.lang.String r7 = r9.A0E()     // Catch:{ all -> 0x01fd }
            long r15 = r9.A0A()     // Catch:{ all -> 0x01fd }
            if (r7 == 0) goto L_0x00b0
            X.16S r1 = r3.A08     // Catch:{ all -> 0x01fd }
            com.whatsapp.payments.PaymentConfiguration r0 = r1.A01     // Catch:{ all -> 0x01fd }
            X.B66 r0 = r0.A01()     // Catch:{ all -> 0x01fd }
            if (r0 == 0) goto L_0x0039
            X.8av r12 = r0.BKY()     // Catch:{ all -> 0x01fd }
            if (r12 == 0) goto L_0x0032
            r1.A0E(r12, r7)     // Catch:{ all -> 0x01fd }
        L_0x0032:
            X.54d r0 = r1.A00     // Catch:{ all -> 0x01fd }
            X.1M0 r6 = r0.A04()     // Catch:{ all -> 0x01fd }
            goto L_0x003b
        L_0x0039:
            r12 = 0
            goto L_0x0032
        L_0x003b:
            X.71s r14 = r6.B1k()     // Catch:{ all -> 0x00a3 }
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0099 }
            r1 = 1
            r13 = 0
            if (r0 != 0) goto L_0x0087
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x0099 }
            r8.<init>()     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "tmp_id"
            r8.put(r0, r7)     // Catch:{ all -> 0x0099 }
            java.lang.String r9 = r9.A0I()     // Catch:{ all -> 0x0099 }
            if (r9 == 0) goto L_0x0087
            java.lang.String r0 = "tmp_metadata"
            r8.put(r0, r9)     // Catch:{ all -> 0x0099 }
            java.lang.String r11 = "tmp_ts"
            r9 = 1000(0x3e8, double:4.94E-321)
            long r15 = r15 / r9
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0099 }
            r8.put(r11, r0)     // Catch:{ all -> 0x0099 }
            if (r12 == 0) goto L_0x008b
            java.lang.String r0 = r12.A0E()     // Catch:{ all -> 0x0099 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0099 }
            if (r0 != 0) goto L_0x008b
            X.14e r15 = r6.A02     // Catch:{ all -> 0x0099 }
            java.lang.String r17 = "tmp_transactions"
            java.lang.String r18 = "tmp_id=?"
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch:{ all -> 0x0099 }
            r0[r13] = r7     // Catch:{ all -> 0x0099 }
            java.lang.String r19 = "storePaymentTransactionTmpInfo/UPDATE_SCHEMA_PAY_TRANSACTIONS_TMP"
            r20 = r0
            r16 = r8
            r15.A01(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0099 }
        L_0x0087:
            r14.A00()     // Catch:{ all -> 0x0099 }
            goto L_0x0095
        L_0x008b:
            X.14e r7 = r6.A02     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = "tmp_transactions"
            java.lang.String r0 = "storePaymentTransactionTmpInfo/INSERT_SCHEMA_PAY_TRANSACTIONS_TMP"
            r7.A04(r1, r0, r8)     // Catch:{ all -> 0x0099 }
            goto L_0x0087
        L_0x0095:
            r14.close()     // Catch:{ all -> 0x00a3 }
            goto L_0x00ad
        L_0x0099:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x009e }
            goto L_0x00a2
        L_0x009e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00a3 }
        L_0x00a2:
            throw r1     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00a8 }
            goto L_0x00ac
        L_0x00a8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01fd }
        L_0x00ac:
            throw r1     // Catch:{ all -> 0x01fd }
        L_0x00ad:
            r6.close()     // Catch:{ all -> 0x01fd }
        L_0x00b0:
            X.16S r6 = r3.A08     // Catch:{ all -> 0x01fd }
            X.9lY r0 = r5.A0M     // Catch:{ all -> 0x01fd }
            com.whatsapp.jid.UserJid r1 = r0.A0E     // Catch:{ all -> 0x01fd }
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x01fd }
            com.whatsapp.jid.UserJid r0 = X.C222813r.A00(r1)     // Catch:{ all -> 0x01fd }
            X.8ax r7 = r6.A05(r0)     // Catch:{ all -> 0x01fd }
            X.9lY r0 = r5.A0M     // Catch:{ all -> 0x01fd }
            X.8av r0 = r0.A0A     // Catch:{ all -> 0x01fd }
            java.lang.String r1 = r0.A0G()     // Catch:{ all -> 0x01fd }
            if (r7 == 0) goto L_0x00fc
            com.whatsapp.jid.UserJid r0 = r7.A04     // Catch:{ all -> 0x01fd }
            if (r0 == 0) goto L_0x00fc
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x01fd }
            if (r0 != 0) goto L_0x00fc
            java.lang.String r0 = r7.A08()     // Catch:{ all -> 0x01fd }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01fd }
            if (r0 != 0) goto L_0x00fc
            r7.A0A(r1)     // Catch:{ all -> 0x01fd }
            r6.A0H(r7)     // Catch:{ all -> 0x01fd }
            X.1Dc r6 = r3.A04     // Catch:{ all -> 0x01fd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fd }
            r1.<init>()     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = "updated the contact for "
            r1.append(r0)     // Catch:{ all -> 0x01fd }
            com.whatsapp.jid.UserJid r0 = r7.A04     // Catch:{ all -> 0x01fd }
            r1.append(r0)     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01fd }
            r6.A06(r0)     // Catch:{ all -> 0x01fd }
        L_0x00fc:
            X.9lY r0 = r5.A0M     // Catch:{ all -> 0x01fd }
            r3.A0b(r0)     // Catch:{ all -> 0x01fd }
        L_0x0101:
            if (r23 == 0) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            r8 = r4
            goto L_0x0110
        L_0x0106:
            X.3Qa r0 = r5.A1J     // Catch:{ all -> 0x01fd }
            java.lang.String r6 = r0.A01     // Catch:{ all -> 0x01fd }
            r0 = -1
            X.9lY r8 = r3.A0L(r6, r4, r0)     // Catch:{ all -> 0x01fd }
        L_0x0110:
            X.9lY r0 = r5.A0M     // Catch:{ all -> 0x01fd }
            android.content.ContentValues r0 = r3.A0H(r8, r0)     // Catch:{ all -> 0x01fd }
            if (r0 != 0) goto L_0x011c
            r2.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0207 }
            return r4
        L_0x011c:
            if (r8 == 0) goto L_0x014a
            java.lang.String r0 = r8.A0L     // Catch:{ all -> 0x01fd }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01fd }
            if (r0 != 0) goto L_0x014a
            X.1Dc r6 = r3.A04     // Catch:{ all -> 0x01fd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fd }
            r1.<init>()     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = "insertMessagePaymentInfo/found no columns to update: "
            r1.append(r0)     // Catch:{ all -> 0x01fd }
            X.3Qa r0 = r5.A1J     // Catch:{ all -> 0x01fd }
            r1.append(r0)     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01fd }
            r6.A06(r0)     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = r8.A0K     // Catch:{ all -> 0x01fd }
            if (r0 != 0) goto L_0x0146
            X.9lY r0 = r5.A0M     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = r0.A0K     // Catch:{ all -> 0x01fd }
        L_0x0146:
            r2.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0207 }
            return r0
        L_0x014a:
            X.9lY r0 = r5.A0M     // Catch:{ all -> 0x01fd }
            android.content.ContentValues r14 = r3.A0I(r8, r0)     // Catch:{ all -> 0x01fd }
            if (r14 == 0) goto L_0x01af
            if (r8 == 0) goto L_0x015c
            java.lang.String r0 = r8.A0L     // Catch:{ all -> 0x01fd }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01fd }
            if (r0 == 0) goto L_0x0176
        L_0x015c:
            X.12j r1 = r3.A02     // Catch:{ all -> 0x01fd }
            X.3Qa r6 = r5.A1J     // Catch:{ all -> 0x01fd }
            X.11F r0 = r6.A00     // Catch:{ all -> 0x01fd }
            long r0 = r1.A07(r0)     // Catch:{ all -> 0x01fd }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = "remote_jid_row_id"
            r14.put(r0, r1)     // Catch:{ all -> 0x01fd }
            java.lang.String r1 = r6.A01     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = "key_id"
            r14.put(r0, r1)     // Catch:{ all -> 0x01fd }
        L_0x0176:
            long r0 = r5.A1N     // Catch:{ all -> 0x01fd }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = "message_row_id"
            r14.put(r0, r1)     // Catch:{ all -> 0x01fd }
            java.lang.String r7 = "/"
            if (r8 != 0) goto L_0x01b8
            X.14e r6 = r2.A02     // Catch:{ all -> 0x01fd }
            java.lang.String r1 = "pay_transaction"
            java.lang.String r0 = "insertOrUpdateMessagePaymentInfoV2/REPLACE_PAY_TRANSACTION"
            long r0 = r6.A06(r1, r0, r14)     // Catch:{ all -> 0x01fd }
            X.1Dc r9 = r3.A04     // Catch:{ all -> 0x01fd }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fd }
            r8.<init>()     // Catch:{ all -> 0x01fd }
            java.lang.String r6 = "insertMessagePaymentInfoV2/"
        L_0x0198:
            r8.append(r6)     // Catch:{ all -> 0x01fd }
            X.3Qa r6 = r5.A1J     // Catch:{ all -> 0x01fd }
            X.11F r6 = r6.A00     // Catch:{ all -> 0x01fd }
            r8.append(r6)     // Catch:{ all -> 0x01fd }
            r8.append(r7)     // Catch:{ all -> 0x01fd }
            r8.append(r0)     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x01fd }
            r9.A06(r0)     // Catch:{ all -> 0x01fd }
        L_0x01af:
            X.9lY r0 = r5.A0M     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = r0.A0K     // Catch:{ all -> 0x01fd }
            if (r0 != 0) goto L_0x01f9
            java.lang.String r0 = "UNSET"
            goto L_0x01f9
        L_0x01b8:
            long r0 = r5.A1N     // Catch:{ all -> 0x01fd }
            r12 = -1
            java.lang.String r6 = "insertMessagePaymentInfoV2/found old row and updating "
            r11 = 0
            r10 = 1
            int r9 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x01ea
            r0 = 2
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x01fd }
            long r0 = r5.A1N     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x01fd }
            r9[r11] = r0     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = r8.A0K     // Catch:{ all -> 0x01fd }
            r9[r10] = r0     // Catch:{ all -> 0x01fd }
            X.14e r13 = r2.A02     // Catch:{ all -> 0x01fd }
            java.lang.String r15 = "pay_transaction"
            java.lang.String r16 = "message_row_id=? OR id=?"
            java.lang.String r17 = "insertOrUpdateMessagePaymentInfoV2/withMessageId/UPDATE_PAY_TRANSACTION"
        L_0x01db:
            r18 = r9
            int r0 = r13.A01(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01fd }
            long r0 = (long) r0     // Catch:{ all -> 0x01fd }
            X.1Dc r9 = r3.A04     // Catch:{ all -> 0x01fd }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fd }
            r8.<init>()     // Catch:{ all -> 0x01fd }
            goto L_0x0198
        L_0x01ea:
            java.lang.String[] r9 = new java.lang.String[r10]     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = r8.A0K     // Catch:{ all -> 0x01fd }
            r9[r11] = r0     // Catch:{ all -> 0x01fd }
            X.14e r13 = r2.A02     // Catch:{ all -> 0x01fd }
            java.lang.String r15 = "pay_transaction"
            java.lang.String r16 = "id=?"
            java.lang.String r17 = "insertOrUpdateMessagePaymentInfoV2/UPDATE_PAY_TRANSACTION"
            goto L_0x01db
        L_0x01f9:
            r2.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0207 }
            return r0
        L_0x01fd:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0202 }
            goto L_0x0206
        L_0x0202:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0207 }
        L_0x0206:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0207 }
        L_0x0207:
            r2 = move-exception
            X.1Dc r1 = r3.A04
            java.lang.String r0 = "insertMessagePaymentInfo"
            r1.A0A(r0, r2)
            return r4
        L_0x0210:
            java.lang.String r1 = "PaymentTransactionStore"
            java.lang.String r0 = "insertMessagePaymentInfo transaction info is null"
            java.lang.String r1 = X.C24611Dc.A01(r1, r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24881Ed.A0M(X.3T1, boolean):java.lang.String");
    }

    public ArrayList A0R(List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("id IN (\"");
        sb.append(TextUtils.join("\",\"", list));
        sb.append("\")");
        String obj = sb.toString();
        AnonymousClass1M0 A042 = this.A03.get();
        try {
            Cursor A0A2 = A042.A02.A0A("pay_transaction", A0A, obj, (String[]) null, (String) null, (String) null, "100", "readTransactionsByIds/QUERY_PAY_TRANSACTION");
            if (A0A2 != null) {
                try {
                    ArrayList arrayList = new ArrayList(A0A2.getCount());
                    while (A0A2.moveToNext()) {
                        arrayList.add(A09(A0A2, this));
                    }
                    C24611Dc r3 = this.A04;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("readTransactionsByIds returned: ");
                    sb2.append(arrayList.size());
                    r3.A06(sb2.toString());
                    A0A2.close();
                    A042.close();
                    return arrayList;
                } catch (C19740wR e) {
                    this.A04.A0A("readTransactionsByIds/InvalidJidException - Skipped transaction with invalid JID", e);
                } catch (Throwable th) {
                    A0A2.close();
                    throw th;
                }
            } else {
                A042.close();
                return new ArrayList();
            }
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public void A0V(C202319lY r5) {
        B66 A022;
        B66 A023;
        C202319lY A0L = A0L(r5.A0L, r5.A0K, -1);
        if (A0L != null) {
            C175708av r0 = A0L.A0A;
            if (r0 != null || ((A023 = this.A00.A02(A0L.A0G, A0L.A0I)) != null && (r0 = A023.BKY()) != null)) {
                synchronized (A0L) {
                    C175708av r1 = A0L.A0A;
                    if (r1 == null) {
                        A0L.A0A = r0;
                        r1 = r0;
                    }
                    r1.A04 = true;
                }
                A0a(A0L);
                return;
            }
            return;
        }
        C175708av r02 = r5.A0A;
        if (r02 != null || ((A022 = this.A00.A02(r5.A0G, r5.A0I)) != null && (r02 = A022.BKY()) != null)) {
            synchronized (r5) {
                C175708av r12 = r5.A0A;
                if (r12 == null) {
                    r5.A0A = r02;
                    r12 = r02;
                }
                r12.A04 = true;
            }
            A0a(r5);
        }
    }

    public void A0X(AnonymousClass3T1 r6) {
        String str;
        if (r6.A1I == 0) {
            String str2 = "UNSET";
            if (str2.equals(r6.A0t)) {
                C202319lY A0L = A0L(r6.A1J.A01, (String) null, -1);
                if (A0L == null && !C203419nz.A06(r6.A0M)) {
                    A0M(r6, false);
                }
                r6.A0M = A0L;
                if (!(A0L == null || (str = A0L.A0K) == null)) {
                    str2 = str;
                }
                r6.A0t = str2;
            }
        }
    }

    public boolean A0a(C202319lY r5) {
        C202319lY A0L = A0L(r5.A0L, r5.A0K, -1);
        if (A0L == null) {
            return false;
        }
        r5.A06 = C19970wo.A00(this.A01);
        return A0c(r5, A0L, r5.A0L);
    }

    public boolean A0d(C202319lY r11, C64933Qa r12, int i, int i2, long j) {
        AnonymousClass1M0 A052;
        C175708av BKY;
        B66 A022 = this.A00.A02(r11.A0G, r11.A0I);
        if (!(A022 == null || (BKY = A022.BKY()) == null)) {
            synchronized (r11) {
                if (i > 0) {
                    if (r11.A02 != i) {
                        C175708av r0 = r11.A0A;
                        if (r0 == null) {
                            r11.A0A = BKY;
                            r0 = BKY;
                        }
                        r0.A0K(i);
                    }
                }
            }
            r11.A0A(BKY, j);
            r11.A09(BKY, i2);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, Integer.valueOf(r11.A03));
        contentValues.put("status", Integer.valueOf(r11.A02));
        contentValues.put("timestamp", Integer.valueOf((int) (r11.A06 / 1000)));
        if (!TextUtils.isEmpty(r11.A0K)) {
            contentValues.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r11.A0K);
        }
        if (!TextUtils.isEmpty(r11.A0H)) {
            contentValues.put("credential_id", r11.A0H);
        }
        if (!TextUtils.isEmpty(r11.A0J)) {
            contentValues.put("error_code", r11.A0J);
        }
        if (!TextUtils.isEmpty(r11.A0F)) {
            contentValues.put("bank_transaction_id", r11.A0F);
        }
        C175708av r02 = r11.A0A;
        if (r02 != null) {
            contentValues.put("metadata", r02.A0H());
        }
        String str = r12.A01;
        try {
            A052 = this.A03.A05();
            Pair A072 = A07(str, r11.A0K);
            boolean z = false;
            if (A072 != null) {
                if (A052.A02.A01(contentValues, "pay_transaction", (String) A072.first, "updateMessagePaymentInfoV2/UPDATE_PAY_TRANSACTION", (String[]) A072.second) > 0) {
                    z = true;
                }
            }
            if (r11.A0A != null && z) {
                A0b(r11);
            }
            A052.close();
            return z;
        } catch (SQLiteDatabaseCorruptException e) {
            this.A04.A0A("PaymentTransactionStore/insertMessagePaymentInfo", e);
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a6, code lost:
        if (r7.A0L.equals("undefined") != false) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0e(java.util.List r20) {
        /*
            r19 = this;
            java.lang.String r5 = " counter: "
            r12 = 0
            r4 = r19
            if (r20 == 0) goto L_0x0148
            int r0 = r20.size()
            if (r0 <= 0) goto L_0x0148
            X.12P r0 = r4.A03
            X.1M0 r2 = r0.A05()
            X.71s r11 = r2.B1k()     // Catch:{ all -> 0x013e }
            java.util.Iterator r10 = r20.iterator()     // Catch:{ all -> 0x0134 }
            r3 = 0
        L_0x001c:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r7 = r10.next()     // Catch:{ all -> 0x0134 }
            X.9lY r7 = (X.C202319lY) r7     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = r7.A0K     // Catch:{ all -> 0x0134 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0134 }
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = r7.A0K     // Catch:{ all -> 0x0134 }
            X.9lY r9 = r4.A0K(r0)     // Catch:{ all -> 0x0134 }
            if (r9 == 0) goto L_0x008b
            boolean r0 = r9.A0P(r7)     // Catch:{ all -> 0x0134 }
            if (r0 != 0) goto L_0x008b
            X.1Dc r6 = r4.A04     // Catch:{ all -> 0x0134 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0134 }
            r8.<init>()     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = "storeTransactions skipping store transaction with: "
            r8.append(r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = r7.A0K     // Catch:{ all -> 0x0134 }
            r8.append(r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = " as status is not updated  old ts: "
            r8.append(r0)     // Catch:{ all -> 0x0134 }
            long r0 = r9.A06     // Catch:{ all -> 0x0134 }
            r8.append(r0)     // Catch:{ all -> 0x0134 }
            r8.append(r5)     // Catch:{ all -> 0x0134 }
            X.8av r0 = r9.A0A     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0089
            int r0 = r0.A07()     // Catch:{ all -> 0x0134 }
        L_0x0064:
            r8.append(r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = " new ts: "
            r8.append(r0)     // Catch:{ all -> 0x0134 }
            long r0 = r7.A06     // Catch:{ all -> 0x0134 }
            r8.append(r0)     // Catch:{ all -> 0x0134 }
            r8.append(r5)     // Catch:{ all -> 0x0134 }
            X.8av r0 = r7.A0A     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0087
            int r0 = r0.A07()     // Catch:{ all -> 0x0134 }
        L_0x007c:
            r8.append(r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0134 }
            r6.A06(r0)     // Catch:{ all -> 0x0134 }
            goto L_0x00e8
        L_0x0087:
            r0 = 0
            goto L_0x007c
        L_0x0089:
            r0 = 0
            goto L_0x0064
        L_0x008b:
            android.content.ContentValues r14 = r4.A0I(r9, r7)     // Catch:{ all -> 0x0134 }
            if (r14 == 0) goto L_0x001c
            java.lang.String r8 = "id=?"
            java.lang.String r0 = r7.A0L     // Catch:{ all -> 0x0134 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0134 }
            r9 = 1
            if (r0 != 0) goto L_0x00a8
            java.lang.String r1 = r7.A0L     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = "undefined"
            boolean r6 = r1.equals(r0)     // Catch:{ all -> 0x0134 }
            r1 = 0
            r0 = 2
            if (r6 == 0) goto L_0x00aa
        L_0x00a8:
            r1 = 1
            r0 = 1
        L_0x00aa:
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = r7.A0K     // Catch:{ all -> 0x0134 }
            r6[r12] = r0     // Catch:{ all -> 0x0134 }
            if (r1 != 0) goto L_0x00c7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0134 }
            r1.<init>()     // Catch:{ all -> 0x0134 }
            r1.append(r8)     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = " OR key_id=?"
            r1.append(r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = r7.A0L     // Catch:{ all -> 0x0134 }
            r6[r9] = r0     // Catch:{ all -> 0x0134 }
        L_0x00c7:
            X.14e r13 = r2.A02     // Catch:{ all -> 0x0134 }
            java.lang.String r15 = "pay_transaction"
            java.lang.String r17 = "storeTransactionV2/UPDATE_PAY_TRANSACTION"
            r16 = r8
            r18 = r6
            int r0 = r13.A01(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0134 }
            long r0 = (long) r0     // Catch:{ all -> 0x0134 }
            r7 = 1
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x00e8
            java.lang.String r0 = "storeTransactionV2/INSERT_PAY_TRANSACTION"
            long r8 = r13.A04(r15, r0, r14)     // Catch:{ all -> 0x0134 }
            r6 = 0
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x001c
        L_0x00e8:
            int r3 = r3 + 1
            goto L_0x001c
        L_0x00ec:
            X.1Dc r1 = r4.A04     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = "could not update or insert transaction with empty transaction id"
            r1.A06(r0)     // Catch:{ all -> 0x0134 }
            goto L_0x001c
        L_0x00f5:
            r11.A00()     // Catch:{ all -> 0x0134 }
            r11.close()     // Catch:{ all -> 0x013e }
            r2.close()
            int r0 = r20.size()
            X.1Dc r2 = r4.A04
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r3 != r0) goto L_0x0122
            r1.<init>()
            java.lang.String r0 = "storeTransactions stored: "
        L_0x010d:
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r2.A06(r0)
            int r0 = r20.size()
            if (r3 != r0) goto L_0x014f
            r12 = 1
            return r12
        L_0x0122:
            r1.<init>()
            java.lang.String r0 = "storeTransactions got: "
            r1.append(r0)
            int r0 = r20.size()
            r1.append(r0)
            java.lang.String r0 = " transactions but stored: "
            goto L_0x010d
        L_0x0134:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0139 }
            goto L_0x013d
        L_0x0139:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x013e }
        L_0x013d:
            throw r1     // Catch:{ all -> 0x013e }
        L_0x013e:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0143 }
            throw r1
        L_0x0143:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0148:
            X.1Dc r1 = r4.A04
            java.lang.String r0 = "storeTransactions not storing transactions"
            r1.A06(r0)
        L_0x014f:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24881Ed.A0e(java.util.List):boolean");
    }

    public C24881Ed(C19730wQ r4, C19970wo r5, C219712j r6, AnonymousClass12P r7, C219612i r8, AnonymousClass16T r9, AnonymousClass16S r10, C24891Ee r11) {
        this.A01 = r5;
        this.A02 = r6;
        this.A05 = r4;
        this.A08 = r10;
        this.A06 = r8;
        this.A03 = r7;
        this.A09 = r11;
        this.A07 = r9;
    }

    public static Pair A07(String str, String str2) {
        String[] strArr;
        String str3;
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (isEmpty && isEmpty2) {
            return null;
        }
        if (isEmpty) {
            strArr = new String[]{str2};
            str3 = "id=?";
        } else if (!isEmpty2) {
            strArr = new String[]{str, str2};
            str3 = "key_id=? OR id=?";
        } else {
            strArr = new String[]{str};
            str3 = "key_id=?";
        }
        return new Pair(str3, strArr);
    }

    public static Pair A08(String str, String str2) {
        String[] strArr;
        String str3;
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (isEmpty && isEmpty2) {
            return null;
        }
        if (isEmpty) {
            strArr = new String[]{str2};
            str3 = "id=?";
        } else if (!isEmpty2) {
            strArr = new String[]{str, str, str2};
            str3 = "key_id=? OR interop_id=? OR id=?";
        } else {
            strArr = new String[]{str, str};
            str3 = "key_id=? OR interop_id=?";
        }
        return new Pair(str3, strArr);
    }

    public static ArrayList A0B(Cursor cursor, C24881Ed r6, String str) {
        ArrayList arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            try {
                arrayList.add(A09(cursor, r6));
            } catch (C19740wR e) {
                C24611Dc r2 = r6.A04;
                StringBuilder sb = new StringBuilder();
                sb.append("PaymentTransactionStore/");
                sb.append(str);
                sb.append("/InvalidJidException- Skipped pending transaction with invalid JID");
                r2.A0A(sb.toString(), e);
            }
        }
        return arrayList;
    }

    public ArrayList A0Q(C193889Nh r13) {
        Cursor A0A2;
        Pair A062 = A06(this, r13);
        String[] strArr = (String[]) A062.first;
        String str = (String) A062.second;
        try {
            AnonymousClass1M0 A042 = this.A03.get();
            try {
                A0A2 = A042.A02.A0A("pay_transaction", A0A, str, strArr, (String) null, "init_timestamp DESC", (String) null, "readTransactionsWithFilters/QUERY_PAY_TRANSACTION");
                if (A0A2 != null) {
                    ArrayList A0B = A0B(A0A2, this, "readTransactionsWithFilters");
                    C24611Dc r3 = this.A04;
                    StringBuilder sb = new StringBuilder();
                    sb.append("readTransactionsWithFilters returned: ");
                    sb.append(A0B.size());
                    C24611Dc.A02(r3, (String) null, sb.toString());
                    A0A2.close();
                    A042.close();
                    return A0B;
                }
                A042.close();
                return new ArrayList();
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            this.A04.A0A("PaymentTransactionStore/readTransactionsWithFilters ", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void A0Y(String str, int i, int i2, long j, long j2) {
        C202319lY A0K;
        B66 A022;
        if (!TextUtils.isEmpty(str) && i > 0 && j > 0 && j2 > 0 && i2 > 0 && (A0K = A0K(str)) != null) {
            C175708av r5 = A0K.A0A;
            if (!(r5 == null && ((A022 = this.A00.A02(A0K.A0G, A0K.A0I)) == null || (r5 = A022.BKY()) == null))) {
                r5.A0L(A0K.A03);
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, Integer.valueOf(i));
            contentValues.put("init_timestamp", Integer.valueOf((int) (j / 1000)));
            contentValues.put("status", Integer.valueOf(i2));
            contentValues.put("timestamp", Integer.valueOf((int) (j2 / 1000)));
            String[] strArr = {str};
            AnonymousClass1M0 A052 = this.A03.A05();
            try {
                A052.A02.A01(contentValues, "pay_transaction", "id=?", "updateTransactionTypeStatusTimestampsByIdV2/UPDATE_PAY_TRANSACTION", strArr);
                A052.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }
}
