package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.crash.upload.ExceptionsUploadService;

/* renamed from: X.6pP  reason: invalid class name and case insensitive filesystem */
public class C142746pP implements C19710wO, C158537hf {
    public boolean A00 = false;
    public final Context A01;

    public String BIB() {
        return "ExceptionsUploadAsyncInit";
    }

    public void BRD() {
        this.A00 = true;
    }

    public /* synthetic */ void BRM() {
    }

    public void BRL() {
        Context context = this.A01;
        boolean z = this.A00;
        Class<ExceptionsUploadService> cls = ExceptionsUploadService.class;
        Intent A0H = C36441kJ.A0H(context, cls);
        A0H.putExtra("app_version_changed", z);
        AnonymousClass0DY.A00(context, A0H, cls, 1);
    }

    public C142746pP(Context context) {
        this.A01 = context;
    }
}
