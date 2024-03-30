package X;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;

/* renamed from: X.0UN  reason: invalid class name */
public class AnonymousClass0UN {
    public Context A00;
    public Uri A01;
    public final AnonymousClass0UN A02;

    public boolean A00() {
        Context context = this.A00;
        Uri uri = this.A01;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            Cursor cursor = null;
            try {
                cursor = context.getContentResolver().query(uri, new String[]{"flags"}, (String) null, (String[]) null, (String) null);
                if (cursor.moveToFirst() && !cursor.isNull(0)) {
                    long j = cursor.getLong(0);
                    AnonymousClass0QB.A00(cursor);
                    if ((j & 512) != 0) {
                        return true;
                    }
                }
            } catch (Exception e) {
                Log.w("DocumentFile", AnonymousClass000.A0l(e, "Failed query: ", AnonymousClass000.A0u()));
            } catch (Throwable th) {
                AnonymousClass0QB.A00((AutoCloseable) null);
                throw th;
            }
            AnonymousClass0QB.A00(cursor);
            return false;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.String, android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r10v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        if (r10 == 0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x0046, B:20:0x006a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e A[ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:11:0x0046] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0UN[] A01() {
        /*
            r13 = this;
            android.content.Context r6 = r13.A00
            android.content.ContentResolver r7 = r6.getContentResolver()
            android.net.Uri r1 = r13.A01
            java.lang.String r0 = android.provider.DocumentsContract.getDocumentId(r1)
            android.net.Uri r8 = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(r1, r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            r5 = 0
            r10 = 0
            java.lang.String r0 = "document_id"
            java.lang.String[] r9 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x0034 }
            r12 = r10
            r11 = r10
            android.database.Cursor r10 = r7.query(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0034 }
        L_0x0022:
            boolean r0 = r10.moveToNext()     // Catch:{ Exception -> 0x0034 }
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = r10.getString(r5)     // Catch:{ Exception -> 0x0034 }
            android.net.Uri r0 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r1, r0)     // Catch:{ Exception -> 0x0034 }
            r4.add(r0)     // Catch:{ Exception -> 0x0034 }
            goto L_0x0022
        L_0x0034:
            r3 = move-exception
            java.lang.String r2 = "DocumentFile"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = "Failed query: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r3, r0, r1)     // Catch:{ all -> 0x0067 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0067 }
            if (r10 == 0) goto L_0x0049
        L_0x0046:
            r10.close()     // Catch:{ RuntimeException -> 0x006e, Exception -> 0x0049 }
        L_0x0049:
            int r0 = r4.size()
            android.net.Uri[] r0 = new android.net.Uri[r0]
            java.lang.Object[] r4 = r4.toArray(r0)
            android.net.Uri[] r4 = (android.net.Uri[]) r4
            int r3 = r4.length
            X.0UN[] r2 = new X.AnonymousClass0UN[r3]
        L_0x0058:
            if (r5 >= r3) goto L_0x0066
            r1 = r4[r5]
            X.0UN r0 = new X.0UN
            r0.<init>(r6, r1, r13)
            r2[r5] = r0
            int r5 = r5 + 1
            goto L_0x0058
        L_0x0066:
            return r2
        L_0x0067:
            r0 = move-exception
            if (r10 == 0) goto L_0x0070
            r10.close()     // Catch:{ RuntimeException -> 0x006e, Exception -> 0x0070 }
            throw r0
        L_0x006e:
            r0 = move-exception
            throw r0
        L_0x0070:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0UN.A01():X.0UN[]");
    }

    public AnonymousClass0UN(Context context, Uri uri, AnonymousClass0UN r3) {
        this.A02 = r3;
        this.A00 = context;
        this.A01 = uri;
    }
}
