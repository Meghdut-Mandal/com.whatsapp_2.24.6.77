package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer;

/* renamed from: X.9no  reason: invalid class name and case insensitive filesystem */
public class C203339no implements C160527l9 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C203339no(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public int BHb() {
        if (this.A02 != 0) {
            return C36341k9.A0F((View) this.A00).getDimensionPixelSize(R.dimen.f7nameremoved);
        }
        return AnonymousClass3R4.A01((Context) this.A00, 65);
    }

    public void BXv() {
        Runnable runnable;
        if (this.A02 == 0 && (runnable = ((PushToVideoInlineVideoPlayer) this.A01).getUiState().A06) != null) {
            runnable.run();
        }
    }

    public void Bte(Bitmap bitmap, View view, AnonymousClass3T1 r6) {
        if (this.A02 != 0) {
            ((C001600r) this.A01).A0C(bitmap);
        } else if (bitmap == null) {
            ((PushToVideoInlineVideoPlayer) this.A01).A08.setImageDrawable(new ColorDrawable(AnonymousClass00F.A00((Context) this.A00, R.color.f6nameremoved)));
        } else {
            bitmap.getWidth();
            bitmap.getHeight();
            ((PushToVideoInlineVideoPlayer) this.A01).A08.setImageBitmap(bitmap);
        }
    }

    public void Btu(View view) {
        if (this.A02 == 0) {
            ((PushToVideoInlineVideoPlayer) this.A01).A08.setImageDrawable(new ColorDrawable(-7829368));
        }
    }
}
