package X;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import com.whatsapp.R;
import com.whatsapp.audiopicker.AudioPickerActivity;

/* renamed from: X.1nc  reason: invalid class name and case insensitive filesystem */
public class C38041nc extends CursorAdapter {
    public final C225314u A00;
    public final /* synthetic */ AudioPickerActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38041nc(C225314u r3, AudioPickerActivity audioPickerActivity) {
        super(r3, (Cursor) null, 0);
        this.A01 = audioPickerActivity;
        this.A00 = r3;
    }

    public static C60983Ac A00(Cursor cursor, C38041nc r8) {
        if (cursor == null) {
            return null;
        }
        return new C60983Ac(r8.A01, cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getInt(0), cursor.getInt(4), cursor.getInt(5));
    }

    public void bindView(View view, Context context, Cursor cursor) {
        new C65803Tn(view, this.A01, cursor.getPosition()).A04(this.A00, A00(cursor, this));
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return C36361kB.A0E(this.A01.getLayoutInflater(), viewGroup, R.layout.f9nameremoved);
    }
}
