package X;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.util.HashSet;

/* renamed from: X.1R1  reason: invalid class name */
public abstract class AnonymousClass1R1 {
    public static void A03(Context context) {
        Activity A00 = C18860tw.A00(context);
        if (A00 != null && !A00.isFinishing()) {
            int requestedOrientation = A00.getRequestedOrientation();
            HashSet hashSet = new HashSet();
            int i = 1;
            hashSet.add(1);
            hashSet.add(9);
            hashSet.add(7);
            hashSet.add(12);
            boolean A05 = A05(context, 600, 600);
            if (A05 == hashSet.contains(Integer.valueOf(requestedOrientation))) {
                if (A05) {
                    i = 2;
                }
                A00.setRequestedOrientation(i);
            }
        }
    }

    public static float A00(Context context) {
        Activity A00 = C18860tw.A00(context);
        if (A00 == null || A00.isFinishing()) {
            return 0.0f;
        }
        AnonymousClass1R3 r1 = AnonymousClass1R3.A00;
        AnonymousClass00C.A0D(r1, 0);
        return (float) r1.B3H(A00).A00().height();
    }

    public static float A01(Context context) {
        Activity A00 = C18860tw.A00(context);
        if (A00 == null || A00.isFinishing()) {
            return 0.0f;
        }
        AnonymousClass1R3 r1 = AnonymousClass1R3.A00;
        AnonymousClass00C.A0D(r1, 0);
        return (float) r1.B3H(A00).A00().width();
    }

    public static int A02(Context context, float f) {
        Activity A00 = C18860tw.A00(context);
        if (A00 == null || A00.isFinishing()) {
            A00 = null;
        }
        int i = 0;
        if (A00 == null || Float.compare(f, 0.0f) == 0) {
            return 0;
        }
        float f2 = f / context.getResources().getDisplayMetrics().density;
        int[] iArr = {0, 360, 480, 600, VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT, 840, 960, VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH, 1440, 1920, 1600, 2240};
        do {
            int i2 = iArr[i];
            if (Float.compare(f2, (float) i2) < 0) {
                return i2;
            }
            i++;
        } while (i < 12);
        return 2240;
    }

    public static void A04(ViewGroup viewGroup, AnonymousClass026 r3) {
        viewGroup.addView(new AnonymousClass1R7(viewGroup.getContext(), viewGroup, r3));
    }

    public static boolean A05(Context context, int i, int i2) {
        int i3;
        int i4;
        Activity A00 = C18860tw.A00(context);
        if (A00 == null || A00.isFinishing()) {
            i3 = 0;
        } else {
            i3 = A02(context, A01(A00));
        }
        Activity A002 = C18860tw.A00(context);
        if (A002 == null || A002.isFinishing()) {
            i4 = 0;
        } else {
            i4 = A02(context, A00(A002));
        }
        if (i3 < i || i4 < i2) {
            return false;
        }
        return true;
    }
}
