package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.io.File;
import java.nio.file.Files;
import java.util.concurrent.Executor;

/* renamed from: X.64o  reason: invalid class name and case insensitive filesystem */
public class C1265764o {
    public C24341Cb A00;
    public final Context A01;
    public final AnonymousClass17Y A02;
    public final AnonymousClass1D0 A03;
    public final C29221Vu A04;
    public final C29121Vk A05;
    public final C200049gU A06;
    public final C19770wU A07;

    public void A00(AF3 af3, C123925xJ r19, C25471Gl r20, File file) {
        C123925xJ r3 = r19;
        if (Build.VERSION.SDK_INT < 26) {
            this.A02.A04.execute(new AVX(r3, 7));
            return;
        }
        try {
            File A012 = this.A00.A00().A01("enc");
            C90524aI.A0W(A012).write(af3.B6U(Files.readAllBytes(file.toPath()), C18750th.A0H(16)));
            C146506vi A072 = this.A03.A07(C65233Rg.A00(Uri.fromFile(A012), (C132046Rx) null, new C1262263a(SearchActionVerificationClientService.NOTIFICATION_ID, 100, 1600, 1600), new AnonymousClass3Ot(true, false, true), r20, (AnonymousClass3S2) null, (String) null, 0, false, false, false), true);
            A072.A0X = "mms";
            A072.A06(new AnonymousClass70K(A072, this, r3), (Executor) null);
            this.A07.Boy(new AVb(this, A072, 14));
        } catch (Exception unused) {
            Log.e("PAY: PaymentsComplianceMediaUploadManager encryption failure");
            this.A02.A04.execute(new AVX(r3, 8));
        }
    }

    public C1265764o(Context context, AnonymousClass17Y r2, AnonymousClass1D0 r3, C29221Vu r4, C29121Vk r5, C200049gU r6, C19770wU r7) {
        this.A01 = context;
        this.A02 = r2;
        this.A07 = r7;
        this.A03 = r3;
        this.A05 = r5;
        this.A04 = r4;
        this.A06 = r6;
    }
}
