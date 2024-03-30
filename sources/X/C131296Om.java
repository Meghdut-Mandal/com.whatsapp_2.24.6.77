package X;

import android.content.res.Resources;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

/* renamed from: X.6Om  reason: invalid class name and case insensitive filesystem */
public class C131296Om {
    public final Resources A00;

    public static String A01(C131296Om r3, int i) {
        InputStreamReader inputStreamReader = new InputStreamReader(r3.A00.openRawResource(i));
        try {
            StringBuilder A0u = AnonymousClass000.A0u();
            CharBuffer allocate = CharBuffer.allocate(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
            while (inputStreamReader.read(allocate) != -1) {
                allocate.flip();
                A0u.append(allocate);
                allocate.clear();
            }
            String obj = A0u.toString();
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
            return obj;
        } catch (IOException e) {
            throw AnonymousClass001.A0B(e);
        } catch (Throwable th) {
            try {
                inputStreamReader.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public AnonymousClass6TK A03(String str, String str2, boolean z) {
        String obj;
        if (!z) {
            String[] split = str2.split("\n");
            String str3 = split[0];
            if (str3.equals("#extension GL_OES_EGL_image_external : require")) {
                obj = str2.substring(str3.length() + 1);
            } else if (!str3.equals("#version 300 es")) {
                throw AnonymousClass001.A09("Fragment shader's first line must be:\n#extension GL_OES_EGL_image_external : require");
            } else if (split[2].equals("#extension GL_OES_EGL_image_external : require")) {
                StringBuilder A0i = C90524aI.A0i("");
                for (int i = 0; i < split.length; i++) {
                    if (i != 2) {
                        A0i.append(split[i]);
                        A0i.append(10);
                    }
                }
                obj = A0i.toString();
            } else {
                throw AnonymousClass001.A09("Fragment shader's fourth line must be:\n#extension GL_OES_EGL_image_external : require");
            }
            str2 = obj.replaceFirst("samplerExternalOES", "sampler2D").replaceFirst("__samplerExternal2DY2YEXT", "sampler2D");
        }
        return new AnonymousClass6TK(str, str2);
    }

    public C131296Om(Resources resources) {
        this.A00 = resources;
    }

    public static AnonymousClass6TK A00(C131296Om r1, int i, int i2) {
        return new AnonymousClass6TK(A01(r1, i), A01(r1, i2));
    }

    public AnonymousClass6TK A02(int i, int i2, boolean z) {
        return A03(A01(this, i), A01(this, i2), z);
    }
}
