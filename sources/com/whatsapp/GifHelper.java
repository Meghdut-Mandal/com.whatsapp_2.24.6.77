package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass1GW;
import X.AnonymousClass5V4;
import X.C24341Cb;
import X.C36321k7;
import X.C36331k8;
import X.C90514aH;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

public final class GifHelper {
    public static final GifHelper A00 = new GifHelper();

    public static final void A00(C24341Cb r6, File file) {
        AnonymousClass5V4 r1;
        AnonymousClass00C.A0D(r6, 0);
        try {
            File A01 = r6.A01(file);
            AnonymousClass00C.A08(A01);
            Mp4Ops.LibMp4OperationResult applyGifTag = A00.applyGifTag(C90514aH.A0w(file), C90514aH.A0w(A01));
            if (applyGifTag == null) {
                Log.e("gif-helper/applyGifTag is null");
                r1 = new AnonymousClass5V4(0, "result is null");
            } else if (!applyGifTag.success) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("gif-helper/applyGifTag");
                C36321k7.A1Z(A0u, applyGifTag.errorMessage);
                int i = applyGifTag.errorCode;
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("invalid result, error_code: ");
                A0u2.append(i);
                A0u2.append(" | ");
                r1 = new AnonymousClass5V4(i, AnonymousClass000.A0q(applyGifTag.errorMessage, A0u2));
            } else if (!AnonymousClass1GW.A0S(r6, A01, file)) {
                Log.e("gif-helper/applyGifTag failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
                r1 = new AnonymousClass5V4(0, "applyGifTag failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
            } else {
                return;
            }
            throw r1;
        } catch (IOException e) {
            Log.e("Could not access file or failed to move files properly", e);
            throw new AnonymousClass5V4(0, C36331k8.A0i("Could not access file or failed to move files properly | ", AnonymousClass000.A0u(), e));
        }
    }

    private final native Mp4Ops.LibMp4OperationResult applyGifTag(String str, String str2);

    private final native boolean hasGifTag(String str);

    public static final boolean A01(File file) {
        if (file == null || !A00.hasGifTag(C90514aH.A0w(file))) {
            return false;
        }
        return true;
    }
}
