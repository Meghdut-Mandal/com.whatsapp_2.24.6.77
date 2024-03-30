package X;

import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.SparseIntArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.19a  reason: invalid class name and case insensitive filesystem */
public class C235819a {
    public int A00 = 0;
    public AnonymousClass19A A01;
    public HandlerThread A02;
    public final SparseIntArray A03 = new SparseIntArray();
    public final C19700wN A04;
    public final C236019c A05;
    public final AnonymousClass19Z A06;
    public final AnonymousClass19H A07;
    public final C236819k A08;
    public final C236119d A09 = new C236219e(this);
    public final Object A0A = new Object();
    public final List A0B = new ArrayList();
    public final Map A0C = new HashMap();
    public final Map A0D = new HashMap();
    public final C20810yC A0E;
    public final AnonymousClass19I A0F;
    public final C19930wk A0G;

    public void A02(Message message, int i) {
        message.what = 1;
        message.arg1 = i;
        this.A08.sendMessage(message);
    }

    public static void A00(C235819a r7, C203399nx r8, String str) {
        C236119d r1;
        synchronized (r7.A0A) {
            r1 = (C236119d) r7.A0C.remove(str);
        }
        if (r1 != null) {
            C236019c r5 = r7.A05;
            r5.A02(str);
            String A0i = r8.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
            try {
                if ("result".equals(A0i)) {
                    r1.BiM(r8, str);
                } else if ("error".equals(A0i)) {
                    r1.BWw(r8, str);
                } else {
                    r7.A04.A0E("unexpected_recv_iq_type", A0i, false);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected type=");
                    sb.append(A0i);
                    sb.append(" for iq=");
                    sb.append(str);
                    C18740tg.A0D(false, sb.toString());
                }
                r5.A03(str, (Integer) null);
            } catch (C235919b e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("XmppIncomingMessageRouter/handleIncomingIqResponse/corrupt-stream-error iqId=");
                sb2.append(str);
                Log.w(sb2.toString(), e);
                C19700wN r3 = r7.A04;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("source=XmppIncomingMessageRouter:iq message=");
                sb3.append(e.getMessage());
                r3.A0E("CorruptStreamException", sb3.toString(), false);
                r5.A03(str, 2);
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("XmppIncomingMessageRouter/ignoring response due to missing callback for iqId:");
            sb4.append(str);
            Log.i(sb4.toString());
        }
    }

    public static void A01(C235819a r3, String str, boolean z) {
        C236119d r1;
        if (z) {
            AnonymousClass19I r12 = r3.A0F;
            C18740tg.A07(str, "Can't remove message with null id");
            List list = r12.A00;
            synchronized (list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (str.equals(((AnonymousClass376) it.next()).A01)) {
                        it.remove();
                    }
                }
            }
        }
        synchronized (r3.A0A) {
            r1 = (C236119d) r3.A0D.remove(str);
            if (r1 == null) {
                r1 = (C236119d) r3.A0C.remove(str);
            }
        }
        C236019c r32 = r3.A05;
        r32.A01((Integer) null, str, 4);
        r32.A02(str);
        if (r1 != null) {
            r1.BVN(str);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("XmppIncomingMessageRouter/ignoring failure due to missing callback for iqId:");
            sb.append(str);
            Log.i(sb.toString());
        }
        r32.A03(str, (Integer) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (r1 == r10.A09) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C236119d r11, java.lang.String r12, int r13, long r14, boolean r16) {
        /*
            r10 = this;
            java.lang.Object r4 = r10.A0A
            monitor-enter(r4)
            java.util.Map r0 = r10.A0C     // Catch:{ all -> 0x00c3 }
            boolean r0 = r0.containsKey(r12)     // Catch:{ all -> 0x00c3 }
            r5 = 1
            r2 = 0
            if (r0 != 0) goto L_0x000e
            r2 = 1
        L_0x000e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c3 }
            r1.<init>()     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "Pending iq-callback for id:"
            r1.append(r0)     // Catch:{ all -> 0x00c3 }
            r1.append(r12)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c3 }
            X.C18740tg.A0F(r2, r0)     // Catch:{ all -> 0x00c3 }
            java.util.Map r0 = r10.A0D     // Catch:{ all -> 0x00c3 }
            java.lang.Object r1 = r0.put(r12, r11)     // Catch:{ all -> 0x00c3 }
            X.19d r1 = (X.C236119d) r1     // Catch:{ all -> 0x00c3 }
            if (r1 == 0) goto L_0x0031
            X.19d r0 = r10.A09     // Catch:{ all -> 0x00c3 }
            r2 = 0
            if (r1 != r0) goto L_0x0032
        L_0x0031:
            r2 = 1
        L_0x0032:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c3 }
            r1.<init>()     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "Pending request for id:"
            r1.append(r0)     // Catch:{ all -> 0x00c3 }
            r1.append(r12)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c3 }
            X.C18740tg.A0F(r2, r0)     // Catch:{ all -> 0x00c3 }
            r1 = 0
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0063
            X.19k r3 = r10.A08     // Catch:{ all -> 0x00c3 }
            if (r16 != 0) goto L_0x0051
            r5 = 0
        L_0x0051:
            X.19a r0 = r3.A01     // Catch:{ all -> 0x00c3 }
            X.19k r2 = r0.A08     // Catch:{ all -> 0x00c3 }
            r1 = 4
            r0 = 0
            android.os.Message r0 = r2.obtainMessage(r1, r5, r0, r12)     // Catch:{ all -> 0x00c3 }
            r2.sendMessageDelayed(r0, r14)     // Catch:{ all -> 0x00c3 }
            java.util.concurrent.ConcurrentMap r0 = r3.A00     // Catch:{ all -> 0x00c3 }
            r0.put(r12, r12)     // Catch:{ all -> 0x00c3 }
        L_0x0063:
            monitor-exit(r4)     // Catch:{ all -> 0x00c3 }
            X.19c r3 = r10.A05
            java.util.concurrent.ConcurrentHashMap r4 = r3.A01
            boolean r0 = r4.containsKey(r12)
            if (r0 != 0) goto L_0x00a6
            X.9Nt r2 = new X.9Nt
            r2.<init>()
            r2.A00 = r13
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.A05 = r0
            r4.put(r12, r2)
            X.0zf r2 = X.C236019c.A00(r3)
            int r6 = r12.hashCode()
            java.lang.String r1 = "IqMessagePerfLoggerInterceptor"
            r0 = 1
            r2.A09(r1, r6, r0)
            X.0zf r0 = X.C236019c.A00(r3)
            long r8 = (long) r13
            java.lang.String r7 = "iq_type"
            X.0ze r4 = r0.A05
            X.0zg r0 = r0.A04
            int r5 = r0.A06
            r4.markerAnnotate((int) r5, (int) r6, (java.lang.String) r7, (long) r8)
            X.0zf r1 = X.C236019c.A00(r3)
            java.lang.String r0 = "iq_queue"
            r1.A02(r6, r0)
            return
        L_0x00a6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "IqPerfLogger/onIqMessageQueued already exists iqId="
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " iqSendType="
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x00c3:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00c3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C235819a.A04(X.19d, java.lang.String, int, long, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r2 == r4.A09) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A0A
            monitor-enter(r3)
            java.util.Map r0 = r4.A0D     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r0.remove(r5)     // Catch:{ all -> 0x0018 }
            X.19d r2 = (X.C236119d) r2     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x0012
            X.19d r1 = r4.A09     // Catch:{ all -> 0x0018 }
            r0 = 0
            if (r2 != r1) goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            X.C18740tg.A0C(r0)     // Catch:{ all -> 0x0018 }
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
            return
        L_0x0018:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C235819a.A05(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r3.A0C.isEmpty() == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A0A
            monitor-enter(r2)
            java.util.Map r0 = r3.A0D     // Catch:{ all -> 0x0033 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0014
            java.util.Map r0 = r3.A0C     // Catch:{ all -> 0x0033 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0033 }
            r0 = 0
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            if (r4 != 0) goto L_0x0027
            if (r0 != 0) goto L_0x0027
            r0 = 0
            r3.A00 = r0     // Catch:{ all -> 0x0035 }
            X.19k r1 = r3.A08     // Catch:{ all -> 0x0035 }
            r0 = 4
            r1.removeMessages(r0)     // Catch:{ all -> 0x0035 }
            java.util.concurrent.ConcurrentMap r0 = r1.A00     // Catch:{ all -> 0x0035 }
            r0.clear()     // Catch:{ all -> 0x0035 }
        L_0x0027:
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            X.19k r1 = r3.A08
            r0 = 3
            android.os.Message r0 = r1.obtainMessage(r0)
            r0.sendToTarget()
            return
        L_0x0033:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C235819a.A06(boolean):void");
    }

    public boolean A07(int i) {
        int i2 = this.A03.get(i, -1);
        if (i2 < 0 || i2 >= this.A0B.size()) {
            return false;
        }
        return true;
    }

    public boolean A08(C203399nx r8, String str) {
        C236819k r2;
        C236119d r0;
        String A0i = r8.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
        if ("result".equals(A0i)) {
            C236019c r6 = this.A05;
            C194009Nt r5 = (C194009Nt) r6.A01.get(str);
            if (r5 != null && r5.A06 == 0) {
                r5.A06 = SystemClock.uptimeMillis();
                C21700zf A002 = C236019c.A00(r6);
                int hashCode = str.hashCode();
                A002.A01(hashCode, "iq_send");
                C236019c.A00(r6).A02(hashCode, "iq_processing_queue");
            }
        } else if ("error".equals(A0i)) {
            this.A05.A01(Integer.valueOf(AnonymousClass3ME.A00(r8)), str, 3);
        }
        synchronized (this.A0A) {
            r2 = this.A08;
            Object remove = r2.A00.remove(str);
            if (remove != null) {
                r2.removeMessages(4, remove);
            }
            r0 = (C236119d) this.A0C.get(str);
        }
        if (r0 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("xmppIncomingMessageRouter/handleIqResponse no callback found for id=");
            sb.append(str);
            Log.i(sb.toString());
            return false;
        } else if (r0 instanceof C76633pC) {
            A00(this, r8, str);
            return true;
        } else {
            Message obtainMessage = r2.obtainMessage(2, r8);
            obtainMessage.getData().putString("iqId", str);
            obtainMessage.sendToTarget();
            return true;
        }
    }

    public C235819a(C19700wN r4, C20810yC r5, AnonymousClass19I r6, C236019c r7, AnonymousClass19Z r8, AnonymousClass19H r9, C19770wU r10) {
        this.A0E = r5;
        this.A04 = r4;
        this.A05 = r7;
        this.A07 = r9;
        this.A0F = r6;
        this.A06 = r8;
        HandlerThread handlerThread = new HandlerThread("XmppMessageRouter", 1);
        this.A02 = handlerThread;
        handlerThread.start();
        this.A08 = new C236819k(this.A02.getLooper(), this);
        this.A0G = new C19930wk(r10, true);
    }

    public void A03(AnonymousClass19A r1) {
        this.A01 = r1;
    }
}
