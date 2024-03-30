package com.whatsapp.smartcapture.bloks;

import X.AnonymousClass00S;
import X.AnonymousClass01G;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import X.C123485wZ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$documentUpload$1", f = "WaAuthenticityInterpreterCallbackImpl.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
public final class WaAuthenticityInterpreterCallbackImpl$documentUpload$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass01G $activity;
    public final /* synthetic */ String $fileUri;
    public final /* synthetic */ String $namespace;
    public final /* synthetic */ AnonymousClass00S $onCancel;
    public final /* synthetic */ C006302t $onFailure;
    public final /* synthetic */ C006302t $onSuccess;
    public int label;
    public final /* synthetic */ C123485wZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaAuthenticityInterpreterCallbackImpl$documentUpload$1(AnonymousClass01G r2, C123485wZ r3, String str, String str2, C023509x r6, AnonymousClass00S r7, C006302t r8, C006302t r9) {
        super(2, r6);
        this.$fileUri = str;
        this.$namespace = str2;
        this.this$0 = r3;
        this.$activity = r2;
        this.$onSuccess = r8;
        this.$onFailure = r9;
        this.$onCancel = r7;
    }

    public final C023509x create(Object obj, C023509x r11) {
        String str = this.$fileUri;
        String str2 = this.$namespace;
        C123485wZ r2 = this.this$0;
        return new WaAuthenticityInterpreterCallbackImpl$documentUpload$1(this.$activity, r2, str, str2, r11, this.$onCancel, this.$onSuccess, this.$onFailure);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.5RL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: X.5RL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.5RL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: X.5RL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: X.5RL} */
    /* JADX WARNING: type inference failed for: r2v8, types: [X.5RE, java.io.InputStream] */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x015d, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0160, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x016e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0172, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b1 A[RETURN] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r5 = r17
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0011
            if (r0 != r3) goto L_0x01b2
            X.AnonymousClass0AN.A00(r18)
        L_0x000e:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0011:
            X.AnonymousClass0AN.A00(r18)
            java.lang.String r2 = r5.$fileUri
            java.lang.String r11 = r5.$namespace
            X.5wZ r0 = r5.this$0
            X.0xz r8 = r0.A00
            X.C36321k7.A0v(r11, r3, r2)
            java.util.UUID r15 = java.util.UUID.randomUUID()     // Catch:{ Exception -> 0x0186 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r0 = X.AnonymousClass6JD.A0Y     // Catch:{ Exception -> 0x0186 }
            r1.append(r0)     // Catch:{ Exception -> 0x0186 }
            r1.append(r2)     // Catch:{ Exception -> 0x0186 }
            r0 = 47
            r1.append(r0)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r0 = X.AnonymousClass000.A0m(r15, r1)     // Catch:{ Exception -> 0x0186 }
            java.net.URLConnection r12 = X.C90504aG.A0r(r0)     // Catch:{ Exception -> 0x0186 }
            javax.net.ssl.HttpsURLConnection r12 = (javax.net.ssl.HttpsURLConnection) r12     // Catch:{ Exception -> 0x0186 }
            X.AnonymousClass00C.A08(r12)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r0 = "POST"
            r12.setRequestMethod(r0)     // Catch:{ Exception -> 0x0186 }
            r12.setDoOutput(r3)     // Catch:{ Exception -> 0x0186 }
            android.net.Uri r7 = android.net.Uri.parse(r11)     // Catch:{ Exception -> 0x0186 }
            X.0ya r6 = r8.A00     // Catch:{ Exception -> 0x0186 }
            r10 = 0
            android.database.Cursor r2 = r6.A02(r7)     // Catch:{ Exception -> 0x0186 }
            if (r2 == 0) goto L_0x0173
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x016c }
            if (r0 != r3) goto L_0x0071
            java.lang.String r0 = "_display_name"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x016c }
            java.lang.String r0 = "_size"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x016c }
            java.lang.String r14 = r2.getString(r1)     // Catch:{ all -> 0x016c }
            java.lang.Long r16 = X.C36361kB.A0k(r2, r0)     // Catch:{ all -> 0x016c }
            goto L_0x0074
        L_0x0071:
            r14 = r10
            r16 = r10
        L_0x0074:
            r2.close()     // Catch:{ Exception -> 0x0186 }
            if (r16 == 0) goto L_0x0173
            if (r14 == 0) goto L_0x0173
            X.005 r0 = r8.A01     // Catch:{ Exception -> 0x0186 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0186 }
            X.1UU r1 = (X.AnonymousClass1UU) r1     // Catch:{ Exception -> 0x0186 }
            X.6P0 r0 = X.C113235fD.A00     // Catch:{ Exception -> 0x0186 }
            X.6OQ r0 = r1.A04(r0)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r9 = ""
            if (r0 == 0) goto L_0x0161
            X.6c7 r0 = r0.A02     // Catch:{ Exception -> 0x0186 }
            java.lang.Object r13 = r0.A00     // Catch:{ Exception -> 0x0186 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x0186 }
            if (r13 == 0) goto L_0x0161
            if (r13 == r9) goto L_0x0161
            java.lang.String r1 = "Content-Type"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r0 = "multipart/form-data; boundary=Boundary-"
            java.lang.String r0 = X.AnonymousClass000.A0l(r15, r0, r2)     // Catch:{ Exception -> 0x0186 }
            r12.setRequestProperty(r1, r0)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r0 = "gizp"
            r12.setRequestProperty(r1, r0)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r0 = "X-Entity-Name"
            r12.setRequestProperty(r0, r14)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r1 = "X-Entity-Type"
            java.lang.String r0 = "application/octet-stream"
            r12.setRequestProperty(r1, r0)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r1 = "X-Entity-Length"
            java.lang.String r0 = java.lang.String.valueOf(r16)     // Catch:{ Exception -> 0x0186 }
            r12.setRequestProperty(r1, r0)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r1 = "Offset"
            java.lang.String r0 = "0"
            r12.setRequestProperty(r1, r0)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r2 = "Authorization"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r0 = "OAuth "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r13, r1)     // Catch:{ Exception -> 0x0186 }
            r12.setRequestProperty(r2, r0)     // Catch:{ Exception -> 0x0186 }
            r12.connect()     // Catch:{ Exception -> 0x0186 }
            java.io.InputStream r2 = r6.A06(r7)     // Catch:{ Exception -> 0x0186 }
            X.005 r8 = r8.A02     // Catch:{ all -> 0x016c }
            java.lang.Object r1 = r8.get()     // Catch:{ all -> 0x016c }
            X.0ww r1 = (X.C20050ww) r1     // Catch:{ all -> 0x016c }
            r0 = 37
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x016c }
            X.5RL r6 = X.C132776Vf.A01(r1, r10, r7, r12)     // Catch:{ all -> 0x016c }
            if (r2 == 0) goto L_0x014b
            X.AnonymousClass00C.A0B(r6)     // Catch:{ all -> 0x015a }
            X.AnonymousClass0Va.A00(r2, r6)     // Catch:{ all -> 0x015a }
            r12.getResponseMessage()     // Catch:{ all -> 0x015a }
            r6.close()     // Catch:{ all -> 0x016c }
            r2.close()     // Catch:{ Exception -> 0x0186 }
            int r1 = r12.getResponseCode()     // Catch:{ Exception -> 0x0186 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x0145
            java.lang.Object r0 = r8.get()     // Catch:{ Exception -> 0x0186 }
            X.0ww r0 = (X.C20050ww) r0     // Catch:{ Exception -> 0x0186 }
            X.5RE r2 = X.C132776Vf.A00(r0, r10, r7, r12)     // Catch:{ Exception -> 0x0186 }
            java.io.BufferedReader r6 = X.C90484aE.A0b(r2)     // Catch:{ all -> 0x016c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x015a }
        L_0x011c:
            java.lang.String r0 = r6.readLine()     // Catch:{ all -> 0x015a }
            if (r0 == 0) goto L_0x012b
            r1.append(r0)     // Catch:{ all -> 0x015a }
            r0 = 10
            r1.append(r0)     // Catch:{ all -> 0x015a }
            goto L_0x011c
        L_0x012b:
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x015a }
            org.json.JSONObject r1 = X.C36441kJ.A1C(r0)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "h"
            java.lang.String r0 = X.C36411kG.A10(r0, r1)     // Catch:{ all -> 0x015a }
            X.5Ip r7 = new X.5Ip     // Catch:{ all -> 0x015a }
            r7.<init>(r0)     // Catch:{ all -> 0x015a }
            r6.close()     // Catch:{ all -> 0x016c }
            r2.close()     // Catch:{ Exception -> 0x0186 }
            goto L_0x0199
        L_0x0145:
            X.5Io r7 = new X.5Io
            r7.<init>(r9)
            goto L_0x0199
        L_0x014b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "File not found: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r11, r1)     // Catch:{ all -> 0x015a }
            java.io.FileNotFoundException r0 = X.C90524aI.A0V(r0)     // Catch:{ all -> 0x015a }
            throw r0     // Catch:{ all -> 0x015a }
        L_0x015a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x015c }
        L_0x015c:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x016c }
            throw r0     // Catch:{ all -> 0x016c }
        L_0x0161:
            java.lang.String r0 = "DocumentUploadManager/uploadFile empty access token"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0186 }
            X.5Io r7 = new X.5Io     // Catch:{ Exception -> 0x0186 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0186 }
            goto L_0x0199
        L_0x016c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x016e }
        L_0x016e:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ Exception -> 0x0186 }
            throw r0     // Catch:{ Exception -> 0x0186 }
        L_0x0173:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r0 = "DocumentUploadManager/uploadFile couldn't retrieve file for "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r11, r1)     // Catch:{ Exception -> 0x0186 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0186 }
            X.5Io r7 = new X.5Io     // Catch:{ Exception -> 0x0186 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0186 }
            goto L_0x0199
        L_0x0186:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "DocumentUploadManager/uploadFile "
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.5Io r7 = new X.5Io
            r7.<init>(r0)
        L_0x0199:
            X.5wZ r0 = r5.this$0
            X.02l r0 = r0.A04
            X.02t r10 = r5.$onSuccess
            X.02t r11 = r5.$onFailure
            X.00S r9 = r5.$onCancel
            r8 = 0
            com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$documentUpload$1$1 r6 = new com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$documentUpload$1$1
            r6.<init>(r8, r9, r10, r11)
            r5.label = r3
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r5, r0, r6)
            if (r0 != r4) goto L_0x000e
            return r4
        L_0x01b2:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$documentUpload$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WaAuthenticityInterpreterCallbackImpl$documentUpload$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
