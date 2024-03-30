package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.Statistics$Data;
import java.io.File;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.14K  reason: invalid class name */
public class AnonymousClass14K extends Handler implements C19680wL {
    public Statistics$Data A00;
    public File A01;
    public File A02;
    public final CountDownLatch A03 = new CountDownLatch(1);
    public volatile boolean A04;
    public final /* synthetic */ C20050ww A05;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        r11.A00.A0I += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        if (r5 == 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r5 == 1) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r5 == 2) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r5 == 3) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r5 != 4) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        r11.A00.A0J += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        r11.A00.A0D += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r11.A00.A0M += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        r11.A00.A0G += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0073, code lost:
        r11.A00.A0E += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008a, code lost:
        if (r11.A04 == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008c, code lost:
        r11.A00.A07 += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        if (r5 == 0) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0096, code lost:
        if (r5 == 1) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        if (r5 == 2) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009c, code lost:
        if (r5 == 3) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009f, code lost:
        if (r5 != 4) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a1, code lost:
        r11.A00.A08 += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00aa, code lost:
        r11.A00.A00 += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b3, code lost:
        r11.A00.A0B += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bc, code lost:
        r11.A00.A03 += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c5, code lost:
        r11.A00.A01 += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0181, code lost:
        r1 = r11.A01;
        X.C18740tg.A06(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r2 = new X.AnonymousClass5RK(r11.A05.A04.A00, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r2.write(r11.A00.A00().getBytes());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r2.close();
        r11.A02.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        com.whatsapp.util.Log.e("statistics/save: error saving", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r11.A04 == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void handleMessage(android.os.Message r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            int r0 = r12.what     // Catch:{ all -> 0x022a }
            r4 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x01b9;
                case 1: goto L_0x0181;
                case 2: goto L_0x001e;
                case 3: goto L_0x0024;
                case 4: goto L_0x002a;
                case 5: goto L_0x007c;
                case 6: goto L_0x00ce;
                case 7: goto L_0x0101;
                case 8: goto L_0x0161;
                case 9: goto L_0x017a;
                default: goto L_0x0008;
            }     // Catch:{ all -> 0x022a }
        L_0x0008:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x022a }
            r1.<init>()     // Catch:{ all -> 0x022a }
            java.lang.String r0 = "statistics/stats-handler:unknown message:"
            r1.append(r0)     // Catch:{ all -> 0x022a }
            r1.append(r12)     // Catch:{ all -> 0x022a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x022a }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x022a }
            goto L_0x0228
        L_0x001e:
            int r5 = r12.arg1     // Catch:{ all -> 0x022a }
            int r0 = r12.arg2     // Catch:{ all -> 0x022a }
            long r3 = (long) r0     // Catch:{ all -> 0x022a }
            goto L_0x0036
        L_0x0024:
            int r5 = r12.arg1     // Catch:{ all -> 0x022a }
            int r0 = r12.arg2     // Catch:{ all -> 0x022a }
            long r3 = (long) r0     // Catch:{ all -> 0x022a }
            goto L_0x0088
        L_0x002a:
            int r5 = r12.arg1     // Catch:{ all -> 0x022a }
            android.os.Bundle r1 = r12.getData()     // Catch:{ all -> 0x022a }
            java.lang.String r0 = "bytes"
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x022a }
        L_0x0036:
            boolean r0 = r11.A04     // Catch:{ all -> 0x022a }
            if (r0 == 0) goto L_0x0041
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x022a }
            long r0 = r2.A0I     // Catch:{ all -> 0x022a }
            long r0 = r0 + r3
            r2.A0I = r0     // Catch:{ all -> 0x022a }
        L_0x0041:
            if (r5 == 0) goto L_0x0073
            r0 = 1
            if (r5 == r0) goto L_0x006a
            r0 = 2
            if (r5 == r0) goto L_0x0061
            r0 = 3
            if (r5 == r0) goto L_0x0058
            r0 = 4
            if (r5 != r0) goto L_0x0228
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x022a }
            long r0 = r2.A0J     // Catch:{ all -> 0x022a }
            long r0 = r0 + r3
            r2.A0J = r0     // Catch:{ all -> 0x022a }
            goto L_0x0228
        L_0x0058:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x022a }
            long r0 = r2.A0D     // Catch:{ all -> 0x022a }
            long r0 = r0 + r3
            r2.A0D = r0     // Catch:{ all -> 0x022a }
            goto L_0x0228
        L_0x0061:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x022a }
            long r0 = r2.A0M     // Catch:{ all -> 0x022a }
            long r0 = r0 + r3
            r2.A0M = r0     // Catch:{ all -> 0x022a }
            goto L_0x0228
        L_0x006a:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x022a }
            long r0 = r2.A0G     // Catch:{ all -> 0x022a }
            long r0 = r0 + r3
            r2.A0G = r0     // Catch:{ all -> 0x022a }
            goto L_0x0228
        L_0x0073:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x022a }
            long r0 = r2.A0E     // Catch:{ all -> 0x022a }
            long r0 = r0 + r3
            r2.A0E = r0     // Catch:{ all -> 0x022a }
            goto L_0x0228
        L_0x007c:
            int r5 = r12.arg1     // Catch:{ all -> 0x022a }
            android.os.Bundle r1 = r12.getData()     // Catch:{ all -> 0x022a }
            java.lang.String r0 = "bytes"
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x022a }
        L_0x0088:
            boolean r0 = r11.A04     // Catch:{ all -> 0x022a }
            if (r0 == 0) goto L_0x0093
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x022a }
            long r0 = r2.A07     // Catch:{ all -> 0x022a }
            long r0 = r0 + r3
            r2.A07 = r0     // Catch:{ all -> 0x022a }
        L_0x0093:
            if (r5 == 0) goto L_0x00c5
            r0 = 1
            if (r5 == r0) goto L_0x00bc
            r0 = 2
            if (r5 == r0) goto L_0x00b3
            r0 = 3
            if (r5 == r0) goto L_0x00aa
            r0 = 4
            if (r5 != r0) goto L_0x0228
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x022a }
            long r0 = r2.A08     // Catch:{ all -> 0x022a }
            long r0 = r0 + r3
            r2.A08 = r0     // Catch:{ all -> 0x022a }
            goto L_0x0228
        L_0x00aa:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x022a }
            long r0 = r2.A00     // Catch:{ all -> 0x022a }
            long r0 = r0 + r3
            r2.A00 = r0     // Catch:{ all -> 0x022a }
            goto L_0x0228
        L_0x00b3:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x022a }
            long r0 = r2.A0B     // Catch:{ all -> 0x022a }
            long r0 = r0 + r3
            r2.A0B = r0     // Catch:{ all -> 0x022a }
            goto L_0x0228
        L_0x00bc:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x022a }
            long r0 = r2.A03     // Catch:{ all -> 0x022a }
            long r0 = r0 + r3
            r2.A03 = r0     // Catch:{ all -> 0x022a }
            goto L_0x0228
        L_0x00c5:
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x022a }
            long r0 = r2.A01     // Catch:{ all -> 0x022a }
            long r0 = r0 + r3
            r2.A01 = r0     // Catch:{ all -> 0x022a }
            goto L_0x0228
        L_0x00ce:
            int r1 = r12.arg1     // Catch:{ all -> 0x022a }
            int r0 = r12.arg2     // Catch:{ all -> 0x022a }
            if (r0 != r2) goto L_0x00d5
            r4 = 1
        L_0x00d5:
            r5 = 1
            r0 = 3
            if (r1 != r0) goto L_0x00e2
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x022a }
            long r0 = r2.A0K     // Catch:{ all -> 0x022a }
            long r0 = r0 + r5
            r2.A0K = r0     // Catch:{ all -> 0x022a }
            goto L_0x00f6
        L_0x00e2:
            if (r1 != r2) goto L_0x00ec
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x022a }
            long r0 = r2.A0L     // Catch:{ all -> 0x022a }
            long r0 = r0 + r5
            r2.A0L = r0     // Catch:{ all -> 0x022a }
            goto L_0x00f6
        L_0x00ec:
            r0 = 2
            if (r1 != r0) goto L_0x00f6
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x022a }
            long r0 = r2.A0F     // Catch:{ all -> 0x022a }
            long r0 = r0 + r5
            r2.A0F = r0     // Catch:{ all -> 0x022a }
        L_0x00f6:
            if (r4 == 0) goto L_0x0228
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x022a }
            long r0 = r2.A0H     // Catch:{ all -> 0x022a }
            long r0 = r0 + r5
            r2.A0H = r0     // Catch:{ all -> 0x022a }
            goto L_0x0228
        L_0x0101:
            android.os.Bundle r3 = r12.getData()     // Catch:{ all -> 0x022a }
            java.lang.String r0 = "messageType"
            int r7 = r3.getInt(r0)     // Catch:{ all -> 0x022a }
            java.lang.String r0 = "timestamp"
            long r1 = r3.getLong(r0)     // Catch:{ all -> 0x022a }
            java.lang.String r0 = "isPayment"
            boolean r10 = r3.getBoolean(r0)     // Catch:{ all -> 0x022a }
            X.0ww r0 = r11.A05     // Catch:{ all -> 0x022a }
            X.0wo r0 = r0.A02     // Catch:{ all -> 0x022a }
            long r8 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x022a }
            long r8 = r8 - r1
            r5 = 1
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0136
            com.whatsapp.Statistics$Data r4 = r11.A00     // Catch:{ all -> 0x022a }
            long r2 = r4.A04     // Catch:{ all -> 0x022a }
            long r0 = r4.A05     // Catch:{ all -> 0x022a }
            long r2 = r2 * r0
            long r2 = r2 + r8
            long r0 = r0 + r5
            r4.A05 = r0     // Catch:{ all -> 0x022a }
            long r2 = r2 / r0
            r4.A04 = r2     // Catch:{ all -> 0x022a }
        L_0x0136:
            r0 = 3
            if (r7 != r0) goto L_0x0141
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x022a }
            long r0 = r2.A09     // Catch:{ all -> 0x022a }
            long r0 = r0 + r5
            r2.A09 = r0     // Catch:{ all -> 0x022a }
            goto L_0x0156
        L_0x0141:
            r0 = 1
            if (r7 != r0) goto L_0x014c
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x022a }
            long r0 = r2.A0A     // Catch:{ all -> 0x022a }
            long r0 = r0 + r5
            r2.A0A = r0     // Catch:{ all -> 0x022a }
            goto L_0x0156
        L_0x014c:
            r0 = 2
            if (r7 != r0) goto L_0x0156
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x022a }
            long r0 = r2.A02     // Catch:{ all -> 0x022a }
            long r0 = r0 + r5
            r2.A02 = r0     // Catch:{ all -> 0x022a }
        L_0x0156:
            if (r10 == 0) goto L_0x0228
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x022a }
            long r0 = r2.A06     // Catch:{ all -> 0x022a }
            long r0 = r0 + r5
            r2.A06 = r0     // Catch:{ all -> 0x022a }
            goto L_0x0228
        L_0x0161:
            int r0 = r12.arg1     // Catch:{ all -> 0x022a }
            if (r0 != r2) goto L_0x0166
            r4 = 1
        L_0x0166:
            r5 = 1
            com.whatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x022a }
            if (r4 == 0) goto L_0x0173
            long r0 = r2.A0N     // Catch:{ all -> 0x022a }
            long r0 = r0 + r5
            r2.A0N = r0     // Catch:{ all -> 0x022a }
            goto L_0x0228
        L_0x0173:
            long r0 = r2.A0C     // Catch:{ all -> 0x022a }
            long r0 = r0 + r5
            r2.A0C = r0     // Catch:{ all -> 0x022a }
            goto L_0x0228
        L_0x017a:
            com.whatsapp.Statistics$Data r0 = new com.whatsapp.Statistics$Data     // Catch:{ all -> 0x022a }
            r0.<init>((boolean) r2)     // Catch:{ all -> 0x022a }
            r11.A00 = r0     // Catch:{ all -> 0x022a }
        L_0x0181:
            java.io.File r1 = r11.A01     // Catch:{ all -> 0x022a }
            X.C18740tg.A06(r1)     // Catch:{ all -> 0x022a }
            X.0ww r0 = r11.A05     // Catch:{ Exception -> 0x01b2 }
            X.0yF r0 = r0.A04     // Catch:{ Exception -> 0x01b2 }
            X.0yG r0 = r0.A00     // Catch:{ Exception -> 0x01b2 }
            X.5RK r2 = new X.5RK     // Catch:{ Exception -> 0x01b2 }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x01b2 }
            com.whatsapp.Statistics$Data r0 = r11.A00     // Catch:{ all -> 0x01a8 }
            java.lang.String r0 = r0.A00()     // Catch:{ all -> 0x01a8 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x01a8 }
            r2.write(r0)     // Catch:{ all -> 0x01a8 }
            r2.close()     // Catch:{ Exception -> 0x01b2 }
            java.io.File r0 = r11.A02     // Catch:{ Exception -> 0x01b2 }
            r0.delete()     // Catch:{ Exception -> 0x01b2 }
            goto L_0x0228
        L_0x01a8:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x01ad }
            goto L_0x01b1
        L_0x01ad:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x01b2 }
        L_0x01b1:
            throw r1     // Catch:{ Exception -> 0x01b2 }
        L_0x01b2:
            r1 = move-exception
            java.lang.String r0 = "statistics/save: error saving"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x022a }
            goto L_0x0228
        L_0x01b9:
            X.0ww r0 = r11.A05     // Catch:{ all -> 0x022a }
            X.0wG r0 = r0.A03     // Catch:{ all -> 0x022a }
            android.content.Context r3 = r0.A00     // Catch:{ all -> 0x022a }
            java.io.File r2 = r3.getFilesDir()     // Catch:{ all -> 0x022a }
            java.lang.String r1 = "statistics"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x022a }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x022a }
            r11.A02 = r0     // Catch:{ all -> 0x022a }
            java.io.File r2 = r3.getFilesDir()     // Catch:{ all -> 0x022a }
            java.lang.String r1 = "statistics.json"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x022a }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x022a }
            r11.A01 = r0     // Catch:{ all -> 0x022a }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x022a }
            if (r0 == 0) goto L_0x0202
            java.io.File r0 = r11.A01     // Catch:{ Exception -> 0x01f5 }
            byte[] r0 = X.AnonymousClass14R.A00(r0)     // Catch:{ Exception -> 0x01f5 }
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x01f5 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x01f5 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x01f5 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x01f5 }
            com.whatsapp.Statistics$Data r1 = new com.whatsapp.Statistics$Data     // Catch:{ Exception -> 0x01f5 }
            r1.<init>((org.json.JSONObject) r0)     // Catch:{ Exception -> 0x01f5 }
            goto L_0x0207
        L_0x01f5:
            r1 = move-exception
            java.lang.String r0 = "statistics/load: reset due to the error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x022a }
            r0 = 1
            com.whatsapp.Statistics$Data r1 = new com.whatsapp.Statistics$Data     // Catch:{ all -> 0x022a }
            r1.<init>((boolean) r0)     // Catch:{ all -> 0x022a }
            goto L_0x0207
        L_0x0202:
            com.whatsapp.Statistics$Data r1 = new com.whatsapp.Statistics$Data     // Catch:{ all -> 0x022a }
            r1.<init>((boolean) r4)     // Catch:{ all -> 0x022a }
        L_0x0207:
            r11.A00 = r1     // Catch:{ all -> 0x022a }
            java.util.concurrent.CountDownLatch r0 = r11.A03     // Catch:{ all -> 0x022a }
            r0.countDown()     // Catch:{ all -> 0x022a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x022a }
            r1.<init>()     // Catch:{ all -> 0x022a }
            java.lang.String r0 = "statistics/init: "
            r1.append(r0)     // Catch:{ all -> 0x022a }
            com.whatsapp.Statistics$Data r0 = r11.A00     // Catch:{ all -> 0x022a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x022a }
            r1.append(r0)     // Catch:{ all -> 0x022a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x022a }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x022a }
        L_0x0228:
            monitor-exit(r11)
            return
        L_0x022a:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass14K.handleMessage(android.os.Message):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass14K(Looper looper, C20050ww r4, C19600wD r5) {
        super(looper);
        this.A05 = r4;
        r5.registerObserver(this);
    }

    public void BUP(AnonymousClass3K7 r2) {
        this.A04 = r2.A04;
    }
}
