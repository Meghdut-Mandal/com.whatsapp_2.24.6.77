package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.8SX  reason: invalid class name */
public final class AnonymousClass8SX extends C170918Hz implements C22901AyD {
    public static final int AUDIO_MESSAGE_FIELD_NUMBER = 8;
    public static final int BCALL_MESSAGE_FIELD_NUMBER = 72;
    public static final int BOT_INVOKE_MESSAGE_FIELD_NUMBER = 67;
    public static final int BUTTONS_MESSAGE_FIELD_NUMBER = 42;
    public static final int BUTTONS_RESPONSE_MESSAGE_FIELD_NUMBER = 43;
    public static final int CALL_FIELD_NUMBER = 10;
    public static final int CALL_LOG_MESSSAGE_FIELD_NUMBER = 69;
    public static final int CANCEL_PAYMENT_REQUEST_MESSAGE_FIELD_NUMBER = 24;
    public static final int CHAT_FIELD_NUMBER = 11;
    public static final int COMMENT_MESSAGE_FIELD_NUMBER = 77;
    public static final int CONTACTS_ARRAY_MESSAGE_FIELD_NUMBER = 13;
    public static final int CONTACT_MESSAGE_FIELD_NUMBER = 4;
    public static final int CONVERSATION_FIELD_NUMBER = 1;
    public static final int DECLINE_PAYMENT_REQUEST_MESSAGE_FIELD_NUMBER = 23;
    public static final AnonymousClass8SX DEFAULT_INSTANCE;
    public static final int DEVICE_SENT_MESSAGE_FIELD_NUMBER = 31;
    public static final int DOCUMENT_MESSAGE_FIELD_NUMBER = 7;
    public static final int DOCUMENT_WITH_CAPTION_MESSAGE_FIELD_NUMBER = 53;
    public static final int EDITED_MESSAGE_FIELD_NUMBER = 58;
    public static final int ENC_COMMENT_MESSAGE_FIELD_NUMBER = 71;
    public static final int ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER = 76;
    public static final int ENC_REACTION_MESSAGE_FIELD_NUMBER = 56;
    public static final int EPHEMERAL_MESSAGE_FIELD_NUMBER = 40;
    public static final int EVENT_MESSAGE_FIELD_NUMBER = 75;
    public static final int EXTENDED_TEXT_MESSAGE_FIELD_NUMBER = 6;
    public static final int EXTENDED_TEXT_MESSAGE_WITH_PARENT_KEY_FIELD_NUMBER = 79;
    public static final int FAST_RATCHET_KEY_SENDER_KEY_DISTRIBUTION_MESSAGE_FIELD_NUMBER = 15;
    public static final int GROUP_INVITE_MESSAGE_FIELD_NUMBER = 28;
    public static final int GROUP_MENTIONED_MESSAGE_FIELD_NUMBER = 62;
    public static final int HIGHLY_STRUCTURED_MESSAGE_FIELD_NUMBER = 14;
    public static final int IMAGE_MESSAGE_FIELD_NUMBER = 3;
    public static final int INTERACTIVE_MESSAGE_FIELD_NUMBER = 45;
    public static final int INTERACTIVE_RESPONSE_MESSAGE_FIELD_NUMBER = 48;
    public static final int KEEP_IN_CHAT_MESSAGE_FIELD_NUMBER = 51;
    public static final int LIST_MESSAGE_FIELD_NUMBER = 36;
    public static final int LIST_RESPONSE_MESSAGE_FIELD_NUMBER = 39;
    public static final int LIVE_LOCATION_MESSAGE_FIELD_NUMBER = 18;
    public static final int LOCATION_MESSAGE_FIELD_NUMBER = 5;
    public static final int LOTTIE_STICKER_MESSAGE_FIELD_NUMBER = 74;
    public static final int MESSAGE_CONTEXT_INFO_FIELD_NUMBER = 35;
    public static final int MESSAGE_HISTORY_BUNDLE_FIELD_NUMBER = 70;
    public static final int NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER = 78;
    public static final int ORDER_MESSAGE_FIELD_NUMBER = 38;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PAYMENT_INVITE_MESSAGE_FIELD_NUMBER = 44;
    public static final int PIN_IN_CHAT_MESSAGE_FIELD_NUMBER = 63;
    public static final int PLACEHOLDER_MESSAGE_FIELD_NUMBER = 80;
    public static final int POLL_CREATION_MESSAGE_FIELD_NUMBER = 49;
    public static final int POLL_CREATION_MESSAGE_V2_FIELD_NUMBER = 60;
    public static final int POLL_CREATION_MESSAGE_V3_FIELD_NUMBER = 64;
    public static final int POLL_UPDATE_MESSAGE_FIELD_NUMBER = 50;
    public static final int PRODUCT_MESSAGE_FIELD_NUMBER = 30;
    public static final int PROTOCOL_MESSAGE_FIELD_NUMBER = 12;
    public static final int PTV_MESSAGE_FIELD_NUMBER = 66;
    public static final int REACTION_MESSAGE_FIELD_NUMBER = 46;
    public static final int REQUEST_PAYMENT_MESSAGE_FIELD_NUMBER = 22;
    public static final int REQUEST_PHONE_NUMBER_MESSAGE_FIELD_NUMBER = 54;
    public static final int SCHEDULED_CALL_CREATION_MESSAGE_FIELD_NUMBER = 61;
    public static final int SCHEDULED_CALL_EDIT_MESSAGE_FIELD_NUMBER = 65;
    public static final int SECRET_ENCRYPTED_MESSAGE_FIELD_NUMBER = 82;
    public static final int SENDER_KEY_DISTRIBUTION_MESSAGE_FIELD_NUMBER = 2;
    public static final int SEND_PAYMENT_MESSAGE_FIELD_NUMBER = 16;
    public static final int STICKER_MESSAGE_FIELD_NUMBER = 26;
    public static final int TEMPLATE_BUTTON_REPLY_MESSAGE_FIELD_NUMBER = 29;
    public static final int TEMPLATE_MESSAGE_FIELD_NUMBER = 25;
    public static final int VIDEO_MESSAGE_FIELD_NUMBER = 9;
    public static final int VIEW_ONCE_MESSAGE_FIELD_NUMBER = 37;
    public static final int VIEW_ONCE_MESSAGE_V2_EXTENSION_FIELD_NUMBER = 59;
    public static final int VIEW_ONCE_MESSAGE_V2_FIELD_NUMBER = 55;
    public AnonymousClass8S5 audioMessage_;
    public C173068Qg bcallMessage_;
    public int bitField0_;
    public int bitField1_;
    public int bitField2_;
    public C172328Nk botInvokeMessage_;
    public C173308Re buttonsMessage_;
    public C173258Qz buttonsResponseMessage_;
    public AnonymousClass8RC callLogMesssage_;
    public C99944uD call_;
    public C172308Ni cancelPaymentRequestMessage_;
    public C172728Oy chat_;
    public C172738Oz commentMessage_;
    public C172938Pt contactMessage_;
    public C172948Pu contactsArrayMessage_;
    public String conversation_ = "";
    public C172318Nj declinePaymentRequestMessage_;
    public C172958Pv deviceSentMessage_;
    public AnonymousClass8SC documentMessage_;
    public C172328Nk documentWithCaptionMessage_;
    public C172328Nk editedMessage_;
    public C172968Pw encCommentMessage_;
    public C172978Px encEventResponseMessage_;
    public C172988Py encReactionMessage_;
    public C172328Nk ephemeralMessage_;
    public AnonymousClass8RX eventMessage_;
    public AnonymousClass8P1 extendedTextMessageWithParentKey_;
    public AnonymousClass8SD extendedTextMessage_;
    public AnonymousClass8PE fastRatchetKeySenderKeyDistributionMessage_;
    public C173318Rf groupInviteMessage_;
    public C172328Nk groupMentionedMessage_;
    public C173398Rn highlyStructuredMessage_;
    public AnonymousClass8SF imageMessage_;
    public AnonymousClass8SV interactiveMessage_;
    public AnonymousClass8QZ interactiveResponseMessage_;
    public AnonymousClass8Q4 keepInChatMessage_;
    public AnonymousClass8SP listMessage_;
    public AnonymousClass8RD listResponseMessage_;
    public C173448Rs liveLocationMessage_;
    public C173508Ry locationMessage_;
    public C172328Nk lottieStickerMessage_;
    public C173348Ri messageContextInfo_;
    public C173328Rg messageHistoryBundle_;
    public AnonymousClass8RQ newsletterAdminInviteMessage_;
    public AnonymousClass8S0 orderMessage_;
    public AnonymousClass8PA paymentInviteMessage_;
    public AnonymousClass8Q8 pinInChatMessage_;
    public C172428Nu placeholderMessage_;
    public AnonymousClass8RG pollCreationMessageV2_;
    public AnonymousClass8RG pollCreationMessageV3_;
    public AnonymousClass8RG pollCreationMessage_;
    public C173098Qj pollUpdateMessage_;
    public AnonymousClass8RR productMessage_;
    public AnonymousClass8SQ protocolMessage_;
    public AnonymousClass8SE ptvMessage_;
    public C173108Qk reactionMessage_;
    public C173268Ra requestPaymentMessage_;
    public C172448Nw requestPhoneNumberMessage_;
    public AnonymousClass8QA scheduledCallCreationMessage_;
    public AnonymousClass8PD scheduledCallEditMessage_;
    public C173118Ql secretEncryptedMessage_;
    public AnonymousClass8QB sendPaymentMessage_;
    public AnonymousClass8PE senderKeyDistributionMessage_;
    public AnonymousClass8SA stickerMessage_;
    public AnonymousClass8RH templateButtonReplyMessage_;
    public AnonymousClass8SL templateMessage_;
    public AnonymousClass8SE videoMessage_;
    public C172328Nk viewOnceMessageV2Extension_;
    public C172328Nk viewOnceMessageV2_;
    public C172328Nk viewOnceMessage_;

    static {
        AnonymousClass8SX r1 = new AnonymousClass8SX();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8SX.class);
    }

    public static AnonymousClass8SX A0i(byte[] bArr) {
        return (AnonymousClass8SX) C170918Hz.A08(DEFAULT_INSTANCE, bArr);
    }

    public boolean A0u() {
        return AnonymousClass000.A1P(this.bitField1_ & 4194304);
    }

    public boolean A0v() {
        return AnonymousClass000.A1P(this.bitField1_ & 268435456);
    }

    public boolean A0w() {
        return AnonymousClass000.A1P(this.bitField1_ & 8);
    }

    public boolean A0x() {
        return AnonymousClass000.A1P(this.bitField0_ & 67108864);
    }

    public boolean A0y() {
        return AnonymousClass000.A1P(this.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
    }

    public boolean A0z() {
        return AnonymousClass000.A1P(this.bitField0_ & 2097152);
    }

    public boolean A10() {
        return AnonymousClass000.A1P(this.bitField0_ & 1048576);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(70);
                A1Z[1] = "bitField1_";
                A1Z[2] = "bitField2_";
                A1Z[3] = "conversation_";
                A1Z[4] = "senderKeyDistributionMessage_";
                A1Z[5] = "imageMessage_";
                A1Z[6] = "contactMessage_";
                A1Z[7] = "locationMessage_";
                A1Z[8] = "extendedTextMessage_";
                A1Z[9] = "documentMessage_";
                A1Z[10] = "audioMessage_";
                A1Z[11] = "videoMessage_";
                A1Z[12] = "call_";
                A1Z[13] = "chat_";
                A1Z[14] = "protocolMessage_";
                A1Z[15] = "contactsArrayMessage_";
                A1Z[16] = "highlyStructuredMessage_";
                A1Z[17] = "fastRatchetKeySenderKeyDistributionMessage_";
                A1Z[18] = "sendPaymentMessage_";
                A1Z[19] = "liveLocationMessage_";
                A1Z[20] = "requestPaymentMessage_";
                A1Z[21] = "declinePaymentRequestMessage_";
                A1Z[22] = "cancelPaymentRequestMessage_";
                A1Z[23] = "templateMessage_";
                A1Z[24] = "stickerMessage_";
                A1Z[25] = "groupInviteMessage_";
                A1Z[26] = "templateButtonReplyMessage_";
                A1Z[27] = "productMessage_";
                A1Z[28] = "deviceSentMessage_";
                A1Z[29] = "messageContextInfo_";
                A1Z[30] = "listMessage_";
                A1Z[31] = "viewOnceMessage_";
                A1Z[32] = "orderMessage_";
                A1Z[33] = "listResponseMessage_";
                A1Z[34] = "ephemeralMessage_";
                A1Z[35] = "buttonsMessage_";
                A1Z[36] = "buttonsResponseMessage_";
                A1Z[37] = "paymentInviteMessage_";
                A1Z[38] = "interactiveMessage_";
                A1Z[39] = "reactionMessage_";
                A1Z[40] = "interactiveResponseMessage_";
                A1Z[41] = "pollCreationMessage_";
                A1Z[42] = "pollUpdateMessage_";
                A1Z[43] = "keepInChatMessage_";
                A1Z[44] = "documentWithCaptionMessage_";
                A1Z[45] = "requestPhoneNumberMessage_";
                A1Z[46] = "viewOnceMessageV2_";
                A1Z[47] = "encReactionMessage_";
                A1Z[48] = "editedMessage_";
                A1Z[49] = "viewOnceMessageV2Extension_";
                A1Z[50] = "pollCreationMessageV2_";
                A1Z[51] = "scheduledCallCreationMessage_";
                A1Z[52] = "groupMentionedMessage_";
                A1Z[53] = "pinInChatMessage_";
                A1Z[54] = "pollCreationMessageV3_";
                A1Z[55] = "scheduledCallEditMessage_";
                A1Z[56] = "ptvMessage_";
                A1Z[57] = "botInvokeMessage_";
                A1Z[58] = "callLogMesssage_";
                A1Z[59] = "messageHistoryBundle_";
                A1Z[60] = "encCommentMessage_";
                A1Z[61] = "bcallMessage_";
                A1Z[62] = "lottieStickerMessage_";
                A1Z[63] = "eventMessage_";
                A1Z[64] = "encEventResponseMessage_";
                A1Z[65] = "commentMessage_";
                A1Z[66] = "newsletterAdminInviteMessage_";
                A1Z[67] = "extendedTextMessageWithParentKey_";
                A1Z[68] = "placeholderMessage_";
                A1Z[69] = "secretEncryptedMessage_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001C\u0000\u0003\u0001RC\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0012ဉ\u0010\u0016ဉ\u0011\u0017ဉ\u0012\u0018ဉ\u0013\u0019ဉ\u0014\u001aဉ\u0015\u001cဉ\u0016\u001dဉ\u0017\u001eဉ\u0018\u001fဉ\u0019#ဉ\u001a$ဉ\u001b%ဉ\u001c&ဉ\u001d'ဉ\u001e(ဉ\u001f*ဉ +ဉ!,ဉ\"-ဉ#.ဉ$0ဉ%1ဉ&2ဉ'3ဉ(5ဉ)6ဉ*7ဉ+8ဉ,:ဉ-;ဉ.<ဉ/=ဉ0>ဉ1?ဉ2@ဉ3Aဉ4Bဉ5Cဉ6Eဉ7Fဉ8Gဉ9Hဉ:Jဉ;Kဉ<Lဉ=Mဉ>Nဉ?Oဉ@PဉARဉB", A1Z);
            case 3:
                return new AnonymousClass8SX();
            case 4:
                return new AnonymousClass8NL();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8SX.class) {
                    r0 = PARSER;
                    if (r0 == null) {
                        C201979ko r03 = C21072A7j.A01;
                        r0 = C90524aI.A0G(DEFAULT_INSTANCE);
                        PARSER = r0;
                    }
                }
                return r0;
            default:
                throw AnonymousClass001.A0D();
        }
    }
}
