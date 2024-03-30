package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.6vX  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C146396vX implements C158367go {
    public final /* synthetic */ C121715tb A00;
    public final /* synthetic */ AnonymousClass5JZ A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C146396vX(C121715tb r1, AnonymousClass5JZ r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }

    public final AnonymousClass6XL Bos(C1265864p r13) {
        C121715tb r4 = this.A00;
        String str = this.A02;
        AnonymousClass5JZ r5 = this.A01;
        C123365wN r0 = new C123365wN();
        if (str != null) {
            boolean z = r5.A03;
            C18740tg.A0D(z, "Should only set final hash for streaming uploads");
            r5.A00 = AnonymousClass14B.A0A(str);
            C18740tg.A0D(z, "Should only finalize for streaming uploads");
            C18740tg.A0D(AnonymousClass000.A1V(r5.A00), "Must set final hash before finalizing streaming upload");
            Uri.Builder A002 = AnonymousClass5JZ.A00(r13, r5);
            A002.appendQueryParameter("final_hash", r5.A00);
            String A0b = C90474aD.A0b(A002);
            AnonymousClass6VO A003 = r4.A00.A00(new C164827sR(r0, r4, 2), A0b, (String) null, 0, AnonymousClass000.A1Q(r13.A00));
            try {
                int A04 = A003.A04(r13);
                String str2 = A003.A03;
                long j = A003.A00;
                long j2 = A003.A01;
                r0.A01 = new C123355wM(A003.A02, str2, j, j2, (long) A04);
                r0.A00 = A04;
                if (A04 == 200) {
                    r0.A04 = true;
                }
            } catch (IOException e) {
                Log.e("Error while finalizing upload", e);
            }
        }
        if (r0.A04) {
            return AnonymousClass6XL.A02(r0);
        }
        return AnonymousClass6XL.A03(r0, r0.A00);
    }
}
