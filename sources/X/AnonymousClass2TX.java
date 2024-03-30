package X;

import android.database.ContentObserver;
import android.database.Cursor;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.gallery.DocumentsGalleryFragment;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.2TX  reason: invalid class name */
public class AnonymousClass2TX extends C40981wQ implements C160717lT {
    public int A00;
    public final ContentObserver A01 = new AnonymousClass4VO(C36341k9.A0H(), this, 1);
    public final /* synthetic */ DocumentsGalleryFragment A02;

    public AnonymousClass2TX(DocumentsGalleryFragment documentsGalleryFragment) {
        this.A02 = documentsGalleryFragment;
    }

    public Cursor A0L(Cursor cursor) {
        int i;
        Cursor cursor2 = this.A00;
        if (cursor2 != null) {
            cursor2.unregisterContentObserver(this.A01);
        }
        if (cursor != null) {
            cursor.registerContentObserver(this.A01);
            i = cursor.getCount();
        } else {
            i = 0;
        }
        this.A00 = i;
        return super.A0L(cursor);
    }

    public int BAF(int i) {
        return ((C1512778x) this.A02.A0L.get(i)).bucketCount;
    }

    public int BCL() {
        return this.A02.A0L.size();
    }

    public long BCM(int i) {
        return -((Calendar) this.A02.A0L.get(i)).getTimeInMillis();
    }

    public /* bridge */ /* synthetic */ void BSC(AnonymousClass0D3 r3, int i) {
        List list = AnonymousClass0D3.A0I;
        ((C41821xp) r3).A00.setText(this.A02.A0L.get(i).toString());
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r2, int i) {
        Cursor cursor = this.A00;
        if (cursor != null && i < cursor.getCount()) {
            super.BSE(r2, i);
        }
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUs(ViewGroup viewGroup) {
        DocumentsGalleryFragment documentsGalleryFragment = this.A02;
        View inflate = C36381kD.A0J(documentsGalleryFragment).inflate(R.layout.f9nameremoved, viewGroup, false);
        inflate.setClickable(false);
        C36341k9.A0q(documentsGalleryFragment.A0a(), inflate, C224514j.A00(documentsGalleryFragment.A1D(), R.attr.f4nameremoved, R.color.f6nameremoved));
        return new C41821xp(inflate);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        List list = AnonymousClass0D3.A0I;
        DocumentsGalleryFragment documentsGalleryFragment = this.A02;
        return new C42471ys(C36361kB.A0E(C36381kD.A0J(documentsGalleryFragment), viewGroup, R.layout.f9nameremoved), documentsGalleryFragment);
    }

    public int A0J() {
        return this.A00;
    }

    public /* bridge */ /* synthetic */ boolean Bhn(MotionEvent motionEvent, AnonymousClass0D3 r3, int i) {
        return false;
    }
}
