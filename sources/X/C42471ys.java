package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.gallery.DocumentsGalleryFragment;

/* renamed from: X.1ys  reason: invalid class name and case insensitive filesystem */
public class C42471ys extends AnonymousClass0D3 {
    public C46972by A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final ImageView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final /* synthetic */ DocumentsGalleryFragment A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42471ys(View view, DocumentsGalleryFragment documentsGalleryFragment) {
        super(view);
        this.A0B = documentsGalleryFragment;
        this.A05 = C36391kE.A0N(view, R.id.icon);
        this.A09 = C36351kA.A0E(view);
        this.A06 = C36391kE.A0P(view, R.id.date);
        this.A08 = C36391kE.A0P(view, R.id.size);
        this.A03 = view.findViewById(R.id.bullet_size);
        this.A07 = C36391kE.A0P(view, R.id.info);
        this.A01 = view.findViewById(R.id.bullet_info);
        this.A0A = C36391kE.A0P(view, R.id.type);
        this.A04 = view.findViewById(R.id.starred_status);
        this.A02 = view.findViewById(R.id.kept_status);
        AnonymousClass3Y2.A00(view, this, 9);
        C89564Xa.A00(view, this, 8);
    }
}
