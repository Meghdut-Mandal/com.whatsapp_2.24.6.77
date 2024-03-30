package com.whatsapp.avatar.init;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass1B6;
import X.AnonymousClass1BE;
import X.AnonymousClass1BF;
import X.AnonymousClass65M;
import X.C005502l;
import X.C109385Xj;
import X.C18800tq;
import X.C23871Ae;
import X.C36321k7;
import X.C36341k9;
import X.C36371kC;
import X.C97324ov;
import X.C97334ow;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

public final class AvatarStickerPackWorker extends CoroutineWorker {
    public final AnonymousClass65M A00;
    public final AnonymousClass1BF A01;
    public final C23871Ae A02;
    public final AnonymousClass1B6 A03;
    public final C005502l A04 = AnonymousClass1BE.A00();
    public final C18800tq A05;

    public static final C109385Xj A00(AvatarStickerPackWorker avatarStickerPackWorker, Throwable th) {
        String message;
        String message2;
        int i = avatarStickerPackWorker.A01.A00;
        String str = "no error message";
        StringBuilder A0u = AnonymousClass000.A0u();
        if (i > 3) {
            A0u.append("AvatarStickerPackWorker/too many attempts (");
            A0u.append(i);
            C36341k9.A1O(A0u, "), marking as failed");
            C23871Ae r2 = avatarStickerPackWorker.A02;
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("too_many_retries (");
            if (!(th == null || (message2 = th.getMessage()) == null)) {
                str = message2;
            }
            A0u2.append(str);
            r2.A02(1, "AvatarStickerPackWorker/failure", AnonymousClass000.A0t(A0u2, ')'));
            return C97334ow.A00();
        }
        A0u.append("AvatarStickerPackWorker/sticker download failed, scheduling retry (");
        A0u.append(i);
        Log.w(AnonymousClass000.A0t(A0u, ')'));
        C23871Ae r22 = avatarStickerPackWorker.A02;
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append("download_failed_retry (");
        if (!(th == null || (message = th.getMessage()) == null)) {
            str = message;
        }
        A0u3.append(str);
        r22.A02(1, "AvatarStickerPackWorker/failure", AnonymousClass000.A0t(A0u3, ')'));
        return C97324ov.A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerPackWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C36321k7.A0x(context, workerParameters);
        Context applicationContext = context.getApplicationContext();
        AnonymousClass00C.A08(applicationContext);
        C18800tq A0P = C36371kC.A0P(applicationContext);
        this.A05 = A0P;
        this.A02 = (C23871Ae) A0P.A0V.get();
        this.A03 = (AnonymousClass1B6) A0P.A88.get();
        this.A00 = (AnonymousClass65M) A0P.A0X.get();
        this.A01 = (AnonymousClass1BF) A0P.A0Q.get();
    }
}
