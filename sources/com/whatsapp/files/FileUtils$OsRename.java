package com.whatsapp.files;

import X.AnonymousClass000;
import X.C36381kD;
import X.C90464aC;
import android.system.ErrnoException;
import android.system.Os;
import com.whatsapp.util.Log;
import java.io.File;

public class FileUtils$OsRename {
    public static int attempt(File file, File file2) {
        try {
            Os.rename(file.getAbsolutePath(), file2.getAbsolutePath());
            return -1;
        } catch (ErrnoException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            C90464aC.A1A(file, "MMS Os.rename also failed, from=", A0u);
            C90464aC.A1A(file2, " to=", A0u);
            A0u.append(" errno=");
            Log.e(C36381kD.A10(A0u, e.errno), e);
            return e.errno;
        }
    }
}
