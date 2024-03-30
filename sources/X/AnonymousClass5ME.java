package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.documentpicker.DocumentPreviewActivity;
import com.whatsapp.mediaview.PhotoView;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.5ME  reason: invalid class name */
public final class AnonymousClass5ME extends C132446Tt {
    public final C25561Gu A00;
    public final File A01;
    public final String A02;
    public final WeakReference A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5ME(AnonymousClass012 r2, C157337cn r3, C25561Gu r4, File file, String str) {
        super(r2, true);
        AnonymousClass00C.A0D(r4, 5);
        this.A01 = file;
        this.A02 = str;
        this.A00 = r4;
        this.A03 = AnonymousClass001.A0F(r3);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C157337cn r4 = (C157337cn) this.A03.get();
        if (r4 != null) {
            File file = this.A01;
            String str = this.A02;
            DocumentPreviewActivity documentPreviewActivity = (DocumentPreviewActivity) r4;
            documentPreviewActivity.A00.setVisibility(8);
            documentPreviewActivity.A02.setVisibility(8);
            if (bitmap == null) {
                DocumentPreviewActivity.A0F(documentPreviewActivity, file, str);
                return;
            }
            documentPreviewActivity.getLayoutInflater().inflate(R.layout.f9nameremoved, documentPreviewActivity.A01, true);
            PhotoView photoView = (PhotoView) C012005e.A02(documentPreviewActivity.A01, R.id.document_preview);
            photoView.A08(bitmap);
            int dimensionPixelOffset = photoView.getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
            ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(photoView);
            A0a.bottomMargin = dimensionPixelOffset;
            photoView.setLayoutParams(A0a);
        }
    }
}
