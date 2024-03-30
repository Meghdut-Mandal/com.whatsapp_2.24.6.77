package X;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Ru  reason: invalid class name and case insensitive filesystem */
public final class C132016Ru {
    public static final List A01;
    public static final List A02 = C36371kC.A11("Avatars2");
    public final AnonymousClass005 A00;

    public C132016Ru(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    static {
        String[] strArr = new String[4];
        strArr[0] = "wa_effect_asset_disk_cache";
        strArr[1] = "wa_face_tracking_asset_disk_cache";
        strArr[2] = "wa_multi_model_asset_disk_cache";
        A01 = C36341k9.A0m("wa_scripting_asset_disk_cache", strArr, 3);
    }

    public static final void A00(C132016Ru r3, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File A0w = C36441kJ.A0w(C90524aI.A0R((C19630wG) r3.A00.get()), AnonymousClass001.A0C(it));
            if (A0w.isDirectory()) {
                C14360lV.A00(A0w);
            }
        }
    }
}
