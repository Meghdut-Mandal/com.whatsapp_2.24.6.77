package X;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.TextView;
import com.whatsapp.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* renamed from: X.5VL  reason: invalid class name */
public class AnonymousClass5VL extends Exception {
    public String a = "CLException";
    public String b;
    public String c;
    public Context d;

    public AnonymousClass5VL(Context context, String str, String str2) {
        this.b = str;
        this.c = str2;
        this.d = context;
        A00(context, str2);
    }

    public AnonymousClass5VL(Context context, String str, String str2, Throwable th) {
        super(th);
        this.b = str;
        this.c = str2;
        this.d = context;
        A00(context, str2);
    }

    public void A00(Context context, String str) {
        InputStream inputStream;
        Properties properties = new Properties();
        try {
            inputStream = context.getAssets().open("cl-messages_en_us.properties");
        } catch (IOException e) {
            Log.e(this.a, e.getLocalizedMessage());
            inputStream = null;
        }
        try {
            properties.load(inputStream);
        } catch (IOException e2) {
            Log.e(this.a, e2.getLocalizedMessage());
        }
        Log.e(this.a, AnonymousClass000.A0p("ErrorMsg: ", properties.getProperty(str), AnonymousClass000.A0u()));
        String string = context.getResources().getString(R.string.f12nameremoved);
        Activity activity = (Activity) context;
        activity.findViewById(R.id.error_layout).setVisibility(0);
        ((TextView) activity.findViewById(R.id.error_message)).setText(string);
    }
}
