package X;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.0t2  reason: invalid class name and case insensitive filesystem */
public class C18360t2 implements AdapterView.OnItemClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C18360t2(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.A02;
        Object obj = this.A00;
        if (i2 != 0) {
            AnonymousClass0G0 r3 = (AnonymousClass0G0) obj;
            AppCompatSpinner appCompatSpinner = r3.A04;
            appCompatSpinner.setSelection(i);
            if (appCompatSpinner.getOnItemClickListener() != null) {
                appCompatSpinner.performItemClick(view, i, r3.A01.getItemId(i));
            }
            r3.dismiss();
            return;
        }
        AnonymousClass0TX r32 = (AnonymousClass0TX) obj;
        DialogInterface.OnClickListener onClickListener = r32.A06;
        AnonymousClass0DT r1 = ((AnonymousClass0YZ) this.A01).A0X;
        onClickListener.onClick(r1, i);
        if (!r32.A0M) {
            r1.dismiss();
        }
    }
}
