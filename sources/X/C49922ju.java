package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import com.whatsapp.group.GroupProfileEmojiEditor;
import com.whatsapp.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.2ju  reason: invalid class name and case insensitive filesystem */
public class C49922ju extends C132446Tt {
    public int A00;
    public Bitmap A01;
    public Bitmap A02;
    public Uri A03;
    public C21050ya A04;
    public final C125405zr A05;

    public C49922ju(AnonymousClass01I r2, C125405zr r3) {
        super(r2, true);
        this.A05 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i;
        Bitmap bitmap = this.A02;
        if (bitmap == null) {
            return -3;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(this.A00);
        canvas.drawBitmap(this.A01, 0.0f, 0.0f, C36441kJ.A0K());
        OutputStream outputStream = null;
        int i2 = -1;
        try {
            C21050ya r1 = this.A04;
            if (r1 == null) {
                Log.w("GroupProfileEmojiEditor/render/bg contentResolver=null");
            } else {
                outputStream = r1.A07(this.A03);
            }
            if (outputStream == null) {
                i = -1;
                AnonymousClass14X.A02(outputStream);
                return i;
            }
            this.A02.compress(Bitmap.CompressFormat.JPEG, 85, outputStream);
            outputStream.flush();
            AnonymousClass14X.A02(outputStream);
            if (!C36431kI.A1Y(this)) {
                i2 = 0;
            }
            return Integer.valueOf(i2);
        } catch (IOException e) {
            if (C36431kI.A1Y(this) || e.getMessage() == null || !e.getMessage().contains("No space")) {
                i = -1;
            } else {
                i = -2;
            }
        } catch (Exception e2) {
            if (!C36431kI.A1Y(this)) {
                Log.e("GroupProfileEmojiEditor/render/bg/error", e2);
            }
            i = -1;
        } catch (Throwable th) {
            AnonymousClass14X.A02((Closeable) null);
            throw th;
        }
    }

    public void A0A() {
        AnonymousClass012 A07 = A07(GroupProfileEmojiEditor.class);
        C89854Yd r0 = new C89854Yd(this, 9);
        if (A07 != null) {
            r0.accept(A07);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass012 A07 = A07(GroupProfileEmojiEditor.class);
        C89844Yc r0 = new C89844Yc(this, obj, 1);
        if (A07 != null) {
            r0.accept(A07);
        }
    }
}
