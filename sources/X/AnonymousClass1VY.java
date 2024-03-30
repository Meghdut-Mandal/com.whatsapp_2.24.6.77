package X;

import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

/* renamed from: X.1VY  reason: invalid class name */
public class AnonymousClass1VY {
    public final C19730wQ A00;
    public final C20310xM A01;
    public final AnonymousClass1VZ A02;
    public final AnonymousClass16T A03;
    public final C24601Db A04;
    public final C24631De A05;
    public final AnonymousClass1EU A06;
    public final C29021Va A07;

    public static C202319lY A00(C203399nx r7, long j) {
        byte[] bArr;
        String A0i = r7.A0i("country", "IN");
        int A002 = AnonymousClass6R8.A00(r7.A0i("version", (String) null), 1);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(DefaultCrypto.BUFFER_SIZE);
            C203299nk.A01(r7, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("PAY: PaymentsProtoParser serializeProtocolNode: ");
            sb.append(e);
            Log.e(sb.toString());
            bArr = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PAY PaymentsProtoParser: buildFuturePaymentFromPayNode: futurePayment country=");
        sb2.append(A0i);
        sb2.append(" version=");
        sb2.append(A002);
        Log.i(sb2.toString());
        C202319lY r3 = new C202319lY(A0i, 5, A002, 0, j);
        r3.A0R = bArr;
        return r3;
    }

    public C202319lY A01(UserJid userJid, UserJid userJid2, C203399nx r25, long j) {
        B66 b66;
        long j2 = j;
        C203399nx r7 = r25;
        String A0i = r7.A0i("country", this.A05.A02().A03);
        int A002 = AnonymousClass6R8.A00(r7.A0i("version", (String) null), 1);
        String A0i2 = r7.A0i("request-id", (String) null);
        C18740tg.A06(A0i2);
        String A0i3 = r7.A0i("expiry-ts", (String) null);
        C18740tg.A06(A0i3);
        UserJid A022 = UserJid.Companion.A02(r7.A0i("sender", (String) null));
        if (A022 == null) {
            A022 = userJid;
        }
        C18740tg.A06(A0i);
        String str = ((AnonymousClass16V) AnonymousClass16W.A06).A02;
        C198699e3 A032 = this.A06.A03(A0i);
        if (A032 != null) {
            b66 = A032.A01(str);
        } else {
            b66 = null;
        }
        C18740tg.A06(b66);
        AnonymousClass16U A012 = this.A03.A01(str);
        C18740tg.A06(A022);
        C202319lY A013 = C203419nz.A01(A012, new AnonymousClass16X(new BigDecimal(0), 1), A022, userJid2, str, A0i2, A0i, 20, 12, A002, b66.BHO(), 0, j2);
        C175708av BKY = b66.BKY();
        if (BKY != null) {
            A013.A0A(BKY, AnonymousClass6R8.A01(A0i3, j / 1000) * 1000);
        }
        return A013;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C202319lY A02(com.whatsapp.jid.UserJid r18, X.C203399nx r19, long r20) {
        /*
            r17 = this;
            java.lang.String r0 = "version"
            r3 = 0
            r1 = r19
            java.lang.String r2 = r1.A0i(r0, r3)
            r0 = 1
            int r12 = X.AnonymousClass6R8.A00(r2, r0)
            java.lang.String r0 = "sync-status"
            java.lang.String r2 = r1.A0i(r0, r3)
            X.9nz r0 = X.C203419nz.$redex_init_class
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = "PARTIAL"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x00b5
            r5 = 1
            X.16U r0 = X.AnonymousClass16W.A06
            X.16V r0 = (X.AnonymousClass16V) r0
            java.lang.String r7 = r0.A02
            X.9l8 r0 = X.C202159l8.A0F
        L_0x002d:
            java.lang.String r2 = r0.A03
            java.lang.String r0 = "country"
            java.lang.String r9 = r1.A0i(r0, r2)
            java.lang.String r0 = "amount"
            java.lang.String r2 = r1.A0i(r0, r3)
            java.lang.String r0 = "receiver"
            java.lang.String r3 = r1.A0i(r0, r3)
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r6 = r0.A02(r3)
            r3 = r17
            if (r6 != 0) goto L_0x00b1
            X.0wQ r4 = r3.A00
            boolean r0 = r4.A0L()
            if (r0 == 0) goto L_0x00b1
            r4.A0G()
            com.whatsapp.jid.PhoneUserJid r6 = r4.A03
        L_0x0058:
            java.lang.String r0 = "UNSET"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0066
            X.1EU r0 = r3.A06
            java.lang.String r9 = r0.A06(r7)
        L_0x0066:
            X.1EU r0 = r3.A06
            X.9e3 r0 = r0.A03(r9)
            if (r0 == 0) goto L_0x00af
            X.B66 r0 = r0.A01(r7)
            if (r0 == 0) goto L_0x00af
            int r13 = r0.BHO()
        L_0x0078:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r8 = 0
            if (r0 != 0) goto L_0x00c0
            X.16T r0 = r3.A03
            X.16U r3 = r0.A01(r7)
            if (r5 == 0) goto L_0x00a4
            r4 = r8
            r10 = 1000(0x3e8, float:1.401E-42)
        L_0x008a:
            r11 = 0
            r14 = 0
            r5 = r18
            r15 = r20
            X.9lY r2 = X.C203419nz.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r0 = "transaction-id"
            java.lang.String r1 = r1.A0i(r0, r8)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00a3
            r2.A0D(r1)
        L_0x00a3:
            return r2
        L_0x00a4:
            r0 = r3
            X.16V r0 = (X.AnonymousClass16V) r0
            int r0 = r0.A01
            X.16X r4 = X.AnonymousClass16X.A00(r2, r0)
            r10 = 3
            goto L_0x008a
        L_0x00af:
            r13 = 0
            goto L_0x0078
        L_0x00b1:
            X.C18740tg.A06(r6)
            goto L_0x0058
        L_0x00b5:
            r5 = 0
            java.lang.String r0 = "currency"
            java.lang.String r7 = r1.A0i(r0, r3)
            X.9l8 r0 = X.C202159l8.A0G
            goto L_0x002d
        L_0x00c0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1VY.A02(com.whatsapp.jid.UserJid, X.9nx, long):X.9lY");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[ExcHandler: JSONException (unused org.json.JSONException), SYNTHETIC, Splitter:B:425:0x083b] */
    public X.C202319lY A03(X.AZ9 r73, X.C203399nx r74) {
        /*
            r72 = this;
            java.lang.String r0 = "sender"
            r3 = 0
            r1 = r74
            java.lang.String r0 = r1.A0i(r0, r3)
            X.13r r2 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r31 = r2.A02(r0)
            java.lang.String r0 = "receiver"
            java.lang.String r0 = r1.A0i(r0, r3)
            com.whatsapp.jid.UserJid r48 = r2.A02(r0)
            java.lang.String r2 = "transaction-type"
            java.lang.String r0 = "p2p"
            java.lang.String r5 = r1.A0i(r2, r0)
            int r44 = r5.hashCode()
            r30 = 0
            r6 = r72
            switch(r44) {
                case -1703305877: goto L_0x08a8;
                case -1629586251: goto L_0x08ab;
                case -934813832: goto L_0x08ae;
                case 1554454174: goto L_0x08b1;
                default: goto L_0x002c;
            }
        L_0x002c:
            X.0wQ r2 = r6.A00
            r0 = r31
            boolean r0 = r2.A0M(r0)
            if (r0 != 0) goto L_0x0038
            if (r48 != 0) goto L_0x003a
        L_0x0038:
            r30 = 1
        L_0x003a:
            java.lang.String r0 = "IN"
            java.lang.String r10 = "country"
            java.lang.String r3 = r1.A0i(r10, r0)
            java.lang.String r7 = "version"
            r8 = 0
            java.lang.String r2 = r1.A0i(r7, r8)
            r0 = 1
            int r0 = X.AnonymousClass6R8.A00(r2, r0)
            boolean r0 = X.C203419nz.A08(r3, r0)
            if (r0 != 0) goto L_0x005b
            r2 = -1
            X.9lY r4 = A00(r1, r2)
        L_0x005a:
            return r4
        L_0x005b:
            java.lang.String r0 = "message-id"
            r4 = 0
            java.lang.String r34 = r1.A0i(r0, r8)
            java.lang.String r0 = "group"
            java.lang.String r2 = r1.A0i(r0, r8)
            X.6SZ r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r33 = r0.A02(r2)
            java.lang.String r26 = "id"
            r0 = r26
            java.lang.String r32 = r1.A0i(r0, r8)
            java.lang.String r0 = "status"
            java.lang.String r0 = r1.A0i(r0, r8)
            java.lang.String r2 = "ts"
            java.lang.String r9 = r1.A0i(r2, r8)
            r2 = 0
            long r20 = X.AnonymousClass6R8.A01(r9, r2)
            r11 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 * r11
            java.lang.String r9 = "credential-id"
            java.lang.String r29 = r1.A0i(r9, r8)
            java.lang.String r9 = "error-code"
            java.lang.String r28 = r1.A0i(r9, r8)
            java.lang.String r9 = "bank-transaction-id"
            java.lang.String r35 = r1.A0i(r9, r8)
            java.lang.String r9 = "expiry-ts"
            java.lang.String r9 = r1.A0i(r9, r8)
            long r18 = X.AnonymousClass6R8.A01(r9, r2)
            long r18 = r18 * r11
            java.lang.String r2 = "created-ts"
            java.lang.String r9 = r1.A0i(r2, r8)
            r2 = 0
            long r16 = X.AnonymousClass6R8.A01(r9, r2)
            long r16 = r16 * r11
            java.lang.String r2 = "counter"
            java.lang.String r3 = r1.A0i(r2, r8)
            r2 = 0
            int r25 = X.AnonymousClass6R8.A00(r3, r2)
            java.lang.String r2 = "sender-alias"
            java.lang.String r24 = r1.A0i(r2, r8)
            java.lang.String r2 = "receiver-alias"
            java.lang.String r23 = r1.A0i(r2, r8)
            java.lang.String r2 = "note"
            java.lang.String r22 = r1.A0i(r2, r8)
            java.lang.String r2 = "payment_initiator"
            java.lang.String r9 = r1.A0i(r2, r8)
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 != 0) goto L_0x00e9
            java.lang.String r2 = "p2m"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x00eb
        L_0x00e9:
            java.lang.String r9 = "na"
        L_0x00eb:
            java.lang.String r2 = "mandate"
            X.9nx r2 = r1.A0c(r2)
            r8 = 0
            if (r2 == 0) goto L_0x0113
            r8 = 1
            X.1Db r12 = r6.A04
            android.content.SharedPreferences r11 = r12.A03()
            java.lang.String r3 = "payment_has_received_upi_mandate_request"
            r2 = 0
            boolean r2 = r11.getBoolean(r3, r2)
            if (r2 != 0) goto L_0x0113
            android.content.SharedPreferences r2 = r12.A03()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r2 = r2.putBoolean(r3, r8)
            r2.apply()
        L_0x0113:
            X.1De r2 = r6.A05
            X.9l8 r2 = r2.A02()
            java.lang.String r14 = r1.A0i(r10, r4)
            if (r14 != 0) goto L_0x0125
            if (r2 != 0) goto L_0x0123
            X.9l8 r2 = X.C202159l8.A0G
        L_0x0123:
            java.lang.String r14 = r2.A03
        L_0x0125:
            java.lang.String r3 = r1.A0i(r7, r4)
            r2 = 1
            int r54 = X.AnonymousClass6R8.A00(r3, r2)
            java.lang.String r2 = "onboarding-provider-id"
            java.lang.String r36 = r1.A0i(r2, r4)
            java.lang.String r3 = "onboarding-provider-name"
            r2 = 0
            r1.A0i(r3, r4)
            java.lang.String r3 = "is_vpa"
            java.lang.String r7 = r1.A0i(r3, r4)
            r3 = 0
            int r7 = X.AnonymousClass6R8.A00(r7, r3)
            r27 = 1
            r3 = 1
            if (r7 == r3) goto L_0x015a
            java.lang.String r3 = "is-vpa"
            java.lang.String r7 = r1.A0i(r3, r4)
            r3 = 0
            int r7 = X.AnonymousClass6R8.A00(r7, r3)
            r3 = 1
            if (r7 == r3) goto L_0x015a
            r27 = 0
        L_0x015a:
            java.lang.String r3 = "sync-status"
            java.lang.String r7 = r1.A0i(r3, r4)
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            if (r3 != 0) goto L_0x0170
            java.lang.String r3 = "PARTIAL"
            boolean r3 = r3.equalsIgnoreCase(r7)
            r40 = 1
            if (r3 != 0) goto L_0x0172
        L_0x0170:
            r40 = 0
        L_0x0172:
            X.9fK r10 = new X.9fK
            r10.<init>()
            X.16U r7 = X.AnonymousClass16W.A06
            r10.A02 = r7
            X.9ua r37 = r10.A01()
            if (r40 != 0) goto L_0x01ad
            java.lang.String r12 = "amount"
            X.9nx r13 = r1.A0c(r12)
            java.lang.String r3 = "currency"
            java.lang.String r11 = "PAY: PaymentsProtoParser :: extractAmountFromNode"
            if (r13 != 0) goto L_0x0723
            java.lang.String r3 = r1.A0i(r3, r4)
            java.lang.String r12 = r1.A0i(r12, r4)
            if (r3 != 0) goto L_0x0704
            if (r12 != 0) goto L_0x0704
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            java.lang.String r3 = " :: amount node is null"
        L_0x01a3:
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.whatsapp.util.Log.e((java.lang.String) r3)
        L_0x01ad:
            r3 = r37
            X.16U r3 = r3.A01
            X.16V r3 = (X.AnonymousClass16V) r3
            java.lang.String r3 = r3.A02
            X.16T r4 = r6.A03
            r71 = r4
            X.16U r45 = r4.A01(r3)
            X.16V r7 = (X.AnonymousClass16V) r7
            java.lang.String r4 = r7.A02
            boolean r43 = r3.equals(r4)
            r4 = 0
            if (r43 != 0) goto L_0x0701
            r7 = r37
            X.16X r12 = r7.A02
            java.math.BigDecimal r7 = r12.A00
            double r38 = r7.doubleValue()
            r10 = 0
            int r7 = (r38 > r10 ? 1 : (r38 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0701
        L_0x01d8:
            if (r40 != 0) goto L_0x01e3
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            r7 = r7 ^ 1
            X.C18740tg.A0C(r7)
        L_0x01e3:
            java.lang.String r7 = "service"
            java.lang.String r11 = r1.A0i(r7, r2)
            java.lang.String r10 = "P2M_LITE"
            boolean r11 = r10.equals(r11)
            X.1EU r6 = r6.A06
            if (r11 == 0) goto L_0x06f5
            X.AF8 r42 = r6.A04(r10)
        L_0x01f7:
            if (r42 == 0) goto L_0x08ee
            int r6 = r9.hashCode()
            r4 = -906014849(0xffffffffc9ff4f7f, float:-2091503.9)
            if (r6 == r4) goto L_0x06e9
            r4 = 3507(0xdb3, float:4.914E-42)
            if (r6 == r4) goto L_0x0215
            r4 = 94110131(0x59c01b3, float:1.4670794E-35)
            if (r6 != r4) goto L_0x0215
            java.lang.String r4 = "buyer"
            boolean r4 = r9.equals(r4)
            r56 = 1
            if (r4 != 0) goto L_0x0217
        L_0x0215:
            r56 = 0
        L_0x0217:
            if (r40 == 0) goto L_0x0275
            int r55 = r42.BHO()
            r52 = 1000(0x3e8, float:1.401E-42)
            r53 = 0
            r50 = r2
            r46 = r2
            r47 = r31
            r49 = r3
            r51 = r14
            r57 = r20
            X.9lY r4 = X.C203419nz.A01(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)
        L_0x0231:
            r0 = r34
            r4.A0L = r0
            if (r33 != 0) goto L_0x023d
            r33 = r31
            if (r30 == 0) goto L_0x023d
            r33 = r48
        L_0x023d:
            r0 = r33
            r4.A0C = r0
            r0 = r30
            r4.A0Q = r0
            r0 = r32
            r4.A0K = r0
            r0 = r35
            r4.A0F = r0
            r0 = r29
            r4.A0H = r0
            r0 = r28
            r4.A0J = r0
            r5 = r20
            r4.A06 = r5
            r5 = r16
            r4.A05 = r5
            r0 = r27
            r4.A0P = r0
            if (r43 != 0) goto L_0x0267
            r0 = r37
            r4.A09 = r0
        L_0x0267:
            X.8av r3 = r42.BKY()
            if (r3 == 0) goto L_0x005a
            android.text.TextUtils.isEmpty(r36)
            int r5 = r4.A03
            monitor-enter(r4)
            goto L_0x0787
        L_0x0275:
            java.lang.String r4 = "COLLECT_SUCCESS"
            boolean r41 = r4.equalsIgnoreCase(r0)
            if (r41 != 0) goto L_0x0682
            java.lang.String r4 = "COLLECT_FAILED"
            boolean r4 = r4.equalsIgnoreCase(r0)
            if (r4 != 0) goto L_0x0682
            java.lang.String r4 = "COLLECT_FAILED_RISK"
            boolean r4 = r4.equalsIgnoreCase(r0)
            if (r4 != 0) goto L_0x0682
            java.lang.String r4 = "COLLECT_REJECTED"
            boolean r4 = r4.equalsIgnoreCase(r0)
            if (r4 != 0) goto L_0x0682
            java.lang.String r4 = "COLLECT_EXPIRED"
            boolean r4 = r4.equalsIgnoreCase(r0)
            if (r4 != 0) goto L_0x0682
            if (r8 == 0) goto L_0x02af
            java.lang.String r4 = "AUTH_SUCCESS"
            boolean r4 = r4.equalsIgnoreCase(r0)
            if (r4 != 0) goto L_0x0682
            java.lang.String r4 = "AUTH_CANCELED"
            boolean r4 = r4.equalsIgnoreCase(r0)
            if (r4 != 0) goto L_0x0682
        L_0x02af:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            r6 = 2
            if (r4 != 0) goto L_0x02c3
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r8 = r5.toLowerCase(r4)
            int r4 = r8.hashCode()
            switch(r4) {
                case -1703305877: goto L_0x0638;
                case -1629586251: goto L_0x0644;
                case -995205722: goto L_0x0650;
                case -934813832: goto L_0x065c;
                case 109291: goto L_0x0667;
                case 1554454174: goto L_0x0677;
                default: goto L_0x02c3;
            }
        L_0x02c3:
            if (r30 == 0) goto L_0x02c6
            r6 = 1
        L_0x02c6:
            int r67 = r42.BHO()
            r55 = r67
            r4 = 9
            if (r6 != r4) goto L_0x02e9
            java.lang.String r7 = r1.A0i(r7, r2)
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 != 0) goto L_0x02e7
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r4)
            int r4 = r7.hashCode()
            switch(r4) {
                case -2031560318: goto L_0x062c;
                case 116014: goto L_0x0620;
                case 97229420: goto L_0x0614;
                default: goto L_0x02e7;
            }
        L_0x02e7:
            r67 = 0
        L_0x02e9:
            switch(r44) {
                case -1629586251: goto L_0x0605;
                case -934813832: goto L_0x0602;
                case 1554454174: goto L_0x05ff;
                default: goto L_0x02ec;
            }
        L_0x02ec:
            if (r30 == 0) goto L_0x05e1
            r57 = -1
            X.C18740tg.A06(r42)
        L_0x02f3:
            r53 = 401(0x191, float:5.62E-43)
            r46 = r12
            r47 = r31
            r49 = r3
            r50 = r2
            r51 = r14
            r52 = r6
            X.9lY r4 = X.C203419nz.A01(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)
        L_0x0305:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r5 != 0) goto L_0x0340
            r3 = 1
            java.lang.String r40 = "FAILURE"
            java.lang.String r39 = "FAILED_RISK"
            java.lang.String r38 = "AUTH_CANCELED"
            java.lang.String r15 = "FAILED_DA"
            java.lang.String r14 = "EXPIRED"
            java.lang.String r13 = "IN_REVIEW"
            java.lang.String r12 = "PENDING"
            java.lang.String r11 = "CANCELLED"
            java.lang.String r10 = "FAILED"
            java.lang.String r9 = "COMPLETED"
            java.lang.String r8 = "SUCCESS"
            if (r6 == r3) goto L_0x04d9
            r3 = 2
            if (r6 == r3) goto L_0x0439
            java.lang.String r7 = "COLLECT_EXPIRED"
            java.lang.String r5 = "COLLECT_REJECTED"
            r3 = 20
            if (r6 == r3) goto L_0x03e7
            r3 = 40
            if (r6 == r3) goto L_0x03d5
            r3 = 100
            if (r6 == r3) goto L_0x04d9
            r3 = 200(0xc8, float:2.8E-43)
            if (r6 == r3) goto L_0x0439
            switch(r6) {
                case 6: goto L_0x03a6;
                case 7: goto L_0x04c9;
                case 8: goto L_0x0344;
                case 9: goto L_0x0439;
                case 10: goto L_0x03e7;
                default: goto L_0x033f;
            }
        L_0x033f:
            r3 = 0
        L_0x0340:
            r4.A02 = r3
            goto L_0x0231
        L_0x0344:
            java.lang.String r3 = "PENDING_CODE"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x03a3
            boolean r3 = r12.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x03a3
            boolean r3 = r13.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x035b
            r3 = 603(0x25b, float:8.45E-43)
            goto L_0x0340
        L_0x035b:
            boolean r3 = r8.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x03a0
            boolean r3 = r9.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x03a0
            boolean r3 = r10.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x039d
            java.lang.String r3 = "DECLINED"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x039d
            boolean r3 = r11.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x037e
            r3 = 606(0x25e, float:8.49E-43)
            goto L_0x0340
        L_0x037e:
            boolean r3 = r14.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0387
            r3 = 607(0x25f, float:8.5E-43)
            goto L_0x0340
        L_0x0387:
            java.lang.String r3 = "WITHDRAWAL_ACTIVE"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0392
            r3 = 608(0x260, float:8.52E-43)
            goto L_0x0340
        L_0x0392:
            java.lang.String r3 = "PENDING_CANCELLATION"
            boolean r0 = r3.equalsIgnoreCase(r0)
            r3 = 609(0x261, float:8.53E-43)
            if (r0 != 0) goto L_0x0340
            goto L_0x033f
        L_0x039d:
            r3 = 605(0x25d, float:8.48E-43)
            goto L_0x0340
        L_0x03a0:
            r3 = 604(0x25c, float:8.46E-43)
            goto L_0x0340
        L_0x03a3:
            r3 = 602(0x25a, float:8.44E-43)
            goto L_0x0340
        L_0x03a6:
            boolean r3 = r12.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x03af
            r3 = 701(0x2bd, float:9.82E-43)
            goto L_0x0340
        L_0x03af:
            boolean r3 = r13.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x03b8
            r3 = 702(0x2be, float:9.84E-43)
            goto L_0x0340
        L_0x03b8:
            boolean r3 = r8.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x03c1
            r3 = 703(0x2bf, float:9.85E-43)
            goto L_0x0340
        L_0x03c1:
            boolean r3 = r10.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x03cb
            r3 = 704(0x2c0, float:9.87E-43)
            goto L_0x0340
        L_0x03cb:
            boolean r0 = r11.equalsIgnoreCase(r0)
            r3 = 705(0x2c1, float:9.88E-43)
            if (r0 != 0) goto L_0x0340
            goto L_0x033f
        L_0x03d5:
            if (r41 == 0) goto L_0x03db
            r3 = 20
            goto L_0x0340
        L_0x03db:
            java.lang.String r3 = "AUTH_SUCCESS"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x041d
            r3 = 417(0x1a1, float:5.84E-43)
            goto L_0x0340
        L_0x03e7:
            if (r41 == 0) goto L_0x03ed
            r3 = 12
            goto L_0x0340
        L_0x03ed:
            java.lang.String r3 = "COLLECT_FAILED"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x03f9
            r3 = 13
            goto L_0x0340
        L_0x03f9:
            java.lang.String r3 = "COLLECT_FAILED_RISK"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0405
            r3 = 14
            goto L_0x0340
        L_0x0405:
            boolean r3 = r5.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x0435
            boolean r3 = r7.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x0431
            java.lang.String r3 = "COLLECT_CANCELED"
            boolean r0 = r3.equalsIgnoreCase(r0)
            r3 = 18
            if (r0 != 0) goto L_0x0340
            goto L_0x033f
        L_0x041d:
            r3 = r38
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x05d5
            boolean r3 = r5.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x0435
            boolean r0 = r7.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x033f
        L_0x0431:
            r3 = 16
            goto L_0x0340
        L_0x0435:
            r3 = 15
            goto L_0x0340
        L_0x0439:
            java.lang.String r3 = "PENDING_SETUP"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0445
            r3 = 102(0x66, float:1.43E-43)
            goto L_0x0340
        L_0x0445:
            boolean r3 = r15.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x044f
            r3 = 103(0x67, float:1.44E-43)
            goto L_0x0340
        L_0x044f:
            java.lang.String r3 = "FAILED_PROCESSING"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x045b
            r3 = 104(0x68, float:1.46E-43)
            goto L_0x0340
        L_0x045b:
            boolean r3 = r8.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x04d5
            boolean r3 = r9.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x04d5
            r3 = r40
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x04c5
            boolean r3 = r10.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x04c5
            boolean r3 = r14.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x047f
            r3 = 107(0x6b, float:1.5E-43)
            goto L_0x0340
        L_0x047f:
            r3 = r39
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x048b
            r3 = 108(0x6c, float:1.51E-43)
            goto L_0x0340
        L_0x048b:
            java.lang.String r3 = "WITHDRAWAL_PROCESSING"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0497
            r3 = 109(0x6d, float:1.53E-43)
            goto L_0x0340
        L_0x0497:
            java.lang.String r3 = "WITHDRAWAL_FAILURE"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x04a3
            r3 = 110(0x6e, float:1.54E-43)
            goto L_0x0340
        L_0x04a3:
            java.lang.String r3 = "WITHDRAWAL_PERMANENT_FAILED"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x04af
            r3 = 111(0x6f, float:1.56E-43)
            goto L_0x0340
        L_0x04af:
            boolean r3 = r11.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x04b9
            r3 = 112(0x70, float:1.57E-43)
            goto L_0x0340
        L_0x04b9:
            java.lang.String r3 = "SENT_TO_SELLER"
            boolean r0 = r3.equalsIgnoreCase(r0)
            r3 = 113(0x71, float:1.58E-43)
            if (r0 != 0) goto L_0x0340
            goto L_0x033f
        L_0x04c5:
            r3 = 105(0x69, float:1.47E-43)
            goto L_0x0340
        L_0x04c9:
            boolean r3 = r8.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x04d5
            boolean r0 = r9.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x033f
        L_0x04d5:
            r3 = 106(0x6a, float:1.49E-43)
            goto L_0x0340
        L_0x04d9:
            java.lang.String r3 = "PENDING_RECEIVER_SETUP"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x04e5
            r3 = 402(0x192, float:5.63E-43)
            goto L_0x0340
        L_0x04e5:
            boolean r3 = r15.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x04ef
            r3 = 403(0x193, float:5.65E-43)
            goto L_0x0340
        L_0x04ef:
            java.lang.String r3 = "REFUND_FAILED_DA"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x04fb
            r3 = 404(0x194, float:5.66E-43)
            goto L_0x0340
        L_0x04fb:
            r3 = r39
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0507
            r3 = 407(0x197, float:5.7E-43)
            goto L_0x0340
        L_0x0507:
            java.lang.String r3 = "INITIAL"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0513
            r3 = 401(0x191, float:5.62E-43)
            goto L_0x0340
        L_0x0513:
            boolean r3 = r8.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x05dd
            boolean r3 = r9.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x05dd
            r3 = r40
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x05d9
            boolean r3 = r10.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x05d9
            java.lang.String r3 = "REFUNDED"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0539
            r3 = 408(0x198, float:5.72E-43)
            goto L_0x0340
        L_0x0539:
            java.lang.String r3 = "REFUND_FAILED"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0545
            r3 = 409(0x199, float:5.73E-43)
            goto L_0x0340
        L_0x0545:
            java.lang.String r3 = "FAILED_RECEIVER_PROCESSING"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0551
            r3 = 410(0x19a, float:5.75E-43)
            goto L_0x0340
        L_0x0551:
            java.lang.String r3 = "REFUND_FAILED_PROCESSING"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x055d
            r3 = 411(0x19b, float:5.76E-43)
            goto L_0x0340
        L_0x055d:
            java.lang.String r3 = "FAILED_DA_FINAL"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0569
            r3 = 412(0x19c, float:5.77E-43)
            goto L_0x0340
        L_0x0569:
            java.lang.String r3 = "AUTH_CANCEL_FAILED_PROCESSING"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0575
            r3 = 413(0x19d, float:5.79E-43)
            goto L_0x0340
        L_0x0575:
            java.lang.String r3 = "AUTH_CANCEL_FAILED"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0581
            r3 = 414(0x19e, float:5.8E-43)
            goto L_0x0340
        L_0x0581:
            r3 = r38
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x05d5
            boolean r3 = r14.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0593
            r3 = 416(0x1a0, float:5.83E-43)
            goto L_0x0340
        L_0x0593:
            boolean r3 = r13.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x059d
            r3 = 419(0x1a3, float:5.87E-43)
            goto L_0x0340
        L_0x059d:
            boolean r3 = r12.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x05a7
            r3 = 420(0x1a4, float:5.89E-43)
            goto L_0x0340
        L_0x05a7:
            boolean r3 = r11.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x05b1
            r3 = 421(0x1a5, float:5.9E-43)
            goto L_0x0340
        L_0x05b1:
            java.lang.String r3 = "REVERSAL_SUCCESS"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x05bd
            r3 = 422(0x1a6, float:5.91E-43)
            goto L_0x0340
        L_0x05bd:
            java.lang.String r3 = "REVERSAL_PENDING"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x05c9
            r3 = 423(0x1a7, float:5.93E-43)
            goto L_0x0340
        L_0x05c9:
            java.lang.String r3 = "REFUND_PENDING"
            boolean r0 = r3.equalsIgnoreCase(r0)
            r3 = 424(0x1a8, float:5.94E-43)
            if (r0 != 0) goto L_0x0340
            goto L_0x033f
        L_0x05d5:
            r3 = 415(0x19f, float:5.82E-43)
            goto L_0x0340
        L_0x05d9:
            r3 = 406(0x196, float:5.69E-43)
            goto L_0x0340
        L_0x05dd:
            r3 = 405(0x195, float:5.68E-43)
            goto L_0x0340
        L_0x05e1:
            r65 = 101(0x65, float:1.42E-43)
            r57 = r45
            r58 = r12
            r59 = r31
            r60 = r48
            r61 = r3
            r62 = r2
            r63 = r14
            r64 = r6
            r66 = r54
            r68 = r56
            r69 = r20
            X.9lY r4 = X.C203419nz.A01(r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69)
            goto L_0x0305
        L_0x05ff:
            java.lang.String r4 = "deposit"
            goto L_0x0607
        L_0x0602:
            java.lang.String r4 = "refund"
            goto L_0x0607
        L_0x0605:
            java.lang.String r4 = "withdrawal"
        L_0x0607:
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x02ec
            X.C18740tg.A06(r42)
            r57 = r20
            goto L_0x02f3
        L_0x0614:
            java.lang.String r4 = "fbpay"
            boolean r4 = r7.equals(r4)
            r67 = 2
            if (r4 != 0) goto L_0x02e9
            goto L_0x02e7
        L_0x0620:
            java.lang.String r4 = "upi"
            boolean r4 = r7.equals(r4)
            r67 = 1
            if (r4 != 0) goto L_0x02e9
            goto L_0x02e7
        L_0x062c:
            java.lang.String r4 = "p2m_lite"
            boolean r4 = r7.equals(r4)
            r67 = 4
            if (r4 != 0) goto L_0x02e9
            goto L_0x02e7
        L_0x0638:
            java.lang.String r4 = "incentive"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x02c3
            r6 = 9
            goto L_0x02c6
        L_0x0644:
            java.lang.String r4 = "withdrawal"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x02c3
            r6 = 8
            goto L_0x02c6
        L_0x0650:
            java.lang.String r4 = "payout"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x02c3
            r6 = 300(0x12c, float:4.2E-43)
            goto L_0x02c6
        L_0x065c:
            java.lang.String r4 = "refund"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x02c3
            r6 = 7
            goto L_0x02c6
        L_0x0667:
            java.lang.String r4 = "p2m"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x02c3
            r6 = 200(0xc8, float:2.8E-43)
            if (r30 == 0) goto L_0x02c6
            r6 = 100
            goto L_0x02c6
        L_0x0677:
            java.lang.String r4 = "deposit"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x02c3
            r6 = 6
            goto L_0x02c6
        L_0x0682:
            if (r30 == 0) goto L_0x06c5
            if (r8 == 0) goto L_0x06a4
            int r55 = r42.BHO()
            r52 = 40
            r53 = 12
            r56 = 0
            r46 = r12
            r47 = r31
            r49 = r3
            r50 = r2
            r51 = r14
            r57 = r20
            X.9lY r4 = X.C203419nz.A01(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)
        L_0x06a0:
            int r6 = r4.A03
            goto L_0x0305
        L_0x06a4:
            int r64 = X.AnonymousClass9ZS.A00(r14)
            r62 = 20
            r63 = 12
            r66 = 0
            r55 = r45
            r56 = r12
            r57 = r31
            r58 = r48
            r59 = r3
            r60 = r2
            r61 = r14
            r65 = r54
            r67 = r20
            X.9lY r4 = X.C203419nz.A01(r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67)
            goto L_0x06a0
        L_0x06c5:
            int r64 = X.AnonymousClass9ZS.A00(r14)
            r62 = 10
            r63 = 11
            r66 = 0
            r55 = r45
            r56 = r12
            r57 = r31
            r58 = r48
            r59 = r3
            r60 = r2
            r61 = r14
            r65 = r54
            r67 = r20
            X.9lY r4 = X.C203419nz.A01(r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67)
            r6 = 10
            goto L_0x0305
        L_0x06e9:
            java.lang.String r4 = "seller"
            boolean r4 = r9.equals(r4)
            r56 = 2
            if (r4 != 0) goto L_0x0217
            goto L_0x0215
        L_0x06f5:
            X.9e3 r6 = r6.A03(r14)
            if (r6 == 0) goto L_0x08ee
            X.B66 r42 = r6.A01(r3)
            goto L_0x01f7
        L_0x0701:
            r12 = r2
            goto L_0x01d8
        L_0x0704:
            r13 = 1000(0x3e8, float:1.401E-42)
            if (r3 == 0) goto L_0x0710
            X.16T r4 = r6.A03
            X.16U r3 = r4.A01(r3)
            r10.A02 = r3
        L_0x0710:
            if (r12 == 0) goto L_0x071b
            double r3 = java.lang.Double.parseDouble(r12)
            double r11 = (double) r13
            double r3 = r3 * r11
            long r11 = (long) r3
            r10.A01 = r11
        L_0x071b:
            r10.A00 = r13
            X.9ua r37 = r10.A01()
            goto L_0x01ad
        L_0x0723:
            java.lang.String r4 = "money"
            X.9nx r12 = r13.A0c(r4)
            if (r12 != 0) goto L_0x0737
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            java.lang.String r3 = " :: money node is null"
            goto L_0x01a3
        L_0x0737:
            java.lang.String r4 = "value"
            java.lang.String r15 = r12.A0i(r4, r2)     // Catch:{ Exception -> 0x0769 }
            java.lang.String r4 = "offset"
            java.lang.String r13 = r12.A0i(r4, r2)     // Catch:{ Exception -> 0x0769 }
            java.lang.String r4 = r12.A0i(r3, r2)     // Catch:{ Exception -> 0x0769 }
            X.16T r3 = r6.A03     // Catch:{ Exception -> 0x0769 }
            X.16U r12 = r3.A01(r4)     // Catch:{ Exception -> 0x0769 }
            java.lang.Long r3 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x0769 }
            long r3 = r3.longValue()     // Catch:{ Exception -> 0x0769 }
            r10.A01 = r3     // Catch:{ Exception -> 0x0769 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x0769 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0769 }
            r10.A00 = r3     // Catch:{ Exception -> 0x0769 }
            r10.A02 = r12     // Catch:{ Exception -> 0x0769 }
            X.9ua r37 = r10.A01()     // Catch:{ Exception -> 0x0769 }
            goto L_0x01ad
        L_0x0769:
            r10 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            java.lang.String r3 = " :: an error occurred while parsing the money node :: e = "
            r4.append(r3)
            java.lang.String r3 = r10.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.whatsapp.util.Log.e((java.lang.String) r3)
            goto L_0x01ad
        L_0x0787:
            X.8av r6 = r4.A0A     // Catch:{ all -> 0x08eb }
            if (r6 != 0) goto L_0x078e
            r4.A0A = r3     // Catch:{ all -> 0x08eb }
            r6 = r3
        L_0x078e:
            r0 = r71
            r6.A04(r0, r1, r5)     // Catch:{ all -> 0x08eb }
            X.9ua r0 = r4.A09     // Catch:{ all -> 0x08eb }
            if (r0 == 0) goto L_0x0799
            r6.A01 = r0     // Catch:{ all -> 0x08eb }
        L_0x0799:
            java.lang.String r0 = "offer_claim"
            X.9nx r5 = r1.A0c(r0)     // Catch:{ all -> 0x08eb }
            if (r5 == 0) goto L_0x07c7
            java.lang.String r0 = "offer_id"
            java.lang.String r9 = r5.A0i(r0, r2)     // Catch:{ all -> 0x08eb }
            r0 = r26
            java.lang.String r8 = r5.A0i(r0, r2)     // Catch:{ all -> 0x08eb }
            java.lang.String r0 = "parent_transaction_id"
            java.lang.String r7 = r5.A0i(r0, r2)     // Catch:{ all -> 0x08eb }
            java.lang.String r0 = "incentive_payment_id"
            java.lang.String r5 = r5.A0i(r0, r2)     // Catch:{ all -> 0x08eb }
            if (r9 == 0) goto L_0x07c7
            if (r8 != 0) goto L_0x07c0
            if (r7 != 0) goto L_0x07c0
            goto L_0x07c7
        L_0x07c0:
            X.9ue r0 = new X.9ue     // Catch:{ all -> 0x08eb }
            r0.<init>(r9, r8, r7, r5)     // Catch:{ all -> 0x08eb }
            r6.A00 = r0     // Catch:{ all -> 0x08eb }
        L_0x07c7:
            java.lang.String r0 = "order"
            X.9nx r8 = r1.A0c(r0)     // Catch:{ all -> 0x08eb }
            if (r8 == 0) goto L_0x07f4
            r0 = r26
            java.lang.String r7 = r8.A0i(r0, r2)     // Catch:{ all -> 0x08eb }
            if (r7 == 0) goto L_0x07f4
            java.lang.String r0 = "message_id"
            java.lang.String r5 = r8.A0i(r0, r2)     // Catch:{ all -> 0x08eb }
            if (r5 == 0) goto L_0x07f4
            r1 = 0
            java.lang.String r0 = "expiry_ts"
            long r1 = r8.A0V(r0, r1)     // Catch:{ 19b -> 0x07e8 }
            goto L_0x07ed
        L_0x07e8:
            java.lang.String r0 = "PAY: PaymentTransactionCountryData/parseOrderData : invalid expiry timestamp format"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x08eb }
        L_0x07ed:
            X.9uo r0 = new X.9uo     // Catch:{ all -> 0x08eb }
            r0.<init>(r1, r7, r5)     // Catch:{ all -> 0x08eb }
            r6.A02 = r0     // Catch:{ all -> 0x08eb }
        L_0x07f4:
            monitor-exit(r4)
            r0 = r25
            r4.A09(r3, r0)
            monitor-enter(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r24)     // Catch:{ all -> 0x08eb }
            if (r0 != 0) goto L_0x080d
            X.8av r1 = r4.A0A     // Catch:{ all -> 0x08eb }
            if (r1 != 0) goto L_0x0808
            r4.A0A = r3     // Catch:{ all -> 0x08eb }
            r1 = r3
        L_0x0808:
            r0 = r24
            r1.A0S(r0)     // Catch:{ all -> 0x08eb }
        L_0x080d:
            monitor-exit(r4)
            monitor-enter(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r23)     // Catch:{ all -> 0x08eb }
            if (r0 != 0) goto L_0x0821
            X.8av r1 = r4.A0A     // Catch:{ all -> 0x08eb }
            if (r1 != 0) goto L_0x081c
            r4.A0A = r3     // Catch:{ all -> 0x08eb }
            r1 = r3
        L_0x081c:
            r0 = r23
            r1.A0R(r0)     // Catch:{ all -> 0x08eb }
        L_0x0821:
            monitor-exit(r4)
            r0 = r18
            r4.A0A(r3, r0)
            r5 = r73
            if (r73 == 0) goto L_0x005a
            if (r27 == 0) goto L_0x005a
            boolean r0 = android.text.TextUtils.isEmpty(r22)
            if (r0 != 0) goto L_0x005a
            boolean r0 = android.text.TextUtils.isEmpty(r22)
            if (r0 != 0) goto L_0x005a
            if (r22 == 0) goto L_0x005a
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005a }
            r0 = r22
            r1.<init>(r0)     // Catch:{ JSONException -> 0x005a }
            java.lang.String r0 = "pkeVersion"
            r1.getInt(r0)     // Catch:{ JSONException -> 0x005a }
            java.lang.String r0 = "nonce"
            java.lang.String r7 = r1.getString(r0)     // Catch:{ JSONException -> 0x005a }
            java.lang.String r0 = "serverPubKey"
            java.lang.String r6 = r1.getString(r0)     // Catch:{ JSONException -> 0x005a }
            java.lang.String r0 = "serverPubKeySig"
            java.lang.String r2 = r1.getString(r0)     // Catch:{ JSONException -> 0x005a }
            java.lang.String r0 = "cert"
            java.lang.String r9 = r1.getString(r0)     // Catch:{ JSONException -> 0x005a }
            java.lang.String r0 = "encData"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ JSONException -> 0x005a }
            r0 = 8
            byte[] r10 = android.util.Base64.decode(r7, r0)     // Catch:{ JSONException -> 0x005a }
            byte[] r11 = android.util.Base64.decode(r6, r0)     // Catch:{ JSONException -> 0x005a }
            byte[] r12 = android.util.Base64.decode(r2, r0)     // Catch:{ JSONException -> 0x005a }
            byte[] r13 = android.util.Base64.decode(r1, r0)     // Catch:{ JSONException -> 0x005a }
            X.39M r8 = new X.39M     // Catch:{ JSONException -> 0x005a }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ JSONException -> 0x005a }
            byte[] r6 = r8.A03
            byte[] r7 = r8.A04
            java.lang.String r2 = r8.A00
            X.9P1 r1 = new X.9P1
            r1.<init>()
            java.lang.String r0 = "CN=Facebook Purpose Encryption Signature"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ CertificateExpiredException -> 0x08e5, JSONException -> 0x005a }
            java.security.cert.X509Certificate r2 = r1.A00(r2, r0)     // Catch:{ CertificateExpiredException -> 0x08e5, JSONException -> 0x005a }
            java.lang.String r0 = "SHA256withRSA"
            java.security.Signature r1 = java.security.Signature.getInstance(r0)     // Catch:{ CertificateExpiredException -> 0x08e5, JSONException -> 0x005a }
            java.security.PublicKey r0 = r2.getPublicKey()     // Catch:{ CertificateExpiredException -> 0x08e5, JSONException -> 0x005a }
            r1.initVerify(r0)     // Catch:{ CertificateExpiredException -> 0x08e5, JSONException -> 0x005a }
            r1.update(r6)     // Catch:{ CertificateExpiredException -> 0x08e5, JSONException -> 0x005a }
            boolean r0 = r1.verify(r7)     // Catch:{ CertificateExpiredException -> 0x08e5, JSONException -> 0x005a }
            if (r0 == 0) goto L_0x005a
            goto L_0x08bb
        L_0x08a8:
            java.lang.String r0 = "incentive"
            goto L_0x08b3
        L_0x08ab:
            java.lang.String r0 = "withdrawal"
            goto L_0x08b3
        L_0x08ae:
            java.lang.String r0 = "refund"
            goto L_0x08b3
        L_0x08b1:
            java.lang.String r0 = "deposit"
        L_0x08b3:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002c
            goto L_0x003a
        L_0x08bb:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A00
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x08dd
            byte[] r0 = r5.A01
            byte[] r2 = X.C201929kj.A00(r6, r0)
            byte[] r1 = r8.A02
            byte[] r0 = r8.A01
            byte[] r1 = X.C200419hN.A02(r2, r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            r3.A0Q(r0)
            r5.destroy()
            return r4
        L_0x08dd:
            java.lang.String r1 = "key has been destroyed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x08e5:
            java.lang.String r0 = "Certificate expired"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r4
        L_0x08eb:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x08ee:
            java.lang.String r0 = "PaymentsProtoParser/parsePaymentTransaction service == null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1VY.A03(X.AZ9, X.9nx):X.9lY");
    }

    public ArrayList A04(AZ9 az9, C203399nx r9) {
        C203399nx[] r0;
        int length;
        C203399nx A0c = r9.A0c("account");
        if (A0c == null || (r0 = A0c.A02) == null || (length = r0.length) <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        do {
            C203399nx A0b = A0c.A0b(i);
            C18740tg.A06(A0b);
            if ("transaction".equals(A0b.A00)) {
                arrayList.add(A03(az9, A0b));
            }
            i++;
        } while (i < length);
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r17v11, types: [X.8az] */
    /* JADX WARNING: type inference failed for: r21v15, types: [X.8b4] */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02d3, code lost:
        if (r20 != false) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02db, code lost:
        if (r18 != false) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0301, code lost:
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        com.whatsapp.util.Log.w("PAY: PaymentsProtoParser unset payment method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03c2, code lost:
        r4 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0126, code lost:
        switch(r14) {
            case 0: goto L_0x0163;
            case 1: goto L_0x015e;
            case 2: goto L_0x0159;
            case 3: goto L_0x0154;
            case 4: goto L_0x014f;
            case 5: goto L_0x014a;
            case 6: goto L_0x0147;
            case 7: goto L_0x0142;
            case 8: goto L_0x0140;
            case 9: goto L_0x0136;
            case 10: goto L_0x0131;
            case 11: goto L_0x012c;
            default: goto L_0x0129;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012c, code lost:
        r20 = "1".equals(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0131, code lost:
        r17 = "1".equals(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0136, code lost:
        r0 = X.AnonymousClass6R8.A01(r7, 0) * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0140, code lost:
        r8 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0142, code lost:
        r19 = "1".equals(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0147, code lost:
        r25 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014a, code lost:
        r26 = X.C175798b4.A00(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014f, code lost:
        r31 = X.C175798b4.A01(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0154, code lost:
        r21 = "1".equals(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0159, code lost:
        r18 = "1".equals(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015e, code lost:
        r16 = "1".equals(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0163, code lost:
        r4 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c7, code lost:
        if (r12 == false) goto L_0x0123;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0061 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A05(X.C203399nx r33) {
        /*
            r32 = this;
            r9 = r33
            if (r33 == 0) goto L_0x0410
            java.lang.String r1 = "wa-support-phone-number"
            r0 = 0
            java.lang.String r2 = r9.A0i(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r3 = r32
            if (r0 != 0) goto L_0x0026
            X.1Db r0 = r3.A04
            android.content.SharedPreferences r0 = r0.A03()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "payments_support_phone_number"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
            r0.apply()
        L_0x0026:
            X.9nx[] r0 = r9.A02
            if (r0 == 0) goto L_0x0410
            int r15 = r0.length
            if (r15 <= 0) goto L_0x0410
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5 = 0
        L_0x0033:
            if (r5 >= r15) goto L_0x0411
            X.9nx r2 = r9.A0b(r5)
            X.C18740tg.A06(r2)
            java.lang.String r1 = r2.A00
            int r0 = r1.hashCode()
            switch(r0) {
                case -795192327: goto L_0x03f9;
                case -505296440: goto L_0x03fc;
                case 3016252: goto L_0x03ff;
                case 3046160: goto L_0x0402;
                case 1368775624: goto L_0x0405;
                default: goto L_0x0045;
            }
        L_0x0045:
            java.lang.String r0 = "PAY: PaymentsProtoParser unset payment method"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
        L_0x004b:
            if (r0 == 0) goto L_0x0061
            java.lang.String r1 = r2.A00
            int r0 = r1.hashCode()
            switch(r0) {
                case -795192327: goto L_0x03ce;
                case -505296440: goto L_0x030f;
                case 3016252: goto L_0x01e9;
                case 3046160: goto L_0x00e6;
                case 1368775624: goto L_0x0064;
                default: goto L_0x0056;
            }
        L_0x0056:
            java.lang.String r0 = "PAY: PaymentsProtoParser unset payment method"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x005b:
            r4 = 0
        L_0x005c:
            if (r4 == 0) goto L_0x0061
            r6.add(r4)
        L_0x0061:
            int r5 = r5 + 1
            goto L_0x0033
        L_0x0064:
            java.lang.String r0 = "custom_payment_method"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            r4 = 0
            X.1AL[] r11 = r2.A0k()     // Catch:{ Exception -> 0x00de }
            if (r11 != 0) goto L_0x0079
            java.lang.String r0 = "PAY: PaymentsProtoParser when parsing custom payment method: attributes are null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x00de }
            goto L_0x005c
        L_0x0079:
            r8 = 0
            r7 = r4
            r19 = r4
            r20 = r4
            r10 = 0
        L_0x0080:
            int r0 = r11.length     // Catch:{ Exception -> 0x00de }
            if (r10 >= r0) goto L_0x00ae
            r0 = r11[r10]     // Catch:{ Exception -> 0x00de }
            java.lang.String r12 = r0.A02     // Catch:{ Exception -> 0x00de }
            r0 = r11[r10]     // Catch:{ Exception -> 0x00de }
            java.lang.String r1 = r0.A03     // Catch:{ Exception -> 0x00de }
            java.lang.String r0 = "credential-id"
            boolean r0 = r12.equals(r0)     // Catch:{ Exception -> 0x00de }
            if (r0 == 0) goto L_0x0096
            r20 = r1
            goto L_0x00ab
        L_0x0096:
            java.lang.String r0 = "country"
            boolean r0 = r12.equals(r0)     // Catch:{ Exception -> 0x00de }
            if (r0 == 0) goto L_0x009f
            goto L_0x00aa
        L_0x009f:
            java.lang.String r0 = "type"
            boolean r0 = r12.equals(r0)     // Catch:{ Exception -> 0x00de }
            if (r0 == 0) goto L_0x00ab
            r19 = r1
            goto L_0x00ab
        L_0x00aa:
            r7 = r1
        L_0x00ab:
            int r10 = r10 + 1
            goto L_0x0080
        L_0x00ae:
            X.1EU r0 = r3.A06     // Catch:{ Exception -> 0x00de }
            X.9e3 r0 = r0.A03(r7)     // Catch:{ Exception -> 0x00de }
            X.C18740tg.A06(r0)     // Catch:{ Exception -> 0x00de }
            X.B66 r0 = X.C198699e3.A00(r0)     // Catch:{ Exception -> 0x00de }
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = "PAY: PaymentsProtoParser when parsing custom payment method: service is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x00de }
            goto L_0x005c
        L_0x00c3:
            X.8b9 r1 = r0.BKW()     // Catch:{ Exception -> 0x00de }
            X.C18740tg.A06(r1)     // Catch:{ Exception -> 0x00de }
            X.16T r0 = r3.A03     // Catch:{ Exception -> 0x00de }
            r1.A04(r0, r2, r8)     // Catch:{ Exception -> 0x00de }
            X.9l8 r17 = X.C202159l8.A00(r7)     // Catch:{ Exception -> 0x00de }
            X.8b3 r16 = new X.8b3     // Catch:{ Exception -> 0x00de }
            r21 = r19
            r18 = r1
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x00de }
            goto L_0x03c2
        L_0x00de:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentsProtoParser when creating merchant account: "
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x005c
        L_0x00e6:
            java.lang.String r0 = "card"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            X.1AL[] r11 = r2.A0k()
            r4 = 0
            if (r11 != 0) goto L_0x00fc
            java.lang.String r0 = "PAY: PaymentsProtoParser when parsing card: attributes are null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x005c
        L_0x00fc:
            r25 = r4
            r0 = -1
            r10 = 0
            r21 = 0
            r26 = 7
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r31 = 0
            r16 = 0
            r8 = r4
        L_0x0112:
            int r7 = r11.length
            r14 = 2
            if (r10 >= r7) goto L_0x01cb
            r7 = r11[r10]
            java.lang.String r13 = r7.A02
            java.lang.String r7 = r7.A03
            int r12 = r13.hashCode()
            switch(r12) {
                case -1485088175: goto L_0x01c0;
                case -387679965: goto L_0x01b8;
                case -387679962: goto L_0x01b1;
                case -129299872: goto L_0x01a9;
                case -65633415: goto L_0x01a1;
                case 3575610: goto L_0x0199;
                case 102744158: goto L_0x0191;
                case 270132229: goto L_0x0189;
                case 957831062: goto L_0x0180;
                case 1028554472: goto L_0x0177;
                case 1830091262: goto L_0x016e;
                case 1830091265: goto L_0x0165;
                default: goto L_0x0123;
            }
        L_0x0123:
            r14 = -1
        L_0x0124:
            java.lang.String r12 = "1"
            switch(r14) {
                case 0: goto L_0x0163;
                case 1: goto L_0x015e;
                case 2: goto L_0x0159;
                case 3: goto L_0x0154;
                case 4: goto L_0x014f;
                case 5: goto L_0x014a;
                case 6: goto L_0x0147;
                case 7: goto L_0x0142;
                case 8: goto L_0x0140;
                case 9: goto L_0x0136;
                case 10: goto L_0x0131;
                case 11: goto L_0x012c;
                default: goto L_0x0129;
            }
        L_0x0129:
            int r10 = r10 + 1
            goto L_0x0112
        L_0x012c:
            boolean r20 = r12.equals(r7)
            goto L_0x0129
        L_0x0131:
            boolean r17 = r12.equals(r7)
            goto L_0x0129
        L_0x0136:
            r0 = 0
            long r0 = X.AnonymousClass6R8.A01(r7, r0)
            r12 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            goto L_0x0129
        L_0x0140:
            r8 = r7
            goto L_0x0129
        L_0x0142:
            boolean r19 = r12.equals(r7)
            goto L_0x0129
        L_0x0147:
            r25 = r7
            goto L_0x0129
        L_0x014a:
            int r26 = X.C175798b4.A00(r7)
            goto L_0x0129
        L_0x014f:
            int r31 = X.C175798b4.A01(r7)
            goto L_0x0129
        L_0x0154:
            boolean r21 = r12.equals(r7)
            goto L_0x0129
        L_0x0159:
            boolean r18 = r12.equals(r7)
            goto L_0x0129
        L_0x015e:
            boolean r16 = r12.equals(r7)
            goto L_0x0129
        L_0x0163:
            r4 = r7
            goto L_0x0129
        L_0x0165:
            java.lang.String r12 = "default-debit-p2p"
            boolean r12 = r13.equals(r12)
            r14 = 11
            goto L_0x01c7
        L_0x016e:
            java.lang.String r12 = "default-debit-p2m"
            boolean r12 = r13.equals(r12)
            r14 = 10
            goto L_0x01c7
        L_0x0177:
            java.lang.String r12 = "created"
            boolean r12 = r13.equals(r12)
            r14 = 9
            goto L_0x01c7
        L_0x0180:
            java.lang.String r12 = "country"
            boolean r12 = r13.equals(r12)
            r14 = 8
            goto L_0x01c7
        L_0x0189:
            java.lang.String r12 = "default-credit"
            boolean r12 = r13.equals(r12)
            r14 = 7
            goto L_0x01c7
        L_0x0191:
            java.lang.String r12 = "last4"
            boolean r12 = r13.equals(r12)
            r14 = 6
            goto L_0x01c7
        L_0x0199:
            java.lang.String r12 = "type"
            boolean r12 = r13.equals(r12)
            r14 = 5
            goto L_0x01c7
        L_0x01a1:
            java.lang.String r12 = "network-type"
            boolean r12 = r13.equals(r12)
            r14 = 4
            goto L_0x01c7
        L_0x01a9:
            java.lang.String r12 = "default-debit"
            boolean r12 = r13.equals(r12)
            r14 = 3
            goto L_0x01c7
        L_0x01b1:
            java.lang.String r12 = "default-credit-p2p"
            boolean r12 = r13.equals(r12)
            goto L_0x01c7
        L_0x01b8:
            java.lang.String r12 = "default-credit-p2m"
            boolean r12 = r13.equals(r12)
            r14 = 1
            goto L_0x01c7
        L_0x01c0:
            java.lang.String r12 = "credential-id"
            boolean r12 = r13.equals(r12)
            r14 = 0
        L_0x01c7:
            if (r12 != 0) goto L_0x0124
            goto L_0x0123
        L_0x01cb:
            X.1EU r7 = r3.A06
            X.9e3 r7 = r7.A03(r8)
            if (r7 != 0) goto L_0x02ba
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "[PAY] : PaymentsProtoParser/parseCard unsupported country : "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x005b
        L_0x01e9:
            java.lang.String r0 = "bank"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            r4 = 0
            X.1AL[] r13 = r2.A0k()     // Catch:{ Exception -> 0x0307 }
            if (r13 != 0) goto L_0x01ff
            java.lang.String r0 = "PAY: PaymentsProtoParser when creating bank account: attributes are null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0307 }
            goto L_0x005c
        L_0x01ff:
            r0 = 0
            r14 = r4
            r27 = r4
            r26 = r4
            r25 = r4
            r21 = 0
            r12 = 0
            r17 = 0
            r16 = 0
        L_0x020f:
            int r7 = r13.length     // Catch:{ Exception -> 0x0307 }
            if (r12 >= r7) goto L_0x0275
            r7 = r13[r12]     // Catch:{ Exception -> 0x0307 }
            java.lang.String r11 = r7.A02     // Catch:{ Exception -> 0x0307 }
            r7 = r13[r12]     // Catch:{ Exception -> 0x0307 }
            java.lang.String r10 = r7.A03     // Catch:{ Exception -> 0x0307 }
            java.lang.String r7 = "credential-id"
            boolean r7 = r11.equals(r7)     // Catch:{ Exception -> 0x0307 }
            if (r7 == 0) goto L_0x0225
            r27 = r10
            goto L_0x0272
        L_0x0225:
            java.lang.String r7 = "account-number"
            boolean r7 = r11.equals(r7)     // Catch:{ Exception -> 0x0307 }
            if (r7 == 0) goto L_0x022e
            goto L_0x0270
        L_0x022e:
            java.lang.String r7 = "bank-name"
            boolean r7 = r11.equals(r7)     // Catch:{ Exception -> 0x0307 }
            if (r7 == 0) goto L_0x0239
            r25 = r10
            goto L_0x0272
        L_0x0239:
            java.lang.String r7 = "country"
            boolean r7 = r11.equals(r7)     // Catch:{ Exception -> 0x0307 }
            if (r7 == 0) goto L_0x0243
            r14 = r10
            goto L_0x0272
        L_0x0243:
            java.lang.String r7 = "default-debit"
            boolean r7 = r11.equals(r7)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r8 = "1"
            if (r7 == 0) goto L_0x0252
            boolean r17 = r10.equals(r8)     // Catch:{ Exception -> 0x0307 }
            goto L_0x0272
        L_0x0252:
            java.lang.String r7 = "default-credit"
            boolean r7 = r11.equals(r7)     // Catch:{ Exception -> 0x0307 }
            if (r7 == 0) goto L_0x025f
            boolean r16 = r10.equals(r8)     // Catch:{ Exception -> 0x0307 }
            goto L_0x0272
        L_0x025f:
            java.lang.String r7 = "created"
            boolean r7 = r11.equals(r7)     // Catch:{ Exception -> 0x0307 }
            if (r7 == 0) goto L_0x0272
            long r21 = X.AnonymousClass6R8.A01(r10, r0)     // Catch:{ Exception -> 0x0307 }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r21 = r21 * r7
            goto L_0x0272
        L_0x0270:
            r26 = r10
        L_0x0272:
            int r12 = r12 + 1
            goto L_0x020f
        L_0x0275:
            X.1EU r0 = r3.A06     // Catch:{ Exception -> 0x0307 }
            X.9e3 r0 = r0.A03(r14)     // Catch:{ Exception -> 0x0307 }
            X.C18740tg.A06(r0)     // Catch:{ Exception -> 0x0307 }
            X.B66 r0 = X.C198699e3.A00(r0)     // Catch:{ Exception -> 0x0307 }
            X.8bA r0 = r0.BKT()     // Catch:{ Exception -> 0x0307 }
            X.C18740tg.A06(r0)     // Catch:{ Exception -> 0x0307 }
            X.16T r7 = r3.A03     // Catch:{ Exception -> 0x0307 }
            r1 = 0
            r0.A04(r7, r2, r1)     // Catch:{ Exception -> 0x0307 }
            X.9l8 r18 = X.C202159l8.A00(r14)     // Catch:{ Exception -> 0x0307 }
            r19 = 0
            if (r17 == 0) goto L_0x0299
            r19 = 2
        L_0x0299:
            r20 = 0
            if (r16 == 0) goto L_0x029f
            r20 = 2
        L_0x029f:
            r23 = -1
            X.8az r2 = new X.8az     // Catch:{ Exception -> 0x0307 }
            r17 = r2
            r17.<init>(r18, r19, r20, r21, r23)     // Catch:{ Exception -> 0x0307 }
            r1 = r27
            r2.A0A = r1     // Catch:{ Exception -> 0x0307 }
            r1 = r26
            r2.A0E(r1)     // Catch:{ Exception -> 0x0307 }
            r1 = r25
            r2.A0B = r1     // Catch:{ Exception -> 0x0307 }
            r2.A0D = r4     // Catch:{ Exception -> 0x0307 }
            r2.A08 = r0     // Catch:{ Exception -> 0x0307 }
            goto L_0x0301
        L_0x02ba:
            X.B66 r7 = X.C198699e3.A00(r7)
            X.8bB r7 = r7.BKU()
            X.C18740tg.A06(r7)
            X.16T r11 = r3.A03
            r10 = 0
            r7.A04(r11, r2, r10)
            X.9l8 r22 = X.C202159l8.A00(r8)
            if (r21 != 0) goto L_0x02d5
            r27 = 0
            if (r20 == 0) goto L_0x02d7
        L_0x02d5:
            r27 = 2
        L_0x02d7:
            if (r19 != 0) goto L_0x02dd
            r28 = 0
            if (r18 == 0) goto L_0x02df
        L_0x02dd:
            r28 = 2
        L_0x02df:
            r29 = 0
            if (r17 == 0) goto L_0x02e5
            r29 = 2
        L_0x02e5:
            r30 = 0
            if (r16 == 0) goto L_0x02eb
            r30 = 2
        L_0x02eb:
            X.6c7 r2 = r7.A08
            if (r2 != 0) goto L_0x0304
            r8 = 0
        L_0x02f0:
            java.lang.String r8 = (java.lang.String) r8
            X.8b4 r2 = new X.8b4
            r21 = r2
            r23 = r4
            r24 = r8
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r2.A05 = r0
            r2.A08 = r7
        L_0x0301:
            r4 = r2
            goto L_0x005c
        L_0x0304:
            java.lang.Object r8 = r2.A00
            goto L_0x02f0
        L_0x0307:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentsProtoParser when creating bank account: "
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x005c
        L_0x030f:
            java.lang.String r0 = "merchant"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            r4 = 0
            X.1AL[] r12 = r2.A0k()     // Catch:{ Exception -> 0x03c6 }
            if (r12 != 0) goto L_0x0325
            java.lang.String r0 = "PAY: PaymentsProtoParser when parsing merchant: attributes are null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x03c6 }
            goto L_0x005c
        L_0x0325:
            r11 = 0
            r13 = r4
            r19 = r4
            r20 = r4
            r21 = r4
            r10 = 0
            r24 = 0
            r25 = 0
            r23 = 0
        L_0x0334:
            int r0 = r12.length     // Catch:{ Exception -> 0x03c6 }
            if (r10 >= r0) goto L_0x0396
            r0 = r12[r10]     // Catch:{ Exception -> 0x03c6 }
            java.lang.String r8 = r0.A02     // Catch:{ Exception -> 0x03c6 }
            r0 = r12[r10]     // Catch:{ Exception -> 0x03c6 }
            java.lang.String r7 = r0.A03     // Catch:{ Exception -> 0x03c6 }
            java.lang.String r0 = "credential-id"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03c6 }
            if (r0 == 0) goto L_0x034a
            r19 = r7
            goto L_0x0393
        L_0x034a:
            java.lang.String r0 = "country"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03c6 }
            if (r0 == 0) goto L_0x0353
            goto L_0x0392
        L_0x0353:
            java.lang.String r0 = "merchant-id"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03c6 }
            if (r0 == 0) goto L_0x035e
            r21 = r7
            goto L_0x0393
        L_0x035e:
            java.lang.String r0 = "p2m-eligible"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03c6 }
            java.lang.String r1 = "1"
            if (r0 == 0) goto L_0x036d
            boolean r24 = r1.equals(r7)     // Catch:{ Exception -> 0x03c6 }
            goto L_0x0393
        L_0x036d:
            java.lang.String r0 = "p2p-eligible"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03c6 }
            if (r0 == 0) goto L_0x037a
            boolean r25 = r1.equals(r7)     // Catch:{ Exception -> 0x03c6 }
            goto L_0x0393
        L_0x037a:
            java.lang.String r0 = "logo-uri"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03c6 }
            if (r0 == 0) goto L_0x0385
            r20 = r7
            goto L_0x0393
        L_0x0385:
            java.lang.String r0 = "max_installment_count"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03c6 }
            if (r0 == 0) goto L_0x0393
            int r23 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x03c6 }
            goto L_0x0393
        L_0x0392:
            r13 = r7
        L_0x0393:
            int r10 = r10 + 1
            goto L_0x0334
        L_0x0396:
            java.lang.String r1 = "gateway-name"
            java.lang.String r0 = ""
            java.lang.String r22 = r2.A0i(r1, r0)     // Catch:{ Exception -> 0x03c6 }
            X.1EU r0 = r3.A06     // Catch:{ Exception -> 0x03c6 }
            X.9e3 r0 = r0.A03(r13)     // Catch:{ Exception -> 0x03c6 }
            X.C18740tg.A06(r0)     // Catch:{ Exception -> 0x03c6 }
            X.B66 r0 = X.C198699e3.A00(r0)     // Catch:{ Exception -> 0x03c6 }
            X.8bE r0 = r0.BKX()     // Catch:{ Exception -> 0x03c6 }
            X.C18740tg.A06(r0)     // Catch:{ Exception -> 0x03c6 }
            X.16T r1 = r3.A03     // Catch:{ Exception -> 0x03c6 }
            r0.A04(r1, r2, r11)     // Catch:{ Exception -> 0x03c6 }
            X.9l8 r17 = X.C202159l8.A00(r13)     // Catch:{ Exception -> 0x03c6 }
            X.8b1 r16 = new X.8b1     // Catch:{ Exception -> 0x03c6 }
            r18 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x03c6 }
        L_0x03c2:
            r4 = r16
            goto L_0x005c
        L_0x03c6:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentsProtoParser when creating merchant account: "
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x005c
        L_0x03ce:
            java.lang.String r0 = "wallet"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            java.lang.String r1 = "country"
            r0 = 0
            java.lang.String r1 = r2.A0i(r1, r0)
            X.1EU r0 = r3.A06
            X.9e3 r0 = r0.A03(r1)
            X.C18740tg.A06(r0)
            X.B66 r0 = X.C198699e3.A00(r0)
            X.8b8 r0 = r0.BKZ()
            X.C18740tg.A06(r0)
            java.lang.String r1 = "fromNetwork"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x03f9:
            java.lang.String r0 = "wallet"
            goto L_0x0407
        L_0x03fc:
            java.lang.String r0 = "merchant"
            goto L_0x0407
        L_0x03ff:
            java.lang.String r0 = "bank"
            goto L_0x0407
        L_0x0402:
            java.lang.String r0 = "card"
            goto L_0x0407
        L_0x0405:
            java.lang.String r0 = "custom_payment_method"
        L_0x0407:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            r0 = 1
            goto L_0x004b
        L_0x0410:
            r6 = 0
        L_0x0411:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1VY.A05(X.9nx):java.util.ArrayList");
    }

    public AnonymousClass1VY(C19730wQ r4, C20310xM r5, AnonymousClass1VZ r6, AnonymousClass16T r7, C20810yC r8, C24601Db r9, C24631De r10, AnonymousClass1EU r11) {
        this.A00 = r4;
        this.A06 = r11;
        this.A01 = r5;
        this.A04 = r9;
        this.A02 = r6;
        this.A03 = r7;
        this.A05 = r10;
        this.A07 = new C29021Va((C19700wN) null, r8, new AnonymousClass19D(), (C192729Ii) null);
    }
}
