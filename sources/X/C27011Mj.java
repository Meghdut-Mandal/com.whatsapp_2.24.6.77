package X;

import android.app.Activity;
import android.app.Application;
import com.whatsapp.bubble.di.BubbleModule;
import com.whatsapp.calling.di.ActivityModule;
import com.whatsapp.gallery.di.GalleryModule;
import com.whatsapp.gallery.di.GalleryPickerFragmentModule;
import com.whatsapp.stickers.di.StickersDependencyBridgeModule;
import java.util.Objects;

/* renamed from: X.1Mj  reason: invalid class name and case insensitive filesystem */
public class C27011Mj implements C18700tb {
    public final Activity A00;
    public final C18700tb A01;
    public final Object A02 = new Object();
    public volatile Object A03;

    public Object generatedComponent() {
        String obj;
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    Activity activity = this.A00;
                    if (!(activity.getApplication() instanceof C18700tb)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
                        if (Application.class.equals(activity.getApplication().getClass())) {
                            obj = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Found: ");
                            sb2.append(activity.getApplication().getClass());
                            obj = sb2.toString();
                        }
                        sb.append(obj);
                        throw new IllegalStateException(sb.toString());
                    }
                    C27071Mp r0 = (C27071Mp) ((C27031Ml) C19570wA.A00(C27031Ml.class, this.A01));
                    C27091Mr r02 = new C27091Mr(r0.A04, r0.A05);
                    Objects.requireNonNull(activity);
                    r02.A00 = activity;
                    C18800tq r7 = r02.A02;
                    this.A03 = new C27111My(activity, r02.A01, r7, new BubbleModule(), new ActivityModule(), new GalleryModule(), new GalleryPickerFragmentModule(), new StickersDependencyBridgeModule());
                }
            }
        }
        return this.A03;
    }

    public C27011Mj(Activity activity) {
        this.A00 = activity;
        this.A01 = new C27021Mk((AnonymousClass01G) activity);
    }
}
