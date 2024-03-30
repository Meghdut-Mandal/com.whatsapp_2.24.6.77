package X;

import android.os.FileObserver;

/* renamed from: X.7uv  reason: invalid class name and case insensitive filesystem */
public class C166037uv extends FileObserver {
    public final /* synthetic */ C201189j2 A00;
    public final /* synthetic */ AnonymousClass004 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166037uv(C201189j2 r2, String str, AnonymousClass004 r4) {
        super(str, 2);
        this.A00 = r2;
        this.A01 = r4;
    }

    public void onEvent(int i, String str) {
        if (AnonymousClass6YR.A01.BMH(2)) {
            AnonymousClass6YR.A01.BxE("LightSharedPreferencesFactory", "Reloading LSP due to file modification.");
        }
        C201189j2.A00(this.A00, this.A01);
    }
}
