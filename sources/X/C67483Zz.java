package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import java.util.HashSet;

/* renamed from: X.3Zz  reason: invalid class name and case insensitive filesystem */
public final class C67483Zz implements C021809f {
    public Runnable A00;
    public final Context A01;
    public final TextView A02;
    public final /* synthetic */ MediaPickerFragment A03;

    public boolean BQg(MenuItem menuItem, AnonymousClass0V9 r4) {
        AnonymousClass00C.A0D(menuItem, 1);
        if (menuItem.getItemId() != 0) {
            return false;
        }
        MediaPickerFragment mediaPickerFragment = this.A03;
        mediaPickerFragment.A1o(mediaPickerFragment.A0M);
        return false;
    }

    public C67483Zz(Context context, MediaPickerFragment mediaPickerFragment) {
        this.A03 = mediaPickerFragment;
        this.A01 = context;
        TextView textView = (TextView) C36381kD.A0K(LayoutInflater.from(context), R.layout.f9nameremoved);
        this.A02 = textView;
        C36421kH.A11(textView, this, 13);
    }

    public final boolean BUq(Menu menu, AnonymousClass0V9 r8) {
        TextView textView = this.A02;
        r8.A09(textView);
        MediaPickerFragment mediaPickerFragment = this.A03;
        int A002 = C224514j.A00(mediaPickerFragment.A1D(), R.attr.f4nameremoved, R.color.f6nameremoved);
        Context context = this.A01;
        C36331k8.A0r(context, textView, A002);
        C36431kI.A0N(mediaPickerFragment).setStatusBarColor(AnonymousClass00F.A00(context, C224514j.A00(mediaPickerFragment.A1D(), R.attr.f4nameremoved, R.color.f6nameremoved)));
        return true;
    }

    public final void BVS(AnonymousClass0V9 r4) {
        Runnable runnable = this.A00;
        if (runnable != null) {
            this.A02.removeCallbacks(runnable);
        }
        MediaPickerFragment mediaPickerFragment = this.A03;
        if (mediaPickerFragment.A0F) {
            mediaPickerFragment.A0i().finish();
        }
        mediaPickerFragment.A04 = null;
        mediaPickerFragment.A1l();
        C36431kI.A0N(mediaPickerFragment).setStatusBarColor(AnonymousClass00F.A00(this.A01, R.color.f6nameremoved));
    }

    public boolean BdJ(Menu menu, AnonymousClass0V9 r7) {
        String quantityString;
        MediaPickerFragment mediaPickerFragment = this.A03;
        HashSet hashSet = mediaPickerFragment.A0M;
        if (hashSet.size() == 0) {
            quantityString = mediaPickerFragment.A0n(R.string.f12nameremoved);
        } else {
            int size = hashSet.size();
            Resources A0G = C36341k9.A0G(mediaPickerFragment);
            Object[] objArr = new Object[1];
            C36331k8.A1W(objArr, size);
            quantityString = A0G.getQuantityString(R.plurals.f10nameremoved, size, objArr);
        }
        TextView textView = this.A02;
        textView.setText(quantityString);
        if (this.A00 == null && !textView.isSelected()) {
            C81183wb A002 = C81183wb.A00(this, 49);
            this.A00 = A002;
            textView.postDelayed(A002, 1000);
        }
        return true;
    }
}
