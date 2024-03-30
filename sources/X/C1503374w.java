package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: X.74w  reason: invalid class name and case insensitive filesystem */
public class C1503374w implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C1503374w(C99164sj r2, C98794s2 r3, C99174sk r4) {
        this.A03 = 24;
        this.A00 = r4;
        this.A01 = r3;
        this.A02 = r2;
    }

    public static void A00(AnonymousClass6MV r2, C125135zN r3) {
        new AnonymousClass60I(new C162577oo(r2, r3.A09)).A00.A00();
        new AnonymousClass60I(new C162577oo(r2, r3.A04)).A00.A00();
        ExecutorService executorService = r3.A0B;
        if (executorService != null) {
            executorService.shutdown();
            r3.A0B = null;
        }
    }

    public static void A01(Object obj, Object obj2, Object obj3, Executor executor, int i) {
        executor.execute(new C1503374w(obj, obj2, obj3, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.68c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.69g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: X.69d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: X.6B5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v135, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v234, resolved type: X.68c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v235, resolved type: X.68c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v438, resolved type: X.69d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v439, resolved type: X.69d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v728, resolved type: X.008} */
    /* JADX WARNING: type inference failed for: r4v74, types: [X.7lp] */
    /* JADX WARNING: type inference failed for: r4v80, types: [X.6n3] */
    /* JADX WARNING: type inference failed for: r4v81, types: [X.6n4] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:977|978|979|980) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:395|396|397|398|399) */
    /* JADX WARNING: Code restructure failed: missing block: B:1044:?, code lost:
        r3 = java.lang.String.valueOf(r13);
        r2 = X.C90524aI.A0h(X.C90474aD.A05(r3) + 74);
        r2.append("User defined vibrateTimings is invalid: ");
        r2.append(r3);
        android.util.Log.w("NotificationParams", X.AnonymousClass000.A0q(". Skipping setting vibrateTimings.", r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1059:0x17a5, code lost:
        if (r15 == 0) goto L_0x17a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1145:0x19bb, code lost:
        if ("normal".equals(r2) != false) goto L_0x19bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1163:0x1a1f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1164:0x1a20, code lost:
        r17.setResult((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1165:0x1a27, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1185:0x1b14, code lost:
        if (r4.getLayout().getEllipsisCount(0) <= 0) goto L_0x1b16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1226:0x1c54, code lost:
        if (r1.A02 == null) goto L_0x1c58;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1227:0x1c56, code lost:
        r0 = X.AnonymousClass17Z.$redex_init_class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1228:0x1c58, code lost:
        r12 = r1.A01.A00;
        r2.A01.A03(new X.AnonymousClass9XP((X.AnonymousClass9W6) null, r7, r8, r1.A00.A02, r10, 50, r12, r12, true, true), new X.C143146q4(r4, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1229:0x1c75, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1237:0x1d2b, code lost:
        if (r1.A02 == null) goto L_0x1d2f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1238:0x1d2d, code lost:
        r0 = X.AnonymousClass17Z.$redex_init_class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1239:0x1d2f, code lost:
        r10 = r1.A01.A00;
        r5 = new X.C200939iV(r6, r7, r1.A00.A02, 50, r10, r10);
        r5.A03 = true;
        r4.A01.A04(new X.AnonymousClass5VX(r3, r2, 0), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1240:0x1d4d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1378:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04f4, code lost:
        if (r5.A03(r4).isEmpty() == false) goto L_0x0a44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0737, code lost:
        if (r4.isEmpty() != false) goto L_0x0739;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0a4c, code lost:
        if (r0.A0L != false) goto L_0x0a4e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x0d6e, code lost:
        if (r2 != 5) goto L_0x0d70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:680:0x0fcb, code lost:
        r1 = X.C133326Xw.A03(r3, r4, r5, !r6.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:681:0x0fda, code lost:
        if (r1.isEmpty() != false) goto L_0x0fdf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:682:0x0fdc, code lost:
        X.C133326Xw.A03(r3, r4, r1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:683:0x0fdf, code lost:
        X.C133326Xw.A05(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:684:0x0fe2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01e4, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e5, code lost:
        X.C90464aC.A1L("WAFbnsPreloadReceiver/handleFbnsPush: invalid payload:", r4, X.AnonymousClass000.A0u(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:819:0x1260, code lost:
        android.util.Log.w("FirebaseMessaging", X.C90464aC.A0c("Received message with unknown type: ", r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:934:0x14d9, code lost:
        if (r10 == 0) goto L_0x14e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:936:0x14df, code lost:
        if (X.AnonymousClass6UQ.A02(r2, r10) == false) goto L_0x14e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:937:0x14e1, code lost:
        r10 = 17301651;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1043:0x1743 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1066:0x17b8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:398:0x09ac */
    /* JADX WARNING: Missing exception handler attribute for start block: B:412:0x09f6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:979:0x15dc */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1074:0x1809 A[Catch:{ MalformedURLException -> 0x136c, all -> 0x1a1a }] */
    /* JADX WARNING: Removed duplicated region for block: B:1077:0x1813 A[Catch:{ MalformedURLException -> 0x136c, all -> 0x1a1a }] */
    /* JADX WARNING: Removed duplicated region for block: B:1080:0x1824 A[Catch:{ MalformedURLException -> 0x136c, all -> 0x1a1a }] */
    /* JADX WARNING: Removed duplicated region for block: B:1083:0x183d A[SYNTHETIC, Splitter:B:1083:0x183d] */
    /* JADX WARNING: Removed duplicated region for block: B:1099:0x189b A[Catch:{ MalformedURLException -> 0x136c, all -> 0x1a1a }] */
    /* JADX WARNING: Removed duplicated region for block: B:1337:0x0d44 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x077f A[Catch:{ all -> 0x0942, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0792 A[Catch:{ all -> 0x0942, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x079c A[Catch:{ all -> 0x0942, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x07cf A[Catch:{ all -> 0x0942, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x089b A[Catch:{ all -> 0x0942, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x0b29 A[Catch:{ all -> 0x0a3c, all -> 0x0cc5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:595:0x0d8a  */
    /* JADX WARNING: Removed duplicated region for block: B:598:0x0d97  */
    /* JADX WARNING: Removed duplicated region for block: B:602:0x0dc8  */
    /* JADX WARNING: Removed duplicated region for block: B:895:0x13dd A[SYNTHETIC, Splitter:B:895:0x13dd] */
    /* JADX WARNING: Removed duplicated region for block: B:902:0x140f A[Catch:{ MalformedURLException -> 0x136c, all -> 0x1a1a }] */
    /* JADX WARNING: Removed duplicated region for block: B:905:0x1429 A[Catch:{ MalformedURLException -> 0x136c, all -> 0x1a1a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r41 = this;
            r1 = r41
            int r0 = r1.A03
            switch(r0) {
                case 0: goto L_0x0436;
                case 1: goto L_0x0d3e;
                case 2: goto L_0x002a;
                case 3: goto L_0x044f;
                case 4: goto L_0x0df6;
                case 5: goto L_0x0e08;
                case 6: goto L_0x0e20;
                case 7: goto L_0x0e36;
                case 8: goto L_0x0e9e;
                case 9: goto L_0x0eb2;
                case 10: goto L_0x0ec2;
                case 11: goto L_0x0feb;
                case 12: goto L_0x10b7;
                case 13: goto L_0x0036;
                case 14: goto L_0x0105;
                case 15: goto L_0x0469;
                case 16: goto L_0x10d9;
                case 17: goto L_0x10e9;
                case 18: goto L_0x027c;
                case 19: goto L_0x0023;
                case 20: goto L_0x10f9;
                case 21: goto L_0x047f;
                case 22: goto L_0x1109;
                case 23: goto L_0x1133;
                case 24: goto L_0x1163;
                case 25: goto L_0x1190;
                case 26: goto L_0x02a0;
                case 27: goto L_0x032e;
                case 28: goto L_0x1a28;
                case 29: goto L_0x1a5c;
                case 30: goto L_0x1aa9;
                case 31: goto L_0x1adc;
                case 32: goto L_0x1af7;
                case 33: goto L_0x1b1c;
                case 34: goto L_0x1b4d;
                case 35: goto L_0x0357;
                case 36: goto L_0x1b8c;
                case 37: goto L_0x1bd2;
                case 38: goto L_0x1be8;
                case 39: goto L_0x1c1e;
                case 40: goto L_0x1c39;
                case 41: goto L_0x1c76;
                case 42: goto L_0x1cad;
                case 43: goto L_0x1cfe;
                case 44: goto L_0x1d15;
                case 45: goto L_0x1d4e;
                case 46: goto L_0x0007;
                case 47: goto L_0x0007;
                case 48: goto L_0x0380;
                case 49: goto L_0x03a9;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            X.9lS r0 = (X.C202279lS) r0
            java.lang.Object r2 = r1.A01
            X.9iV r2 = (X.C200939iV) r2
            java.lang.Object r1 = r1.A02
            X.A8x r1 = (X.C21112A8x) r1
            java.util.Map r0 = r0.A0P
            java.lang.Object r0 = r0.remove(r2)
            X.7j0 r0 = (X.C159217j0) r0
            if (r0 != 0) goto L_0x0432
            java.lang.String r0 = "The response handler must not be null"
        L_0x001f:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0022:
            return
        L_0x0023:
            java.lang.String r0 = "version"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)     // Catch:{ JSONException -> 0x0022 }
            throw r0     // Catch:{ JSONException -> 0x0022 }
        L_0x002a:
            java.lang.Object r2 = r1.A01
            X.0f7 r2 = (X.AnonymousClass0f7) r2
            boolean r0 = r2.isCancelled()
            if (r0 != 0) goto L_0x0022
            goto L_0x1d84
        L_0x0036:
            java.lang.Object r11 = r1.A02
            X.B5r r11 = (X.C23112B5r) r11
            java.lang.String r18 = "ArEngineControllerImpl"
            int r0 = r1.hashCode()
            long r2 = (long) r0
            r22 = r2
            java.lang.Object r0 = r1.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.String r14 = "effect_id"
            java.lang.String r13 = "filter_type"
            java.lang.String r12 = "effect_instance_id"
            java.lang.String r10 = "effect_session_id"
            java.util.LinkedList r9 = X.C90524aI.A0l()
            java.util.LinkedList r15 = X.C90524aI.A0l()
            java.util.LinkedList r8 = X.C90524aI.A0l()
            java.util.LinkedList r7 = X.C90524aI.A0l()
            java.util.LinkedList r6 = X.C90524aI.A0l()
            java.util.Iterator r17 = r0.iterator()
        L_0x0067:
            boolean r0 = r17.hasNext()
            java.lang.String r5 = "msqrd"
            java.lang.String r4 = "0"
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r0 = r17.next()
            X.5hj r0 = (X.C114725hj) r0
            java.lang.String r3 = "none"
            java.util.Map r0 = r0.A00
            if (r0 == 0) goto L_0x00c8
            boolean r1 = r0.containsKey(r14)
            if (r1 == 0) goto L_0x00c6
            java.lang.String r2 = X.C36431kI.A1A(r14, r0)
        L_0x0087:
            boolean r1 = r0.containsKey(r13)
            if (r1 == 0) goto L_0x0091
            java.lang.String r3 = X.C36431kI.A1A(r13, r0)
        L_0x0091:
            boolean r1 = r0.containsKey(r12)
            if (r1 == 0) goto L_0x00c4
            java.lang.Object r1 = r0.get(r12)
        L_0x009b:
            boolean r16 = r0.containsKey(r10)
            if (r16 == 0) goto L_0x00c2
            java.lang.Object r0 = r0.get(r10)
        L_0x00a5:
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x00b4
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x00b4
            r15.add(r2)
        L_0x00b4:
            r4 = r2
        L_0x00b5:
            r9.add(r4)
            r8.add(r3)
            r7.add(r1)
            r6.add(r0)
            goto L_0x0067
        L_0x00c2:
            r0 = r4
            goto L_0x00a5
        L_0x00c4:
            r1 = r4
            goto L_0x009b
        L_0x00c6:
            r2 = r4
            goto L_0x0087
        L_0x00c8:
            r1 = r4
            r0 = r4
            goto L_0x00b5
        L_0x00cb:
            X.7ih r0 = r11.B9K()
            java.util.List r6 = r0.B8c(r9, r7, r6)
            java.util.List r1 = r0.B8d(r8)
            boolean r0 = r9.equals(r6)
            if (r0 != 0) goto L_0x0022
            r4 = 0
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x1dad
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.util.Iterator r2 = r15.iterator()
        L_0x00ec:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x1d93
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)
            boolean r0 = r6.contains(r1)
            if (r0 != 0) goto L_0x00ec
            r3.append(r1)
            java.lang.String r0 = ";"
            r3.append(r0)
            goto L_0x00ec
        L_0x0105:
            java.lang.Object r5 = r1.A00
            X.4ar r5 = (X.C90804ar) r5
            java.lang.Object r2 = r1.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r1.A02
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.String r3 = r1.getAction()
            java.lang.String r0 = "com.facebook.rti.fbns.intent.RECEIVE"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = "auth_bundle"
            android.os.Bundle r4 = r1.getBundleExtra(r0)
            if (r4 != 0) goto L_0x0129
            java.lang.String r0 = "FBNSPreloadAuthUtils/Invalid auth bundle"
            goto L_0x001f
        L_0x0129:
            java.lang.Class<android.app.PendingIntent> r3 = android.app.PendingIntent.class
            java.lang.String r0 = "auth_pending_intent"
            java.lang.Object r0 = X.C05420Pq.A00(r4, r3, r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            if (r0 != 0) goto L_0x0139
            java.lang.String r0 = "FBNSPreloadAuthUtils/Invalid auth intent"
            goto L_0x001f
        L_0x0139:
            java.lang.String r0 = r0.getCreatorPackage()
            boolean r0 = X.AnonymousClass6GW.A01(r2, r0)
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = "receive_type"
            java.lang.String r4 = r1.getStringExtra(r0)
            java.lang.String r0 = "message"
            boolean r0 = r0.equals(r4)
            java.lang.String r3 = "data"
            if (r0 == 0) goto L_0x0242
            java.lang.String r4 = r1.getStringExtra(r3)
            com.whatsapp.push.WAFbnsPreloadReceiver r5 = (com.whatsapp.push.WAFbnsPreloadReceiver) r5
            X.005 r0 = r5.A01
            java.lang.Object r6 = r0.get()
            X.6T0 r6 = (X.AnonymousClass6T0) r6
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x01ee
            org.json.JSONObject r3 = X.C36441kJ.A1C(r4)     // Catch:{ JSONException -> 0x01e4 }
            java.lang.String r0 = "params"
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x01e4 }
            java.lang.String r3 = "id"
            r7 = 0
            java.lang.String r9 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x01e4 }
            java.lang.String r3 = "ip"
            java.lang.String r10 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x01e4 }
            java.lang.String r3 = "cl_sess"
            java.lang.String r11 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x01e4 }
            java.lang.String r3 = "mmsov"
            java.lang.String r12 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x01e4 }
            java.lang.String r3 = "fbips"
            java.lang.String r13 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x01e4 }
            java.lang.String r3 = "er_ri"
            java.lang.String r14 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x01e4 }
            java.lang.String r5 = "1"
            java.lang.String r3 = "notify"
            java.lang.String r3 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x01e4 }
            boolean r25 = r5.equals(r3)     // Catch:{ JSONException -> 0x01e4 }
            java.lang.String r3 = "push_id"
            java.lang.String r15 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x01e4 }
            java.lang.String r3 = "push_event_id"
            java.lang.String r16 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x01e4 }
            java.lang.String r3 = "push_ts"
            java.lang.String r17 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x01e4 }
            java.lang.String r3 = "pn"
            java.lang.String r18 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x01e4 }
            java.lang.String r3 = "registration_code"
            java.lang.String r19 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x01e4 }
            java.lang.String r3 = "enc_p"
            java.lang.String r20 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x01e4 }
            java.lang.String r3 = "enc_iv"
            java.lang.String r21 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x01e4 }
            java.lang.String r3 = "enc_c"
            java.lang.String r22 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x01e4 }
            java.lang.String r3 = "enc_t"
            java.lang.String r23 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x01e4 }
            r24 = 1
            monitor-enter(r6)     // Catch:{ JSONException -> 0x01e4 }
            r8 = r7
            r6.A03(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r6)     // Catch:{ JSONException -> 0x01e4 }
            goto L_0x01ee
        L_0x01e1:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ JSONException -> 0x01e4 }
            throw r0     // Catch:{ JSONException -> 0x01e4 }
        L_0x01e4:
            r5 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WAFbnsPreloadReceiver/handleFbnsPush: invalid payload:"
            X.C90464aC.A1L(r0, r4, r3, r5)
        L_0x01ee:
            java.lang.String r0 = "extra_notification_sender"
            java.lang.String r5 = r1.getStringExtra(r0)
            java.lang.String r4 = "extra_notification_id"
            java.lang.String r1 = r1.getStringExtra(r4)
            if (r5 == 0) goto L_0x0022
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0022
            if (r1 == 0) goto L_0x0022
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "com.facebook.rti.intent.ACTION_NOTIFICATION_ACK"
            android.content.Intent r3 = X.C36441kJ.A0I(r0)
            r3.putExtra(r4, r1)
            r1 = 1
            java.lang.String r0 = "extra_processor_completed"
            r3.putExtra(r0, r1)
            java.util.List r0 = X.C113685fw.A00
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x022d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FBNSPreloadIPC/Unknown package "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r5, r1)
            goto L_0x001f
        L_0x022d:
            r3.setPackage(r5)     // Catch:{ RuntimeException -> 0x0238 }
            X.AnonymousClass6GW.A00(r2, r3)     // Catch:{ RuntimeException -> 0x0238 }
            r2.sendBroadcast(r3)     // Catch:{ RuntimeException -> 0x0238 }
            goto L_0x1e10
        L_0x0238:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 != 0) goto L_0x0022
            throw r1
        L_0x0242:
            java.lang.String r0 = "registered"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0268
            java.lang.String r10 = r1.getStringExtra(r3)
            com.whatsapp.push.WAFbnsPreloadReceiver r5 = (com.whatsapp.push.WAFbnsPreloadReceiver) r5
            X.1bE r3 = r5.A00
            boolean r0 = r3.A01()
            if (r0 != 0) goto L_0x025e
            java.lang.String r0 = "FbnsTokenManager/onTokenRecevied fbns disabled for account"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x025e:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x1e11
            java.lang.String r0 = "FbnsTokenManager/onTokenRecevied tokenFromFb is null"
            goto L_0x001f
        L_0x0268:
            java.lang.String r0 = "unregistered"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "reg_error"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0022
            r1.getStringExtra(r3)
            return
        L_0x027c:
            java.lang.Object r0 = r1.A00
            X.9YE r0 = (X.AnonymousClass9YE) r0
            X.7eh r5 = r0.A02
            if (r5 == 0) goto L_0x0022
            java.lang.Object r4 = r1.A01
            float[] r4 = (float[]) r4
            java.lang.Object r3 = r1.A02
            java.lang.Integer r3 = (java.lang.Integer) r3
            r2 = 0
            if (r4 == 0) goto L_0x029c
            r0 = 0
            r0 = r4[r0]
            int r1 = (int) r0
            r0 = 1
            r0 = r4[r0]
            int r0 = (int) r0
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r1, r0)
        L_0x029c:
            r5.BYD(r2, r3)
            return
        L_0x02a0:
            java.lang.Object r0 = r1.A00
            X.4Ys r0 = (X.C90004Ys) r0
            java.lang.Object r5 = r1.A02
            X.0wg r5 = (X.C19890wg) r5
            java.lang.Object r0 = r0.A00
            X.3bd r0 = (X.C68273bd) r0
            X.3Tz r11 = r0.A03
            X.1lo r0 = X.C65923Tz.A0Y
            X.3PU[] r4 = r11.A0Q
            int r0 = r11.A00
            r0 = r4[r0]
            int r3 = r0.A00()
            r2 = 0
            r1 = 0
        L_0x02bc:
            if (r1 >= r3) goto L_0x0022
            int r0 = r11.A00
            r0 = r4[r0]
            int[] r6 = r0.A01(r5, r1)
            X.2M9 r0 = new X.2M9
            r0.<init>(r6)
            long r13 = X.C1898996a.A00(r0, r2)
            r7 = 0
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0311
            int r0 = r11.A00
            r0 = r4[r0]
            int[] r10 = r0.A01(r5, r1)
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()
            int r9 = r10.length
            r7 = 0
        L_0x02e3:
            if (r7 >= r9) goto L_0x02f2
            r0 = r10[r7]
            X.C90504aG.A0z(r0, r8)
            r0 = 32
            r8.append(r0)
            int r7 = r7 + 1
            goto L_0x02e3
        L_0x02f2:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "bad emoji on page "
            r7.append(r0)
            int r0 = r11.A00
            r7.append(r0)
            java.lang.String r0 = " index "
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = ": "
            java.lang.String r0 = X.AnonymousClass000.A0l(r8, r0, r7)
            X.C18740tg.A0D(r2, r0)
        L_0x0311:
            android.graphics.drawable.Drawable r0 = X.C65923Tz.A00(r13)
            if (r0 != 0) goto L_0x032b
            r10 = 0
            X.2M9 r12 = new X.2M9
            r12.<init>(r6)
            X.37i r9 = new X.37i
            r9.<init>(r10, r11, r12, r13)
            X.1lo r0 = X.C65923Tz.A0Y
            android.os.Message r0 = android.os.Message.obtain(r0, r2, r2, r2, r9)
            r0.sendToTarget()
        L_0x032b:
            int r1 = r1 + 1
            goto L_0x02bc
        L_0x032e:
            java.lang.Object r5 = r1.A00
            X.6ok r5 = (X.C142356ok) r5
            java.lang.Object r4 = r1.A01
            X.0Bk r4 = (X.C02680Bk) r4
            java.lang.Object r3 = r1.A02
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            X.0Yn r2 = r5.A00     // Catch:{ NullPointerException -> 0x0347 }
            r1 = 0
            X.4k4 r0 = new X.4k4     // Catch:{ NullPointerException -> 0x0347 }
            r0.<init>(r5, r3)     // Catch:{ NullPointerException -> 0x0347 }
            r2.A04(r0, r1, r4)     // Catch:{ NullPointerException -> 0x0347 }
            goto L_0x1e6a
        L_0x0347:
            r0 = move-exception
            r0.getMessage()
            java.lang.Object r0 = r3.get()
            X.7kv r0 = (X.C160387kv) r0
            if (r0 == 0) goto L_0x0022
            r0.BRZ()
            return
        L_0x0357:
            java.lang.Object r0 = r1.A01
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r5 = r0.iterator()
        L_0x035f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r4 = r5.next()
            X.7lb r4 = (X.C160797lb) r4
            java.lang.Object r3 = r1.A00
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            java.lang.Object r0 = r1.A02
            X.6Po r0 = (X.C131566Po) r0
            X.7kw r2 = r0.A04
            if (r3 != 0) goto L_0x037b
            r2.BZu(r4)
            goto L_0x035f
        L_0x037b:
            r0 = 0
            r2.Ba5(r3, r4, r0)
            goto L_0x035f
        L_0x0380:
            java.lang.Object r0 = r1.A00
            X.7tG r0 = (X.C165337tG) r0
            java.lang.Object r5 = r1.A01
            X.6C8 r5 = (X.AnonymousClass6C8) r5
            java.lang.Object r1 = r1.A02
            X.9nx r1 = (X.C203399nx) r1
            if (r5 == 0) goto L_0x0022
            java.lang.Object r0 = r0.A00
            X.6W0 r0 = (X.AnonymousClass6W0) r0
            java.util.HashMap r4 = X.AnonymousClass6W0.A01(r0, r1)
            java.lang.String r3 = "on_success"
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x0022
            X.61h r2 = r5.A03
            r1 = 23
            X.74l r0 = new X.74l
            r0.<init>(r5, r4, r3, r1)
            r2.A00(r0)
            return
        L_0x03a9:
            java.lang.Object r6 = r1.A00
            X.5iU r6 = (X.C115195iU) r6
            java.lang.Object r3 = r1.A01
            X.7j3 r3 = (X.C159247j3) r3
            java.lang.Object r4 = r1.A02
            X.66C r4 = (X.AnonymousClass66C) r4
            java.lang.String r2 = "END_PARSE_FAIL"
            X.5iT r0 = r6.A00     // Catch:{ OutOfMemoryError -> 0x041b }
            if (r0 == 0) goto L_0x040f
            X.5z0 r5 = r0.A00     // Catch:{ OutOfMemoryError -> 0x041b }
            if (r5 == 0) goto L_0x040f
            X.7ku r1 = r5.A03     // Catch:{ OutOfMemoryError -> 0x041b }
            if (r1 == 0) goto L_0x03e9
            java.util.List r7 = r5.A05     // Catch:{ OutOfMemoryError -> 0x041b }
            java.util.List r0 = r5.A06     // Catch:{ OutOfMemoryError -> 0x041b }
            java.util.Map r12 = X.AnonymousClass6XK.A04(r0)     // Catch:{ OutOfMemoryError -> 0x041b }
            X.5iT r0 = r6.A00     // Catch:{ OutOfMemoryError -> 0x041b }
            X.5z0 r0 = r0.A00     // Catch:{ OutOfMemoryError -> 0x041b }
            X.68a r6 = r0.A02     // Catch:{ OutOfMemoryError -> 0x041b }
            java.util.List r8 = r0.A08     // Catch:{ OutOfMemoryError -> 0x041b }
            java.util.Map r13 = r0.A0D     // Catch:{ OutOfMemoryError -> 0x041b }
            java.util.List r11 = r0.A0C     // Catch:{ OutOfMemoryError -> 0x041b }
            r9 = 0
            X.6Lg r5 = new X.6Lg     // Catch:{ OutOfMemoryError -> 0x041b }
            r10 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ OutOfMemoryError -> 0x041b }
            X.5sX r6 = new X.5sX     // Catch:{ OutOfMemoryError -> 0x041b }
            r6.<init>(r5, r1, r9)     // Catch:{ OutOfMemoryError -> 0x041b }
        L_0x03e3:
            r3.BQh(r6)     // Catch:{ OutOfMemoryError -> 0x041b }
            java.lang.String r0 = "END_PARSE_SUCCESS"
            goto L_0x0408
        L_0x03e9:
            r0 = 0
            X.6XK r6 = X.AnonymousClass6XK.A02(r5, r0)     // Catch:{ OutOfMemoryError -> 0x041b }
            X.6lc r5 = r6.A01     // Catch:{ OutOfMemoryError -> 0x041b }
            if (r5 == 0) goto L_0x0406
            int r1 = r5.A04     // Catch:{ OutOfMemoryError -> 0x041b }
            r0 = 13343(0x341f, float:1.8698E-41)
            if (r1 != r0) goto L_0x0406
            X.7ku r5 = X.C140456lc.A0E(r5)     // Catch:{ OutOfMemoryError -> 0x041b }
        L_0x03fc:
            X.6Lg r1 = r6.A00     // Catch:{ OutOfMemoryError -> 0x041b }
            java.lang.String r0 = r6.A02     // Catch:{ OutOfMemoryError -> 0x041b }
            X.5sX r6 = new X.5sX     // Catch:{ OutOfMemoryError -> 0x041b }
            r6.<init>(r1, r5, r0)     // Catch:{ OutOfMemoryError -> 0x041b }
            goto L_0x03e3
        L_0x0406:
            r5 = 0
            goto L_0x03fc
        L_0x0408:
            if (r4 == 0) goto L_0x0022
            r4.A00(r0)     // Catch:{ OutOfMemoryError -> 0x041b }
            goto L_0x1e6b
        L_0x040f:
            java.lang.String r0 = "Action is null after parsing"
            r3.BWo(r0)     // Catch:{ OutOfMemoryError -> 0x041b }
            if (r4 == 0) goto L_0x0022
            r4.A00(r2)     // Catch:{ OutOfMemoryError -> 0x041b }
            goto L_0x1e6c
        L_0x041b:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            if (r0 == 0) goto L_0x042f
            java.lang.String r0 = r1.getMessage()
        L_0x0426:
            r3.BWo(r0)
            if (r4 == 0) goto L_0x0022
            r4.A00(r2)
            return
        L_0x042f:
            java.lang.String r0 = "OutOfMemoryError"
            goto L_0x0426
        L_0x0432:
            r0.BXm(r1, r2)
            return
        L_0x0436:
            java.lang.Object r0 = r1.A01     // Catch:{ Exception -> 0x0446 }
            X.0sD r0 = (X.C17880sD) r0     // Catch:{ Exception -> 0x0446 }
            r0.get()     // Catch:{ Exception -> 0x0446 }
            java.lang.Object r2 = r1.A02     // Catch:{ Exception -> 0x0446 }
            X.0GE r2 = (X.AnonymousClass0GE) r2     // Catch:{ Exception -> 0x0446 }
            r0 = 0
            r2.A06(r0)     // Catch:{ Exception -> 0x0446 }
            return
        L_0x0446:
            r2 = move-exception
            java.lang.Object r0 = r1.A02
            X.0f7 r0 = (X.AnonymousClass0f7) r0
            r0.A05(r2)
            return
        L_0x044f:
            java.lang.Object r0 = r1.A01     // Catch:{ InterruptedException | ExecutionException -> 0x045c }
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0     // Catch:{ InterruptedException | ExecutionException -> 0x045c }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x045c }
            boolean r3 = X.AnonymousClass000.A1X(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x045c }
            goto L_0x045d
        L_0x045c:
            r3 = 1
        L_0x045d:
            java.lang.Object r2 = r1.A00
            X.7e8 r2 = (X.AnonymousClass7e8) r2
            java.lang.Object r0 = r1.A02
            X.69L r0 = (X.AnonymousClass69L) r0
            r2.BX7(r0, r3)
            return
        L_0x0469:
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x0476 }
            X.C36411kG.A1O(r0)     // Catch:{ all -> 0x0476 }
            java.lang.Object r0 = r1.A02
            android.os.PowerManager$WakeLock r0 = (android.os.PowerManager.WakeLock) r0
            r0.release()
            return
        L_0x0476:
            r2 = move-exception
            java.lang.Object r0 = r1.A02
            android.os.PowerManager$WakeLock r0 = (android.os.PowerManager.WakeLock) r0
            r0.release()
            throw r2
        L_0x047f:
            java.lang.Object r2 = r1.A01     // Catch:{ Exception -> 0x0d31 }
            X.5zN r2 = (X.C125135zN) r2     // Catch:{ Exception -> 0x0d31 }
            java.lang.String r0 = "FbVideoResizeOperation.run()"
            android.os.Trace.beginSection(r0)     // Catch:{ Exception -> 0x0d31 }
            X.6Pc r7 = new X.6Pc     // Catch:{ Exception -> 0x0d31 }
            r7.<init>()     // Catch:{ Exception -> 0x0d31 }
            X.60K r5 = new X.60K     // Catch:{ Exception -> 0x0d31 }
            r5.<init>()     // Catch:{ Exception -> 0x0d31 }
            r7.A0C = r5     // Catch:{ Exception -> 0x0d31 }
            X.5zI r0 = r2.A0M     // Catch:{ Exception -> 0x0d31 }
            X.6OY r6 = r0.A04     // Catch:{ Exception -> 0x0d31 }
            if (r6 == 0) goto L_0x04ba
            java.util.List r3 = r6.A0F     // Catch:{ Exception -> 0x0d31 }
            if (r3 == 0) goto L_0x04ba
            boolean r3 = r3.isEmpty()     // Catch:{ Exception -> 0x0d31 }
            if (r3 != 0) goto L_0x04ba
            java.util.List r3 = r6.A0F     // Catch:{ Exception -> 0x0d31 }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ Exception -> 0x0d31 }
        L_0x04aa:
            boolean r3 = r4.hasNext()     // Catch:{ Exception -> 0x0d31 }
            if (r3 == 0) goto L_0x04ba
            java.lang.Object r3 = r4.next()     // Catch:{ Exception -> 0x0d31 }
            X.7lR r3 = (X.C160697lR) r3     // Catch:{ Exception -> 0x0d31 }
            r3.BqB(r5)     // Catch:{ Exception -> 0x0d31 }
            goto L_0x04aa
        L_0x04ba:
            r2.A03 = r7     // Catch:{ Exception -> 0x0d31 }
            X.6MV r16 = new X.6MV     // Catch:{ Exception -> 0x0d31 }
            r16.<init>()     // Catch:{ Exception -> 0x0d31 }
            r9 = 0
            java.lang.Thread r4 = X.C90514aH.A11()     // Catch:{ all -> 0x0cc5 }
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0cc5 }
            boolean r3 = X.C36371kC.A1W(r4, r3)
            X.C131736Qi.A02(r3, r9)     // Catch:{ all -> 0x0cc5 }
            java.lang.System.gc()     // Catch:{ all -> 0x0cc5 }
            X.6Pc r4 = r2.A03     // Catch:{ all -> 0x0cc5 }
            X.6QD r5 = r0.A05     // Catch:{ all -> 0x0cc5 }
            boolean r3 = X.AnonymousClass000.A1V(r5)
            r4.A0Q = r3     // Catch:{ all -> 0x0cc5 }
            boolean r3 = r0.A0D     // Catch:{ all -> 0x0cc5 }
            if (r3 != 0) goto L_0x04f6
            if (r5 == 0) goto L_0x0a44
            X.5TE r4 = X.AnonymousClass5TE.AUDIO     // Catch:{ all -> 0x0cc5 }
            java.util.HashMap r3 = r5.A03(r4)     // Catch:{ all -> 0x0cc5 }
            if (r3 == 0) goto L_0x04f6
            java.util.HashMap r3 = r5.A03(r4)     // Catch:{ all -> 0x0cc5 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0cc5 }
            if (r3 == 0) goto L_0x0a44
        L_0x04f6:
            long r12 = r0.A01     // Catch:{ all -> 0x0cc5 }
            X.6VP r4 = r2.A04     // Catch:{ all -> 0x0cc5 }
            if (r4 == 0) goto L_0x052a
            r7 = 0
            int r3 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0505
            r4.A06(r12)     // Catch:{ all -> 0x0cc5 }
        L_0x0505:
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0cc5 }
            X.5TE r7 = X.AnonymousClass5TE.AUDIO     // Catch:{ all -> 0x0cc5 }
            X.7ez r4 = r2.A0F     // Catch:{ all -> 0x0cc5 }
            android.content.Context r3 = r2.A0C     // Catch:{ all -> 0x0cc5 }
            long r3 = X.C129266Gc.A00(r3, r4, r7, r0)     // Catch:{ all -> 0x0cc5 }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0cc5 }
            long r7 = r8.convert(r3, r7)     // Catch:{ all -> 0x0cc5 }
            r3 = 256000(0x3e800, double:1.26481E-318)
            float r9 = (float) r3     // Catch:{ all -> 0x0cc5 }
            r3 = 1090519040(0x41000000, float:8.0)
            float r9 = r9 / r3
            float r3 = (float) r7     // Catch:{ all -> 0x0cc5 }
            float r9 = r9 * r3
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r9 = r9 / r3
            int r3 = java.lang.Math.round(r9)     // Catch:{ all -> 0x0cc5 }
            long r3 = (long) r3     // Catch:{ all -> 0x0cc5 }
            r2.A00 = r3     // Catch:{ all -> 0x0cc5 }
        L_0x052a:
            boolean r3 = r0.A0E     // Catch:{ all -> 0x0a3c }
            r18 = r3
            if (r3 != 0) goto L_0x05c9
            X.5oZ r3 = r2.A0J     // Catch:{ all -> 0x0a3c }
            boolean r7 = X.C129256Gb.A01(r0)     // Catch:{ all -> 0x0a3c }
            if (r7 == 0) goto L_0x0544
            X.6n2 r8 = new X.6n2     // Catch:{ all -> 0x0a3c }
            r8.<init>()     // Catch:{ all -> 0x0a3c }
        L_0x053d:
            r2.A08 = r8     // Catch:{ all -> 0x0a3c }
            X.6Pc r3 = r2.A03     // Catch:{ all -> 0x0a3c }
            r3.A0T = r7     // Catch:{ all -> 0x0a3c }
            goto L_0x054e
        L_0x0544:
            X.6Xb r4 = r3.A00     // Catch:{ all -> 0x0a3c }
            X.5Yl r3 = r3.A01     // Catch:{ all -> 0x0a3c }
            X.6n1 r8 = new X.6n1     // Catch:{ all -> 0x0a3c }
            r8.<init>(r5, r4, r3)     // Catch:{ all -> 0x0a3c }
            goto L_0x053d
        L_0x054e:
            if (r7 == 0) goto L_0x0554
            r4 = 0
            java.lang.String r3 = "Incompatible MediaExtractor for passthrough"
            goto L_0x055a
        L_0x0554:
            boolean r4 = X.AnonymousClass000.A1V(r6)
            java.lang.String r3 = "Incompatible Parameters for Transcoding"
        L_0x055a:
            X.C131736Qi.A02(r4, r3)     // Catch:{ all -> 0x0a3c }
            if (r5 == 0) goto L_0x0574
            if (r6 == 0) goto L_0x0574
            X.5TE r3 = X.AnonymousClass5TE.VIDEO     // Catch:{ all -> 0x0a3c }
            r4 = 0
            java.util.List r3 = r5.A04(r3, r4)     // Catch:{ all -> 0x0a3c }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0a3c }
            X.6F1 r3 = (X.AnonymousClass6F1) r3     // Catch:{ all -> 0x0a3c }
            boolean r3 = r3.A01()     // Catch:{ all -> 0x0a3c }
            r6.A0H = r3     // Catch:{ all -> 0x0a3c }
        L_0x0574:
            if (r7 != 0) goto L_0x05c9
            int r3 = r6.A00()     // Catch:{ all -> 0x0a3c }
            long r7 = (long) r3     // Catch:{ all -> 0x0a3c }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0a3c }
            X.5TE r9 = X.AnonymousClass5TE.VIDEO     // Catch:{ all -> 0x0a3c }
            X.7ez r4 = r2.A0F     // Catch:{ all -> 0x0a3c }
            android.content.Context r3 = r2.A0C     // Catch:{ all -> 0x0a3c }
            long r3 = X.C129266Gc.A00(r3, r4, r9, r0)     // Catch:{ all -> 0x0a3c }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0a3c }
            long r3 = r10.convert(r3, r9)     // Catch:{ all -> 0x0a3c }
            float r9 = (float) r7     // Catch:{ all -> 0x0a3c }
            r7 = 1090519040(0x41000000, float:8.0)
            float r9 = r9 / r7
            float r7 = (float) r3     // Catch:{ all -> 0x0a3c }
            float r9 = r9 * r7
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r9 = r9 / r3
            int r3 = java.lang.Math.round(r9)     // Catch:{ all -> 0x0a3c }
            long r3 = (long) r3     // Catch:{ all -> 0x0a3c }
            r2.A01 = r3     // Catch:{ all -> 0x0a3c }
            X.6Pc r4 = r2.A03     // Catch:{ all -> 0x0a3c }
            int r3 = r6.A00()     // Catch:{ all -> 0x0a3c }
            r4.A00 = r3     // Catch:{ all -> 0x0a3c }
            X.6Ay r3 = r6.A0C     // Catch:{ all -> 0x0a3c }
            if (r3 == 0) goto L_0x05c0
            X.6Pc r6 = r2.A03     // Catch:{ all -> 0x0a3c }
            int r4 = r3.A01     // Catch:{ all -> 0x0a3c }
            r3 = 1
            if (r4 == r3) goto L_0x05bd
            r3 = 2
            if (r4 == r3) goto L_0x05ba
            r3 = 8
            if (r4 == r3) goto L_0x05c5
            java.lang.String r3 = ""
            goto L_0x05c7
        L_0x05ba:
            java.lang.String r3 = "main"
            goto L_0x05c7
        L_0x05bd:
            java.lang.String r3 = "baseline"
            goto L_0x05c7
        L_0x05c0:
            X.6Pc r6 = r2.A03     // Catch:{ all -> 0x0a3c }
            java.lang.String r3 = "baseline"
            goto L_0x05c7
        L_0x05c5:
            java.lang.String r3 = "high"
        L_0x05c7:
            r6.A0F = r3     // Catch:{ all -> 0x0a3c }
        L_0x05c9:
            X.5Yi r3 = r2.A0G     // Catch:{ all -> 0x0cc5 }
            r26 = r3
            X.7io r3 = r2.A0I     // Catch:{ all -> 0x0cc5 }
            r40 = r3
            X.6Pc r3 = r2.A03     // Catch:{ all -> 0x0cc5 }
            r25 = r3
            android.content.Context r3 = r2.A0C     // Catch:{ all -> 0x0cc5 }
            r20 = r3
            if (r18 == 0) goto L_0x05de
            r32 = 0
            goto L_0x05e6
        L_0x05de:
            boolean r3 = r0.A0I     // Catch:{ all -> 0x0cc5 }
            r32 = 4
            if (r3 != 0) goto L_0x05e6
            r32 = 1
        L_0x05e6:
            android.media.MediaFormat r3 = r2.A02     // Catch:{ all -> 0x0cc5 }
            r17 = r3
            X.6VP r15 = r2.A04     // Catch:{ all -> 0x0cc5 }
            X.7lp r14 = r2.A09     // Catch:{ all -> 0x0cc5 }
            X.6Ga r11 = r2.A0D     // Catch:{ all -> 0x0cc5 }
            X.7ip r10 = r2.A08     // Catch:{ all -> 0x0cc5 }
            long r6 = r2.A01     // Catch:{ all -> 0x0cc5 }
            long r3 = r2.A00     // Catch:{ all -> 0x0cc5 }
            X.65N r9 = r2.A0E     // Catch:{ all -> 0x0cc5 }
            X.7ez r8 = r2.A0F     // Catch:{ all -> 0x0cc5 }
            r39 = r8
            X.6ED r8 = new X.6ED     // Catch:{ all -> 0x0cc5 }
            r19 = r8
            r21 = r17
            r22 = r11
            r23 = r9
            r24 = r39
            r27 = r15
            r28 = r40
            r29 = r0
            r30 = r10
            r31 = r14
            r33 = r6
            r35 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35)     // Catch:{ all -> 0x0cc5 }
            r2.A05 = r8     // Catch:{ all -> 0x0cc5 }
            java.lang.String r3 = "FbVideoResizeOperation.configureMultiOutputCoordinator"
            android.os.Trace.beginSection(r3)     // Catch:{ all -> 0x0cc5 }
            X.6ED r4 = r2.A05     // Catch:{ all -> 0x0cc5 }
            X.5Yo r3 = r2.A0L     // Catch:{ all -> 0x0cc5 }
            r4.A00 = r3     // Catch:{ all -> 0x0cc5 }
            X.5TE r9 = X.AnonymousClass5TE.VIDEO     // Catch:{ all -> 0x0cc5 }
            X.7ez r3 = r4.A0A     // Catch:{ all -> 0x0cc5 }
            r38 = r3
            X.5zI r3 = r4.A0F     // Catch:{ all -> 0x0cc5 }
            android.content.Context r15 = r4.A07     // Catch:{ all -> 0x0cc5 }
            r6 = r38
            long r30 = X.C129266Gc.A00(r15, r6, r9, r3)     // Catch:{ all -> 0x0cc5 }
            r7 = -1
            int r6 = (r30 > r7 ? 1 : (r30 == r7 ? 0 : -1))
            if (r6 > 0) goto L_0x0644
            X.5TE r7 = X.AnonymousClass5TE.AUDIO     // Catch:{ all -> 0x0cc5 }
            r6 = r38
            long r30 = X.C129266Gc.A00(r15, r6, r7, r3)     // Catch:{ all -> 0x0cc5 }
        L_0x0644:
            r28 = r30
            r8 = 0
            X.65N r6 = r4.A09     // Catch:{ all -> 0x0cc5 }
            r37 = r6
            X.5oa r17 = new X.5oa     // Catch:{ all -> 0x0cc5 }
            r7 = r17
            r7.<init>(r6, r4)     // Catch:{ all -> 0x0cc5 }
            X.5Yi r6 = r4.A0C     // Catch:{ all -> 0x0cc5 }
            r22 = r6
            X.7io r6 = r4.A0E     // Catch:{ all -> 0x0cc5 }
            r24 = r6
            boolean r14 = r3.A0D     // Catch:{ all -> 0x0cc5 }
            if (r14 == 0) goto L_0x0663
            int r6 = r4.A04     // Catch:{ all -> 0x0cc5 }
            long r6 = (long) r6     // Catch:{ all -> 0x0cc5 }
            long r30 = r30 / r6
        L_0x0663:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0cc5 }
            r6 = 1
            long r10 = r10.toMicros(r6)     // Catch:{ all -> 0x0cc5 }
            r6 = 0
            long r32 = java.lang.Math.max(r10, r6)     // Catch:{ all -> 0x0cc5 }
            if (r14 != 0) goto L_0x06ec
            boolean r6 = r3.A0E     // Catch:{ all -> 0x0cc5 }
            if (r6 != 0) goto L_0x06e9
            X.5TE r23 = X.AnonymousClass5TE.MIXED     // Catch:{ all -> 0x0cc5 }
        L_0x0679:
            boolean r11 = r3.A0F     // Catch:{ all -> 0x0cc5 }
            X.6Pc r6 = r4.A0B     // Catch:{ all -> 0x0cc5 }
            r36 = r6
            X.65W r10 = r3.A07     // Catch:{ all -> 0x0cc5 }
            java.lang.String r7 = r3.A0B     // Catch:{ all -> 0x0cc5 }
            X.6mu r6 = new X.6mu     // Catch:{ all -> 0x0cc5 }
            r35 = r11
            r19 = r6
            r20 = r37
            r21 = r36
            r25 = r17
            r26 = r10
            r27 = r7
            r34 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r34, r35)     // Catch:{ all -> 0x0cc5 }
            java.util.Map r10 = r4.A02     // Catch:{ all -> 0x0cc5 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0cc5 }
            r10.put(r7, r6)     // Catch:{ all -> 0x0cc5 }
            boolean r10 = r3.A0E     // Catch:{ all -> 0x0cc5 }
            if (r10 != 0) goto L_0x06d4
            r14 = 1
            java.lang.String r11 = "VIDEO_ENCODE_MUX"
            X.75M r10 = new X.75M     // Catch:{ all -> 0x0cc5 }
            r10.<init>()     // Catch:{ all -> 0x0cc5 }
            java.util.concurrent.ThreadPoolExecutor r28 = X.C129246Ga.A00(r11, r10, r14, r8)     // Catch:{ all -> 0x0cc5 }
            android.media.MediaFormat r14 = r4.A08     // Catch:{ all -> 0x0cc5 }
            X.7ip r11 = r4.A0G     // Catch:{ all -> 0x0cc5 }
            X.6n8 r10 = new X.6n8     // Catch:{ all -> 0x0cc5 }
            r19 = r10
            r20 = r15
            r21 = r14
            r22 = r37
            r23 = r38
            r24 = r36
            r25 = r6
            r26 = r3
            r27 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0cc5 }
            java.util.Map r3 = r4.A01     // Catch:{ all -> 0x0cc5 }
            r3.put(r7, r10)     // Catch:{ all -> 0x0cc5 }
            r10.A03()     // Catch:{ all -> 0x0cc5 }
        L_0x06d4:
            android.os.Trace.endSection()     // Catch:{ all -> 0x0cc5 }
            X.6Kh r6 = r0.A09     // Catch:{ all -> 0x0cc5 }
            X.6Pc r4 = r2.A03     // Catch:{ all -> 0x0cc5 }
            r3 = 1
            r4.A0P = r3     // Catch:{ all -> 0x0cc5 }
            java.lang.String r3 = "FbVideoResizeOperation.extractDecodeEncodeMux"
            android.os.Trace.beginSection(r3)     // Catch:{ all -> 0x0cc5 }
            X.6MV r17 = new X.6MV     // Catch:{ all -> 0x0cc5 }
            r17.<init>()     // Catch:{ all -> 0x0cc5 }
            goto L_0x06ef
        L_0x06e9:
            X.5TE r23 = X.AnonymousClass5TE.AUDIO     // Catch:{ all -> 0x0cc5 }
            goto L_0x0679
        L_0x06ec:
            r23 = r9
            goto L_0x0679
        L_0x06ef:
            if (r18 != 0) goto L_0x095d
            X.6Pc r10 = r2.A03     // Catch:{ all -> 0x0a11 }
            r3 = 0
            r10.A0A = r3     // Catch:{ all -> 0x0a11 }
            r10.A09 = r3     // Catch:{ all -> 0x0a11 }
            java.util.concurrent.ExecutorService r3 = r2.A0B     // Catch:{ all -> 0x0a11 }
            r10 = 1
            boolean r4 = X.AnonymousClass000.A1W(r3)
            java.lang.String r3 = "ExecutorService can't be initialized twice"
            X.C131736Qi.A02(r4, r3)     // Catch:{ all -> 0x0a11 }
            X.75M r11 = new X.75M     // Catch:{ all -> 0x0a11 }
            r11.<init>()     // Catch:{ all -> 0x0a11 }
            java.lang.String r4 = "VIDEO_TRANSCODER"
            r3 = 2
            java.util.concurrent.ThreadPoolExecutor r3 = X.C129246Ga.A00(r4, r11, r3, r8)     // Catch:{ all -> 0x0a11 }
            r2.A0B = r3     // Catch:{ all -> 0x0a11 }
            if (r5 == 0) goto L_0x073c
            java.util.HashMap r3 = r5.A03(r9)     // Catch:{ all -> 0x0942 }
            if (r3 == 0) goto L_0x073c
            java.util.HashMap r3 = r5.A03(r9)     // Catch:{ all -> 0x0942 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0942 }
            if (r3 != 0) goto L_0x073c
            X.65W r4 = r0.A07     // Catch:{ all -> 0x0942 }
            X.5sU r3 = new X.5sU     // Catch:{ all -> 0x0942 }
            r3.<init>(r9, r5, r4)     // Catch:{ all -> 0x0942 }
            java.util.List r4 = r5.A04(r9, r8)     // Catch:{ all -> 0x0942 }
            if (r4 == 0) goto L_0x0739
            boolean r3 = r4.isEmpty()     // Catch:{ all -> 0x0942 }
            r11 = 1
            if (r3 == 0) goto L_0x083e
        L_0x0739:
            r11 = 0
            goto L_0x083e
        L_0x073c:
            int r3 = android.os.Process.myTid()     // Catch:{ all -> 0x0942 }
            int r11 = android.os.Process.getThreadPriority(r3)     // Catch:{ all -> 0x0942 }
            X.64W r4 = r2.A0N     // Catch:{ all -> 0x0942 }
            java.util.concurrent.ExecutorService r3 = r2.A0B     // Catch:{ all -> 0x0942 }
            r26 = r3
            X.6Pc r3 = r2.A03     // Catch:{ all -> 0x0942 }
            r20 = r3
            X.7ip r14 = r2.A08     // Catch:{ all -> 0x0942 }
            java.io.File r3 = r0.A0A     // Catch:{ all -> 0x0942 }
            if (r3 == 0) goto L_0x0903
            java.lang.String r15 = r3.getPath()     // Catch:{ all -> 0x0942 }
            java.lang.String r3 = "video/mp4"
            java.lang.String r15 = X.C109715Yq.A00(r15, r3)     // Catch:{ all -> 0x0942 }
            java.lang.String r3 = "image/gif"
            boolean r3 = r3.equals(r15)     // Catch:{ all -> 0x0942 }
            if (r3 == 0) goto L_0x08da
            X.63I r3 = r4.A01     // Catch:{ all -> 0x0942 }
            if (r3 == 0) goto L_0x08da
            android.content.Context r9 = r4.A00     // Catch:{ all -> 0x0942 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x0942 }
            X.6n4 r4 = new X.6n4     // Catch:{ all -> 0x0942 }
            r4.<init>(r9, r3, r0, r14)     // Catch:{ all -> 0x0942 }
        L_0x0774:
            r2.A09 = r4     // Catch:{ all -> 0x0942 }
            r4.B3P(r8)     // Catch:{ all -> 0x0942 }
            r14 = 0
            int r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x0784
            X.7lp r3 = r2.A09     // Catch:{ all -> 0x0942 }
            r3.BpZ(r12)     // Catch:{ all -> 0x0942 }
        L_0x0784:
            X.6ED r3 = r2.A05     // Catch:{ all -> 0x0942 }
            X.6So r4 = r2.A0K     // Catch:{ all -> 0x0942 }
            java.util.Map r3 = r3.A01     // Catch:{ all -> 0x0942 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ all -> 0x0942 }
            X.7lu r3 = (X.C160987lu) r3     // Catch:{ all -> 0x0942 }
            if (r3 == 0) goto L_0x0795
            r3.BuN(r4, r11)     // Catch:{ all -> 0x0942 }
        L_0x0795:
            X.7lp r3 = r2.A09     // Catch:{ all -> 0x0942 }
            r3.start()     // Catch:{ all -> 0x0942 }
            if (r5 == 0) goto L_0x07cb
            X.6ED r3 = r2.A05     // Catch:{ all -> 0x0942 }
            java.util.Map r3 = r3.A01     // Catch:{ all -> 0x0942 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ all -> 0x0942 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x0942 }
            X.7lu r3 = (X.C160987lu) r3     // Catch:{ all -> 0x0942 }
            r3.B0o(r8)     // Catch:{ all -> 0x0942 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x0942 }
            X.6ED r3 = r2.A05     // Catch:{ all -> 0x0942 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x0942 }
            X.5iB r8 = new X.5iB     // Catch:{ all -> 0x0942 }
            r8.<init>(r3)     // Catch:{ all -> 0x0942 }
            X.6ED r3 = r2.A05     // Catch:{ all -> 0x0942 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x0942 }
            X.5iA r4 = new X.5iA     // Catch:{ all -> 0x0942 }
            r4.<init>(r3)     // Catch:{ all -> 0x0942 }
            X.65W r3 = r0.A07     // Catch:{ all -> 0x0942 }
            X.4rj r3 = X.C109705Yp.A00(r5, r4, r8, r3)     // Catch:{ all -> 0x0942 }
            r2.A07 = r3     // Catch:{ all -> 0x0942 }
        L_0x07cb:
            boolean r3 = r2.A0Q     // Catch:{ all -> 0x0942 }
            if (r3 != 0) goto L_0x088f
            java.lang.String r3 = "FbVideoResizeOperation.decoderLoop()"
            android.os.Trace.beginSection(r3)     // Catch:{ all -> 0x0942 }
            java.lang.String r3 = "FbVideoResizeOperation.decodeFrameAndAdvance()"
            android.os.Trace.beginSection(r3)     // Catch:{ all -> 0x0942 }
            X.7lp r3 = r2.A09     // Catch:{ all -> 0x0942 }
            long r3 = r3.B57()     // Catch:{ all -> 0x0942 }
            X.7lp r5 = r2.A09     // Catch:{ all -> 0x0942 }
            boolean r8 = r5.BLY()     // Catch:{ all -> 0x0942 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0942 }
            X.6Py r5 = r2.A07     // Catch:{ all -> 0x0942 }
            if (r5 == 0) goto L_0x07ef
            r5.A00(r3)     // Catch:{ all -> 0x0942 }
        L_0x07ef:
            java.lang.String r5 = "FbVideoResizeOperation.renderAndDisplayFrame()"
            android.os.Trace.beginSection(r5)     // Catch:{ all -> 0x0942 }
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 < 0) goto L_0x07fd
            X.6ED r5 = r2.A05     // Catch:{ all -> 0x0942 }
            r5.A02(r3)     // Catch:{ all -> 0x0942 }
        L_0x07fd:
            android.os.Trace.endSection()     // Catch:{ all -> 0x0942 }
            java.lang.String r3 = "FbVideoResizeOperation.probablyEncode()"
            android.os.Trace.beginSection(r3)     // Catch:{ all -> 0x0942 }
            if (r8 == 0) goto L_0x0823
            X.6ED r3 = r2.A05     // Catch:{ all -> 0x0942 }
            java.util.Map r3 = r3.A01     // Catch:{ all -> 0x0942 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ all -> 0x0942 }
            X.7lu r3 = (X.C160987lu) r3     // Catch:{ all -> 0x0942 }
            r3.flush()     // Catch:{ all -> 0x0942 }
            X.6ED r3 = r2.A05     // Catch:{ all -> 0x0942 }
            java.util.Map r3 = r3.A01     // Catch:{ all -> 0x0942 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ all -> 0x0942 }
            X.7lu r3 = (X.C160987lu) r3     // Catch:{ all -> 0x0942 }
            if (r3 == 0) goto L_0x0823
            r3.BuB()     // Catch:{ all -> 0x0942 }
        L_0x0823:
            X.6ED r3 = r2.A05     // Catch:{ all -> 0x0942 }
            java.util.Map r3 = r3.A01     // Catch:{ all -> 0x0942 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ all -> 0x0942 }
            X.7lu r3 = (X.C160987lu) r3     // Catch:{ all -> 0x0942 }
            if (r3 == 0) goto L_0x088f
            boolean r3 = r3.BLQ()     // Catch:{ all -> 0x0942 }
            if (r3 != 0) goto L_0x088f
            android.os.Trace.endSection()     // Catch:{ all -> 0x0942 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0942 }
            if (r8 != 0) goto L_0x088f
            goto L_0x07cb
        L_0x083e:
            java.lang.String r3 = "MediaTrackSegment is empty for first track"
            X.C131736Qi.A02(r11, r3)     // Catch:{ all -> 0x0942 }
            java.util.HashMap r3 = r5.A03(r9)     // Catch:{ all -> 0x0942 }
            if (r3 == 0) goto L_0x08a0
            java.util.HashMap r3 = r5.A03(r9)     // Catch:{ all -> 0x0942 }
            int r3 = r3.size()     // Catch:{ all -> 0x0942 }
            if (r3 <= r10) goto L_0x08a0
        L_0x0853:
            int r3 = android.os.Process.myTid()     // Catch:{ all -> 0x0942 }
            int r5 = android.os.Process.getThreadPriority(r3)     // Catch:{ all -> 0x0942 }
            X.6ED r3 = r2.A05     // Catch:{ all -> 0x0942 }
            X.6So r4 = r2.A0K     // Catch:{ all -> 0x0942 }
            java.util.Map r3 = r3.A01     // Catch:{ all -> 0x0942 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ all -> 0x0942 }
            X.7lu r3 = (X.C160987lu) r3     // Catch:{ all -> 0x0942 }
            if (r3 == 0) goto L_0x086c
            r3.BuN(r4, r5)     // Catch:{ all -> 0x0942 }
        L_0x086c:
            X.64W r9 = r2.A0N     // Catch:{ all -> 0x0942 }
            X.6Pc r8 = r2.A03     // Catch:{ all -> 0x0942 }
            X.6ED r5 = r2.A05     // Catch:{ all -> 0x0942 }
            X.7ip r4 = r2.A08     // Catch:{ all -> 0x0942 }
            X.6V3 r3 = new X.6V3     // Catch:{ all -> 0x0942 }
            r18 = r3
            r19 = r39
            r20 = r8
            r21 = r5
            r22 = r0
            r23 = r4
            r24 = r9
            r18.<init>(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0942 }
            r2.A06 = r3     // Catch:{ all -> 0x0942 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x0942 }
            r3.A02()     // Catch:{ all -> 0x0942 }
        L_0x088f:
            X.6ED r3 = r2.A05     // Catch:{ all -> 0x0942 }
            java.util.Map r3 = r3.A01     // Catch:{ all -> 0x0942 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ all -> 0x0942 }
            X.7lu r3 = (X.C160987lu) r3     // Catch:{ all -> 0x0942 }
            if (r3 == 0) goto L_0x0959
            r3.BxP()     // Catch:{ all -> 0x0942 }
            goto L_0x0959
        L_0x08a0:
            boolean r3 = r0.A0M     // Catch:{ all -> 0x0942 }
            if (r3 == 0) goto L_0x08cc
            java.util.HashMap r3 = r5.A03(r9)     // Catch:{ all -> 0x0942 }
            if (r3 == 0) goto L_0x08cc
            java.util.Iterator r14 = X.C36391kE.A10(r3)     // Catch:{ all -> 0x0942 }
        L_0x08ae:
            boolean r3 = r14.hasNext()     // Catch:{ all -> 0x0942 }
            if (r3 == 0) goto L_0x08cc
            java.lang.Object r3 = r14.next()     // Catch:{ all -> 0x0942 }
            X.6Eg r3 = (X.C128956Eg) r3     // Catch:{ all -> 0x0942 }
            java.util.List r11 = r3.A01     // Catch:{ all -> 0x0942 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0942 }
            r3.<init>(r11)     // Catch:{ all -> 0x0942 }
            java.util.ArrayList r3 = X.C36441kJ.A15(r11)     // Catch:{ all -> 0x0942 }
            int r3 = r3.size()     // Catch:{ all -> 0x0942 }
            if (r3 <= r10) goto L_0x08ae
            goto L_0x0853
        L_0x08cc:
            java.lang.Object r3 = r4.get(r8)     // Catch:{ all -> 0x0942 }
            X.6F1 r3 = (X.AnonymousClass6F1) r3     // Catch:{ all -> 0x0942 }
            boolean r3 = r3.A01()     // Catch:{ all -> 0x0942 }
            if (r3 != 0) goto L_0x0853
            goto L_0x073c
        L_0x08da:
            java.lang.String r3 = "image"
            boolean r3 = r15.startsWith(r3)     // Catch:{ all -> 0x0942 }
            if (r3 == 0) goto L_0x08eb
            X.6M6 r3 = r4.A02     // Catch:{ all -> 0x0942 }
            X.6n3 r4 = new X.6n3     // Catch:{ all -> 0x0942 }
            r4.<init>(r3, r0, r14)     // Catch:{ all -> 0x0942 }
            goto L_0x0774
        L_0x08eb:
            java.lang.String r3 = "video"
            boolean r3 = r15.startsWith(r3)     // Catch:{ all -> 0x0942 }
            if (r3 != 0) goto L_0x0903
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0942 }
            java.lang.String r3 = "Cannot create DemuxDecodeWrapper. No compatible mimeType : "
            java.lang.String r4 = X.AnonymousClass000.A0p(r3, r15, r4)     // Catch:{ all -> 0x0942 }
            X.5VN r3 = new X.5VN     // Catch:{ all -> 0x0942 }
            r3.<init>((java.lang.String) r4)     // Catch:{ all -> 0x0942 }
            throw r3     // Catch:{ all -> 0x0942 }
        L_0x0903:
            if (r5 == 0) goto L_0x0924
            java.util.List r3 = r5.A04(r9, r8)     // Catch:{ all -> 0x0942 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x0942 }
            java.lang.Object r3 = r3.get(r8)     // Catch:{ all -> 0x0942 }
            X.6F1 r3 = (X.AnonymousClass6F1) r3     // Catch:{ all -> 0x0942 }
            r18 = r4
            r19 = r20
            r20 = r3
            r21 = r0
            r22 = r14
            r23 = r26
            X.7lp r4 = r18.A00(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0942 }
            goto L_0x0774
        L_0x0924:
            X.5oZ r3 = r4.A06     // Catch:{ all -> 0x0942 }
            r23 = r3
            X.5Yj r3 = r4.A04     // Catch:{ all -> 0x0942 }
            r15 = r3
            X.7ez r3 = r4.A03     // Catch:{ all -> 0x0942 }
            X.5Yk r9 = r4.A05     // Catch:{ all -> 0x0942 }
            X.6n6 r4 = new X.6n6     // Catch:{ all -> 0x0942 }
            r18 = r4
            r19 = r3
            r21 = r15
            r22 = r9
            r24 = r0
            r25 = r14
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0942 }
            goto L_0x0774
        L_0x0942:
            r4 = move-exception
            X.7lp r3 = r2.A09     // Catch:{ all -> 0x0a11 }
            if (r3 == 0) goto L_0x094a
            r3.cancel()     // Catch:{ all -> 0x0a11 }
        L_0x094a:
            boolean r3 = r4 instanceof java.util.concurrent.ExecutionException     // Catch:{ all -> 0x0a11 }
            if (r3 == 0) goto L_0x0958
            java.lang.Throwable r3 = r4.getCause()     // Catch:{ all -> 0x0a11 }
            if (r3 == 0) goto L_0x0958
            java.lang.Throwable r4 = r4.getCause()     // Catch:{ all -> 0x0a11 }
        L_0x0958:
            throw r4     // Catch:{ all -> 0x0a11 }
        L_0x0959:
            X.6Pc r3 = r2.A03     // Catch:{ all -> 0x0a11 }
            r3.A0O = r10     // Catch:{ all -> 0x0a11 }
        L_0x095d:
            android.media.MediaFormat r3 = r2.A02     // Catch:{ all -> 0x0a11 }
            if (r3 == 0) goto L_0x0b1a
            X.6Pc r5 = r2.A03     // Catch:{ all -> 0x0a11 }
            r3 = 0
            r5.A06 = r3     // Catch:{ all -> 0x0a11 }
            r8 = 1
            r5.A0N = r8     // Catch:{ all -> 0x0a11 }
            X.6VP r4 = r2.A04     // Catch:{ all -> 0x0a11 }
            X.5TE r3 = X.AnonymousClass5TE.AUDIO     // Catch:{ all -> 0x0a11 }
            r4.A07(r3)     // Catch:{ all -> 0x0a11 }
            X.6ED r3 = r2.A05     // Catch:{ all -> 0x0a11 }
            java.util.Map r3 = r3.A02     // Catch:{ all -> 0x0a11 }
            java.lang.Object r4 = r3.get(r7)     // Catch:{ all -> 0x0a11 }
            X.6mu r4 = (X.C141246mu) r4     // Catch:{ all -> 0x0a11 }
            boolean r3 = r4.A05     // Catch:{ all -> 0x0a11 }
            if (r3 != 0) goto L_0x098a
            android.media.MediaFormat r3 = r2.A02     // Catch:{ all -> 0x0a11 }
            r4.A02 = r3     // Catch:{ all -> 0x0a11 }
            X.6Pc r3 = r2.A03     // Catch:{ all -> 0x0a11 }
            r3.A0J = r8     // Catch:{ all -> 0x0a11 }
            r4.start()     // Catch:{ all -> 0x0a11 }
        L_0x098a:
            X.6mp r5 = new X.6mp     // Catch:{ all -> 0x0a11 }
            r5.<init>()     // Catch:{ all -> 0x0a11 }
            boolean r3 = r40.Bsw()     // Catch:{ all -> 0x0a11 }
            if (r3 == 0) goto L_0x09b5
            X.6VP r3 = r2.A04     // Catch:{ all -> 0x0a11 }
            android.media.MediaFormat r3 = r3.A04()     // Catch:{ all -> 0x0a11 }
            X.C109675Ym.A00(r3, r5)     // Catch:{ all -> 0x0a11 }
            X.6ED r3 = r2.A05     // Catch:{ all -> 0x0a11 }
            java.util.Map r3 = r3.A02     // Catch:{ all -> 0x0a11 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ all -> 0x0a11 }
            X.6mu r3 = (X.C141246mu) r3     // Catch:{ all -> 0x0a11 }
            r3.BxZ(r5)     // Catch:{ Exception -> 0x09ac }
            goto L_0x09b5
        L_0x09ac:
            X.6Pc r11 = r2.A03     // Catch:{ all -> 0x0a11 }
            long r3 = r11.A06     // Catch:{ all -> 0x0a11 }
            r9 = 1
            long r3 = r3 + r9
            r11.A06 = r3     // Catch:{ all -> 0x0a11 }
        L_0x09b5:
            r12 = 1
        L_0x09b6:
            X.6VP r4 = r2.A04     // Catch:{ all -> 0x0a11 }
            java.nio.ByteBuffer r3 = r5.A00     // Catch:{ all -> 0x0a11 }
            int r20 = r4.A02(r3)     // Catch:{ all -> 0x0a11 }
            X.6VP r3 = r2.A04     // Catch:{ all -> 0x0a11 }
            long r3 = r3.A03()     // Catch:{ all -> 0x0a11 }
            if (r20 <= 0) goto L_0x0b1a
            X.6VP r9 = r2.A04     // Catch:{ all -> 0x0a11 }
            X.5i7 r9 = r9.A05     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x0a0e
            android.media.MediaExtractor r9 = r9.A00     // Catch:{ all -> 0x0a11 }
            int r23 = r9.getSampleFlags()     // Catch:{ all -> 0x0a11 }
        L_0x09d2:
            r19 = 0
            r18 = r5
            r21 = r3
            r18.BqJ(r19, r20, r21, r23)     // Catch:{ all -> 0x0a11 }
            if (r12 == 0) goto L_0x09e4
            X.6Pc r9 = r2.A03     // Catch:{ all -> 0x0a11 }
            r9.A02 = r3     // Catch:{ all -> 0x0a11 }
            r9.A0L = r8     // Catch:{ all -> 0x0a11 }
            r12 = 0
        L_0x09e4:
            X.6Pc r9 = r2.A03     // Catch:{ all -> 0x0a11 }
            r9.A04 = r3     // Catch:{ all -> 0x0a11 }
            X.6ED r3 = r2.A05     // Catch:{ all -> 0x0a11 }
            java.util.Map r3 = r3.A02     // Catch:{ all -> 0x0a11 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ all -> 0x0a11 }
            X.6mu r3 = (X.C141246mu) r3     // Catch:{ all -> 0x0a11 }
            r3.BxZ(r5)     // Catch:{ Exception -> 0x09f6 }
            goto L_0x09ff
        L_0x09f6:
            X.6Pc r11 = r2.A03     // Catch:{ all -> 0x0a11 }
            long r3 = r11.A06     // Catch:{ all -> 0x0a11 }
            r9 = 1
            long r3 = r3 + r9
            r11.A06 = r3     // Catch:{ all -> 0x0a11 }
        L_0x09ff:
            X.6Pc r11 = r2.A03     // Catch:{ all -> 0x0a11 }
            long r3 = r11.A07     // Catch:{ all -> 0x0a11 }
            r9 = 1
            long r3 = r3 + r9
            r11.A07 = r3     // Catch:{ all -> 0x0a11 }
            X.6VP r3 = r2.A04     // Catch:{ all -> 0x0a11 }
            r3.A08()     // Catch:{ all -> 0x0a11 }
            goto L_0x09b6
        L_0x0a0e:
            r23 = -1
            goto L_0x09d2
        L_0x0a11:
            r7 = move-exception
            r3 = r17
            X.AnonymousClass6MV.A00(r3, r7)     // Catch:{ all -> 0x0c88 }
            r5 = 1
            X.6Pc r4 = r2.A03     // Catch:{ all -> 0x0c8b }
            java.lang.String r3 = r7.getMessage()     // Catch:{ all -> 0x0c8b }
            r4.A0G = r3     // Catch:{ all -> 0x0c8b }
            java.lang.Throwable r3 = r7.getCause()     // Catch:{ all -> 0x0c8b }
            if (r3 == 0) goto L_0x0a32
            X.6Pc r4 = r2.A03     // Catch:{ all -> 0x0c8b }
            java.lang.Throwable r3 = r7.getCause()     // Catch:{ all -> 0x0c8b }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x0c8b }
            r4.A0I = r3     // Catch:{ all -> 0x0c8b }
        L_0x0a32:
            X.6Pc r4 = r2.A03     // Catch:{ all -> 0x0c8b }
            java.lang.String r3 = android.util.Log.getStackTraceString(r7)     // Catch:{ all -> 0x0c8b }
            r4.A0H = r3     // Catch:{ all -> 0x0c8b }
            goto L_0x0b3e
        L_0x0a3c:
            r3 = move-exception
            X.4re r7 = new X.4re     // Catch:{ all -> 0x0cc5 }
            r7.<init>(r3)     // Catch:{ all -> 0x0cc5 }
            goto L_0x0b3d
        L_0x0a44:
            r7 = 0
            if (r5 == 0) goto L_0x0a49
            goto L_0x0b44
        L_0x0a49:
            boolean r3 = r0.A0L     // Catch:{ all -> 0x0cc5 }
            r10 = 0
            if (r3 == 0) goto L_0x0c4b
        L_0x0a4e:
            r10 = 1
            java.lang.String r4 = "audio_stream-"
            java.lang.String r3 = ".mp4"
            java.io.File r3 = java.io.File.createTempFile(r4, r3, r9)     // Catch:{ all -> 0x0cc5 }
            r2.A0A = r3     // Catch:{ all -> 0x0cc5 }
            X.6Sq r12 = new X.6Sq     // Catch:{ all -> 0x0cc5 }
            r12.<init>()     // Catch:{ all -> 0x0cc5 }
            java.lang.Integer r3 = X.C112895ed.A00     // Catch:{ all -> 0x0cc5 }
            X.6IF r11 = new X.6IF     // Catch:{ all -> 0x0cc5 }
            r11.<init>()     // Catch:{ all -> 0x0cc5 }
            X.5TE r3 = X.AnonymousClass5TE.AUDIO     // Catch:{ all -> 0x0cc5 }
            java.util.HashMap r3 = r5.A03(r3)     // Catch:{ all -> 0x0cc5 }
            int r8 = r3.size()     // Catch:{ all -> 0x0cc5 }
            if (r8 <= 0) goto L_0x0a72
            r7 = 1
        L_0x0a72:
            java.lang.String r3 = "Must have 1 or more audio tracks to transcode audio."
            X.C131736Qi.A02(r7, r3)     // Catch:{ all -> 0x0cc5 }
            X.5sQ r4 = new X.5sQ     // Catch:{ all -> 0x0cc5 }
            r4.<init>(r8)     // Catch:{ all -> 0x0cc5 }
            r4.A00 = r11     // Catch:{ all -> 0x0cc5 }
            r4.A01 = r11     // Catch:{ all -> 0x0cc5 }
            X.5sR r3 = new X.5sR     // Catch:{ all -> 0x0cc5 }
            r3.<init>(r4)     // Catch:{ all -> 0x0cc5 }
            int r8 = r3.A00     // Catch:{ all -> 0x0cc5 }
            boolean[] r3 = new boolean[r8]     // Catch:{ all -> 0x0cc5 }
            r12.A03 = r3     // Catch:{ all -> 0x0cc5 }
            java.util.List[] r7 = new java.util.List[r8]     // Catch:{ all -> 0x0cc5 }
            r12.A02 = r7     // Catch:{ all -> 0x0cc5 }
            r4 = 0
        L_0x0a90:
            if (r4 >= r8) goto L_0x0a9b
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0cc5 }
            r7[r4] = r3     // Catch:{ all -> 0x0cc5 }
            int r4 = r4 + 1
            goto L_0x0a90
        L_0x0a9b:
            r3 = 4096(0x1000, float:5.74E-42)
            r12.A00 = r3     // Catch:{ all -> 0x0cc5 }
            X.75M r8 = new X.75M     // Catch:{ all -> 0x0cc5 }
            r8.<init>()     // Catch:{ all -> 0x0cc5 }
            r7 = 0
            java.lang.String r4 = "VIDEO_TRANSCODER"
            r3 = 2
            java.util.concurrent.ThreadPoolExecutor r25 = X.C129246Ga.A00(r4, r8, r3, r7)     // Catch:{ all -> 0x0cc5 }
            X.6Pc r13 = r2.A03     // Catch:{ all -> 0x0cc5 }
            X.7ez r11 = r2.A0F     // Catch:{ all -> 0x0cc5 }
            X.7io r8 = r2.A0I     // Catch:{ all -> 0x0cc5 }
            X.5uP r3 = new X.5uP     // Catch:{ all -> 0x0cc5 }
            r3.<init>()     // Catch:{ all -> 0x0cc5 }
            r3.A00 = r10     // Catch:{ all -> 0x0cc5 }
            boolean r7 = r3.A03     // Catch:{ all -> 0x0cc5 }
            java.util.Map r3 = r3.A02     // Catch:{ all -> 0x0cc5 }
            X.5oY r4 = new X.5oY     // Catch:{ all -> 0x0cc5 }
            r4.<init>(r3, r7)     // Catch:{ all -> 0x0cc5 }
            java.io.File r3 = r2.A0A     // Catch:{ all -> 0x0cc5 }
            java.lang.String r24 = r3.getPath()     // Catch:{ all -> 0x0cc5 }
            android.content.Context r3 = r2.A0C     // Catch:{ all -> 0x0cc5 }
            X.5sP r7 = new X.5sP     // Catch:{ all -> 0x0cc5 }
            r17 = r7
            r18 = r3
            r19 = r11
            r20 = r13
            r21 = r8
            r22 = r4
            r23 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0cc5 }
            X.64W r8 = r2.A0N     // Catch:{ all -> 0x0cc5 }
            X.6V3 r4 = r2.A06     // Catch:{ all -> 0x0cc5 }
            X.67h r3 = new X.67h     // Catch:{ all -> 0x0cc5 }
            r3.<init>(r7, r12, r4, r0)     // Catch:{ all -> 0x0cc5 }
            X.6XM r7 = new X.6XM     // Catch:{ all -> 0x0cc5 }
            r7.<init>(r3, r11, r0, r8)     // Catch:{ all -> 0x0cc5 }
            android.os.Handler r4 = r7.A0D     // Catch:{ all -> 0x0cc5 }
            r3 = 3
            X.C90514aH.A1I(r4, r3)     // Catch:{ all -> 0x0cc5 }
            X.C90514aH.A1I(r4, r10)     // Catch:{ all -> 0x0cc5 }
            X.67h r3 = r7.A0E     // Catch:{ all -> 0x0b03 }
            X.5sP r3 = r3.A01     // Catch:{ all -> 0x0b03 }
            X.6n7 r3 = r3.A02     // Catch:{ all -> 0x0b03 }
            r3.BxP()     // Catch:{ all -> 0x0b03 }
            r3 = 5
            X.C90514aH.A1I(r4, r3)     // Catch:{ all -> 0x0b03 }
            goto L_0x0c4b
        L_0x0b03:
            r7 = move-exception
            java.lang.String r6 = "audio transcode pipeline err"
            java.util.List r3 = X.AnonymousClass6YR.A00     // Catch:{ all -> 0x0cc5 }
            java.lang.Class<X.5zN> r5 = X.C125135zN.class
            boolean r3 = X.C90484aE.A1P()     // Catch:{ all -> 0x0cc5 }
            if (r3 == 0) goto L_0x0b3d
            X.7m1 r4 = X.AnonymousClass6YR.A01     // Catch:{ all -> 0x0cc5 }
            java.lang.String r3 = r5.getSimpleName()     // Catch:{ all -> 0x0cc5 }
            r4.B6J(r3, r6, r7)     // Catch:{ all -> 0x0cc5 }
            goto L_0x0b3d
        L_0x0b1a:
            boolean r3 = r2.A0Q     // Catch:{ all -> 0x0cc5 }
            if (r3 != 0) goto L_0x0b3e
            X.6ED r3 = r2.A05     // Catch:{ all -> 0x0cc5 }
            r3.A01()     // Catch:{ all -> 0x0cc5 }
        L_0x0b23:
            r3 = r17
            java.lang.Throwable r3 = r3.A01     // Catch:{ all -> 0x0cc5 }
            if (r3 != 0) goto L_0x0b78
            android.os.Trace.endSection()     // Catch:{ all -> 0x0cc5 }
            boolean r3 = r2.A0Q     // Catch:{ all -> 0x0cc5 }
            if (r3 != 0) goto L_0x0c9e
            X.6ED r3 = r2.A05     // Catch:{ all -> 0x0cc5 }
            boolean r3 = r3.A03     // Catch:{ all -> 0x0cc5 }
            if (r3 != 0) goto L_0x0c9e
            java.lang.String r3 = "Last segment is not produced"
            X.5VN r7 = new X.5VN     // Catch:{ all -> 0x0cc5 }
            r7.<init>((java.lang.String) r3)     // Catch:{ all -> 0x0cc5 }
        L_0x0b3d:
            throw r7     // Catch:{ all -> 0x0cc5 }
        L_0x0b3e:
            X.6ED r3 = r2.A05     // Catch:{ all -> 0x0cc5 }
            r3.A00()     // Catch:{ all -> 0x0cc5 }
            goto L_0x0b23
        L_0x0b44:
            X.5TE r12 = X.AnonymousClass5TE.AUDIO     // Catch:{ all -> 0x0cc5 }
            X.AnonymousClass6U7.A03(r12, r5)     // Catch:{ all -> 0x0cc5 }
            java.util.HashMap r3 = r5.A02     // Catch:{ all -> 0x0cc5 }
            java.lang.Object r3 = r3.get(r12)     // Catch:{ all -> 0x0cc5 }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x0cc5 }
            if (r3 == 0) goto L_0x0b79
            java.util.Iterator r8 = X.C36371kC.A10(r3)     // Catch:{ all -> 0x0cc5 }
        L_0x0b57:
            boolean r3 = r8.hasNext()     // Catch:{ all -> 0x0cc5 }
            if (r3 == 0) goto L_0x0b79
            java.lang.Object r3 = X.C36351kA.A0u(r8)     // Catch:{ all -> 0x0cc5 }
            X.6Eg r3 = (X.C128956Eg) r3     // Catch:{ all -> 0x0cc5 }
            java.util.List r3 = r3.A04     // Catch:{ all -> 0x0cc5 }
            java.util.Iterator r4 = X.C90474aD.A0r(r3)     // Catch:{ all -> 0x0cc5 }
            boolean r3 = r4.hasNext()     // Catch:{ all -> 0x0cc5 }
            if (r3 == 0) goto L_0x0b57
            r4.next()     // Catch:{ all -> 0x0cc5 }
            java.lang.String r3 = "getSpeed"
            java.lang.NullPointerException r3 = X.AnonymousClass001.A0A(r3)     // Catch:{ all -> 0x0cc5 }
        L_0x0b78:
            throw r3     // Catch:{ all -> 0x0cc5 }
        L_0x0b79:
            X.7ez r8 = r2.A0F     // Catch:{ all -> 0x0cc5 }
            java.util.HashMap r3 = r5.A03(r12)     // Catch:{ IOException -> 0x0a4e }
            java.util.Collection r3 = r3.values()     // Catch:{ IOException -> 0x0a4e }
            java.util.ArrayList r10 = X.C36441kJ.A15(r3)     // Catch:{ IOException -> 0x0a4e }
            r4 = 5
            X.7qx r3 = new X.7qx     // Catch:{ IOException -> 0x0a4e }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0a4e }
            java.util.Collections.sort(r10, r3)     // Catch:{ IOException -> 0x0a4e }
            java.util.Iterator r15 = r10.iterator()     // Catch:{ IOException -> 0x0a4e }
            r17 = -1
            r13 = -1
        L_0x0b98:
            boolean r3 = r15.hasNext()     // Catch:{ IOException -> 0x0a4e }
            if (r3 == 0) goto L_0x0bb8
            java.lang.Object r4 = r15.next()     // Catch:{ IOException -> 0x0a4e }
            X.6Eg r4 = (X.C128956Eg) r4     // Catch:{ IOException -> 0x0a4e }
            int r3 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r3 == 0) goto L_0x0bb0
            r10 = 0
            int r3 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x0bb0
            goto L_0x0a4e
        L_0x0bb0:
            r13 = 0
            long r3 = X.AnonymousClass6U7.A01(r8, r4)     // Catch:{ IOException -> 0x0a4e }
            long r13 = r13 + r3
            goto L_0x0b98
        L_0x0bb8:
            java.util.HashMap r17 = r5.A03(r12)     // Catch:{ all -> 0x0cc5 }
            if (r17 == 0) goto L_0x0a4e
            java.util.HashMap r3 = r5.A03(r12)     // Catch:{ all -> 0x0cc5 }
            if (r3 == 0) goto L_0x0bfa
            java.util.Iterator r15 = X.C36391kE.A10(r3)     // Catch:{ all -> 0x0cc5 }
        L_0x0bc8:
            boolean r3 = r15.hasNext()     // Catch:{ all -> 0x0cc5 }
            if (r3 == 0) goto L_0x0bfa
            java.lang.Object r3 = r15.next()     // Catch:{ all -> 0x0cc5 }
            X.6Eg r3 = (X.C128956Eg) r3     // Catch:{ all -> 0x0cc5 }
            java.util.List r3 = r3.A01     // Catch:{ all -> 0x0cc5 }
            java.util.Iterator r14 = X.C90474aD.A0r(r3)     // Catch:{ all -> 0x0cc5 }
        L_0x0bda:
            boolean r3 = r14.hasNext()     // Catch:{ all -> 0x0cc5 }
            if (r3 == 0) goto L_0x0bc8
            java.lang.Object r3 = r14.next()     // Catch:{ all -> 0x0cc5 }
            X.6F1 r3 = (X.AnonymousClass6F1) r3     // Catch:{ all -> 0x0cc5 }
            X.6F3 r8 = r3.A00     // Catch:{ all -> 0x0cc5 }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0cc5 }
            long r3 = r8.A01     // Catch:{ all -> 0x0cc5 }
            java.util.concurrent.TimeUnit r8 = r8.A02     // Catch:{ all -> 0x0cc5 }
            long r12 = r10.convert(r3, r8)     // Catch:{ all -> 0x0cc5 }
            r10 = 0
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x0bda
            goto L_0x0a4e
        L_0x0bfa:
            r10 = 0
            java.util.Iterator r13 = X.C36391kE.A10(r17)     // Catch:{ all -> 0x0cc5 }
            r12 = 1
        L_0x0c00:
            boolean r3 = r13.hasNext()     // Catch:{ all -> 0x0cc5 }
            if (r3 == 0) goto L_0x0a49
            java.lang.Object r3 = r13.next()     // Catch:{ all -> 0x0cc5 }
            X.6Eg r3 = (X.C128956Eg) r3     // Catch:{ all -> 0x0cc5 }
            java.util.List r3 = r3.A01     // Catch:{ all -> 0x0cc5 }
            java.util.Iterator r11 = X.C90474aD.A0r(r3)     // Catch:{ all -> 0x0cc5 }
        L_0x0c12:
            boolean r3 = r11.hasNext()     // Catch:{ all -> 0x0cc5 }
            if (r3 == 0) goto L_0x0c00
            java.lang.Object r3 = r11.next()     // Catch:{ all -> 0x0cc5 }
            X.6F1 r3 = (X.AnonymousClass6F1) r3     // Catch:{ all -> 0x0cc5 }
            java.io.File r3 = r3.A01     // Catch:{ IOException -> 0x0a4e }
            java.lang.String r3 = r3.getCanonicalPath()     // Catch:{ IOException -> 0x0a4e }
            if (r12 == 0) goto L_0x0c2c
            X.6K9 r10 = X.AnonymousClass6K9.A00(r3)     // Catch:{ IOException -> 0x0a4e }
            r12 = 0
            goto L_0x0c12
        L_0x0c2c:
            X.6K9 r8 = X.AnonymousClass6K9.A00(r3)     // Catch:{ IOException -> 0x0a4e }
            if (r10 == 0) goto L_0x0a4e
            if (r8 == 0) goto L_0x0a4e
            int r4 = r10.A00     // Catch:{ IOException -> 0x0a4e }
            int r3 = r8.A00     // Catch:{ IOException -> 0x0a4e }
            if (r4 != r3) goto L_0x0a4e
            int r4 = r10.A01     // Catch:{ IOException -> 0x0a4e }
            int r3 = r8.A01     // Catch:{ IOException -> 0x0a4e }
            if (r4 != r3) goto L_0x0a4e
            java.lang.String r4 = r10.A02     // Catch:{ IOException -> 0x0a4e }
            java.lang.String r3 = r8.A02     // Catch:{ IOException -> 0x0a4e }
            boolean r3 = android.text.TextUtils.equals(r4, r3)     // Catch:{ IOException -> 0x0a4e }
            if (r3 == 0) goto L_0x0a4e
            goto L_0x0c12
        L_0x0c4b:
            X.7ez r8 = r2.A0F     // Catch:{ all -> 0x0cc5 }
            X.5Yk r4 = r2.A0H     // Catch:{ all -> 0x0cc5 }
            X.65W r3 = r0.A07     // Catch:{ all -> 0x0cc5 }
            X.6VP r7 = new X.6VP     // Catch:{ all -> 0x0cc5 }
            r7.<init>(r8, r4, r3)     // Catch:{ all -> 0x0cc5 }
            r2.A04 = r7     // Catch:{ all -> 0x0cc5 }
            if (r10 == 0) goto L_0x0c61
            java.io.File r4 = r2.A0A     // Catch:{ all -> 0x0cc5 }
            boolean r3 = X.AnonymousClass000.A1V(r4)
            goto L_0x0c65
        L_0x0c61:
            X.C129266Gc.A01(r7, r0)     // Catch:{ all -> 0x0cc5 }
            goto L_0x0c6a
        L_0x0c65:
            X.C131736Qi.A02(r3, r9)     // Catch:{ all -> 0x0cc5 }
            r7.A06 = r4     // Catch:{ all -> 0x0cc5 }
        L_0x0c6a:
            X.6VP r3 = r2.A04     // Catch:{ all -> 0x0cc5 }
            X.5TE r4 = X.AnonymousClass5TE.AUDIO     // Catch:{ all -> 0x0cc5 }
            r3.A07(r4)     // Catch:{ all -> 0x0cc5 }
            X.6VP r3 = r2.A04     // Catch:{ all -> 0x0cc5 }
            X.AnonymousClass6VP.A01(r3)     // Catch:{ all -> 0x0cc5 }
            java.util.HashMap r3 = r3.A07     // Catch:{ all -> 0x0cc5 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ all -> 0x0cc5 }
            if (r3 == 0) goto L_0x04f6
            X.6VP r3 = r2.A04     // Catch:{ all -> 0x0cc5 }
            android.media.MediaFormat r3 = r3.A04()     // Catch:{ all -> 0x0cc5 }
            r2.A02 = r3     // Catch:{ all -> 0x0cc5 }
            goto L_0x04f6
        L_0x0c88:
            r4 = move-exception
            r5 = 0
            goto L_0x0c8c
        L_0x0c8b:
            r4 = move-exception
        L_0x0c8c:
            boolean r3 = r2.A0Q     // Catch:{ all -> 0x0cc5 }
            if (r3 != 0) goto L_0x0c98
            if (r5 != 0) goto L_0x0c98
            X.6ED r3 = r2.A05     // Catch:{ all -> 0x0cc5 }
            r3.A01()     // Catch:{ all -> 0x0cc5 }
            goto L_0x0c9d
        L_0x0c98:
            X.6ED r3 = r2.A05     // Catch:{ all -> 0x0cc5 }
            r3.A00()     // Catch:{ all -> 0x0cc5 }
        L_0x0c9d:
            throw r4     // Catch:{ all -> 0x0cc5 }
        L_0x0c9e:
            if (r6 == 0) goto L_0x0cae
            boolean r3 = r2.A0Q     // Catch:{ all -> 0x0cc5 }
            if (r3 == 0) goto L_0x0cb2
            X.6vk r4 = r6.A03     // Catch:{ all -> 0x0cc5 }
            r3 = 1
            r4.A0Y = r3     // Catch:{ all -> 0x0cc5 }
            java.io.File r3 = r6.A02     // Catch:{ all -> 0x0cc5 }
            X.AnonymousClass6YY.A0P(r3)     // Catch:{ all -> 0x0cc5 }
        L_0x0cae:
            android.os.Trace.endSection()     // Catch:{ all -> 0x0cc5 }
            goto L_0x0d16
        L_0x0cb2:
            X.6So r5 = r2.A0K     // Catch:{ all -> 0x0cc5 }
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5.A00(r3)     // Catch:{ all -> 0x0cc5 }
            int r4 = r6.A00     // Catch:{ all -> 0x0cc5 }
            int r3 = r6.A01     // Catch:{ all -> 0x0cc5 }
            if (r4 != r3) goto L_0x0cae
            java.io.File r3 = r6.A02     // Catch:{ all -> 0x0cc5 }
            X.AnonymousClass6YY.A0P(r3)     // Catch:{ all -> 0x0cc5 }
            goto L_0x0cae
        L_0x0cc5:
            r6 = move-exception
            boolean r3 = r6 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x0d2a }
            if (r3 == 0) goto L_0x0cde
            X.6Kh r4 = r0.A09     // Catch:{ all -> 0x0d2a }
            if (r4 == 0) goto L_0x0cd8
            X.6vk r3 = r4.A03     // Catch:{ all -> 0x0d2a }
            r0 = 1
            r3.A0Y = r0     // Catch:{ all -> 0x0d2a }
            java.io.File r0 = r4.A02     // Catch:{ all -> 0x0d2a }
            X.AnonymousClass6YY.A0P(r0)     // Catch:{ all -> 0x0d2a }
        L_0x0cd8:
            r0 = r16
            A00(r0, r2)     // Catch:{ Exception -> 0x0d31 }
            goto L_0x0d31
        L_0x0cde:
            boolean r0 = r6 instanceof X.AnonymousClass5VN     // Catch:{ all -> 0x0d2a }
            if (r0 == 0) goto L_0x0cef
            X.5VN r6 = (X.AnonymousClass5VN) r6     // Catch:{ all -> 0x0d2a }
        L_0x0ce4:
            java.lang.String r5 = "Exception"
            java.util.List r0 = X.AnonymousClass6YR.A00     // Catch:{ all -> 0x0d2a }
            java.lang.Class<X.5zN> r4 = X.C125135zN.class
            boolean r0 = X.C90484aE.A1P()     // Catch:{ all -> 0x0d2a }
            goto L_0x0d03
        L_0x0cef:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0d2a }
            java.lang.String r0 = "Failed to resize video ("
            X.C90474aD.A1K(r0, r3, r6)     // Catch:{ all -> 0x0d2a }
            java.lang.String r3 = X.C90474aD.A0f(r3)     // Catch:{ all -> 0x0d2a }
            X.5VN r0 = new X.5VN     // Catch:{ all -> 0x0d2a }
            r0.<init>(r3, r6)     // Catch:{ all -> 0x0d2a }
            r6 = r0
            goto L_0x0ce4
        L_0x0d03:
            if (r0 == 0) goto L_0x0d0e
            X.7m1 r3 = X.AnonymousClass6YR.A01     // Catch:{ all -> 0x0d2a }
            java.lang.String r0 = r4.getSimpleName()     // Catch:{ all -> 0x0d2a }
            r3.B6J(r0, r5, r6)     // Catch:{ all -> 0x0d2a }
        L_0x0d0e:
            r6.getMessage()     // Catch:{ all -> 0x0d2a }
            r0 = r16
            X.AnonymousClass6MV.A00(r0, r6)     // Catch:{ all -> 0x0d2a }
        L_0x0d16:
            r0 = r16
            A00(r0, r2)     // Catch:{ Exception -> 0x0d31 }
            java.lang.Throwable r3 = r0.A01     // Catch:{ Exception -> 0x0d31 }
            if (r3 == 0) goto L_0x0d31
            boolean r0 = r3 instanceof X.AnonymousClass5VN     // Catch:{ Exception -> 0x0d31 }
            if (r0 != 0) goto L_0x0d30
            X.5VN r0 = new X.5VN     // Catch:{ Exception -> 0x0d31 }
            r0.<init>((java.lang.Throwable) r3)     // Catch:{ Exception -> 0x0d31 }
            r3 = r0
            goto L_0x0d30
        L_0x0d2a:
            r3 = move-exception
            r0 = r16
            A00(r0, r2)     // Catch:{ Exception -> 0x0d31 }
        L_0x0d30:
            throw r3     // Catch:{ Exception -> 0x0d31 }
        L_0x0d31:
            java.lang.Object r1 = r1.A02
            X.6mk r1 = (X.C141146mk) r1
            java.util.concurrent.CountDownLatch r0 = r1.A00
            r0.countDown()
            r0 = 0
            r1.A01 = r0
            return
        L_0x0d3e:
            java.lang.Object r0 = r1.A01
            java.util.Iterator r8 = X.C90514aH.A13(r0)
        L_0x0d44:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0dea
            java.lang.Object r6 = r8.next()
            X.0X5 r6 = (X.AnonymousClass0X5) r6
            java.util.Set r0 = r6.A0N
            if (r0 == 0) goto L_0x0d44
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0d44
            java.lang.Object r4 = r1.A00
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r4 = (androidx.sharetarget.ShortcutInfoCompatSaverImpl) r4
            androidx.core.graphics.drawable.IconCompat r3 = r6.A0I
            r5 = 0
            if (r3 == 0) goto L_0x0d70
            int r2 = r3.A05()
            r0 = 1
            if (r2 == r0) goto L_0x0dda
            r0 = 2
            if (r2 == r0) goto L_0x0dca
            r0 = 5
            if (r2 == r0) goto L_0x0dda
        L_0x0d70:
            r7 = r5
            r3 = r5
        L_0x0d72:
            X.0Y4 r2 = new X.0Y4
            r2.<init>(r6)
            X.0X5 r0 = r2.A00
            r0.A0I = r5
            X.0X5 r0 = r2.A00()
            X.5ry r5 = new X.5ry
            r5.<init>(r0, r7, r3)
            androidx.core.graphics.drawable.IconCompat r0 = r6.A0I
            java.lang.String r3 = r5.A01
            if (r3 == 0) goto L_0x0dc8
            android.graphics.Bitmap r2 = r0.A06()
        L_0x0d8e:
            java.lang.String r7 = r6.A0M
            java.util.Map r0 = r4.A04
            r0.put(r7, r5)
            if (r2 == 0) goto L_0x0d44
            r0 = 4
            X.74l r6 = new X.74l
            r6.<init>(r4, r2, r3, r0)
            X.0GE r5 = new X.0GE
            r5.<init>()
            java.util.concurrent.ExecutorService r3 = r4.A06
            r2 = 2
            X.74w r0 = new X.74w
            r0.<init>(r4, r5, r6, r2)
            r3.submit(r0)
            java.util.Map r0 = r4.A03
            java.lang.Object r2 = r0.put(r7, r5)
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2
            if (r2 == 0) goto L_0x0dbb
            r0 = 0
            r2.cancel(r0)
        L_0x0dbb:
            r0 = 3
            X.74l r2 = new X.74l
            r2.<init>(r1, r5, r7, r0)
            java.util.concurrent.ExecutorService r0 = r4.A05
            r5.B0P(r2, r0)
            goto L_0x0d44
        L_0x0dc8:
            r2 = 0
            goto L_0x0d8e
        L_0x0dca:
            android.content.Context r0 = r4.A00
            android.content.res.Resources r2 = r0.getResources()
            int r0 = r3.A04()
            java.lang.String r7 = r2.getResourceName(r0)
            r3 = r5
            goto L_0x0d72
        L_0x0dda:
            java.io.File r2 = r4.A01
            java.lang.String r0 = X.C36361kB.A0l()
            java.io.File r0 = X.C36441kJ.A0w(r2, r0)
            java.lang.String r3 = r0.getAbsolutePath()
            r7 = r5
            goto L_0x0d72
        L_0x0dea:
            java.lang.Object r2 = r1.A00
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r2 = (androidx.sharetarget.ShortcutInfoCompatSaverImpl) r2
            java.lang.Object r0 = r1.A02
            X.0GE r0 = (X.AnonymousClass0GE) r0
            r2.A03(r0)
            return
        L_0x0df6:
            java.lang.Object r0 = r1.A01
            X.6VR r0 = (X.AnonymousClass6VR) r0
            X.6im r3 = r0.A03
            java.lang.Object r2 = r1.A02
            X.5hI r2 = (X.C114465hI) r2
            java.lang.Object r0 = r1.A00
            X.5s1 r0 = (X.C120755s1) r0
            r3.A04(r0, r2)
            return
        L_0x0e08:
            java.lang.Object r4 = r1.A01
            X.6lc r4 = (X.C140456lc) r4
            java.lang.Object r3 = r1.A02
            X.7ku r3 = (X.C160377ku) r3
            X.68b r2 = X.C1273868b.A00()
            java.lang.Object r1 = r1.A00
            X.67i r1 = (X.C1271967i) r1
            r0 = 0
            r2.A09(r1, r0)
            X.C1273868b.A06(r1, r4, r2, r3)
            return
        L_0x0e20:
            java.lang.Object r4 = r1.A01
            X.4vP r4 = (X.C100674vP) r4
            java.lang.Object r3 = r1.A02
            X.7ku r3 = (X.C160377ku) r3
            X.68b r2 = X.C1273868b.A00()
            java.lang.Object r1 = r1.A00
            r0 = 0
            r2.A0A(r1, r0)
            X.C1273868b.A07(r4, r2, r3)
            return
        L_0x0e36:
            java.lang.Object r6 = r1.A00
            if (r6 != 0) goto L_0x0e7c
            r6 = 0
        L_0x0e3b:
            java.lang.Object r5 = r1.A01
            X.67i r5 = (X.C1271967i) r5
            X.6WZ r0 = X.C133266Xn.A01(r5)
            X.5xb r0 = r0.A04
            if (r0 != 0) goto L_0x0e79
            r0 = 0
        L_0x0e48:
            r4 = 0
            if (r0 == 0) goto L_0x0e67
            X.6lc r0 = X.C140456lc.A0C(r0, r6)
            if (r0 == 0) goto L_0x0e67
            android.view.View r3 = r0.A0V(r5)
            if (r3 != 0) goto L_0x0e88
            java.lang.String r2 = "AccessibilityUtils"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "No View found for component with id: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r6, r1)
        L_0x0e63:
            X.AnonymousClass6RS.A00(r5, r2, r0, r4)
            return
        L_0x0e67:
            java.lang.String r2 = "AccessibilityUtils"
            r1 = 1
            java.lang.Object[] r0 = X.C36431kI.A1Z(r6, r1)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = "Component does not exist in the hierarchy for id: %s. Is the component with this ID not yet rendered? If so, this will not work."
            java.lang.String r0 = X.C90504aG.A0m(r0, r1)
            goto L_0x0e63
        L_0x0e79:
            X.6lc r0 = r0.A02
            goto L_0x0e48
        L_0x0e7c:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L_0x0e83
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0e3b
        L_0x0e83:
            java.lang.String r6 = r6.toString()
            goto L_0x0e3b
        L_0x0e88:
            int r2 = r3.getId()
            r0 = -1
            if (r2 != r0) goto L_0x0e96
            int r2 = android.view.View.generateViewId()
            r3.setId(r2)
        L_0x0e96:
            java.lang.Object r0 = r1.A02
            android.view.View r0 = (android.view.View) r0
            X.AnonymousClass04F.A04(r0, r2)
            return
        L_0x0e9e:
            java.lang.Object r4 = r1.A01
            X.7lf r4 = (X.C160837lf) r4
            java.lang.Object r0 = r1.A00
            X.9lP r0 = (X.C202249lP) r0
            int r3 = r0.A00
            X.9WT r2 = r0.A01
            java.lang.Object r0 = r1.A02
            X.9NR r0 = (X.AnonymousClass9NR) r0
            r4.BWA(r2, r0, r3)
            return
        L_0x0eb2:
            java.lang.Object r2 = r1.A02
            X.7ic r2 = (X.C159007ic) r2
            java.lang.Object r0 = r1.A01
            X.63o r0 = (X.C1263463o) r0
            X.5VK r0 = r0.A00()
            r2.BXI(r0)
            return
        L_0x0ec2:
            java.lang.Object r3 = r1.A00
            X.6Xw r3 = (X.C133326Xw) r3
            java.lang.Object r7 = r1.A02
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r1.A01
            X.682 r6 = (X.AnonymousClass682) r6
            X.6SG r0 = r6.A07
            java.util.List r4 = java.util.Collections.singletonList(r0)
            java.lang.Object r2 = r3.A04
            monitor-enter(r2)
            monitor-enter(r6)     // Catch:{ all -> 0x0fe8 }
            boolean r0 = r6.A03     // Catch:{ all -> 0x0fe5 }
            monitor-exit(r6)     // Catch:{ all -> 0x0fe8 }
            if (r0 != 0) goto L_0x0fe3
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0fe8 }
            java.util.Iterator r12 = r7.iterator()     // Catch:{ all -> 0x0fe8 }
        L_0x0ee5:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0fe8 }
            if (r0 == 0) goto L_0x0fc4
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x0fe8 }
            X.6c3 r10 = (X.C135056c3) r10     // Catch:{ all -> 0x0fe8 }
            X.6W8 r8 = r3.A01     // Catch:{ all -> 0x0fe8 }
            X.6VA r0 = r10.A01     // Catch:{ all -> 0x0fe8 }
            java.lang.String r7 = r0.A0A     // Catch:{ all -> 0x0fe8 }
            java.util.Map r1 = r8.A03     // Catch:{ all -> 0x0fe8 }
            boolean r0 = r1.containsKey(r7)     // Catch:{ all -> 0x0fe8 }
            if (r0 == 0) goto L_0x0f16
            java.lang.Object r9 = r1.get(r7)     // Catch:{ all -> 0x0fe8 }
            X.679 r9 = (X.AnonymousClass679) r9     // Catch:{ all -> 0x0fe8 }
            if (r9 != 0) goto L_0x0f2a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0fe8 }
            java.lang.String r0 = "No InternalLoadRequest in mAssetIdToInternalLoadRequestMap for id: "
            r1.append(r0)     // Catch:{ all -> 0x0fe8 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r7, r1)     // Catch:{ all -> 0x0fe8 }
            goto L_0x0fe7
        L_0x0f16:
            boolean r0 = r1.containsKey(r7)     // Catch:{ all -> 0x0fe8 }
            if (r0 != 0) goto L_0x0fb6
            X.679 r9 = new X.679     // Catch:{ all -> 0x0fe8 }
            r9.<init>(r10)     // Catch:{ all -> 0x0fe8 }
            r1.put(r7, r9)     // Catch:{ all -> 0x0fe8 }
            X.AnonymousClass6W8.A02(r9, r8)     // Catch:{ all -> 0x0fe8 }
            r5.add(r9)     // Catch:{ all -> 0x0fe8 }
        L_0x0f2a:
            java.util.Map r7 = r8.A04     // Catch:{ all -> 0x0fe8 }
            boolean r0 = r7.containsKey(r6)     // Catch:{ all -> 0x0fe8 }
            X.AnonymousClass5YI.A00(r0)     // Catch:{ all -> 0x0fe8 }
            java.util.Map r1 = r8.A05     // Catch:{ all -> 0x0fe8 }
            boolean r0 = r1.containsKey(r9)     // Catch:{ all -> 0x0fe8 }
            X.AnonymousClass5YI.A00(r0)     // Catch:{ all -> 0x0fe8 }
            java.util.List r11 = X.C90524aI.A0o(r6, r7)     // Catch:{ all -> 0x0fe8 }
            java.util.List r1 = X.C90524aI.A0o(r9, r1)     // Catch:{ all -> 0x0fe8 }
            boolean r0 = r1.contains(r6)     // Catch:{ all -> 0x0fe8 }
            r7 = 0
            java.lang.String r10 = "InternalStateManager"
            if (r0 == 0) goto L_0x0f69
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0fe8 }
            java.lang.String r0 = "ExternalLoadRequest already linked with InternalLoadRequest: "
            r1.append(r0)     // Catch:{ all -> 0x0fe8 }
            X.6c3 r0 = r9.A03     // Catch:{ all -> 0x0fe8 }
            X.6VA r0 = r0.A01     // Catch:{ all -> 0x0fe8 }
            java.lang.String r0 = r0.A0A     // Catch:{ all -> 0x0fe8 }
            java.lang.IllegalStateException r9 = X.AnonymousClass000.A0g(r0, r1)     // Catch:{ all -> 0x0fe8 }
            X.5ze r1 = r8.A01     // Catch:{ all -> 0x0fe8 }
            java.lang.String r0 = "External load request already linked"
        L_0x0f64:
            r1.A00(r10, r0, r9, r7)     // Catch:{ all -> 0x0fe8 }
            goto L_0x0ee5
        L_0x0f69:
            boolean r0 = r11.contains(r9)     // Catch:{ all -> 0x0fe8 }
            if (r0 == 0) goto L_0x0f87
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0fe8 }
            java.lang.String r0 = "InternalLoadRequest already linked with ExternalLoadRequest: "
            r1.append(r0)     // Catch:{ all -> 0x0fe8 }
            X.6c3 r0 = r9.A03     // Catch:{ all -> 0x0fe8 }
            X.6VA r0 = r0.A01     // Catch:{ all -> 0x0fe8 }
            java.lang.String r0 = r0.A0A     // Catch:{ all -> 0x0fe8 }
            java.lang.IllegalStateException r9 = X.AnonymousClass000.A0g(r0, r1)     // Catch:{ all -> 0x0fe8 }
            X.5ze r1 = r8.A01     // Catch:{ all -> 0x0fe8 }
            java.lang.String r0 = "Internal load request already linked"
            goto L_0x0f64
        L_0x0f87:
            r11.add(r9)     // Catch:{ all -> 0x0fe8 }
            r1.add(r6)     // Catch:{ all -> 0x0fe8 }
            boolean r0 = r6.A00()     // Catch:{ all -> 0x0fe8 }
            if (r0 == 0) goto L_0x0f9b
            int r0 = r9.A01     // Catch:{ all -> 0x0fe8 }
            int r0 = r0 + 1
            r9.A01 = r0     // Catch:{ all -> 0x0fe8 }
            goto L_0x0ee5
        L_0x0f9b:
            int r0 = r9.A00     // Catch:{ all -> 0x0fe8 }
            int r0 = r0 + 1
            r9.A00 = r0     // Catch:{ all -> 0x0fe8 }
            java.util.Map r1 = r8.A02     // Catch:{ all -> 0x0fe8 }
            X.6c3 r0 = r9.A03     // Catch:{ all -> 0x0fe8 }
            X.6VA r0 = r0.A01     // Catch:{ all -> 0x0fe8 }
            java.lang.String r0 = r0.A0A     // Catch:{ all -> 0x0fe8 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0fe8 }
            X.6MT r0 = (X.AnonymousClass6MT) r0     // Catch:{ all -> 0x0fe8 }
            if (r0 == 0) goto L_0x0ee5
            r0.A01(r7)     // Catch:{ all -> 0x0fe8 }
            goto L_0x0ee5
        L_0x0fb6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0fe8 }
            java.lang.String r0 = "mAssetIdToInternalLoadRequestMap already has InternalLoadRequest for id: "
            r1.append(r0)     // Catch:{ all -> 0x0fe8 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r7, r1)     // Catch:{ all -> 0x0fe8 }
            goto L_0x0fe7
        L_0x0fc4:
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x0fe8 }
            if (r0 != 0) goto L_0x0fe3
            monitor-exit(r2)     // Catch:{ all -> 0x0fe8 }
            boolean r0 = r6.A00()
            r2 = 1
            r0 = r0 ^ 1
            java.util.ArrayList r1 = X.C133326Xw.A03(r3, r4, r5, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0fdf
            X.C133326Xw.A03(r3, r4, r1, r2)
        L_0x0fdf:
            X.C133326Xw.A05(r3)
            return
        L_0x0fe3:
            monitor-exit(r2)     // Catch:{ all -> 0x0fe8 }
            return
        L_0x0fe5:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0fe8 }
        L_0x0fe7:
            throw r0     // Catch:{ all -> 0x0fe8 }
        L_0x0fe8:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0fe8 }
            throw r0
        L_0x0feb:
            java.lang.Object r0 = r1.A00
            X.62U r0 = (X.AnonymousClass62U) r0
            X.6Xw r5 = r0.A01
            java.lang.Object r9 = r1.A01
            X.6c3 r9 = (X.C135056c3) r9
            java.lang.Object r8 = r1.A02
            java.io.File r8 = (java.io.File) r8
            X.679 r6 = r0.A02
            X.1Ak r0 = X.C133326Xw.A01(r5, r6)
            java.util.ArrayList r7 = X.C36401kF.A0v(r0)
            java.util.Iterator r4 = r0.iterator()
            r3 = 0
            r2 = 0
        L_0x1009:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x1024
            java.lang.Object r1 = r4.next()
            X.682 r1 = (X.AnonymousClass682) r1
            X.6SG r0 = r1.A07
            r7.add(r0)
            if (r2 != 0) goto L_0x1009
            boolean r0 = r1.A00()
            if (r0 != 0) goto L_0x1009
            r2 = 1
            goto L_0x1009
        L_0x1024:
            X.6k0 r2 = new X.6k0
            r2.<init>(r5, r9, r7)
            X.6jy r1 = r5.A02
            X.6VA r0 = r9.A01
            java.io.File r0 = r1.BpG(r0, r2, r8)
            if (r0 == 0) goto L_0x1034
            r3 = 1
        L_0x1034:
            r7 = 0
            r4 = 0
            if (r3 != 0) goto L_0x104c
            X.63o r1 = new X.63o
            r1.<init>()
            X.5Ti r0 = X.C108395Ti.CACHE_PUT_FAILED
        L_0x103f:
            r1.A00 = r0
            X.5VK r0 = r1.A00()
            X.C133326Xw.A06(r5, r6, r4, r0, r7)
        L_0x1048:
            X.C133326Xw.A05(r5)
            return
        L_0x104c:
            java.lang.Object r8 = r5.A04
            monitor-enter(r8)
            X.1Ak r9 = X.C133326Xw.A01(r5, r6)     // Catch:{ all -> 0x10b4 }
            java.util.Iterator r1 = r9.iterator()     // Catch:{ all -> 0x10b4 }
        L_0x1057:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x10b4 }
            if (r0 == 0) goto L_0x106a
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x10b4 }
            X.682 r0 = (X.AnonymousClass682) r0     // Catch:{ all -> 0x10b4 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x10b4 }
            if (r0 != 0) goto L_0x1057
            goto L_0x106c
        L_0x106a:
            r0 = 0
            goto L_0x106d
        L_0x106c:
            r0 = 1
        L_0x106d:
            r3 = 1
            if (r0 != 0) goto L_0x1075
            X.C133326Xw.A06(r5, r6, r4, r4, r3)     // Catch:{ all -> 0x10b4 }
            monitor-exit(r8)     // Catch:{ all -> 0x10b4 }
            goto L_0x1048
        L_0x1075:
            java.util.ArrayList r2 = X.C36401kF.A0v(r9)     // Catch:{ all -> 0x10b4 }
            java.util.Iterator r1 = r9.iterator()     // Catch:{ all -> 0x10b4 }
        L_0x107d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x10b4 }
            if (r0 == 0) goto L_0x108f
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x10b4 }
            X.682 r0 = (X.AnonymousClass682) r0     // Catch:{ all -> 0x10b4 }
            X.6SG r0 = r0.A07     // Catch:{ all -> 0x10b4 }
            r2.add(r0)     // Catch:{ all -> 0x10b4 }
            goto L_0x107d
        L_0x108f:
            monitor-exit(r8)     // Catch:{ all -> 0x10b4 }
            java.util.List r0 = java.util.Collections.singletonList(r6)
            X.00I r0 = X.C133326Xw.A00(r5, r2, r0, r3)
            java.lang.Object r1 = r0.A00
            java.util.Map r1 = (java.util.Map) r1
            boolean r0 = r1.containsKey(r6)
            if (r0 != 0) goto L_0x10aa
            X.63o r1 = new X.63o
            r1.<init>()
            X.5Ti r0 = X.C108395Ti.CACHE_GET_AFTER_PUT_FAILED
            goto L_0x103f
        L_0x10aa:
            java.lang.Object r0 = r1.get(r6)
            X.5oE r0 = (X.AnonymousClass5oE) r0
            X.C133326Xw.A06(r5, r6, r0, r4, r3)
            goto L_0x1048
        L_0x10b4:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x10b4 }
            throw r0
        L_0x10b7:
            java.lang.Object r0 = r1.A00
            X.5wp r0 = (X.C123635wp) r0
            X.5kf r5 = r0.A01
            X.5hc r4 = new X.5hc
            r4.<init>(r1)
            X.5p3 r3 = r5.A00
            X.7hM r1 = r3.A01
            r2 = 0
            X.6GG r0 = new X.6GG
            r0.<init>(r3, r2)
            X.6uu r1 = r1.B3y(r0)
            X.6jd r0 = new X.6jd
            r0.<init>(r4, r5, r2)
            r1.Blp(r0)
            return
        L_0x10d9:
            java.lang.Object r3 = r1.A00
            X.9bE r3 = (X.C197159bE) r3
            java.lang.Object r2 = r1.A01
            X.9jv r2 = (X.C201589jv) r2
            java.lang.Object r0 = r1.A02
            X.A1t r0 = (X.C20979A1t) r0
            X.C197159bE.A00(r2, r3, r0)
            return
        L_0x10e9:
            java.lang.Object r3 = r1.A00
            X.7eh r3 = (X.C157797eh) r3
            java.lang.Object r2 = r1.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r0 = r1.A02
            android.graphics.Point r0 = (android.graphics.Point) r0
            r3.BYD(r0, r2)
            return
        L_0x10f9:
            java.lang.Object r3 = r1.A00
            X.9nm r3 = (X.C203319nm) r3
            java.lang.Object r2 = r1.A01
            X.9uf r2 = (X.C207169uf) r2
            java.lang.Object r0 = r1.A02
            com.facebook.exoplayer.monitor.VpsEventCallback r0 = (com.facebook.exoplayer.monitor.VpsEventCallback) r0
            X.C203319nm.A03(r0, r2, r3)
            return
        L_0x1109:
            java.lang.Object r3 = r1.A02
            X.9l0 r3 = (X.C202079l0) r3
            java.lang.Object r2 = r1.A00
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r0 = 0
            X.C202079l0.A00(r3, r2, r0)
            java.lang.Object r1 = r1.A01
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            X.5uR r0 = r3.A07
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A02
            int r0 = r0.get()
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r0 = r0 ^ 1
            X.C202079l0.A00(r3, r1, r0)
            X.6By r0 = r3.A06
            r0.A02(r2)
            r0.A02(r1)
            return
        L_0x1133:
            java.lang.Object r4 = r1.A02
            X.9eR r4 = (X.C198939eR) r4
            java.util.UUID r0 = X.C198939eR.A07     // Catch:{ all -> 0x1144 }
            android.bluetooth.BluetoothManager r3 = r4.A01     // Catch:{ all -> 0x1144 }
            android.content.Context r2 = r4.A02     // Catch:{ all -> 0x1144 }
            X.7tw r0 = r4.A03     // Catch:{ all -> 0x1144 }
            android.bluetooth.BluetoothGattServer r3 = r3.openGattServer(r2, r0)     // Catch:{ all -> 0x1144 }
            goto L_0x1149
        L_0x1144:
            r0 = move-exception
            X.03N r3 = X.C90524aI.A0t(r0)
        L_0x1149:
            java.lang.Object r2 = r1.A01
            X.02t r2 = (X.C006302t) r2
            java.lang.Object r1 = r1.A00
            X.03v r1 = (X.C009003v) r1
            java.lang.Throwable r0 = X.AnonymousClass0AK.A00(r3)
            if (r0 != 0) goto L_0x115f
            android.bluetooth.BluetoothGattServer r3 = (android.bluetooth.BluetoothGattServer) r3
            r4.A00 = r3
            r2.invoke(r4)
            return
        L_0x115f:
            r1.invoke(r4, r0)
            return
        L_0x1163:
            java.lang.Object r4 = r1.A02
            X.6a1 r4 = (X.C133806a1) r4
            r3 = 0
            r1 = 0
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x1187 }
            java.lang.String r0 = r4.A01     // Catch:{ RemoteException -> 0x1187 }
            r2.writeInterfaceToken(r0)     // Catch:{ RemoteException -> 0x1187 }
            r2.writeInt(r1)     // Catch:{ RemoteException -> 0x1187 }
            r2.writeByteArray(r3)     // Catch:{ RemoteException -> 0x1187 }
            android.os.IBinder r1 = r4.A00     // Catch:{ all -> 0x1182 }
            r0 = 1
            r1.transact(r0, r2, r3, r0)     // Catch:{ all -> 0x1182 }
            r2.recycle()     // Catch:{ RemoteException -> 0x1187 }
            return
        L_0x1182:
            r0 = move-exception
            r2.recycle()     // Catch:{ RemoteException -> 0x1187 }
            throw r0     // Catch:{ RemoteException -> 0x1187 }
        L_0x1187:
            r2 = move-exception
            java.lang.String r1 = "WearableLS"
            java.lang.String r0 = "Failed to send a response back"
            android.util.Log.e(r1, r0, r2)
            return
        L_0x1190:
            java.lang.Object r4 = r1.A00
            X.4ag r4 = (X.C90734ag) r4
            java.lang.Object r3 = r1.A01
            android.content.Intent r3 = (android.content.Intent) r3
            java.lang.Object r0 = r1.A02
            r17 = r0
            r0 = r17
            com.google.android.gms.tasks.TaskCompletionSource r0 = (com.google.android.gms.tasks.TaskCompletionSource) r0
            r17 = r0
            r16 = 0
            com.google.firebase.messaging.FirebaseMessagingService r4 = (com.google.firebase.messaging.FirebaseMessagingService) r4     // Catch:{ all -> 0x1a1f }
            java.lang.String r2 = r3.getAction()     // Catch:{ all -> 0x1a1f }
            java.lang.String r0 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x1a1f }
            java.lang.String r1 = "FirebaseMessaging"
            if (r0 != 0) goto L_0x11f6
            java.lang.String r0 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x1a1f }
            if (r0 != 0) goto L_0x11f6
            java.lang.String r0 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x1a1f }
            if (r0 == 0) goto L_0x11d1
            boolean r0 = com.google.firebase.messaging.FirebaseMessagingService.A02(r3)     // Catch:{ all -> 0x1a1f }
            if (r0 == 0) goto L_0x1a0f
            java.lang.String r0 = "_nd"
            com.google.firebase.messaging.FirebaseMessagingService.A01(r3, r0)     // Catch:{ all -> 0x1a1f }
            goto L_0x1a0f
        L_0x11d1:
            java.lang.String r0 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x1a1f }
            if (r0 == 0) goto L_0x11e7
            java.lang.String r0 = "token"
            r3.getStringExtra(r0)     // Catch:{ all -> 0x1a1f }
            boolean r0 = r4 instanceof com.whatsapp.push.GcmListenerService     // Catch:{ all -> 0x1a1f }
            if (r0 == 0) goto L_0x1a0f
            com.whatsapp.push.RegistrationIntentService.A03(r4)     // Catch:{ all -> 0x1a1f }
            goto L_0x1a0f
        L_0x11e7:
            java.lang.String r2 = "Unknown intent action: "
            java.lang.String r0 = r3.getAction()     // Catch:{ all -> 0x1a1f }
            java.lang.String r0 = X.C90464aC.A0c(r2, r0)     // Catch:{ all -> 0x1a1f }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x1a1f }
            goto L_0x1a0f
        L_0x11f6:
            java.lang.String r5 = "google.message_id"
            java.lang.String r9 = r3.getStringExtra(r5)     // Catch:{ all -> 0x1a1f }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x1a1f }
            if (r0 == 0) goto L_0x1226
            com.google.android.gms.tasks.Task r18 = com.google.android.gms.tasks.Tasks.forResult(r16)     // Catch:{ all -> 0x1a1f }
        L_0x1206:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x1a1f }
            r8 = 3
            if (r0 != 0) goto L_0x124e
            java.util.Queue r6 = com.google.firebase.messaging.FirebaseMessagingService.A00     // Catch:{ all -> 0x1a1f }
            boolean r0 = r6.contains(r9)     // Catch:{ all -> 0x1a1f }
            if (r0 == 0) goto L_0x1240
            boolean r0 = android.util.Log.isLoggable(r1, r8)     // Catch:{ all -> 0x1a1f }
            if (r0 == 0) goto L_0x19ed
            java.lang.String r0 = "Received duplicate message: "
            java.lang.String r0 = X.C90464aC.A0c(r0, r9)     // Catch:{ all -> 0x1a1f }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x1a1f }
            goto L_0x19ed
        L_0x1226:
            android.os.Bundle r7 = X.C36431kI.A0I(r5, r9)     // Catch:{ all -> 0x1a1f }
            X.6SA r6 = X.AnonymousClass6SA.A01(r4)     // Catch:{ all -> 0x1a1f }
            monitor-enter(r6)     // Catch:{ all -> 0x1a1f }
            int r2 = r6.A00     // Catch:{ all -> 0x1a17 }
            int r0 = r2 + 1
            r6.A00 = r0     // Catch:{ all -> 0x1a17 }
            monitor-exit(r6)     // Catch:{ all -> 0x1a1f }
            X.4tM r0 = new X.4tM     // Catch:{ all -> 0x1a1f }
            r0.<init>(r2, r7)     // Catch:{ all -> 0x1a1f }
            com.google.android.gms.tasks.zzw r18 = X.AnonymousClass6SA.A00(r0, r6)     // Catch:{ all -> 0x1a1f }
            goto L_0x1206
        L_0x1240:
            int r2 = r6.size()     // Catch:{ all -> 0x1a1f }
            r0 = 10
            if (r2 < r0) goto L_0x124b
            r6.remove()     // Catch:{ all -> 0x1a1f }
        L_0x124b:
            r6.add(r9)     // Catch:{ all -> 0x1a1f }
        L_0x124e:
            java.lang.String r7 = "message_type"
            java.lang.String r2 = r3.getStringExtra(r7)     // Catch:{ all -> 0x1a1f }
            java.lang.String r6 = "gcm"
            if (r2 != 0) goto L_0x1259
            r2 = r6
        L_0x1259:
            int r0 = r2.hashCode()     // Catch:{ all -> 0x1a1f }
            switch(r0) {
                case -2062414158: goto L_0x126b;
                case 102161: goto L_0x1285;
                case 814694033: goto L_0x12b5;
                case 814800675: goto L_0x12d5;
                default: goto L_0x1260;
            }     // Catch:{ all -> 0x1a1f }
        L_0x1260:
            java.lang.String r0 = "Received message with unknown type: "
            java.lang.String r0 = X.C90464aC.A0c(r0, r2)     // Catch:{ all -> 0x1a1f }
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x1a1f }
            goto L_0x19ed
        L_0x126b:
            java.lang.String r0 = "deleted_messages"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x1a1f }
            if (r0 == 0) goto L_0x1260
            boolean r0 = r4 instanceof com.whatsapp.push.GcmListenerService     // Catch:{ all -> 0x1a1f }
            if (r0 == 0) goto L_0x19ed
            com.whatsapp.push.GcmListenerService r4 = (com.whatsapp.push.GcmListenerService) r4     // Catch:{ all -> 0x1a1f }
            X.0u1 r0 = r4.A00     // Catch:{ all -> 0x1a1f }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x1a1f }
            X.6T0 r2 = (X.AnonymousClass6T0) r2     // Catch:{ all -> 0x1a1f }
            r37 = 0
            monitor-enter(r2)     // Catch:{ all -> 0x1a1f }
            goto L_0x12e2
        L_0x1285:
            boolean r0 = r2.equals(r6)     // Catch:{ all -> 0x1a1f }
            if (r0 == 0) goto L_0x1260
            boolean r0 = com.google.firebase.messaging.FirebaseMessagingService.A02(r3)     // Catch:{ all -> 0x1a1f }
            if (r0 == 0) goto L_0x1296
            java.lang.String r0 = "_nr"
            com.google.firebase.messaging.FirebaseMessagingService.A01(r3, r0)     // Catch:{ all -> 0x1a1f }
        L_0x1296:
            android.os.Bundle r2 = r3.getExtras()     // Catch:{ all -> 0x1a1f }
            if (r2 != 0) goto L_0x12a0
            android.os.Bundle r2 = X.AnonymousClass001.A07()     // Catch:{ all -> 0x1a1f }
        L_0x12a0:
            java.lang.String r0 = "androidx.contentpager.content.wakelockid"
            r2.remove(r0)     // Catch:{ all -> 0x1a1f }
            boolean r0 = X.C132436Tp.A02(r2)     // Catch:{ all -> 0x1a1f }
            if (r0 == 0) goto L_0x18c4
            X.6Tp r6 = new X.6Tp     // Catch:{ all -> 0x1a1f }
            r6.<init>(r2)     // Catch:{ all -> 0x1a1f }
            java.util.concurrent.ExecutorService r19 = java.util.concurrent.Executors.newSingleThreadExecutor()     // Catch:{ all -> 0x1a1f }
            goto L_0x1311
        L_0x12b5:
            java.lang.String r0 = "send_error"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x1a1f }
            if (r0 == 0) goto L_0x1260
            java.lang.String r0 = r3.getStringExtra(r5)     // Catch:{ all -> 0x1a1f }
            if (r0 != 0) goto L_0x12c8
            java.lang.String r0 = "message_id"
            r3.getStringExtra(r0)     // Catch:{ all -> 0x1a1f }
        L_0x12c8:
            java.lang.String r0 = "error"
            java.lang.String r2 = r3.getStringExtra(r0)     // Catch:{ all -> 0x1a1f }
            X.5Us r0 = new X.5Us     // Catch:{ all -> 0x1a1f }
            r0.<init>(r2)     // Catch:{ all -> 0x1a1f }
            goto L_0x19ed
        L_0x12d5:
            java.lang.String r0 = "send_event"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x1a1f }
            if (r0 == 0) goto L_0x1260
            r3.getStringExtra(r5)     // Catch:{ all -> 0x1a1f }
            goto L_0x19ed
        L_0x12e2:
            r21 = r16
            r22 = r16
            r23 = r16
            r24 = r16
            r25 = r16
            r26 = r16
            r27 = r16
            r28 = r16
            r29 = r16
            r30 = r16
            r31 = r16
            r32 = r16
            r33 = r16
            r34 = r16
            r35 = r16
            r36 = r16
            r38 = 0
            r19 = r2
            r20 = r16
            r19.A03(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x130e }
            monitor-exit(r2)     // Catch:{ all -> 0x1a1f }
            goto L_0x19ed
        L_0x130e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x1a1f }
            throw r0     // Catch:{ all -> 0x1a1f }
        L_0x1311:
            java.lang.String r0 = "gcm.n.noui"
            boolean r0 = r6.A07(r0)     // Catch:{ all -> 0x1a1a }
            if (r0 != 0) goto L_0x18b1
            java.lang.String r0 = "keyguard"
            java.lang.Object r0 = r4.getSystemService(r0)     // Catch:{ all -> 0x1a1a }
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0     // Catch:{ all -> 0x1a1a }
            boolean r0 = r0.inKeyguardRestrictedInputMode()     // Catch:{ all -> 0x1a1a }
            r5 = 0
            if (r0 != 0) goto L_0x1356
            int r10 = android.os.Process.myPid()     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r4.getSystemService(r0)     // Catch:{ all -> 0x1a1a }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ all -> 0x1a1a }
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch:{ all -> 0x1a1a }
            if (r0 == 0) goto L_0x1356
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x1a1a }
        L_0x133e:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x1a1a }
            if (r0 == 0) goto L_0x1356
            java.lang.Object r9 = r11.next()     // Catch:{ all -> 0x1a1a }
            android.app.ActivityManager$RunningAppProcessInfo r9 = (android.app.ActivityManager.RunningAppProcessInfo) r9     // Catch:{ all -> 0x1a1a }
            int r0 = r9.pid     // Catch:{ all -> 0x1a1a }
            if (r0 != r10) goto L_0x133e
            int r9 = r9.importance     // Catch:{ all -> 0x1a1a }
            r0 = 100
            if (r9 != r0) goto L_0x1356
            goto L_0x18b6
        L_0x1356:
            java.lang.String r0 = "gcm.n.image"
            java.lang.String r2 = r6.A06(r0)     // Catch:{ all -> 0x1a1a }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x1a1a }
            if (r0 != 0) goto L_0x1375
            java.net.URL r0 = X.C90524aI.A0j(r2)     // Catch:{ MalformedURLException -> 0x136c }
            X.71n r9 = new X.71n     // Catch:{ MalformedURLException -> 0x136c }
            r9.<init>(r0)     // Catch:{ MalformedURLException -> 0x136c }
            goto L_0x1378
        L_0x136c:
            java.lang.String r0 = "Not downloading image, bad URL: "
            java.lang.String r0 = X.C90464aC.A0c(r0, r2)     // Catch:{ all -> 0x1a1a }
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x1a1a }
        L_0x1375:
            r9 = r16
            goto L_0x1385
        L_0x1378:
            X.76h r2 = new X.76h     // Catch:{ all -> 0x1a1a }
            r2.<init>(r9)     // Catch:{ all -> 0x1a1a }
            r0 = r19
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.call(r0, r2)     // Catch:{ all -> 0x1a1a }
            r9.A00 = r0     // Catch:{ all -> 0x1a1a }
        L_0x1385:
            java.util.concurrent.atomic.AtomicInteger r0 = X.AnonymousClass6UQ.A00     // Catch:{ all -> 0x1a1a }
            android.content.pm.PackageManager r3 = r4.getPackageManager()     // Catch:{ all -> 0x1a1a }
            java.lang.String r2 = r4.getPackageName()     // Catch:{ all -> 0x1a1a }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x139c }
            if (r0 == 0) goto L_0x13b4
            android.os.Bundle r14 = r0.metaData     // Catch:{ NameNotFoundException -> 0x139c }
            if (r14 == 0) goto L_0x13b4
            goto L_0x13b6
        L_0x139c:
            r0 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x1a1a }
            int r0 = X.C90474aD.A05(r3)     // Catch:{ all -> 0x1a1a }
            int r0 = r0 + 35
            java.lang.StringBuilder r2 = X.C90524aI.A0h(r0)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "Couldn't get own application info: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r2)     // Catch:{ all -> 0x1a1a }
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x1a1a }
        L_0x13b4:
            android.os.Bundle r14 = android.os.Bundle.EMPTY     // Catch:{ all -> 0x1a1a }
        L_0x13b6:
            java.lang.String r13 = r4.getPackageName()     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "gcm.n.android_channel_id"
            java.lang.String r0 = r6.A06(r0)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = X.AnonymousClass6UQ.A01(r4, r14, r0)     // Catch:{ all -> 0x1a1a }
            android.content.res.Resources r2 = r4.getResources()     // Catch:{ all -> 0x1a1a }
            android.content.pm.PackageManager r12 = r4.getPackageManager()     // Catch:{ all -> 0x1a1a }
            X.0Yy r11 = new X.0Yy     // Catch:{ all -> 0x1a1a }
            r11.<init>(r4, r0)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "gcm.n.title"
            java.lang.String r0 = r6.A05(r2, r13, r0)     // Catch:{ all -> 0x1a1a }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x1a1a }
            if (r3 == 0) goto L_0x1400
            android.content.pm.ApplicationInfo r0 = r12.getApplicationInfo(r13, r5)     // Catch:{ NameNotFoundException -> 0x13e6 }
            java.lang.CharSequence r0 = r0.loadLabel(r12)     // Catch:{ NameNotFoundException -> 0x13e6 }
            goto L_0x1400
        L_0x13e6:
            r0 = move-exception
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x1a1a }
            int r0 = X.C90474aD.A05(r7)     // Catch:{ all -> 0x1a1a }
            int r0 = r0 + 35
            java.lang.StringBuilder r3 = X.C90524aI.A0h(r0)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "Couldn't get own application info: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r7, r3)     // Catch:{ all -> 0x1a1a }
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = ""
        L_0x1400:
            r11.A0F(r0)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "gcm.n.body"
            java.lang.String r3 = r6.A05(r2, r13, r0)     // Catch:{ all -> 0x1a1a }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1a1a }
            if (r0 != 0) goto L_0x141d
            r11.A0E(r3)     // Catch:{ all -> 0x1a1a }
            androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle     // Catch:{ all -> 0x1a1a }
            r0.<init>()     // Catch:{ all -> 0x1a1a }
            r0.A0C(r3)     // Catch:{ all -> 0x1a1a }
            r11.A0C(r0)     // Catch:{ all -> 0x1a1a }
        L_0x141d:
            java.lang.String r0 = "gcm.n.icon"
            java.lang.String r3 = r6.A06(r0)     // Catch:{ all -> 0x1a1a }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1a1a }
            if (r0 != 0) goto L_0x14ac
            java.lang.String r0 = "drawable"
            int r10 = r2.getIdentifier(r3, r0, r13)     // Catch:{ all -> 0x1a1a }
            if (r10 == 0) goto L_0x1483
            boolean r0 = X.AnonymousClass6UQ.A02(r2, r10)     // Catch:{ all -> 0x1a1a }
            if (r0 == 0) goto L_0x1483
        L_0x1437:
            android.app.Notification r7 = r11.A0B     // Catch:{ all -> 0x1a1a }
            r7.icon = r10     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "gcm.n.sound2"
            java.lang.String r10 = r6.A06(r0)     // Catch:{ all -> 0x1a1a }
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x1a1a }
            if (r0 == 0) goto L_0x144d
            java.lang.String r0 = "gcm.n.sound"
            java.lang.String r10 = r6.A06(r0)     // Catch:{ all -> 0x1a1a }
        L_0x144d:
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x1a1a }
            r20 = 2
            r3 = 0
            if (r0 != 0) goto L_0x14ef
            java.lang.String r0 = "default"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x1a1a }
            if (r0 != 0) goto L_0x14e6
            java.lang.String r0 = "raw"
            int r0 = r2.getIdentifier(r10, r0, r13)     // Catch:{ all -> 0x1a1a }
            if (r0 == 0) goto L_0x14e6
            int r0 = X.C90474aD.A05(r13)     // Catch:{ all -> 0x1a1a }
            int r0 = r0 + 24
            java.lang.StringBuilder r2 = X.C90464aC.A0i(r10, r0)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "android.resource://"
            r2.append(r0)     // Catch:{ all -> 0x1a1a }
            r2.append(r13)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "/raw/"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r10, r2)     // Catch:{ all -> 0x1a1a }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x1a1a }
            goto L_0x14ea
        L_0x1483:
            java.lang.String r0 = "mipmap"
            int r10 = r2.getIdentifier(r3, r0, r13)     // Catch:{ all -> 0x1a1a }
            if (r10 == 0) goto L_0x1492
            boolean r0 = X.AnonymousClass6UQ.A02(r2, r10)     // Catch:{ all -> 0x1a1a }
            if (r0 == 0) goto L_0x1492
            goto L_0x1437
        L_0x1492:
            int r0 = X.C90474aD.A05(r3)     // Catch:{ all -> 0x1a1a }
            int r0 = r0 + 61
            java.lang.StringBuilder r7 = X.C90524aI.A0h(r0)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "Icon resource "
            r7.append(r0)     // Catch:{ all -> 0x1a1a }
            r7.append(r3)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = " not found. Notification will use default icon."
            r7.append(r0)     // Catch:{ all -> 0x1a1a }
            X.AnonymousClass000.A1A(r7, r1)     // Catch:{ all -> 0x1a1a }
        L_0x14ac:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_icon"
            int r10 = r14.getInt(r0, r5)     // Catch:{ all -> 0x1a1a }
            if (r10 == 0) goto L_0x14ba
            boolean r0 = X.AnonymousClass6UQ.A02(r2, r10)     // Catch:{ all -> 0x1a1a }
            if (r0 != 0) goto L_0x14db
        L_0x14ba:
            android.content.pm.ApplicationInfo r0 = r12.getApplicationInfo(r13, r5)     // Catch:{ NameNotFoundException -> 0x14c1 }
            int r10 = r0.icon     // Catch:{ NameNotFoundException -> 0x14c1 }
            goto L_0x14d9
        L_0x14c1:
            r0 = move-exception
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x1a1a }
            int r0 = X.C90474aD.A05(r7)     // Catch:{ all -> 0x1a1a }
            int r0 = r0 + 35
            java.lang.StringBuilder r3 = X.C90524aI.A0h(r0)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "Couldn't get own application info: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r7, r3)     // Catch:{ all -> 0x1a1a }
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x1a1a }
        L_0x14d9:
            if (r10 == 0) goto L_0x14e1
        L_0x14db:
            boolean r0 = X.AnonymousClass6UQ.A02(r2, r10)     // Catch:{ all -> 0x1a1a }
            if (r0 != 0) goto L_0x1437
        L_0x14e1:
            r10 = 17301651(0x1080093, float:2.4979667E-38)
            goto L_0x1437
        L_0x14e6:
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r20)     // Catch:{ all -> 0x1a1a }
        L_0x14ea:
            if (r0 == 0) goto L_0x14ef
            r11.A0B(r0)     // Catch:{ all -> 0x1a1a }
        L_0x14ef:
            java.lang.String r0 = "gcm.n.click_action"
            java.lang.String r2 = r6.A06(r0)     // Catch:{ all -> 0x1a1a }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x1a1a }
            if (r0 != 0) goto L_0x1545
            android.content.Intent r2 = X.C36441kJ.A0I(r2)     // Catch:{ all -> 0x1a1a }
            r2.setPackage(r13)     // Catch:{ all -> 0x1a1a }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.setFlags(r0)     // Catch:{ all -> 0x1a1a }
        L_0x1507:
            java.lang.String r10 = "google.c.a.e"
            if (r2 == 0) goto L_0x15a9
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r2.addFlags(r0)     // Catch:{ all -> 0x1a1a }
            android.os.Bundle r0 = r6.A00     // Catch:{ all -> 0x1a1a }
            android.os.Bundle r12 = new android.os.Bundle     // Catch:{ all -> 0x1a1a }
            r12.<init>(r0)     // Catch:{ all -> 0x1a1a }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x1a1a }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x1a1a }
        L_0x151f:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x1a1a }
            if (r0 == 0) goto L_0x157c
            java.lang.String r3 = X.AnonymousClass001.A0C(r13)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "google.c."
            boolean r0 = r3.startsWith(r0)     // Catch:{ all -> 0x1a1a }
            if (r0 != 0) goto L_0x1541
            java.lang.String r0 = "gcm.n."
            boolean r0 = r3.startsWith(r0)     // Catch:{ all -> 0x1a1a }
            if (r0 != 0) goto L_0x1541
            java.lang.String r0 = "gcm.notification."
            boolean r0 = r3.startsWith(r0)     // Catch:{ all -> 0x1a1a }
            if (r0 == 0) goto L_0x151f
        L_0x1541:
            r12.remove(r3)     // Catch:{ all -> 0x1a1a }
            goto L_0x151f
        L_0x1545:
            java.lang.String r0 = "gcm.n.link_android"
            java.lang.String r2 = r6.A06(r0)     // Catch:{ all -> 0x1a1a }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x1a1a }
            if (r0 == 0) goto L_0x1557
            java.lang.String r0 = "gcm.n.link"
            java.lang.String r2 = r6.A06(r0)     // Catch:{ all -> 0x1a1a }
        L_0x1557:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x1a1a }
            if (r0 != 0) goto L_0x1570
            android.net.Uri r0 = android.net.Uri.parse(r2)     // Catch:{ all -> 0x1a1a }
            if (r0 == 0) goto L_0x1570
            java.lang.String r2 = "android.intent.action.VIEW"
            android.content.Intent r2 = X.C36441kJ.A0I(r2)     // Catch:{ all -> 0x1a1a }
            r2.setPackage(r13)     // Catch:{ all -> 0x1a1a }
            r2.setData(r0)     // Catch:{ all -> 0x1a1a }
            goto L_0x1507
        L_0x1570:
            android.content.Intent r2 = r12.getLaunchIntentForPackage(r13)     // Catch:{ all -> 0x1a1a }
            if (r2 != 0) goto L_0x1507
            java.lang.String r0 = "No activity found to launch app"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x1a1a }
            goto L_0x1507
        L_0x157c:
            r2.putExtras(r12)     // Catch:{ all -> 0x1a1a }
            java.util.concurrent.atomic.AtomicInteger r0 = X.AnonymousClass6UQ.A00     // Catch:{ all -> 0x1a1a }
            int r3 = r0.incrementAndGet()     // Catch:{ all -> 0x1a1a }
            r0 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r3 = android.app.PendingIntent.getActivity(r4, r3, r2, r0)     // Catch:{ all -> 0x1a1a }
            boolean r0 = r6.A07(r10)     // Catch:{ all -> 0x1a1a }
            if (r0 == 0) goto L_0x15a9
            java.lang.String r0 = "com.google.firebase.messaging.NOTIFICATION_OPEN"
            android.content.Intent r2 = X.C36441kJ.A0I(r0)     // Catch:{ all -> 0x1a1a }
            android.os.Bundle r0 = r6.A03()     // Catch:{ all -> 0x1a1a }
            android.content.Intent r2 = r2.putExtras(r0)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "pending_intent"
            android.content.Intent r0 = r2.putExtra(r0, r3)     // Catch:{ all -> 0x1a1a }
            android.app.PendingIntent r3 = X.AnonymousClass6UQ.A00(r4, r0)     // Catch:{ all -> 0x1a1a }
        L_0x15a9:
            r11.A0D = r3     // Catch:{ all -> 0x1a1a }
            boolean r0 = r6.A07(r10)     // Catch:{ all -> 0x1a1a }
            if (r0 == 0) goto L_0x15c7
            java.lang.String r0 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            android.content.Intent r2 = X.C36441kJ.A0I(r0)     // Catch:{ all -> 0x1a1a }
            android.os.Bundle r0 = r6.A03()     // Catch:{ all -> 0x1a1a }
            android.content.Intent r0 = r2.putExtras(r0)     // Catch:{ all -> 0x1a1a }
            android.app.PendingIntent r0 = X.AnonymousClass6UQ.A00(r4, r0)     // Catch:{ all -> 0x1a1a }
            if (r0 == 0) goto L_0x15c7
            r7.deleteIntent = r0     // Catch:{ all -> 0x1a1a }
        L_0x15c7:
            java.lang.String r0 = "gcm.n.color"
            java.lang.String r3 = r6.A06(r0)     // Catch:{ all -> 0x1a1a }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1a1a }
            if (r0 != 0) goto L_0x15f6
            int r0 = android.graphics.Color.parseColor(r3)     // Catch:{ IllegalArgumentException -> 0x15dc }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x15dc }
            goto L_0x1606
        L_0x15dc:
            int r0 = X.C90474aD.A05(r3)     // Catch:{ all -> 0x1a1a }
            int r0 = r0 + 56
            java.lang.StringBuilder r2 = X.C90524aI.A0h(r0)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "Color is invalid: "
            r2.append(r0)     // Catch:{ all -> 0x1a1a }
            r2.append(r3)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = ". Notification will use default color."
            r2.append(r0)     // Catch:{ all -> 0x1a1a }
            X.AnonymousClass000.A1A(r2, r1)     // Catch:{ all -> 0x1a1a }
        L_0x15f6:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_color"
            int r0 = r14.getInt(r0, r5)     // Catch:{ all -> 0x1a1a }
            if (r0 == 0) goto L_0x1615
            int r0 = X.AnonymousClass00F.A00(r4, r0)     // Catch:{ NotFoundException -> 0x1609 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x1609 }
        L_0x1606:
            if (r0 == 0) goto L_0x1615
            goto L_0x160f
        L_0x1609:
            java.lang.String r0 = "Cannot find the color resource referenced in AndroidManifest."
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x1a1a }
            goto L_0x1615
        L_0x160f:
            int r0 = r0.intValue()     // Catch:{ all -> 0x1a1a }
            r11.A06 = r0     // Catch:{ all -> 0x1a1a }
        L_0x1615:
            java.lang.String r0 = "gcm.n.sticky"
            boolean r0 = r6.A07(r0)     // Catch:{ all -> 0x1a1a }
            r10 = 1
            r0 = r0 ^ 1
            r11.A0I(r0)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "gcm.n.local_only"
            boolean r0 = r6.A07(r0)     // Catch:{ all -> 0x1a1a }
            r11.A0V = r0     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "gcm.n.ticker"
            java.lang.String r0 = r6.A06(r0)     // Catch:{ all -> 0x1a1a }
            if (r0 == 0) goto L_0x1634
            r11.A0G(r0)     // Catch:{ all -> 0x1a1a }
        L_0x1634:
            java.lang.String r0 = "gcm.n.notification_priority"
            java.lang.Integer r3 = r6.A04(r0)     // Catch:{ all -> 0x1a1a }
            if (r3 == 0) goto L_0x1668
            int r2 = r3.intValue()     // Catch:{ all -> 0x1a1a }
            r0 = -2
            if (r2 < r0) goto L_0x1647
            r0 = 2
            if (r2 > r0) goto L_0x1647
            goto L_0x1666
        L_0x1647:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x1a1a }
            int r0 = X.C90474aD.A05(r3)     // Catch:{ all -> 0x1a1a }
            int r0 = r0 + 72
            java.lang.StringBuilder r2 = X.C90524aI.A0h(r0)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "notificationPriority is invalid "
            r2.append(r0)     // Catch:{ all -> 0x1a1a }
            r2.append(r3)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = ". Skipping setting notificationPriority."
            r2.append(r0)     // Catch:{ all -> 0x1a1a }
            X.AnonymousClass000.A1A(r2, r1)     // Catch:{ all -> 0x1a1a }
            goto L_0x1668
        L_0x1666:
            r11.A09 = r2     // Catch:{ all -> 0x1a1a }
        L_0x1668:
            java.lang.String r0 = "gcm.n.visibility"
            java.lang.Integer r3 = r6.A04(r0)     // Catch:{ all -> 0x1a1a }
            if (r3 == 0) goto L_0x169e
            int r2 = r3.intValue()     // Catch:{ all -> 0x1a1a }
            r0 = -1
            if (r2 < r0) goto L_0x167a
            if (r2 > r10) goto L_0x167a
            goto L_0x169c
        L_0x167a:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x1a1a }
            int r0 = X.C90474aD.A05(r3)     // Catch:{ all -> 0x1a1a }
            int r0 = r0 + 53
            java.lang.StringBuilder r2 = X.C90524aI.A0h(r0)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "visibility is invalid: "
            r2.append(r0)     // Catch:{ all -> 0x1a1a }
            r2.append(r3)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = ". Skipping setting visibility."
            java.lang.String r2 = X.AnonymousClass000.A0q(r0, r2)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "NotificationParams"
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x1a1a }
            goto L_0x169e
        L_0x169c:
            r11.A0A = r2     // Catch:{ all -> 0x1a1a }
        L_0x169e:
            java.lang.String r0 = "gcm.n.notification_count"
            java.lang.Integer r2 = r6.A04(r0)     // Catch:{ all -> 0x1a1a }
            if (r2 == 0) goto L_0x16ca
            int r0 = r2.intValue()     // Catch:{ all -> 0x1a1a }
            if (r0 >= 0) goto L_0x16d7
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x1a1a }
            int r0 = X.C90474aD.A05(r3)     // Catch:{ all -> 0x1a1a }
            int r0 = r0 + 67
            java.lang.StringBuilder r2 = X.C90524aI.A0h(r0)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "notificationCount is invalid: "
            r2.append(r0)     // Catch:{ all -> 0x1a1a }
            r2.append(r3)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = ". Skipping setting notificationCount."
            r2.append(r0)     // Catch:{ all -> 0x1a1a }
            X.AnonymousClass000.A1A(r2, r1)     // Catch:{ all -> 0x1a1a }
        L_0x16ca:
            java.lang.String r13 = "gcm.n.event_time"
            java.lang.String r12 = r6.A06(r13)     // Catch:{ all -> 0x1a1a }
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x1a1a }
            if (r0 != 0) goto L_0x171b
            goto L_0x16da
        L_0x16d7:
            r11.A08 = r0     // Catch:{ all -> 0x1a1a }
            goto L_0x16ca
        L_0x16da:
            long r2 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x16e5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ NumberFormatException -> 0x16e5 }
            if (r0 == 0) goto L_0x171b
            goto L_0x1718
        L_0x16e5:
            java.lang.String r0 = "gcm.n."
            boolean r0 = r13.startsWith(r0)     // Catch:{ all -> 0x1a1a }
            if (r0 == 0) goto L_0x16f2
            r0 = 6
            java.lang.String r13 = r13.substring(r0)     // Catch:{ all -> 0x1a1a }
        L_0x16f2:
            int r0 = X.C90474aD.A05(r13)     // Catch:{ all -> 0x1a1a }
            int r0 = r0 + 38
            java.lang.StringBuilder r2 = X.C90464aC.A0i(r12, r0)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "Couldn't parse value of "
            r2.append(r0)     // Catch:{ all -> 0x1a1a }
            r2.append(r13)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "("
            r2.append(r0)     // Catch:{ all -> 0x1a1a }
            r2.append(r12)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = ") into a long"
            java.lang.String r2 = X.AnonymousClass000.A0q(r0, r2)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "NotificationParams"
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x1a1a }
            goto L_0x171b
        L_0x1718:
            r11.A09(r2)     // Catch:{ all -> 0x1a1a }
        L_0x171b:
            java.lang.String r0 = "gcm.n.vibrate_timings"
            org.json.JSONArray r13 = X.C132436Tp.A01(r6, r0)     // Catch:{ all -> 0x1a1a }
            if (r13 == 0) goto L_0x1767
            int r0 = r13.length()     // Catch:{ NumberFormatException | JSONException -> 0x1743 }
            if (r0 <= r10) goto L_0x173b
            int r14 = r13.length()     // Catch:{ NumberFormatException | JSONException -> 0x1743 }
            long[] r12 = new long[r14]     // Catch:{ NumberFormatException | JSONException -> 0x1743 }
            r0 = 0
        L_0x1730:
            if (r0 >= r14) goto L_0x1765
            long r2 = r13.optLong(r0)     // Catch:{ NumberFormatException | JSONException -> 0x1743 }
            r12[r0] = r2     // Catch:{ NumberFormatException | JSONException -> 0x1743 }
            int r0 = r0 + 1
            goto L_0x1730
        L_0x173b:
            java.lang.String r2 = "vibrateTimings have invalid length"
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ NumberFormatException | JSONException -> 0x1743 }
            r0.<init>(r2)     // Catch:{ NumberFormatException | JSONException -> 0x1743 }
            throw r0     // Catch:{ NumberFormatException | JSONException -> 0x1743 }
        L_0x1743:
            java.lang.String r3 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x1a1a }
            int r0 = X.C90474aD.A05(r3)     // Catch:{ all -> 0x1a1a }
            int r0 = r0 + 74
            java.lang.StringBuilder r2 = X.C90524aI.A0h(r0)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "User defined vibrateTimings is invalid: "
            r2.append(r0)     // Catch:{ all -> 0x1a1a }
            r2.append(r3)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = ". Skipping setting vibrateTimings."
            java.lang.String r2 = X.AnonymousClass000.A0q(r0, r2)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "NotificationParams"
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x1a1a }
            goto L_0x1767
        L_0x1765:
            r7.vibrate = r12     // Catch:{ all -> 0x1a1a }
        L_0x1767:
            java.lang.String r13 = ". Skipping setting LightSettings"
            java.lang.String r14 = "LightSettings is invalid: "
            java.lang.String r12 = "NotificationParams"
            java.lang.String r0 = "gcm.n.light_settings"
            org.json.JSONArray r3 = X.C132436Tp.A01(r6, r0)     // Catch:{ all -> 0x1a1a }
            if (r3 == 0) goto L_0x17fb
            int[] r0 = new int[r8]     // Catch:{ all -> 0x1a1a }
            int r2 = r3.length()     // Catch:{ JSONException -> 0x17b8, IllegalArgumentException -> 0x17ce }
            if (r2 != r8) goto L_0x17b0
            java.lang.String r2 = r3.optString(r5)     // Catch:{ JSONException -> 0x17b8, IllegalArgumentException -> 0x17ce }
            int r15 = android.graphics.Color.parseColor(r2)     // Catch:{ JSONException -> 0x17b8, IllegalArgumentException -> 0x17ce }
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r15 == r2) goto L_0x17a9
            r0[r5] = r15     // Catch:{ JSONException -> 0x17b8, IllegalArgumentException -> 0x17ce }
            int r2 = r3.optInt(r10)     // Catch:{ JSONException -> 0x17b8, IllegalArgumentException -> 0x17ce }
            r0[r10] = r2     // Catch:{ JSONException -> 0x17b8, IllegalArgumentException -> 0x17ce }
            r2 = 2
            int r15 = r3.optInt(r2)     // Catch:{ JSONException -> 0x17b8, IllegalArgumentException -> 0x17ce }
            r0[r20] = r15     // Catch:{ JSONException -> 0x17b8, IllegalArgumentException -> 0x17ce }
            r2 = r0[r5]     // Catch:{ all -> 0x1a1a }
            r0 = r0[r10]     // Catch:{ all -> 0x1a1a }
            r7.ledARGB = r2     // Catch:{ all -> 0x1a1a }
            r7.ledOnMS = r0     // Catch:{ all -> 0x1a1a }
            r7.ledOffMS = r15     // Catch:{ all -> 0x1a1a }
            if (r0 == 0) goto L_0x17a7
            r2 = 1
            if (r15 != 0) goto L_0x17f4
        L_0x17a7:
            r2 = 0
            goto L_0x17f4
        L_0x17a9:
            java.lang.String r0 = "Transparent color is invalid"
            java.lang.IllegalArgumentException r2 = X.AnonymousClass001.A08(r0)     // Catch:{ JSONException -> 0x17b8, IllegalArgumentException -> 0x17ce }
            goto L_0x17b7
        L_0x17b0:
            java.lang.String r0 = "lightSettings don't have all three fields"
            org.json.JSONException r2 = new org.json.JSONException     // Catch:{ JSONException -> 0x17b8, IllegalArgumentException -> 0x17ce }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x17b8, IllegalArgumentException -> 0x17ce }
        L_0x17b7:
            throw r2     // Catch:{ JSONException -> 0x17b8, IllegalArgumentException -> 0x17ce }
        L_0x17b8:
            java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x1a1a }
            int r0 = X.C90474aD.A05(r2)     // Catch:{ all -> 0x1a1a }
            int r0 = r0 + 58
            java.lang.StringBuilder r0 = X.C90524aI.A0h(r0)     // Catch:{ all -> 0x1a1a }
            X.AnonymousClass000.A1D(r14, r2, r13, r0)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x1a1a }
            goto L_0x17f0
        L_0x17ce:
            r0 = move-exception
            java.lang.String r7 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x1a1a }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x1a1a }
            int r0 = X.C90474aD.A05(r7)     // Catch:{ all -> 0x1a1a }
            int r0 = r0 + 60
            java.lang.StringBuilder r2 = X.C90464aC.A0i(r3, r0)     // Catch:{ all -> 0x1a1a }
            r2.append(r14)     // Catch:{ all -> 0x1a1a }
            r2.append(r7)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = ". "
            X.AnonymousClass000.A1D(r0, r3, r13, r2)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x1a1a }
        L_0x17f0:
            android.util.Log.w(r12, r0)     // Catch:{ all -> 0x1a1a }
            goto L_0x17fb
        L_0x17f4:
            int r0 = r7.flags     // Catch:{ all -> 0x1a1a }
            r0 = r0 & -2
            r2 = r2 | r0
            r7.flags = r2     // Catch:{ all -> 0x1a1a }
        L_0x17fb:
            java.lang.String r0 = "gcm.n.default_sound"
            boolean r2 = r6.A07(r0)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "gcm.n.default_vibrate_timings"
            boolean r0 = r6.A07(r0)     // Catch:{ all -> 0x1a1a }
            if (r0 == 0) goto L_0x180b
            r2 = r2 | 2
        L_0x180b:
            java.lang.String r0 = "gcm.n.default_light_settings"
            boolean r0 = r6.A07(r0)     // Catch:{ all -> 0x1a1a }
            if (r0 == 0) goto L_0x1815
            r2 = r2 | 4
        L_0x1815:
            r11.A06(r2)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r2 = r6.A06(r0)     // Catch:{ all -> 0x1a1a }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x1a1a }
            if (r0 == 0) goto L_0x1834
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x1a1a }
            r0 = 37
            java.lang.StringBuilder r6 = X.C90524aI.A0h(r0)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "FCM-Notification:"
            java.lang.String r2 = X.C36381kD.A0z(r0, r6, r2)     // Catch:{ all -> 0x1a1a }
        L_0x1834:
            X.5oi r7 = new X.5oi     // Catch:{ all -> 0x1a1a }
            r7.<init>(r11, r2)     // Catch:{ all -> 0x1a1a }
            X.0Yy r6 = r7.A00     // Catch:{ all -> 0x1a1a }
            if (r9 == 0) goto L_0x1895
            com.google.android.gms.tasks.Task r11 = r9.A00     // Catch:{ ExecutionException -> 0x1870, InterruptedException -> 0x1864, TimeoutException -> 0x188d }
            X.AnonymousClass006.A01(r11)     // Catch:{ ExecutionException -> 0x1870, InterruptedException -> 0x1864, TimeoutException -> 0x188d }
            r2 = 5
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x1870, InterruptedException -> 0x1864, TimeoutException -> 0x188d }
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r11, r2, r0)     // Catch:{ ExecutionException -> 0x1870, InterruptedException -> 0x1864, TimeoutException -> 0x188d }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ ExecutionException -> 0x1870, InterruptedException -> 0x1864, TimeoutException -> 0x188d }
            r6.A0A(r0)     // Catch:{ ExecutionException -> 0x1870, InterruptedException -> 0x1864, TimeoutException -> 0x188d }
            androidx.core.app.NotificationCompat$BigPictureStyle r2 = new androidx.core.app.NotificationCompat$BigPictureStyle     // Catch:{ ExecutionException -> 0x1870, InterruptedException -> 0x1864, TimeoutException -> 0x188d }
            r2.<init>()     // Catch:{ ExecutionException -> 0x1870, InterruptedException -> 0x1864, TimeoutException -> 0x188d }
            if (r0 != 0) goto L_0x1858
            r0 = 0
            goto L_0x185c
        L_0x1858:
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.A03(r0)     // Catch:{ ExecutionException -> 0x1870, InterruptedException -> 0x1864, TimeoutException -> 0x188d }
        L_0x185c:
            r2.A00 = r0     // Catch:{ ExecutionException -> 0x1870, InterruptedException -> 0x1864, TimeoutException -> 0x188d }
            r2.A01 = r10     // Catch:{ ExecutionException -> 0x1870, InterruptedException -> 0x1864, TimeoutException -> 0x188d }
            r6.A0C(r2)     // Catch:{ ExecutionException -> 0x1870, InterruptedException -> 0x1864, TimeoutException -> 0x188d }
            goto L_0x1895
        L_0x1864:
            java.lang.String r0 = "Interrupted while downloading image, showing notification without it"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x1a1a }
            r9.close()     // Catch:{ all -> 0x1a1a }
            X.C90484aE.A0z()     // Catch:{ all -> 0x1a1a }
            goto L_0x1895
        L_0x1870:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x1a1a }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x1a1a }
            int r0 = X.C90474aD.A05(r3)     // Catch:{ all -> 0x1a1a }
            int r0 = r0 + 26
            java.lang.StringBuilder r2 = X.C90524aI.A0h(r0)     // Catch:{ all -> 0x1a1a }
            java.lang.String r0 = "Failed to download image: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r2)     // Catch:{ all -> 0x1a1a }
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x1a1a }
            goto L_0x1895
        L_0x188d:
            java.lang.String r0 = "Failed to download image in time, showing notification without it"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x1a1a }
            r9.close()     // Catch:{ all -> 0x1a1a }
        L_0x1895:
            boolean r0 = android.util.Log.isLoggable(r1, r8)     // Catch:{ all -> 0x1a1a }
            if (r0 == 0) goto L_0x18a0
            java.lang.String r0 = "Showing notification"
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x1a1a }
        L_0x18a0:
            java.lang.String r0 = "notification"
            java.lang.Object r3 = r4.getSystemService(r0)     // Catch:{ all -> 0x1a1a }
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3     // Catch:{ all -> 0x1a1a }
            java.lang.String r2 = r7.A01     // Catch:{ all -> 0x1a1a }
            android.app.Notification r0 = r6.A05()     // Catch:{ all -> 0x1a1a }
            r3.notify(r2, r5, r0)     // Catch:{ all -> 0x1a1a }
        L_0x18b1:
            r19.shutdown()     // Catch:{ all -> 0x1a1f }
            goto L_0x19ed
        L_0x18b6:
            r19.shutdown()     // Catch:{ all -> 0x1a1f }
            boolean r0 = com.google.firebase.messaging.FirebaseMessagingService.A02(r3)     // Catch:{ all -> 0x1a1f }
            if (r0 == 0) goto L_0x18c4
            java.lang.String r0 = "_nf"
            com.google.firebase.messaging.FirebaseMessagingService.A01(r3, r0)     // Catch:{ all -> 0x1a1f }
        L_0x18c4:
            X.4s0 r3 = new X.4s0     // Catch:{ all -> 0x1a1f }
            r3.<init>(r2)     // Catch:{ all -> 0x1a1f }
            boolean r0 = r4 instanceof com.whatsapp.push.GcmListenerService     // Catch:{ all -> 0x1a1f }
            if (r0 == 0) goto L_0x19ed
            com.whatsapp.push.GcmListenerService r4 = (com.whatsapp.push.GcmListenerService) r4     // Catch:{ all -> 0x1a1f }
            java.util.Map r0 = r3.A01     // Catch:{ all -> 0x1a1f }
            if (r0 != 0) goto L_0x1920
            android.os.Bundle r8 = r3.A00     // Catch:{ all -> 0x1a1f }
            X.008 r0 = new X.008     // Catch:{ all -> 0x1a1f }
            r0.<init>()     // Catch:{ all -> 0x1a1f }
            java.util.Set r2 = r8.keySet()     // Catch:{ all -> 0x1a1f }
            java.util.Iterator r9 = r2.iterator()     // Catch:{ all -> 0x1a1f }
        L_0x18e2:
            boolean r2 = r9.hasNext()     // Catch:{ all -> 0x1a1f }
            if (r2 == 0) goto L_0x191e
            java.lang.String r6 = X.AnonymousClass001.A0C(r9)     // Catch:{ all -> 0x1a1f }
            java.lang.Object r5 = r8.get(r6)     // Catch:{ all -> 0x1a1f }
            boolean r2 = r5 instanceof java.lang.String     // Catch:{ all -> 0x1a1f }
            if (r2 == 0) goto L_0x18e2
            java.lang.String r2 = "google."
            boolean r2 = r6.startsWith(r2)     // Catch:{ all -> 0x1a1f }
            if (r2 != 0) goto L_0x18e2
            java.lang.String r2 = "gcm."
            boolean r2 = r6.startsWith(r2)     // Catch:{ all -> 0x1a1f }
            if (r2 != 0) goto L_0x18e2
            java.lang.String r2 = "from"
            boolean r2 = r6.equals(r2)     // Catch:{ all -> 0x1a1f }
            if (r2 != 0) goto L_0x18e2
            boolean r2 = r6.equals(r7)     // Catch:{ all -> 0x1a1f }
            if (r2 != 0) goto L_0x18e2
            java.lang.String r2 = "collapse_key"
            boolean r2 = r6.equals(r2)     // Catch:{ all -> 0x1a1f }
            if (r2 != 0) goto L_0x18e2
            r0.put(r6, r5)     // Catch:{ all -> 0x1a1f }
            goto L_0x18e2
        L_0x191e:
            r3.A01 = r0     // Catch:{ all -> 0x1a1f }
        L_0x1920:
            X.0u1 r2 = r4.A00     // Catch:{ all -> 0x1a1f }
            java.lang.Object r7 = r2.get()     // Catch:{ all -> 0x1a1f }
            X.6T0 r7 = (X.AnonymousClass6T0) r7     // Catch:{ all -> 0x1a1f }
            java.lang.String r2 = "id"
            java.lang.String r22 = X.C36431kI.A1A(r2, r0)     // Catch:{ all -> 0x1a1f }
            java.lang.String r2 = "ip"
            java.lang.String r23 = X.C36431kI.A1A(r2, r0)     // Catch:{ all -> 0x1a1f }
            java.lang.String r2 = "cl_sess"
            java.lang.String r24 = X.C36431kI.A1A(r2, r0)     // Catch:{ all -> 0x1a1f }
            java.lang.String r2 = "mmsov"
            java.lang.String r25 = X.C36431kI.A1A(r2, r0)     // Catch:{ all -> 0x1a1f }
            java.lang.String r2 = "fbips"
            java.lang.String r26 = X.C36431kI.A1A(r2, r0)     // Catch:{ all -> 0x1a1f }
            java.lang.String r2 = "er_ri"
            java.lang.String r27 = X.C36431kI.A1A(r2, r0)     // Catch:{ all -> 0x1a1f }
            java.lang.String r2 = "notify"
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x1a1f }
            java.lang.String r5 = "1"
            boolean r38 = r5.equals(r2)     // Catch:{ all -> 0x1a1f }
            java.lang.String r2 = "push_id"
            java.lang.String r28 = X.C36431kI.A1A(r2, r0)     // Catch:{ all -> 0x1a1f }
            java.lang.String r2 = "push_event_id"
            java.lang.String r29 = X.C36431kI.A1A(r2, r0)     // Catch:{ all -> 0x1a1f }
            java.lang.String r2 = "push_ts"
            java.lang.String r30 = X.C36431kI.A1A(r2, r0)     // Catch:{ all -> 0x1a1f }
            android.os.Bundle r4 = r3.A00     // Catch:{ all -> 0x1a1f }
            java.lang.String r2 = "google.original_priority"
            java.lang.String r2 = r4.getString(r2)     // Catch:{ all -> 0x1a1f }
            if (r2 != 0) goto L_0x197a
            java.lang.String r2 = "google.priority"
            java.lang.String r2 = r4.getString(r2)     // Catch:{ all -> 0x1a1f }
        L_0x197a:
            java.lang.String r3 = "high"
            boolean r6 = r3.equals(r2)     // Catch:{ all -> 0x1a1f }
            if (r6 == 0) goto L_0x1984
            r6 = 1
            goto L_0x198e
        L_0x1984:
            java.lang.String r6 = "normal"
            boolean r2 = r6.equals(r2)     // Catch:{ all -> 0x1a1f }
            r6 = 0
            if (r2 == 0) goto L_0x198e
            r6 = 2
        L_0x198e:
            java.lang.Integer r20 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x1a1f }
            java.lang.String r2 = "google.delivered_priority"
            java.lang.String r2 = r4.getString(r2)     // Catch:{ all -> 0x1a1f }
            if (r2 != 0) goto L_0x19ac
            java.lang.String r2 = "google.priority_reduced"
            java.lang.String r2 = r4.getString(r2)     // Catch:{ all -> 0x1a1f }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x1a1f }
            if (r2 != 0) goto L_0x19bd
            java.lang.String r2 = "google.priority"
            java.lang.String r2 = r4.getString(r2)     // Catch:{ all -> 0x1a1f }
        L_0x19ac:
            boolean r3 = r3.equals(r2)     // Catch:{ all -> 0x1a1f }
            if (r3 == 0) goto L_0x19b4
            r3 = 1
            goto L_0x19be
        L_0x19b4:
            java.lang.String r3 = "normal"
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x1a1f }
            r3 = 0
            if (r2 == 0) goto L_0x19be
        L_0x19bd:
            r3 = 2
        L_0x19be:
            java.lang.Integer r21 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x1a1f }
            java.lang.String r2 = "pn"
            java.lang.String r31 = X.C36431kI.A1A(r2, r0)     // Catch:{ all -> 0x1a1f }
            java.lang.String r2 = "registration_code"
            java.lang.String r32 = X.C36431kI.A1A(r2, r0)     // Catch:{ all -> 0x1a1f }
            java.lang.String r2 = "enc_p"
            java.lang.String r33 = X.C36431kI.A1A(r2, r0)     // Catch:{ all -> 0x1a1f }
            java.lang.String r2 = "enc_iv"
            java.lang.String r34 = X.C36431kI.A1A(r2, r0)     // Catch:{ all -> 0x1a1f }
            java.lang.String r2 = "enc_c"
            java.lang.String r35 = X.C36431kI.A1A(r2, r0)     // Catch:{ all -> 0x1a1f }
            java.lang.String r2 = "enc_t"
            java.lang.String r36 = X.C36431kI.A1A(r2, r0)     // Catch:{ all -> 0x1a1f }
            r37 = 0
            r19 = r7
            r19.A03(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x1a1f }
        L_0x19ed:
            r3 = 1
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x19f7 }
            r0 = r18
            com.google.android.gms.tasks.Tasks.await(r0, r3, r2)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x19f7 }
            goto L_0x1a0f
        L_0x19f7:
            r0 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x1a1f }
            int r0 = X.C90474aD.A05(r3)     // Catch:{ all -> 0x1a1f }
            int r0 = r0 + 20
            java.lang.StringBuilder r2 = X.C90524aI.A0h(r0)     // Catch:{ all -> 0x1a1f }
            java.lang.String r0 = "Message ack failed: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r2)     // Catch:{ all -> 0x1a1f }
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x1a1f }
        L_0x1a0f:
            r1 = r17
            r0 = r16
            r1.setResult(r0)
            return
        L_0x1a17:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x1a1f }
            goto L_0x1a1e
        L_0x1a1a:
            r0 = move-exception
            r19.shutdown()     // Catch:{ all -> 0x1a1f }
        L_0x1a1e:
            throw r0     // Catch:{ all -> 0x1a1f }
        L_0x1a1f:
            r2 = move-exception
            r1 = r17
            r0 = r16
            r1.setResult(r0)
            throw r2
        L_0x1a28:
            java.lang.Object r0 = r1.A00
            com.whatsapp.VoiceMessagingService r0 = (com.whatsapp.VoiceMessagingService) r0
            java.lang.Object r7 = r1.A01
            X.11F r7 = (X.AnonymousClass11F) r7
            java.lang.Object r5 = r1.A02
            X.3Qj r5 = (X.C65013Qj) r5
            X.1X4 r2 = r0.A06
            X.1D5 r3 = r0.A09
            r4 = 0
            r13 = 2
            X.0yC r1 = r3.A0A
            r0 = 2832(0xb10, float:3.968E-42)
            r1.A0E(r0)
            r15 = 0
            r14 = 1
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r16 = 0
            r6 = r4
            X.2bU r0 = r3.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.3SC r0 = new X.3SC
            r0.<init>(r1)
            r2.A0b(r0, r4, r15, r15)
            return
        L_0x1a5c:
            java.lang.Object r0 = r1.A00
            X.3mu r0 = (X.C75243mu) r0
            java.lang.Object r3 = r1.A01
            X.3B2 r3 = (X.AnonymousClass3B2) r3
            java.lang.Object r5 = r1.A02
            X.147 r5 = (X.AnonymousClass147) r5
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r4 = r0.A01
            X.3HI r2 = r4.A0G
            r0 = 0
            r2.A01(r3, r0)
            X.16D r1 = r4.A01
            X.147 r0 = r3.A05
            X.141 r2 = r1.A0D(r0)
            r0 = 2
            X.35K r1 = new X.35K
            r1.<init>(r5, r0)
            X.0wN r0 = r4.A03
            r2.A0H(r0, r1)
            X.3HI r0 = r4.A0G
            X.1RY r1 = r0.A09
            android.widget.ImageView r0 = r0.A06
            r1.A08(r0, r2)
            java.lang.String r3 = r3.A09
            r0 = 2131430995(0x7f0b0e53, float:1.8483707E38)
            android.widget.TextView r2 = X.C36401kF.A0H(r4, r0)
            r0 = 2131892066(0x7f121762, float:1.941887E38)
            r2.setText(r0)
            r1 = 0
            X.2i8 r0 = new X.2i8
            r0.<init>(r4, r5, r3, r1)
            r2.setOnClickListener(r0)
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity.A01(r4)
            return
        L_0x1aa9:
            java.lang.Object r4 = r1.A00
            X.5sj r4 = (X.C121185sj) r4
            java.lang.Object r3 = r1.A01
            java.lang.Object r2 = r1.A02
            r0 = 2
            X.AnonymousClass00C.A0D(r2, r0)
            X.005 r0 = r4.A02
            if (r0 == 0) goto L_0x1ad5
            java.lang.Object r0 = r0.get()
            X.6Md r0 = (X.C130716Md) r0
            r0.A01()
            X.17Y r1 = r4.A00
            if (r1 == 0) goto L_0x1ad0
            r0 = 36
            X.74N r0 = X.AnonymousClass74N.A00(r3, r2, r0)
            r1.A0H(r0)
            return
        L_0x1ad0:
            java.lang.RuntimeException r0 = X.C36321k7.A06()
            throw r0
        L_0x1ad5:
            java.lang.String r0 = "waffleDataDeletionManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x1adc:
            java.lang.Object r3 = r1.A00
            java.lang.Object r2 = r1.A01
            X.7fl r2 = (X.C158077fl) r2
            java.lang.Object r0 = r1.A02
            X.C36321k7.A0x(r2, r0)
            X.7ku r2 = r2.B7y()
            X.4vP r1 = X.C142326oh.A03(r3)
            X.68b r0 = X.C1273868b.A01(r0)
            X.C1273868b.A07(r1, r0, r2)
            return
        L_0x1af7:
            java.lang.Object r4 = r1.A00
            com.whatsapp.TextEmojiLabel r4 = (com.whatsapp.TextEmojiLabel) r4
            java.lang.Object r3 = r1.A01
            X.6Er r3 = (X.C129036Er) r3
            java.lang.Object r2 = r1.A02
            android.content.Context r2 = (android.content.Context) r2
            r1 = 0
            android.text.Layout r0 = r4.getLayout()
            if (r0 == 0) goto L_0x1b16
            android.text.Layout r0 = r4.getLayout()
            int r1 = r0.getEllipsisCount(r1)
            r0 = 26
            if (r1 > 0) goto L_0x1b18
        L_0x1b16:
            r0 = 28
        L_0x1b18:
            r3.A01(r2, r4, r0)
            return
        L_0x1b1c:
            java.lang.Object r5 = r1.A00
            X.4y9 r5 = (X.C101704y9) r5
            java.lang.Object r4 = r1.A01
            android.accounts.AccountManagerFuture r4 = (android.accounts.AccountManagerFuture) r4
            java.lang.Object r3 = r1.A02
            com.whatsapp.backup.google.BaseNewUserSetupActivity$AuthRequestDialogFragment r3 = (com.whatsapp.backup.google.BaseNewUserSetupActivity$AuthRequestDialogFragment) r3
            java.lang.String r2 = "authAccount"
            java.lang.String r0 = "settings-gdrive/show-accounts/waiting-for-add-account-activity-to-return"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x1b85, AuthenticatorException | IOException -> 0x1b7e }
            java.lang.Object r1 = r4.getResult()     // Catch:{ OperationCanceledException -> 0x1b85, AuthenticatorException | IOException -> 0x1b7e }
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1     // Catch:{ OperationCanceledException -> 0x1b85, AuthenticatorException | IOException -> 0x1b7e }
            boolean r0 = r1.containsKey(r2)     // Catch:{ OperationCanceledException -> 0x1b85, AuthenticatorException | IOException -> 0x1b7e }
            if (r0 != 0) goto L_0x1b41
            java.lang.String r0 = "settings-gdrive/error-during-add-account/account-manager-returned-with-no-account-name"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x1b85, AuthenticatorException | IOException -> 0x1b7e }
            return
        L_0x1b41:
            java.lang.Object r0 = r1.get(r2)     // Catch:{ OperationCanceledException -> 0x1b85, AuthenticatorException | IOException -> 0x1b7e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ OperationCanceledException -> 0x1b85, AuthenticatorException | IOException -> 0x1b7e }
            X.C101704y9.A0I(r3, r5, r0)     // Catch:{ OperationCanceledException -> 0x1b85, AuthenticatorException | IOException -> 0x1b7e }
            return
        L_0x1b4d:
            java.lang.Object r5 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r5 = (com.whatsapp.backup.google.SettingsGoogleDrive) r5
            java.lang.Object r4 = r1.A01
            android.accounts.AccountManagerFuture r4 = (android.accounts.AccountManagerFuture) r4
            java.lang.Object r3 = r1.A02
            com.whatsapp.backup.google.SettingsGoogleDrive$AuthRequestDialogFragment r3 = (com.whatsapp.backup.google.SettingsGoogleDrive.AuthRequestDialogFragment) r3
            java.lang.String r2 = "authAccount"
            java.lang.String r0 = "settings-gdrive/show-accounts/waiting-for-add-account-activity-to-return"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x1b85, AuthenticatorException | IOException -> 0x1b7e }
            java.lang.Object r1 = r4.getResult()     // Catch:{ OperationCanceledException -> 0x1b85, AuthenticatorException | IOException -> 0x1b7e }
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1     // Catch:{ OperationCanceledException -> 0x1b85, AuthenticatorException | IOException -> 0x1b7e }
            boolean r0 = r1.containsKey(r2)     // Catch:{ OperationCanceledException -> 0x1b85, AuthenticatorException | IOException -> 0x1b7e }
            if (r0 != 0) goto L_0x1b72
            java.lang.String r0 = "settings-gdrive/error-during-add-account/account-manager-returned-with-no-account-name"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x1b85, AuthenticatorException | IOException -> 0x1b7e }
            return
        L_0x1b72:
            java.lang.Object r0 = r1.get(r2)     // Catch:{ OperationCanceledException -> 0x1b85, AuthenticatorException | IOException -> 0x1b7e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ OperationCanceledException -> 0x1b85, AuthenticatorException | IOException -> 0x1b7e }
            com.whatsapp.backup.google.SettingsGoogleDrive.A0G(r3, r5, r0)     // Catch:{ OperationCanceledException -> 0x1b85, AuthenticatorException | IOException -> 0x1b7e }
            return
        L_0x1b7e:
            r1 = move-exception
            java.lang.String r0 = "settings-gdrive/error-during-add-account"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x1b85:
            r1 = move-exception
            java.lang.String r0 = "settings-gdrive/user-canceled-add-account-operation"
            com.whatsapp.util.Log.i(r0, r1)
            return
        L_0x1b8c:
            java.lang.Object r5 = r1.A00
            X.3dG r5 = (X.C69273dG) r5
            java.lang.Object r0 = r1.A01
            X.30V r0 = (X.AnonymousClass30V) r0
            java.lang.Object r4 = r1.A02
            java.util.List r1 = r0.A00
            if (r1 == 0) goto L_0x1bca
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x1bca
            r3 = 0
            java.lang.Object r2 = r1.get(r3)
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()
            java.lang.String r0 = "wa.me"
            X.C90494aF.A1H(r0, r2, r1)
            java.lang.String r0 = "%s/%s"
            java.lang.String r2 = java.lang.String.format(r0, r1)
            com.whatsapp.WaTextView r1 = r5.A07
            r1.setText(r2)
            r1.setVisibility(r3)
            r0 = 8
            X.C48812i6.A00(r1, r4, r5, r0)
            X.4Y4 r0 = new X.4Y4
            r0.<init>(r3, r2, r5)
            r1.setOnLongClickListener(r0)
            return
        L_0x1bca:
            com.whatsapp.WaTextView r1 = r5.A07
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x1bd2:
            java.lang.Object r0 = r1.A00
            X.3Pe r0 = (X.C64723Pe) r0
            java.lang.Object r2 = r1.A01
            X.3ty r2 = (X.C79593ty) r2
            java.lang.Object r1 = r1.A02
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            X.0y0 r0 = r0.A00
            X.00I r0 = X.C143076pw.A00(r1, r0)
            r2.A0C(r0)
            return
        L_0x1be8:
            java.lang.Object r0 = r1.A00
            X.6Ky r0 = (X.C130406Ky) r0
            java.lang.Object r4 = r1.A01
            X.69c r4 = (X.C1276469c) r4
            java.lang.Object r3 = r1.A02
            X.C36321k7.A0x(r4, r3)
            X.5so r2 = r0.A00
            X.5p8 r1 = r2.A00
            com.whatsapp.jid.UserJid r6 = r4.A00
            java.util.Collection r0 = r4.A01
            java.util.HashSet r8 = X.C90524aI.A0k(r0)
            X.5ks r0 = r1.A01
            int r9 = r0.A00
            X.9Y1 r0 = r1.A00
            java.lang.String r7 = r0.A02
            X.AnonymousClass00C.A08(r7)
            X.6Co r5 = new X.6Co
            r10 = r9
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = 0
            X.7sS r1 = new X.7sS
            r1.<init>(r3, r4, r0)
            X.9ge r0 = r2.A01
            r0.A01(r5, r1)
            return
        L_0x1c1e:
            java.lang.Object r2 = r1.A00
            X.6Ky r2 = (X.C130406Ky) r2
            java.lang.Object r3 = r1.A01
            X.6B5 r3 = (X.AnonymousClass6B5) r3
            java.lang.Object r4 = r1.A02
            X.7iy r4 = (X.C159197iy) r4
            r0 = 2
            X.AnonymousClass00C.A0D(r4, r0)
            X.5sq r2 = r2.A01
            X.5sp r1 = r2.A00
            com.whatsapp.jid.UserJid r7 = r3.A00
            java.lang.String r8 = r3.A02
            java.lang.String r10 = r3.A01
            goto L_0x1c52
        L_0x1c39:
            java.lang.Object r2 = r1.A00
            X.6Ky r2 = (X.C130406Ky) r2
            java.lang.Object r3 = r1.A01
            X.69d r3 = (X.C1276569d) r3
            java.lang.Object r4 = r1.A02
            X.7iy r4 = (X.C159197iy) r4
            r0 = 2
            X.AnonymousClass00C.A0D(r4, r0)
            X.5sq r2 = r2.A01
            X.5sp r1 = r2.A00
            com.whatsapp.jid.UserJid r7 = r3.A00
            java.lang.String r8 = r3.A01
            r10 = 0
        L_0x1c52:
            X.17Z r0 = r1.A02
            if (r0 == 0) goto L_0x1c58
            X.17Z r0 = X.AnonymousClass17Z.$redex_init_class
        L_0x1c58:
            X.5ks r0 = r1.A01
            int r12 = r0.A00
            X.9Y1 r0 = r1.A00
            java.lang.String r9 = r0.A02
            r11 = 50
            r14 = 1
            r6 = 0
            r15 = 1
            X.9XP r5 = new X.9XP
            r13 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.6q4 r1 = new X.6q4
            r1.<init>(r4, r3)
            X.9ge r0 = r2.A01
            r0.A03(r5, r1)
            return
        L_0x1c76:
            java.lang.Object r0 = r1.A00
            X.6Ky r0 = (X.C130406Ky) r0
            java.lang.Object r6 = r1.A01
            X.69e r6 = (X.C1276669e) r6
            java.lang.Object r5 = r1.A02
            X.7iy r5 = (X.C159197iy) r5
            X.C36321k7.A0x(r6, r5)
            X.5sr r4 = r0.A02
            X.5p9 r1 = r4.A01
            java.util.Collection r0 = r6.A01
            java.util.HashSet r0 = X.C90524aI.A0k(r0)
            java.util.List r3 = X.C007103b.A0Y(r0)
            X.5ks r0 = r1.A01
            int r0 = r0.A00
            com.whatsapp.jid.UserJid r1 = r6.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.9gC r2 = new X.9gC
            r2.<init>(r1, r0, r0, r3)
            X.6py r1 = new X.6py
            r1.<init>(r5, r6)
            X.9ge r0 = r4.A02
            r0.A02(r2, r1)
            return
        L_0x1cad:
            java.lang.Object r0 = r1.A00
            X.6Ky r0 = (X.C130406Ky) r0
            java.lang.Object r3 = r1.A01
            X.69f r3 = (X.C1276769f) r3
            java.lang.Object r4 = r1.A02
            X.7iy r4 = (X.C159197iy) r4
            r12 = 1
            X.C36321k7.A0v(r3, r12, r4)
            X.5sr r2 = r0.A02
            X.5p9 r5 = r2.A01
            android.util.DisplayMetrics r0 = X.C90484aE.A0P()
            X.AnonymousClass00C.A08(r0)
            int r1 = r0.widthPixels
            int r0 = r0.heightPixels
            int r0 = java.lang.Math.min(r1, r0)
            com.whatsapp.jid.UserJid r7 = r3.A00
            java.lang.String r10 = r3.A01
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            X.9Y1 r0 = r5.A00
            java.lang.String r11 = r0.A02
            r6 = 0
            X.9NZ r5 = new X.9NZ
            r9 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.5kr r0 = r2.A00
            X.5k0 r0 = r0.A00
            X.0w4 r0 = r0.A00
            X.0tq r0 = r0.A00
            X.004 r0 = r0.A1S
            java.lang.Object r0 = r0.get()
            X.1Ws r0 = (X.C29461Ws) r0
            X.6q5 r1 = new X.6q5
            r1.<init>(r0, r4, r3)
            X.9ge r0 = r2.A02
            r0.A05(r1, r5)
            return
        L_0x1cfe:
            java.lang.Object r4 = r1.A00
            X.6Ky r4 = (X.C130406Ky) r4
            java.lang.Object r2 = r1.A01
            X.69g r2 = (X.C1276869g) r2
            java.lang.Object r3 = r1.A02
            r0 = 2
            X.AnonymousClass00C.A0D(r3, r0)
            X.5st r4 = r4.A03
            X.5ss r1 = r4.A00
            com.whatsapp.jid.UserJid r6 = r2.A00
            java.lang.String r7 = r2.A01
            goto L_0x1d29
        L_0x1d15:
            java.lang.Object r0 = r1.A00
            X.6Ky r0 = (X.C130406Ky) r0
            java.lang.Object r2 = r1.A01
            X.68c r2 = (X.C1273968c) r2
            java.lang.Object r3 = r1.A02
            X.C36321k7.A0x(r2, r3)
            X.5st r4 = r0.A03
            X.5ss r1 = r4.A00
            com.whatsapp.jid.UserJid r6 = r2.A00
            r7 = 0
        L_0x1d29:
            X.17Z r0 = r1.A02
            if (r0 == 0) goto L_0x1d2f
            X.17Z r0 = X.AnonymousClass17Z.$redex_init_class
        L_0x1d2f:
            r9 = 50
            X.5ks r0 = r1.A01
            int r10 = r0.A00
            X.9Y1 r0 = r1.A00
            java.lang.String r8 = r0.A02
            X.9iV r5 = new X.9iV
            r11 = r10
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0 = 1
            r5.A03 = r0
            r0 = 0
            X.5VX r1 = new X.5VX
            r1.<init>(r3, r2, r0)
            X.9ge r0 = r4.A01
            r0.A04(r1, r5)
            return
        L_0x1d4e:
            java.lang.Object r5 = r1.A00
            X.7j2 r5 = (X.C159237j2) r5
            java.lang.Object r2 = r1.A01
            java.lang.Object r4 = r1.A02
            X.68d r4 = (X.AnonymousClass68d) r4
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            X.7t8 r5 = (X.C165257t8) r5
            int r3 = r5.A01
            java.lang.Object r2 = r5.A00
            X.6Uh r2 = (X.C132566Uh) r2
            X.00s r1 = r2.A02
            java.util.List r0 = r4.A00
            if (r3 == 0) goto L_0x1d75
            r1.A0C(r0)
            X.0wU r1 = r2.A0B
            r0 = 46
            X.C1497072l.A00(r1, r2, r0)
            return
        L_0x1d75:
            r1.A0C(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A0C
            r1 = 0
            r0.set(r1)
            X.00s r0 = r2.A01
            X.C36341k9.A19(r0, r1)
            return
        L_0x1d84:
            java.lang.Object r0 = r1.A02     // Catch:{ Exception -> 0x1d8e }
            X.C36411kG.A1O(r0)     // Catch:{ Exception -> 0x1d8e }
            r0 = 0
            r2.A06(r0)     // Catch:{ Exception -> 0x1d8e }
            return
        L_0x1d8e:
            r0 = move-exception
            r2.A05(r0)
            return
        L_0x1d93:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x1dbb
            r1 = 0
            int r0 = r3.length()
            int r0 = r0 + -1
            java.lang.String r1 = r3.substring(r1, r0)
            X.7ii r0 = r11.BFq()
            X.5hp r4 = r0.B6M(r1)
            goto L_0x1dbb
        L_0x1dad:
            boolean r0 = r1.contains(r5)
            if (r0 == 0) goto L_0x1dbb
            X.7ii r0 = r11.BFq()
            X.5hp r4 = r0.B6L()
        L_0x1dbb:
            java.util.HashMap r5 = X.AnonymousClass001.A0J()
            int r1 = r6.size()
            int r0 = r9.size()
            java.lang.String r3 = "effects_added"
            if (r1 >= r0) goto L_0x1de7
            java.util.ArrayList r0 = X.C36441kJ.A15(r9)
            r0.removeAll(r6)
            java.lang.String r0 = X.AnonymousClass5YH.A00(r0)
            r5.put(r3, r0)
        L_0x1dd9:
            java.util.Map r19 = r11.BKh(r4, r5)
            java.lang.String r17 = "media_pipeline_update_effects_list"
            r16 = r11
            r20 = r22
            r16.BOu(r17, r18, r19, r20)
            return
        L_0x1de7:
            int r2 = r6.size()
            int r0 = r9.size()
            java.lang.String r1 = "effects_removed"
            if (r2 > r0) goto L_0x1e01
            java.util.ArrayList r0 = X.C36441kJ.A15(r9)
            r0.removeAll(r6)
            java.lang.String r0 = X.AnonymousClass5YH.A00(r0)
            r5.put(r3, r0)
        L_0x1e01:
            java.util.ArrayList r0 = X.C36441kJ.A15(r6)
            r0.removeAll(r9)
            java.lang.String r0 = X.AnonymousClass5YH.A00(r0)
            r5.put(r1, r0)
            goto L_0x1dd9
        L_0x1e10:
            return
        L_0x1e11:
            monitor-enter(r3)
            X.0v0 r5 = r3.A03     // Catch:{ all -> 0x1e67 }
            X.005 r1 = r5.A00     // Catch:{ all -> 0x1e67 }
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r1)     // Catch:{ all -> 0x1e67 }
            java.lang.String r4 = "fbns_token"
            r7 = 0
            java.lang.String r2 = r0.getString(r4, r7)     // Catch:{ all -> 0x1e67 }
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r1)     // Catch:{ all -> 0x1e67 }
            java.lang.String r1 = "last_server_fbns_token"
            java.lang.String r0 = r0.getString(r1, r7)     // Catch:{ all -> 0x1e67 }
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x1e67 }
            if (r0 == 0) goto L_0x1e54
            java.lang.String r0 = "FbnsTokenManager/onTokenReceived called with token that is already on the server side"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x1e67 }
        L_0x1e36:
            boolean r0 = r10.equals(r2)     // Catch:{ all -> 0x1e67 }
            if (r0 == 0) goto L_0x1e43
            java.lang.String r0 = "FbnsTokenManager/onTokenRecevied token already saved"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x1e67 }
        L_0x1e41:
            monitor-exit(r3)     // Catch:{ all -> 0x1e67 }
            goto L_0x1e66
        L_0x1e43:
            r2 = 240677001(0xe587089, float:2.667824E-30)
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r5)     // Catch:{ all -> 0x1e67 }
            android.content.SharedPreferences$Editor r1 = r0.putString(r4, r10)     // Catch:{ all -> 0x1e67 }
            java.lang.String r0 = "fbns_app_vers"
            X.C36341k9.A0v(r1, r0, r2)     // Catch:{ all -> 0x1e67 }
            goto L_0x1e41
        L_0x1e54:
            X.1bF r6 = r3.A04     // Catch:{ all -> 0x1e67 }
            java.lang.String r11 = "fbns"
            r9 = r7
            r12 = r7
            r8 = r7
            r6.A00(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x1e67 }
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r5)     // Catch:{ all -> 0x1e67 }
            X.C36341k9.A0x(r0, r1, r10)     // Catch:{ all -> 0x1e67 }
            goto L_0x1e36
        L_0x1e66:
            return
        L_0x1e67:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x1e67 }
            throw r0
        L_0x1e6a:
            return
        L_0x1e6b:
            return
        L_0x1e6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1503374w.run():void");
    }

    public C1503374w(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public C1503374w(C201589jv r2, C197159bE r3, C20979A1t a1t) {
        this.A03 = 16;
        this.A00 = r3;
        this.A01 = r2;
        this.A02 = a1t;
    }
}
