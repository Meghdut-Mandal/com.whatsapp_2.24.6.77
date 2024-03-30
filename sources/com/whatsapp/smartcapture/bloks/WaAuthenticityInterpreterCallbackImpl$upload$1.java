package com.whatsapp.smartcapture.bloks;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import X.C123485wZ;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$upload$1", f = "WaAuthenticityInterpreterCallbackImpl.kt", i = {0, 0, 0}, l = {50, 62}, m = "invokeSuspend", n = {"$this$launch", "successMap", "entry"}, s = {"L$0", "L$1", "L$6"})
public final class WaAuthenticityInterpreterCallbackImpl$upload$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Map $fileUris;
    public final /* synthetic */ C006302t $onUploadFailed;
    public final /* synthetic */ C006302t $onUploadSuccess;
    public final /* synthetic */ String $product;
    public final /* synthetic */ long $submissionId;
    public final /* synthetic */ Map $uploadMediums;
    public long J$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public final /* synthetic */ C123485wZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaAuthenticityInterpreterCallbackImpl$upload$1(C123485wZ r2, String str, Map map, Map map2, C023509x r6, C006302t r7, C006302t r8, long j) {
        super(2, r6);
        this.$fileUris = map;
        this.this$0 = r2;
        this.$uploadMediums = map2;
        this.$product = str;
        this.$submissionId = j;
        this.$onUploadSuccess = r7;
        this.$onUploadFailed = r8;
    }

    public final C023509x create(Object obj, C023509x r12) {
        Map map = this.$fileUris;
        C123485wZ r1 = this.this$0;
        Map map2 = this.$uploadMediums;
        C023509x r5 = r12;
        WaAuthenticityInterpreterCallbackImpl$upload$1 waAuthenticityInterpreterCallbackImpl$upload$1 = new WaAuthenticityInterpreterCallbackImpl$upload$1(r1, this.$product, map, map2, r5, this.$onUploadSuccess, this.$onUploadFailed, this.$submissionId);
        waAuthenticityInterpreterCallbackImpl$upload$1.L$0 = obj;
        return waAuthenticityInterpreterCallbackImpl$upload$1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:15|16|17|18|(3:20|21|(4:23|(1:26)(1:31)|(2:33|34)|(4:89|(1:91)|98|(2:100|116))(4:37|(3:39|40|49)|50|51)))|24|(0)(0)|(0)|(0)|89|(0)|98|(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0280, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d8, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0106, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        X.C05600Qi.A00(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010b, code lost:
        X.C05600Qi.A00(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0203, code lost:
        r24 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0209, code lost:
        if (r8.equals(r1) != false) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x021f, code lost:
        if (r8.equals("bmp") == false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0221, code lost:
        r24 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0223, code lost:
        r0.A0C.add(new X.C123825x9(r21, "upload1", r23, r24, 0, r27));
        r0.A04((X.C1265864p) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x025a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        com.whatsapp.util.Log.e("IdvImageUploader/upload", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0268, code lost:
        if ((X.AnonymousClass0AR.A04.get(r2) instanceof X.C16560pR) != false) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x026a, code lost:
        r2.resumeWith(X.C90524aI.A0t(r1));
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0279 A[Catch:{ Exception -> 0x025a, all -> 0x0280 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02d5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bc A[Catch:{ all -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00dd A[SYNTHETIC, Splitter:B:33:0x00dd] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0248 A[Catch:{ Exception -> 0x025a, all -> 0x0280 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            r32 = this;
            r2 = r33
            X.0AO r19 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r5 = r32
            int r3 = r5.label
            r1 = 2
            r18 = 1
            if (r3 == 0) goto L_0x003a
            r0 = 1
            if (r3 == r0) goto L_0x0018
            if (r3 != r1) goto L_0x02d6
            X.AnonymousClass0AN.A00(r2)
        L_0x0015:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0018:
            long r0 = r5.J$0
            r30 = r0
            java.lang.Object r9 = r5.L$6
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r5.L$5
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r7 = r5.L$4
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r5.L$3
            X.5wZ r6 = (X.C123485wZ) r6
            java.lang.Object r4 = r5.L$2
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r3 = r5.L$1
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r0 = r5.L$0
            r29 = r0
            goto L_0x027a
        L_0x003a:
            X.AnonymousClass0AN.A00(r2)
            java.lang.Object r0 = r5.L$0
            r29 = r0
            java.util.LinkedHashMap r3 = X.C36431kI.A1G()
            java.util.Map r2 = r5.$fileUris
            java.util.Map r4 = r5.$uploadMediums
            X.5wZ r6 = r5.this$0
            java.lang.String r7 = r5.$product
            long r0 = r5.$submissionId
            r30 = r0
            java.util.Iterator r10 = X.AnonymousClass000.A0y(r2)
        L_0x0055:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02a6
            java.util.Map$Entry r9 = X.AnonymousClass000.A11(r10)
            java.lang.String r0 = X.C90514aH.A10(r9)
            android.net.Uri r11 = android.net.Uri.parse(r0)
            java.lang.Object r0 = r9.getKey()
            java.lang.String r12 = X.C36431kI.A1A(r0, r4)
            if (r11 == 0) goto L_0x0055
            if (r12 == 0) goto L_0x0055
            X.5xP r8 = r6.A02     // Catch:{ all -> 0x0280 }
            java.lang.String r17 = java.lang.String.valueOf(r30)     // Catch:{ all -> 0x0280 }
            r0 = r29
            r5.L$0 = r0     // Catch:{ all -> 0x0280 }
            r5.L$1 = r3     // Catch:{ all -> 0x0280 }
            r5.L$2 = r4     // Catch:{ all -> 0x0280 }
            r5.L$3 = r6     // Catch:{ all -> 0x0280 }
            r5.L$4 = r7     // Catch:{ all -> 0x0280 }
            r5.L$5 = r10     // Catch:{ all -> 0x0280 }
            r5.L$6 = r9     // Catch:{ all -> 0x0280 }
            r0 = r30
            r5.J$0 = r0     // Catch:{ all -> 0x0280 }
            r0 = 1
            r5.label = r0     // Catch:{ all -> 0x0280 }
            r16 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.AnonymousClass0AR.A04     // Catch:{ all -> 0x0280 }
            X.09x r1 = X.AnonymousClass0AA.A01(r5)     // Catch:{ all -> 0x0280 }
            r15 = 1
            X.0AR r2 = new X.0AR     // Catch:{ all -> 0x0280 }
            r2.<init>(r15, r1)     // Catch:{ all -> 0x0280 }
            r2.A0J()     // Catch:{ all -> 0x0280 }
            X.005 r0 = r8.A02     // Catch:{ Exception -> 0x025a }
            r20 = r0
            java.lang.Object r0 = r20.get()     // Catch:{ Exception -> 0x025a }
            X.0ya r0 = (X.C21050ya) r0     // Catch:{ Exception -> 0x025a }
            r13 = 0
            android.database.Cursor r14 = r0.A02(r11)     // Catch:{ Exception -> 0x025a }
            if (r14 == 0) goto L_0x00b9
            boolean r1 = r14.moveToFirst()     // Catch:{ all -> 0x00d6 }
            if (r1 != r15) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r15 = 0
        L_0x00ba:
            if (r15 == 0) goto L_0x00da
            java.lang.String r0 = "_display_name"
            int r1 = r14.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "_size"
            int r0 = r14.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00d6 }
            java.lang.String r13 = r14.getString(r1)     // Catch:{ all -> 0x00d6 }
            long r0 = r14.getLong(r0)     // Catch:{ all -> 0x00d6 }
            java.lang.Long r15 = new java.lang.Long     // Catch:{ all -> 0x00d6 }
            r15.<init>(r0)     // Catch:{ all -> 0x00d6 }
            goto L_0x00db
        L_0x00d6:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r1 = move-exception
            goto L_0x010b
        L_0x00da:
            r15 = r13
        L_0x00db:
            if (r14 == 0) goto L_0x00e0
            r14.close()     // Catch:{ Exception -> 0x025a }
        L_0x00e0:
            if (r13 == 0) goto L_0x0235
            if (r15 == 0) goto L_0x0235
            long r0 = r15.longValue()     // Catch:{ Exception -> 0x025a }
            X.005 r14 = r8.A01     // Catch:{ Exception -> 0x025a }
            java.lang.Object r14 = r14.get()     // Catch:{ Exception -> 0x025a }
            X.0yF r14 = (X.C20840yF) r14     // Catch:{ Exception -> 0x025a }
            java.io.File r13 = r14.A00(r13)     // Catch:{ Exception -> 0x025a }
            java.lang.Object r14 = r20.get()     // Catch:{ Exception -> 0x025a }
            X.0ya r14 = (X.C21050ya) r14     // Catch:{ Exception -> 0x025a }
            java.io.InputStream r11 = r14.A06(r11)     // Catch:{ Exception -> 0x025a }
            if (r11 == 0) goto L_0x0112
            X.AnonymousClass6YY.A0T(r13, r11, r0)     // Catch:{ all -> 0x0104 }
            goto L_0x010f
        L_0x0104:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0106 }
        L_0x0106:
            r1 = move-exception
            X.C05600Qi.A00(r11, r0)     // Catch:{ Exception -> 0x025a }
            goto L_0x010e
        L_0x010b:
            X.C05600Qi.A00(r14, r0)     // Catch:{ Exception -> 0x025a }
        L_0x010e:
            throw r1     // Catch:{ Exception -> 0x025a }
        L_0x010f:
            r11.close()     // Catch:{ Exception -> 0x025a }
        L_0x0112:
            X.005 r0 = r8.A00     // Catch:{ Exception -> 0x025a }
            java.lang.Object r11 = r0.get()     // Catch:{ Exception -> 0x025a }
            X.1GE r11 = (X.AnonymousClass1GE) r11     // Catch:{ Exception -> 0x025a }
            java.lang.String r1 = r8.A05     // Catch:{ Exception -> 0x025a }
            X.6v3 r0 = new X.6v3     // Catch:{ Exception -> 0x025a }
            r0.<init>(r8, r13, r2)     // Catch:{ Exception -> 0x025a }
            r24 = 37
            r14 = 0
            r25 = 0
            r20 = r11
            r21 = r0
            r22 = r1
            r23 = r14
            X.6VO r0 = r20.A00(r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x025a }
            java.lang.String r11 = "access_token"
            java.lang.String r1 = r8.A04     // Catch:{ Exception -> 0x025a }
            r0.A06(r11, r1)     // Catch:{ Exception -> 0x025a }
            java.lang.String r1 = "upload_medium"
            r0.A06(r1, r12)     // Catch:{ Exception -> 0x025a }
            java.lang.String r1 = "product"
            r0.A06(r1, r7)     // Catch:{ Exception -> 0x025a }
            java.lang.String r11 = "return_file_handles"
            java.lang.String r1 = java.lang.String.valueOf(r18)     // Catch:{ Exception -> 0x025a }
            r0.A06(r11, r1)     // Catch:{ Exception -> 0x025a }
            java.lang.String r11 = "submit_to_authenticity_platform"
            java.lang.String r1 = java.lang.String.valueOf(r16)     // Catch:{ Exception -> 0x025a }
            r0.A06(r11, r1)     // Catch:{ Exception -> 0x025a }
            java.lang.String r11 = "id_or_cuid"
            java.lang.String r1 = java.lang.String.valueOf(r16)     // Catch:{ Exception -> 0x025a }
            r0.A06(r11, r1)     // Catch:{ Exception -> 0x025a }
            java.lang.String r11 = "submission_id"
            r1 = r17
            r0.A06(r11, r1)     // Catch:{ Exception -> 0x025a }
            java.lang.String r11 = "device_id"
            X.005 r1 = r8.A03     // Catch:{ Exception -> 0x025a }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x025a }
            X.0v0 r1 = (X.C19420v0) r1     // Catch:{ Exception -> 0x025a }
            java.lang.String r1 = r1.A0e()     // Catch:{ Exception -> 0x025a }
            r0.A06(r11, r1)     // Catch:{ Exception -> 0x025a }
            java.lang.String r8 = "session_id"
            java.lang.String r1 = X.C36361kB.A0l()     // Catch:{ Exception -> 0x025a }
            r0.A06(r8, r1)     // Catch:{ Exception -> 0x025a }
            java.io.FileInputStream r21 = X.C90524aI.A0U(r13)     // Catch:{ Exception -> 0x025a }
            java.lang.String r22 = "upload1"
            java.lang.String r23 = r13.getName()     // Catch:{ Exception -> 0x025a }
            long r27 = r13.length()     // Catch:{ Exception -> 0x025a }
            java.lang.String r8 = r13.getName()     // Catch:{ Exception -> 0x025a }
            X.AnonymousClass00C.A08(r8)     // Catch:{ Exception -> 0x025a }
            java.lang.String r1 = ""
            java.lang.String r1 = X.AnonymousClass099.A0H(r8, r1)     // Catch:{ Exception -> 0x025a }
            java.lang.String r8 = X.C90514aH.A0y(r1)     // Catch:{ Exception -> 0x025a }
            int r1 = r8.hashCode()     // Catch:{ Exception -> 0x025a }
            switch(r1) {
                case 97669: goto L_0x0217;
                case 102340: goto L_0x020c;
                case 105441: goto L_0x0201;
                case 108273: goto L_0x01f6;
                case 110834: goto L_0x01eb;
                case 111145: goto L_0x01e0;
                case 120609: goto L_0x01d5;
                case 3189082: goto L_0x01ca;
                case 3198679: goto L_0x01bf;
                case 3268712: goto L_0x01bc;
                case 3559925: goto L_0x01b1;
                case 3645340: goto L_0x01a6;
                default: goto L_0x01a5;
            }     // Catch:{ Exception -> 0x025a }
        L_0x01a5:
            goto L_0x0221
        L_0x01a6:
            java.lang.String r1 = "webp"
            boolean r1 = r8.equals(r1)     // Catch:{ Exception -> 0x025a }
            r24 = 8
            if (r1 != 0) goto L_0x0223
            goto L_0x0221
        L_0x01b1:
            java.lang.String r1 = "tiff"
            boolean r1 = r8.equals(r1)     // Catch:{ Exception -> 0x025a }
            r24 = 7
            if (r1 != 0) goto L_0x0223
            goto L_0x0221
        L_0x01bc:
            java.lang.String r1 = "jpeg"
            goto L_0x0203
        L_0x01bf:
            java.lang.String r1 = "heic"
            boolean r1 = r8.equals(r1)     // Catch:{ Exception -> 0x025a }
            r24 = 9
            if (r1 != 0) goto L_0x0223
            goto L_0x0221
        L_0x01ca:
            java.lang.String r1 = "gzip"
            boolean r1 = r8.equals(r1)     // Catch:{ Exception -> 0x025a }
            r24 = 0
            if (r1 != 0) goto L_0x0223
            goto L_0x0221
        L_0x01d5:
            java.lang.String r1 = "zip"
            boolean r1 = r8.equals(r1)     // Catch:{ Exception -> 0x025a }
            r24 = 1
            if (r1 != 0) goto L_0x0223
            goto L_0x0221
        L_0x01e0:
            java.lang.String r1 = "png"
            boolean r1 = r8.equals(r1)     // Catch:{ Exception -> 0x025a }
            r24 = 6
            if (r1 != 0) goto L_0x0223
            goto L_0x0221
        L_0x01eb:
            java.lang.String r1 = "pdf"
            boolean r1 = r8.equals(r1)     // Catch:{ Exception -> 0x025a }
            r24 = 10
            if (r1 != 0) goto L_0x0223
            goto L_0x0221
        L_0x01f6:
            java.lang.String r1 = "mp4"
            boolean r1 = r8.equals(r1)     // Catch:{ Exception -> 0x025a }
            r24 = 11
            if (r1 != 0) goto L_0x0223
            goto L_0x0221
        L_0x0201:
            java.lang.String r1 = "jpg"
        L_0x0203:
            boolean r1 = r8.equals(r1)     // Catch:{ Exception -> 0x025a }
            r24 = 3
            if (r1 != 0) goto L_0x0223
            goto L_0x0221
        L_0x020c:
            java.lang.String r1 = "gif"
            boolean r1 = r8.equals(r1)     // Catch:{ Exception -> 0x025a }
            r24 = 4
            if (r1 != 0) goto L_0x0223
            goto L_0x0221
        L_0x0217:
            java.lang.String r1 = "bmp"
            boolean r1 = r8.equals(r1)     // Catch:{ Exception -> 0x025a }
            r24 = 5
            if (r1 != 0) goto L_0x0223
        L_0x0221:
            r24 = 2
        L_0x0223:
            r25 = 0
            java.util.List r8 = r0.A0C     // Catch:{ Exception -> 0x025a }
            X.5x9 r1 = new X.5x9     // Catch:{ Exception -> 0x025a }
            r20 = r1
            r20.<init>(r21, r22, r23, r24, r25, r27)     // Catch:{ Exception -> 0x025a }
            r8.add(r1)     // Catch:{ Exception -> 0x025a }
            r0.A04(r14)     // Catch:{ Exception -> 0x025a }
            goto L_0x0271
        L_0x0235:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x025a }
            java.lang.String r0 = "IdvImageUploader/idvUpload: couldn't retrieve media for "
            X.C36321k7.A1J(r11, r0, r1)     // Catch:{ Exception -> 0x025a }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.AnonymousClass0AR.A04     // Catch:{ Exception -> 0x025a }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x025a }
            boolean r0 = r0 instanceof X.C16560pR     // Catch:{ Exception -> 0x025a }
            if (r0 == 0) goto L_0x0271
            java.lang.String r0 = "couldn't retrieve file"
            java.lang.RuntimeException r1 = X.C90514aH.A0s(r0)     // Catch:{ Exception -> 0x025a }
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)     // Catch:{ Exception -> 0x025a }
            X.03N r0 = X.C90524aI.A0t(r1)     // Catch:{ Exception -> 0x025a }
            r2.resumeWith(r0)     // Catch:{ Exception -> 0x025a }
            goto L_0x0271
        L_0x025a:
            r1 = move-exception
            java.lang.String r0 = "IdvImageUploader/upload"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0280 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.AnonymousClass0AR.A04     // Catch:{ all -> 0x0280 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0280 }
            boolean r0 = r0 instanceof X.C16560pR     // Catch:{ all -> 0x0280 }
            if (r0 == 0) goto L_0x0271
            X.03N r0 = X.C90524aI.A0t(r1)     // Catch:{ all -> 0x0280 }
            r2.resumeWith(r0)     // Catch:{ all -> 0x0280 }
        L_0x0271:
            java.lang.Object r2 = r2.A0G()     // Catch:{ all -> 0x0280 }
            r0 = r19
            if (r2 != r0) goto L_0x027d
            goto L_0x02db
        L_0x027a:
            X.AnonymousClass0AN.A00(r2)     // Catch:{ all -> 0x0280 }
        L_0x027d:
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0280 }
            goto L_0x0285
        L_0x0280:
            r0 = move-exception
            X.03N r2 = X.C90524aI.A0t(r0)
        L_0x0285:
            boolean r0 = r2 instanceof X.AnonymousClass03N
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0295
            java.lang.Object r0 = r9.getKey()
            r3.put(r0, r2)
            r9.getKey()
        L_0x0295:
            java.lang.Throwable r2 = X.AnonymousClass0AK.A00(r2)
            if (r2 == 0) goto L_0x0055
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WaAuthenticityInterpreterCallbackImpl/idvUpload failure for: "
            X.C36321k7.A1M(r9, r0, r1, r2)
            goto L_0x0055
        L_0x02a6:
            X.5wZ r0 = r5.this$0
            X.02l r7 = r0.A04
            java.util.Map r6 = r5.$fileUris
            X.02t r4 = r5.$onUploadSuccess
            X.02t r2 = r5.$onUploadFailed
            r0 = 0
            com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$upload$1$2 r1 = new com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$upload$1$2
            r8 = r1
            r9 = r3
            r10 = r6
            r11 = r0
            r12 = r4
            r13 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.L$3 = r0
            r5.L$4 = r0
            r5.L$5 = r0
            r5.L$6 = r0
            r0 = 2
            r5.label = r0
            java.lang.Object r1 = X.AnonymousClass0A2.A00(r5, r7, r1)
            r0 = r19
            if (r1 != r0) goto L_0x0015
            return r19
        L_0x02d6:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x02db:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$upload$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WaAuthenticityInterpreterCallbackImpl$upload$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
