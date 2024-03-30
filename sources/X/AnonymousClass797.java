package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;

/* renamed from: X.797  reason: invalid class name */
public class AnonymousClass797 extends HashMap<String, String> {
    public final /* synthetic */ AnonymousClass780 this$0;
    public final /* synthetic */ int val$colFullNameColumnIndex;
    public final /* synthetic */ int val$colProfilePhotoColumnIndex;
    public final /* synthetic */ Cursor val$cursor;

    public AnonymousClass797(Cursor cursor, AnonymousClass780 r4, int i, int i2) {
        this.this$0 = r4;
        this.val$cursor = cursor;
        this.val$colFullNameColumnIndex = i;
        this.val$colProfilePhotoColumnIndex = i2;
        put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, cursor.getString(i));
        put("profile_pic_url", cursor.getString(i2));
        put("resolver_type", "content_provider");
    }
}
