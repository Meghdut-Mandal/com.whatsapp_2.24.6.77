package X;

import android.text.TextUtils;
import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.concurrent.TimeUnit;

public class ABL implements C22938Ayo, C22942Ays, C17740rx {
    public void B24(C196159Xy r9, AnonymousClass3T1 r10) {
        AnonymousClass5UG r0;
        if (r10 instanceof AnonymousClass5J9) {
            AnonymousClass5J9 r102 = (AnonymousClass5J9) r10;
            AnonymousClass8NL r4 = r9.A00;
            AnonymousClass8NE A0J = C170918Hz.A0J(r4);
            C173498Rx r02 = ((AnonymousClass8SQ) A0J.A00).historySyncNotification_;
            if (r02 == null) {
                r02 = C173498Rx.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r02.A0q();
            long j = r102.A05;
            C173498Rx r6 = (C173498Rx) C90524aI.A0H(A0q);
            int i = C173498Rx.CHUNK_ORDER_FIELD_NUMBER;
            r6.bitField0_ |= 2;
            r6.fileLength_ = j;
            int i2 = r102.A03;
            switch (i2) {
                case 0:
                    r0 = AnonymousClass5UG.INITIAL_BOOTSTRAP;
                    break;
                case 1:
                    r0 = AnonymousClass5UG.INITIAL_STATUS_V3;
                    break;
                case 2:
                    r0 = AnonymousClass5UG.RECENT;
                    break;
                case 3:
                    r0 = AnonymousClass5UG.FULL;
                    break;
                case 4:
                    r0 = AnonymousClass5UG.PUSH_NAME;
                    break;
                case 5:
                    r0 = AnonymousClass5UG.NON_BLOCKING_DATA;
                    break;
                case 6:
                    r0 = AnonymousClass5UG.ON_DEMAND;
                    break;
                default:
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Unexpected type (");
                    A0u.append(i2);
                    throw AnonymousClass000.A0c(")", A0u);
            }
            C173498Rx r1 = (C173498Rx) C90524aI.A0H(A0q);
            r1.syncType_ = r0.value;
            r1.bitField0_ |= 32;
            int i3 = r102.A00;
            if (i3 > 0) {
                C173498Rx r12 = (C173498Rx) C90524aI.A0H(A0q);
                r12.bitField0_ |= 64;
                r12.chunkOrder_ = i3;
            }
            String str = r102.A0B;
            if (str != null) {
                C173498Rx r13 = (C173498Rx) C90524aI.A0H(A0q);
                r13.bitField0_ |= 16;
                r13.directPath_ = str;
            }
            String str2 = r102.A0D;
            if (str2 != null) {
                AnonymousClass8I5 A02 = AnonymousClass8NN.A02(A0q, str2);
                C173498Rx r14 = (C173498Rx) A0q.A00;
                r14.bitField0_ |= 1;
                r14.fileSha256_ = A02;
            }
            String str3 = r102.A0C;
            if (str3 != null) {
                AnonymousClass8I5 A022 = AnonymousClass8NN.A02(A0q, str3);
                C173498Rx r15 = (C173498Rx) A0q.A00;
                r15.bitField0_ |= 8;
                r15.fileEncSha256_ = A022;
            }
            byte[] bArr = r102.A0J;
            if (bArr != null) {
                AnonymousClass8I5 A03 = AnonymousClass8NN.A03(A0q, bArr);
                C173498Rx r16 = (C173498Rx) A0q.A00;
                r16.bitField0_ |= 4;
                r16.mediaKey_ = A03;
            }
            if (!TextUtils.isEmpty(r102.A0E)) {
                String str4 = r102.A0E;
                C173498Rx r17 = (C173498Rx) C90524aI.A0H(A0q);
                str4.getClass();
                r17.bitField0_ |= 128;
                r17.originalMessageId_ = str4;
            }
            int i4 = r102.A03;
            if (i4 == 2 || i4 == 3) {
                int i5 = r102.A01;
                C173498Rx r18 = (C173498Rx) C90524aI.A0H(A0q);
                r18.bitField0_ |= 256;
                r18.progress_ = i5;
            }
            long j2 = r102.A0A;
            if (j2 > 0) {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(j2);
                C173498Rx r62 = (C173498Rx) C90524aI.A0H(A0q);
                r62.bitField0_ |= 512;
                r62.oldestMsgInChunkTimestampSec_ = seconds;
            }
            byte[] bArr2 = r102.A0I;
            if (bArr2 != null) {
                AnonymousClass8I5 A0O = C90474aD.A0O(A0q, bArr2);
                C173498Rx r19 = (C173498Rx) A0q.A00;
                r19.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                r19.initialHistBootstrapInlinePayload_ = A0O;
            }
            String str5 = r102.A0F;
            if (str5 != null) {
                C173498Rx r110 = (C173498Rx) C90524aI.A0H(A0q);
                r110.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                r110.peerDataRequestSessionId_ = str5;
            }
            A0J.A0U(AnonymousClass91G.HISTORY_SYNC_NOTIFICATION);
            AnonymousClass8SQ A0A = AnonymousClass8NN.A0A(A0J);
            C173498Rx r03 = (C173498Rx) A0q.A0R();
            r03.getClass();
            A0A.historySyncNotification_ = r03;
            A0A.bitField0_ |= 16;
            r4.A0c(A0J);
            return;
        }
        throw AnonymousClass001.A08(C165567td.A0W(r10, "Message type is not supported ", AnonymousClass000.A0u()));
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r11) {
        int i;
        if (AnonymousClass97T.A00(r11) != AnonymousClass91G.HISTORY_SYNC_NOTIFICATION) {
            return null;
        }
        C64933Qa r2 = r11.A0C;
        AnonymousClass5J9 r3 = new AnonymousClass5J9(r2, r11.A04);
        C173498Rx r4 = C170918Hz.A0L(r11).historySyncNotification_;
        if (r4 == null) {
            r4 = C173498Rx.DEFAULT_INSTANCE;
        }
        int i2 = r4.bitField0_;
        boolean A1P = AnonymousClass000.A1P(i2 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        Integer A0d = C165597tg.A0d();
        if (A1P) {
            r3.A0I = r4.initialHistBootstrapInlinePayload_.A06();
        } else if ((i2 & 4) != 0) {
            r3.A0J = r4.mediaKey_.A06();
            int i3 = r4.bitField0_;
            if ((i3 & 2) != 0) {
                long j = r4.fileLength_;
                if (j > 0) {
                    r3.A05 = j;
                    if ((i3 & 16) != 0) {
                        r3.A0B = r4.directPath_;
                        if ((i3 & 8) == 0 || (i3 & 1) == 0) {
                            C36321k7.A1L(r2, "FMessageHistorySyncNotification/ message with missing file hash info message.key=", AnonymousClass000.A0u());
                            throw new C28541Tb(A0d);
                        }
                        byte[] A06 = r4.fileSha256_.A06();
                        byte[] A062 = r4.fileEncSha256_.A06();
                        if (A06.length == 32 && A062.length == 32) {
                            r3.A0D = Base64.encodeToString(A06, 2);
                            r3.A0C = Base64.encodeToString(A062, 2);
                        } else {
                            C36321k7.A1L(r2, "FMessageHistorySyncNotification/ message with invalid sha-256 hash message.key=", AnonymousClass000.A0u());
                            throw C165567td.A0J(14);
                        }
                    } else {
                        C36321k7.A1L(r2, "FMessageHistorySyncNotification/ message with missing direct path message.key=", AnonymousClass000.A0u());
                        throw new C28541Tb(A0d);
                    }
                }
            }
            C36321k7.A1L(r2, "FMessageHistorySyncNotification/ message with invalid file length message.key=", AnonymousClass000.A0u());
            throw C165567td.A0J(13);
        } else {
            C36321k7.A1L(r2, "FMessageHistorySyncNotification/ message with invalid media key message.key=", AnonymousClass000.A0u());
            throw C165567td.A0J(16);
        }
        int i4 = r4.bitField0_;
        if ((i4 & 32) != 0) {
            AnonymousClass5UG A00 = AnonymousClass5UG.A00(r4.syncType_);
            if (A00 == null) {
                A00 = AnonymousClass5UG.INITIAL_BOOTSTRAP;
            }
            switch (A00.ordinal()) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 3;
                    break;
                case 3:
                    i = 2;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 5;
                    break;
                default:
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Unexpected type (");
                    A0u.append(A00);
                    throw AnonymousClass000.A0c(")", A0u);
            }
            r3.A03 = i;
            if ((i4 & 64) != 0) {
                r3.A00 = r4.chunkOrder_;
            }
            if ((i4 & 128) != 0) {
                r3.A0E = r4.originalMessageId_;
            } else {
                C36321k7.A1L(r2, "FMessageHistorySyncNotification/ message without original msg idmessage.key=", AnonymousClass000.A0u());
            }
            int i5 = r4.bitField0_;
            if ((i5 & 256) != 0) {
                r3.A01 = r4.progress_;
            }
            if ((i5 & 512) != 0) {
                r3.A0A = TimeUnit.SECONDS.toMillis(r4.oldestMsgInChunkTimestampSec_);
            }
            if ((r4.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
                r3.A0F = r4.peerDataRequestSessionId_;
            }
            return r3;
        }
        C36321k7.A1L(r2, "FMessageHistorySyncNotification/ message without sync typemessage.key=", AnonymousClass000.A0u());
        throw new C28541Tb(A0d);
    }
}
