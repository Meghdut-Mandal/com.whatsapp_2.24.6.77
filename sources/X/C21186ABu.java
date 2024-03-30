package X;

import android.text.TextUtils;

/* renamed from: X.ABu  reason: case insensitive filesystem */
public abstract class C21186ABu implements C22938Ayo, C22942Ays, C17740rx {
    public static boolean A01(AnonymousClass8SW r1) {
        if (r1 == null || (r1.bitField0_ & 4) == 0 || TextUtils.isEmpty(r1.id_) || (r1.bitField0_ & 1) == 0 || TextUtils.isEmpty(r1.remoteJid_) || C36421kH.A0N(r1.remoteJid_) == null) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: X.5J2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: X.2bc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: X.2bc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: X.2bb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: X.2bc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: X.2bc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: X.2bc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: X.2bc} */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02b6, code lost:
        if (r7.encIv_ == null) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0133, code lost:
        if (r1 != 2) goto L_0x0135;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0173  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3T1 A02(X.AnonymousClass9YL r17) {
        /*
            r16 = this;
            r2 = r16
            boolean r0 = r2 instanceof X.AnonymousClass8UI
            r4 = r17
            if (r0 == 0) goto L_0x00a5
            X.8UI r2 = (X.AnonymousClass8UI) r2
            X.8SX r6 = r4.A0A
            int r1 = r6.bitField1_
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1P(r1)
            r3 = 0
            if (r0 == 0) goto L_0x009f
            X.0yC r1 = r2.A01
            r0 = 4164(0x1044, float:5.835E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x009f
            X.8PD r5 = r6.scheduledCallEditMessage_
            if (r5 != 0) goto L_0x0028
            X.8PD r5 = X.AnonymousClass8PD.DEFAULT_INSTANCE
        L_0x0028:
            int r3 = r5.bitField0_
            boolean r0 = X.C165577te.A1W(r3)
            java.lang.Integer r1 = X.C36421kH.A0U()
            if (r0 == 0) goto L_0x0269
            r0 = r3 & 2
            if (r0 == 0) goto L_0x0262
            X.8SW r0 = r5.key_
            if (r0 != 0) goto L_0x003e
            X.8SW r0 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x003e:
            boolean r0 = A01(r0)
            if (r0 == 0) goto L_0x025b
            X.8PD r6 = r6.scheduledCallEditMessage_
            if (r6 != 0) goto L_0x004a
            X.8PD r6 = X.AnonymousClass8PD.DEFAULT_INSTANCE
        L_0x004a:
            X.3Qa r5 = r4.A0C
            long r0 = r4.A04
            X.2bb r3 = new X.2bb
            r3.<init>(r5, r0)
            X.8SW r8 = r6.key_
            if (r8 != 0) goto L_0x0059
            X.8SW r8 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x0059:
            java.lang.String r0 = r8.remoteJid_
            X.11F r7 = X.C36421kH.A0N(r0)
            X.C18740tg.A06(r7)
            boolean r1 = r8.fromMe_
            java.lang.String r0 = r8.id_
            X.3Qa r7 = X.C165617ti.A0R(r7, r0, r1)
            java.lang.String r0 = r8.participant_
            com.whatsapp.jid.UserJid r1 = X.C36431kI.A0l(r0)
            X.9Vv r0 = new X.9Vv
            r0.<init>(r1, r7)
            r3.A04 = r0
            int r1 = r6.editType_
            if (r1 == 0) goto L_0x00a2
            r0 = 1
            if (r1 != r0) goto L_0x00a2
            X.90Q r1 = X.AnonymousClass90Q.CANCEL
        L_0x0080:
            X.90Q r0 = X.AnonymousClass90Q.CANCEL
            boolean r0 = X.C36361kB.A1a(r1, r0)
            r3.A00 = r0
            X.11F r4 = r4.A07
            X.0wQ r2 = r2.A00
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x00a0
            if (r4 == 0) goto L_0x00a0
        L_0x0092:
            X.8SW r1 = r6.key_
        L_0x0094:
            if (r1 != 0) goto L_0x0098
            X.8SW r1 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x0098:
            r0 = 0
            X.9Vv r0 = X.C183338qd.A00(r2, r4, r1, r5, r0)
        L_0x009d:
            r3.A04 = r0
        L_0x009f:
            return r3
        L_0x00a0:
            r4 = 0
            goto L_0x0092
        L_0x00a2:
            X.90Q r1 = X.AnonymousClass90Q.UNKNOWN
            goto L_0x0080
        L_0x00a5:
            boolean r0 = r2 instanceof X.AnonymousClass8UG
            if (r0 == 0) goto L_0x019c
            X.8UG r2 = (X.AnonymousClass8UG) r2
            r7 = 0
            X.AnonymousClass00C.A0D(r4, r7)
            X.8SX r6 = r4.A0A
            int r1 = r6.bitField1_
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x03ea
            int r8 = r4.A01
            java.lang.Integer r3 = X.C36421kH.A0U()
            r5 = 2
            if (r8 != r5) goto L_0x027e
            X.8Q8 r8 = r6.pinInChatMessage_
            if (r8 != 0) goto L_0x00c7
            X.8Q8 r8 = X.AnonymousClass8Q8.DEFAULT_INSTANCE
        L_0x00c7:
            int r0 = r8.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0277
            int r1 = r8.type_
            if (r1 == 0) goto L_0x00f0
            r0 = 1
            if (r1 == r0) goto L_0x00ed
            if (r1 != r5) goto L_0x00f0
            X.90c r5 = X.AnonymousClass90c.UNPIN_FOR_ALL
        L_0x00d8:
            X.90c r9 = X.AnonymousClass90c.UNPIN_FOR_ALL
            if (r5 != r9) goto L_0x00f3
            X.8Ri r0 = r6.messageContextInfo_
            if (r0 != 0) goto L_0x00e2
            X.8Ri r0 = X.C173348Ri.DEFAULT_INSTANCE
        L_0x00e2:
            int r0 = r0.messageAddOnDurationInSecs_
            if (r0 == 0) goto L_0x00f3
            java.lang.String r0 = "Unpin request had expiration."
            X.1Tb r0 = X.C165617ti.A0S(r3, r0)
            throw r0
        L_0x00ed:
            X.90c r5 = X.AnonymousClass90c.PIN_FOR_ALL
            goto L_0x00d8
        L_0x00f0:
            X.90c r5 = X.AnonymousClass90c.UNKNOWN_TYPE
            goto L_0x00d8
        L_0x00f3:
            X.90c r11 = X.AnonymousClass90c.PIN_FOR_ALL
            if (r5 == r11) goto L_0x0108
            if (r5 == r9) goto L_0x0108
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unsupported pin type: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r5, r0, r1)
            X.1Tb r0 = X.C165617ti.A0S(r3, r0)
            throw r0
        L_0x0108:
            X.8SW r0 = r8.key_
            if (r0 != 0) goto L_0x010e
            X.8SW r0 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x010e:
            boolean r0 = A01(r0)
            if (r0 == 0) goto L_0x0270
            X.8Q8 r8 = r6.pinInChatMessage_
            if (r8 != 0) goto L_0x011a
            X.8Q8 r8 = X.AnonymousClass8Q8.DEFAULT_INSTANCE
        L_0x011a:
            X.3Qa r6 = r4.A0C
            X.11F r5 = r4.A07
            long r0 = r4.A04
            X.AnonymousClass00C.A0B(r8)
            r10 = 2
            X.AnonymousClass00C.A0D(r8, r10)
            X.5J2 r3 = new X.5J2
            r3.<init>(r6, r0)
            int r1 = r8.type_
            if (r1 == 0) goto L_0x0135
            r0 = 1
            if (r1 == r0) goto L_0x019a
            if (r1 == r10) goto L_0x0137
        L_0x0135:
            X.90c r9 = X.AnonymousClass90c.UNKNOWN_TYPE
        L_0x0137:
            int r1 = r9.ordinal()
            r4 = 0
            r0 = 1
            if (r1 == r0) goto L_0x0198
            if (r1 == r10) goto L_0x014e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessagePinInChatProtobuf Unhandled pin type "
            java.lang.String r0 = X.AnonymousClass000.A0l(r9, r0, r1)
            X.C18740tg.A0D(r7, r0)
        L_0x014e:
            r3.A00 = r4
            long r0 = r8.senderTimestampMs_
            r3.A01 = r0
            X.8SW r9 = r8.key_
            if (r9 != 0) goto L_0x015a
            X.8SW r9 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x015a:
            X.13q r1 = X.AnonymousClass11F.A00
            java.lang.String r0 = r9.remoteJid_
            X.11F r4 = r1.A02(r0)
            X.C18740tg.A06(r4)
            boolean r1 = r9.fromMe_
            java.lang.String r0 = r9.id_
            X.3Qa r4 = X.C165617ti.A0R(r4, r0, r1)
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            X.8SW r0 = r8.key_
            if (r0 != 0) goto L_0x0175
            X.8SW r0 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x0175:
            java.lang.String r0 = r0.participant_
            com.whatsapp.jid.UserJid r1 = r1.A02(r0)
            X.9Vv r0 = new X.9Vv
            r0.<init>(r1, r4)
            r3.A04 = r0
            X.0wQ r1 = r2.A00
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x0196
            if (r5 == 0) goto L_0x0196
        L_0x018a:
            X.8SW r0 = r8.key_
            if (r0 != 0) goto L_0x0190
            X.8SW r0 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x0190:
            X.9Vv r0 = X.C183338qd.A00(r1, r5, r0, r6, r7)
            goto L_0x009d
        L_0x0196:
            r5 = 0
            goto L_0x018a
        L_0x0198:
            r4 = 1
            goto L_0x014e
        L_0x019a:
            r9 = r11
            goto L_0x0137
        L_0x019c:
            boolean r0 = r2 instanceof X.AnonymousClass8UJ
            if (r0 == 0) goto L_0x01be
            X.8UJ r2 = (X.AnonymousClass8UJ) r2
            X.8SX r8 = X.AnonymousClass9YL.A00(r4)
            int r1 = r8.bitField1_
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x03e1
            X.0yC r1 = r2.A03
            r0 = 5563(0x15bb, float:7.795E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x028d
            r0 = 85
            X.2bK r6 = r4.A02(r0)
            return r6
        L_0x01be:
            X.8UF r2 = (X.AnonymousClass8UF) r2
            X.8SX r6 = r4.A0A
            int r0 = r6.bitField1_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x03ea
            int r0 = r4.A01
            X.8Q4 r5 = r6.keepInChatMessage_
            if (r5 != 0) goto L_0x01d0
            X.8Q4 r5 = X.AnonymousClass8Q4.DEFAULT_INSTANCE
        L_0x01d0:
            java.lang.Integer r3 = X.C36421kH.A0U()
            if (r0 == 0) goto L_0x01f6
            int r0 = r5.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x01f6
            int r0 = r5.keepType_
            X.916 r1 = X.AnonymousClass916.A00(r0)
            if (r1 != 0) goto L_0x01e6
            X.916 r1 = X.AnonymousClass916.UNKNOWN
        L_0x01e6:
            X.916 r0 = X.AnonymousClass916.KEEP_FOR_ALL
            if (r1 != r0) goto L_0x01f6
            java.lang.String r0 = "MessageUtils/hasValidKeepInChatMessage edit version and keeptype as kept are both set"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r0 = "edit version and keeptype as kept are both set"
            X.1Tb r0 = X.C165617ti.A0S(r3, r0)
            throw r0
        L_0x01f6:
            X.8SW r0 = r5.key_
            if (r0 != 0) goto L_0x01fc
            X.8SW r0 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x01fc:
            boolean r0 = A01(r0)
            if (r0 == 0) goto L_0x03e3
            X.8Q4 r6 = r6.keepInChatMessage_
            if (r6 != 0) goto L_0x0208
            X.8Q4 r6 = X.AnonymousClass8Q4.DEFAULT_INSTANCE
        L_0x0208:
            X.3Qa r5 = r4.A0C
            long r0 = r4.A04
            X.2bc r3 = new X.2bc
            r3.<init>(r5, r0)
            X.8SW r8 = r6.key_
            if (r8 != 0) goto L_0x0217
            X.8SW r8 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x0217:
            java.lang.String r0 = r8.remoteJid_
            X.11F r7 = X.C36421kH.A0N(r0)
            X.C18740tg.A06(r7)
            boolean r1 = r8.fromMe_
            java.lang.String r0 = r8.id_
            X.3Qa r7 = X.C165617ti.A0R(r7, r0, r1)
            java.lang.String r0 = r8.participant_
            com.whatsapp.jid.UserJid r1 = X.C36431kI.A0l(r0)
            X.9Vv r0 = new X.9Vv
            r0.<init>(r1, r7)
            r3.A04 = r0
            int r0 = r6.keepType_
            X.916 r1 = X.AnonymousClass916.A00(r0)
            if (r1 != 0) goto L_0x023f
            X.916 r1 = X.AnonymousClass916.UNKNOWN
        L_0x023f:
            X.916 r0 = X.AnonymousClass916.KEEP_FOR_ALL
            boolean r0 = X.C36361kB.A1a(r1, r0)
            r3.A01 = r0
            long r0 = r6.timestampMs_
            r3.A02 = r0
            X.11F r4 = r4.A07
            X.0wQ r2 = r2.A00
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x0259
            if (r4 == 0) goto L_0x0259
        L_0x0255:
            X.8SW r1 = r6.key_
            goto L_0x0094
        L_0x0259:
            r4 = 0
            goto L_0x0255
        L_0x025b:
            java.lang.String r0 = "scheduled_call_edit_add_on_invalid_parent_key"
            X.1Tb r0 = X.C165617ti.A0S(r1, r0)
            throw r0
        L_0x0262:
            java.lang.String r0 = "scheduled_call_edit_add_on_missing_edit_type"
            X.1Tb r0 = X.C165617ti.A0S(r1, r0)
            throw r0
        L_0x0269:
            java.lang.String r0 = "scheduled_call_edit_add_on_missing_creation_message_key"
            X.1Tb r0 = X.C165617ti.A0S(r1, r0)
            throw r0
        L_0x0270:
            java.lang.String r0 = "Invalid parent message key."
            X.1Tb r0 = X.C165617ti.A0S(r3, r0)
            throw r0
        L_0x0277:
            java.lang.String r0 = "Missing pin-in-chat type."
            X.1Tb r0 = X.C165617ti.A0S(r3, r0)
            throw r0
        L_0x027e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid edited version: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r8)
            X.1Tb r0 = X.C165617ti.A0S(r3, r0)
            throw r0
        L_0x028d:
            X.8Px r7 = r8.encEventResponseMessage_
            if (r7 != 0) goto L_0x0293
            X.8Px r7 = X.C172978Px.DEFAULT_INSTANCE
        L_0x0293:
            X.AnonymousClass00C.A0B(r7)
            int r0 = r7.bitField0_
            boolean r0 = X.C165577te.A1W(r0)
            r3 = 1
            if (r0 == 0) goto L_0x0318
            X.8SW r0 = r7.eventCreationMessageKey_
            if (r0 != 0) goto L_0x02a7
            X.8SW r0 = X.AnonymousClass8SW.DEFAULT_INSTANCE
            if (r0 == 0) goto L_0x0318
        L_0x02a7:
            r1 = 1
        L_0x02a8:
            X.Ajo r0 = X.C22287Ajo.A00
            X.C1899196c.A00(r0, r1)
            int r0 = r7.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x02b8
            X.AUx r0 = r7.encIv_
            r1 = 1
            if (r0 != 0) goto L_0x02b9
        L_0x02b8:
            r1 = 0
        L_0x02b9:
            X.Ajp r0 = X.C22288Ajp.A00
            X.C1899196c.A00(r0, r1)
            X.AUx r0 = r7.encIv_
            int r1 = r0.A02()
            r0 = 12
            boolean r1 = X.AnonymousClass000.A1S(r1, r0)
            X.Ajq r0 = X.C22289Ajq.A00
            X.C1899196c.A00(r0, r1)
            int r0 = r7.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0316
            X.AUx r0 = r7.encPayload_
            if (r0 == 0) goto L_0x0316
        L_0x02d9:
            X.Ajr r0 = X.C22290Ajr.A00
            X.C1899196c.A00(r0, r3)
            X.9jc r5 = r2.A04
            X.3Qa r13 = r4.A0C
            X.8SW r0 = r7.eventCreationMessageKey_
            if (r0 != 0) goto L_0x02e8
            X.8SW r0 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x02e8:
            X.11F r6 = r13.A00
            X.9Vv r3 = r5.A02(r6, r0, r13)
            X.1Jf r1 = r2.A05
            X.3Qa r0 = r3.A01
            X.AnonymousClass00C.A07(r0)
            X.3Qa r1 = r1.A01(r0)
            X.005 r0 = r2.A06
            java.lang.Object r0 = r0.get()
            X.1A1 r0 = (X.AnonymousClass1A1) r0
            X.3T1 r1 = r0.A03(r1)
            if (r1 != 0) goto L_0x031a
            long r0 = r4.A04
            byte[] r9 = r8.A0o()
            X.2bd r6 = new X.2bd
            r7 = r13
            r8 = r3
            r10 = r0
            r6.<init>(r7, r8, r9, r10)
            return r6
        L_0x0316:
            r3 = 0
            goto L_0x02d9
        L_0x0318:
            r1 = 0
            goto L_0x02a8
        L_0x031a:
            boolean r0 = r1 instanceof X.AnonymousClass2bT
            if (r0 != 0) goto L_0x0332
            boolean r0 = r1 instanceof X.AnonymousClass2c7
            if (r0 != 0) goto L_0x0332
            java.lang.String r0 = "FMessageEventResponseProtobuf/parseFMessageResponse - parent message is not an event message nor sender revoke"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Integer r1 = X.C36381kD.A0m()
            java.lang.String r0 = "parent message is not event message nor sender revoke"
            X.1Tb r0 = X.C165617ti.A0S(r1, r0)
            throw r0
        L_0x0332:
            X.11F r10 = r4.A07
            long r0 = r4.A04
            X.2bd r4 = new X.2bd
            r4.<init>(r13, r0)
            X.3Qa r4 = r4.A1J
            boolean r4 = r4.A02
            if (r4 == 0) goto L_0x0385
            X.17X r4 = r2.A02
            boolean r9 = r4.A0B(r6)
            X.12q r8 = r2.A01
            com.whatsapp.jid.GroupJid r4 = X.C36441kJ.A0l(r6)
            int r8 = r8.A05(r4)
            r4 = 3
            if (r8 == r4) goto L_0x037e
            if (r9 != 0) goto L_0x037e
            X.0wQ r4 = r2.A00
            com.whatsapp.jid.PhoneUserJid r11 = X.C36371kC.A0e(r4)
        L_0x035c:
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
        L_0x035e:
            X.AUx r8 = r7.encIv_
            X.AUx r9 = r7.encPayload_
            X.8SW r12 = r7.eventCreationMessageKey_
            if (r12 != 0) goto L_0x0368
            X.8SW r12 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x0368:
            X.17X r2 = r2.A02
            boolean r15 = r2.A0B(r6)
            java.lang.String r14 = "Event Response"
            X.9XK r7 = new X.9XK
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            byte[] r5 = r5.A04(r7)
            r4 = 11
            if (r5 == 0) goto L_0x03d7
            goto L_0x038a
        L_0x037e:
            X.0wQ r4 = r2.A00
            X.13w r11 = r4.A08()
            goto L_0x035c
        L_0x0385:
            com.whatsapp.jid.UserJid r11 = X.C36401kF.A0b(r10)
            goto L_0x035e
        L_0x038a:
            X.8P0 r2 = X.AnonymousClass8P0.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x03cd }
            X.8Hz r5 = X.C170918Hz.A08(r2, r5)     // Catch:{ 186 -> 0x03cd }
            X.8P0 r5 = (X.AnonymousClass8P0) r5     // Catch:{ 186 -> 0x03cd }
            X.AnonymousClass00C.A08(r5)     // Catch:{ 186 -> 0x03cd }
            int r4 = r5.response_
            if (r4 == 0) goto L_0x03c5
            r2 = 1
            if (r4 == r2) goto L_0x03c2
            r2 = 2
            if (r4 != r2) goto L_0x03c5
            X.90Z r2 = X.AnonymousClass90Z.NOT_GOING
        L_0x03a1:
            long r4 = r5.timestampMs_
            int r6 = r2.ordinal()
            r2 = 1
            if (r6 == r2) goto L_0x03bf
            r2 = 2
            if (r6 == r2) goto L_0x03bc
            r2 = 0
            if (r6 != r2) goto L_0x03c8
            X.2pC r7 = X.C52292pC.UNKNOWN
        L_0x03b2:
            X.2bd r6 = new X.2bd
            r8 = r13
            r10 = r0
            r12 = r4
            r9 = r3
            r6.<init>(r7, r8, r9, r10, r12)
            return r6
        L_0x03bc:
            X.2pC r7 = X.C52292pC.NOT_GOING
            goto L_0x03b2
        L_0x03bf:
            X.2pC r7 = X.C52292pC.GOING
            goto L_0x03b2
        L_0x03c2:
            X.90Z r2 = X.AnonymousClass90Z.GOING
            goto L_0x03a1
        L_0x03c5:
            X.90Z r2 = X.AnonymousClass90Z.UNKNOWN
            goto L_0x03a1
        L_0x03c8:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x03cd:
            java.lang.String r0 = "EventResponseMessageManager/decryptEventResponseMessage: failed to parse payload into protobuf"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1Tb r0 = X.C165567td.A0J(r4)
            throw r0
        L_0x03d7:
            java.lang.String r0 = "EventResponseMessageManager/decryptEventMessageResponsePayload eventResponseMessageBytes is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1Tb r0 = X.C165567td.A0J(r4)
            throw r0
        L_0x03e1:
            r6 = 0
            return r6
        L_0x03e3:
            java.lang.String r0 = "Invalid parent key."
            X.1Tb r0 = X.C165617ti.A0S(r3, r0)
            throw r0
        L_0x03ea:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21186ABu.A02(X.9YL):X.3T1");
    }

    public final AnonymousClass3T1 BlH(AnonymousClass9YL r5) {
        AnonymousClass3T1 A02 = A02(r5);
        if (A02 == null) {
            return null;
        }
        if (A02 instanceof AnonymousClass2bM) {
            AnonymousClass8SX r1 = r5.A0A;
            if (r1.A0x()) {
                C173348Ri r0 = r1.messageContextInfo_;
                C173348Ri r2 = r0;
                if (r0 == null) {
                    r0 = C173348Ri.DEFAULT_INSTANCE;
                }
                if ((r0.bitField0_ & 16) != 0) {
                    AnonymousClass2bM r12 = (AnonymousClass2bM) A02;
                    if (r2 == null) {
                        r2 = C173348Ri.DEFAULT_INSTANCE;
                    }
                    r12.A1a(r2.messageAddOnDurationInSecs_);
                }
            }
            ((AnonymousClass2bM) A02).A1b(A02.A0I);
        }
        return A02;
    }
}
