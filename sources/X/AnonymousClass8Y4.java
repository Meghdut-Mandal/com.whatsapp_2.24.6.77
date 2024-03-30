package X;

import java.util.Map;

/* renamed from: X.8Y4  reason: invalid class name */
public class AnonymousClass8Y4 extends C21188ABw {
    public AnonymousClass3T1 BlH(AnonymousClass9YL r9) {
        AnonymousClass8SA r0;
        if (C21188ABw.A00(r9) != 0) {
            return null;
        }
        AnonymousClass8Y0 r5 = new AnonymousClass8Y0(r9.A0C, C21188ABw.A01(r9), r9.A04);
        AnonymousClass8Q7 r02 = C170918Hz.A0L(r9).peerDataOperationRequestResponseMessage_;
        if (r02 == null) {
            r02 = AnonymousClass8Q7.DEFAULT_INSTANCE;
        }
        C23122B6c<C173088Qi> b6c = r02.peerDataOperationResult_;
        boolean isEmpty = b6c.isEmpty();
        Integer A0d = C165597tg.A0d();
        if (!isEmpty) {
            for (C173088Qi r6 : b6c) {
                int i = r6.bitField0_;
                if ((i & 1) == 0) {
                    throw C165617ti.A0S(A0d, "missing sticker result");
                } else if ((i & 2) != 0) {
                    AnonymousClass8SA r03 = r6.stickerMessage_;
                    if (r03 == null) {
                        r03 = AnonymousClass8SA.DEFAULT_INSTANCE;
                    }
                    String A13 = C36441kJ.A13(r03.fileSha256_.A06());
                    AnonymousClass918 A00 = AnonymousClass918.A00(r6.mediaUploadResult_);
                    if (A00 == null) {
                        A00 = AnonymousClass918.GENERAL_ERROR;
                    }
                    boolean A1a = C36361kB.A1a(A00, AnonymousClass918.SUCCESS);
                    Map map = r5.A00;
                    if (A1a) {
                        r0 = r6.stickerMessage_;
                        if (r0 == null) {
                            r0 = AnonymousClass8SA.DEFAULT_INSTANCE;
                        }
                    } else {
                        r0 = null;
                    }
                    map.put(A13, C36441kJ.A0Q(A00, r0));
                } else {
                    throw C165617ti.A0S(A0d, "missing sticker response msg");
                }
            }
            return r5;
        }
        throw C165617ti.A0S(A0d, "empty sticker result list");
    }
}
