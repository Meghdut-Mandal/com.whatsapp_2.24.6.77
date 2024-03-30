package X;

import com.whatsapp.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6Rk  reason: invalid class name and case insensitive filesystem */
public abstract class C131946Rk {
    public static final Map A00;
    public static final Integer[] A01;

    public static double[] A00(int i) {
        double d;
        double[] dArr = {((double) ((i >> 16) & 255)) / 255.0d, ((double) ((i >> 8) & 255)) / 255.0d, ((double) (i & 255)) / 255.0d};
        int i2 = 0;
        do {
            double d2 = dArr[i2];
            if (d2 > 0.04045d) {
                d = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            } else {
                d = d2 / 12.92d;
            }
            dArr[i2] = d;
            dArr[i2] = d * 100.0d;
            i2++;
        } while (i2 < 3);
        double d3 = dArr[0];
        double d4 = dArr[1];
        double d5 = dArr[2];
        return new double[]{(d3 * 0.4124d) + (d4 * 0.3576d) + (d5 * 0.1805d), (d3 * 0.2126d) + (d4 * 0.7152d) + (d5 * 0.0722d), (d3 * 0.0193d) + (d4 * 0.1192d) + (d5 * 0.9505d)};
    }

    public static double[] A01(double[] dArr) {
        double[] dArr2 = {dArr[0] / 95.047d, dArr[1] / 100.0d, dArr[2] / 108.883d};
        int i = 0;
        do {
            if (dArr2[i] > 0.008856d) {
                dArr2[i] = Math.pow(dArr2[i], 0.3333333333333333d);
            } else {
                dArr2[i] = (dArr2[i] * 7.787d) + 0.13793103448275862d;
            }
            i++;
        } while (i < 3);
        double d = dArr2[1];
        return new double[]{(d * 116.0d) - 16.0d, (dArr2[0] - d) * 500.0d, (d - dArr2[2]) * 200.0d};
    }

    static {
        HashMap A0J = AnonymousClass001.A0J();
        A00 = A0J;
        Integer A0f = C90484aE.A0f(15792383, A0J, R.string.f12nameremoved);
        C36331k8.A1Q(A0f, A0J, 761085);
        Integer A0f2 = C90484aE.A0f(16444375, A0J, R.string.f12nameremoved);
        Integer A0f3 = C90484aE.A0f(65535, A0J, R.string.f12nameremoved);
        C36331k8.A1Q(A0f3, A0J, 8388564);
        Integer A0f4 = C90484aE.A0f(15794175, A0J, R.string.f12nameremoved);
        C36331k8.A1Q(A0f2, A0J, 16119260);
        C36331k8.A1Q(A0f2, A0J, 16770244);
        C36341k9.A1K(C36381kD.A0m(), A0J, R.string.f12nameremoved);
        C36331k8.A1Q(A0f2, A0J, 16772045);
        Integer A0f5 = C90484aE.A0f(255, A0J, R.string.f12nameremoved);
        Integer A0f6 = C90484aE.A0f(9055202, A0J, R.string.f12nameremoved);
        Integer A0f7 = C90484aE.A0f(10824234, A0J, R.string.f12nameremoved);
        C36331k8.A1Q(A0f2, A0J, 14596231);
        Integer A0f8 = C90484aE.A0f(6266528, A0J, R.string.f12nameremoved);
        Integer A0f9 = C90484aE.A0f(8388352, A0J, R.string.f12nameremoved);
        C36331k8.A1Q(A0f9, A0J, 6537036);
        Integer A0f10 = C90484aE.A0f(13789470, A0J, R.string.f12nameremoved);
        Integer A0f11 = C90484aE.A0f(16744272, A0J, R.string.f12nameremoved);
        C36331k8.A1Q(A0f, A0J, 6591981);
        Integer A0f12 = C90484aE.A0f(16775388, A0J, R.string.f12nameremoved);
        Integer A0f13 = C90484aE.A0f(14423100, A0J, R.string.f12nameremoved);
        Integer A0f14 = C90484aE.A0f(139, A0J, R.string.f12nameremoved);
        C36331k8.A1Q(A0f8, A0J, 35723);
        C36331k8.A1Q(A0f2, A0J, 12092939);
        Integer A0f15 = C90484aE.A0f(11119017, A0J, R.string.f12nameremoved);
        C36341k9.A1K(25600, A0J, R.string.f12nameremoved);
        Integer A0f16 = C90484aE.A0f(12433259, A0J, R.string.f12nameremoved);
        Integer A0f17 = C90484aE.A0f(9109643, A0J, R.string.f12nameremoved);
        C36331k8.A1Q(A0f16, A0J, 5597999);
        C36331k8.A1Q(A0f11, A0J, 16747520);
        C36331k8.A1Q(A0f6, A0J, 10040012);
        C36331k8.A1Q(A0f7, A0J, 9109504);
        Integer A0f18 = C90484aE.A0f(16166665, A0J, R.string.f12nameremoved);
        Integer A0f19 = C90484aE.A0f(15308410, A0J, R.string.f12nameremoved);
        C36331k8.A1Q(A0f16, A0J, 9419919);
        C36331k8.A1Q(A0f17, A0J, 4734347);
        C36331k8.A1Q(A0f8, A0J, 3100495);
        C36331k8.A1Q(A0f3, A0J, 52945);
        C36331k8.A1Q(A0f6, A0J, 9699539);
        Integer A0f20 = C90484aE.A0f(16716947, A0J, R.string.f12nameremoved);
        C36331k8.A1Q(A0f5, A0J, 49151);
        Integer A0f21 = C90484aE.A0f(6908265, A0J, R.string.f12nameremoved);
        C36331k8.A1Q(A0f5, A0J, 2003199);
        C36331k8.A1Q(A0f7, A0J, 11674146);
        C36331k8.A1Q(A0f4, A0J, 16775920);
        Integer A0f22 = C90484aE.A0f(2263842, A0J, R.string.f12nameremoved);
        Integer A0f23 = C90484aE.A0f(16711935, A0J, R.string.f12nameremoved);
        Integer A0f24 = C90484aE.A0f(14474460, A0J, R.string.f12nameremoved);
        C36331k8.A1Q(A0f4, A0J, 16316671);
        A0J.put(16766720, A0f18);
        C36341k9.A1K(14329120, A0J, R.string.f12nameremoved);
        A0J.put(8421504, A0f21);
        C36331k8.A1Q(A0f22, A0J, 32768);
        C36331k8.A1Q(A0f9, A0J, 11403055);
        C36331k8.A1Q(A0f9, A0J, 15794160);
        C36331k8.A1Q(A0f20, A0J, 16738740);
        C36331k8.A1Q(A0f13, A0J, 13458524);
        C36341k9.A1K(12201298, A0J, R.string.f12nameremoved);
        C36331k8.A1Q(A0f17, A0J, 4915330);
        C36331k8.A1Q(A0f4, A0J, 16777200);
        C36331k8.A1Q(A0f12, A0J, 15787660);
        Integer A0f25 = C90484aE.A0f(15132410, A0J, R.string.f12nameremoved);
        C36341k9.A1K(16773365, A0J, R.string.f12nameremoved);
        C36331k8.A1Q(A0f9, A0J, 8190976);
        C36331k8.A1Q(A0f12, A0J, 16775885);
        C36331k8.A1Q(A0f, A0J, 11393254);
        Integer A0f26 = C90484aE.A0f(15761536, A0J, R.string.f12nameremoved);
        C36331k8.A1Q(A0f, A0J, 14745599);
        C36331k8.A1Q(A0f12, A0J, 16448210);
        C36331k8.A1Q(A0f24, A0J, 13882323);
        C36331k8.A1Q(A0f9, A0J, 9498256);
        C36331k8.A1Q(A0f20, A0J, 16758465);
        C36331k8.A1Q(A0f19, A0J, 16752762);
        C36331k8.A1Q(A0f8, A0J, 2142890);
        C36331k8.A1Q(A0f, A0J, 8900346);
        C36331k8.A1Q(A0f15, A0J, 7833753);
        C36331k8.A1Q(A0f24, A0J, 11584734);
        C36331k8.A1Q(A0f12, A0J, 16777184);
        C36331k8.A1Q(A0f22, A0J, 65280);
        C36331k8.A1Q(A0f22, A0J, 3329330);
        C36331k8.A1Q(A0f2, A0J, 16445670);
        C36331k8.A1Q(A0f7, A0J, 8388608);
        C36331k8.A1Q(A0f8, A0J, 6737322);
        C36331k8.A1Q(A0f5, A0J, 205);
        C36331k8.A1Q(A0f6, A0J, 12211667);
        C36331k8.A1Q(A0f6, A0J, 9662683);
        C36331k8.A1Q(A0f22, A0J, 3978097);
        C36331k8.A1Q(A0f6, A0J, 8087790);
        C36331k8.A1Q(A0f9, A0J, 64154);
        C36331k8.A1Q(A0f3, A0J, 4772300);
        C36331k8.A1Q(A0f23, A0J, 13047173);
        C36331k8.A1Q(A0f14, A0J, 1644912);
        C36331k8.A1Q(A0f9, A0J, 16121850);
        C36331k8.A1Q(A0f20, A0J, 16770273);
        C36331k8.A1Q(A0f2, A0J, 16770229);
        C36331k8.A1Q(A0f2, A0J, 16768685);
        C36331k8.A1Q(A0f14, A0J, 128);
        C36331k8.A1Q(A0f2, A0J, 16643558);
        C36331k8.A1Q(A0f16, A0J, 8421376);
        C36331k8.A1Q(A0f16, A0J, 7048739);
        C36331k8.A1Q(A0f11, A0J, 16753920);
        C36331k8.A1Q(A0f10, A0J, 15881513);
        C36331k8.A1Q(A0f13, A0J, 16729344);
        C36331k8.A1Q(A0f25, A0J, 14315734);
        C36331k8.A1Q(A0f2, A0J, 15657130);
        C36331k8.A1Q(A0f9, A0J, 10025880);
        C36331k8.A1Q(A0f, A0J, 11529966);
        C36331k8.A1Q(A0f20, A0J, 14381203);
        C36331k8.A1Q(A0f2, A0J, 16773077);
        C36331k8.A1Q(A0f2, A0J, 16767673);
        Integer A0f27 = C90484aE.A0f(13468991, A0J, R.string.f12nameremoved);
        C36331k8.A1Q(A0f20, A0J, 16761035);
        C36331k8.A1Q(A0f25, A0J, 14524637);
        C36331k8.A1Q(A0f, A0J, 11591910);
        C36331k8.A1Q(A0f6, A0J, 8388736);
        C36331k8.A1Q(A0f6, A0J, 6697881);
        C36331k8.A1Q(A0f13, A0J, 16711680);
        C36331k8.A1Q(A0f26, A0J, 12357519);
        C36331k8.A1Q(A0f5, A0J, 4286945);
        C36331k8.A1Q(A0f27, A0J, 9127187);
        C36331k8.A1Q(A0f13, A0J, 16416882);
        C36331k8.A1Q(A0f19, A0J, 16032864);
        C36331k8.A1Q(A0f22, A0J, 3050327);
        C36331k8.A1Q(A0f4, A0J, 16774638);
        C36331k8.A1Q(A0f27, A0J, 10506797);
        C36331k8.A1Q(A0f15, A0J, 12632256);
        C36331k8.A1Q(A0f, A0J, 8900331);
        C36331k8.A1Q(A0f6, A0J, 6970061);
        C36331k8.A1Q(A0f15, A0J, 7372944);
        C36331k8.A1Q(A0f4, A0J, 16775930);
        C36331k8.A1Q(A0f22, A0J, 65407);
        C36331k8.A1Q(A0f5, A0J, 4620980);
        C36331k8.A1Q(A0f2, A0J, 13808780);
        C36331k8.A1Q(A0f8, A0J, 32896);
        C36331k8.A1Q(A0f20, A0J, 14204888);
        C36331k8.A1Q(A0f13, A0J, 16737095);
        C36331k8.A1Q(A0f, A0J, 4251856);
        C36331k8.A1Q(A0f20, A0J, 15631086);
        C36331k8.A1Q(A0f2, A0J, 16113331);
        C36331k8.A1Q(A0f4, A0J, 16777215);
        C36331k8.A1Q(A0f24, A0J, 16119285);
        C36331k8.A1Q(A0f18, A0J, 16776960);
        C36331k8.A1Q(A0f9, A0J, 10145074);
        C36331k8.A1Q(A0f, A0J, 39398);
        C36341k9.A1K(33217, A0J, R.string.f12nameremoved);
        C36331k8.A1Q(A0f5, A0J, 1603570);
        C36331k8.A1Q(A0f9, A0J, 3252812);
        C36331k8.A1Q(A0f22, A0J, 2393404);
        C36331k8.A1Q(A0f8, A0J, 630409);
        C36331k8.A1Q(A0f6, A0J, 8474087);
        C36341k9.A1K(16537462, A0J, R.string.f12nameremoved);
        C36331k8.A1Q(A0f10, A0J, 15551028);
        C36331k8.A1Q(A0f11, A0J, 15427085);
        C36331k8.A1Q(A0f13, A0J, 15738953);
        C36331k8.A1Q(A0f20, A0J, 15548837);
        C36341k9.A1K(13725460, A0J, R.string.f12nameremoved);
        C36331k8.A1Q(A0f27, A0J, 11883520);
        A01 = (Integer[]) A0J.keySet().toArray(new Integer[A0J.size()]);
    }
}
