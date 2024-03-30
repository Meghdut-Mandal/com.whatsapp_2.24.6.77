package X;

import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import java.util.Map;

/* renamed from: X.88V  reason: invalid class name */
public final class AnonymousClass88V extends A24 implements C23112B5r {
    public final A1q A00 = new A1q();
    public final C17540ra A01;
    public final C20975A1l A02;
    public final C20978A1s A03 = new C20978A1s();
    public final A1o A04 = new A1o();
    public final AnonymousClass9TK A05;

    public String BGH() {
        return SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
    }

    public Map BKh(C114785hp r1, Map map) {
        return map;
    }

    public void Brp(String str) {
        if (!AnonymousClass00C.A0J(str, SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Unexpected ProductName ");
            IllegalArgumentException A0c = AnonymousClass000.A0c(str, A0u);
            BuH("CameraCore::ProductName", A0c, false);
            throw A0c;
        }
    }

    public AnonymousClass94T BDK() {
        AnonymousClass94T r0 = C23112B5r.A00;
        AnonymousClass00C.A09(r0);
        return r0;
    }

    public void BOd(String str, String str2, Map map, long j) {
        A00(str);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WhatsAppOneCameraLogger/logAudioPipelineEvent Event = ");
        A01(str, "AudioPipelineController", A0u, j);
        AnonymousClass00C.A0D(AnonymousClass000.A0l(map, ", Extras = ", A0u), 0);
    }

    public void BOf(String str, String str2, Map map, long j) {
        A00(str);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WhatsAppOneCameraLogger/logCameraEvent Event = ");
        A01(str, "ComponentManager", A0u, j);
        AnonymousClass00C.A0D(AnonymousClass000.A0l((Object) null, ", Extras = ", A0u), 0);
    }

    public void BOt(C1890391u r6, String str, String str2, String str3, String str4, Map map, long j) {
        A00("media_pipeline_error");
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WhatsAppOneCameraLogger/logMediaPipelineError Event = ");
        A01("media_pipeline_error", "MediaGraphControllerImpl", A0u, j);
        A0u.append(", Severity = ");
        A0u.append(str3);
        A0u.append(", Source = ");
        A0u.append("MediaGraphControllerImpl");
        String A0l = AnonymousClass000.A0l((Object) null, ", Extras = ", A0u);
        C90464aC.A1L("Spark/", A0l, C36341k9.A0i(A0l), r6);
    }

    public void Bn1(long j, boolean z) {
        C194839Rl r1 = this.A03.A00;
        r1.A00 = true;
        r1.A01.A00(j);
        C195379Ub r5 = r1.A03;
        if (r5.A04 != 0) {
            r5.A03++;
        }
        r5.A04 = j;
    }

    public void Bn2(long j) {
        C194839Rl r6 = this.A03.A00;
        C195379Ub r5 = r6.A01;
        if (r5.A04 != 0) {
            r5.A03++;
        }
        r5.A04 = j;
        if (r6.A00) {
            r6.A03.A00(j);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass88V(C17540ra r3, B3B b3b, AnonymousClass9TK r5) {
        super(b3b);
        C36321k7.A0z(r5, r3);
        this.A05 = r5;
        this.A01 = r3;
        AnonymousClass00C.A08(C36361kB.A0l());
        this.A02 = new C20975A1l(r5);
        String str = (String) this.A00.BA0(C197439bi.A02);
        if (str != null) {
            Brp(str);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r4.equals(r0) == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r0 = r3.A00;
        r2 = X.C187678yM.A01;
        r1 = r0.A00;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r4.equals(r0) == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        r0 = r3.A00;
        r2 = X.C187678yM.A01;
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r1.get(r2) != null) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        r0 = X.C36361kB.A0l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        r1.put(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = 40;
        r0 = r4.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (40 <= r0) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        X.AnonymousClass00C.A08(r4.substring(0, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(java.lang.String r4) {
        /*
            r3 = this;
            int r2 = r4.hashCode()
            java.lang.String r0 = "media_pipeline_start"
            switch(r2) {
                case -1629286812: goto L_0x001b;
                case 1028385748: goto L_0x001e;
                case 1031703104: goto L_0x0030;
                case 1876082191: goto L_0x002e;
                default: goto L_0x0009;
            }
        L_0x0009:
            r2 = 40
            r1 = 0
            int r0 = r4.length()
            if (r2 <= r0) goto L_0x0013
            r2 = r0
        L_0x0013:
            java.lang.String r0 = r4.substring(r1, r2)
            X.AnonymousClass00C.A08(r0)
            return
        L_0x001b:
            java.lang.String r0 = "media_pipeline_stop"
            goto L_0x0020
        L_0x001e:
            java.lang.String r0 = "media_pipeline_pause"
        L_0x0020:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.A1q r0 = r3.A00
            X.8yM r2 = X.C187678yM.A01
            java.util.HashMap r1 = r0.A00
            r0 = 0
            goto L_0x0046
        L_0x002e:
            java.lang.String r0 = "media_pipeline_resume"
        L_0x0030:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.A1q r0 = r3.A00
            X.8yM r2 = X.C187678yM.A01
            java.util.HashMap r1 = r0.A00
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L_0x0009
            java.lang.String r0 = X.C36361kB.A0l()
        L_0x0046:
            r1.put(r2, r0)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass88V.A00(java.lang.String):void");
    }

    public static void A01(String str, String str2, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(", Component Name = ");
        sb.append(str2);
        sb.append(", Component ID = ");
        sb.append(j);
    }

    public C159037ih B9K() {
        return this.A04;
    }

    public C159047ii BFq() {
        return this.A03;
    }

    public void BOu(String str, String str2, Map map, long j) {
        A00(str);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WhatsAppOneCameraLogger/logMediaPipelineEvent Event = ");
        A01(str, str2, A0u, j);
        AnonymousClass00C.A0D(AnonymousClass000.A0l(map, ", Extras = ", A0u), 0);
    }

    public void BuH(String str, Throwable th, boolean z) {
        String A0p = AnonymousClass000.A0p("WhatsAppOneCameraLogger/softReportError Category = ", str, AnonymousClass000.A0u());
        C90464aC.A1L("Spark/", A0p, C36341k9.A0i(A0p), th);
    }
}
