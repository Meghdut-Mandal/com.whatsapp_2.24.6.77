package X;

import android.content.Context;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.util.concurrent.ConcurrentHashMap;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.Aut  reason: case insensitive filesystem */
public final class C22730Aut extends Job implements AnonymousClass7i8 {
    public static final ConcurrentHashMap A0C = C90524aI.A0s();
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1DT A00;
    public transient C19970wo A01;
    public transient C26171Jd A02;
    public transient AnonymousClass1DW A03;
    public transient C28981Uw A04;
    public transient AnonymousClass8SX A05;
    public transient AnonymousClass1A1 A06;
    public transient long A07;
    public transient C28291Sb A08;
    public transient AnonymousClass19A A09;
    public transient AnonymousClass1SP A0A;
    public transient boolean A0B;
    public final long expireTimeMs;
    public final int fMessageType;
    public String fmsgKeyId;
    public final boolean isEditMessage;
    public final String newsletterRawJid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22730Aut(X.C28981Uw r7, X.AnonymousClass8SX r8, java.lang.String r9, int r10, long r11, boolean r13) {
        /*
            r6 = this;
            r2 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            X.673 r1 = new X.673
            r1.<init>()
            java.lang.String r0 = r7.getRawString()
            r1.A00 = r0
            r1.A01 = r2
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r1.A02(r0)
            com.whatsapp.jobqueue.requirement.OfflineProcessingCompletedRequirement r0 = new com.whatsapp.jobqueue.requirement.OfflineProcessingCompletedRequirement
            r0.<init>()
            r1.A02(r0)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A01()
            r6.<init>(r0)
            r6.A04 = r7
            r6.fmsgKeyId = r9
            r6.expireTimeMs = r11
            r6.fMessageType = r10
            r6.isEditMessage = r13
            r6.A05 = r8
            java.lang.String r5 = r7.getRawString()
            r6.newsletterRawJid = r5
            java.util.concurrent.ConcurrentHashMap r4 = A0C
            monitor-enter(r4)
            X.1Uw r0 = r6.A04     // Catch:{ all -> 0x005d }
            java.lang.String r2 = r6.fmsgKeyId     // Catch:{ all -> 0x005d }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x005d }
            X.9Vh r0 = new X.9Vh     // Catch:{ all -> 0x005d }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x005d }
            boolean r0 = r4.containsKey(r0)     // Catch:{ all -> 0x005d }
            r6.A0B = r0     // Catch:{ all -> 0x005d }
            java.lang.String r1 = r6.fmsgKeyId     // Catch:{ all -> 0x005d }
            X.9Vh r0 = new X.9Vh     // Catch:{ all -> 0x005d }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x005d }
            r4.put(r0, r3)     // Catch:{ all -> 0x005d }
            monitor-exit(r4)
            return
        L_0x005d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22730Aut.<init>(X.1Uw, X.8SX, java.lang.String, int, long, boolean):void");
    }

    public boolean A0D(Exception exc) {
        StringBuilder A0t = C36401kF.A0t(exc, 0);
        C36351kA.A1P(A02(this, "sendNewsletterMessageJob/exception while sending message", A0t), A0t, exc);
        if (!(exc.getCause() instanceof AnonymousClass1WY)) {
            return true;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        C36341k9.A1O(A0u, A02(this, "sendNewsletterMessageJob/Cannot send message due to large payload ", A0u));
        A03((AnonymousClass3T1) null);
        return false;
    }

    public static final C203399nx A00(AnonymousClass3T1 r5) {
        AnonymousClass1AL[] r1;
        String str;
        if (r5 instanceof AnonymousClass2bS) {
            r1 = new AnonymousClass1AL[1];
            str = "creation";
        } else if (!(r5 instanceof C180858mX)) {
            return null;
        } else {
            r1 = new AnonymousClass1AL[1];
            str = "vote";
        }
        C36341k9.A1L("polltype", str, r1, 0);
        return C203399nx.A04("meta", r1);
    }

    private final String A01() {
        String A042 = AnonymousClass143.A04(this.newsletterRawJid);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("; id=");
        A0u.append(this.fmsgKeyId);
        A0u.append("; jid=");
        A0u.append(A042);
        A0u.append("; persistentId=");
        return C36411kG.A11(A0u, this.A01);
    }

    private final void A03(AnonymousClass3T1 r6) {
        C28291Sb r4 = this.A08;
        if (r4 == null) {
            throw C36331k8.A0d("messageStatusStoreBridge");
        }
        r4.A01((C06120Sj) null, C165617ti.A0R(this.A04, this.fmsgKeyId, true), 21);
        if (r6 != null) {
            AnonymousClass1SP r0 = this.A0A;
            if (r0 == null) {
                throw C36331k8.A0d("newsletterMessageObservers");
            }
            r0.A00(r6);
        }
        A0C.remove(new AnonymousClass9Vh(this.A04.getRawString(), this.fmsgKeyId));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01c1, code lost:
        if (((X.AnonymousClass2bV) r2).A06 == null) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x026b, code lost:
        if (r13 != null) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r20.length == 0) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0363, code lost:
        if (r7.length() <= 0) goto L_0x0365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bd, code lost:
        if (r2 == null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f6, code lost:
        if ((r2 instanceof X.C180858mX) != false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x010a, code lost:
        if (r3 != false) goto L_0x010c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B() {
        /*
            r22 = this;
            r4 = r22
            X.0wo r0 = r4.A01
            r2 = 0
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x000e:
            long r9 = android.os.SystemClock.uptimeMillis()
            long r7 = r4.A07
            r5 = 0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            r4.A07 = r9
        L_0x001c:
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x002e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sendNewsletterMessageJob/e2e messasge job is duplicate skipping "
        L_0x0026:
            java.lang.String r0 = A02(r4, r0, r1)
            X.C36341k9.A1O(r1, r0)
            return
        L_0x002e:
            X.8SX r0 = r4.A05
            if (r0 == 0) goto L_0x0063
            byte[] r20 = r0.A0o()
            r1 = 0
            r0 = r20
            int r0 = r0.length
            if (r0 != 0) goto L_0x003d
        L_0x003c:
            r1 = 1
        L_0x003d:
            r10 = 1
            if (r1 == 0) goto L_0x0066
            int r1 = r4.fMessageType
            r0 = 15
            if (r1 == r0) goto L_0x0066
            r0 = 64
            if (r1 == r0) goto L_0x0066
            r0 = 56
            if (r1 == r0) goto L_0x0066
            r0 = 67
            if (r1 == r0) goto L_0x0066
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sendNewsletterMessageJob/e2e messasge is empty - skipping "
            java.lang.String r0 = A02(r4, r0, r1)
            X.C36341k9.A1O(r1, r0)
            r4.A03(r2)
            return
        L_0x0063:
            r20 = r2
            goto L_0x003c
        L_0x0066:
            X.1Uw r1 = r4.A04
            java.lang.String r0 = r4.fmsgKeyId
            X.3Qa r2 = X.C165617ti.A0R(r1, r0, r10)
            int r1 = r4.fMessageType
            r0 = 56
            if (r1 == r0) goto L_0x00a0
            r0 = 67
            if (r1 == r0) goto L_0x00a0
            X.1A1 r0 = r4.A06
            java.lang.String r5 = "fMessageDatabase"
            if (r0 != 0) goto L_0x0083
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0083:
            X.3T1 r2 = r0.A03(r2)
            if (r2 != 0) goto L_0x00dc
            int r1 = r4.fMessageType
            r0 = 15
            if (r1 == r0) goto L_0x0097
            r0 = 64
            if (r1 == r0) goto L_0x0097
            boolean r0 = r4.isEditMessage
            if (r0 == 0) goto L_0x00bf
        L_0x0097:
            X.1A1 r3 = r4.A06
            if (r3 != 0) goto L_0x00b0
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x00a0:
            X.1Jd r0 = r4.A02
            if (r0 != 0) goto L_0x00ab
            java.lang.String r0 = "messageAddOnManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00ab:
            X.2bM r2 = r0.A0B(r2)
            goto L_0x00bd
        L_0x00b0:
            X.1Uw r2 = r4.A04
            r1 = 0
            java.lang.String r0 = r4.fmsgKeyId
            X.3Qa r0 = X.C165617ti.A0R(r2, r0, r1)
            X.3T1 r2 = r3.A03(r0)
        L_0x00bd:
            if (r2 != 0) goto L_0x00dc
        L_0x00bf:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sendNewsletterMessageJob/message was deleted from message store "
            java.lang.String r0 = A02(r4, r0, r1)
            X.C36321k7.A1a(r1, r0)
            r2 = 0
            r4.A03(r2)
            r3 = 3
        L_0x00d1:
            X.1DT r1 = r4.A00
            if (r1 != 0) goto L_0x0156
            java.lang.String r0 = "messageLoggingBridge"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00dc:
            int r1 = r2.A0D
            r0 = 4
            if (r1 != r0) goto L_0x00e9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sendNewsletterMessageJob/message received by server, skipping; "
            goto L_0x0026
        L_0x00e9:
            boolean r0 = r2 instanceof X.AnonymousClass2bM
            r19 = r0
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r2 instanceof X.C180868mY
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r2 instanceof X.C180858mX
            r5 = 1
            if (r0 == 0) goto L_0x00f9
        L_0x00f8:
            r5 = 0
        L_0x00f9:
            int r1 = r2.A1I
            r0 = 15
            if (r1 == r0) goto L_0x0123
            r0 = 64
            if (r1 == r0) goto L_0x0123
            r0 = 56
            if (r1 != r0) goto L_0x011c
            boolean r3 = r2 instanceof X.C180868mY
        L_0x0109:
            r0 = 1
            if (r3 == 0) goto L_0x010d
        L_0x010c:
            r0 = 0
        L_0x010d:
            if (r5 != 0) goto L_0x0142
            if (r0 != 0) goto L_0x0142
            X.0wo r0 = r4.A01
            if (r0 != 0) goto L_0x0126
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x011c:
            r0 = 67
            if (r1 != r0) goto L_0x010c
            boolean r3 = r2 instanceof X.C180858mX
            goto L_0x0109
        L_0x0123:
            boolean r3 = r2 instanceof X.AnonymousClass2bO
            goto L_0x0109
        L_0x0126:
            long r7 = X.C19970wo.A00(r0)
            long r5 = r4.expireTimeMs
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x015e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sendNewsletterMessageJob/message send job expired "
            java.lang.String r0 = A02(r4, r0, r1)
            X.C36321k7.A1a(r1, r0)
            r4.A03(r2)
            r3 = 5
            goto L_0x00d1
        L_0x0142:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sendNewsletterMessageJob/unexpected message "
            java.lang.String r0 = A02(r4, r0, r1)
            X.C36321k7.A1a(r1, r0)
            r4.A03(r2)
            r3 = 11
            goto L_0x00d1
        L_0x0156:
            r4 = 1
            r5 = 1
            r6 = 1
            r7 = 1
            r1.A0N(r2, r3, r4, r5, r6, r7)
            return
        L_0x015e:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sendNewsletterMessageJob/running message send job "
            java.lang.String r0 = A02(r4, r0, r3)
            X.C36321k7.A1a(r3, r0)
            X.9YT r3 = new X.9YT
            r3.<init>()
            X.1Uw r0 = r4.A04
            r3.A02 = r0
            java.lang.String r9 = "message"
            r3.A05 = r9
            java.lang.String r0 = r4.fmsgKeyId
            r3.A07 = r0
            int r5 = r4.fMessageType
            r0 = 15
            if (r5 == r0) goto L_0x0186
            r0 = 64
            if (r5 != r0) goto L_0x018a
        L_0x0186:
            java.lang.String r0 = "8"
            r3.A06 = r0
        L_0x018a:
            boolean r0 = r2 instanceof X.C180868mY
            r18 = r0
            if (r0 == 0) goto L_0x01a1
            r0 = r2
            X.8mY r0 = (X.C180868mY) r0
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x019d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01a1
        L_0x019d:
            java.lang.String r0 = "7"
            r3.A06 = r0
        L_0x01a1:
            r0 = 131072(0x20000, float:1.83671E-40)
            boolean r0 = r2.A1T(r0)
            if (r0 == 0) goto L_0x01ad
            java.lang.String r0 = "3"
            r3.A06 = r0
        L_0x01ad:
            X.9uj r17 = r3.A01()
            X.1Uw r0 = r4.A04
            r21 = r0
            boolean r0 = r2 instanceof X.AnonymousClass2bV
            r16 = r0
            if (r0 == 0) goto L_0x01c3
            r0 = r2
            X.2bV r0 = (X.AnonymousClass2bV) r0
            java.lang.String r0 = r0.A06
            r3 = 1
            if (r0 != 0) goto L_0x01c4
        L_0x01c3:
            r3 = 0
        L_0x01c4:
            boolean r14 = r2 instanceof X.AnonymousClass2bU
            boolean r0 = r2 instanceof X.AnonymousClass2bS
            if (r0 != 0) goto L_0x03c7
            boolean r0 = r2 instanceof X.C180858mX
            if (r0 != 0) goto L_0x03c7
            if (r3 != 0) goto L_0x03c3
            if (r14 != 0) goto L_0x03c3
            java.lang.String r15 = "text"
        L_0x01d4:
            boolean r0 = r2 instanceof X.AnonymousClass2bO
            java.lang.String r13 = "plaintext"
            r8 = 3
            java.lang.String r7 = "type"
            java.lang.String r12 = "to"
            r6 = 2
            java.lang.String r11 = "id"
            r5 = 0
            if (r0 == 0) goto L_0x021a
            r0 = 4
            X.1AL[] r0 = new X.AnonymousClass1AL[r0]
            java.lang.String r1 = r21.getRawString()
            X.C36341k9.A1L(r12, r1, r0, r5)
            X.C36341k9.A1L(r7, r15, r0, r10)
            X.3Qa r1 = r2.A1J
            java.lang.String r1 = r1.A01
            X.AnonymousClass00C.A07(r1)
            X.C36341k9.A1L(r11, r1, r0, r6)
            r5 = 8
            java.lang.String r3 = "edit"
            X.1AL r1 = new X.1AL
            r1.<init>((java.lang.String) r3, (int) r5)
            r0[r8] = r1
            r1 = 0
            X.9nx r1 = X.C203399nx.A04(r13, r1)
        L_0x020a:
            X.9nx r5 = new X.9nx
            r5.<init>((X.C203399nx) r1, (java.lang.String) r9, (X.AnonymousClass1AL[]) r0)
        L_0x020f:
            X.19A r3 = r4.A09
            if (r3 != 0) goto L_0x03cb
            java.lang.String r0 = "messageClient"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x021a:
            r3 = 0
            if (r18 == 0) goto L_0x0283
            r15 = r2
            X.8mY r15 = (X.C180868mY) r15
            java.lang.String r13 = r15.A01
            X.1A1 r14 = r4.A06
            if (r14 != 0) goto L_0x022d
            java.lang.String r0 = "fMessageDatabase"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x022d:
            long r0 = r15.A01
            X.3T1 r1 = X.C36421kH.A0R(r14, r0)
            if (r1 == 0) goto L_0x0409
            r0 = 4
            X.1AL[] r14 = new X.AnonymousClass1AL[r0]
            X.3Qa r0 = r15.A1J
            java.lang.String r0 = r0.A01
            X.AnonymousClass00C.A07(r0)
            X.C36341k9.A1L(r11, r0, r14, r5)
            java.lang.String r0 = r21.getRawString()
            X.C36341k9.A1L(r12, r0, r14, r10)
            long r0 = r1.A1O
            java.lang.String r12 = "server_id"
            X.1AL r11 = new X.1AL
            r11.<init>((java.lang.String) r12, (long) r0)
            r14[r6] = r11
            java.lang.String r11 = "reaction"
            X.C36341k9.A1L(r7, r11, r14, r8)
            java.util.ArrayList r6 = X.AnonymousClass03T.A03(r14)
            if (r13 == 0) goto L_0x0265
            int r0 = r13.length()
            if (r0 != 0) goto L_0x026d
        L_0x0265:
            r1 = 7
            java.lang.String r0 = "edit"
            X.C165587tf.A1N(r0, r6, r1)
            if (r13 == 0) goto L_0x027a
        L_0x026d:
            int r0 = r13.length()
            if (r0 == 0) goto L_0x027a
            X.1AL[] r3 = new X.AnonymousClass1AL[r10]
            java.lang.String r0 = "code"
            X.C36341k9.A1L(r0, r13, r3, r5)
        L_0x027a:
            X.1AL[] r0 = X.C165577te.A1a(r6, r5)
            X.9nx r1 = X.C203399nx.A04(r11, r3)
            goto L_0x020a
        L_0x0283:
            boolean r0 = r2 instanceof X.C180858mX
            if (r0 == 0) goto L_0x0305
            r13 = r2
            X.8mX r13 = (X.C180858mX) r13
            X.1A1 r14 = r4.A06
            if (r14 != 0) goto L_0x0295
            java.lang.String r0 = "fMessageDatabase"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0295:
            long r0 = r13.A01
            X.3T1 r1 = X.C36421kH.A0R(r14, r0)
            if (r1 == 0) goto L_0x0413
            r0 = 4
            X.1AL[] r14 = new X.AnonymousClass1AL[r0]
            X.3Qa r0 = r13.A1J
            java.lang.String r0 = r0.A01
            X.AnonymousClass00C.A07(r0)
            X.C36341k9.A1L(r11, r0, r14, r5)
            java.lang.String r0 = r21.getRawString()
            X.C36341k9.A1L(r12, r0, r14, r10)
            long r0 = r1.A1O
            java.lang.String r12 = "server_id"
            X.1AL r11 = new X.1AL
            r11.<init>((java.lang.String) r12, (long) r0)
            r14[r6] = r11
            java.lang.String r0 = "poll"
            X.C36341k9.A1L(r7, r0, r14, r8)
            X.9nx r11 = A00(r13)
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.List r0 = r13.A01
            if (r0 == 0) goto L_0x02e8
            java.util.Iterator r7 = r0.iterator()
        L_0x02d1:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x02e8
            java.lang.String r0 = X.AnonymousClass001.A0C(r7)
            byte[] r1 = android.util.Base64.decode(r0, r6)
            X.AnonymousClass00C.A08(r1)
            java.lang.String r0 = "vote"
            X.C203399nx.A0D(r0, r8, r1, r3)
            goto L_0x02d1
        L_0x02e8:
            X.9nx[] r1 = X.C165577te.A1b(r8, r5)
            java.lang.String r0 = "votes"
            X.9nx r1 = X.C203399nx.A05(r0, r3, r1)
            if (r11 == 0) goto L_0x0300
            X.9nx[] r0 = new X.C203399nx[r6]
            r0[r5] = r11
            r0[r10] = r1
        L_0x02fa:
            X.9nx r5 = X.C203399nx.A05(r9, r14, r0)
            goto L_0x020f
        L_0x0300:
            X.9nx[] r0 = new X.C203399nx[r10]
            r0[r5] = r1
            goto L_0x02fa
        L_0x0305:
            if (r19 != 0) goto L_0x0424
            X.8SX r1 = r4.A05
            if (r1 == 0) goto L_0x041d
            if (r14 != 0) goto L_0x0316
            if (r16 == 0) goto L_0x032e
            r0 = r2
            X.2bV r0 = (X.AnonymousClass2bV) r0
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L_0x032e
        L_0x0316:
            X.1DW r0 = r4.A03
            if (r0 != 0) goto L_0x0321
            java.lang.String r0 = "deepLinkHelperBridge"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0321:
            java.lang.String r1 = X.C203229nZ.A07(r0, r1)
            if (r1 == 0) goto L_0x032e
            X.1AL[] r3 = new X.AnonymousClass1AL[r10]
            java.lang.String r0 = "mediatype"
            X.C36341k9.A1L(r0, r1, r3, r5)
        L_0x032e:
            X.1AL[] r1 = new X.AnonymousClass1AL[r8]
            java.lang.String r0 = r21.getRawString()
            X.C36341k9.A1L(r12, r0, r1, r5)
            X.C36341k9.A1L(r7, r15, r1, r10)
            X.3Qa r0 = r2.A1J
            java.lang.String r0 = r0.A01
            X.AnonymousClass00C.A07(r0)
            X.C36351kA.A1N(r11, r0, r1)
            java.util.ArrayList r8 = X.AnonymousClass03T.A03(r1)
            r6 = 0
            if (r14 == 0) goto L_0x03c1
            r0 = r2
            X.2bU r0 = (X.AnonymousClass2bU) r0
            if (r0 == 0) goto L_0x03c1
            X.3Qj r0 = r0.A01
            if (r0 == 0) goto L_0x03c1
            java.lang.String r7 = r0.A0M
        L_0x0356:
            X.3L1 r0 = r2.A0a
            if (r0 == 0) goto L_0x035c
            java.lang.String r6 = r0.A06
        L_0x035c:
            if (r7 == 0) goto L_0x0365
            int r1 = r7.length()
            r0 = 1
            if (r1 > 0) goto L_0x0366
        L_0x0365:
            r0 = 0
        L_0x0366:
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x036e
            java.lang.String r1 = X.C36321k7.A0D(r1, r7)
        L_0x036e:
            if (r6 == 0) goto L_0x038a
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x038a
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0386
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r1)
            r0 = 38
            java.lang.String r1 = X.AnonymousClass000.A0t(r1, r0)
        L_0x0386:
            java.lang.String r1 = X.C36321k7.A0D(r1, r6)
        L_0x038a:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0395
            java.lang.String r0 = "media_id"
            X.C36381kD.A1M(r0, r1, r8)
        L_0x0395:
            int r1 = r2.A01
            if (r1 == 0) goto L_0x039e
            java.lang.String r0 = "edit"
            X.C165587tf.A1N(r0, r8, r1)
        L_0x039e:
            X.9nx r7 = A00(r2)
            X.9nx r6 = new X.9nx
            r0 = r20
            r6.<init>((java.lang.String) r13, (byte[]) r0, (X.AnonymousClass1AL[]) r3)
            X.1AL[] r1 = X.C165577te.A1a(r8, r5)
            if (r7 == 0) goto L_0x03bc
            r0 = 2
            X.9nx[] r0 = new X.C203399nx[r0]
            r0[r5] = r7
            r0[r10] = r6
        L_0x03b6:
            X.9nx r5 = X.C203399nx.A05(r9, r1, r0)
            goto L_0x020f
        L_0x03bc:
            X.9nx[] r0 = new X.C203399nx[r10]
            r0[r5] = r6
            goto L_0x03b6
        L_0x03c1:
            r7 = r6
            goto L_0x0356
        L_0x03c3:
            java.lang.String r15 = "media"
            goto L_0x01d4
        L_0x03c7:
            java.lang.String r15 = "poll"
            goto L_0x01d4
        L_0x03cb:
            r1 = 8
            r0 = r17
            X.777 r0 = r3.A07(r5, r0, r1)
            r0.get()
            java.util.concurrent.ConcurrentHashMap r5 = A0C
            X.1Uw r0 = r4.A04
            java.lang.String r3 = r0.getRawString()
            java.lang.String r1 = r4.fmsgKeyId
            X.9Vh r0 = new X.9Vh
            r0.<init>(r3, r1)
            r5.remove(r0)
            X.1DT r5 = r4.A00
            if (r5 != 0) goto L_0x03f3
            java.lang.String r0 = "messageLoggingBridge"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03f3:
            r7 = 1
            r8 = 1
            r9 = 1
            r11 = 0
            r6 = r2
            r5.A0N(r6, r7, r8, r9, r10, r11)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sendNewsletterMessageJob/message send job finished "
            java.lang.String r0 = A02(r4, r0, r1)
            X.C36321k7.A1a(r1, r0)
            return
        L_0x0409:
            r4.A03(r15)
            java.lang.String r0 = "cant send react to message that doesn't exist"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0413:
            r4.A03(r13)
            java.lang.String r0 = "cant send poll vote to message that doesn't exist"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x041d:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0424:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected Message add on is being sent in channel; type="
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22730Aut.A0B():void");
    }

    public static String A02(C22730Aut aut, String str, StringBuilder sb) {
        sb.append(str);
        return aut.A01();
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        C28981Uw A012 = C28981Uw.A03.A01(this.newsletterRawJid);
        if (A012 != null) {
            this.A04 = A012;
            AnonymousClass8SX r2 = null;
            try {
                Object readObject = objectInputStream.readObject();
                AnonymousClass00C.A0E(readObject, "null cannot be cast to non-null type kotlin.ByteArray");
                r2 = AnonymousClass8SX.A0i((byte[]) readObject);
                if (r2 == null) {
                    int i = this.fMessageType;
                    if (!(i == 15 || i == 64)) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        throw C90464aC.A0N(A02(this, "sendNewsletterMessageJob/message must not be null ", A0u), A0u);
                    }
                }
            } catch (OptionalDataException unused) {
                A01();
            }
            this.A05 = r2;
            StringBuilder A0u2 = AnonymousClass000.A0u();
            C36321k7.A1a(A0u2, A02(this, "sendNewsletterMessageJob/readObject done: ", A0u2));
            ConcurrentHashMap concurrentHashMap = A0C;
            synchronized (concurrentHashMap) {
                C28981Uw r0 = this.A04;
                this.A0B = concurrentHashMap.containsKey(new AnonymousClass9Vh(r0.getRawString(), this.fmsgKeyId));
                concurrentHashMap.put(new AnonymousClass9Vh(this.newsletterRawJid, this.fmsgKeyId), C36371kC.A0m());
            }
            return;
        }
        StringBuilder A0u3 = AnonymousClass000.A0u();
        throw C90464aC.A0N(A02(this, "sendNewsletterMessageJob/jid must not be null ", A0u3), A0u3);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        AnonymousClass8SX r0 = this.A05;
        if (r0 != null) {
            objectOutputStream.writeObject(r0.A0o());
        }
    }

    public void A09() {
    }

    public void A0A() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C36341k9.A1O(A0u, A02(this, "sendNewsletterMessageJob/e2e send job canceled", A0u));
        A03((AnonymousClass3T1) null);
    }

    public void Bqf(Context context) {
        C18800tq A0P = C165577te.A0P(context);
        this.A01 = A0P.Bvc();
        this.A09 = C36361kB.A0c(A0P);
        this.A06 = C36351kA.A0n(A0P);
        this.A02 = (C26171Jd) A0P.A4s.get();
        this.A03 = (AnonymousClass1DW) A0P.A2f.get();
        this.A00 = (AnonymousClass1DT) A0P.A55.get();
        this.A08 = (C28291Sb) A0P.A5C.get();
        this.A0A = A0P.Azd();
    }
}
