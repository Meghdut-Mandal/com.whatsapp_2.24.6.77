package X;

import android.net.Uri;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.5dB  reason: invalid class name and case insensitive filesystem */
public class C111995dB implements C158667hs {
    public Object A00;
    public final int A01;

    public C111995dB(AnonymousClass6YP r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final void B2H(Object obj) {
        C25471Gl r11;
        long j;
        Object obj2 = obj;
        switch (this.A01) {
            case 0:
                AnonymousClass6YP r2 = (AnonymousClass6YP) this.A00;
                File file = (File) obj2;
                AnonymousClass1Y4 r3 = r2.A0s;
                AnonymousClass11F r6 = r2.A0B;
                Log.i("app/mediajobmanager/enqueuevoicenoteupload enqueuing file ");
                AnonymousClass3Ot r10 = new AnonymousClass3Ot(true, false, true);
                if (r6 instanceof C28981Uw) {
                    r11 = C25471Gl.A0U;
                } else {
                    r11 = C25471Gl.A0L;
                }
                C65233Rg A002 = C65233Rg.A00(Uri.fromFile(file), (C132046Rx) null, (C1262263a) null, r10, r11, (AnonymousClass3S2) null, (String) null, 1, false, false, true);
                AnonymousClass1D0 r8 = r3.A0C;
                C146506vi A07 = r8.A07(A002, true);
                C132976Wa r1 = A07.A0N;
                r1.A08(2);
                r1.A07();
                A07.A0X = "mms";
                A07.A0A.A04(new C122635vB(file, false));
                A07.A01 = C203229nZ.A01(r6, false);
                A07.A06(new C164997si(A07, r3, 4), r3.A0S);
                AnonymousClass5BQ r0 = new AnonymousClass5BQ(A07, A07.A02());
                r8.A0D(A07, r0);
                r2.A0C = r0;
                return;
            case 1:
                AnonymousClass6YP r4 = (AnonymousClass6YP) this.A00;
                if (AnonymousClass000.A1X(obj2)) {
                    C1492470k r32 = r4.A12;
                    r32.A0J.A01();
                    r32.A01.setImageResource(R.drawable.inline_audio_pause);
                    C36331k8.A0q(r32.A05, r32.A01, R.string.f12nameremoved);
                } else {
                    AnonymousClass6YP.A07(r4);
                }
                AnonymousClass6YP.A08(r4);
                return;
            case 2:
                AnonymousClass6YP r02 = (AnonymousClass6YP) this.A00;
                boolean A1X = AnonymousClass000.A1X(obj2);
                C1492470k r5 = r02.A12;
                C132476Tw r03 = r02.A0G;
                if (r03 != null) {
                    int A02 = r03.A02();
                    boolean A0D = r03.A0D();
                    int A03 = r03.A03();
                    if (A1X) {
                        A02 = 0;
                        A0D = false;
                    }
                    r5.A04.setProgress(A02);
                    r5.A03.setPlaybackPercentage(((float) A02) / ((float) A03));
                    if (A0D) {
                        j = (long) A02;
                    } else {
                        j = (long) A03;
                    }
                    C90504aG.A16(r5.A02, r5.A0H, C36391kE.A0B(j));
                    return;
                }
                return;
            default:
                AnonymousClass6YP r62 = (AnonymousClass6YP) this.A00;
                int A0I = AnonymousClass000.A0I(obj2);
                if (A0I != r62.A00) {
                    C121915tv r42 = r62.A17;
                    boolean z = r62.A0v.A0A;
                    String A072 = AnonymousClass3UY.A07(r42.A02, (long) A0I);
                    r42.A01.setText(A072);
                    TextView textView = r42.A00;
                    textView.setText(A072);
                    if (z) {
                        textView.setVisibility(4);
                    }
                    r62.A00 = A0I;
                    return;
                }
                return;
        }
    }
}
