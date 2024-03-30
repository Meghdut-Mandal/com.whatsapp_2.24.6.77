package com.whatsapp.settings;

import X.AnonymousClass00T;
import X.AnonymousClass3TE;
import X.C36331k8;
import X.C36381kD;
import X.C36391kE;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog$Builder;
import com.whatsapp.R;
import com.whatsapp.SingleSelectionDialogFragment;

public final class MediaQualityConfirmationDialogFragment extends SingleSelectionDialogFragment {
    public final AnonymousClass00T A00 = AnonymousClass3TE.A02(this, "customSubTitleId", R.string.f12nameremoved);
    public final AnonymousClass00T A01 = AnonymousClass3TE.A02(this, "customTitleId", R.string.f12nameremoved);

    public AlertDialog$Builder A1k() {
        View A0K = C36381kD.A0K(LayoutInflater.from(A0h()), R.layout.f9nameremoved);
        TextView A0P = C36391kE.A0P(A0K, R.id.media_quality_title_view);
        if (A0P != null) {
            A0P.setText(C36331k8.A02(this.A01));
        }
        TextView A0P2 = C36391kE.A0P(A0K, R.id.media_quality_subtitle_view);
        if (A0P2 != null) {
            A0P2.setText(C36331k8.A02(this.A00));
        }
        AlertDialog$Builder A1k = super.A1k();
        A1k.A0Y(A0K);
        return A1k;
    }
}
