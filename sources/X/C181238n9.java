package X;

import com.whatsapp.data.ProfilePhotoChange;

/* renamed from: X.8n9  reason: invalid class name and case insensitive filesystem */
public class C181238n9 extends AnonymousClass2bI {
    public ProfilePhotoChange A00;
    public String A01;

    public C181238n9(C64933Qa r2, long j) {
        super(r2, 6, j);
    }

    public String A1Z() {
        String str;
        synchronized (this.A1M) {
            str = this.A01;
        }
        return str;
    }

    public void A1a(String str) {
        synchronized (this.A1M) {
            this.A01 = str;
        }
    }

    public String A0b() {
        return A1Z();
    }

    public void A16(String str) {
        A1a(str);
    }
}
