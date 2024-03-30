package X;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.0cR  reason: invalid class name and case insensitive filesystem */
public class C09480cR implements C17360rA, DialogInterface.OnClickListener {
    public AnonymousClass0FM A00;
    public CharSequence A01;
    public ListAdapter A02;
    public final /* synthetic */ AppCompatSpinner A03;

    public Drawable B8j() {
        return null;
    }

    public int BCT() {
        return 0;
    }

    public int BJ0() {
        return 0;
    }

    public C09480cR(AppCompatSpinner appCompatSpinner) {
        this.A03 = appCompatSpinner;
    }

    public boolean BNH() {
        AnonymousClass0FM r0 = this.A00;
        if (r0 != null) {
            return r0.isShowing();
        }
        return false;
    }

    public void BqH(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    public void Br1(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    public void Br2(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    public void Bsg(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    public void Btd(int i, int i2) {
        if (this.A02 != null) {
            AppCompatSpinner appCompatSpinner = this.A03;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(appCompatSpinner.A05);
            CharSequence charSequence = this.A01;
            if (charSequence != null) {
                alertDialog$Builder.setTitle(charSequence);
            }
            alertDialog$Builder.A0P(this, this.A02, appCompatSpinner.getSelectedItemPosition());
            AnonymousClass0FM create = alertDialog$Builder.create();
            this.A00 = create;
            ListView listView = create.A00.A0K;
            listView.setTextDirection(i);
            listView.setTextAlignment(i2);
            this.A00.show();
        }
    }

    public void dismiss() {
        AnonymousClass0FM r0 = this.A00;
        if (r0 != null) {
            r0.dismiss();
            this.A00 = null;
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        AppCompatSpinner appCompatSpinner = this.A03;
        appCompatSpinner.setSelection(i);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick((View) null, i, this.A02.getItemId(i));
        }
        dismiss();
    }

    public void Bq4(ListAdapter listAdapter) {
        this.A02 = listAdapter;
    }

    public void Brq(CharSequence charSequence) {
        this.A01 = charSequence;
    }

    public CharSequence BCQ() {
        return this.A01;
    }
}
