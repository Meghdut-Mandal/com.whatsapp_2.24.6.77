package X;

import android.database.AbstractCursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;

/* renamed from: X.1l8  reason: invalid class name and case insensitive filesystem */
public class C36681l8 extends AbstractCursor {
    public static final String[] A03 = {"jid", PublicKeyCredentialControllerUtility.JSON_KEY_NAME};
    public final AnonymousClass16D A00;
    public final AnonymousClass171 A01;
    public final AnonymousClass1A6 A02;

    public double getDouble(int i) {
        return 0.0d;
    }

    public float getFloat(int i) {
        return 0.0f;
    }

    public int getInt(int i) {
        return 0;
    }

    public long getLong(int i) {
        return 0;
    }

    public short getShort(int i) {
        return 0;
    }

    public boolean isNull(int i) {
        return false;
    }

    public int getCount() {
        return this.A02.A02();
    }

    public String getString(int i) {
        String A0H;
        if (i == 0) {
            ArrayList A04 = this.A02.A04();
            int position = getPosition();
            if (A04.size() > position) {
                return ((Jid) A04.get(position)).getRawString();
            }
        } else if (i != 1) {
            return "";
        }
        ArrayList A042 = this.A02.A04();
        int position2 = getPosition();
        if (A042.size() <= position2 || (A0H = this.A01.A0H(C36371kC.A0a(this.A00, A042, position2))) == null) {
            return "";
        }
        return A0H;
    }

    public C36681l8(AnonymousClass16D r1, AnonymousClass171 r2, AnonymousClass1A6 r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public String[] getColumnNames() {
        return A03;
    }
}
