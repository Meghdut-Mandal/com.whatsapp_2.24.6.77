package X;

import java.io.File;
import java.util.Map;

/* renamed from: X.6v4  reason: invalid class name and case insensitive filesystem */
public class C146126v4 implements C160437l0 {
    public final /* synthetic */ C122475uu A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ File A03;

    public /* synthetic */ void BUJ(String str) {
    }

    public C146126v4(C122475uu r1, File file, File file2, File file3) {
        this.A00 = r1;
        this.A03 = file;
        this.A02 = file2;
        this.A01 = file3;
    }

    public void BVA(long j) {
        this.A03.delete();
        this.A02.delete();
        this.A01.delete();
    }

    public void BWo(String str) {
        C36321k7.A1P("MemoryExceptionsUploadHelper/Error: ", str, AnonymousClass000.A0u());
    }

    public void Bez(String str, Map map) {
    }
}
