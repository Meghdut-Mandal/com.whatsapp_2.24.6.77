package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.util.Log;

/* renamed from: X.ACv  reason: case insensitive filesystem */
public final class C21213ACv implements B14 {
    public final C198209d5 A00;
    public final C30681ab A01;

    public C21213ACv(C198209d5 r1, C30681ab r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void Bd3(AnonymousClass6CO r6, AnonymousClass8NK r7, AnonymousClass3T1 r8) {
        String str;
        C36321k7.A0w(r8, r7);
        if (r8.A1T(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING)) {
            C63663Kx A0P = r8.A0P();
            if (A0P == null) {
                str = "CommentHistorySyncPostProcessor/isValidComment/comment message does not have comment info loaded";
            } else if (A0P.A01() == null) {
                str = "CommentHistorySyncPostProcessor/isValidComment/comment message does not have parent key loaded";
            } else if (C198209d5.A00(r8)) {
                if (r8.A0P() == null || r8.A0P().A01() == null) {
                    throw AnonymousClass001.A08("CommentProtobufHelper/addCommentMetadataToWmi/comment message does not have commentInfo fully populated");
                }
                C195759Vv A012 = r8.A0P().A01();
                C64933Qa r2 = A012.A01;
                if (AnonymousClass143.A03(r2.A00) != null) {
                    AnonymousClass8PX r0 = ((AnonymousClass8SU) r7.A00).commentMetadata_;
                    if (r0 == null) {
                        r0 = AnonymousClass8PX.DEFAULT_INSTANCE;
                    }
                    AnonymousClass8NN A0q = r0.A0q();
                    AnonymousClass8NG A0i = AnonymousClass8SW.A0i();
                    C183338qd.A02(A012.A00, A0i, r2, false);
                    AnonymousClass8PX r22 = (AnonymousClass8PX) C90524aI.A0H(A0q);
                    AnonymousClass8SW r1 = (AnonymousClass8SW) A0i.A0R();
                    int i = AnonymousClass8PX.COMMENT_PARENT_KEY_FIELD_NUMBER;
                    r1.getClass();
                    r22.commentParentKey_ = r1;
                    r22.bitField0_ |= 1;
                    AnonymousClass8SU A0I = AnonymousClass8NN.A0I(r7);
                    AnonymousClass8PX r02 = (AnonymousClass8PX) A0q.A0R();
                    r02.getClass();
                    A0I.commentMetadata_ = r02;
                    A0I.bitField1_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
                } else {
                    throw AnonymousClass001.A08("CommentProtobufHelper/addCommentMetadataToWmi/missing parent chat jid");
                }
            }
            Log.e(str);
            throw AnonymousClass001.A08("CommentHistorySyncPostProcessor/maybeAddCommentMetadata/Invalid comment message");
        }
        if (r8.A1R(16)) {
            C63663Kx A0P2 = r8.A0P();
            if (A0P2 != null) {
                AnonymousClass8PX r03 = ((AnonymousClass8SU) r7.A00).commentMetadata_;
                if (r03 == null) {
                    r03 = AnonymousClass8PX.DEFAULT_INSTANCE;
                }
                AnonymousClass8NN A0q2 = r03.A0q();
                int A002 = A0P2.A00();
                AnonymousClass8PX r12 = (AnonymousClass8PX) C90524aI.A0H(A0q2);
                int i2 = AnonymousClass8PX.COMMENT_PARENT_KEY_FIELD_NUMBER;
                r12.bitField0_ |= 2;
                r12.replyCount_ = A002;
                AnonymousClass8SU A0I2 = AnonymousClass8NN.A0I(r7);
                AnonymousClass8PX r04 = (AnonymousClass8PX) A0q2.A0R();
                r04.getClass();
                A0I2.commentMetadata_ = r04;
                A0I2.bitField1_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
                return;
            }
            throw AnonymousClass001.A08("CommentProtobufHelper/addCommentParentMetadataToWmi/comment parent message does not have commentInfo fully populated");
        }
    }

    public void Bd4(C1275768v r5, AnonymousClass8SU r6, AnonymousClass3T1 r7) {
        C36321k7.A0w(r6, r7);
        if ((r6.bitField1_ & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            AnonymousClass8PX r1 = r6.commentMetadata_;
            if (r1 == null) {
                r1 = AnonymousClass8PX.DEFAULT_INSTANCE;
            }
            if (C165577te.A1W(r1.bitField0_)) {
                AnonymousClass8SW r0 = r1.commentParentKey_;
                if (r0 == null) {
                    r0 = AnonymousClass8SW.DEFAULT_INSTANCE;
                }
                AnonymousClass00C.A08(r0);
                r7.A0u(new AnonymousClass2bB(new C195759Vv((AnonymousClass11F) null, C30681ab.A01(r0)), -1));
                r7.A0j(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING);
                return;
            }
            int i = r1.replyCount_;
            if (i > 0) {
                r7.A0u(new AnonymousClass2bC((Long) null, (Long) null, i));
            }
        }
    }
}
