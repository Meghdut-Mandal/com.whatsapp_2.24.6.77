package X;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

/* renamed from: X.61W  reason: invalid class name */
public class AnonymousClass61W {
    public C124585yS A00;
    public final C130776Mj A01 = new C130776Mj();

    public void A00(int i, float[] fArr) {
        C124585yS r3 = this.A00;
        float[] fArr2 = C132866Vo.A00;
        C130776Mj r0 = this.A01;
        FloatBuffer floatBuffer = r0.A01;
        FloatBuffer floatBuffer2 = r0.A00;
        C132866Vo.A02("draw start");
        GLES20.glUseProgram(r3.A00);
        C132866Vo.A02("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniformMatrix4fv(r3.A05, 1, false, fArr2, 0);
        C132866Vo.A02("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(r3.A06, 1, false, fArr, 0);
        C132866Vo.A02("glUniformMatrix4fv");
        int i2 = r3.A01;
        GLES20.glEnableVertexAttribArray(i2);
        C132866Vo.A02("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(i2, 2, 5126, false, 8, floatBuffer);
        C132866Vo.A02("glVertexAttribPointer");
        int i3 = r3.A02;
        GLES20.glEnableVertexAttribArray(i3);
        C132866Vo.A02("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(i3, 2, 5126, false, 8, floatBuffer2);
        C132866Vo.A02("glVertexAttribPointer");
        int i4 = r3.A04;
        if (i4 >= 0) {
            GLES20.glUniform1fv(i4, 9, r3.A08, 0);
            GLES20.glUniform2fv(r3.A07, 9, r3.A09, 0);
            GLES20.glUniform1f(r3.A03, 0.0f);
        }
        GLES20.glDrawArrays(5, 0, 4);
        C132866Vo.A02("glDrawArrays");
        GLES20.glDisableVertexAttribArray(i2);
        GLES20.glDisableVertexAttribArray(i3);
        GLES20.glBindTexture(36197, 0);
        GLES20.glUseProgram(0);
    }

    public AnonymousClass61W(C124585yS r2) {
        this.A00 = r2;
    }
}
