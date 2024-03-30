package X;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9o0  reason: invalid class name and case insensitive filesystem */
public abstract class C203429o0 {
    public static Message A01() {
        return Message.obtain((Handler) null, 0, 13, 0);
    }

    public static Message A04(String str, byte[] bArr, boolean z) {
        Message obtain = Message.obtain((Handler) null, 0, 35, 0);
        obtain.getData().putByteArray("rc", bArr);
        obtain.getData().putString("rcJid", str);
        obtain.getData().putBoolean("saveRecoveryToken", z);
        return obtain;
    }

    public static void A0B(C19700wN r5, C20810yC r6, String str, String str2, String str3, long j, boolean z) {
        if (str2 == null) {
            C18740tg.A0D(AnonymousClass000.A1P((j > 0 ? 1 : (j == 0 ? 0 : -1))), "loggableStanzaId must be >= 1.");
        }
        if (z && j == 0 && r6.A0E(4207)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("XmppSendMessage/validateStanzaKeyForAckOrReceipt ack-without-loggable-stanza-id cls=");
            A0u.append(str);
            A0u.append(", error=");
            A0u.append(str2);
            C36321k7.A1R(" id=", str3, A0u);
            r5.A0E("ack-without-loggable-stanza-id", AnonymousClass000.A0p("-", str2, AnonymousClass000.A0v(str)), false);
        }
    }

    public static Bundle A00(Message message) {
        Object obj = message.obj;
        if (obj instanceof Bundle) {
            return (Bundle) obj;
        }
        if (message.peekData() != null) {
            return message.getData();
        }
        return null;
    }

    public static Message A02(C19700wN r8, C20810yC r9, C207209uj r10) {
        C19700wN r0 = r8;
        C20810yC r1 = r9;
        A0B(r0, r1, r10.A05, r10.A03(), r10.A07, r10.A00, r10.A04());
        return Message.obtain((Handler) null, 0, 76, 0, r10);
    }

    public static Message A03(C19700wN r8, C20810yC r9, C207209uj r10, boolean z) {
        C19700wN r0 = r8;
        C20810yC r1 = r9;
        A0B(r0, r1, "notification-contact", r10.A03(), r10.A07, r10.A00, true);
        Bundle A07 = AnonymousClass001.A07();
        A07.putParcelable("stanzaKey", r10);
        A07.putBoolean("isValid", z);
        return Message.obtain((Handler) null, 0, 42, 0, A07);
    }

    public static AnonymousClass9WB A07(Message message, C20810yC r10) {
        C203399nx r3;
        long j;
        C207209uj r4;
        C203399nx r32;
        String str;
        Bundle bundle;
        String str2;
        DeviceJid deviceJid;
        DeviceJid deviceJid2;
        String str3;
        String str4;
        int i = message.arg1;
        if (i == 9) {
            Object obj = message.obj;
            C18740tg.A06(obj);
            AnonymousClass3T1 r1 = (AnonymousClass3T1) obj;
            r3 = C203719oc.A05(r1, message.arg2);
            j = r1.A1Q;
        } else if (i != 11) {
            if (i != 76) {
                if (i == 96) {
                    Bundle A00 = A00(message);
                    C18740tg.A06(A00);
                    r4 = (C207209uj) A00.getParcelable("stanzaKey");
                    C18740tg.A06(r4);
                    r32 = null;
                    if (A00.getBoolean("disable")) {
                        AnonymousClass1AL r2 = new AnonymousClass1AL("readreceipts", "disable");
                        AnonymousClass1AL[] A0k = C165617ti.A0k();
                        A0k[0] = r2;
                        r32 = C203399nx.A05("features", A0k, (C203399nx[]) null);
                    }
                } else if (i != 129) {
                    if (i == 362) {
                        Object obj2 = message.obj;
                        C18740tg.A06(obj2);
                        C21336AHo aHo = (C21336AHo) obj2;
                        C64933Qa r42 = aHo.A08;
                        Jid BHI = aHo.BHI();
                        C222713q r0 = AnonymousClass11F.A00;
                        r3 = C203719oc.A01(C222713q.A00(BHI), DeviceJid.of(aHo.A07), (UserJid) null, r42, (String) null, (String[]) null, 1);
                        j = 0;
                    } else if (i == 419) {
                        C194019Nu r02 = (C194019Nu) message.obj;
                        C64933Qa r43 = r02.A06;
                        String str5 = r02.A07;
                        String[] strArr = r02.A02;
                        r3 = C203719oc.A01(r02.A03, r02.A04, r02.A05, r43, str5, strArr, r02.A00);
                        j = r02.A01;
                    } else if (i == 431) {
                        Object obj3 = message.obj;
                        C18740tg.A06(obj3);
                        C193589Mb r03 = (C193589Mb) obj3;
                        r3 = C203719oc.A00(r03.A01, r03.A02, (Integer) null, r03.A04, (String) null, r03.A03, (String) null);
                        j = r03.A00;
                    } else if (!r10.A0E(6175)) {
                        return null;
                    } else {
                        if (i == 42) {
                            Bundle A002 = A00(message);
                            C18740tg.A06(A002);
                            r4 = (C207209uj) A002.getParcelable("stanzaKey");
                            if (A002.getBoolean("isValid")) {
                                str = "in";
                            } else {
                                str = "out";
                            }
                            AnonymousClass1AL r12 = new AnonymousClass1AL("contacts", str);
                            AnonymousClass1AL[] A0k2 = C165617ti.A0k();
                            A0k2[0] = r12;
                            r32 = C203399nx.A05("sync", A0k2, (C203399nx[]) null);
                        } else if (i != 157) {
                            switch (i) {
                                case AnonymousClass8SX.ENC_COMMENT_MESSAGE_FIELD_NUMBER:
                                    bundle = A00(message);
                                    C18740tg.A06(bundle);
                                    str2 = bundle.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                    deviceJid = A06(bundle, "jid");
                                    deviceJid2 = A06(bundle, "callCreatorJid");
                                    str3 = bundle.getString("callId");
                                    str4 = "offer";
                                    break;
                                case 72:
                                    bundle = A00(message);
                                    C18740tg.A06(bundle);
                                    str2 = bundle.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                    deviceJid = A06(bundle, "jid");
                                    deviceJid2 = A06(bundle, "callCreatorJid");
                                    str3 = bundle.getString("callId");
                                    str4 = "accept";
                                    break;
                                case 73:
                                    bundle = A00(message);
                                    C18740tg.A06(bundle);
                                    str2 = bundle.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                    deviceJid = A06(bundle, "jid");
                                    deviceJid2 = A06(bundle, "callCreatorJid");
                                    str3 = bundle.getString("callId");
                                    str4 = "reject";
                                    break;
                                default:
                                    return null;
                            }
                            r3 = C203719oc.A02(deviceJid, deviceJid2, str2, str3, str4);
                            j = bundle.getLong("loggableStanzaId");
                        } else {
                            Bundle A003 = A00(message);
                            C18740tg.A06(A003);
                            r3 = C203719oc.A03(A06(A003, "jid"), A06(A003, "callCreatorJid"), A003.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), A003.getString("callId"), A003.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), A003.getByteArray("registrationId"), A003.getByte("retry"));
                            j = A003.getLong("loggableStanzaId");
                        }
                    }
                }
                r3 = C203719oc.A06(r32, r4);
                j = r4.A00;
            }
            C207209uj r13 = (C207209uj) message.obj;
            r3 = C203719oc.A06(r13.A01(), r13);
            j = r13.A00;
        } else {
            C194079Oa r04 = (C194079Oa) message.obj;
            r3 = C203719oc.A04(r04);
            j = r04.A03;
        }
        return new AnonymousClass9WB(r3, (Long) null, j);
    }

    public static StringBuilder A08(C203399nx r1, C200139gg r2) {
        r2.A08.A06(r1);
        return new StringBuilder();
    }

    public static void A09(Bundle bundle, DeviceJid deviceJid, Jid jid, String str, String str2, long j) {
        bundle.putString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        bundle.putString("jid", AnonymousClass143.A03(jid));
        bundle.putString("callCreatorJid", AnonymousClass143.A03(deviceJid));
        bundle.putString("callId", str2);
        bundle.putLong("loggableStanzaId", j);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: X.9nx[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v161, resolved type: X.1AL[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: X.9nx[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: X.9nx[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v163, resolved type: X.1AL[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: X.9nx[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: X.9nx[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v266, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: X.3Qa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v294, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v353, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v354, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v387, resolved type: X.1AL[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v28, resolved type: X.3Qa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v388, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v29, resolved type: X.3Qa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v391, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r1v357, types: [java.lang.String] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x10c8: MOVE  (r1v133 int) = (r21v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0e0f A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0e1e A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0e21 A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0e50 A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0e5e A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0e62 A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0ea2 A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x0ecf A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0eda A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0ee1 A[ADDED_TO_REGION, Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0f26 A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0f3f A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0f91 A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0f9d A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x0fa1 A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0fbd A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0fbf A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0fc9 A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0fdc A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x1058 A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x105b A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:452:0x107e A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x10b3 A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x10de A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x10eb A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x111a A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x111d A[Catch:{ 1WY -> 0x1265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x1128 A[Catch:{ 1WY -> 0x1265 }] */
    public static void A0A(android.os.Message r59, X.AnonymousClass1WZ r60, X.AnonymousClass1WZ r61) {
        /*
            r7 = r59
            android.os.Bundle r2 = A00(r7)
            int r10 = r7.arg1
            r0 = r61
            if (r10 == 0) goto L_0x133b
            r1 = 3
            if (r10 == r1) goto L_0x1308
            r1 = 6
            r6 = r60
            if (r10 == r1) goto L_0x12b2
            r1 = 8
            if (r10 == r1) goto L_0x0c01
            r1 = 9
            if (r10 == r1) goto L_0x0bf7
            r1 = 23
            if (r10 == r1) goto L_0x0be4
            r1 = 24
            if (r10 == r1) goto L_0x0bd9
            r1 = 42
            java.lang.String r13 = "stanzaKey"
            if (r10 == r1) goto L_0x0b88
            r1 = 43
            if (r10 == r1) goto L_0x0b7c
            r1 = 76
            if (r10 == r1) goto L_0x0b74
            r1 = 77
            if (r10 == r1) goto L_0x0a5f
            java.lang.String r9 = "remoteResource"
            java.lang.String r11 = "messageKeyId"
            r1 = 0
            java.lang.String r3 = "loggableStanzaId"
            java.lang.String r4 = "callId"
            java.lang.String r8 = "callCreatorJid"
            java.lang.String r12 = "jid"
            java.lang.String r5 = "id"
            switch(r10) {
                case 6: goto L_0x12b2;
                case 18: goto L_0x05c4;
                case 21: goto L_0x0639;
                case 27: goto L_0x064a;
                case 29: goto L_0x06c4;
                case 61: goto L_0x0711;
                case 96: goto L_0x0799;
                case 117: goto L_0x07a9;
                case 129: goto L_0x0805;
                case 157: goto L_0x081e;
                case 163: goto L_0x0865;
                case 206: goto L_0x0894;
                case 233: goto L_0x12b2;
                case 240: goto L_0x08d6;
                case 247: goto L_0x00a0;
                case 263: goto L_0x0a38;
                case 276: goto L_0x00fa;
                case 295: goto L_0x0900;
                case 327: goto L_0x0ae2;
                case 343: goto L_0x092f;
                case 356: goto L_0x092f;
                case 362: goto L_0x099d;
                case 406: goto L_0x012e;
                case 419: goto L_0x0584;
                case 431: goto L_0x09d5;
                default: goto L_0x0048;
            }
        L_0x0048:
            switch(r10) {
                case 11: goto L_0x0528;
                case 12: goto L_0x04cd;
                case 13: goto L_0x0557;
                default: goto L_0x004b;
            }
        L_0x004b:
            switch(r10) {
                case 35: goto L_0x0393;
                case 36: goto L_0x033e;
                case 37: goto L_0x03fa;
                case 38: goto L_0x0453;
                default: goto L_0x004e;
            }
        L_0x004e:
            switch(r10) {
                case 71: goto L_0x02dc;
                case 72: goto L_0x030d;
                case 73: goto L_0x0a01;
                default: goto L_0x0051;
            }
        L_0x0051:
            switch(r10) {
                case 85: goto L_0x0161;
                case 86: goto L_0x0213;
                case 87: goto L_0x0283;
                case 88: goto L_0x1363;
                case 89: goto L_0x0584;
                case 90: goto L_0x0075;
                default: goto L_0x0054;
            }
        L_0x0054:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "XmppSendMessage/unknown what="
            r1.append(r0)
            int r0 = r7.what
            r1.append(r0)
            java.lang.String r0 = "argv1="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "object="
            r1.append(r0)
            java.lang.Object r0 = r7.obj
            X.C36331k8.A1P(r0, r1)
        L_0x0074:
            return
        L_0x0075:
            java.lang.Object r3 = r7.obj
            java.util.List r3 = (java.util.List) r3
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "XmppSendMessage/dangling-msgs/count "
            r2.append(r1)
            int r1 = r3.size()
            X.C36321k7.A1Y(r2, r1)
            java.util.Iterator r3 = r3.iterator()
        L_0x008d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0074
            X.3T1 r2 = X.C36391kE.A0l(r3)
            boolean r1 = r2.A14
            if (r1 != 0) goto L_0x008d
            r1 = 1
            r0.A00(r2, r1)
            goto L_0x008d
        L_0x00a0:
            java.lang.Object r3 = r7.obj
            java.util.List r3 = (java.util.List) r3
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "XmppSendMessage/dangling-receipts/count "
            r2.append(r1)
            int r1 = r3.size()
            X.C36321k7.A1Y(r2, r1)
            java.util.Iterator r5 = r3.iterator()
        L_0x00b8:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0074
            java.lang.Object r4 = r5.next()
            X.9uj r4 = (X.C207209uj) r4
            java.lang.String r2 = r4.A05
            java.lang.String r1 = "receipt"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00f6
            java.lang.String r2 = r4.A08
            java.lang.String r1 = "read"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00e0
            java.lang.String r1 = "read-self"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00f6
        L_0x00e0:
            X.1WX r1 = r0.A00
            X.1WV r3 = r1.A02
            com.whatsapp.jid.Jid r1 = r4.A02
            X.11F r2 = X.AnonymousClass143.A00(r1)
            X.1C5 r1 = r3.A00
            boolean r1 = r1.A04(r2)
            r1 = r1 ^ 1
            r0.A03(r4, r1)
            goto L_0x00b8
        L_0x00f6:
            r0.A02(r4)
            goto L_0x00b8
        L_0x00fa:
            java.lang.Object r3 = r7.obj
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x012e
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "XmppSendMessage/dangling-notifications/count "
            r2.append(r1)
            int r1 = r3.size()
            X.C36321k7.A1Y(r2, r1)
            java.util.Iterator r4 = r3.iterator()
        L_0x0114:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0074
            java.lang.Object r3 = r4.next()
            X.9uj r3 = (X.C207209uj) r3
            java.lang.String r2 = r3.A05
            java.lang.String r1 = "notification"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0114
            r0.A02(r3)
            goto L_0x0114
        L_0x012e:
            java.lang.Object r2 = r7.obj
            X.C18740tg.A06(r2)
            java.util.List r2 = (java.util.List) r2
            int r4 = X.C1900396q.A00(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "XmppSendMessage/preacks/count "
            r1.append(r0)
            int r0 = r2.size()
            X.C36321k7.A1Y(r1, r0)
            java.util.Iterator r3 = r2.iterator()
        L_0x014d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = r3.next()
            X.9WB r0 = (X.AnonymousClass9WB) r0
            long r1 = r0.A00
            X.9nx r0 = r0.A01
            r6.A01(r0, r4, r1)
            goto L_0x014d
        L_0x0161:
            java.lang.Object r2 = r7.obj
            X.C18740tg.A06(r2)
            X.9Lq r2 = (X.C193489Lq) r2
            byte[] r4 = r2.A01
            byte[] r3 = r2.A02
            X.5tq[] r11 = r2.A03
            X.5tq r12 = r2.A00
            X.1WX r0 = r0.A00
            X.9gg r6 = r0.A00
            r16 = 5
            int r0 = r6.A00
            java.lang.String r10 = X.C200139gg.A00(r6, r0)
            java.util.Map r2 = r6.A03
            r9 = 0
            X.B7S r0 = new X.B7S
            r0.<init>(r6, r3, r9)
            r2.put(r10, r0)
            int r14 = r11.length
            X.9nx[] r2 = new X.C203399nx[r14]
            r7 = 0
        L_0x018b:
            java.lang.String r13 = "value"
            r8 = 2
            if (r7 >= r14) goto L_0x01b0
            X.9nx[] r8 = new X.C203399nx[r8]
            r0 = r11[r7]
            byte[] r0 = r0.A01
            X.C203399nx.A0G(r5, r0, r1, r8, r9)
            r0 = r11[r7]
            byte[] r0 = r0.A00
            X.9nx r15 = new X.9nx
            r15.<init>((java.lang.String) r13, (byte[]) r0, (X.AnonymousClass1AL[]) r1)
            r0 = 1
            r8[r0] = r15
            java.lang.String r0 = "key"
            X.9nx r0 = X.C203399nx.A05(r0, r1, r8)
            r2[r7] = r0
            int r7 = r7 + 1
            goto L_0x018b
        L_0x01b0:
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "identity"
            X.C203399nx.A0D(r0, r7, r4, r1)
            java.lang.String r0 = "registration"
            X.C203399nx.A0D(r0, r7, r3, r1)
            r0 = 1
            byte[] r0 = new byte[r0]
            r0[r9] = r16
            java.lang.String r4 = "type"
            X.C203399nx.A0D(r4, r7, r0, r1)
            java.lang.String r0 = "list"
            X.C203399nx.A0F(r0, r7, r1, r2)
            r3 = 3
            X.9nx[] r11 = new X.C203399nx[r3]
            byte[] r0 = r12.A01
            X.C203399nx.A0G(r5, r0, r1, r11, r9)
            byte[] r0 = r12.A00
            X.9nx r2 = new X.9nx
            r2.<init>((java.lang.String) r13, (byte[]) r0, (X.AnonymousClass1AL[]) r1)
            r0 = 1
            r11[r0] = r2
            byte[] r2 = r12.A02
            java.lang.String r0 = "signature"
            X.C203399nx.A0G(r0, r2, r1, r11, r8)
            java.lang.String r0 = "skey"
            X.C203399nx.A0F(r0, r7, r1, r11)
            r0 = 4
            X.1AL[] r2 = new X.AnonymousClass1AL[r0]
            X.C36341k9.A1L(r5, r10, r2, r9)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "encrypt"
            X.C165587tf.A1L(r1, r0, r2)
            java.lang.String r0 = "set"
            X.C36341k9.A1L(r4, r0, r2, r8)
            X.C36341k9.A1V(r2, r3)
            X.9nx[] r1 = X.C165577te.A1b(r7, r9)
            java.lang.String r0 = "iq"
            X.9nx r1 = X.C203399nx.A05(r0, r2, r1)
            X.9nk r0 = r6.A08
            r0.A06(r1)
            java.lang.String r0 = "WriterThread/write/set-pre-key"
            goto L_0x1396
        L_0x0213:
            java.lang.Object r2 = r7.obj
            X.C18740tg.A06(r2)
            X.9KO r2 = (X.AnonymousClass9KO) r2
            java.lang.String r11 = r2.A02
            X.5tq r8 = r2.A01
            X.9Xg r3 = r2.A00
            X.1WX r0 = r0.A00
            X.9gg r2 = r0.A00
            java.util.Map r0 = r2.A03
            r0.put(r11, r3)
            X.9nk r4 = r2.A08
            r0 = 4
            X.1AL[] r6 = new X.AnonymousClass1AL[r0]
            java.lang.String r2 = "xmlns"
            java.lang.String r0 = "encrypt"
            boolean r10 = X.C36371kC.A1Y(r2, r0, r6)
            java.lang.String r3 = "type"
            java.lang.String r2 = "set"
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r3, (java.lang.String) r2)
            r9 = 1
            r6[r9] = r0
            X.8e2 r3 = X.C177588e2.A00
            java.lang.String r2 = "to"
            X.1AL r0 = new X.1AL
            r0.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r2)
            r7 = 2
            r6[r7] = r0
            X.1AL r2 = new X.1AL
            r2.<init>((java.lang.String) r5, (java.lang.String) r11)
            r0 = 3
            r6[r0] = r2
            X.9nx[] r3 = new X.C203399nx[r0]
            byte[] r0 = r8.A01
            X.C203399nx.A0G(r5, r0, r1, r3, r10)
            byte[] r2 = r8.A00
            java.lang.String r0 = "value"
            X.C203399nx.A0G(r0, r2, r1, r3, r9)
            byte[] r2 = r8.A02
            java.lang.String r0 = "signature"
            X.C203399nx.A0G(r0, r2, r1, r3, r7)
            java.lang.String r0 = "skey"
            X.9nx r3 = X.C203399nx.A05(r0, r1, r3)
            java.lang.String r2 = "rotate"
            X.9nx r0 = new X.9nx
            r0.<init>((X.C203399nx) r3, (java.lang.String) r2, (X.AnonymousClass1AL[]) r1)
            X.9nx r0 = X.C36391kE.A0m(r0, r6)
            r4.A06(r0)
            java.lang.String r0 = "WriterThread/write/rotate-pre-key"
            goto L_0x1396
        L_0x0283:
            X.C18740tg.A06(r2)
            java.lang.String r7 = r2.getString(r5)
            java.lang.String r3 = "jids"
            android.os.Parcelable[] r4 = r2.getParcelableArray(r3)
            com.whatsapp.jid.DeviceJid[] r4 = (com.whatsapp.jid.DeviceJid[]) r4
            java.lang.String r3 = "identityJids"
            android.os.Parcelable[] r3 = r2.getParcelableArray(r3)
            java.lang.String r16 = "; jids="
            java.util.Arrays.toString(r4)
            X.1WX r0 = r0.A00
            X.9gg r6 = r0.A00
            java.util.Map r2 = r6.A03
            r10 = 1
            X.B7S r0 = new X.B7S
            r0.<init>(r6, r4, r10)
            r2.put(r7, r0)
            int r14 = r4.length
            java.util.ArrayList r9 = X.C36441kJ.A14(r14)
            java.util.HashSet r13 = X.C36421kH.A0g(r3)
            r8 = 0
            r11 = 0
        L_0x02b7:
            r2 = 2
            if (r11 >= r14) goto L_0x12d4
            r0 = r4[r11]
            boolean r15 = r13.contains(r0)
            java.lang.String r3 = "user"
            if (r15 == 0) goto L_0x02d6
            X.1AL[] r15 = new X.AnonymousClass1AL[r2]
            X.C90504aG.A1E(r0, r12, r15, r8)
            java.lang.String r2 = "reason"
            java.lang.String r0 = "identity"
            X.C36341k9.A1L(r2, r0, r15, r10)
        L_0x02d0:
            X.C203399nx.A0E(r3, r9, r15)
            int r11 = r11 + 1
            goto L_0x02b7
        L_0x02d6:
            X.1AL[] r15 = new X.AnonymousClass1AL[r10]
            X.C90504aG.A1E(r0, r12, r15, r8)
            goto L_0x02d0
        L_0x02dc:
            java.lang.String r7 = r2.getString(r5)
            java.lang.String r1 = r2.getString(r12)
            com.whatsapp.jid.DeviceJid r6 = com.whatsapp.jid.DeviceJid.getNullable(r1)
            java.lang.String r1 = r2.getString(r8)
            com.whatsapp.jid.DeviceJid r5 = com.whatsapp.jid.DeviceJid.getNullable(r1)
            java.lang.String r4 = r2.getString(r4)
            long r1 = r2.getLong(r3)
            X.1WX r0 = r0.A00
            X.9gg r3 = r0.A00
            java.lang.String r0 = "offer"
            X.9nx r0 = X.C203719oc.A02(r6, r5, r7, r4, r0)
            r3.A04(r0, r1)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WriterThread/write/call-offer-receipt; callId="
            goto L_0x0a30
        L_0x030d:
            java.lang.String r7 = r2.getString(r5)
            java.lang.String r1 = r2.getString(r12)
            com.whatsapp.jid.DeviceJid r6 = com.whatsapp.jid.DeviceJid.getNullable(r1)
            java.lang.String r1 = r2.getString(r8)
            com.whatsapp.jid.DeviceJid r5 = com.whatsapp.jid.DeviceJid.getNullable(r1)
            java.lang.String r4 = r2.getString(r4)
            long r1 = r2.getLong(r3)
            X.1WX r0 = r0.A00
            X.9gg r3 = r0.A00
            java.lang.String r0 = "accept"
            X.9nx r0 = X.C203719oc.A02(r6, r5, r7, r4, r0)
            r3.A04(r0, r1)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WriterThread/write/call-accept-receipt; callId="
            goto L_0x0a30
        L_0x033e:
            java.lang.String r2 = "XmppSendMessage/get-normalized-jid"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.lang.Object r2 = r7.obj
            X.9Hu r2 = (X.C192599Hu) r2
            java.lang.String r8 = r2.A00
            java.lang.String r7 = "; phoneNumber="
            java.lang.String r4 = r2.A01
            X.1WX r0 = r0.A00
            X.9gg r10 = r0.A00
            int r0 = r10.A00
            r9 = 1
            java.lang.String r6 = X.C200139gg.A00(r10, r0)
            java.util.Map r2 = r10.A03
            r0 = 5
            X.B7R.A00(r10, r6, r2, r0)
            r3 = 2
            X.9nx[] r12 = new X.C203399nx[r3]
            java.lang.String r2 = "cc"
            X.9nx r0 = new X.9nx
            r0.<init>((java.lang.String) r2, (java.lang.String) r8, (X.AnonymousClass1AL[]) r1)
            r11 = 0
            r12[r11] = r0
            java.lang.String r2 = "in"
            X.9nx r0 = new X.9nx
            r0.<init>((java.lang.String) r2, (java.lang.String) r4, (X.AnonymousClass1AL[]) r1)
            r12[r9] = r0
            java.lang.String r0 = "normalize"
            X.9nx r2 = X.C203399nx.A05(r0, r1, r12)
            r0 = 4
            X.1AL[] r1 = new X.AnonymousClass1AL[r0]
            X.C36341k9.A1V(r1, r11)
            java.lang.String r0 = "urn:xmpp:whatsapp:account"
            X.C165567td.A1S(r0, r1, r9, r3)
            X.C36361kB.A1Q(r5, r6, r1)
            X.C200139gg.A01(r2, r10, r1)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WriterThread/write/get-normalized-jid; countryCode="
            goto L_0x09fd
        L_0x0393:
            java.lang.String r1 = "XmppSendMessage/set-recovery-token"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            android.os.Bundle r2 = r7.getData()
            java.lang.String r1 = "rc"
            byte[] r8 = r2.getByteArray(r1)
            android.os.Bundle r2 = r7.getData()
            java.lang.String r1 = "rcJid"
            java.lang.String r4 = r2.getString(r1)
            android.os.Bundle r2 = r7.getData()
            java.lang.String r1 = "saveRecoveryToken"
            boolean r3 = r2.getBoolean(r1)
            X.1WX r0 = r0.A00
            X.9gg r6 = r0.A00
            int r0 = r6.A00
            r7 = 1
            java.lang.String r2 = X.C200139gg.A00(r6, r0)
            java.util.Map r1 = r6.A03
            X.2bf r0 = new X.2bf
            r0.<init>(r6, r4, r8, r3)
            r1.put(r2, r0)
            java.lang.String r1 = "token"
            r0 = 0
            X.9nx r4 = new X.9nx
            r4.<init>((java.lang.String) r1, (byte[]) r8, (X.AnonymousClass1AL[]) r0)
            r0 = 4
            X.1AL[] r3 = new X.AnonymousClass1AL[r0]
            X.C36381kD.A1N(r5, r2, r3)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:auth:token"
            X.C36341k9.A1L(r1, r0, r3, r7)
            java.lang.String r1 = "type"
            java.lang.String r0 = "set"
            X.C36351kA.A1N(r1, r0, r3)
            X.8e2 r2 = X.C177588e2.A00
            java.lang.String r0 = "to"
            X.1AL r1 = new X.1AL
            r1.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r0)
            r0 = 3
            r3[r0] = r1
            X.C200139gg.A01(r4, r6, r3)
            java.lang.String r0 = "WriterThread/write/set-recovery-token"
            goto L_0x1396
        L_0x03fa:
            if (r2 == 0) goto L_0x0400
            java.lang.String r1 = r2.getString(r5)
        L_0x0400:
            java.lang.Object r2 = r7.obj
            boolean r7 = X.AnonymousClass000.A1X(r2)
            X.1WX r0 = r0.A00
            X.9gg r8 = r0.A00
            r9 = 1
            if (r1 != 0) goto L_0x0413
            int r0 = r8.A00
            java.lang.String r1 = X.C200139gg.A00(r8, r0)
        L_0x0413:
            java.util.Map r2 = r8.A03
            X.8mZ r0 = new X.8mZ
            r0.<init>(r8, r7)
            r2.put(r1, r0)
            java.lang.String r6 = "passive"
            if (r7 == 0) goto L_0x0451
            java.lang.String r2 = "active"
        L_0x0423:
            r0 = 0
            X.9nx r4 = X.C203399nx.A04(r2, r0)
            r0 = 4
            X.1AL[] r3 = new X.AnonymousClass1AL[r0]
            r0 = 0
            X.C36341k9.A1L(r5, r1, r3, r0)
            java.lang.String r0 = "xmlns"
            X.C36341k9.A1L(r0, r6, r3, r9)
            r2 = 2
            java.lang.String r1 = "type"
            java.lang.String r0 = "set"
            X.C36341k9.A1L(r1, r0, r3, r2)
            r0 = 3
            X.C36341k9.A1V(r3, r0)
            X.C200139gg.A01(r4, r8, r3)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WriterThread/write/set-connection-active; active="
            r6.append(r0)
            r6.append(r7)
            goto L_0x1302
        L_0x0451:
            r2 = r6
            goto L_0x0423
        L_0x0453:
            java.lang.Object r3 = r7.obj
            X.9Lp r3 = (X.C193479Lp) r3
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "id="
            r2.append(r1)
            java.lang.String[] r9 = r3.A03
            r1 = 0
            X.C165617ti.A0g(r2, r9, r1)
            java.lang.String r1 = " count="
            r2.append(r1)
            int r8 = r9.length
            r2.append(r8)
            java.lang.String r1 = " to="
            r2.append(r1)
            X.11F r11 = r3.A01
            r2.append(r11)
            java.lang.String r1 = " participant="
            r2.append(r1)
            X.11F r10 = r3.A00
            java.lang.String r4 = X.AnonymousClass000.A0o(r10, r2)
            X.1WX r0 = r0.A00
            X.9gg r7 = r0.A00
            java.lang.String r6 = r3.A02
            X.C18740tg.A0H(r9)
            java.lang.String r3 = X.C165617ti.A0a(r9)
            r2 = 0
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "to"
            X.C165577te.A16(r11, r0, r1)
            X.C36381kD.A1M(r5, r3, r1)
            java.lang.String r0 = "type"
            X.C36381kD.A1M(r0, r6, r1)
            if (r10 == 0) goto L_0x04aa
            java.lang.String r0 = "participant"
            X.C165577te.A16(r10, r0, r1)
        L_0x04aa:
            X.1AL[] r0 = X.C200139gg.A0D
            java.lang.Object[] r1 = r1.toArray(r0)
            X.1AL[] r1 = (X.AnonymousClass1AL[]) r1
            r0 = 1
            if (r8 <= r0) goto L_0x04bf
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r9, r0, r8)
            java.lang.String[] r0 = (java.lang.String[]) r0
            X.9nx[] r2 = X.C203719oc.A07(r0)
        L_0x04bf:
            java.lang.String r0 = "receipt"
            X.9nx r0 = X.C203399nx.A05(r0, r1, r2)
            java.lang.StringBuilder r6 = A08(r0, r7)
            java.lang.String r0 = "WriterThread/write/message-played; "
            goto L_0x0a30
        L_0x04cd:
            java.lang.Object r8 = r7.obj
            com.whatsapp.jid.Jid r8 = (com.whatsapp.jid.Jid) r8
            android.os.Bundle r3 = r7.getData()
            java.lang.String r2 = "tctoken"
            byte[] r3 = r3.getByteArray(r2)
            X.1WX r0 = r0.A00
            X.9gg r5 = r0.A00
            if (r3 == 0) goto L_0x0526
            X.8ug r2 = new X.8ug
            r2.<init>((byte[]) r3)
            r0 = 18
            X.8ug r6 = new X.8ug
            r6.<init>((X.C185718ug) r2, (java.lang.Long) r1, (int) r0)
        L_0x04ed:
            java.lang.String r0 = "presence"
            X.6QB r4 = X.C36441kJ.A0q(r0)
            java.lang.String r1 = "type"
            java.lang.String r0 = "subscribe"
            X.C36331k8.A1D(r4, r1, r0)
            r0 = 2
            java.lang.Class[] r3 = new java.lang.Class[r0]
            java.lang.Class<X.147> r0 = X.AnonymousClass147.class
            r2 = 0
            r3[r2] = r0
            r1 = 1
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            java.util.List r0 = X.C90524aI.A0p(r0, r3, r1)
            java.lang.String r1 = "to"
            boolean r0 = X.C203539oF.A0J(r8, r1, r0, r2)
            if (r0 == 0) goto L_0x0514
            X.C36351kA.A1I(r8, r4, r1)
        L_0x0514:
            X.C165577te.A1G(r4, r6)
            X.9nx r0 = r4.A03()
            java.lang.StringBuilder r6 = A08(r0, r5)
            java.lang.String r0 = "WriterThread/write/subscription-request; jid="
            r6.append(r0)
            goto L_0x0b6f
        L_0x0526:
            r6 = r1
            goto L_0x04ed
        L_0x0528:
            java.lang.Object r6 = r7.obj
            X.9Oa r6 = (X.C194079Oa) r6
            java.lang.String r9 = r6.A0B
            java.lang.String r8 = "; jid="
            com.whatsapp.jid.Jid r7 = r6.A05
            java.lang.String r5 = "; retryCount="
            int r4 = r6.A01
            X.1WX r0 = r0.A00
            X.9gg r3 = r0.A00
            long r1 = r6.A03
            X.9nx r0 = X.C203719oc.A04(r6)
            r3.A04(r0, r1)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WriterThread/write/message-retry; message.key="
            X.AnonymousClass000.A1D(r0, r9, r8, r6)
            r6.append(r7)
            r6.append(r5)
            r6.append(r4)
            goto L_0x1302
        L_0x0557:
            X.1WX r3 = r0.A00
            X.9gg r1 = r3.A00
            java.lang.String r0 = "unavailable"
            X.9nx r0 = X.C165607th.A0h(r0)
            X.9nk r2 = r1.A08
            r2.A06(r0)
            java.io.ByteArrayOutputStream r1 = X.C90524aI.A0Q()
            r0 = 0
            r1.write(r0)
            r0 = 1
            X.C203299nk.A02(r1, r0)
            r0 = 2
            r1.write(r0)
            byte[] r0 = r1.toByteArray()
            X.C193749Ms.A00(r2, r0)
            r0 = 1
            r3.A01 = r0
            java.lang.String r0 = "WriterThread/write/logout"
            goto L_0x1396
        L_0x0584:
            java.lang.Object r3 = r7.obj
            X.9Nu r3 = (X.C194019Nu) r3
            X.3Qa r8 = r3.A06
            X.1WX r0 = r0.A00
            X.9gg r4 = r0.A00
            java.lang.String r9 = r3.A07
            java.lang.String[] r10 = r3.A02
            X.11F r5 = r3.A03
            com.whatsapp.jid.UserJid r7 = r3.A05
            com.whatsapp.jid.DeviceJid r6 = r3.A04
            int r11 = r3.A00
            X.9nx r2 = X.C203719oc.A01(r5, r6, r7, r8, r9, r10, r11)
            long r0 = r3.A01
            r4.A04(r2, r0)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WriterThread/write/messages-read; message.key="
            r6.append(r0)
            r6.append(r8)
            java.lang.String r0 = " participant="
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = " extraIds="
            r6.append(r0)
            java.lang.String[] r0 = r3.A02
            java.lang.String r0 = java.util.Arrays.deepToString(r0)
            goto L_0x12ff
        L_0x05c4:
            java.lang.String r1 = "XmppSendMessage/clear-dirty "
            com.whatsapp.util.Log.i((java.lang.String) r1)
            android.os.Bundle r2 = r7.getData()
            java.lang.String r1 = "category"
            java.lang.String r4 = r2.getString(r1)
            android.os.Bundle r2 = r7.getData()
            java.lang.String r1 = "timestamp"
            long r1 = r2.getLong(r1)
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            java.lang.String r7 = "; timestamp="
            X.1WX r0 = r0.A00
            X.9gg r6 = r0.A00
            X.C18740tg.A06(r4)
            int r0 = r6.A00
            java.lang.String r8 = X.C200139gg.A00(r6, r0)
            java.util.Map r1 = r6.A03
            r0 = 1
            X.B7R.A00(r6, r8, r1, r0)
            java.lang.String r0 = "syncd_app_state"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0633
            X.8ug r3 = new X.8ug
            r3.<init>((java.lang.Long) r9)
        L_0x0603:
            X.6QB r2 = X.C36421kH.A0T()
            X.C36341k9.A1C(r2)
            java.lang.String r0 = "urn:xmpp:whatsapp:dirty"
            X.C165567td.A1H(r2, r0)
            r0 = 0
            boolean r0 = X.C203539oF.A0W(r8, r0)
            if (r0 == 0) goto L_0x0619
            X.C36331k8.A1D(r2, r5, r8)
        L_0x0619:
            java.lang.String r0 = "clean"
            X.6QB r1 = X.C36441kJ.A0q(r0)
            X.9nx r0 = r3.A00
            r1.A06(r0)
            X.9nx r0 = X.C165567td.A0I(r1, r2)
            java.lang.StringBuilder r6 = A08(r0, r6)
            java.lang.String r0 = "WriterThread/write/clear-dirty; category="
            X.AnonymousClass000.A1D(r0, r4, r7, r6)
            goto L_0x09d0
        L_0x0633:
            X.2l8 r3 = new X.2l8
            r3.<init>(r4, r9)
            goto L_0x0603
        L_0x0639:
            java.lang.String r1 = "forceRefresh"
            boolean r1 = r2.getBoolean(r1)
            X.1WX r0 = r0.A00
            X.9gg r0 = r0.A00
            r0.A05(r1)
            java.lang.String r0 = "WriterThread/write/get-server-props"
            goto L_0x1396
        L_0x064a:
            java.lang.String r14 = "lg"
            java.lang.String r13 = r2.getString(r14)
            java.lang.String r1 = "lc"
            java.lang.String r10 = r2.getString(r1)
            java.lang.String r3 = "userFeedback"
            java.lang.String r12 = r2.getString(r3)
            java.lang.String r3 = "deleteReason"
            int r15 = r2.getInt(r3)
            X.1WX r0 = r0.A00
            X.9gg r8 = r0.A00
            int r0 = r8.A00
            r7 = 1
            java.lang.String r6 = X.C200139gg.A00(r8, r0)
            java.util.Map r0 = r8.A03
            r9 = 0
            X.B7R.A00(r8, r6, r0, r9)
            r4 = 3
            r11 = 0
            r3 = 2
            if (r12 == 0) goto L_0x06c2
            java.lang.String r0 = ""
            if (r13 != 0) goto L_0x067d
            r13 = r0
        L_0x067d:
            if (r10 == 0) goto L_0x0680
            r0 = r10
        L_0x0680:
            java.lang.String r10 = "body"
            if (r15 < 0) goto L_0x06b9
            X.1AL[] r2 = new X.AnonymousClass1AL[r4]
            X.C36341k9.A1L(r14, r13, r2, r9)
            X.C36341k9.A1L(r1, r0, r2, r7)
            java.lang.String r1 = java.lang.Integer.toString(r15)
            java.lang.String r0 = "reason"
            X.C36341k9.A1L(r0, r1, r2, r3)
        L_0x0695:
            X.9nx r0 = new X.9nx
            r0.<init>((java.lang.String) r10, (java.lang.String) r12, (X.AnonymousClass1AL[]) r2)
            X.9nx[] r1 = new X.C203399nx[r7]
            r1[r9] = r0
        L_0x069e:
            java.lang.String r0 = "remove"
            X.9nx r2 = X.C203399nx.A05(r0, r11, r1)
            r0 = 4
            X.1AL[] r1 = new X.AnonymousClass1AL[r0]
            X.C36341k9.A1V(r1, r9)
            java.lang.String r0 = "urn:xmpp:whatsapp:account"
            X.C165567td.A1S(r0, r1, r7, r3)
            X.C36341k9.A1L(r5, r6, r1, r4)
            X.C200139gg.A01(r2, r8, r1)
            java.lang.String r0 = "WriterThread/write/remove-account"
            goto L_0x1396
        L_0x06b9:
            X.1AL[] r2 = new X.AnonymousClass1AL[r3]
            X.C36341k9.A1L(r14, r13, r2, r9)
            X.C36341k9.A1L(r1, r0, r2, r7)
            goto L_0x0695
        L_0x06c2:
            r1 = r11
            goto L_0x069e
        L_0x06c4:
            java.lang.Object r2 = r7.obj
            X.38Z r2 = (X.AnonymousClass38Z) r2
            X.1WX r0 = r0.A00
            X.9gg r12 = r0.A00
            java.lang.String r13 = r2.A03
            X.32f r10 = r2.A01
            X.4RS r11 = r2.A02
            X.32e r9 = r2.A00
            int r0 = r12.A00
            r7 = 1
            java.lang.String r6 = X.C200139gg.A00(r12, r0)
            java.util.Map r0 = r12.A03
            X.2bg r8 = new X.2bg
            r8.<init>(r9, r10, r11, r12, r13)
            r0.put(r6, r8)
            java.lang.String r2 = "status"
            X.9nx r4 = new X.9nx
            r4.<init>((java.lang.String) r2, (java.lang.String) r13, (X.AnonymousClass1AL[]) r1)
            r0 = 4
            X.1AL[] r3 = new X.AnonymousClass1AL[r0]
            X.C36381kD.A1N(r5, r6, r3)
            java.lang.String r0 = "xmlns"
            X.C36341k9.A1L(r0, r2, r3, r7)
            java.lang.String r1 = "type"
            java.lang.String r0 = "set"
            X.C36351kA.A1N(r1, r0, r3)
            X.8e2 r2 = X.C177588e2.A00
            java.lang.String r0 = "to"
            X.1AL r1 = new X.1AL
            r1.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r0)
            r0 = 3
            r3[r0] = r1
            X.C200139gg.A01(r4, r12, r3)
            java.lang.String r0 = "WriterThread/write/status-update"
            goto L_0x1396
        L_0x0711:
            java.lang.String r2 = "XmppSendMessage/changenumber"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.lang.Object r2 = r7.obj
            X.9Ht r2 = (X.C192589Ht) r2
            java.lang.String r4 = r2.A00
            X.1WX r0 = r0.A00
            X.9gg r8 = r0.A00
            java.util.List r15 = r2.A01
            int r0 = r8.A00
            r9 = 1
            java.lang.String r10 = X.C200139gg.A00(r8, r0)
            java.util.Map r2 = r8.A03
            r0 = 6
            X.B7R.A00(r8, r10, r2, r0)
            java.lang.String r0 = "username"
            X.9nx r13 = new X.9nx
            r13.<init>((java.lang.String) r0, (java.lang.String) r4, (X.AnonymousClass1AL[]) r1)
            r7 = 2
            java.lang.String r11 = "modify"
            r6 = 0
            if (r15 == 0) goto L_0x0762
            int r0 = r15.size()
            if (r0 <= 0) goto L_0x0762
            int r0 = r15.size()
            X.9nx[] r14 = new X.C203399nx[r0]
            r3 = 0
        L_0x0749:
            int r0 = r15.size()
            if (r3 >= r0) goto L_0x0768
            X.1AL[] r2 = new X.AnonymousClass1AL[r9]
            java.lang.Object r0 = r15.get(r3)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            X.C90504aG.A1E(r0, r12, r2, r6)
            java.lang.String r0 = "user"
            X.C203399nx.A0H(r0, r2, r14, r3)
            int r3 = r3 + 1
            goto L_0x0749
        L_0x0762:
            X.9nx r2 = new X.9nx
            r2.<init>((X.C203399nx) r13, (java.lang.String) r11, (X.AnonymousClass1AL[]) r1)
            goto L_0x077f
        L_0x0768:
            java.lang.String r3 = "notify"
            X.9nx r2 = X.C203399nx.A05(r3, r1, r14)
            X.1AL[] r1 = new X.AnonymousClass1AL[r9]
            java.lang.String r0 = "true"
            X.C36341k9.A1L(r3, r0, r1, r6)
            X.9nx[] r0 = new X.C203399nx[r7]
            r0[r6] = r13
            r0[r9] = r2
            X.9nx r2 = X.C203399nx.A05(r11, r1, r0)
        L_0x077f:
            r0 = 4
            X.1AL[] r1 = new X.AnonymousClass1AL[r0]
            X.C36341k9.A1L(r5, r10, r1, r6)
            java.lang.String r0 = "urn:xmpp:whatsapp:account"
            X.C165567td.A1S(r0, r1, r9, r7)
            r0 = 3
            X.C36341k9.A1V(r1, r0)
            X.C200139gg.A01(r2, r8, r1)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WriterThread/write/change-number; oldChatUserId="
            goto L_0x0a30
        L_0x0799:
            android.os.Parcelable r3 = r2.getParcelable(r13)
            X.9uj r3 = (X.C207209uj) r3
            java.lang.String r1 = "disable"
            boolean r1 = r2.getBoolean(r1)
            r0.A03(r3, r1)
            return
        L_0x07a9:
            android.os.Bundle r2 = r7.getData()
            java.lang.String r3 = "subType"
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x0803
            android.os.Bundle r2 = r7.getData()
            java.lang.String r8 = r2.getString(r3)
        L_0x07bd:
            android.os.Bundle r2 = r7.getData()
            java.lang.String r3 = "errorCode"
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x07d5
            android.os.Bundle r1 = r7.getData()
            int r1 = r1.getInt(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x07d5:
            java.lang.Object r4 = r7.obj
            X.11F r4 = (X.AnonymousClass11F) r4
            android.os.Bundle r2 = r7.getData()
            java.lang.String r3 = r2.getString(r11)
            android.os.Bundle r2 = r7.getData()
            X.11F r5 = X.C36351kA.A0i(r2, r9)
            X.1WX r0 = r0.A00
            X.9gg r0 = r0.A00
            X.9nk r2 = r0.A08
            java.lang.String r9 = "structure-unavailable"
            r10 = 0
            r6 = r1
            r7 = r3
            X.9nx r0 = X.C203719oc.A00(r4, r5, r6, r7, r8, r9, r10)
            r2.A06(r0)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WriterThread/write/message-received-structure-unavailable; message.key.id="
            goto L_0x0927
        L_0x0803:
            r8 = r1
            goto L_0x07bd
        L_0x0805:
            java.lang.Object r1 = r7.obj
            X.9uj r1 = (X.C207209uj) r1
            X.1WX r0 = r0.A00
            X.9gg r3 = r0.A00
            X.9nx r0 = r1.A01()
            X.9nx r2 = X.C203719oc.A06(r0, r1)
            long r0 = r1.A00
            r3.A04(r2, r0)
            java.lang.String r0 = "WriterThread/write/send-message-ack"
            goto L_0x1396
        L_0x081e:
            java.lang.String r7 = r2.getString(r5)
            java.lang.String r1 = r2.getString(r12)
            com.whatsapp.jid.DeviceJid r5 = com.whatsapp.jid.DeviceJid.getNullable(r1)
            java.lang.String r1 = r2.getString(r8)
            com.whatsapp.jid.DeviceJid r6 = com.whatsapp.jid.DeviceJid.getNullable(r1)
            java.lang.String r8 = r2.getString(r4)
            java.lang.String r1 = "type"
            java.lang.String r9 = r2.getString(r1)
            java.lang.String r1 = "registrationId"
            byte[] r10 = r2.getByteArray(r1)
            java.lang.String r1 = "retry"
            byte r11 = r2.getByte(r1)
            long r1 = r2.getLong(r3)
            X.1WX r0 = r0.A00
            X.9gg r3 = r0.A00
            X.9nx r0 = X.C203719oc.A03(r5, r6, r7, r8, r9, r10, r11)
            r3.A04(r0, r1)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WriterThread/write/call-rekey; callId="
            r6.append(r0)
            r6.append(r8)
            goto L_0x1302
        L_0x0865:
            java.lang.Object r5 = r7.obj
            X.11F r5 = (X.AnonymousClass11F) r5
            android.os.Bundle r2 = r7.getData()
            java.lang.String r4 = r2.getString(r11)
            android.os.Bundle r2 = r7.getData()
            X.11F r6 = X.C36351kA.A0i(r2, r9)
            X.1WX r0 = r0.A00
            X.9gg r0 = r0.A00
            X.9nk r2 = r0.A08
            java.lang.String r10 = "hsm-envelope-mismatch"
            r9 = r1
            r11 = r1
            r7 = r1
            r8 = r4
            X.9nx r0 = X.C203719oc.A00(r5, r6, r7, r8, r9, r10, r11)
            r2.A06(r0)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WriterThread/write/message-received-permanent-failure; message.key.id="
            goto L_0x0a30
        L_0x0894:
            java.lang.Object r1 = r7.obj
            X.5vR r1 = (X.C122795vR) r1
            com.whatsapp.protocol.VoipStanzaChildNode r11 = r1.A01
            java.lang.String r10 = r11.tag
            java.lang.String r3 = r1.A02
            java.lang.String r9 = "; id="
            java.lang.String r8 = r1.A03
            java.lang.String r7 = "; callId="
            X.1WX r0 = r0.A00
            X.9gg r6 = r0.A00
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            com.whatsapp.jid.Jid r1 = r1.A00
            java.lang.String r0 = "to"
            X.C165577te.A16(r1, r0, r2)
            X.C36381kD.A1M(r5, r8, r2)
            X.1AL[] r0 = X.C200139gg.A0D
            java.lang.Object[] r4 = r2.toArray(r0)
            X.1AL[] r4 = (X.AnonymousClass1AL[]) r4
            X.9nx r2 = r11.toProtocolTreeNode()
            java.lang.String r1 = "call"
            X.9nx r0 = new X.9nx
            r0.<init>((X.C203399nx) r2, (java.lang.String) r1, (X.AnonymousClass1AL[]) r4)
            java.lang.StringBuilder r6 = A08(r0, r6)
            java.lang.String r0 = "WriterThread/write/call-stanza-"
            X.C36321k7.A1O(r0, r10, r9, r8, r6)
            r6.append(r7)
            goto L_0x092a
        L_0x08d6:
            java.lang.Object r4 = r7.obj
            com.whatsapp.jid.Jid r4 = (com.whatsapp.jid.Jid) r4
            X.1WX r0 = r0.A00
            X.9gg r3 = r0.A00
            java.lang.String r0 = "presence"
            X.6QB r2 = X.C36441kJ.A0q(r0)
            java.lang.String r1 = "type"
            java.lang.String r0 = "probe"
            X.C36331k8.A1D(r2, r1, r0)
            java.lang.String r1 = "to"
            boolean r0 = X.C203539oF.A0N(r4, r1)
            if (r0 == 0) goto L_0x08f6
            X.C36351kA.A1I(r4, r2, r1)
        L_0x08f6:
            X.9nx r1 = r2.A03()
            X.9nk r0 = r3.A08
            r0.A06(r1)
            return
        L_0x0900:
            java.lang.Object r4 = r7.obj
            X.11F r4 = (X.AnonymousClass11F) r4
            android.os.Bundle r2 = r7.getData()
            java.lang.String r3 = r2.getString(r11)
            X.1WX r0 = r0.A00
            X.9gg r0 = r0.A00
            X.9nk r2 = r0.A08
            java.lang.String r9 = "order-status-update-failed"
            java.lang.String r10 = "invalid-transition"
            r6 = r1
            r8 = r1
            r5 = r1
            r7 = r3
            X.9nx r0 = X.C203719oc.A00(r4, r5, r6, r7, r8, r9, r10)
            r2.A06(r0)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WriterThread/write/order-status-update-failure; message.key.id="
        L_0x0927:
            r6.append(r0)
        L_0x092a:
            r6.append(r3)
            goto L_0x1302
        L_0x092f:
            int r8 = X.C1900396q.A00(r7)
            java.lang.Object r4 = r7.obj
            X.9nx r4 = (X.C203399nx) r4
            X.1WX r0 = r6.A00
            X.9gg r0 = r0.A00
            X.9nk r7 = r0.A08
            r3 = 1
            r6 = 0
            r2 = 2
            r1 = 8192(0x2000, float:1.14794E-41)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>(r1)
            X.C203299nk.A01(r4, r0)
            byte[] r5 = r0.toByteArray()
            int r4 = r5.length
            byte[] r1 = new byte[r3]
            r1[r6] = r2
            r0 = 8192(0x2000, float:1.14794E-41)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0997 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0997 }
            java.util.zip.DeflaterOutputStream r2 = new java.util.zip.DeflaterOutputStream     // Catch:{ all -> 0x098d }
            r2.<init>(r3)     // Catch:{ all -> 0x098d }
            r3.write(r1)     // Catch:{ all -> 0x0983 }
            r2.write(r5, r6, r4)     // Catch:{ all -> 0x0983 }
            r2.close()     // Catch:{ all -> 0x0983 }
            byte[] r0 = r3.toByteArray()     // Catch:{ all -> 0x0983 }
            r2.close()     // Catch:{ all -> 0x098d }
            r3.close()     // Catch:{ IOException -> 0x0997 }
            X.C193749Ms.A00(r7, r0)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WriterThread/write/type="
            r6.append(r0)
            r6.append(r8)
            goto L_0x1302
        L_0x0983:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0988 }
            goto L_0x098c
        L_0x0988:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x098d }
        L_0x098c:
            throw r1     // Catch:{ all -> 0x098d }
        L_0x098d:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0992 }
            goto L_0x0996
        L_0x0992:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0997 }
        L_0x0996:
            throw r1     // Catch:{ IOException -> 0x0997 }
        L_0x0997:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)
            throw r0
        L_0x099d:
            java.lang.Object r2 = r7.obj
            X.AHo r2 = (X.C21336AHo) r2
            X.3Qa r9 = r2.A08
            X.1WX r0 = r0.A00
            X.9gg r3 = r0.A00
            X.C18740tg.A06(r3)
            r8 = 0
            com.whatsapp.jid.Jid r1 = r2.BHI()
            X.13q r0 = X.AnonymousClass11F.A00
            X.11F r6 = X.C222713q.A00(r1)
            com.whatsapp.jid.Jid r0 = r2.A07
            com.whatsapp.jid.DeviceJid r7 = com.whatsapp.jid.DeviceJid.of(r0)
            r12 = 1
            r11 = r8
            r10 = r8
            X.9nx r2 = X.C203719oc.A01(r6, r7, r8, r9, r10, r11, r12)
            r0 = 0
            r3.A04(r2, r0)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WriterThread/write/incoming-appdata-stanza-received; IncomingAppDataStanza.key="
            r6.append(r0)
        L_0x09d0:
            r6.append(r9)
            goto L_0x1302
        L_0x09d5:
            java.lang.Object r5 = r7.obj
            X.9Mb r5 = (X.C193589Mb) r5
            java.lang.String r8 = r5.A04
            java.lang.String r7 = " errorType="
            java.lang.String r4 = r5.A03
            X.1WX r0 = r0.A00
            X.9gg r0 = r0.A00
            X.9nk r3 = r0.A08
            X.11F r2 = r5.A01
            X.11F r0 = r5.A02
            r13 = r1
            r15 = r1
            r9 = r2
            r10 = r0
            r11 = r1
            r12 = r8
            r14 = r4
            X.9nx r0 = X.C203719oc.A00(r9, r10, r11, r12, r13, r14, r15)
            r3.A06(r0)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WriterThread/write/send-error-receipt; message.key.id="
        L_0x09fd:
            X.AnonymousClass000.A1D(r0, r8, r7, r6)
            goto L_0x0a33
        L_0x0a01:
            java.lang.String r7 = r2.getString(r5)
            java.lang.String r1 = r2.getString(r12)
            com.whatsapp.jid.DeviceJid r6 = com.whatsapp.jid.DeviceJid.getNullable(r1)
            java.lang.String r1 = r2.getString(r8)
            com.whatsapp.jid.DeviceJid r5 = com.whatsapp.jid.DeviceJid.getNullable(r1)
            java.lang.String r4 = r2.getString(r4)
            long r2 = r2.getLong(r3)
            X.1WX r0 = r0.A00
            X.9gg r1 = r0.A00
            java.lang.String r0 = "reject"
            X.9nx r0 = X.C203719oc.A02(r6, r5, r7, r4, r0)
            r1.A04(r0, r2)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WriterThread/write/call-reject-receipt; callId="
        L_0x0a30:
            r6.append(r0)
        L_0x0a33:
            r6.append(r4)
            goto L_0x1302
        L_0x0a38:
            X.1WX r0 = r0.A00
            X.9gg r4 = r0.A00
            int r0 = r4.A00
            java.lang.String r3 = X.C200139gg.A00(r4, r0)
            java.lang.String r1 = "fbns"
            X.8uq r0 = new X.8uq
            r0.<init>(r1)
            X.1jS r2 = new X.1jS
            r2.<init>((X.C16490pK) r0, (java.lang.String) r3)
            java.util.Map r1 = r4.A03
            r0 = 4
            X.B7R.A00(r4, r3, r1, r0)
            X.9nx r1 = r2.A00
            X.9nk r0 = r4.A08
            r0.A06(r1)
            java.lang.String r0 = "WriterThread/write/clear_fbns_token;"
            goto L_0x1396
        L_0x0a5f:
            java.lang.Object r1 = r7.obj
            X.9ND r1 = (X.AnonymousClass9ND) r1
            java.lang.String r9 = r1.A03
            java.lang.String r7 = " to="
            X.11F r5 = r1.A01
            java.lang.String r4 = " participant="
            X.11F r8 = r1.A00
            X.1WX r0 = r0.A00
            X.9gg r10 = r0.A00
            java.lang.String r11 = r1.A02
            byte[] r3 = r1.A04
            byte[] r2 = r1.A05
            java.lang.String r6 = "server-error"
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "to"
            X.C165577te.A16(r5, r0, r1)
            java.lang.String r0 = "id"
            X.C36381kD.A1M(r0, r9, r1)
            java.lang.String r0 = "type"
            X.C36381kD.A1M(r0, r6, r1)
            if (r8 == 0) goto L_0x0a93
            java.lang.String r0 = "participant"
            X.C165577te.A16(r8, r0, r1)
        L_0x0a93:
            if (r11 == 0) goto L_0x0a9a
            java.lang.String r0 = "category"
            X.C36381kD.A1M(r0, r11, r1)
        L_0x0a9a:
            X.1AL[] r0 = X.C200139gg.A0D
            java.lang.Object[] r11 = r1.toArray(r0)
            X.1AL[] r11 = (X.AnonymousClass1AL[]) r11
            java.lang.String r6 = "receipt"
            if (r3 == 0) goto L_0x0add
            r0 = 2
            X.9nx[] r13 = new X.C203399nx[r0]
            java.lang.String r1 = "enc_p"
            r12 = 0
            X.9nx r0 = new X.9nx
            r0.<init>((java.lang.String) r1, (byte[]) r3, (X.AnonymousClass1AL[]) r12)
            r3 = 0
            r13[r3] = r0
            java.lang.String r1 = "enc_iv"
            X.9nx r0 = new X.9nx
            r0.<init>((java.lang.String) r1, (byte[]) r2, (X.AnonymousClass1AL[]) r12)
            r2 = 1
            r13[r2] = r0
            java.lang.String r0 = "encrypt"
            X.9nx r1 = X.C203399nx.A05(r0, r12, r13)
            X.9nx[] r0 = new X.C203399nx[r2]
            r0[r3] = r1
            X.9nx r0 = X.C203399nx.A05(r6, r11, r0)
        L_0x0acc:
            java.lang.StringBuilder r6 = A08(r0, r10)
            java.lang.String r0 = "WriterThread/write/message-media-error; id="
            X.AnonymousClass000.A1D(r0, r9, r7, r6)
            r6.append(r5)
            r6.append(r4)
            goto L_0x0b6f
        L_0x0add:
            X.9nx r0 = X.C203399nx.A04(r6, r11)
            goto L_0x0acc
        L_0x0ae2:
            java.lang.Object r9 = r7.obj
            X.9Nd r9 = (X.C193849Nd) r9
            java.lang.String r7 = r9.A03
            java.lang.String r4 = " chatJid="
            X.11F r3 = r9.A01
            java.lang.String r2 = " participant="
            X.11F r8 = r9.A00
            X.1WX r0 = r0.A00
            X.9gg r6 = r0.A00
            X.11F r11 = r9.A02
            byte[] r15 = r9.A05
            byte[] r14 = r9.A06
            boolean r0 = r9.A04
            r16 = r0
            java.lang.String r10 = "server-error"
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "to"
            X.C165577te.A16(r11, r0, r9)
            X.C36381kD.A1M(r5, r7, r9)
            java.lang.String r0 = "type"
            X.C36381kD.A1M(r0, r10, r9)
            X.1AL[] r13 = X.C200139gg.A0D
            java.lang.Object[] r9 = r9.toArray(r13)
            X.1AL[] r9 = (X.AnonymousClass1AL[]) r9
            r0 = 2
            java.util.ArrayList r11 = X.C36441kJ.A14(r0)
            r10 = 0
            if (r15 == 0) goto L_0x0b33
            X.9nx[] r5 = new X.C203399nx[r0]
            java.lang.String r0 = "enc_p"
            X.C203399nx.A0G(r0, r15, r1, r5, r10)
            r15 = 1
            java.lang.String r0 = "enc_iv"
            X.C203399nx.A0G(r0, r14, r1, r5, r15)
            java.lang.String r0 = "encrypt"
            X.C203399nx.A0F(r0, r11, r1, r5)
        L_0x0b33:
            r0 = 3
            java.util.ArrayList r5 = X.C36441kJ.A14(r0)
            X.C165577te.A16(r3, r12, r5)
            java.lang.String r1 = java.lang.String.valueOf(r16)
            java.lang.String r0 = "from_me"
            X.C36381kD.A1M(r0, r1, r5)
            if (r8 == 0) goto L_0x0b4b
            java.lang.String r0 = "participant"
            X.C165577te.A16(r8, r0, r5)
        L_0x0b4b:
            java.lang.Object[] r1 = r5.toArray(r13)
            X.1AL[] r1 = (X.AnonymousClass1AL[]) r1
            java.lang.String r0 = "rmr"
            X.C203399nx.A0E(r0, r11, r1)
            X.9nx[] r1 = X.C165577te.A1b(r11, r10)
            java.lang.String r0 = "receipt"
            X.9nx r0 = X.C203399nx.A05(r0, r9, r1)
            java.lang.StringBuilder r6 = A08(r0, r6)
            java.lang.String r0 = "WriterThread/write/message-md-media-error; id="
            X.AnonymousClass000.A1D(r0, r7, r4, r6)
            r6.append(r3)
            r6.append(r2)
        L_0x0b6f:
            r6.append(r8)
            goto L_0x1302
        L_0x0b74:
            java.lang.Object r1 = r7.obj
            X.9uj r1 = (X.C207209uj) r1
            r0.A02(r1)
            return
        L_0x0b7c:
            java.lang.Object r0 = r7.obj
            X.9WB r0 = (X.AnonymousClass9WB) r0
            long r1 = r0.A00
            X.9nx r0 = r0.A01
            r6.A01(r0, r10, r1)
            return
        L_0x0b88:
            android.os.Parcelable r9 = r2.getParcelable(r13)
            X.9uj r9 = (X.C207209uj) r9
            java.lang.String r1 = "isValid"
            boolean r8 = r2.getBoolean(r1)
            com.whatsapp.jid.Jid r7 = r9.A02
            java.lang.String r5 = "; msgId="
            java.lang.String r4 = r9.A07
            java.lang.String r3 = "; isValid="
            X.1WX r0 = r0.A00
            X.9gg r6 = r0.A00
            if (r8 == 0) goto L_0x0bd6
            java.lang.String r2 = "in"
        L_0x0ba4:
            java.lang.String r0 = "contacts"
            X.1AL r1 = new X.1AL
            r1.<init>((java.lang.String) r0, (java.lang.String) r2)
            X.1AL[] r2 = X.C165617ti.A0k()
            r0 = 0
            r2[r0] = r1
            r1 = 0
            java.lang.String r0 = "sync"
            X.9nx r0 = X.C203399nx.A05(r0, r2, r1)
            X.9nx r2 = X.C203719oc.A06(r0, r9)
            long r0 = r9.A00
            r6.A04(r2, r0)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WriterThread/write/contact-ack; toJid="
            r6.append(r0)
            r6.append(r7)
            X.AnonymousClass000.A1D(r5, r4, r3, r6)
            r6.append(r8)
            goto L_0x1302
        L_0x0bd6:
            java.lang.String r2 = "out"
            goto L_0x0ba4
        L_0x0bd9:
            X.1WX r0 = r0.A00
            X.9gg r0 = r0.A00
            r0.A02()
            java.lang.String r0 = "WriterThread/write/sendAvailableForChat"
            goto L_0x1396
        L_0x0be4:
            X.1WX r0 = r0.A00
            X.9gg r2 = r0.A00
            java.lang.String r0 = "unavailable"
            X.9nx r1 = X.C165607th.A0h(r0)
            X.9nk r0 = r2.A08
            r0.A06(r1)
            java.lang.String r0 = "WriterThread/write/sendUnavailableForChat"
            goto L_0x1396
        L_0x0bf7:
            java.lang.Object r2 = r7.obj
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            int r1 = r7.arg2
            r0.A00(r2, r1)
            return
        L_0x0c01:
            java.lang.Object r10 = r7.obj
            X.C18740tg.A06(r10)
            X.9Xd r10 = (X.C195989Xd) r10
            X.1WX r1 = r0.A00     // Catch:{ 1WY -> 0x1265 }
            r61 = r1
            X.1WW r2 = r1.A03     // Catch:{ 1WY -> 0x1265 }
            X.9gg r1 = r1.A00     // Catch:{ 1WY -> 0x1265 }
            r60 = r1
            X.1WI r9 = r2.A00     // Catch:{ 1WY -> 0x1265 }
            X.3Qa r8 = r10.A0G     // Catch:{ 1WY -> 0x1265 }
            com.whatsapp.jid.Jid r7 = r10.A08     // Catch:{ 1WY -> 0x1265 }
            long r1 = r10.A05     // Catch:{ 1WY -> 0x1265 }
            r16 = r1
            int r1 = r10.A04     // Catch:{ 1WY -> 0x1265 }
            r20 = r1
            int r1 = r10.A02     // Catch:{ 1WY -> 0x1265 }
            r59 = r1
            com.whatsapp.jid.PhoneUserJid r1 = r10.A09     // Catch:{ 1WY -> 0x1265 }
            r28 = r1
            java.lang.String r1 = r10.A0U     // Catch:{ 1WY -> 0x1265 }
            r27 = r1
            com.whatsapp.jid.DeviceJid r1 = r10.A07     // Catch:{ 1WY -> 0x1265 }
            r30 = r1
            com.whatsapp.jid.UserJid r1 = r10.A0A     // Catch:{ 1WY -> 0x1265 }
            r29 = r1
            java.lang.String r1 = r10.A0O     // Catch:{ 1WY -> 0x1265 }
            r32 = r1
            java.lang.String r1 = r10.A0P     // Catch:{ 1WY -> 0x1265 }
            r33 = r1
            java.lang.String r1 = r10.A0R     // Catch:{ 1WY -> 0x1265 }
            r58 = r1
            java.lang.String r6 = r10.A0Q     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r1 = r10.A0M     // Catch:{ 1WY -> 0x1265 }
            r57 = r1
            X.630 r5 = r10.A0F     // Catch:{ 1WY -> 0x1265 }
            java.util.Map r1 = r10.A0Y     // Catch:{ 1WY -> 0x1265 }
            r45 = r1
            java.util.Map r1 = r10.A0a     // Catch:{ 1WY -> 0x1265 }
            r19 = r1
            java.util.List r1 = r10.A0W     // Catch:{ 1WY -> 0x1265 }
            r18 = r1
            int r13 = r10.A03     // Catch:{ 1WY -> 0x1265 }
            java.util.List r14 = r10.A0X     // Catch:{ 1WY -> 0x1265 }
            int r1 = r10.A00     // Catch:{ 1WY -> 0x1265 }
            r21 = r1
            java.lang.Integer r1 = r10.A0K     // Catch:{ 1WY -> 0x1265 }
            r56 = r1
            X.9lY r11 = r10.A06     // Catch:{ 1WY -> 0x1265 }
            java.util.Map r1 = r10.A0Z     // Catch:{ 1WY -> 0x1265 }
            r55 = r1
            java.lang.Integer r1 = r10.A0L     // Catch:{ 1WY -> 0x1265 }
            r31 = r1
            java.lang.String r1 = r10.A0N     // Catch:{ 1WY -> 0x1265 }
            r54 = r1
            java.lang.String r1 = r10.A0T     // Catch:{ 1WY -> 0x1265 }
            r53 = r1
            boolean r1 = r10.A0c     // Catch:{ 1WY -> 0x1265 }
            r26 = r1
            X.9nx r1 = r10.A0I     // Catch:{ 1WY -> 0x1265 }
            r37 = r1
            X.3ur r2 = r10.A0H     // Catch:{ 1WY -> 0x1265 }
            boolean r1 = r10.A0b     // Catch:{ 1WY -> 0x1265 }
            r47 = r1
            java.lang.String r1 = r10.A0S     // Catch:{ 1WY -> 0x1265 }
            r52 = r1
            X.66q r4 = r10.A0B     // Catch:{ 1WY -> 0x1265 }
            X.9Vg r1 = r10.A0D     // Catch:{ 1WY -> 0x1265 }
            r36 = r1
            java.lang.String r1 = r10.A0V     // Catch:{ 1WY -> 0x1265 }
            r24 = r1
            X.9Vf r1 = r10.A0C     // Catch:{ 1WY -> 0x1265 }
            r35 = r1
            int r1 = r10.A01     // Catch:{ 1WY -> 0x1265 }
            r51 = r1
            X.8za r1 = r10.A0E     // Catch:{ 1WY -> 0x1265 }
            r34 = r1
            if (r5 != 0) goto L_0x0cbd
            if (r19 == 0) goto L_0x0ca4
            boolean r1 = r19.isEmpty()     // Catch:{ 1WY -> 0x1265 }
            if (r1 == 0) goto L_0x0cbd
        L_0x0ca4:
            boolean r1 = r55.isEmpty()     // Catch:{ 1WY -> 0x1265 }
            if (r1 == 0) goto L_0x0cbd
            X.0wN r1 = r9.A01     // Catch:{ 1WY -> 0x1265 }
            r12 = r1
            X.11F r1 = r8.A00     // Catch:{ 1WY -> 0x1265 }
            int r1 = X.AnonymousClass3UK.A04(r1)     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r1 = "sendMessageEncrypted/empty_payload"
            r15 = 1
            r12.A0E(r1, r3, r15)     // Catch:{ 1WY -> 0x1265 }
        L_0x0cbd:
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()     // Catch:{ 1WY -> 0x1265 }
            r1 = r13 & 64
            r12 = 0
            if (r1 == 0) goto L_0x0ccb
            java.lang.String r1 = "multicast"
            X.C203399nx.A0E(r1, r3, r12)     // Catch:{ 1WY -> 0x1265 }
        L_0x0ccb:
            r1 = r13 & 4
            if (r1 == 0) goto L_0x0cd4
            java.lang.String r1 = "url_number"
            X.C203399nx.A0E(r1, r3, r12)     // Catch:{ 1WY -> 0x1265 }
        L_0x0cd4:
            r1 = r13 & 2
            if (r1 == 0) goto L_0x0cdd
            java.lang.String r1 = "url_text"
            X.C203399nx.A0E(r1, r3, r12)     // Catch:{ 1WY -> 0x1265 }
        L_0x0cdd:
            r1 = r13 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0ce6
            java.lang.String r1 = "automated"
            X.C203399nx.A0E(r1, r3, r12)     // Catch:{ 1WY -> 0x1265 }
        L_0x0ce6:
            if (r24 == 0) goto L_0x0d5b
            X.11F r1 = r8.A00     // Catch:{ 1WY -> 0x1265 }
            boolean r12 = r1 instanceof X.C177528dw     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r1 = "Send status setting for non-status msg"
            X.C18740tg.A0D(r12, r1)     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r23 = "status_setting"
            java.lang.String r13 = "meta"
            if (r14 == 0) goto L_0x0d4b
            boolean r1 = r14.isEmpty()     // Catch:{ 1WY -> 0x1265 }
            if (r1 != 0) goto L_0x0d4b
            java.util.Iterator r22 = r14.iterator()     // Catch:{ 1WY -> 0x1265 }
            r12 = 0
        L_0x0d02:
            boolean r1 = r22.hasNext()     // Catch:{ 1WY -> 0x1265 }
            if (r1 == 0) goto L_0x0d49
            X.9nx r15 = X.C36431kI.A0s(r22)     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r1 = r15.A00     // Catch:{ 1WY -> 0x1265 }
            boolean r1 = r13.equals(r1)     // Catch:{ 1WY -> 0x1265 }
            if (r1 != 0) goto L_0x0d18
            r3.add(r15)     // Catch:{ 1WY -> 0x1265 }
            goto L_0x0d02
        L_0x0d18:
            java.util.ArrayList r14 = X.AnonymousClass001.A0I()     // Catch:{ 1WY -> 0x1265 }
            X.1AL[] r1 = r15.A0k()     // Catch:{ 1WY -> 0x1265 }
            if (r1 == 0) goto L_0x0d29
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ 1WY -> 0x1265 }
            r14.addAll(r1)     // Catch:{ 1WY -> 0x1265 }
        L_0x0d29:
            r12 = r23
            r1 = r24
            X.C36381kD.A1M(r12, r1, r14)     // Catch:{ 1WY -> 0x1265 }
            r1 = 0
            X.1AL[] r12 = X.C165577te.A1a(r14, r1)     // Catch:{ 1WY -> 0x1265 }
            X.9nx[] r1 = r15.A02     // Catch:{ 1WY -> 0x1265 }
            r14 = r1
            byte[] r1 = r15.A01     // Catch:{ 1WY -> 0x1265 }
            r25 = r1
            X.9nx r1 = new X.9nx     // Catch:{ 1WY -> 0x1265 }
            r15 = r12
            r12 = r25
            r1.<init>(r13, r12, r15, r14)     // Catch:{ 1WY -> 0x1265 }
            r3.add(r1)     // Catch:{ 1WY -> 0x1265 }
            r12 = 1
            goto L_0x0d02
        L_0x0d49:
            if (r12 != 0) goto L_0x0d60
        L_0x0d4b:
            X.1AL[] r15 = X.C165617ti.A0k()     // Catch:{ 1WY -> 0x1265 }
            r14 = 0
            r12 = r23
            r1 = r24
            X.C36341k9.A1L(r12, r1, r15, r14)     // Catch:{ 1WY -> 0x1265 }
            X.C203399nx.A0E(r13, r3, r15)     // Catch:{ 1WY -> 0x1265 }
            goto L_0x0d60
        L_0x0d5b:
            if (r14 == 0) goto L_0x0d60
            r3.addAll(r14)     // Catch:{ 1WY -> 0x1265 }
        L_0x0d60:
            r25 = 1
            if (r20 <= 0) goto L_0x0d67
            if (r36 == 0) goto L_0x0d67
            goto L_0x0d69
        L_0x0d67:
            r25 = 0
        L_0x0d69:
            X.0v5 r1 = r9.A00     // Catch:{ 1WY -> 0x1265 }
            r50 = r1
            boolean r24 = r50.A05()     // Catch:{ 1WY -> 0x1265 }
            if (r24 == 0) goto L_0x0d95
            r50.A02()     // Catch:{ 1WY -> 0x1265 }
            r12 = 88
            r1 = r59
            if (r1 != r12) goto L_0x0d95
            X.13q r1 = X.AnonymousClass11F.A00     // Catch:{ 1WY -> 0x1265 }
            X.11F r1 = X.C222713q.A00(r7)     // Catch:{ 1WY -> 0x1265 }
            boolean r1 = X.C197029b1.A00(r1)     // Catch:{ 1WY -> 0x1265 }
            if (r1 != 0) goto L_0x0d95
            boolean r1 = r7 instanceof com.whatsapp.jid.UserJid     // Catch:{ 1WY -> 0x1265 }
            if (r1 != 0) goto L_0x0d92
            boolean r1 = X.AnonymousClass143.A0G(r7)     // Catch:{ 1WY -> 0x1265 }
            if (r1 == 0) goto L_0x0d95
        L_0x0d92:
            r23 = 1
            goto L_0x0d97
        L_0x0d95:
            r23 = 0
        L_0x0d97:
            X.8za r12 = X.C188438za.BIZ_FEEDBACK     // Catch:{ 1WY -> 0x1265 }
            r1 = r34
            boolean r22 = X.C36361kB.A1a(r1, r12)
            if (r25 != 0) goto L_0x0da6
            if (r23 != 0) goto L_0x0da6
            r15 = 0
            if (r22 == 0) goto L_0x0da7
        L_0x0da6:
            r15 = 1
        L_0x0da7:
            boolean r1 = r55.isEmpty()     // Catch:{ 1WY -> 0x1265 }
            if (r1 == 0) goto L_0x0dfa
            if (r15 != 0) goto L_0x0e07
            if (r5 == 0) goto L_0x0dd8
            r38 = r5
            r39 = r56
            r40 = r6
            r41 = r52
            r42 = r20
            r43 = r47
            X.9nx r1 = X.C132906Vt.A01(r38, r39, r40, r41, r42, r43)     // Catch:{ 1WY -> 0x1265 }
            r3.add(r1)     // Catch:{ 1WY -> 0x1265 }
            boolean r1 = r7 instanceof com.whatsapp.jid.UserJid     // Catch:{ 1WY -> 0x1265 }
            if (r1 == 0) goto L_0x0e07
            X.AnonymousClass1WI.A03(r4, r6, r3)     // Catch:{ 1WY -> 0x1265 }
            r1 = r7
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ 1WY -> 0x1265 }
            X.9nx r1 = X.AnonymousClass1WI.A01(r1, r4, r6)     // Catch:{ 1WY -> 0x1265 }
            if (r1 == 0) goto L_0x0e07
            r3.add(r1)     // Catch:{ 1WY -> 0x1265 }
            goto L_0x0e07
        L_0x0dd8:
            java.lang.String r39 = "none"
            r42 = 2
            r38 = r56
            r40 = r6
            r41 = r52
            r43 = r20
            r44 = r47
            java.util.ArrayList r12 = X.C132906Vt.A03(r38, r39, r40, r41, r42, r43, r44)     // Catch:{ 1WY -> 0x1265 }
            X.1AL[] r1 = X.C132906Vt.A00     // Catch:{ 1WY -> 0x1265 }
            java.lang.Object[] r12 = r12.toArray(r1)     // Catch:{ 1WY -> 0x1265 }
            X.1AL[] r12 = (X.AnonymousClass1AL[]) r12     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r1 = "enc"
            X.C203399nx.A0E(r1, r3, r12)     // Catch:{ 1WY -> 0x1265 }
            r46 = 1
            goto L_0x0e09
        L_0x0dfa:
            if (r15 != 0) goto L_0x0e07
            if (r19 != 0) goto L_0x0e01
            r12 = 1
            if (r18 == 0) goto L_0x0e02
        L_0x0e01:
            r12 = 0
        L_0x0e02:
            java.lang.String r1 = "Message fanout is only supported for 1:1 chat"
            X.C18740tg.A0F(r12, r1)     // Catch:{ 1WY -> 0x1265 }
        L_0x0e07:
            r46 = 0
        L_0x0e09:
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()     // Catch:{ 1WY -> 0x1265 }
            if (r37 == 0) goto L_0x0e1e
            X.1AL[] r1 = r37.A0k()     // Catch:{ 1WY -> 0x1265 }
            if (r1 == 0) goto L_0x0e19
            java.util.ArrayList r13 = X.C36351kA.A10(r1)     // Catch:{ 1WY -> 0x1265 }
        L_0x0e19:
            r1 = r37
            X.9nx[] r12 = r1.A02     // Catch:{ 1WY -> 0x1265 }
            goto L_0x0e1f
        L_0x0e1e:
            r12 = 0
        L_0x0e1f:
            if (r2 == 0) goto L_0x0e42
            int r1 = r2.actualActors     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r14 = java.lang.Integer.toString(r1)     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r1 = "actual_actors"
            X.C36381kD.A1M(r1, r14, r13)     // Catch:{ 1WY -> 0x1265 }
            int r1 = r2.hostStorage     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r14 = java.lang.Integer.toString(r1)     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r1 = "host_storage"
            X.C36381kD.A1M(r1, r14, r13)     // Catch:{ 1WY -> 0x1265 }
            long r1 = r2.privacyModeTs     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r2 = java.lang.Long.toString(r1)     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r1 = "privacy_mode_ts"
            X.C36381kD.A1M(r1, r2, r13)     // Catch:{ 1WY -> 0x1265 }
        L_0x0e42:
            boolean r1 = r13.isEmpty()     // Catch:{ 1WY -> 0x1265 }
            if (r1 == 0) goto L_0x0e4a
            if (r12 == 0) goto L_0x0e60
        L_0x0e4a:
            boolean r1 = r13.isEmpty()     // Catch:{ 1WY -> 0x1265 }
            if (r1 != 0) goto L_0x0e5e
            X.1AL[] r1 = X.AnonymousClass1WI.A08     // Catch:{ 1WY -> 0x1265 }
            java.lang.Object[] r2 = r13.toArray(r1)     // Catch:{ 1WY -> 0x1265 }
            X.1AL[] r2 = (X.AnonymousClass1AL[]) r2     // Catch:{ 1WY -> 0x1265 }
        L_0x0e58:
            java.lang.String r1 = "biz"
            X.C203399nx.A0F(r1, r3, r2, r12)     // Catch:{ 1WY -> 0x1265 }
            goto L_0x0e60
        L_0x0e5e:
            r2 = 0
            goto L_0x0e58
        L_0x0e60:
            if (r11 == 0) goto L_0x0ea0
            X.1EU r2 = r9.A05     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r1 = r11.A0G     // Catch:{ 1WY -> 0x1265 }
            X.9e3 r12 = r2.A03(r1)     // Catch:{ 1WY -> 0x1265 }
            r1 = 0
            if (r12 == 0) goto L_0x0e9e
            java.lang.String r2 = r11.A0I     // Catch:{ 1WY -> 0x1265 }
            X.B66 r13 = r12.A01(r2)     // Catch:{ 1WY -> 0x1265 }
        L_0x0e73:
            X.1AL[] r2 = X.AnonymousClass1WI.A08     // Catch:{ 1WY -> 0x1265 }
            if (r13 == 0) goto L_0x0e98
            java.util.List r12 = r13.BFI(r11, r8)     // Catch:{ 1WY -> 0x1265 }
            if (r12 == 0) goto L_0x0e83
            java.lang.Object[] r2 = r12.toArray(r2)     // Catch:{ 1WY -> 0x1265 }
            X.1AL[] r2 = (X.AnonymousClass1AL[]) r2     // Catch:{ 1WY -> 0x1265 }
        L_0x0e83:
            java.util.List r11 = r13.BFH(r11, r8)     // Catch:{ 1WY -> 0x1265 }
            if (r11 == 0) goto L_0x0e98
            boolean r12 = r11.isEmpty()     // Catch:{ 1WY -> 0x1265 }
            if (r12 != 0) goto L_0x0e98
            r1 = 0
            X.9nx[] r1 = new X.C203399nx[r1]     // Catch:{ 1WY -> 0x1265 }
            java.lang.Object[] r1 = r11.toArray(r1)     // Catch:{ 1WY -> 0x1265 }
            X.9nx[] r1 = (X.C203399nx[]) r1     // Catch:{ 1WY -> 0x1265 }
        L_0x0e98:
            java.lang.String r11 = "pay"
            X.C203399nx.A0F(r11, r3, r2, r1)     // Catch:{ 1WY -> 0x1265 }
            goto L_0x0ea0
        L_0x0e9e:
            r13 = r1
            goto L_0x0e73
        L_0x0ea0:
            if (r35 == 0) goto L_0x0ec9
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()     // Catch:{ 1WY -> 0x1265 }
            r1 = r35
            int r1 = r1.A00     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r11 = java.lang.Integer.toString(r1)     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r1 = "conversion_source"
            X.C36381kD.A1M(r1, r11, r2)     // Catch:{ 1WY -> 0x1265 }
            r1 = r35
            java.lang.String r11 = r1.A01     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r1 = "conversion_data"
            X.C36381kD.A1M(r1, r11, r2)     // Catch:{ 1WY -> 0x1265 }
            X.1AL[] r1 = X.AnonymousClass1WI.A08     // Catch:{ 1WY -> 0x1265 }
            java.lang.Object[] r2 = r2.toArray(r1)     // Catch:{ 1WY -> 0x1265 }
            X.1AL[] r2 = (X.AnonymousClass1AL[]) r2     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r1 = "ctwa"
            X.C203399nx.A0E(r1, r3, r2)     // Catch:{ 1WY -> 0x1265 }
        L_0x0ec9:
            boolean r48 = X.AnonymousClass143.A0G(r7)     // Catch:{ 1WY -> 0x1265 }
            if (r15 == 0) goto L_0x0ee1
            java.util.ArrayList r14 = X.AnonymousClass001.A0I()     // Catch:{ 1WY -> 0x1265 }
            r2 = 1
        L_0x0ed4:
            boolean r1 = r14.isEmpty()     // Catch:{ 1WY -> 0x1265 }
            if (r1 != 0) goto L_0x0f26
            boolean r1 = android.text.TextUtils.isEmpty(r57)     // Catch:{ 1WY -> 0x1265 }
            if (r1 == 0) goto L_0x0f09
            goto L_0x0f06
        L_0x0ee1:
            if (r5 == 0) goto L_0x0eec
            int r2 = r5.A00     // Catch:{ 1WY -> 0x1265 }
            r1 = 2
            if (r2 != r1) goto L_0x0eec
            r49 = 1
            if (r30 == 0) goto L_0x0eee
        L_0x0eec:
            r49 = 0
        L_0x0eee:
            r2 = 1
            r37 = r4
            r38 = r56
            r39 = r6
            r40 = r52
            r41 = r18
            r42 = r45
            r43 = r19
            r44 = r55
            r45 = r20
            java.util.ArrayList r14 = X.AnonymousClass1WI.A02(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)     // Catch:{ 1WY -> 0x1265 }
            goto L_0x0ed4
        L_0x0f06:
            r13 = 0
            r12 = 0
            goto L_0x0f13
        L_0x0f09:
            X.1AL[] r13 = new X.AnonymousClass1AL[r2]     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r11 = "name"
            r1 = r57
            boolean r12 = X.C36371kC.A1Y(r11, r1, r13)     // Catch:{ 1WY -> 0x1265 }
        L_0x0f13:
            X.9nx[] r11 = X.C165577te.A1b(r14, r12)     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r1 = "participants"
            X.C203399nx.A0F(r1, r3, r13, r11)     // Catch:{ 1WY -> 0x1265 }
            int r1 = r55.size()     // Catch:{ 1WY -> 0x1265 }
            if (r1 <= 0) goto L_0x0f27
            X.AnonymousClass1WI.A03(r4, r6, r3)     // Catch:{ 1WY -> 0x1265 }
            goto L_0x0f27
        L_0x0f26:
            r12 = 0
        L_0x0f27:
            if (r48 == 0) goto L_0x0f35
            if (r5 == 0) goto L_0x0f35
            int r11 = r5.A00     // Catch:{ 1WY -> 0x1265 }
            r1 = 2
            if (r11 != r1) goto L_0x0f35
            if (r30 != 0) goto L_0x0f35
            X.AnonymousClass1WI.A03(r4, r6, r3)     // Catch:{ 1WY -> 0x1265 }
        L_0x0f35:
            java.util.HashSet r13 = X.C36441kJ.A16()     // Catch:{ 1WY -> 0x1265 }
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()     // Catch:{ 1WY -> 0x1265 }
            if (r36 == 0) goto L_0x0f79
            r1 = r36
            com.whatsapp.jid.UserJid r15 = r1.A00     // Catch:{ 1WY -> 0x1265 }
            X.630 r1 = r1.A01     // Catch:{ 1WY -> 0x1265 }
            r37 = r1
            r38 = r56
            r39 = r6
            r40 = r52
            r41 = r20
            r42 = r47
            X.9nx r14 = X.C132906Vt.A01(r37, r38, r39, r40, r41, r42)     // Catch:{ 1WY -> 0x1265 }
            if (r22 == 0) goto L_0x0f5b
            r3.add(r14)     // Catch:{ 1WY -> 0x1265 }
            goto L_0x0f79
        L_0x0f5b:
            com.whatsapp.jid.DeviceJid r1 = r15.getPrimaryDevice()     // Catch:{ 1WY -> 0x1265 }
            com.whatsapp.jid.UserJid r1 = r1.userJid     // Catch:{ 1WY -> 0x1265 }
            X.9nx r22 = X.AnonymousClass1WI.A01(r1, r4, r6)     // Catch:{ 1WY -> 0x1265 }
            com.whatsapp.jid.DeviceJid r4 = r15.getPrimaryDevice()     // Catch:{ 1WY -> 0x1265 }
            r1 = 2
            X.9nx[] r1 = new X.C203399nx[r1]     // Catch:{ 1WY -> 0x1265 }
            r1[r12] = r14     // Catch:{ 1WY -> 0x1265 }
            r1[r2] = r22     // Catch:{ 1WY -> 0x1265 }
            r14 = 0
            X.9nx r1 = X.AnonymousClass1WI.A00(r4, r14, r1)     // Catch:{ 1WY -> 0x1265 }
            r11.add(r1)     // Catch:{ 1WY -> 0x1265 }
            goto L_0x0f7a
        L_0x0f79:
            r14 = 0
        L_0x0f7a:
            if (r24 == 0) goto L_0x0f7d
            goto L_0x0f7f
        L_0x0f7d:
            r2 = 0
            goto L_0x0f8d
        L_0x0f7f:
            java.lang.Object r4 = r50.A02()     // Catch:{ 1WY -> 0x1265 }
            X.1HX r4 = (X.AnonymousClass1HX) r4     // Catch:{ 1WY -> 0x1265 }
            r1 = r59
            boolean r1 = r4.A05(r7, r1)     // Catch:{ 1WY -> 0x1265 }
            if (r1 == 0) goto L_0x0f7d
        L_0x0f8d:
            java.lang.String r4 = "type"
            if (r34 == 0) goto L_0x0f98
            r1 = r34
            java.lang.String r1 = r1.type     // Catch:{ 1WY -> 0x1265 }
            X.C36381kD.A1M(r4, r1, r13)     // Catch:{ 1WY -> 0x1265 }
        L_0x0f98:
            r15 = 1
            r1 = r51
            if (r1 == r15) goto L_0x0fa1
            r15 = 2
            if (r1 != r15) goto L_0x0fab
            goto L_0x0fa4
        L_0x0fa1:
            java.lang.String r15 = "1p_partial"
            goto L_0x0fa6
        L_0x0fa4:
            java.lang.String r15 = "3p_full"
        L_0x0fa6:
            java.lang.String r1 = "local_automated_type"
            X.C36381kD.A1M(r1, r15, r13)     // Catch:{ 1WY -> 0x1265 }
        L_0x0fab:
            boolean r1 = r13.isEmpty()     // Catch:{ 1WY -> 0x1265 }
            if (r1 == 0) goto L_0x0fb7
            boolean r1 = r11.isEmpty()     // Catch:{ 1WY -> 0x1265 }
            if (r1 != 0) goto L_0x0fd2
        L_0x0fb7:
            boolean r1 = r13.isEmpty()     // Catch:{ 1WY -> 0x1265 }
            if (r1 == 0) goto L_0x0fbf
            r1 = r14
            goto L_0x0fc3
        L_0x0fbf:
            X.1AL[] r1 = X.C165577te.A1a(r13, r12)     // Catch:{ 1WY -> 0x1265 }
        L_0x0fc3:
            boolean r13 = r11.isEmpty()     // Catch:{ 1WY -> 0x1265 }
            if (r13 != 0) goto L_0x0fcd
            X.9nx[] r14 = X.C165577te.A1b(r11, r12)     // Catch:{ 1WY -> 0x1265 }
        L_0x0fcd:
            java.lang.String r11 = "bot"
            X.C203399nx.A0F(r11, r3, r1, r14)     // Catch:{ 1WY -> 0x1265 }
        L_0x0fd2:
            X.1WH r13 = r9.A03     // Catch:{ 1WY -> 0x1265 }
            X.0wQ r1 = r13.A00     // Catch:{ 1WY -> 0x1265 }
            boolean r1 = r1.A0L()     // Catch:{ 1WY -> 0x1265 }
            if (r1 == 0) goto L_0x1008
            r11 = 1
            if (r5 == 0) goto L_0x0fe3
            int r1 = r5.A00     // Catch:{ 1WY -> 0x1265 }
            if (r1 == r11) goto L_0x0ff9
        L_0x0fe3:
            if (r19 == 0) goto L_0x1013
            java.util.Iterator r5 = X.AnonymousClass000.A0z(r19)     // Catch:{ 1WY -> 0x1265 }
        L_0x0fe9:
            boolean r1 = r5.hasNext()     // Catch:{ 1WY -> 0x1265 }
            if (r1 == 0) goto L_0x1013
            java.lang.Object r1 = r5.next()     // Catch:{ 1WY -> 0x1265 }
            X.630 r1 = (X.AnonymousClass630) r1     // Catch:{ 1WY -> 0x1265 }
            int r1 = r1.A00     // Catch:{ 1WY -> 0x1265 }
            if (r1 != r11) goto L_0x0fe9
        L_0x0ff9:
            r11 = 0
            X.0wp r1 = r13.A01     // Catch:{ 1WY -> 0x1265 }
            byte[] r5 = r1.A02()     // Catch:{ 1WY -> 0x1265 }
            X.C18740tg.A06(r5)     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r1 = "device-identity"
            X.C203399nx.A0D(r1, r3, r5, r11)     // Catch:{ 1WY -> 0x1265 }
        L_0x1008:
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()     // Catch:{ 1WY -> 0x1265 }
            r13 = 0
            int r1 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x1042
            goto L_0x1033
        L_0x1013:
            java.util.Iterator r5 = X.AnonymousClass000.A0z(r55)     // Catch:{ 1WY -> 0x1265 }
        L_0x1017:
            boolean r1 = r5.hasNext()     // Catch:{ 1WY -> 0x1265 }
            if (r1 == 0) goto L_0x1028
            java.lang.Object r1 = r5.next()     // Catch:{ 1WY -> 0x1265 }
            X.630 r1 = (X.AnonymousClass630) r1     // Catch:{ 1WY -> 0x1265 }
            int r1 = r1.A00     // Catch:{ 1WY -> 0x1265 }
            if (r1 != r11) goto L_0x1017
            goto L_0x0ff9
        L_0x1028:
            if (r36 == 0) goto L_0x1008
            r1 = r36
            X.630 r1 = r1.A01     // Catch:{ 1WY -> 0x1265 }
            int r1 = r1.A00     // Catch:{ 1WY -> 0x1265 }
            if (r1 != r11) goto L_0x1008
            goto L_0x0ff9
        L_0x1033:
            if (r25 != 0) goto L_0x1042
            long r13 = X.C36391kE.A0B(r16)     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r5 = java.lang.String.valueOf(r13)     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r1 = "t"
            X.C36381kD.A1M(r1, r5, r11)     // Catch:{ 1WY -> 0x1265 }
        L_0x1042:
            X.11F r5 = r8.A00     // Catch:{ 1WY -> 0x1265 }
            boolean r1 = X.AnonymousClass143.A0G(r5)     // Catch:{ 1WY -> 0x1265 }
            if (r1 != 0) goto L_0x104e
            if (r25 == 0) goto L_0x104e
            r7 = r29
        L_0x104e:
            boolean r1 = r8.A02     // Catch:{ 1WY -> 0x1265 }
            if (r1 != 0) goto L_0x105b
            r13 = 8
            r1 = r21
            if (r1 == r13) goto L_0x105b
            java.lang.String r1 = "from"
            goto L_0x105d
        L_0x105b:
            java.lang.String r1 = "to"
        L_0x105d:
            X.C18740tg.A06(r7)     // Catch:{ 1WY -> 0x1265 }
            com.whatsapp.jid.Jid r7 = (com.whatsapp.jid.Jid) r7     // Catch:{ 1WY -> 0x1265 }
            X.C165577te.A16(r7, r1, r11)     // Catch:{ 1WY -> 0x1265 }
            r1 = r58
            X.C36381kD.A1M(r4, r1, r11)     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r4 = r8.A01     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r1 = "id"
            X.C36381kD.A1M(r1, r4, r11)     // Catch:{ 1WY -> 0x1265 }
            if (r33 == 0) goto L_0x107c
            if (r23 != 0) goto L_0x107c
            java.lang.String r4 = "phash"
            r1 = r33
            X.C36381kD.A1M(r4, r1, r11)     // Catch:{ 1WY -> 0x1265 }
        L_0x107c:
            if (r32 == 0) goto L_0x1085
            java.lang.String r4 = "addressing_mode"
            r1 = r32
            X.C36381kD.A1M(r4, r1, r11)     // Catch:{ 1WY -> 0x1265 }
        L_0x1085:
            if (r30 == 0) goto L_0x1090
            if (r25 != 0) goto L_0x1090
            java.lang.String r4 = "participant"
            r1 = r30
            X.C165577te.A16(r1, r4, r11)     // Catch:{ 1WY -> 0x1265 }
        L_0x1090:
            if (r29 == 0) goto L_0x109b
            if (r25 != 0) goto L_0x109b
            java.lang.String r4 = "recipient"
            r1 = r29
            X.C165577te.A16(r1, r4, r11)     // Catch:{ 1WY -> 0x1265 }
        L_0x109b:
            if (r28 == 0) goto L_0x10a6
            if (r25 != 0) goto L_0x10a6
            java.lang.String r4 = "recipient_pn"
            r1 = r28
            X.C165577te.A16(r1, r4, r11)     // Catch:{ 1WY -> 0x1265 }
        L_0x10a6:
            if (r27 == 0) goto L_0x10b1
            if (r25 != 0) goto L_0x10b1
            java.lang.String r4 = "recipient_username"
            r1 = r27
            X.C36381kD.A1M(r4, r1, r11)     // Catch:{ 1WY -> 0x1265 }
        L_0x10b1:
            if (r21 == 0) goto L_0x10bc
            java.lang.String r4 = java.lang.Integer.toString(r21)     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r1 = "edit"
            X.C36381kD.A1M(r1, r4, r11)     // Catch:{ 1WY -> 0x1265 }
        L_0x10bc:
            if (r31 == 0) goto L_0x10d8
            int r7 = r31.intValue()     // Catch:{ 1WY -> 0x1265 }
            if (r7 <= 0) goto L_0x10d8
            if (r20 != 0) goto L_0x10d8
            r4 = 8
            r1 = r21
            if (r1 == r4) goto L_0x10d8
            r4 = 7
            if (r1 == r4) goto L_0x10d8
            java.lang.String r4 = java.lang.Integer.toString(r7)     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r1 = "expiration"
            X.C36381kD.A1M(r1, r4, r11)     // Catch:{ 1WY -> 0x1265 }
        L_0x10d8:
            boolean r1 = android.text.TextUtils.isEmpty(r54)     // Catch:{ 1WY -> 0x1265 }
            if (r1 != 0) goto L_0x10e5
            java.lang.String r4 = "category"
            r1 = r54
            X.C36381kD.A1M(r4, r1, r11)     // Catch:{ 1WY -> 0x1265 }
        L_0x10e5:
            boolean r1 = android.text.TextUtils.isEmpty(r53)     // Catch:{ 1WY -> 0x1265 }
            if (r1 != 0) goto L_0x10f2
            java.lang.String r4 = "push_priority"
            r1 = r53
            X.C36381kD.A1M(r4, r1, r11)     // Catch:{ 1WY -> 0x1265 }
        L_0x10f2:
            if (r26 != 0) goto L_0x10f6
            if (r2 == 0) goto L_0x10fd
        L_0x10f6:
            java.lang.String r2 = "device_fanout"
            java.lang.String r1 = "false"
            X.C36381kD.A1M(r2, r1, r11)     // Catch:{ 1WY -> 0x1265 }
        L_0x10fd:
            X.1AL[] r1 = X.AnonymousClass1WI.A08     // Catch:{ 1WY -> 0x1265 }
            java.lang.Object[] r4 = r11.toArray(r1)     // Catch:{ 1WY -> 0x1265 }
            X.1AL[] r4 = (X.AnonymousClass1AL[]) r4     // Catch:{ 1WY -> 0x1265 }
            X.9nx[] r2 = X.C165577te.A1b(r3, r12)     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r1 = "message"
            X.9nx r2 = X.C203399nx.A05(r1, r4, r2)     // Catch:{ 1WY -> 0x1265 }
            r1 = r60
            X.9nk r1 = r1.A08     // Catch:{ 1WY -> 0x1265 }
            r1.A06(r2)     // Catch:{ 1WY -> 0x1265 }
            r11 = 14
            if (r6 != 0) goto L_0x1128
            r11 = 0
        L_0x111b:
            if (r20 != 0) goto L_0x1251
            r2 = 8
            r1 = r21
            if (r1 == r2) goto L_0x1230
            r2 = 7
            if (r1 == r2) goto L_0x1230
            goto L_0x11ae
        L_0x1128:
            int r1 = r6.hashCode()     // Catch:{ 1WY -> 0x1265 }
            switch(r1) {
                case -1890252483: goto L_0x11a1;
                case -1183699191: goto L_0x1198;
                case -622287711: goto L_0x118f;
                case -309474065: goto L_0x1186;
                case 102340: goto L_0x117d;
                case 93166550: goto L_0x1175;
                case 100313435: goto L_0x116d;
                case 106006350: goto L_0x1164;
                case 112021638: goto L_0x115c;
                case 112202875: goto L_0x1154;
                case 555704345: goto L_0x114b;
                case 861720859: goto L_0x1142;
                case 943481210: goto L_0x113b;
                case 1901043637: goto L_0x1133;
                case 1977401206: goto L_0x1130;
                default: goto L_0x112f;
            }     // Catch:{ 1WY -> 0x1265 }
        L_0x112f:
            goto L_0x11ab
        L_0x1130:
            java.lang.String r1 = "genai_sticker"
            goto L_0x11a3
        L_0x1133:
            java.lang.String r1 = "location"
            boolean r1 = r6.equals(r1)     // Catch:{ 1WY -> 0x1265 }
            r11 = 5
            goto L_0x11a9
        L_0x113b:
            java.lang.String r1 = "contact_array"
            boolean r1 = r6.equals(r1)     // Catch:{ 1WY -> 0x1265 }
            goto L_0x11a9
        L_0x1142:
            java.lang.String r1 = "document"
            boolean r1 = r6.equals(r1)     // Catch:{ 1WY -> 0x1265 }
            r11 = 9
            goto L_0x11a9
        L_0x114b:
            java.lang.String r1 = "catalog"
            boolean r1 = r6.equals(r1)     // Catch:{ 1WY -> 0x1265 }
            r11 = 37
            goto L_0x11a9
        L_0x1154:
            java.lang.String r1 = "video"
            boolean r1 = r6.equals(r1)     // Catch:{ 1WY -> 0x1265 }
            r11 = 3
            goto L_0x11a9
        L_0x115c:
            java.lang.String r1 = "vcard"
            boolean r1 = r6.equals(r1)     // Catch:{ 1WY -> 0x1265 }
            r11 = 4
            goto L_0x11a9
        L_0x1164:
            java.lang.String r1 = "order"
            boolean r1 = r6.equals(r1)     // Catch:{ 1WY -> 0x1265 }
            r11 = 44
            goto L_0x11a9
        L_0x116d:
            java.lang.String r1 = "image"
            boolean r1 = r6.equals(r1)     // Catch:{ 1WY -> 0x1265 }
            r11 = 1
            goto L_0x11a9
        L_0x1175:
            java.lang.String r1 = "audio"
            boolean r1 = r6.equals(r1)     // Catch:{ 1WY -> 0x1265 }
            r11 = 2
            goto L_0x11a9
        L_0x117d:
            java.lang.String r1 = "gif"
            boolean r1 = r6.equals(r1)     // Catch:{ 1WY -> 0x1265 }
            r11 = 13
            goto L_0x11a9
        L_0x1186:
            java.lang.String r1 = "product"
            boolean r1 = r6.equals(r1)     // Catch:{ 1WY -> 0x1265 }
            r11 = 23
            goto L_0x11a9
        L_0x118f:
            java.lang.String r1 = "livelocation"
            boolean r1 = r6.equals(r1)     // Catch:{ 1WY -> 0x1265 }
            r11 = 16
            goto L_0x11a9
        L_0x1198:
            java.lang.String r1 = "invite"
            boolean r1 = r6.equals(r1)     // Catch:{ 1WY -> 0x1265 }
            r11 = 24
            goto L_0x11a9
        L_0x11a1:
            java.lang.String r1 = "sticker"
        L_0x11a3:
            boolean r1 = r6.equals(r1)     // Catch:{ 1WY -> 0x1265 }
            r11 = 20
        L_0x11a9:
            if (r1 != 0) goto L_0x111b
        L_0x11ab:
            r11 = -1
            goto L_0x111b
        L_0x11ae:
            X.0ww r7 = r9.A02     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r1 = "pay"
            boolean r6 = r1.equals(r6)     // Catch:{ 1WY -> 0x1265 }
            boolean r4 = r5 instanceof X.C177528dw     // Catch:{ 1WY -> 0x1265 }
            if (r4 == 0) goto L_0x11bc
            r3 = 3
            goto L_0x11c0
        L_0x11bc:
            r3 = 2
            if (r11 != 0) goto L_0x11c0
            r3 = 1
        L_0x11c0:
            X.14K r2 = r7.A00     // Catch:{ 1WY -> 0x1265 }
            boolean r1 = X.AnonymousClass000.A1V(r2)
            X.C18740tg.A0C(r1)     // Catch:{ 1WY -> 0x1265 }
            r1 = 6
            android.os.Message r1 = android.os.Message.obtain(r2, r1, r3, r6)     // Catch:{ 1WY -> 0x1265 }
            r1.sendToTarget()     // Catch:{ 1WY -> 0x1265 }
            X.C20050ww.A00(r7)     // Catch:{ 1WY -> 0x1265 }
            if (r4 != 0) goto L_0x1251
            boolean r1 = r5 instanceof X.C177618e5     // Catch:{ 1WY -> 0x1265 }
            if (r1 == 0) goto L_0x1217
            java.util.LinkedHashSet r4 = X.C36441kJ.A17()     // Catch:{ 1WY -> 0x1265 }
            if (r19 == 0) goto L_0x11ed
            X.0wN r2 = r9.A01     // Catch:{ 1WY -> 0x1265 }
            java.util.Set r1 = r19.keySet()     // Catch:{ 1WY -> 0x1265 }
            java.util.Set r1 = X.AnonymousClass143.A09(r2, r1)     // Catch:{ 1WY -> 0x1265 }
            r4.addAll(r1)     // Catch:{ 1WY -> 0x1265 }
        L_0x11ed:
            if (r18 == 0) goto L_0x11fd
            X.0wN r3 = r9.A01     // Catch:{ 1WY -> 0x1265 }
            java.util.HashSet r2 = X.C36441kJ.A16()     // Catch:{ 1WY -> 0x1265 }
            r1 = r18
            X.AnonymousClass143.A0A(r3, r1, r2)     // Catch:{ 1WY -> 0x1265 }
            r4.addAll(r2)     // Catch:{ 1WY -> 0x1265 }
        L_0x11fd:
            X.1WG r1 = r9.A04     // Catch:{ 1WY -> 0x1265 }
            java.util.ArrayList r3 = X.C36441kJ.A15(r4)     // Catch:{ 1WY -> 0x1265 }
            java.util.Iterator r2 = X.C36361kB.A0s(r1)     // Catch:{ 1WY -> 0x1265 }
        L_0x1207:
            boolean r1 = r2.hasNext()     // Catch:{ 1WY -> 0x1265 }
            if (r1 == 0) goto L_0x1251
            java.lang.Object r1 = r2.next()     // Catch:{ 1WY -> 0x1265 }
            X.1NL r1 = (X.AnonymousClass1NL) r1     // Catch:{ 1WY -> 0x1265 }
            r1.BTQ(r8, r3)     // Catch:{ 1WY -> 0x1265 }
            goto L_0x1207
        L_0x1217:
            X.1WG r1 = r9.A04     // Catch:{ 1WY -> 0x1265 }
            X.C18740tg.A06(r5)     // Catch:{ 1WY -> 0x1265 }
            java.util.Iterator r2 = X.C36361kB.A0s(r1)     // Catch:{ 1WY -> 0x1265 }
        L_0x1220:
            boolean r1 = r2.hasNext()     // Catch:{ 1WY -> 0x1265 }
            if (r1 == 0) goto L_0x1251
            java.lang.Object r1 = r2.next()     // Catch:{ 1WY -> 0x1265 }
            X.1NL r1 = (X.AnonymousClass1NL) r1     // Catch:{ 1WY -> 0x1265 }
            r1.BTP(r5, r8)     // Catch:{ 1WY -> 0x1265 }
            goto L_0x1220
        L_0x1230:
            boolean r1 = r5 instanceof X.C177528dw     // Catch:{ 1WY -> 0x1265 }
            if (r1 != 0) goto L_0x1251
            boolean r1 = r5 instanceof X.C177618e5     // Catch:{ 1WY -> 0x1265 }
            if (r1 != 0) goto L_0x1251
            X.1WG r1 = r9.A04     // Catch:{ 1WY -> 0x1265 }
            X.C18740tg.A06(r5)     // Catch:{ 1WY -> 0x1265 }
            java.util.Iterator r2 = X.C36361kB.A0s(r1)     // Catch:{ 1WY -> 0x1265 }
        L_0x1241:
            boolean r1 = r2.hasNext()     // Catch:{ 1WY -> 0x1265 }
            if (r1 == 0) goto L_0x1251
            java.lang.Object r1 = r2.next()     // Catch:{ 1WY -> 0x1265 }
            X.1NL r1 = (X.AnonymousClass1NL) r1     // Catch:{ 1WY -> 0x1265 }
            r1.BTO(r5, r8)     // Catch:{ 1WY -> 0x1265 }
            goto L_0x1241
        L_0x1251:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 1WY -> 0x1265 }
            java.lang.String r1 = "xmpp/writer/write/message-encrypted; "
            X.C36321k7.A1K(r10, r1, r2)     // Catch:{ 1WY -> 0x1265 }
            r0 = r61
            X.1WT r1 = r0.A04
            android.os.Handler r1 = (android.os.Handler) r1
            r0 = 2
            X.C165577te.A0w(r1, r8, r0)
            return
        L_0x1265:
            r4 = move-exception
            X.1WX r0 = r0.A00
            X.1WT r0 = r0.A04
            X.9uj r6 = r10.A0J
            int r5 = r4.excessPayloadByteSize
            X.1WU r0 = (X.AnonymousClass1WU) r0
            X.1WK r0 = r0.A00
            X.19a r0 = r0.A0s
            X.19Z r3 = r0.A06
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "received message too large error; stanzaKey="
            X.C36321k7.A1K(r6, r0, r1)
            java.util.Map r1 = r3.A03
            monitor-enter(r1)
            java.lang.Object r2 = r1.remove(r6)     // Catch:{ all -> 0x12af }
            X.B1r r2 = (X.C23046B1r) r2     // Catch:{ all -> 0x12af }
            monitor-exit(r1)     // Catch:{ all -> 0x12af }
            if (r2 == 0) goto L_0x1297
            java.lang.String r1 = "Message payload too big"
            X.1WY r0 = new X.1WY
            r0.<init>(r1, r5)
            r2.BVM(r0)
        L_0x1297:
            java.lang.String r1 = r6.A05
            java.lang.String r0 = "message"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x12a9
            java.lang.String r0 = "receipt"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x12ae
        L_0x12a9:
            X.19O r0 = r3.A02
            r0.A05()
        L_0x12ae:
            throw r4
        L_0x12af:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x12af }
            throw r0
        L_0x12b2:
            int r5 = X.C1900396q.A00(r7)
            java.lang.Object r4 = r7.obj
            X.9nx r4 = (X.C203399nx) r4
            java.lang.String r3 = ", id="
            java.lang.String r2 = "id"
            r1 = 0
            r4.A0i(r2, r1)
            X.1WX r0 = r6.A00
            X.9gg r0 = r0.A00
            java.lang.StringBuilder r6 = A08(r4, r0)
            java.lang.String r0 = "WriterThread/write/type="
            X.C36351kA.A1M(r0, r3, r6, r5)
            java.lang.String r0 = r4.A0i(r2, r1)
            goto L_0x12ff
        L_0x12d4:
            r0 = 4
            X.1AL[] r3 = new X.AnonymousClass1AL[r0]
            X.C36341k9.A1L(r5, r7, r3, r8)
            java.lang.String r0 = "encrypt"
            X.C165567td.A1S(r0, r3, r10, r2)
            r0 = 3
            X.C36341k9.A1V(r3, r0)
            X.9nx[] r2 = X.C165577te.A1b(r9, r8)
            java.lang.String r0 = "key"
            X.9nx r0 = X.C203399nx.A05(r0, r1, r2)
            X.C200139gg.A01(r0, r6, r3)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "WriterThread/write/get-pre-key-batch; id="
            r0 = r16
            X.AnonymousClass000.A1D(r1, r7, r0, r6)
            java.lang.String r0 = java.util.Arrays.toString(r4)
        L_0x12ff:
            r6.append(r0)
        L_0x1302:
            java.lang.String r0 = r6.toString()
            goto L_0x1396
        L_0x1308:
            java.lang.Object r1 = r7.obj
            java.lang.String r1 = (java.lang.String) r1
            X.1WX r0 = r0.A00
            X.9gg r4 = r0.A00
            java.lang.String r3 = "available"
            java.util.ArrayList r0 = X.C185898uy.A00
            java.lang.String r0 = "presence"
            X.6QB r2 = X.C36441kJ.A0q(r0)
            if (r1 == 0) goto L_0x1328
            r0 = 1
            boolean r0 = X.C203539oF.A0W(r1, r0)
            if (r0 == 0) goto L_0x1328
            java.lang.String r0 = "name"
            X.C36331k8.A1D(r2, r0, r1)
        L_0x1328:
            java.util.ArrayList r1 = X.C185898uy.A00
            java.lang.String r0 = "type"
            r2.A08(r3, r0, r1)
            X.9nx r1 = r2.A03()
            X.9nk r0 = r4.A08
            r0.A06(r1)
            java.lang.String r0 = "WriterThread/write/push-name"
            goto L_0x1396
        L_0x133b:
            X.1WX r0 = r0.A00
            X.9gg r4 = r0.A00
            r0 = 2
            X.1AL[] r3 = new X.AnonymousClass1AL[r0]
            java.lang.String r1 = "type"
            java.lang.String r0 = "result"
            X.C36381kD.A1N(r1, r0, r3)
            X.8e2 r2 = X.C177588e2.A00
            java.lang.String r0 = "to"
            X.1AL r1 = new X.1AL
            r1.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r0)
            r0 = 1
            r3[r0] = r1
            java.lang.String r0 = "iq"
            X.9nx r1 = X.C203399nx.A04(r0, r3)
            X.9nk r0 = r4.A08
            r0.A06(r1)
            java.lang.String r0 = "WriterThread/write/onSendServerPong"
            goto L_0x1396
        L_0x1363:
            X.1WX r0 = r0.A00
            X.9gg r7 = r0.A00
            int r0 = r7.A00
            r6 = 1
            java.lang.String r2 = X.C200139gg.A00(r7, r0)
            java.util.Map r0 = r7.A03
            r4 = 3
            X.B7R.A00(r7, r2, r0, r4)
            r0 = 4
            X.1AL[] r3 = new X.AnonymousClass1AL[r0]
            X.C36381kD.A1N(r5, r2, r3)
            java.lang.String r2 = "xmlns"
            java.lang.String r0 = "encrypt"
            X.C36341k9.A1L(r2, r0, r3, r6)
            java.lang.String r2 = "type"
            java.lang.String r0 = "get"
            X.C36351kA.A1N(r2, r0, r3)
            X.C36341k9.A1V(r3, r4)
            java.lang.String r0 = "digest"
            X.9nx r0 = X.C203399nx.A04(r0, r1)
            X.C200139gg.A01(r0, r7, r3)
            java.lang.String r0 = "WriterThread/write/get-pre-key-digest"
        L_0x1396:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203429o0.A0A(android.os.Message, X.1WZ, X.1WZ):void");
    }

    public static Message A05(boolean z) {
        return Message.obtain((Handler) null, 0, 37, 0, Boolean.valueOf(z));
    }

    public static DeviceJid A06(BaseBundle baseBundle, String str) {
        DeviceJid nullable = DeviceJid.getNullable(baseBundle.getString(str));
        C18740tg.A06(nullable);
        return nullable;
    }
}
