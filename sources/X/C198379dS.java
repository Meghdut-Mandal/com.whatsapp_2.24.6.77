package X;

import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.9dS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C198379dS {
    public static final /* synthetic */ C198379dS A00 = new C198379dS();

    public final int A00(Object obj) {
        String str = ((C202149l7) obj).A02;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        if (Util.A00 >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
            return 0;
        }
        return -1;
    }
}
