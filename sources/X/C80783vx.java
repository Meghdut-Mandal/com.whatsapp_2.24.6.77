package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collections;

/* renamed from: X.3vx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80783vx implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1XY A01;
    public final /* synthetic */ AnonymousClass11F A02;
    public final /* synthetic */ AnonymousClass3T1 A03;
    public final /* synthetic */ C25471Gl A04;
    public final /* synthetic */ File A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ C80783vx(AnonymousClass1XY r1, AnonymousClass11F r2, AnonymousClass3T1 r3, C25471Gl r4, File file, int i, boolean z, boolean z2) {
        this.A01 = r1;
        this.A02 = r2;
        this.A05 = file;
        this.A04 = r4;
        this.A06 = z;
        this.A03 = r3;
        this.A07 = z2;
        this.A00 = i;
    }

    public final void run() {
        AnonymousClass1XY r1 = this.A01;
        AnonymousClass11F r0 = this.A02;
        File file = this.A05;
        C25471Gl r4 = this.A04;
        boolean z = this.A06;
        AnonymousClass3T1 r3 = this.A03;
        boolean z2 = this.A07;
        try {
            r1.A09((AnonymousClass3XT) null, r3, r4, file, (String) null, Collections.singletonList(r0), this.A00, false, z, z2);
        } catch (IOException e) {
            Log.e("SendMedia/checkSizeAndSend/e", e);
        }
    }
}
