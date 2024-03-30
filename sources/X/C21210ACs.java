package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.ACs  reason: case insensitive filesystem */
public final class C21210ACs implements B14 {
    public /* synthetic */ void Bd4(C1275768v r1, AnonymousClass8SU r2, AnonymousClass3T1 r3) {
    }

    public void Bd3(AnonymousClass6CO r5, AnonymousClass8NK r6, AnonymousClass3T1 r7) {
        C80113ur r0;
        C1887090k r02;
        boolean A1a = C36331k8.A1a(r7, r6);
        if (r7.A1T(ZipDecompressor.UNZIP_BUFFER_SIZE) && (r0 = r7.A0b) != null) {
            int A00 = C55052tz.A00(r0.hostStorage, r0.actualActors);
            if (A00 == A1a) {
                r02 = C1887090k.E2EE;
            } else if (A00 != 2) {
                r02 = C1887090k.FB;
            } else {
                r02 = C1887090k.BSP;
            }
            AnonymousClass8SU A0J = AnonymousClass8NN.A0J(r6);
            A0J.bizPrivacyStatus_ = r02.value;
            A0J.bitField0_ |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
            String str = r7.A0o;
            if (str != null) {
                AnonymousClass8SU A0I = AnonymousClass8NN.A0I(r6);
                A0I.bitField0_ |= 33554432;
                A0I.verifiedBizName_ = str;
            }
        }
    }
}
