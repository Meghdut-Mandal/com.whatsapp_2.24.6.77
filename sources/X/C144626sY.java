package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.6sY  reason: invalid class name and case insensitive filesystem */
public class C144626sY implements C30631aW {
    public final C19630wG A00;

    public /* synthetic */ void BV3() {
    }

    public void BV2() {
        Context context = this.A00.A00;
        File filesDir = context.getFilesDir();
        String[] list = filesDir.list(AnonymousClass727.A00);
        if (list != null) {
            for (String str : list) {
                String[] split = str.substring(0, str.lastIndexOf(".pack")).split("_");
                int length = split.length;
                if (length > 1) {
                    try {
                        if (Long.parseLong(split[length - 1]) != C36391kE.A0B(C90524aI.A0S(context.getPackageCodePath()).lastModified())) {
                            C36321k7.A1Q("translations/cleanupOldPackFiles Clearing old pack file: ", str, AnonymousClass000.A0u());
                            if (!C36441kJ.A0w(filesDir, str).delete()) {
                                C36321k7.A1P("translations/cleanupOldPackFiles Could not delete old pack file: ", str, AnonymousClass000.A0u());
                            }
                        }
                    } catch (NumberFormatException unused) {
                        C36321k7.A1R("translations/cleanupOldPackFiles Pack file name did not contain version info: ", str, AnonymousClass000.A0u());
                    }
                }
            }
        }
    }

    public C144626sY(C19630wG r1) {
        this.A00 = r1;
    }
}
