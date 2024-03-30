package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.File;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: X.4xc  reason: invalid class name and case insensitive filesystem */
public class C101474xc extends C101484xd {
    public Boolean A00;

    public C101474xc(C19730wQ r1, C132716Uy r2, C24431Ck r3, C24341Cb r4, AnonymousClass1CY r5, C20840yF r6, C24391Cg r7, AnonymousClass1CS r8, File file, Boolean bool) {
        super(r1, r2, r3, r4, r5, r6, r7, r8, file);
        this.A00 = bool;
    }

    public static boolean A00(AnonymousClass8NN r1, Object obj, AbstractMap abstractMap) {
        Object obj2 = abstractMap.get(obj);
        C18740tg.A06(obj2);
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        r1.A0S();
        return booleanValue;
    }

    public C100094uS A0E() {
        String str;
        boolean z;
        int i;
        String A0D = A0D();
        if (A0D != null) {
            str = A0D.substring(A0D.length() - 2);
        } else {
            str = null;
        }
        AnonymousClass8NN A0p = C100094uS.DEFAULT_INSTANCE.A0p();
        Objects.requireNonNull("2.24.6.77");
        C100094uS r1 = (C100094uS) C90524aI.A0H(A0p);
        r1.bitField0_ |= 1;
        r1.appVersion_ = "2.24.6.77";
        if (str != null) {
            C100094uS r12 = (C100094uS) C90524aI.A0H(A0p);
            r12.bitField0_ |= 4;
            r12.jidSuffix_ = str;
        }
        Boolean bool = this.A00;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            C100094uS r13 = (C100094uS) C90524aI.A0H(A0p);
            r13.bitField1_ |= 64;
            r13.cleanedDb_ = booleanValue;
        }
        C132716Uy r3 = this.A04;
        if (r3 != null) {
            HashMap A01 = C132716Uy.A01(r3);
            Iterator A0z = AnonymousClass000.A0z(A01);
            loop0:
            while (true) {
                z = true;
                while (true) {
                    if (!A0z.hasNext()) {
                        break loop0;
                    }
                    Boolean bool2 = (Boolean) A0z.next();
                    if (!z || !bool2.booleanValue()) {
                        z = false;
                    }
                }
            }
            if (z) {
                i = 1;
            } else {
                i = r3.A00;
            }
            C100094uS r14 = (C100094uS) C90524aI.A0H(A0p);
            r14.bitField0_ |= 8;
            r14.backupVersion_ = i;
            boolean A002 = A00(A0p, "call_log", A01);
            C100094uS r15 = (C100094uS) A0p.A00;
            r15.bitField0_ |= 16;
            r15.callLogMigrationFinished_ = A002;
            boolean A003 = A00(A0p, "labeled_jid", A01);
            C100094uS r16 = (C100094uS) A0p.A00;
            r16.bitField0_ |= 32;
            r16.labeledJidMigrationFinished_ = A003;
            boolean A004 = A00(A0p, "message_fts", A01);
            C100094uS r17 = (C100094uS) A0p.A00;
            r17.bitField0_ |= 64;
            r17.messageFtsMigrationFinished_ = A004;
            boolean A005 = A00(A0p, "blank_me_jid", A01);
            C100094uS r18 = (C100094uS) A0p.A00;
            r18.bitField0_ |= 128;
            r18.blankMeJidMigrationFinished_ = A005;
            boolean A006 = A00(A0p, "message_link", A01);
            C100094uS r19 = (C100094uS) A0p.A00;
            r19.bitField0_ |= 256;
            r19.messageLinkMigrationFinished_ = A006;
            boolean A007 = A00(A0p, "message_main", A01);
            C100094uS r110 = (C100094uS) A0p.A00;
            r110.bitField0_ |= 512;
            r110.messageMainMigrationFinished_ = A007;
            boolean A008 = A00(A0p, "message_text", A01);
            C100094uS r111 = (C100094uS) A0p.A00;
            r111.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            r111.messageTextMigrationFinished_ = A008;
            boolean A009 = A00(A0p, "missed_calls", A01);
            C100094uS r112 = (C100094uS) A0p.A00;
            r112.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
            r112.missedCallsMigrationFinished_ = A009;
            boolean A0010 = A00(A0p, "receipt_user", A01);
            C100094uS r113 = (C100094uS) A0p.A00;
            r113.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
            r113.receiptUserMigrationFinished_ = A0010;
            boolean A0011 = A00(A0p, "message_media", A01);
            C100094uS r114 = (C100094uS) A0p.A00;
            r114.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
            r114.messageMediaMigrationFinished_ = A0011;
            boolean A0012 = A00(A0p, "message_vcard", A01);
            C100094uS r115 = (C100094uS) A0p.A00;
            r115.bitField0_ |= 16384;
            r115.messageVcardMigrationFinished_ = A0012;
            boolean A0013 = A00(A0p, "message_future", A01);
            C100094uS r2 = (C100094uS) A0p.A00;
            r2.bitField0_ |= 32768;
            r2.messageFutureMigrationFinished_ = A0013;
            boolean A0014 = A00(A0p, "message_quoted", A01);
            C100094uS r22 = (C100094uS) A0p.A00;
            r22.bitField0_ |= 65536;
            r22.messageQuotedMigrationFinished_ = A0014;
            boolean A0015 = A00(A0p, "message_system", A01);
            C100094uS r23 = (C100094uS) A0p.A00;
            r23.bitField0_ |= C132986Wc.A0F;
            r23.messageSystemMigrationFinished_ = A0015;
            boolean A0016 = A00(A0p, "receipt_device", A01);
            C100094uS r24 = (C100094uS) A0p.A00;
            r24.bitField0_ |= 262144;
            r24.receiptDeviceMigrationFinished_ = A0016;
            boolean A0017 = A00(A0p, "message_mention", A01);
            C100094uS r25 = (C100094uS) A0p.A00;
            r25.bitField0_ |= 524288;
            r25.messageMentionMigrationFinished_ = A0017;
            boolean A0018 = A00(A0p, "message_revoked", A01);
            C100094uS r26 = (C100094uS) A0p.A00;
            r26.bitField0_ |= 1048576;
            r26.messageRevokedMigrationFinished_ = A0018;
            boolean A0019 = A00(A0p, "broadcast_me_jid", A01);
            C100094uS r27 = (C100094uS) A0p.A00;
            r27.bitField0_ |= 2097152;
            r27.broadcastMeJidMigrationFinished_ = A0019;
            boolean A0020 = A00(A0p, "message_frequent", A01);
            C100094uS r28 = (C100094uS) A0p.A00;
            r28.bitField0_ |= 4194304;
            r28.messageFrequentMigrationFinished_ = A0020;
            boolean A0021 = A00(A0p, "message_location", A01);
            C100094uS r29 = (C100094uS) A0p.A00;
            r29.bitField0_ |= 8388608;
            r29.messageLocationMigrationFinished_ = A0021;
            boolean A0022 = A00(A0p, "participant_user", A01);
            C100094uS r210 = (C100094uS) A0p.A00;
            r210.bitField0_ |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
            r210.participantUserMigrationFinished_ = A0022;
            boolean A0023 = A00(A0p, "message_thumbnail", A01);
            C100094uS r211 = (C100094uS) A0p.A00;
            r211.bitField0_ |= 33554432;
            r211.messageThumbnailMigrationFinished_ = A0023;
            boolean A0024 = A00(A0p, "message_send_count", A01);
            C100094uS r212 = (C100094uS) A0p.A00;
            r212.bitField0_ |= 67108864;
            r212.messageSendCountMigrationFinished_ = A0024;
            boolean A0025 = A00(A0p, "migration_jid_store", A01);
            C100094uS r213 = (C100094uS) A0p.A00;
            r213.bitField0_ |= 134217728;
            r213.migrationJidStoreMigrationFinished_ = A0025;
            boolean A0026 = A00(A0p, "payment_transaction", A01);
            C100094uS r214 = (C100094uS) A0p.A00;
            r214.bitField0_ |= 268435456;
            r214.paymentTransactionMigrationFinished_ = A0026;
            boolean A0027 = A00(A0p, "migration_chat_store", A01);
            C100094uS r215 = (C100094uS) A0p.A00;
            r215.bitField0_ |= 536870912;
            r215.migrationChatStoreMigrationFinished_ = A0027;
            C100094uS r216 = (C100094uS) C90524aI.A0H(A0p);
            r216.bitField0_ |= 1073741824;
            r216.quotedOrderMessageMigrationFinished_ = true;
            C100094uS r217 = (C100094uS) C90524aI.A0H(A0p);
            r217.bitField0_ |= Integer.MIN_VALUE;
            r217.mediaMigrationFixerMigrationFinished_ = true;
            boolean A0028 = A00(A0p, "quoted_order_message_v2", A01);
            C100094uS r116 = (C100094uS) A0p.A00;
            r116.bitField1_ |= 1;
            r116.quotedOrderMessageV2MigrationFinished_ = A0028;
            C100094uS r117 = (C100094uS) C90524aI.A0H(A0p);
            r117.bitField1_ |= 2;
            r117.messageMainVerificationMigrationFinished_ = true;
            boolean A0029 = A00(A0p, "quoted_ui_elements_reply_message", A01);
            C100094uS r118 = (C100094uS) A0p.A00;
            r118.bitField1_ |= 4;
            r118.quotedUiElementsReplyMessageMigrationFinished_ = A0029;
            C100094uS r119 = (C100094uS) C90524aI.A0H(A0p);
            r119.bitField1_ |= 8;
            r119.alterMessageEphemeralToMessageEphemeralRemoveColumnMigrationFinished_ = true;
            C100094uS r120 = (C100094uS) C90524aI.A0H(A0p);
            r120.bitField1_ |= 16;
            r120.alterMessageEphemeralSettingToMessageEphemeralSettingRemoveColumnMigrationFinished_ = true;
        }
        return (C100094uS) A0p.A0R();
    }
}
