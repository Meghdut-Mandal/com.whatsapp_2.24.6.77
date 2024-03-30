package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.MediaComposerActivity;

/* renamed from: X.5z8  reason: invalid class name and case insensitive filesystem */
public class C124985z8 {
    public float A00;
    public float A01;
    public Drawable A02;
    public Drawable A03;
    public Uri A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public ViewGroup A08;
    public ImageView A09;
    public TextView A0A;
    public boolean A0B;
    public final Handler A0C = C36341k9.A0H();
    public final Runnable A0D = new C1503074t((Object) this, 26);
    public final int[] A0E = C36441kJ.A1O();
    public final /* synthetic */ MediaComposerActivity A0F;

    public C124985z8(Activity activity, MediaComposerActivity mediaComposerActivity) {
        this.A0F = mediaComposerActivity;
        this.A03 = AnonymousClass00E.A00(activity, R.drawable.ic_remove_white);
        this.A02 = AnonymousClass00E.A00(activity, R.drawable.ic_remove_red);
        this.A08 = (ViewGroup) activity.findViewById(R.id.remove_frame);
        this.A0A = (TextView) activity.findViewById(R.id.drag_remove);
        this.A05 = activity.findViewById(R.id.drag_remove_padding);
        this.A07 = (ViewGroup) activity.findViewById(R.id.drag_frame);
        C93194g6 r1 = new C93194g6(activity, this);
        this.A09 = r1;
        r1.setSelected(true);
        this.A09.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.A07.addView(this.A09);
    }
}
