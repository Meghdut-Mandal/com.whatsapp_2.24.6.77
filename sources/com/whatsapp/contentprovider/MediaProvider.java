package com.whatsapp.contentprovider;

import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass1A1;
import X.AnonymousClass1A6;
import X.AnonymousClass1DF;
import X.AnonymousClass1M0;
import X.AnonymousClass1TA;
import X.AnonymousClass2bU;
import X.AnonymousClass2bZ;
import X.AnonymousClass3T1;
import X.C111735cl;
import X.C18740tg;
import X.C19380ur;
import X.C19700wN;
import X.C19970wo;
import X.C20690y0;
import X.C207219uk;
import X.C23043B1o;
import X.C24051Aw;
import X.C63683Kz;
import X.C65013Qj;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

public class MediaProvider extends C19380ur {
    public static UriMatcher A0A;
    public static final String A0B;
    public static final String A0C;
    public static final String A0D;
    public static final String[] A0E = {"_display_name", "_size"};
    public Context A00;
    public C20690y0 A01;
    public AnonymousClass16D A02;
    public AnonymousClass171 A03;
    public AnonymousClass1A6 A04;
    public C19970wo A05;
    public AnonymousClass1DF A06;
    public AnonymousClass1TA A07;
    public AnonymousClass1A1 A08;
    public C24051Aw A09;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("com.whatsapp");
        sb.append(".provider.media");
        A0B = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("vnd.android.cursor.dir/vnd.");
        sb2.append("com.whatsapp");
        sb2.append(".provider.media.buckets");
        A0C = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("vnd.android.cursor.dir/vnd.");
        sb3.append("com.whatsapp");
        sb3.append(".provider.media.items");
        A0D = sb3.toString();
    }

    public static int A00(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid mode: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public static synchronized UriMatcher A01() {
        UriMatcher uriMatcher;
        synchronized (MediaProvider.class) {
            if (A0A == null) {
                UriMatcher uriMatcher2 = new UriMatcher(-1);
                A0A = uriMatcher2;
                String str = A0B;
                uriMatcher2.addURI(str, "buckets", 1);
                A0A.addURI(str, "items", 2);
                A0A.addURI(str, "item/*", 3);
                A0A.addURI(str, "gdpr_report", 4);
                A0A.addURI(str, "channels_gdpr_report", 13);
                A0A.addURI(str, "personal_dyi_report", 6);
                A0A.addURI(str, "business_dyi_report", 11);
                A0A.addURI(str, "business_activity_report", 7);
                A0A.addURI(str, "export_chat/*/*", 5);
                A0A.addURI(str, "export_chat_folder/*/*", 16);
                A0A.addURI(str, "thumbnail/*", 8);
                A0A.addURI(str, "export/*", 9);
                A0A.addURI(str, "devdebuginfo/*", 12);
                A0A.addURI(str, "support", 10);
            }
            uriMatcher = A0A;
        }
        return uriMatcher;
    }

    public static Uri A03(C19700wN r4, AnonymousClass1TA r5, AnonymousClass2bU r6) {
        C65013Qj r0 = r6.A01;
        C18740tg.A06(r0);
        File file = r0.A0I;
        C18740tg.A06(file);
        String obj = UUID.randomUUID().toString();
        r5.A01(obj, file.getAbsolutePath(), C111735cl.A00(r4, r6), file.getName());
        return new Uri.Builder().scheme("content").authority(A0B).appendPath("item").appendEncodedPath(obj).build();
    }

    public static Uri A04(String str, String str2) {
        return new Uri.Builder().scheme("content").authority(A0B).appendPath(str).appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2).build();
    }

    public static String A05(Uri uri) {
        String queryParameter = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (queryParameter != null) {
            return queryParameter;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown URI ");
        sb.append(uri);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x035b, code lost:
        r2 = new java.lang.StringBuilder();
        r1 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0362, code lost:
        r2.append(r1.getString(r0));
        r2.append(".zip");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0376, code lost:
        return A02(r3, r6, r2.toString(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0432, code lost:
        r2 = new java.lang.String[r6];
        java.lang.System.arraycopy(r8, 0, r2, 0, r6);
        r0 = new java.lang.Object[r6];
        java.lang.System.arraycopy(r7, 0, r0, 0, r6);
        r3 = new android.database.MatrixCursor(r2, r15);
        r3.addRow(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0445, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r19, java.lang.String[] r20, java.lang.String r21, java.lang.String[] r22, java.lang.String r23) {
        /*
            r18 = this;
            r5 = r20
            r4 = r18
            r4.A08()
            android.content.UriMatcher r0 = A01()
            r3 = r19
            int r0 = r0.match(r3)
            switch(r0) {
                case 1: goto L_0x002b;
                case 2: goto L_0x0037;
                case 3: goto L_0x0146;
                case 4: goto L_0x0217;
                case 5: goto L_0x0226;
                case 6: goto L_0x02f8;
                case 7: goto L_0x0201;
                case 8: goto L_0x0014;
                case 9: goto L_0x0014;
                case 10: goto L_0x030f;
                case 11: goto L_0x0320;
                case 12: goto L_0x0337;
                case 13: goto L_0x034e;
                case 14: goto L_0x0014;
                case 15: goto L_0x0014;
                case 16: goto L_0x0377;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unknown URI "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x002b:
            X.16D r3 = r4.A02
            X.171 r2 = r4.A03
            X.1A6 r1 = r4.A04
            X.1l8 r0 = new X.1l8
            r0.<init>(r3, r2, r1)
            return r0
        L_0x0037:
            java.lang.String r0 = "bucketId"
            java.lang.String r1 = r3.getQueryParameter(r0)
            X.13q r0 = X.AnonymousClass11F.A00
            X.11F r5 = r0.A02(r1)
            X.C18740tg.A06(r5)
            java.lang.String r0 = "include"
            java.lang.String r8 = r3.getQueryParameter(r0)
            r6 = 13
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r7 = 2
            r12 = 0
            r10 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            if (r8 == 0) goto L_0x0067
            int r0 = r8.hashCode()
            switch(r0) {
                case -1185250696: goto L_0x00a3;
                case 102340: goto L_0x008c;
                case 112202875: goto L_0x007a;
                default: goto L_0x0067;
            }
        L_0x0067:
            X.1A1 r6 = r4.A08
            X.1DF r8 = r4.A06
            java.lang.Integer[] r11 = new java.lang.Integer[r10]
            r11[r12] = r2
            r11[r1] = r3
            r11[r7] = r9
            X.12P r0 = r8.A08
            X.1M0 r7 = r0.get()
            goto L_0x00b5
        L_0x007a:
            java.lang.String r0 = "video"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0067
            X.1A1 r6 = r4.A08
            X.1DF r0 = r4.A06
            android.database.Cursor r1 = r0.A03(r5, r10)
            goto L_0x013f
        L_0x008c:
            java.lang.String r0 = "gif"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0067
            X.1A1 r2 = r4.A08
            X.1DF r0 = r4.A06
            android.database.Cursor r1 = r0.A03(r5, r6)
            r0 = 0
            X.1l9 r3 = new X.1l9
            r3.<init>(r1, r0, r5, r2)
            return r3
        L_0x00a3:
            java.lang.String r0 = "images"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0067
            X.1A1 r6 = r4.A08
            X.1DF r0 = r4.A06
            android.database.Cursor r1 = r0.A03(r5, r1)
            goto L_0x013f
        L_0x00b5:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0137 }
            r3.<init>(r10)     // Catch:{ all -> 0x0137 }
            r9 = 0
        L_0x00bb:
            r0 = r11[r9]     // Catch:{ all -> 0x0137 }
            int r4 = r0.intValue()     // Catch:{ all -> 0x0137 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0137 }
            r2.<init>()     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = "'"
            r2.append(r0)     // Catch:{ all -> 0x0137 }
            r2.append(r4)     // Catch:{ all -> 0x0137 }
            r2.append(r0)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0137 }
            r3.add(r0)     // Catch:{ all -> 0x0137 }
            int r9 = r9 + 1
            if (r9 < r10) goto L_0x00bb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0137 }
            r2.<init>()     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = "SELECT "
            r2.append(r0)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = X.C56842wy.A01     // Catch:{ all -> 0x0137 }
            r2.append(r0)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = " FROM "
            r2.append(r0)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = "available_message_view"
            r2.append(r0)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = " WHERE "
            r2.append(r0)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = "message_type IN ("
            r2.append(r0)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r3)     // Catch:{ all -> 0x0137 }
            r2.append(r0)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = ")"
            r2.append(r0)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = " AND "
            r2.append(r0)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = "chat_row_id  = ?"
            r2.append(r0)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = " ORDER BY _id DESC"
            r2.append(r0)     // Catch:{ all -> 0x0137 }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x0137 }
            X.14e r3 = r7.A02     // Catch:{ all -> 0x0137 }
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x0137 }
            X.163 r0 = r8.A02     // Catch:{ all -> 0x0137 }
            long r0 = r0.A08(r5)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0137 }
            r2[r12] = r0     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = "GET_MEDIA_MESSAGES_BY_TYPES"
            android.database.Cursor r1 = r3.A09(r4, r0, r2)     // Catch:{ all -> 0x0137 }
            goto L_0x013c
        L_0x0137:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x01e7 }
            throw r1
        L_0x013c:
            r7.close()
        L_0x013f:
            r0 = 0
            X.1l9 r3 = new X.1l9
            r3.<init>(r1, r0, r5, r6)
            return r3
        L_0x0146:
            if (r20 != 0) goto L_0x014a
            java.lang.String[] r5 = A0E
        L_0x014a:
            X.1TA r1 = r4.A07
            java.lang.String r0 = r3.getLastPathSegment()
            java.lang.String r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x01d4
            java.io.File r10 = new java.io.File
            r10.<init>(r0)
        L_0x015b:
            int r9 = r5.length
            java.lang.String[] r8 = new java.lang.String[r9]
            java.lang.Object[] r7 = new java.lang.Object[r9]
            r2 = 0
            r6 = 0
        L_0x0162:
            if (r2 >= r9) goto L_0x01ec
            r11 = r5[r2]
            java.lang.String r1 = "_display_name"
            boolean r0 = r1.equals(r11)
            if (r0 == 0) goto L_0x01b0
            r8[r6] = r1
            int r17 = r6 + 1
            X.1TA r0 = r4.A07
            java.lang.String r14 = r3.getLastPathSegment()
            X.1DD r0 = r0.A00
            X.1M0 r11 = r0.get()
            X.14e r13 = r11.A02     // Catch:{ all -> 0x01e2 }
            java.lang.String r12 = "SELECT display_name FROM shared_media_ids WHERE item_uuid =?AND expiration_timestamp >?"
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x01e2 }
            r0 = 0
            r1[r0] = r14     // Catch:{ all -> 0x01e2 }
            r16 = 1
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01e2 }
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x01e2 }
            r1[r16] = r0     // Catch:{ all -> 0x01e2 }
            java.lang.String r0 = "SharedMediaIdsStore/getDisplayNameByUUID"
            android.database.Cursor r12 = r13.A09(r12, r0, r1)     // Catch:{ all -> 0x01e2 }
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x01d6 }
            if (r0 != 0) goto L_0x01a2
            r0 = 0
            goto L_0x01ac
        L_0x01a2:
            java.lang.String r0 = "display_name"
            int r0 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d6 }
            java.lang.String r0 = r12.getString(r0)     // Catch:{ all -> 0x01d6 }
        L_0x01ac:
            r12.close()     // Catch:{ all -> 0x01e2 }
            goto L_0x01ca
        L_0x01b0:
            java.lang.String r1 = "_size"
            boolean r0 = r1.equals(r11)
            if (r0 == 0) goto L_0x01d1
            r8[r6] = r1
            int r17 = r6 + 1
            if (r10 != 0) goto L_0x01c5
            r0 = 0
        L_0x01c0:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x01cd
        L_0x01c5:
            long r0 = r10.length()
            goto L_0x01c0
        L_0x01ca:
            r11.close()
        L_0x01cd:
            r7[r6] = r0
            r6 = r17
        L_0x01d1:
            int r2 = r2 + 1
            goto L_0x0162
        L_0x01d4:
            r10 = 0
            goto L_0x015b
        L_0x01d6:
            r1 = move-exception
            if (r12 == 0) goto L_0x01e1
            r12.close()     // Catch:{ all -> 0x01dd }
            goto L_0x01e1
        L_0x01dd:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01e2 }
        L_0x01e1:
            throw r1     // Catch:{ all -> 0x01e2 }
        L_0x01e2:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x01e7 }
            throw r1
        L_0x01e7:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x01ec:
            java.lang.String[] r2 = new java.lang.String[r6]
            r0 = 0
            java.lang.System.arraycopy(r8, r0, r2, r0, r6)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.System.arraycopy(r7, r0, r1, r0, r6)
            r0 = 1
            android.database.MatrixCursor r3 = new android.database.MatrixCursor
            r3.<init>(r2, r0)
            r3.addRow(r1)
            return r3
        L_0x0201:
            X.0y0 r1 = r4.A01
            java.lang.String r0 = A05(r3)
            java.io.File r6 = r1.A0T(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r1 = r4.A00
            r0 = 2131892014(0x7f12172e, float:1.9418764E38)
            goto L_0x0362
        L_0x0217:
            X.0y0 r1 = r4.A01
            java.lang.String r0 = A05(r3)
            java.io.File r6 = r1.A0V(r0)
            r0 = 2131889818(0x7f120e9a, float:1.941431E38)
            goto L_0x035b
        L_0x0226:
            java.util.List r2 = r3.getPathSegments()
            int r0 = r2.size()
            r1 = 2
            if (r0 < r1) goto L_0x02e1
            int r0 = r2.size()
            int r0 = r0 - r1
            java.lang.Object r1 = r2.get(r0)
            int r0 = r2.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r2.get(r0)
            android.util.Pair r9 = android.util.Pair.create(r1, r0)
            if (r9 == 0) goto L_0x02e1
            if (r20 != 0) goto L_0x024e
            java.lang.String[] r5 = A0E
        L_0x024e:
            int r10 = r5.length
            java.lang.String[] r8 = new java.lang.String[r10]
            java.lang.Object[] r7 = new java.lang.Object[r10]
            r3 = 0
            r6 = 0
        L_0x0255:
            r15 = 1
            if (r3 >= r10) goto L_0x0432
            r2 = r5[r3]
            java.lang.String r1 = "_display_name"
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x02a4
            r8[r6] = r1
            java.lang.Object r1 = r9.first
            java.lang.String r1 = (java.lang.String) r1
            X.13q r0 = X.AnonymousClass11F.A00
            X.11F r0 = r0.A02(r1)
            java.lang.String r12 = ".txt"
            if (r0 == 0) goto L_0x02c3
            int r16 = r6 + 1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            android.content.Context r13 = r4.A00
            r2 = 2131889016(0x7f120b78, float:1.9412684E38)
            java.lang.Object[] r14 = new java.lang.Object[r15]
            X.171 r1 = r4.A03
            X.16D r15 = r4.A02
            X.141 r0 = r15.A0D(r0)
            java.lang.String r1 = r1.A0H(r0)
            r0 = 0
            r14[r0] = r1
            java.lang.String r0 = r13.getString(r2, r14)
            r11.append(r0)
            r11.append(r12)
            java.lang.String r0 = r11.toString()
            r7[r6] = r0
            r6 = r16
        L_0x02a1:
            int r3 = r3 + 1
            goto L_0x0255
        L_0x02a4:
            java.lang.String r1 = "_size"
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x02a1
            r8[r6] = r1
            int r11 = r6 + 1
            X.0y0 r1 = r4.A01
            java.lang.Object r0 = r9.second
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r0 = r1.A0S(r0)
            long r0 = r0.length()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x02dd
        L_0x02c3:
            int r11 = r6 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r1 = r4.A00
            r0 = 2131889017(0x7f120b79, float:1.9412686E38)
            java.lang.String r0 = r1.getString(r0)
            r2.append(r0)
            r2.append(r12)
            java.lang.String r0 = r2.toString()
        L_0x02dd:
            r7[r6] = r0
            r6 = r11
            goto L_0x02a1
        L_0x02e1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unknown URI "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x02f8:
            java.lang.String r2 = "personal"
            X.0y0 r1 = r4.A01
            java.lang.String r0 = A05(r3)
            java.io.File r6 = r1.A0a(r0, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r1 = r4.A00
            r0 = 2131888965(0x7f120b45, float:1.941258E38)
            goto L_0x0362
        L_0x030f:
            X.0y0 r1 = r4.A01
            java.lang.String r0 = A05(r3)
            java.io.File r1 = r1.A0W(r0)
            java.lang.String r0 = "logs.zip"
            android.database.MatrixCursor r3 = r4.A02(r3, r1, r0, r5)
            return r3
        L_0x0320:
            java.lang.String r2 = "business"
            X.0y0 r1 = r4.A01
            java.lang.String r0 = A05(r3)
            java.io.File r6 = r1.A0a(r0, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r1 = r4.A00
            r0 = 2131888956(0x7f120b3c, float:1.9412562E38)
            goto L_0x0362
        L_0x0337:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Developer debug info asked in non debug build: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x034e:
            X.0y0 r1 = r4.A01
            java.lang.String r0 = A05(r3)
            java.io.File r6 = r1.A0V(r0)
            r0 = 2131891404(0x7f1214cc, float:1.9417527E38)
        L_0x035b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r1 = r4.A00
        L_0x0362:
            java.lang.String r0 = r1.getString(r0)
            r2.append(r0)
            java.lang.String r0 = ".zip"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.database.MatrixCursor r3 = r4.A02(r3, r6, r0, r5)
            return r3
        L_0x0377:
            java.util.List r2 = r3.getPathSegments()
            int r0 = r2.size()
            r1 = 2
            if (r0 < r1) goto L_0x0446
            int r0 = r2.size()
            int r0 = r0 - r1
            java.lang.Object r1 = r2.get(r0)
            int r0 = r2.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r2.get(r0)
            android.util.Pair r9 = android.util.Pair.create(r1, r0)
            if (r9 == 0) goto L_0x0446
            if (r20 != 0) goto L_0x039f
            java.lang.String[] r5 = A0E
        L_0x039f:
            int r10 = r5.length
            java.lang.String[] r8 = new java.lang.String[r10]
            java.lang.Object[] r7 = new java.lang.Object[r10]
            r3 = 0
            r6 = 0
        L_0x03a6:
            r15 = 1
            if (r3 >= r10) goto L_0x0432
            r2 = r5[r3]
            java.lang.String r1 = "_display_name"
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x03f5
            r8[r6] = r1
            java.lang.Object r1 = r9.first
            java.lang.String r1 = (java.lang.String) r1
            X.13q r0 = X.AnonymousClass11F.A00
            X.11F r0 = r0.A02(r1)
            java.lang.String r12 = ".zip"
            if (r0 == 0) goto L_0x0414
            int r16 = r6 + 1
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            android.content.Context r14 = r4.A00
            r11 = 2131889016(0x7f120b78, float:1.9412684E38)
            java.lang.Object[] r2 = new java.lang.Object[r15]
            X.171 r1 = r4.A03
            X.16D r15 = r4.A02
            X.141 r0 = r15.A0D(r0)
            java.lang.String r1 = r1.A0H(r0)
            r0 = 0
            r2[r0] = r1
            java.lang.String r0 = r14.getString(r11, r2)
            r13.append(r0)
            r13.append(r12)
            java.lang.String r0 = r13.toString()
            r7[r6] = r0
            r6 = r16
        L_0x03f2:
            int r3 = r3 + 1
            goto L_0x03a6
        L_0x03f5:
            java.lang.String r1 = "_size"
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x03f2
            r8[r6] = r1
            int r11 = r6 + 1
            X.0y0 r1 = r4.A01
            java.lang.Object r0 = r9.second
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r0 = r1.A0R(r0)
            long r0 = r0.length()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x042e
        L_0x0414:
            int r11 = r6 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r1 = r4.A00
            r0 = 2131889017(0x7f120b79, float:1.9412686E38)
            java.lang.String r0 = r1.getString(r0)
            r2.append(r0)
            r2.append(r12)
            java.lang.String r0 = r2.toString()
        L_0x042e:
            r7[r6] = r0
            r6 = r11
            goto L_0x03f2
        L_0x0432:
            java.lang.String[] r2 = new java.lang.String[r6]
            r1 = 0
            java.lang.System.arraycopy(r8, r1, r2, r1, r6)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.System.arraycopy(r7, r1, r0, r1, r6)
            android.database.MatrixCursor r3 = new android.database.MatrixCursor
            r3.<init>(r2, r15)
            r3.addRow(r0)
            return r3
        L_0x0446:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unknown URI "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contentprovider.MediaProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    private MatrixCursor A02(Uri uri, File file, String str, String[] strArr) {
        int i;
        try {
            A06(uri, file);
            if (strArr == null) {
                strArr = A0E;
            }
            String[] strArr2 = new String[r7];
            Object[] objArr = new Object[r7];
            int i2 = 0;
            for (String str2 : strArr) {
                if ("_display_name".equals(str2)) {
                    strArr2[i2] = "_display_name";
                    i = i2 + 1;
                    objArr[i2] = str;
                } else if ("_size".equals(str2)) {
                    strArr2[i2] = "_size";
                    i = i2 + 1;
                    objArr[i2] = Long.valueOf(file.length());
                }
                i2 = i;
            }
            String[] strArr3 = new String[i2];
            System.arraycopy(strArr2, 0, strArr3, 0, i2);
            Object[] objArr2 = new Object[i2];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            MatrixCursor matrixCursor = new MatrixCursor(strArr3, 1);
            matrixCursor.addRow(objArr2);
            return matrixCursor;
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private void A06(Uri uri, File file) {
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append("File not found for uri: ");
            sb.append(uri);
            throw new FileNotFoundException(sb.toString());
        } else if (file.lastModified() < C19970wo.A00(this.A05) - 3600000) {
            file.delete();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("File expired for uri: ");
            sb2.append(uri);
            throw new FileNotFoundException(sb2.toString());
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        A08();
        throw new UnsupportedOperationException();
    }

    public String getType(Uri uri) {
        Cursor A092;
        String str;
        A08();
        int match = A01().match(uri);
        if (match == 16) {
            return "application/zip";
        }
        switch (match) {
            case 1:
                return A0C;
            case 2:
                return A0D;
            case 3:
                AnonymousClass1TA r0 = this.A07;
                String lastPathSegment = uri.getLastPathSegment();
                AnonymousClass1M0 A032 = r0.A00.get();
                try {
                    A092 = A032.A02.A09("SELECT mime_type FROM shared_media_ids WHERE item_uuid =?AND expiration_timestamp >?", "SharedMediaIdsStore/getMimeTypeByUUID", new String[]{lastPathSegment, String.valueOf(System.currentTimeMillis())});
                    if (!A092.moveToNext()) {
                        str = null;
                    } else {
                        str = A092.getString(A092.getColumnIndexOrThrow("mime_type"));
                    }
                    A092.close();
                    A032.close();
                    if (str == null) {
                        return "application/octet-stream";
                    }
                    return str;
                } catch (Throwable th) {
                    try {
                        A032.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 13:
                return "application/zip";
            case 5:
            case 12:
                return "text/plain";
            case 8:
                return "image/jpeg";
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown URI ");
                sb.append(uri);
                throw new IllegalArgumentException(sb.toString());
        }
        throw th;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        A08();
        throw new UnsupportedOperationException();
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        File file;
        byte[] A022;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        int i;
        File file2;
        String str2;
        A08();
        int match = A01().match(uri);
        if (match != 16) {
            switch (match) {
                case 3:
                    A08();
                    int A002 = A00(str);
                    String A003 = this.A07.A00(uri.getLastPathSegment());
                    if (A003 != null) {
                        file2 = new File(A003);
                    } else {
                        file2 = null;
                    }
                    if (file2 != null) {
                        try {
                            this.A09.A04(file2);
                            ParcelFileDescriptor open = ParcelFileDescriptor.open(file2, A002);
                            try {
                                this.A09.A03(open);
                                return open;
                            } catch (IOException e) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("mediaprovider/ parcel file descriptor is not external for uri: ");
                                sb.append(uri);
                                Log.e(sb.toString(), e);
                                throw new FileNotFoundException();
                            }
                        } catch (IOException e2) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("mediaprovider/ file is not external for uri: ");
                            sb2.append(uri);
                            Log.e(sb2.toString(), e2);
                            throw new FileNotFoundException();
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("mediaprovider/openMessageFile no file found for uri: ");
                        sb3.append(uri);
                        Log.e(sb3.toString());
                        throw new FileNotFoundException();
                    }
                case 4:
                case 13:
                    String queryParameter = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    if (queryParameter != null) {
                        file = this.A01.A0V(queryParameter);
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("File not found for uri: ");
                        sb4.append(uri);
                        throw new FileNotFoundException(sb4.toString());
                    }
                case 5:
                    String lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment != null) {
                        file = this.A01.A0S(lastPathSegment);
                        break;
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("File not found for uri: ");
                        sb5.append(uri);
                        throw new FileNotFoundException(sb5.toString());
                    }
                case 6:
                    str2 = "personal";
                    break;
                case 7:
                    String queryParameter2 = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    if (queryParameter2 != null) {
                        file = this.A01.A0T(queryParameter2);
                        break;
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("File not found for uri: ");
                        sb6.append(uri);
                        throw new FileNotFoundException(sb6.toString());
                    }
                case 8:
                    A08();
                    if (str.equals("r")) {
                        String lastPathSegment2 = uri.getLastPathSegment();
                        if (lastPathSegment2 != null) {
                            String A004 = this.A07.A00(lastPathSegment2);
                            if (!TextUtils.isEmpty(A004)) {
                                try {
                                    AnonymousClass3T1 A012 = this.A08.A01.A01(Long.parseLong(A004));
                                    if (A012 == null) {
                                        StringBuilder sb7 = new StringBuilder();
                                        sb7.append("Failed to get message for uri - ");
                                        sb7.append(uri);
                                        Log.e(sb7.toString());
                                        throw new FileNotFoundException();
                                    } else if (A012 instanceof AnonymousClass2bZ) {
                                        C63683Kz A0V = A012.A0V();
                                        if (A0V != null) {
                                            if (A012.A1W() != null) {
                                                A022 = A012.A1W();
                                            } else {
                                                if (A0V.A01()) {
                                                    A022 = A0V.A02();
                                                }
                                                Log.e("Message thumbnail has empty bytes");
                                                throw new FileNotFoundException();
                                            }
                                            if (A022 != null) {
                                                try {
                                                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                                                    try {
                                                        autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                                                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(A022, 0, A022.length);
                                                        if (decodeByteArray != null) {
                                                            if (A012 instanceof C23043B1o) {
                                                                C18740tg.A06(A012);
                                                                C207219uk BA8 = ((C23043B1o) A012).BA8();
                                                                if (BA8 != null && ((i = BA8.A00) == 2 || i == 6)) {
                                                                    FilterUtils.blurNative(decodeByteArray, 5, 2);
                                                                }
                                                            }
                                                            decodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, autoCloseOutputStream);
                                                            decodeByteArray.recycle();
                                                            autoCloseOutputStream.flush();
                                                            autoCloseOutputStream.close();
                                                            return createPipe[0];
                                                        }
                                                        Log.e("Can't decode thumbnail bytes");
                                                        throw new FileNotFoundException();
                                                    } catch (Exception unused) {
                                                        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                                                        if (parcelFileDescriptor != null) {
                                                            try {
                                                                parcelFileDescriptor.close();
                                                            } catch (IOException unused2) {
                                                            }
                                                        }
                                                        throw new FileNotFoundException();
                                                    } catch (Throwable th) {
                                                        th.addSuppressed(th);
                                                        break;
                                                    }
                                                } catch (IOException e3) {
                                                    Log.e("Failed to create parcel file descriptor pipe", e3);
                                                    throw new FileNotFoundException();
                                                }
                                            }
                                            Log.e("Message thumbnail has empty bytes");
                                            throw new FileNotFoundException();
                                        }
                                        Log.e("Message has null thumbnail");
                                        throw new FileNotFoundException();
                                    } else {
                                        Log.e("Message is not allowed type for getting thumbnail");
                                        throw new FileNotFoundException();
                                    }
                                } catch (NumberFormatException unused3) {
                                    StringBuilder sb8 = new StringBuilder();
                                    sb8.append("Invalid message id format - ");
                                    sb8.append(A004);
                                    Log.e(sb8.toString());
                                    throw new FileNotFoundException();
                                }
                            } else {
                                StringBuilder sb9 = new StringBuilder();
                                sb9.append("Invalid record for uuid ");
                                sb9.append(lastPathSegment2);
                                Log.e(sb9.toString());
                                throw new FileNotFoundException();
                            }
                        } else {
                            StringBuilder sb10 = new StringBuilder();
                            sb10.append("Failed to get uuid for uri - ");
                            sb10.append(uri);
                            Log.e(sb10.toString());
                            throw new FileNotFoundException();
                        }
                    } else {
                        Log.e("Invalid access mode for openMessageThumbnail - only read allowed");
                        throw new FileNotFoundException();
                    }
                case 9:
                    throw new FileNotFoundException();
                case 10:
                    String queryParameter3 = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    if (queryParameter3 != null) {
                        file = this.A01.A0W(queryParameter3);
                        break;
                    } else {
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append("File not found for uri: ");
                        sb11.append(uri);
                        throw new FileNotFoundException(sb11.toString());
                    }
                case 11:
                    str2 = "business";
                    break;
                case 12:
                    throw new FileNotFoundException();
                default:
                    throw new FileNotFoundException();
            }
            String queryParameter4 = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            if (queryParameter4 != null) {
                file = this.A01.A0a(queryParameter4, str2);
            } else {
                StringBuilder sb12 = new StringBuilder();
                sb12.append("File not found for uri: ");
                sb12.append(uri);
                throw new FileNotFoundException(sb12.toString());
            }
        } else {
            String lastPathSegment3 = uri.getLastPathSegment();
            if (lastPathSegment3 != null) {
                file = this.A01.A0R(lastPathSegment3);
            } else {
                StringBuilder sb13 = new StringBuilder();
                sb13.append("File not found for uri: ");
                sb13.append(uri);
                throw new FileNotFoundException(sb13.toString());
            }
        }
        A06(uri, file);
        return ParcelFileDescriptor.open(file, A00(str));
        throw th;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A08();
        throw new UnsupportedOperationException();
    }
}
