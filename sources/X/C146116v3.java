package X;

import java.io.File;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.6v3  reason: invalid class name and case insensitive filesystem */
public final class C146116v3 implements C160437l0 {
    public final /* synthetic */ C123985xP A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ AnonymousClass0AP A02;

    public void BUJ(String str) {
        AnonymousClass00C.A0D(str, 0);
    }

    public /* synthetic */ void BVA(long j) {
    }

    public C146116v3(C123985xP r1, File file, AnonymousClass0AP r3) {
        this.A01 = file;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void Bez(String str, Map map) {
        Object A022;
        this.A01.delete();
        AnonymousClass0AP r2 = this.A02;
        if (AnonymousClass0AR.A04.get(r2) instanceof C16560pR) {
            if (str == null || str.length() == 0) {
                A022 = AnonymousClass00C.A02(C90514aH.A0s("empty response"));
            } else {
                JSONObject A1C = C36441kJ.A1C(str);
                A1C.getBoolean("success");
                A022 = C90474aD.A0e("file_handle1", A1C);
            }
            r2.resumeWith(A022);
        }
    }

    public void BWo(String str) {
        C36321k7.A1P("IdvImageUploader/upload/OnError: ", str, AnonymousClass000.A0u());
        this.A01.delete();
        AnonymousClass0AP r1 = this.A02;
        if (AnonymousClass0AR.A04.get(r1) instanceof C16560pR) {
            r1.resumeWith(AnonymousClass00C.A02(C90514aH.A0s(str)));
        }
    }
}
