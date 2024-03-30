package X;

import android.opengl.GLES20;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.6Ng  reason: invalid class name and case insensitive filesystem */
public class C130986Ng {
    public final /* synthetic */ AnonymousClass6TK A00;

    public C130986Ng(AnonymousClass6TK r1) {
        this.A00 = r1;
    }

    public static int A00(C130986Ng r2, String str) {
        AnonymousClass6TK r1 = r2.A00;
        Map map = r1.A04;
        if (map.containsKey(str)) {
            return C90474aD.A06(str, map);
        }
        int glGetUniformLocation = GLES20.glGetUniformLocation(r1.A00, str);
        if (glGetUniformLocation != -1) {
            C36421kH.A1M(str, map, glGetUniformLocation);
            return glGetUniformLocation;
        }
        throw AnonymousClass001.A09(String.format((Locale) null, "Uniform location not found: %s", AnonymousClass000.A1b(str)));
    }

    public void A01(AnonymousClass67V r9, String str) {
        int size;
        Map map = this.A00.A03;
        if (map.containsKey(str)) {
            size = C90474aD.A06(str, map);
        } else {
            size = map.size();
            C36421kH.A1M(str, map, size);
        }
        int i = r9.A01;
        int i2 = r9.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("gl.Program::setTexture::before: textureUnit: ");
        A0u.append(size);
        A0u.append(" textureTarget: ");
        A0u.append(i);
        C200339hB.A02(AnonymousClass000.A0r(" textureHandle: ", A0u, i2), new Object[0]);
        int A002 = A00(this, str);
        GLES20.glActiveTexture(33984 + size);
        GLES20.glBindTexture(i, i2);
        GLES20.glUniform1i(A002, size);
        StringBuilder A0u2 = AnonymousClass000.A0u();
        C90464aC.A1K("gl.Program::setTexture::after: textureUnit: ", " textureTarget: ", A0u2, size, i);
        C200339hB.A02(AnonymousClass000.A0r(" textureHandle: ", A0u2, i2), new Object[0]);
    }

    public void A02(String str, float[] fArr) {
        GLES20.glUniformMatrix4fv(A00(this, str), 1, false, fArr, 0);
    }
}
