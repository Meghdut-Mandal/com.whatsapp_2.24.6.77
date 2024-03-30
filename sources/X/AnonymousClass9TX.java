package X;

import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9TX  reason: invalid class name */
public abstract class AnonymousClass9TX {
    public final int A00;

    public void A00(C99524tX r6, long j) {
        String str;
        if (this instanceof C175408aR) {
            C175408aR r4 = (C175408aR) this;
            AnonymousClass00C.A0D(r6, 0);
            try {
                String str2 = r4.A03;
                if (str2.length() > 0) {
                    AnonymousClass8SG A04 = AnonymousClass8NN.A04(r6);
                    int i = AnonymousClass8SG.ACTION_LINK_FIELD_NUMBER;
                    A04.bitField0_ |= 32768;
                    A04.entryPointConversionSource_ = str2;
                }
                String str3 = r4.A02;
                if (!(str3 == null || str3.length() == 0)) {
                    AnonymousClass8SG A042 = AnonymousClass8NN.A04(r6);
                    int i2 = AnonymousClass8SG.ACTION_LINK_FIELD_NUMBER;
                    A042.bitField0_ |= 65536;
                    A042.entryPointConversionApp_ = str3;
                }
                int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(j - r4.A00);
                AnonymousClass8SG A043 = AnonymousClass8NN.A04(r6);
                int i3 = AnonymousClass8SG.ACTION_LINK_FIELD_NUMBER;
                A043.bitField0_ |= C132986Wc.A0F;
                A043.entryPointConversionDelaySeconds_ = seconds;
            } catch (Exception e) {
                e = e;
                str = "OrganicEntryPoint/fillMessageE2EContextInfo/failed to fill E2E context info/exception=";
                Log.e(str, e);
            }
        } else {
            C175418aS r42 = (C175418aS) this;
            AnonymousClass00C.A0D(r6, 0);
            try {
                String str4 = r42.A02;
                String str5 = C19430v1.A0B;
                C22898AyA ayA = C21674AUx.A01;
                AnonymousClass8I5 r2 = new AnonymousClass8I5(str4.getBytes(str5));
                AnonymousClass8SG A044 = AnonymousClass8NN.A04(r6);
                int i4 = AnonymousClass8SG.ACTION_LINK_FIELD_NUMBER;
                A044.bitField0_ |= 32;
                A044.conversionData_ = r2;
                String str6 = r42.A03;
                AnonymousClass8SG A045 = AnonymousClass8NN.A04(r6);
                A045.bitField0_ |= 16;
                A045.conversionSource_ = str6;
                int seconds2 = (int) TimeUnit.MILLISECONDS.toSeconds(j - r42.A01);
                AnonymousClass8SG A046 = AnonymousClass8NN.A04(r6);
                A046.bitField0_ |= 64;
                A046.conversionDelaySeconds_ = seconds2;
                String str7 = r42.A04;
                if (str7.length() > 0) {
                    AnonymousClass8SG A047 = AnonymousClass8NN.A04(r6);
                    A047.bitField0_ |= 4194304;
                    A047.trustBannerType_ = str7;
                }
                int i5 = r42.A00;
                AnonymousClass8SG A048 = AnonymousClass8NN.A04(r6);
                A048.bitField0_ |= 8388608;
                A048.trustBannerAction_ = i5;
            } catch (Exception e2) {
                e = e2;
                str = "CtwaAdsEntryPoint/fillMessageE2EContextInfo/failed to fill E2E context info/exception=";
                Log.e(str, e);
            }
        }
    }

    public AnonymousClass9TX(int i) {
        this.A00 = i;
    }

    public boolean A01() {
        return true;
    }
}
