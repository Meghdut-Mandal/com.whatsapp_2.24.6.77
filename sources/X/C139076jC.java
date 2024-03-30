package X;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: X.6jC  reason: invalid class name and case insensitive filesystem */
public class C139076jC implements C158367go {
    public Object A00;
    public final int A01;

    public C139076jC(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final AnonymousClass6XL Bos(C1265864p r18) {
        AnonymousClass5SJ r3;
        C146096v1 A002;
        C1265864p r32 = r18;
        if (this.A01 != 0) {
            String str = r32.A02;
            AnonymousClass1BT r4 = ((AnonymousClass1BS) this.A00).A0F;
            String str2 = r32.A06;
            C36321k7.A1Q("prewarmer/sendrequest/checking authority ", str, AnonymousClass000.A0u());
            try {
                TrafficStats.setThreadStatsTag(2);
                Uri.Builder builder = new Uri.Builder();
                builder.scheme("https").encodedAuthority(str).appendPath("prewarm");
                URL A0j = C90524aI.A0j(C90474aD.A0b(builder));
                SystemClock.elapsedRealtime();
                AnonymousClass1BV r1 = r4.A00;
                r1.A00.A00();
                A002 = AnonymousClass1BV.A00(r1, str2, "POST", A0j);
                SystemClock.elapsedRealtime();
                A002.A01.getResponseCode();
                A002.close();
            } catch (MalformedURLException e) {
                Log.e("prewarmer/sendrequest/error forming URL", e);
            } catch (IOException e2) {
                try {
                    AnonymousClass1BU r12 = r4.A01;
                    if (r12.A03(e2)) {
                        r12.A00();
                    }
                    Log.w("prewarmer/sendrequest/error opening connection", e2);
                } catch (Throwable th) {
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            TrafficStats.clearThreadStatsTag();
            return AnonymousClass6XL.A02(r32);
        }
        AnonymousClass656 r2 = (AnonymousClass656) this.A00;
        C121705ta r13 = r2.A06;
        AnonymousClass1BV r42 = r2.A02;
        int i = r32.A00;
        r42.A01(r32, AnonymousClass000.A1Q(i));
        Uri.Builder A012 = AnonymousClass5JZ.A01(r32, r2.A07);
        A012.appendQueryParameter("resume", "1");
        String A0b = C90474aD.A0b(A012);
        AnonymousClass1BW r8 = r2.A00;
        AnonymousClass1BU r10 = r2.A03;
        AnonymousClass6v5 r7 = new AnonymousClass6v5(r8, r2.A01, r10, r2.A05, A0b, r2.A09);
        r7.A00 = new AnonymousClass6DJ();
        AnonymousClass1GE r11 = r7.A01;
        String str3 = r7.A04;
        AnonymousClass6VO A003 = r11.A00(r7, str3, r7.A05, 10, AnonymousClass000.A1Q(i));
        try {
            int A04 = A003.A04(r32);
            C123345wL r6 = r7.A03;
            r6.A00 = A003.A00;
            r6.A02 = A003.A01;
            r6.A01 = (long) A04;
            r6.A04 = A003.A03;
            r6.A03 = A003.A02;
            if (A04 < 0 || A04 >= 400) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("mediaupload/MMS upload resume form post failed/error=");
                A0u.append(A04);
                C36321k7.A1R("; url=", str3, A0u);
                AnonymousClass6DJ r43 = r7.A00;
                r43.A00 = A04;
                r43.A02 = AnonymousClass5SJ.FAILURE;
            }
        } catch (IOException e3) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("mediaupload/MMS upload resume form post failed; url=");
            C36351kA.A1P(str3, A0u2, e3);
            boolean A03 = r7.A02.A03(e3);
            AnonymousClass6DJ r44 = r7.A00;
            if (A03) {
                r3 = AnonymousClass5SJ.WATLS_ERROR;
            } else {
                r3 = AnonymousClass5SJ.FAILURE;
            }
            r44.A02 = r3;
            C123345wL r5 = r7.A03;
            r5.A00 = A003.A00;
            r5.A02 = A003.A01;
            r5.A03 = A003.A02;
        }
        AnonymousClass6DJ r45 = r7.A00;
        r45.A03 = r2.A04.A00(r45.A03, false);
        AnonymousClass5SJ r22 = r45.A02;
        if (r22 == null) {
            r22 = AnonymousClass5SJ.FAILURE;
            r45.A02 = r22;
        }
        if (r22 == AnonymousClass5SJ.WATLS_ERROR) {
            Log.i("resumecheck/attempting fallback MMS upload form post - watls error");
            r10.A00();
        } else if (r22 == AnonymousClass5SJ.FAILURE) {
            Log.i("resumecheck/attempting fallback MMS upload form post");
        } else {
            if (r22 == AnonymousClass5SJ.RESUME) {
                r13.A02 = C36441kJ.A0y(r45.A01);
            }
            return AnonymousClass6XL.A02(r45);
        }
        return AnonymousClass6XL.A03(r45, r45.A00);
        throw th;
    }
}
