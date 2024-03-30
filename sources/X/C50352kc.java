package X;

import android.content.ContentUris;
import android.graphics.Bitmap;
import android.os.Process;
import android.provider.ContactsContract;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: X.2kc  reason: invalid class name and case insensitive filesystem */
public class C50352kc extends C19950wm {
    public final AnonymousClass17Y A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass1RZ A02;
    public final C27761Ps A03;
    public final C21060yb A04;
    public final C19630wG A05;
    public final C18820ts A06;
    public final boolean A07;
    public volatile boolean A08;

    public void run() {
        Bitmap bitmap;
        Bitmap A012;
        long j;
        Process.setThreadPriority(10);
        while (true) {
            if (!this.A08) {
                Stack stack = this.A02.A00;
                if (stack.isEmpty()) {
                    synchronized (stack) {
                        try {
                            if (this.A07) {
                                j = 15000;
                            } else {
                                j = 0;
                            }
                            stack.wait(j);
                        } catch (Throwable th) {
                            while (true) {
                                th = th;
                                break;
                            }
                        }
                    }
                }
                try {
                    if (this.A08) {
                        return;
                    }
                    if (!stack.isEmpty()) {
                        synchronized (stack) {
                            try {
                                if (!stack.isEmpty()) {
                                    C608839s r5 = (C608839s) stack.pop();
                                    if (r5 != null) {
                                        Object obj = r5.A01;
                                        if (obj instanceof C62583Gs) {
                                            C62583Gs r10 = (C62583Gs) obj;
                                            ImageView imageView = r5.A04;
                                            Object obj2 = r5.A05;
                                            C88514Sz r4 = r5.A00;
                                            int i = r5.A03;
                                            float f = r5.A02;
                                            if (imageView.getTag() != null && imageView.getTag().equals(obj2)) {
                                                int height = imageView.getHeight();
                                                if (height <= 0) {
                                                    height = C36341k9.A0F(imageView).getDimensionPixelSize(R.dimen.f7nameremoved);
                                                }
                                                C19630wG r1 = this.A05;
                                                AnonymousClass16D r14 = this.A01;
                                                C21060yb r13 = this.A04;
                                                C65033Ql r15 = new C65033Ql(r14, r13, r1, this.A06);
                                                long j2 = r10.A04;
                                                Iterator A10 = C36391kE.A10(r15.A02(Long.valueOf(j2).toString()));
                                                while (true) {
                                                    if (A10.hasNext()) {
                                                        AnonymousClass141 A082 = r14.A08(C36401kF.A0a(A10));
                                                        if (A082 != null) {
                                                            r10.A01 = A082;
                                                            int i2 = i;
                                                            bitmap = this.A03.A07(imageView.getContext(), A082, f, i2, true);
                                                            break;
                                                        }
                                                    } else {
                                                        C21050ya A0O = r13.A0O();
                                                        InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(A0O.A00, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j2));
                                                        bitmap = null;
                                                        if (!(openContactPhotoInputStream == null || (A012 = C27761Ps.A01(new C53982sD(openContactPhotoInputStream, 3))) == null)) {
                                                            bitmap = AnonymousClass1GW.A07(A012, -1.0f, height);
                                                        }
                                                        r10.A00 = bitmap;
                                                        if (bitmap != null) {
                                                        }
                                                    }
                                                }
                                                Bitmap bitmap2 = bitmap;
                                                ImageView imageView2 = imageView;
                                                this.A00.A0H(new AnonymousClass753(bitmap2, imageView2, r4, this, obj2));
                                            }
                                        }
                                        if (obj instanceof AnonymousClass141) {
                                            ImageView imageView3 = r5.A04;
                                            Object obj3 = r5.A05;
                                            C88514Sz r142 = r5.A00;
                                            int i3 = r5.A03;
                                            float f2 = r5.A02;
                                            this.A00.A0H(new AnonymousClass753(this.A03.A07(imageView3.getContext(), (AnonymousClass141) obj, f2, i3, true), imageView3, r142, this, obj3));
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                while (true) {
                                    th = th2;
                                    break;
                                }
                            }
                        }
                    } else if (this.A07) {
                        synchronized (stack) {
                            try {
                                if (stack.isEmpty()) {
                                    this.A08 = true;
                                    return;
                                }
                            } catch (Throwable th3) {
                                while (true) {
                                    th = th3;
                                }
                                throw th;
                            }
                        }
                    } else {
                        continue;
                    }
                } catch (InterruptedException unused) {
                    Log.e("ContactPhotos/interrupted exception/allow thread to exit");
                    return;
                }
            } else {
                return;
            }
        }
        throw th;
    }

    public C50352kc(AnonymousClass17Y r3, AnonymousClass16D r4, AnonymousClass1RZ r5, C27761Ps r6, C21060yb r7, C19630wG r8, C18820ts r9, String str, boolean z) {
        super(AnonymousClass000.A0p("contact-photos-", str, AnonymousClass000.A0u()));
        this.A05 = r8;
        this.A06 = r9;
        this.A02 = r5;
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = r6;
        this.A04 = r7;
        this.A07 = z;
    }
}
