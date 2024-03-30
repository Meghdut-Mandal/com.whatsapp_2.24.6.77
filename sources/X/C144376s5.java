package X;

import java.io.BufferedInputStream;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.6s5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C144376s5 implements C19680wL {
    public final /* synthetic */ C19770wU A00;
    public final /* synthetic */ BufferedInputStream A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ AtomicBoolean A03;
    public final /* synthetic */ HttpsURLConnection A04;

    public /* synthetic */ C144376s5(C19770wU r1, BufferedInputStream bufferedInputStream, File file, AtomicBoolean atomicBoolean, HttpsURLConnection httpsURLConnection) {
        this.A00 = r1;
        this.A02 = file;
        this.A03 = atomicBoolean;
        this.A04 = httpsURLConnection;
        this.A01 = bufferedInputStream;
    }

    public final void BUP(AnonymousClass3K7 r9) {
        C19770wU r1 = this.A00;
        File file = this.A02;
        AtomicBoolean atomicBoolean = this.A03;
        HttpsURLConnection httpsURLConnection = this.A04;
        BufferedInputStream bufferedInputStream = this.A01;
        Executor executor = AnonymousClass6Y6.A00;
        r1.Boy(new C1503474x((Object) httpsURLConnection, (Object) file, (Object) atomicBoolean, (Object) bufferedInputStream, 12));
    }
}
