package X;

import android.os.Message;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1Wo  reason: invalid class name and case insensitive filesystem */
public abstract class C29421Wo implements C236319f {
    public final C19700wN A00;
    public final AtomicReference A01 = new AtomicReference();
    public final int[] A02;
    public final AnonymousClass19A A03;
    public final AnonymousClass19L A04;
    public final Set A05 = new HashSet();
    public final boolean A06;
    public final C19930wk A07;

    public final boolean BJl(Message message, int i) {
        int i2 = i;
        if (i != this.A02[0]) {
            return false;
        }
        Object obj = message.obj;
        C18740tg.A06(obj);
        C203399nx r6 = (C203399nx) obj;
        Parcelable parcelable = message.getData().getParcelable("stanzaKey");
        C18740tg.A06(parcelable);
        C207209uj r7 = (C207209uj) parcelable;
        C177798eO r1 = (C177798eO) AnonymousClass19L.A00(this.A04, 2, r7.A00);
        if (r1 != null) {
            C203399nx A0b = r6.A0b(0);
            if (A0b != null) {
                r1.A00 = A0b.A00;
            }
            r1.A04(3);
        }
        if (this.A06) {
            C19930wk r0 = this.A07;
            C18740tg.A06(r0);
            r0.execute(new C35341iX(this, r6, r7, i2, 11));
            return true;
        }
        A00(this, r6, r7, i);
        return true;
    }

    public static void A00(C29421Wo r5, C203399nx r6, C207209uj r7, int i) {
        boolean z = false;
        if (r5.A01.getAndSet(r7) == null) {
            z = true;
        }
        C18740tg.A0C(z);
        StringBuilder sb = new StringBuilder();
        sb.append("BaseNotificationHandler/handleAndAckNotification id=");
        sb.append(r6.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null));
        sb.append(" type=");
        sb.append(r6.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null));
        sb.append(" t=");
        sb.append(r6.A0i("t", (String) null));
        sb.append(" retry=");
        sb.append(r6.A0i("retry", (String) null));
        sb.append(" offline=");
        sb.append(r6.A0i("offline", (String) null));
        Log.i(sb.toString());
        try {
            r5.A07(r6, i);
        } catch (C235919b e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BaseNotificationHandler/handleAndAckNotification/corrupt-stream-error/stanza ");
            sb2.append(e.bufString);
            sb2.append(" node:");
            sb2.append(r6);
            Log.w(sb2.toString());
            C19700wN r2 = r5.A00;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("source=BaseNotificationHandler recvType=");
            sb3.append(i);
            sb3.append(" message=");
            sb3.append(e.getMessage());
            r2.A0E("CorruptStreamException", sb3.toString(), false);
        }
        r5.A04();
    }

    public final C207209uj A03() {
        Object andSet = this.A01.getAndSet((Object) null);
        C18740tg.A06(andSet);
        C207209uj r1 = (C207209uj) andSet;
        this.A05.add(r1);
        return r1;
    }

    public final void A04() {
        C207209uj r1 = (C207209uj) this.A01.getAndSet((Object) null);
        if (r1 != null && !this.A05.contains(r1)) {
            this.A03.A0H(r1);
        }
    }

    public final void A05(C207209uj r2) {
        this.A05.remove(r2);
        this.A03.A0H(r2);
    }

    public final void A06(C207209uj r4) {
        this.A05.remove(r4);
        AnonymousClass9YT A022 = r4.A02();
        A022.A08("error", "487");
        this.A03.A0H(A022.A01());
    }

    public C29421Wo(C19700wN r3, AnonymousClass19A r4, AnonymousClass19L r5, C19770wU r6, int[] iArr, boolean z) {
        C19930wk r0;
        this.A00 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = iArr;
        this.A06 = z;
        if (z) {
            r0 = new C19930wk(r6, false);
        } else {
            r0 = null;
        }
        this.A07 = r0;
    }

    public final int[] BCF() {
        return this.A02;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: X.1Nr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v66, resolved type: X.1a6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v124, resolved type: X.1Nr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v125, resolved type: X.1Nr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v126, resolved type: X.1Nr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v127, resolved type: X.1Nr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v128, resolved type: X.1Nr} */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0804, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r0.A08, 4097) != false) goto L_0x0806;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0926, code lost:
        if ("true".equals(r4.A0h("from_me")) == false) goto L_0x0928;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0b8d, code lost:
        if (r1 != null) goto L_0x0b8f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x067e  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0968  */
    /* JADX WARNING: Removed duplicated region for block: B:456:0x0b9c  */
    /* JADX WARNING: Removed duplicated region for block: B:606:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:631:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:636:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C203399nx r22, int r23) {
        /*
            r21 = this;
            r0 = r21
            boolean r2 = r0 instanceof X.C30301Zz
            r1 = r22
            r4 = r23
            if (r2 == 0) goto L_0x00ff
            X.1Zz r0 = (X.C30301Zz) r0
            r2 = 1
            X.AnonymousClass00C.A0D(r1, r2)
            r3 = 260(0x104, float:3.64E-43)
            if (r4 != r3) goto L_0x00a7
            r4 = 0
            java.lang.String r3 = "notification"
            X.C203399nx.A0A(r1, r3)
            java.lang.String r3 = "type"
            java.lang.String[] r11 = new java.lang.String[]{r3}
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r5 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            java.lang.Long r8 = java.lang.Long.valueOf(r5)
            r5 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            java.lang.Long r9 = java.lang.Long.valueOf(r5)
            r3 = 0
            java.lang.String r10 = "username"
            r12 = 0
            r6 = r1
            X.C203379ns.A03(r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r5 = "from"
            java.lang.String[] r10 = new java.lang.String[]{r5}
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            r11 = 0
            r5 = r1
            r7 = r8
            r8 = r9
            r9 = r4
            java.lang.Object r7 = X.C203379ns.A03(r5, r6, r7, r8, r9, r10, r11)
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            X.AS6 r6 = X.AS6.A00
            java.lang.String[] r5 = new java.lang.String[r3]
            X.C203539oF.A06(r1, r6, r5)
            r5 = 3
            X.Azj[] r8 = new X.C22993Azj[r5]
            X.AS7 r5 = X.AS7.A00
            r8[r3] = r5
            X.AS8 r5 = X.AS8.A00
            r8[r2] = r5
            X.AS9 r6 = X.AS9.A00
            r5 = 2
            r8[r5] = r6
            java.util.List r5 = java.util.Arrays.asList(r8)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r5)
            java.lang.String r5 = "set"
            java.lang.String[] r8 = new java.lang.String[]{r5}
            java.lang.String r6 = "Set|SetHash|Deleted"
            X.9oF r5 = X.C203379ns.A00
            java.lang.Object r8 = r5.A0a(r1, r6, r9, r8)
            X.Awq r8 = (X.C22841Awq) r8
            X.AnonymousClass00C.A08(r8)
            boolean r6 = r8 instanceof X.C35881jP
            if (r6 == 0) goto L_0x00b5
            r5 = r8
            X.1jP r5 = (X.C35881jP) r5
            int r1 = r5.A01
            if (r1 != r2) goto L_0x00b5
            X.AnonymousClass00C.A08(r7)
            java.lang.String r2 = r5.A00
            X.AnonymousClass00C.A08(r2)
        L_0x0095:
            boolean r1 = r7 instanceof X.C223313w
            if (r1 == 0) goto L_0x00a8
            X.13v r7 = (X.C223213v) r7
        L_0x009b:
            if (r7 == 0) goto L_0x00a7
            X.16y r0 = r0.A01
            r0.A04(r7, r2)
            if (r4 == 0) goto L_0x00a7
            r0.A03(r7, r4)
        L_0x00a7:
            return
        L_0x00a8:
            boolean r1 = r7 instanceof com.whatsapp.jid.PhoneUserJid
            if (r1 == 0) goto L_0x00a7
            X.12O r1 = r0.A02
            com.whatsapp.jid.PhoneUserJid r7 = (com.whatsapp.jid.PhoneUserJid) r7
            X.13w r7 = r1.A09(r7)
            goto L_0x009b
        L_0x00b5:
            boolean r1 = r8 instanceof X.C185558uQ
            if (r1 == 0) goto L_0x00c5
            X.AnonymousClass00C.A08(r7)
            X.8uQ r8 = (X.C185558uQ) r8
            X.8ro r1 = r8.A00
            java.lang.String r4 = r1.A00
            java.lang.String r2 = ""
            goto L_0x0095
        L_0x00c5:
            if (r6 == 0) goto L_0x00a7
            X.1jP r8 = (X.C35881jP) r8
            int r1 = r8.A01
            if (r1 != r3) goto L_0x00a7
            java.lang.String r4 = r8.A00
            X.AnonymousClass00C.A08(r4)
            int r1 = r4.length()
            if (r1 == 0) goto L_0x00a7
            java.nio.charset.Charset r1 = X.AnonymousClass0S4.A05
            byte[] r1 = r4.getBytes(r1)
            X.AnonymousClass00C.A08(r1)
            byte[] r4 = android.util.Base64.decode(r1, r3)
            X.AnonymousClass00C.A08(r4)
            X.5Tu r1 = X.C108515Tu.A0I
            X.6Pz r3 = new X.6Pz
            r3.<init>(r1)
            r3.A02 = r2
            X.6NS r1 = X.AnonymousClass6NS.A0K
            r3.A00 = r1
            r3.A05(r4)
            X.6Pq r1 = r3.A01()
            X.0xY r0 = r0.A00
            goto L_0x015e
        L_0x00ff:
            boolean r2 = r0 instanceof X.C31741cJ
            if (r2 == 0) goto L_0x01dc
            X.1cJ r0 = (X.C31741cJ) r0
            r2 = 1
            X.AnonymousClass00C.A0D(r1, r2)
            r2 = 236(0xec, float:3.31E-43)
            if (r4 != r2) goto L_0x00a7
            r2 = 0
            X.9nx r6 = r1.A0b(r2)
            if (r6 == 0) goto L_0x00a7
            java.lang.Class<com.whatsapp.jid.Jid> r3 = com.whatsapp.jid.Jid.class
            java.lang.String r2 = "from"
            com.whatsapp.jid.Jid r5 = r1.A0X(r3, r2)
            java.lang.String r2 = "set"
            boolean r2 = X.C203399nx.A0I(r6, r2)
            if (r2 == 0) goto L_0x01ae
            java.lang.String r2 = "hash"
            r4 = 0
            java.lang.String r3 = r6.A0i(r2, r4)
            if (r3 == 0) goto L_0x0162
            X.6NS r4 = X.AnonymousClass6NS.A0N
            X.AnonymousClass00C.A09(r4)
            r2 = 0
            int r1 = r3.length()
            if (r1 == 0) goto L_0x00a7
            java.nio.charset.Charset r1 = X.AnonymousClass0S4.A05
            byte[] r1 = r3.getBytes(r1)
            X.AnonymousClass00C.A08(r1)
            byte[] r3 = android.util.Base64.decode(r1, r2)
            java.util.Arrays.toString(r3)
            X.5Tu r2 = X.C108515Tu.A0I
            X.6Pz r1 = new X.6Pz
            r1.<init>(r2)
            r2 = 1
            r1.A02 = r2
            r1.A00 = r4
            r1.A05(r3)
            X.6Pq r1 = r1.A01()
            X.0xY r0 = r0.A01
        L_0x015e:
            X.C20430xY.A00(r0, r1, r2)
            return
        L_0x0162:
            java.lang.String r6 = r6.A0e()
            java.lang.String r2 = "t"
            java.lang.String r2 = r1.A0i(r2, r4)
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r5 = X.C222813r.A00(r5)
            if (r2 == 0) goto L_0x00a7
            if (r5 == 0) goto L_0x00a7
            long r3 = java.lang.Long.parseLong(r2)
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r5)
            boolean r1 = X.AnonymousClass143.A0I(r5)
            if (r1 == 0) goto L_0x0198
            X.12O r1 = r0.A02
            X.13w r5 = (X.C223313w) r5
            com.whatsapp.jid.PhoneUserJid r1 = r1.A0A(r5)
            if (r1 == 0) goto L_0x0198
            r2.add(r1)
        L_0x0198:
            java.util.Iterator r5 = r2.iterator()
        L_0x019c:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x00a7
            java.lang.Object r2 = r5.next()
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.16D r1 = r0.A00
            r1.A0f(r2, r6, r3)
            goto L_0x019c
        L_0x01ae:
            java.lang.String r1 = "delete"
            boolean r1 = X.C203399nx.A0I(r6, r1)
            if (r1 == 0) goto L_0x00a7
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r5 = X.C222813r.A00(r5)
            if (r5 == 0) goto L_0x00a7
            X.16D r4 = r0.A00
            X.16p r3 = r4.A05
            r1 = 0
            r0 = 0
            r3.A0V(r5, r0, r1)
            X.16z r0 = r4.A04
            java.util.Map r0 = r0.A01
            r0.remove(r5)
            android.os.Handler r2 = r4.A01
            r1 = 41
            X.1j2 r0 = new X.1j2
            r0.<init>(r4, r5, r1)
            r2.post(r0)
            return
        L_0x01dc:
            boolean r2 = r0 instanceof X.AnonymousClass1X2
            if (r2 == 0) goto L_0x0249
            X.1X2 r0 = (X.AnonymousClass1X2) r0
            r2 = 238(0xee, float:3.34E-43)
            if (r4 != r2) goto L_0x00a7
            r2 = 0
            X.9nx r6 = r1.A0b(r2)
            if (r6 == 0) goto L_0x00a7
            r2 = 0
            java.lang.String r1 = "creation"
            long r10 = r6.A0V(r1, r2)
            r7 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r7
            byte[] r9 = r6.A01
            X.0wo r1 = r0.A01
            long r2 = X.C19970wo.A00(r1)
            r4 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r2 = r2 + r4
            long r2 = r2 / r7
            java.lang.String r1 = "expiration"
            long r12 = r6.A0V(r1, r2)
            long r12 = r12 * r7
            java.lang.String r2 = "report_type"
            r1 = 0
            java.lang.String r2 = r6.A0i(r2, r1)
            if (r2 == 0) goto L_0x0246
            java.lang.String r1 = "newsletters"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0246
            X.005 r1 = r0.A04
        L_0x0221:
            java.lang.Object r8 = r1.get()
            X.3lB r8 = (X.C74173lB) r8
            r8.A0F(r9, r10, r12)
            X.17Y r4 = r0.A00
            X.14r r1 = r4.A00
            boolean r1 = r1 instanceof X.AnonymousClass4UG
            if (r1 != 0) goto L_0x0235
            r8.A06()
        L_0x0235:
            X.2by r3 = r8.A03()
            if (r3 == 0) goto L_0x00a7
            r2 = 41
            X.1jD r1 = new X.1jD
            r1.<init>(r0, r3, r2)
            r4.A0H(r1)
            return
        L_0x0246:
            X.005 r1 = r0.A03
            goto L_0x0221
        L_0x0249:
            boolean r2 = r0 instanceof X.C30281Zx
            if (r2 == 0) goto L_0x029b
            X.1Zx r0 = (X.C30281Zx) r0
            r2 = 251(0xfb, float:3.52E-43)
            if (r4 != r2) goto L_0x00a7
            X.9nx r5 = r1.A0a()
            java.lang.String r1 = "device_logout"
            boolean r1 = X.C203399nx.A0I(r5, r1)
            if (r1 == 0) goto L_0x0c18
            java.lang.String r1 = "t"
            long r2 = r5.A0U(r1)
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r6
            java.lang.String r1 = "id"
            java.lang.String r7 = r5.A0h(r1)
            java.lang.String r4 = "device"
            r1 = 0
            java.lang.String r6 = r5.A0i(r4, r1)
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x0bff
            X.3Ip r4 = new X.3Ip
            r4.<init>(r2, r6, r7)
            X.1Ww r3 = r0.A02
            X.0yC r2 = r3.A0J
            r1 = 2466(0x9a2, float:3.456E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x00a7
            X.17Y r2 = r3.A04
            r1 = 40
            X.1jD r0 = new X.1jD
            r0.<init>(r3, r4, r1)
            r2.Bp3(r0)
            return
        L_0x029b:
            boolean r2 = r0 instanceof X.C31251bW
            if (r2 == 0) goto L_0x0400
            X.1bW r0 = (X.C31251bW) r0
            java.lang.String r2 = "from"
            r8 = 0
            java.lang.String r3 = r1.A0i(r2, r8)
            if (r3 == 0) goto L_0x0304
            java.lang.String r2 = "0@s.whatsapp.net"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0304
            java.lang.String r2 = "surfaces"
            java.util.List r2 = r1.A0j(r2)
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x02de
            java.lang.String r2 = "PSANotificationHandler/QpSurface Notification"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.9uj r5 = r0.A03()
            X.0yC r4 = r0.A07
            r3 = 3536(0xdd0, float:4.955E-42)
            X.0yV r2 = X.C21000yV.A02
            boolean r2 = X.C20800yB.A01(r2, r4, r3)
            if (r2 != 0) goto L_0x0ccf
            java.lang.String r1 = "PSANotificationHandler/QpSurface received but not enabled"
        L_0x02d7:
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x02da:
            r0.A06(r5)
            return
        L_0x02de:
            java.lang.String r2 = "psa_wakeup"
            java.util.List r2 = r1.A0j(r2)
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0ced
            java.lang.String r2 = "PSANotificationHandler/Push PSA Notification"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.9uj r5 = r0.A03()
            X.0yC r4 = r0.A07
            r3 = 4200(0x1068, float:5.885E-42)
            X.0yV r2 = X.C21000yV.A02
            boolean r2 = X.C20800yB.A01(r2, r4, r3)
            if (r2 != 0) goto L_0x0cd9
            java.lang.String r1 = "PSANotificationHandler/Push PSA not enabled"
            goto L_0x02d7
        L_0x0304:
            java.lang.String r2 = "campaign"
            X.9nx r5 = r1.A0c(r2)
            r4 = 0
            if (r5 == 0) goto L_0x0313
            java.lang.String r2 = "id"
            java.lang.String r8 = r5.A0i(r2, r8)
        L_0x0313:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "PSANotificationHandler/handleStatusPSANotification/campaignID "
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            if (r5 == 0) goto L_0x032f
            java.lang.String r2 = "revoke"
            java.util.List r4 = r5.A0j(r2)
        L_0x032f:
            r6 = 27
            if (r4 == 0) goto L_0x034c
            int r2 = r4.size()
            if (r2 <= 0) goto L_0x034c
            X.9uj r5 = r0.A03()
            if (r8 == 0) goto L_0x02da
            X.1C7 r3 = r0.A02
            r1 = 9
            X.1im r2 = new X.1im
            r2.<init>(r0, r5, r8, r1)
        L_0x0348:
            r3.A01(r2, r6)
            return
        L_0x034c:
            r2 = 0
            if (r5 == 0) goto L_0x0356
            java.lang.String r4 = "duration"
            long r2 = r5.A0V(r4, r2)
        L_0x0356:
            java.lang.String r4 = "message"
            if (r5 == 0) goto L_0x03e5
            java.util.List r4 = r5.A0j(r4)
        L_0x035e:
            long r14 = X.C31251bW.A01(r1, r0)
            if (r4 == 0) goto L_0x00a7
            int r1 = r4.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r1)
            java.util.Iterator r13 = r4.iterator()
        L_0x0371:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x03eb
            java.lang.Object r10 = r13.next()
            X.9nx r10 = (X.C203399nx) r10
            X.0yC r5 = r0.A07
            r4 = 7225(0x1c39, float:1.0124E-41)
            X.0yV r1 = X.C21000yV.A02
            boolean r1 = X.C20800yB.A01(r1, r5, r4)
            if (r1 != 0) goto L_0x0395
            r4 = 0
            java.lang.String r1 = "order"
            long r4 = r10.A0V(r1, r4)     // Catch:{ 19b -> 0x0397 }
            r11 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r11
            goto L_0x03ac
        L_0x0395:
            r4 = r14
            goto L_0x03ac
        L_0x0397:
            r11 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "connection/getMessagesPsaFromProtocolTree: "
            r9.append(r1)
            r9.append(r11)
            java.lang.String r1 = r9.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x03ac:
            java.lang.String r9 = "id"
            r1 = 0
            java.lang.String r12 = r10.A0i(r9, r1)
            r11 = 0
            X.9nx r10 = r10.A0b(r11)
            if (r10 == 0) goto L_0x0371
            X.8dw r9 = X.C177528dw.A00
            X.3Qa r1 = new X.3Qa
            r1.<init>(r9, r12, r11)
            X.2bV r11 = new X.2bV
            r11.<init>(r1, r4)
            byte[] r1 = r10.A01
            r11.A1B(r1)
            r9 = 1000(0x3e8, double:4.94E-321)
            long r4 = r2 * r9
            r9 = 0
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x03e3
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x03da:
            X.3SA r1 = new X.3SA
            r1.<init>(r11, r8, r4)
            r7.add(r1)
            goto L_0x0371
        L_0x03e3:
            long r4 = r4 + r14
            goto L_0x03da
        L_0x03e5:
            java.util.List r4 = r1.A0j(r4)
            goto L_0x035e
        L_0x03eb:
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x00a7
            X.9uj r4 = r0.A03()
            X.1C7 r3 = r0.A02
            r1 = 12
            X.1j3 r2 = new X.1j3
            r2.<init>(r7, r4, r0, r1)
            goto L_0x0348
        L_0x0400:
            boolean r2 = r0 instanceof X.C31101bH
            if (r2 == 0) goto L_0x0478
            X.1bH r0 = (X.C31101bH) r0
            r2 = 235(0xeb, float:3.3E-43)
            if (r4 != r2) goto L_0x00a7
            r2 = 0
            X.9nx r3 = r1.A0b(r2)
            if (r3 == 0) goto L_0x00a7
            java.lang.String r1 = "log"
            boolean r1 = X.C203399nx.A0I(r3, r1)
            if (r1 == 0) goto L_0x0447
            X.1bS r3 = r0.A03
            r3.A07()
            X.0wG r1 = r0.A00
            android.content.Context r4 = r1.A00
            java.lang.String r7 = ""
            r5 = 0
            r2 = 1
            java.lang.String r10 = "NotCalculated"
            r14 = -1
            r19 = 0
            r8 = r5
            r9 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r16 = -1
            r18 = 1
            r20 = 0
            r6 = r5
            java.lang.String r1 = r3.A05(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20)
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0wN r1 = r0.A00
            java.lang.String r0 = "AppMessagingXmppHandler/onLogNotification"
            r1.A0E(r0, r5, r2)
            return
        L_0x0447:
            java.lang.String r1 = "props"
            boolean r1 = X.C203399nx.A0I(r3, r1)
            if (r1 == 0) goto L_0x0456
            X.1C4 r1 = r0.A02
            r0 = 1
            r1.A05(r0)
            return
        L_0x0456:
            java.lang.String r1 = "abprops"
            boolean r1 = X.C203399nx.A0I(r3, r1)
            if (r1 == 0) goto L_0x0a7d
            X.1bT r2 = r0.A01
            r1 = 1
            X.19J r0 = r2.A00
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = "sendmethods/sendGetABProps"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.004 r0 = r2.A01
            java.lang.Object r0 = r0.get()
            X.649 r0 = (X.AnonymousClass649) r0
            r0.A00(r1)
            return
        L_0x0478:
            boolean r2 = r0 instanceof X.C31231bU
            if (r2 == 0) goto L_0x04c1
            X.1bU r0 = (X.C31231bU) r0
            r2 = 241(0xf1, float:3.38E-43)
            if (r4 != r2) goto L_0x00a7
            r2 = 0
            X.9nx r6 = r1.A0b(r2)
            if (r6 == 0) goto L_0x00a7
            X.9uj r5 = r0.A03()
            X.19L r7 = r0.A07
            long r2 = r5.A00
            r4 = 2
            X.9ju r3 = X.AnonymousClass19L.A00(r7, r4, r2)
            X.8eO r3 = (X.C177798eO) r3
            if (r3 == 0) goto L_0x049e
            java.lang.String r2 = r6.A00
            r3.A00 = r2
        L_0x049e:
            java.lang.String r2 = "count"
            boolean r2 = X.C203399nx.A0I(r6, r2)
            if (r2 == 0) goto L_0x0d3e
            java.lang.String r1 = "value"
            int r4 = r6.A0R(r1)
            X.189 r1 = r0.A03
            boolean r1 = r1.A0X()
            if (r1 == 0) goto L_0x0d2f
            X.0wU r3 = r0.A0A
            r2 = 35
            X.1iP r1 = new X.1iP
            r1.<init>((java.lang.Object) r0, (int) r4, (int) r2, (java.lang.Object) r5)
            r3.Boy(r1)
            return
        L_0x04c1:
            boolean r2 = r0 instanceof X.C30251Zu
            if (r2 == 0) goto L_0x0684
            X.1Zu r0 = (X.C30251Zu) r0
            r3 = 1
            X.AnonymousClass00C.A0D(r1, r3)
            r2 = 253(0xfd, float:3.55E-43)
            if (r4 == r2) goto L_0x04de
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AvatarUpdateNotificationHandler/invalid notification type: "
            r1.append(r0)
            r1.append(r4)
            goto L_0x0ec0
        L_0x04de:
            java.lang.String r7 = "type"
            X.1AL r8 = r1.A0Z(r7)
            r2 = 0
            if (r8 == 0) goto L_0x0504
            java.lang.String r5 = r8.A03
        L_0x04e9:
            java.lang.String r6 = "avatars:update"
            boolean r5 = X.AnonymousClass00C.A0J(r5, r6)
            if (r5 != 0) goto L_0x0506
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AvatarUpdateNotificationHandler/invalid type: "
            r1.append(r0)
            if (r8 == 0) goto L_0x04ff
            java.lang.String r2 = r8.A03
        L_0x04ff:
            r1.append(r2)
            goto L_0x0ec0
        L_0x0504:
            r5 = r2
            goto L_0x04e9
        L_0x0506:
            X.1BF r5 = r0.A02
            boolean r5 = r5.A01()
            if (r5 != 0) goto L_0x052c
            java.lang.String r1 = "AvatarUpdateNotificationHandler/received avatar update notification but user has no avatar"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.1Ae r2 = r0.A05
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "notificationType="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "avatar_notification_received_user_has_no_avatar"
            r2.A02(r3, r0, r1)
            return
        L_0x052c:
            r4 = 0
            java.lang.String r5 = "notification"
            X.C203399nx.A0A(r1, r5)     // Catch:{ all -> 0x0672 }
            java.lang.String r5 = "from"
            java.lang.String[] r14 = new java.lang.String[]{r5}     // Catch:{ all -> 0x0672 }
            java.lang.Class<X.8e2> r10 = X.C177588e2.class
            X.8e2 r13 = X.C177588e2.A00     // Catch:{ all -> 0x0672 }
            r8 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            java.lang.Long r11 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0672 }
            r8 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            java.lang.Long r12 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0672 }
            r5 = 0
            r15 = 0
            r9 = r1
            X.C203379ns.A03(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0672 }
            java.lang.String[] r14 = new java.lang.String[]{r7}     // Catch:{ all -> 0x0672 }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r13 = r6
            X.C203379ns.A03(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0672 }
            java.lang.String r6 = "to"
            java.lang.String[] r18 = new java.lang.String[]{r6}     // Catch:{ all -> 0x0672 }
            java.lang.Class<com.whatsapp.jid.UserJid> r14 = com.whatsapp.jid.UserJid.class
            r9 = 0
            r19 = 0
            r13 = r1
            r15 = r11
            r16 = r12
            r17 = r2
            X.C203539oF.A07(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0672 }
            X.AIO r6 = X.AIO.A00     // Catch:{ all -> 0x0672 }
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ all -> 0x0672 }
            X.C203539oF.A06(r1, r6, r5)     // Catch:{ all -> 0x0672 }
            java.lang.String r5 = "fbid"
            java.lang.String[] r6 = new java.lang.String[]{r5}     // Catch:{ all -> 0x0672 }
            X.6xr r5 = X.C147836xr.A00     // Catch:{ all -> 0x0672 }
            java.lang.Object r6 = X.C203379ns.A02(r1, r5, r6)     // Catch:{ all -> 0x0672 }
            X.5PU r6 = (X.AnonymousClass5PU) r6     // Catch:{ all -> 0x0672 }
            java.lang.String r5 = "revision"
            java.lang.String[] r7 = new java.lang.String[]{r5}     // Catch:{ all -> 0x0672 }
            X.6xs r5 = X.C147846xs.A00     // Catch:{ all -> 0x0672 }
            java.lang.Object r5 = X.C203379ns.A02(r1, r5, r7)     // Catch:{ all -> 0x0672 }
            X.1jK r5 = (X.C35831jK) r5     // Catch:{ all -> 0x0672 }
            java.lang.String r7 = "event_type"
            java.lang.String[] r8 = new java.lang.String[]{r7}     // Catch:{ all -> 0x0672 }
            X.6xt r7 = X.C147856xt.A00     // Catch:{ all -> 0x0672 }
            java.lang.Object r8 = X.C203379ns.A02(r1, r7, r8)     // Catch:{ all -> 0x0672 }
            X.1jK r8 = (X.C35831jK) r8     // Catch:{ all -> 0x0672 }
            java.lang.String r7 = "artifact"
            java.lang.String[] r12 = new java.lang.String[]{r7}     // Catch:{ all -> 0x0672 }
            X.3pj r11 = X.C76963pj.A00     // Catch:{ all -> 0x0672 }
            r13 = 0
            r15 = 10000(0x2710, double:4.9407E-320)
            r10 = r1
            X.C203539oF.A09(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x0672 }
            if (r8 == 0) goto L_0x05bd
            java.lang.Object r1 = r8.A00     // Catch:{ all -> 0x0672 }
            X.8rj r1 = (X.C183998rj) r1     // Catch:{ all -> 0x0672 }
            if (r1 == 0) goto L_0x05bd
            java.lang.String r2 = r1.A00     // Catch:{ all -> 0x0672 }
        L_0x05bd:
            java.lang.String r1 = "revision_update"
            boolean r1 = X.AnonymousClass00C.A0J(r2, r1)     // Catch:{ all -> 0x0672 }
            if (r1 == 0) goto L_0x05d7
            X.0yC r3 = r0.A01     // Catch:{ all -> 0x0672 }
            r2 = 3275(0xccb, float:4.589E-42)
            X.0yV r1 = X.C21000yV.A02     // Catch:{ all -> 0x0672 }
            boolean r1 = X.C20800yB.A01(r1, r3, r2)     // Catch:{ all -> 0x0672 }
            if (r1 == 0) goto L_0x0662
            if (r5 != 0) goto L_0x0648
            java.lang.String r0 = "AvatarUpdateNotificationHandler/revision is null"
            goto L_0x065f
        L_0x05d7:
            java.lang.String r1 = "social_update"
            boolean r1 = X.AnonymousClass00C.A0J(r2, r1)     // Catch:{ all -> 0x0672 }
            if (r1 == 0) goto L_0x0662
            X.0yC r5 = r0.A01     // Catch:{ all -> 0x0672 }
            r2 = 5979(0x175b, float:8.378E-42)
            X.0yV r1 = X.C21000yV.A02     // Catch:{ all -> 0x0672 }
            boolean r1 = X.C20800yB.A01(r1, r5, r2)     // Catch:{ all -> 0x0672 }
            if (r1 == 0) goto L_0x0662
            if (r6 != 0) goto L_0x05f0
            java.lang.String r0 = "AvatarUpdateNotificationHandler/social id is null"
            goto L_0x065f
        L_0x05f0:
            java.lang.String r5 = r6.A00     // Catch:{ all -> 0x0672 }
            X.AnonymousClass00C.A08(r5)     // Catch:{ all -> 0x0672 }
            X.005 r1 = r0.A08     // Catch:{ all -> 0x0672 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0672 }
            X.1XW r1 = (X.AnonymousClass1XW) r1     // Catch:{ all -> 0x0672 }
            X.6OQ r1 = r1.A00()     // Catch:{ all -> 0x0672 }
            r6 = 0
            if (r1 == 0) goto L_0x060e
            X.6c7 r1 = r1.A04     // Catch:{ all -> 0x0672 }
            java.lang.Object r1 = r1.A00     // Catch:{ all -> 0x0672 }
            if (r1 == 0) goto L_0x060e
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0672 }
        L_0x060e:
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x0672 }
            X.005 r1 = r0.A06     // Catch:{ all -> 0x0672 }
            java.lang.Object r2 = r1.get()     // Catch:{ all -> 0x0672 }
            X.0xB r2 = (X.C20200xB) r2     // Catch:{ all -> 0x0672 }
            if (r4 != 0) goto L_0x0620
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ all -> 0x0672 }
            r6[r9] = r5     // Catch:{ all -> 0x0672 }
        L_0x0620:
            X.1Bp r1 = r2.A01     // Catch:{ all -> 0x0672 }
            java.io.File r1 = r1.A02(r6)     // Catch:{ all -> 0x0672 }
            boolean r1 = X.C14360lV.A00(r1)     // Catch:{ all -> 0x0672 }
            if (r1 == 0) goto L_0x0633
            X.1HA r1 = r2.A00     // Catch:{ all -> 0x0672 }
            java.util.concurrent.ConcurrentHashMap r1 = r1.A0E     // Catch:{ all -> 0x0672 }
            r1.clear()     // Catch:{ all -> 0x0672 }
        L_0x0633:
            X.005 r0 = r0.A07     // Catch:{ all -> 0x0672 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0672 }
            X.5mp r0 = (X.C117785mp) r0     // Catch:{ all -> 0x0672 }
            X.0sR r0 = r0.A00     // Catch:{ all -> 0x0672 }
            java.lang.Object r0 = r0.BwE(r5)     // Catch:{ all -> 0x0672 }
            boolean r0 = r0 instanceof X.C06340Tf     // Catch:{ all -> 0x0672 }
            if (r0 == 0) goto L_0x0662
            java.lang.String r0 = "AvatarSocialStickerReloadSignal/unable to send signal"
            goto L_0x065f
        L_0x0648:
            java.lang.Object r1 = r5.A00     // Catch:{ all -> 0x0672 }
            X.8rj r1 = (X.C183998rj) r1     // Catch:{ all -> 0x0672 }
            java.lang.String r4 = r1.A00     // Catch:{ all -> 0x0672 }
            X.AnonymousClass00C.A08(r4)     // Catch:{ all -> 0x0672 }
            X.1Bt r1 = r0.A03     // Catch:{ all -> 0x0672 }
            java.lang.String r1 = r1.A01()     // Catch:{ all -> 0x0672 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0672 }
            if (r1 == 0) goto L_0x0665
            java.lang.String r0 = "AvatarUpdateNotificationHandler/received notification for same revision, ignoring"
        L_0x065f:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0672 }
        L_0x0662:
            X.0AJ r1 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x0672 }
            goto L_0x0678
        L_0x0665:
            X.17Y r3 = r0.A00     // Catch:{ all -> 0x0672 }
            r2 = 13
            X.1il r1 = new X.1il     // Catch:{ all -> 0x0672 }
            r1.<init>(r2, r4, r0)     // Catch:{ all -> 0x0672 }
            r3.A0H(r1)     // Catch:{ all -> 0x0672 }
            goto L_0x0662
        L_0x0672:
            r0 = move-exception
            X.03N r1 = new X.03N
            r1.<init>(r0)
        L_0x0678:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r1)
            if (r1 == 0) goto L_0x00a7
            java.lang.String r0 = "AvatarUpdateNotificationHandler/Unable to process avatar update notification."
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0684:
            boolean r2 = r0 instanceof X.C30271Zw
            if (r2 == 0) goto L_0x0734
            X.1Zw r0 = (X.C30271Zw) r0
            r2 = 1
            X.AnonymousClass00C.A0D(r1, r2)
            r2 = 234(0xea, float:3.28E-43)
            if (r4 != r2) goto L_0x00a7
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            java.lang.String r2 = "tokens"
            X.9nx r3 = r1.A0d(r2)
            java.lang.String r2 = "token"
            java.util.List r2 = r3.A0j(r2)
            X.AnonymousClass00C.A08(r2)
            java.util.Iterator r9 = r2.iterator()
        L_0x06aa:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0719
            java.lang.Object r8 = r9.next()
            X.9nx r8 = (X.C203399nx) r8
            java.lang.String r2 = "type"
            java.lang.String r4 = r8.A0h(r2)
            int r3 = r4.hashCode()
            r2 = -1148920077(0xffffffffbb84def3, float:-0.004054898)
            if (r3 == r2) goto L_0x06f9
            r2 = 1266415832(0x4b7bf8d8, float:1.651324E7)
            if (r3 != r2) goto L_0x06aa
            java.lang.String r2 = "trusted_contact"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x06aa
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            java.lang.String r2 = "from"
            com.whatsapp.jid.Jid r7 = r1.A0X(r3, r2)
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            if (r7 == 0) goto L_0x06aa
            byte[] r5 = r8.A01
            if (r5 == 0) goto L_0x0dc9
            java.lang.String r4 = "t"
            long r2 = r1.A0U(r4)
            long r3 = r8.A0V(r4, r2)
            X.1DM r2 = r0.A01
            int r3 = r2.A04(r7, r5, r3)
            r2 = 2
            if (r3 == r2) goto L_0x06aa
            r6.add(r7)
            goto L_0x06aa
        L_0x06f9:
            java.lang.String r2 = "trusted_contact_outgoing"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x06aa
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            java.lang.String r2 = "jid"
            com.whatsapp.jid.Jid r5 = r8.A0X(r3, r2)
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            if (r5 == 0) goto L_0x06aa
            java.lang.String r2 = "t"
            long r3 = r8.A0U(r2)
            X.1DM r2 = r0.A01
            r2.A0B(r5, r3)
            goto L_0x06aa
        L_0x0719:
            java.util.Iterator r5 = r6.iterator()
        L_0x071d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x00a7
            java.lang.Object r4 = r5.next()
            X.17Y r3 = r0.A00
            r2 = 18
            X.1jD r1 = new X.1jD
            r1.<init>(r0, r4, r2)
            r3.A0H(r1)
            goto L_0x071d
        L_0x0734:
            boolean r2 = r0 instanceof X.C30371a6
            if (r2 == 0) goto L_0x078f
            X.1a6 r0 = (X.C30371a6) r0
            r5 = 1
            X.AnonymousClass00C.A0D(r1, r5)
            java.lang.String r2 = "update"
            X.9nx r3 = r1.A0d(r2)
            java.lang.String r2 = "hash"
            java.lang.String r6 = r3.A0h(r2)
            X.9iW r4 = new X.9iW
            r4.<init>(r6)
            java.lang.String r3 = "offline"
            r2 = 0
            java.lang.String r1 = r1.A0i(r3, r2)
            if (r1 != 0) goto L_0x0dd1
            X.19J r1 = r0.A02
            boolean r1 = r1.A02()
            if (r1 != 0) goto L_0x0dd1
            X.0yC r3 = r0.A09
            r2 = 7113(0x1bc9, float:9.967E-42)
            X.0yV r1 = X.C21000yV.A02
            boolean r1 = X.C20800yB.A01(r1, r3, r2)
            if (r1 == 0) goto L_0x076f
            r0.A04()
        L_0x076f:
            X.0wN r6 = r0.A00
            X.0wQ r7 = r0.A01
            X.16D r8 = r0.A03
            X.1Nr r9 = r0.A04
            X.17i r10 = r0.A08
            X.1OD r11 = r0.A07
            X.1O5 r12 = r0.A05
            X.9iW[] r0 = new X.C200949iW[r5]
            r14 = 0
            r0[r14] = r4
            java.util.ArrayList r13 = X.AnonymousClass03T.A03(r0)
            X.1ik r5 = new X.1ik
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r5.run()
            return
        L_0x078f:
            boolean r2 = r0 instanceof X.C30261Zv
            if (r2 == 0) goto L_0x081f
            X.1Zv r0 = (X.C30261Zv) r0
            java.lang.String r2 = "add"
            X.9nx r7 = r1.A0c(r2)
            java.lang.String r2 = "remove"
            X.9nx r6 = r1.A0c(r2)
            r4 = r6
            if (r7 == 0) goto L_0x07a5
            r4 = r7
        L_0x07a5:
            java.lang.Class<X.13w> r3 = X.C223313w.class
            java.lang.String r2 = "lid"
            com.whatsapp.jid.Jid r5 = r1.A0X(r3, r2)
            if (r4 == 0) goto L_0x0e5b
            java.lang.String r2 = "device_hash"
            java.lang.String r13 = r4.A0h(r2)
            java.lang.String r2 = "device_lid_hash"
            r14 = 0
            java.lang.String r3 = r4.A0i(r2, r14)
            java.lang.String r2 = "key-index-list"
            X.9nx r4 = r4.A0c(r2)
            if (r5 == 0) goto L_0x081d
            if (r3 == 0) goto L_0x081d
            X.00I r9 = new X.00I
            r9.<init>(r5, r3)
        L_0x07cb:
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            java.lang.String r2 = "from"
            com.whatsapp.jid.Jid r12 = r1.A0Y(r3, r2)
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12
            X.C18740tg.A06(r13)
            X.0wy r10 = X.AnonymousClass9Ze.A01(r7)
            X.0wy r11 = X.AnonymousClass9Ze.A01(r6)
            if (r4 != 0) goto L_0x0814
            r15 = 0
        L_0x07e4:
            X.9iW r8 = new X.9iW
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r3 = "offline"
            r2 = 0
            java.lang.String r1 = r1.A0i(r3, r2)
            if (r1 != 0) goto L_0x0806
            X.19J r1 = r0.A02
            boolean r1 = r1.A02()
            if (r1 == 0) goto L_0x0e30
            X.0yC r3 = r0.A08
            r2 = 4097(0x1001, float:5.741E-42)
            X.0yV r1 = X.C21000yV.A02
            boolean r1 = X.C20800yB.A01(r1, r3, r2)
            if (r1 == 0) goto L_0x0e30
        L_0x0806:
            com.whatsapp.jid.UserJid r1 = r8.A06
            X.C18740tg.A06(r1)
            X.1Nr r0 = r0.A04
            java.util.Set r1 = java.util.Collections.singleton(r1)
            monitor-enter(r0)
            goto L_0x0e05
        L_0x0814:
            byte[] r14 = r4.A01
            java.lang.String r2 = "ts"
            long r15 = r4.A0U(r2)
            goto L_0x07e4
        L_0x081d:
            r9 = r14
            goto L_0x07cb
        L_0x081f:
            boolean r2 = r0 instanceof X.C29431Wp
            if (r2 == 0) goto L_0x0903
            X.1Wp r0 = (X.C29431Wp) r0
            r2 = 210(0xd2, float:2.94E-43)
            if (r4 != r2) goto L_0x00a7
            java.lang.String r2 = "notification"
            X.C203399nx.A0A(r1, r2)
            java.lang.String r2 = "from"
            java.lang.String[] r10 = new java.lang.String[]{r2}
            java.lang.Class<X.8e2> r6 = X.C177588e2.class
            X.8e2 r9 = X.C177588e2.A00
            r2 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            r2 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            r4 = 0
            r11 = 0
            r5 = r1
            X.C203379ns.A03(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r2 = "type"
            java.lang.String[] r10 = new java.lang.String[]{r2}
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.String r9 = "server_sync"
            X.C203379ns.A03(r5, r6, r7, r8, r9, r10, r11)
            X.ARl r3 = X.C21593ARl.A00
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.Object r5 = X.C203539oF.A06(r1, r3, r2)
            X.8s5 r5 = (X.C184218s5) r5
            java.lang.String r2 = "collection"
            java.lang.String[] r9 = new java.lang.String[]{r2}
            X.ARm r8 = X.C21594ARm.A00
            r10 = 1
            r12 = 20
            r2 = 0
            X.AnonymousClass00C.A0D(r1, r4)
            r7 = r1
            java.util.ArrayList r1 = X.C203539oF.A09(r7, r8, r9, r10, r12)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r9 = r1.iterator()
        L_0x0885:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x08c2
            java.lang.Object r1 = r9.next()
            X.1jN r1 = (X.C35861jN) r1
            java.lang.String r8 = r1.A01
            java.lang.Object r3 = r1.A00
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L_0x0885
            r4.put(r8, r3)
            java.lang.Long r1 = r5.A00
            if (r1 == 0) goto L_0x0885
            r6 = 0
            java.util.Map r3 = r0.A02
            boolean r1 = r3.containsKey(r8)
            if (r1 == 0) goto L_0x08b9
            java.lang.Object r1 = r3.get(r8)
            X.C18740tg.A06(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            long r6 = r1.longValue()
        L_0x08b9:
            long r6 = r6 + r10
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r3.put(r8, r1)
            goto L_0x0885
        L_0x08c2:
            X.196 r5 = r0.A00
            boolean r0 = r5.A0S()
            if (r0 != 0) goto L_0x08d9
            X.0wp r0 = r5.A0M
            android.content.SharedPreferences r1 = X.C19980wp.A00(r0)
            java.lang.String r0 = "companion_syncd_critical_bootstrap_state"
            int r1 = r1.getInt(r0, r2)
            r0 = 1
            if (r1 != r0) goto L_0x00a7
        L_0x08d9:
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x08e1:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0e68
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            X.1IT r3 = r5.A0Q
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r3.A04(r2, r0)
            goto L_0x08e1
        L_0x0903:
            boolean r2 = r0 instanceof X.AnonymousClass1ZH
            if (r2 == 0) goto L_0x0aab
            X.1ZH r0 = (X.AnonymousClass1ZH) r0
            r2 = 97
            if (r4 != r2) goto L_0x00a7
            java.lang.String r2 = "rmr"
            X.9nx r4 = r1.A0c(r2)
            r8 = 0
            r7 = 1
            r12 = 0
            if (r4 == 0) goto L_0x0928
            r12 = 1
            java.lang.String r2 = "from_me"
            java.lang.String r3 = r4.A0h(r2)
            java.lang.String r2 = "true"
            boolean r2 = r2.equals(r3)
            r5 = 1
            if (r2 != 0) goto L_0x09aa
        L_0x0928:
            r5 = 0
            if (r12 != 0) goto L_0x09aa
            java.lang.Class<com.whatsapp.jid.Jid> r3 = com.whatsapp.jid.Jid.class
            java.lang.String r2 = "from"
            com.whatsapp.jid.Jid r2 = r1.A0Y(r3, r2)
        L_0x0933:
            X.11F r4 = X.AnonymousClass143.A00(r2)
            java.lang.String r2 = "id"
            java.lang.String r10 = r1.A0h(r2)
            X.3Qa r3 = new X.3Qa
            r3.<init>(r4, r10, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "media retry notification received; stanzaKeyId="
            r4.append(r2)
            r4.append(r10)
            java.lang.String r9 = "; key="
            r4.append(r9)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.1A1 r2 = r0.A02
            X.3T1 r6 = r2.A03(r3)
            boolean r2 = r6 instanceof X.AnonymousClass2bU
            if (r2 == 0) goto L_0x00a7
            X.2bU r6 = (X.AnonymousClass2bU) r6
            X.3Qj r5 = r6.A01
            if (r5 == 0) goto L_0x0e8b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "media auto download re-enabled; stanzaKeyId="
            r4.append(r2)
            r4.append(r10)
            r4.append(r9)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.lang.String r2 = "encrypt"
            X.9nx r4 = r1.A0c(r2)
            java.lang.String r2 = "enc_p"
            r9 = 0
            if (r4 == 0) goto L_0x09a8
            X.9nx r2 = r4.A0c(r2)
            if (r2 == 0) goto L_0x09a8
            byte[] r11 = r2.A01
        L_0x099b:
            java.lang.String r2 = "enc_iv"
            if (r4 == 0) goto L_0x09b3
            X.9nx r2 = r4.A0c(r2)
            if (r2 == 0) goto L_0x09b3
            byte[] r10 = r2.A01
            goto L_0x09b4
        L_0x09a8:
            r11 = r9
            goto L_0x099b
        L_0x09aa:
            java.lang.Class<com.whatsapp.jid.Jid> r3 = com.whatsapp.jid.Jid.class
            java.lang.String r2 = "jid"
            com.whatsapp.jid.Jid r2 = r4.A0Y(r3, r2)
            goto L_0x0933
        L_0x09b3:
            r10 = r9
        L_0x09b4:
            java.lang.String r4 = r3.A01     // Catch:{ 186 -> 0x0e84 }
            byte[] r3 = r5.A0a     // Catch:{ 186 -> 0x0e84 }
            X.C18740tg.A06(r3)     // Catch:{ 186 -> 0x0e84 }
            if (r11 == 0) goto L_0x09d8
            if (r10 == 0) goto L_0x09d8
            X.AnonymousClass00C.A0D(r3, r7)     // Catch:{ 186 -> 0x0e84 }
            r2 = 2
            X.AnonymousClass00C.A0D(r4, r2)     // Catch:{ 186 -> 0x0e84 }
            X.AnonymousClass1Y8.A00(r3, r10)     // Catch:{ 186 -> 0x0e84 }
            r2 = 3
            java.lang.Object r2 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOOO(r2, r4, r11, r3, r10)     // Catch:{ 186 -> 0x0e84 }
            com.facebook.simplejni.NativeHolder r2 = (com.facebook.simplejni.NativeHolder) r2     // Catch:{ 186 -> 0x0e84 }
            if (r2 == 0) goto L_0x0e6c
            X.6JR r9 = new X.6JR     // Catch:{ 186 -> 0x0e84 }
            r9.<init>(r2)     // Catch:{ 186 -> 0x0e84 }
            goto L_0x09da
        L_0x09d8:
            r2 = 0
            goto L_0x09e8
        L_0x09da:
            com.whatsapp.wamsys.JniBridge.getInstance()
            com.facebook.simplejni.NativeHolder r4 = r9.A00
            r2 = 38
            long r2 = (long) r2
            java.lang.Object r2 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r7, r2, r4)
            java.lang.String r2 = (java.lang.String) r2
        L_0x09e8:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x09f0
            r5.A0J = r2
        L_0x09f0:
            if (r9 == 0) goto L_0x0a70
            com.whatsapp.wamsys.JniBridge.getInstance()
            com.facebook.simplejni.NativeHolder r9 = r9.A00
            r3 = 39
            long r3 = (long) r3
            long r3 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r7, r3, r9)
            int r9 = (int) r3
        L_0x09ff:
            java.lang.String r3 = "error"
            X.9nx r3 = r1.A0c(r3)
            if (r3 == 0) goto L_0x0a0d
            java.lang.String r1 = "code"
            int r9 = r3.A0S(r1, r8)
        L_0x0a0d:
            if (r12 == 0) goto L_0x0a6c
            r1 = 2
            if (r9 == r1) goto L_0x0a15
            r1 = 3
            if (r9 != r1) goto L_0x0a6c
        L_0x0a15:
            X.0xM r1 = r0.A00
            r1.A0k(r6)
            X.1Ye r5 = r0.A01
            X.1ST r4 = r5.A06
            X.3Qj r1 = r6.A01
            java.lang.String r3 = ", message.mediaHash="
            if (r1 != 0) goto L_0x0a4a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/resumeReuploadingDownload/MMS unable to resume download due to missing media data; message.key = "
        L_0x0a2b:
            r1.append(r0)
            X.3Qa r0 = r6.A1J
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r6.A04
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            if (r8 == 0) goto L_0x00a7
            r5.A02(r6)
            java.lang.String r0 = "media retry notification; queue auto download"
            goto L_0x0aa7
        L_0x0a4a:
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x0a56
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/resumeReuploadingDownload/MMS unable to resume download; not transferring; message.key = "
            goto L_0x0a2b
        L_0x0a56:
            X.1SU r0 = r4.A0E
            X.4xN r1 = r0.A00(r1)
            if (r1 == 0) goto L_0x0a64
            if (r2 == 0) goto L_0x0a75
            X.6Fp r0 = r1.A0e
            monitor-enter(r0)
            goto L_0x0a72
        L_0x0a64:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/resumeReuploadingDownload/MMS unable to resume download; downloader not found; message.key = "
            goto L_0x0a2b
        L_0x0a6c:
            r8 = 1
            r5.A0Q = r7
            goto L_0x0a15
        L_0x0a70:
            r9 = 1
            goto L_0x09ff
        L_0x0a72:
            r0.A0E = r2     // Catch:{ all -> 0x0e74 }
            monitor-exit(r0)
        L_0x0a75:
            java.util.concurrent.CountDownLatch r0 = r1.A0z
            r0.countDown()
            java.lang.String r0 = "media retry notification; resume reuploading download"
            goto L_0x0aa7
        L_0x0a7d:
            java.lang.String r1 = "push-config"
            boolean r1 = X.C203399nx.A0I(r3, r1)
            if (r1 == 0) goto L_0x00a7
            java.lang.String r2 = "type"
            r1 = 0
            java.lang.String r2 = r3.A0i(r2, r1)
            if (r2 == 0) goto L_0x0e77
            java.lang.String r1 = "gcm"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x0e77
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "push-config notification: unknown type "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
        L_0x0aa7:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0aab:
            boolean r2 = r0 instanceof X.C30441aD
            if (r2 == 0) goto L_0x0b41
            X.1aD r0 = (X.C30441aD) r0
            r2 = 1
            X.AnonymousClass00C.A0D(r1, r2)
            java.lang.String r5 = "update"
            X.9nx r4 = r1.A0c(r5)
            if (r4 == 0) goto L_0x0ea6
            java.lang.String r3 = "op_name"
            r2 = 0
            java.lang.String r3 = r4.A0i(r3, r2)
            if (r3 == 0) goto L_0x0ea6
            int r2 = r3.length()
            if (r2 == 0) goto L_0x0ea6
            java.util.Locale r2 = java.util.Locale.US
            X.AnonymousClass00C.A09(r2)
            java.lang.String r2 = r3.toLowerCase(r2)
            X.AnonymousClass00C.A08(r2)
            X.00T r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r3 = r0.get(r2)
            X.9Uy r3 = (X.C195569Uy) r3
            if (r3 != 0) goto L_0x0aff
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "mexnotificationrouter/onhandlernotfound there was no MexNotificationJsonHandler registered to handle notifications for the key "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            X.19b r0 = new X.19b
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0aff:
            X.9nx r0 = r1.A0d(r5)
            java.lang.String r1 = r0.A0e()
            X.1Oy r0 = new X.1Oy
            r0.<init>()
            java.lang.Class r2 = r3.A01()
            java.lang.Object r1 = r0.A00(r1, r2)
            boolean r0 = r1 instanceof X.AnonymousClass03N
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0b20
            r0 = r1
            X.8dX r0 = (X.C177278dX) r0
            r3.A02(r0)
        L_0x0b20:
            java.lang.Throwable r0 = X.AnonymousClass0AK.A00(r1)
            if (r0 == 0) goto L_0x00a7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "basemexnotificationhandler/handlenotificationjson failed to transform notification into expected type "
            r1.append(r0)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.19b r0 = new X.19b
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0b41:
            boolean r2 = r0 instanceof X.C30311a0
            if (r2 == 0) goto L_0x0bc4
            X.1a0 r0 = (X.C30311a0) r0
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            java.lang.String r2 = "from"
            com.whatsapp.jid.Jid r4 = r1.A0Y(r3, r2)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.String r5 = "t"
            r2 = 0
            long r11 = r1.A0V(r5, r2)
            java.lang.String r2 = "disappearing_mode"
            X.9nx r3 = r1.A0c(r2)
            X.C18740tg.A06(r3)
            java.lang.String r2 = "duration"
            r1 = 0
            int r5 = r3.A0S(r2, r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            boolean r1 = X.AnonymousClass143.A0I(r4)
            X.16D r2 = r0.A01
            if (r1 == 0) goto L_0x0bbf
            X.141 r1 = r2.A08(r4)
            if (r1 == 0) goto L_0x0b7f
            r3.add(r1)
        L_0x0b7f:
            X.13w r4 = (X.C223313w) r4
            X.12O r1 = r2.A0G
            com.whatsapp.jid.PhoneUserJid r1 = r1.A0A(r4)
            if (r1 == 0) goto L_0x0b92
            X.141 r1 = r2.A08(r1)
            if (r1 == 0) goto L_0x0b92
        L_0x0b8f:
            r3.add(r1)
        L_0x0b92:
            java.util.Iterator r4 = r3.iterator()
        L_0x0b96:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x00a7
            java.lang.Object r3 = r4.next()
            X.141 r3 = (X.AnonymousClass141) r3
            X.11F r2 = r3.A0H
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r9 = X.C222813r.A00(r2)
            if (r9 == 0) goto L_0x0b96
            int r1 = r3.A01
            if (r1 == r5) goto L_0x0b96
            X.1Lu r2 = r0.A00
            X.3va r1 = new X.3va
            r6 = r1
            r7 = r3
            r8 = r0
            r10 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            r2.A01(r1)
            goto L_0x0b96
        L_0x0bbf:
            X.141 r1 = r2.A0D(r4)
            goto L_0x0b8f
        L_0x0bc4:
            boolean r2 = r0 instanceof X.C31701cF
            if (r2 == 0) goto L_0x0bed
            X.1cF r0 = (X.C31701cF) r0
            r2 = 228(0xe4, float:3.2E-43)
            if (r4 != r2) goto L_0x00a7
            java.lang.String r2 = "migrate"
            X.9nx r3 = r1.A0c(r2)
            if (r3 == 0) goto L_0x0eae
            r2 = 0
            java.lang.String r1 = "urgency"
            int r2 = r3.A0S(r1, r2)
            X.0v0 r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "encrypted_backup_fleet_migration_state"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
            r0.apply()
            return
        L_0x0bed:
            X.1cG r0 = (X.C31711cG) r0
            r1 = 248(0xf8, float:3.48E-43)
            if (r4 != r1) goto L_0x00a7
            X.130 r2 = r0.A00
            r1 = 5
            r2.A0H(r1)
            X.1Vw r0 = r0.A01
            r0.A00()
            return
        L_0x0bff:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Logout ID is empty for tag: "
            r1.append(r0)
            java.lang.String r0 = r5.A00
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.19b r0 = new X.19b
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0c18:
            java.lang.String r1 = "wa_old_registration"
            boolean r1 = X.C203399nx.A0I(r5, r1)
            if (r1 == 0) goto L_0x0eb1
            java.lang.String r2 = "code"
            r1 = 0
            java.lang.String r7 = r5.A0i(r2, r1)
            java.lang.String r2 = "expiry_t"
            r1 = 0
            int r4 = r5.A0S(r2, r1)
            X.0v0 r6 = r0.A01
            java.lang.String r1 = r6.A0e()
            byte[] r2 = X.C65983Uf.A0W(r1)
            r1 = 11
            java.lang.String r10 = android.util.Base64.encodeToString(r2, r1)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = (long) r4
            long r3 = r3.toMillis(r1)
            if (r7 == 0) goto L_0x0c8d
            X.0wo r1 = r0.A00
            long r8 = X.C19970wo.A00(r1)
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0c8d
            if (r10 == 0) goto L_0x0c8d
            java.lang.String r2 = "device_id"
            java.lang.String r1 = ""
            java.lang.String r1 = r5.A0i(r2, r1)
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x0c8d
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r6)
            java.lang.String r1 = "device_switching_code"
            android.content.SharedPreferences$Editor r1 = r2.putString(r1, r7)
            r1.apply()
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r6)
            java.lang.String r1 = "device_switching_code_expiry"
            android.content.SharedPreferences$Editor r1 = r2.putLong(r1, r3)
            r1.apply()
            X.1Ww r5 = r0.A02
            X.0wG r1 = r5.A0D
            android.content.Context r4 = r1.A00
            X.17Y r3 = r5.A04
            r2 = 10
            X.1im r1 = new X.1im
            r1.<init>(r5, r4, r7, r2)
            r3.Bp3(r1)
        L_0x0c8d:
            X.9uj r5 = r0.A03()
            java.lang.String r1 = r6.A0e()
            byte[] r2 = X.C65983Uf.A0W(r1)
            r1 = 11
            java.lang.String r4 = android.util.Base64.encodeToString(r2, r1)
            if (r4 != 0) goto L_0x0ca3
            java.lang.String r4 = ""
        L_0x0ca3:
            X.9YT r3 = new X.9YT
            r3.<init>()
            java.lang.String r2 = "s.whatsapp.net"
            X.13o r1 = com.whatsapp.jid.Jid.Companion
            com.whatsapp.jid.Jid r1 = r1.A02(r2)
            r3.A02 = r1
            java.lang.String r1 = r5.A07
            r3.A07 = r1
            java.lang.String r1 = r5.A05
            r3.A05 = r1
            java.lang.String r1 = r5.A08
            r3.A08 = r1
            long r1 = r5.A00
            r3.A00 = r1
            java.lang.String r1 = "device_id"
            r3.A08(r1, r4)
            X.9uj r1 = r3.A01()
            r0.A05(r1)
            return
        L_0x0ccf:
            java.lang.String r2 = "PSANotificationHandler/QpSurface beginning handling"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.1C7 r4 = r0.A02
            r3 = 10
            goto L_0x0ce2
        L_0x0cd9:
            java.lang.String r2 = "PSANotificationHandler/Push begin handling"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.1C7 r4 = r0.A02
            r3 = 9
        L_0x0ce2:
            X.1j3 r2 = new X.1j3
            r2.<init>(r1, r5, r0, r3)
            r0 = 27
            r4.A01(r2, r0)
            return
        L_0x0ced:
            X.9uj r7 = r0.A03()
            X.0yC r4 = r0.A07
            r3 = 1844(0x734, float:2.584E-42)
            X.0yV r2 = X.C21000yV.A02
            boolean r2 = X.C20800yB.A01(r2, r4, r3)
            if (r2 == 0) goto L_0x0d2b
            r2 = 0
            X.9nx r2 = r1.A0b(r2)
            if (r2 == 0) goto L_0x0d2b
            java.lang.String r2 = "revoke"
            java.util.List r6 = r1.A0j(r2)
            r5 = 27
            if (r6 == 0) goto L_0x0d21
            boolean r2 = r6.isEmpty()
            if (r2 != 0) goto L_0x0d21
            X.1C7 r4 = r0.A02
            r1 = 11
            X.1j3 r3 = new X.1j3
            r3.<init>(r6, r7, r0, r1)
        L_0x0d1d:
            r4.A01(r3, r5)
            return
        L_0x0d21:
            X.1C7 r4 = r0.A02
            r2 = 8
            X.1j3 r3 = new X.1j3
            r3.<init>(r1, r7, r0, r2)
            goto L_0x0d1d
        L_0x0d2b:
            r0.A06(r7)
            return
        L_0x0d2f:
            X.187 r3 = r0.A04
            r2 = 36
            X.1iP r1 = new X.1iP
            r1.<init>((java.lang.Object) r0, (int) r4, (int) r2, (java.lang.Object) r5)
            java.util.concurrent.ThreadPoolExecutor r0 = r3.A00
            r0.execute(r1)
            return
        L_0x0d3e:
            java.lang.String r2 = "identity"
            boolean r2 = X.C203399nx.A0I(r6, r2)
            if (r2 == 0) goto L_0x0d9e
            java.lang.Class<com.whatsapp.jid.UserJid> r8 = com.whatsapp.jid.UserJid.class
            java.lang.String r2 = "from"
            com.whatsapp.jid.Jid r4 = r1.A0X(r8, r2)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            if (r4 == 0) goto L_0x0d92
            X.3ER r7 = new X.3ER
            r7.<init>()
            java.lang.String r3 = "type"
            java.lang.String r2 = ""
            java.lang.String r2 = r1.A0i(r3, r2)
            r7.A00 = r4
            r7.A04 = r2
            java.lang.String r2 = "lid"
            com.whatsapp.jid.Jid r2 = r1.A0X(r8, r2)
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            if (r2 == 0) goto L_0x0d6f
            r7.A01 = r2
        L_0x0d6f:
            java.lang.String r3 = "display_name"
            r2 = 0
            java.lang.String r2 = r1.A0i(r3, r2)
            boolean r1 = X.AnonymousClass14B.A0F(r2)
            if (r1 != 0) goto L_0x0d7e
            r7.A03 = r2
        L_0x0d7e:
            X.1PE r4 = r0.A08
            X.3Kj r3 = r7.A00()
            com.whatsapp.jid.UserJid r2 = r3.A02
            X.011 r1 = new X.011
            r1.<init>(r2, r3)
            java.util.Map r1 = X.C000300d.A03(r1)
            r4.A02(r1)
        L_0x0d92:
            X.1aJ r3 = r0.A09
            r2 = 1
            X.1j3 r1 = new X.1j3
            r1.<init>(r6, r5, r0, r2)
            r3.A00(r1)
            return
        L_0x0d9e:
            java.lang.String r1 = "digest"
            boolean r1 = X.C203399nx.A0I(r6, r1)
            if (r1 == 0) goto L_0x0dc5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "server asked us to run an e2e key digest check; stanzaKey="
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0v0 r2 = r0.A02
            r1 = 1
            r2.A24(r1)
            X.0xL r1 = r0.A00
            r1.A06()
        L_0x0dc5:
            r0.A05(r5)
            return
        L_0x0dc9:
            java.lang.String r1 = "required token element to contain data"
            X.19b r0 = new X.19b
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0dd1:
            monitor-enter(r0)
            int r1 = r6.length()     // Catch:{ all -> 0x0e2d }
            if (r1 == 0) goto L_0x0e2b
            X.0v0 r4 = r0.A06     // Catch:{ all -> 0x0e2d }
            X.005 r1 = r4.A00     // Catch:{ all -> 0x0e2d }
            java.lang.Object r2 = r1.get()     // Catch:{ all -> 0x0e2d }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ all -> 0x0e2d }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0e2d }
            r1.<init>()     // Catch:{ all -> 0x0e2d }
            java.lang.String r3 = "pending_side_list_hash"
            java.util.Set r2 = r2.getStringSet(r3, r1)     // Catch:{ all -> 0x0e2d }
            X.C18740tg.A06(r2)     // Catch:{ all -> 0x0e2d }
            X.AnonymousClass00C.A08(r2)     // Catch:{ all -> 0x0e2d }
            boolean r1 = r2.add(r6)     // Catch:{ all -> 0x0e2d }
            if (r1 == 0) goto L_0x0e2b
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r4)     // Catch:{ all -> 0x0e2d }
            android.content.SharedPreferences$Editor r1 = r1.putStringSet(r3, r2)     // Catch:{ all -> 0x0e2d }
            r1.apply()     // Catch:{ all -> 0x0e2d }
            goto L_0x0e2b
        L_0x0e05:
            java.util.HashSet r2 = X.C27301Nr.A00(r0)     // Catch:{ all -> 0x0e2d }
            boolean r1 = r2.addAll(r1)     // Catch:{ all -> 0x0e2d }
            if (r1 == 0) goto L_0x0e2b
            java.lang.String[] r1 = X.AnonymousClass143.A0O(r2)     // Catch:{ all -> 0x0e2d }
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ all -> 0x0e2d }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0e2d }
            r3.<init>(r1)     // Catch:{ all -> 0x0e2d }
            X.0v0 r1 = r0.A05     // Catch:{ all -> 0x0e2d }
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r1)     // Catch:{ all -> 0x0e2d }
            java.lang.String r1 = "pending_users_to_sync_device"
            android.content.SharedPreferences$Editor r1 = r2.putStringSet(r1, r3)     // Catch:{ all -> 0x0e2d }
            r1.apply()     // Catch:{ all -> 0x0e2d }
        L_0x0e2b:
            monitor-exit(r0)
            return
        L_0x0e2d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0e30:
            X.0yC r3 = r0.A08
            r2 = 7113(0x1bc9, float:9.967E-42)
            X.0yV r1 = X.C21000yV.A02
            boolean r1 = X.C20800yB.A01(r1, r3, r2)
            if (r1 == 0) goto L_0x0e3f
            r0.A04()
        L_0x0e3f:
            X.0wN r1 = r0.A00
            X.0wQ r2 = r0.A01
            X.16D r3 = r0.A03
            X.1Nr r4 = r0.A04
            X.17i r5 = r0.A07
            X.1OD r6 = r0.A06
            X.1O5 r7 = r0.A05
            java.util.List r8 = java.util.Collections.singletonList(r8)
            r9 = 0
            X.1ik r0 = new X.1ik
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0.run()
            return
        L_0x0e5b:
            java.lang.String r0 = "DeviceUpdateNotificationHandler/handleXmppMessage/unknown type of device notification."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r1 = "unknown device notification not found"
            X.19b r0 = new X.19b
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0e68:
            r5.A0G()
            return
        L_0x0e6c:
            java.lang.String r1 = "encrypted message id is different from the expected one"
            X.186 r0 = new X.186     // Catch:{ 186 -> 0x0e84 }
            r0.<init>((java.lang.String) r1)     // Catch:{ 186 -> 0x0e84 }
            throw r0     // Catch:{ 186 -> 0x0e84 }
        L_0x0e74:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0e77:
            java.lang.String r1 = "push-config notification: force replacing GCM token"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0wG r0 = r0.A00
            android.content.Context r0 = r0.A00
            com.whatsapp.push.RegistrationIntentService.A02(r0)
            return
        L_0x0e84:
            r1 = move-exception
            java.lang.String r0 = "malformed encrypted data"
            com.whatsapp.util.Log.w(r0, r1)
            return
        L_0x0e8b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "missing media data for media message; stanzaKeyId="
            r1.append(r0)
            r1.append(r10)
            r1.append(r9)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0ea6:
            java.lang.String r1 = "mexnotificationrouter/onoperationnotfound the operation for this notification was not found. Expected an 'update' tag with a non-empty 'operation_name' attribute."
            X.19b r0 = new X.19b
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0eae:
            java.lang.String r0 = "encb/EncBackupNotificationHandler/migrate child node missing"
            goto L_0x0ec4
        L_0x0eb1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "RegistrationNotificationHandler/handleXmppMessage: unknown tag="
            r1.append(r0)
            java.lang.String r0 = r5.A00
            r1.append(r0)
        L_0x0ec0:
            java.lang.String r0 = r1.toString()
        L_0x0ec4:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29421Wo.A07(X.9nx, int):void");
    }
}
