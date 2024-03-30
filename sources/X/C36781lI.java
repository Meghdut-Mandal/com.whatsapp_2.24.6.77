package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;

/* renamed from: X.1lI  reason: invalid class name and case insensitive filesystem */
public class C36781lI extends Drawable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ MessageDetailsActivity A02;

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C36781lI(Drawable drawable, ViewGroup viewGroup, MessageDetailsActivity messageDetailsActivity) {
        this.A02 = messageDetailsActivity;
        this.A00 = drawable;
        this.A01 = viewGroup;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.A00;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        ViewGroup viewGroup = this.A01;
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        int i = width * intrinsicHeight;
        int i2 = height * intrinsicWidth;
        if (i > i2) {
            height = i / intrinsicWidth;
        } else {
            width = i2 / intrinsicHeight;
        }
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
    }
}