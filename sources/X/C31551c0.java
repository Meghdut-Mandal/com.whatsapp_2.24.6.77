package X;

/* renamed from: X.1c0  reason: invalid class name and case insensitive filesystem */
public class C31551c0 {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;
    public final AnonymousClass005 A07;
    public final AnonymousClass005 A08;

    /* JADX WARNING: Removed duplicated region for block: B:235:0x0264  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass8SG A00(X.AnonymousClass8SX r6) {
        /*
            r5 = this;
            X.005 r0 = r5.A00
            java.lang.Object r0 = r0.get()
            X.0yC r0 = (X.C20810yC) r0
            X.8SX r4 = X.AnonymousClass9ZT.A01(r0, r6)
            int r1 = r4.bitField0_
            r2 = r1 & 8
            r0 = 0
            if (r2 == 0) goto L_0x0014
            r0 = 1
        L_0x0014:
            r2 = 0
            if (r0 == 0) goto L_0x002a
            X.8Pt r1 = r4.contactMessage_
            if (r1 != 0) goto L_0x001d
            X.8Pt r1 = X.C172938Pt.DEFAULT_INSTANCE
        L_0x001d:
            int r0 = r1.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
        L_0x0025:
            if (r2 != 0) goto L_0x0029
            X.8SG r2 = X.AnonymousClass8SG.DEFAULT_INSTANCE
        L_0x0029:
            return r2
        L_0x002a:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x003d
            X.8Ry r1 = r4.locationMessage_
            if (r1 != 0) goto L_0x0034
            X.8Ry r1 = X.C173508Ry.DEFAULT_INSTANCE
        L_0x0034:
            int r0 = r1.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x003d:
            r3 = 65536(0x10000, float:9.18355E-41)
            r0 = r1 & r3
            if (r0 == 0) goto L_0x0052
            X.8Rs r1 = r4.liveLocationMessage_
            if (r1 != 0) goto L_0x0049
            X.8Rs r1 = X.C173448Rs.DEFAULT_INSTANCE
        L_0x0049:
            int r0 = r1.bitField0_
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x0052:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0065
            X.8SD r1 = r4.extendedTextMessage_
        L_0x0058:
            if (r1 != 0) goto L_0x005c
            X.8SD r1 = X.AnonymousClass8SD.DEFAULT_INSTANCE
        L_0x005c:
            int r0 = r1.bitField0_
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x0065:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x0078
            X.8SF r1 = r4.imageMessage_
            if (r1 != 0) goto L_0x006f
            X.8SF r1 = X.AnonymousClass8SF.DEFAULT_INSTANCE
        L_0x006f:
            int r0 = r1.bitField0_
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x0078:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x008b
            X.8S5 r1 = r4.audioMessage_
            if (r1 != 0) goto L_0x0082
            X.8S5 r1 = X.AnonymousClass8S5.DEFAULT_INSTANCE
        L_0x0082:
            int r0 = r1.bitField0_
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x008b:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x009e
            X.8SE r1 = r4.videoMessage_
        L_0x0091:
            if (r1 != 0) goto L_0x0095
            X.8SE r1 = X.AnonymousClass8SE.DEFAULT_INSTANCE
        L_0x0095:
            int r0 = r1.bitField0_
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x009e:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x00b1
            X.8SC r1 = r4.documentMessage_
            if (r1 != 0) goto L_0x00a8
            X.8SC r1 = X.AnonymousClass8SC.DEFAULT_INSTANCE
        L_0x00a8:
            int r0 = r1.bitField0_
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x00b1:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x00c5
            X.8Pu r1 = r4.contactsArrayMessage_
            if (r1 != 0) goto L_0x00bb
            X.8Pu r1 = X.C172948Pu.DEFAULT_INSTANCE
        L_0x00bb:
            int r0 = r1.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x00c5:
            boolean r0 = r4.A0z()
            if (r0 == 0) goto L_0x00db
            X.8SA r1 = r4.stickerMessage_
        L_0x00cd:
            if (r1 != 0) goto L_0x00d1
            X.8SA r1 = X.AnonymousClass8SA.DEFAULT_INSTANCE
        L_0x00d1:
            int r0 = r1.bitField0_
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x00db:
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00fd
            X.8QB r1 = r4.sendPaymentMessage_
            if (r1 != 0) goto L_0x00e7
            X.8QB r1 = X.AnonymousClass8QB.DEFAULT_INSTANCE
        L_0x00e7:
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0029
            X.8SX r1 = r1.noteMessage_
        L_0x00ef:
            if (r1 != 0) goto L_0x00f3
            X.8SX r1 = X.AnonymousClass8SX.DEFAULT_INSTANCE
        L_0x00f3:
            int r0 = r1.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0111
            X.8SD r1 = r1.extendedTextMessage_
            goto L_0x0058
        L_0x00fd:
            r0 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x011a
            X.8Ra r1 = r4.requestPaymentMessage_
            if (r1 != 0) goto L_0x0108
            X.8Ra r1 = X.C173268Ra.DEFAULT_INSTANCE
        L_0x0108:
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0029
            X.8SX r1 = r1.noteMessage_
            goto L_0x00ef
        L_0x0111:
            boolean r0 = r1.A0z()
            if (r0 == 0) goto L_0x0029
            X.8SA r1 = r1.stickerMessage_
            goto L_0x00cd
        L_0x011a:
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x012f
            X.8RR r1 = r4.productMessage_
            if (r1 != 0) goto L_0x0125
            X.8RR r1 = X.AnonymousClass8RR.DEFAULT_INSTANCE
        L_0x0125:
            int r0 = r1.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x012f:
            r0 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0144
            X.8Rf r1 = r4.groupInviteMessage_
            if (r1 != 0) goto L_0x013a
            X.8Rf r1 = X.C173318Rf.DEFAULT_INSTANCE
        L_0x013a:
            int r0 = r1.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x0144:
            int r3 = r4.bitField1_
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x015b
            X.8RQ r1 = r4.newsletterAdminInviteMessage_
            if (r1 != 0) goto L_0x0151
            X.8RQ r1 = X.AnonymousClass8RQ.DEFAULT_INSTANCE
        L_0x0151:
            int r0 = r1.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x015b:
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0170
            X.8RH r1 = r4.templateButtonReplyMessage_
            if (r1 != 0) goto L_0x0166
            X.8RH r1 = X.AnonymousClass8RH.DEFAULT_INSTANCE
        L_0x0166:
            int r0 = r1.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x0170:
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0029
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0189
            X.8S0 r1 = r4.orderMessage_
            if (r1 != 0) goto L_0x017f
            X.8S0 r1 = X.AnonymousClass8S0.DEFAULT_INSTANCE
        L_0x017f:
            int r0 = r1.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x0189:
            r0 = 1073741824(0x40000000, float:2.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x019e
            X.8RD r1 = r4.listResponseMessage_
            if (r1 != 0) goto L_0x0194
            X.8RD r1 = X.AnonymousClass8RD.DEFAULT_INSTANCE
        L_0x0194:
            int r0 = r1.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x019e:
            r0 = r3 & 1
            if (r0 == 0) goto L_0x01b2
            X.8Re r1 = r4.buttonsMessage_
            if (r1 != 0) goto L_0x01a8
            X.8Re r1 = X.C173308Re.DEFAULT_INSTANCE
        L_0x01a8:
            int r0 = r1.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x01b2:
            r0 = r3 & 2
            if (r0 == 0) goto L_0x01c6
            X.8Qz r1 = r4.buttonsResponseMessage_
            if (r1 != 0) goto L_0x01bc
            X.8Qz r1 = X.C173258Qz.DEFAULT_INSTANCE
        L_0x01bc:
            int r0 = r1.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x01c6:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x01db
            X.8SP r1 = r4.listMessage_
            if (r1 != 0) goto L_0x01d1
            X.8SP r1 = X.AnonymousClass8SP.DEFAULT_INSTANCE
        L_0x01d1:
            int r0 = r1.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x01db:
            boolean r0 = r4.A0w()
            if (r0 == 0) goto L_0x01f1
            X.8SV r1 = r4.interactiveMessage_
            if (r1 != 0) goto L_0x01e7
            X.8SV r1 = X.AnonymousClass8SV.DEFAULT_INSTANCE
        L_0x01e7:
            int r0 = r1.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x01f1:
            r0 = r3 & 64
            if (r0 == 0) goto L_0x0205
            X.8RG r1 = r4.pollCreationMessage_
        L_0x01f7:
            if (r1 != 0) goto L_0x01fb
            X.8RG r1 = X.AnonymousClass8RG.DEFAULT_INSTANCE
        L_0x01fb:
            int r0 = r1.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x0205:
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x020e
            X.8RG r1 = r4.pollCreationMessageV2_
            goto L_0x01f7
        L_0x020e:
            r0 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0216
            X.8RG r1 = r4.pollCreationMessageV3_
            goto L_0x01f7
        L_0x0216:
            r0 = r3 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x022a
            X.8Nw r1 = r4.requestPhoneNumberMessage_
            if (r1 != 0) goto L_0x0220
            X.8Nw r1 = X.C172448Nw.DEFAULT_INSTANCE
        L_0x0220:
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x022a:
            r0 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0233
            X.8SE r1 = r4.ptvMessage_
            goto L_0x0091
        L_0x0233:
            boolean r0 = r4.A10()
            if (r0 == 0) goto L_0x0249
            X.8SL r1 = r4.templateMessage_
            if (r1 != 0) goto L_0x023f
            X.8SL r1 = X.AnonymousClass8SL.DEFAULT_INSTANCE
        L_0x023f:
            int r0 = r1.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x0249:
            boolean r0 = r4.A0y()
            if (r0 == 0) goto L_0x026b
            X.8SQ r0 = r4.protocolMessage_
            r1 = r0
            if (r0 != 0) goto L_0x0256
            X.8SQ r0 = X.AnonymousClass8SQ.DEFAULT_INSTANCE
        L_0x0256:
            int r0 = r0.bitField0_
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x026b
            if (r1 != 0) goto L_0x0260
            X.8SQ r1 = X.AnonymousClass8SQ.DEFAULT_INSTANCE
        L_0x0260:
            X.8SX r0 = r1.editedMessage_
        L_0x0262:
            if (r0 != 0) goto L_0x0266
            X.8SX r0 = X.AnonymousClass8SX.DEFAULT_INSTANCE
        L_0x0266:
            X.8SG r0 = r5.A00(r0)
            return r0
        L_0x026b:
            boolean r0 = r4.A0v()
            if (r0 == 0) goto L_0x0281
            X.8RX r1 = r4.eventMessage_
            if (r1 != 0) goto L_0x0277
            X.8RX r1 = X.AnonymousClass8RX.DEFAULT_INSTANCE
        L_0x0277:
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0029
            X.8SG r2 = r1.contextInfo_
            goto L_0x0025
        L_0x0281:
            r0 = 131072(0x20000, float:1.83671E-40)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0029
            X.8Nk r0 = r4.groupMentionedMessage_
            if (r0 != 0) goto L_0x028c
            X.8Nk r0 = X.C172328Nk.DEFAULT_INSTANCE
        L_0x028c:
            X.8SX r0 = r0.message_
            goto L_0x0262
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31551c0.A00(X.8SX):X.8SG");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0272, code lost:
        if (r1.renderLargerThumbnail_ == false) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x027e, code lost:
        if (r1.showAdAttribution_ == false) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x028a, code lost:
        if (r1.containsAutoReply_ == false) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0296, code lost:
        if (r1.clickToWhatsappCall_ == false) goto L_0x0298;
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x02fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass9YL r25, X.AnonymousClass8SG r26, X.C173348Ri r27, X.AnonymousClass3T1 r28) {
        /*
            r24 = this;
            r5 = r27
            r2 = r28
            if (r27 == 0) goto L_0x00c6
            int r0 = r5.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x00c6
            X.8R9 r1 = r5.botMetadata_
            if (r1 != 0) goto L_0x0012
            X.8R9 r1 = X.AnonymousClass8R9.DEFAULT_INSTANCE
        L_0x0012:
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x002d
            X.4uH r3 = r1.avatarMetadata_
            if (r3 != 0) goto L_0x001e
            X.4uH r3 = X.C99984uH.DEFAULT_INSTANCE
        L_0x001e:
            X.6D0 r0 = new X.6D0
            r0.<init>(r3)
            java.lang.Object r3 = r2.A1M
            monitor-enter(r3)
            r2.A0T = r0     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            goto L_0x002d
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0
        L_0x002d:
            int r0 = r1.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x009a
            X.8Rm r3 = r1.pluginMetadata_
            if (r3 != 0) goto L_0x0039
            X.8Rm r3 = X.C173388Rm.DEFAULT_INSTANCE
        L_0x0039:
            r7 = 1
            X.AnonymousClass00C.A0D(r3, r7)
            int r4 = r3.bitField0_
            r0 = r4 & 1
            if (r0 == 0) goto L_0x0398
            int r6 = r3.provider_
            if (r6 == r7) goto L_0x0394
            r0 = 2
            if (r6 != r0) goto L_0x0394
            X.2q0 r0 = X.C52682q0.GOOGLE
        L_0x004c:
            int r6 = r0.ordinal()
            r0 = 0
            if (r6 == r0) goto L_0x0390
            X.2p5 r8 = X.C52222p5.GOOGLE
        L_0x0055:
            r0 = r4 & 2
            if (r0 == 0) goto L_0x038d
            int r6 = r3.pluginType_
            if (r6 == r7) goto L_0x0389
            r0 = 2
            if (r6 != r0) goto L_0x0389
            X.2pz r0 = X.C52672pz.SEARCH
        L_0x0062:
            int r6 = r0.ordinal()
            r0 = 0
            if (r6 == r0) goto L_0x0385
            X.2p4 r7 = X.C52212p4.SEARCH
        L_0x006b:
            r6 = r4 & 4
            r0 = 0
            if (r6 == 0) goto L_0x0071
            r0 = 1
        L_0x0071:
            r13 = 0
            if (r0 == 0) goto L_0x0382
            java.lang.String r10 = r3.thumbnailCdnUrl_
        L_0x0076:
            r0 = r4 & 8
            if (r0 == 0) goto L_0x037f
            java.lang.String r11 = r3.profilePhotoCdnUrl_
        L_0x007c:
            r0 = r4 & 16
            if (r0 == 0) goto L_0x037c
            java.lang.String r12 = r3.searchProviderUrl_
        L_0x0082:
            r0 = r4 & 32
            if (r0 == 0) goto L_0x0379
            int r0 = r3.referenceIndex_
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L_0x008c:
            r0 = r4 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0092
            java.lang.String r13 = r3.searchQuery_
        L_0x0092:
            X.3KQ r6 = new X.3KQ
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r2.A0s(r6)
        L_0x009a:
            int r0 = r1.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x00c6
            X.8Or r9 = r1.suggestedPromptMetadata_
            if (r9 != 0) goto L_0x00a6
            X.8Or r9 = X.C172658Or.DEFAULT_INSTANCE
        L_0x00a6:
            X.3Kh r7 = r2.A1K
            r0 = 1
            X.AnonymousClass00C.A0D(r9, r0)
            X.B6c r1 = r9.suggestedPrompts_
            if (r1 != 0) goto L_0x0340
            r8 = 0
        L_0x00b1:
            int r0 = r9.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x033d
            int r0 = r9.selectedPromptIndex_
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x00bd:
            r1 = 0
            X.3JL r0 = new X.3JL
            r0.<init>(r3, r8, r1)
            r7.A01(r0)
        L_0x00c6:
            r6 = r25
            boolean r0 = r6.A0O
            r3 = r24
            if (r0 != 0) goto L_0x00fd
            if (r27 == 0) goto L_0x0327
            int r0 = r5.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0327
            X.005 r0 = r3.A05
            java.lang.Object r8 = r0.get()
            X.1Jn r8 = (X.C26271Jn) r8
            X.005 r0 = r3.A04
            java.lang.Object r0 = r0.get()
            X.1DT r0 = (X.AnonymousClass1DT) r0
            int r7 = r0.A0C(r2)
            int r0 = r5.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0311
            X.AUx r0 = r5.messageSecret_
            byte[] r4 = r0.A06()
            int r1 = r4.length
            r0 = 32
            if (r1 != r0) goto L_0x050a
            r2.A1b = r4
        L_0x00fd:
            r0 = r26
            if (r26 == 0) goto L_0x0509
            X.3Qa r7 = r6.A0C
            boolean r6 = r6.A0M
            int r4 = r0.bitField0_
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x0115
            boolean r1 = r0.isSampled_
            if (r1 == 0) goto L_0x0115
            r1 = 262144(0x40000, float:3.67342E-40)
            r2.A0j(r1)
        L_0x0115:
            int r1 = r0.bitField0_
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x01af
            boolean r1 = r0.isForwarded_
            if (r1 == 0) goto L_0x01af
            r5 = 1
            r2.A0j(r5)
            int r4 = r0.bitField0_
            r1 = r4 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x012f
            int r1 = r0.forwardingScore_
            int r5 = java.lang.Math.max(r5, r1)
        L_0x012f:
            r2.A06 = r5
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r4 = r4 & r1
            r1 = 0
            if (r4 == 0) goto L_0x0138
            r1 = 1
        L_0x0138:
            r5 = 0
            if (r1 == 0) goto L_0x018a
            X.8RA r8 = r0.forwardedNewsletterMessageInfo_
            if (r8 != 0) goto L_0x0141
            X.8RA r8 = X.AnonymousClass8RA.DEFAULT_INSTANCE
        L_0x0141:
            int r1 = r8.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x018a
            java.lang.String r4 = r8.newsletterJid_
            X.3Ro r1 = X.C28981Uw.A03
            X.1Uw r10 = r1.A01(r4)
            if (r10 == 0) goto L_0x018a
            int r9 = r8.bitField0_
            r1 = r9 & 2
            if (r1 == 0) goto L_0x030e
            int r14 = r8.serverMessageId_
        L_0x0159:
            r1 = r9 & 4
            if (r1 == 0) goto L_0x030a
            java.lang.String r12 = r8.newsletterName_
        L_0x015f:
            r1 = r9 & 8
            if (r1 == 0) goto L_0x0307
            int r4 = r8.contentType_
            r1 = 1
            if (r4 == r1) goto L_0x0303
            r1 = 2
            if (r4 == r1) goto L_0x02ff
            r1 = 3
            if (r4 != r1) goto L_0x0303
            X.2q4 r1 = X.C52722q4.LINK_CARD
        L_0x0170:
            int r4 = r1.ordinal()
            r1 = 0
            if (r4 == r1) goto L_0x02fb
            r1 = 1
            if (r4 == r1) goto L_0x02f7
            X.2pG r11 = X.C52332pG.LINK_CARD
        L_0x017c:
            r1 = r9 & 16
            if (r1 == 0) goto L_0x02f4
            java.lang.String r13 = r8.accessibilityText_
        L_0x0182:
            X.3Jw r9 = new X.3Jw
            r9.<init>(r10, r11, r12, r13, r14)
            r2.A0z(r9)
        L_0x018a:
            int r4 = r0.bitField0_
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x01af
            X.8Ne r4 = r0.businessMessageForwardInfo_
            if (r4 != 0) goto L_0x0197
            X.8Ne r4 = X.C172268Ne.DEFAULT_INSTANCE
        L_0x0197:
            int r1 = r4.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x01af
            java.lang.String r4 = r4.businessOwnerJid_
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r4 = r1.A02(r4)
            if (r4 == 0) goto L_0x01af
            X.3Ky r1 = new X.3Ky
            r1.<init>(r5, r4)
            r2.A0t(r1)
        L_0x01af:
            int r1 = r0.bitField0_
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0236
            int r1 = r0.expiration_
            r2.A0m(r1)
            int r1 = r0.bitField0_
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x01d2
            X.11F r1 = r7.A00
            boolean r1 = r1 instanceof com.whatsapp.jid.PhoneUserJid
            if (r1 == 0) goto L_0x01d2
            long r4 = r0.ephemeralSettingTimestamp_
            r8 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r8
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r2.A15(r1)
        L_0x01d2:
            X.8SK r1 = r0.disappearingMode_
            if (r1 != 0) goto L_0x01d8
            X.8SK r1 = X.AnonymousClass8SK.DEFAULT_INSTANCE
        L_0x01d8:
            X.90o r1 = r1.A0u()
            int r1 = r1.value
            r2.A00 = r1
            X.005 r1 = r3.A00
            java.lang.Object r5 = r1.get()
            X.0yB r5 = (X.C20800yB) r5
            r4 = 5309(0x14bd, float:7.44E-42)
            X.0yV r1 = X.C21000yV.A02
            boolean r1 = X.C20800yB.A01(r1, r5, r4)
            if (r1 == 0) goto L_0x0236
            X.8SK r1 = r0.disappearingMode_
            r4 = r1
            if (r1 != 0) goto L_0x01f9
            X.8SK r1 = X.AnonymousClass8SK.DEFAULT_INSTANCE
        L_0x01f9:
            int r1 = r1.trigger_
            X.919 r1 = X.AnonymousClass919.A00(r1)
            if (r1 != 0) goto L_0x0203
            X.919 r1 = X.AnonymousClass919.UNKNOWN
        L_0x0203:
            int r10 = X.AnonymousClass9Zc.A00(r1)
            r2.A04 = r10
            if (r4 != 0) goto L_0x020d
            X.8SK r4 = X.AnonymousClass8SK.DEFAULT_INSTANCE
        L_0x020d:
            boolean r9 = r4.initiatedByMe_
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            r8 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0223
            boolean r4 = r7.A02
            r1 = 0
            if (r9 != r4) goto L_0x021d
            r1 = 1
        L_0x021d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.A0d = r1
        L_0x0223:
            if (r10 != 0) goto L_0x0236
            int r4 = r2.A00
            if (r4 == 0) goto L_0x02ef
            r1 = 2
            if (r4 == r5) goto L_0x02e7
            if (r4 != r1) goto L_0x0236
            r2.A04 = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
        L_0x0234:
            r2.A0d = r1
        L_0x0236:
            int r1 = r0.bitField0_
            r1 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x02ae
            X.8S4 r1 = r0.externalAdReply_
            if (r1 != 0) goto L_0x0242
            X.8S4 r1 = X.AnonymousClass8S4.DEFAULT_INSTANCE
        L_0x0242:
            java.lang.String r8 = r1.title_
            java.lang.String r9 = r1.body_
            int r5 = r1.mediaType_
            if (r5 == 0) goto L_0x02e3
            r4 = 1
            if (r5 == r4) goto L_0x02df
            r4 = 2
            if (r5 != r4) goto L_0x02e3
            X.90W r5 = X.AnonymousClass90W.VIDEO
        L_0x0252:
            X.90W r4 = X.AnonymousClass90W.IMAGE
            if (r5 != r4) goto L_0x02d5
            r19 = 1
        L_0x0258:
            java.lang.String r10 = r1.thumbnailUrl_
            java.lang.String r11 = r1.mediaUrl_
            X.AUx r4 = r1.thumbnail_
            byte[] r17 = r4.A06()
            java.lang.String r12 = r1.sourceType_
            java.lang.String r13 = r1.sourceId_
            java.lang.String r14 = r1.sourceUrl_
            int r4 = r1.bitField0_
            r5 = r4 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x0274
            boolean r5 = r1.renderLargerThumbnail_
            r20 = 1
            if (r5 != 0) goto L_0x0276
        L_0x0274:
            r20 = 0
        L_0x0276:
            r5 = r4 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0280
            boolean r5 = r1.showAdAttribution_
            r21 = 1
            if (r5 != 0) goto L_0x0282
        L_0x0280:
            r21 = 0
        L_0x0282:
            r5 = r4 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x028c
            boolean r5 = r1.containsAutoReply_
            r22 = 1
            if (r5 != 0) goto L_0x028e
        L_0x028c:
            r22 = 0
        L_0x028e:
            r4 = r4 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x0298
            boolean r4 = r1.clickToWhatsappCall_
            r23 = 1
            if (r4 != 0) goto L_0x029a
        L_0x0298:
            r23 = 0
        L_0x029a:
            java.lang.String r15 = r1.ctwaClid_
            java.lang.String r1 = r1.ref_
            r18 = 0
            X.3BG r7 = new X.3BG
            r16 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2.A0V = r7
            r1 = 1024(0x400, float:1.435E-42)
            r2.A0j(r1)
        L_0x02ae:
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            X.B6c r1 = r0.mentionedJid_
            java.util.ArrayList r1 = X.AnonymousClass143.A06(r4, r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r1.iterator()
        L_0x02bf:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x039b
            java.lang.Object r5 = r7.next()
            X.11F r5 = (X.AnonymousClass11F) r5
            r4 = 0
            X.3ux r1 = new X.3ux
            r1.<init>(r5, r4)
            r8.add(r1)
            goto L_0x02bf
        L_0x02d5:
            X.90W r4 = X.AnonymousClass90W.VIDEO
            r19 = 0
            if (r5 != r4) goto L_0x0258
            r19 = 2
            goto L_0x0258
        L_0x02df:
            X.90W r5 = X.AnonymousClass90W.IMAGE
            goto L_0x0252
        L_0x02e3:
            X.90W r5 = X.AnonymousClass90W.NONE
            goto L_0x0252
        L_0x02e7:
            r2.A04 = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            goto L_0x0234
        L_0x02ef:
            r2.A04 = r5
            r1 = 0
            goto L_0x0234
        L_0x02f4:
            r13 = r5
            goto L_0x0182
        L_0x02f7:
            X.2pG r11 = X.C52332pG.UPDATE_CARD
            goto L_0x017c
        L_0x02fb:
            X.2pG r11 = X.C52332pG.UPDATE
            goto L_0x017c
        L_0x02ff:
            X.2q4 r1 = X.C52722q4.UPDATE_CARD
            goto L_0x0170
        L_0x0303:
            X.2q4 r1 = X.C52722q4.UPDATE
            goto L_0x0170
        L_0x0307:
            r11 = r5
            goto L_0x017c
        L_0x030a:
            java.lang.String r12 = ""
            goto L_0x015f
        L_0x030e:
            r14 = -1
            goto L_0x0159
        L_0x0311:
            boolean r0 = X.AnonymousClass6HP.A00(r2)
            if (r0 == 0) goto L_0x00fd
            r0 = 0
            r8.A02(r0, r7)
            r0 = 66
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.1Tb r0 = new X.1Tb
            r0.<init>(r1)
            throw r0
        L_0x0327:
            boolean r0 = X.AnonymousClass6HP.A00(r2)
            if (r0 == 0) goto L_0x00fd
            int r1 = r2.A1I
            r0 = 92
            if (r1 != r0) goto L_0x051a
            r0 = 131072(0x20000, float:1.83671E-40)
            boolean r0 = r2.A1T(r0)
            if (r0 == 0) goto L_0x051a
            goto L_0x00fd
        L_0x033d:
            r3 = 0
            goto L_0x00bd
        L_0x0340:
            r0 = 25
            java.util.List r1 = X.C007103b.A0a(r1, r0)
            r0 = 10
            int r0 = X.AnonymousClass03U.A06(r1, r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.Iterator r6 = r1.iterator()
        L_0x0355:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r4 = r6.next()
            java.lang.String r4 = (java.lang.String) r4
            r3 = 500(0x1f4, float:7.0E-43)
            r1 = 0
            X.AnonymousClass00C.A0D(r4, r1)
            int r0 = r4.length()
            if (r3 <= r0) goto L_0x036e
            r3 = r0
        L_0x036e:
            java.lang.String r0 = r4.substring(r1, r3)
            X.AnonymousClass00C.A08(r0)
            r8.add(r0)
            goto L_0x0355
        L_0x0379:
            r9 = r13
            goto L_0x008c
        L_0x037c:
            r12 = r13
            goto L_0x0082
        L_0x037f:
            r11 = r13
            goto L_0x007c
        L_0x0382:
            r10 = r13
            goto L_0x0076
        L_0x0385:
            X.2p4 r7 = X.C52212p4.REELS
            goto L_0x006b
        L_0x0389:
            X.2pz r0 = X.C52672pz.REELS
            goto L_0x0062
        L_0x038d:
            r7 = 0
            goto L_0x006b
        L_0x0390:
            X.2p5 r8 = X.C52222p5.BING
            goto L_0x0055
        L_0x0394:
            X.2q0 r0 = X.C52682q0.BING
            goto L_0x004c
        L_0x0398:
            r8 = 0
            goto L_0x0055
        L_0x039b:
            X.B6c r1 = r0.groupMentions_
            java.util.Iterator r7 = r1.iterator()
        L_0x03a1:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x03c4
            java.lang.Object r4 = r7.next()
            X.8Os r4 = (X.C172668Os) r4
            r1 = 0
            X.AnonymousClass00C.A0D(r4, r1)
            X.13q r1 = X.AnonymousClass11F.A00
            java.lang.String r1 = r4.groupJid_
            X.11F r5 = X.C222713q.A01(r1)
            java.lang.String r4 = r4.groupSubject_
            X.3ux r1 = new X.3ux
            r1.<init>(r5, r4)
            r8.add(r1)
            goto L_0x03a1
        L_0x03c4:
            r2.A18(r8)
            if (r6 == 0) goto L_0x0509
            java.lang.String r4 = r0.remoteJid_
            X.6SZ r1 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r7 = r1.A02(r4)
            int r4 = r0.bitField0_
            r1 = r4 & 4
            if (r1 == 0) goto L_0x04a5
            X.3Qa r1 = r2.A1J
            X.11F r9 = r1.A00
            boolean r8 = r9 instanceof X.C28981Uw
            r5 = 0
            if (r8 == 0) goto L_0x0411
            android.os.Parcelable$Creator r1 = X.C28981Uw.CREATOR
            r7 = r9
        L_0x03e3:
            r1 = r4 & 2
            if (r1 == 0) goto L_0x0403
            java.lang.String r1 = r0.participant_
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.getNullable(r1)
            if (r1 == 0) goto L_0x03f1
            com.whatsapp.jid.UserJid r5 = r1.userJid
        L_0x03f1:
            int r1 = r0.bitField0_
            r1 = r1 & 8
            if (r1 == 0) goto L_0x03ff
            java.lang.String r4 = r0.remoteJid_
            X.13q r1 = X.AnonymousClass11F.A00
            X.11F r9 = r1.A02(r4)
        L_0x03ff:
            if (r8 != 0) goto L_0x0413
            r7 = r5
            goto L_0x0413
        L_0x0403:
            X.11F r4 = r2.A0J()
            if (r4 != 0) goto L_0x040a
            r4 = r9
        L_0x040a:
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r5 = X.C222813r.A00(r4)
            goto L_0x03f1
        L_0x0411:
            r7 = r5
            goto L_0x03e3
        L_0x0413:
            X.005 r1 = r3.A03     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            java.lang.Object r1 = r1.get()     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            X.0wQ r1 = (X.C19730wQ) r1     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            boolean r6 = r1.A0M(r7)     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            X.8SX r11 = r0.quotedMessage_     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            if (r11 != 0) goto L_0x0425
            X.8SX r11 = X.AnonymousClass8SX.DEFAULT_INSTANCE     // Catch:{ 0wR | 1Ta -> 0x04b9 }
        L_0x0425:
            java.lang.String r1 = r0.stanzaId_     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            X.3Qa r10 = new X.3Qa     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            r10.<init>(r9, r1, r6)     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            X.005 r1 = r3.A00     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            java.lang.Object r12 = r1.get()     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            X.0yC r12 = (X.C20810yC) r12     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            X.005 r1 = r3.A06     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            java.lang.Object r5 = r1.get()     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            X.1am r5 = (X.C30791am) r5     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            X.005 r1 = r3.A01     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            java.lang.Object r4 = r1.get()     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            X.12q r4 = (X.C220412q) r4     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            X.11F r1 = r10.A00     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            boolean r1 = X.C202839mk.A04(r5, r4, r12, r1, r11)     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            if (r1 != 0) goto L_0x0499
            r4 = 0
            X.9T0 r4 = X.C1899296d.A00(r11, r10, r4)     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            r4.A04 = r7     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            r1 = 1
            r4.A0I = r1     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            X.9YL r4 = r4.A00()     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            X.005 r1 = r3.A02     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            java.lang.Object r1 = r1.get()     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            X.0xh r1 = (X.C20520xh) r1     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            X.3T1 r4 = r1.A00(r4)     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            if (r7 == r9) goto L_0x0473
            if (r8 == 0) goto L_0x0473
            java.lang.String r1 = "user jid and remote jid don't match in newsletter"
            X.0wR r4 = new X.0wR     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            r4.<init>((java.lang.String) r1)     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            goto L_0x047f
        L_0x0473:
            if (r6 != 0) goto L_0x0483
            if (r7 == 0) goto L_0x0478
            goto L_0x0480
        L_0x0478:
            java.lang.String r1 = "null jid not from me"
            X.0wR r4 = new X.0wR     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            r4.<init>((java.lang.String) r1)     // Catch:{ 0wR | 1Ta -> 0x04b9 }
        L_0x047f:
            throw r4     // Catch:{ 0wR | 1Ta -> 0x04b9 }
        L_0x0480:
            r4.A0q(r7)     // Catch:{ 0wR | 1Ta -> 0x04b9 }
        L_0x0483:
            int r1 = r4.A1I     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            if (r1 != 0) goto L_0x0491
            java.lang.String r1 = r4.A0b()     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            if (r1 != 0) goto L_0x0491
            java.lang.String r1 = r4.A0t     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            if (r1 == 0) goto L_0x04bf
        L_0x0491:
            r1 = 2
            r4.A0o(r1)     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            r2.A0x(r4)     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            goto L_0x04bf
        L_0x0499:
            r1 = 18
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            X.1Tb r1 = new X.1Tb     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            r1.<init>(r4)     // Catch:{ 0wR | 1Ta -> 0x04b9 }
            throw r1     // Catch:{ 0wR | 1Ta -> 0x04b9 }
        L_0x04a5:
            r1 = r4 & 8
            if (r1 == 0) goto L_0x04bf
            if (r7 == 0) goto L_0x04bf
            r4 = 0
            java.lang.String r6 = r0.groupSubject_
            java.lang.String r1 = r0.parentGroupJid_
            X.2c5 r1 = X.C55162uB.A00(r7, r6, r1, r4)
            r2.A0x(r1)
            goto L_0x04bf
        L_0x04b9:
            r4 = move-exception
            java.lang.String r1 = "MessageUtils/buildContextInfo/setupQuotedMessage/error quoted message was malformed, exception="
            com.whatsapp.util.Log.w(r1, r4)
        L_0x04bf:
            X.005 r4 = r3.A00
            java.lang.Object r3 = r4.get()
            X.0yB r3 = (X.C20800yB) r3
            r1 = 508(0x1fc, float:7.12E-43)
            r3.A0E(r1)
            boolean r1 = r0.alwaysShowAdAttribution_
            if (r1 == 0) goto L_0x04d7
            r2.A0z = r1
            r1 = 1073741824(0x40000000, float:2.0)
            r2.A0j(r1)
        L_0x04d7:
            java.lang.Object r4 = r4.get()
            X.0yB r4 = (X.C20800yB) r4
            r3 = 5869(0x16ed, float:8.224E-42)
            X.0yV r1 = X.C21000yV.A02
            boolean r1 = X.C20800yB.A01(r1, r4, r3)
            if (r1 == 0) goto L_0x0509
            int r3 = r0.bitField0_
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r3 & r1
            if (r3 == 0) goto L_0x0509
            r1 = 64
            r2.A0h(r1)
            X.8Nf r1 = r0.dataSharingContext_
            if (r1 != 0) goto L_0x04f9
            X.8Nf r1 = X.C172278Nf.DEFAULT_INSTANCE
        L_0x04f9:
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0509
            boolean r1 = r1.showMmDisclosure_
            X.3Hb r0 = new X.3Hb
            r0.<init>(r1)
            r2.A0v(r0)
        L_0x0509:
            return
        L_0x050a:
            r0 = 1
            r8.A02(r0, r7)
            r0 = 67
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.1Tb r0 = new X.1Tb
            r0.<init>(r1)
            throw r0
        L_0x051a:
            X.005 r0 = r3.A07
            java.lang.Object r4 = r0.get()
            X.0yW r4 = (X.C21010yW) r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageContextInfoDeserializer"
            r1.append(r0)
            java.lang.String r0 = "/applyMessageSecret"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.005 r0 = r3.A04
            java.lang.Object r0 = r0.get()
            X.1DT r0 = (X.AnonymousClass1DT) r0
            int r0 = r0.A0C(r2)
            X.C26271Jn.A01(r4, r1, r0)
            r0 = 66
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.1Tb r0 = new X.1Tb
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31551c0.A01(X.9YL, X.8SG, X.8Ri, X.3T1):void");
    }

    public C31551c0(AnonymousClass005 r1, AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4, AnonymousClass005 r5, AnonymousClass005 r6, AnonymousClass005 r7, AnonymousClass005 r8, AnonymousClass005 r9) {
        this.A00 = r1;
        this.A03 = r2;
        this.A01 = r3;
        this.A07 = r4;
        this.A04 = r5;
        this.A06 = r6;
        this.A05 = r7;
        this.A02 = r8;
        this.A08 = r9;
    }
}
