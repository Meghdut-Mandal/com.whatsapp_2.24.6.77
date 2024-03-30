package X;

import android.graphics.Bitmap;
import com.whatsapp.storage.StorageUsageMediaPreviewView;

/* renamed from: X.3mN  reason: invalid class name and case insensitive filesystem */
public class C74913mN implements AnonymousClass4TB {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C74833mF A01;
    public final /* synthetic */ StorageUsageMediaPreviewView A02;
    public final /* synthetic */ String A03;

    public C74913mN(C74833mF r1, StorageUsageMediaPreviewView storageUsageMediaPreviewView, String str, int i) {
        this.A02 = storageUsageMediaPreviewView;
        this.A01 = r1;
        this.A00 = i;
        this.A03 = str;
    }

    public Bitmap BOD() {
        Bitmap Bvb = this.A01.Bvb(this.A00);
        if (Bvb == null) {
            return StorageUsageMediaPreviewView.A0C;
        }
        return Bvb;
    }

    public String BIB() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A01.A01);
        return AnonymousClass000.A0q(this.A03, A0u);
    }
}
