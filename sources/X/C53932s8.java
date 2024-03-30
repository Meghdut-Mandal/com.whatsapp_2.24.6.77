package X;

import com.whatsapp.R;

/* renamed from: X.2s8  reason: invalid class name and case insensitive filesystem */
public abstract class C53932s8 {
    public static int A00(C88854Uh r2) {
        boolean z = C222013h.A07;
        if (r2 instanceof C46862bn) {
            if (z) {
                return R.drawable.msg_status_image_filled_wds;
            }
            return R.drawable.msg_status_image;
        } else if (r2 instanceof C46822bj) {
            if (z) {
                return R.drawable.msg_status_doc_filled_wds;
            }
            return R.drawable.msg_status_doc;
        } else if (r2 instanceof AnonymousClass2cA) {
            if (z) {
                return R.drawable.msg_status_location_filled_wds;
            }
            return R.drawable.msg_status_location;
        } else if (r2 instanceof C180928me) {
            return R.drawable.msg_status_gif;
        } else {
            if (!(r2 instanceof C181768o0)) {
                return 0;
            }
            if (z) {
                return R.drawable.msg_status_video_filled_wds;
            }
            return R.drawable.msg_status_video;
        }
    }
}
