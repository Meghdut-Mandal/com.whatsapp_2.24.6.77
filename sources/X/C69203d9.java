package X;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.whatsapp.R;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.view.custom.BusinessChatInfoLayout;

/* renamed from: X.3d9  reason: invalid class name and case insensitive filesystem */
public final class C69203d9 implements C160397kw {
    public /* bridge */ /* synthetic */ void Ba5(Bitmap bitmap, C160797lb r9, boolean z) {
        C69273dG r6 = ((C69213dA) r9).A00.A00;
        ContactInfoActivity contactInfoActivity = r6.A0k;
        if (bitmap != null) {
            AnonymousClass2E6 r2 = (AnonymousClass2E6) contactInfoActivity.findViewById(R.id.content);
            if (r2 instanceof BusinessChatInfoLayout) {
                C36401kF.A0G(r2, R.id.picture).setImageBitmap(bitmap);
                r2.A0D();
                C90104Zc.A00(r2.A0I.getViewTreeObserver(), r2, 6);
            }
            AnonymousClass9UJ r5 = new AnonymousClass9UJ(bitmap);
            new C37021lg(r5, new C68203bV(contactInfoActivity)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{r5.A01});
        }
        r6.A0L = null;
    }

    public /* bridge */ /* synthetic */ void BRN(C160797lb r1) {
    }

    public /* bridge */ /* synthetic */ void BZu(C160797lb r1) {
    }

    public /* bridge */ /* synthetic */ void Ba1(C160797lb r1) {
    }
}
