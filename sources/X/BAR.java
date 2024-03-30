package X;

import android.view.View;
import com.whatsapp.TextEmojiLabel;

public class BAR implements AnonymousClass004 {
    public int A00;
    public Object A01;
    public final int A02;

    public BAR(TextEmojiLabel textEmojiLabel, int i) {
        this.A02 = 1;
        this.A00 = i;
        this.A01 = textEmojiLabel;
    }

    public final Object get() {
        if (2 - this.A02 != 0) {
            return Float.valueOf(((float) this.A00) - ((float) ((View) this.A01).getTop()));
        }
        return Float.valueOf(((float) ((View) this.A01).getHeight()) - (((float) this.A00) * 2.0f));
    }

    public BAR(View view, int i, int i2) {
        this.A02 = i2;
        if (i2 != 0) {
            this.A01 = view;
            this.A00 = i;
            return;
        }
        this.A00 = i;
        this.A01 = view;
    }
}
