package X;

import java.util.HashMap;

/* renamed from: X.8Y1  reason: invalid class name */
public class AnonymousClass8Y1 extends C21188ABw {
    public AnonymousClass3T1 BlH(AnonymousClass9YL r10) {
        if (C21188ABw.A00(r10) != 2) {
            return null;
        }
        String A01 = C21188ABw.A01(r10);
        AnonymousClass8Q7 r3 = C170918Hz.A0L(r10).peerDataOperationRequestResponseMessage_;
        if (r3 == null) {
            r3 = AnonymousClass8Q7.DEFAULT_INSTANCE;
        }
        HashMap A0J = AnonymousClass001.A0J();
        C174668Xz r7 = new C174668Xz(r10.A0C, A01, r10.A04);
        C23122B6c<C173088Qi> b6c = r3.peerDataOperationResult_;
        boolean isEmpty = b6c.isEmpty();
        Integer A0d = C165597tg.A0d();
        if (!isEmpty) {
            for (C173088Qi r2 : b6c) {
                int i = r2.bitField0_;
                if ((i & 1) == 0) {
                    throw C165617ti.A0S(A0d, "missing url result");
                } else if ((i & 4) != 0) {
                    C173338Rh r0 = r2.linkPreviewResponse_;
                    C173338Rh r4 = r0;
                    if (r0 == null) {
                        r0 = C173338Rh.DEFAULT_INSTANCE;
                    }
                    String str = r0.url_;
                    AnonymousClass918 A00 = AnonymousClass918.A00(r2.mediaUploadResult_);
                    if (A00 == null) {
                        A00 = AnonymousClass918.GENERAL_ERROR;
                    }
                    C173338Rh r02 = null;
                    if (A00 == AnonymousClass918.SUCCESS) {
                        r02 = r4;
                        if (r4 == null) {
                            r02 = C173338Rh.DEFAULT_INSTANCE;
                        }
                    }
                    A0J.put(str, C36441kJ.A0Q(A00, r02));
                } else {
                    throw C165617ti.A0S(A0d, "missing url response msg");
                }
            }
            r7.A00 = A0J;
            return r7;
        }
        throw C165617ti.A0S(A0d, "empty url result list");
    }
}
