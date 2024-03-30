package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.audiopicker.AudioPickerActivity;

/* renamed from: X.3mO  reason: invalid class name and case insensitive filesystem */
public class C74923mO implements AnonymousClass4U2 {
    public final /* synthetic */ C65803Tn A00;

    public /* synthetic */ void BXH() {
    }

    public C74923mO(C65803Tn r1) {
        this.A00 = r1;
    }

    public void B1h() {
        C65803Tn r0 = this.A00;
        ImageView imageView = r0.A05;
        imageView.setImageBitmap((Bitmap) null);
        r0.A03.setBackground((Drawable) null);
        imageView.setBackgroundResource(0);
    }

    public void Bi2(Bitmap bitmap, boolean z) {
        Resources resources;
        int i;
        C65803Tn r1 = this.A00;
        ImageView imageView = r1.A05;
        imageView.setImageBitmap(bitmap);
        Bitmap bitmap2 = C132416Tn.A07;
        FrameLayout frameLayout = r1.A03;
        if (bitmap == bitmap2) {
            frameLayout.setBackground((Drawable) null);
            resources = r1.A0C.getResources();
            i = R.drawable.audio_picker_empty_thumb_background;
        } else {
            AudioPickerActivity audioPickerActivity = r1.A0C;
            frameLayout.setBackground(audioPickerActivity.getResources().getDrawable(R.drawable.audio_picker_thumb_frame_background));
            resources = audioPickerActivity.getResources();
            i = R.drawable.audio_picker_filled_thumb_background;
        }
        imageView.setBackground(resources.getDrawable(i));
    }
}
