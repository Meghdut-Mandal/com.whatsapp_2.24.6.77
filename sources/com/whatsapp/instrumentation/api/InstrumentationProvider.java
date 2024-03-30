package com.whatsapp.instrumentation.api;

import X.AnonymousClass12U;
import X.AnonymousClass1VC;
import X.AnonymousClass1VE;
import X.AnonymousClass1VH;
import X.C119635qC;
import X.C128946Ef;
import X.C19380ur;
import X.C21100yf;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.text.TextUtils;

public class InstrumentationProvider extends C19380ur {
    public AnonymousClass1VC A00;
    public C119635qC A01;
    public AnonymousClass1VE A02;
    public AnonymousClass1VH A03;
    public AnonymousClass12U A04;

    public String getType(Uri uri) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f3, code lost:
        if ((!r14.A06.A0C((com.whatsapp.jid.GroupJid) r1)) == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010a, code lost:
        if (android.text.TextUtils.isEmpty(r14.A03.A0F(r3, false).A01) == false) goto L_0x010c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r32, java.lang.String[] r33, java.lang.String r34, java.lang.String[] r35, java.lang.String r36) {
        /*
            r31 = this;
            r0 = r31
            r3 = r32
            X.6Ef r28 = r0.A00(r3)
            X.5qC r2 = r0.A01
            android.content.UriMatcher r0 = r2.A00
            int r1 = r0.match(r3)
            r0 = 1
            if (r1 != r0) goto L_0x021d
            X.005 r0 = r2.A01
            java.lang.Object r14 = r0.get()
            X.6SV r14 = (X.AnonymousClass6SV) r14
            java.lang.String r6 = "restoring_calling_identity"
            java.util.concurrent.atomic.AtomicInteger r0 = X.AnonymousClass6SV.A0G
            int r5 = r0.incrementAndGet()
            X.0zE r4 = r14.A0F
            r2 = 494352396(0x1d77380c, float:3.2719153E-21)
            r0 = 0
            r4.BPM(r2, r5, r0)
            long r15 = android.os.Binder.clearCallingIdentity()
            java.lang.String r0 = "identity_cleared"
            r4.markerPoint((int) r2, (int) r5, (java.lang.String) r0)
            X.16D r0 = r14.A02     // Catch:{ all -> 0x01fa }
            X.16p r11 = r0.A05     // Catch:{ all -> 0x01fa }
            r0 = 1
            X.14g r10 = new X.14g     // Catch:{ all -> 0x01fa }
            r10.<init>((boolean) r0)     // Catch:{ all -> 0x01fa }
            r10.A03()     // Catch:{ all -> 0x01fa }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x01fa }
            r9.<init>()     // Catch:{ all -> 0x01fa }
            X.16r r0 = r11.A00     // Catch:{ all -> 0x01fa }
            X.1M0 r8 = r0.get()     // Catch:{ all -> 0x01fa }
            java.lang.String r3 = X.AnonymousClass2x7.A00     // Catch:{ all -> 0x01f0 }
            r1 = 0
            java.lang.String r0 = "GET_ALL_DB_CONTACTS"
            android.database.Cursor r12 = X.C229416o.A03(r8, r3, r0, r1)     // Catch:{ all -> 0x01f0 }
            int r7 = r12.getCount()     // Catch:{ all -> 0x01e4 }
        L_0x005a:
            boolean r0 = r12.moveToNext()     // Catch:{ IllegalStateException -> 0x0068 }
            if (r0 == 0) goto L_0x0072
            X.141 r0 = X.C53712rl.A00(r12)     // Catch:{ IllegalStateException -> 0x0068 }
            r9.add(r0)     // Catch:{ IllegalStateException -> 0x0068 }
            goto L_0x005a
        L_0x0068:
            r3 = move-exception
            java.lang.String r1 = "contactmanagerdb/getAllDBContacts/"
            int r0 = r9.size()     // Catch:{ all -> 0x01e4 }
            X.C229516p.A0L(r3, r1, r7, r0)     // Catch:{ all -> 0x01e4 }
        L_0x0072:
            r12.close()     // Catch:{ all -> 0x01f0 }
            r8.close()     // Catch:{ all -> 0x01fa }
            X.C229516p.A0F(r11, r9)     // Catch:{ all -> 0x01fa }
            r9.size()     // Catch:{ all -> 0x01fa }
            r10.A00()     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = "db_read_end"
            r4.markerPoint((int) r2, (int) r5, (java.lang.String) r0)     // Catch:{ all -> 0x01fa }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x01fa }
            r13.<init>()     // Catch:{ all -> 0x01fa }
            java.util.Iterator r8 = r9.iterator()     // Catch:{ all -> 0x01fa }
        L_0x008f:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x014b
            java.lang.Object r3 = r8.next()     // Catch:{ all -> 0x01fa }
            X.141 r3 = (X.AnonymousClass141) r3     // Catch:{ all -> 0x01fa }
            if (r3 == 0) goto L_0x008f
            java.lang.Class<X.11F> r7 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r1 = r3.A06(r7)     // Catch:{ all -> 0x01fa }
            X.11F r1 = (X.AnonymousClass11F) r1     // Catch:{ all -> 0x01fa }
            if (r1 == 0) goto L_0x0110
            X.3S0 r0 = r14.A0E     // Catch:{ all -> 0x01fa }
            boolean r0 = r0.A01(r1)     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x0110
            com.whatsapp.jid.Jid r0 = r3.A06(r7)     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x0110
            boolean r0 = r1 instanceof X.C28981Uw     // Catch:{ all -> 0x01fa }
            if (r0 != 0) goto L_0x0110
            boolean r0 = X.C197029b1.A00(r1)     // Catch:{ all -> 0x01fa }
            if (r0 != 0) goto L_0x0110
            boolean r0 = r3.A0z     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x0110
            X.11F r1 = r3.A0H     // Catch:{ all -> 0x01fa }
            boolean r0 = r1 instanceof X.C177618e5     // Catch:{ all -> 0x01fa }
            if (r0 != 0) goto L_0x0110
            X.0wQ r0 = r14.A01     // Catch:{ all -> 0x01fa }
            boolean r0 = r0.A0M(r1)     // Catch:{ all -> 0x01fa }
            if (r0 != 0) goto L_0x0110
            X.11F r1 = r3.A0H     // Catch:{ all -> 0x01fa }
            boolean r0 = X.AnonymousClass143.A0E(r1)     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x0110
            boolean r0 = r1 instanceof X.C177638e7     // Catch:{ all -> 0x01fa }
            if (r0 != 0) goto L_0x0110
            boolean r0 = r3.A0G()     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x00f5
            X.11F r1 = r3.A0H     // Catch:{ all -> 0x01fa }
            boolean r0 = r1 instanceof X.AnonymousClass147     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x00f5
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1     // Catch:{ all -> 0x01fa }
            X.17X r0 = r14.A06     // Catch:{ all -> 0x01fa }
            boolean r0 = r0.A0C(r1)     // Catch:{ all -> 0x01fa }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0110
        L_0x00f5:
            X.0yC r0 = r14.A07     // Catch:{ all -> 0x01fa }
            boolean r0 = X.AnonymousClass3M0.A00(r3, r0)     // Catch:{ all -> 0x01fa }
            if (r0 != 0) goto L_0x0110
            X.171 r1 = r14.A03     // Catch:{ all -> 0x01fa }
            r0 = 0
            X.34G r0 = r1.A0F(r3, r0)     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x01fa }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01fa }
            if (r0 != 0) goto L_0x0110
        L_0x010c:
            r13.add(r3)     // Catch:{ all -> 0x01fa }
            goto L_0x008f
        L_0x0110:
            X.0yC r7 = r14.A07     // Catch:{ all -> 0x01fa }
            r1 = 5470(0x155e, float:7.665E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x01fa }
            boolean r0 = X.C20800yB.A01(r0, r7, r1)     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x008f
            X.0v5 r0 = r14.A00     // Catch:{ all -> 0x01fa }
            java.lang.Object r7 = r0.A03()     // Catch:{ all -> 0x01fa }
            X.1HX r7 = (X.AnonymousClass1HX) r7     // Catch:{ all -> 0x01fa }
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r3.A06(r0)     // Catch:{ all -> 0x01fa }
            X.11F r1 = (X.AnonymousClass11F) r1     // Catch:{ all -> 0x01fa }
            if (r1 == 0) goto L_0x008f
            if (r7 == 0) goto L_0x008f
            X.1Hg r0 = r7.A00     // Catch:{ all -> 0x01fa }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x008f
            boolean r0 = X.C197029b1.A00(r1)     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x008f
            X.12q r0 = r14.A05     // Catch:{ all -> 0x01fa }
            java.util.Set r0 = r0.A0G()     // Catch:{ all -> 0x01fa }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x008f
            goto L_0x010c
        L_0x014b:
            java.lang.String r3 = "contact_count"
            int r1 = r13.size()     // Catch:{ all -> 0x01fa }
            r0 = 10
            if (r1 >= r0) goto L_0x0181
            java.lang.String r0 = "<10"
        L_0x0157:
            r4.markerAnnotate((int) r2, (int) r5, (java.lang.String) r3, (java.lang.String) r0)     // Catch:{ all -> 0x01fa }
            java.lang.String r7 = "is_linked_with_sg"
            X.1VE r8 = r14.A0D     // Catch:{ all -> 0x01fa }
            java.lang.String r1 = "com.facebook.stella"
            java.lang.String r0 = "com.facebook.stella_debug"
            java.lang.String[] r9 = new java.lang.String[]{r1, r0}     // Catch:{ all -> 0x01fa }
            r12 = 2
            r3 = 0
        L_0x0168:
            r1 = r9[r3]     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = "auth/token"
            java.lang.String r1 = X.AnonymousClass1VE.A01(r1, r0)     // Catch:{ all -> 0x01fa }
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r8)     // Catch:{ all -> 0x01fa }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x017b
            goto L_0x0192
        L_0x017b:
            int r3 = r3 + 1
            if (r3 < r12) goto L_0x0168
            r0 = 0
            goto L_0x0193
        L_0x0181:
            r0 = 100
            if (r1 >= r0) goto L_0x0188
            java.lang.String r0 = "<100"
            goto L_0x0157
        L_0x0188:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 >= r0) goto L_0x018f
            java.lang.String r0 = "<1000"
            goto L_0x0157
        L_0x018f:
            java.lang.String r0 = ">=1000"
            goto L_0x0157
        L_0x0192:
            r0 = 1
        L_0x0193:
            r4.markerAnnotate((int) r2, (int) r5, (java.lang.String) r7, (boolean) r0)     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = "filtered_list_prepared"
            r4.markerPoint((int) r2, (int) r5, (java.lang.String) r0)     // Catch:{ all -> 0x01fa }
            X.1VC r11 = r14.A08     // Catch:{ all -> 0x01fa }
            X.0yC r1 = r11.A01     // Catch:{ all -> 0x01fa }
            r0 = 5340(0x14dc, float:7.483E-42)
            r1.A0E(r0)     // Catch:{ all -> 0x01fa }
            X.0v5 r0 = r14.A00     // Catch:{ all -> 0x01fa }
            java.lang.Object r10 = r0.A03()     // Catch:{ all -> 0x01fa }
            X.1HX r10 = (X.AnonymousClass1HX) r10     // Catch:{ all -> 0x01fa }
            X.171 r9 = r14.A03     // Catch:{ all -> 0x01fa }
            X.16K r8 = r14.A04     // Catch:{ all -> 0x01fa }
            X.5qB r7 = r14.A09     // Catch:{ all -> 0x01fa }
            X.62w r3 = r14.A0A     // Catch:{ all -> 0x01fa }
            X.6KI r2 = r14.A0B     // Catch:{ all -> 0x01fa }
            X.3S0 r1 = r14.A0E     // Catch:{ all -> 0x01fa }
            X.3G0 r0 = r14.A0C     // Catch:{ all -> 0x01fa }
            X.4bI r17 = new X.4bI     // Catch:{ all -> 0x01fa }
            r30 = r33
            r20 = r8
            r21 = r11
            r22 = r7
            r23 = r3
            r24 = r2
            r25 = r0
            r26 = r1
            r27 = r4
            r29 = r13
            r18 = r10
            r19 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x01fa }
            r0 = 494352396(0x1d77380c, float:3.2719153E-21)
            r4.markerPoint((int) r0, (int) r5, (java.lang.String) r6)
            android.os.Binder.restoreCallingIdentity(r15)
            r4.markerEnd(r0, r5, r12)
            return r17
        L_0x01e4:
            r1 = move-exception
            if (r12 == 0) goto L_0x01ef
            r12.close()     // Catch:{ all -> 0x01eb }
            goto L_0x01ef
        L_0x01eb:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01f0 }
        L_0x01ef:
            throw r1     // Catch:{ all -> 0x01f0 }
        L_0x01f0:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x01f5 }
            goto L_0x01f9
        L_0x01f5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01fa }
        L_0x01f9:
            throw r1     // Catch:{ all -> 0x01fa }
        L_0x01fa:
            r3 = move-exception
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x020d
            java.lang.String r2 = "error"
            java.lang.String r1 = r3.getMessage()     // Catch:{ all -> 0x020e }
            r0 = 494352396(0x1d77380c, float:3.2719153E-21)
            r4.markerAnnotate((int) r0, (int) r5, (java.lang.String) r2, (java.lang.String) r1)     // Catch:{ all -> 0x020e }
        L_0x020d:
            throw r3     // Catch:{ all -> 0x020e }
        L_0x020e:
            r2 = move-exception
            r1 = 494352396(0x1d77380c, float:3.2719153E-21)
            r4.markerPoint((int) r1, (int) r5, (java.lang.String) r6)
            android.os.Binder.restoreCallingIdentity(r15)
            r0 = 3
            r4.markerEnd(r1, r5, r0)
            throw r2
        L_0x021d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Access denied to "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.instrumentation.api.InstrumentationProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    private C128946Ef A00(Uri uri) {
        A08();
        if (this.A00.A00.A09(C21100yf.A0P)) {
            C128946Ef A002 = this.A03.A00();
            A002.A00();
            if (this.A04.A03()) {
                synchronized (this.A00) {
                }
                if (Binder.getCallingUid() != Process.myUid()) {
                    AnonymousClass1VE r3 = this.A02;
                    String string = AnonymousClass1VE.A00(r3).getString(AnonymousClass1VE.A01(A002.A01, "auth/token"), (String) null);
                    String queryParameter = uri.getQueryParameter("authorization_token");
                    if (!TextUtils.isEmpty(string) && string.equals(queryParameter)) {
                        return A002;
                    }
                    throw new SecurityException("Access denied: auth token is missing");
                }
                throw new SecurityException("Access checks is executed outside of binder context.");
            }
            throw new SecurityException("WhatsApp is not active.");
        }
        throw new SecurityException("Feature is disabled.");
    }

    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        A00(uri);
        throw new UnsupportedOperationException();
    }

    public int delete(Uri uri, String str, String[] strArr) {
        A00(uri);
        throw new UnsupportedOperationException();
    }

    public Uri insert(Uri uri, ContentValues contentValues, Bundle bundle) {
        A00(uri);
        throw new UnsupportedOperationException();
    }

    public ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        A00(uri);
        throw new UnsupportedOperationException();
    }

    public int update(Uri uri, ContentValues contentValues, Bundle bundle) {
        A00(uri);
        throw new UnsupportedOperationException();
    }

    public int delete(Uri uri, Bundle bundle) {
        A00(uri);
        throw new UnsupportedOperationException();
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        A00(uri);
        throw new UnsupportedOperationException();
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        A00(uri);
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        A00(uri);
        return super.query(uri, strArr, str, strArr2, str2, cancellationSignal);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A00(uri);
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        A00(uri);
        return super.query(uri, strArr, bundle, cancellationSignal);
    }
}
