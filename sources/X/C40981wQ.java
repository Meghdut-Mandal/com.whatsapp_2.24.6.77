package X;

import android.database.Cursor;
import android.database.DataSetObserver;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.gallery.DocumentsGalleryFragment;
import com.whatsapp.gallery.LinksGalleryFragment;
import java.io.File;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1wQ  reason: invalid class name and case insensitive filesystem */
public abstract class C40981wQ extends AnonymousClass0CZ {
    public Cursor A00 = null;
    public boolean A01 = false;
    public int A02;
    public final DataSetObserver A03;

    public C40981wQ() {
        int i;
        C36731lD r2 = new C36731lD(this);
        this.A03 = r2;
        Cursor cursor = this.A00;
        if (cursor != null) {
            i = cursor.getColumnIndex("_id");
        } else {
            i = -1;
        }
        this.A02 = i;
        A0B(true);
        Cursor cursor2 = this.A00;
        if (cursor2 != null) {
            cursor2.registerDataSetObserver(r2);
        }
    }

    public void A0B(boolean z) {
        super.A0B(true);
    }

    public void BSE(AnonymousClass0D3 r3, int i) {
        AnonymousClass00C.A0D(r3, 0);
        if (this.A01) {
            Cursor cursor = this.A00;
            if (cursor == null || !cursor.moveToPosition(i)) {
                throw AnonymousClass001.A09(AnonymousClass000.A0r("couldn't move cursor to position ", AnonymousClass000.A0u(), i));
            }
            A0M(this.A00, r3);
            return;
        }
        throw AnonymousClass001.A09("this should only be called when the cursor is valid");
    }

    public long A0E(int i) {
        Cursor cursor;
        Cursor cursor2 = this.A00;
        boolean z = true;
        if (cursor2 == null || !cursor2.moveToPosition(i)) {
            z = false;
        }
        if (!z || (cursor = this.A00) == null) {
            return 0;
        }
        return cursor.getLong(this.A02);
    }

    public int A0J() {
        Cursor cursor = this.A00;
        if (cursor != null) {
            return cursor.getCount();
        }
        return 0;
    }

    public Cursor A0L(Cursor cursor) {
        Cursor cursor2 = this.A00;
        if (cursor == cursor2) {
            return null;
        }
        DataSetObserver dataSetObserver = this.A03;
        if (!(dataSetObserver == null || cursor2 == null)) {
            cursor2.unregisterDataSetObserver(dataSetObserver);
        }
        this.A00 = cursor;
        int i = 0;
        boolean A1V = AnonymousClass000.A1V(cursor);
        this.A01 = A1V;
        if (A1V) {
            if (!(dataSetObserver == null || cursor == null)) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
            Cursor cursor3 = this.A00;
            if (cursor3 != null) {
                i = cursor3.getColumnIndexOrThrow("_id");
            }
        } else {
            i = -1;
        }
        this.A02 = i;
        A06();
        return cursor2;
    }

    public void A0M(Cursor cursor, AnonymousClass0D3 r11) {
        CharSequence A032;
        String str;
        if (this instanceof AnonymousClass2TW) {
            int A033 = C36351kA.A03(cursor, "link_index");
            LinksGalleryFragment linksGalleryFragment = ((AnonymousClass2TW) this).A00;
            ((C42601z5) r11).A0B(linksGalleryFragment.A0F.A01(cursor, linksGalleryFragment.A0D), A033);
            return;
        }
        C42471ys r112 = (C42471ys) r11;
        AnonymousClass2bU A022 = ((C36691l9) cursor).A02();
        C18740tg.A06(A022);
        C46972by r5 = (C46972by) A022;
        List list = AnonymousClass0D3.A0I;
        r112.A00 = r5;
        ImageView imageView = r112.A05;
        DocumentsGalleryFragment documentsGalleryFragment = r112.A0B;
        imageView.setImageDrawable(AnonymousClass3MS.A00(documentsGalleryFragment.A1D(), r5));
        boolean A023 = AnonymousClass2bU.A02(r5);
        TextView textView = r112.A09;
        if (!A023) {
            A032 = C65783Tl.A03(documentsGalleryFragment.A1D(), documentsGalleryFragment.A05, r5.A1a(), C36381kD.A0Y(documentsGalleryFragment).getSearchTerms());
        } else if (!TextUtils.isEmpty(r5.A1b())) {
            A032 = AnonymousClass6YY.A08(r5.A1b());
        } else {
            A032 = documentsGalleryFragment.A0n(R.string.f12nameremoved);
        }
        textView.setText(A032);
        File A012 = AnonymousClass2bU.A01(r5);
        TextView textView2 = r112.A08;
        if (A012 != null) {
            textView2.setText(AnonymousClass3TF.A02(documentsGalleryFragment.A05, A012.length()));
            textView2.setVisibility(0);
            r112.A03.setVisibility(0);
        } else {
            textView2.setVisibility(8);
            r112.A03.setVisibility(8);
        }
        if (r5.A00 != 0) {
            TextView textView3 = r112.A07;
            textView3.setVisibility(0);
            r112.A01.setVisibility(0);
            textView3.setText(C25561Gu.A01(documentsGalleryFragment.A05, r5));
        } else {
            r112.A07.setVisibility(8);
            r112.A01.setVisibility(8);
        }
        String upperCase = AnonymousClass1Ax.A02(r5.A05).toUpperCase(Locale.US);
        if (TextUtils.isEmpty(upperCase) && !TextUtils.isEmpty(r5.A1b())) {
            String A1b = r5.A1b();
            C18740tg.A06(A1b);
            upperCase = AnonymousClass6YY.A07(A1b).toUpperCase(Locale.US);
        }
        r112.A0A.setText(upperCase);
        TextView textView4 = r112.A06;
        if (A012 != null) {
            textView4.setText(AnonymousClass3UY.A0F(documentsGalleryFragment.A05, r5.A0I, false));
            str = AnonymousClass3UY.A0F(documentsGalleryFragment.A05, r5.A0I, true);
        } else {
            str = "";
            textView4.setText(str);
        }
        textView4.setContentDescription(str);
        View view = r112.A04;
        View view2 = r112.A02;
        boolean A034 = C65453Sc.A03(r5);
        boolean z = r5.A15;
        C36421kH.A0v(view2, A034 ? 1 : 0, 0, 8);
        C36421kH.A0v(view, z ? 1 : 0, 0, 8);
        boolean BMT = C36381kD.A0Y(documentsGalleryFragment).BMT(r5);
        View view3 = r112.A0H;
        if (BMT) {
            C36341k9.A0q(documentsGalleryFragment.A0a(), view3, R.color.f6nameremoved);
            view3.setSelected(true);
            return;
        }
        view3.setBackgroundResource(R.drawable.selector_orange_gradient);
        view3.setSelected(false);
    }
}
