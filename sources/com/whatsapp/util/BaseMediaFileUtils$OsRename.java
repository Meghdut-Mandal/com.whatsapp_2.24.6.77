package com.whatsapp.util;

import X.AnonymousClass000;
import X.C36381kD;
import android.system.ErrnoException;
import android.system.Os;
import java.io.File;

public class BaseMediaFileUtils$OsRename {
    public static int attempt(File file, File file2) {
        try {
            Os.rename(file.getAbsolutePath(), file2.getAbsolutePath());
            return -1;
        } catch (ErrnoException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("MMS Os.rename also failed, errno=");
            Log.e(C36381kD.A10(A0u, e.errno), e);
            return e.errno;
        }
    }
}
