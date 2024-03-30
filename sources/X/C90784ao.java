package X;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

/* renamed from: X.4ao  reason: invalid class name and case insensitive filesystem */
public class C90784ao extends AsyncQueryHandler {
    public final /* synthetic */ C95424ku A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90784ao(ContentResolver contentResolver, C95424ku r2) {
        super(contentResolver);
        this.A00 = r2;
    }

    public void onQueryComplete(int i, Object obj, Cursor cursor) {
        String str;
        Integer A0m = C36381kD.A0m();
        if (cursor == null) {
            Log.w("CarApp.Conn", "Null response from content provider when checking connection to the car, treating as disconnected");
        } else {
            int columnIndex = cursor.getColumnIndex("CarConnectionState");
            if (columnIndex < 0) {
                str = "Connection to car response is missing the connection type, treating as disconnected";
            } else if (!cursor.moveToNext()) {
                str = "Connection to car response is empty, treating as disconnected";
            } else {
                C95424ku r2 = this.A00;
                Integer valueOf = Integer.valueOf(cursor.getInt(columnIndex));
                Uri uri = C95424ku.A03;
                r2.A0C(valueOf);
                return;
            }
            Log.e("CarApp.Conn", str);
        }
        C95424ku r1 = this.A00;
        Uri uri2 = C95424ku.A03;
        r1.A0C(A0m);
    }
}
