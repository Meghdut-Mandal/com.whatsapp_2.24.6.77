package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.storage.StorageUsageMediaPreviewView;

/* renamed from: X.1yo  reason: invalid class name and case insensitive filesystem */
public class C42431yo extends AnonymousClass0D3 {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final C18820ts A05;
    public final C21010yW A06;
    public final StorageUsageMediaPreviewView A07;
    public final StorageUsageMediaPreviewView A08;

    public C42431yo(View view, C18820ts r5, C21010yW r6) {
        super(view);
        this.A06 = r6;
        this.A05 = r5;
        View A022 = C012005e.A02(view, R.id.forwarded_files_container);
        this.A00 = A022;
        this.A02 = C36391kE.A0O(view, R.id.forwarded_files_size_text_view);
        this.A07 = (StorageUsageMediaPreviewView) C012005e.A02(view, R.id.forwarded_files_preview_view);
        View A023 = C012005e.A02(view, R.id.large_files_container);
        this.A01 = A023;
        this.A04 = C36391kE.A0O(view, R.id.large_files_title_text_view);
        this.A03 = C36391kE.A0O(view, R.id.large_files_size_text_view);
        this.A08 = (StorageUsageMediaPreviewView) C012005e.A02(view, R.id.large_files_preview_view);
        C33521fV.A02(A022);
        C33521fV.A02(A023);
    }
}
