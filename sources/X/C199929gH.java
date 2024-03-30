package X;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.util.HashSet;

/* renamed from: X.9gH  reason: invalid class name and case insensitive filesystem */
public class C199929gH {
    public C607639g A00;
    public C19700wN A01;
    public byte[] A02 = null;
    public final C21060yb A03;
    public final C19630wG A04;
    public final C19420v0 A05;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.C165607th.A1N(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r6.A04.A08(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.C165607th.A1N(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0078, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0079, code lost:
        com.whatsapp.util.Log.e("AutoconfManager/acquireAuthResponse", r0);
        r10.A01.A0E("AutoconfManager/acquireAuthResponse", r0.getMessage(), true);
        r7 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0078 A[ExcHandler: 91W | RemoteException | IllegalArgumentException | SecurityException (r0v5 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:8:0x0025] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A02(java.lang.String r11) {
        /*
            r10 = this;
            r9 = 0
            if (r11 != 0) goto L_0x0009
            java.lang.String r0 = "AutoconfManager/acquireAuthResponse/null authChallenge"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0008:
            return r9
        L_0x0009:
            X.39g r0 = r10.A00
            if (r0 != 0) goto L_0x0010
            A00(r10)
        L_0x0010:
            r0 = 8
            byte[] r3 = android.util.Base64.decode(r11, r0)
            X.9PI r2 = new X.9PI
            r2.<init>()
            android.os.Bundle r1 = r2.A00
            java.lang.String r0 = "challenge"
            r1.putByteArray(r0, r3)
            r2.A00()
            X.39g r6 = r10.A00     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            X.C18740tg.A06(r6)     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            X.9Cq r8 = new X.9Cq     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            r8.<init>(r1)     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            r0.<init>()     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            r7 = 0
            X.9Yf r5 = r6.A04     // Catch:{ Exception -> 0x006c, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            r5.A00(r8)     // Catch:{ Exception -> 0x003b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            goto L_0x003f
        L_0x003b:
            r0 = move-exception
            X.C165607th.A1N(r0)     // Catch:{ Exception -> 0x006c, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
        L_0x003f:
            android.net.Uri r4 = r6.A01     // Catch:{ Exception -> 0x006c, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            X.62X r3 = r6.A02     // Catch:{ Exception -> 0x006c, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            android.content.ContentResolver r1 = r6.A00     // Catch:{ Exception -> 0x006c, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            java.lang.String r2 = "authenticate"
            android.os.Bundle r0 = r8.A00     // Catch:{ Exception -> 0x006c, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            android.os.Bundle r0 = X.C201719kE.A00(r0)     // Catch:{ Exception -> 0x006c, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            android.os.Bundle r1 = X.AnonymousClass9Yy.A00(r1, r4, r0, r3, r2)     // Catch:{ Exception -> 0x006c, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            X.3Mp r0 = X.C64093Mp.A01     // Catch:{ Exception -> 0x006c, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            X.9PH r0 = r6.A03     // Catch:{ Exception -> 0x006c, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            X.AnonymousClass9Yy.A01(r1, r0, r2)     // Catch:{ Exception -> 0x006c, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            if (r1 == 0) goto L_0x0063
            android.os.Bundle r0 = X.C201719kE.A00(r1)     // Catch:{ Exception -> 0x006c, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            X.9Cr r7 = new X.9Cr     // Catch:{ Exception -> 0x006c, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x006c, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
        L_0x0063:
            r5.A01(r7)     // Catch:{ Exception -> 0x0067, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            goto L_0x0089
        L_0x0067:
            r0 = move-exception
            X.C165607th.A1N(r0)     // Catch:{ Exception -> 0x006c, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            goto L_0x0089
        L_0x006c:
            r1 = move-exception
            X.9Yf r0 = r6.A04     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            r0.A08(r1)     // Catch:{ Exception -> 0x0073, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
            goto L_0x0077
        L_0x0073:
            r0 = move-exception
            X.C165607th.A1N(r0)     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
        L_0x0077:
            throw r1     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            java.lang.String r3 = "AutoconfManager/acquireAuthResponse"
            com.whatsapp.util.Log.e(r3, r0)
            X.0wN r2 = r10.A01
            java.lang.String r1 = r0.getMessage()
            r0 = 1
            r2.A0E(r3, r1, r0)
            r7 = r9
        L_0x0089:
            if (r7 == 0) goto L_0x0008
            android.os.Bundle r2 = r7.A00
            java.lang.String r1 = "response"
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x009a
            byte[] r9 = r2.getByteArray(r1)
            return r9
        L_0x009a:
            java.lang.IllegalStateException r0 = X.C165617ti.A0V()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199929gH.A02(java.lang.String):byte[]");
    }

    public static void A00(C199929gH r13) {
        PackageManager packageManager = r13.A04.A00.getPackageManager();
        C21050ya A0O = r13.A03.A0O();
        AnonymousClass97W r12 = new AnonymousClass97W();
        AnonymousClass9PH r10 = new AnonymousClass9PH(r12);
        HashSet A16 = C36441kJ.A16();
        C18740tg.A06(A0O);
        AnonymousClass8Hg builder = AnonymousClass8Hi.builder();
        Signature[] signatureArr = C113875gG.A02;
        int i = 0;
        do {
            builder.put(C113705fy.A01, signatureArr[i]);
            i++;
        } while (i < 2);
        r13.A00 = new C607639g(A0O.A00, new AnonymousClass62X(packageManager, builder.build(), C20760y7.of()), r10, new C196229Yf(r12, A16), r12);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.C165607th.A1N(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r6.A04.A09(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0096, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        X.C165607th.A1N(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009e, code lost:
        if ((r2 instanceof android.os.RemoteException) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a0, code lost:
        r1 = r10.A05;
        r0 = "error_remote_exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a4, code lost:
        r1.A1N(r0);
        com.whatsapp.util.Log.e("AutoconfManager/acquireClientCapabilities", r2);
        r10.A01.A0E("AutoconfManager/acquireClientCapabilities/error", r2.getMessage(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bc, code lost:
        if ((r2 instanceof X.AnonymousClass91W) != false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00be, code lost:
        r1 = r10.A05;
        r0 = "error_wrapped_provider_exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c3, code lost:
        r0 = r2 instanceof java.lang.IllegalArgumentException;
        r1 = r10.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c7, code lost:
        if (r0 != false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c9, code lost:
        r0 = "error_illegal_argument_exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00cc, code lost:
        r0 = "error_security_exception";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009b A[ExcHandler: 91W | RemoteException | IllegalArgumentException | SecurityException (r2v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:8:0x001a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A01() {
        /*
            r10 = this;
            byte[] r0 = r10.A02
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "AutoconfManager/acquireClientCapabilities/found cached clientCapabilities"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0v0 r1 = r10.A05
            java.lang.String r0 = "client_capabilities_cached"
            r1.A1N(r0)
        L_0x0010:
            byte[] r0 = r10.A02
            return r0
        L_0x0013:
            X.39g r0 = r10.A00
            if (r0 != 0) goto L_0x001a
            A00(r10)
        L_0x001a:
            X.39g r6 = r10.A00     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            X.C18740tg.A06(r6)     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            X.9PJ r0 = new X.9PJ     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            r0.<init>()     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            r0.A00()     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            android.os.Bundle r0 = r0.A00     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            X.9Cs r9 = new X.9Cs     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            r9.<init>(r0)     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            r0.<init>()     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            r5 = 0
            r7 = 0
            X.9Yf r8 = r6.A04     // Catch:{ Exception -> 0x008f, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            r8.A02(r9)     // Catch:{ Exception -> 0x003b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            goto L_0x003f
        L_0x003b:
            r0 = move-exception
            X.C165607th.A1N(r0)     // Catch:{ Exception -> 0x008f, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
        L_0x003f:
            android.net.Uri r4 = r6.A01     // Catch:{ Exception -> 0x008f, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            X.62X r3 = r6.A02     // Catch:{ Exception -> 0x008f, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            android.content.ContentResolver r1 = r6.A00     // Catch:{ Exception -> 0x008f, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            java.lang.String r2 = "query"
            android.os.Bundle r0 = r9.A00     // Catch:{ Exception -> 0x008f, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            android.os.Bundle r0 = X.C201719kE.A00(r0)     // Catch:{ Exception -> 0x008f, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            android.os.Bundle r1 = X.AnonymousClass9Yy.A00(r1, r4, r0, r3, r2)     // Catch:{ Exception -> 0x008f, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            X.3Mp r0 = X.C64093Mp.A01     // Catch:{ Exception -> 0x008f, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            X.9PH r0 = r6.A03     // Catch:{ Exception -> 0x008f, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            X.AnonymousClass9Yy.A01(r1, r0, r2)     // Catch:{ Exception -> 0x008f, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            if (r1 == 0) goto L_0x0063
            android.os.Bundle r0 = X.C201719kE.A00(r1)     // Catch:{ Exception -> 0x008f, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            X.9Ct r7 = new X.9Ct     // Catch:{ Exception -> 0x008f, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            r7.<init>(r0)     // Catch:{ Exception -> 0x008f, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
        L_0x0063:
            r8.A03(r7)     // Catch:{ Exception -> 0x0067, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            goto L_0x006b
        L_0x0067:
            r0 = move-exception
            X.C165607th.A1N(r0)     // Catch:{ Exception -> 0x008f, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
        L_0x006b:
            if (r7 == 0) goto L_0x007b
            android.os.Bundle r2 = r7.A00     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            java.lang.String r1 = "capabilities"
            boolean r0 = r2.containsKey(r1)     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            if (r0 == 0) goto L_0x008a
            byte[] r5 = r2.getByteArray(r1)     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
        L_0x007b:
            r10.A02 = r5     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            X.0v0 r1 = r10.A05     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            if (r5 != 0) goto L_0x0087
            java.lang.String r0 = "success_null_client_capabilities"
        L_0x0083:
            r1.A1N(r0)     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            goto L_0x0010
        L_0x0087:
            java.lang.String r0 = "success_get_client_capabilities"
            goto L_0x0083
        L_0x008a:
            java.lang.IllegalStateException r0 = X.C165617ti.A0V()     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            throw r0     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
        L_0x008f:
            r1 = move-exception
            X.9Yf r0 = r6.A04     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            r0.A09(r1)     // Catch:{ Exception -> 0x0096, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b, 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
            goto L_0x009a
        L_0x0096:
            r0 = move-exception
            X.C165607th.A1N(r0)     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
        L_0x009a:
            throw r1     // Catch:{ 91W | RemoteException | IllegalArgumentException | SecurityException -> 0x009b }
        L_0x009b:
            r2 = move-exception
            boolean r0 = r2 instanceof android.os.RemoteException
            if (r0 == 0) goto L_0x00ba
            X.0v0 r1 = r10.A05
            java.lang.String r0 = "error_remote_exception"
        L_0x00a4:
            r1.A1N(r0)
            java.lang.String r0 = "AutoconfManager/acquireClientCapabilities"
            com.whatsapp.util.Log.e(r0, r2)
            X.0wN r3 = r10.A01
            java.lang.String r2 = r2.getMessage()
            r1 = 1
            java.lang.String r0 = "AutoconfManager/acquireClientCapabilities/error"
            r3.A0E(r0, r2, r1)
            goto L_0x0010
        L_0x00ba:
            boolean r0 = r2 instanceof X.AnonymousClass91W
            if (r0 == 0) goto L_0x00c3
            X.0v0 r1 = r10.A05
            java.lang.String r0 = "error_wrapped_provider_exception"
            goto L_0x00a4
        L_0x00c3:
            boolean r0 = r2 instanceof java.lang.IllegalArgumentException
            X.0v0 r1 = r10.A05
            if (r0 == 0) goto L_0x00cc
            java.lang.String r0 = "error_illegal_argument_exception"
            goto L_0x00a4
        L_0x00cc:
            java.lang.String r0 = "error_security_exception"
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199929gH.A01():byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        X.C165607th.A1N(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.C165607th.A1N(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r6.A04.A0B(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0076, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0077, code lost:
        com.whatsapp.util.Log.e("AutoconfManager/acquireClientStartMessage", r1);
        r10.A01.A0E("AutoconfManager/acquireClientStartMessage/error", r1.getMessage(), true);
        r7 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076 A[ExcHandler: 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException (r1v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:4:0x0008] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A03(java.lang.String r11) {
        /*
            r10 = this;
            X.39g r0 = r10.A00
            if (r0 != 0) goto L_0x0007
            A00(r10)
        L_0x0007:
            r9 = 0
            X.39g r0 = r10.A00     // Catch:{ 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            X.C18740tg.A06(r0)     // Catch:{ 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            X.9PK r3 = new X.9PK     // Catch:{ 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            r3.<init>()     // Catch:{ 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            r3.A00()     // Catch:{ 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            if (r11 == 0) goto L_0x0024
            r0 = 8
            byte[] r2 = android.util.Base64.decode(r11, r0)     // Catch:{ 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            android.os.Bundle r1 = r3.A00     // Catch:{ 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            java.lang.String r0 = "requestMessage"
            r1.putByteArray(r0, r2)     // Catch:{ 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
        L_0x0024:
            X.39g r6 = r10.A00     // Catch:{ 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            android.os.Bundle r0 = r3.A00     // Catch:{ 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            X.9Cu r8 = new X.9Cu     // Catch:{ 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            r8.<init>(r0)     // Catch:{ 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            r0.<init>()     // Catch:{ 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            r7 = 0
            X.9Yf r5 = r6.A04     // Catch:{ Exception -> 0x006a, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            r5.A06(r8)     // Catch:{ Exception -> 0x0039, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            goto L_0x003d
        L_0x0039:
            r0 = move-exception
            X.C165607th.A1N(r0)     // Catch:{ Exception -> 0x006a, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
        L_0x003d:
            android.net.Uri r4 = r6.A01     // Catch:{ Exception -> 0x006a, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            X.62X r3 = r6.A02     // Catch:{ Exception -> 0x006a, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            android.content.ContentResolver r1 = r6.A00     // Catch:{ Exception -> 0x006a, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            java.lang.String r2 = "start"
            android.os.Bundle r0 = r8.A00     // Catch:{ Exception -> 0x006a, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            android.os.Bundle r0 = X.C201719kE.A00(r0)     // Catch:{ Exception -> 0x006a, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            android.os.Bundle r1 = X.AnonymousClass9Yy.A00(r1, r4, r0, r3, r2)     // Catch:{ Exception -> 0x006a, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            X.3Mp r0 = X.C64093Mp.A01     // Catch:{ Exception -> 0x006a, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            X.9PH r0 = r6.A03     // Catch:{ Exception -> 0x006a, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            X.AnonymousClass9Yy.A01(r1, r0, r2)     // Catch:{ Exception -> 0x006a, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            if (r1 == 0) goto L_0x0061
            android.os.Bundle r0 = X.C201719kE.A00(r1)     // Catch:{ Exception -> 0x006a, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            X.9Cv r7 = new X.9Cv     // Catch:{ Exception -> 0x006a, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x006a, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
        L_0x0061:
            r5.A07(r7)     // Catch:{ Exception -> 0x0065, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            goto L_0x0089
        L_0x0065:
            r0 = move-exception
            X.C165607th.A1N(r0)     // Catch:{ Exception -> 0x006a, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            goto L_0x0089
        L_0x006a:
            r1 = move-exception
            X.9Yf r0 = r6.A04     // Catch:{ 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            r0.A0B(r1)     // Catch:{ Exception -> 0x0071, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076, 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
            goto L_0x0075
        L_0x0071:
            r0 = move-exception
            X.C165607th.A1N(r0)     // Catch:{ 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
        L_0x0075:
            throw r1     // Catch:{ 91W | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x0076 }
        L_0x0076:
            r1 = move-exception
            java.lang.String r0 = "AutoconfManager/acquireClientStartMessage"
            com.whatsapp.util.Log.e(r0, r1)
            X.0wN r3 = r10.A01
            java.lang.String r2 = r1.getMessage()
            r1 = 1
            java.lang.String r0 = "AutoconfManager/acquireClientStartMessage/error"
            r3.A0E(r0, r2, r1)
            r7 = r9
        L_0x0089:
            if (r7 == 0) goto L_0x0099
            android.os.Bundle r2 = r7.A00
            java.lang.String r1 = "startMessage"
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x009a
            byte[] r9 = r2.getByteArray(r1)
        L_0x0099:
            return r9
        L_0x009a:
            java.lang.IllegalStateException r0 = X.C165617ti.A0V()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199929gH.A03(java.lang.String):byte[]");
    }

    public C199929gH(C21060yb r2, C19630wG r3, C19420v0 r4) {
        this.A04 = r3;
        this.A03 = r2;
        this.A05 = r4;
    }
}
